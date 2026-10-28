package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import java.util.Date;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/models/Answer;", "", "id", "", "pollId", "text", "createdAt", "Ljava/util/Date;", "updatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V", "getId", "()Ljava/lang/String;", "getPollId", "getText", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Answer {
    private final Date createdAt;
    private final String id;
    private final String pollId;
    private final String text;
    private final Date updatedAt;
    private final User user;

    public Answer(String id4, String pollId, String text, Date createdAt, Date updatedAt, User user) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.id = id4;
        this.pollId = pollId;
        this.text = text;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public static /* synthetic */ Answer copy$default(Answer answer, String str, String str2, String str3, Date date, Date date2, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = answer.id;
        }
        if ((i13 & 2) != 0) {
            str2 = answer.pollId;
        }
        if ((i13 & 4) != 0) {
            str3 = answer.text;
        }
        if ((i13 & 8) != 0) {
            date = answer.createdAt;
        }
        if ((i13 & 16) != 0) {
            date2 = answer.updatedAt;
        }
        if ((i13 & 32) != 0) {
            user = answer.user;
        }
        Date date3 = date2;
        User user2 = user;
        return answer.copy(str, str2, str3, date, date3, user2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Answer copy(String id4, String pollId, String text, Date createdAt, Date updatedAt, User user) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new Answer(id4, pollId, text, createdAt, updatedAt, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) other;
        return AbstractC22676k.m65745e(this.id, answer.id) && AbstractC22676k.m65745e(this.pollId, answer.pollId) && AbstractC22676k.m65745e(this.text, answer.text) && AbstractC22676k.m65745e(this.createdAt, answer.createdAt) && AbstractC22676k.m65745e(this.updatedAt, answer.updatedAt) && AbstractC22676k.m65745e(this.user, answer.user);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final String getText() {
        return this.text;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.pollId), 31, this.text), 31), 31);
        User user = this.user;
        return iM124373c + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pollId;
        String str3 = this.text;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        User user = this.user;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Answer(id=", str, ", pollId=", str2, ", text=");
        AbstractC13673n.m38579z(sbM32001t, str3, ", createdAt=", date, ", updatedAt=");
        sbM32001t.append(date2);
        sbM32001t.append(", user=");
        sbM32001t.append(user);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
