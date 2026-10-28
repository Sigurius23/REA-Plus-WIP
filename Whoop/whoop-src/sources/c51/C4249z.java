package c51;

import d51.C11714b;
import d51.C11716d;
import p077d0.AbstractC11329a0;
import p077d0.C11407v;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c51.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000e"}, m65681d2 = {"Lc51/z;", "", "<init>", "()V", "Ld51/d;", "b", "Ld51/d;", "c", "()Ld51/d;", "yearsDifferenceTextSizeMultiplierRange", "a", "nonYearsDifferenceTextAlphaRange", "d", "yearsDifferenceTextHeightRange", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C4249z {

    /* JADX INFO: renamed from: a */
    public static final C4249z f17271a = new C4249z();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C11716d yearsDifferenceTextSizeMultiplierRange = new C11716d(AbstractC37056f.m118959K(new C11714b(0.0f, 1.0f, null, 4, null), new C11714b(0.1f, 1.54f, null, 4, null), new C11714b(0.61f, 1.18f, AbstractC11329a0.f36294c), new C11714b(0.66f, 1.54f, AbstractC11329a0.f36296e), new C11714b(1.0f, 1.0f, null, 4, null)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C11716d nonYearsDifferenceTextAlphaRange = new C11716d(AbstractC37056f.m118959K(new C11714b(0.0f, 1.0f, null, 4, null), new C11714b(0.05f, 0.1f, null, 4, null), new C11714b(0.95f, 0.1f, null, 4, null), new C11714b(1.0f, 1.0f, null, 4, null)));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C11716d yearsDifferenceTextHeightRange;

    static {
        C11714b c11714b = new C11714b(0.0f, 0.0f, null, 4, null);
        C11407v c11407v = AbstractC11329a0.f36293b;
        yearsDifferenceTextHeightRange = new C11716d(AbstractC37056f.m118959K(c11714b, new C11714b(0.1f, 80.0f, c11407v), new C11714b(0.71000004f, 80.0f, null, 4, null), new C11714b(1.0f, 0.0f, c11407v)));
    }

    private C4249z() {
    }

    /* JADX INFO: renamed from: a */
    public final C11716d m13279a() {
        return nonYearsDifferenceTextAlphaRange;
    }

    /* JADX INFO: renamed from: b */
    public final C11716d m13280b() {
        return yearsDifferenceTextHeightRange;
    }

    /* JADX INFO: renamed from: c */
    public final C11716d m13281c() {
        return yearsDifferenceTextSizeMultiplierRange;
    }
}
