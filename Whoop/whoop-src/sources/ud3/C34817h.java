package ud3;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: ud3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C34817h {

    /* JADX INFO: renamed from: n */
    public static final C34817h f146574n = new C34817h(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o */
    public static final C34817h f146575o;

    /* JADX INFO: renamed from: a */
    public final boolean f146576a;

    /* JADX INFO: renamed from: b */
    public final boolean f146577b;

    /* JADX INFO: renamed from: c */
    public final int f146578c;

    /* JADX INFO: renamed from: d */
    public final int f146579d;

    /* JADX INFO: renamed from: e */
    public final boolean f146580e;

    /* JADX INFO: renamed from: f */
    public final boolean f146581f;

    /* JADX INFO: renamed from: g */
    public final boolean f146582g;

    /* JADX INFO: renamed from: h */
    public final int f146583h;

    /* JADX INFO: renamed from: i */
    public final int f146584i;

    /* JADX INFO: renamed from: j */
    public final boolean f146585j;

    /* JADX INFO: renamed from: k */
    public final boolean f146586k;

    /* JADX INFO: renamed from: l */
    public final boolean f146587l;

    /* JADX INFO: renamed from: m */
    public String f146588m;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        long jM134276getInWholeSecondsimpl = Duration.m134276getInWholeSecondsimpl(DurationKt.toDuration(Integer.MAX_VALUE, DurationUnit.SECONDS));
        if (jM134276getInWholeSecondsimpl < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(jM134276getInWholeSecondsimpl, "maxStale < 0: ").toString());
        }
        f146575o = new C34817h(false, false, -1, -1, false, false, false, jM134276getInWholeSecondsimpl <= 2147483647L ? (int) jM134276getInWholeSecondsimpl : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C34817h(boolean z4, boolean z13, int i13, int i14, boolean z14, boolean z15, boolean z16, int i15, int i16, boolean z17, boolean z18, boolean z19, String str) {
        this.f146576a = z4;
        this.f146577b = z13;
        this.f146578c = i13;
        this.f146579d = i14;
        this.f146580e = z14;
        this.f146581f = z15;
        this.f146582g = z16;
        this.f146583h = i15;
        this.f146584i = i16;
        this.f146585j = z17;
        this.f146586k = z18;
        this.f146587l = z19;
        this.f146588m = str;
    }

    public final String toString() {
        String str = this.f146588m;
        if (str != null) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        if (this.f146576a) {
            sb4.append("no-cache, ");
        }
        if (this.f146577b) {
            sb4.append("no-store, ");
        }
        int i13 = this.f146578c;
        if (i13 != -1) {
            sb4.append("max-age=");
            sb4.append(i13);
            sb4.append(", ");
        }
        int i14 = this.f146579d;
        if (i14 != -1) {
            sb4.append("s-maxage=");
            sb4.append(i14);
            sb4.append(", ");
        }
        if (this.f146580e) {
            sb4.append("private, ");
        }
        if (this.f146581f) {
            sb4.append("public, ");
        }
        if (this.f146582g) {
            sb4.append("must-revalidate, ");
        }
        int i15 = this.f146583h;
        if (i15 != -1) {
            sb4.append("max-stale=");
            sb4.append(i15);
            sb4.append(", ");
        }
        int i16 = this.f146584i;
        if (i16 != -1) {
            sb4.append("min-fresh=");
            sb4.append(i16);
            sb4.append(", ");
        }
        if (this.f146585j) {
            sb4.append("only-if-cached, ");
        }
        if (this.f146586k) {
            sb4.append("no-transform, ");
        }
        if (this.f146587l) {
            sb4.append("immutable, ");
        }
        if (sb4.length() == 0) {
            return "";
        }
        AbstractC22676k.m65749i(sb4.delete(sb4.length() - 2, sb4.length()), "delete(...)");
        String string = sb4.toString();
        this.f146588m = string;
        return string;
    }
}
