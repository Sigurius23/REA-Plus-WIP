package kl1;

import com.whoop.home.domain.models.CalendarResponse;
import fm1.EnumC14603g;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R1\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lkl1/a;", "", "", "Lfm1/g;", "", "Lcom/whoop/home/domain/models/CalendarResponse;", "calendarMap", "monthOffsetIndex", "<init>", "(Ljava/util/Map;I)V", "a", "(Ljava/util/Map;I)Lkl1/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "I", "c", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22561a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<EnumC14603g, Map<Integer, CalendarResponse>> calendarMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int monthOffsetIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public C22561a(Map<EnumC14603g, ? extends Map<Integer, CalendarResponse>> calendarMap, int i13) {
        AbstractC22676k.m65750j(calendarMap, "calendarMap");
        this.calendarMap = calendarMap;
        this.monthOffsetIndex = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C22561a m65296a(Map<EnumC14603g, ? extends Map<Integer, CalendarResponse>> calendarMap, int monthOffsetIndex) {
        AbstractC22676k.m65750j(calendarMap, "calendarMap");
        return new C22561a(calendarMap, monthOffsetIndex);
    }

    /* JADX INFO: renamed from: b */
    public final Map<EnumC14603g, Map<Integer, CalendarResponse>> m65297b() {
        return this.calendarMap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMonthOffsetIndex() {
        return this.monthOffsetIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22561a)) {
            return false;
        }
        C22561a c22561a = (C22561a) other;
        return AbstractC22676k.m65745e(this.calendarMap, c22561a.calendarMap) && this.monthOffsetIndex == c22561a.monthOffsetIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.monthOffsetIndex) + (this.calendarMap.hashCode() * 31);
    }

    public String toString() {
        return "AccumulatedMap(calendarMap=" + this.calendarMap + ", monthOffsetIndex=" + this.monthOffsetIndex + ")";
    }

    public C22561a(Map map, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? AbstractC25247g0.m73989X(new C23465k(EnumC14603g.OVERVIEW, AbstractC25247g0.m73989X(new C23465k(0, null)))) : map, (i14 & 2) != 0 ? 0 : i13);
    }
}
