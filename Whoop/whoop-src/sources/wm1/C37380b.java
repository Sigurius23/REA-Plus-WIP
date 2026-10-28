package wm1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11407v;
import p077d0.InterfaceC11337c0;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: wm1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0019BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b'\u0010\u0012¨\u0006-"}, m65681d2 = {"Lwm1/b;", "", "Ly3/f;", "progressDialSize", "backgroundPadding", "", "scoreValueSize", "scoreSuffixSize", "dialTextSpacerPadding", "dialStrokeWidth", "", "shouldHideValue", "shouldHideOptimalRange", "", "analyticSource", "<init>", "(FFFFFFZZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "j", "()F", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "l", "d", "k", "e", "getDialTextSpacerPadding-D9Ej5fM", "f", "i", "g", "Z", "n", "()Z", "m", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37380b {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    private static final float f159883k;

    /* JADX INFO: renamed from: l */
    private static final float f159884l;

    /* JADX INFO: renamed from: m */
    private static final InterfaceC11337c0 f159885m;

    /* JADX INFO: renamed from: n */
    private static final AbstractC3730c1 f159886n;

    /* JADX INFO: renamed from: o */
    private static final AbstractC3736e1 f159887o;

    /* JADX INFO: renamed from: p */
    private static final AbstractC3730c1 f159888p;

    /* JADX INFO: renamed from: q */
    private static final AbstractC3736e1 f159889q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float progressDialSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float backgroundPadding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float scoreValueSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float scoreSuffixSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float dialTextSpacerPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float dialStrokeWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean shouldHideValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean shouldHideOptimalRange;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String analyticSource;

    /* JADX INFO: renamed from: wm1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lwm1/b$a;", "", "<init>", "()V", "Ly3/f;", "initialDialSize", "F", "e", "()F", "finalDialSize", "d", "Lc0/c1;", "fadeInEasing", "Lc0/c1;", "b", "()Lc0/c1;", "Lc0/e1;", "fadeOutEasing", "Lc0/e1;", "c", "()Lc0/e1;", "expandVertically", "a", "shrinkVertically", "f", "", "MAX_SCROLL_FOR_ANIMATION", "I", "SCROLL_THRESHOLD", "ANIMATION_DURATION", "Ld0/c0;", "Ly3/l;", "defaultSizeAnimationSpec", "Ld0/c0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3730c1 m119676a() {
            return C37380b.f159888p;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC3730c1 m119677b() {
            return C37380b.f159886n;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC3736e1 m119678c() {
            return C37380b.f159887o;
        }

        /* JADX INFO: renamed from: d */
        public final float m119679d() {
            return C37380b.f159884l;
        }

        /* JADX INFO: renamed from: e */
        public final float m119680e() {
            return C37380b.f159883k;
        }

        /* JADX INFO: renamed from: f */
        public final AbstractC3736e1 m119681f() {
            return C37380b.f159889q;
        }

        private Companion() {
        }
    }

    static {
        float f13 = 4;
        f159883k = 22 * f13;
        f159884l = 6 * f13;
        C11407v c11407v = AbstractC11333b0.f36310a;
        C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(800, 0, c11407v, 2);
        f159885m = c11347e2M30574v;
        f159886n = AbstractC3788w0.m11577e(AbstractC11348f.m30574v(800, 0, c11407v, 2), 2);
        f159887o = AbstractC3788w0.m11578f(AbstractC11348f.m30574v(800, 0, c11407v, 2), 2);
        f159888p = AbstractC3788w0.m11576d(c11347e2M30574v, null, 14);
        f159889q = AbstractC3788w0.m11584l(c11347e2M30574v, null, null, 14);
    }

    public /* synthetic */ C37380b(float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, boolean z13, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16, f17, f18, z4, z13, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37380b)) {
            return false;
        }
        C37380b c37380b = (C37380b) other;
        return C39174f.m124782b(this.progressDialSize, c37380b.progressDialSize) && C39174f.m124782b(this.backgroundPadding, c37380b.backgroundPadding) && Float.compare(this.scoreValueSize, c37380b.scoreValueSize) == 0 && Float.compare(this.scoreSuffixSize, c37380b.scoreSuffixSize) == 0 && C39174f.m124782b(this.dialTextSpacerPadding, c37380b.dialTextSpacerPadding) && C39174f.m124782b(this.dialStrokeWidth, c37380b.dialStrokeWidth) && this.shouldHideValue == c37380b.shouldHideValue && this.shouldHideOptimalRange == c37380b.shouldHideOptimalRange && AbstractC22676k.m65745e(this.analyticSource, c37380b.analyticSource);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAnalyticSource() {
        return this.analyticSource;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getBackgroundPadding() {
        return this.backgroundPadding;
    }

    public int hashCode() {
        return this.analyticSource.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.dialStrokeWidth, AbstractC11266d.m30447a(this.dialTextSpacerPadding, AbstractC11266d.m30447a(this.scoreSuffixSize, AbstractC11266d.m30447a(this.scoreValueSize, AbstractC11266d.m30447a(this.backgroundPadding, Float.hashCode(this.progressDialSize) * 31, 31), 31), 31), 31), 31), 31, this.shouldHideValue), 31, this.shouldHideOptimalRange);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getDialStrokeWidth() {
        return this.dialStrokeWidth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getProgressDialSize() {
        return this.progressDialSize;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getScoreSuffixSize() {
        return this.scoreSuffixSize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getScoreValueSize() {
        return this.scoreValueSize;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShouldHideOptimalRange() {
        return this.shouldHideOptimalRange;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShouldHideValue() {
        return this.shouldHideValue;
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.progressDialSize);
        String strM124783c2 = C39174f.m124783c(this.backgroundPadding);
        float f13 = this.scoreValueSize;
        float f14 = this.scoreSuffixSize;
        String strM124783c3 = C39174f.m124783c(this.dialTextSpacerPadding);
        String strM124783c4 = C39174f.m124783c(this.dialStrokeWidth);
        boolean z4 = this.shouldHideValue;
        boolean z13 = this.shouldHideOptimalRange;
        String str = this.analyticSource;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DialsAnimationState(progressDialSize=", strM124783c, ", backgroundPadding=", strM124783c2, ", scoreValueSize=");
        AbstractC30802r.m94772u(sbM32001t, f13, ", scoreSuffixSize=", f14, ", dialTextSpacerPadding=");
        AbstractC11266d.m30444B(sbM32001t, strM124783c3, ", dialStrokeWidth=", strM124783c4, ", shouldHideValue=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", shouldHideOptimalRange=", z13, ", analyticSource=");
        return AbstractC25012a.m73376i(str, ")", sbM32001t);
    }

    private C37380b(float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, boolean z13, String analyticSource) {
        AbstractC22676k.m65750j(analyticSource, "analyticSource");
        this.progressDialSize = f13;
        this.backgroundPadding = f14;
        this.scoreValueSize = f15;
        this.scoreSuffixSize = f16;
        this.dialTextSpacerPadding = f17;
        this.dialStrokeWidth = f18;
        this.shouldHideValue = z4;
        this.shouldHideOptimalRange = z13;
        this.analyticSource = analyticSource;
    }
}
