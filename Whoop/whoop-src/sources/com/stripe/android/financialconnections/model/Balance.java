package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0003HIJBE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,JR\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b1\u0010#J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010#R,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010,¨\u0006K"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/Balance;", "Lvy/b;", "Landroid/os/Parcelable;", "", "asOf", "", "", "current", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "type", "Lcom/stripe/android/financialconnections/model/CashBalance;", "cash", "Lcom/stripe/android/financialconnections/model/CreditBalance;", "credit", "<init>", "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/Balance;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/Map;", "component3", "()Lcom/stripe/android/financialconnections/model/Balance$Type;", "component4", "()Lcom/stripe/android/financialconnections/model/CashBalance;", "component5", "()Lcom/stripe/android/financialconnections/model/CreditBalance;", "copy", "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAsOf", "getAsOf$annotations", "()V", "Ljava/util/Map;", "getCurrent", "getCurrent$annotations", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "getType", "getType$annotations", "Lcom/stripe/android/financialconnections/model/CashBalance;", "getCash", "getCash$annotations", "Lcom/stripe/android/financialconnections/model/CreditBalance;", "getCredit", "getCredit$annotations", "Companion", "Type", "$serializer", "com/stripe/android/financialconnections/model/a", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Balance implements InterfaceC36562b, Parcelable {
    private final int asOf;
    private final CashBalance cash;
    private final CreditBalance credit;
    private final Map<String, Integer> current;
    private final Type type;
    public static final C5601a Companion = new C5601a();
    public static final Parcelable.Creator<Balance> CREATOR = new C5603b();
    private static final InterfaceC37138c[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), Type.Companion.serializer(), null, null};

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/c", "CASH", "CREDIT", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum Type {
        CASH("cash"),
        CREDIT("credit"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5605c Companion = new C5605c();
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29618c(22));

        Type(String str) {
            this.value = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.Balance.Type", values(), new String[]{"cash", "credit", null}, new Annotation[][]{null, null, null}, null);
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ Balance(int i13, int i14, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, Balance$$serializer.INSTANCE.getDescriptor());
        }
        this.asOf = i14;
        this.current = map;
        if ((i13 & 4) == 0) {
            this.type = Type.UNKNOWN;
        } else {
            this.type = type;
        }
        if ((i13 & 8) == 0) {
            this.cash = null;
        } else {
            this.cash = cashBalance;
        }
        if ((i13 & 16) == 0) {
            this.credit = null;
        } else {
            this.credit = creditBalance;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Balance copy$default(Balance balance, int i13, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = balance.asOf;
        }
        if ((i14 & 2) != 0) {
            map = balance.current;
        }
        if ((i14 & 4) != 0) {
            type = balance.type;
        }
        if ((i14 & 8) != 0) {
            cashBalance = balance.cash;
        }
        if ((i14 & 16) != 0) {
            creditBalance = balance.credit;
        }
        CreditBalance creditBalance2 = creditBalance;
        Type type2 = type;
        return balance.copy(i13, map, type2, cashBalance, creditBalance2);
    }

    @InterfaceC37143h("as_of")
    public static /* synthetic */ void getAsOf$annotations() {
    }

    @InterfaceC37143h("cash")
    public static /* synthetic */ void getCash$annotations() {
    }

    @InterfaceC37143h("credit")
    public static /* synthetic */ void getCredit$annotations() {
    }

    @InterfaceC37143h("current")
    public static /* synthetic */ void getCurrent$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(Balance self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.asOf);
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.current);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.type != Type.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.cash != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CashBalance$$serializer.INSTANCE, self.cash);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.credit == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, CreditBalance$$serializer.INSTANCE, self.credit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAsOf() {
        return this.asOf;
    }

    public final Map<String, Integer> component2() {
        return this.current;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CashBalance getCash() {
        return this.cash;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CreditBalance getCredit() {
        return this.credit;
    }

    public final Balance copy(int asOf, Map<String, Integer> current, Type type, CashBalance cash, CreditBalance credit) {
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(type, "type");
        return new Balance(asOf, current, type, cash, credit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) other;
        return this.asOf == balance.asOf && AbstractC22676k.m65745e(this.current, balance.current) && this.type == balance.type && AbstractC22676k.m65745e(this.cash, balance.cash) && AbstractC22676k.m65745e(this.credit, balance.credit);
    }

    public final int getAsOf() {
        return this.asOf;
    }

    public final CashBalance getCash() {
        return this.cash;
    }

    public final CreditBalance getCredit() {
        return this.credit;
    }

    public final Map<String, Integer> getCurrent() {
        return this.current;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + AbstractC3855a.m11821e(this.current, Integer.hashCode(this.asOf) * 31, 31)) * 31;
        CashBalance cashBalance = this.cash;
        int iHashCode2 = (iHashCode + (cashBalance == null ? 0 : cashBalance.hashCode())) * 31;
        CreditBalance creditBalance = this.credit;
        return iHashCode2 + (creditBalance != null ? creditBalance.hashCode() : 0);
    }

    public String toString() {
        return "Balance(asOf=" + this.asOf + ", current=" + this.current + ", type=" + this.type + ", cash=" + this.cash + ", credit=" + this.credit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.asOf);
        Map<String, Integer> map = this.current;
        dest.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().intValue());
        }
        dest.writeString(this.type.name());
        CashBalance cashBalance = this.cash;
        if (cashBalance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cashBalance.writeToParcel(dest, flags);
        }
        CreditBalance creditBalance = this.credit;
        if (creditBalance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditBalance.writeToParcel(dest, flags);
        }
    }

    public Balance(int i13, Map<String, Integer> current, Type type, CashBalance cashBalance, CreditBalance creditBalance) {
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(type, "type");
        this.asOf = i13;
        this.current = current;
        this.type = type;
        this.cash = cashBalance;
        this.credit = creditBalance;
    }

    public /* synthetic */ Balance(int i13, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, map, (i14 & 4) != 0 ? Type.UNKNOWN : type, (i14 & 8) != 0 ? null : cashBalance, (i14 & 16) != 0 ? null : creditBalance);
    }
}
