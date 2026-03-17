package me.scpark.springdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")   // ⭐ 공통 경로
public class TestController {

    @Autowired
    TestService testService;

    // 전체 조회
    @GetMapping
    public List<Member> getAllMembers() {
        return testService.getAllMembers();
    }

    // 단건 조회
    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id) {
        return testService.getById(id);
    }

    // 저장
    @PostMapping
    public Member saveMember(@RequestBody Member member) {
        return testService.save(member);
    }

    // 수정
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody Member member) {
        return testService.update(id, member);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id) {
        testService.delete(id);
    }
}