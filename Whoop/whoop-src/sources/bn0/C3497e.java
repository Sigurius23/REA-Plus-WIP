package bn0;

import g51.C15493c;
import i11.C17863f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import vy0.C36570d0;

/* JADX INFO: renamed from: bn0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b#\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b\u001d\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b,\u00100R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b)\u00102¨\u00063"}, m65681d2 = {"Lbn0/e;", "", "", "isLoading", "isError", "", "pageIndex", "loadingMonth", "failedMonth", "Li11/f;", "dateSelector", "Lvy0/d0;", "fabMenu", "", "Lm91/u;", "trailingItems", "", "Lg51/c;", "months", "<init>", "(ZZILjava/lang/Integer;Ljava/lang/Integer;Li11/f;Lvy0/d0;Ljava/util/List;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "I", "f", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Li11/f;", "()Li11/f;", "g", "Lvy0/d0;", "()Lvy0/d0;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3497e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pageIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer loadingMonth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer failedMonth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17863f dateSelector;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36570d0 fabMenu;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<InterfaceC25312u> trailingItems;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Map<Integer, C15493c> months;

    /* JADX WARN: Multi-variable type inference failed */
    public C3497e(boolean z4, boolean z13, int i13, Integer num, Integer num2, C17863f c17863f, C36570d0 c36570d0, List<? extends InterfaceC25312u> trailingItems, Map<Integer, C15493c> months) {
        AbstractC22676k.m65750j(trailingItems, "trailingItems");
        AbstractC22676k.m65750j(months, "months");
        this.isLoading = z4;
        this.isError = z13;
        this.pageIndex = i13;
        this.loadingMonth = num;
        this.failedMonth = num2;
        this.dateSelector = c17863f;
        this.fabMenu = c36570d0;
        this.trailingItems = trailingItems;
        this.months = months;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17863f getDateSelector() {
        return this.dateSelector;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C36570d0 getFabMenu() {
        return this.fabMenu;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getFailedMonth() {
        return this.failedMonth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getLoadingMonth() {
        return this.loadingMonth;
    }

    /* JADX INFO: renamed from: e */
    public final Map<Integer, C15493c> m10317e() {
        return this.months;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3497e)) {
            return false;
        }
        C3497e c3497e = (C3497e) other;
        return this.isLoading == c3497e.isLoading && this.isError == c3497e.isError && this.pageIndex == c3497e.pageIndex && AbstractC22676k.m65745e(this.loadingMonth, c3497e.loadingMonth) && AbstractC22676k.m65745e(this.failedMonth, c3497e.failedMonth) && AbstractC22676k.m65745e(this.dateSelector, c3497e.dateSelector) && AbstractC22676k.m65745e(this.fabMenu, c3497e.fabMenu) && AbstractC22676k.m65745e(this.trailingItems, c3497e.trailingItems) && AbstractC22676k.m65745e(this.months, c3497e.months);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC25312u> m10319g() {
        return this.trailingItems;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.pageIndex, AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31);
        Integer num = this.loadingMonth;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.failedMonth;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        C17863f c17863f = this.dateSelector;
        int iHashCode3 = (iHashCode2 + (c17863f == null ? 0 : c17863f.hashCode())) * 31;
        C36570d0 c36570d0 = this.fabMenu;
        return this.months.hashCode() + AbstractC11895b.m31983b((iHashCode3 + (c36570d0 != null ? c36570d0.hashCode() : 0)) * 31, 31, this.trailingItems);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        int i13 = this.pageIndex;
        Integer num = this.loadingMonth;
        Integer num2 = this.failedMonth;
        C17863f c17863f = this.dateSelector;
        C36570d0 c36570d0 = this.fabMenu;
        List<InterfaceC25312u> list = this.trailingItems;
        Map<Integer, C15493c> map = this.months;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ArchMiniCalendarViewState(isLoading=", ", isError=", ", pageIndex=", z4, z13);
        sbM32002u.append(i13);
        sbM32002u.append(", loadingMonth=");
        sbM32002u.append(num);
        sbM32002u.append(", failedMonth=");
        sbM32002u.append(num2);
        sbM32002u.append(", dateSelector=");
        sbM32002u.append(c17863f);
        sbM32002u.append(", fabMenu=");
        sbM32002u.append(c36570d0);
        sbM32002u.append(", trailingItems=");
        sbM32002u.append(list);
        sbM32002u.append(", months=");
        return AbstractC13673n.m38565l(sbM32002u, map, ")");
    }

    public /* synthetic */ C3497e(boolean z4, boolean z13, int i13, Integer num, Integer num2, C17863f c17863f, C36570d0 c36570d0, List list, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? true : z4, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : c17863f, (i14 & 64) != 0 ? null : c36570d0, (i14 & 128) != 0 ? C25271y.f99162w : list, (i14 & 256) != 0 ? C25272z.f99163w : map);
    }
}
