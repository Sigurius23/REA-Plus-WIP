package g00;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import f01.C13857f;
import fw0.C14833a;
import i00.AbstractC17837a;
import l83.C23468n;
import m40.C25046w;
import p027b3.AbstractC2399k2;
import p088dc.AbstractC11894a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p599wz.C37700a0;
import p599wz.C37703b0;
import p599wz.C37709d0;
import p599wz.EnumC37706c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: g00.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14936g {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f55704a = new C28674u2(new C14833a(5));

    /* JADX INFO: renamed from: b */
    public static final C28674u2 f55705b = new C28674u2(new C14833a(6));

    /* JADX INFO: renamed from: c */
    public static final C28674u2 f55706c = new C28674u2(new C14833a(7));

    /* JADX INFO: renamed from: d */
    public static final C28674u2 f55707d = new C28674u2(new C14833a(8));

    /* JADX INFO: renamed from: e */
    public static final float f55708e = 48;

    /* JADX INFO: renamed from: f */
    public static final float f55709f = 70;

    /* JADX INFO: renamed from: g */
    public static final float f55710g = 20;

    /* JADX INFO: renamed from: a */
    public static final void m43027a(C37709d0 c37709d0, C37816b c37816b, Composer composer, int i13) {
        C37709d0 c37709d1;
        Object objM107888l;
        boolean zM31939G;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1387905260);
        if (((i13 | 2) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            c37709d1 = c37709d0;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                c37709d1 = (C37709d0) c28655q.m87161k(f55704a);
            } else {
                c28655q.m87138X();
                c37709d1 = c37709d0;
            }
            c28655q.m87175r();
            c28655q.m87150e0(962647593);
            c28655q.m87150e0(962645794);
            try {
                objM107888l = (C25046w) c28655q.m87161k(AbstractC17837a.f69350a);
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            c28655q.m87173q(false);
            if (C23468n.m68037a(objM107888l) != null) {
                objM107888l = new C25046w((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), 30);
            }
            C25046w c25046w = (C25046w) objM107888l;
            c28655q.m87173q(false);
            c28655q.m87150e0(617879692);
            EnumC37706c0 enumC37706c0 = c37709d1 != null ? c37709d1.f161575y : null;
            if (enumC37706c0 == EnumC37706c0.f161567x) {
                zM31939G = false;
            } else if (enumC37706c0 == EnumC37706c0.f161568y) {
                zM31939G = true;
            } else {
                if (enumC37706c0 != EnumC37706c0.f161566w && enumC37706c0 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                zM31939G = AbstractC11894a.m31939G(c28655q);
            }
            c28655q.m87173q(false);
            C14931b c14931b = AbstractC14933d.f55692a;
            C14931b c14931b2 = zM31939G ? AbstractC14933d.f55693b : AbstractC14933d.f55692a;
            if (c37709d1 != null) {
                C37700a0 c37700a0 = zM31939G ? c37709d1.f161574x : c37709d1.f161573w;
                long j7 = c37700a0.f161555w;
                c14931b2 = new C14931b(c14931b2.f55662a, c14931b2.f55663b, c14931b2.f55664c, c14931b2.f55665d, c14931b2.f55666e, c14931b2.f55667f, c37700a0.f161557y, c14931b2.f55669h, c14931b2.f55670i, c14931b2.f55671j, j7, c14931b2.f55673l, c14931b2.f55674m, c14931b2.f55675n, c14931b2.f55676o, c14931b2.f55677p, j7, c14931b2.f55679r, c14931b2.f55680s, c37700a0.f161556x, c14931b2.f55682u, c14931b2.f55683v, c14931b2.f55684w, c14931b2.f55685x, c14931b2.f55686y, c14931b2.f55687z, c14931b2.f55661A);
            }
            C33252i c33252iM105489e = AbstractC33253j.m105489e(4);
            float f13 = 12;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f13);
            C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f13);
            float fFloatValue = 56;
            C14932c c14932c = new C14932c(c33252iM105489e, c33252iM105489e2, c33252iM105489e3, fFloatValue);
            if (c37709d1 != null) {
                C37703b0 c37703b0 = c37709d1.f161576z;
                Float f14 = c37703b0.f161560w;
                if (f14 != null) {
                    c33252iM105489e3 = AbstractC33253j.m105489e(f14.floatValue());
                }
                Float f15 = c37703b0.f161561x;
                if (f15 != null) {
                    fFloatValue = f15.floatValue();
                }
                c14932c = new C14932c(c33252iM105489e, c33252iM105489e2, c33252iM105489e3, fFloatValue);
            }
            C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            Context context = (Context) c28655q.m87161k(c28674u2);
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            c28655q.m87150e0(962689201);
            boolean z4 = zM31939G;
            boolean zM87153g = c28655q.m87153g(context) | c28655q.m87155h(z4) | c28655q.m87155h(zBooleanValue);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                int i14 = z4 ? 32 : 16;
                if (i14 != (context.getResources().getConfiguration().uiMode & 48)) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.uiMode = i14;
                    C14935f c14935f = new C14935f(context, zBooleanValue, configuration, context.getTheme());
                    c14935f.m91071a(configuration);
                    context = c14935f;
                }
                c28655q.m87172p0(context);
                objM87133R = context;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87248b(new C28673u1[]{c28674u2.mo86977a((Context) objM87133R), f55706c.mo86977a(c14931b2), f55705b.mo86977a(AbstractC14937h.f55711a), f55707d.mo86977a(c14932c), AbstractC17837a.f69350a.mo86977a(c25046w)}, AbstractC37817c.m121344e(1499075628, c28655q, new C2567l4(c37816b, 5)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(c37709d1, c37816b, i13, 10);
        }
    }
}
