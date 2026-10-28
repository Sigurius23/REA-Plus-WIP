package ek2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bk2.AbstractC3357d;
import by1.C3695b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9785i;
import d42.C11699o;
import ej1.C13228a;
import ej1.C13251n;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import java.time.LocalDate;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ek2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aq\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "forwardButtonEnabled", "", "forwardDate", "backButtonEnabled", "backDate", "Lcom/whoop/design/util/TextResource;", "text", "Lkotlin/Function1;", "Lbk2/b;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "displayCalendar", "dateSelectorClicked", "g", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13305b {
    /* JADX INFO: renamed from: g */
    public static final void m37386g(boolean z4, String forwardDate, boolean z13, String backDate, TextResource text, Function1 onViewEvent, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        Function1 function2;
        InterfaceC4339a interfaceC4339a3;
        Function1 function3;
        Function1 function4;
        AbstractC22676k.m65750j(forwardDate, "forwardDate");
        AbstractC22676k.m65750j(backDate, "backDate");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-985234997);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(forwardDate) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(backDate) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(text) : c28655q.m87157i(text) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i16 = i14 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 1572864) == 0) {
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 1048576 : 524288;
            }
        }
        int i17 = i14 & 128;
        if (i17 != 0) {
            i15 |= 12582912;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 12582912) == 0) {
                i15 |= c28655q.m87157i(function2) ? 8388608 : 4194304;
            }
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 4793491) != 4793490)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C13228a(2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13251n(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            boolean z14 = (3670016 & i15) == 1048576;
            Object objM87133R3 = c28655q.m87133R();
            int i18 = 14;
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C11699o(interfaceC4339a2, i18);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R3, 15);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(2 * 8, C2299e.f9111N), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Function1 function5 = function4;
            AbstractC27274q.c cVar = AbstractC27274q.c.f109140f;
            C27270o c27270o = new C27270o(cVar, AbstractC16319p0.m46430a().getTinyIcons().getBackwardArrow(), null, null, null, z13, false, false, 0.0f, false, 988, null);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62276R0, c28655q, 0);
            int i19 = 29360128 & i15;
            int i24 = i15 & 458752;
            int i25 = i15;
            boolean z15 = ((i15 & 7168) == 2048) | (i19 == 8388608) | (i24 == 131072);
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                objM87133R4 = new C3695b(function5, onViewEvent, backDate, 1);
                c28655q.m87172p0(objM87133R4);
            }
            int i26 = C27270o.f109105k;
            interfaceC4339a3 = interfaceC4339a2;
            AbstractC27242b1.m82092d(c27270o, strM21273g, null, null, (InterfaceC4339a) objM87133R4, c28655q, i26, 12);
            C38072d c38072d = C38072d.f163053a;
            int i27 = C38072d.f163054b;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, TextResource.$stable | ((i25 >> 12) & 14)), null, c38072d.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            c28655q = c28655q;
            C27270o c27270o2 = new C27270o(cVar, AbstractC16319p0.m46430a().getTinyIcons().getForwardArrow(), null, null, null, z4, false, false, 0.0f, false, 988, null);
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62333h2, c28655q, 0);
            boolean z16 = (i24 == 131072) | (i19 == 8388608) | ((i25 & 112) == 32);
            Object objM87133R5 = c28655q.m87133R();
            if (z16 || objM87133R5 == c28676v0) {
                objM87133R5 = new C3695b(function5, onViewEvent, forwardDate, 2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC27242b1.m82092d(c27270o2, strM21273g2, null, null, (InterfaceC4339a) objM87133R5, c28655q, i26, 12);
            c28655q.m87173q(true);
            function3 = function5;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(z4, forwardDate, z13, backDate, text, onViewEvent, interfaceC4339a3, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m37387h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37388i(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37389j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37390k(Function1 function1, Function1 function2, String str) {
        function1.invoke(Boolean.FALSE);
        LocalDate localDate = LocalDate.parse(str);
        AbstractC22676k.m65749i(localDate, "parse(...)");
        function2.invoke(new AbstractC3357d.a(localDate, null, false, 6, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37391l(Function1 function1, Function1 function2, String str) {
        function1.invoke(Boolean.TRUE);
        LocalDate localDate = LocalDate.parse(str);
        AbstractC22676k.m65749i(localDate, "parse(...)");
        function2.invoke(new AbstractC3357d.a(localDate, null, false, 6, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37392m(boolean z4, String str, boolean z13, String str2, TextResource textResource, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m37386g(z4, str, z13, str2, textResource, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
