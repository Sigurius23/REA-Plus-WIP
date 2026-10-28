package com.whoop.community.data.network;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b-\u0010\u001c¨\u00061"}, m65681d2 = {"Lcom/whoop/community/data/network/ReportMessage;", "", "", ProfileApiKt.COMMUNITY_ID_PARAM, "reportedUserId", "", "messageId", "message", "reason", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/ReportMessage;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/community/data/network/ReportMessage;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCommunityId", "getReportedUserId", "Ljava/lang/String;", "getMessageId", "getMessage", "getReason", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReportMessage {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("community_id")
    private final int communityId;

    @SerializedName("message")
    private final String message;

    @SerializedName("message_id")
    private final String messageId;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("reported_user_id")
    private final int reportedUserId;

    /* JADX INFO: renamed from: com.whoop.community.data.network.ReportMessage$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/ReportMessage$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/ReportMessage;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReportMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReportMessage(int i13, int i14, int i15, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ReportMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.communityId = i14;
        this.reportedUserId = i15;
        this.messageId = str;
        this.message = str2;
        this.reason = str3;
    }

    public static /* synthetic */ ReportMessage copy$default(ReportMessage reportMessage, int i13, int i14, String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = reportMessage.communityId;
        }
        if ((i15 & 2) != 0) {
            i14 = reportMessage.reportedUserId;
        }
        if ((i15 & 4) != 0) {
            str = reportMessage.messageId;
        }
        if ((i15 & 8) != 0) {
            str2 = reportMessage.message;
        }
        if ((i15 & 16) != 0) {
            str3 = reportMessage.reason;
        }
        String str4 = str3;
        String str5 = str;
        return reportMessage.copy(i13, i14, str5, str2, str4);
    }

    public static final /* synthetic */ void write$Self$community_release(ReportMessage self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.communityId);
        output.encodeIntElement(serialDesc, 1, self.reportedUserId);
        output.encodeStringElement(serialDesc, 2, self.messageId);
        output.encodeStringElement(serialDesc, 3, self.message);
        output.encodeStringElement(serialDesc, 4, self.reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReportedUserId() {
        return this.reportedUserId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ReportMessage copy(int communityId, int reportedUserId, String messageId, String message, String reason) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reason, "reason");
        return new ReportMessage(communityId, reportedUserId, messageId, message, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportMessage)) {
            return false;
        }
        ReportMessage reportMessage = (ReportMessage) other;
        return this.communityId == reportMessage.communityId && this.reportedUserId == reportMessage.reportedUserId && AbstractC22676k.m65745e(this.messageId, reportMessage.messageId) && AbstractC22676k.m65745e(this.message, reportMessage.message) && AbstractC22676k.m65745e(this.reason, reportMessage.reason);
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getReportedUserId() {
        return this.reportedUserId;
    }

    public int hashCode() {
        return this.reason.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.reportedUserId, Integer.hashCode(this.communityId) * 31, 31), 31, this.messageId), 31, this.message);
    }

    public String toString() {
        int i13 = this.communityId;
        int i14 = this.reportedUserId;
        String str = this.messageId;
        String str2 = this.message;
        String str3 = this.reason;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ReportMessage(communityId=", ", reportedUserId=", ", messageId=");
        AbstractC11266d.m30444B(sbM30465s, str, ", message=", str2, ", reason=");
        return AbstractC25012a.m73376i(str3, ")", sbM30465s);
    }

    public ReportMessage(int i13, int i14, String messageId, String message, String reason) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reason, "reason");
        this.communityId = i13;
        this.reportedUserId = i14;
        this.messageId = messageId;
        this.message = message;
        this.reason = reason;
    }
}
