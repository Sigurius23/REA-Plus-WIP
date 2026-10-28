package p91;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p91.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0015B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, m65681d2 = {"Lp91/a;", "", "", "x", "y", "", "isConfinedHorizontally", "isConfinedVertically", "<init>", "(FFZZ)V", "e", "(FFZZ)Lp91/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "g", "()F", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Z", "i", "()Z", "d", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29007a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final C29007a f117371f;

    /* JADX INFO: renamed from: g */
    private static final C29007a f117372g;

    /* JADX INFO: renamed from: h */
    private static final C29007a f117373h;

    /* JADX INFO: renamed from: i */
    private static final C29007a f117374i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isConfinedHorizontally;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isConfinedVertically;

    /* JADX INFO: renamed from: p91.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lp91/a$a;", "", "<init>", "()V", "Lp91/a;", AnalyticsRequestV2.HEADER_ORIGIN, "Lp91/a;", "d", "()Lp91/a;", "center", "a", "centerX", "b", "centerY", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C29007a m88136a() {
            return C29007a.f117372g;
        }

        /* JADX INFO: renamed from: b */
        public final C29007a m88137b() {
            return C29007a.f117373h;
        }

        /* JADX INFO: renamed from: c */
        public final C29007a m88138c() {
            return C29007a.f117374i;
        }

        /* JADX INFO: renamed from: d */
        public final C29007a m88139d() {
            return C29007a.f117371f;
        }

        private Companion() {
        }
    }

    static {
        boolean z4 = false;
        f117371f = new C29007a(0.0f, 0.0f, false, z4, 15, null);
        float f13 = 0.5f;
        boolean z13 = false;
        f117372g = new C29007a(0.5f, f13, z4, z13, 12, null);
        float f14 = 0.0f;
        boolean z14 = false;
        f117373h = new C29007a(f13, f14, z13, z14, 14, null);
        f117374i = new C29007a(f14, 0.5f, z14, false, 13, null);
    }

    public C29007a(float f13, float f14, boolean z4, boolean z13) {
        this.x = f13;
        this.y = f14;
        this.isConfinedHorizontally = z4;
        this.isConfinedVertically = z13;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C29007a m88130f(C29007a c29007a, float f13, float f14, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c29007a.x;
        }
        if ((i13 & 2) != 0) {
            f14 = c29007a.y;
        }
        if ((i13 & 4) != 0) {
            z4 = c29007a.isConfinedHorizontally;
        }
        if ((i13 & 8) != 0) {
            z13 = c29007a.isConfinedVertically;
        }
        return c29007a.m88131e(f13, f14, z4, z13);
    }

    /* JADX INFO: renamed from: e */
    public final C29007a m88131e(float x3, float y13, boolean isConfinedHorizontally, boolean isConfinedVertically) {
        return new C29007a(x3, y13, isConfinedHorizontally, isConfinedVertically);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29007a)) {
            return false;
        }
        C29007a c29007a = (C29007a) other;
        return Float.compare(this.x, c29007a.x) == 0 && Float.compare(this.y, c29007a.y) == 0 && this.isConfinedHorizontally == c29007a.isConfinedHorizontally && this.isConfinedVertically == c29007a.isConfinedVertically;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConfinedVertically) + AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.y, Float.hashCode(this.x) * 31, 31), 31, this.isConfinedHorizontally);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsConfinedHorizontally() {
        return this.isConfinedHorizontally;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsConfinedVertically() {
        return this.isConfinedVertically;
    }

    public String toString() {
        float f13 = this.x;
        float f14 = this.y;
        return AbstractC36095b.m114682j(AbstractC2875y.m8307t("AnchorPoint(x=", f13, ", y=", f14, ", isConfinedHorizontally="), this.isConfinedHorizontally, ", isConfinedVertically=", this.isConfinedVertically, ")");
    }

    public /* synthetic */ C29007a(float f13, float f14, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
    }
}
