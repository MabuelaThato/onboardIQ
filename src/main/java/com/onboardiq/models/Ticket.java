package com.onboardiq.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity {

    private String ticketNumber;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String emailBody;

    private String senderEmail;
    private String receiverEmail;

    @ManyToOne
    private User acquisitionBanker;

    @ManyToOne
    private User transactionalBanker;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    private String processingPlatformId;

    public Ticket() {}

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getEmailBody() { return emailBody; }
    public void setEmailBody(String emailBody) { this.emailBody = emailBody; }

    public String getSenderEmail() { return senderEmail; }
    public void setSenderEmail(String senderEmail) { this.senderEmail = senderEmail; }

    public String getReceiverEmail() { return receiverEmail; }
    public void setReceiverEmail(String receiverEmail) { this.receiverEmail = receiverEmail; }

    public User getAcquisitionBanker() { return acquisitionBanker; }
    public void setAcquisitionBanker(User acquisitionBanker) { this.acquisitionBanker = acquisitionBanker; }

    public User getTransactionalBanker() { return transactionalBanker; }
    public void setTransactionalBanker(User transactionalBanker) { this.transactionalBanker = transactionalBanker; }

    public TicketStatus getStatus() { return status; }
    public void setStatus(TicketStatus status) { this.status = status; }

    public String getProcessingPlatformId() { return processingPlatformId; }
    public void setProcessingPlatformId(String processingPlatformId) { this.processingPlatformId = processingPlatformId; }
}