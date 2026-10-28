package p710im1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.models.calendar.CalendarDateModel;
import em1.C13348v;
import fm1.C14599c;
import fm1.EnumC14603g;
import g51.C15493c;
import h91.C17027b;
import hy0.EnumC17753i0;
import i22.C18014b;
import ih0.C18510t;
import java.time.LocalDate;
import kb1.AbstractC22328h;
import kb1.C22325e;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15170v4;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v81.AbstractC35798c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: im1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lem1/v;", "homeViewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onCalendarPaged", "Lkb1/e;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "onCalendarDateClick", "f", "(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "m", "(Lem1/v;Landroidx/compose/runtime/Composer;I)J", "Lhy0/i0;", "l", "(Lem1/v;)Lhy0/i0;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18668f {

    /* JADX INFO: renamed from: im1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73248a;

        static {
            int[] iArr = new int[EnumC14603g.values().length];
            try {
                iArr[EnumC14603g.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14603g.OVERVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14603g.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14603g.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73248a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m54182f(C13348v homeViewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        LocalDate localDateM37576c;
        Integer numValueOf;
        Function1 function9;
        Function1 function10;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(homeViewState, "homeViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-229312787);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(homeViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18510t(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18510t(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    localDateM37576c = homeViewState.getCurrentCalendarDate();
                    if (localDateM37576c != null) {
                        numValueOf = Integer.valueOf(localDateM37576c.getDayOfMonth());
                    } else {
                        numValueOf = null;
                    }
                    if (homeViewState.m37575b() != null || numValueOf == null) {
                        function9 = function7;
                        function10 = function8;
                        c28655q.m87150e0(-610423320);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-611613038);
                        long jM125408n = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkAlt();
                        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1092a.m3358c(c2314t, jM125408n, c17916v0));
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        int iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
                        EnumC17753i0 enumC17753i0M54188l = m54188l(homeViewState);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 4 * 8, 0.0f, 0.0f, 13);
                        C17027b<CalendarDateModel> c17027bM37575b = homeViewState.m37575b();
                        int monthOffset = homeViewState.m37575b().getMonthOffset();
                        boolean z14 = (i15 & 896) == 256;
                        Object objM87133R3 = c28655q.m87133R();
                        if (z14 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C18664d(function8, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function11 = (Function1) objM87133R3;
                        Object objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C18014b(11);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = function8;
                        Function1 function12 = function7;
                        AbstractC35798c.m113506j(modifierM3398t, 0, monthOffset, 0.0f, function11, function12, enumC17753i0M54188l, c17027bM37575b, (InterfaceC4351m) objM87133R4, c28655q, ((i15 << 12) & 458752) | 100663302 | (C17027b.f65485k << 21), 10);
                        function9 = function12;
                        c28655q = c28655q;
                        C17027b<CalendarDateModel> c17027bM37575b2 = homeViewState.m37575b();
                        if (c17027bM37575b2 == null || !c17027bM37575b2.getIsLoading()) {
                            z13 = false;
                            c28655q.m87150e0(-1427053831);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1427389220);
                            long jM54189m = m54189m(homeViewState, c28655q, i15 & 14);
                            AbstractC15170v4.m43203c(AbstractC1102d.m3409f(1.0f, c2314t), jM54189m, C17919x.m51541c(0.1f, jM54189m), c28655q, 6);
                            z13 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(z13);
                    }
                    function6 = function10;
                    function5 = function9;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18666e(homeViewState, function5, function6, i13, i14, 0);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18510t(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18510t(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                localDateM37576c = homeViewState.getCurrentCalendarDate();
                if (localDateM37576c != null) {
                    numValueOf = Integer.valueOf(localDateM37576c.getDayOfMonth());
                } else {
                    numValueOf = null;
                }
                if (homeViewState.m37575b() != null) {
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87150e0(-610423320);
                    c28655q.m87173q(false);
                } else {
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87150e0(-610423320);
                    c28655q.m87173q(false);
                }
                function6 = function10;
                function5 = function9;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18666e(homeViewState, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18510t(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18510t(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                localDateM37576c = homeViewState.getCurrentCalendarDate();
                if (localDateM37576c != null) {
                    numValueOf = Integer.valueOf(localDateM37576c.getDayOfMonth());
                } else {
                    numValueOf = null;
                }
                if (homeViewState.m37575b() != null) {
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87150e0(-610423320);
                    c28655q.m87173q(false);
                } else {
                    function9 = function7;
                    function10 = function8;
                    c28655q.m87150e0(-610423320);
                    c28655q.m87173q(false);
                }
                function6 = function10;
                function5 = function9;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18666e(homeViewState, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18510t(14);
                    c28655q.m87172p0(objM87133R2);
                }
                function7 = (Function1) objM87133R2;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18510t(15);
                    c28655q.m87172p0(objM87133R);
                }
                function8 = (Function1) objM87133R;
            } else {
                function8 = function4;
            }
            localDateM37576c = homeViewState.getCurrentCalendarDate();
            if (localDateM37576c != null) {
                numValueOf = Integer.valueOf(localDateM37576c.getDayOfMonth());
            } else {
                numValueOf = null;
            }
            if (homeViewState.m37575b() != null) {
                function9 = function7;
                function10 = function8;
                c28655q.m87150e0(-610423320);
                c28655q.m87173q(false);
            } else {
                function9 = function7;
                function10 = function8;
                c28655q.m87150e0(-610423320);
                c28655q.m87173q(false);
            }
            function6 = function10;
            function5 = function9;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18666e(homeViewState, function5, function6, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m54183g(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m54184h(C22325e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m54185i(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke((C22325e) it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C15493c m54186j(C17027b domainState, int i13) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return AbstractC22328h.m64210c(domainState, i13, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m54187k(C13348v c13348v, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m54182f(c13348v, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final EnumC17753i0 m54188l(C13348v c13348v) {
        EnumC17753i0 enumC17753i0;
        C14599c c14599cM37585l = c13348v.getHomeFeed();
        if (c14599cM37585l != null) {
            int i13 = a.f73248a[c14599cM37585l.m41769b().get(c13348v.getCurrentPageIndex()).getPillarType().ordinal()];
            if (i13 == 1) {
                enumC17753i0 = EnumC17753i0.STRAIN;
            } else if (i13 == 2 || i13 == 3) {
                enumC17753i0 = EnumC17753i0.RECOVERY;
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC17753i0 = EnumC17753i0.SLEEP;
            }
            if (enumC17753i0 != null) {
                return enumC17753i0;
            }
        }
        return EnumC17753i0.STRAIN;
    }

    /* JADX INFO: renamed from: m */
    private static final long m54189m(C13348v c13348v, Composer composer, int i13) {
        long jM125403k0;
        C17919x c17919xM31989h;
        C14599c c14599cM37585l = c13348v.getHomeFeed();
        if (c14599cM37585l == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1149642304);
            c28655q.m87173q(false);
            c17919xM31989h = null;
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1149642303);
            int i14 = a.f73248a[c14599cM37585l.m41769b().get(c13348v.getCurrentPageIndex()).getPillarType().ordinal()];
            if (i14 == 1) {
                c28655q2.m87150e0(930482426);
                jM125403k0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getStrain();
                c28655q2.m87173q(false);
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    throw AbstractC11895b.m32003v(930478693, c28655q2, false);
                }
                c28655q2.m87150e0(930485596);
                jM125403k0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                c28655q2.m87173q(false);
            }
            c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, jM125403k0);
        }
        if (c17919xM31989h != null) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(655650709);
            c28655q3.m87173q(false);
            return c17919xM31989h.f69639a;
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(655660226);
        long jM125403k1 = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getStrain();
        c28655q4.m87173q(false);
        return jM125403k1;
    }
}
