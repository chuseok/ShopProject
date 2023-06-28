//package com.example.shopproject;
//
//import com.example.shopproject.domain.Member;
//import com.example.shopproject.repository.MemberRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MemberRepositoryTest {
//    @Autowired
//    MemberRepository memberRepository;
//    @Test
//    public void MemberRepositoryTest() throws Exception {
//        //given
//        Member member = new Member();
//        member.setName("memberA");
//
//        //when
//        Long savedId = memberRepository.save(member);
//        Member findMember = memberRepository.findOne(savedId);
//
//        //then
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//    }
//}