package io.getstream.chat.android.client.query;

import d13.AbstractC11478a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import java.util.Date;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013JN\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/query/AddMembersParams;", "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/chat/android/models/MemberData;", "systemMessage", "Lio/getstream/chat/android/models/Message;", "hideHistory", "", "hideHistoryBefore", "Ljava/util/Date;", "skipPush", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)V", "getMembers", "()Ljava/util/List;", "getSystemMessage", "()Lio/getstream/chat/android/models/Message;", "getHideHistory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHideHistoryBefore", "()Ljava/util/Date;", "getSkipPush", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/query/AddMembersParams;", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AddMembersParams {
    private final Boolean hideHistory;
    private final Date hideHistoryBefore;
    private final List<MemberData> members;
    private final Boolean skipPush;
    private final Message systemMessage;

    public AddMembersParams(List<MemberData> members, Message message, Boolean bool, Date date, Boolean bool2) {
        AbstractC22676k.m65750j(members, "members");
        this.members = members;
        this.systemMessage = message;
        this.hideHistory = bool;
        this.hideHistoryBefore = date;
        this.skipPush = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMembersParams copy$default(AddMembersParams addMembersParams, List list, Message message, Boolean bool, Date date, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = addMembersParams.members;
        }
        if ((i13 & 2) != 0) {
            message = addMembersParams.systemMessage;
        }
        if ((i13 & 4) != 0) {
            bool = addMembersParams.hideHistory;
        }
        if ((i13 & 8) != 0) {
            date = addMembersParams.hideHistoryBefore;
        }
        if ((i13 & 16) != 0) {
            bool2 = addMembersParams.skipPush;
        }
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        return addMembersParams.copy(list, message, bool4, date, bool3);
    }

    public final List<MemberData> component1() {
        return this.members;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Message getSystemMessage() {
        return this.systemMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHideHistory() {
        return this.hideHistory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getHideHistoryBefore() {
        return this.hideHistoryBefore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSkipPush() {
        return this.skipPush;
    }

    public final AddMembersParams copy(List<MemberData> members, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(members, "members");
        return new AddMembersParams(members, systemMessage, hideHistory, hideHistoryBefore, skipPush);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddMembersParams)) {
            return false;
        }
        AddMembersParams addMembersParams = (AddMembersParams) other;
        return AbstractC22676k.m65745e(this.members, addMembersParams.members) && AbstractC22676k.m65745e(this.systemMessage, addMembersParams.systemMessage) && AbstractC22676k.m65745e(this.hideHistory, addMembersParams.hideHistory) && AbstractC22676k.m65745e(this.hideHistoryBefore, addMembersParams.hideHistoryBefore) && AbstractC22676k.m65745e(this.skipPush, addMembersParams.skipPush);
    }

    public final Boolean getHideHistory() {
        return this.hideHistory;
    }

    public final Date getHideHistoryBefore() {
        return this.hideHistoryBefore;
    }

    public final List<MemberData> getMembers() {
        return this.members;
    }

    public final Boolean getSkipPush() {
        return this.skipPush;
    }

    public final Message getSystemMessage() {
        return this.systemMessage;
    }

    public final int hashCode() {
        int iHashCode = this.members.hashCode() * 31;
        Message message = this.systemMessage;
        int iHashCode2 = (iHashCode + (message == null ? 0 : message.hashCode())) * 31;
        Boolean bool = this.hideHistory;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.hideHistoryBefore;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool2 = this.skipPush;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        List<MemberData> list = this.members;
        Message message = this.systemMessage;
        Boolean bool = this.hideHistory;
        Date date = this.hideHistoryBefore;
        Boolean bool2 = this.skipPush;
        StringBuilder sb4 = new StringBuilder("AddMembersParams(members=");
        sb4.append(list);
        sb4.append(", systemMessage=");
        sb4.append(message);
        sb4.append(", hideHistory=");
        sb4.append(bool);
        sb4.append(", hideHistoryBefore=");
        sb4.append(date);
        sb4.append(", skipPush=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public /* synthetic */ AddMembersParams(List list, Message message, Boolean bool, Date date, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : message, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : date, (i13 & 16) != 0 ? null : bool2);
    }
}
