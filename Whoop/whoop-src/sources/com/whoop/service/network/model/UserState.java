package com.whoop.service.network.model;

import ad3.InterfaceC0778u;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00046785B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010!R\u0011\u00103\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b3\u0010\u001aR\u0011\u00104\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u0010\u001a¨\u00069"}, m65681d2 = {"Lcom/whoop/service/network/model/UserState;", "", "", "source", "state", "startAt", "", "latestMetricsProcessed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/UserState;Lzc3/c;Lyc3/g;)V", "write$Self", "", "isAutoDetectedSleep", "()Z", "isAutoDetectedWorkout", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/whoop/service/network/model/UserState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getState", "getStartAt", "getStartAt$annotations", "()V", "J", "getLatestMetricsProcessed", "getLatestMetricsProcessed$annotations", "isUserSet", "isInIdleState", "Companion", "Sources", "States", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long latestMetricsProcessed;
    private final String source;
    private final String startAt;
    private final String state;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/UserState$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/UserState;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/UserState$Sources;", "", "<init>", "()V", "AUTO", "", "USER", "AUTO_USER", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Sources {
        public static final String AUTO = "auto";
        public static final String AUTO_USER = "auto+user";
        public static final Sources INSTANCE = new Sources();
        public static final String USER = "user";

        private Sources() {
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/UserState$States;", "", "<init>", "()V", "IDLE", "", "SLEEP", "WORKOUT", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class States {
        public static final String IDLE = "idle";
        public static final States INSTANCE = new States();
        public static final String SLEEP = "sleep";
        public static final String WORKOUT = "workout";

        private States() {
        }
    }

    public UserState() {
        this((String) null, (String) null, (String) null, 0L, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserState copy$default(UserState userState, String str, String str2, String str3, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userState.source;
        }
        if ((i13 & 2) != 0) {
            str2 = userState.state;
        }
        if ((i13 & 4) != 0) {
            str3 = userState.startAt;
        }
        if ((i13 & 8) != 0) {
            j7 = userState.latestMetricsProcessed;
        }
        String str4 = str3;
        return userState.copy(str, str2, str4, j7);
    }

    @InterfaceC0778u(names = {"latestMetricsProcessed"})
    public static /* synthetic */ void getLatestMetricsProcessed$annotations() {
    }

    @InterfaceC0778u(names = {"startAt"})
    public static /* synthetic */ void getStartAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(UserState self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.state != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.startAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.startAt);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.latestMetricsProcessed == 0) {
            return;
        }
        output.encodeLongElement(serialDesc, 3, self.latestMetricsProcessed);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartAt() {
        return this.startAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLatestMetricsProcessed() {
        return this.latestMetricsProcessed;
    }

    public final UserState copy(String source, String state, String startAt, long latestMetricsProcessed) {
        return new UserState(source, state, startAt, latestMetricsProcessed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) other;
        return AbstractC22676k.m65745e(this.source, userState.source) && AbstractC22676k.m65745e(this.state, userState.state) && AbstractC22676k.m65745e(this.startAt, userState.startAt) && this.latestMetricsProcessed == userState.latestMetricsProcessed;
    }

    public final long getLatestMetricsProcessed() {
        return this.latestMetricsProcessed;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStartAt() {
        return this.startAt;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startAt;
        return Long.hashCode(this.latestMetricsProcessed) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isAutoDetectedSleep() {
        return Sources.AUTO.equals(this.source) && States.SLEEP.equals(this.state);
    }

    public final boolean isAutoDetectedWorkout() {
        return Sources.AUTO.equals(this.source) && "workout".equals(this.state);
    }

    public final boolean isInIdleState() {
        return States.IDLE.equals(this.state);
    }

    public final boolean isUserSet() {
        return Sources.USER.equals(this.source);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.state;
        String str3 = this.startAt;
        long j7 = this.latestMetricsProcessed;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserState(source=", str, ", state=", str2, ", startAt=");
        sbM32001t.append(str3);
        sbM32001t.append(", latestMetricsProcessed=");
        sbM32001t.append(j7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ UserState(int i13, String str, String str2, String str3, long j7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
        if ((i13 & 2) == 0) {
            this.state = null;
        } else {
            this.state = str2;
        }
        if ((i13 & 4) == 0) {
            this.startAt = null;
        } else {
            this.startAt = str3;
        }
        if ((i13 & 8) == 0) {
            this.latestMetricsProcessed = 0L;
        } else {
            this.latestMetricsProcessed = j7;
        }
    }

    public UserState(String str, String str2, String str3, long j7) {
        this.source = str;
        this.state = str2;
        this.startAt = str3;
        this.latestMetricsProcessed = j7;
    }

    public /* synthetic */ UserState(String str, String str2, String str3, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? 0L : j7);
    }
}
