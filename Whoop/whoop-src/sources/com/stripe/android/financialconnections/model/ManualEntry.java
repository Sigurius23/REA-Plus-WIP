package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntry;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "mode", "<init>", "(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/ManualEntryMode;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/ManualEntry;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "copy", "(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)Lcom/stripe/android/financialconnections/model/ManualEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "getMode", "Companion", "$serializer", "com/stripe/android/financialconnections/model/g0", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualEntry implements Parcelable {
    private final ManualEntryMode mode;
    public static final C5614g0 Companion = new C5614g0();
    public static final Parcelable.Creator<ManualEntry> CREATOR = new C29367a(21);

    public /* synthetic */ ManualEntry(int i13, ManualEntryMode manualEntryMode, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ManualEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.mode = manualEntryMode;
    }

    public static /* synthetic */ ManualEntry copy$default(ManualEntry manualEntry, ManualEntryMode manualEntryMode, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            manualEntryMode = manualEntry.mode;
        }
        return manualEntry.copy(manualEntryMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ManualEntryMode getMode() {
        return this.mode;
    }

    public final ManualEntry copy(ManualEntryMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        return new ManualEntry(mode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ManualEntry) && this.mode == ((ManualEntry) other).mode;
    }

    public final ManualEntryMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    public String toString() {
        return "ManualEntry(mode=" + this.mode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.mode.name());
    }

    public ManualEntry(ManualEntryMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.mode = mode;
    }
}
