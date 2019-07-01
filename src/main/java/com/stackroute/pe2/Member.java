package com.stackroute.pe2;

public class Member {
    String name;
    int age;
    double salary;

    public class MemberVariable{
        Member member=new Member();

        public Member isMember(String name,int age,double salary){

            member.name=name;
            member.age=age;
            member.salary=salary;
            return member;
        }
    }
}
