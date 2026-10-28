package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.models.MessageType;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p727py0.C29618c;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003345B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ&\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001c¨\u00066"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "Lvy/b;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", NotificationCompat.CATEGORY_STATUS, "", "lastAttemptedAt", "<init>", "(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/BalanceRefresh;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "component2", "copy", "(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "getStatus", "getStatus$annotations", "()V", "I", "getLastAttemptedAt", "getLastAttemptedAt$annotations", "Companion", "BalanceRefreshStatus", "$serializer", "com/stripe/android/financialconnections/model/e", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BalanceRefresh implements InterfaceC36562b, Parcelable {
    private final int lastAttemptedAt;
    private final BalanceRefreshStatus status;
    public static final C5609e Companion = new C5609e();
    public static final Parcelable.Creator<BalanceRefresh> CREATOR = new C5611f();
    private static final InterfaceC37138c[] $childSerializers = {BalanceRefreshStatus.Companion.serializer(), null};

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$financial_connections_core_release", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/d", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum BalanceRefreshStatus {
        FAILED(MessageType.FAILED),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");

        private final String code;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5607d Companion = new C5607d();
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29618c(23));

        BalanceRefreshStatus(String str) {
            this.code = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus", values(), new String[]{MessageType.FAILED, "pending", "succeeded", null}, new Annotation[][]{null, null, null, null}, null);
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$financial_connections_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    public /* synthetic */ BalanceRefresh(int i13, BalanceRefreshStatus balanceRefreshStatus, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, BalanceRefresh$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.status = BalanceRefreshStatus.UNKNOWN;
        } else {
            this.status = balanceRefreshStatus;
        }
        this.lastAttemptedAt = i14;
    }

    public static /* synthetic */ BalanceRefresh copy$default(BalanceRefresh balanceRefresh, BalanceRefreshStatus balanceRefreshStatus, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            balanceRefreshStatus = balanceRefresh.status;
        }
        if ((i14 & 2) != 0) {
            i13 = balanceRefresh.lastAttemptedAt;
        }
        return balanceRefresh.copy(balanceRefreshStatus, i13);
    }

    @InterfaceC37143h("last_attempted_at")
    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(BalanceRefresh self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.status != BalanceRefreshStatus.UNKNOWN) {
            output.encodeNullableSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.status);
        }
        output.encodeIntElement(serialDesc, 1, self.lastAttemptedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BalanceRefreshStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefresh copy(BalanceRefreshStatus status, int lastAttemptedAt) {
        return new BalanceRefresh(status, lastAttemptedAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRefresh)) {
            return false;
        }
        BalanceRefresh balanceRefresh = (BalanceRefresh) other;
        return this.status == balanceRefresh.status && this.lastAttemptedAt == balanceRefresh.lastAttemptedAt;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefreshStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        return Integer.hashCode(this.lastAttemptedAt) + ((balanceRefreshStatus == null ? 0 : balanceRefreshStatus.hashCode()) * 31);
    }

    public String toString() {
        return "BalanceRefresh(status=" + this.status + ", lastAttemptedAt=" + this.lastAttemptedAt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        if (balanceRefreshStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(balanceRefreshStatus.name());
        }
        dest.writeInt(this.lastAttemptedAt);
    }

    public BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i13) {
        this.status = balanceRefreshStatus;
        this.lastAttemptedAt = i13;
    }

    public /* synthetic */ BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? BalanceRefreshStatus.UNKNOWN : balanceRefreshStatus, i13);
    }
}
