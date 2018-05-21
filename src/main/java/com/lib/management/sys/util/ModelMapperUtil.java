package com.lib.management.sys.util;

import java.sql.ResultSet;
import java.util.UUID;

import com.lib.management.sys.dto.BookDTO;
import com.lib.management.sys.dto.IssueBookDTO;
import com.lib.management.sys.dto.UserDTO;
import com.lib.management.sys.model.Book;
import com.lib.management.sys.model.IssueBook;
import com.lib.management.sys.model.User;

public class ModelMapperUtil {

	private static String generateRandomId() {
		return UUID.randomUUID().toString();
	}

	public static Book mapBook(BookDTO bookDTO) {
		return null;
	}

	public static BookDTO mapBookDTO(Book book) {
		return null;
	}

	public static BookDTO readBookFromResultset(ResultSet resultSet) {
		return null;
	}

	public static User mapUser(UserDTO userDTO) {
		return null;
	}

	public static UserDTO mapUserDTO(User user) {
		return null;
	}

	public static UserDTO readUserFromResultset(ResultSet resultSet) {
		return null;
	}

	public static IssueBookDTO readIssueBookFromResultset(ResultSet resultSet) {
		return null;
	}

	public static IssueBook mapIssueBook(IssueBookDTO issueBookDTO) {
		return null;
	}

	public static IssueBookDTO mapIssueBookDTO(IssueBook issueBook) {
		return null;
	}

	public static Object[] convertUserDTO(UserDTO userDTO) {
		// id,login,first_name,last_name,email_id
		return new Object[] { ModelMapperUtil.generateRandomId(), userDTO.getLogin(), userDTO.getFirstName(),
				userDTO.getLastName(), userDTO.getEmailId() };
	}

	public static Object[] convertBookDTO(BookDTO userDTO) {
		return null;
	}

	public static Object[] convertIssueBookDTO(IssueBookDTO userDTO) {
		return null;
	}
}
