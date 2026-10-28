package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Poll;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/events/AnswerCastedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasPoll;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", "messageId", "poll", "Lio/getstream/chat/android/models/Poll;", "newAnswer", "Lio/getstream/chat/android/models/Answer;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Answer;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getMessageId", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "getNewAnswer", "()Lio/getstream/chat/android/models/Answer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AnswerCastedEvent extends CidEvent implements HasPoll {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String messageId;
    private final Answer newAnswer;
    private final Poll poll;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerCastedEvent(String type, Date createdAt, String str, String cid, String channelType, String channelId, String str2, Poll poll, Answer newAnswer) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(newAnswer, "newAnswer");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.messageId = str2;
        this.poll = poll;
        this.newAnswer = newAnswer;
    }

    public static /* synthetic */ AnswerCastedEvent copy$default(AnswerCastedEvent answerCastedEvent, String str, Date date, String str2, String str3, String str4, String str5, String str6, Poll poll, Answer answer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = answerCastedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = answerCastedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = answerCastedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = answerCastedEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = answerCastedEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = answerCastedEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            str6 = answerCastedEvent.messageId;
        }
        if ((i13 & 128) != 0) {
            poll = answerCastedEvent.poll;
        }
        if ((i13 & 256) != 0) {
            answer = answerCastedEvent.newAnswer;
        }
        Poll poll2 = poll;
        Answer answer2 = answer;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return answerCastedEvent.copy(str, date, str10, str3, str9, str7, str8, poll2, answer2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Poll getPoll() {
        return this.poll;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Answer getNewAnswer() {
        return this.newAnswer;
    }

    public final AnswerCastedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, String messageId, Poll poll, Answer newAnswer) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(newAnswer, "newAnswer");
        return new AnswerCastedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, messageId, poll, newAnswer);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerCastedEvent)) {
            return false;
        }
        AnswerCastedEvent answerCastedEvent = (AnswerCastedEvent) other;
        return AbstractC22676k.m65745e(this.type, answerCastedEvent.type) && AbstractC22676k.m65745e(this.createdAt, answerCastedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, answerCastedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, answerCastedEvent.cid) && AbstractC22676k.m65745e(this.channelType, answerCastedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, answerCastedEvent.channelId) && AbstractC22676k.m65745e(this.messageId, answerCastedEvent.messageId) && AbstractC22676k.m65745e(this.poll, answerCastedEvent.poll) && AbstractC22676k.m65745e(this.newAnswer, answerCastedEvent.newAnswer);
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.client.events.HasPoll
    public final String getMessageId() {
        return this.messageId;
    }

    public final Answer getNewAnswer() {
        return this.newAnswer;
    }

    @Override // io.getstream.chat.android.client.events.HasPoll
    public final Poll getPoll() {
        return this.poll;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31, this.cid), 31, this.channelType), 31, this.channelId);
        String str2 = this.messageId;
        return this.newAnswer.hashCode() + ((this.poll.hashCode() + ((iM30450d + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        String str6 = this.messageId;
        Poll poll = this.poll;
        Answer answer = this.newAnswer;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("AnswerCastedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", messageId=");
        sbM11830n.append(str6);
        sbM11830n.append(", poll=");
        sbM11830n.append(poll);
        sbM11830n.append(", newAnswer=");
        sbM11830n.append(answer);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
