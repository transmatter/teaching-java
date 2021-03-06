package com.cstldr.oop.black;
import com.cstldr.oop.white.WhiteParent;

public class BlackChild extends WhiteParent {
    public static void main(String[] args) {

        // inaccessible:
        System.out.println("privateMember"+privateMember);
        System.out.println("defaultMember"+defaultMember);
        
        // accessible
        System.out.println("protectedMember"+protectedMember);
        System.out.println("publicMember"+publicMember);
    }
}