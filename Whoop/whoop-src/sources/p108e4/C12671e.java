package p108e4;

import com.google.crypto.tink.internal.C5101l0;
import j93.InterfaceC21493z;
import p088dc.AbstractC11895b;
import p210i4.C18065g;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: renamed from: e4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12671e {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC21493z[] f43323i;

    /* JADX INFO: renamed from: a */
    public final Object f43324a;

    /* JADX INFO: renamed from: b */
    public final C18065g f43325b;

    /* JADX INFO: renamed from: d */
    public final C37199o f43327d;

    /* JADX INFO: renamed from: e */
    public final C5101l0 f43328e;

    /* JADX INFO: renamed from: f */
    public final C37199o f43329f;

    /* JADX INFO: renamed from: g */
    public final C5101l0 f43330g;

    /* JADX INFO: renamed from: c */
    public final C12672f f43326c = new C12672f("parent");

    /* JADX INFO: renamed from: h */
    public final C12669c f43331h = new C12669c(this, new C12680n("wrap"));

    static {
        C22686q c22686q = new C22686q(C12671e.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f43323i = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C12671e.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "scaleX", "getScaleX()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "scaleY", "getScaleY()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "rotationX", "getRotationX()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "rotationY", "getRotationY()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "rotationZ", "getRotationZ()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "translationX", "getTranslationX-D9Ej5fM()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "translationY", "getTranslationY-D9Ej5fM()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "pivotX", "getPivotX()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "pivotY", "getPivotY()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0, c22673i0), AbstractC11895b.m31990i(C12671e.class, "verticalChainWeight", "getVerticalChainWeight()F", 0, c22673i0)};
    }

    public C12671e(Object obj, C18065g c18065g) {
        this.f43324a = obj;
        this.f43325b = c18065g;
        this.f43327d = new C37199o(-2, c18065g);
        this.f43328e = new C5101l0(0, c18065g);
        this.f43329f = new C37199o(-1, c18065g);
        this.f43330g = new C5101l0(1, c18065g);
        new C12670d(this, 1.0f, null);
        new C12670d(this, 1.0f, null);
        new C12670d(this, 0.0f, null);
        new C12670d(this, 0.0f, null);
        new C12670d(this, 0.0f, null);
        float f13 = 0;
        new C12669c(this, f13);
        new C12669c(this, f13);
        new C12669c(this, f13);
        new C12670d(this, 0.5f, null);
        new C12670d(this, 0.5f, null);
        new C12670d(this, Float.NaN, "hWeight");
        new C12670d(this, Float.NaN, "vWeight");
    }

    /* JADX INFO: renamed from: a */
    public final void m35473a(C12680n c12680n) {
        this.f43331h.setValue(this, f43323i[0], c12680n);
    }
}
