package vo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import f11.AbstractC14004d;
import f11.C14005e;
import fy1.AbstractC14874j;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j11.AbstractC21211n;
import java.util.List;
import l83.C23454a0;
import mf0.C25504c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import o71.C27632b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32632k2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import ro1.AbstractC31629a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.AbstractC32838v;
import so1.AbstractC32840x;
import so1.C32812f;
import so1.C32814g;
import so1.C32818i;
import so1.C32822k;
import tp1.C34064d;
import uf0.C34904e;
import uv0.AbstractC35283c;
import uz1.C35429g;
import v41.C35657b0;
import ve0.C35926d;
import wb3.AbstractC37056f;
import wo1.AbstractC37458l;
import x81.C38072d;
import xn1.AbstractC38480c;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: vo1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lso1/x;", "viewState", "Lkotlin/Function1;", "Lso1/v;", "Ll83/a0;", "onViewEvent", "Lro1/a;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "t", "(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lso1/x$f;", "A", "(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lso1/i;", "currentBottomState", "", "showHideDialog", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36232g {

    /* JADX INFO: renamed from: vo1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciCyclesScreenKt$MciCyclesScreen$7$1", m100430f = "MciCyclesScreen.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155146w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155147x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155147x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f155147x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155146w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f155146w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f155147x.invoke(AbstractC32838v.b.f136829a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciCyclesScreenKt$SuccessMciCycleScreen$5$2$1$1$1$1$1$1$1", m100430f = "MciCyclesScreen.kt", m100431l = {231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155148w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32814g f155149x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f155150y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155151z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C32814g c32814g, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155149x = c32814g;
            this.f155150y = c15199y3;
            this.f155151z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f155149x, this.f155150y, this.f155151z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155148w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36232g.m115440N(this.f155151z, this.f155149x.getBottomSheet());
                C15199y3 c15199y3 = this.f155150y;
                this.f155148w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f155152w = new c();

        /* JADX INFO: renamed from: a */
        public final long m115472a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m115472a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: vo1.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciCyclesScreenKt$SuccessMciCycleScreen$5$2$1$1$1$1$2$3$1$1", m100430f = "MciCyclesScreen.kt", m100431l = {252}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155153w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32814g f155154x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f155155y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f155156z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C32814g c32814g, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155154x = c32814g;
            this.f155155y = c15199y3;
            this.f155156z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f155154x, this.f155155y, this.f155156z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155153w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36232g.m115440N(this.f155156z, this.f155154x.getBottomSheet());
                C15199y3 c15199y3 = this.f155155y;
                this.f155153w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0281  */
    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    /* JADX WARN: Code duplicated, block: B:109:0x028d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:114:0x0308  */
    /* JADX WARN: Code duplicated, block: B:115:0x030c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:122:0x032b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0348 A[LOOP:0: B:124:0x0342->B:126:0x0348, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:130:0x040c  */
    /* JADX WARN: Code duplicated, block: B:132:0x041a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0420  */
    /* JADX WARN: Code duplicated, block: B:136:0x0424  */
    /* JADX WARN: Code duplicated, block: B:137:0x0426  */
    /* JADX WARN: Code duplicated, block: B:140:0x042e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0433  */
    /* JADX WARN: Code duplicated, block: B:144:0x0438  */
    /* JADX WARN: Code duplicated, block: B:148:0x0450  */
    /* JADX WARN: Code duplicated, block: B:152:0x0466  */
    /* JADX WARN: Code duplicated, block: B:155:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0473  */
    /* JADX WARN: Code duplicated, block: B:161:0x0493  */
    /* JADX WARN: Code duplicated, block: B:164:0x049f  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x013a  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x0218  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:97:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x023d  */
    /* JADX INFO: renamed from: A */
    public static final void m115427A(AbstractC32840x.f viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        Function1 function4;
        int i15;
        Function1 function5;
        int i16;
        int i17;
        Function1 function6;
        int i18;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        Function1 function12;
        Function1 function13;
        C15199y3 c15199y3M3460c;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        C28676v0 c28676v1;
        int i19;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        boolean z13;
        Object objM87133R4;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        int i25;
        Function1 function14;
        C28676v0 c28676v4;
        float f13;
        int iHashCode2;
        C32818i c32818iM115439M;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R5;
        C28676v0 c28676v5;
        Function1 function15;
        Function1 function16;
        Object objM87133R6;
        boolean z17;
        Object objM87133R7;
        Function1 function17;
        Object objM87133R8;
        boolean z18;
        Object objM87133R9;
        Object objM87133R10;
        Object objM87133R11;
        Object objM87133R12;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1139353778);
        int i26 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i26 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i26 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i26 |= i18;
                    }
                    if ((i26 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i27 != 0) {
                            objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C35926d(19);
                                c28655q.m87172p0(objM87133R12);
                            }
                            function10 = (Function1) objM87133R12;
                        } else {
                            function10 = function4;
                        }
                        if (i15 != 0) {
                            objM87133R11 = c28655q.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35926d(20);
                                c28655q.m87172p0(objM87133R11);
                            }
                            function11 = (Function1) objM87133R11;
                        } else {
                            function11 = function5;
                        }
                        if (i17 != 0) {
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C35926d(21);
                                c28655q.m87172p0(objM87133R10);
                            }
                            function6 = (Function1) objM87133R10;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        function12 = function11;
                        function13 = function6;
                        c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        if (m115441O(interfaceC28601c2)) {
                            c28655q.m87150e0(-637542270);
                            C34064d c34064dM103062b = viewState.getHidingCycleModal();
                            TextResource textResourceM107671d = c34064dM103062b.getTitleDisplay();
                            TextResource textResourceM107668a = c34064dM103062b.getDescriptionDisplay();
                            TextResource textResourceM107669b = c34064dM103062b.getPrimaryButtonTitle();
                            TextResource textResourceM107670c = c34064dM103062b.getSecondaryButtonTitle();
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35429g(7, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R8);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
                            if ((i26 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R9 = c28655q.m87133R();
                            if (z18 || objM87133R9 == c28676v0) {
                                objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            int i28 = TextResource.$stable;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28676v1 = c28676v0;
                            AbstractC21211n.m59497o(null, textResourceM107671d, textResourceM107668a, textResourceM107669b, false, null, null, null, null, textResourceM107670c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i28 << 3) | (i28 << 6) | (i28 << 9) | (i28 << 27), 0, 384, 247463409);
                            c28655q = c28655q;
                            i19 = 0;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC28601c3 = interfaceC28601c1;
                            c28676v1 = c28676v0;
                            i19 = 0;
                            c28655q.m87150e0(-636913776);
                            c28655q.m87173q(false);
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C2305k c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, i19);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                        i24 = i26 & 896;
                        if (i24 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z13) {
                            c28676v2 = c28676v1;
                        } else {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                c28676v3 = c28676v2;
                            }
                            C28655q c28655q2 = c28655q;
                            i25 = i26;
                            function14 = function10;
                            c28676v4 = c28676v3;
                            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                            c28655q = c28655q2;
                            f13 = 8;
                            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                            c28655q.m87150e0(-644687961);
                            for (C32812f c32812f : viewState.m103064d()) {
                                String strM21274h = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                                C38072d c38072d = C38072d.f163053a;
                                int i29 = C38072d.f163054b;
                                float f14 = f13;
                                C28655q c28655q3 = c28655q;
                                C2314t c2314t2 = c2314t;
                                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i29).getT3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                                float f15 = 4;
                                float f16 = 3 * f15;
                                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f16, c2314t2));
                                AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t2), AbstractC33253j.m105489e(f16), c38072d.m121949b(c28655q3, i29).getWhite10(), null, 0 * f15, AbstractC37817c.m121344e(-634725604, c28655q3, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q3, 1769478, 24);
                                c28655q = c28655q3;
                                AbstractC18489d0.m53380u(f14, f15, c2314t2, c28655q);
                                f13 = f14;
                                c2314t = c2314t2;
                            }
                            AbstractC25012a.m73392y(c28655q, false, true, true);
                            c32818iM115439M = m115439M(interfaceC28601c3);
                            if (c32818iM115439M == null) {
                                c28655q.m87150e0(-633223289);
                                c28655q.m87173q(false);
                                function17 = function14;
                                function15 = function12;
                                function16 = function13;
                            } else {
                                c28655q.m87150e0(-633223288);
                                if ((i25 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i24 == 256) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objM87133R5 = c28655q.m87133R();
                                if (z16) {
                                    c28676v5 = c28676v4;
                                } else {
                                    c28676v5 = c28676v4;
                                    if (objM87133R5 == c28676v5) {
                                        function15 = function12;
                                        function16 = function13;
                                    }
                                    Function1 function18 = (Function1) objM87133R5;
                                    objM87133R6 = c28655q.m87133R();
                                    if (objM87133R6 == c28676v5) {
                                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                                    z17 = (i25 & 112) == 32;
                                    objM87133R7 = c28655q.m87133R();
                                    if (!z17 || objM87133R7 == c28676v5) {
                                        function17 = function14;
                                        objM87133R7 = new C35657b0(function17, 6);
                                        c28655q.m87172p0(objM87133R7);
                                    } else {
                                        function17 = function14;
                                    }
                                    C28655q c28655q4 = c28655q;
                                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function18, interfaceC4339a2, (Function1) objM87133R7, c28655q4, 3136);
                                    c28655q = c28655q4;
                                    c28655q.m87173q(false);
                                }
                                function15 = function12;
                                function16 = function13;
                                objM87133R5 = new C2777c(function16, 17, function15);
                                c28655q.m87172p0(objM87133R5);
                                Function1 function19 = (Function1) objM87133R5;
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v5) {
                                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R6;
                                if ((i25 & 112) == 32) {
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z17) {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                C28655q c28655q5 = c28655q;
                                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function19, interfaceC4339a3, (Function1) objM87133R7, c28655q5, 3136);
                                c28655q = c28655q5;
                                c28655q.m87173q(false);
                            }
                            function7 = function17;
                            function8 = function15;
                            function9 = function16;
                        }
                        c28676v3 = c28676v2;
                        objM87133R4 = new C34904e(function12, 17);
                        c28655q.m87172p0(objM87133R4);
                        C28655q c28655q6 = c28655q;
                        i25 = i26;
                        function14 = function10;
                        c28676v4 = c28676v3;
                        AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R4, null, null, c28655q6, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q6;
                        f13 = 8;
                        Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        c28655q.m87150e0(-644687961);
                        while (r0.hasNext()) {
                            String strM21274h2 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i210 = C38072d.f163054b;
                            float f17 = f13;
                            C28655q c28655q7 = c28655q;
                            C2314t c2314t3 = c2314t;
                            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i210).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getT3(), null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                            float f18 = 4;
                            float f19 = 3 * f18;
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(f19, c2314t3));
                            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t3), AbstractC33253j.m105489e(f19), c38072d2.m121949b(c28655q7, i210).getWhite10(), null, 0 * f18, AbstractC37817c.m121344e(-634725604, c28655q7, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q7, 1769478, 24);
                            c28655q = c28655q7;
                            AbstractC18489d0.m53380u(f17, f18, c2314t3, c28655q);
                            f13 = f17;
                            c2314t = c2314t3;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        c32818iM115439M = m115439M(interfaceC28601c3);
                        if (c32818iM115439M == null) {
                            c28655q.m87150e0(-633223289);
                            c28655q.m87173q(false);
                            function17 = function14;
                            function15 = function12;
                            function16 = function13;
                        } else {
                            c28655q.m87150e0(-633223288);
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R5 = c28655q.m87133R();
                            if (z16) {
                                c28676v5 = c28676v4;
                                if (objM87133R5 == c28676v5) {
                                    function15 = function12;
                                    function16 = function13;
                                }
                                Function1 function110 = (Function1) objM87133R5;
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v5) {
                                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                                if ((i25 & 112) == 32) {
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z17) {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                C28655q c28655q8 = c28655q;
                                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function110, interfaceC4339a4, (Function1) objM87133R7, c28655q8, 3136);
                                c28655q = c28655q8;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v4;
                            }
                            function15 = function12;
                            function16 = function13;
                            objM87133R5 = new C2777c(function16, 17, function15);
                            c28655q.m87172p0(objM87133R5);
                            Function1 function111 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q9 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function111, interfaceC4339a5, (Function1) objM87133R7, c28655q9, 3136);
                            c28655q = c28655q9;
                            c28655q.m87173q(false);
                        }
                        function7 = function17;
                        function8 = function15;
                        function9 = function16;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
                    }
                }
                i26 |= 3072;
                function6 = function3;
                if ((i26 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C35926d(19);
                            c28655q.m87172p0(objM87133R12);
                        }
                        function10 = (Function1) objM87133R12;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35926d(20);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function11 = (Function1) objM87133R11;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35926d(21);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function6 = (Function1) objM87133R10;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function12 = function11;
                    function13 = function6;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m115441O(interfaceC28601c2)) {
                        c28655q.m87150e0(-637542270);
                        C34064d c34064dM103062b2 = viewState.getHidingCycleModal();
                        TextResource textResourceM107671d2 = c34064dM103062b2.getTitleDisplay();
                        TextResource textResourceM107668a2 = c34064dM103062b2.getDescriptionDisplay();
                        TextResource textResourceM107669b2 = c34064dM103062b2.getPrimaryButtonTitle();
                        TextResource textResourceM107670c2 = c34064dM103062b2.getSecondaryButtonTitle();
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35429g(7, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                        if ((i26 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z18) {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i211 = TextResource.$stable;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        AbstractC21211n.m59497o(null, textResourceM107671d2, textResourceM107668a2, textResourceM107669b2, false, null, null, null, null, textResourceM107670c2, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a6, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i211 << 3) | (i211 << 6) | (i211 << 9) | (i211 << 27), 0, 384, 247463409);
                        c28655q = c28655q;
                        i19 = 0;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        i19 = 0;
                        c28655q.m87150e0(-636913776);
                        c28655q.m87173q(false);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9110M;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, i19);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    i24 = i26 & 896;
                    if (i24 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            c28676v3 = c28676v2;
                        }
                        C28655q c28655q10 = c28655q;
                        i25 = i26;
                        function14 = function10;
                        c28676v4 = c28676v3;
                        AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R4, null, null, c28655q10, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q10;
                        f13 = 8;
                        Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                        c28655q.m87150e0(-644687961);
                        while (r0.hasNext()) {
                            String strM21274h3 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                            C38072d c38072d3 = C38072d.f163053a;
                            int i212 = C38072d.f163054b;
                            float f110 = f13;
                            C28655q c28655q11 = c28655q;
                            C2314t c2314t4 = c2314t;
                            AbstractC30795n.m94707h(strM21274h3, null, c38072d3.m121949b(c28655q, i212).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i212).getT3(), null, c28655q11, 0, C2886a.f11498d << 18, 196602);
                            float f111 = 4;
                            float f112 = 3 * f111;
                            AbstractC22953f.m66715b(c28655q11, AbstractC1102d.m3419p(f112, c2314t4));
                            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t4), AbstractC33253j.m105489e(f112), c38072d3.m121949b(c28655q11, i212).getWhite10(), null, 0 * f111, AbstractC37817c.m121344e(-634725604, c28655q11, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q11, 1769478, 24);
                            c28655q = c28655q11;
                            AbstractC18489d0.m53380u(f110, f111, c2314t4, c28655q);
                            f13 = f110;
                            c2314t = c2314t4;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        c32818iM115439M = m115439M(interfaceC28601c3);
                        if (c32818iM115439M == null) {
                            c28655q.m87150e0(-633223289);
                            c28655q.m87173q(false);
                            function17 = function14;
                            function15 = function12;
                            function16 = function13;
                        } else {
                            c28655q.m87150e0(-633223288);
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R5 = c28655q.m87133R();
                            if (z16) {
                                c28676v5 = c28676v4;
                                if (objM87133R5 == c28676v5) {
                                    function15 = function12;
                                    function16 = function13;
                                }
                                Function1 function112 = (Function1) objM87133R5;
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v5) {
                                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                                if ((i25 & 112) == 32) {
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z17) {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                C28655q c28655q12 = c28655q;
                                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function112, interfaceC4339a7, (Function1) objM87133R7, c28655q12, 3136);
                                c28655q = c28655q12;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v4;
                            }
                            function15 = function12;
                            function16 = function13;
                            objM87133R5 = new C2777c(function16, 17, function15);
                            c28655q.m87172p0(objM87133R5);
                            Function1 function113 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q13 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function113, interfaceC4339a8, (Function1) objM87133R7, c28655q13, 3136);
                            c28655q = c28655q13;
                            c28655q.m87173q(false);
                        }
                        function7 = function17;
                        function8 = function15;
                        function9 = function16;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    c28676v3 = c28676v2;
                    objM87133R4 = new C34904e(function12, 17);
                    c28655q.m87172p0(objM87133R4);
                    C28655q c28655q14 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R4, null, null, c28655q14, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q14;
                    f13 = 8;
                    Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h4 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d4 = C38072d.f163053a;
                        int i213 = C38072d.f163054b;
                        float f113 = f13;
                        C28655q c28655q15 = c28655q;
                        C2314t c2314t5 = c2314t;
                        AbstractC30795n.m94707h(strM21274h4, null, c38072d4.m121949b(c28655q, i213).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i213).getT3(), null, c28655q15, 0, C2886a.f11498d << 18, 196602);
                        float f114 = 4;
                        float f115 = 3 * f114;
                        AbstractC22953f.m66715b(c28655q15, AbstractC1102d.m3419p(f115, c2314t5));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t5), AbstractC33253j.m105489e(f115), c38072d4.m121949b(c28655q15, i213).getWhite10(), null, 0 * f114, AbstractC37817c.m121344e(-634725604, c28655q15, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q15, 1769478, 24);
                        c28655q = c28655q15;
                        AbstractC18489d0.m53380u(f113, f114, c2314t5, c28655q);
                        f13 = f113;
                        c2314t = c2314t5;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function114 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q16 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function114, interfaceC4339a9, (Function1) objM87133R7, c28655q16, 3136);
                            c28655q = c28655q16;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function115 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q17 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function115, interfaceC4339a10, (Function1) objM87133R7, c28655q17, 3136);
                        c28655q = c28655q17;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
                }
            }
            i26 |= 384;
            function5 = function2;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i26 |= i18;
                }
                if ((i26 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C35926d(19);
                            c28655q.m87172p0(objM87133R12);
                        }
                        function10 = (Function1) objM87133R12;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35926d(20);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function11 = (Function1) objM87133R11;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35926d(21);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function6 = (Function1) objM87133R10;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function12 = function11;
                    function13 = function6;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m115441O(interfaceC28601c2)) {
                        c28655q.m87150e0(-637542270);
                        C34064d c34064dM103062b3 = viewState.getHidingCycleModal();
                        TextResource textResourceM107671d3 = c34064dM103062b3.getTitleDisplay();
                        TextResource textResourceM107668a3 = c34064dM103062b3.getDescriptionDisplay();
                        TextResource textResourceM107669b3 = c34064dM103062b3.getPrimaryButtonTitle();
                        TextResource textResourceM107670c3 = c34064dM103062b3.getSecondaryButtonTitle();
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35429g(7, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R8;
                        if ((i26 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z18) {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i214 = TextResource.$stable;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        AbstractC21211n.m59497o(null, textResourceM107671d3, textResourceM107668a3, textResourceM107669b3, false, null, null, null, null, textResourceM107670c3, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i214 << 3) | (i214 << 6) | (i214 << 9) | (i214 << 27), 0, 384, 247463409);
                        c28655q = c28655q;
                        i19 = 0;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        i19 = 0;
                        c28655q.m87150e0(-636913776);
                        c28655q.m87173q(false);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM114675c3 = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C2305k c2305k3 = C2299e.f9110M;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, i19);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM114675c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a7);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    i24 = i26 & 896;
                    if (i24 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            c28676v3 = c28676v2;
                        }
                        C28655q c28655q18 = c28655q;
                        i25 = i26;
                        function14 = function10;
                        c28676v4 = c28676v3;
                        AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R4, null, null, c28655q18, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q18;
                        f13 = 8;
                        Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM92116f4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                        c28655q.m87150e0(-644687961);
                        while (r0.hasNext()) {
                            String strM21274h5 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                            C38072d c38072d5 = C38072d.f163053a;
                            int i215 = C38072d.f163054b;
                            float f116 = f13;
                            C28655q c28655q19 = c28655q;
                            C2314t c2314t6 = c2314t;
                            AbstractC30795n.m94707h(strM21274h5, null, c38072d5.m121949b(c28655q, i215).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i215).getT3(), null, c28655q19, 0, C2886a.f11498d << 18, 196602);
                            float f117 = 4;
                            float f118 = 3 * f117;
                            AbstractC22953f.m66715b(c28655q19, AbstractC1102d.m3419p(f118, c2314t6));
                            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t6), AbstractC33253j.m105489e(f118), c38072d5.m121949b(c28655q19, i215).getWhite10(), null, 0 * f117, AbstractC37817c.m121344e(-634725604, c28655q19, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q19, 1769478, 24);
                            c28655q = c28655q19;
                            AbstractC18489d0.m53380u(f116, f117, c2314t6, c28655q);
                            f13 = f116;
                            c2314t = c2314t6;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        c32818iM115439M = m115439M(interfaceC28601c3);
                        if (c32818iM115439M == null) {
                            c28655q.m87150e0(-633223289);
                            c28655q.m87173q(false);
                            function17 = function14;
                            function15 = function12;
                            function16 = function13;
                        } else {
                            c28655q.m87150e0(-633223288);
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R5 = c28655q.m87133R();
                            if (z16) {
                                c28676v5 = c28676v4;
                                if (objM87133R5 == c28676v5) {
                                    function15 = function12;
                                    function16 = function13;
                                }
                                Function1 function116 = (Function1) objM87133R5;
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v5) {
                                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                                if ((i25 & 112) == 32) {
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z17) {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                C28655q c28655q110 = c28655q;
                                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function116, interfaceC4339a12, (Function1) objM87133R7, c28655q110, 3136);
                                c28655q = c28655q110;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v4;
                            }
                            function15 = function12;
                            function16 = function13;
                            objM87133R5 = new C2777c(function16, 17, function15);
                            c28655q.m87172p0(objM87133R5);
                            Function1 function117 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q111 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function117, interfaceC4339a13, (Function1) objM87133R7, c28655q111, 3136);
                            c28655q = c28655q111;
                            c28655q.m87173q(false);
                        }
                        function7 = function17;
                        function8 = function15;
                        function9 = function16;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    c28676v3 = c28676v2;
                    objM87133R4 = new C34904e(function12, 17);
                    c28655q.m87172p0(objM87133R4);
                    C28655q c28655q112 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R4, null, null, c28655q112, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q112;
                    f13 = 8;
                    Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM92116f5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h6 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i216 = C38072d.f163054b;
                        float f119 = f13;
                        C28655q c28655q113 = c28655q;
                        C2314t c2314t7 = c2314t;
                        AbstractC30795n.m94707h(strM21274h6, null, c38072d6.m121949b(c28655q, i216).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, i216).getT3(), null, c28655q113, 0, C2886a.f11498d << 18, 196602);
                        float f1110 = 4;
                        float f1111 = 3 * f1110;
                        AbstractC22953f.m66715b(c28655q113, AbstractC1102d.m3419p(f1111, c2314t7));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t7), AbstractC33253j.m105489e(f1111), c38072d6.m121949b(c28655q113, i216).getWhite10(), null, 0 * f1110, AbstractC37817c.m121344e(-634725604, c28655q113, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q113, 1769478, 24);
                        c28655q = c28655q113;
                        AbstractC18489d0.m53380u(f119, f1110, c2314t7, c28655q);
                        f13 = f119;
                        c2314t = c2314t7;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function118 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q114 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function118, interfaceC4339a14, (Function1) objM87133R7, c28655q114, 3136);
                            c28655q = c28655q114;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function119 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q115 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function119, interfaceC4339a15, (Function1) objM87133R7, c28655q115, 3136);
                        c28655q = c28655q115;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
                }
            }
            i26 |= 3072;
            function6 = function3;
            if ((i26 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C35926d(19);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function10 = (Function1) objM87133R12;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35926d(20);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function11 = (Function1) objM87133R11;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35926d(21);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function6 = (Function1) objM87133R10;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function12 = function11;
                function13 = function6;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m115441O(interfaceC28601c2)) {
                    c28655q.m87150e0(-637542270);
                    C34064d c34064dM103062b4 = viewState.getHidingCycleModal();
                    TextResource textResourceM107671d4 = c34064dM103062b4.getTitleDisplay();
                    TextResource textResourceM107668a4 = c34064dM103062b4.getDescriptionDisplay();
                    TextResource textResourceM107669b4 = c34064dM103062b4.getPrimaryButtonTitle();
                    TextResource textResourceM107670c4 = c34064dM103062b4.getSecondaryButtonTitle();
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35429g(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R8;
                    if ((i26 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z18) {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i217 = TextResource.$stable;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    AbstractC21211n.m59497o(null, textResourceM107671d4, textResourceM107668a4, textResourceM107669b4, false, null, null, null, null, textResourceM107670c4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a16, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i217 << 3) | (i217 << 6) | (i217 << 9) | (i217 << 27), 0, 384, 247463409);
                    c28655q = c28655q;
                    i19 = 0;
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    i19 = 0;
                    c28655q.m87150e0(-636913776);
                    c28655q.m87173q(false);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM114675c4 = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9110M;
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, i19);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM114675c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a10);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i24 = i26 & 896;
                if (i24 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                    if (objM87133R4 == c28676v2) {
                        c28676v3 = c28676v2;
                    }
                    C28655q c28655q116 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R4, null, null, c28655q116, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q116;
                    f13 = 8;
                    Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM92116f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h7 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d7 = C38072d.f163053a;
                        int i218 = C38072d.f163054b;
                        float f1112 = f13;
                        C28655q c28655q117 = c28655q;
                        C2314t c2314t8 = c2314t;
                        AbstractC30795n.m94707h(strM21274h7, null, c38072d7.m121949b(c28655q, i218).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i218).getT3(), null, c28655q117, 0, C2886a.f11498d << 18, 196602);
                        float f1113 = 4;
                        float f1114 = 3 * f1113;
                        AbstractC22953f.m66715b(c28655q117, AbstractC1102d.m3419p(f1114, c2314t8));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t8), AbstractC33253j.m105489e(f1114), c38072d7.m121949b(c28655q117, i218).getWhite10(), null, 0 * f1113, AbstractC37817c.m121344e(-634725604, c28655q117, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q117, 1769478, 24);
                        c28655q = c28655q117;
                        AbstractC18489d0.m53380u(f1112, f1113, c2314t8, c28655q);
                        f13 = f1112;
                        c2314t = c2314t8;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function1110 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q118 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1110, interfaceC4339a17, (Function1) objM87133R7, c28655q118, 3136);
                            c28655q = c28655q118;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function1111 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q119 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1111, interfaceC4339a18, (Function1) objM87133R7, c28655q119, 3136);
                        c28655q = c28655q119;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28676v2 = c28676v1;
                }
                c28676v3 = c28676v2;
                objM87133R4 = new C34904e(function12, 17);
                c28655q.m87172p0(objM87133R4);
                C28655q c28655q1110 = c28655q;
                i25 = i26;
                function14 = function10;
                c28676v4 = c28676v3;
                AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R4, null, null, c28655q1110, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q1110;
                f13 = 8;
                Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM92116f7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
                c28655q.m87150e0(-644687961);
                while (r0.hasNext()) {
                    String strM21274h8 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d8 = C38072d.f163053a;
                    int i219 = C38072d.f163054b;
                    float f1115 = f13;
                    C28655q c28655q1111 = c28655q;
                    C2314t c2314t9 = c2314t;
                    AbstractC30795n.m94707h(strM21274h8, null, c38072d8.m121949b(c28655q, i219).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, i219).getT3(), null, c28655q1111, 0, C2886a.f11498d << 18, 196602);
                    float f1116 = 4;
                    float f1117 = 3 * f1116;
                    AbstractC22953f.m66715b(c28655q1111, AbstractC1102d.m3419p(f1117, c2314t9));
                    AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t9), AbstractC33253j.m105489e(f1117), c38072d8.m121949b(c28655q1111, i219).getWhite10(), null, 0 * f1116, AbstractC37817c.m121344e(-634725604, c28655q1111, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q1111, 1769478, 24);
                    c28655q = c28655q1111;
                    AbstractC18489d0.m53380u(f1115, f1116, c2314t9, c28655q);
                    f13 = f1115;
                    c2314t = c2314t9;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                c32818iM115439M = m115439M(interfaceC28601c3);
                if (c32818iM115439M == null) {
                    c28655q.m87150e0(-633223289);
                    c28655q.m87173q(false);
                    function17 = function14;
                    function15 = function12;
                    function16 = function13;
                } else {
                    c28655q.m87150e0(-633223288);
                    if ((i25 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        c28676v5 = c28676v4;
                        if (objM87133R5 == c28676v5) {
                            function15 = function12;
                            function16 = function13;
                        }
                        Function1 function1112 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q1112 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1112, interfaceC4339a19, (Function1) objM87133R7, c28655q1112, 3136);
                        c28655q = c28655q1112;
                        c28655q.m87173q(false);
                    } else {
                        c28676v5 = c28676v4;
                    }
                    function15 = function12;
                    function16 = function13;
                    objM87133R5 = new C2777c(function16, 17, function15);
                    c28655q.m87172p0(objM87133R5);
                    Function1 function1113 = (Function1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v5) {
                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R6;
                    if ((i25 & 112) == 32) {
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    C28655q c28655q1113 = c28655q;
                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1113, interfaceC4339a110, (Function1) objM87133R7, c28655q1113, 3136);
                    c28655q = c28655q1113;
                    c28655q.m87173q(false);
                }
                function7 = function17;
                function8 = function15;
                function9 = function16;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
            }
        }
        i26 |= 48;
        function4 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i26 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i26 |= i18;
                }
                if ((i26 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R12 = c28655q.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C35926d(19);
                            c28655q.m87172p0(objM87133R12);
                        }
                        function10 = (Function1) objM87133R12;
                    } else {
                        function10 = function4;
                    }
                    if (i15 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35926d(20);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function11 = (Function1) objM87133R11;
                    } else {
                        function11 = function5;
                    }
                    if (i17 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C35926d(21);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function6 = (Function1) objM87133R10;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    function12 = function11;
                    function13 = function6;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    if (m115441O(interfaceC28601c2)) {
                        c28655q.m87150e0(-637542270);
                        C34064d c34064dM103062b5 = viewState.getHidingCycleModal();
                        TextResource textResourceM107671d5 = c34064dM103062b5.getTitleDisplay();
                        TextResource textResourceM107668a5 = c34064dM103062b5.getDescriptionDisplay();
                        TextResource textResourceM107669b5 = c34064dM103062b5.getPrimaryButtonTitle();
                        TextResource textResourceM107670c5 = c34064dM103062b5.getSecondaryButtonTitle();
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35429g(7, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R8;
                        if ((i26 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R9 = c28655q.m87133R();
                        if (z18) {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        int i2110 = TextResource.$stable;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        AbstractC21211n.m59497o(null, textResourceM107671d5, textResourceM107668a5, textResourceM107669b5, false, null, null, null, null, textResourceM107670c5, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a111, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i2110 << 3) | (i2110 << 6) | (i2110 << 9) | (i2110 << 27), 0, 384, 247463409);
                        c28655q = c28655q;
                        i19 = 0;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                        c28676v1 = c28676v0;
                        i19 = 0;
                        c28655q.m87150e0(-636913776);
                        c28655q.m87173q(false);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM114675c5 = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C2305k c2305k5 = C2299e.f9110M;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, i19);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM114675c5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a13);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N13);
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    i24 = i26 & 896;
                    if (i24 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            c28676v3 = c28676v2;
                        }
                        C28655q c28655q1114 = c28655q;
                        i25 = i26;
                        function14 = function10;
                        c28676v4 = c28676v3;
                        AbstractC6719b.m20143d(null, aVar5, null, (InterfaceC4339a) objM87133R4, null, null, c28655q1114, AbstractC6721d.a.f25641r << 3, 53);
                        c28655q = c28655q1114;
                        f13 = 8;
                        Modifier modifierM92116f8 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM92116f8);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N14);
                        c28655q.m87150e0(-644687961);
                        while (r0.hasNext()) {
                            String strM21274h9 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                            C38072d c38072d9 = C38072d.f163053a;
                            int i2111 = C38072d.f163054b;
                            float f1118 = f13;
                            C28655q c28655q1115 = c28655q;
                            C2314t c2314t10 = c2314t;
                            AbstractC30795n.m94707h(strM21274h9, null, c38072d9.m121949b(c28655q, i2111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q, i2111).getT3(), null, c28655q1115, 0, C2886a.f11498d << 18, 196602);
                            float f1119 = 4;
                            float f11110 = 3 * f1119;
                            AbstractC22953f.m66715b(c28655q1115, AbstractC1102d.m3419p(f11110, c2314t10));
                            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t10), AbstractC33253j.m105489e(f11110), c38072d9.m121949b(c28655q1115, i2111).getWhite10(), null, 0 * f1119, AbstractC37817c.m121344e(-634725604, c28655q1115, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q1115, 1769478, 24);
                            c28655q = c28655q1115;
                            AbstractC18489d0.m53380u(f1118, f1119, c2314t10, c28655q);
                            f13 = f1118;
                            c2314t = c2314t10;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        c32818iM115439M = m115439M(interfaceC28601c3);
                        if (c32818iM115439M == null) {
                            c28655q.m87150e0(-633223289);
                            c28655q.m87173q(false);
                            function17 = function14;
                            function15 = function12;
                            function16 = function13;
                        } else {
                            c28655q.m87150e0(-633223288);
                            if ((i25 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R5 = c28655q.m87133R();
                            if (z16) {
                                c28676v5 = c28676v4;
                                if (objM87133R5 == c28676v5) {
                                    function15 = function12;
                                    function16 = function13;
                                }
                                Function1 function1114 = (Function1) objM87133R5;
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v5) {
                                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R6;
                                if ((i25 & 112) == 32) {
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z17) {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                } else {
                                    function17 = function14;
                                    objM87133R7 = new C35657b0(function17, 6);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                C28655q c28655q1116 = c28655q;
                                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1114, interfaceC4339a112, (Function1) objM87133R7, c28655q1116, 3136);
                                c28655q = c28655q1116;
                                c28655q.m87173q(false);
                            } else {
                                c28676v5 = c28676v4;
                            }
                            function15 = function12;
                            function16 = function13;
                            objM87133R5 = new C2777c(function16, 17, function15);
                            c28655q.m87172p0(objM87133R5);
                            Function1 function1115 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q1117 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1115, interfaceC4339a113, (Function1) objM87133R7, c28655q1117, 3136);
                            c28655q = c28655q1117;
                            c28655q.m87173q(false);
                        }
                        function7 = function17;
                        function8 = function15;
                        function9 = function16;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    c28676v3 = c28676v2;
                    objM87133R4 = new C34904e(function12, 17);
                    c28655q.m87172p0(objM87133R4);
                    C28655q c28655q1118 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar5, null, (InterfaceC4339a) objM87133R4, null, null, c28655q1118, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q1118;
                    f13 = 8;
                    Modifier modifierM92116f9 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM92116f9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N15);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h10 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d10 = C38072d.f163053a;
                        int i2112 = C38072d.f163054b;
                        float f11111 = f13;
                        C28655q c28655q1119 = c28655q;
                        C2314t c2314t11 = c2314t;
                        AbstractC30795n.m94707h(strM21274h10, null, c38072d10.m121949b(c28655q, i2112).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q, i2112).getT3(), null, c28655q1119, 0, C2886a.f11498d << 18, 196602);
                        float f11112 = 4;
                        float f11113 = 3 * f11112;
                        AbstractC22953f.m66715b(c28655q1119, AbstractC1102d.m3419p(f11113, c2314t11));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t11), AbstractC33253j.m105489e(f11113), c38072d10.m121949b(c28655q1119, i2112).getWhite10(), null, 0 * f11112, AbstractC37817c.m121344e(-634725604, c28655q1119, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q1119, 1769478, 24);
                        c28655q = c28655q1119;
                        AbstractC18489d0.m53380u(f11111, f11112, c2314t11, c28655q);
                        f13 = f11111;
                        c2314t = c2314t11;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function1116 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q11110 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1116, interfaceC4339a114, (Function1) objM87133R7, c28655q11110, 3136);
                            c28655q = c28655q11110;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function1117 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q11111 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1117, interfaceC4339a115, (Function1) objM87133R7, c28655q11111, 3136);
                        c28655q = c28655q11111;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
                }
            }
            i26 |= 3072;
            function6 = function3;
            if ((i26 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C35926d(19);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function10 = (Function1) objM87133R12;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35926d(20);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function11 = (Function1) objM87133R11;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35926d(21);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function6 = (Function1) objM87133R10;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function12 = function11;
                function13 = function6;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m115441O(interfaceC28601c2)) {
                    c28655q.m87150e0(-637542270);
                    C34064d c34064dM103062b6 = viewState.getHidingCycleModal();
                    TextResource textResourceM107671d6 = c34064dM103062b6.getTitleDisplay();
                    TextResource textResourceM107668a6 = c34064dM103062b6.getDescriptionDisplay();
                    TextResource textResourceM107669b6 = c34064dM103062b6.getPrimaryButtonTitle();
                    TextResource textResourceM107670c6 = c34064dM103062b6.getSecondaryButtonTitle();
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35429g(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R8;
                    if ((i26 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z18) {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i2113 = TextResource.$stable;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    AbstractC21211n.m59497o(null, textResourceM107671d6, textResourceM107668a6, textResourceM107669b6, false, null, null, null, null, textResourceM107670c6, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a116, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i2113 << 3) | (i2113 << 6) | (i2113 << 9) | (i2113 << 27), 0, 384, 247463409);
                    c28655q = c28655q;
                    i19 = 0;
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    i19 = 0;
                    c28655q.m87150e0(-636913776);
                    c28655q.m87173q(false);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM114675c6 = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C2305k c2305k6 = C2299e.f9110M;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, i19);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM114675c6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a16);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N16);
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i24 = i26 & 896;
                if (i24 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                    if (objM87133R4 == c28676v2) {
                        c28676v3 = c28676v2;
                    }
                    C28655q c28655q11112 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar6, null, (InterfaceC4339a) objM87133R4, null, null, c28655q11112, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q11112;
                    f13 = 8;
                    Modifier modifierM92116f10 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM92116f10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a17);
                    AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N17);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h11 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d11 = C38072d.f163053a;
                        int i2114 = C38072d.f163054b;
                        float f11114 = f13;
                        C28655q c28655q11113 = c28655q;
                        C2314t c2314t12 = c2314t;
                        AbstractC30795n.m94707h(strM21274h11, null, c38072d11.m121949b(c28655q, i2114).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q, i2114).getT3(), null, c28655q11113, 0, C2886a.f11498d << 18, 196602);
                        float f11115 = 4;
                        float f11116 = 3 * f11115;
                        AbstractC22953f.m66715b(c28655q11113, AbstractC1102d.m3419p(f11116, c2314t12));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t12), AbstractC33253j.m105489e(f11116), c38072d11.m121949b(c28655q11113, i2114).getWhite10(), null, 0 * f11115, AbstractC37817c.m121344e(-634725604, c28655q11113, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q11113, 1769478, 24);
                        c28655q = c28655q11113;
                        AbstractC18489d0.m53380u(f11114, f11115, c2314t12, c28655q);
                        f13 = f11114;
                        c2314t = c2314t12;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function1118 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q11114 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1118, interfaceC4339a117, (Function1) objM87133R7, c28655q11114, 3136);
                            c28655q = c28655q11114;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function1119 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q11115 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function1119, interfaceC4339a118, (Function1) objM87133R7, c28655q11115, 3136);
                        c28655q = c28655q11115;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28676v2 = c28676v1;
                }
                c28676v3 = c28676v2;
                objM87133R4 = new C34904e(function12, 17);
                c28655q.m87172p0(objM87133R4);
                C28655q c28655q11116 = c28655q;
                i25 = i26;
                function14 = function10;
                c28676v4 = c28676v3;
                AbstractC6719b.m20143d(null, aVar6, null, (InterfaceC4339a) objM87133R4, null, null, c28655q11116, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q11116;
                f13 = 8;
                Modifier modifierM92116f11 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM92116f11);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N18);
                c28655q.m87150e0(-644687961);
                while (r0.hasNext()) {
                    String strM21274h12 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d12 = C38072d.f163053a;
                    int i2115 = C38072d.f163054b;
                    float f11117 = f13;
                    C28655q c28655q11117 = c28655q;
                    C2314t c2314t13 = c2314t;
                    AbstractC30795n.m94707h(strM21274h12, null, c38072d12.m121949b(c28655q, i2115).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q, i2115).getT3(), null, c28655q11117, 0, C2886a.f11498d << 18, 196602);
                    float f11118 = 4;
                    float f11119 = 3 * f11118;
                    AbstractC22953f.m66715b(c28655q11117, AbstractC1102d.m3419p(f11119, c2314t13));
                    AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t13), AbstractC33253j.m105489e(f11119), c38072d12.m121949b(c28655q11117, i2115).getWhite10(), null, 0 * f11118, AbstractC37817c.m121344e(-634725604, c28655q11117, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q11117, 1769478, 24);
                    c28655q = c28655q11117;
                    AbstractC18489d0.m53380u(f11117, f11118, c2314t13, c28655q);
                    f13 = f11117;
                    c2314t = c2314t13;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                c32818iM115439M = m115439M(interfaceC28601c3);
                if (c32818iM115439M == null) {
                    c28655q.m87150e0(-633223289);
                    c28655q.m87173q(false);
                    function17 = function14;
                    function15 = function12;
                    function16 = function13;
                } else {
                    c28655q.m87150e0(-633223288);
                    if ((i25 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        c28676v5 = c28676v4;
                        if (objM87133R5 == c28676v5) {
                            function15 = function12;
                            function16 = function13;
                        }
                        Function1 function11110 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q11118 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11110, interfaceC4339a119, (Function1) objM87133R7, c28655q11118, 3136);
                        c28655q = c28655q11118;
                        c28655q.m87173q(false);
                    } else {
                        c28676v5 = c28676v4;
                    }
                    function15 = function12;
                    function16 = function13;
                    objM87133R5 = new C2777c(function16, 17, function15);
                    c28655q.m87172p0(objM87133R5);
                    Function1 function11111 = (Function1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v5) {
                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R6;
                    if ((i25 & 112) == 32) {
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    C28655q c28655q11119 = c28655q;
                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11111, interfaceC4339a1110, (Function1) objM87133R7, c28655q11119, 3136);
                    c28655q = c28655q11119;
                    c28655q.m87173q(false);
                }
                function7 = function17;
                function8 = function15;
                function9 = function16;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
            }
        }
        i26 |= 384;
        function5 = function2;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i26 |= i18;
            }
            if ((i26 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R12 = c28655q.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C35926d(19);
                        c28655q.m87172p0(objM87133R12);
                    }
                    function10 = (Function1) objM87133R12;
                } else {
                    function10 = function4;
                }
                if (i15 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35926d(20);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function11 = (Function1) objM87133R11;
                } else {
                    function11 = function5;
                }
                if (i17 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C35926d(21);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function6 = (Function1) objM87133R10;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                function12 = function11;
                function13 = function6;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                if (m115441O(interfaceC28601c2)) {
                    c28655q.m87150e0(-637542270);
                    C34064d c34064dM103062b7 = viewState.getHidingCycleModal();
                    TextResource textResourceM107671d7 = c34064dM103062b7.getTitleDisplay();
                    TextResource textResourceM107668a7 = c34064dM103062b7.getDescriptionDisplay();
                    TextResource textResourceM107669b7 = c34064dM103062b7.getPrimaryButtonTitle();
                    TextResource textResourceM107670c7 = c34064dM103062b7.getSecondaryButtonTitle();
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35429g(7, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R8;
                    if ((i26 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R9 = c28655q.m87133R();
                    if (z18) {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    int i2116 = TextResource.$stable;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    AbstractC21211n.m59497o(null, textResourceM107671d7, textResourceM107668a7, textResourceM107669b7, false, null, null, null, null, textResourceM107670c7, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1111, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i2116 << 3) | (i2116 << 6) | (i2116 << 9) | (i2116 << 27), 0, 384, 247463409);
                    c28655q = c28655q;
                    i19 = 0;
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    i19 = 0;
                    c28655q.m87150e0(-636913776);
                    c28655q.m87173q(false);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM114675c7 = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C2305k c2305k7 = C2299e.f9110M;
                C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, i19);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM114675c7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a19);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N19);
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i24 = i26 & 896;
                if (i24 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                    if (objM87133R4 == c28676v2) {
                        c28676v3 = c28676v2;
                    }
                    C28655q c28655q111110 = c28655q;
                    i25 = i26;
                    function14 = function10;
                    c28676v4 = c28676v3;
                    AbstractC6719b.m20143d(null, aVar7, null, (InterfaceC4339a) objM87133R4, null, null, c28655q111110, AbstractC6721d.a.f25641r << 3, 53);
                    c28655q = c28655q111110;
                    f13 = 8;
                    Modifier modifierM92116f12 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM92116f12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N110);
                    c28655q.m87150e0(-644687961);
                    while (r0.hasNext()) {
                        String strM21274h13 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d13 = C38072d.f163053a;
                        int i2117 = C38072d.f163054b;
                        float f111110 = f13;
                        C28655q c28655q111111 = c28655q;
                        C2314t c2314t14 = c2314t;
                        AbstractC30795n.m94707h(strM21274h13, null, c38072d13.m121949b(c28655q, i2117).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q, i2117).getT3(), null, c28655q111111, 0, C2886a.f11498d << 18, 196602);
                        float f111111 = 4;
                        float f111112 = 3 * f111111;
                        AbstractC22953f.m66715b(c28655q111111, AbstractC1102d.m3419p(f111112, c2314t14));
                        AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t14), AbstractC33253j.m105489e(f111112), c38072d13.m121949b(c28655q111111, i2117).getWhite10(), null, 0 * f111111, AbstractC37817c.m121344e(-634725604, c28655q111111, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q111111, 1769478, 24);
                        c28655q = c28655q111111;
                        AbstractC18489d0.m53380u(f111110, f111111, c2314t14, c28655q);
                        f13 = f111110;
                        c2314t = c2314t14;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    c32818iM115439M = m115439M(interfaceC28601c3);
                    if (c32818iM115439M == null) {
                        c28655q.m87150e0(-633223289);
                        c28655q.m87173q(false);
                        function17 = function14;
                        function15 = function12;
                        function16 = function13;
                    } else {
                        c28655q.m87150e0(-633223288);
                        if ((i25 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            c28676v5 = c28676v4;
                            if (objM87133R5 == c28676v5) {
                                function15 = function12;
                                function16 = function13;
                            }
                            Function1 function11112 = (Function1) objM87133R5;
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v5) {
                                objM87133R6 = new C35429g(8, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R6);
                            }
                            InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R6;
                            if ((i25 & 112) == 32) {
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17) {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                function17 = function14;
                                objM87133R7 = new C35657b0(function17, 6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            C28655q c28655q111112 = c28655q;
                            AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11112, interfaceC4339a1112, (Function1) objM87133R7, c28655q111112, 3136);
                            c28655q = c28655q111112;
                            c28655q.m87173q(false);
                        } else {
                            c28676v5 = c28676v4;
                        }
                        function15 = function12;
                        function16 = function13;
                        objM87133R5 = new C2777c(function16, 17, function15);
                        c28655q.m87172p0(objM87133R5);
                        Function1 function11113 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q111113 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11113, interfaceC4339a1113, (Function1) objM87133R7, c28655q111113, 3136);
                        c28655q = c28655q111113;
                        c28655q.m87173q(false);
                    }
                    function7 = function17;
                    function8 = function15;
                    function9 = function16;
                } else {
                    c28676v2 = c28676v1;
                }
                c28676v3 = c28676v2;
                objM87133R4 = new C34904e(function12, 17);
                c28655q.m87172p0(objM87133R4);
                C28655q c28655q111114 = c28655q;
                i25 = i26;
                function14 = function10;
                c28676v4 = c28676v3;
                AbstractC6719b.m20143d(null, aVar7, null, (InterfaceC4339a) objM87133R4, null, null, c28655q111114, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q111114;
                f13 = 8;
                Modifier modifierM92116f13 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM92116f13);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a111);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N111);
                c28655q.m87150e0(-644687961);
                while (r0.hasNext()) {
                    String strM21274h14 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d14 = C38072d.f163053a;
                    int i2118 = C38072d.f163054b;
                    float f111113 = f13;
                    C28655q c28655q111115 = c28655q;
                    C2314t c2314t15 = c2314t;
                    AbstractC30795n.m94707h(strM21274h14, null, c38072d14.m121949b(c28655q, i2118).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q, i2118).getT3(), null, c28655q111115, 0, C2886a.f11498d << 18, 196602);
                    float f111114 = 4;
                    float f111115 = 3 * f111114;
                    AbstractC22953f.m66715b(c28655q111115, AbstractC1102d.m3419p(f111115, c2314t15));
                    AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t15), AbstractC33253j.m105489e(f111115), c38072d14.m121949b(c28655q111115, i2118).getWhite10(), null, 0 * f111114, AbstractC37817c.m121344e(-634725604, c28655q111115, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q111115, 1769478, 24);
                    c28655q = c28655q111115;
                    AbstractC18489d0.m53380u(f111113, f111114, c2314t15, c28655q);
                    f13 = f111113;
                    c2314t = c2314t15;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                c32818iM115439M = m115439M(interfaceC28601c3);
                if (c32818iM115439M == null) {
                    c28655q.m87150e0(-633223289);
                    c28655q.m87173q(false);
                    function17 = function14;
                    function15 = function12;
                    function16 = function13;
                } else {
                    c28655q.m87150e0(-633223288);
                    if ((i25 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        c28676v5 = c28676v4;
                        if (objM87133R5 == c28676v5) {
                            function15 = function12;
                            function16 = function13;
                        }
                        Function1 function11114 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q111116 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11114, interfaceC4339a1114, (Function1) objM87133R7, c28655q111116, 3136);
                        c28655q = c28655q111116;
                        c28655q.m87173q(false);
                    } else {
                        c28676v5 = c28676v4;
                    }
                    function15 = function12;
                    function16 = function13;
                    objM87133R5 = new C2777c(function16, 17, function15);
                    c28655q.m87172p0(objM87133R5);
                    Function1 function11115 = (Function1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v5) {
                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R6;
                    if ((i25 & 112) == 32) {
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    C28655q c28655q111117 = c28655q;
                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11115, interfaceC4339a1115, (Function1) objM87133R7, c28655q111117, 3136);
                    c28655q = c28655q111117;
                    c28655q.m87173q(false);
                }
                function7 = function17;
                function8 = function15;
                function9 = function16;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
            }
        }
        i26 |= 3072;
        function6 = function3;
        if ((i26 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i26 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C35926d(19);
                    c28655q.m87172p0(objM87133R12);
                }
                function10 = (Function1) objM87133R12;
            } else {
                function10 = function4;
            }
            if (i15 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C35926d(20);
                    c28655q.m87172p0(objM87133R11);
                }
                function11 = (Function1) objM87133R11;
            } else {
                function11 = function5;
            }
            if (i17 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C35926d(21);
                    c28655q.m87172p0(objM87133R10);
                }
                function6 = (Function1) objM87133R10;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            function12 = function11;
            function13 = function6;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            if (m115441O(interfaceC28601c2)) {
                c28655q.m87150e0(-637542270);
                C34064d c34064dM103062b8 = viewState.getHidingCycleModal();
                TextResource textResourceM107671d8 = c34064dM103062b8.getTitleDisplay();
                TextResource textResourceM107668a8 = c34064dM103062b8.getDescriptionDisplay();
                TextResource textResourceM107669b8 = c34064dM103062b8.getPrimaryButtonTitle();
                TextResource textResourceM107670c8 = c34064dM103062b8.getSecondaryButtonTitle();
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C35429g(7, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R8;
                if ((i26 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R9 = c28655q.m87133R();
                if (z18) {
                    objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C25504c(1, function10, interfaceC28601c1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R9);
                }
                int i2119 = TextResource.$stable;
                interfaceC28601c3 = interfaceC28601c1;
                c28676v1 = c28676v0;
                AbstractC21211n.m59497o(null, textResourceM107671d8, textResourceM107668a8, textResourceM107669b8, false, null, null, null, null, textResourceM107670c8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a1116, null, (InterfaceC4339a) objM87133R9, null, null, null, c28655q, (i2119 << 3) | (i2119 << 6) | (i2119 << 9) | (i2119 << 27), 0, 384, 247463409);
                c28655q = c28655q;
                i19 = 0;
                c28655q.m87173q(false);
            } else {
                interfaceC28601c3 = interfaceC28601c1;
                c28676v1 = c28676v0;
                i19 = 0;
                c28655q.m87150e0(-636913776);
                c28655q.m87173q(false);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM114675c8 = AbstractC36095b.m114675c(c2314t, 1.0f);
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C2305k c2305k8 = C2299e.f9110M;
            C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, i19);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM114675c8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a112);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N112);
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(viewState.getNavigationTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i24 = i26 & 896;
            if (i24 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z13) {
                c28676v2 = c28676v1;
                if (objM87133R4 == c28676v2) {
                    c28676v3 = c28676v2;
                }
                C28655q c28655q111118 = c28655q;
                i25 = i26;
                function14 = function10;
                c28676v4 = c28676v3;
                AbstractC6719b.m20143d(null, aVar8, null, (InterfaceC4339a) objM87133R4, null, null, c28655q111118, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q111118;
                f13 = 8;
                Modifier modifierM92116f14 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM92116f14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a113);
                AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N113);
                c28655q.m87150e0(-644687961);
                while (r0.hasNext()) {
                    String strM21274h15 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d15 = C38072d.f163053a;
                    int i21110 = C38072d.f163054b;
                    float f111116 = f13;
                    C28655q c28655q111119 = c28655q;
                    C2314t c2314t16 = c2314t;
                    AbstractC30795n.m94707h(strM21274h15, null, c38072d15.m121949b(c28655q, i21110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q, i21110).getT3(), null, c28655q111119, 0, C2886a.f11498d << 18, 196602);
                    float f111117 = 4;
                    float f111118 = 3 * f111117;
                    AbstractC22953f.m66715b(c28655q111119, AbstractC1102d.m3419p(f111118, c2314t16));
                    AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t16), AbstractC33253j.m105489e(f111118), c38072d15.m121949b(c28655q111119, i21110).getWhite10(), null, 0 * f111117, AbstractC37817c.m121344e(-634725604, c28655q111119, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q111119, 1769478, 24);
                    c28655q = c28655q111119;
                    AbstractC18489d0.m53380u(f111116, f111117, c2314t16, c28655q);
                    f13 = f111116;
                    c2314t = c2314t16;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                c32818iM115439M = m115439M(interfaceC28601c3);
                if (c32818iM115439M == null) {
                    c28655q.m87150e0(-633223289);
                    c28655q.m87173q(false);
                    function17 = function14;
                    function15 = function12;
                    function16 = function13;
                } else {
                    c28655q.m87150e0(-633223288);
                    if ((i25 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i24 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R5 = c28655q.m87133R();
                    if (z16) {
                        c28676v5 = c28676v4;
                        if (objM87133R5 == c28676v5) {
                            function15 = function12;
                            function16 = function13;
                        }
                        Function1 function11116 = (Function1) objM87133R5;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v5) {
                            objM87133R6 = new C35429g(8, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R6;
                        if ((i25 & 112) == 32) {
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function17 = function14;
                            objM87133R7 = new C35657b0(function17, 6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        C28655q c28655q1111110 = c28655q;
                        AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11116, interfaceC4339a1117, (Function1) objM87133R7, c28655q1111110, 3136);
                        c28655q = c28655q1111110;
                        c28655q.m87173q(false);
                    } else {
                        c28676v5 = c28676v4;
                    }
                    function15 = function12;
                    function16 = function13;
                    objM87133R5 = new C2777c(function16, 17, function15);
                    c28655q.m87172p0(objM87133R5);
                    Function1 function11117 = (Function1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v5) {
                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a1118 = (InterfaceC4339a) objM87133R6;
                    if ((i25 & 112) == 32) {
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    C28655q c28655q1111111 = c28655q;
                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11117, interfaceC4339a1118, (Function1) objM87133R7, c28655q1111111, 3136);
                    c28655q = c28655q1111111;
                    c28655q.m87173q(false);
                }
                function7 = function17;
                function8 = function15;
                function9 = function16;
            } else {
                c28676v2 = c28676v1;
            }
            c28676v3 = c28676v2;
            objM87133R4 = new C34904e(function12, 17);
            c28655q.m87172p0(objM87133R4);
            C28655q c28655q1111112 = c28655q;
            i25 = i26;
            function14 = function10;
            c28676v4 = c28676v3;
            AbstractC6719b.m20143d(null, aVar8, null, (InterfaceC4339a) objM87133R4, null, null, c28655q1111112, AbstractC6721d.a.f25641r << 3, 53);
            c28655q = c28655q1111112;
            f13 = 8;
            Modifier modifierM92116f15 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(2 * f13, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM92116f15);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a114);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N114);
            c28655q.m87150e0(-644687961);
            while (r0.hasNext()) {
                String strM21274h16 = AbstractC8693b.m21274h(c32812f.getTitleDisplay(), c28655q, TextResource.$stable);
                C38072d c38072d16 = C38072d.f163053a;
                int i21111 = C38072d.f163054b;
                float f111119 = f13;
                C28655q c28655q1111113 = c28655q;
                C2314t c2314t17 = c2314t;
                AbstractC30795n.m94707h(strM21274h16, null, c38072d16.m121949b(c28655q, i21111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q, i21111).getT3(), null, c28655q1111113, 0, C2886a.f11498d << 18, 196602);
                float f1111110 = 4;
                float f1111111 = 3 * f1111110;
                AbstractC22953f.m66715b(c28655q1111113, AbstractC1102d.m3419p(f1111111, c2314t17));
                AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t17), AbstractC33253j.m105489e(f1111111), c38072d16.m121949b(c28655q1111113, i21111).getWhite10(), null, 0 * f1111110, AbstractC37817c.m121344e(-634725604, c28655q1111113, new C27632b(c32812f, interfaceC2994c0, c15199y3M3460c, interfaceC28601c3, 10)), c28655q1111113, 1769478, 24);
                c28655q = c28655q1111113;
                AbstractC18489d0.m53380u(f111119, f1111110, c2314t17, c28655q);
                f13 = f111119;
                c2314t = c2314t17;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            c32818iM115439M = m115439M(interfaceC28601c3);
            if (c32818iM115439M == null) {
                c28655q.m87150e0(-633223289);
                c28655q.m87173q(false);
                function17 = function14;
                function15 = function12;
                function16 = function13;
            } else {
                c28655q.m87150e0(-633223288);
                if ((i25 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i24 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R5 = c28655q.m87133R();
                if (z16) {
                    c28676v5 = c28676v4;
                    if (objM87133R5 == c28676v5) {
                        function15 = function12;
                        function16 = function13;
                    }
                    Function1 function11118 = (Function1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v5) {
                        objM87133R6 = new C35429g(8, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a1119 = (InterfaceC4339a) objM87133R6;
                    if ((i25 & 112) == 32) {
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function17 = function14;
                        objM87133R7 = new C35657b0(function17, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    C28655q c28655q1111114 = c28655q;
                    AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11118, interfaceC4339a1119, (Function1) objM87133R7, c28655q1111114, 3136);
                    c28655q = c28655q1111114;
                    c28655q.m87173q(false);
                } else {
                    c28676v5 = c28676v4;
                }
                function15 = function12;
                function16 = function13;
                objM87133R5 = new C2777c(function16, 17, function15);
                c28655q.m87172p0(objM87133R5);
                Function1 function11119 = (Function1) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v5) {
                    objM87133R6 = new C35429g(8, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R6;
                if ((i25 & 112) == 32) {
                }
                objM87133R7 = c28655q.m87133R();
                if (z17) {
                    function17 = function14;
                    objM87133R7 = new C35657b0(function17, 6);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    function17 = function14;
                    objM87133R7 = new C35657b0(function17, 6);
                    c28655q.m87172p0(objM87133R7);
                }
                C28655q c28655q1111115 = c28655q;
                AbstractC37458l.m120009g(c32818iM115439M, c15199y3M3460c, function11119, interfaceC4339a11110, (Function1) objM87133R7, c28655q1111115, 3136);
                c28655q = c28655q1111115;
                c28655q.m87173q(false);
            }
            function7 = function17;
            function8 = function15;
            function9 = function16;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m115428B(AbstractC32838v it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m115429C(AbstractC31629a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m115430D(Function1 function1) {
        function1.invoke(AbstractC31629a.a.f130687a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m115431E(C32812f c32812f, final InterfaceC2994c0 interfaceC2994c0, final C15199y3 c15199y3, final InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C2305k c2305k = C2299e.f9110M;
        boolean z4 = false;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1.0f;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            c28655q.m87150e0(1231389675);
            int i14 = 0;
            for (Object obj : c32812f.m102960a()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                final C32814g c32814g = (C32814g) obj;
                Modifier modifierM3409f = AbstractC1102d.m3409f(f13, c2314t);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c32814g) | c28655q.m87157i(c15199y3);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    final int i16 = 0;
                    InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: vo1.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return AbstractC36232g.m115432F(interfaceC2994c0, c32814g, c15199y3, interfaceC28601c1);
                                default:
                                    return AbstractC36232g.m115433G(interfaceC2994c0, c32814g, c15199y3, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(interfaceC4339a);
                    objM87133R = interfaceC4339a;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z4);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                C2305k c2305k2 = c2305k;
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                int i17 = i14;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                AbstractC14004d.m39859h(c32814g.getCom.whoop.data.repositories.SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE java.lang.String(), c32814g.getIsHidden(), c28655q, C14005e.f49972m, 0);
                c28655q.m87173q(true);
                Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1136a.m3599a(c2314t, "MciEditCycleTag"), C2299e.f9103F);
                AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                int whoopIcon = c32814g.getIcon().toWhoopIcon();
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = c.f155152w;
                    c28655q.m87172p0(objM87133R2);
                }
                C27270o c27270o = new C27270o(bVar, whoopIcon, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c32814g) | c28655q.m87157i(c15199y3);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i18 = 1;
                    InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: vo1.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC36232g.m115432F(interfaceC2994c0, c32814g, c15199y3, interfaceC28601c1);
                                default:
                                    return AbstractC36232g.m115433G(interfaceC2994c0, c32814g, c15199y3, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(interfaceC4339a2);
                    objM87133R3 = interfaceC4339a2;
                }
                C2314t c2314t2 = c2314t;
                AbstractC27242b1.m82092d(c27270o, "", modifierMo3400a, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 48, 8);
                c28655q.m87173q(true);
                if (c32812f.m102960a().size() - 1 > i17) {
                    c28655q.m87150e0(1977617632);
                    float f14 = 4;
                    float f15 = f14 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
                    C28655q c28655q2 = c28655q;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q2, 0, 255);
                    c28655q = c28655q2;
                    z4 = false;
                    AbstractC25012a.m73389v(c2314t2, f15, c28655q, false);
                } else {
                    z4 = false;
                    c28655q.m87150e0(1977836740);
                    c28655q.m87173q(false);
                }
                f13 = 1.0f;
                c2314t = c2314t2;
                i14 = i15;
                c2305k = c2305k2;
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m115432F(InterfaceC2994c0 interfaceC2994c0, C32814g c32814g, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c32814g, c15199y3, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m115433G(InterfaceC2994c0 interfaceC2994c0, C32814g c32814g, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c32814g, c15199y3, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m115434H(Function1 function1, Function1 function2, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(AbstractC39672a.b.f170735a);
        function2.invoke(new AbstractC31629a.b(date, "EDIT_CYCLE"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m115435I(InterfaceC28601c1 interfaceC28601c1) {
        m115442P(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m115436J(Function1 function1, List ids) {
        AbstractC22676k.m65750j(ids, "ids");
        function1.invoke(new AbstractC32838v.c(ids));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m115437K(AbstractC32840x.f fVar, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m115427A(fVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m115438L(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C32818i m115439M(InterfaceC28601c1 interfaceC28601c1) {
        return (C32818i) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m115440N(InterfaceC28601c1 interfaceC28601c1, C32818i c32818i) {
        interfaceC28601c1.setValue(c32818i);
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m115441O(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    private static final void m115442P(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m115443Q(InterfaceC28601c1 interfaceC28601c1) {
        m115442P(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m115444R(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2) {
        C32822k c32822kM102983b;
        C32818i c32818iM115439M = m115439M(interfaceC28601c1);
        if (c32818iM115439M != null && (c32822kM102983b = c32818iM115439M.getHideOption()) != null) {
            function1.invoke(new AbstractC32838v.a(c32822kM102983b.m102992a()));
        }
        m115442P(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x0318  */
    /* JADX WARN: Code duplicated, block: B:113:0x031b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0322  */
    /* JADX WARN: Code duplicated, block: B:118:0x0326  */
    /* JADX WARN: Code duplicated, block: B:121:0x033c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0345  */
    /* JADX WARN: Code duplicated, block: B:126:0x0351  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0240  */
    /* JADX WARN: Code duplicated, block: B:99:0x0248  */
    /* JADX INFO: renamed from: t */
    public static final void m115465t(AbstractC32840x viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(788451097);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
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
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C35926d(16);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C35926d(17);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C35926d(18);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                        if (viewState.equals(AbstractC32840x.b.f136851b)) {
                            c28655q.m87150e0(-429077870);
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
                        } else {
                            z13 = true;
                            if (viewState.equals(AbstractC32840x.a.f136850b)) {
                                c28655q.m87150e0(-428693563);
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 112) == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z15 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C34904e(function7, 18);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                int i25 = AbstractC33208p0.b.f138467h;
                                int i26 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i25 | (i26 << 3) | (i26 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else if (viewState instanceof AbstractC32840x.f) {
                                c28655q.m87150e0(-428116622);
                                m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                                c28655q.m87173q(false);
                            } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                                c28655q.m87150e0(-427835886);
                                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                                c28655q.m87150e0(-427630077);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                                if ((i15 & 112) != 32) {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34904e(function7, 19);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i27 = AbstractC33208p0.b.f138467h;
                                int i28 = TextResource.$stable;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i27 | (i28 << 3) | (i28 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState.equals(AbstractC32840x.e.f136854b)) {
                                    throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                                }
                                c28655q.m87150e0(-427044053);
                                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                                Boolean bool = Boolean.TRUE;
                                if ((i15 & 112) == 32) {
                                    c28655q = c28655q;
                                    z14 = true;
                                } else {
                                    c28655q = c28655q;
                                    z14 = false;
                                }
                                objM87133R = c28655q.m87133R();
                                if (z14 || objM87133R == c28676v0) {
                                    objM87133R = new a(function7, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool);
                                c28655q.m87173q(false);
                            }
                        }
                        function8 = function10;
                        function9 = function11;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C35926d(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35926d(17);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C35926d(18);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                    if (viewState.equals(AbstractC32840x.b.f136851b)) {
                        c28655q.m87150e0(-429077870);
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
                    } else {
                        z13 = true;
                        if (viewState.equals(AbstractC32840x.a.f136850b)) {
                            c28655q.m87150e0(-428693563);
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i29 = AbstractC33208p0.b.f138467h;
                            int i210 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i29 | (i210 << 3) | (i210 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC32840x.f) {
                            c28655q.m87150e0(-428116622);
                            m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                            c28655q.m87150e0(-427835886);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                            c28655q.m87150e0(-427630077);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) != 32) {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i211 = AbstractC33208p0.b.f138467h;
                            int i212 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i211 | (i212 << 3) | (i212 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC32840x.e.f136854b)) {
                                throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                            }
                            c28655q.m87150e0(-427044053);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool2 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool2);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function10;
                    function9 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
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
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C35926d(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35926d(17);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C35926d(18);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                    if (viewState.equals(AbstractC32840x.b.f136851b)) {
                        c28655q.m87150e0(-429077870);
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
                    } else {
                        z13 = true;
                        if (viewState.equals(AbstractC32840x.a.f136850b)) {
                            c28655q.m87150e0(-428693563);
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i213 = AbstractC33208p0.b.f138467h;
                            int i214 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i213 | (i214 << 3) | (i214 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC32840x.f) {
                            c28655q.m87150e0(-428116622);
                            m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                            c28655q.m87150e0(-427835886);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                            c28655q.m87150e0(-427630077);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) != 32) {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i215 = AbstractC33208p0.b.f138467h;
                            int i216 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i215 | (i216 << 3) | (i216 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC32840x.e.f136854b)) {
                                throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                            }
                            c28655q.m87150e0(-427044053);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool3 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool3);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function10;
                    function9 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35926d(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function4;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35926d(17);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35926d(18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                if (viewState.equals(AbstractC32840x.b.f136851b)) {
                    c28655q.m87150e0(-429077870);
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
                } else {
                    z13 = true;
                    if (viewState.equals(AbstractC32840x.a.f136850b)) {
                        c28655q.m87150e0(-428693563);
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i217 = AbstractC33208p0.b.f138467h;
                        int i218 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i217 | (i218 << 3) | (i218 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC32840x.f) {
                        c28655q.m87150e0(-428116622);
                        m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                        c28655q.m87150e0(-427835886);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                        c28655q.m87150e0(-427630077);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) != 32) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i219 = AbstractC33208p0.b.f138467h;
                        int i2110 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i219 | (i2110 << 3) | (i2110 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC32840x.e.f136854b)) {
                            throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                        }
                        c28655q.m87150e0(-427044053);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        Boolean bool4 = Boolean.TRUE;
                        if ((i15 & 112) == 32) {
                            c28655q = c28655q;
                            z14 = true;
                        } else {
                            c28655q = c28655q;
                            z14 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool4);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function10;
                function9 = function11;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
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
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C35926d(16);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35926d(17);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C35926d(18);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                    if (viewState.equals(AbstractC32840x.b.f136851b)) {
                        c28655q.m87150e0(-429077870);
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
                    } else {
                        z13 = true;
                        if (viewState.equals(AbstractC32840x.a.f136850b)) {
                            c28655q.m87150e0(-428693563);
                            AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z15) {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C34904e(function7, 18);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i2111 = AbstractC33208p0.b.f138467h;
                            int i2112 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar9, textResourceM21278l17, null, textResourceM21278l18, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i2111 | (i2112 << 3) | (i2112 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC32840x.f) {
                            c28655q.m87150e0(-428116622);
                            m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                            c28655q.m87150e0(-427835886);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                            c28655q.m87150e0(-427630077);
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                            if ((i15 & 112) != 32) {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C34904e(function7, 19);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i2113 = AbstractC33208p0.b.f138467h;
                            int i2114 = TextResource.$stable;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i2113 | (i2114 << 3) | (i2114 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.equals(AbstractC32840x.e.f136854b)) {
                                throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                            }
                            c28655q.m87150e0(-427044053);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            Boolean bool5 = Boolean.TRUE;
                            if ((i15 & 112) == 32) {
                                c28655q = c28655q;
                                z14 = true;
                            } else {
                                c28655q = c28655q;
                                z14 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function7, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool5);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function10;
                    function9 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35926d(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function4;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35926d(17);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35926d(18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                if (viewState.equals(AbstractC32840x.b.f136851b)) {
                    c28655q.m87150e0(-429077870);
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
                } else {
                    z13 = true;
                    if (viewState.equals(AbstractC32840x.a.f136850b)) {
                        c28655q.m87150e0(-428693563);
                        AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i2115 = AbstractC33208p0.b.f138467h;
                        int i2116 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar11, textResourceM21278l111, null, textResourceM21278l112, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i2115 | (i2116 << 3) | (i2116 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC32840x.f) {
                        c28655q.m87150e0(-428116622);
                        m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                        c28655q.m87150e0(-427835886);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                        c28655q.m87150e0(-427630077);
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) != 32) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i2117 = AbstractC33208p0.b.f138467h;
                        int i2118 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i2117 | (i2118 << 3) | (i2118 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC32840x.e.f136854b)) {
                            throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                        }
                        c28655q.m87150e0(-427044053);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        Boolean bool6 = Boolean.TRUE;
                        if ((i15 & 112) == 32) {
                            c28655q = c28655q;
                            z14 = true;
                        } else {
                            c28655q = c28655q;
                            z14 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool6);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function10;
                function9 = function11;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
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
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C35926d(16);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function4;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35926d(17);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C35926d(18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
                if (viewState.equals(AbstractC32840x.b.f136851b)) {
                    c28655q.m87150e0(-429077870);
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
                } else {
                    z13 = true;
                    if (viewState.equals(AbstractC32840x.a.f136850b)) {
                        c28655q.m87150e0(-428693563);
                        AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C34904e(function7, 18);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i2119 = AbstractC33208p0.b.f138467h;
                        int i21110 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar13, textResourceM21278l115, null, textResourceM21278l116, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i2119 | (i21110 << 3) | (i21110 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC32840x.f) {
                        c28655q.m87150e0(-428116622);
                        m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                        c28655q.m87150e0(-427835886);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                        c28655q.m87150e0(-427630077);
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                        if ((i15 & 112) != 32) {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C34904e(function7, 19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i21111 = AbstractC33208p0.b.f138467h;
                        int i21112 = TextResource.$stable;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i21111 | (i21112 << 3) | (i21112 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.equals(AbstractC32840x.e.f136854b)) {
                            throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                        }
                        c28655q.m87150e0(-427044053);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        Boolean bool7 = Boolean.TRUE;
                        if ((i15 & 112) == 32) {
                            c28655q = c28655q;
                            z14 = true;
                        } else {
                            c28655q = c28655q;
                            z14 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function7, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool7);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function10;
                function9 = function11;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C35926d(16);
                    c28655q.m87172p0(objM87133R6);
                }
                function7 = (Function1) objM87133R6;
            } else {
                function7 = function4;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C35926d(17);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function5;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C35926d(18);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
            } else {
                function11 = function6;
            }
            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_cycle_pattern_history", c28655q, (i15 & 14) | 48);
            if (viewState.equals(AbstractC32840x.b.f136851b)) {
                c28655q.m87150e0(-429077870);
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
            } else {
                z13 = true;
                if (viewState.equals(AbstractC32840x.a.f136850b)) {
                    c28655q.m87150e0(-428693563);
                    AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l119 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C34904e(function7, 18);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C34904e(function7, 18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i21113 = AbstractC33208p0.b.f138467h;
                    int i21114 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar15, textResourceM21278l119, null, textResourceM21278l1110, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, i21113 | (i21114 << 3) | (i21114 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC32840x.f) {
                    c28655q.m87150e0(-428116622);
                    m115427A((AbstractC32840x.f) viewState, function7, function10, function11, c28655q, i15 & 8190, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC32840x.c.f136852b)) {
                    c28655q.m87150e0(-427835886);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC32840x.d.f136853b)) {
                    c28655q.m87150e0(-427630077);
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164860g));
                    if ((i15 & 112) != 32) {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C34904e(function7, 19);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C34904e(function7, 19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i21115 = AbstractC33208p0.b.f138467h;
                    int i21116 = TextResource.$stable;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, i21115 | (i21116 << 3) | (i21116 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState.equals(AbstractC32840x.e.f136854b)) {
                        throw AbstractC11895b.m32003v(1787274423, c28655q, false);
                    }
                    c28655q.m87150e0(-427044053);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164872s)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    Boolean bool8 = Boolean.TRUE;
                    if ((i15 & 112) == 32) {
                        c28655q = c28655q;
                        z14 = true;
                    } else {
                        c28655q = c28655q;
                        z14 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new a(function7, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(function7, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool8);
                    c28655q.m87173q(false);
                }
            }
            function8 = function10;
            function9 = function11;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(viewState, function7, function8, function9, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m115466u(AbstractC32838v it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m115467v(AbstractC31629a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m115468w(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m115469x(Function1 function1) {
        function1.invoke(AbstractC32838v.b.f136829a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m115470y(Function1 function1) {
        function1.invoke(AbstractC32838v.b.f136829a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m115471z(AbstractC32840x abstractC32840x, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m115465t(abstractC32840x, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
