package mf2;

import a81.C0563n;
import am2.C1017f0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b30.C2646w1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bs1.C3590i;
import bv2.C3675b;
import c41.C4119t1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.AbstractC16319p0;
import if2.AbstractC18454a;
import j11.AbstractC21211n;
import kf2.AbstractC22445d;
import ky2.C22892a;
import l80.C23434k;
import l83.C23454a0;
import lf2.AbstractC24018k;
import lf2.C24011d;
import lf2.C24014g;
import lf2.C24017j;
import lf2.C24020m;
import lf2.EnumC24009b;
import m01.C24875c;
import nf2.AbstractC26668a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import of2.AbstractC27897a;
import of2.AbstractC27899c;
import of2.AbstractC27901e;
import of2.AbstractC27902f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15108p2;
import p163g1.C15136s0;
import p163g1.EnumC15146t0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24958m;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf2.AbstractC29151a;
import pf2.AbstractC29152b;
import pf2.AbstractC29153c;
import pf2.AbstractC29154d;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qe2.AbstractC30314g;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: mf2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0019\u001a\u00020\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aO\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b \u0010!¨\u0006%²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkf2/d;", "sleepScheduleListViewState", "Llf2/k;", "viewState", "", "fromOnboarding", "Lg1/t0;", "bottomSheetInitialState", "Lkotlin/Function1;", "Lnf2/a;", "Ll83/a0;", "sleepScheduleListEventListener", "Lpf2/c;", "wakeTimeSchedulingViewEventListener", "Lif2/a;", "navigationEvent", "Lwe2/a;", "sleepScheduleAnalyticEventListener", "D", "(Lkf2/d;Llf2/k;ZLg1/t0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "errorTitle", "supportText", "Lkotlin/Function0;", "primaryAction", "primaryButtonText", "secondaryAction", "secondaryButtonText", "z", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "showScheduleTurnOnSwitch", "isScheduleEnabled", "e0", "(ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "bottomSheetTitle", "helpLinkOutUrl", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25515f {

    /* JADX INFO: renamed from: mf2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleContainerKt$SleepWakeTimeScheduleListScreen$1$3$1$1$1", m100430f = "SleepWakeTimeScheduleContainer.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99916w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15136s0 f99917x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15136s0 c15136s0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99917x = c15136s0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f99917x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99916w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            C15136s0 c15136s0 = this.f99917x;
            this.f99916w = 1;
            Object objM16788n = AbstractC5583n.m16788n(c15136s0.f56747a, EnumC15146t0.f56808y, this);
            if (objM16788n != enumC31071a) {
                objM16788n = c23454a0;
            }
            return objM16788n == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: renamed from: mf2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleContainerKt$SleepWakeTimeScheduleListScreen$1$3$1$6$1", m100430f = "SleepWakeTimeScheduleContainer.kt", m100431l = {140}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99918w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15136s0 f99919x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15136s0 c15136s0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99919x = c15136s0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f99919x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99918w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15136s0 c15136s0 = this.f99919x;
                this.f99918w = 1;
                if (c15136s0.m43185a(this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m75013A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m75014B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m75015C(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, TextResource textResource3, InterfaceC4339a interfaceC4339a2, TextResource textResource4, int i13, int i14, Composer composer, int i15) {
        m75073z(textResource, textResource2, interfaceC4339a, textResource3, interfaceC4339a2, textResource4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:122:0x0322  */
    /* JADX WARN: Code duplicated, block: B:123:0x0324  */
    /* JADX WARN: Code duplicated, block: B:127:0x032d  */
    /* JADX WARN: Code duplicated, block: B:130:0x033a  */
    /* JADX WARN: Code duplicated, block: B:131:0x033c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:137:0x0370  */
    /* JADX WARN: Code duplicated, block: B:139:0x0374  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:143:0x041c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0420  */
    /* JADX WARN: Code duplicated, block: B:147:0x043e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0440  */
    /* JADX WARN: Code duplicated, block: B:152:0x0449  */
    /* JADX WARN: Code duplicated, block: B:155:0x0459  */
    /* JADX WARN: Code duplicated, block: B:156:0x045b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0464  */
    /* JADX WARN: Code duplicated, block: B:162:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:168:0x0501  */
    /* JADX WARN: Code duplicated, block: B:171:0x0507  */
    /* JADX WARN: Code duplicated, block: B:172:0x0509  */
    /* JADX WARN: Code duplicated, block: B:176:0x0513  */
    /* JADX WARN: Code duplicated, block: B:179:0x0523  */
    /* JADX WARN: Code duplicated, block: B:180:0x0525  */
    /* JADX WARN: Code duplicated, block: B:184:0x052e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0559  */
    /* JADX WARN: Code duplicated, block: B:189:0x055d  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:193:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:195:0x0600  */
    /* JADX WARN: Code duplicated, block: B:197:0x062f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0631  */
    /* JADX WARN: Code duplicated, block: B:201:0x0637  */
    /* JADX WARN: Code duplicated, block: B:202:0x0639  */
    /* JADX WARN: Code duplicated, block: B:206:0x0643  */
    /* JADX WARN: Code duplicated, block: B:209:0x0653  */
    /* JADX WARN: Code duplicated, block: B:210:0x0655  */
    /* JADX WARN: Code duplicated, block: B:214:0x065e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0687  */
    /* JADX WARN: Code duplicated, block: B:218:0x068b  */
    /* JADX WARN: Code duplicated, block: B:219:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:221:0x06da  */
    /* JADX WARN: Code duplicated, block: B:222:0x072b  */
    /* JADX WARN: Code duplicated, block: B:225:0x073e  */
    /* JADX WARN: Code duplicated, block: B:228:0x074e  */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static final void m75016D(AbstractC22445d abstractC22445d, AbstractC24018k viewState, boolean z4, EnumC15146t0 enumC15146t0, Function1 sleepScheduleListEventListener, Function1 wakeTimeSchedulingViewEventListener, Function1 navigationEvent, Function1 sleepScheduleAnalyticEventListener, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        int iOrdinal;
        int i17;
        int i18;
        boolean z14;
        final Function1 function1;
        AbstractC24018k abstractC24018k;
        EnumC15146t0 enumC15146t1;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        EnumC15146t0 enumC15146t2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        int i19;
        boolean z17;
        Object objM87133R3;
        boolean z18;
        Object objM87133R4;
        boolean z19;
        Object objM87133R5;
        boolean z24;
        Object objM87133R6;
        boolean z25;
        Object objM87133R7;
        boolean z26;
        Object objM87133R8;
        int i24;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R9;
        boolean z34;
        Object objM87133R10;
        int i25;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objM87133R11;
        boolean z38;
        Object objM87133R12;
        Object objM87133R13;
        int i26;
        int i27;
        int i28;
        int i29;
        final AbstractC22445d sleepScheduleListViewState = abstractC22445d;
        AbstractC22676k.m65750j(sleepScheduleListViewState, "sleepScheduleListViewState");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(sleepScheduleListEventListener, "sleepScheduleListEventListener");
        AbstractC22676k.m65750j(wakeTimeSchedulingViewEventListener, "wakeTimeSchedulingViewEventListener");
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        AbstractC22676k.m65750j(sleepScheduleAnalyticEventListener, "sleepScheduleAnalyticEventListener");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-663612672);
        int i34 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(sleepScheduleListViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (enumC15146t0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC15146t0.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(sleepScheduleListEventListener)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i29;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(wakeTimeSchedulingViewEventListener)) {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i28;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(navigationEvent)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(sleepScheduleAnalyticEventListener)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            i18 = i15;
            if ((i18 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                if (i35 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    enumC15146t2 = EnumC15146t0.f56806w;
                } else {
                    enumC15146t2 = enumC15146t0;
                }
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(C2314t.f9131w));
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
                C15136s0 c15136s0M43172c = AbstractC15108p2.m43172c(enumC15146t2, c28655q, (i18 >> 9) & 14);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                boolean z39 = z16;
                C35666g c35666g = new C35666g(AbstractC8693b.m21278l(m75017E(interfaceC28601c2)), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, i34, 0 == true ? 1 : 0), new C39274g(AbstractC16319p0.m46430a().getVarious().getEducation(), new TextResource.C8688b(AbstractC30314g.f124257I0, null, i34, 0 == true ? 1 : 0)), null, null, 0.0f, 0.0f, 120, null);
                AbstractC35664f.b bVar = new AbstractC35664f.b(c15136s0M43172c);
                i19 = i18 & 458752;
                if (i19 == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C22892a(wakeTimeSchedulingViewEventListener, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                if ((i18 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C3590i(navigationEvent, interfaceC28601c1, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                EnumC15146t0 enumC15146t3 = enumC15146t2;
                C0563n c0563n = new C0563n((Object) viewState, (Object) c15136s0M43172c, wakeTimeSchedulingViewEventListener, (Object) interfaceC28601c2, (Object) interfaceC28601c1, 10);
                abstractC24018k = viewState;
                z13 = z39;
                sleepScheduleListViewState = abstractC22445d;
                function1 = sleepScheduleListEventListener;
                AbstractC35660d.m112871m(null, c35666g, bVar, null, interfaceC4339a, interfaceC4339a2, null, AbstractC37817c.m121344e(-2071177496, c28655q, c0563n), false, null, null, null, false, null, AbstractC37817c.m121344e(-1655677524, c28655q, new C4119t1(z39, navigationEvent, sleepScheduleListEventListener, abstractC22445d, wakeTimeSchedulingViewEventListener, sleepScheduleAnalyticEventListener)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.b.f151589c << 6), 24576, 16201);
                c28655q = c28655q;
                if (abstractC24018k.equals(AbstractC24018k.b.f94862a)) {
                    c28655q.m87150e0(-1518251125);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC30314g.f124254H0, null, i34, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC30314g.f124251G0, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC30314g.f124264L0, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C24958m(21);
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    int i36 = AbstractC33208p0.b.f138467h | 24576;
                    int i37 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, c8688b, null, c8688b2, interfaceC4339a3, false, false, null, null, null, false, false, c28655q, i36 | (i37 << 3) | (i37 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (abstractC24018k instanceof AbstractC24018k.d) {
                    c28655q.m87150e0(-1517763123);
                    AbstractC24018k.d dVar = (AbstractC24018k.d) abstractC24018k;
                    TextResource textResourceM60907c = dVar.getScheduleSaveErrorActionState().getErrorTitle();
                    TextResource textResourceM60906b = dVar.getScheduleSaveErrorActionState().getErrorDescription();
                    TextResource textResourceM60908d = dVar.getScheduleSaveErrorActionState().getTryAgainActionDisplayText();
                    TextResource textResourceM60905a = dVar.getScheduleSaveErrorActionState().getDismissActionDisplayText();
                    if (i19 == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z25 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C25514e(wakeTimeSchedulingViewEventListener, 1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R7;
                    if (i19 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z26 || objM87133R8 == c28676v0) {
                        objM87133R8 = new C22892a(wakeTimeSchedulingViewEventListener, 26);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i38 = TextResource.$stable;
                    m75073z(textResourceM60907c, textResourceM60906b, interfaceC4339a4, textResourceM60908d, (InterfaceC4339a) objM87133R8, textResourceM60905a, c28655q, (i38 << 3) | i38 | (i38 << 9) | (i38 << 15), 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (abstractC24018k instanceof AbstractC24018k.f) {
                    c28655q.m87150e0(-1517028733);
                    AbstractC24018k.f fVar = (AbstractC24018k.f) abstractC24018k;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(fVar.getScheduleSaveSuccessViewState().getModalTitleDisplay(), 0L, null, 6, null), fVar.getScheduleSaveSuccessViewState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    function1.invoke(AbstractC26668a.c.f106044a);
                    wakeTimeSchedulingViewEventListener.invoke(AbstractC29153c.i.f118009a);
                    c28655q.m87173q(false);
                } else if (abstractC24018k instanceof AbstractC24018k.g) {
                    c28655q.m87150e0(-1516456752);
                    AbstractC24018k.g gVar = (AbstractC24018k.g) abstractC24018k;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.e(gVar.getScheduleSaveViewState().getModalTitleDisplay(), AbstractC16272a.f62108k3), gVar.getScheduleSaveViewState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (abstractC24018k instanceof AbstractC24018k.e) {
                    c28655q.m87150e0(-1515984126);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC30314g.f124328l1, null, i34, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC30314g.f124331m1, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC30314g.f124334n1, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                    if (i19 == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z19 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C22892a(wakeTimeSchedulingViewEventListener, 27);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                    if (i19 == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z24 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C22892a(wakeTimeSchedulingViewEventListener, 28);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i39 = TextResource.C8688b.f25889c;
                    AbstractC21211n.m59497o(null, c8688b3, c8688b4, c8688b5, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, (InterfaceC4339a) objM87133R6, null, null, null, c28655q, (i39 << 3) | (i39 << 6) | (i39 << 9), 0, 0, 247463921);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1515389050);
                    c28655q.m87173q(false);
                }
                if (sleepScheduleListViewState instanceof AbstractC22445d.a) {
                    c28655q.m87150e0(-1515227478);
                    AbstractC22445d.a aVar = (AbstractC22445d.a) sleepScheduleListViewState;
                    TextResource textResourceM60907c2 = aVar.getDeleteErrorState().getErrorTitle();
                    TextResource textResourceM60906b2 = aVar.getDeleteErrorState().getErrorDescription();
                    TextResource textResourceM60908d2 = aVar.getDeleteErrorState().getTryAgainActionDisplayText();
                    TextResource textResourceM60905a2 = aVar.getDeleteErrorState().getDismissActionDisplayText();
                    i25 = i18 & 57344;
                    if (i25 == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if ((i18 & 14) == 4) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z35 | z36;
                    objM87133R11 = c28655q.m87133R();
                    if (z37 || objM87133R11 == c28676v0) {
                        final int i44 = 0;
                        objM87133R11 = new InterfaceC4339a() { // from class: mf2.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i44) {
                                    case 0:
                                        return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                    default:
                                        return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R11;
                    if (i25 == 16384) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R12 = c28655q.m87133R();
                    if (z38 || objM87133R12 == c28676v0) {
                        objM87133R12 = new C22892a(function1, 29);
                        c28655q.m87172p0(objM87133R12);
                    }
                    int i45 = TextResource.$stable;
                    C28655q c28655q2 = c28655q;
                    m75073z(textResourceM60907c2, textResourceM60906b2, interfaceC4339a6, textResourceM60908d2, (InterfaceC4339a) objM87133R12, textResourceM60905a2, c28655q2, (i45 << 3) | i45 | (i45 << 9) | (i45 << 15), 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else if (sleepScheduleListViewState instanceof AbstractC22445d.b) {
                    c28655q.m87150e0(-1514398476);
                    C28655q c28655q3 = c28655q;
                    AbstractC22445d.b bVar3 = (AbstractC22445d.b) sleepScheduleListViewState;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.e(bVar3.getDeleteLoadingState().getModalTitleDisplay(), AbstractC16272a.f62108k3), bVar3.getDeleteLoadingState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                } else if (sleepScheduleListViewState instanceof AbstractC22445d.c) {
                    c28655q.m87150e0(-1513939273);
                    AbstractC22445d.c cVar = (AbstractC22445d.c) sleepScheduleListViewState;
                    C28655q c28655q4 = c28655q;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(cVar.getDeleteSuccessState().getModalTitleDisplay(), 0L, null, 6, null), cVar.getDeleteSuccessState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q4;
                    c28655q.m87173q(false);
                } else if (sleepScheduleListViewState instanceof AbstractC22445d.f) {
                    c28655q.m87150e0(-1513509055);
                    AbstractC22445d.f fVar2 = (AbstractC22445d.f) sleepScheduleListViewState;
                    TextResource textResourceM60907c3 = fVar2.getToggleErrorState().getErrorTitle();
                    TextResource textResourceM60906b3 = fVar2.getToggleErrorState().getErrorDescription();
                    TextResource textResourceM60908d3 = fVar2.getToggleErrorState().getTryAgainActionDisplayText();
                    TextResource textResourceM60905a3 = fVar2.getToggleErrorState().getDismissActionDisplayText();
                    i24 = i18 & 57344;
                    if (i24 == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((i18 & 14) == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z27 | z28;
                    objM87133R9 = c28655q.m87133R();
                    if (z29 || objM87133R9 == c28676v0) {
                        final int i46 = 1;
                        objM87133R9 = new InterfaceC4339a() { // from class: mf2.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i46) {
                                    case 0:
                                        return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                    default:
                                        return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R9;
                    if (i24 == 16384) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z34 || objM87133R10 == c28676v0) {
                        objM87133R10 = new C25514e(function1, 0);
                        c28655q.m87172p0(objM87133R10);
                    }
                    int i47 = TextResource.$stable;
                    C28655q c28655q5 = c28655q;
                    m75073z(textResourceM60907c3, textResourceM60906b3, interfaceC4339a7, textResourceM60908d3, (InterfaceC4339a) objM87133R10, textResourceM60905a3, c28655q5, (i47 << 3) | i47 | (i47 << 9) | (i47 << 15), 0);
                    c28655q = c28655q5;
                    c28655q.m87173q(false);
                } else if (sleepScheduleListViewState instanceof AbstractC22445d.g) {
                    c28655q.m87150e0(-1512671404);
                    C28655q c28655q6 = c28655q;
                    AbstractC22445d.g gVar2 = (AbstractC22445d.g) sleepScheduleListViewState;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.e(gVar2.getToggleLoadingState().getModalTitleDisplay(), AbstractC16272a.f62108k3), gVar2.getToggleLoadingState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q6, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q6;
                    c28655q.m87173q(false);
                } else if (sleepScheduleListViewState instanceof AbstractC22445d.h) {
                    c28655q.m87150e0(-1512212201);
                    AbstractC22445d.h hVar = (AbstractC22445d.h) sleepScheduleListViewState;
                    C28655q c28655q7 = c28655q;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(hVar.getToggleSuccessState().getModalTitleDisplay(), 0L, null, 6, null), hVar.getToggleSuccessState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q7, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1511866458);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                enumC15146t1 = enumC15146t3;
            } else {
                function1 = sleepScheduleListEventListener;
                abstractC24018k = viewState;
                c28655q.m87138X();
                enumC15146t1 = enumC15146t0;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(sleepScheduleListViewState, abstractC24018k, z15, enumC15146t1, function1, wakeTimeSchedulingViewEventListener, navigationEvent, sleepScheduleAnalyticEventListener, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (enumC15146t0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC15146t0.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(sleepScheduleListEventListener)) {
                i29 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i29;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(wakeTimeSchedulingViewEventListener)) {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i28;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(navigationEvent)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i15 |= i27;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(sleepScheduleAnalyticEventListener)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i15 |= i26;
        }
        i18 = i15;
        if ((i18 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            if (i35 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                enumC15146t2 = EnumC15146t0.f56806w;
            } else {
                enumC15146t2 = enumC15146t0;
            }
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(C2314t.f9131w));
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
            C15136s0 c15136s0M43172c2 = AbstractC15108p2.m43172c(enumC15146t2, c28655q, (i18 >> 9) & 14);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            boolean z310 = z16;
            C35666g c35666g2 = new C35666g(AbstractC8693b.m21278l(m75017E(interfaceC28601c3)), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, i34, 0 == true ? 1 : 0), new C39274g(AbstractC16319p0.m46430a().getVarious().getEducation(), new TextResource.C8688b(AbstractC30314g.f124257I0, null, i34, 0 == true ? 1 : 0)), null, null, 0.0f, 0.0f, 120, null);
            AbstractC35664f.b bVar4 = new AbstractC35664f.b(c15136s0M43172c2);
            i19 = i18 & 458752;
            if (i19 == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                objM87133R3 = new C22892a(wakeTimeSchedulingViewEventListener, 25);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C22892a(wakeTimeSchedulingViewEventListener, 25);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
            if ((i18 & 3670016) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z18) {
                objM87133R4 = new C3590i(navigationEvent, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C3590i(navigationEvent, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
            EnumC15146t0 enumC15146t4 = enumC15146t2;
            C0563n c0563n2 = new C0563n((Object) viewState, (Object) c15136s0M43172c2, wakeTimeSchedulingViewEventListener, (Object) interfaceC28601c3, (Object) interfaceC28601c1, 10);
            abstractC24018k = viewState;
            z13 = z310;
            sleepScheduleListViewState = abstractC22445d;
            function1 = sleepScheduleListEventListener;
            AbstractC35660d.m112871m(null, c35666g2, bVar4, null, interfaceC4339a8, interfaceC4339a9, null, AbstractC37817c.m121344e(-2071177496, c28655q, c0563n2), false, null, null, null, false, null, AbstractC37817c.m121344e(-1655677524, c28655q, new C4119t1(z310, navigationEvent, sleepScheduleListEventListener, abstractC22445d, wakeTimeSchedulingViewEventListener, sleepScheduleAnalyticEventListener)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.b.f151589c << 6), 24576, 16201);
            c28655q = c28655q;
            if (abstractC24018k.equals(AbstractC24018k.b.f94862a)) {
                c28655q.m87150e0(-1518251125);
                AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC30314g.f124254H0, null, i34, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC30314g.f124251G0, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC30314g.f124264L0, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C24958m(21);
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R13;
                int i310 = AbstractC33208p0.b.f138467h | 24576;
                int i311 = TextResource.C8688b.f25889c;
                AbstractC33199m0.m105214F(bVar5, c8688b6, null, c8688b7, interfaceC4339a10, false, false, null, null, null, false, false, c28655q, i310 | (i311 << 3) | (i311 << 9), 0, 4068);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.d) {
                c28655q.m87150e0(-1517763123);
                AbstractC24018k.d dVar2 = (AbstractC24018k.d) abstractC24018k;
                TextResource textResourceM60907c4 = dVar2.getScheduleSaveErrorActionState().getErrorTitle();
                TextResource textResourceM60906b4 = dVar2.getScheduleSaveErrorActionState().getErrorDescription();
                TextResource textResourceM60908d4 = dVar2.getScheduleSaveErrorActionState().getTryAgainActionDisplayText();
                TextResource textResourceM60905a4 = dVar2.getScheduleSaveErrorActionState().getDismissActionDisplayText();
                if (i19 == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z25) {
                    objM87133R7 = new C25514e(wakeTimeSchedulingViewEventListener, 1);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C25514e(wakeTimeSchedulingViewEventListener, 1);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                if (i19 == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z26) {
                    objM87133R8 = new C22892a(wakeTimeSchedulingViewEventListener, 26);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C22892a(wakeTimeSchedulingViewEventListener, 26);
                    c28655q.m87172p0(objM87133R8);
                }
                int i312 = TextResource.$stable;
                m75073z(textResourceM60907c4, textResourceM60906b4, interfaceC4339a11, textResourceM60908d4, (InterfaceC4339a) objM87133R8, textResourceM60905a4, c28655q, (i312 << 3) | i312 | (i312 << 9) | (i312 << 15), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.f) {
                c28655q.m87150e0(-1517028733);
                AbstractC24018k.f fVar3 = (AbstractC24018k.f) abstractC24018k;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(fVar3.getScheduleSaveSuccessViewState().getModalTitleDisplay(), 0L, null, 6, null), fVar3.getScheduleSaveSuccessViewState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                function1.invoke(AbstractC26668a.c.f106044a);
                wakeTimeSchedulingViewEventListener.invoke(AbstractC29153c.i.f118009a);
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.g) {
                c28655q.m87150e0(-1516456752);
                AbstractC24018k.g gVar3 = (AbstractC24018k.g) abstractC24018k;
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(gVar3.getScheduleSaveViewState().getModalTitleDisplay(), AbstractC16272a.f62108k3), gVar3.getScheduleSaveViewState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.e) {
                c28655q.m87150e0(-1515984126);
                TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC30314g.f124328l1, null, i34, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC30314g.f124331m1, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC30314g.f124334n1, 0 == true ? 1 : 0, i34, 0 == true ? 1 : 0);
                if (i19 == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    objM87133R5 = new C22892a(wakeTimeSchedulingViewEventListener, 27);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C22892a(wakeTimeSchedulingViewEventListener, 27);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R5;
                if (i19 == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z24) {
                    objM87133R6 = new C22892a(wakeTimeSchedulingViewEventListener, 28);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C22892a(wakeTimeSchedulingViewEventListener, 28);
                    c28655q.m87172p0(objM87133R6);
                }
                int i313 = TextResource.C8688b.f25889c;
                AbstractC21211n.m59497o(null, c8688b8, c8688b9, c8688b10, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a12, null, (InterfaceC4339a) objM87133R6, null, null, null, c28655q, (i313 << 3) | (i313 << 6) | (i313 << 9), 0, 0, 247463921);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1515389050);
                c28655q.m87173q(false);
            }
            if (sleepScheduleListViewState instanceof AbstractC22445d.a) {
                c28655q.m87150e0(-1515227478);
                AbstractC22445d.a aVar2 = (AbstractC22445d.a) sleepScheduleListViewState;
                TextResource textResourceM60907c5 = aVar2.getDeleteErrorState().getErrorTitle();
                TextResource textResourceM60906b5 = aVar2.getDeleteErrorState().getErrorDescription();
                TextResource textResourceM60908d5 = aVar2.getDeleteErrorState().getTryAgainActionDisplayText();
                TextResource textResourceM60905a5 = aVar2.getDeleteErrorState().getDismissActionDisplayText();
                i25 = i18 & 57344;
                if (i25 == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if ((i18 & 14) == 4) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z35 | z36;
                objM87133R11 = c28655q.m87133R();
                if (z37) {
                    final int i48 = 0;
                    objM87133R11 = new InterfaceC4339a() { // from class: mf2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i48) {
                                case 0:
                                    return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                default:
                                    return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R11);
                } else {
                    final int i49 = 0;
                    objM87133R11 = new InterfaceC4339a() { // from class: mf2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i49) {
                                case 0:
                                    return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                default:
                                    return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R11);
                }
                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R11;
                if (i25 == 16384) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objM87133R12 = c28655q.m87133R();
                if (z38) {
                    objM87133R12 = new C22892a(function1, 29);
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C22892a(function1, 29);
                    c28655q.m87172p0(objM87133R12);
                }
                int i410 = TextResource.$stable;
                C28655q c28655q8 = c28655q;
                m75073z(textResourceM60907c5, textResourceM60906b5, interfaceC4339a13, textResourceM60908d5, (InterfaceC4339a) objM87133R12, textResourceM60905a5, c28655q8, (i410 << 3) | i410 | (i410 << 9) | (i410 << 15), 0);
                c28655q = c28655q8;
                c28655q.m87173q(false);
            } else if (sleepScheduleListViewState instanceof AbstractC22445d.b) {
                c28655q.m87150e0(-1514398476);
                C28655q c28655q9 = c28655q;
                AbstractC22445d.b bVar6 = (AbstractC22445d.b) sleepScheduleListViewState;
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(bVar6.getDeleteLoadingState().getModalTitleDisplay(), AbstractC16272a.f62108k3), bVar6.getDeleteLoadingState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q9, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q9;
                c28655q.m87173q(false);
            } else if (sleepScheduleListViewState instanceof AbstractC22445d.c) {
                c28655q.m87150e0(-1513939273);
                AbstractC22445d.c cVar2 = (AbstractC22445d.c) sleepScheduleListViewState;
                C28655q c28655q10 = c28655q;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(cVar2.getDeleteSuccessState().getModalTitleDisplay(), 0L, null, 6, null), cVar2.getDeleteSuccessState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q10, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q10;
                c28655q.m87173q(false);
            } else if (sleepScheduleListViewState instanceof AbstractC22445d.f) {
                c28655q.m87150e0(-1513509055);
                AbstractC22445d.f fVar4 = (AbstractC22445d.f) sleepScheduleListViewState;
                TextResource textResourceM60907c6 = fVar4.getToggleErrorState().getErrorTitle();
                TextResource textResourceM60906b6 = fVar4.getToggleErrorState().getErrorDescription();
                TextResource textResourceM60908d6 = fVar4.getToggleErrorState().getTryAgainActionDisplayText();
                TextResource textResourceM60905a6 = fVar4.getToggleErrorState().getDismissActionDisplayText();
                i24 = i18 & 57344;
                if (i24 == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((i18 & 14) == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z27 | z28;
                objM87133R9 = c28655q.m87133R();
                if (z29) {
                    final int i411 = 1;
                    objM87133R9 = new InterfaceC4339a() { // from class: mf2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i411) {
                                case 0:
                                    return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                default:
                                    return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i412 = 1;
                    objM87133R9 = new InterfaceC4339a() { // from class: mf2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i412) {
                                case 0:
                                    return AbstractC25515f.m75023K(function1, sleepScheduleListViewState);
                                default:
                                    return AbstractC25515f.m75025M(function1, sleepScheduleListViewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R9;
                if (i24 == 16384) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z34) {
                    objM87133R10 = new C25514e(function1, 0);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C25514e(function1, 0);
                    c28655q.m87172p0(objM87133R10);
                }
                int i413 = TextResource.$stable;
                C28655q c28655q11 = c28655q;
                m75073z(textResourceM60907c6, textResourceM60906b6, interfaceC4339a14, textResourceM60908d6, (InterfaceC4339a) objM87133R10, textResourceM60905a6, c28655q11, (i413 << 3) | i413 | (i413 << 9) | (i413 << 15), 0);
                c28655q = c28655q11;
                c28655q.m87173q(false);
            } else if (sleepScheduleListViewState instanceof AbstractC22445d.g) {
                c28655q.m87150e0(-1512671404);
                C28655q c28655q12 = c28655q;
                AbstractC22445d.g gVar4 = (AbstractC22445d.g) sleepScheduleListViewState;
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(gVar4.getToggleLoadingState().getModalTitleDisplay(), AbstractC16272a.f62108k3), gVar4.getToggleLoadingState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q12, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q12;
                c28655q.m87173q(false);
            } else if (sleepScheduleListViewState instanceof AbstractC22445d.h) {
                c28655q.m87150e0(-1512212201);
                AbstractC22445d.h hVar2 = (AbstractC22445d.h) sleepScheduleListViewState;
                C28655q c28655q13 = c28655q;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(hVar2.getToggleSuccessState().getModalTitleDisplay(), 0L, null, 6, null), hVar2.getToggleSuccessState().getModalSubtextDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q13, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q13;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1511866458);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            enumC15146t1 = enumC15146t4;
        } else {
            function1 = sleepScheduleListEventListener;
            abstractC24018k = viewState;
            c28655q.m87138X();
            enumC15146t1 = enumC15146t0;
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(sleepScheduleListViewState, abstractC24018k, z15, enumC15146t1, function1, wakeTimeSchedulingViewEventListener, navigationEvent, sleepScheduleAnalyticEventListener, i13, i14);
        }
    }

    /* JADX INFO: renamed from: E */
    private static final String m75017E(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m75018F() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m75019G(Function1 function1) {
        function1.invoke(AbstractC29153c.f.f118006a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m75020H(Function1 function1) {
        function1.invoke(AbstractC29153c.b.f118002a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m75021I(Function1 function1) {
        function1.invoke(AbstractC29153c.e.f118005a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m75022J(Function1 function1) {
        function1.invoke(AbstractC29153c.e.f118005a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m75023K(Function1 function1, AbstractC22445d abstractC22445d) {
        function1.invoke(new AbstractC26668a.b(((AbstractC22445d.a) abstractC22445d).getScheduleId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m75024L(Function1 function1) {
        function1.invoke(AbstractC26668a.a.f106042a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m75025M(Function1 function1, AbstractC22445d abstractC22445d) {
        function1.invoke(new AbstractC26668a.d(((AbstractC22445d.f) abstractC22445d).getIsScheduleEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m75026N(Function1 function1) {
        function1.invoke(AbstractC26668a.a.f106042a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final void m75027O(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: P */
    private static final String m75028P(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final void m75029Q(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m75030R(Function1 function1) {
        function1.invoke(AbstractC29153c.a.f118001a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m75031S(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC18454a.b(m75028P(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m75032T(AbstractC24018k abstractC24018k, C15136s0 c15136s0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3406c(0.6f, C2314t.f9131w));
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
        if (AbstractC22676k.m65745e(abstractC24018k, AbstractC24018k.b.f94862a)) {
            c28655q.m87150e0(9466322);
            c28655q.m87173q(false);
        } else {
            boolean z4 = abstractC24018k instanceof AbstractC24018k.c;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(9562236);
                boolean zM87157i = c28655q.m87157i(c15136s0);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(c15136s0, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
                AbstractC24018k.c cVar = (AbstractC24018k.c) abstractC24018k;
                m75027O(interfaceC28601c1, cVar.getRepeatDaysViewState().getBottomSheetTitle());
                m75029Q(interfaceC28601c2, cVar.getRepeatDaysViewState().getHelpIconLink());
                C24011d c24011dM70854a = cVar.getRepeatDaysViewState();
                boolean zM87153g = c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C23434k(function1, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27897a.m84187i(c24011dM70854a, (Function1) objM87133R2, c28655q, 0);
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.i) {
                c28655q.m87150e0(10285373);
                AbstractC24018k.i iVar = (AbstractC24018k.i) abstractC24018k;
                m75027O(interfaceC28601c1, iVar.getWakeModeState().getBottomSheetTitle());
                m75029Q(interfaceC28601c2, iVar.getWakeModeState().getHelpIconLink());
                C24017j c24017jM70859a = iVar.getWakeModeState();
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C23434k(function1, 19);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27901e.m84205d(c24017jM70859a, (Function1) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.h) {
                c28655q.m87150e0(10762680);
                AbstractC24018k.h hVar = (AbstractC24018k.h) abstractC24018k;
                m75027O(interfaceC28601c1, hVar.getSleepGoalState().getBottomSheetTitle());
                m75029Q(interfaceC28601c2, hVar.getSleepGoalState().getHelpIconLink());
                C24014g c24014gM70858a = hVar.getSleepGoalState();
                boolean zM87153g3 = c28655q.m87153g(function1);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C23434k(function1, 20);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27899c.m84197e(c24014gM70858a, (Function1) objM87133R4, c28655q, 0);
                c28655q.m87173q(false);
            } else if (abstractC24018k instanceof AbstractC24018k.j) {
                c28655q.m87150e0(11243645);
                AbstractC24018k.j jVar = (AbstractC24018k.j) abstractC24018k;
                m75027O(interfaceC28601c1, jVar.getWakeTimeState().getBottomSheetTitle());
                m75029Q(interfaceC28601c2, jVar.getWakeTimeState().getHelpIconLink());
                C24020m c24020mM70860a = jVar.getWakeTimeState();
                boolean zM87153g4 = c28655q.m87153g(function1);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g4 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C23434k(function1, 21);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC27902f.m84212d(c24020mM70860a, (Function1) objM87133R5, c28655q, 0);
                c28655q.m87173q(false);
            } else if (AbstractC22676k.m65745e(abstractC24018k, AbstractC24018k.a.f94861a)) {
                c28655q.m87150e0(11713109);
                boolean zM87157i2 = c28655q.m87157i(c15136s0);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i2 || objM87133R6 == c28676v0) {
                    objM87133R6 = new b(c15136s0, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c23454a0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(11899698);
                c28655q.m87173q(false);
            }
        }
        c28655q.m87173q(true);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m75033U(Function1 function1, AbstractC29151a repeatDaysViewEvent) {
        AbstractC22676k.m65750j(repeatDaysViewEvent, "repeatDaysViewEvent");
        function1.invoke(new AbstractC29153c.h(repeatDaysViewEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m75034V(Function1 function1, EnumC24009b it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC29153c.l(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m75035W(Function1 function1, AbstractC29152b it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC29153c.k(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m75036X(Function1 function1, AbstractC29154d it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC29153c.m(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m75037Y(boolean z4, Function1 function1, Function1 function2, AbstractC22445d abstractC22445d, Function1 function3, Function1 function4, Composer composer, int i13) {
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            m75048e0(m75038Z(interfaceC28601c1), m75042b0(interfaceC28601c2), z4, function1, function2, c28655q, 0);
            C28655q c28655q2 = c28655q;
            if (AbstractC22676k.m65745e(abstractC22445d, AbstractC22445d.d.f87865a)) {
                c28655q2.m87150e0(1534639452);
                c28655q2.m87173q(false);
                m75040a0(interfaceC28601c1, false);
                z13 = true;
            } else if (abstractC22445d instanceof AbstractC22445d.e) {
                c28655q2.m87150e0(1534834938);
                AbstractC22445d.e eVar = (AbstractC22445d.e) abstractC22445d;
                m75040a0(interfaceC28601c1, eVar.getSleepScheduleList().getShowScheduleList());
                m75044c0(interfaceC28601c2, eVar.getSleepScheduleList().getIsScheduleEnabled());
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q2, 0);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (eVar.getSleepScheduleList().getShouldShowOverlay()) {
                    c28655q2.m87150e0(1935095334);
                    float f13 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, 4 * f13, 1 * f13);
                    String strM21274h = AbstractC8693b.m21274h(eVar.getSleepScheduleList().getScheduleOffText(), c28655q2, TextResource.$stable);
                    C38072d c38072d = C38072d.f163053a;
                    int i14 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21274h, modifierM3395q, c38072d.m121949b(c28655q2, i14).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1935706499);
                    c28655q2.m87173q(false);
                }
                AbstractC25511b.m75005h(eVar, function2, function3, function4, c28655q2, 0);
                z13 = true;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            } else {
                z13 = true;
                c28655q2.m87150e0(1536419658);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final boolean m75038Z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: a0 */
    private static final void m75040a0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: b0 */
    private static final boolean m75042b0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m75044c0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m75046d0(AbstractC22445d abstractC22445d, AbstractC24018k abstractC24018k, boolean z4, EnumC15146t0 enumC15146t0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m75016D(abstractC22445d, abstractC24018k, z4, enumC15146t0, function1, function2, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m75048e0(boolean z4, boolean z13, boolean z14, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        Function1 function3 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358103549);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "Back button");
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getTinyIcons().getBackwardArrow(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            boolean z15 = ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z15 || objM87133R == c28676v0) {
                function3 = function1;
                objM87133R = new C3675b(function3, z14, 4);
                c28655q.m87172p0(objM87133R);
            } else {
                function3 = function1;
            }
            int i15 = i14;
            AbstractC27242b1.m82092d(c27270o, "", modifierM3599a, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 432, 8);
            c28655q = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC30314g.f124339p0);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM92103Y, layoutWeightElement, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196088);
            if (z4) {
                c28655q.m87150e0(349004102);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "Schedule Switch");
                int i17 = i15 & 112;
                boolean z16 = (i17 == 32) | ((i15 & 57344) == 16384);
                Object objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1017f0(function2, z13, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC29641d.m91043e(modifierM3599a2, z13, false, 0L, null, null, (Function1) objM87133R2, c28655q, i17 | 6, 60);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(349248692);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "Schedule Switch");
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24875c(26);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC29641d.m91043e(modifierM3599a3, false, false, 0L, null, null, (Function1) objM87133R3, c28655q, 1572918, 60);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25513d(z4, z13, z14, function3, function2, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m75050f0(Function1 function1, boolean z4) {
        function1.invoke(new AbstractC18454a.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m75052g0(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(new AbstractC26668a.d(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m75054h0(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m75056i0(boolean z4, boolean z13, boolean z14, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m75048e0(z4, z13, z14, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0168  */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX INFO: renamed from: z */
    private static final void m75073z(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, TextResource textResource3, InterfaceC4339a interfaceC4339a2, TextResource textResource4, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        boolean z4;
        TextResource textResource5;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        TextResource textResource6;
        int i18;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        Object objM87133R;
        Object objM87133R2;
        int i19;
        boolean zM87157i;
        boolean zM87157i2;
        int i24;
        TextResource textResourceM21267a = textResource4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-576355475);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a3) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i13 & 4096) == 0) {
                    zM87157i2 = c28655q.m87153g(textResource3);
                } else {
                    zM87157i2 = c28655q.m87157i(textResource3);
                }
                if (zM87157i2) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((262144 & i13) == 0) {
                            zM87157i = c28655q.m87153g(textResourceM21267a);
                        } else {
                            zM87157i = c28655q.m87157i(textResourceM21267a);
                        }
                        if (zM87157i) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24958m(19);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C24958m(20);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i14 & 32) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i15 &= -458753;
                        }
                        textResource6 = textResourceM21267a;
                        i18 = i15;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a7;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 32) != 0) {
                            i15 &= -458753;
                        }
                        textResource6 = textResourceM21267a;
                        i18 = i15;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a3;
                    }
                    c28655q.m87175r();
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(textResource, false, null, 6, null);
                    int i26 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    int i27 = TextResource.$stable;
                    int i28 = i18 << 6;
                    interfaceC4339a3 = interfaceC4339a9;
                    AbstractC33199m0.m105214F(bVar, textResource2, null, textResource3, interfaceC4339a3, true, false, textResource6, interfaceC4339a8, null, false, false, c28655q, i26 | (i27 << 3) | (i18 & 112) | (i27 << 9) | (i18 & 7168) | (57344 & i28) | (i27 << 21) | (29360128 & i28) | ((i18 << 12) & 234881024), 0, 3652);
                    textResource5 = textResource6;
                    interfaceC4339a5 = interfaceC4339a8;
                } else {
                    c28655q.m87138X();
                    textResource5 = textResourceM21267a;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                interfaceC4339a6 = interfaceC4339a3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(textResource, textResource2, interfaceC4339a6, textResource3, interfaceC4339a5, textResource5, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i = c28655q.m87153g(textResourceM21267a);
                    } else {
                        zM87157i = c28655q.m87157i(textResourceM21267a);
                    }
                    if (zM87157i) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24958m(19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24958m(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i14 & 32) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -458753;
                    }
                    textResource6 = textResourceM21267a;
                    i18 = i15;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a7;
                } else {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24958m(19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24958m(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i14 & 32) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -458753;
                    }
                    textResource6 = textResourceM21267a;
                    i18 = i15;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a7;
                }
                c28655q.m87175r();
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(textResource, false, null, 6, null);
                int i29 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i210 = TextResource.$stable;
                int i211 = i18 << 6;
                interfaceC4339a3 = interfaceC4339a9;
                AbstractC33199m0.m105214F(bVar2, textResource2, null, textResource3, interfaceC4339a3, true, false, textResource6, interfaceC4339a8, null, false, false, c28655q, i29 | (i210 << 3) | (i18 & 112) | (i210 << 9) | (i18 & 7168) | (57344 & i211) | (i210 << 21) | (29360128 & i211) | ((i18 << 12) & 234881024), 0, 3652);
                textResource5 = textResource6;
                interfaceC4339a5 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                textResource5 = textResourceM21267a;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(textResource, textResource2, interfaceC4339a6, textResource3, interfaceC4339a5, textResource5, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4339a3 = interfaceC4339a;
        if ((i13 & 3072) == 0) {
            if ((i13 & 4096) == 0) {
                zM87157i2 = c28655q.m87153g(textResource3);
            } else {
                zM87157i2 = c28655q.m87157i(textResource3);
            }
            if (zM87157i2) {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i24;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((262144 & i13) == 0) {
                        zM87157i = c28655q.m87153g(textResourceM21267a);
                    } else {
                        zM87157i = c28655q.m87157i(textResourceM21267a);
                    }
                    if (zM87157i) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24958m(19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24958m(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i14 & 32) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -458753;
                    }
                    textResource6 = textResourceM21267a;
                    i18 = i15;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a7;
                } else {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24958m(19);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24958m(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i14 & 32) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -458753;
                    }
                    textResource6 = textResourceM21267a;
                    i18 = i15;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a7;
                }
                c28655q.m87175r();
                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(textResource, false, null, 6, null);
                int i212 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i213 = TextResource.$stable;
                int i214 = i18 << 6;
                interfaceC4339a3 = interfaceC4339a9;
                AbstractC33199m0.m105214F(bVar3, textResource2, null, textResource3, interfaceC4339a3, true, false, textResource6, interfaceC4339a8, null, false, false, c28655q, i212 | (i213 << 3) | (i18 & 112) | (i213 << 9) | (i18 & 7168) | (57344 & i214) | (i213 << 21) | (29360128 & i214) | ((i18 << 12) & 234881024), 0, 3652);
                textResource5 = textResource6;
                interfaceC4339a5 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                textResource5 = textResourceM21267a;
                interfaceC4339a5 = interfaceC4339a4;
            }
            interfaceC4339a6 = interfaceC4339a3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(textResource, textResource2, interfaceC4339a6, textResource3, interfaceC4339a5, textResource5, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & 32) != 0) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((262144 & i13) == 0) {
                    zM87157i = c28655q.m87153g(textResourceM21267a);
                } else {
                    zM87157i = c28655q.m87157i(textResourceM21267a);
                }
                if (zM87157i) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i19;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24958m(19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24958m(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                }
                if ((i14 & 32) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -458753;
                }
                textResource6 = textResourceM21267a;
                i18 = i15;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a7;
            } else {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24958m(19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24958m(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                }
                if ((i14 & 32) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -458753;
                }
                textResource6 = textResourceM21267a;
                i18 = i15;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a7;
            }
            c28655q.m87175r();
            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(textResource, false, null, 6, null);
            int i215 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            int i216 = TextResource.$stable;
            int i217 = i18 << 6;
            interfaceC4339a3 = interfaceC4339a9;
            AbstractC33199m0.m105214F(bVar4, textResource2, null, textResource3, interfaceC4339a3, true, false, textResource6, interfaceC4339a8, null, false, false, c28655q, i215 | (i216 << 3) | (i18 & 112) | (i216 << 9) | (i18 & 7168) | (57344 & i217) | (i216 << 21) | (29360128 & i217) | ((i18 << 12) & 234881024), 0, 3652);
            textResource5 = textResource6;
            interfaceC4339a5 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            textResource5 = textResourceM21267a;
            interfaceC4339a5 = interfaceC4339a4;
        }
        interfaceC4339a6 = interfaceC4339a3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(textResource, textResource2, interfaceC4339a6, textResource3, interfaceC4339a5, textResource5, i13, i14);
        }
    }
}
