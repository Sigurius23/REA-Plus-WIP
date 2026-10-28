package z80;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bb2.C2931g;
import bm2.C3466p;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e90.C12878a;
import f31.AbstractC14046c;
import f31.C14044a;
import gb1.AbstractC15673b0;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.C3948a0;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p714k80.AbstractC22280i;
import p714k80.AbstractC22284m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import re1.C31324k;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import wo1.C37462n;
import x81.C38072d;
import y71.C39272e;
import yo0.C39681c;
import z72.C40160f;

/* JADX INFO: renamed from: z80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001ac\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "subtitle", "cta", "cancelCta", "", "Le90/a;", "options", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onDismissRequest", "j", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "textIndexSelected", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40180a {
    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: j */
    public static final void m128902j(TextResource title, TextResource subtitle, TextResource cta, TextResource cancelCta, List<C12878a> options, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        AbstractC22676k.m65750j(options, "options");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-286539745);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(subtitle) : c28655q.m87157i(subtitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(cta) : c28655q.m87157i(cta) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(cancelCta) : c28655q.m87157i(cancelCta) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(options) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i14 & 32;
        if (i18 == 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                if ((599187 & i15) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C40160f(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39681c(28);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(0, c28655q);
                    }
                    InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    z13 = (i15 & 3670016) == 1048576;
                    objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C39272e(interfaceC4339a3, 18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R2, new C3948a0(3), AbstractC37817c.m121344e(1815973224, c28655q, new C3466p(title, subtitle, options, cta, function4, cancelCta, interfaceC4339a3, interfaceC28593a1)), c28655q, 432);
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(title, subtitle, cta, cancelCta, options, function3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 1572864;
            interfaceC4339a2 = interfaceC4339a;
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40160f(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39681c(28);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q);
                }
                InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
                if ((i15 & 3670016) == 1048576) {
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C39272e(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R2, new C3948a0(3), AbstractC37817c.m121344e(1815973224, c28655q, new C3466p(title, subtitle, options, cta, function4, cancelCta, interfaceC4339a3, interfaceC28593a2)), c28655q, 432);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(title, subtitle, cta, cancelCta, options, function3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40160f(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39681c(28);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q);
                }
                InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R;
                if ((i15 & 3670016) == 1048576) {
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C39272e(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a3, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R2, new C3948a0(3), AbstractC37817c.m121344e(1815973224, c28655q, new C3466p(title, subtitle, options, cta, function4, cancelCta, interfaceC4339a3, interfaceC28593a3)), c28655q, 432);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(title, subtitle, cta, cancelCta, options, function3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 1572864;
        interfaceC4339a2 = interfaceC4339a;
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C40160f(6);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39681c(28);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R;
            if ((i15 & 3670016) == 1048576) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C39272e(interfaceC4339a3, 18);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39272e(interfaceC4339a3, 18);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R2, new C3948a0(3), AbstractC37817c.m121344e(1815973224, c28655q, new C3466p(title, subtitle, options, cta, function4, cancelCta, interfaceC4339a3, interfaceC28593a4)), c28655q, 432);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(title, subtitle, cta, cancelCta, options, function3, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m128903k(C12878a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128904l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final int m128905m(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: n */
    private static final void m128906n(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m128907o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128908p(TextResource textResource, TextResource textResource2, List list, TextResource textResource3, Function1 function1, TextResource textResource4, InterfaceC4339a interfaceC4339a, InterfaceC28593a1 interfaceC28593a1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC17911t abstractC17911tM44012U = AbstractC15673b0.m44012U();
            float f13 = 8;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3394p(4 * f13, AbstractC1092a.m3357b(c2314t, abstractC17911tM44012U, c33252iM105489e, 0.0f, 4))), "Dialog Container");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i14), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16, 196600);
            float f14 = 3 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC14046c.m39968h(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(list)), Integer.valueOf(m128905m(interfaceC28593a1)), AbstractC1136a.m3599a(c2314t, "Radio Group"), null, null, AbstractC37817c.m121344e(-133888472, c28655q, new C37462n(list, interfaceC28593a1, 1)), c28655q, 196992, 24);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(list);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C31324k(function1, list, interfaceC28593a1, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22280i.m64006d(false, textResource3, null, null, null, (InterfaceC4339a) objM87133R, c28655q, i14 << 3, 29);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 1.5d) * f13, c2314t));
            boolean zM87153g2 = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39272e(interfaceC4339a, 19);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22284m.m64016d(textResource4, (InterfaceC4339a) objM87133R2, c28655q, i14, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m128909q(List list, InterfaceC28593a1 interfaceC28593a1, InterfaceC1103a RadioGroupVertical, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroupVertical, "$this$RadioGroupVertical");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = i14 | (((C28655q) composer).m87149e(i13) ? 32 : 16);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1041) != 1040)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(((C12878a) list.get(i13)).getText());
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            boolean z4 = m128905m(interfaceC28593a1) == i13;
            boolean z13 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C6516c(i13, interfaceC28593a1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, 0L, z4, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 384, 233);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m128910r(int i13, InterfaceC28593a1 interfaceC28593a1, boolean z4) {
        m128906n(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m128911s(Function1 function1, List list, InterfaceC28593a1 interfaceC28593a1) {
        function1.invoke(list.get(m128905m(interfaceC28593a1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m128912t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m128913u(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, List list, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m128902j(textResource, textResource2, textResource3, textResource4, list, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
