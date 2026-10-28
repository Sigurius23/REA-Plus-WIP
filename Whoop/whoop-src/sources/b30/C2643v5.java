package b30;

import android.content.Intent;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.p055ui.SepaMandateActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import j93.InterfaceC21467g;
import l83.C23454a0;
import p097ds.AbstractC12313p;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: b30.v5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2643v5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10312w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SepaMandateActivity f10313x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f10314y;

    public /* synthetic */ C2643v5(SepaMandateActivity sepaMandateActivity, String str, int i13) {
        this.f10312w = i13;
        this.f10313x = sepaMandateActivity;
        this.f10314y = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        final SepaMandateActivity sepaMandateActivity;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87153g2;
        Object objM87133R2;
        C28655q c28655q2;
        SepaMandateActivity sepaMandateActivity2;
        boolean zM87153g3;
        Object objM87133R3;
        switch (this.f10312w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-3848641);
                        sepaMandateActivity = this.f10313x;
                        zM87153g = c28655q.m87153g(sepaMandateActivity);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            final int i13 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: b30.u5
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                            AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                            SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                            sepaMandateActivity3.setResult(-1, intentPutExtra);
                                            sepaMandateActivity3.finish();
                                            break;
                                        default:
                                            sepaMandateActivity.finish();
                                            break;
                                    }
                                    return C23454a0.f92919a;
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        c28655q.m87173q(false);
                        c28655q.m87150e0(-3836662);
                        zM87153g2 = c28655q.m87153g(sepaMandateActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R2 == c28676v0) {
                            final int i14 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: b30.u5
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                            AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                            SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                            sepaMandateActivity3.setResult(-1, intentPutExtra);
                                            sepaMandateActivity3.finish();
                                            break;
                                        default:
                                            sepaMandateActivity.finish();
                                            break;
                                    }
                                    return C23454a0.f92919a;
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC32417h.m101208q(this.f10314y, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    }
                } else {
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-3848641);
                    sepaMandateActivity = this.f10313x;
                    zM87153g = c28655q.m87153g(sepaMandateActivity);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87153g) {
                        final int i15 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: b30.u5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                        SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                        sepaMandateActivity3.setResult(-1, intentPutExtra);
                                        sepaMandateActivity3.finish();
                                        break;
                                    default:
                                        sepaMandateActivity.finish();
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i16 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: b30.u5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                        SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                        sepaMandateActivity3.setResult(-1, intentPutExtra);
                                        sepaMandateActivity3.finish();
                                        break;
                                    default:
                                        sepaMandateActivity.finish();
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-3836662);
                    zM87153g2 = c28655q.m87153g(sepaMandateActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        final int i17 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: b30.u5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                        SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                        sepaMandateActivity3.setResult(-1, intentPutExtra);
                                        sepaMandateActivity3.finish();
                                        break;
                                    default:
                                        sepaMandateActivity.finish();
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i18 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: b30.u5
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", C2664y5.f10428w);
                                        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                                        SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity;
                                        sepaMandateActivity3.setResult(-1, intentPutExtra);
                                        sepaMandateActivity3.finish();
                                        break;
                                    default:
                                        sepaMandateActivity.finish();
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC32417h.m101208q(this.f10314y, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, 0);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        C16845k c16845kM113944O = AbstractC35902e.m113944O(null, composer2, 3);
                        c28655q2 = (C28655q) composer2;
                        c28655q2.m87150e0(-934017577);
                        sepaMandateActivity2 = this.f10313x;
                        zM87153g3 = c28655q2.m87153g(sepaMandateActivity2);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87153g3 || objM87133R3 == C28635l.f115821a) {
                            C2539i0 c2539i0 = new C2539i0(0, sepaMandateActivity2, SepaMandateActivity.class, "finish", "finish()V", 0, 3);
                            c28655q2.m87172p0(c2539i0);
                            objM87133R3 = c2539i0;
                        }
                        c28655q2.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(740170406, c28655q2, new C2643v5(this.f10314y, sepaMandateActivity2)), c28655q2, 24584, 6);
                    }
                } else {
                    C16845k c16845kM113944O2 = AbstractC35902e.m113944O(null, composer2, 3);
                    c28655q2 = (C28655q) composer2;
                    c28655q2.m87150e0(-934017577);
                    sepaMandateActivity2 = this.f10313x;
                    zM87153g3 = c28655q2.m87153g(sepaMandateActivity2);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g3) {
                        C2539i0 c2539i1 = new C2539i0(0, sepaMandateActivity2, SepaMandateActivity.class, "finish", "finish()V", 0, 3);
                        c28655q2.m87172p0(c2539i1);
                        objM87133R3 = c2539i1;
                    } else {
                        C2539i0 c2539i2 = new C2539i0(0, sepaMandateActivity2, SepaMandateActivity.class, "finish", "finish()V", 0, 3);
                        c28655q2.m87172p0(c2539i2);
                        objM87133R3 = c2539i2;
                    }
                    c28655q2.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O2, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(740170406, c28655q2, new C2643v5(this.f10314y, sepaMandateActivity2)), c28655q2, 24584, 6);
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(324657918, composer3, new C2643v5(this.f10313x, this.f10314y, 1)), composer3, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(324657918, composer3, new C2643v5(this.f10313x, this.f10314y, 1)), composer3, 12582912, 127);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C2643v5(String str, SepaMandateActivity sepaMandateActivity) {
        this.f10312w = 0;
        this.f10314y = str;
        this.f10313x = sepaMandateActivity;
    }
}
