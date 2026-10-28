package kk1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dk1.AbstractC12112a;
import fy1.AbstractC14874j;
import gy0.AbstractC16277f;
import hk1.AbstractC17387a;
import ik1.AbstractC18609f;
import ik1.AbstractC18611h;
import ik1.C18607d;
import ik1.C18610g;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.List;
import jp1.C21852d;
import jp1.C21860l;
import kf0.C22429d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kk1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lik1/g;", "viewModel", "Lkotlin/Function1;", "Lhk1/a;", "Ll83/a0;", "onNavigationEvent", "Ldk1/a;", "onAnalyticsEvent", "y", "(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lik1/h;", "viewState", "Lik1/f;", "onViewEvent", "n", "(Lik1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "s", "healthspan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22543d {

    /* JADX INFO: renamed from: kk1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.view.HealthspanScreenKt$HealthspanContent$4$1", m100430f = "HealthspanScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88618w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f88619x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f88620y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f88621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, Function1 function1, Function1 function2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88619x = z4;
            this.f88620y = function1;
            this.f88621z = function2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f88619x, this.f88620y, this.f88621z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88618w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f88619x) {
                this.f88620y.invoke(AbstractC18609f.e.f72742a);
                this.f88621z.invoke(AbstractC17387a.c.f67327a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m65156A(AbstractC12112a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final AbstractC18611h m65157B(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC18611h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m65158C(C18610g c18610g, AbstractC18609f it) {
        AbstractC22676k.m65750j(it, "it");
        c18610g.m53860n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m65159D(C18610g c18610g, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m65184y(c18610g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m65173n(AbstractC18611h viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function8;
        Function1 function9;
        Function1 function10;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1904480782);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                i15 |= c28655q.m87157i(function4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C22429d(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    } else {
                        function8 = function1;
                    }
                    if (i19 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C22429d(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function9 = (Function1) objM87133R2;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C22429d(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        function10 = (Function1) objM87133R;
                    } else {
                        function10 = function3;
                    }
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), EnumC39333f.BACKGROUND_DARK_STD.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    Function1 function11 = function9;
                    m65178s(viewState, function8, function11, function10, c28655q, i15 & 8190, 0);
                    c28655q.m87173q(true);
                    function5 = function8;
                    function6 = function11;
                    function7 = function10;
                } else {
                    c28655q.m87138X();
                    function5 = function1;
                    function6 = function4;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22542c(viewState, function5, function6, function7, i13, i14, 1);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22429d(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function1;
                }
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22429d(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function9 = (Function1) objM87133R2;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C22429d(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    function10 = (Function1) objM87133R;
                } else {
                    function10 = function3;
                }
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), EnumC39333f.BACKGROUND_DARK_STD.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Function1 function12 = function9;
                m65178s(viewState, function8, function12, function10, c28655q, i15 & 8190, 0);
                c28655q.m87173q(true);
                function5 = function8;
                function6 = function12;
                function7 = function10;
            } else {
                c28655q.m87138X();
                function5 = function1;
                function6 = function4;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22542c(viewState, function5, function6, function7, i13, i14, 1);
            }
        }
        i15 |= 384;
        function4 = function2;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function3)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22429d(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function1;
                }
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22429d(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function9 = (Function1) objM87133R2;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C22429d(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    function10 = (Function1) objM87133R;
                } else {
                    function10 = function3;
                }
                Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), EnumC39333f.BACKGROUND_DARK_STD.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66724m3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Function1 function13 = function9;
                m65178s(viewState, function8, function13, function10, c28655q, i15 & 8190, 0);
                c28655q.m87173q(true);
                function5 = function8;
                function6 = function13;
                function7 = function10;
            } else {
                c28655q.m87138X();
                function5 = function1;
                function6 = function4;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22542c(viewState, function5, function6, function7, i13, i14, 1);
            }
        }
        i15 |= 3072;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22429d(9);
                    c28655q.m87172p0(objM87133R3);
                }
                function8 = (Function1) objM87133R3;
            } else {
                function8 = function1;
            }
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22429d(10);
                    c28655q.m87172p0(objM87133R2);
                }
                function9 = (Function1) objM87133R2;
            } else {
                function9 = function4;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C22429d(11);
                    c28655q.m87172p0(objM87133R);
                }
                function10 = (Function1) objM87133R;
            } else {
                function10 = function3;
            }
            Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), EnumC39333f.BACKGROUND_DARK_STD.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66724m4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            Function1 function14 = function9;
            m65178s(viewState, function8, function14, function10, c28655q, i15 & 8190, 0);
            c28655q.m87173q(true);
            function5 = function8;
            function6 = function14;
            function7 = function10;
        } else {
            c28655q.m87138X();
            function5 = function1;
            function6 = function4;
            function7 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22542c(viewState, function5, function6, function7, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m65174o(AbstractC18609f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m65175p(AbstractC12112a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m65176q(AbstractC17387a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m65177r(AbstractC18611h abstractC18611h, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m65173n(abstractC18611h, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0195  */
    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:105:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x020f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0213  */
    /* JADX WARN: Code duplicated, block: B:116:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x0234  */
    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private static final void m65178s(AbstractC18611h abstractC18611h, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        int i17;
        int i18;
        Function1 function5;
        int i19;
        boolean z4;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function9;
        int i24;
        Function1 function10;
        List list;
        Function1 function11;
        Function1 function12;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R;
        AbstractC18611h.c cVar;
        boolean zM53864e;
        C18607d c18607dM53863d;
        boolean z14;
        C18607d c18607dM53863d2;
        Boolean boolValueOf;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        Function1 function13;
        boolean z18;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-739037057);
        int i25 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(abstractC18611h) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function5 = function3;
                        if (c28655q.m87157i(function5)) {
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
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22429d(12);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function9 = (Function1) objM87133R5;
                        } else {
                            function9 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22429d(13);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            function10 = function2;
                        }
                        if (i24 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C22429d(7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function5 = (Function1) objM87133R3;
                        }
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (abstractC18611h instanceof AbstractC18611h.c) {
                            c28655q.m87150e0(-650272229);
                            cVar = (AbstractC18611h.c) abstractC18611h;
                            zM53864e = cVar.getHasNavigatedToOnboarding();
                            c18607dM53863d = cVar.getContent();
                            if (c18607dM53863d != null || c18607dM53863d.getHasOnboarded() || zM53864e) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            c18607dM53863d2 = cVar.getContent();
                            if (c18607dM53863d2 != null) {
                                boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                            } else {
                                boolValueOf = null;
                            }
                            boolean zM87155h = c28655q.m87155h(z14);
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean z19 = zM87155h | z15;
                            if ((i15 & 7168) == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z19 | z16;
                            objM87133R2 = c28655q.m87133R();
                            if (z17 || objM87133R2 == c28676v0) {
                                objM87133R2 = new a(z14, function9, function5, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                            if (z14) {
                                function13 = function5;
                                z18 = false;
                                c28655q.m87150e0(-649413405);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-649735774);
                                int i27 = i15 & 14;
                                int i28 = i15 << 3;
                                Function1 function14 = function5;
                                AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function14, c28655q, (i28 & 57344) | i27 | (i28 & 896) | (i28 & 7168), 0);
                                function13 = function14;
                                z18 = false;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z18);
                            function12 = function13;
                        } else {
                            function9 = function9;
                            function10 = function10;
                            function11 = function5;
                            if (abstractC18611h instanceof AbstractC18611h.a) {
                                c28655q.m87150e0(-649350630);
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                                if ((i15 & 7168) == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R = c28655q.m87133R();
                                if (z13 || objM87133R == c28676v0) {
                                    objM87133R = new C21860l(function11, 21);
                                    c28655q.m87172p0(objM87133R);
                                }
                                function12 = function11;
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function12 = function11;
                                if (abstractC18611h instanceof AbstractC18611h.b) {
                                    throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                                }
                                c28655q.m87150e0(-648919978);
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
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                        }
                        function7 = function9;
                        function6 = function10;
                        function8 = function12;
                    } else {
                        c28655q.m87138X();
                        function6 = function2;
                        function7 = function4;
                        function8 = function5;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
                    }
                }
                i15 |= 3072;
                function5 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22429d(12);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function9 = (Function1) objM87133R5;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(13);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        function10 = function2;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C22429d(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function5 = (Function1) objM87133R3;
                    }
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (abstractC18611h instanceof AbstractC18611h.c) {
                        c28655q.m87150e0(-650272229);
                        cVar = (AbstractC18611h.c) abstractC18611h;
                        zM53864e = cVar.getHasNavigatedToOnboarding();
                        c18607dM53863d = cVar.getContent();
                        if (c18607dM53863d != null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        c18607dM53863d2 = cVar.getContent();
                        if (c18607dM53863d2 != null) {
                            boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                        } else {
                            boolValueOf = null;
                        }
                        boolean zM87155h2 = c28655q.m87155h(z14);
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z110 = zM87155h2 | z15;
                        if ((i15 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z110 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                        if (z14) {
                            c28655q.m87150e0(-649735774);
                            int i29 = i15 & 14;
                            int i210 = i15 << 3;
                            Function1 function15 = function5;
                            AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function15, c28655q, (i210 & 57344) | i29 | (i210 & 896) | (i210 & 7168), 0);
                            function13 = function15;
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function5;
                            z18 = false;
                            c28655q.m87150e0(-649413405);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z18);
                        function12 = function13;
                    } else {
                        function9 = function9;
                        function10 = function10;
                        function11 = function5;
                        if (abstractC18611h instanceof AbstractC18611h.a) {
                            c28655q.m87150e0(-649350630);
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            }
                            function12 = function11;
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function11;
                            if (abstractC18611h instanceof AbstractC18611h.b) {
                                throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                            }
                            c28655q.m87150e0(-648919978);
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
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function9;
                    function6 = function10;
                    function8 = function12;
                } else {
                    c28655q.m87138X();
                    function6 = function2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
                }
            }
            i15 |= 384;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function3;
                    if (c28655q.m87157i(function5)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22429d(12);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function9 = (Function1) objM87133R5;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(13);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        function10 = function2;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C22429d(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function5 = (Function1) objM87133R3;
                    }
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (abstractC18611h instanceof AbstractC18611h.c) {
                        c28655q.m87150e0(-650272229);
                        cVar = (AbstractC18611h.c) abstractC18611h;
                        zM53864e = cVar.getHasNavigatedToOnboarding();
                        c18607dM53863d = cVar.getContent();
                        if (c18607dM53863d != null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        c18607dM53863d2 = cVar.getContent();
                        if (c18607dM53863d2 != null) {
                            boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                        } else {
                            boolValueOf = null;
                        }
                        boolean zM87155h3 = c28655q.m87155h(z14);
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z111 = zM87155h3 | z15;
                        if ((i15 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z111 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                        if (z14) {
                            c28655q.m87150e0(-649735774);
                            int i211 = i15 & 14;
                            int i212 = i15 << 3;
                            Function1 function16 = function5;
                            AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function16, c28655q, (i212 & 57344) | i211 | (i212 & 896) | (i212 & 7168), 0);
                            function13 = function16;
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function5;
                            z18 = false;
                            c28655q.m87150e0(-649413405);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z18);
                        function12 = function13;
                    } else {
                        function9 = function9;
                        function10 = function10;
                        function11 = function5;
                        if (abstractC18611h instanceof AbstractC18611h.a) {
                            c28655q.m87150e0(-649350630);
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            }
                            function12 = function11;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function11;
                            if (abstractC18611h instanceof AbstractC18611h.b) {
                                throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                            }
                            c28655q.m87150e0(-648919978);
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
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function9;
                    function6 = function10;
                    function8 = function12;
                } else {
                    c28655q.m87138X();
                    function6 = function2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
                }
            }
            i15 |= 3072;
            function5 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22429d(12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function9 = (Function1) objM87133R5;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                    i24 = i18;
                } else {
                    i24 = i18;
                    function10 = function2;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22429d(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function5 = (Function1) objM87133R3;
                }
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (abstractC18611h instanceof AbstractC18611h.c) {
                    c28655q.m87150e0(-650272229);
                    cVar = (AbstractC18611h.c) abstractC18611h;
                    zM53864e = cVar.getHasNavigatedToOnboarding();
                    c18607dM53863d = cVar.getContent();
                    if (c18607dM53863d != null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    c18607dM53863d2 = cVar.getContent();
                    if (c18607dM53863d2 != null) {
                        boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                    } else {
                        boolValueOf = null;
                    }
                    boolean zM87155h4 = c28655q.m87155h(z14);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z112 = zM87155h4 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z112 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    if (z14) {
                        c28655q.m87150e0(-649735774);
                        int i213 = i15 & 14;
                        int i214 = i15 << 3;
                        Function1 function17 = function5;
                        AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function17, c28655q, (i214 & 57344) | i213 | (i214 & 896) | (i214 & 7168), 0);
                        function13 = function17;
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function5;
                        z18 = false;
                        c28655q.m87150e0(-649413405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z18);
                    function12 = function13;
                } else {
                    function9 = function9;
                    function10 = function10;
                    function11 = function5;
                    if (abstractC18611h instanceof AbstractC18611h.a) {
                        c28655q.m87150e0(-649350630);
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        }
                        function12 = function11;
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function11;
                        if (abstractC18611h instanceof AbstractC18611h.b) {
                            throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                        }
                        c28655q.m87150e0(-648919978);
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
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function9;
                function6 = function10;
                function8 = function12;
            } else {
                c28655q.m87138X();
                function6 = function2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function3;
                    if (c28655q.m87157i(function5)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22429d(12);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function9 = (Function1) objM87133R5;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(13);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        function10 = function2;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C22429d(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function5 = (Function1) objM87133R3;
                    }
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (abstractC18611h instanceof AbstractC18611h.c) {
                        c28655q.m87150e0(-650272229);
                        cVar = (AbstractC18611h.c) abstractC18611h;
                        zM53864e = cVar.getHasNavigatedToOnboarding();
                        c18607dM53863d = cVar.getContent();
                        if (c18607dM53863d != null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        c18607dM53863d2 = cVar.getContent();
                        if (c18607dM53863d2 != null) {
                            boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                        } else {
                            boolValueOf = null;
                        }
                        boolean zM87155h5 = c28655q.m87155h(z14);
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z113 = zM87155h5 | z15;
                        if ((i15 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z113 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(z14, function9, function5, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                        if (z14) {
                            c28655q.m87150e0(-649735774);
                            int i215 = i15 & 14;
                            int i216 = i15 << 3;
                            Function1 function18 = function5;
                            AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function18, c28655q, (i216 & 57344) | i215 | (i216 & 896) | (i216 & 7168), 0);
                            function13 = function18;
                            z18 = false;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function5;
                            z18 = false;
                            c28655q.m87150e0(-649413405);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z18);
                        function12 = function13;
                    } else {
                        function9 = function9;
                        function10 = function10;
                        function11 = function5;
                        if (abstractC18611h instanceof AbstractC18611h.a) {
                            c28655q.m87150e0(-649350630);
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13) {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C21860l(function11, 21);
                                c28655q.m87172p0(objM87133R);
                            }
                            function12 = function11;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function11;
                            if (abstractC18611h instanceof AbstractC18611h.b) {
                                throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                            }
                            c28655q.m87150e0(-648919978);
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
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function9;
                    function6 = function10;
                    function8 = function12;
                } else {
                    c28655q.m87138X();
                    function6 = function2;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
                }
            }
            i15 |= 3072;
            function5 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22429d(12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function9 = (Function1) objM87133R5;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                    i24 = i18;
                } else {
                    i24 = i18;
                    function10 = function2;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22429d(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function5 = (Function1) objM87133R3;
                }
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (abstractC18611h instanceof AbstractC18611h.c) {
                    c28655q.m87150e0(-650272229);
                    cVar = (AbstractC18611h.c) abstractC18611h;
                    zM53864e = cVar.getHasNavigatedToOnboarding();
                    c18607dM53863d = cVar.getContent();
                    if (c18607dM53863d != null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    c18607dM53863d2 = cVar.getContent();
                    if (c18607dM53863d2 != null) {
                        boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                    } else {
                        boolValueOf = null;
                    }
                    boolean zM87155h6 = c28655q.m87155h(z14);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z114 = zM87155h6 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z114 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    if (z14) {
                        c28655q.m87150e0(-649735774);
                        int i217 = i15 & 14;
                        int i218 = i15 << 3;
                        Function1 function19 = function5;
                        AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function19, c28655q, (i218 & 57344) | i217 | (i218 & 896) | (i218 & 7168), 0);
                        function13 = function19;
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function5;
                        z18 = false;
                        c28655q.m87150e0(-649413405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z18);
                    function12 = function13;
                } else {
                    function9 = function9;
                    function10 = function10;
                    function11 = function5;
                    if (abstractC18611h instanceof AbstractC18611h.a) {
                        c28655q.m87150e0(-649350630);
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        }
                        function12 = function11;
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function11;
                        if (abstractC18611h instanceof AbstractC18611h.b) {
                            throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                        }
                        c28655q.m87150e0(-648919978);
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
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function9;
                function6 = function10;
                function8 = function12;
            } else {
                c28655q.m87138X();
                function6 = function2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
            }
        }
        i15 |= 384;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function3;
                if (c28655q.m87157i(function5)) {
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
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22429d(12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function9 = (Function1) objM87133R5;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                    i24 = i18;
                } else {
                    i24 = i18;
                    function10 = function2;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22429d(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function5 = (Function1) objM87133R3;
                }
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (abstractC18611h instanceof AbstractC18611h.c) {
                    c28655q.m87150e0(-650272229);
                    cVar = (AbstractC18611h.c) abstractC18611h;
                    zM53864e = cVar.getHasNavigatedToOnboarding();
                    c18607dM53863d = cVar.getContent();
                    if (c18607dM53863d != null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    c18607dM53863d2 = cVar.getContent();
                    if (c18607dM53863d2 != null) {
                        boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                    } else {
                        boolValueOf = null;
                    }
                    boolean zM87155h7 = c28655q.m87155h(z14);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z115 = zM87155h7 | z15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z115 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(z14, function9, function5, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    if (z14) {
                        c28655q.m87150e0(-649735774);
                        int i219 = i15 & 14;
                        int i2110 = i15 << 3;
                        Function1 function110 = function5;
                        AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function110, c28655q, (i2110 & 57344) | i219 | (i2110 & 896) | (i2110 & 7168), 0);
                        function13 = function110;
                        z18 = false;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function5;
                        z18 = false;
                        c28655q.m87150e0(-649413405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z18);
                    function12 = function13;
                } else {
                    function9 = function9;
                    function10 = function10;
                    function11 = function5;
                    if (abstractC18611h instanceof AbstractC18611h.a) {
                        c28655q.m87150e0(-649350630);
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21860l(function11, 21);
                            c28655q.m87172p0(objM87133R);
                        }
                        function12 = function11;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function11;
                        if (abstractC18611h instanceof AbstractC18611h.b) {
                            throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                        }
                        c28655q.m87150e0(-648919978);
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
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function9;
                function6 = function10;
                function8 = function12;
            } else {
                c28655q.m87138X();
                function6 = function2;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
            }
        }
        i15 |= 3072;
        function5 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C22429d(12);
                    c28655q.m87172p0(objM87133R5);
                }
                function9 = (Function1) objM87133R5;
            } else {
                function9 = function4;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C22429d(13);
                    c28655q.m87172p0(objM87133R4);
                }
                function10 = (Function1) objM87133R4;
                i24 = i18;
            } else {
                i24 = i18;
                function10 = function2;
            }
            if (i24 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22429d(7);
                    c28655q.m87172p0(objM87133R3);
                }
                function5 = (Function1) objM87133R3;
            }
            list = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (abstractC18611h instanceof AbstractC18611h.c) {
                c28655q.m87150e0(-650272229);
                cVar = (AbstractC18611h.c) abstractC18611h;
                zM53864e = cVar.getHasNavigatedToOnboarding();
                c18607dM53863d = cVar.getContent();
                if (c18607dM53863d != null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                c18607dM53863d2 = cVar.getContent();
                if (c18607dM53863d2 != null) {
                    boolValueOf = Boolean.valueOf(c18607dM53863d2.getHasOnboarded());
                } else {
                    boolValueOf = null;
                }
                boolean zM87155h8 = c28655q.m87155h(z14);
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z116 = zM87155h8 | z15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z116 | z16;
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new a(z14, function9, function5, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z14, function9, function5, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                if (z14) {
                    c28655q.m87150e0(-649735774);
                    int i2111 = i15 & 14;
                    int i2112 = i15 << 3;
                    Function1 function111 = function5;
                    AbstractC22546g.m65228d0(cVar, zM53864e, function9, function10, function111, c28655q, (i2112 & 57344) | i2111 | (i2112 & 896) | (i2112 & 7168), 0);
                    function13 = function111;
                    z18 = false;
                    c28655q.m87173q(false);
                } else {
                    function13 = function5;
                    z18 = false;
                    c28655q.m87150e0(-649413405);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z18);
                function12 = function13;
            } else {
                function9 = function9;
                function10 = function10;
                function11 = function5;
                if (abstractC18611h instanceof AbstractC18611h.a) {
                    c28655q.m87150e0(-649350630);
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i25, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i25, objArr3 == true ? 1 : 0);
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C21860l(function11, 21);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21860l(function11, 21);
                        c28655q.m87172p0(objM87133R);
                    }
                    function12 = function11;
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function12 = function11;
                    if (abstractC18611h instanceof AbstractC18611h.b) {
                        throw AbstractC11895b.m32003v(-1544998252, c28655q, false);
                    }
                    c28655q.m87150e0(-648919978);
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
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            }
            function7 = function9;
            function6 = function10;
            function8 = function12;
        } else {
            c28655q.m87138X();
            function6 = function2;
            function7 = function4;
            function8 = function5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22542c(abstractC18611h, function7, function6, function8, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m65179t(AbstractC18609f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m65180u(AbstractC12112a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m65181v(AbstractC17387a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m65182w(Function1 function1) {
        function1.invoke(AbstractC17387a.a.f67324a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m65183x(AbstractC18611h abstractC18611h, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m65178s(abstractC18611h, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m65184y(C18610g viewModel, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1971482587);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C22429d(6);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22429d(8);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), AbstractC18611h.b.f72766b, null, c28655q, 48, 2);
            AbstractC14874j.m42904c(m65157B(interfaceC28601c1M87260n), "healthcare_healthspan", c28655q, 48);
            AbstractC18611h abstractC18611hM65157B = m65157B(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C19962a(viewModel, 16);
                c28655q.m87172p0(objM87133R3);
            }
            m65173n(abstractC18611hM65157B, (Function1) objM87133R3, function2, function1, c28655q, (i15 & 896) | ((i15 << 6) & 7168), 0);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        Function1 function3 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 11, viewModel, function2, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m65185z(AbstractC17387a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
