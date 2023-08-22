class Process:
    def __init__(self, id, burst_time, priority):
        self.id = id
        self.burst_time = burst_time
        self.priority = priority

def main():
    n = int(input("Enter the number of processes: "))
    processes = []

    for i in range(n):
        burst_time = int(input(f"Enter burst time for process {i}: "))
        priority = int(input(f"Enter priority for process {i}: "))
        processes.append(Process(i, burst_time, priority))

    # Sort processes by priority
    processes.sort(key=lambda p: p.priority)

    # Time quantum values for each queue
    time_quantum = [4, 2, 1]

    current_time = 0
    total_waiting_time = 0
    total_response_time = 0
    total_turnaround_time = 0

    for q in range(len(time_quantum)):
        quantum = time_quantum[q]

        queue = processes.copy()
        temp_queue = []

        while queue:
            current_process = queue.pop(0)

            # Response time is the time at which the process starts executing
            response_time = max(current_time, current_process.priority)

            # Execute process for the current time quantum or until completion
            remaining_time = current_process.burst_time
            if remaining_time > quantum:
                remaining_time -= quantum
                current_time += quantum
                current_process.burst_time = remaining_time
                temp_queue.append(current_process)  # Add back to temporary queue
            else:
                current_time += remaining_time
                total_waiting_time += current_time - current_process.burst_time
                total_response_time += response_time
                total_turnaround_time += current_time

        # Move processes from temp_queue back to main queue
        queue.extend(temp_queue)

    # Calculate averages
    avg_waiting_time = total_waiting_time / n
    avg_response_time = total_response_time / n
    avg_turnaround_time = total_turnaround_time / n

    print("Average Waiting Time:", avg_waiting_time)
    print("Average Response Time:", avg_response_time)
    print("Average Turnaround Time:", avg_turnaround_time)

if __name__ == "__main__":
    main()
