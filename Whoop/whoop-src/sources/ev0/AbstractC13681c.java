package ev0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import td1.EnumC33707e;

/* JADX INFO: renamed from: ev0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lev0/a;", "a", "(Lev0/a;)Lev0/a;", "", "newDuration", "d", "(Lev0/a;J)Lev0/a;", "currentTimeMillis", "b", "Ltd1/e;", "newState", "c", "(Lev0/a;Ltd1/e;)Lev0/a;", "connectivity-analytics_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13681c {
    /* JADX INFO: renamed from: a */
    public static final C13679a m38597a(C13679a c13679a) {
        AbstractC22676k.m65750j(c13679a, "<this>");
        return C13679a.m38582b(c13679a, c13679a.getCountOfDisconnects() + 1, 0L, 0L, null, 14, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C13679a m38598b(C13679a c13679a, long j7) {
        AbstractC22676k.m65750j(c13679a, "<this>");
        return C13679a.m38582b(c13679a, 0, 0L, j7, null, 11, null);
    }

    /* JADX INFO: renamed from: c */
    public static final C13679a m38599c(C13679a c13679a, EnumC33707e newState) {
        AbstractC22676k.m65750j(c13679a, "<this>");
        AbstractC22676k.m65750j(newState, "newState");
        return C13679a.m38582b(c13679a, 0, 0L, 0L, newState, 7, null);
    }

    /* JADX INFO: renamed from: d */
    public static final C13679a m38600d(C13679a c13679a, long j7) {
        AbstractC22676k.m65750j(c13679a, "<this>");
        return C13679a.m38582b(c13679a, 0, j7, 0L, null, 13, null);
    }
}
