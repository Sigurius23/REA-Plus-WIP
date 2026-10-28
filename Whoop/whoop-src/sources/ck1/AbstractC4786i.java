package ck1;

import a11.C0140r;
import a61.C0468a;
import a80.C0542f;
import ak1.AbstractC0949b;
import ak1.C0948a;
import ak1.C0951d;
import am2.C1042s;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import bf0.C3189a;
import bk1.C3353c;
import c41.C4141w2;
import c41.C4148x2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj2.C4769a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import dp0.AbstractC12248d;
import ep0.C13404j;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n71.C26436q;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p000.C13762f;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import vj1.AbstractC36068a;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39282o;
import zj1.AbstractC40770a;

/* JADX INFO: renamed from: ck1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ai\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, m65681d2 = {"Lak1/d$b;", "viewState", "Lak1/a;", "analyticsState", "", "source", "Lkotlin/Function1;", "Lak1/b;", "Ll83/a0;", "onViewEvent", "Lzj1/a;", "onNavigationEvent", "Lvj1/a;", "onAnalyticEvent", "r", "(Lak1/d$b;Lak1/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "F", "(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "gridItemPadding", "b", "screenHorizontalPadding", "health-monitor_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4786i {

    /* JADX INFO: renamed from: a */
    private static final float f19690a = 6;

    /* JADX INFO: renamed from: b */
    private static final float f19691b = 20;

    /* JADX INFO: renamed from: ck1.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.view.ComposableHealthMonitorSuccessScreenKt$ComposableHealthMonitorSuccessScreen$2$1", m100430f = "ComposableHealthMonitorSuccessScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19692w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f19693x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f19694y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0948a f19695z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, C0948a c0948a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19693x = function1;
            this.f19694y = str;
            this.f19695z = c0948a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f19693x, this.f19694y, this.f19695z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f19692w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f19693x.invoke(new AbstractC36068a.c(this.f19694y, this.f19695z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m15071A(C0140r it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1949534902);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, f19691b, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m15072B(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC40770a.b(((C0140r) interfaceC25312u).getConnectivityNavType()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Modifier m15073C(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2045746399);
        Modifier modifierM3394p = AbstractC1099a.m3394p(f19691b, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3394p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m15074D(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m15075E(C0951d.b bVar, C0948a c0948a, String str, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m15098r(bVar, c0948a, str, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m15076F(C0951d.b bVar, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(88917006);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC1090b.m3351f(bVar.getDialog() != null, null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), null, AbstractC37817c.m121344e(-1141031194, c28655q, new C0542f((Object) bVar, function1, (Object) function2, 6)), c28655q, 200064, 18);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(bVar, function1, function2, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m15077G(C0951d.b bVar, Function1 function1, Function1 function2, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C4791n c4791nM2406a = bVar.getDialog();
        if (c4791nM2406a == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-2089072727);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-2089072726);
            Modifier modifierM3358c = AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            boolean zM87153g = c28655q2.m87153g(function1);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C3189a(function1, 22);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q2.m87153g(function2);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C0468a(function2, 19);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC4790m.m15128g(c4791nM2406a, interfaceC4339a, (Function1) objM87133R2, c28655q2, TextResource.$stable | C27273p0.f109116o, 0);
            c28655q2.m87173q(true);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m15078H(Function1 function1) {
        function1.invoke(AbstractC0949b.a.f3450a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m15079I(Function1 function1, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC40770a.c(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m15080J(C0951d.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m15076F(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:103:0x0276  */
    /* JADX WARN: Code duplicated, block: B:107:0x0293  */
    /* JADX WARN: Code duplicated, block: B:109:0x029e  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:121:0x031c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0324  */
    /* JADX WARN: Code duplicated, block: B:125:0x0359  */
    /* JADX WARN: Code duplicated, block: B:126:0x035d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0370  */
    /* JADX WARN: Code duplicated, block: B:131:0x037e  */
    /* JADX WARN: Code duplicated, block: B:135:0x039b  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:150:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:158:0x044d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0461  */
    /* JADX WARN: Code duplicated, block: B:165:0x0470  */
    /* JADX WARN: Code duplicated, block: B:167:0x0483  */
    /* JADX WARN: Code duplicated, block: B:172:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:174:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:176:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0501  */
    /* JADX WARN: Code duplicated, block: B:184:0x0509  */
    /* JADX WARN: Code duplicated, block: B:187:0x0510  */
    /* JADX WARN: Code duplicated, block: B:188:0x0522  */
    /* JADX WARN: Code duplicated, block: B:191:0x055a  */
    /* JADX WARN: Code duplicated, block: B:193:0x056f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0587  */
    /* JADX WARN: Code duplicated, block: B:197:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:201:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:202:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:205:0x05cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:208:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:210:0x0602  */
    /* JADX WARN: Code duplicated, block: B:215:0x0638  */
    /* JADX WARN: Code duplicated, block: B:216:0x0644  */
    /* JADX WARN: Code duplicated, block: B:218:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:221:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:224:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x042e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x0257  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
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
    /* JADX INFO: renamed from: r */
    public static final void m15098r(C0951d.b viewState, C0948a c0948a, String str, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        Function1 function3;
        Function1 function4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function5;
        int i15;
        boolean z13;
        boolean z14;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function6;
        int i16;
        boolean z15;
        Object objM87133R2;
        C28676v0 c28676v1;
        C2314t c2314t;
        int i17;
        Function1 function7;
        int i18;
        boolean z16;
        int iHashCode2;
        String strM2407b;
        C2314t c2314t2;
        Function1 function8;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        int i19;
        Object objM87133R3;
        C0140r c0140r;
        boolean z17;
        boolean zM87157i2;
        Object objM87133R4;
        Object objM87133R5;
        boolean z18;
        int i24;
        boolean z19;
        boolean z24;
        Object objM87133R6;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        char c3;
        int i25;
        int i26;
        List list;
        boolean z25;
        int iHashCode4;
        C0213j c0213j3;
        C0209i c0209i3;
        int i27;
        C2314t c2314t3;
        boolean z26;
        boolean z27;
        int i28;
        C4141w2 c4141w2;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objM87133R7;
        C28676v0 c28676v4;
        C28676v0 c28676v5;
        char c7;
        C4141w2 c4141w3;
        Function1 function9;
        Object c1042s;
        Object objM87133R8;
        C0948a c0948a2 = c0948a;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2007400896);
        int i29 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i29 |= c28655q.m87157i(c0948a2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i29 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i29 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i29 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i34 = i14 & 32;
        if (i34 == 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                i29 |= c28655q.m87157i(function2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((i29 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i29 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C4769a(8);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function5 = (Function1) objM87133R8;
                } else {
                    function5 = function2;
                }
                i15 = 458752 & i29;
                if (i15 == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i29 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z13 | z14 | c28655q.m87157i(c0948a2);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(function5, str, c0948a2, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                int i35 = i29 >> 6;
                m15076F(viewState, onViewEvent, onNavigationEvent, c28655q, (i29 & 14) | (i35 & 112) | (i35 & 896));
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t4);
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    function6 = function5;
                } else {
                    function6 = function5;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t4, 0.0f, 15, 0.0f, 0.0f, 13);
                    AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getTitle()), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    i16 = 57344 & i29;
                    if (i16 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C3189a(onNavigationEvent, 23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28676v1 = c28676v0;
                    c2314t = c2314t4;
                    i17 = i16;
                    function7 = function6;
                    AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    c28655q = c28655q;
                    i18 = i29;
                    z16 = true;
                    Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q, C13404j.f46947x << 3, 6);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34108a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                    c28655q.m87150e0(-751178324);
                    for (InterfaceC25312u interfaceC25312u : viewState.m2408c()) {
                        if (interfaceC25312u instanceof C3353c) {
                            c28655q.m87150e0(442285847);
                            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f19691b - f19690a, 0.0f, 2);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            c3 = 2;
                            ArrayList arrayListM74153v0 = AbstractC25265s.m74153v0(((C3353c) interfaceC25312u).m9684a(), 2);
                            c28655q.m87150e0(-1101686000);
                            i25 = 0;
                            for (Object obj : arrayListM74153v0) {
                                i26 = i25 + 1;
                                if (i25 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                list = (List) obj;
                                Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90537w);
                                z25 = false;
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                                iHashCode4 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                                InterfaceC0221l.f734a.getClass();
                                c0213j3 = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j3);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                                c0209i3 = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                                c28655q.m87150e0(1780025758);
                                i27 = 0;
                                for (Object obj2 : list) {
                                    i28 = i27 + 1;
                                    if (i27 >= 0) {
                                        AbstractC37056f.m118977d0();
                                        throw null;
                                    }
                                    c4141w2 = (C4141w2) obj2;
                                    final int i36 = (i25 * 2) + i27;
                                    z28 = z25;
                                    Function3 function10 = new Function3() { // from class: ck1.g
                                        @Override // p715kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            int iIntValue = ((Integer) obj5).intValue();
                                            return AbstractC4786i.m15101u(C23000t1.f90727a, i36, (C4141w2) obj3, (Composer) obj4, iIntValue);
                                        }
                                    };
                                    if (i15 == 131072) {
                                        z29 = z16;
                                    } else {
                                        z29 = z28;
                                    }
                                    boolean zM87157i3 = c28655q.m87157i(c4141w2) | z29 | c28655q.m87157i(c0948a2);
                                    i18 = i18;
                                    if ((i18 & 7168) == 2048) {
                                        z34 = z16;
                                    } else {
                                        z34 = z28;
                                    }
                                    z35 = zM87157i3 | z34;
                                    objM87133R7 = c28655q.m87133R();
                                    if (z35) {
                                        c28676v4 = c28676v1;
                                    } else {
                                        c28676v4 = c28676v1;
                                        if (objM87133R7 == c28676v4) {
                                            c1042s = objM87133R7;
                                            c28676v5 = c28676v4;
                                            c4141w3 = c4141w2;
                                            c7 = 0;
                                            function9 = function7;
                                        }
                                        AbstractC25303l.m74291r(c4141w3, null, function10, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                        function7 = function9;
                                        c2314t = c2314t;
                                        i27 = i28;
                                        c28676v1 = c28676v5;
                                        c3 = 2;
                                        z25 = false;
                                    }
                                    c28676v5 = c28676v4;
                                    c4141w3 = c4141w2;
                                    c7 = 0;
                                    function9 = function7;
                                    c1042s = new C1042s(function9, (Object) c4141w3, (Object) c0948a2, (Object) onViewEvent, 9);
                                    c28655q.m87172p0(c1042s);
                                    AbstractC25303l.m74291r(c4141w3, null, function10, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                    function7 = function9;
                                    c2314t = c2314t;
                                    i27 = i28;
                                    c28676v1 = c28676v5;
                                    c3 = 2;
                                    z25 = false;
                                }
                                c2314t3 = c2314t;
                                z26 = z25;
                                z27 = z16;
                                Function1 function11 = function7;
                                C28676v0 c28676v6 = c28676v1;
                                c28655q.m87173q(z26);
                                if (list.size() == z27) {
                                    c28655q.m87150e0(-652389997);
                                    Modifier modifierM3394p = AbstractC1099a.m3394p(f19690a, c2314t3);
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, modifierM3394p.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z27))));
                                    c28655q.m87173q(z26);
                                } else {
                                    c28655q.m87150e0(-652013285);
                                    c28655q.m87173q(z26);
                                }
                                c28655q.m87173q(z27);
                                function7 = function11;
                                c2314t = c2314t3;
                                z16 = z27;
                                i25 = i26;
                                c28676v1 = c28676v6;
                                c3 = 2;
                            }
                            function8 = function7;
                            AbstractC25012a.m73392y(c28655q, false, z16, false);
                            c28676v3 = c28676v1;
                            c2314t = c2314t;
                            i19 = i17;
                        } else {
                            c2314t2 = c2314t;
                            z16 = z16;
                            function8 = function7;
                            c28676v2 = c28676v1;
                            if (interfaceC25312u instanceof C39282o) {
                                c28655q.m87150e0(444867651);
                                C39282o c39282o = (C39282o) interfaceC25312u;
                                C4785h c4785h = new C4785h(0);
                                boolean zM87157i4 = c28655q.m87157i(interfaceC25312u);
                                if (i15 == 131072) {
                                    z18 = z16;
                                } else {
                                    z18 = false;
                                }
                                boolean zM87157i5 = zM87157i4 | z18 | c28655q.m87157i(c0948a2);
                                i24 = i17;
                                if (i24 == 16384) {
                                    z19 = z16;
                                } else {
                                    z19 = false;
                                }
                                z24 = zM87157i5 | z19;
                                objM87133R6 = c28655q.m87133R();
                                if (z24) {
                                    c28676v3 = c28676v2;
                                } else {
                                    c28676v3 = c28676v2;
                                    if (objM87133R6 == c28676v3) {
                                        function8 = function8;
                                    }
                                    c2314t = c2314t2;
                                    i19 = i24;
                                    AbstractC25303l.m74291r(c39282o, null, c4785h, (Function1) objM87133R6, c28655q, 0, 2);
                                    c28655q.m87173q(false);
                                }
                                C1042s c1042s2 = new C1042s((Object) c39282o, (Object) function8, (Object) c0948a2, (Object) onNavigationEvent, 10);
                                function8 = function8;
                                c28655q.m87172p0(c1042s2);
                                objM87133R6 = c1042s2;
                                c2314t = c2314t2;
                                i19 = i24;
                                AbstractC25303l.m74291r(c39282o, null, c4785h, (Function1) objM87133R6, c28655q, 0, 2);
                                c28655q.m87173q(false);
                            } else {
                                z16 = z16;
                                c28676v3 = c28676v2;
                                c2314t = c2314t2;
                                i19 = i17;
                                if (interfaceC25312u instanceof C26436q) {
                                    c28655q.m87150e0(445907050);
                                    C26436q c26436q = (C26436q) interfaceC25312u;
                                    C25307p c25307pM15052c = AbstractC4781d.m15052c();
                                    C4785h c4785h2 = new C4785h(1);
                                    objM87133R5 = c28655q.m87133R();
                                    if (objM87133R5 == c28676v3) {
                                        objM87133R5 = new C4769a(9);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    AbstractC25303l.m74291r(c26436q, c25307pM15052c, c4785h2, (Function1) objM87133R5, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                    c28655q.m87173q(false);
                                } else if (interfaceC25312u instanceof C0140r) {
                                    c28655q.m87150e0(446334261);
                                    c0140r = (C0140r) interfaceC25312u;
                                    C25307p c25307pM15052c2 = AbstractC4781d.m15052c();
                                    C13762f c13762f = new C13762f(28);
                                    if (i19 == 16384) {
                                        z17 = z16;
                                    } else {
                                        z17 = false;
                                    }
                                    zM87157i2 = c28655q.m87157i(interfaceC25312u) | z17;
                                    objM87133R4 = c28655q.m87133R();
                                    if (zM87157i2 || objM87133R4 == c28676v3) {
                                        objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    AbstractC25303l.m74291r(c0140r, c25307pM15052c2, c13762f, (Function1) objM87133R4, c28655q, C25307p.f99300b << 3, 0);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(446940745);
                                    C25307p c25307pM15052c3 = AbstractC4781d.m15052c();
                                    C13762f c13762f2 = new C13762f(29);
                                    objM87133R3 = c28655q.m87133R();
                                    if (objM87133R3 == c28676v3) {
                                        objM87133R3 = new C4769a(10);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM15052c3, c13762f2, (Function1) objM87133R3, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                    c28655q.m87173q(false);
                                }
                            }
                        }
                        c0948a2 = c0948a;
                        c28676v1 = c28676v3;
                        function7 = function8;
                        i17 = i19;
                    }
                    function3 = onNavigationEvent;
                    Function1 function12 = function7;
                    c28655q.m87173q(false);
                    strM2407b = viewState.getFooter();
                    if (strM2407b == null) {
                        c28655q.m87150e0(-1806584003);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1806584002);
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f19691b, 0.0f, 2);
                        C38072d c38072d = C38072d.f163053a;
                        int i37 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM2407b, modifierM3396r2, c38072d.m121949b(c28655q, i37).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i37).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(20, c2314t));
                    c28655q.m87173q(z16);
                    c28655q.m87173q(z16);
                    function4 = function12;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t4, 0.0f, 15, 0.0f, 0.0f, 13);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getTitle()), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i16 = 57344 & i29;
                if (i16 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3189a(onNavigationEvent, 23);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3189a(onNavigationEvent, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                c28676v1 = c28676v0;
                c2314t = c2314t4;
                i17 = i16;
                function7 = function6;
                AbstractC6719b.m20143d(modifierM3398t2, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                c28655q = c28655q;
                i18 = i29;
                z16 = true;
                Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q, C13404j.f46947x << 3, 6);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM34108a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                c28655q.m87150e0(-751178324);
                while (r0.hasNext()) {
                    if (interfaceC25312u instanceof C3353c) {
                        c28655q.m87150e0(442285847);
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f19691b - f19690a, 0.0f, 2);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        c3 = 2;
                        ArrayList arrayListM74153v1 = AbstractC25265s.m74153v0(((C3353c) interfaceC25312u).m9684a(), 2);
                        c28655q.m87150e0(-1101686000);
                        i25 = 0;
                        while (r1.hasNext()) {
                            i26 = i25 + 1;
                            if (i25 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            list = (List) obj;
                            Modifier modifierM3388j2 = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90537w);
                            z25 = false;
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3388j2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j3 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                            c0209i3 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                            c28655q.m87150e0(1780025758);
                            i27 = 0;
                            while (r21.hasNext()) {
                                i28 = i27 + 1;
                                if (i27 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                c4141w2 = (C4141w2) obj2;
                                final int i38 = (i25 * 2) + i27;
                                z28 = z25;
                                Function3 function13 = new Function3() { // from class: ck1.g
                                    @Override // p715kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int iIntValue = ((Integer) obj5).intValue();
                                        return AbstractC4786i.m15101u(C23000t1.f90727a, i38, (C4141w2) obj3, (Composer) obj4, iIntValue);
                                    }
                                };
                                if (i15 == 131072) {
                                    z29 = z16;
                                } else {
                                    z29 = z28;
                                }
                                boolean zM87157i6 = c28655q.m87157i(c4141w2) | z29 | c28655q.m87157i(c0948a2);
                                i18 = i18;
                                if ((i18 & 7168) == 2048) {
                                    z34 = z16;
                                } else {
                                    z34 = z28;
                                }
                                z35 = zM87157i6 | z34;
                                objM87133R7 = c28655q.m87133R();
                                if (z35) {
                                    c28676v4 = c28676v1;
                                    if (objM87133R7 == c28676v4) {
                                        c1042s = objM87133R7;
                                        c28676v5 = c28676v4;
                                        c4141w3 = c4141w2;
                                        c7 = 0;
                                        function9 = function7;
                                    }
                                    AbstractC25303l.m74291r(c4141w3, null, function13, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                    function7 = function9;
                                    c2314t = c2314t;
                                    i27 = i28;
                                    c28676v1 = c28676v5;
                                    c3 = 2;
                                    z25 = false;
                                } else {
                                    c28676v4 = c28676v1;
                                }
                                c28676v5 = c28676v4;
                                c4141w3 = c4141w2;
                                c7 = 0;
                                function9 = function7;
                                c1042s = new C1042s(function9, (Object) c4141w3, (Object) c0948a2, (Object) onViewEvent, 9);
                                c28655q.m87172p0(c1042s);
                                AbstractC25303l.m74291r(c4141w3, null, function13, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                function7 = function9;
                                c2314t = c2314t;
                                i27 = i28;
                                c28676v1 = c28676v5;
                                c3 = 2;
                                z25 = false;
                            }
                            c2314t3 = c2314t;
                            z26 = z25;
                            z27 = z16;
                            Function1 function14 = function7;
                            C28676v0 c28676v7 = c28676v1;
                            c28655q.m87173q(z26);
                            if (list.size() == z27) {
                                c28655q.m87150e0(-652389997);
                                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f19690a, c2314t3);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, modifierM3394p2.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z27))));
                                c28655q.m87173q(z26);
                            } else {
                                c28655q.m87150e0(-652013285);
                                c28655q.m87173q(z26);
                            }
                            c28655q.m87173q(z27);
                            function7 = function14;
                            c2314t = c2314t3;
                            z16 = z27;
                            i25 = i26;
                            c28676v1 = c28676v7;
                            c3 = 2;
                        }
                        function8 = function7;
                        AbstractC25012a.m73392y(c28655q, false, z16, false);
                        c28676v3 = c28676v1;
                        c2314t = c2314t;
                        i19 = i17;
                    } else {
                        c2314t2 = c2314t;
                        z16 = z16;
                        function8 = function7;
                        c28676v2 = c28676v1;
                        if (interfaceC25312u instanceof C39282o) {
                            c28655q.m87150e0(444867651);
                            C39282o c39282o2 = (C39282o) interfaceC25312u;
                            C4785h c4785h3 = new C4785h(0);
                            boolean zM87157i7 = c28655q.m87157i(interfaceC25312u);
                            if (i15 == 131072) {
                                z18 = z16;
                            } else {
                                z18 = false;
                            }
                            boolean zM87157i8 = zM87157i7 | z18 | c28655q.m87157i(c0948a2);
                            i24 = i17;
                            if (i24 == 16384) {
                                z19 = z16;
                            } else {
                                z19 = false;
                            }
                            z24 = zM87157i8 | z19;
                            objM87133R6 = c28655q.m87133R();
                            if (z24) {
                                c28676v3 = c28676v2;
                                if (objM87133R6 == c28676v3) {
                                    function8 = function8;
                                }
                                c2314t = c2314t2;
                                i19 = i24;
                                AbstractC25303l.m74291r(c39282o2, null, c4785h3, (Function1) objM87133R6, c28655q, 0, 2);
                                c28655q.m87173q(false);
                            } else {
                                c28676v3 = c28676v2;
                            }
                            C1042s c1042s3 = new C1042s((Object) c39282o2, (Object) function8, (Object) c0948a2, (Object) onNavigationEvent, 10);
                            function8 = function8;
                            c28655q.m87172p0(c1042s3);
                            objM87133R6 = c1042s3;
                            c2314t = c2314t2;
                            i19 = i24;
                            AbstractC25303l.m74291r(c39282o2, null, c4785h3, (Function1) objM87133R6, c28655q, 0, 2);
                            c28655q.m87173q(false);
                        } else {
                            z16 = z16;
                            c28676v3 = c28676v2;
                            c2314t = c2314t2;
                            i19 = i17;
                            if (interfaceC25312u instanceof C26436q) {
                                c28655q.m87150e0(445907050);
                                C26436q c26436q2 = (C26436q) interfaceC25312u;
                                C25307p c25307pM15052c4 = AbstractC4781d.m15052c();
                                C4785h c4785h4 = new C4785h(1);
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v3) {
                                    objM87133R5 = new C4769a(9);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                AbstractC25303l.m74291r(c26436q2, c25307pM15052c4, c4785h4, (Function1) objM87133R5, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                c28655q.m87173q(false);
                            } else if (interfaceC25312u instanceof C0140r) {
                                c28655q.m87150e0(446334261);
                                c0140r = (C0140r) interfaceC25312u;
                                C25307p c25307pM15052c5 = AbstractC4781d.m15052c();
                                C13762f c13762f3 = new C13762f(28);
                                if (i19 == 16384) {
                                    z17 = z16;
                                } else {
                                    z17 = false;
                                }
                                zM87157i2 = c28655q.m87157i(interfaceC25312u) | z17;
                                objM87133R4 = c28655q.m87133R();
                                if (zM87157i2) {
                                    objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC25303l.m74291r(c0140r, c25307pM15052c5, c13762f3, (Function1) objM87133R4, c28655q, C25307p.f99300b << 3, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(446940745);
                                C25307p c25307pM15052c6 = AbstractC4781d.m15052c();
                                C13762f c13762f4 = new C13762f(29);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v3) {
                                    objM87133R3 = new C4769a(10);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM15052c6, c13762f4, (Function1) objM87133R3, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                c28655q.m87173q(false);
                            }
                        }
                    }
                    c0948a2 = c0948a;
                    c28676v1 = c28676v3;
                    function7 = function8;
                    i17 = i19;
                }
                function3 = onNavigationEvent;
                Function1 function15 = function7;
                c28655q.m87173q(false);
                strM2407b = viewState.getFooter();
                if (strM2407b == null) {
                    c28655q.m87150e0(-1806584003);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1806584002);
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f19691b, 0.0f, 2);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i39 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM2407b, modifierM3396r4, c38072d2.m121949b(c28655q, i39).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i39).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(20, c2314t));
                c28655q.m87173q(z16);
                c28655q.m87173q(z16);
                function4 = function15;
            } else {
                function3 = onNavigationEvent;
                c28655q.m87138X();
                function4 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(viewState, c0948a, str, onViewEvent, function3, function4, i13, i14);
            }
        }
        i29 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((i29 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i29 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C4769a(8);
                    c28655q.m87172p0(objM87133R8);
                }
                function5 = (Function1) objM87133R8;
            } else {
                function5 = function2;
            }
            i15 = 458752 & i29;
            if (i15 == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i29 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z13 | z14 | c28655q.m87157i(c0948a2);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new a(function5, str, c0948a2, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(function5, str, c0948a2, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            int i310 = i29 >> 6;
            m15076F(viewState, onViewEvent, onNavigationEvent, c28655q, (i29 & 14) | (i310 & 112) | (i310 & 896));
            C2314t c2314t5 = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t5);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                function6 = function5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t5, 0.0f, 15, 0.0f, 0.0f, 13);
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getTitle()), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i16 = 57344 & i29;
                if (i16 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3189a(onNavigationEvent, 23);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3189a(onNavigationEvent, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                c28676v1 = c28676v0;
                c2314t = c2314t5;
                i17 = i16;
                function7 = function6;
                AbstractC6719b.m20143d(modifierM3398t3, aVar3, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                c28655q = c28655q;
                i18 = i29;
                z16 = true;
                Modifier modifierM34108a3 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q, C13404j.f46947x << 3, 6);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM34108a3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                c28655q.m87150e0(-751178324);
                while (r0.hasNext()) {
                    if (interfaceC25312u instanceof C3353c) {
                        c28655q.m87150e0(442285847);
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f19691b - f19690a, 0.0f, 2);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        c3 = 2;
                        ArrayList arrayListM74153v2 = AbstractC25265s.m74153v0(((C3353c) interfaceC25312u).m9684a(), 2);
                        c28655q.m87150e0(-1101686000);
                        i25 = 0;
                        while (r1.hasNext()) {
                            i26 = i25 + 1;
                            if (i25 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            list = (List) obj;
                            Modifier modifierM3388j3 = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90537w);
                            z25 = false;
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3388j3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j3 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                            c0209i3 = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                            c28655q.m87150e0(1780025758);
                            i27 = 0;
                            while (r21.hasNext()) {
                                i28 = i27 + 1;
                                if (i27 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                c4141w2 = (C4141w2) obj2;
                                final int i311 = (i25 * 2) + i27;
                                z28 = z25;
                                Function3 function16 = new Function3() { // from class: ck1.g
                                    @Override // p715kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int iIntValue = ((Integer) obj5).intValue();
                                        return AbstractC4786i.m15101u(C23000t1.f90727a, i311, (C4141w2) obj3, (Composer) obj4, iIntValue);
                                    }
                                };
                                if (i15 == 131072) {
                                    z29 = z16;
                                } else {
                                    z29 = z28;
                                }
                                boolean zM87157i9 = c28655q.m87157i(c4141w2) | z29 | c28655q.m87157i(c0948a2);
                                i18 = i18;
                                if ((i18 & 7168) == 2048) {
                                    z34 = z16;
                                } else {
                                    z34 = z28;
                                }
                                z35 = zM87157i9 | z34;
                                objM87133R7 = c28655q.m87133R();
                                if (z35) {
                                    c28676v4 = c28676v1;
                                    if (objM87133R7 == c28676v4) {
                                        c1042s = objM87133R7;
                                        c28676v5 = c28676v4;
                                        c4141w3 = c4141w2;
                                        c7 = 0;
                                        function9 = function7;
                                    }
                                    AbstractC25303l.m74291r(c4141w3, null, function16, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                    function7 = function9;
                                    c2314t = c2314t;
                                    i27 = i28;
                                    c28676v1 = c28676v5;
                                    c3 = 2;
                                    z25 = false;
                                } else {
                                    c28676v4 = c28676v1;
                                }
                                c28676v5 = c28676v4;
                                c4141w3 = c4141w2;
                                c7 = 0;
                                function9 = function7;
                                c1042s = new C1042s(function9, (Object) c4141w3, (Object) c0948a2, (Object) onViewEvent, 9);
                                c28655q.m87172p0(c1042s);
                                AbstractC25303l.m74291r(c4141w3, null, function16, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                function7 = function9;
                                c2314t = c2314t;
                                i27 = i28;
                                c28676v1 = c28676v5;
                                c3 = 2;
                                z25 = false;
                            }
                            c2314t3 = c2314t;
                            z26 = z25;
                            z27 = z16;
                            Function1 function17 = function7;
                            C28676v0 c28676v8 = c28676v1;
                            c28655q.m87173q(z26);
                            if (list.size() == z27) {
                                c28655q.m87150e0(-652389997);
                                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f19690a, c2314t3);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, modifierM3394p3.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z27))));
                                c28655q.m87173q(z26);
                            } else {
                                c28655q.m87150e0(-652013285);
                                c28655q.m87173q(z26);
                            }
                            c28655q.m87173q(z27);
                            function7 = function17;
                            c2314t = c2314t3;
                            z16 = z27;
                            i25 = i26;
                            c28676v1 = c28676v8;
                            c3 = 2;
                        }
                        function8 = function7;
                        AbstractC25012a.m73392y(c28655q, false, z16, false);
                        c28676v3 = c28676v1;
                        c2314t = c2314t;
                        i19 = i17;
                    } else {
                        c2314t2 = c2314t;
                        z16 = z16;
                        function8 = function7;
                        c28676v2 = c28676v1;
                        if (interfaceC25312u instanceof C39282o) {
                            c28655q.m87150e0(444867651);
                            C39282o c39282o3 = (C39282o) interfaceC25312u;
                            C4785h c4785h5 = new C4785h(0);
                            boolean zM87157i10 = c28655q.m87157i(interfaceC25312u);
                            if (i15 == 131072) {
                                z18 = z16;
                            } else {
                                z18 = false;
                            }
                            boolean zM87157i11 = zM87157i10 | z18 | c28655q.m87157i(c0948a2);
                            i24 = i17;
                            if (i24 == 16384) {
                                z19 = z16;
                            } else {
                                z19 = false;
                            }
                            z24 = zM87157i11 | z19;
                            objM87133R6 = c28655q.m87133R();
                            if (z24) {
                                c28676v3 = c28676v2;
                                if (objM87133R6 == c28676v3) {
                                    function8 = function8;
                                }
                                c2314t = c2314t2;
                                i19 = i24;
                                AbstractC25303l.m74291r(c39282o3, null, c4785h5, (Function1) objM87133R6, c28655q, 0, 2);
                                c28655q.m87173q(false);
                            } else {
                                c28676v3 = c28676v2;
                            }
                            C1042s c1042s4 = new C1042s((Object) c39282o3, (Object) function8, (Object) c0948a2, (Object) onNavigationEvent, 10);
                            function8 = function8;
                            c28655q.m87172p0(c1042s4);
                            objM87133R6 = c1042s4;
                            c2314t = c2314t2;
                            i19 = i24;
                            AbstractC25303l.m74291r(c39282o3, null, c4785h5, (Function1) objM87133R6, c28655q, 0, 2);
                            c28655q.m87173q(false);
                        } else {
                            z16 = z16;
                            c28676v3 = c28676v2;
                            c2314t = c2314t2;
                            i19 = i17;
                            if (interfaceC25312u instanceof C26436q) {
                                c28655q.m87150e0(445907050);
                                C26436q c26436q3 = (C26436q) interfaceC25312u;
                                C25307p c25307pM15052c7 = AbstractC4781d.m15052c();
                                C4785h c4785h6 = new C4785h(1);
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v3) {
                                    objM87133R5 = new C4769a(9);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                AbstractC25303l.m74291r(c26436q3, c25307pM15052c7, c4785h6, (Function1) objM87133R5, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                c28655q.m87173q(false);
                            } else if (interfaceC25312u instanceof C0140r) {
                                c28655q.m87150e0(446334261);
                                c0140r = (C0140r) interfaceC25312u;
                                C25307p c25307pM15052c8 = AbstractC4781d.m15052c();
                                C13762f c13762f5 = new C13762f(28);
                                if (i19 == 16384) {
                                    z17 = z16;
                                } else {
                                    z17 = false;
                                }
                                zM87157i2 = c28655q.m87157i(interfaceC25312u) | z17;
                                objM87133R4 = c28655q.m87133R();
                                if (zM87157i2) {
                                    objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC25303l.m74291r(c0140r, c25307pM15052c8, c13762f5, (Function1) objM87133R4, c28655q, C25307p.f99300b << 3, 0);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(446940745);
                                C25307p c25307pM15052c9 = AbstractC4781d.m15052c();
                                C13762f c13762f6 = new C13762f(29);
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v3) {
                                    objM87133R3 = new C4769a(10);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM15052c9, c13762f6, (Function1) objM87133R3, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                                c28655q.m87173q(false);
                            }
                        }
                    }
                    c0948a2 = c0948a;
                    c28676v1 = c28676v3;
                    function7 = function8;
                    i17 = i19;
                }
                function3 = onNavigationEvent;
                Function1 function18 = function7;
                c28655q.m87173q(false);
                strM2407b = viewState.getFooter();
                if (strM2407b == null) {
                    c28655q.m87150e0(-1806584003);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1806584002);
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, f19691b, 0.0f, 2);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i312 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM2407b, modifierM3396r6, c38072d3.m121949b(c28655q, i312).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i312).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(20, c2314t));
                c28655q.m87173q(z16);
                c28655q.m87173q(z16);
                function4 = function18;
            } else {
                function6 = function5;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i11 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N8);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t5, 0.0f, 15, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getTitle()), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i16 = 57344 & i29;
            if (i16 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C3189a(onNavigationEvent, 23);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3189a(onNavigationEvent, 23);
                c28655q.m87172p0(objM87133R2);
            }
            c28676v1 = c28676v0;
            c2314t = c2314t5;
            i17 = i16;
            function7 = function6;
            AbstractC6719b.m20143d(modifierM3398t4, aVar4, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            c28655q = c28655q;
            i18 = i29;
            z16 = true;
            Modifier modifierM34108a4 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q, C13404j.f46947x << 3, 6);
            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM34108a4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a9);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N12);
            c28655q.m87150e0(-751178324);
            while (r0.hasNext()) {
                if (interfaceC25312u instanceof C3353c) {
                    c28655q.m87150e0(442285847);
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, f19691b - f19690a, 0.0f, 2);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    c3 = 2;
                    ArrayList arrayListM74153v3 = AbstractC25265s.m74153v0(((C3353c) interfaceC25312u).m9684a(), 2);
                    c28655q.m87150e0(-1101686000);
                    i25 = 0;
                    while (r1.hasNext()) {
                        i26 = i25 + 1;
                        if (i25 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        list = (List) obj;
                        Modifier modifierM3388j4 = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90537w);
                        z25 = false;
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3388j4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                        c28655q.m87150e0(1780025758);
                        i27 = 0;
                        while (r21.hasNext()) {
                            i28 = i27 + 1;
                            if (i27 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c4141w2 = (C4141w2) obj2;
                            final int i313 = (i25 * 2) + i27;
                            z28 = z25;
                            Function3 function19 = new Function3() { // from class: ck1.g
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int iIntValue = ((Integer) obj5).intValue();
                                    return AbstractC4786i.m15101u(C23000t1.f90727a, i313, (C4141w2) obj3, (Composer) obj4, iIntValue);
                                }
                            };
                            if (i15 == 131072) {
                                z29 = z16;
                            } else {
                                z29 = z28;
                            }
                            boolean zM87157i12 = c28655q.m87157i(c4141w2) | z29 | c28655q.m87157i(c0948a2);
                            i18 = i18;
                            if ((i18 & 7168) == 2048) {
                                z34 = z16;
                            } else {
                                z34 = z28;
                            }
                            z35 = zM87157i12 | z34;
                            objM87133R7 = c28655q.m87133R();
                            if (z35) {
                                c28676v4 = c28676v1;
                                if (objM87133R7 == c28676v4) {
                                    c1042s = objM87133R7;
                                    c28676v5 = c28676v4;
                                    c4141w3 = c4141w2;
                                    c7 = 0;
                                    function9 = function7;
                                }
                                AbstractC25303l.m74291r(c4141w3, null, function19, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                                function7 = function9;
                                c2314t = c2314t;
                                i27 = i28;
                                c28676v1 = c28676v5;
                                c3 = 2;
                                z25 = false;
                            } else {
                                c28676v4 = c28676v1;
                            }
                            c28676v5 = c28676v4;
                            c4141w3 = c4141w2;
                            c7 = 0;
                            function9 = function7;
                            c1042s = new C1042s(function9, (Object) c4141w3, (Object) c0948a2, (Object) onViewEvent, 9);
                            c28655q.m87172p0(c1042s);
                            AbstractC25303l.m74291r(c4141w3, null, function19, (Function1) c1042s, c28655q, C4141w2.f16853o, 2);
                            function7 = function9;
                            c2314t = c2314t;
                            i27 = i28;
                            c28676v1 = c28676v5;
                            c3 = 2;
                            z25 = false;
                        }
                        c2314t3 = c2314t;
                        z26 = z25;
                        z27 = z16;
                        Function1 function110 = function7;
                        C28676v0 c28676v9 = c28676v1;
                        c28655q.m87173q(z26);
                        if (list.size() == z27) {
                            c28655q.m87150e0(-652389997);
                            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f19690a, c2314t3);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, modifierM3394p4.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z27))));
                            c28655q.m87173q(z26);
                        } else {
                            c28655q.m87150e0(-652013285);
                            c28655q.m87173q(z26);
                        }
                        c28655q.m87173q(z27);
                        function7 = function110;
                        c2314t = c2314t3;
                        z16 = z27;
                        i25 = i26;
                        c28676v1 = c28676v9;
                        c3 = 2;
                    }
                    function8 = function7;
                    AbstractC25012a.m73392y(c28655q, false, z16, false);
                    c28676v3 = c28676v1;
                    c2314t = c2314t;
                    i19 = i17;
                } else {
                    c2314t2 = c2314t;
                    z16 = z16;
                    function8 = function7;
                    c28676v2 = c28676v1;
                    if (interfaceC25312u instanceof C39282o) {
                        c28655q.m87150e0(444867651);
                        C39282o c39282o4 = (C39282o) interfaceC25312u;
                        C4785h c4785h7 = new C4785h(0);
                        boolean zM87157i13 = c28655q.m87157i(interfaceC25312u);
                        if (i15 == 131072) {
                            z18 = z16;
                        } else {
                            z18 = false;
                        }
                        boolean zM87157i14 = zM87157i13 | z18 | c28655q.m87157i(c0948a2);
                        i24 = i17;
                        if (i24 == 16384) {
                            z19 = z16;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87157i14 | z19;
                        objM87133R6 = c28655q.m87133R();
                        if (z24) {
                            c28676v3 = c28676v2;
                            if (objM87133R6 == c28676v3) {
                                function8 = function8;
                            }
                            c2314t = c2314t2;
                            i19 = i24;
                            AbstractC25303l.m74291r(c39282o4, null, c4785h7, (Function1) objM87133R6, c28655q, 0, 2);
                            c28655q.m87173q(false);
                        } else {
                            c28676v3 = c28676v2;
                        }
                        C1042s c1042s5 = new C1042s((Object) c39282o4, (Object) function8, (Object) c0948a2, (Object) onNavigationEvent, 10);
                        function8 = function8;
                        c28655q.m87172p0(c1042s5);
                        objM87133R6 = c1042s5;
                        c2314t = c2314t2;
                        i19 = i24;
                        AbstractC25303l.m74291r(c39282o4, null, c4785h7, (Function1) objM87133R6, c28655q, 0, 2);
                        c28655q.m87173q(false);
                    } else {
                        z16 = z16;
                        c28676v3 = c28676v2;
                        c2314t = c2314t2;
                        i19 = i17;
                        if (interfaceC25312u instanceof C26436q) {
                            c28655q.m87150e0(445907050);
                            C26436q c26436q4 = (C26436q) interfaceC25312u;
                            C25307p c25307pM15052c10 = AbstractC4781d.m15052c();
                            C4785h c4785h8 = new C4785h(1);
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v3) {
                                objM87133R5 = new C4769a(9);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC25303l.m74291r(c26436q4, c25307pM15052c10, c4785h8, (Function1) objM87133R5, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                            c28655q.m87173q(false);
                        } else if (interfaceC25312u instanceof C0140r) {
                            c28655q.m87150e0(446334261);
                            c0140r = (C0140r) interfaceC25312u;
                            C25307p c25307pM15052c11 = AbstractC4781d.m15052c();
                            C13762f c13762f7 = new C13762f(28);
                            if (i19 == 16384) {
                                z17 = z16;
                            } else {
                                z17 = false;
                            }
                            zM87157i2 = c28655q.m87157i(interfaceC25312u) | z17;
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C3169c(onNavigationEvent, c0140r, 13);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC25303l.m74291r(c0140r, c25307pM15052c11, c13762f7, (Function1) objM87133R4, c28655q, C25307p.f99300b << 3, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(446940745);
                            C25307p c25307pM15052c12 = AbstractC4781d.m15052c();
                            C13762f c13762f8 = new C13762f(29);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v3) {
                                objM87133R3 = new C4769a(10);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM15052c12, c13762f8, (Function1) objM87133R3, c28655q, (C25307p.f99300b << 3) | 3072, 0);
                            c28655q.m87173q(false);
                        }
                    }
                }
                c0948a2 = c0948a;
                c28676v1 = c28676v3;
                function7 = function8;
                i17 = i19;
            }
            function3 = onNavigationEvent;
            Function1 function111 = function7;
            c28655q.m87173q(false);
            strM2407b = viewState.getFooter();
            if (strM2407b == null) {
                c28655q.m87150e0(-1806584003);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1806584002);
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, f19691b, 0.0f, 2);
                C38072d c38072d4 = C38072d.f163053a;
                int i314 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM2407b, modifierM3396r8, c38072d4.m121949b(c28655q, i314).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i314).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(20, c2314t));
            c28655q.m87173q(z16);
            c28655q.m87173q(z16);
            function4 = function111;
        } else {
            function3 = onNavigationEvent;
            c28655q.m87138X();
            function4 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(viewState, c0948a, str, onViewEvent, function3, function4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m15099s(AbstractC36068a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m15100t(Function1 function1) {
        function1.invoke(AbstractC40770a.a.f175792a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Modifier m15101u(InterfaceC22997s1 interfaceC22997s1, int i13, C4141w2 it, Composer composer, int i14) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(113302277);
        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, interfaceC22997s1.mo66772c(AbstractC1136a.m3599a(AbstractC1099a.m3394p(f19690a, C2314t.f9131w), "KeyMetricTile" + i13), true, 1.0f));
        c28655q.m87173q(false);
        return modifierM3406c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m15102v(Function1 function1, C4141w2 c4141w2, C0948a c0948a, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        String id4 = c4141w2.getId();
        C4148x2 c4148x2M12882l = c4141w2.getTrend();
        function1.invoke(new AbstractC36068a.f(id4, c4148x2M12882l != null ? c4148x2M12882l.getTrendType() : null, c0948a));
        function2.invoke(new AbstractC0949b.e(c4141w2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Modifier m15103w(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(726426055);
        Modifier modifierM3394p = AbstractC1099a.m3394p(f19691b, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3394p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m15104x(InterfaceC25312u interfaceC25312u, Function1 function1, C0948a c0948a, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e destination = ((C39282o) interfaceC25312u).getDestination();
        if (destination != null) {
            if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9386p2.f27846w)) {
                function1.invoke(new AbstractC36068a.d(c0948a));
            }
            function2.invoke(new AbstractC40770a.c(destination));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Modifier m15105y(C26436q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-798115188);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m15106z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
