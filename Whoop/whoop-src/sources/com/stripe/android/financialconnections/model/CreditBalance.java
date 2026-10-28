package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nh3.AbstractC26725a;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pn.C29367a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002./B\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/CreditBalance;", "Lvy/b;", "Landroid/os/Parcelable;", "", "", "", "used", "<init>", "(Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/CreditBalance;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/stripe/android/financialconnections/model/CreditBalance;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getUsed", "getUsed$annotations", "()V", "Companion", "$serializer", "com/stripe/android/financialconnections/model/i", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreditBalance implements InterfaceC36562b, Parcelable {
    private final Map<String, Integer> used;
    public static final C5617i Companion = new C5617i();
    public static final Parcelable.Creator<CreditBalance> CREATOR = new C29367a(19);
    private static final InterfaceC37138c[] $childSerializers = {new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public CreditBalance() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditBalance copy$default(CreditBalance creditBalance, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = creditBalance.used;
        }
        return creditBalance.copy(map);
    }

    @InterfaceC37143h("used")
    public static /* synthetic */ void getUsed$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(CreditBalance self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.used == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.used);
    }

    public final Map<String, Integer> component1() {
        return this.used;
    }

    public final CreditBalance copy(Map<String, Integer> used) {
        return new CreditBalance(used);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreditBalance) && AbstractC22676k.m65745e(this.used, ((CreditBalance) other).used);
    }

    public final Map<String, Integer> getUsed() {
        return this.used;
    }

    public int hashCode() {
        Map<String, Integer> map = this.used;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("CreditBalance(used=", ")", this.used);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Map<String, Integer> map = this.used;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().intValue());
        }
    }

    public /* synthetic */ CreditBalance(int i13, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.used = null;
        } else {
            this.used = map;
        }
    }

    public CreditBalance(Map<String, Integer> map) {
        this.used = map;
    }

    public /* synthetic */ CreditBalance(Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : map);
    }
}
