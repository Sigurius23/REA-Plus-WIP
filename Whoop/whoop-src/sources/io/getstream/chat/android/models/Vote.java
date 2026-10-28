package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "pollId", "optionId", "createdAt", "Ljava/util/Date;", "updatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V", "getId", "()Ljava/lang/String;", "getPollId", "getOptionId", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Vote implements ComparableFieldProvider {
    private final Date createdAt;
    private final String id;
    private final String optionId;
    private final String pollId;
    private final Date updatedAt;
    private final User user;

    public Vote(String id4, String pollId, String optionId, Date createdAt, Date updatedAt, User user) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.id = id4;
        this.pollId = pollId;
        this.optionId = optionId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public static /* synthetic */ Vote copy$default(Vote vote, String str, String str2, String str3, Date date, Date date2, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vote.id;
        }
        if ((i13 & 2) != 0) {
            str2 = vote.pollId;
        }
        if ((i13 & 4) != 0) {
            str3 = vote.optionId;
        }
        if ((i13 & 8) != 0) {
            date = vote.createdAt;
        }
        if ((i13 & 16) != 0) {
            date2 = vote.updatedAt;
        }
        if ((i13 & 32) != 0) {
            user = vote.user;
        }
        Date date3 = date2;
        User user2 = user;
        return vote.copy(str, str2, str3, date, date3, user2);
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
    public final String getOptionId() {
        return this.optionId;
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

    public final Vote copy(String id4, String pollId, String optionId, Date createdAt, Date updatedAt, User user) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new Vote(id4, pollId, optionId, createdAt, updatedAt, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) other;
        return AbstractC22676k.m65745e(this.id, vote.id) && AbstractC22676k.m65745e(this.pollId, vote.pollId) && AbstractC22676k.m65745e(this.optionId, vote.optionId) && AbstractC22676k.m65745e(this.createdAt, vote.createdAt) && AbstractC22676k.m65745e(this.updatedAt, vote.updatedAt) && AbstractC22676k.m65745e(this.user, vote.user);
    }

    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        if (fieldName.equals("created_at") || fieldName.equals("createdAt")) {
            return this.createdAt;
        }
        return null;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.pollId), 31, this.optionId), 31), 31);
        User user = this.user;
        return iM124373c + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pollId;
        String str3 = this.optionId;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        User user = this.user;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Vote(id=", str, ", pollId=", str2, ", optionId=");
        AbstractC13673n.m38579z(sbM32001t, str3, ", createdAt=", date, ", updatedAt=");
        sbM32001t.append(date2);
        sbM32001t.append(", user=");
        sbM32001t.append(user);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
