package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pn.C29367a;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002DEB=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010*JL\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u0010\"J\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010*R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bB\u00107\u001a\u0004\bA\u0010*¨\u0006F"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "Lvy/b;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "data", "", "hasMore", "", QueryParams.URL, "", "count", "totalCount", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "getData$annotations", "()V", "Z", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "Ljava/lang/Integer;", "getCount", "getCount$annotations", "getTotalCount", "getTotalCount$annotations", "Companion", "$serializer", "com/stripe/android/financialconnections/model/v", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinancialConnectionsAccountList implements InterfaceC36562b, Parcelable {
    private final Integer count;
    private final List<FinancialConnectionsAccount> data;
    private final boolean hasMore;
    private final Integer totalCount;
    private final String url;
    public static final C5632v Companion = new C5632v();
    public static final Parcelable.Creator<FinancialConnectionsAccountList> CREATOR = new C29367a(20);
    private static final InterfaceC37138c[] $childSerializers = {new ArrayListSerializer(FinancialConnectionsAccount$$serializer.INSTANCE), null, null, null, null};

    public /* synthetic */ FinancialConnectionsAccountList(int i13, List list, boolean z4, String str, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FinancialConnectionsAccountList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.hasMore = z4;
        this.url = str;
        if ((i13 & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i13 & 16) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinancialConnectionsAccountList copy$default(FinancialConnectionsAccountList financialConnectionsAccountList, List list, boolean z4, String str, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = financialConnectionsAccountList.data;
        }
        if ((i13 & 2) != 0) {
            z4 = financialConnectionsAccountList.hasMore;
        }
        if ((i13 & 4) != 0) {
            str = financialConnectionsAccountList.url;
        }
        if ((i13 & 8) != 0) {
            num = financialConnectionsAccountList.count;
        }
        if ((i13 & 16) != 0) {
            num2 = financialConnectionsAccountList.totalCount;
        }
        Integer num3 = num2;
        String str2 = str;
        return financialConnectionsAccountList.copy(list, z4, str2, num, num3);
    }

    @InterfaceC37143h("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @InterfaceC37143h("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @InterfaceC37143h("has_more")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @InterfaceC37143h("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    @InterfaceC37143h(QueryParams.URL)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(FinancialConnectionsAccountList self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.data);
        output.encodeBooleanElement(serialDesc, 1, self.hasMore);
        output.encodeStringElement(serialDesc, 2, self.url);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.count != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.count);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.totalCount == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.totalCount);
    }

    public final List<FinancialConnectionsAccount> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final FinancialConnectionsAccountList copy(List<FinancialConnectionsAccount> data, boolean hasMore, String url, Integer count, Integer totalCount) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(url, "url");
        return new FinancialConnectionsAccountList(data, hasMore, url, count, totalCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAccountList)) {
            return false;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList = (FinancialConnectionsAccountList) other;
        return AbstractC22676k.m65745e(this.data, financialConnectionsAccountList.data) && this.hasMore == financialConnectionsAccountList.hasMore && AbstractC22676k.m65745e(this.url, financialConnectionsAccountList.url) && AbstractC22676k.m65745e(this.count, financialConnectionsAccountList.count) && AbstractC22676k.m65745e(this.totalCount, financialConnectionsAccountList.totalCount);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<FinancialConnectionsAccount> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.data.hashCode() * 31, 31, this.hasMore), 31, this.url);
        Integer num = this.count;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        List<FinancialConnectionsAccount> list = this.data;
        boolean z4 = this.hasMore;
        String str = this.url;
        Integer num = this.count;
        Integer num2 = this.totalCount;
        StringBuilder sb4 = new StringBuilder("FinancialConnectionsAccountList(data=");
        sb4.append(list);
        sb4.append(", hasMore=");
        sb4.append(z4);
        sb4.append(", url=");
        AbstractC30007c.m91853w(num, str, ", count=", ", totalCount=", sb4);
        return AbstractC11478a.m30859k(sb4, num2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.data, dest);
        while (itM30863o.hasNext()) {
            ((FinancialConnectionsAccount) itM30863o.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.hasMore ? 1 : 0);
        dest.writeString(this.url);
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
    }

    public FinancialConnectionsAccountList(List<FinancialConnectionsAccount> data, boolean z4, String url, Integer num, Integer num2) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(url, "url");
        this.data = data;
        this.hasMore = z4;
        this.url = url;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ FinancialConnectionsAccountList(List list, boolean z4, String str, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z4, str, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2);
    }
}
