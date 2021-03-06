package com.codegym.service.message;

import com.codegym.model.DTO.IMessageDTO;
import com.codegym.model.account.Account;
import com.codegym.model.message.Message;
import com.codegym.repository.message.IMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MessageService implements IMessageService{
    @Autowired
    private IMessageRepository messageRepository;
    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void remove(Long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public Page<Message> findAll(Pageable pageable) {
        return messageRepository.findAll(pageable);
    }

    @Override
    public Iterable<Message> findAllBySender(Account sender) {
        return messageRepository.findAllBySender(sender);
    }

    @Override
    public Iterable<Message> findAllByReceiver(Account receiver) {
        return messageRepository.findAllByReceiver(receiver);
    }

    @Override
    public Iterable<Message> findAllBySenderAndReceiver(Account sender, Account receiver) {
        return messageRepository.findAllBySenderAndReceiver(sender, receiver);
    }

    @Override
    public Iterable<Message> findAllBySenderOrReceiver(Account sender, Account receiver) {
        return messageRepository.findAllBySenderOrReceiver(sender, receiver);
    }


    @Override
    public Iterable<IMessageDTO> showMessageDTO(Long id1, Long id2, Long id3, Long id4) {
        return messageRepository.showMessageDTO(id1, id2, id3, id4);
    }


    @Override
    public Iterable<Message> customFindAllBySenderOrReceiverOrderByReceiver(Long id1, Long id2, Long id3, Long id4) {
        return messageRepository.customFindAllBySenderOrReceiverOrderByReceiver(id1, id2, id3, id4);
    }
}
