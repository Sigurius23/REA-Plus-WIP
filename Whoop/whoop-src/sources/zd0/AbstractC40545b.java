package zd0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import fy1.AbstractC14874j;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import java.util.List;
import kd0.InterfaceC22381a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kf0.AbstractC22431f;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11329a0;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p748zc1.C40349h7;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import w71.C36891k;
import wb3.AbstractC37056f;
import wd0.AbstractC37162a;
import wo1.C37450h;
import x81.C38072d;
import xd0.AbstractC38201e;
import yk2.C39609i;
import z51.C40103n;
import z72.C40157c;
import z72.C40159e;

/* JADX INFO: renamed from: zd0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Lxd0/e;", "viewState", "", "source", "Lkotlin/Function1;", "Lkd0/a$c;", "Ll83/a0;", "onAnalyticsEvent", "Lwd0/a;", "onNavigationEvent", "x", "(Lxd0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lxd0/e$c;", "o", "(Lxd0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "imageSource", "", "alpha", "m", "(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V", "", NotificationCompat.CATEGORY_EVENT, "C", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Ly3/f;", "a", "F", "backgroundImageGapHeight", "easedImageAlpha", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40545b {

    /* JADX INFO: renamed from: a */
    private static final float f174449a = 120;

    /* JADX INFO: renamed from: zd0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerScreenKt$SchedulePrimerScreen$5$1", m100430f = "SchedulePrimerScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174450w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f174451x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f174452y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC38201e f174453z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, AbstractC38201e abstractC38201e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174451x = function1;
            this.f174452y = str;
            this.f174453z = abstractC38201e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f174451x, this.f174452y, this.f174453z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f174450w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f174451x.invoke(new InterfaceC22381a.r0(this.f174452y, ((AbstractC38201e.c) this.f174453z).getLabel()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m131373A(Function1 function1) {
        function1.invoke(AbstractC37162a.a.f158924a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m131374B(AbstractC38201e abstractC38201e, String str, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m131399x(abstractC38201e, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m131375C(Function1 onNavigationEvent, Object event) {
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC37162a.b((C9598e) event));
        }
    }

    /* JADX INFO: renamed from: m */
    private static final void m131388m(AbstractC22403o abstractC22403o, float f13, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1954486560);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC34132o.m107879c(f13, C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9115x)), null, C39102j.f168202d, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40159e(abstractC22403o2, f13, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m131389n(AbstractC22403o abstractC22403o, float f13, int i13, Composer composer, int i14) {
        m131388m(abstractC22403o, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0401  */
    /* JADX WARN: Code duplicated, block: B:123:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0410  */
    /* JADX WARN: Code duplicated, block: B:130:0x0461  */
    /* JADX WARN: Code duplicated, block: B:131:0x0463  */
    /* JADX WARN: Code duplicated, block: B:133:0x0466  */
    /* JADX WARN: Code duplicated, block: B:136:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x047c  */
    /* JADX WARN: Code duplicated, block: B:141:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static final void m131390o(AbstractC38201e.c cVar, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Function1 function3;
        int i15;
        Function1 function4;
        int i16;
        boolean z4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        C13821r1 c13821r1M92099U;
        InterfaceC39171c interfaceC39171c;
        boolean zM87153g;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function8;
        int iHashCode2;
        int i17;
        boolean z13;
        Object objM87133R2;
        int i18;
        Function1 function9;
        int i19;
        C28676v0 c28676v1;
        Function1 function10;
        int iHashCode3;
        C0209i c0209i2;
        C0209i c0209i3;
        int iHashCode4;
        Function1 function11;
        boolean z14;
        boolean zM87157i;
        Object objM87133R3;
        Function1 function12;
        int i24;
        boolean z15;
        Object objM87133R4;
        Function1 function13;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC38201e.c viewState = cVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1753665657);
        int i25 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i25 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i25 |= i16;
                }
                if ((i25 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i25 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C40349h7(14);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40349h7(15);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87153g(interfaceC39171c);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q, i27).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                    C0209i c0209i5 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        function8 = function6;
                    } else {
                        function8 = function6;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                        m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t2), c28655q, AbstractC22403o.f87638a);
                        Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C2305k c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                        float f13 = 8;
                        float f14 = 2 * f13;
                        float f15 = 1 * f13;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, f15, 5);
                        AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        i17 = i25 & 896;
                        if (i17 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        i18 = i25;
                        if (z13 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C39609i(function7, 29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function9 = function7;
                        i19 = i17;
                        c28676v1 = c28676v0;
                        function10 = function8;
                        AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        float f16 = 16;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f16, 7);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t2, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16 * f13, c2314t));
                        String strM122340b = cVar.getHeader().getTitle();
                        C2886a c2886aM8417O = c38072d.m121952e(c28655q, i27).getT2();
                        long jM125430y = c38072d.m121949b(c28655q, i27).getBrandWhite();
                        Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, f15);
                        int i28 = C2886a.f11498d << 18;
                        c0209i3 = c0209i2;
                        AbstractC30795n.m94707h(strM122340b, modifierM3395q, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 48, i28, 196600);
                        AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), c38072d.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB1(), null, c28655q, 48, i28, 196600);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, 4, c2305k, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                        c28655q.m87150e0(1386033742);
                        for (InterfaceC25312u interfaceC25312u : cVar.m122351g()) {
                            i24 = i19;
                            if (i24 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            C28676v0 c28676v2 = c28676v1;
                            if (!z15 || objM87133R4 == c28676v2) {
                                function13 = function9;
                                objM87133R4 = new C37450h(function13, 25);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                function13 = function9;
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                            i19 = i24;
                            c28676v1 = c28676v2;
                            function9 = function13;
                        }
                        function11 = function9;
                        int i29 = i19;
                        C28676v0 c28676v3 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                        c28655q.m87173q(true);
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                        if ((i18 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z16 = i29 == 256;
                        viewState = cVar;
                        zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87157i || objM87133R3 == c28676v3) {
                            function12 = function10;
                            objM87133R3 = new C31324k(function12, function11, viewState, 28);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            function12 = function10;
                        }
                        AbstractC27292z.m82343j(modifierM3395q2, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function3 = function12;
                        function5 = function11;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                    m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t2), c28655q, AbstractC22403o.f87638a);
                    Modifier modifierM66724m2 = AbstractC22953f.m66724m(c2314t);
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9110M;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                    float f17 = 8;
                    float f18 = 2 * f17;
                    float f19 = 1 * f17;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f18, 0.0f, f19, 5);
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    i17 = i25 & 896;
                    if (i17 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    i18 = i25;
                    if (z13) {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function9 = function7;
                    i19 = i17;
                    c28676v1 = c28676v0;
                    function10 = function8;
                    AbstractC6719b.m20143d(modifierM3398t3, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    float f110 = 16;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f110, 7);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t4, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110 * f17, c2314t));
                    String strM122340b2 = cVar.getHeader().getTitle();
                    C2886a c2886aM8417O2 = c38072d.m121952e(c28655q, i27).getT2();
                    long jM125430y2 = c38072d.m121949b(c28655q, i27).getBrandWhite();
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(c2314t, f18, f19);
                    int i210 = C2886a.f11498d << 18;
                    c0209i3 = c0209i2;
                    AbstractC30795n.m94707h(strM122340b2, modifierM3395q3, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 48, i210, 196600);
                    AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t, f18, 0.0f, 2), c38072d.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB1(), null, c28655q, 48, i210, 196600);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f17, 4, c2305k2, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
                    c28655q.m87150e0(1386033742);
                    while (r1.hasNext()) {
                        i24 = i19;
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        C28676v0 c28676v4 = c28676v1;
                        if (z15) {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        i19 = i24;
                        c28676v1 = c28676v4;
                        function9 = function13;
                    }
                    function11 = function9;
                    int i211 = i19;
                    C28676v0 c28676v5 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                    c28655q.m87173q(true);
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f18, f19);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                    if ((i18 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i211 == 256) {
                    }
                    viewState = cVar;
                    zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27292z.m82343j(modifierM3395q4, false, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function12;
                    function5 = function11;
                } else {
                    c28655q.m87138X();
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C40103n(i13, i14, 3, viewState, function5, function3);
                }
            }
            i25 |= 384;
            function4 = function2;
            if ((i25 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i25 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40349h7(14);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40349h7(15);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87153g(interfaceC39171c);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                C38072d c38072d2 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1092a.m3358c(modifierM3407d2, c38072d2.m121949b(c28655q, i212).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d2);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    function8 = function6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                    m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t3), c28655q, AbstractC22403o.f87638a);
                    Modifier modifierM66724m3 = AbstractC22953f.m66724m(c2314t2);
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C2305k c2305k3 = C2299e.f9110M;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM66724m3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                    float f111 = 8;
                    float f112 = 2 * f111;
                    float f113 = 1 * f111;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f112, 0.0f, f113, 5);
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    i17 = i25 & 896;
                    if (i17 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    i18 = i25;
                    if (z13) {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function9 = function7;
                    i19 = i17;
                    c28676v1 = c28676v0;
                    function10 = function8;
                    AbstractC6719b.m20143d(modifierM3398t5, aVar3, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    float f114 = 16;
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, f114, 7);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t6, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N10);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114 * f111, c2314t2));
                    String strM122340b3 = cVar.getHeader().getTitle();
                    C2886a c2886aM8417O3 = c38072d2.m121952e(c28655q, i212).getT2();
                    long jM125430y3 = c38072d2.m121949b(c28655q, i212).getBrandWhite();
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(c2314t2, f112, f113);
                    int i213 = C2886a.f11498d << 18;
                    c0209i3 = c0209i2;
                    AbstractC30795n.m94707h(strM122340b3, modifierM3395q5, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q, 48, i213, 196600);
                    AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t2, f112, 0.0f, 2), c38072d2.m121949b(c28655q, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i212).getB1(), null, c28655q, 48, i213, 196600);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f112, c2314t2));
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n(f111, 4, c2305k3, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM73381n3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N11);
                    c28655q.m87150e0(1386033742);
                    while (r1.hasNext()) {
                        i24 = i19;
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        C28676v0 c28676v6 = c28676v1;
                        if (z15) {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        i19 = i24;
                        c28676v1 = c28676v6;
                        function9 = function13;
                    }
                    function11 = function9;
                    int i214 = i19;
                    C28676v0 c28676v7 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f112, c2314t2));
                    c28655q.m87173q(true);
                    Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t2), f112, f113);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                    if ((i18 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i214 == 256) {
                    }
                    viewState = cVar;
                    zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27292z.m82343j(modifierM3395q6, false, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function12;
                    function5 = function11;
                } else {
                    function8 = function6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i11 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
                m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t3), c28655q, AbstractC22403o.f87638a);
                Modifier modifierM66724m4 = AbstractC22953f.m66724m(c2314t2);
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM66724m4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N12);
                float f115 = 8;
                float f116 = 2 * f115;
                float f117 = 1 * f115;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f116, 0.0f, f117, 5);
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                i17 = i25 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                i18 = i25;
                if (z13) {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                function9 = function7;
                i19 = i17;
                c28676v1 = c28676v0;
                function10 = function8;
                AbstractC6719b.m20143d(modifierM3398t7, aVar4, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f118 = 16;
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, f118, 7);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t8, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N13);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f118 * f115, c2314t2));
                String strM122340b4 = cVar.getHeader().getTitle();
                C2886a c2886aM8417O4 = c38072d2.m121952e(c28655q, i212).getT2();
                long jM125430y4 = c38072d2.m121949b(c28655q, i212).getBrandWhite();
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(c2314t2, f116, f117);
                int i215 = C2886a.f11498d << 18;
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(strM122340b4, modifierM3395q7, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q, 48, i215, 196600);
                AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t2, f116, 0.0f, 2), c38072d2.m121949b(c28655q, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i212).getB1(), null, c28655q, 48, i215, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f116, c2314t2));
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n(f115, 4, c2305k4, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM73381n4);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N14);
                c28655q.m87150e0(1386033742);
                while (r1.hasNext()) {
                    i24 = i19;
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    C28676v0 c28676v8 = c28676v1;
                    if (z15) {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    i19 = i24;
                    c28676v1 = c28676v8;
                    function9 = function13;
                }
                function11 = function9;
                int i216 = i19;
                C28676v0 c28676v9 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f116, c2314t2));
                c28655q.m87173q(true);
                Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t2), f116, f117);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                if ((i18 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i216 == 256) {
                }
                viewState = cVar;
                zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27292z.m82343j(modifierM3395q8, false, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function12;
                function5 = function11;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(i13, i14, 3, viewState, function5, function3);
            }
        }
        i25 |= 48;
        function3 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i25 |= i16;
            }
            if ((i25 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i25 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40349h7(14);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40349h7(15);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87153g(interfaceC39171c);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                C38072d c38072d3 = C38072d.f163053a;
                int i217 = C38072d.f163054b;
                Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC1092a.m3358c(modifierM3407d3, c38072d3.m121949b(c28655q, i217).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM66722k3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i12 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC39127r0M66763d3);
                C0209i c0209i13 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    function8 = function6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i14 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N15);
                    m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t4), c28655q, AbstractC22403o.f87638a);
                    Modifier modifierM66724m5 = AbstractC22953f.m66724m(c2314t3);
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C2305k c2305k5 = C2299e.f9110M;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM66724m5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N16);
                    float f119 = 8;
                    float f1110 = 2 * f119;
                    float f1111 = 1 * f119;
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, f1110, 0.0f, f1111, 5);
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    i17 = i25 & 896;
                    if (i17 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    i18 = i25;
                    if (z13) {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function9 = function7;
                    i19 = i17;
                    c28676v1 = c28676v0;
                    function10 = function8;
                    AbstractC6719b.m20143d(modifierM3398t9, aVar5, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    float f1112 = 16;
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), 0.0f, 0.0f, 0.0f, f1112, 7);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t10, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM92116f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N17);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1112 * f119, c2314t3));
                    String strM122340b5 = cVar.getHeader().getTitle();
                    C2886a c2886aM8417O5 = c38072d3.m121952e(c28655q, i217).getT2();
                    long jM125430y5 = c38072d3.m121949b(c28655q, i217).getBrandWhite();
                    Modifier modifierM3395q9 = AbstractC1099a.m3395q(c2314t3, f1110, f1111);
                    int i218 = C2886a.f11498d << 18;
                    c0209i3 = c0209i2;
                    AbstractC30795n.m94707h(strM122340b5, modifierM3395q9, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O5, null, c28655q, 48, i218, 196600);
                    AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t3, f1110, 0.0f, 2), c38072d3.m121949b(c28655q, i217).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i217).getB1(), null, c28655q, 48, i218, 196600);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1110, c2314t3));
                    C23010x c23010xM73381n5 = AbstractC25012a.m73381n(f119, 4, c2305k5, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM73381n5);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N18);
                    c28655q.m87150e0(1386033742);
                    while (r1.hasNext()) {
                        i24 = i19;
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        C28676v0 c28676v10 = c28676v1;
                        if (z15) {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            function13 = function9;
                            objM87133R4 = new C37450h(function13, 25);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        i19 = i24;
                        c28676v1 = c28676v10;
                        function9 = function13;
                    }
                    function11 = function9;
                    int i219 = i19;
                    C28676v0 c28676v11 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1110, c2314t3));
                    c28655q.m87173q(true);
                    Modifier modifierM3395q10 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t3), f1110, f1111);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                    if ((i18 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i219 == 256) {
                    }
                    viewState = cVar;
                    zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        function12 = function10;
                        objM87133R3 = new C31324k(function12, function11, viewState, 28);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27292z.m82343j(modifierM3395q10, false, false, null, null, null, textResourceM21278l5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function12;
                    function5 = function11;
                } else {
                    function8 = function6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i15 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N15);
                m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t4), c28655q, AbstractC22403o.f87638a);
                Modifier modifierM66724m6 = AbstractC22953f.m66724m(c2314t3);
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C2305k c2305k6 = C2299e.f9110M;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM66724m6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m19);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N19);
                float f1113 = 8;
                float f1114 = 2 * f1113;
                float f1115 = 1 * f1113;
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, f1114, 0.0f, f1115, 5);
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                i17 = i25 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                i18 = i25;
                if (z13) {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                function9 = function7;
                i19 = i17;
                c28676v1 = c28676v0;
                function10 = function8;
                AbstractC6719b.m20143d(modifierM3398t11, aVar6, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f1116 = 16;
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), 0.0f, 0.0f, 0.0f, f1116, 7);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t12, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM92116f5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N110);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1116 * f1113, c2314t3));
                String strM122340b6 = cVar.getHeader().getTitle();
                C2886a c2886aM8417O6 = c38072d3.m121952e(c28655q, i217).getT2();
                long jM125430y6 = c38072d3.m121949b(c28655q, i217).getBrandWhite();
                Modifier modifierM3395q11 = AbstractC1099a.m3395q(c2314t3, f1114, f1115);
                int i2110 = C2886a.f11498d << 18;
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(strM122340b6, modifierM3395q11, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O6, null, c28655q, 48, i2110, 196600);
                AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t3, f1114, 0.0f, 2), c38072d3.m121949b(c28655q, i217).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i217).getB1(), null, c28655q, 48, i2110, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1114, c2314t3));
                C23010x c23010xM73381n6 = AbstractC25012a.m73381n(f1113, 4, c2305k6, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, c2314t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM73381n6);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N111);
                c28655q.m87150e0(1386033742);
                while (r1.hasNext()) {
                    i24 = i19;
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    C28676v0 c28676v12 = c28676v1;
                    if (z15) {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    i19 = i24;
                    c28676v1 = c28676v12;
                    function9 = function13;
                }
                function11 = function9;
                int i2111 = i19;
                C28676v0 c28676v13 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1114, c2314t3));
                c28655q.m87173q(true);
                Modifier modifierM3395q12 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t3), f1114, f1115);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                if ((i18 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i2111 == 256) {
                }
                viewState = cVar;
                zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27292z.m82343j(modifierM3395q12, false, false, null, null, null, textResourceM21278l6, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function12;
                function5 = function11;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(i13, i14, 3, viewState, function5, function3);
            }
        }
        i25 |= 384;
        function4 = function2;
        if ((i25 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i25 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C40349h7(14);
                    c28655q.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            } else {
                function6 = function3;
            }
            if (i15 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C40349h7(15);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function4;
            }
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            zM87153g = c28655q.m87153g(c13821r1M92099U) | c28655q.m87153g(interfaceC39171c);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, 1));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            C38072d c38072d4 = C38072d.f163053a;
            int i2112 = C38072d.f163054b;
            Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC1092a.m3358c(modifierM3407d4, c38072d4.m121949b(c28655q, i2112).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM66722k4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i16 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC39127r0M66763d4);
            C0209i c0209i17 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                function8 = function6;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i18 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N112);
                m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t5), c28655q, AbstractC22403o.f87638a);
                Modifier modifierM66724m7 = AbstractC22953f.m66724m(c2314t4);
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C2305k c2305k7 = C2299e.f9110M;
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM66724m7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N113);
                float f1117 = 8;
                float f1118 = 2 * f1117;
                float f1119 = 1 * f1117;
                Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t4), 0.0f, f1118, 0.0f, f1119, 5);
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                i17 = i25 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                i18 = i25;
                if (z13) {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39609i(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                function9 = function7;
                i19 = i17;
                c28676v1 = c28676v0;
                function10 = function8;
                AbstractC6719b.m20143d(modifierM3398t13, aVar7, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f11110 = 16;
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t4), 0.0f, 0.0f, 0.0f, f11110, 7);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t14, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM92116f6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N114);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f11110 * f1117, c2314t4));
                String strM122340b7 = cVar.getHeader().getTitle();
                C2886a c2886aM8417O7 = c38072d4.m121952e(c28655q, i2112).getT2();
                long jM125430y7 = c38072d4.m121949b(c28655q, i2112).getBrandWhite();
                Modifier modifierM3395q13 = AbstractC1099a.m3395q(c2314t4, f1118, f1119);
                int i2113 = C2886a.f11498d << 18;
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(strM122340b7, modifierM3395q13, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O7, null, c28655q, 48, i2113, 196600);
                AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t4, f1118, 0.0f, 2), c38072d4.m121949b(c28655q, i2112).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i2112).getB1(), null, c28655q, 48, i2113, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1118, c2314t4));
                C23010x c23010xM73381n7 = AbstractC25012a.m73381n(f1117, 4, c2305k7, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, c2314t4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM73381n7);
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N115);
                c28655q.m87150e0(1386033742);
                while (r1.hasNext()) {
                    i24 = i19;
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    C28676v0 c28676v14 = c28676v1;
                    if (z15) {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        function13 = function9;
                        objM87133R4 = new C37450h(function13, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    i19 = i24;
                    c28676v1 = c28676v14;
                    function9 = function13;
                }
                function11 = function9;
                int i2114 = i19;
                C28676v0 c28676v15 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f1118, c2314t4));
                c28655q.m87173q(true);
                Modifier modifierM3395q14 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f1118, f1119);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
                if ((i18 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i2114 == 256) {
                }
                viewState = cVar;
                zM87157i = z14 | z16 | c28655q.m87157i(viewState);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function12 = function10;
                    objM87133R3 = new C31324k(function12, function11, viewState, 28);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27292z.m82343j(modifierM3395q14, false, false, null, null, null, textResourceM21278l7, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function12;
                function5 = function11;
            } else {
                function8 = function6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i19 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N112);
            m131388m(viewState.getHeaderImage(), m131394s(interfaceC28670t5), c28655q, AbstractC22403o.f87638a);
            Modifier modifierM66724m8 = AbstractC22953f.m66724m(c2314t4);
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C2305k c2305k8 = C2299e.f9110M;
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM66724m8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m116);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N116);
            float f11111 = 8;
            float f11112 = 2 * f11111;
            float f11113 = 1 * f11111;
            Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t4), 0.0f, f11112, 0.0f, f11113, 5);
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            i17 = i25 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            i18 = i25;
            if (z13) {
                objM87133R2 = new C39609i(function7, 29);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39609i(function7, 29);
                c28655q.m87172p0(objM87133R2);
            }
            function9 = function7;
            i19 = i17;
            c28676v1 = c28676v0;
            function10 = function8;
            AbstractC6719b.m20143d(modifierM3398t15, aVar8, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f11114 = 16;
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t4), 0.0f, 0.0f, 0.0f, f11114, 7);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC15674c.m44089m(AbstractC11895b.m31988g(modifierM3398t16, true, 1.0f), 0.0f, 1, null), c13821r1M92099U, 14);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM92116f7);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m117);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N117);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f11114 * f11111, c2314t4));
            String strM122340b8 = cVar.getHeader().getTitle();
            C2886a c2886aM8417O8 = c38072d4.m121952e(c28655q, i2112).getT2();
            long jM125430y8 = c38072d4.m121949b(c28655q, i2112).getBrandWhite();
            Modifier modifierM3395q15 = AbstractC1099a.m3395q(c2314t4, f11112, f11113);
            int i2115 = C2886a.f11498d << 18;
            c0209i3 = c0209i2;
            AbstractC30795n.m94707h(strM122340b8, modifierM3395q15, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O8, null, c28655q, 48, i2115, 196600);
            AbstractC30795n.m94707h(cVar.getHeader().getBody(), AbstractC1099a.m3396r(c2314t4, f11112, 0.0f, 2), c38072d4.m121949b(c28655q, i2112).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i2112).getB1(), null, c28655q, 48, i2115, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f11112, c2314t4));
            C23010x c23010xM73381n8 = AbstractC25012a.m73381n(f11111, 4, c2305k8, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, c23010xM73381n8);
            AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC28653p1M87165m118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N118);
            c28655q.m87150e0(1386033742);
            while (r1.hasNext()) {
                i24 = i19;
                if (i24 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R4 = c28655q.m87133R();
                C28676v0 c28676v16 = c28676v1;
                if (z15) {
                    function13 = function9;
                    objM87133R4 = new C37450h(function13, 25);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function13 = function9;
                    objM87133R4 = new C37450h(function13, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                i19 = i24;
                c28676v1 = c28676v16;
                function9 = function13;
            }
            function11 = function9;
            int i2116 = i19;
            C28676v0 c28676v17 = c28676v1;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f11112, c2314t4));
            c28655q.m87173q(true);
            Modifier modifierM3395q16 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f11112, f11113);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(cVar.getFooter().getButtonTitle());
            if ((i18 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i2116 == 256) {
            }
            viewState = cVar;
            zM87157i = z14 | z16 | c28655q.m87157i(viewState);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                function12 = function10;
                objM87133R3 = new C31324k(function12, function11, viewState, 28);
                c28655q.m87172p0(objM87133R3);
            } else {
                function12 = function10;
                objM87133R3 = new C31324k(function12, function11, viewState, 28);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27292z.m82343j(modifierM3395q16, false, false, null, null, null, textResourceM21278l8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function12;
            function5 = function11;
        } else {
            c28655q.m87138X();
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(i13, i14, 3, viewState, function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m131391p(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m131392q(AbstractC37162a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final float m131393r(InterfaceC39171c interfaceC39171c, C13821r1 c13821r1) {
        float f13 = f174449a;
        return AbstractC12889b.m36283m(AbstractC11329a0.f36295d.mo7226i(C39174f.m124782b(f13, (float) 0) ? 1.0f : AbstractC12889b.m36283m(1.0f - (interfaceC39171c.mo733e0(c13821r1.f49318a.m87024x()) / f13), 0.0f, 1.0f)), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: s */
    private static final float m131394s(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m131395t(Function1 function1) {
        function1.invoke(AbstractC37162a.a.f158924a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m131396u(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m131375C(function1, event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m131397v(Function1 function1, Function1 function2, AbstractC38201e.c cVar) {
        function1.invoke(InterfaceC22381a.w.f87452a);
        function2.invoke(new AbstractC37162a.b(cVar.getFooter().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m131398w(AbstractC38201e.c cVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m131390o(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:113:0x023a  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x015b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0155, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final void m131399x(AbstractC38201e viewState, String str, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        String str3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        List list;
        String str4;
        C28676v0 c28676v0;
        Function1 function7;
        int i24;
        Function1 function8;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function9;
        Function1 function10;
        boolean z16;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        Object objM87133R4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1377728284);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i25 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C40349h7(12);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function3 = (Function1) objM87133R4;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C40349h7(13);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function4;
                        }
                        i24 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                        if (viewState instanceof AbstractC38201e.b) {
                            c28655q.m87150e0(-1195423609);
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
                            function9 = function3;
                            function10 = function7;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function8 = function7;
                            if (viewState instanceof AbstractC38201e.a) {
                                c28655q.m87150e0(-1195037566);
                                int i26 = 2;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i26, objArr == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i26, objArr3 == true ? 1 : 0);
                                z16 = (i15 & 7168) == 2048;
                                objM87133R2 = c28655q.m87133R();
                                if (z16 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C39609i(function8, 28);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function10 = function8;
                                function9 = function3;
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC38201e.c) {
                                    throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                                }
                                c28655q.m87150e0(-1194614323);
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if ((i15 & 112) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z14 | z13 | (i24 == 4);
                                objM87133R = c28655q.m87133R();
                                if (z15 || objM87133R == c28676v0) {
                                    objM87133R = new a(function3, str4, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                int i27 = i15 >> 3;
                                int i28 = (i27 & 112) | i24 | (i27 & 896);
                                function9 = function3;
                                m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i28, 0);
                                function10 = function8;
                                c28655q.m87173q(false);
                            }
                        }
                        String str5 = str4;
                        function6 = function10;
                        str3 = str5;
                        function5 = function9;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C40349h7(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C40349h7(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC38201e.b) {
                        c28655q.m87150e0(-1195423609);
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
                        function9 = function3;
                        function10 = function7;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function8 = function7;
                        if (viewState instanceof AbstractC38201e.a) {
                            c28655q.m87150e0(-1195037566);
                            int i29 = 2;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i29, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i29, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function10 = function8;
                            function9 = function3;
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC38201e.c) {
                                throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                            }
                            c28655q.m87150e0(-1194614323);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13 | (i24 == 4);
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i210 = i15 >> 3;
                            int i211 = (i210 & 112) | i24 | (i210 & 896);
                            function9 = function3;
                            m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i211, 0);
                            function10 = function8;
                            c28655q.m87173q(false);
                        }
                    }
                    String str6 = str4;
                    function6 = function10;
                    str3 = str6;
                    function5 = function9;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C40349h7(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C40349h7(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC38201e.b) {
                        c28655q.m87150e0(-1195423609);
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
                        function9 = function3;
                        function10 = function7;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function8 = function7;
                        if (viewState instanceof AbstractC38201e.a) {
                            c28655q.m87150e0(-1195037566);
                            int i212 = 2;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i212, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i212, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function10 = function8;
                            function9 = function3;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC38201e.c) {
                                throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                            }
                            c28655q.m87150e0(-1194614323);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13 | (i24 == 4);
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i213 = i15 >> 3;
                            int i214 = (i213 & 112) | i24 | (i213 & 896);
                            function9 = function3;
                            m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i214, 0);
                            function10 = function8;
                            c28655q.m87173q(false);
                        }
                    }
                    String str7 = str4;
                    function6 = function10;
                    str3 = str7;
                    function5 = function9;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40349h7(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C40349h7(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                if (viewState instanceof AbstractC38201e.b) {
                    c28655q.m87150e0(-1195423609);
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
                    function9 = function3;
                    function10 = function7;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function8 = function7;
                    if (viewState instanceof AbstractC38201e.a) {
                        c28655q.m87150e0(-1195037566);
                        int i215 = 2;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i215, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i215, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function10 = function8;
                        function9 = function3;
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC38201e.c) {
                            throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                        }
                        c28655q.m87150e0(-1194614323);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13 | (i24 == 4);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i216 = i15 >> 3;
                        int i217 = (i216 & 112) | i24 | (i216 & 896);
                        function9 = function3;
                        m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i217, 0);
                        function10 = function8;
                        c28655q.m87173q(false);
                    }
                }
                String str8 = str4;
                function6 = function10;
                str3 = str8;
                function5 = function9;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C40349h7(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C40349h7(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC38201e.b) {
                        c28655q.m87150e0(-1195423609);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        function9 = function3;
                        function10 = function7;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function8 = function7;
                        if (viewState instanceof AbstractC38201e.a) {
                            c28655q.m87150e0(-1195037566);
                            int i218 = 2;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i218, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i218, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39609i(function8, 28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function10 = function8;
                            function9 = function3;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC38201e.c) {
                                throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                            }
                            c28655q.m87150e0(-1194614323);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13 | (i24 == 4);
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function3, str4, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            int i219 = i15 >> 3;
                            int i2110 = (i219 & 112) | i24 | (i219 & 896);
                            function9 = function3;
                            m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i2110, 0);
                            function10 = function8;
                            c28655q.m87173q(false);
                        }
                    }
                    String str9 = str4;
                    function6 = function10;
                    str3 = str9;
                    function5 = function9;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40349h7(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C40349h7(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                if (viewState instanceof AbstractC38201e.b) {
                    c28655q.m87150e0(-1195423609);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    function9 = function3;
                    function10 = function7;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function8 = function7;
                    if (viewState instanceof AbstractC38201e.a) {
                        c28655q.m87150e0(-1195037566);
                        int i2111 = 2;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i2111, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i2111, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function10 = function8;
                        function9 = function3;
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC38201e.c) {
                            throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                        }
                        c28655q.m87150e0(-1194614323);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13 | (i24 == 4);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i2112 = i15 >> 3;
                        int i2113 = (i2112 & 112) | i24 | (i2112 & 896);
                        function9 = function3;
                        m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i2113, 0);
                        function10 = function8;
                        c28655q.m87173q(false);
                    }
                }
                String str10 = str4;
                function6 = function10;
                str3 = str10;
                function5 = function9;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C40349h7(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C40349h7(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
                if (viewState instanceof AbstractC38201e.b) {
                    c28655q.m87150e0(-1195423609);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    function9 = function3;
                    function10 = function7;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function8 = function7;
                    if (viewState instanceof AbstractC38201e.a) {
                        c28655q.m87150e0(-1195037566);
                        int i2114 = 2;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i2114, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i2114, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39609i(function8, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function10 = function8;
                        function9 = function3;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC38201e.c) {
                            throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                        }
                        c28655q.m87150e0(-1194614323);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13 | (i24 == 4);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function3, str4, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        int i2115 = i15 >> 3;
                        int i2116 = (i2115 & 112) | i24 | (i2115 & 896);
                        function9 = function3;
                        m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i2116, 0);
                        function10 = function8;
                        c28655q.m87173q(false);
                    }
                }
                String str11 = str4;
                function6 = function10;
                str3 = str11;
                function5 = function9;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            list = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (i25 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C40349h7(12);
                    c28655q.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C40349h7(13);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function4;
            }
            i24 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_schedule_primer", c28655q, i24 | 48);
            if (viewState instanceof AbstractC38201e.b) {
                c28655q.m87150e0(-1195423609);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                function9 = function3;
                function10 = function7;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function8 = function7;
                if (viewState instanceof AbstractC38201e.a) {
                    c28655q.m87150e0(-1195037566);
                    int i2117 = 2;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i2117, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i2117, objArr3 == true ? 1 : 0);
                    if ((i15 & 7168) == 2048) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C39609i(function8, 28);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39609i(function8, 28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function10 = function8;
                    function9 = function3;
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC38201e.c) {
                        throw AbstractC11895b.m32003v(-1146941877, c28655q, false);
                    }
                    c28655q.m87150e0(-1194614323);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13 | (i24 == 4);
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new a(function3, str4, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(function3, str4, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                    int i2118 = i15 >> 3;
                    int i2119 = (i2118 & 112) | i24 | (i2118 & 896);
                    function9 = function3;
                    m131390o((AbstractC38201e.c) viewState, function9, function8, c28655q, i2119, 0);
                    function10 = function8;
                    c28655q.m87173q(false);
                }
            }
            String str12 = str4;
            function6 = function10;
            str3 = str12;
            function5 = function9;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k((Object) viewState, (Object) str3, function5, (InterfaceC23459e) function6, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m131400y(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m131401z(AbstractC37162a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
