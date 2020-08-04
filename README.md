# 1. Data structure :question: (Internal)

Array of String

# 2.Operations/Behavior/Methods ? user -> CB :question:
writeData(string):void
readData(): string
isFull(): boolean
isEmpty(): boolean
setSize(int): void*

# 3. Internal process :question:

buffer size = 10 (default)
read pointer = 0
write pointer = 0

## List of test cases
TC01 => sayHi_with_pui_should_return_Hello_Pui 

TC02=> write_A_B_C_D_to_buffer_should_read_A_B_C_D_from_buffer 

TC03 => start_new_circle_buffer_should_have_size_0


## :star2:Refactor case

There are too many if with the similar **if statement**. So, creating new method to contains switch case will help reduce an unneccessary line.


