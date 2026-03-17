package me.scpark.springdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    // 조회 전체
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // 저장
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    // 단건 조회
    public Member getById(Long id) {
        return memberRepository.findById(id).orElseThrow();
    }

    // 수정
    public Member update(Long id, Member member) {
        Member findMember = memberRepository.findById(id).orElseThrow();
        findMember.setName(member.getName());
        return memberRepository.save(findMember);
    }

    // 삭제
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}