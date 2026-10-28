package g51;

import com.whoop.design.util.TextResource;
import java.util.List;
import k71.C22246d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import qy0.InterfaceC30768a;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: g51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, m65681d2 = {"Lg51/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "monthTitle", "", "Lqy0/a;", "dates", "daysOfWeek", "Lk71/d;", "legendList", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15493c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f58150e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource monthTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC30768a> dates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<TextResource> daysOfWeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C22246d> legendList;

    /* JADX WARN: Multi-variable type inference failed */
    public C15493c(TextResource monthTitle, List<? extends InterfaceC30768a> dates, List<? extends TextResource> daysOfWeek, List<C22246d> legendList) {
        AbstractC22676k.m65750j(monthTitle, "monthTitle");
        AbstractC22676k.m65750j(dates, "dates");
        AbstractC22676k.m65750j(daysOfWeek, "daysOfWeek");
        AbstractC22676k.m65750j(legendList, "legendList");
        this.monthTitle = monthTitle;
        this.dates = dates;
        this.daysOfWeek = daysOfWeek;
        this.legendList = legendList;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC30768a> m43698a() {
        return this.dates;
    }

    /* JADX INFO: renamed from: b */
    public final List<TextResource> m43699b() {
        return this.daysOfWeek;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22246d> m43700c() {
        return this.legendList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getMonthTitle() {
        return this.monthTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15493c)) {
            return false;
        }
        C15493c c15493c = (C15493c) other;
        return AbstractC22676k.m65745e(this.monthTitle, c15493c.monthTitle) && AbstractC22676k.m65745e(this.dates, c15493c.dates) && AbstractC22676k.m65745e(this.daysOfWeek, c15493c.daysOfWeek) && AbstractC22676k.m65745e(this.legendList, c15493c.legendList);
    }

    public int hashCode() {
        return this.legendList.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.monthTitle.hashCode() * 31, 31, this.dates), 31, this.daysOfWeek);
    }

    public String toString() {
        TextResource textResource = this.monthTitle;
        List<InterfaceC30768a> list = this.dates;
        return AbstractC30007c.m91843m(AbstractC33745d.m106657p(textResource, "WhoopCalendarState(monthTitle=", ", dates=", ", daysOfWeek=", list), this.daysOfWeek, ", legendList=", this.legendList, ")");
    }
}
