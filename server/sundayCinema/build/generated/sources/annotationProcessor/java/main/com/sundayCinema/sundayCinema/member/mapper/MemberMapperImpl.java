package com.sundayCinema.sundayCinema.member.mapper;

import com.sundayCinema.sundayCinema.member.dto.MemberPostDto;
import com.sundayCinema.sundayCinema.member.dto.MemberResponseDto;
import com.sundayCinema.sundayCinema.member.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-03T23:21:38+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 11.0.20 (Azul Systems, Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
        if ( memberPostDto == null ) {
            return null;
        }

        Member member = new Member();

        member.setEmail( memberPostDto.getEmail() );
        member.setNickname( memberPostDto.getNickname() );
        member.setPassword( memberPostDto.getPassword() );

        return member;
    }

    @Override
    public MemberResponseDto memberToMemberResponseDto(Member member) {
        if ( member == null ) {
            return null;
        }

        long memberId = 0L;
        String email = null;
        String nickname = null;
        String password = null;

        memberId = member.getMemberId();
        email = member.getEmail();
        nickname = member.getNickname();
        password = member.getPassword();

        MemberResponseDto memberResponseDto = new MemberResponseDto( memberId, email, nickname, password );

        return memberResponseDto;
    }
}