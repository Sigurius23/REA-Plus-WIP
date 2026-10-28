package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.C38992x0;
import y00.EnumC38886l2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/stripe/android/model/LinkAuthIntent;", "Lvy/b;", "Ly00/l2;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ly00/l2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy00/l2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/LinkAuthIntent;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ly00/l2;", "copy", "(Ly00/l2;)Lcom/stripe/android/model/LinkAuthIntent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly00/l2;", "getStatus", "getStatus$annotations", "()V", "Companion", "$serializer", "com/stripe/android/model/a0", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinkAuthIntent implements InterfaceC36562b {
    private final EnumC38886l2 status;
    public static final C5643a0 Companion = new C5643a0();
    public static final Parcelable.Creator<LinkAuthIntent> CREATOR = new C38992x0(25);
    private static final InterfaceC37138c[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.LinkAuthIntent.Status", EnumC38886l2.values())};

    public /* synthetic */ LinkAuthIntent(int i13, EnumC38886l2 enumC38886l2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, LinkAuthIntent$$serializer.INSTANCE.getDescriptor());
        }
        this.status = enumC38886l2;
    }

    public static /* synthetic */ LinkAuthIntent copy$default(LinkAuthIntent linkAuthIntent, EnumC38886l2 enumC38886l2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC38886l2 = linkAuthIntent.status;
        }
        return linkAuthIntent.copy(enumC38886l2);
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC38886l2 getStatus() {
        return this.status;
    }

    public final LinkAuthIntent copy(EnumC38886l2 status) {
        AbstractC22676k.m65750j(status, "status");
        return new LinkAuthIntent(status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkAuthIntent) && this.status == ((LinkAuthIntent) other).status;
    }

    public final EnumC38886l2 getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "LinkAuthIntent(status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.status.name());
    }

    public LinkAuthIntent(EnumC38886l2 status) {
        AbstractC22676k.m65750j(status, "status");
        this.status = status;
    }
}
