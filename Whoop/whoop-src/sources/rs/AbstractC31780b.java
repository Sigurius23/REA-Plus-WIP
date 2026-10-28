package rs;

import a33.C0352d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.C1601k1;
import androidx.media3.common.ParserException;
import b30.C2549j2;
import bc3.C3033m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.tasks.Task;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d13.AbstractC11478a;
import eu.C13610f;
import g40.C15440w2;
import g40.InterfaceC15455z2;
import ge3.AbstractC15751g;
import gf.C15760a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21467g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p029b5.C2725d;
import p091dg.C12002a;
import p179h.AbstractC16349g;
import p179h.C16351i;
import p194hg.C17248i;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p209i3.AbstractC18032n;
import p236j.InterfaceC21072k;
import p250jf.AbstractC21636e;
import p251jg.C21649b;
import p251jg.C21652e;
import p273k6.C22222g;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p335n6.C26385b;
import p335n6.C26396m;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p477s2.AbstractC32076h;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34881i;
import p522uf.C34893t;
import p545v6.C35714c;
import p545v6.C35715d;
import p558vp.AbstractC36259c;
import p562vv.C36526a;
import p562vv.C36527b;
import p599wz.C37722h1;
import p619xl.C38445a;
import p646yd.AbstractC39455f;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32587b2;
import q30.C29938w0;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import re.AbstractC31272g0;
import re.C31260c0;
import re1.C31324k;
import s01.C32049e;
import s83.AbstractC32269c;
import t40.ExecutorC33532b;
import ug.AbstractC34914c;
import ug.C34913b;
import um0.C35076b;
import uo1.C35141b;
import v30.AbstractC35594c;
import v30.AbstractC35597f;
import v30.C35596e;
import v30.C35602k;
import v30.InterfaceC35593b;
import vg.InterfaceC35965l;
import wb3.AbstractC37056f;
import x30.C37932v;
import x30.C37934w;

/* JADX INFO: renamed from: rs.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31780b {
    /* JADX INFO: renamed from: a */
    public static final void m98680a(InterfaceC26398o interfaceC26398o, C35714c c35714c, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(227045628);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
        } else {
            i15 = (c28655q.m87153g(interfaceC26398o) ? 4 : 2) | i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i16 = i15 | 48;
        } else {
            i16 = i15 | (c28655q.m87153g(c35714c) ? 32 : 16);
        }
        if ((i16 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            if (i17 != 0) {
                interfaceC26398o = C26396m.f104850a;
            }
            if (i18 != 0) {
                c35714c = C35714c.f151947c;
            }
            c28655q.m87152f0(1849434622);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C35715d.f151951w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-683746039);
            c28655q.m87152f0(-548224868);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(interfaceC4339a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C32587b2(25), interfaceC26398o);
            AbstractC28683x.m87239G(c28655q, new C32587b2(26), c35714c);
            interfaceC4351m.invoke(c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }
        InterfaceC26398o interfaceC26398o2 = interfaceC26398o;
        C35714c c35714c2 = c35714c;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(interfaceC26398o2, c35714c2, interfaceC4351m, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX INFO: renamed from: b */
    public static final void m98681b(boolean z4, C37934w controller, Set hiddenIdentifiers, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13) {
        int i14;
        C35596e c35596e;
        boolean z13;
        ?? r10;
        Object obj;
        AbstractC22676k.m65750j(controller, "controller");
        C37932v c37932v = controller.f162399b;
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1613716093);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(controller) : c28655q.m87157i(controller) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(hiddenIdentifiers) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            Context context = (Context) c28655q.m87161k(c28674u2);
            c28655q.m87150e0(210988743);
            Context context2 = (Context) c28655q.m87161k(c28674u2);
            c28655q.m87150e0(-1748488497);
            boolean zM87153g = c28655q.m87153g(context2);
            Object objM87133R = c28655q.m87133R();
            Object obj2 = C28635l.f115821a;
            if (zM87153g || objM87133R == obj2) {
                objM87133R = ActivityOptionsCompat.makeCustomAnimation(context2, R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
                c28655q.m87172p0(objM87133R);
            }
            ActivityOptionsCompat activityOptionsCompat = (ActivityOptionsCompat) objM87133R;
            boolean z14 = false;
            c28655q.m87173q(false);
            AbstractC22676k.m65747g(activityOptionsCompat);
            c28655q.m87173q(false);
            InterfaceC21072k interfaceC21072kM46560a = AbstractC16349g.m46560a(c28655q);
            c28655q.m87150e0(785233178);
            if (interfaceC21072kM46560a != null) {
                InterfaceC35593b eventsReporter = (InterfaceC35593b) c28655q.m87161k(AbstractC35594c.f151360a);
                c28655q.m87150e0(785241361);
                boolean z15 = (i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(controller));
                Object objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == obj2) {
                    objM87133R2 = new C35141b(controller, 28);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 onResult = (Function1) objM87133R2;
                c28655q.m87173q(false);
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(eventsReporter, "eventsReporter");
                AbstractC22676k.m65750j(onResult, "onResult");
                c28655q.m87150e0(1742426970);
                C35602k c35602k = (C35602k) c28655q.m87161k(AbstractC35597f.f151370a);
                c28655q.m87150e0(-661922555);
                boolean zM87153g2 = c28655q.m87153g(context) | c28655q.m87153g(activityOptionsCompat) | c28655q.m87153g(eventsReporter) | c28655q.m87153g(c35602k);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == obj2) {
                    objM87133R3 = new C35596e(context, activityOptionsCompat, eventsReporter, c35602k);
                    c28655q.m87172p0(objM87133R3);
                }
                C35596e c35596e2 = (C35596e) objM87133R3;
                c28655q.m87173q(false);
                ActivityResultContracts$StartIntentSenderForResult activityResultContracts$StartIntentSenderForResult = new ActivityResultContracts$StartIntentSenderForResult();
                c28655q.m87150e0(-661908502);
                boolean zM87157i = c28655q.m87157i(c35596e2) | c28655q.m87153g(onResult);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == obj2) {
                    objM87133R4 = new C35076b(5, c35596e2, onResult);
                    c28655q.m87172p0(objM87133R4);
                }
                c28655q.m87173q(false);
                C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$StartIntentSenderForResult, (Function1) objM87133R4, c28655q, 0);
                c28655q.m87150e0(-661903590);
                boolean zM87153g3 = c28655q.m87153g(c16351iM118972a0);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g3 || objM87133R5 == obj2) {
                    c35596e2.getClass();
                    AbstractC22676k.m65750j(c16351iM118972a0, "<set-?>");
                    c35596e2.f151369g = c16351iM118972a0;
                    c28655q.m87172p0(c35596e2);
                    obj = c35596e2;
                } else {
                    obj = objM87133R5;
                }
                c35596e = (C35596e) obj;
                z14 = false;
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                c35596e = null;
            }
            c28655q.m87173q(z14);
            c28655q.m87150e0(785243886);
            C2725d c2725d = controller.f162398a;
            if (c2725d == null) {
                z13 = false;
            } else {
                Boolean bool = (Boolean) ((C1601k1) c2725d.f10735y).m5001b("KEY_HAS_AUTOMATICALLY_LAUNCHED_CARD_SCAN");
                if (!(bool != null ? bool.booleanValue() : c2725d.f10733w) && c2725d.f10734x) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            if (!z13 || c35596e == null) {
                r10 = 0;
            } else {
                c28655q.m87150e0(785247011);
                boolean zM87157i2 = ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(controller))) | c28655q.m87157i(c35596e) | c28655q.m87157i(context);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i2 || objM87133R6 == obj2) {
                    objM87133R6 = new C31324k(controller, c35596e, context, 21);
                    c28655q.m87172p0(objM87133R6);
                }
                r10 = 0;
                c28655q.m87173q(false);
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R6, c28655q);
            }
            c28655q.m87173q(r10);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r10);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9109L;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_add_payment_method_card_information);
            c28655q.m87150e0(-725981864);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == obj2) {
                objM87133R7 = new C37722h1(9);
                c28655q.m87172p0(objM87133R7);
            }
            c28655q.m87173q(false);
            AbstractC5583n.m16769b(strM92103Y, AbstractC18032n.m51775c(c2314t, true, (Function1) objM87133R7), false, c28655q, 0, 4);
            int i15 = i14 & 14;
            AbstractC32076h.m99770c(z4, c35596e, c28655q, i15 | 64);
            c28655q.m87173q(true);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 8, 0.0f, 0.0f, 13);
            IdentifierSpec.Companion.getClass();
            AbstractC22674j.m65730p(z4, new C15440w2(C5705a.m16892a("credit_details"), AbstractC37056f.m118958J(c37932v), new C0352d(AbstractC37056f.m118958J(c37932v.f162396c), (InterfaceC41211c) null)), hiddenIdentifiers, identifierSpec, modifierM3398t, c28655q, i15 | 24640 | (i14 & 896) | (IdentifierSpec.$stable << 9) | (i14 & 7168), 0);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, (InterfaceC15455z2) controller, (Object) hiddenIdentifiers, (Object) identifierSpec, modifier, i13, 20);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C36527b m98682c(Function1 function1) {
        C36526a c36526a = new C36526a();
        c36526a.f156307a = true;
        c36526a.f156308b = 8388691;
        c36526a.f156309c = 4.0f;
        c36526a.f156310d = 4.0f;
        c36526a.f156311e = 4.0f;
        c36526a.f156312f = 4.0f;
        function1.invoke(c36526a);
        boolean z4 = c36526a.f156307a;
        return new C36527b(c36526a.f156309c, c36526a.f156310d, c36526a.f156311e, c36526a.f156312f, c36526a.f156308b, z4);
    }

    /* JADX INFO: renamed from: d */
    public static Object m98683d(Task task, AbstractC32269c abstractC32269c) {
        if (task.isComplete()) {
            return task;
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32269c));
        c3033m.m8774s();
        task.addOnCompleteListener(ExecutorC33532b.f139976w, new C13610f(c3033m, 9));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m98684e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            byte b = (byte) ((bArr[i13] << 1) & 254);
            bArr2[i13] = b;
            if (i13 < 15) {
                bArr2[i13] = (byte) (((byte) ((bArr[i13 + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m98685f(int i13, byte[] bArr) throws IOException {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i13, null);
        if (bitmapDecodeByteArray == null) {
            throw ParserException.m5049a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C22222g c22222g = new C22222g(byteArrayInputStream);
            byteArrayInputStream.close();
            int iM63700l = c22222g.m63700l();
            if (iM63700l == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iM63700l);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m98686g(InterfaceC35965l platformEnvironProvider) {
        AbstractC22676k.m65750j(platformEnvironProvider, "platformEnvironProvider");
        String str = (String) AbstractC21636e.m60881b(AbstractC39455f.f169752n, platformEnvironProvider);
        if (str != null) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder("aws-sdk-kotlin-");
        C33647p c33647p = C34913b.f147015x;
        sb4.append(AbstractC34914c.m110117b(C33647p.m106274t()));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final C31260c0 m98687h(C21649b c21649b) {
        C29938w0 c29938w0 = new C29938w0(5, (byte) 0);
        C17251l c17251l = C17251l.f66278i;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AttributeName")}), 0);
        C17248i c17248i2 = new C17248i(C17251l.f66273d, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("DeliveryMedium")}), 0);
        C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Destination")}), 0);
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        c38445a.m123180p(c17248i3);
        InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(c38445a, c21649b);
        while (true) {
            Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
            int i13 = c17248i.f66267b;
            if (numMo45167q != null && numMo45167q.intValue() == i13) {
                c29938w0.f122260x = interfaceC17242cM30855g.mo45166o();
            } else {
                int i14 = c17248i2.f66267b;
                if (numMo45167q != null && numMo45167q.intValue() == i14) {
                    String strMo45166o = interfaceC17242cM30855g.mo45166o();
                    int i15 = AbstractC31272g0.f128790a;
                    c29938w0.f122261y = AbstractC36259c.m115672K(strMo45166o);
                } else {
                    int i16 = c17248i3.f66267b;
                    if (numMo45167q != null && numMo45167q.intValue() == i16) {
                        c29938w0.f122262z = interfaceC17242cM30855g.mo45166o();
                    } else {
                        if (numMo45167q == null) {
                            return new C31260c0(c29938w0);
                        }
                        interfaceC17242cM30855g.skipValue();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte m98688i(int i13) {
        int iM98694o = m98694o(i13, 26);
        int iM98693n = m98693n(i13, 25) & m98694o(i13, 52);
        return (byte) (m98695p(m98693n(i13, 51) & m98694o(i13, 62), i13 - 4, 0) | m98695p(iM98694o, i13 + 65, 0) | m98695p(iM98693n, i13 + 71, 0) | m98695p(m98692m(i13, 62), 45, 0) | m98695p(m98692m(i13, 63), 95, 0));
    }

    /* JADX INFO: renamed from: j */
    public static final C34893t m98689j(C12002a c12002a) {
        AbstractC22676k.m65750j(c12002a, "<this>");
        C15760a c15760a = AbstractC34881i.f146913a;
        C34893t c34893t = (C34893t) c12002a.mo33082b(AbstractC34881i.f146919g);
        if (c34893t != null) {
            return c34893t;
        }
        C34893t c34893t2 = C34893t.f146944n;
        return C34893t.f146944n;
    }

    /* JADX INFO: renamed from: k */
    public static String m98690k(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i13 = 0;
        for (int i14 = 0; i14 < objArr.length; i14++) {
            Object obj = objArr[i14];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e5);
                    StringBuilder sbM53375p = AbstractC18489d0.m53375p("<", str2, " threw ");
                    sbM53375p.append(e5.getClass().getName());
                    sbM53375p.append(">");
                    string = sbM53375p.toString();
                }
            }
            objArr[i14] = string;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i15 = 0;
        while (i13 < objArr.length && (iIndexOf = str.indexOf("%s", i15)) != -1) {
            sb4.append((CharSequence) str, i15, iIndexOf);
            sb4.append(objArr[i13]);
            i15 = iIndexOf + 2;
            i13++;
        }
        sb4.append((CharSequence) str, i15, str.length());
        if (i13 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb4.append(", ");
                sb4.append(objArr[i16]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static final Object m98691l(Task task) {
        AbstractC22676k.m65750j(task, "<this>");
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            return AbstractC34132o.m107888l(new CancellationException("Task was canceled"));
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception("Unknown error occurred");
        }
        return AbstractC34132o.m107888l(exception);
    }

    /* JADX INFO: renamed from: m */
    public static int m98692m(int i13, int i14) {
        int i15 = i13 ^ i14;
        return ((~i15) & (i15 - 1)) >>> 63;
    }

    /* JADX INFO: renamed from: n */
    public static int m98693n(int i13, int i14) {
        return (int) ((((long) i14) - ((long) i13)) >>> 63);
    }

    /* JADX INFO: renamed from: o */
    public static int m98694o(int i13, int i14) {
        return (int) ((((long) i13) - ((long) i14)) >>> 63);
    }

    /* JADX INFO: renamed from: p */
    public static int m98695p(int i13, int i14, int i15) {
        return ((i13 - 1) & (i15 ^ i14)) ^ i14;
    }
}
