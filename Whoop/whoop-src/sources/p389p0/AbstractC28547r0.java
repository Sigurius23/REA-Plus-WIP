package p389p0;

import p329n0.C26065r;

/* JADX INFO: renamed from: p0.r0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28547r0 {

    /* JADX INFO: renamed from: a */
    public static final float f115493a = 2500;

    /* JADX INFO: renamed from: b */
    public static final float f115494b = 1500;

    /* JADX INFO: renamed from: c */
    public static final float f115495c = 50;

    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[Catch: i -> 0x01c1, TryCatch #4 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:107:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: i -> 0x01c1, TryCatch #4 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:107:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[Catch: i -> 0x01c1, TryCatch #4 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:107:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4 A[Catch: i -> 0x01c1, TRY_LEAVE, TryCatch #4 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:107:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0191 -> B:18:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m86844a(p329n0.C26065r r28, int r29, int r30, int r31, p636y3.InterfaceC39171c r32, s83.AbstractC32269c r33) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p389p0.AbstractC28547r0.m86844a(n0.r, int, int, int, y3.c, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m86845b(boolean z4, C26065r c26065r, int i13, int i14) {
        if (z4) {
            if (c26065r.m77558c() > i13) {
                return true;
            }
            return c26065r.m77558c() == i13 && c26065r.m77559d() > i14;
        }
        if (c26065r.m77558c() < i13) {
            return true;
        }
        return c26065r.m77558c() == i13 && c26065r.m77559d() < i14;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m86846c(C26065r c26065r, int i13) {
        return i13 <= c26065r.m77560e() && c26065r.m77558c() <= i13;
    }
}
