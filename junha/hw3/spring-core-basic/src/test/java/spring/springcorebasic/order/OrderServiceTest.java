package spring.springcorebasic.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spring.springcorebasic.member.Grade;
import spring.springcorebasic.member.Member;
import spring.springcorebasic.member.MemberService;
import spring.springcorebasic.member.MemberServiceImpl;
public class OrderServiceTest {
    // private final MemberService memberService;
    // private final OrderService orderService;


    // @Test
    // void createOrder() {
    //
    //     Long memberId = 1L;
    //     Member member = new Member(memberId, "memberA", Grade.VIP);
    //     memberService.join(member);
    //
    //     Order order = orderService.createOrder(memberId, "itemA", 10000);
    //     Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000); // 할인된 금액이 1000원인지 검증
    // }
}
