package c.impl;

import c.reference.MemberDTO;

public interface MemberManagerInterface {
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);
}