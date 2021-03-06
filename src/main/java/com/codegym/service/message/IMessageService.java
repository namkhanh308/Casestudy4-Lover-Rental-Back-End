package com.codegym.service.message;

import com.codegym.model.DTO.IMessageDTO;
import com.codegym.model.account.Account;
import com.codegym.model.message.Message;
import com.codegym.service.IGeneralService;
import com.codegym.service.gender.IGenderService;
import org.springframework.stereotype.Service;

@Service
public interface IMessageService extends IGeneralService<Message> {
    Iterable<Message> findAllBySender(Account sender);
    Iterable<Message> findAllByReceiver(Account receiver);
    Iterable<Message> findAllBySenderAndReceiver(Account sender, Account receiver);
    Iterable<Message> findAllBySenderOrReceiver(Account sender, Account receiver);
    Iterable<Message> customFindAllBySenderOrReceiverOrderByReceiver(Long id1, Long id2, Long id3, Long id4);
    Iterable<IMessageDTO> showMessageDTO(Long id1, Long id2, Long id3, Long id4);

}
