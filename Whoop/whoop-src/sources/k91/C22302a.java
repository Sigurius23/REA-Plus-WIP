package k91;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k91.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, m65681d2 = {"Lk91/a;", "", "Ly3/f;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lt0/i;", "c", "()Lt0/i;", "Lk91/b;", "d", "()Lk91/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getTopStart-D9Ej5fM", "()F", "b", "getTopEnd-D9Ej5fM", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22302a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f87021f = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float topStart;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float topEnd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float bottomEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float bottomStart;

    /* JADX INFO: renamed from: k91.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lk91/a$a;", "", "<init>", "()V", "Ly3/f;", "start", "end", "Lk91/a;", "c", "(FF)Lk91/a;", "b", "radius", "a", "(F)Lk91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C22302a m64092d(Companion companion, float f13, float f14, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                f14 = f13;
            }
            return companion.m64095c(f13, f14);
        }

        /* JADX INFO: renamed from: a */
        public final C22302a m64093a(float radius) {
            return new C22302a(radius, radius, radius, radius, null);
        }

        /* JADX INFO: renamed from: b */
        public final C22302a m64094b(float start, float end) {
            return new C22302a(0.0f, 0.0f, end, start, 3, null);
        }

        /* JADX INFO: renamed from: c */
        public final C22302a m64095c(float start, float end) {
            return new C22302a(start, end, 0.0f, 0.0f, 12, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ C22302a(float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: c */
    public final C33252i m64090c() {
        return AbstractC33253j.m105490f(this.topStart, this.topEnd, this.bottomEnd, this.bottomStart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final C22303b m64091d() {
        return new C22303b(m64090c(), null, 2, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22302a)) {
            return false;
        }
        C22302a c22302a = (C22302a) other;
        return C39174f.m124782b(this.topStart, c22302a.topStart) && C39174f.m124782b(this.topEnd, c22302a.topEnd) && C39174f.m124782b(this.bottomEnd, c22302a.bottomEnd) && C39174f.m124782b(this.bottomStart, c22302a.bottomStart);
    }

    public int hashCode() {
        return Float.hashCode(this.bottomStart) + AbstractC11266d.m30447a(this.bottomEnd, AbstractC11266d.m30447a(this.topEnd, Float.hashCode(this.topStart) * 31, 31), 31);
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.topStart);
        String strM124783c2 = C39174f.m124783c(this.topEnd);
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("RoundedCorners(topStart=", strM124783c, ", topEnd=", strM124783c2, ", bottomEnd="), C39174f.m124783c(this.bottomEnd), ", bottomStart=", C39174f.m124783c(this.bottomStart), ")");
    }

    private C22302a(float f13, float f14, float f15, float f16) {
        this.topStart = f13;
        this.topEnd = f14;
        this.bottomEnd = f15;
        this.bottomStart = f16;
    }

    public C22302a(float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : f13, (i13 & 2) != 0 ? 0 : f14, (i13 & 4) != 0 ? 0 : f15, (i13 & 8) != 0 ? 0 : f16, null);
    }
}
