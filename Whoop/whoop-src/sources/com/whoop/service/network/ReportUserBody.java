package com.whoop.service.network;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, m65681d2 = {"Lcom/whoop/service/network/ReportUserBody;", "", "", "reportedUserId", "", "avatarUrl", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/ReportUserBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/whoop/service/network/ReportUserBody;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getReportedUserId", "Ljava/lang/String;", "getAvatarUrl", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReportUserBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("reported_user_id")
    private final int reportedUserId;

    /* JADX INFO: renamed from: com.whoop.service.network.ReportUserBody$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/ReportUserBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/ReportUserBody;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReportUserBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReportUserBody(int i13, int i14, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ReportUserBody$$serializer.INSTANCE.getDescriptor());
        }
        this.reportedUserId = i14;
        this.avatarUrl = str;
    }

    public static /* synthetic */ ReportUserBody copy$default(ReportUserBody reportUserBody, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = reportUserBody.reportedUserId;
        }
        if ((i14 & 2) != 0) {
            str = reportUserBody.avatarUrl;
        }
        return reportUserBody.copy(i13, str);
    }

    public static final /* synthetic */ void write$Self$core_release(ReportUserBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.reportedUserId);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.avatarUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReportedUserId() {
        return this.reportedUserId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final ReportUserBody copy(int reportedUserId, String avatarUrl) {
        return new ReportUserBody(reportedUserId, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportUserBody)) {
            return false;
        }
        ReportUserBody reportUserBody = (ReportUserBody) other;
        return this.reportedUserId == reportUserBody.reportedUserId && AbstractC22676k.m65745e(this.avatarUrl, reportUserBody.avatarUrl);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getReportedUserId() {
        return this.reportedUserId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.reportedUserId) * 31;
        String str = this.avatarUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30007c.m91838h(this.reportedUserId, "ReportUserBody(reportedUserId=", ", avatarUrl=", this.avatarUrl, ")");
    }

    public ReportUserBody(int i13, String str) {
        this.reportedUserId = i13;
        this.avatarUrl = str;
    }
}
