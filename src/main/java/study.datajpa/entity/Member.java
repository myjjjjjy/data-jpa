package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;

    protected Member() {
        // jpa 표준 스펙에 기본 생성자가 꼭 있어야 하는데 protected로 만들어야함 => private으로 만들면 프록싱 할 때 막힐 수 있음.
    }

    public Member(String username){
        this.username = username;
    }
}
