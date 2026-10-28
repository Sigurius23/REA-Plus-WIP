package ht2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ht2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J^\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b$\u00100¨\u00061"}, m65681d2 = {"Lht2/a;", "Lm91/u;", "Lht2/h;", "state", "", "isExpanded", "", "title", "daysLeftDisplay", "Lht2/g;", "progressBreakdownBar", "", "Lht2/i;", "items", "Lny0/h;", "cardButton", "<init>", "(Lht2/h;ZLjava/lang/String;Ljava/lang/String;Lht2/g;Ljava/util/List;Lny0/h;)V", "a", "(Lht2/h;ZLjava/lang/String;Ljava/lang/String;Lht2/g;Ljava/util/List;Lny0/h;)Lht2/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lht2/h;", "getState", "()Lht2/h;", "b", "Z", "i", "()Z", "c", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "Lht2/g;", "g", "()Lht2/g;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lny0/h;", "()Lny0/h;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17629a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC17636h state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String daysLeftDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17635g progressBreakdownBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C17637i> items;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27256h cardButton;

    public C17629a(EnumC17636h state, boolean z4, String title, String daysLeftDisplay, C17635g progressBreakdownBar, List<C17637i> items, C27256h c27256h) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(daysLeftDisplay, "daysLeftDisplay");
        AbstractC22676k.m65750j(progressBreakdownBar, "progressBreakdownBar");
        AbstractC22676k.m65750j(items, "items");
        this.state = state;
        this.isExpanded = z4;
        this.title = title;
        this.daysLeftDisplay = daysLeftDisplay;
        this.progressBreakdownBar = progressBreakdownBar;
        this.items = items;
        this.cardButton = c27256h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17629a m50185b(C17629a c17629a, EnumC17636h enumC17636h, boolean z4, String str, String str2, C17635g c17635g, List list, C27256h c27256h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC17636h = c17629a.state;
        }
        if ((i13 & 2) != 0) {
            z4 = c17629a.isExpanded;
        }
        if ((i13 & 4) != 0) {
            str = c17629a.title;
        }
        if ((i13 & 8) != 0) {
            str2 = c17629a.daysLeftDisplay;
        }
        if ((i13 & 16) != 0) {
            c17635g = c17629a.progressBreakdownBar;
        }
        if ((i13 & 32) != 0) {
            list = c17629a.items;
        }
        if ((i13 & 64) != 0) {
            c27256h = c17629a.cardButton;
        }
        List list2 = list;
        C27256h c27256h2 = c27256h;
        C17635g c17635g2 = c17635g;
        String str3 = str;
        return c17629a.m50186a(enumC17636h, z4, str3, str2, c17635g2, list2, c27256h2);
    }

    /* JADX INFO: renamed from: a */
    public final C17629a m50186a(EnumC17636h state, boolean isExpanded, String title, String daysLeftDisplay, C17635g progressBreakdownBar, List<C17637i> items, C27256h cardButton) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(daysLeftDisplay, "daysLeftDisplay");
        AbstractC22676k.m65750j(progressBreakdownBar, "progressBreakdownBar");
        AbstractC22676k.m65750j(items, "items");
        return new C17629a(state, isExpanded, title, daysLeftDisplay, progressBreakdownBar, items, cardButton);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDaysLeftDisplay() {
        return this.daysLeftDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17629a)) {
            return false;
        }
        C17629a c17629a = (C17629a) other;
        return this.state == c17629a.state && this.isExpanded == c17629a.isExpanded && AbstractC22676k.m65745e(this.title, c17629a.title) && AbstractC22676k.m65745e(this.daysLeftDisplay, c17629a.daysLeftDisplay) && AbstractC22676k.m65745e(this.progressBreakdownBar, c17629a.progressBreakdownBar) && AbstractC22676k.m65745e(this.items, c17629a.items) && AbstractC22676k.m65745e(this.cardButton, c17629a.cardButton);
    }

    /* JADX INFO: renamed from: f */
    public final List<C17637i> m50189f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17635g getProgressBreakdownBar() {
        return this.progressBreakdownBar;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.progressBreakdownBar.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.state.hashCode() * 31, 31, this.isExpanded), 31, this.title), 31, this.daysLeftDisplay)) * 31, 31, this.items);
        C27256h c27256h = this.cardButton;
        return iM31983b + (c27256h == null ? 0 : c27256h.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        EnumC17636h enumC17636h = this.state;
        boolean z4 = this.isExpanded;
        String str = this.title;
        String str2 = this.daysLeftDisplay;
        C17635g c17635g = this.progressBreakdownBar;
        List<C17637i> list = this.items;
        C27256h c27256h = this.cardButton;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanHomeTileItemState(state=");
        sb4.append(enumC17636h);
        sb4.append(", isExpanded=");
        sb4.append(z4);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", daysLeftDisplay=", str2, ", progressBreakdownBar=");
        sb4.append(c17635g);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", cardButton=");
        sb4.append(c27256h);
        sb4.append(")");
        return sb4.toString();
    }
}
