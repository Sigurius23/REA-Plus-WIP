package vo1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarErrorType;
import fy1.AbstractC14874j;
import g51.AbstractC15492b;
import g51.C15493c;
import gb1.AbstractC15673b0;
import h91.C17027b;
import hc3.AbstractC17176i;
import i11.AbstractC17862e;
import j11.AbstractC21211n;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import kb1.AbstractC22324d;
import kb1.C22325e;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p545v6.C35728q;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p734sl0.C32632k2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pj2.C29308g;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qy0.C30775h;
import qy0.InterfaceC30768a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.C31777n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import so1.AbstractC32832p;
import so1.C32824l;
import to1.AbstractC34008a;
import uv0.AbstractC35283c;
import uz1.C35429g;
import v31.C35608d;
import v41.C35657b0;
import ve.C35916a;
import ve0.C35926d;
import w81.AbstractC36945c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38480c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vo1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010!\u001a\u00020 2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00120\u001cj\u0002`\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lso1/p;", "viewState", "Lkotlin/Function1;", "Lto1/a;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPress", "u", "(Lso1/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lso1/p$f;", "Lkotlin/Function2;", "", "", "onCalendarPaged", "C", "(Lso1/p$f;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "domainState", "monthIndex", "", "", "periodOverrides", "Lg51/c;", "S", "(Lh91/b;ILjava/util/Map;)Lg51/c;", "Lkb1/e;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "dateArgs", "overrides", "Lqy0/h;", "R", "(Lkb1/e;Ljava/util/Map;)Lqy0/h;", "showSavingDialog", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36229d {

    /* JADX INFO: renamed from: vo1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarScreenKt$LogCalendarScreen$7$1", m100430f = "LogCalendarScreen.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155136w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f155137x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155137x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f155137x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155136w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f155136w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f155137x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155138a;

        static {
            int[] iArr = new int[LogCalendarErrorType.values().length];
            try {
                iArr[LogCalendarErrorType.SELECTION_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogCalendarErrorType.GENERIC_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155138a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m115381A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m115382B(AbstractC32832p abstractC32832p, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115421u(abstractC32832p, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x0307  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x0402  */
    /* JADX WARN: Code duplicated, block: B:118:0x0410  */
    /* JADX WARN: Code duplicated, block: B:123:0x043c  */
    /* JADX WARN: Code duplicated, block: B:124:0x043e  */
    /* JADX WARN: Code duplicated, block: B:127:0x044d  */
    /* JADX WARN: Code duplicated, block: B:128:0x044f  */
    /* JADX WARN: Code duplicated, block: B:131:0x046c  */
    /* JADX WARN: Code duplicated, block: B:132:0x046f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0479  */
    /* JADX WARN: Code duplicated, block: B:138:0x047e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0485  */
    /* JADX WARN: Code duplicated, block: B:143:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:147:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0506  */
    /* JADX WARN: Code duplicated, block: B:154:0x053a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0565  */
    /* JADX WARN: Code duplicated, block: B:159:0x0594  */
    /* JADX WARN: Code duplicated, block: B:162:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x0204  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0227  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    /* JADX WARN: Code duplicated, block: B:90:0x026b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0272  */
    /* JADX WARN: Code duplicated, block: B:96:0x0277  */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    /* JADX INFO: renamed from: C */
    public static final void m115383C(AbstractC32832p.f viewState, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        InterfaceC4351m interfaceC4351m2;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4351m interfaceC4351m3;
        Object objM87133R;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28593a1 interfaceC28593a2;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC4339a interfaceC4339a4;
        C28676v0 c28676v1;
        int i18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R3;
        C28676v0 c28676v2;
        InterfaceC4339a interfaceC4339a5;
        Function1 function5;
        C28676v0 c28676v3;
        int iHashCode2;
        C28655q c28655q;
        int iHashCode3;
        boolean z14;
        boolean z15;
        int i19;
        boolean z16;
        boolean z17;
        Object objM87133R4;
        C28676v0 c28676v4;
        C28676v0 c28676v5;
        Function1 function6;
        InterfaceC28593a1 interfaceC28593a3;
        C28676v0 c28676v6;
        Function1 function7;
        C28621h1 c28621h1;
        boolean z18;
        boolean z19;
        Object objM87133R5;
        Function1 function8;
        Object objM87133R6;
        Object objM87133R7;
        boolean z24;
        Object objM87133R8;
        Object objM87133R9;
        Object objM87133R10;
        Object objM87133R11;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1324613449);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35926d(15);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function4 = (Function1) objM87133R11;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35916a(19);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
                    }
                    if ((i14 & 8) != 0) {
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35728q(6, (byte) 0);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R9;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(viewState.getSelectedIndex(), c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (m115387G(interfaceC28601c1)) {
                        c28655q2.m87150e0(600819730);
                        C32824l c32824lM103034h = viewState.getSavingModal();
                        TextResource textResourceM103001d = c32824lM103034h.getTitle();
                        TextResource textResourceM102998a = c32824lM103034h.getDescription();
                        TextResource textResourceM102999b = c32824lM103034h.getPrimaryButtonText();
                        TextResource textResourceM103000c = c32824lM103034h.getSecondaryButtonText();
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C35429g(5, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R7;
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R8 = c28655q2.m87133R();
                        if (z24 || objM87133R8 == c28676v0) {
                            objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        int i25 = TextResource.$stable;
                        c28676v1 = c28676v0;
                        interfaceC4339a4 = interfaceC4339a2;
                        interfaceC28593a2 = interfaceC28593a1;
                        interfaceC28601c2 = interfaceC28601c1;
                        i18 = 0;
                        AbstractC21211n.m59497o(null, textResourceM103001d, textResourceM102998a, textResourceM102999b, false, null, null, null, null, textResourceM103000c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a6, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i25 << 3) | (i25 << 6) | (i25 << 9) | (i25 << 27), 0, 384, 247463409);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        interfaceC28593a2 = interfaceC28593a1;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC4339a4 = interfaceC4339a2;
                        c28676v1 = c28676v0;
                        i18 = 0;
                        c28655q2.m87150e0(601335787);
                        c28655q2.m87173q(false);
                    }
                    C2314t c2314t = C2314t.f9131w;
                    float f13 = 6;
                    float f14 = 8;
                    float f15 = 4;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)), 0.0f, f13 * f14, 0.0f, f15 * f14, 5);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, i18);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    TextResource textResourceM103032f = viewState.getNavigationTitle();
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM103032f, null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z13) {
                        c28676v2 = c28676v1;
                    } else {
                        c28676v2 = c28676v1;
                        if (objM87133R3 == c28676v2) {
                            interfaceC4339a5 = interfaceC4339a4;
                        }
                        InterfaceC4339a interfaceC4339a7 = interfaceC4339a5;
                        function5 = function4;
                        c28676v3 = c28676v2;
                        AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, c2314t);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                        TextResource textResourceM103036j = viewState.getTitle();
                        int i26 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM103036j, c28655q2, i26);
                        int i27 = C38072d.f163054b;
                        C2886a c2886aM8418P = c38072d.m121952e(c28655q2, i27).getT3();
                        long jM125430y = c38072d.m121949b(c28655q2, i27).getBrandWhite();
                        int i28 = C2886a.f11498d << 18;
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i28, 196602);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f15, c2314t));
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i26), null, c38072d.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB2(), null, c28655q, 0, i28, 196602);
                        float f16 = f15 * f15;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
                        Modifier modifierM3424u = AbstractC1102d.m3424u(36 * f15, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        Modifier modifierM3411h = AbstractC1102d.m3411h(12 * f15, c2314t);
                        TextResource textResourceM81028a = viewState.getMonthPicker().getCurrentDateRange();
                        if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        String strM81030c = viewState.getMonthPicker().getPrevDateTime();
                        String strM81029b = viewState.getMonthPicker().getNextDateTime();
                        boolean zM87157i = c28655q.m87157i(viewState);
                        i19 = i15 & 112;
                        if (i19 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i | z16;
                        objM87133R4 = c28655q.m87133R();
                        if (z17) {
                            c28676v4 = c28676v3;
                        } else {
                            c28676v4 = c28676v3;
                            if (objM87133R4 == c28676v4) {
                                c28676v5 = c28676v4;
                                function6 = function5;
                                interfaceC28593a3 = interfaceC28593a2;
                            }
                            c28676v6 = c28676v5;
                            function7 = function6;
                            AbstractC17862e.m51358q(modifierM3411h, false, null, textResourceM81028a, z14, z15, strM81030c, strM81029b, null, null, null, null, (Function1) objM87133R4, c28655q, (i26 << 9) | 6, 0, 3846);
                            AbstractC17176i.m48516r(c28655q, true, c2314t, f16, c28655q);
                            c28621h1 = (C28621h1) interfaceC28593a3;
                            C15493c c15493cM115399S = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                            int iM87024x = 119 - c28621h1.m87024x();
                            boolean zM87157i2 = c28655q.m87157i(viewState);
                            if (i19 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = zM87157i2 | z18;
                            objM87133R5 = c28655q.m87133R();
                            if (!z19 || objM87133R5 == c28676v6) {
                                function8 = function7;
                                objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                function8 = function7;
                            }
                            AbstractC36945c.m118620i(c2314t, 120, iM87024x, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S, function8)), c28655q, 196662, 16);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC11895b.m32006y(1.0f, true, c28655q);
                            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                            String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i26);
                            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f15, 0.0f, 2);
                            boolean zM103037k = viewState.getIsSaveEnabled();
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v6) {
                                objM87133R6 = new C35429g(6, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM21274h2, zM103037k, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                            c28655q2 = c28655q;
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            function3 = function8;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a3 = interfaceC4339a7;
                        }
                        c28676v5 = c28676v4;
                        function6 = function5;
                        interfaceC28593a3 = interfaceC28593a2;
                        objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                        c28655q.m87172p0(objM87133R4);
                        c28676v6 = c28676v5;
                        function7 = function6;
                        AbstractC17862e.m51358q(modifierM3411h, false, null, textResourceM81028a, z14, z15, strM81030c, strM81029b, null, null, null, null, (Function1) objM87133R4, c28655q, (i26 << 9) | 6, 0, 3846);
                        AbstractC17176i.m48516r(c28655q, true, c2314t, f16, c28655q);
                        c28621h1 = (C28621h1) interfaceC28593a3;
                        C15493c c15493cM115399S2 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                        int iM87024x2 = 119 - c28621h1.m87024x();
                        boolean zM87157i3 = c28655q.m87157i(viewState);
                        if (i19 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i3 | z18;
                        objM87133R5 = c28655q.m87133R();
                        if (z19) {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC36945c.m118620i(c2314t, 120, iM87024x2, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S2, function8)), c28655q, 196662, 16);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC11895b.m32006y(1.0f, true, c28655q);
                        EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                        String strM21274h3 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i26);
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f15, 0.0f, 2);
                        boolean zM103037k2 = viewState.getIsSaveEnabled();
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v6) {
                            objM87133R6 = new C35429g(6, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27282u.m82292h(modifierM3396r2, enumC27284v2, strM21274h3, zM103037k2, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function3 = function8;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a3 = interfaceC4339a7;
                    }
                    interfaceC4339a5 = interfaceC4339a4;
                    objM87133R3 = new C31918g(interfaceC4339a5, 16);
                    c28655q2.m87172p0(objM87133R3);
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a5;
                    function5 = function4;
                    c28676v3 = c28676v2;
                    AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f14, c2314t);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    TextResource textResourceM103036j2 = viewState.getTitle();
                    int i29 = TextResource.$stable;
                    String strM21274h4 = AbstractC8693b.m21274h(textResourceM103036j2, c28655q2, i29);
                    int i210 = C38072d.f163054b;
                    C2886a c2886aM8418P2 = c38072d.m121952e(c28655q2, i210).getT3();
                    long jM125430y2 = c38072d.m121949b(c28655q2, i210).getBrandWhite();
                    int i211 = C2886a.f11498d << 18;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h4, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 0, i211, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f15, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i29), null, c38072d.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i210).getB2(), null, c28655q, 0, i211, 196602);
                    float f17 = f15 * f15;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                    Modifier modifierM3424u2 = AbstractC1102d.m3424u(36 * f15, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    Modifier modifierM3411h2 = AbstractC1102d.m3411h(12 * f15, c2314t);
                    TextResource textResourceM81028a2 = viewState.getMonthPicker().getCurrentDateRange();
                    if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    String strM81030c2 = viewState.getMonthPicker().getPrevDateTime();
                    String strM81029b2 = viewState.getMonthPicker().getNextDateTime();
                    boolean zM87157i4 = c28655q.m87157i(viewState);
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i4 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        c28676v4 = c28676v3;
                        if (objM87133R4 == c28676v4) {
                            c28676v5 = c28676v4;
                            function6 = function5;
                            interfaceC28593a3 = interfaceC28593a2;
                        }
                        c28676v6 = c28676v5;
                        function7 = function6;
                        AbstractC17862e.m51358q(modifierM3411h2, false, null, textResourceM81028a2, z14, z15, strM81030c2, strM81029b2, null, null, null, null, (Function1) objM87133R4, c28655q, (i29 << 9) | 6, 0, 3846);
                        AbstractC17176i.m48516r(c28655q, true, c2314t, f17, c28655q);
                        c28621h1 = (C28621h1) interfaceC28593a3;
                        C15493c c15493cM115399S3 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                        int iM87024x3 = 119 - c28621h1.m87024x();
                        boolean zM87157i5 = c28655q.m87157i(viewState);
                        if (i19 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i5 | z18;
                        objM87133R5 = c28655q.m87133R();
                        if (z19) {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC36945c.m118620i(c2314t, 120, iM87024x3, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S3, function8)), c28655q, 196662, 16);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC11895b.m32006y(1.0f, true, c28655q);
                        EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                        String strM21274h5 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i29);
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f15, 0.0f, 2);
                        boolean zM103037k3 = viewState.getIsSaveEnabled();
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v6) {
                            objM87133R6 = new C35429g(6, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27282u.m82292h(modifierM3396r3, enumC27284v3, strM21274h5, zM103037k3, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function3 = function8;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a3 = interfaceC4339a8;
                    } else {
                        c28676v4 = c28676v3;
                    }
                    c28676v5 = c28676v4;
                    function6 = function5;
                    interfaceC28593a3 = interfaceC28593a2;
                    objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                    c28655q.m87172p0(objM87133R4);
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h2, false, null, textResourceM81028a2, z14, z15, strM81030c2, strM81029b2, null, null, null, null, (Function1) objM87133R4, c28655q, (i29 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t, f17, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S4 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x4 = 119 - c28621h1.m87024x();
                    boolean zM87157i6 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i6 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t, 120, iM87024x4, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S4, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                    String strM21274h6 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i29);
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f15, 0.0f, 2);
                    boolean zM103037k4 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r4, enumC27284v4, strM21274h6, zM103037k4, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a8;
                } else {
                    c28655q2.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function3, interfaceC4339a3, interfaceC4351m2, i13, i14, 18);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35926d(15);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function4 = (Function1) objM87133R11;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35916a(19);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
                }
                if ((i14 & 8) != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35728q(6, (byte) 0);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R9;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(viewState.getSelectedIndex(), c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (m115387G(interfaceC28601c1)) {
                    c28655q2.m87150e0(600819730);
                    C32824l c32824lM103034h2 = viewState.getSavingModal();
                    TextResource textResourceM103001d2 = c32824lM103034h2.getTitle();
                    TextResource textResourceM102998a2 = c32824lM103034h2.getDescription();
                    TextResource textResourceM102999b2 = c32824lM103034h2.getPrimaryButtonText();
                    TextResource textResourceM103000c2 = c32824lM103034h2.getSecondaryButtonText();
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35429g(5, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R7;
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (z24) {
                        objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    int i212 = TextResource.$stable;
                    c28676v1 = c28676v0;
                    interfaceC4339a4 = interfaceC4339a2;
                    interfaceC28593a2 = interfaceC28593a1;
                    interfaceC28601c2 = interfaceC28601c1;
                    i18 = 0;
                    AbstractC21211n.m59497o(null, textResourceM103001d2, textResourceM102998a2, textResourceM102999b2, false, null, null, null, null, textResourceM103000c2, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a9, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i212 << 3) | (i212 << 6) | (i212 << 9) | (i212 << 27), 0, 384, 247463409);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28593a2 = interfaceC28593a1;
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC4339a4 = interfaceC4339a2;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c28655q2.m87150e0(601335787);
                    c28655q2.m87173q(false);
                }
                C2314t c2314t2 = C2314t.f9131w;
                float f18 = 6;
                float f19 = 8;
                float f110 = 4;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)), 0.0f, f18 * f19, 0.0f, f110 * f19, 5);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, i18);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                TextResource textResourceM103032f2 = viewState.getNavigationTitle();
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM103032f2, null, AbstractC38963t7.m124375e(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                    if (objM87133R3 == c28676v2) {
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a5;
                    function5 = function4;
                    c28676v3 = c28676v2;
                    AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f19, c2314t2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m7);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N7);
                    TextResource textResourceM103036j3 = viewState.getTitle();
                    int i213 = TextResource.$stable;
                    String strM21274h7 = AbstractC8693b.m21274h(textResourceM103036j3, c28655q2, i213);
                    int i214 = C38072d.f163054b;
                    C2886a c2886aM8418P3 = c38072d2.m121952e(c28655q2, i214).getT3();
                    long jM125430y3 = c38072d2.m121949b(c28655q2, i214).getBrandWhite();
                    int i215 = C2886a.f11498d << 18;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h7, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 0, i215, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f110, c2314t2));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i213), null, c38072d2.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i214).getB2(), null, c28655q, 0, i215, 196602);
                    float f111 = f110 * f110;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t2));
                    Modifier modifierM3424u3 = AbstractC1102d.m3424u(36 * f110, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3424u3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
                    Modifier modifierM3411h3 = AbstractC1102d.m3411h(12 * f110, c2314t2);
                    TextResource textResourceM81028a3 = viewState.getMonthPicker().getCurrentDateRange();
                    if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    String strM81030c3 = viewState.getMonthPicker().getPrevDateTime();
                    String strM81029b3 = viewState.getMonthPicker().getNextDateTime();
                    boolean zM87157i7 = c28655q.m87157i(viewState);
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i7 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        c28676v4 = c28676v3;
                        if (objM87133R4 == c28676v4) {
                            c28676v5 = c28676v4;
                            function6 = function5;
                            interfaceC28593a3 = interfaceC28593a2;
                        }
                        c28676v6 = c28676v5;
                        function7 = function6;
                        AbstractC17862e.m51358q(modifierM3411h3, false, null, textResourceM81028a3, z14, z15, strM81030c3, strM81029b3, null, null, null, null, (Function1) objM87133R4, c28655q, (i213 << 9) | 6, 0, 3846);
                        AbstractC17176i.m48516r(c28655q, true, c2314t2, f111, c28655q);
                        c28621h1 = (C28621h1) interfaceC28593a3;
                        C15493c c15493cM115399S5 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                        int iM87024x5 = 119 - c28621h1.m87024x();
                        boolean zM87157i8 = c28655q.m87157i(viewState);
                        if (i19 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i8 | z18;
                        objM87133R5 = c28655q.m87133R();
                        if (z19) {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC36945c.m118620i(c2314t2, 120, iM87024x5, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S5, function8)), c28655q, 196662, 16);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC11895b.m32006y(1.0f, true, c28655q);
                        EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                        String strM21274h8 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i213);
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f18 * f110, 0.0f, 2);
                        boolean zM103037k5 = viewState.getIsSaveEnabled();
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v6) {
                            objM87133R6 = new C35429g(6, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27282u.m82292h(modifierM3396r5, enumC27284v5, strM21274h8, zM103037k5, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function3 = function8;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a3 = interfaceC4339a10;
                    } else {
                        c28676v4 = c28676v3;
                    }
                    c28676v5 = c28676v4;
                    function6 = function5;
                    interfaceC28593a3 = interfaceC28593a2;
                    objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                    c28655q.m87172p0(objM87133R4);
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h3, false, null, textResourceM81028a3, z14, z15, strM81030c3, strM81029b3, null, null, null, null, (Function1) objM87133R4, c28655q, (i213 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t2, f111, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S6 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x6 = 119 - c28621h1.m87024x();
                    boolean zM87157i9 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i9 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t2, 120, iM87024x6, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S6, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                    String strM21274h9 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i213);
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f18 * f110, 0.0f, 2);
                    boolean zM103037k6 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r6, enumC27284v6, strM21274h9, zM103037k6, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a10;
                } else {
                    c28676v2 = c28676v1;
                }
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R3 = new C31918g(interfaceC4339a5, 16);
                c28655q2.m87172p0(objM87133R3);
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a5;
                function5 = function4;
                c28676v3 = c28676v2;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f19, c2314t2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N9);
                TextResource textResourceM103036j4 = viewState.getTitle();
                int i216 = TextResource.$stable;
                String strM21274h10 = AbstractC8693b.m21274h(textResourceM103036j4, c28655q2, i216);
                int i217 = C38072d.f163054b;
                C2886a c2886aM8418P4 = c38072d2.m121952e(c28655q2, i217).getT3();
                long jM125430y4 = c38072d2.m121949b(c28655q2, i217).getBrandWhite();
                int i218 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h10, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 0, i218, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f110, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i216), null, c38072d2.m121949b(c28655q, i217).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i217).getB2(), null, c28655q, 0, i218, 196602);
                float f112 = f110 * f110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f112, c2314t2));
                Modifier modifierM3424u4 = AbstractC1102d.m3424u(36 * f110, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3424u4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N10);
                Modifier modifierM3411h4 = AbstractC1102d.m3411h(12 * f110, c2314t2);
                TextResource textResourceM81028a4 = viewState.getMonthPicker().getCurrentDateRange();
                if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                String strM81030c4 = viewState.getMonthPicker().getPrevDateTime();
                String strM81029b4 = viewState.getMonthPicker().getNextDateTime();
                boolean zM87157i10 = c28655q.m87157i(viewState);
                i19 = i15 & 112;
                if (i19 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i10 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    c28676v4 = c28676v3;
                    if (objM87133R4 == c28676v4) {
                        c28676v5 = c28676v4;
                        function6 = function5;
                        interfaceC28593a3 = interfaceC28593a2;
                    }
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h4, false, null, textResourceM81028a4, z14, z15, strM81030c4, strM81029b4, null, null, null, null, (Function1) objM87133R4, c28655q, (i216 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t2, f112, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S7 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x7 = 119 - c28621h1.m87024x();
                    boolean zM87157i11 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i11 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t2, 120, iM87024x7, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S7, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                    String strM21274h11 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i216);
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f18 * f110, 0.0f, 2);
                    boolean zM103037k7 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r7, enumC27284v7, strM21274h11, zM103037k7, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a11;
                } else {
                    c28676v4 = c28676v3;
                }
                c28676v5 = c28676v4;
                function6 = function5;
                interfaceC28593a3 = interfaceC28593a2;
                objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                c28655q.m87172p0(objM87133R4);
                c28676v6 = c28676v5;
                function7 = function6;
                AbstractC17862e.m51358q(modifierM3411h4, false, null, textResourceM81028a4, z14, z15, strM81030c4, strM81029b4, null, null, null, null, (Function1) objM87133R4, c28655q, (i216 << 9) | 6, 0, 3846);
                AbstractC17176i.m48516r(c28655q, true, c2314t2, f112, c28655q);
                c28621h1 = (C28621h1) interfaceC28593a3;
                C15493c c15493cM115399S8 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                int iM87024x8 = 119 - c28621h1.m87024x();
                boolean zM87157i12 = c28655q.m87157i(viewState);
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i12 | z18;
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC36945c.m118620i(c2314t2, 120, iM87024x8, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S8, function8)), c28655q, 196662, 16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
                String strM21274h12 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i216);
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f18 * f110, 0.0f, 2);
                boolean zM103037k8 = viewState.getIsSaveEnabled();
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v6) {
                    objM87133R6 = new C35429g(6, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27282u.m82292h(modifierM3396r8, enumC27284v8, strM21274h12, zM103037k8, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a3 = interfaceC4339a11;
            } else {
                c28655q2.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function3, interfaceC4339a3, interfaceC4351m2, i13, i14, 18);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
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
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35926d(15);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function4 = (Function1) objM87133R11;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35916a(19);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
                }
                if ((i14 & 8) != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35728q(6, (byte) 0);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R9;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(viewState.getSelectedIndex(), c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (m115387G(interfaceC28601c1)) {
                    c28655q2.m87150e0(600819730);
                    C32824l c32824lM103034h3 = viewState.getSavingModal();
                    TextResource textResourceM103001d3 = c32824lM103034h3.getTitle();
                    TextResource textResourceM102998a3 = c32824lM103034h3.getDescription();
                    TextResource textResourceM102999b3 = c32824lM103034h3.getPrimaryButtonText();
                    TextResource textResourceM103000c3 = c32824lM103034h3.getSecondaryButtonText();
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35429g(5, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R7;
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R8 = c28655q2.m87133R();
                    if (z24) {
                        objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    int i219 = TextResource.$stable;
                    c28676v1 = c28676v0;
                    interfaceC4339a4 = interfaceC4339a2;
                    interfaceC28593a2 = interfaceC28593a1;
                    interfaceC28601c2 = interfaceC28601c1;
                    i18 = 0;
                    AbstractC21211n.m59497o(null, textResourceM103001d3, textResourceM102998a3, textResourceM102999b3, false, null, null, null, null, textResourceM103000c3, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a12, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i219 << 3) | (i219 << 6) | (i219 << 9) | (i219 << 27), 0, 384, 247463409);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    interfaceC28593a2 = interfaceC28593a1;
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC4339a4 = interfaceC4339a2;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c28655q2.m87150e0(601335787);
                    c28655q2.m87173q(false);
                }
                C2314t c2314t3 = C2314t.f9131w;
                float f113 = 6;
                float f114 = 8;
                float f115 = 4;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3)), 0.0f, f113 * f114, 0.0f, f115 * f114, 5);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, i18);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a7);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N11);
                TextResource textResourceM103032f3 = viewState.getNavigationTitle();
                C38072d c38072d3 = C38072d.f163053a;
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM103032f3, null, AbstractC38963t7.m124375e(c38072d3), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                    if (objM87133R3 == c28676v2) {
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a5;
                    function5 = function4;
                    c28676v3 = c28676v2;
                    AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                    Modifier modifierM3394p5 = AbstractC1099a.m3394p(2 * f114, c2314t3);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3394p5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N12);
                    TextResource textResourceM103036j5 = viewState.getTitle();
                    int i2110 = TextResource.$stable;
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM103036j5, c28655q2, i2110);
                    int i2111 = C38072d.f163054b;
                    C2886a c2886aM8418P5 = c38072d3.m121952e(c28655q2, i2111).getT3();
                    long jM125430y5 = c38072d3.m121949b(c28655q2, i2111).getBrandWhite();
                    int i2112 = C2886a.f11498d << 18;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(strM21274h13, null, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P5, null, c28655q, 0, i2112, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f115, c2314t3));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i2110), null, c38072d3.m121949b(c28655q, i2111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i2111).getB2(), null, c28655q, 0, i2112, 196602);
                    float f116 = f115 * f115;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f116, c2314t3));
                    Modifier modifierM3424u5 = AbstractC1102d.m3424u(36 * f115, c2314t3);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3424u5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N13);
                    Modifier modifierM3411h5 = AbstractC1102d.m3411h(12 * f115, c2314t3);
                    TextResource textResourceM81028a5 = viewState.getMonthPicker().getCurrentDateRange();
                    if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    String strM81030c5 = viewState.getMonthPicker().getPrevDateTime();
                    String strM81029b5 = viewState.getMonthPicker().getNextDateTime();
                    boolean zM87157i13 = c28655q.m87157i(viewState);
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i13 | z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        c28676v4 = c28676v3;
                        if (objM87133R4 == c28676v4) {
                            c28676v5 = c28676v4;
                            function6 = function5;
                            interfaceC28593a3 = interfaceC28593a2;
                        }
                        c28676v6 = c28676v5;
                        function7 = function6;
                        AbstractC17862e.m51358q(modifierM3411h5, false, null, textResourceM81028a5, z14, z15, strM81030c5, strM81029b5, null, null, null, null, (Function1) objM87133R4, c28655q, (i2110 << 9) | 6, 0, 3846);
                        AbstractC17176i.m48516r(c28655q, true, c2314t3, f116, c28655q);
                        c28621h1 = (C28621h1) interfaceC28593a3;
                        C15493c c15493cM115399S9 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                        int iM87024x9 = 119 - c28621h1.m87024x();
                        boolean zM87157i14 = c28655q.m87157i(viewState);
                        if (i19 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i14 | z18;
                        objM87133R5 = c28655q.m87133R();
                        if (z19) {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function8 = function7;
                            objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC36945c.m118620i(c2314t3, 120, iM87024x9, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S9, function8)), c28655q, 196662, 16);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC11895b.m32006y(1.0f, true, c28655q);
                        EnumC27284v enumC27284v9 = EnumC27284v.TextLarge;
                        String strM21274h14 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2110);
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f113 * f115, 0.0f, 2);
                        boolean zM103037k9 = viewState.getIsSaveEnabled();
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v6) {
                            objM87133R6 = new C35429g(6, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27282u.m82292h(modifierM3396r9, enumC27284v9, strM21274h14, zM103037k9, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                        c28655q2 = c28655q;
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function3 = function8;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a3 = interfaceC4339a13;
                    } else {
                        c28676v4 = c28676v3;
                    }
                    c28676v5 = c28676v4;
                    function6 = function5;
                    interfaceC28593a3 = interfaceC28593a2;
                    objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                    c28655q.m87172p0(objM87133R4);
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h5, false, null, textResourceM81028a5, z14, z15, strM81030c5, strM81029b5, null, null, null, null, (Function1) objM87133R4, c28655q, (i2110 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t3, f116, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S10 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x10 = 119 - c28621h1.m87024x();
                    boolean zM87157i15 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i15 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t3, 120, iM87024x10, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S10, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v10 = EnumC27284v.TextLarge;
                    String strM21274h15 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2110);
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f113 * f115, 0.0f, 2);
                    boolean zM103037k10 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r10, enumC27284v10, strM21274h15, zM103037k10, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a13;
                } else {
                    c28676v2 = c28676v1;
                }
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R3 = new C31918g(interfaceC4339a5, 16);
                c28655q2.m87172p0(objM87133R3);
                InterfaceC4339a interfaceC4339a14 = interfaceC4339a5;
                function5 = function4;
                c28676v3 = c28676v2;
                AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3394p6 = AbstractC1099a.m3394p(2 * f114, c2314t3);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3394p6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N14);
                TextResource textResourceM103036j6 = viewState.getTitle();
                int i2113 = TextResource.$stable;
                String strM21274h16 = AbstractC8693b.m21274h(textResourceM103036j6, c28655q2, i2113);
                int i2114 = C38072d.f163054b;
                C2886a c2886aM8418P6 = c38072d3.m121952e(c28655q2, i2114).getT3();
                long jM125430y6 = c38072d3.m121949b(c28655q2, i2114).getBrandWhite();
                int i2115 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h16, null, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P6, null, c28655q, 0, i2115, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f115, c2314t3));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i2113), null, c38072d3.m121949b(c28655q, i2114).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i2114).getB2(), null, c28655q, 0, i2115, 196602);
                float f117 = f115 * f115;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f117, c2314t3));
                Modifier modifierM3424u6 = AbstractC1102d.m3424u(36 * f115, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3424u6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N15);
                Modifier modifierM3411h6 = AbstractC1102d.m3411h(12 * f115, c2314t3);
                TextResource textResourceM81028a6 = viewState.getMonthPicker().getCurrentDateRange();
                if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                String strM81030c6 = viewState.getMonthPicker().getPrevDateTime();
                String strM81029b6 = viewState.getMonthPicker().getNextDateTime();
                boolean zM87157i16 = c28655q.m87157i(viewState);
                i19 = i15 & 112;
                if (i19 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i16 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    c28676v4 = c28676v3;
                    if (objM87133R4 == c28676v4) {
                        c28676v5 = c28676v4;
                        function6 = function5;
                        interfaceC28593a3 = interfaceC28593a2;
                    }
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h6, false, null, textResourceM81028a6, z14, z15, strM81030c6, strM81029b6, null, null, null, null, (Function1) objM87133R4, c28655q, (i2113 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t3, f117, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S11 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x11 = 119 - c28621h1.m87024x();
                    boolean zM87157i17 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i17 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t3, 120, iM87024x11, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S11, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v11 = EnumC27284v.TextLarge;
                    String strM21274h17 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2113);
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f113 * f115, 0.0f, 2);
                    boolean zM103037k11 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r11, enumC27284v11, strM21274h17, zM103037k11, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a14;
                } else {
                    c28676v4 = c28676v3;
                }
                c28676v5 = c28676v4;
                function6 = function5;
                interfaceC28593a3 = interfaceC28593a2;
                objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                c28655q.m87172p0(objM87133R4);
                c28676v6 = c28676v5;
                function7 = function6;
                AbstractC17862e.m51358q(modifierM3411h6, false, null, textResourceM81028a6, z14, z15, strM81030c6, strM81029b6, null, null, null, null, (Function1) objM87133R4, c28655q, (i2113 << 9) | 6, 0, 3846);
                AbstractC17176i.m48516r(c28655q, true, c2314t3, f117, c28655q);
                c28621h1 = (C28621h1) interfaceC28593a3;
                C15493c c15493cM115399S12 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                int iM87024x12 = 119 - c28621h1.m87024x();
                boolean zM87157i18 = c28655q.m87157i(viewState);
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i18 | z18;
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC36945c.m118620i(c2314t3, 120, iM87024x12, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S12, function8)), c28655q, 196662, 16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                EnumC27284v enumC27284v12 = EnumC27284v.TextLarge;
                String strM21274h18 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2113);
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f113 * f115, 0.0f, 2);
                boolean zM103037k12 = viewState.getIsSaveEnabled();
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v6) {
                    objM87133R6 = new C35429g(6, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27282u.m82292h(modifierM3396r12, enumC27284v12, strM21274h18, zM103037k12, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a3 = interfaceC4339a14;
            } else {
                c28655q2.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function3, interfaceC4339a3, interfaceC4351m2, i13, i14, 18);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C35926d(15);
                    c28655q2.m87172p0(objM87133R11);
                }
                function4 = (Function1) objM87133R11;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C35916a(19);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
            }
            if ((i14 & 8) != 0) {
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C35728q(6, (byte) 0);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R9;
            } else {
                interfaceC4351m3 = interfaceC4351m;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(viewState.getSelectedIndex(), c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            if (m115387G(interfaceC28601c1)) {
                c28655q2.m87150e0(600819730);
                C32824l c32824lM103034h4 = viewState.getSavingModal();
                TextResource textResourceM103001d4 = c32824lM103034h4.getTitle();
                TextResource textResourceM102998a4 = c32824lM103034h4.getDescription();
                TextResource textResourceM102999b4 = c32824lM103034h4.getPrimaryButtonText();
                TextResource textResourceM103000c4 = c32824lM103034h4.getSecondaryButtonText();
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35429g(5, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R7;
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R8 = c28655q2.m87133R();
                if (z24) {
                    objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C29308g(function4, interfaceC28601c1, 8);
                    c28655q2.m87172p0(objM87133R8);
                }
                int i2116 = TextResource.$stable;
                c28676v1 = c28676v0;
                interfaceC4339a4 = interfaceC4339a2;
                interfaceC28593a2 = interfaceC28593a1;
                interfaceC28601c2 = interfaceC28601c1;
                i18 = 0;
                AbstractC21211n.m59497o(null, textResourceM103001d4, textResourceM102998a4, textResourceM102999b4, false, null, null, null, null, textResourceM103000c4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a15, null, (InterfaceC4339a) objM87133R8, null, null, null, c28655q2, (i2116 << 3) | (i2116 << 6) | (i2116 << 9) | (i2116 << 27), 0, 384, 247463409);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                interfaceC28593a2 = interfaceC28593a1;
                interfaceC28601c2 = interfaceC28601c1;
                interfaceC4339a4 = interfaceC4339a2;
                c28676v1 = c28676v0;
                i18 = 0;
                c28655q2.m87150e0(601335787);
                c28655q2.m87173q(false);
            }
            C2314t c2314t4 = C2314t.f9131w;
            float f118 = 6;
            float f119 = 8;
            float f1110 = 4;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t4)), 0.0f, f118 * f119, 0.0f, f1110 * f119, 5);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, i18);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a10);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N16);
            TextResource textResourceM103032f4 = viewState.getNavigationTitle();
            C38072d c38072d4 = C38072d.f163053a;
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResourceM103032f4, null, AbstractC38963t7.m124375e(c38072d4), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z13) {
                c28676v2 = c28676v1;
                if (objM87133R3 == c28676v2) {
                    interfaceC4339a5 = interfaceC4339a4;
                }
                InterfaceC4339a interfaceC4339a16 = interfaceC4339a5;
                function5 = function4;
                c28676v3 = c28676v2;
                AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(2 * f119, c2314t4);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3394p7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m17);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N17);
                TextResource textResourceM103036j7 = viewState.getTitle();
                int i2117 = TextResource.$stable;
                String strM21274h19 = AbstractC8693b.m21274h(textResourceM103036j7, c28655q2, i2117);
                int i2118 = C38072d.f163054b;
                C2886a c2886aM8418P7 = c38072d4.m121952e(c28655q2, i2118).getT3();
                long jM125430y7 = c38072d4.m121949b(c28655q2, i2118).getBrandWhite();
                int i2119 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h19, null, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P7, null, c28655q, 0, i2119, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f1110, c2314t4));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i2117), null, c38072d4.m121949b(c28655q, i2118).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i2118).getB2(), null, c28655q, 0, i2119, 196602);
                float f1111 = f1110 * f1110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1111, c2314t4));
                Modifier modifierM3424u7 = AbstractC1102d.m3424u(36 * f1110, c2314t4);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3424u7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N18);
                Modifier modifierM3411h7 = AbstractC1102d.m3411h(12 * f1110, c2314t4);
                TextResource textResourceM81028a7 = viewState.getMonthPicker().getCurrentDateRange();
                if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                String strM81030c7 = viewState.getMonthPicker().getPrevDateTime();
                String strM81029b7 = viewState.getMonthPicker().getNextDateTime();
                boolean zM87157i19 = c28655q.m87157i(viewState);
                i19 = i15 & 112;
                if (i19 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i19 | z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    c28676v4 = c28676v3;
                    if (objM87133R4 == c28676v4) {
                        c28676v5 = c28676v4;
                        function6 = function5;
                        interfaceC28593a3 = interfaceC28593a2;
                    }
                    c28676v6 = c28676v5;
                    function7 = function6;
                    AbstractC17862e.m51358q(modifierM3411h7, false, null, textResourceM81028a7, z14, z15, strM81030c7, strM81029b7, null, null, null, null, (Function1) objM87133R4, c28655q, (i2117 << 9) | 6, 0, 3846);
                    AbstractC17176i.m48516r(c28655q, true, c2314t4, f1111, c28655q);
                    c28621h1 = (C28621h1) interfaceC28593a3;
                    C15493c c15493cM115399S13 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                    int iM87024x13 = 119 - c28621h1.m87024x();
                    boolean zM87157i110 = c28655q.m87157i(viewState);
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i110 | z18;
                    objM87133R5 = c28655q.m87133R();
                    if (z19) {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function8 = function7;
                        objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC36945c.m118620i(c2314t4, 120, iM87024x13, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S13, function8)), c28655q, 196662, 16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    EnumC27284v enumC27284v13 = EnumC27284v.TextLarge;
                    String strM21274h110 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2117);
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f118 * f1110, 0.0f, 2);
                    boolean zM103037k13 = viewState.getIsSaveEnabled();
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v6) {
                        objM87133R6 = new C35429g(6, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27282u.m82292h(modifierM3396r13, enumC27284v13, strM21274h110, zM103037k13, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                    c28655q2 = c28655q;
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a3 = interfaceC4339a16;
                } else {
                    c28676v4 = c28676v3;
                }
                c28676v5 = c28676v4;
                function6 = function5;
                interfaceC28593a3 = interfaceC28593a2;
                objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
                c28655q.m87172p0(objM87133R4);
                c28676v6 = c28676v5;
                function7 = function6;
                AbstractC17862e.m51358q(modifierM3411h7, false, null, textResourceM81028a7, z14, z15, strM81030c7, strM81029b7, null, null, null, null, (Function1) objM87133R4, c28655q, (i2117 << 9) | 6, 0, 3846);
                AbstractC17176i.m48516r(c28655q, true, c2314t4, f1111, c28655q);
                c28621h1 = (C28621h1) interfaceC28593a3;
                C15493c c15493cM115399S14 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                int iM87024x14 = 119 - c28621h1.m87024x();
                boolean zM87157i111 = c28655q.m87157i(viewState);
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i111 | z18;
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC36945c.m118620i(c2314t4, 120, iM87024x14, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S14, function8)), c28655q, 196662, 16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                EnumC27284v enumC27284v14 = EnumC27284v.TextLarge;
                String strM21274h111 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i2117);
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f118 * f1110, 0.0f, 2);
                boolean zM103037k14 = viewState.getIsSaveEnabled();
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v6) {
                    objM87133R6 = new C35429g(6, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27282u.m82292h(modifierM3396r14, enumC27284v14, strM21274h111, zM103037k14, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a3 = interfaceC4339a16;
            } else {
                c28676v2 = c28676v1;
            }
            interfaceC4339a5 = interfaceC4339a4;
            objM87133R3 = new C31918g(interfaceC4339a5, 16);
            c28655q2.m87172p0(objM87133R3);
            InterfaceC4339a interfaceC4339a17 = interfaceC4339a5;
            function5 = function4;
            c28676v3 = c28676v2;
            AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3394p8 = AbstractC1099a.m3394p(2 * f119, c2314t4);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3394p8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m19);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N19);
            TextResource textResourceM103036j8 = viewState.getTitle();
            int i21110 = TextResource.$stable;
            String strM21274h112 = AbstractC8693b.m21274h(textResourceM103036j8, c28655q2, i21110);
            int i21111 = C38072d.f163054b;
            C2886a c2886aM8418P8 = c38072d4.m121952e(c28655q2, i21111).getT3();
            long jM125430y8 = c38072d4.m121949b(c28655q2, i21111).getBrandWhite();
            int i21112 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h112, null, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P8, null, c28655q, 0, i21112, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f1110, c2314t4));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i21110), null, c38072d4.m121949b(c28655q, i21111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i21111).getB2(), null, c28655q, 0, i21112, 196602);
            float f1112 = f1110 * f1110;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f1112, c2314t4));
            Modifier modifierM3424u8 = AbstractC1102d.m3424u(36 * f1110, c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3424u8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N110);
            Modifier modifierM3411h8 = AbstractC1102d.m3411h(12 * f1110, c2314t4);
            TextResource textResourceM81028a8 = viewState.getMonthPicker().getCurrentDateRange();
            if (viewState.getMonthPicker().getPrevDateTime().length() > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (viewState.getMonthPicker().getNextDateTime().length() > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            String strM81030c8 = viewState.getMonthPicker().getPrevDateTime();
            String strM81029b8 = viewState.getMonthPicker().getNextDateTime();
            boolean zM87157i112 = c28655q.m87157i(viewState);
            i19 = i15 & 112;
            if (i19 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i112 | z16;
            objM87133R4 = c28655q.m87133R();
            if (z17) {
                c28676v4 = c28676v3;
                if (objM87133R4 == c28676v4) {
                    c28676v5 = c28676v4;
                    function6 = function5;
                    interfaceC28593a3 = interfaceC28593a2;
                }
                c28676v6 = c28676v5;
                function7 = function6;
                AbstractC17862e.m51358q(modifierM3411h8, false, null, textResourceM81028a8, z14, z15, strM81030c8, strM81029b8, null, null, null, null, (Function1) objM87133R4, c28655q, (i21110 << 9) | 6, 0, 3846);
                AbstractC17176i.m48516r(c28655q, true, c2314t4, f1112, c28655q);
                c28621h1 = (C28621h1) interfaceC28593a3;
                C15493c c15493cM115399S15 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
                int iM87024x15 = 119 - c28621h1.m87024x();
                boolean zM87157i113 = c28655q.m87157i(viewState);
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i113 | z18;
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function8 = function7;
                    objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC36945c.m118620i(c2314t4, 120, iM87024x15, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S15, function8)), c28655q, 196662, 16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                EnumC27284v enumC27284v15 = EnumC27284v.TextLarge;
                String strM21274h113 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i21110);
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f118 * f1110, 0.0f, 2);
                boolean zM103037k15 = viewState.getIsSaveEnabled();
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v6) {
                    objM87133R6 = new C35429g(6, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27282u.m82292h(modifierM3396r15, enumC27284v15, strM21274h113, zM103037k15, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
                c28655q2 = c28655q;
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a3 = interfaceC4339a17;
            } else {
                c28676v4 = c28676v3;
            }
            c28676v5 = c28676v4;
            function6 = function5;
            interfaceC28593a3 = interfaceC28593a2;
            objM87133R4 = new C32290f((Object) viewState, (Object) interfaceC28593a3, function6, 22);
            c28655q.m87172p0(objM87133R4);
            c28676v6 = c28676v5;
            function7 = function6;
            AbstractC17862e.m51358q(modifierM3411h8, false, null, textResourceM81028a8, z14, z15, strM81030c8, strM81029b8, null, null, null, null, (Function1) objM87133R4, c28655q, (i21110 << 9) | 6, 0, 3846);
            AbstractC17176i.m48516r(c28655q, true, c2314t4, f1112, c28655q);
            c28621h1 = (C28621h1) interfaceC28593a3;
            C15493c c15493cM115399S16 = m115399S(viewState.m103029c(), c28621h1.m87024x(), viewState.m103033g());
            int iM87024x16 = 119 - c28621h1.m87024x();
            boolean zM87157i114 = c28655q.m87157i(viewState);
            if (i19 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zM87157i114 | z18;
            objM87133R5 = c28655q.m87133R();
            if (z19) {
                function8 = function7;
                objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                c28655q.m87172p0(objM87133R5);
            } else {
                function8 = function7;
                objM87133R5 = new C32290f((Object) c28621h1, (Object) viewState, function8, 23);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC36945c.m118620i(c2314t4, 120, iM87024x16, (Function1) objM87133R5, null, AbstractC37817c.m121344e(170531918, c28655q, new C28119c(29, c15493cM115399S16, function8)), c28655q, 196662, 16);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            EnumC27284v enumC27284v16 = EnumC27284v.TextLarge;
            String strM21274h114 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q, i21110);
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f118 * f1110, 0.0f, 2);
            boolean zM103037k16 = viewState.getIsSaveEnabled();
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v6) {
                objM87133R6 = new C35429g(6, interfaceC28601c2);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC27282u.m82292h(modifierM3396r16, enumC27284v16, strM21274h114, zM103037k16, 0L, null, false, (InterfaceC4339a) objM87133R6, c28655q, 12582966, 112);
            c28655q2 = c28655q;
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            function3 = function8;
            interfaceC4351m2 = interfaceC4351m3;
            interfaceC4339a3 = interfaceC4339a17;
        } else {
            c28655q2.m87138X();
            interfaceC4351m2 = interfaceC4351m;
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function3, interfaceC4339a3, interfaceC4351m2, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m115384D(AbstractC34008a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m115385E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m115386F(int i13, String str) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m115387G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m115388H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m115389I(InterfaceC28601c1 interfaceC28601c1) {
        m115388H(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m115390J(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(AbstractC34008a.b.f142514a);
        m115388H(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m115391K(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m115392L(AbstractC32832p.f fVar, InterfaceC28593a1 interfaceC28593a1, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        String str = (String) it;
        if (str.equals(fVar.getMonthPicker().getPrevDateTime())) {
            C28621h1 c28621h1 = (C28621h1) interfaceC28593a1;
            c28621h1.m87025y(c28621h1.m87024x() + 1);
        } else if (str.equals(fVar.getMonthPicker().getNextDateTime())) {
            C28621h1 c28621h2 = (C28621h1) interfaceC28593a1;
            int iM87024x = c28621h2.m87024x() - 1;
            if (iM87024x < 0) {
                iM87024x = 0;
            }
            c28621h2.m87025y(iM87024x);
        }
        function1.invoke(new AbstractC34008a.a(str, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m115393M(int i13, InterfaceC28593a1 interfaceC28593a1, AbstractC32832p.f fVar, Function1 function1, int i14) {
        int i15 = (i13 - i14) - 1;
        ((C28621h1) interfaceC28593a1).m87025y(i15);
        function1.invoke(new AbstractC34008a.a(fVar.m103029c().m48085m(i15).getMonthDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m115394N(C15493c c15493c, Function1 function1, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15492b.m43693d(c15493c, 1.0f, null, (Function1) objM87133R, null, c28655q, C15493c.f58150e | 48, 20);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m115395O(Function1 function1, Object argument) {
        AbstractC22676k.m65750j(argument, "argument");
        C22325e c22325e = argument instanceof C22325e ? (C22325e) argument : null;
        if (c22325e != null && !((C22325e) argument).getIsFutureDay()) {
            String str = c22325e.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            AbstractC22676k.m65749i(str, "format(...)");
            CalendarDateModel calendarDateModel = (CalendarDateModel) c22325e.m64155g();
            function1.invoke(new AbstractC34008a.c(str, (calendarDateModel != null ? calendarDateModel.getDayState() : null) != CalendarDayState.PERIOD));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m115396P(InterfaceC28601c1 interfaceC28601c1) {
        m115388H(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m115397Q(AbstractC32832p.f fVar, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m115383C(fVar, function1, interfaceC4339a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX INFO: renamed from: R */
    public static final C30775h m115398R(C22325e<CalendarDateModel> dateArgs, Map<String, Boolean> overrides) {
        CalendarDayState dayState;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        EnumC39333f enumC39333f3;
        C39174f c39174f;
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        AbstractC22676k.m65750j(overrides, "overrides");
        Boolean bool = overrides.get(dateArgs.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        if (bool != null) {
            dayState = bool.equals(Boolean.TRUE) ? CalendarDayState.PERIOD : CalendarDayState.NONE;
        } else {
            CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
            if (calendarDateModelM64155g == null || (dayState = calendarDateModelM64155g.getDayState()) == null) {
                dayState = CalendarDayState.NONE;
            }
        }
        CalendarDayState calendarDayState = dayState;
        CalendarDateModel calendarDateModelM64155g2 = dateArgs.m64155g();
        C22325e c22325eM64149b = C22325e.m64149b(dateArgs, null, false, false, false, 0, null, null, calendarDateModelM64155g2 != null ? CalendarDateModel.copy$default(calendarDateModelM64155g2, null, false, null, calendarDayState, null, null, null, null, null, null, null, 2039, null) : null, 127, null);
        if (dateArgs.getIsFutureDay()) {
            enumC39333f = EnumC39333f.WHITE_50;
        } else {
            enumC39333f = calendarDayState == CalendarDayState.PERIOD ? EnumC39333f.BRAND_BLACK : EnumC39333f.BRAND_WHITE;
        }
        EnumC39333f enumC39333f4 = enumC39333f;
        EnumC39333f enumC39333f5 = (dateArgs.getIsFutureDay() || calendarDayState == CalendarDayState.PERIOD) ? null : EnumC39333f.BRAND_WHITE;
        CalendarDayState calendarDayState2 = CalendarDayState.PERIOD;
        if (calendarDayState != calendarDayState2) {
            if (dateArgs.getIsCurrentDay()) {
                enumC39333f3 = EnumC39333f.WHITE_20;
            } else {
                enumC39333f2 = null;
            }
            if (dateArgs.getIsCurrentDay() || calendarDayState == calendarDayState2) {
                c39174f = null;
            } else {
                c39174f = new C39174f(11 * 4);
            }
            return new C30775h(c22325eM64149b, AbstractC8693b.m21278l(c22325eM64149b.getDayTitle()), enumC39333f4, null, null, null, null, null, null, false, null, enumC39333f2, enumC39333f5, false, 0.0f, 7 * 4, c39174f, false, false, 419832, null);
        }
        enumC39333f3 = EnumC39333f.MCI_RED;
        enumC39333f2 = enumC39333f3;
        if (dateArgs.getIsCurrentDay()) {
            c39174f = null;
        } else {
            c39174f = null;
        }
        return new C30775h(c22325eM64149b, AbstractC8693b.m21278l(c22325eM64149b.getDayTitle()), enumC39333f4, null, null, null, null, null, null, false, null, enumC39333f2, enumC39333f5, false, 0.0f, 7 * 4, c39174f, false, false, 419832, null);
    }

    /* JADX INFO: renamed from: S */
    public static final C15493c m115399S(C17027b<CalendarDateModel> domainState, int i13, Map<String, Boolean> periodOverrides) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(periodOverrides, "periodOverrides");
        return AbstractC22324d.m64148a(domainState, i13, new C31777n(periodOverrides, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC30768a m115400T(Map map, C22325e dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        return m115398R(dateArgs, map);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0273  */
    /* JADX WARN: Code duplicated, block: B:105:0x0286  */
    /* JADX WARN: Code duplicated, block: B:107:0x0294  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:112:0x02da  */
    /* JADX WARN: Code duplicated, block: B:113:0x0308  */
    /* JADX WARN: Code duplicated, block: B:115:0x030c  */
    /* JADX WARN: Code duplicated, block: B:117:0x035f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0362  */
    /* JADX WARN: Code duplicated, block: B:121:0x0369  */
    /* JADX WARN: Code duplicated, block: B:125:0x0371  */
    /* JADX WARN: Code duplicated, block: B:127:0x0388  */
    /* JADX WARN: Code duplicated, block: B:129:0x0394  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x040d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0416  */
    /* JADX WARN: Code duplicated, block: B:144:0x0421  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0241  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x02ce, please report this as an issue */
    /* JADX INFO: renamed from: u */
    public static final void m115421u(final AbstractC32832p viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
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
        int i18;
        final Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        int i19;
        Function1 function5;
        InterfaceC4339a interfaceC4339a5;
        boolean z13;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a6;
        boolean z14;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        boolean z15;
        int i25;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R4;
        boolean z26;
        boolean z27;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(85216293);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
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
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C35926d(14);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function4 = (Function1) objM87133R7;
                        i18 = 32;
                    } else {
                        i18 = 32;
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C35916a(18);
                            c28655q.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i19 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_log_calendar", c28655q, i19 | 48);
                    if (viewState instanceof AbstractC32832p.f) {
                        c28655q.m87150e0(288489898);
                        m115383C((AbstractC32832p.f) viewState, function4, interfaceC4339a4, null, c28655q, i15 & 1022, 8);
                        c28655q.m87173q(false);
                        function5 = function4;
                        interfaceC4339a6 = interfaceC4339a4;
                    } else if (viewState instanceof AbstractC32832p.a) {
                        c28655q.m87150e0(353452694);
                        i24 = b.f155138a[((AbstractC32832p.a) viewState).getErrorType().ordinal()];
                        if (i24 != 1) {
                            z15 = false;
                            c28655q.m87150e0(353534100);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164863j));
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164861h));
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164862i));
                            i25 = i15 & 112;
                            if (i25 == i18) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (i19 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objM87133R3 = c28655q.m87133R();
                            if (z18 || objM87133R3 == c28676v0) {
                                final int i27 = 0;
                                objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                return AbstractC36229d.m115424x(function4, viewState);
                                            case 1:
                                                return AbstractC36229d.m115425y(function4, viewState);
                                            default:
                                                return AbstractC36229d.m115426z(function4, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                            if (i25 == i18) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (i19 == 4) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z19 | z24;
                            objM87133R4 = c28655q.m87133R();
                            if (z25 || objM87133R4 == c28676v0) {
                                final int i28 = 1;
                                objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                return AbstractC36229d.m115424x(function4, viewState);
                                            case 1:
                                                return AbstractC36229d.m115425y(function4, viewState);
                                            default:
                                                return AbstractC36229d.m115426z(function4, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                            int i29 = TextResource.$stable;
                            int i34 = (i29 << 3) | (i29 << 6) | (i29 << 9);
                            function5 = function4;
                            interfaceC4339a6 = interfaceC4339a4;
                            AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a8, null, interfaceC4339a9, null, null, null, c28655q, i34, 0, 0, 247463921);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (i24 == 2) {
                                throw AbstractC11895b.m32003v(288496364, c28655q, false);
                            }
                            c28655q.m87150e0(354341185);
                            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == i18) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z26 | (i19 == 4);
                            objM87133R5 = c28655q.m87133R();
                            if (z27 || objM87133R5 == c28676v0) {
                                final int i35 = 2;
                                objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i35) {
                                            case 0:
                                                return AbstractC36229d.m115424x(function4, viewState);
                                            case 1:
                                                return AbstractC36229d.m115425y(function4, viewState);
                                            default:
                                                return AbstractC36229d.m115426z(function4, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i36 = AbstractC33208p0.b.f138467h;
                            int i37 = TextResource.$stable;
                            z15 = false;
                            AbstractC33199m0.m105214F(bVar, textResourceM21278l4, null, textResourceM21278l5, (InterfaceC4339a) objM87133R5, false, false, null, null, null, false, false, c28655q, i36 | (i37 << 3) | (i37 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function4;
                            interfaceC4339a6 = interfaceC4339a4;
                        }
                        c28655q.m87173q(z15);
                    } else {
                        function5 = function4;
                        if (viewState.equals(AbstractC32832p.b.f136795b)) {
                            c28655q.m87150e0(354996742);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            interfaceC4339a5 = interfaceC4339a4;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a5 = interfaceC4339a4;
                            if (viewState.equals(AbstractC32832p.e.f136798b)) {
                                c28655q.m87150e0(355370726);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else if (viewState instanceof AbstractC32832p.d) {
                                c28655q.m87150e0(355573745);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool = Boolean.TRUE;
                                if ((i15 & 896) == 256) {
                                    c28655q = c28655q;
                                    z14 = true;
                                } else {
                                    c28655q = c28655q;
                                    z14 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (!z14 || objM87133R2 == c28676v0) {
                                    interfaceC4339a7 = interfaceC4339a5;
                                    objM87133R2 = new a(interfaceC4339a7, null);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    interfaceC4339a7 = interfaceC4339a5;
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool);
                                c28655q.m87173q(false);
                                interfaceC4339a6 = interfaceC4339a7;
                            } else {
                                if (viewState.equals(AbstractC32832p.c.f136796b)) {
                                    throw AbstractC11895b.m32003v(288491036, c28655q, false);
                                }
                                c28655q.m87150e0(355949310);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                                z13 = (i15 & 896) == 256;
                                objM87133R = c28655q.m87133R();
                                if (z13 || objM87133R == c28676v0) {
                                    objM87133R = new C31918g(interfaceC4339a5, 17);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i38 = AbstractC33208p0.b.f138467h;
                                int i39 = TextResource.$stable;
                                interfaceC4339a6 = interfaceC4339a5;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l6, null, textResourceM21278l7, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i38 | (i39 << 3) | (i39 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                        }
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    function3 = function5;
                    interfaceC4339a3 = interfaceC4339a6;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35608d((Object) viewState, function3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 11);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35926d(14);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                    i18 = 32;
                } else {
                    i18 = 32;
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35916a(18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i19 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_log_calendar", c28655q, i19 | 48);
                if (viewState instanceof AbstractC32832p.f) {
                    c28655q.m87150e0(288489898);
                    m115383C((AbstractC32832p.f) viewState, function4, interfaceC4339a4, null, c28655q, i15 & 1022, 8);
                    c28655q.m87173q(false);
                    function5 = function4;
                    interfaceC4339a6 = interfaceC4339a4;
                } else if (viewState instanceof AbstractC32832p.a) {
                    c28655q.m87150e0(353452694);
                    i24 = b.f155138a[((AbstractC32832p.a) viewState).getErrorType().ordinal()];
                    if (i24 != 1) {
                        z15 = false;
                        c28655q.m87150e0(353534100);
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164863j));
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164861h));
                        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164862i));
                        i25 = i15 & 112;
                        if (i25 == i18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i19 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            final int i210 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i211 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        if (i25 == i18) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i19 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z19 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            final int i212 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            final int i213 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R4;
                        int i214 = TextResource.$stable;
                        int i310 = (i214 << 3) | (i214 << 6) | (i214 << 9);
                        function5 = function4;
                        interfaceC4339a6 = interfaceC4339a4;
                        AbstractC21211n.m59497o(null, textResourceM21278l8, textResourceM21278l9, textResourceM21278l10, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a10, null, interfaceC4339a11, null, null, null, c28655q, i310, 0, 0, 247463921);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (i24 == 2) {
                            throw AbstractC11895b.m32003v(288496364, c28655q, false);
                        }
                        c28655q.m87150e0(354341185);
                        AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == i18) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | (i19 == 4);
                        objM87133R5 = c28655q.m87133R();
                        if (z27) {
                            final int i311 = 2;
                            objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i311) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            final int i312 = 2;
                            objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i312) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i313 = AbstractC33208p0.b.f138467h;
                        int i314 = TextResource.$stable;
                        z15 = false;
                        AbstractC33199m0.m105214F(bVar3, textResourceM21278l11, null, textResourceM21278l12, (InterfaceC4339a) objM87133R5, false, false, null, null, null, false, false, c28655q, i313 | (i314 << 3) | (i314 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function4;
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    c28655q.m87173q(z15);
                } else {
                    function5 = function4;
                    if (viewState.equals(AbstractC32832p.b.f136795b)) {
                        c28655q.m87150e0(354996742);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        interfaceC4339a5 = interfaceC4339a4;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a5 = interfaceC4339a4;
                        if (viewState.equals(AbstractC32832p.e.f136798b)) {
                            c28655q.m87150e0(355370726);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC32832p.d) {
                            c28655q.m87150e0(355573745);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool2 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14) {
                                interfaceC4339a7 = interfaceC4339a5;
                                objM87133R2 = new a(interfaceC4339a7, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                interfaceC4339a7 = interfaceC4339a5;
                                objM87133R2 = new a(interfaceC4339a7, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool2);
                            c28655q.m87173q(false);
                            interfaceC4339a6 = interfaceC4339a7;
                        } else {
                            if (viewState.equals(AbstractC32832p.c.f136796b)) {
                                throw AbstractC11895b.m32003v(288491036, c28655q, false);
                            }
                            c28655q.m87150e0(355949310);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 896) == 256) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C31918g(interfaceC4339a5, 17);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C31918g(interfaceC4339a5, 17);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i315 = AbstractC33208p0.b.f138467h;
                            int i316 = TextResource.$stable;
                            interfaceC4339a6 = interfaceC4339a5;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i315 | (i316 << 3) | (i316 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                    }
                    interfaceC4339a6 = interfaceC4339a5;
                }
                function3 = function5;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 11);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
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
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35926d(14);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                    i18 = 32;
                } else {
                    i18 = 32;
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35916a(18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i19 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_log_calendar", c28655q, i19 | 48);
                if (viewState instanceof AbstractC32832p.f) {
                    c28655q.m87150e0(288489898);
                    m115383C((AbstractC32832p.f) viewState, function4, interfaceC4339a4, null, c28655q, i15 & 1022, 8);
                    c28655q.m87173q(false);
                    function5 = function4;
                    interfaceC4339a6 = interfaceC4339a4;
                } else if (viewState instanceof AbstractC32832p.a) {
                    c28655q.m87150e0(353452694);
                    i24 = b.f155138a[((AbstractC32832p.a) viewState).getErrorType().ordinal()];
                    if (i24 != 1) {
                        z15 = false;
                        c28655q.m87150e0(353534100);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164863j));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164861h));
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164862i));
                        i25 = i15 & 112;
                        if (i25 == i18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i19 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            final int i215 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i215) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i216 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R3;
                        if (i25 == i18) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i19 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z19 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            final int i217 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i217) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            final int i218 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i218) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        int i219 = TextResource.$stable;
                        int i317 = (i219 << 3) | (i219 << 6) | (i219 << 9);
                        function5 = function4;
                        interfaceC4339a6 = interfaceC4339a4;
                        AbstractC21211n.m59497o(null, textResourceM21278l15, textResourceM21278l16, textResourceM21278l17, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a12, null, interfaceC4339a13, null, null, null, c28655q, i317, 0, 0, 247463921);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (i24 == 2) {
                            throw AbstractC11895b.m32003v(288496364, c28655q, false);
                        }
                        c28655q.m87150e0(354341185);
                        AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == i18) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | (i19 == 4);
                        objM87133R5 = c28655q.m87133R();
                        if (z27) {
                            final int i318 = 2;
                            objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i318) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            final int i319 = 2;
                            objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i319) {
                                        case 0:
                                            return AbstractC36229d.m115424x(function4, viewState);
                                        case 1:
                                            return AbstractC36229d.m115425y(function4, viewState);
                                        default:
                                            return AbstractC36229d.m115426z(function4, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i3110 = AbstractC33208p0.b.f138467h;
                        int i3111 = TextResource.$stable;
                        z15 = false;
                        AbstractC33199m0.m105214F(bVar5, textResourceM21278l18, null, textResourceM21278l19, (InterfaceC4339a) objM87133R5, false, false, null, null, null, false, false, c28655q, i3110 | (i3111 << 3) | (i3111 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function4;
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    c28655q.m87173q(z15);
                } else {
                    function5 = function4;
                    if (viewState.equals(AbstractC32832p.b.f136795b)) {
                        c28655q.m87150e0(354996742);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        interfaceC4339a5 = interfaceC4339a4;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a5 = interfaceC4339a4;
                        if (viewState.equals(AbstractC32832p.e.f136798b)) {
                            c28655q.m87150e0(355370726);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC32832p.d) {
                            c28655q.m87150e0(355573745);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool3 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14) {
                                interfaceC4339a7 = interfaceC4339a5;
                                objM87133R2 = new a(interfaceC4339a7, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                interfaceC4339a7 = interfaceC4339a5;
                                objM87133R2 = new a(interfaceC4339a7, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool3);
                            c28655q.m87173q(false);
                            interfaceC4339a6 = interfaceC4339a7;
                        } else {
                            if (viewState.equals(AbstractC32832p.c.f136796b)) {
                                throw AbstractC11895b.m32003v(288491036, c28655q, false);
                            }
                            c28655q.m87150e0(355949310);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 896) == 256) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C31918g(interfaceC4339a5, 17);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C31918g(interfaceC4339a5, 17);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3112 = AbstractC33208p0.b.f138467h;
                            int i3113 = TextResource.$stable;
                            interfaceC4339a6 = interfaceC4339a5;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l110, null, textResourceM21278l111, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3112 | (i3113 << 3) | (i3113 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                    }
                    interfaceC4339a6 = interfaceC4339a5;
                }
                function3 = function5;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 11);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35926d(14);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
                i18 = 32;
            } else {
                i18 = 32;
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C35916a(18);
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            i19 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_log_calendar", c28655q, i19 | 48);
            if (viewState instanceof AbstractC32832p.f) {
                c28655q.m87150e0(288489898);
                m115383C((AbstractC32832p.f) viewState, function4, interfaceC4339a4, null, c28655q, i15 & 1022, 8);
                c28655q.m87173q(false);
                function5 = function4;
                interfaceC4339a6 = interfaceC4339a4;
            } else if (viewState instanceof AbstractC32832p.a) {
                c28655q.m87150e0(353452694);
                i24 = b.f155138a[((AbstractC32832p.a) viewState).getErrorType().ordinal()];
                if (i24 != 1) {
                    z15 = false;
                    c28655q.m87150e0(353534100);
                    TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164863j));
                    TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164861h));
                    TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164862i));
                    i25 = i15 & 112;
                    if (i25 == i18) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i19 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        final int i2110 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2110) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i2111 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    if (i25 == i18) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i19 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z19 | z24;
                    objM87133R4 = c28655q.m87133R();
                    if (z25) {
                        final int i2112 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i2113 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R4;
                    int i2114 = TextResource.$stable;
                    int i3114 = (i2114 << 3) | (i2114 << 6) | (i2114 << 9);
                    function5 = function4;
                    interfaceC4339a6 = interfaceC4339a4;
                    AbstractC21211n.m59497o(null, textResourceM21278l112, textResourceM21278l113, textResourceM21278l114, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a14, null, interfaceC4339a15, null, null, null, c28655q, i3114, 0, 0, 247463921);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (i24 == 2) {
                        throw AbstractC11895b.m32003v(288496364, c28655q, false);
                    }
                    c28655q.m87150e0(354341185);
                    AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == i18) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | (i19 == 4);
                    objM87133R5 = c28655q.m87133R();
                    if (z27) {
                        final int i3115 = 2;
                        objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3115) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        final int i3116 = 2;
                        objM87133R5 = new InterfaceC4339a() { // from class: vo1.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3116) {
                                    case 0:
                                        return AbstractC36229d.m115424x(function4, viewState);
                                    case 1:
                                        return AbstractC36229d.m115425y(function4, viewState);
                                    default:
                                        return AbstractC36229d.m115426z(function4, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i3117 = AbstractC33208p0.b.f138467h;
                    int i3118 = TextResource.$stable;
                    z15 = false;
                    AbstractC33199m0.m105214F(bVar7, textResourceM21278l115, null, textResourceM21278l116, (InterfaceC4339a) objM87133R5, false, false, null, null, null, false, false, c28655q, i3117 | (i3118 << 3) | (i3118 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function4;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28655q.m87173q(z15);
            } else {
                function5 = function4;
                if (viewState.equals(AbstractC32832p.b.f136795b)) {
                    c28655q.m87150e0(354996742);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    interfaceC4339a5 = interfaceC4339a4;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a5 = interfaceC4339a4;
                    if (viewState.equals(AbstractC32832p.e.f136798b)) {
                        c28655q.m87150e0(355370726);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC32832p.d) {
                        c28655q.m87150e0(355573745);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        Boolean bool4 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            c28655q = c28655q;
                            z14 = true;
                        } else {
                            c28655q = c28655q;
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            interfaceC4339a7 = interfaceC4339a5;
                            objM87133R2 = new a(interfaceC4339a7, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            interfaceC4339a7 = interfaceC4339a5;
                            objM87133R2 = new a(interfaceC4339a7, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool4);
                        c28655q.m87173q(false);
                        interfaceC4339a6 = interfaceC4339a7;
                    } else {
                        if (viewState.equals(AbstractC32832p.c.f136796b)) {
                            throw AbstractC11895b.m32003v(288491036, c28655q, false);
                        }
                        c28655q.m87150e0(355949310);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 896) == 256) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C31918g(interfaceC4339a5, 17);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(interfaceC4339a5, 17);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3119 = AbstractC33208p0.b.f138467h;
                        int i31110 = TextResource.$stable;
                        interfaceC4339a6 = interfaceC4339a5;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l117, null, textResourceM21278l118, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3119 | (i31110 << 3) | (i31110 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                interfaceC4339a6 = interfaceC4339a5;
            }
            function3 = function5;
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) viewState, function3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m115422v(AbstractC34008a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m115423w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m115424x(Function1 function1, AbstractC32832p abstractC32832p) {
        function1.invoke(new AbstractC34008a.a(((AbstractC32832p.a) abstractC32832p).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m115425y(Function1 function1, AbstractC32832p abstractC32832p) {
        function1.invoke(new AbstractC34008a.a(((AbstractC32832p.a) abstractC32832p).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m115426z(Function1 function1, AbstractC32832p abstractC32832p) {
        function1.invoke(new AbstractC34008a.a(((AbstractC32832p.a) abstractC32832p).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }
}
