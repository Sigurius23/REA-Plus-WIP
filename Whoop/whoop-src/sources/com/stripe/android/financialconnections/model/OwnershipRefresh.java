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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003345B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001f¨\u00066"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "Landroid/os/Parcelable;", "Lvy/b;", "", "lastAttemptedAt", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", NotificationCompat.CATEGORY_STATUS, "<init>", "(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "copy", "(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLastAttemptedAt", "getLastAttemptedAt$annotations", "()V", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "getStatus", "getStatus$annotations", "Companion", "Status", "$serializer", "com/stripe/android/financialconnections/model/h0", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OwnershipRefresh implements Parcelable, InterfaceC36562b {
    private final int lastAttemptedAt;
    private final Status status;
    public static final C5616h0 Companion = new C5616h0();
    public static final Parcelable.Creator<OwnershipRefresh> CREATOR = new C5618i0();
    private static final InterfaceC37138c[] $childSerializers = {null, Status.Companion.serializer()};

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/j0", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum Status {
        FAILED(MessageType.FAILED),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5620j0 Companion = new C5620j0();
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29618c(24));

        Status(String str) {
            this.value = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.OwnershipRefresh.Status", values(), new String[]{MessageType.FAILED, "pending", "succeeded", null}, new Annotation[][]{null, null, null, null}, null);
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ OwnershipRefresh(int i13, int i14, Status status, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, OwnershipRefresh$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAttemptedAt = i14;
        if ((i13 & 2) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
    }

    public static /* synthetic */ OwnershipRefresh copy$default(OwnershipRefresh ownershipRefresh, int i13, Status status, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = ownershipRefresh.lastAttemptedAt;
        }
        if ((i14 & 2) != 0) {
            status = ownershipRefresh.status;
        }
        return ownershipRefresh.copy(i13, status);
    }

    @InterfaceC37143h("last_attempted_at")
    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(OwnershipRefresh self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.lastAttemptedAt);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.status == Status.UNKNOWN) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final OwnershipRefresh copy(int lastAttemptedAt, Status status) {
        AbstractC22676k.m65750j(status, "status");
        return new OwnershipRefresh(lastAttemptedAt, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnershipRefresh)) {
            return false;
        }
        OwnershipRefresh ownershipRefresh = (OwnershipRefresh) other;
        return this.lastAttemptedAt == ownershipRefresh.lastAttemptedAt && this.status == ownershipRefresh.status;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (Integer.hashCode(this.lastAttemptedAt) * 31);
    }

    public String toString() {
        return "OwnershipRefresh(lastAttemptedAt=" + this.lastAttemptedAt + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.lastAttemptedAt);
        dest.writeString(this.status.name());
    }

    public OwnershipRefresh(int i13, Status status) {
        AbstractC22676k.m65750j(status, "status");
        this.lastAttemptedAt = i13;
        this.status = status;
    }

    public /* synthetic */ OwnershipRefresh(int i13, Status status, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? Status.UNKNOWN : status);
    }
}
