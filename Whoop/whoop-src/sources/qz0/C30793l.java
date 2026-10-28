package qz0;

import androidx.compose.runtime.Composer;
import b30.C2564l1;
import b91.C2886a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p163g1.C15043i8;
import p163g1.InterfaceC14999e8;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p208i2.InterfaceC17869a1;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: qz0.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lqz0/l;", "", "<init>", "()V", "", "isError", "Lg1/e8;", "c", "(ZLandroidx/compose/runtime/Composer;I)Lg1/e8;", "Ly3/f;", "b", "F", "f", "()F", "horizontalContentPadding", "i", "verticalContentPadding", "Ll0/k1;", "d", "Ll0/k1;", "()Ll0/k1;", "contentPadding", "Lb91/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)Lb91/a;", "textStyle", "Li2/a1;", "g", "(Landroidx/compose/runtime/Composer;I)Li2/a1;", "shape", "Lu0/q0;", "e", "(Landroidx/compose/runtime/Composer;I)Lu0/q0;", "DefaultKeyboardActions", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30793l {

    /* JADX INFO: renamed from: a */
    public static final C30793l f126917a = new C30793l();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float horizontalContentPadding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float verticalContentPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final InterfaceC22973k1 contentPadding;

    /* JADX INFO: renamed from: e */
    public static final int f126921e = 0;

    static {
        float f13 = 8;
        float f14 = 2 * f13;
        horizontalContentPadding = f14;
        float f15 = ((float) 1.75d) * f13;
        verticalContentPadding = f15;
        contentPadding = new C22976l1(f14, f15, f14, f15);
    }

    private C30793l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m94692b(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC14999e8 m94693c(boolean z4, Composer composer, int i13) {
        long black30;
        C15043i8 c15043i8 = C15043i8.f56313a;
        C38072d c38072d = C38072d.f163053a;
        long brandWhite = c38072d.m121949b(composer, 6).getBrandWhite();
        C28655q c28655q = (C28655q) composer;
        if (z4) {
            c28655q.m87150e0(-1697498533);
            black30 = c38072d.m121949b(c28655q, 6).getAccentAlertTrend15();
        } else {
            c28655q.m87150e0(-1697497200);
            black30 = c38072d.m121949b(c28655q, 6).getBlack30();
        }
        c28655q.m87173q(false);
        return C15043i8.m43130h(brandWhite, 0L, black30, c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getWhite50(), c38072d.m121949b(composer, 6).getWhite10(), 0L, c38072d.m121949b(composer, 6).getAccentAlert(), 0L, 0L, 0L, 0L, composer, 2096770);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC22973k1 m94694d() {
        return contentPadding;
    }

    /* JADX INFO: renamed from: e */
    public final C34348q0 m94695e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
        boolean zM87157i = c28655q.m87157i(interfaceC15237i);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C2564l1(interfaceC15237i, 17);
            c28655q.m87172p0(objM87133R);
        }
        return new C34348q0((Function1) objM87133R, null, null, null, 62);
    }

    /* JADX INFO: renamed from: f */
    public final float m94696f() {
        return horizontalContentPadding;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC17869a1 m94697g(Composer composer, int i13) {
        C15043i8 c15043i8 = C15043i8.f56313a;
        return C15043i8.m43126d(composer);
    }

    /* JADX INFO: renamed from: h */
    public final C2886a m94698h(Composer composer, int i13) {
        return C38072d.f163053a.m121952e(composer, 6).getB1();
    }

    /* JADX INFO: renamed from: i */
    public final float m94699i() {
        return verticalContentPadding;
    }
}
