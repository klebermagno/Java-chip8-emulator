package chip8;

/**
 * Created by ismaro3 on 16/02/16.
 */
public class RegisterBank {

    //16 General Purpose registers (8 bits each). From V0 to VF.
    public  byte[] V;

    //I register, a 16-bit register used for storing memory addresses.
    public  short I;

    //PC, program counter. 16 bit (2 byte)
    public  short PC;

    //SP, stack pointer. 8 bit (1 byte)
    public  byte SP;

    //DT, delay timer. 8 bit (1 byte)
    public  byte DT;


    //ST, sound timer. 8 bit (1 byte)
    public  byte ST ;


    public RegisterBank(){
        V = new byte[16];
        I = 0x0000;
        PC = 0x0200;
        SP = 0x00;
        DT = 0x00;
        ST = 0x00;
    }



    public  void printRegisters(){

        //Print General Purpose registers
        for(int i = 0; i < 16; i++){
            System.out.println(String.format("V%01X:    %01X",i,V[i]));
        }

        System.out.println(String.format("I:       %01X",I));


    }

    public static void main(String[] args){

    }
}
