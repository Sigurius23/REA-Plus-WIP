package p510u0;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1113a;
import androidx.compose.foundation.text.handwriting.AbstractC1114a;
import androidx.compose.foundation.text.input.internal.AbstractC1115a;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1774d;
import b30.C2591o4;
import b30.C2626t2;
import b30.C2640v2;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cz.C11194d;
import d30.C11518b0;
import d30.C11528e1;
import e93.AbstractC12889b;
import ev2.C13710s;
import f01.C13857f;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.C19072b;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jp1.C21859k;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import mt2.C25942c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C31931s;
import p003a1.C0107f;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2147u;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p027b3.InterfaceC2433r1;
import p027b3.InterfaceC2464x2;
import p078d1.AbstractC11461n;
import p078d1.C11449b;
import p078d1.C11460m;
import p094dn.C12185e;
import p132f0.AbstractC13838y0;
import p133f1.AbstractC13923a2;
import p133f1.AbstractC13969q;
import p133f1.AbstractC13994y0;
import p133f1.C13928c0;
import p133f1.C13944h1;
import p133f1.C13947i1;
import p133f1.C13950j1;
import p133f1.C13952k0;
import p133f1.C13956l1;
import p133f1.C13962n1;
import p133f1.C13968p1;
import p133f1.C13977s1;
import p133f1.C13979t0;
import p133f1.C13988w0;
import p133f1.C13995y1;
import p133f1.EnumC13975s;
import p133f1.InterfaceC13957m;
import p163g1.C14984d4;
import p164g2.C15247s;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p180h0.EnumC16377d2;
import p181h2.C16618c;
import p185h6.C16955j;
import p185h6.C16962q;
import p185h6.C16970y;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.C17924z0;
import p209i3.AbstractC18032n;
import p209i3.C18043y;
import p238j0.InterfaceC21083i;
import p268k0.AbstractC22086a;
import p291l0.AbstractC22989q;
import p294l3.AbstractC23278s;
import p294l3.C23242a;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p294l3.C23285v0;
import p294l3.C23286w;
import p294l3.C23290y;
import p318m3.C24983m;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.InterfaceC28770h;
import p40.C28827b;
import p411q2.InterfaceC29805a;
import p412q3.C29867d0;
import p412q3.C29869e0;
import p412q3.C29875i;
import p412q3.C29878l;
import p412q3.C29885s;
import p412q3.C29891y;
import p412q3.C29892z;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;
import p412q3.InterfaceC29886t;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32073e;
import p478s3.C32096b;
import p512u2.AbstractC34452c0;
import p512u2.AbstractC34454d0;
import p512u2.AbstractC34471q;
import p512u2.C34447a;
import p512u2.InterfaceC34469o;
import p512u2.InterfaceC34476v;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.EnumC36774j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.AbstractC39101i1;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p733ry2.C31915d;
import p736sz0.C33209p1;
import pp2.C29451o;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s90.C32290f;
import sc0.C32355c;
import so2.C32848f;
import te0.AbstractC33745d;
import tp0.C34059d;
import tx0.C34238a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u0.n0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34339n0 {

    /* JADX INFO: renamed from: a */
    public static final C34370y0 f144245a = new C34370y0(2);

    /* JADX INFO: renamed from: b */
    public static final C34447a f144246b = new C34447a(1022);

    /* JADX INFO: renamed from: a */
    public static final void m108623a(C23254g c23254g, Modifier modifier, C23285v0 c23285v0, boolean z4, int i13, int i14, Function1 function1, Function1 function2, Composer composer, int i15) {
        int i16;
        C28655q c28655q;
        boolean z13;
        int i17;
        int i18;
        Function1 function3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-246609449);
        if ((i15 & 6) == 0) {
            i16 = (c28655q2.m87153g(c23254g) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q2.m87153g(c23285v0) ? 256 : 128;
        }
        int i19 = i16 | 1797120;
        if ((12582912 & i15) == 0) {
            i19 |= c28655q2.m87157i(function2) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i19 & 1, (4793491 & i19) != 4793490)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C34350r(0);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function4 = (Function1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            boolean z14 = (29360128 & i19) == 8388608;
            Object objM87133R3 = c28655q2.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13952k0(3, interfaceC28601c1, function2);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierMo3471e = modifier.mo3471e(AbstractC34452c0.m108903b(C2314t.f9131w, function2, (PointerInputEventHandler) objM87133R3));
            boolean z15 = (i19 & 3670016) == 1048576;
            Object objM87133R4 = c28655q2.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                objM87133R4 = new C28827b(interfaceC28601c1, function4, 7);
                c28655q2.m87172p0(objM87133R4);
            }
            c28655q = c28655q2;
            AbstractC30060g.m92105a(c23254g, modifierMo3471e, c23285v0, (Function1) objM87133R4, 1, true, Integer.MAX_VALUE, 0, null, null, null, c28655q, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 1920);
            function3 = function4;
            i17 = 1;
            z13 = true;
            i18 = Integer.MAX_VALUE;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z13 = z4;
            i17 = i13;
            i18 = i14;
            function3 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34059d(c23254g, modifier, c23285v0, z13, i17, i18, function3, function2, i15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m108624b(C13988w0 c13988w0, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-954926513);
        int i14 = (c28655q.m87157i(c13988w0) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87150e0(1647828491);
            InterfaceC30057d interfaceC30057d = null;
            AbstractC32069a.m99666d(AbstractC1113a.m3452c(AbstractC1113a.m3451b(new C13979t0(c13988w0, interfaceC30057d, 0)), c13988w0.f49906g, new C13979t0(c13988w0, interfaceC30057d, 1), null, new C13928c0(c13988w0, 3)), c37816b, c28655q, 48);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29451o(c13988w0, c37816b, i13, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m108625c(C13977s1 c13977s1, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifierM3452c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2080741862);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c13977s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87150e0(-1881943916);
            if (c13977s1.m39780j()) {
                InterfaceC30057d interfaceC30057d = null;
                int i15 = 0;
                modifierM3452c = AbstractC1113a.m3452c(AbstractC1113a.m3451b(new C13947i1(c13977s1, interfaceC30057d, 0)), c13977s1.f49869y, new C13947i1(c13977s1, interfaceC30057d, 1), new C13950j1(c13977s1, interfaceC30057d, i15), new C13944h1(c13977s1, i15));
            } else {
                modifierM3452c = C2314t.f9131w;
            }
            AbstractC32069a.m99666d(modifierM3452c, c37816b, c28655q, i14 & 112);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c13977s1, c37816b, i13, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0497  */
    /* JADX WARN: Code duplicated, block: B:278:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:283:0x060c  */
    /* JADX WARN: Code duplicated, block: B:290:0x063c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0642 A[PHI: r29
      0x0642: PHI (r29v4 u0.s0) = (r29v2 u0.s0), (r29v6 u0.s0) binds: [B:291:0x0640, B:289:0x0639] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:293:0x0644  */
    /* JADX WARN: Code duplicated, block: B:296:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x065d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0689 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x068b  */
    /* JADX WARN: Code duplicated, block: B:306:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:307:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:310:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:311:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:314:0x06cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:320:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:321:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:324:0x0731  */
    /* JADX WARN: Code duplicated, block: B:325:0x0733  */
    /* JADX WARN: Code duplicated, block: B:328:0x0740 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x0742  */
    /* JADX WARN: Code duplicated, block: B:332:0x075a  */
    /* JADX WARN: Code duplicated, block: B:333:0x075c  */
    /* JADX WARN: Code duplicated, block: B:336:0x076d  */
    /* JADX WARN: Code duplicated, block: B:337:0x076f  */
    /* JADX WARN: Code duplicated, block: B:340:0x077c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:343:0x0785  */
    /* JADX WARN: Code duplicated, block: B:346:0x07c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:355:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:357:0x0800  */
    /* JADX WARN: Code duplicated, block: B:358:0x0814  */
    /* JADX WARN: Code duplicated, block: B:361:0x0820 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x0822  */
    /* JADX WARN: Code duplicated, block: B:365:0x083c  */
    /* JADX WARN: Code duplicated, block: B:366:0x083e  */
    /* JADX WARN: Code duplicated, block: B:369:0x0846  */
    /* JADX WARN: Code duplicated, block: B:371:0x084c  */
    /* JADX WARN: Code duplicated, block: B:377:0x085a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:380:0x085f  */
    /* JADX WARN: Code duplicated, block: B:383:0x087c  */
    /* JADX WARN: Code duplicated, block: B:385:0x087f  */
    /* JADX WARN: Code duplicated, block: B:389:0x089f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:390:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:394:0x08c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:398:0x08eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:399:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:402:0x095f  */
    /* JADX WARN: Code duplicated, block: B:409:0x0986  */
    /* JADX WARN: Code duplicated, block: B:411:0x0989  */
    /* JADX WARN: Code duplicated, block: B:413:0x0997  */
    /* JADX INFO: renamed from: d */
    public static final void m108626d(final C29891y c29891y, final Function1 function1, final Modifier modifier, final C23285v0 c23285v0, final InterfaceC29873g0 interfaceC29873g0, final Function1 function2, final InterfaceC21083i interfaceC21083i, final AbstractC17911t abstractC17911t, final boolean z4, final int i13, final int i14, final C29878l c29878l, final C34348q0 c34348q0, final boolean z13, final boolean z14, final Function3 function3, Composer composer, final int i15, final int i16) {
        int i17;
        int i18;
        C28655q c28655q;
        InterfaceC39171c interfaceC39171c;
        C28676v0 c28676v0;
        C23285v0 c23285v1;
        Object c34354s0;
        C23254g c23254g;
        C28655q c28655q2;
        InterfaceC28770h interfaceC28770h;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        C29891y c29891yM91511b;
        C29878l c29878l2;
        boolean z19;
        boolean zM87157i;
        Object obj;
        C15247s c15247s;
        final C34354s0 c34354s1;
        InterfaceC29884r interfaceC29884r;
        C29891y c29891y2;
        boolean z24;
        C29892z c29892z;
        C29878l c29878l3;
        C2314t c2314t;
        boolean z25;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        C34354s0 c34354s2;
        boolean z26;
        boolean z27;
        Object c11194d;
        C2314t c2314t2;
        C13977s1 c13977s1;
        C34354s0 c34354s3;
        InterfaceC21083i interfaceC21083i2;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i2;
        Object objM87133R;
        Modifier modifierM108903b;
        boolean z28;
        boolean z29;
        boolean zM87157i3;
        Object c13710s;
        InterfaceC29884r interfaceC29884r2;
        Modifier modifier2;
        Function1 function4;
        int i19;
        Modifier modifierM118997u;
        boolean z34;
        boolean zM87157i4;
        Object objM87133R2;
        boolean z35;
        boolean z36;
        boolean zM87157i5;
        Object objM87133R3;
        InterfaceC2410m3 interfaceC2410m3;
        InterfaceC29884r interfaceC29884r3;
        C29892z c29892z2;
        C13977s1 c13977s2;
        C34354s0 c34354s4;
        boolean z37;
        Modifier modifierM118997u2;
        boolean zM87157i6;
        Object objM87133R4;
        boolean z38;
        boolean z39;
        Object objM87133R5;
        C29878l c29878l4;
        boolean z44;
        int i24;
        boolean z45;
        boolean zM87155h;
        Object objM87133R6;
        int i25;
        long j7;
        boolean zM87157i7;
        Object objM87133R7;
        boolean z46;
        Modifier modifierM118997u3;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(31062401);
        if ((i15 & 6) == 0) {
            i17 = i15 | (c28655q3.m87153g(c29891y) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q3.m87153g(modifier) ? 256 : 128;
        }
        int i26 = i15 & 3072;
        int i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 == 0) {
            i17 |= c28655q3.m87153g(c23285v0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i28 = i15 & 24576;
        int i29 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i28 == 0) {
            i17 |= c28655q3.m87153g(interfaceC29873g0) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        int i34 = i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i34 == 0) {
            i17 |= c28655q3.m87157i(function2) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= c28655q3.m87153g(interfaceC21083i) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= c28655q3.m87153g(abstractC17911t) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= c28655q3.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= c28655q3.m87149e(i13) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (c28655q3.m87149e(i14) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q3.m87153g(c29878l) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q3.m87153g(c34348q0) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            if (c28655q3.m87155h(z13)) {
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i18 |= i27;
        }
        if ((i16 & 24576) == 0) {
            if (c28655q3.m87155h(z14)) {
                i29 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i18 |= i29;
        }
        if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (!c28655q3.m87157i(function3)) {
                i35 = 65536;
            }
            i18 |= i35;
        }
        int i36 = i18 | 1572864;
        if (c28655q3.m87135U(i17 & 1, ((i17 & 306783379) == 306783378 && (i36 & 599187) == 599186) ? false : true)) {
            c28655q3.m87140Z();
            if ((i15 & 1) != 0 && !c28655q3.m87118C()) {
                c28655q3.m87138X();
            }
            c28655q3.m87175r();
            Object objM87133R8 = c28655q3.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R8 == c28676v1) {
                objM87133R8 = AbstractC33745d.m106649h(c28655q3);
            }
            C15247s c15247s2 = (C15247s) objM87133R8;
            Object objM87133R9 = c28655q3.m87133R();
            if (objM87133R9 == c28676v1) {
                C11460m c11460m = AbstractC11461n.f36777a;
                objM87133R9 = new C11449b();
                c28655q3.m87172p0(objM87133R9);
            }
            C11449b c11449b = (C11449b) objM87133R9;
            Object objM87133R10 = c28655q3.m87133R();
            if (objM87133R10 == c28676v1) {
                objM87133R10 = new C29892z(c11449b);
                c28655q3.m87172p0(objM87133R10);
            }
            final C29892z c29892z3 = (C29892z) objM87133R10;
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
            InterfaceC28770h interfaceC28770h2 = (InterfaceC28770h) c28655q3.m87161k(AbstractC2453v1.f9572k);
            long j13 = ((C13995y1) c28655q3.m87161k(AbstractC13923a2.f49638a)).f49942b;
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
            InterfaceC2410m3 interfaceC2410m4 = (InterfaceC2410m3) c28655q3.m87161k(AbstractC2453v1.f9581t);
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q3.m87161k(AbstractC2453v1.f9577p);
            EnumC16377d2 enumC16377d2 = (i13 == 1 && !z4 && c29878l.f122099a) ? EnumC16377d2.f62972x : EnumC16377d2.f62971w;
            c28655q3.m87150e0(-213743954);
            Object[] objArr = {enumC16377d2};
            C28539n0 c28539n0 = C34340n1.f144247g;
            boolean zM87149e = c28655q3.m87149e(enumC16377d2.ordinal());
            Object objM87133R11 = c28655q3.m87133R();
            if (zM87149e || objM87133R11 == c28676v1) {
                objM87133R11 = new C32355c(enumC16377d2, 11);
                c28655q3.m87172p0(objM87133R11);
            }
            C34340n1 c34340n1 = (C34340n1) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R11, c28655q3, 0);
            c28655q3.m87173q(false);
            if (((EnumC16377d2) c34340n1.f144253f.getValue()) != enumC16377d2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(enumC16377d2 == EnumC16377d2.f62971w ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i37 = i17 & 14;
            boolean z47 = ((i17 & 57344) == 16384) | (i37 == 4);
            Object objM87133R12 = c28655q3.m87133R();
            if (z47 || objM87133R12 == c28676v1) {
                C29869e0 c29869e0M108667a = AbstractC34361u1.m108667a(interfaceC29873g0, c29891y.f122125a);
                C23283u0 c23283u0 = c29891y.f122127c;
                if (c23283u0 != null) {
                    long j14 = c23283u0.f92253a;
                    InterfaceC29884r interfaceC29884r4 = c29869e0M108667a.f122089b;
                    int i38 = C23283u0.f92252c;
                    int iMo15749x = interfaceC29884r4.mo15749x((int) (j14 >> 32));
                    int iMo15749x2 = interfaceC29884r4.mo15749x((int) (j14 & 4294967295L));
                    int iMin = Math.min(iMo15749x, iMo15749x2);
                    int iMax = Math.max(iMo15749x, iMo15749x2);
                    C23248d c23248d = new C23248d(c29869e0M108667a.f122088a);
                    c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439), iMin, iMax);
                    objM87133R12 = new C29869e0(c23248d.m67309k(), interfaceC29884r4);
                } else {
                    objM87133R12 = c29869e0M108667a;
                }
                c28655q3.m87172p0(objM87133R12);
            } else {
                c34340n1 = c34340n1;
            }
            C29869e0 c29869e0 = (C29869e0) objM87133R12;
            C23254g c23254g2 = c29869e0.f122088a;
            final InterfaceC29884r interfaceC29884r5 = c29869e0.f122089b;
            C28677v1 c28677v1M87117B = c28655q3.m87117B();
            if (c28677v1M87117B == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c28677v1M87117B.f115980b |= 1;
            boolean zM87153g = c28655q3.m87153g(interfaceC2464x2);
            Object objM87133R13 = c28655q3.m87133R();
            if (zM87153g || objM87133R13 == c28676v1) {
                interfaceC39171c = interfaceC39171c2;
                c28676v0 = c28676v1;
                c23285v1 = c23285v0;
                c23254g = c23254g2;
                c28655q2 = c28655q3;
                interfaceC28770h = interfaceC28770h2;
                z15 = z4;
                c34354s0 = new C34354s0(new C34307c1(c23254g, c23285v1, z15, interfaceC39171c, interfaceC28770h, 0), c28677v1M87117B, interfaceC2464x2);
                c28655q2.m87172p0(c34354s0);
            } else {
                c28676v0 = c28676v1;
                interfaceC39171c = interfaceC39171c2;
                c23285v1 = c23285v0;
                c34354s0 = objM87133R13;
                c23254g = c23254g2;
                c28655q2 = c28655q3;
                interfaceC28770h = interfaceC28770h2;
                z15 = z4;
            }
            C34354s0 c34354s5 = (C34354s0) c34354s0;
            C23254g c23254g3 = c29891y.f122125a;
            long j15 = c29891y.f122126b;
            c34354s5.f144327u = function1;
            c34354s5.f144332z = j13;
            C34342o0 c34342o0 = c34354s5.f144324r;
            c34342o0.f144268b = c34348q0;
            c34342o0.f144269c = r27;
            c34354s5.f144316j = c23254g3;
            C34307c1 c34307c1 = c34354s5.f144307a;
            if (!AbstractC22676k.m65745e(c34307c1.f144060a, c23254g) || !AbstractC22676k.m65745e(c34307c1.f144061b, c23285v1) || c34307c1.f144064e != z15 || c34307c1.f144065f != 1 || c34307c1.f144062c != Integer.MAX_VALUE || c34307c1.f144063d != 1 || !AbstractC22676k.m65745e(c34307c1.f144066g, interfaceC39171c) || !AbstractC22676k.m65745e(c34307c1.f144068i, C25271y.f99162w) || c34307c1.f144067h != interfaceC28770h) {
                c34307c1 = new C34307c1(c23254g, c23285v1, z15, interfaceC39171c, interfaceC28770h, 0);
            }
            C23285v0 c23285v2 = c23285v1;
            InterfaceC39171c interfaceC39171c3 = interfaceC39171c;
            if (c34354s5.f144307a != c34307c1) {
                c34354s5.f144322p = true;
            }
            c34354s5.f144307a = c34307c1;
            C29875i c29875i = c34354s5.f144310d;
            C29867d0 c29867d0 = c34354s5.f144311e;
            c29875i.getClass();
            C23283u0 c23283u1 = c29891y.f122127c;
            boolean zM65745e = AbstractC22676k.m65745e(c23283u1, ((C12185e) c29875i.f122096x).m33788g());
            String str = ((C29891y) c29875i.f122095w).f122125a.f92135x;
            C23254g c23254g4 = c29891y.f122125a;
            if (AbstractC22676k.m65745e(str, c23254g4.f92135x)) {
                if (C23283u0.m67356b(((C29891y) c29875i.f122095w).f122126b, j15)) {
                    z16 = false;
                } else {
                    ((C12185e) c29875i.f122096x).m33792k(C23283u0.m67360f(j15), C23283u0.m67359e(j15));
                    z16 = true;
                }
                z17 = false;
            } else {
                c29875i.f122096x = new C12185e(c23254g4, j15);
                z16 = false;
                z17 = true;
            }
            if (c23283u1 == null) {
                C12185e c12185e = (C12185e) c29875i.f122096x;
                c12185e.f40626z = -1;
                c12185e.f40621E = -1;
                z18 = z17;
            } else {
                z18 = z17;
                long j16 = c23283u1.f92253a;
                if (!C23283u0.m67357c(j16)) {
                    ((C12185e) c29875i.f122096x).m33791j(C23283u0.m67360f(j16), C23283u0.m67359e(j16));
                }
            }
            if (z18 || !(z16 || zM65745e)) {
                C12185e c12185e2 = (C12185e) c29875i.f122096x;
                c12185e2.f40626z = -1;
                c12185e2.f40621E = -1;
                c29891yM91511b = C29891y.m91511b(c29891y, null, 0L, 3);
            } else {
                c29891yM91511b = c29891y;
            }
            C29891y c29891y3 = (C29891y) c29875i.f122095w;
            c29875i.f122095w = c29891yM91511b;
            if (c29867d0 != null) {
                c29867d0.m91495a(c29891y3, c29891yM91511b);
            }
            Object objM87133R14 = c28655q2.m87133R();
            C28676v0 c28676v2 = c28676v0;
            if (objM87133R14 == c28676v2) {
                objM87133R14 = new C34358t1();
                c28655q2.m87172p0(objM87133R14);
            }
            C34358t1 c34358t1 = (C34358t1) objM87133R14;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c34358t1.f144358e) {
                c34358t1.f144357d = Long.valueOf(jCurrentTimeMillis);
                c34358t1.m108666a(c29891y);
            } else {
                Long l7 = c34358t1.f144357d;
                if (jCurrentTimeMillis > (l7 != null ? l7.longValue() : 0L) + ((long) ErrorCodes.WebsocketMethodErrors.cServerErrors)) {
                    c34358t1.f144357d = Long.valueOf(jCurrentTimeMillis);
                    c34358t1.m108666a(c29891y);
                }
            }
            Object objM87133R15 = c28655q2.m87133R();
            if (objM87133R15 == c28676v2) {
                objM87133R15 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R15);
            }
            final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R15;
            Object objM87133R16 = c28655q2.m87133R();
            if (objM87133R16 == c28676v2) {
                objM87133R16 = new C30835c();
                c28655q2.m87172p0(objM87133R16);
            }
            final InterfaceC30833a interfaceC30833a = (InterfaceC30833a) objM87133R16;
            Object objM87133R17 = c28655q2.m87133R();
            if (objM87133R17 == c28676v2) {
                objM87133R17 = new C13977s1(c34358t1);
                c28655q2.m87172p0(objM87133R17);
            }
            final C13977s1 c13977s3 = (C13977s1) objM87133R17;
            c13977s3.f49846b = interfaceC29884r5;
            c13977s3.f49850f = interfaceC29873g0;
            c13977s3.f49847c = c34354s5.f144328v;
            c13977s3.f49848d = c34354s5;
            c13977s3.f49849e.setValue(c29891y);
            c13977s3.f49867w = new C23283u0(j15);
            c13977s3.f49852h = (InterfaceC2433r1) c28655q2.m87161k(AbstractC2453v1.f9567f);
            c13977s3.f49853i = interfaceC2994c0;
            c13977s3.f49855k = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            c13977s3.f49856l = c15247s2;
            boolean z48 = !z14;
            c13977s3.f49857m.setValue(Boolean.valueOf(z48));
            c13977s3.f49858n.setValue(Boolean.valueOf(z13));
            c28655q2.m87150e0(1966776937);
            c13977s3.f49854j = AbstractC13969q.m39767b(EnumC13975s.f49836w, c23285v2.f92255a.f92201k, c28655q2, 6);
            c28655q2.m87173q(false);
            int i39 = i36 & 7168;
            int i44 = i36 & 57344;
            boolean zM87157i8 = c28655q2.m87157i(c34354s5) | (i39 == 2048) | (i44 == 16384) | c28655q2.m87157i(c29892z3) | (i37 == 4);
            int i45 = (i36 & 112) ^ 48;
            if (i45 > 32) {
                c29878l2 = c29878l;
                if (c28655q2.m87153g(c29878l2)) {
                    z19 = zM87157i8;
                }
                zM87157i = z19 | z | c28655q2.m87157i(interfaceC29884r5) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC30833a) | c28655q2.m87157i(c13977s3);
                Object objM87133R18 = c28655q2.m87133R();
                if (!zM87157i || objM87133R18 == c28676v2) {
                    final C29878l c29878l5 = c29878l2;
                    c15247s = c15247s2;
                    c34354s1 = c34354s5;
                    obj = new Function1() { // from class: u0.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            C34346p1 c34346p1M108662d;
                            C34354s0 c34354s6 = c34354s1;
                            EnumC15251w enumC15251w = (EnumC15251w) ((InterfaceC15250v) obj2);
                            if (c34354s6.m108660b() != enumC15251w.m43354b()) {
                                c34354s6.f144312f.setValue(Boolean.valueOf(enumC15251w.m43354b()));
                                boolean zM108660b = c34354s6.m108660b();
                                C29891y c29891y4 = c29891y;
                                InterfaceC29884r interfaceC29884r6 = interfaceC29884r5;
                                if (zM108660b && z13 && !z14) {
                                    AbstractC34339n0.m108643u(c29892z3, c34354s6, c29891y4, c29878l5, interfaceC29884r6);
                                } else {
                                    AbstractC34339n0.m108634l(c34354s6);
                                }
                                if (enumC15251w.m43354b() && (c34346p1M108662d = c34354s6.m108662d()) != null) {
                                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11194d(interfaceC30833a, c29891y4, c34354s6, c34346p1M108662d, interfaceC29884r6, null, 15), 3);
                                }
                                if (!enumC15251w.m43354b()) {
                                    c13977s3.m39777g(null);
                                }
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    interfaceC29884r = interfaceC29884r5;
                    c29891y2 = c29891y;
                    z24 = z13;
                    c29892z = c29892z3;
                    c29878l3 = c29878l5;
                    c28655q2.m87172p0(obj);
                } else {
                    obj = objM87133R18;
                    c34354s1 = c34354s5;
                    c29892z = c29892z3;
                    z24 = z13;
                    c29878l3 = c29878l2;
                    interfaceC29884r = interfaceC29884r5;
                    c15247s = c15247s2;
                    c29891y2 = c29891y;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3366a = AbstractC1094c.m3366a(AbstractC1126a.m3484c(AbstractC1126a.m3483b(c2314t, c15247s), (Function1) obj), z24, interfaceC21083i);
                if (z24 || z14) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z25), c28655q2);
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c34354s1) | c28655q2.m87157i(c29892z) | c28655q2.m87157i(c13977s3);
                if (i45 > 32 || !c28655q2.m87153g(c29878l3)) {
                    c34354s2 = c34354s1;
                    if ((i36 & 48) != 32) {
                        z26 = false;
                    }
                    z27 = zM87153g2 | z26;
                    Object objM87133R19 = c28655q2.m87133R();
                    if (!z27 || objM87133R19 == c28676v2) {
                        C29892z c29892z4 = c29892z;
                        c2314t2 = c2314t;
                        C29878l c29878l6 = c29878l3;
                        c13977s1 = c13977s3;
                        c34354s3 = c34354s2;
                        interfaceC21083i2 = interfaceC21083i;
                        c11194d = new C11194d(c34354s3, interfaceC28601c1M87238F, c29892z4, c13977s1, c29878l6, (InterfaceC30057d) null);
                        interfaceC28601c1 = interfaceC28601c1M87238F;
                        c29892z = c29892z4;
                        c28655q2.m87172p0(c11194d);
                    } else {
                        c11194d = objM87133R19;
                        c13977s1 = c13977s3;
                        c34354s3 = c34354s2;
                        interfaceC21083i2 = interfaceC21083i;
                        interfaceC28601c1 = interfaceC28601c1M87238F;
                        c2314t2 = c2314t;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) c11194d, C23454a0.f92919a);
                    zM87157i2 = c28655q2.m87157i(c34354s3);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R == c28676v2) {
                        objM87133R = new C34362v(c34354s3, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifierM108903b = AbstractC34452c0.m108903b(c2314t2, 8675309, new C0107f((Function1) objM87133R, 3));
                    boolean zM87157i9 = c28655q2.m87157i(c34354s3);
                    if (i44 == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z49 = zM87157i9 | z28;
                    if (i39 == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    zM87157i3 = z49 | z29 | c28655q2.m87157i(interfaceC29884r) | c28655q2.m87157i(c13977s1);
                    Object objM87133R20 = c28655q2.m87133R();
                    if (!zM87157i3 || objM87133R20 == c28676v2) {
                        interfaceC29884r2 = interfaceC29884r;
                        C13977s1 c13977s4 = c13977s1;
                        boolean z52 = z24;
                        modifier2 = modifierM108903b;
                        c13710s = new C13710s(c34354s3, c15247s, z14, z52, c13977s4, interfaceC29884r2);
                        c13977s1 = c13977s4;
                        c28655q2.m87172p0(c13710s);
                    } else {
                        modifier2 = modifierM108903b;
                        c13710s = objM87133R20;
                        interfaceC29884r2 = interfaceC29884r;
                    }
                    function4 = (Function1) c13710s;
                    i19 = 7;
                    if (z13) {
                        modifierM118997u = AbstractC37056f.m118997u(modifier2, new C11518b0(i19, function4, interfaceC21083i2));
                    } else {
                        modifierM118997u = modifier2;
                    }
                    C13968p1 c13968p1 = c13977s1.f49843A;
                    C13962n1 c13962n1 = c13977s1.f49870z;
                    Modifier modifierMo3471e = modifierM118997u.mo3471e(new SuspendPointerInputElement(c13968p1, c13962n1, null, new C13952k0(0, c13968p1, c13962n1), 4));
                    InterfaceC34469o.f144811a.getClass();
                    Modifier modifierM108918i = AbstractC34454d0.m108918i(modifierMo3471e, AbstractC34471q.f144813b);
                    boolean zM87157i10 = c28655q2.m87157i(c34354s3);
                    if (i37 == 4) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    zM87157i4 = zM87157i10 | z34 | c28655q2.m87157i(interfaceC29884r2);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i4 || objM87133R2 == c28676v2) {
                        objM87133R2 = new C32290f(c34354s3, c29891y2, interfaceC29884r2, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3478a = AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R2);
                    boolean zM87157i11 = c28655q2.m87157i(c34354s3);
                    if (i39 == 2048) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean zM87153g3 = zM87157i11 | z35 | c28655q2.m87153g(interfaceC2410m4) | c28655q2.m87157i(c13977s1);
                    if (i37 == 4) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    zM87157i5 = zM87153g3 | z36 | c28655q2.m87157i(interfaceC29884r2);
                    objM87133R3 = c28655q2.m87133R();
                    if (!zM87157i5 || objM87133R3 == c28676v2) {
                        C25942c c25942c = new C25942c(c34354s3, z13, interfaceC2410m4, c13977s1, c29891y2, interfaceC29884r2);
                        interfaceC2410m3 = interfaceC2410m4;
                        c28655q2.m87172p0(c25942c);
                        objM87133R3 = c25942c;
                    } else {
                        interfaceC2410m3 = interfaceC2410m4;
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(c2314t2, (Function1) objM87133R3);
                    interfaceC29884r3 = interfaceC29884r2;
                    c29892z2 = c29892z;
                    C34354s0 c34354s6 = c34354s3;
                    c13977s2 = c13977s1;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(c29869e0, c29891y, c34354s6, z14, z13, interfaceC29873g0 instanceof C29885s, interfaceC29884r3, c13977s2, c29878l, c15247s);
                    c34354s4 = c34354s6;
                    if (!z13 && !z14 && ((Boolean) ((C2414n2) interfaceC2410m3).f9470c.getValue()).booleanValue() && C23283u0.m67357c(((C23283u0) c34354s4.f144305A.getValue()).f92253a) && C23283u0.m67357c(((C23283u0) c34354s4.f144306B.getValue()).f92253a)) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    if (z37) {
                        C11528e1 c11528e1 = new C11528e1(abstractC17911t, c34354s4, c29891y, interfaceC29884r3, 3);
                        c34354s4 = c34354s4;
                        modifierM118997u2 = AbstractC37056f.m118997u(c2314t2, c11528e1);
                    } else {
                        modifierM118997u2 = c2314t2;
                    }
                    zM87157i6 = c28655q2.m87157i(c13977s2);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i6 || objM87133R4 == c28676v2) {
                        objM87133R4 = new C13944h1(c13977s2, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87251e(c13977s2, (Function1) objM87133R4, c28655q2);
                    boolean zM87157i12 = c28655q2.m87157i(c34354s4) | c28655q2.m87157i(c29892z2);
                    if (i37 == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    z39 = zM87157i12 | z38 | ((i45 <= 32 && c28655q2.m87153g(c29878l)) || (i36 & 48) == 32);
                    objM87133R5 = c28655q2.m87133R();
                    if (!z39 || objM87133R5 == c28676v2) {
                        C31915d c31915d = new C31915d(c34354s4, c29892z2, c29891y, c29878l, 10);
                        c29878l4 = c29878l;
                        c28655q2.m87172p0(c31915d);
                        objM87133R5 = c31915d;
                    } else {
                        c29878l4 = c29878l;
                    }
                    AbstractC28683x.m87251e(c29878l4, (Function1) objM87133R5, c28655q2);
                    C34362v c34362v = c34354s4.f144328v;
                    if (i13 == 1) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    Modifier modifierM118997u4 = AbstractC37056f.m118997u(c2314t2, new C34325i1(c34354s4, c13977s2, c29891y, z48, z44, interfaceC29884r3, c34358t1, c34362v, c29878l4.f122103e));
                    i24 = c29878l4.f122102d;
                    if (i24 == 7 && i24 != 8) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                    zM87155h = c28655q2.m87155h(z45) | c28655q2.m87157i(c11449b);
                    objM87133R6 = c28655q2.m87133R();
                    i25 = 5;
                    if (zM87155h || objM87133R6 == c28676v2) {
                        objM87133R6 = new C19072b(z45, c11449b, i25);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3454a = AbstractC1114a.m3454a(zBooleanValue, z45, (InterfaceC4339a) objM87133R6);
                    j7 = ((C17919x) c28655q2.m87161k(AbstractC34317g.f144085a)).f69639a;
                    zM87157i7 = c28655q2.m87157i(c34354s4) | c28655q2.m87151f(j7);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i7 || objM87133R7 == c28676v2) {
                        objM87133R7 = new C14984d4(c34354s4, j7, 4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    C34340n1 c34340n2 = c34340n1;
                    Modifier modifierM3450a = AbstractC1113a.m3450a(AbstractC1131a.m3500d(AbstractC37056f.m118997u(AbstractC1128a.m3494b(AbstractC1128a.m3494b(AbstractC1115a.m3455a(modifier.mo3471e(AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R7)), c11449b, c34354s4, c13977s2).mo3471e(modifierM3454a).mo3471e(modifierM3366a), new C1774d(9, interfaceC15237i, c34354s4)), new C1774d(8, c34354s4, c13977s2)).mo3471e(modifierM118997u4), new C2640v2(c34340n2, z13, interfaceC21083i, 1 == true ? 1 : 0)).mo3471e(modifierM108918i).mo3471e(coreTextFieldSemanticsModifier), new C31931s(c34354s4, 20)), new C13857f(6, c13977s2, interfaceC2994c0));
                    z46 = !z13 && c34354s4.m108660b() && ((Boolean) c34354s4.f144323q.getValue()).booleanValue() && ((Boolean) ((C2414n2) interfaceC2410m3).f9470c.getValue()).booleanValue();
                    if (z46) {
                        C18043y c18043y = AbstractC13838y0.f49373a;
                        modifierM118997u3 = AbstractC37056f.m118997u(c2314t2, new C2591o4(c13977s2, 5));
                    } else {
                        modifierM118997u3 = c2314t2;
                    }
                    c28655q = c28655q2;
                    m108627e(modifierM3450a, c13977s2, AbstractC37817c.m121344e(-814563849, c28655q, new C34371z(function3, c34354s4, c23285v0, i14, i13, c34340n2, c29891y, interfaceC29873g0, modifierM118997u2, modifierM3478a, modifierM3500d, modifierM118997u3, interfaceC30833a, c13977s2, z46, z14, function2, interfaceC29884r3, interfaceC39171c3)), c28655q, 384);
                } else {
                    c34354s2 = c34354s1;
                }
                z26 = true;
                z27 = zM87153g2 | z26;
                Object objM87133R110 = c28655q2.m87133R();
                if (z27) {
                    C29892z c29892z5 = c29892z;
                    c2314t2 = c2314t;
                    C29878l c29878l7 = c29878l3;
                    c13977s1 = c13977s3;
                    c34354s3 = c34354s2;
                    interfaceC21083i2 = interfaceC21083i;
                    c11194d = new C11194d(c34354s3, interfaceC28601c1M87238F, c29892z5, c13977s1, c29878l7, (InterfaceC30057d) null);
                    interfaceC28601c1 = interfaceC28601c1M87238F;
                    c29892z = c29892z5;
                    c28655q2.m87172p0(c11194d);
                } else {
                    C29892z c29892z6 = c29892z;
                    c2314t2 = c2314t;
                    C29878l c29878l8 = c29878l3;
                    c13977s1 = c13977s3;
                    c34354s3 = c34354s2;
                    interfaceC21083i2 = interfaceC21083i;
                    c11194d = new C11194d(c34354s3, interfaceC28601c1M87238F, c29892z6, c13977s1, c29878l8, (InterfaceC30057d) null);
                    interfaceC28601c1 = interfaceC28601c1M87238F;
                    c29892z = c29892z6;
                    c28655q2.m87172p0(c11194d);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) c11194d, C23454a0.f92919a);
                zM87157i2 = c28655q2.m87157i(c34354s3);
                objM87133R = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R = new C34362v(c34354s3, 0);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C34362v(c34354s3, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                modifierM108903b = AbstractC34452c0.m108903b(c2314t2, 8675309, new C0107f((Function1) objM87133R, 3));
                boolean zM87157i13 = c28655q2.m87157i(c34354s3);
                if (i44 == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z410 = zM87157i13 | z28;
                if (i39 == 2048) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zM87157i3 = z410 | z29 | c28655q2.m87157i(interfaceC29884r) | c28655q2.m87157i(c13977s1);
                Object objM87133R21 = c28655q2.m87133R();
                if (zM87157i3) {
                    interfaceC29884r2 = interfaceC29884r;
                    C13977s1 c13977s5 = c13977s1;
                    boolean z54 = z24;
                    modifier2 = modifierM108903b;
                    c13710s = new C13710s(c34354s3, c15247s, z14, z54, c13977s5, interfaceC29884r2);
                    c13977s1 = c13977s5;
                    c28655q2.m87172p0(c13710s);
                } else {
                    interfaceC29884r2 = interfaceC29884r;
                    C13977s1 c13977s6 = c13977s1;
                    boolean z55 = z24;
                    modifier2 = modifierM108903b;
                    c13710s = new C13710s(c34354s3, c15247s, z14, z55, c13977s6, interfaceC29884r2);
                    c13977s1 = c13977s6;
                    c28655q2.m87172p0(c13710s);
                }
                function4 = (Function1) c13710s;
                i19 = 7;
                if (z13) {
                    modifierM118997u = AbstractC37056f.m118997u(modifier2, new C11518b0(i19, function4, interfaceC21083i2));
                } else {
                    modifierM118997u = modifier2;
                }
                C13968p1 c13968p2 = c13977s1.f49843A;
                C13962n1 c13962n2 = c13977s1.f49870z;
                Modifier modifierMo3471e2 = modifierM118997u.mo3471e(new SuspendPointerInputElement(c13968p2, c13962n2, null, new C13952k0(0, c13968p2, c13962n2), 4));
                InterfaceC34469o.f144811a.getClass();
                Modifier modifierM108918i2 = AbstractC34454d0.m108918i(modifierMo3471e2, AbstractC34471q.f144813b);
                boolean zM87157i14 = c28655q2.m87157i(c34354s3);
                if (i37 == 4) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                zM87157i4 = zM87157i14 | z34 | c28655q2.m87157i(interfaceC29884r2);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R2 = new C32290f(c34354s3, c29891y2, interfaceC29884r2, 13);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32290f(c34354s3, c29891y2, interfaceC29884r2, 13);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3478a2 = AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R2);
                boolean zM87157i15 = c28655q2.m87157i(c34354s3);
                if (i39 == 2048) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87153g4 = zM87157i15 | z35 | c28655q2.m87153g(interfaceC2410m4) | c28655q2.m87157i(c13977s1);
                if (i37 == 4) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                zM87157i5 = zM87153g4 | z36 | c28655q2.m87157i(interfaceC29884r2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i5) {
                    C25942c c25942c2 = new C25942c(c34354s3, z13, interfaceC2410m4, c13977s1, c29891y2, interfaceC29884r2);
                    interfaceC2410m3 = interfaceC2410m4;
                    c28655q2.m87172p0(c25942c2);
                    objM87133R3 = c25942c2;
                } else {
                    C25942c c25942c3 = new C25942c(c34354s3, z13, interfaceC2410m4, c13977s1, c29891y2, interfaceC29884r2);
                    interfaceC2410m3 = interfaceC2410m4;
                    c28655q2.m87172p0(c25942c3);
                    objM87133R3 = c25942c3;
                }
                Modifier modifierM3500d2 = AbstractC1131a.m3500d(c2314t2, (Function1) objM87133R3);
                interfaceC29884r3 = interfaceC29884r2;
                c29892z2 = c29892z;
                C34354s0 c34354s7 = c34354s3;
                c13977s2 = c13977s1;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(c29869e0, c29891y, c34354s7, z14, z13, interfaceC29873g0 instanceof C29885s, interfaceC29884r3, c13977s2, c29878l, c15247s);
                c34354s4 = c34354s7;
                if (!z13) {
                    z37 = false;
                } else {
                    z37 = false;
                }
                if (z37) {
                    C11528e1 c11528e2 = new C11528e1(abstractC17911t, c34354s4, c29891y, interfaceC29884r3, 3);
                    c34354s4 = c34354s4;
                    modifierM118997u2 = AbstractC37056f.m118997u(c2314t2, c11528e2);
                } else {
                    modifierM118997u2 = c2314t2;
                }
                zM87157i6 = c28655q2.m87157i(c13977s2);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i6) {
                    objM87133R4 = new C13944h1(c13977s2, 1);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C13944h1(c13977s2, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87251e(c13977s2, (Function1) objM87133R4, c28655q2);
                boolean zM87157i16 = c28655q2.m87157i(c34354s4) | c28655q2.m87157i(c29892z2);
                if (i37 == 4) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                z39 = zM87157i16 | z38 | ((i45 <= 32 && c28655q2.m87153g(c29878l)) || (i36 & 48) == 32);
                objM87133R5 = c28655q2.m87133R();
                if (z39) {
                    C31915d c31915d2 = new C31915d(c34354s4, c29892z2, c29891y, c29878l, 10);
                    c29878l4 = c29878l;
                    c28655q2.m87172p0(c31915d2);
                    objM87133R5 = c31915d2;
                } else {
                    C31915d c31915d3 = new C31915d(c34354s4, c29892z2, c29891y, c29878l, 10);
                    c29878l4 = c29878l;
                    c28655q2.m87172p0(c31915d3);
                    objM87133R5 = c31915d3;
                }
                AbstractC28683x.m87251e(c29878l4, (Function1) objM87133R5, c28655q2);
                C34362v c34362v2 = c34354s4.f144328v;
                if (i13 == 1) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                Modifier modifierM118997u5 = AbstractC37056f.m118997u(c2314t2, new C34325i1(c34354s4, c13977s2, c29891y, z48, z44, interfaceC29884r3, c34358t1, c34362v2, c29878l4.f122103e));
                i24 = c29878l4.f122102d;
                if (i24 == 7) {
                    z45 = false;
                } else {
                    z45 = true;
                }
                boolean zBooleanValue2 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                zM87155h = c28655q2.m87155h(z45) | c28655q2.m87157i(c11449b);
                objM87133R6 = c28655q2.m87133R();
                i25 = 5;
                if (zM87155h) {
                    objM87133R6 = new C19072b(z45, c11449b, i25);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C19072b(z45, c11449b, i25);
                    c28655q2.m87172p0(objM87133R6);
                }
                Modifier modifierM3454a2 = AbstractC1114a.m3454a(zBooleanValue2, z45, (InterfaceC4339a) objM87133R6);
                j7 = ((C17919x) c28655q2.m87161k(AbstractC34317g.f144085a)).f69639a;
                zM87157i7 = c28655q2.m87157i(c34354s4) | c28655q2.m87151f(j7);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i7) {
                    objM87133R7 = new C14984d4(c34354s4, j7, 4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C14984d4(c34354s4, j7, 4);
                    c28655q2.m87172p0(objM87133R7);
                }
                C34340n1 c34340n3 = c34340n1;
                Modifier modifierM3450a2 = AbstractC1113a.m3450a(AbstractC1131a.m3500d(AbstractC37056f.m118997u(AbstractC1128a.m3494b(AbstractC1128a.m3494b(AbstractC1115a.m3455a(modifier.mo3471e(AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R7)), c11449b, c34354s4, c13977s2).mo3471e(modifierM3454a2).mo3471e(modifierM3366a), new C1774d(9, interfaceC15237i, c34354s4)), new C1774d(8, c34354s4, c13977s2)).mo3471e(modifierM118997u5), new C2640v2(c34340n3, z13, interfaceC21083i, 1 == true ? 1 : 0)).mo3471e(modifierM108918i2).mo3471e(coreTextFieldSemanticsModifier2), new C31931s(c34354s4, 20)), new C13857f(6, c13977s2, interfaceC2994c0));
                if (z13) {
                }
                if (z46) {
                    C18043y c18043y2 = AbstractC13838y0.f49373a;
                    modifierM118997u3 = AbstractC37056f.m118997u(c2314t2, new C2591o4(c13977s2, 5));
                } else {
                    modifierM118997u3 = c2314t2;
                }
                c28655q = c28655q2;
                m108627e(modifierM3450a2, c13977s2, AbstractC37817c.m121344e(-814563849, c28655q, new C34371z(function3, c34354s4, c23285v0, i14, i13, c34340n3, c29891y, interfaceC29873g0, modifierM118997u2, modifierM3478a2, modifierM3500d2, modifierM118997u3, interfaceC30833a, c13977s2, z46, z14, function2, interfaceC29884r3, interfaceC39171c3)), c28655q, 384);
            } else {
                c29878l2 = c29878l;
            }
            z19 = zM87157i8;
            boolean z56 = (i36 & 48) == 32;
            zM87157i = z19 | z56 | c28655q2.m87157i(interfaceC29884r5) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC30833a) | c28655q2.m87157i(c13977s3);
            Object objM87133R111 = c28655q2.m87133R();
            if (zM87157i) {
                final C29878l c29878l9 = c29878l2;
                c15247s = c15247s2;
                c34354s1 = c34354s5;
                obj = new Function1() { // from class: u0.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        C34346p1 c34346p1M108662d;
                        C34354s0 c34354s8 = c34354s1;
                        EnumC15251w enumC15251w = (EnumC15251w) ((InterfaceC15250v) obj2);
                        if (c34354s8.m108660b() != enumC15251w.m43354b()) {
                            c34354s8.f144312f.setValue(Boolean.valueOf(enumC15251w.m43354b()));
                            boolean zM108660b = c34354s8.m108660b();
                            C29891y c29891y4 = c29891y;
                            InterfaceC29884r interfaceC29884r6 = interfaceC29884r5;
                            if (zM108660b && z13 && !z14) {
                                AbstractC34339n0.m108643u(c29892z3, c34354s8, c29891y4, c29878l9, interfaceC29884r6);
                            } else {
                                AbstractC34339n0.m108634l(c34354s8);
                            }
                            if (enumC15251w.m43354b() && (c34346p1M108662d = c34354s8.m108662d()) != null) {
                                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11194d(interfaceC30833a, c29891y4, c34354s8, c34346p1M108662d, interfaceC29884r6, null, 15), 3);
                            }
                            if (!enumC15251w.m43354b()) {
                                c13977s3.m39777g(null);
                            }
                        }
                        return C23454a0.f92919a;
                    }
                };
                interfaceC29884r = interfaceC29884r5;
                c29891y2 = c29891y;
                z24 = z13;
                c29892z = c29892z3;
                c29878l3 = c29878l9;
                c28655q2.m87172p0(obj);
            } else {
                final C29878l c29878l10 = c29878l2;
                c15247s = c15247s2;
                c34354s1 = c34354s5;
                obj = new Function1() { // from class: u0.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        C34346p1 c34346p1M108662d;
                        C34354s0 c34354s8 = c34354s1;
                        EnumC15251w enumC15251w = (EnumC15251w) ((InterfaceC15250v) obj2);
                        if (c34354s8.m108660b() != enumC15251w.m43354b()) {
                            c34354s8.f144312f.setValue(Boolean.valueOf(enumC15251w.m43354b()));
                            boolean zM108660b = c34354s8.m108660b();
                            C29891y c29891y4 = c29891y;
                            InterfaceC29884r interfaceC29884r6 = interfaceC29884r5;
                            if (zM108660b && z13 && !z14) {
                                AbstractC34339n0.m108643u(c29892z3, c34354s8, c29891y4, c29878l10, interfaceC29884r6);
                            } else {
                                AbstractC34339n0.m108634l(c34354s8);
                            }
                            if (enumC15251w.m43354b() && (c34346p1M108662d = c34354s8.m108662d()) != null) {
                                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11194d(interfaceC30833a, c29891y4, c34354s8, c34346p1M108662d, interfaceC29884r6, null, 15), 3);
                            }
                            if (!enumC15251w.m43354b()) {
                                c13977s3.m39777g(null);
                            }
                        }
                        return C23454a0.f92919a;
                    }
                };
                interfaceC29884r = interfaceC29884r5;
                c29891y2 = c29891y;
                z24 = z13;
                c29892z = c29892z3;
                c29878l3 = c29878l10;
                c28655q2.m87172p0(obj);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3366a2 = AbstractC1094c.m3366a(AbstractC1126a.m3484c(AbstractC1126a.m3483b(c2314t, c15247s), (Function1) obj), z24, interfaceC21083i);
            if (z24) {
                z25 = false;
            } else {
                z25 = false;
            }
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z25), c28655q2);
            boolean zM87153g5 = c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87157i(c34354s1) | c28655q2.m87157i(c29892z) | c28655q2.m87157i(c13977s3);
            if (i45 > 32) {
                c34354s2 = c34354s1;
                if ((i36 & 48) != 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            } else {
                c34354s2 = c34354s1;
                if ((i36 & 48) != 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            }
            z27 = zM87153g5 | z26;
            Object objM87133R112 = c28655q2.m87133R();
            if (z27) {
                C29892z c29892z7 = c29892z;
                c2314t2 = c2314t;
                C29878l c29878l11 = c29878l3;
                c13977s1 = c13977s3;
                c34354s3 = c34354s2;
                interfaceC21083i2 = interfaceC21083i;
                c11194d = new C11194d(c34354s3, interfaceC28601c1M87238F, c29892z7, c13977s1, c29878l11, (InterfaceC30057d) null);
                interfaceC28601c1 = interfaceC28601c1M87238F;
                c29892z = c29892z7;
                c28655q2.m87172p0(c11194d);
            } else {
                C29892z c29892z8 = c29892z;
                c2314t2 = c2314t;
                C29878l c29878l12 = c29878l3;
                c13977s1 = c13977s3;
                c34354s3 = c34354s2;
                interfaceC21083i2 = interfaceC21083i;
                c11194d = new C11194d(c34354s3, interfaceC28601c1M87238F, c29892z8, c13977s1, c29878l12, (InterfaceC30057d) null);
                interfaceC28601c1 = interfaceC28601c1M87238F;
                c29892z = c29892z8;
                c28655q2.m87172p0(c11194d);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) c11194d, C23454a0.f92919a);
            zM87157i2 = c28655q2.m87157i(c34354s3);
            objM87133R = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R = new C34362v(c34354s3, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C34362v(c34354s3, 0);
                c28655q2.m87172p0(objM87133R);
            }
            modifierM108903b = AbstractC34452c0.m108903b(c2314t2, 8675309, new C0107f((Function1) objM87133R, 3));
            boolean zM87157i17 = c28655q2.m87157i(c34354s3);
            if (i44 == 16384) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z411 = zM87157i17 | z28;
            if (i39 == 2048) {
                z29 = true;
            } else {
                z29 = false;
            }
            zM87157i3 = z411 | z29 | c28655q2.m87157i(interfaceC29884r) | c28655q2.m87157i(c13977s1);
            Object objM87133R22 = c28655q2.m87133R();
            if (zM87157i3) {
                interfaceC29884r2 = interfaceC29884r;
                C13977s1 c13977s7 = c13977s1;
                boolean z57 = z24;
                modifier2 = modifierM108903b;
                c13710s = new C13710s(c34354s3, c15247s, z14, z57, c13977s7, interfaceC29884r2);
                c13977s1 = c13977s7;
                c28655q2.m87172p0(c13710s);
            } else {
                interfaceC29884r2 = interfaceC29884r;
                C13977s1 c13977s8 = c13977s1;
                boolean z58 = z24;
                modifier2 = modifierM108903b;
                c13710s = new C13710s(c34354s3, c15247s, z14, z58, c13977s8, interfaceC29884r2);
                c13977s1 = c13977s8;
                c28655q2.m87172p0(c13710s);
            }
            function4 = (Function1) c13710s;
            i19 = 7;
            if (z13) {
                modifierM118997u = AbstractC37056f.m118997u(modifier2, new C11518b0(i19, function4, interfaceC21083i2));
            } else {
                modifierM118997u = modifier2;
            }
            C13968p1 c13968p3 = c13977s1.f49843A;
            C13962n1 c13962n3 = c13977s1.f49870z;
            Modifier modifierMo3471e3 = modifierM118997u.mo3471e(new SuspendPointerInputElement(c13968p3, c13962n3, null, new C13952k0(0, c13968p3, c13962n3), 4));
            InterfaceC34469o.f144811a.getClass();
            Modifier modifierM108918i3 = AbstractC34454d0.m108918i(modifierMo3471e3, AbstractC34471q.f144813b);
            boolean zM87157i18 = c28655q2.m87157i(c34354s3);
            if (i37 == 4) {
                z34 = true;
            } else {
                z34 = false;
            }
            zM87157i4 = zM87157i18 | z34 | c28655q2.m87157i(interfaceC29884r2);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i4) {
                objM87133R2 = new C32290f(c34354s3, c29891y2, interfaceC29884r2, 13);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32290f(c34354s3, c29891y2, interfaceC29884r2, 13);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3478a3 = AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R2);
            boolean zM87157i19 = c28655q2.m87157i(c34354s3);
            if (i39 == 2048) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean zM87153g6 = zM87157i19 | z35 | c28655q2.m87153g(interfaceC2410m4) | c28655q2.m87157i(c13977s1);
            if (i37 == 4) {
                z36 = true;
            } else {
                z36 = false;
            }
            zM87157i5 = zM87153g6 | z36 | c28655q2.m87157i(interfaceC29884r2);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i5) {
                C25942c c25942c4 = new C25942c(c34354s3, z13, interfaceC2410m4, c13977s1, c29891y2, interfaceC29884r2);
                interfaceC2410m3 = interfaceC2410m4;
                c28655q2.m87172p0(c25942c4);
                objM87133R3 = c25942c4;
            } else {
                C25942c c25942c5 = new C25942c(c34354s3, z13, interfaceC2410m4, c13977s1, c29891y2, interfaceC29884r2);
                interfaceC2410m3 = interfaceC2410m4;
                c28655q2.m87172p0(c25942c5);
                objM87133R3 = c25942c5;
            }
            Modifier modifierM3500d3 = AbstractC1131a.m3500d(c2314t2, (Function1) objM87133R3);
            interfaceC29884r3 = interfaceC29884r2;
            c29892z2 = c29892z;
            C34354s0 c34354s8 = c34354s3;
            c13977s2 = c13977s1;
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier3 = new CoreTextFieldSemanticsModifier(c29869e0, c29891y, c34354s8, z14, z13, interfaceC29873g0 instanceof C29885s, interfaceC29884r3, c13977s2, c29878l, c15247s);
            c34354s4 = c34354s8;
            if (!z13) {
                z37 = false;
            } else {
                z37 = false;
            }
            if (z37) {
                C11528e1 c11528e3 = new C11528e1(abstractC17911t, c34354s4, c29891y, interfaceC29884r3, 3);
                c34354s4 = c34354s4;
                modifierM118997u2 = AbstractC37056f.m118997u(c2314t2, c11528e3);
            } else {
                modifierM118997u2 = c2314t2;
            }
            zM87157i6 = c28655q2.m87157i(c13977s2);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i6) {
                objM87133R4 = new C13944h1(c13977s2, 1);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C13944h1(c13977s2, 1);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(c13977s2, (Function1) objM87133R4, c28655q2);
            boolean zM87157i110 = c28655q2.m87157i(c34354s4) | c28655q2.m87157i(c29892z2);
            if (i37 == 4) {
                z38 = true;
            } else {
                z38 = false;
            }
            z39 = zM87157i110 | z38 | ((i45 <= 32 && c28655q2.m87153g(c29878l)) || (i36 & 48) == 32);
            objM87133R5 = c28655q2.m87133R();
            if (z39) {
                C31915d c31915d4 = new C31915d(c34354s4, c29892z2, c29891y, c29878l, 10);
                c29878l4 = c29878l;
                c28655q2.m87172p0(c31915d4);
                objM87133R5 = c31915d4;
            } else {
                C31915d c31915d5 = new C31915d(c34354s4, c29892z2, c29891y, c29878l, 10);
                c29878l4 = c29878l;
                c28655q2.m87172p0(c31915d5);
                objM87133R5 = c31915d5;
            }
            AbstractC28683x.m87251e(c29878l4, (Function1) objM87133R5, c28655q2);
            C34362v c34362v3 = c34354s4.f144328v;
            if (i13 == 1) {
                z44 = true;
            } else {
                z44 = false;
            }
            Modifier modifierM118997u6 = AbstractC37056f.m118997u(c2314t2, new C34325i1(c34354s4, c13977s2, c29891y, z48, z44, interfaceC29884r3, c34358t1, c34362v3, c29878l4.f122103e));
            i24 = c29878l4.f122102d;
            if (i24 == 7) {
                z45 = false;
            } else {
                z45 = true;
            }
            boolean zBooleanValue3 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            zM87155h = c28655q2.m87155h(z45) | c28655q2.m87157i(c11449b);
            objM87133R6 = c28655q2.m87133R();
            i25 = 5;
            if (zM87155h) {
                objM87133R6 = new C19072b(z45, c11449b, i25);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C19072b(z45, c11449b, i25);
                c28655q2.m87172p0(objM87133R6);
            }
            Modifier modifierM3454a3 = AbstractC1114a.m3454a(zBooleanValue3, z45, (InterfaceC4339a) objM87133R6);
            j7 = ((C17919x) c28655q2.m87161k(AbstractC34317g.f144085a)).f69639a;
            zM87157i7 = c28655q2.m87157i(c34354s4) | c28655q2.m87151f(j7);
            objM87133R7 = c28655q2.m87133R();
            if (zM87157i7) {
                objM87133R7 = new C14984d4(c34354s4, j7, 4);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C14984d4(c34354s4, j7, 4);
                c28655q2.m87172p0(objM87133R7);
            }
            C34340n1 c34340n4 = c34340n1;
            Modifier modifierM3450a3 = AbstractC1113a.m3450a(AbstractC1131a.m3500d(AbstractC37056f.m118997u(AbstractC1128a.m3494b(AbstractC1128a.m3494b(AbstractC1115a.m3455a(modifier.mo3471e(AbstractC1125a.m3478a(c2314t2, (Function1) objM87133R7)), c11449b, c34354s4, c13977s2).mo3471e(modifierM3454a3).mo3471e(modifierM3366a2), new C1774d(9, interfaceC15237i, c34354s4)), new C1774d(8, c34354s4, c13977s2)).mo3471e(modifierM118997u6), new C2640v2(c34340n4, z13, interfaceC21083i, 1 == true ? 1 : 0)).mo3471e(modifierM108918i3).mo3471e(coreTextFieldSemanticsModifier3), new C31931s(c34354s4, 20)), new C13857f(6, c13977s2, interfaceC2994c0));
            if (z13) {
            }
            if (z46) {
                C18043y c18043y3 = AbstractC13838y0.f49373a;
                modifierM118997u3 = AbstractC37056f.m118997u(c2314t2, new C2591o4(c13977s2, 5));
            } else {
                modifierM118997u3 = c2314t2;
            }
            c28655q = c28655q2;
            m108627e(modifierM3450a3, c13977s2, AbstractC37817c.m121344e(-814563849, c28655q, new C34371z(function3, c34354s4, c23285v0, i14, i13, c34340n4, c29891y, interfaceC29873g0, modifierM118997u2, modifierM3478a3, modifierM3500d3, modifierM118997u3, interfaceC30833a, c13977s2, z46, z14, function2, interfaceC29884r3, interfaceC39171c3)), c28655q, 384);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u0.t
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i16);
                    AbstractC34339n0.m108626d(c29891y, function1, modifier, c23285v0, interfaceC29873g0, function2, interfaceC21083i, abstractC17911t, z4, i13, i14, c29878l, c34348q0, z13, z14, function3, (Composer) obj2, iM87244L, iM87244L2);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m108627e(Modifier modifier, C13977s1 c13977s1, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2036174316);
        int i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13 | (c28655q.m87157i(c13977s1) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, true);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m108625c(c13977s1, c37816b, c28655q, (i14 >> 3) & 126);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(modifier, c13977s1, c37816b, i13, 25);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m108628f(C13977s1 c13977s1, boolean z4, Composer composer, int i13) {
        C34346p1 c34346p1M108662d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(626339208);
        int i14 = (c28655q.m87157i(c13977s1) ? 4 : 2) | i13 | (c28655q.m87155h(z4) ? 32 : 16);
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(1529773841);
            C34354s0 c34354s0 = c13977s1.f49848d;
            C23277r0 c23277r0 = null;
            if (c34354s0 != null && (c34346p1M108662d = c34354s0.m108662d()) != null) {
                C23277r0 c23277r1 = c34346p1M108662d.f144282a;
                C34354s0 c34354s1 = c13977s1.f49848d;
                if (!(c34354s1 != null ? c34354s1.f144322p : true)) {
                    c23277r0 = c23277r1;
                }
            }
            if (c23277r0 == null) {
                c28655q.m87150e0(1530097387);
            } else {
                c28655q.m87150e0(1530097388);
                if (C23283u0.m67357c(c13977s1.m39783m().f122126b)) {
                    c28655q.m87150e0(2110860558);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2109807302);
                    int iMo15749x = c13977s1.f49846b.mo15749x((int) (c13977s1.m39783m().f122126b >> 32));
                    int iMo15749x2 = c13977s1.f49846b.mo15749x((int) (c13977s1.m39783m().f122126b & 4294967295L));
                    EnumC36774j enumC36774jM67332a = c23277r0.m67332a(iMo15749x);
                    EnumC36774j enumC36774jM67332a2 = c23277r0.m67332a(Math.max(iMo15749x2 - 1, 0));
                    C34354s0 c34354s2 = c13977s1.f49848d;
                    if (c34354s2 == null || !((Boolean) c34354s2.f144319m.getValue()).booleanValue()) {
                        c28655q.m87150e0(2110490542);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2110225306);
                        AbstractC13994y0.m39819h(true, enumC36774jM67332a, c13977s1, c28655q, ((i14 << 6) & 896) | 6);
                        c28655q.m87173q(false);
                    }
                    C34354s0 c34354s3 = c13977s1.f49848d;
                    if (c34354s3 == null || !((Boolean) c34354s3.f144320n.getValue()).booleanValue()) {
                        c28655q.m87150e0(2110838734);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2110574459);
                        AbstractC13994y0.m39819h(false, enumC36774jM67332a2, c13977s1, c28655q, ((i14 << 6) & 896) | 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                C34354s0 c34354s4 = c13977s1.f49848d;
                if (c34354s4 != null) {
                    C28633k1 c28633k1 = c34354s4.f144318l;
                    if (!AbstractC22676k.m65745e(c13977s1.f49865u.f122125a.f92135x, c13977s1.m39783m().f122125a.f92135x)) {
                        c28633k1.setValue(Boolean.FALSE);
                    }
                    if (c34354s4.m108660b()) {
                        if (((Boolean) c28633k1.getValue()).booleanValue()) {
                            c13977s1.m39787q();
                        } else {
                            c13977s1.m39784n();
                        }
                    }
                }
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1989076778);
            c28655q.m87173q(false);
            c13977s1.m39784n();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2626t2(c13977s1, z4, i13, 9);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m108629g(C13977s1 c13977s1, Composer composer, int i13) {
        C23254g c23254gM39782l;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1436003720);
        int i14 = 2;
        int i15 = (c28655q.m87157i(c13977s1) ? 4 : 2) | i13;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C34354s0 c34354s0 = c13977s1.f49848d;
            if (c34354s0 == null || !((Boolean) c34354s0.f144321o.getValue()).booleanValue() || (c23254gM39782l = c13977s1.m39782l()) == null || c23254gM39782l.f92135x.length() <= 0) {
                c28655q.m87150e0(-2111021718);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2112330600);
                boolean zM87153g = c28655q.m87153g(c13977s1);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C13956l1(c13977s1);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC34310d1 interfaceC34310d1 = (InterfaceC34310d1) objM87133R;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
                long j7 = c13977s1.m39783m().f122126b;
                int i16 = C23283u0.f92252c;
                int iMo15749x = interfaceC29884r.mo15749x((int) (j7 >> 32));
                C34354s0 c34354s1 = c13977s1.f49848d;
                C34346p1 c34346p1M108662d = c34354s1 != null ? c34354s1.m108662d() : null;
                AbstractC22676k.m65747g(c34346p1M108662d);
                C23277r0 c23277r0 = c34346p1M108662d.f144282a;
                C16618c c16618cM67334c = c23277r0.m67334c(AbstractC12889b.m36284n(iMo15749x, 0, c23277r0.f92227a.f92216a.f92135x.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((interfaceC39171c.mo743q0(AbstractC34313e1.f144078a) / 2) + c16618cM67334c.f63939a)) << 32) | (((long) Float.floatToRawIntBits(c16618cM67334c.f63942d)) & 4294967295L);
                boolean zM87151f = c28655q.m87151f(jFloatToRawIntBits);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87151f || objM87133R2 == c28676v0) {
                    objM87133R2 = new C34303b0(jFloatToRawIntBits);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC13957m interfaceC13957m = (InterfaceC13957m) objM87133R2;
                boolean zM87157i = c28655q.m87157i(interfaceC34310d1) | c28655q.m87157i(c13977s1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C13952k0(interfaceC34310d1, c13977s1);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(C2314t.f9131w, interfaceC34310d1, (PointerInputEventHandler) objM87133R3);
                boolean zM87151f2 = c28655q.m87151f(jFloatToRawIntBits);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87151f2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C33209p1(jFloatToRawIntBits, i14);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC34302b.m108610a(interfaceC13957m, AbstractC18032n.m51775c(modifierM108903b, false, (Function1) objM87133R4), 0L, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34238a(c13977s1, i13, 3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C16618c m108630h(AbstractC39101i1 abstractC39101i1, int i13, C29869e0 c29869e0, C23277r0 c23277r0, boolean z4, int i14) {
        C16618c c16618cM67334c = c23277r0 != null ? c23277r0.m67334c(c29869e0.f122089b.mo15749x(i13)) : C16618c.f63938e;
        float f13 = c16618cM67334c.f63939a;
        int iMo724F = abstractC39101i1.mo724F(AbstractC34313e1.f144078a);
        return C16618c.m47195b(c16618cM67334c, z4 ? (i14 - f13) - iMo724F : f13, z4 ? i14 - f13 : iMo724F + f13, 0.0f, 10);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m108631i(int i13, KeyEvent keyEvent) {
        return ((int) (AbstractC32073e.m99714D(keyEvent) >> 32)) == i13;
    }

    /* JADX INFO: renamed from: j */
    public static final void m108632j(C23248d c23248d, String str, String str2) {
        if (str2.length() <= 0) {
            AbstractC22086a.m63158a("alternateText can't be an empty string.");
        }
        c23248d.m67306h("androidx.compose.foundation.text.inlineContent", str);
        c23248d.m67300b(str2);
        c23248d.m67303e();
    }

    /* JADX INFO: renamed from: k */
    public static final Object m108633k(InterfaceC34476v interfaceC34476v, InterfaceC34310d1 interfaceC34310d1, InterfaceC30057d interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new C2147u(interfaceC34476v, interfaceC34310d1, null, 22), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m108634l(C34354s0 c34354s0) {
        C29867d0 c29867d0 = c34354s0.f144311e;
        if (c29867d0 != null) {
            c34354s0.f144328v.invoke(C29891y.m91511b((C29891y) c34354s0.f144310d.f122095w, null, 0L, 3));
            C29892z c29892z = c29867d0.f122086a;
            AtomicReference atomicReference = c29892z.f122129b;
            while (!atomicReference.compareAndSet(c29867d0, null)) {
                if (atomicReference.get() != c29867d0) {
                }
            }
            c29892z.f122128a.mo30719b();
        }
        c34354s0.f144311e = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a3.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public static final int m108635m(int i13, String str) {
        ?? r10;
        ?? r14;
        int spanEnd;
        C16955j c16955jM108639q = m108639q();
        Integer num = null;
        if (c16955jM108639q != null) {
            if (!(c16955jM108639q.m47711c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            AbstractC37056f.m118993q(str, "charSequence cannot be null");
            ?? r15 = c16955jM108639q.f65083e.f65073b;
            r15.getClass();
            if (i13 < 0 || i13 >= str.length()) {
                r14 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C16970y[] c16970yArr = (C16970y[]) spanned.getSpans(i13, i13 + 1, C16970y.class);
                if (c16970yArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(c16970yArr[0]);
                    r14 = str;
                } else {
                    ?? r16 = str;
                    spanEnd = ((C16962q) r15.m677H(r16, Math.max(0, i13 - 16), Math.min(str.length(), i13 + 16), Integer.MAX_VALUE, true, new C16962q(i13))).f65098y;
                    r14 = r16;
                }
            } else {
                ?? r17 = str;
                spanEnd = ((C16962q) r15.m677H(r17, Math.max(0, i13 - 16), Math.min(str.length(), i13 + 16), Integer.MAX_VALUE, true, new C16962q(i13))).f65098y;
                r14 = r17;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r10 = r14;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r10 = str;
        }
        if (num != null) {
            r10 = r14;
            return num.intValue();
        }
        r10 = r14;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r10);
        return characterInstance.following(i13);
    }

    /* JADX INFO: renamed from: n */
    public static final int m108636n(int i13, CharSequence charSequence) {
        int length = charSequence.length();
        while (i13 < length) {
            if (charSequence.charAt(i13) == '\n') {
                return i13;
            }
            i13++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: o */
    public static final int m108637o(int i13, CharSequence charSequence) {
        while (i13 > 0) {
            if (charSequence.charAt(i13 - 1) == '\n') {
                return i13;
            }
            i13--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static final int m108638p(int i13, String str) {
        C16955j c16955jM108639q = m108639q();
        Integer num = null;
        if (c16955jM108639q != null) {
            Integer numValueOf = Integer.valueOf(c16955jM108639q.m47710b(Math.max(0, i13 - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i13);
    }

    /* JADX INFO: renamed from: q */
    public static final C16955j m108639q() {
        if (!C16955j.m47709d()) {
            return null;
        }
        C16955j c16955jM47708a = C16955j.m47708a();
        if (c16955jM47708a.m47711c() == 1) {
            return c16955jM47708a;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final float m108640r(C23277r0 c23277r0, int i13) {
        if (i13 < 0) {
            return 0.0f;
        }
        C23275q0 c23275q0 = c23277r0.f92227a;
        C23286w c23286w = c23277r0.f92228b;
        if (c23275q0.f92216a.f92135x.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(c23286w.m67374d(i13), Math.min(c23286w.f92259b - 1, c23286w.f92263f - 1));
        if (i13 > c23286w.m67373c(iMin, false)) {
            return 0.0f;
        }
        c23286w.m67381m(iMin);
        ArrayList arrayList = c23286w.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(iMin, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int i14 = iMin - c23290y.f92273d;
        C24983m c24983m = c23242a.f92101d;
        return c24983m.m73311e(i14) - c24983m.m73313g(i14);
    }

    /* JADX INFO: renamed from: s */
    public static final void m108641s(C34354s0 c34354s0, C29891y c29891y, InterfaceC29884r interfaceC29884r) {
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            C34346p1 c34346p1M108662d = c34354s0.m108662d();
            if (c34346p1M108662d == null) {
                return;
            }
            C29867d0 c29867d0 = c34354s0.f144311e;
            if (c29867d0 == null) {
                return;
            }
            InterfaceC39147y interfaceC39147yM108661c = c34354s0.m108661c();
            if (interfaceC39147yM108661c == null) {
                return;
            }
            m108642t(c29891y, c34354s0.f144307a, c34346p1M108662d.f144282a, interfaceC39147yM108661c, c29867d0, c34354s0.m108660b(), interfaceC29884r);
        } finally {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m108642t(C29891y c29891y, C34307c1 c34307c1, C23277r0 c23277r0, InterfaceC39147y interfaceC39147y, C29867d0 c29867d0, boolean z4, InterfaceC29884r interfaceC29884r) {
        C16618c c16618cM67333b;
        if (z4) {
            int iMo15749x = interfaceC29884r.mo15749x(C23283u0.m67359e(c29891y.f122126b));
            String str = AbstractC34316f1.f144084a;
            if (iMo15749x < c23277r0.f92227a.f92216a.f92135x.length()) {
                c16618cM67333b = c23277r0.m67333b(iMo15749x);
            } else {
                c16618cM67333b = iMo15749x != 0 ? c23277r0.m67333b(iMo15749x - 1) : new C16618c(0.0f, 0.0f, 1.0f, (int) (AbstractC34316f1.m108616a(c34307c1.f144061b, c34307c1.f144066g, c34307c1.f144067h, AbstractC34316f1.f144084a, 1) & 4294967295L));
            }
            float f13 = c16618cM67333b.f63940b;
            float f14 = c16618cM67333b.f63939a;
            long jMo3523Z = interfaceC39147y.mo3523Z((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
            C16618c c16618cM48896j = AbstractC17269i.m48896j((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3523Z & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo3523Z >> 32)))) << 32), (((long) Float.floatToRawIntBits(c16618cM67333b.f63941c - f14)) << 32) | (((long) Float.floatToRawIntBits(c16618cM67333b.f63942d - f13)) & 4294967295L));
            if (AbstractC22676k.m65745e((C29867d0) c29867d0.f122086a.f122129b.get(), c29867d0)) {
                c29867d0.f122087b.mo30722e(c16618cM48896j);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m108643u(C29892z c29892z, C34354s0 c34354s0, C29891y c29891y, C29878l c29878l, InterfaceC29884r interfaceC29884r) {
        C29875i c29875i = c34354s0.f144310d;
        C34362v c34362v = c34354s0.f144328v;
        C34362v c34362v2 = c34354s0.f144329w;
        C22669g0 c22669g0 = new C22669g0();
        C32290f c32290f = new C32290f((Object) c29875i, (Function1) c34362v, (Object) c22669g0, 15);
        InterfaceC29886t interfaceC29886t = c29892z.f122128a;
        interfaceC29886t.mo30723f(c29891y, c29878l, c32290f, c34362v2);
        C29867d0 c29867d0 = new C29867d0(c29892z, interfaceC29886t);
        c29892z.f122129b.set(c29867d0);
        c22669g0.f89336w = c29867d0;
        c34354s0.f144311e = c29867d0;
        m108641s(c34354s0, c29891y, interfaceC29884r);
    }
}
