# AssemblerSimulationInAndroid
This App simulates working of a simple Assembler. 
total 3 instructions with 8 opcodes.
simulation takes place by first drawing symbol table for each instruction and using its index for further reference.
using symbol table assembler code is generated by replacing operator by its opcode and corresponding values by its index
here we have 2 register in total namely A and B.

<h1>OPCODES Supported</h1>
OPCODE----->address<br>
MVI -----> 1000<br>
MOV -----> 1005<br>
DIV -----> 1010<br>
DIVI -----> 1020<br>
ADD -----> 1040<br>
ADI -----> 1030<br>
SBI -----> 1050<br>
SUB -----> 1065<br>


<h1>Examples</h1>
MVI A 3       #moves 3 to A<br>
MVI B 3       #moves 3 to B<br>
DIVI A 3      #Divides 3 to A<br>
DIVI B 3      #Divides 3 to A<br>
MOV A B       #moves B to A<br>
MOV B A       #moves A to B<br>
DIV A B       #divide A by B<br>
DIV B A       #divide B by A<br>
ADD A B       #ADD B to A<br>
ADI A 3       # ADD 3 to A<br>
SUB A B       #Subtract B to A<br>
SBI A 3       #Subtract 3 to A<br>
ADD B A       #ADD A to B<br>
ADI B 3       # ADD 3 to B<br>
SUB B A       #Subtract A to B<br>
SBI B 3       #Subtract 3 to B<br>

result is stored in first register

final result is showed in accumulator at bottom
