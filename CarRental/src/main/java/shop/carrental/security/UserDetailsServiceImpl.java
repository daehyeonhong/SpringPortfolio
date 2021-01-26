package shop.carrental.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.domain.MemberVO;
import shop.carrental.mappers.MemberMapper;
import shop.carrental.security.domain.UserImpl;

@Log4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.warn("Load User By UserName ==> " + username);

		/* userName means user_id */
		MemberVO vo = memberMapper.read(username);

		log.warn("Queried by Member Mapper ==> " + vo);

		return vo == null ? null : new UserImpl(vo);
	}

}