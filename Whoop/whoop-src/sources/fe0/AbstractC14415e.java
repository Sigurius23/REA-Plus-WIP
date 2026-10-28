package fe0;

import a23.C0176c;
import a81.C0555f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2609r;
import b91.C2886a;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import be0.AbstractC3165a;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce0.AbstractC4487b;
import ce0.AbstractC4489d;
import ce0.C4486a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import de0.C11980a;
import eg2.C13168a;
import f01.C13849c0;
import f41.C14068f;
import fa0.C14294a;
import fd3.C14408a;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import ge0.C15731f;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import io.sentry.config.AbstractC20301a;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import l83.C23465k;
import md0.AbstractC25448c;
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
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fe0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aw\u0010\u0018\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\r¨\u0006\u001d²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lce0/d;", "viewState", "Lkotlin/Function1;", "Lbe0/a;", "Ll83/a0;", "onNavigationEvent", "Lkd0/a$c;", "onAnalyticsEvent", "Lce0/b;", "onViewEvent", "R", "(Lce0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lce0/d$c;", "F", "(Lce0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Y", "(Landroidx/compose/runtime/Composer;I)V", "Lce0/a;", "formContent", "Lde0/a;", "selectedAppointment", "", "searchQuery", "testType", "x", "(Lce0/a;Lde0/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "horizontalContentPadding", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14415e {

    /* JADX INFO: renamed from: a */
    private static final float f52575a = 2 * 8;

    /* JADX INFO: renamed from: fe0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.view.SchedulingFormScreenKt$FormContent$3$1$1", m100430f = "SchedulingFormScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52576w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f52577x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f52578y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f52579z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52577x = function1;
            this.f52578y = str;
            this.f52579z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f52577x, this.f52578y, this.f52579z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52576w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f52577x.invoke(new InterfaceC22381a.m0(this.f52578y, this.f52579z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fe0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.view.SchedulingFormScreenKt$FormContent$3$3$1", m100430f = "SchedulingFormScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f52580E;

        /* JADX INFO: renamed from: w */
        int f52581w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f52582x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f52583y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4486a f52584z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Function1 function1, C4486a c4486a, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52582x = str;
            this.f52583y = function1;
            this.f52584z = c4486a;
            this.f52580E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f52582x, this.f52583y, this.f52584z, this.f52580E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52581w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f52582x.length() > 0) {
                this.f52583y.invoke(new InterfaceC22381a.l0(this.f52582x, this.f52584z.getHeaderInfoCallout() != null, this.f52580E));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m41060A(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(967943299);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, f52575a, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Modifier m41061B(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1592093082);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, f52575a, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m41062C(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C14411a.f52567a.m41058e(event, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m41063D(Function1 function1, String str, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C14411a.f52567a.m41059f(event, function1, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m41064E(C4486a c4486a, C11980a c11980a, Function1 function1, String str, String str2, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m41109x(c4486a, c11980a, function1, str, str2, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:103:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:115:0x0448  */
    /* JADX WARN: Code duplicated, block: B:117:0x045d  */
    /* JADX WARN: Code duplicated, block: B:120:0x051d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0525  */
    /* JADX WARN: Code duplicated, block: B:125:0x0537  */
    /* JADX WARN: Code duplicated, block: B:127:0x0545  */
    /* JADX WARN: Code duplicated, block: B:133:0x0582  */
    /* JADX WARN: Code duplicated, block: B:134:0x0586  */
    /* JADX WARN: Code duplicated, block: B:137:0x0593  */
    /* JADX WARN: Code duplicated, block: B:139:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:155:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:157:0x0601  */
    /* JADX WARN: Code duplicated, block: B:158:0x0603  */
    /* JADX WARN: Code duplicated, block: B:161:0x060a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x060c  */
    /* JADX WARN: Code duplicated, block: B:165:0x062b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0639  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0207  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    /* JADX INFO: renamed from: F */
    private static final void m41065F(AbstractC4489d.c cVar, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        int i19;
        boolean z4;
        AbstractC4489d.c cVar2;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function9;
        Function1 function10;
        Function1 function11;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C2314t c2314t;
        Function1 function12;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        boolean z13;
        Object objM87133R2;
        C28655q c28655q;
        InterfaceC25312u interfaceC25312uM14052m;
        Function1 function13;
        int i24;
        boolean z14;
        Object objM87133R3;
        C28676v0 c28676v1;
        Function1 function14;
        Function1 function15;
        C28676v0 c28676v2;
        Function1 function16;
        Function1 function17;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode4;
        boolean z15;
        boolean z16;
        Object objM87133R4;
        C28676v0 c28676v3;
        C33211q0 c33211q0M14048i;
        boolean z17;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1788073736);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q2.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q2.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q2.m87157i(function3)) {
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
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C14068f(12);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            function9 = (Function1) objM87133R8;
                        } else {
                            function9 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C14068f(13);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C14068f(14);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function3;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z("");
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                        function12 = function11;
                        C2307m c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66725n);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i3 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d);
                        C0209i c0209i4 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        float f14 = 4;
                        float f15 = 8;
                        f13 = f14 * f15;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f15, 5);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f14, c2314t), 1 * f15, 0.0f, 0.0f, 2 * f15, 6);
                        C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z13 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C14294a(function9, 13);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3398t2, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                        c28655q = c28655q2;
                        interfaceC25312uM14052m = cVar.getTestTile();
                        if (interfaceC25312uM14052m == null) {
                            c28655q.m87150e0(-1726024158);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1726024157);
                            AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                            c28655q = c28655q;
                            AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                        }
                        String strM14054o = cVar.getTitle();
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        C2886a t14 = c38072d.m121952e(c28655q, i26).getT2();
                        long brandWhite = c38072d.m121949b(c28655q, i26).getBrandWhite();
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f16 = f52575a;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3409f, f16, 0.0f, 2);
                        C36775k c36775k = new C36775k(5);
                        int i27 = C2886a.f11498d << 18;
                        C28655q c28655q3 = c28655q;
                        function13 = function9;
                        AbstractC30795n.m94707h(strM14054o, modifierM3396r, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, t14, null, c28655q3, 48, i27, 196088);
                        float f17 = 6;
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f17, c2314t));
                        AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2), c38072d.m121949b(c28655q3, i26).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i26).getB1(), null, c28655q3, 48, i27, 196088);
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(28, c2314t));
                        AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2), c38072d.m121949b(c28655q3, i26).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i26).getFormLabel(), null, c28655q3, 48, i27, 196088);
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f15, c2314t));
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                        TextResource.C8691e c8691e = new TextResource.C8691e("");
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2);
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (z14) {
                            c28676v1 = c28676v0;
                        } else {
                            c28676v1 = c28676v0;
                            if (objM87133R3 == c28676v1) {
                                function14 = function12;
                            }
                            function15 = function14;
                            c28676v2 = c28676v1;
                            AbstractC17795v0.m51127j(modifierM3396r2, textResourceM21278l, c8691e, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q3, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                            c28655q2 = c28655q3;
                            if (cVar.getIsSearching()) {
                                c28655q2.m87150e0(-1723332768);
                                m41084Y(c28655q2, 0);
                                c28655q2.m87173q(false);
                                function16 = function10;
                                function7 = function13;
                                function17 = function15;
                            } else {
                                c28655q2.m87150e0(-1723260910);
                                function7 = function13;
                                Function1 function18 = function10;
                                m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function18, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                                function16 = function18;
                                c28655q2 = c28655q2;
                                function17 = function15;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            C2307m c2307m2 = C2299e.f9105H;
                            C1100b c1100b = C1100b.f4583a;
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m2)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q2, i26).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d.m121949b(c28655q2, i26).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f17 * f15, 0.0f, 3 * f15, 5);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c0213j2 = c0213j;
                                c28655q2.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m3);
                            if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                c0209i2 = c0209i;
                            } else {
                                c0209i2 = c0209i;
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f16, 0.0f, 11);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode4 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j2);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m4);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                            C3927k c3927kM14044e = cVar.getButton();
                            cVar2 = cVar;
                            boolean zM87157i = c28655q2.m87157i(cVar2);
                            if (i24 == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87157i | z15;
                            objM87133R4 = c28655q2.m87133R();
                            if (z16) {
                                c28676v3 = c28676v2;
                            } else {
                                c28676v3 = c28676v2;
                                if (objM87133R4 == c28676v3) {
                                }
                                AbstractC3926j.m11931e(c3927kM14044e, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(true);
                                c33211q0M14048i = cVar2.getModalViewState();
                                if (c33211q0M14048i == null) {
                                    c28655q2.m87150e0(884806612);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(884806613);
                                    C33211q0 c33211q0M41056b = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                    if (i24 == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    objM87133R5 = c28655q2.m87133R();
                                    if (z17 || objM87133R5 == c28676v3) {
                                        objM87133R5 = new C14294a(function17, 10);
                                        c28655q2.m87172p0(objM87133R5);
                                    }
                                    Function0.m105274p(c33211q0M41056b, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(true);
                                function8 = function16;
                                function6 = function17;
                            }
                            objM87133R4 = new C14408a(1, cVar2, function17);
                            c28655q2.m87172p0(objM87133R4);
                            AbstractC3926j.m11931e(c3927kM14044e, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c33211q0M14048i = cVar2.getModalViewState();
                            if (c33211q0M14048i == null) {
                                c28655q2.m87150e0(884806612);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(884806613);
                                C33211q0 c33211q0M41056b2 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                if (i24 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R5 = c28655q2.m87133R();
                                if (z17) {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                Function0.m105274p(c33211q0M41056b2, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            function8 = function16;
                            function6 = function17;
                        }
                        function14 = function12;
                        objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                        c28655q3.m87172p0(objM87133R3);
                        function15 = function14;
                        c28676v2 = c28676v1;
                        AbstractC17795v0.m51127j(modifierM3396r2, textResourceM21278l, c8691e, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q3, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                        c28655q2 = c28655q3;
                        if (cVar.getIsSearching()) {
                            c28655q2.m87150e0(-1723332768);
                            m41084Y(c28655q2, 0);
                            c28655q2.m87173q(false);
                            function16 = function10;
                            function7 = function13;
                            function17 = function15;
                        } else {
                            c28655q2.m87150e0(-1723260910);
                            function7 = function13;
                            Function1 function19 = function10;
                            m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function19, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                            function16 = function19;
                            c28655q2 = c28655q2;
                            function17 = function15;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        C2307m c2307m3 = C2299e.f9105H;
                        C1100b c1100b2 = C1100b.f4583a;
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b2.mo3400a(c2314t, c2307m3)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q2, i26).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d.m121949b(c28655q2, i26).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f17 * f15, 0.0f, 3 * f15, 5);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m5);
                        if (c28655q2.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(c1100b2.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f16, 0.0f, 11);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m6);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N6);
                        C3927k c3927kM14044e2 = cVar.getButton();
                        cVar2 = cVar;
                        boolean zM87157i2 = c28655q2.m87157i(cVar2);
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i2 | z15;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            c28676v3 = c28676v2;
                            if (objM87133R4 == c28676v3) {
                            }
                            AbstractC3926j.m11931e(c3927kM14044e2, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c33211q0M14048i = cVar2.getModalViewState();
                            if (c33211q0M14048i == null) {
                                c28655q2.m87150e0(884806612);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(884806613);
                                C33211q0 c33211q0M41056b3 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                if (i24 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R5 = c28655q2.m87133R();
                                if (z17) {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                Function0.m105274p(c33211q0M41056b3, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            function8 = function16;
                            function6 = function17;
                        } else {
                            c28676v3 = c28676v2;
                        }
                        objM87133R4 = new C14408a(1, cVar2, function17);
                        c28655q2.m87172p0(objM87133R4);
                        AbstractC3926j.m11931e(c3927kM14044e2, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b4 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b4, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        function6 = function3;
                        function7 = function4;
                        function8 = function5;
                    }
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
                    }
                }
                i15 |= 3072;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C14068f(12);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(13);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C14068f(14);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function3;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    function12 = function11;
                    C2307m c2307m4 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM66725n2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d6);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N7);
                    float f18 = 4;
                    float f19 = 8;
                    f13 = f18 * f19;
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f19, 5);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3398t7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N8);
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f18, c2314t), 1 * f19, 0.0f, 0.0f, 2 * f19, 6);
                    C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o2, strM92103Y2, modifierM3398t8, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                    c28655q = c28655q2;
                    interfaceC25312uM14052m = cVar.getTestTile();
                    if (interfaceC25312uM14052m == null) {
                        c28655q.m87150e0(-1726024158);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1726024157);
                        AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                        c28655q = c28655q;
                        AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                    }
                    String strM14054o2 = cVar.getTitle();
                    C38072d c38072d2 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    C2886a t15 = c38072d2.m121952e(c28655q, i28).getT2();
                    long brandWhite2 = c38072d2.m121949b(c28655q, i28).getBrandWhite();
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f110 = f52575a;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(modifierM3409f2, f110, 0.0f, 2);
                    C36775k c36775k2 = new C36775k(5);
                    int i29 = C2886a.f11498d << 18;
                    C28655q c28655q4 = c28655q;
                    function13 = function9;
                    AbstractC30795n.m94707h(strM14054o2, modifierM3396r3, brandWhite2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, t15, null, c28655q4, 48, i29, 196088);
                    float f111 = 6;
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f111, c2314t));
                    AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2), c38072d2.m121949b(c28655q4, i28).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i28).getB1(), null, c28655q4, 48, i29, 196088);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(28, c2314t));
                    AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2), c38072d2.m121949b(c28655q4, i28).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i28).getFormLabel(), null, c28655q4, 48, i29, 196088);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(f19, c2314t));
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                    TextResource.C8691e c8691e2 = new TextResource.C8691e("");
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z14) {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                            function14 = function12;
                        }
                        function15 = function14;
                        c28676v2 = c28676v1;
                        AbstractC17795v0.m51127j(modifierM3396r4, textResourceM21278l2, c8691e2, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q4, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                        c28655q2 = c28655q4;
                        if (cVar.getIsSearching()) {
                            c28655q2.m87150e0(-1723332768);
                            m41084Y(c28655q2, 0);
                            c28655q2.m87173q(false);
                            function16 = function10;
                            function7 = function13;
                            function17 = function15;
                        } else {
                            c28655q2.m87150e0(-1723260910);
                            function7 = function13;
                            Function1 function110 = function10;
                            m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function110, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                            function16 = function110;
                            c28655q2 = c28655q2;
                            function17 = function15;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        C2307m c2307m5 = C2299e.f9105H;
                        C1100b c1100b3 = C1100b.f4583a;
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, c2307m5)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q2, i28).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d2.m121949b(c28655q2, i28).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f111 * f19, 0.0f, 3 * f19, 5);
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3398t9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m9);
                        if (c28655q2.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N9);
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(c1100b3.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f110, 0.0f, 11);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3398t10);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d8);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m10);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N10);
                        C3927k c3927kM14044e3 = cVar.getButton();
                        cVar2 = cVar;
                        boolean zM87157i3 = c28655q2.m87157i(cVar2);
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i3 | z15;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            c28676v3 = c28676v2;
                            if (objM87133R4 == c28676v3) {
                            }
                            AbstractC3926j.m11931e(c3927kM14044e3, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c33211q0M14048i = cVar2.getModalViewState();
                            if (c33211q0M14048i == null) {
                                c28655q2.m87150e0(884806612);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(884806613);
                                C33211q0 c33211q0M41056b5 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                if (i24 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R5 = c28655q2.m87133R();
                                if (z17) {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                Function0.m105274p(c33211q0M41056b5, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            function8 = function16;
                            function6 = function17;
                        } else {
                            c28676v3 = c28676v2;
                        }
                        objM87133R4 = new C14408a(1, cVar2, function17);
                        c28655q2.m87172p0(objM87133R4);
                        AbstractC3926j.m11931e(c3927kM14044e3, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b6 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b6, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function14 = function12;
                    objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                    c28655q4.m87172p0(objM87133R3);
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r4, textResourceM21278l2, c8691e2, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q4, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q4;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function111 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function111, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function111;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m6 = C2299e.f9105H;
                    C1100b c1100b4 = C1100b.f4583a;
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b4.mo3400a(c2314t, c2307m6)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q2, i28).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d2.m121949b(c28655q2, i28).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f111 * f19, 0.0f, 3 * f19, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N11);
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(c1100b4.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f110, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3398t12);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N12);
                    C3927k c3927kM14044e4 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i4 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i4 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e4, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b7 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b7, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e4, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b8 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b8, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87157i(function3)) {
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C14068f(12);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(13);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C14068f(14);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function3;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66725n3 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    function12 = function11;
                    C2307m c2307m7 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM66725n3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i9 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d11);
                    C0209i c0209i10 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N13);
                    float f112 = 4;
                    float f113 = 8;
                    f13 = f112 * f113;
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f113, 5);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3398t13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N14);
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f112, c2314t), 1 * f113, 0.0f, 0.0f, 2 * f113, 6);
                    C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y3 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o3, strM92103Y3, modifierM3398t14, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                    c28655q = c28655q2;
                    interfaceC25312uM14052m = cVar.getTestTile();
                    if (interfaceC25312uM14052m == null) {
                        c28655q.m87150e0(-1726024158);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1726024157);
                        AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                        c28655q = c28655q;
                        AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                    }
                    String strM14054o3 = cVar.getTitle();
                    C38072d c38072d3 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    C2886a t16 = c38072d3.m121952e(c28655q, i210).getT2();
                    long brandWhite3 = c38072d3.m121949b(c28655q, i210).getBrandWhite();
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f114 = f52575a;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(modifierM3409f3, f114, 0.0f, 2);
                    C36775k c36775k3 = new C36775k(5);
                    int i211 = C2886a.f11498d << 18;
                    C28655q c28655q5 = c28655q;
                    function13 = function9;
                    AbstractC30795n.m94707h(strM14054o3, modifierM3396r5, brandWhite3, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, t16, null, c28655q5, 48, i211, 196088);
                    float f115 = 6;
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f115, c2314t));
                    AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 2), c38072d3.m121949b(c28655q5, i210).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q5, i210).getB1(), null, c28655q5, 48, i211, 196088);
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(28, c2314t));
                    AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 2), c38072d3.m121949b(c28655q5, i210).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q5, i210).getFormLabel(), null, c28655q5, 48, i211, 196088);
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f113, c2314t));
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                    TextResource.C8691e c8691e3 = new TextResource.C8691e("");
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f114, 0.0f, 2);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q5.m87133R();
                    if (z14) {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                            function14 = function12;
                        }
                        function15 = function14;
                        c28676v2 = c28676v1;
                        AbstractC17795v0.m51127j(modifierM3396r6, textResourceM21278l3, c8691e3, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q5, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                        c28655q2 = c28655q5;
                        if (cVar.getIsSearching()) {
                            c28655q2.m87150e0(-1723332768);
                            m41084Y(c28655q2, 0);
                            c28655q2.m87173q(false);
                            function16 = function10;
                            function7 = function13;
                            function17 = function15;
                        } else {
                            c28655q2.m87150e0(-1723260910);
                            function7 = function13;
                            Function1 function112 = function10;
                            m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function112, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                            function16 = function112;
                            c28655q2 = c28655q2;
                            function17 = function15;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        C2307m c2307m8 = C2299e.f9105H;
                        C1100b c1100b5 = C1100b.f4583a;
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b5.mo3400a(c2314t, c2307m8)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d3.m121949b(c28655q2, i210).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d3.m121949b(c28655q2, i210).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f115 * f113, 0.0f, 3 * f113, 5);
                        InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m7, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3398t15);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d12);
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N15);
                        Modifier modifierM3398t16 = AbstractC1099a.m3398t(c1100b5.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f114, 0.0f, 11);
                        InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m7, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3398t16);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d13);
                        AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m16);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N16);
                        C3927k c3927kM14044e5 = cVar.getButton();
                        cVar2 = cVar;
                        boolean zM87157i5 = c28655q2.m87157i(cVar2);
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i5 | z15;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            c28676v3 = c28676v2;
                            if (objM87133R4 == c28676v3) {
                            }
                            AbstractC3926j.m11931e(c3927kM14044e5, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c33211q0M14048i = cVar2.getModalViewState();
                            if (c33211q0M14048i == null) {
                                c28655q2.m87150e0(884806612);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(884806613);
                                C33211q0 c33211q0M41056b9 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                if (i24 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R5 = c28655q2.m87133R();
                                if (z17) {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                Function0.m105274p(c33211q0M41056b9, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            function8 = function16;
                            function6 = function17;
                        } else {
                            c28676v3 = c28676v2;
                        }
                        objM87133R4 = new C14408a(1, cVar2, function17);
                        c28655q2.m87172p0(objM87133R4);
                        AbstractC3926j.m11931e(c3927kM14044e5, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b10 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b10, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function14 = function12;
                    objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                    c28655q5.m87172p0(objM87133R3);
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r6, textResourceM21278l3, c8691e3, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q5, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q5;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function113 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function113, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function113;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m9 = C2299e.f9105H;
                    C1100b c1100b6 = C1100b.f4583a;
                    Modifier modifierM3398t17 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b6.mo3400a(c2314t, c2307m9)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d3.m121949b(c28655q2, i210).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d3.m121949b(c28655q2, i210).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f115 * f113, 0.0f, 3 * f113, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM3398t17);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N17);
                    Modifier modifierM3398t18 = AbstractC1099a.m3398t(c1100b6.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f114, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3398t18);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m18);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N18);
                    C3927k c3927kM14044e6 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i6 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i6 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e6, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b11 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b11, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e6, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b12 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b12, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C14068f(12);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function9 = (Function1) objM87133R8;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(13);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C14068f(14);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function3;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66725n4 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                function12 = function11;
                C2307m c2307m10 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m10, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM66725n4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i12 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC39127r0M66763d16);
                C0209i c0209i13 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N19);
                float f116 = 4;
                float f117 = 8;
                f13 = f116 * f117;
                Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f117, 5);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t19);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i12, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N110);
                Modifier modifierM3398t110 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f116, c2314t), 1 * f117, 0.0f, 0.0f, 2 * f117, 6);
                C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o4, strM92103Y4, modifierM3398t110, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                c28655q = c28655q2;
                interfaceC25312uM14052m = cVar.getTestTile();
                if (interfaceC25312uM14052m == null) {
                    c28655q.m87150e0(-1726024158);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1726024157);
                    AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                    c28655q = c28655q;
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                }
                String strM14054o4 = cVar.getTitle();
                C38072d c38072d4 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                C2886a t17 = c38072d4.m121952e(c28655q, i212).getT2();
                long brandWhite4 = c38072d4.m121949b(c28655q, i212).getBrandWhite();
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f118 = f52575a;
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(modifierM3409f4, f118, 0.0f, 2);
                C36775k c36775k4 = new C36775k(5);
                int i213 = C2886a.f11498d << 18;
                C28655q c28655q6 = c28655q;
                function13 = function9;
                AbstractC30795n.m94707h(strM14054o4, modifierM3396r7, brandWhite4, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, t17, null, c28655q6, 48, i213, 196088);
                float f119 = 6;
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(f119, c2314t));
                AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 2), c38072d4.m121949b(c28655q6, i212).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q6, i212).getB1(), null, c28655q6, 48, i213, 196088);
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(28, c2314t));
                AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 2), c38072d4.m121949b(c28655q6, i212).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q6, i212).getFormLabel(), null, c28655q6, 48, i213, 196088);
                AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3411h(f117, c2314t));
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                TextResource.C8691e c8691e4 = new TextResource.C8691e("");
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f118, 0.0f, 2);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q6.m87133R();
                if (z14) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        function14 = function12;
                    }
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r8, textResourceM21278l4, c8691e4, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q6, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q6;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function114 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function114, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function114;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m11 = C2299e.f9105H;
                    C1100b c1100b7 = C1100b.f4583a;
                    Modifier modifierM3398t111 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b7.mo3400a(c2314t, c2307m11)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d4.m121949b(c28655q2, i212).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d4.m121949b(c28655q2, i212).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f119 * f117, 0.0f, 3 * f117, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m10, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t111);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC39127r0M66763d17);
                    AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m111);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N111);
                    Modifier modifierM3398t112 = AbstractC1099a.m3398t(c1100b7.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f118, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m10, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3398t112);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC39127r0M66763d18);
                    AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N112);
                    C3927k c3927kM14044e7 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i7 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i7 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e7, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b13 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b13, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e7, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b14 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b14, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v1 = c28676v0;
                }
                function14 = function12;
                objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                c28655q6.m87172p0(objM87133R3);
                function15 = function14;
                c28676v2 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3396r8, textResourceM21278l4, c8691e4, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q6, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                c28655q2 = c28655q6;
                if (cVar.getIsSearching()) {
                    c28655q2.m87150e0(-1723332768);
                    m41084Y(c28655q2, 0);
                    c28655q2.m87173q(false);
                    function16 = function10;
                    function7 = function13;
                    function17 = function15;
                } else {
                    c28655q2.m87150e0(-1723260910);
                    function7 = function13;
                    Function1 function115 = function10;
                    m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function115, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                    function16 = function115;
                    c28655q2 = c28655q2;
                    function17 = function15;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                C2307m c2307m12 = C2299e.f9105H;
                C1100b c1100b8 = C1100b.f4583a;
                Modifier modifierM3398t113 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b8.mo3400a(c2314t, c2307m12)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d4.m121949b(c28655q2, i212).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d4.m121949b(c28655q2, i212).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f119 * f117, 0.0f, 3 * f117, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m10, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3398t113);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC39127r0M66763d19);
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N113);
                Modifier modifierM3398t114 = AbstractC1099a.m3398t(c1100b8.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f118, 0.0f, 11);
                InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m10, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t114);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC39127r0M66763d110);
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N114);
                C3927k c3927kM14044e8 = cVar.getButton();
                cVar2 = cVar;
                boolean zM87157i8 = c28655q2.m87157i(cVar2);
                if (i24 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i8 | z15;
                objM87133R4 = c28655q2.m87133R();
                if (z16) {
                    c28676v3 = c28676v2;
                    if (objM87133R4 == c28676v3) {
                    }
                    AbstractC3926j.m11931e(c3927kM14044e8, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b15 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b15, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v3 = c28676v2;
                }
                objM87133R4 = new C14408a(1, cVar2, function17);
                c28655q2.m87172p0(objM87133R4);
                AbstractC3926j.m11931e(c3927kM14044e8, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c33211q0M14048i = cVar2.getModalViewState();
                if (c33211q0M14048i == null) {
                    c28655q2.m87150e0(884806612);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(884806613);
                    C33211q0 c33211q0M41056b16 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function0.m105274p(c33211q0M41056b16, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function16;
                function6 = function17;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q2.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87157i(function3)) {
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C14068f(12);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        function9 = (Function1) objM87133R8;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C14068f(13);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C14068f(14);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function3;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66725n5 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    function12 = function11;
                    C2307m c2307m13 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m13, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM66725n5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i15 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d111);
                    C0209i c0209i16 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m115);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N115);
                    float f1110 = 4;
                    float f1111 = 8;
                    f13 = f1110 * f1111;
                    Modifier modifierM3398t115 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f1111, 5);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t115);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m116);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N116);
                    Modifier modifierM3398t116 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f1110, c2314t), 1 * f1111, 0.0f, 0.0f, 2 * f1111, 6);
                    C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y5 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C14294a(function9, 13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o5, strM92103Y5, modifierM3398t116, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                    c28655q = c28655q2;
                    interfaceC25312uM14052m = cVar.getTestTile();
                    if (interfaceC25312uM14052m == null) {
                        c28655q.m87150e0(-1726024158);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1726024157);
                        AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                        c28655q = c28655q;
                        AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                    }
                    String strM14054o5 = cVar.getTitle();
                    C38072d c38072d5 = C38072d.f163053a;
                    int i214 = C38072d.f163054b;
                    C2886a t18 = c38072d5.m121952e(c28655q, i214).getT2();
                    long brandWhite5 = c38072d5.m121949b(c28655q, i214).getBrandWhite();
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f1112 = f52575a;
                    Modifier modifierM3396r9 = AbstractC1099a.m3396r(modifierM3409f5, f1112, 0.0f, 2);
                    C36775k c36775k5 = new C36775k(5);
                    int i215 = C2886a.f11498d << 18;
                    C28655q c28655q7 = c28655q;
                    function13 = function9;
                    AbstractC30795n.m94707h(strM14054o5, modifierM3396r9, brandWhite5, 0L, null, null, null, 0L, null, c36775k5, 0L, 0, false, 0, 0, null, t18, null, c28655q7, 48, i215, 196088);
                    float f1113 = 6;
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f1113, c2314t));
                    AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1112, 0.0f, 2), c38072d5.m121949b(c28655q7, i214).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q7, i214).getB1(), null, c28655q7, 48, i215, 196088);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(28, c2314t));
                    AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1112, 0.0f, 2), c38072d5.m121949b(c28655q7, i214).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q7, i214).getFormLabel(), null, c28655q7, 48, i215, 196088);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3411h(f1111, c2314t));
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                    TextResource.C8691e c8691e5 = new TextResource.C8691e("");
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1112, 0.0f, 2);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q7.m87133R();
                    if (z14) {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                            function14 = function12;
                        }
                        function15 = function14;
                        c28676v2 = c28676v1;
                        AbstractC17795v0.m51127j(modifierM3396r10, textResourceM21278l5, c8691e5, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q7, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                        c28655q2 = c28655q7;
                        if (cVar.getIsSearching()) {
                            c28655q2.m87150e0(-1723332768);
                            m41084Y(c28655q2, 0);
                            c28655q2.m87173q(false);
                            function16 = function10;
                            function7 = function13;
                            function17 = function15;
                        } else {
                            c28655q2.m87150e0(-1723260910);
                            function7 = function13;
                            Function1 function116 = function10;
                            m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function116, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                            function16 = function116;
                            c28655q2 = c28655q2;
                            function17 = function15;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        C2307m c2307m14 = C2299e.f9105H;
                        C1100b c1100b9 = C1100b.f4583a;
                        Modifier modifierM3398t117 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b9.mo3400a(c2314t, c2307m14)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d5.m121949b(c28655q2, i214).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d5.m121949b(c28655q2, i214).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f1113 * f1111, 0.0f, 3 * f1111, 5);
                        InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m13, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3398t117);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d112);
                        AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m117);
                        if (c28655q2.f115903S) {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N117);
                        Modifier modifierM3398t118 = AbstractC1099a.m3398t(c1100b9.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f1112, 0.0f, 11);
                        InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m13, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t118);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d113);
                        AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N118);
                        C3927k c3927kM14044e9 = cVar.getButton();
                        cVar2 = cVar;
                        boolean zM87157i9 = c28655q2.m87157i(cVar2);
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i9 | z15;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            c28676v3 = c28676v2;
                            if (objM87133R4 == c28676v3) {
                            }
                            AbstractC3926j.m11931e(c3927kM14044e9, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            c33211q0M14048i = cVar2.getModalViewState();
                            if (c33211q0M14048i == null) {
                                c28655q2.m87150e0(884806612);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(884806613);
                                C33211q0 c33211q0M41056b17 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                                if (i24 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R5 = c28655q2.m87133R();
                                if (z17) {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C14294a(function17, 10);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                Function0.m105274p(c33211q0M41056b17, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            function8 = function16;
                            function6 = function17;
                        } else {
                            c28676v3 = c28676v2;
                        }
                        objM87133R4 = new C14408a(1, cVar2, function17);
                        c28655q2.m87172p0(objM87133R4);
                        AbstractC3926j.m11931e(c3927kM14044e9, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b18 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b18, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function14 = function12;
                    objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                    c28655q7.m87172p0(objM87133R3);
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r10, textResourceM21278l5, c8691e5, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q7, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q7;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function117 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function117, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function117;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m15 = C2299e.f9105H;
                    C1100b c1100b10 = C1100b.f4583a;
                    Modifier modifierM3398t119 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b10.mo3400a(c2314t, c2307m15)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d5.m121949b(c28655q2, i214).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d5.m121949b(c28655q2, i214).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f1113 * f1111, 0.0f, 3 * f1111, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m13, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM3398t119);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d114);
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m119);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N119);
                    Modifier modifierM3398t1110 = AbstractC1099a.m3398t(c1100b10.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f1112, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(c2307m13, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1110);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d115);
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m1110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N1110);
                    C3927k c3927kM14044e10 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i10 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i10 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e10, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b19 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b19, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e10, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b110 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b110, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C14068f(12);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function9 = (Function1) objM87133R8;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(13);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C14068f(14);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function3;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66725n6 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                function12 = function11;
                C2307m c2307m16 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(c2307m16, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM66725n6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i18 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d116);
                C0209i c0209i19 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1111);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1111);
                float f1114 = 4;
                float f1115 = 8;
                f13 = f1114 * f1115;
                Modifier modifierM3398t1111 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f1115, 5);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1111);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1112);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1112);
                Modifier modifierM3398t1112 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f1114, c2314t), 1 * f1115, 0.0f, 0.0f, 2 * f1115, 6);
                C27270o c27270o6 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM92103Y6 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o6, strM92103Y6, modifierM3398t1112, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                c28655q = c28655q2;
                interfaceC25312uM14052m = cVar.getTestTile();
                if (interfaceC25312uM14052m == null) {
                    c28655q.m87150e0(-1726024158);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1726024157);
                    AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                    c28655q = c28655q;
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                }
                String strM14054o6 = cVar.getTitle();
                C38072d c38072d6 = C38072d.f163053a;
                int i216 = C38072d.f163054b;
                C2886a t19 = c38072d6.m121952e(c28655q, i216).getT2();
                long brandWhite6 = c38072d6.m121949b(c28655q, i216).getBrandWhite();
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f1116 = f52575a;
                Modifier modifierM3396r11 = AbstractC1099a.m3396r(modifierM3409f6, f1116, 0.0f, 2);
                C36775k c36775k6 = new C36775k(5);
                int i217 = C2886a.f11498d << 18;
                C28655q c28655q8 = c28655q;
                function13 = function9;
                AbstractC30795n.m94707h(strM14054o6, modifierM3396r11, brandWhite6, 0L, null, null, null, 0L, null, c36775k6, 0L, 0, false, 0, 0, null, t19, null, c28655q8, 48, i217, 196088);
                float f1117 = 6;
                AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3411h(f1117, c2314t));
                AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1116, 0.0f, 2), c38072d6.m121949b(c28655q8, i216).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q8, i216).getB1(), null, c28655q8, 48, i217, 196088);
                AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3411h(28, c2314t));
                AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1116, 0.0f, 2), c38072d6.m121949b(c28655q8, i216).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q8, i216).getFormLabel(), null, c28655q8, 48, i217, 196088);
                AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3411h(f1115, c2314t));
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                TextResource.C8691e c8691e6 = new TextResource.C8691e("");
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f1116, 0.0f, 2);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q8.m87133R();
                if (z14) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        function14 = function12;
                    }
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r12, textResourceM21278l6, c8691e6, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q8, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q8;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function118 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function118, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function118;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m17 = C2299e.f9105H;
                    C1100b c1100b11 = C1100b.f4583a;
                    Modifier modifierM3398t1113 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b11.mo3400a(c2314t, c2307m17)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d6.m121949b(c28655q2, i216).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d6.m121949b(c28655q2, i216).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f1117 * f1115, 0.0f, 3 * f1115, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(c2307m16, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1113);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d117);
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1113);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1113);
                    Modifier modifierM3398t1114 = AbstractC1099a.m3398t(c1100b11.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f1116, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(c2307m16, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1114);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d118);
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1114);
                    C3927k c3927kM14044e11 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i11 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i11 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e11, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b111 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b111, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e11, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b112 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b112, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v1 = c28676v0;
                }
                function14 = function12;
                objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                c28655q8.m87172p0(objM87133R3);
                function15 = function14;
                c28676v2 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3396r12, textResourceM21278l6, c8691e6, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q8, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                c28655q2 = c28655q8;
                if (cVar.getIsSearching()) {
                    c28655q2.m87150e0(-1723332768);
                    m41084Y(c28655q2, 0);
                    c28655q2.m87173q(false);
                    function16 = function10;
                    function7 = function13;
                    function17 = function15;
                } else {
                    c28655q2.m87150e0(-1723260910);
                    function7 = function13;
                    Function1 function119 = function10;
                    m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function119, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                    function16 = function119;
                    c28655q2 = c28655q2;
                    function17 = function15;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                C2307m c2307m18 = C2299e.f9105H;
                C1100b c1100b12 = C1100b.f4583a;
                Modifier modifierM3398t1115 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b12.mo3400a(c2314t, c2307m18)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d6.m121949b(c28655q2, i216).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d6.m121949b(c28655q2, i216).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f1117 * f1115, 0.0f, 3 * f1115, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(c2307m16, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1115);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d119);
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1115);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1115);
                Modifier modifierM3398t1116 = AbstractC1099a.m3398t(c1100b12.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f1116, 0.0f, 11);
                InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(c2307m16, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1116);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC39127r0M66763d1110);
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m1116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N1116);
                C3927k c3927kM14044e12 = cVar.getButton();
                cVar2 = cVar;
                boolean zM87157i12 = c28655q2.m87157i(cVar2);
                if (i24 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i12 | z15;
                objM87133R4 = c28655q2.m87133R();
                if (z16) {
                    c28676v3 = c28676v2;
                    if (objM87133R4 == c28676v3) {
                    }
                    AbstractC3926j.m11931e(c3927kM14044e12, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b113 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b113, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v3 = c28676v2;
                }
                objM87133R4 = new C14408a(1, cVar2, function17);
                c28655q2.m87172p0(objM87133R4);
                AbstractC3926j.m11931e(c3927kM14044e12, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c33211q0M14048i = cVar2.getModalViewState();
                if (c33211q0M14048i == null) {
                    c28655q2.m87150e0(884806612);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(884806613);
                    C33211q0 c33211q0M41056b114 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function0.m105274p(c33211q0M41056b114, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function16;
                function6 = function17;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(function3)) {
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
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C14068f(12);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function9 = (Function1) objM87133R8;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C14068f(13);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C14068f(14);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function3;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66725n7 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                function12 = function11;
                C2307m c2307m19 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(c2307m19, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierM66725n7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i111 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC39127r0M66763d1111);
                C0209i c0209i112 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m1117);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N1117);
                float f1118 = 4;
                float f1119 = 8;
                f13 = f1118 * f1119;
                Modifier modifierM3398t1117 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f1119, 5);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1117);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m1118);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N1118);
                Modifier modifierM3398t1118 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f1118, c2314t), 1 * f1119, 0.0f, 0.0f, 2 * f1119, 6);
                C27270o c27270o7 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM92103Y7 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C14294a(function9, 13);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o7, strM92103Y7, modifierM3398t1118, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
                c28655q = c28655q2;
                interfaceC25312uM14052m = cVar.getTestTile();
                if (interfaceC25312uM14052m == null) {
                    c28655q.m87150e0(-1726024158);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1726024157);
                    AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                    c28655q = c28655q;
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                }
                String strM14054o7 = cVar.getTitle();
                C38072d c38072d7 = C38072d.f163053a;
                int i218 = C38072d.f163054b;
                C2886a t110 = c38072d7.m121952e(c28655q, i218).getT2();
                long brandWhite7 = c38072d7.m121949b(c28655q, i218).getBrandWhite();
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f11110 = f52575a;
                Modifier modifierM3396r13 = AbstractC1099a.m3396r(modifierM3409f7, f11110, 0.0f, 2);
                C36775k c36775k7 = new C36775k(5);
                int i219 = C2886a.f11498d << 18;
                C28655q c28655q9 = c28655q;
                function13 = function9;
                AbstractC30795n.m94707h(strM14054o7, modifierM3396r13, brandWhite7, 0L, null, null, null, 0L, null, c36775k7, 0L, 0, false, 0, 0, null, t110, null, c28655q9, 48, i219, 196088);
                float f11111 = 6;
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3411h(f11111, c2314t));
                AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11110, 0.0f, 2), c38072d7.m121949b(c28655q9, i218).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q9, i218).getB1(), null, c28655q9, 48, i219, 196088);
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3411h(28, c2314t));
                AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11110, 0.0f, 2), c38072d7.m121949b(c28655q9, i218).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q9, i218).getFormLabel(), null, c28655q9, 48, i219, 196088);
                AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3411h(f1119, c2314t));
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
                TextResource.C8691e c8691e7 = new TextResource.C8691e("");
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11110, 0.0f, 2);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q9.m87133R();
                if (z14) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        function14 = function12;
                    }
                    function15 = function14;
                    c28676v2 = c28676v1;
                    AbstractC17795v0.m51127j(modifierM3396r14, textResourceM21278l7, c8691e7, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q9, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                    c28655q2 = c28655q9;
                    if (cVar.getIsSearching()) {
                        c28655q2.m87150e0(-1723332768);
                        m41084Y(c28655q2, 0);
                        c28655q2.m87173q(false);
                        function16 = function10;
                        function7 = function13;
                        function17 = function15;
                    } else {
                        c28655q2.m87150e0(-1723260910);
                        function7 = function13;
                        Function1 function1110 = function10;
                        m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function1110, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                        function16 = function1110;
                        c28655q2 = c28655q2;
                        function17 = function15;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    C2307m c2307m110 = C2299e.f9105H;
                    C1100b c1100b13 = C1100b.f4583a;
                    Modifier modifierM3398t1119 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b13.mo3400a(c2314t, c2307m110)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d7.m121949b(c28655q2, i218).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d7.m121949b(c28655q2, i218).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f11111 * f1119, 0.0f, 3 * f1119, 5);
                    InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(c2307m19, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierM3398t1119);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC39127r0M66763d1112);
                    AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m1119);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N1119);
                    Modifier modifierM3398t11110 = AbstractC1099a.m3398t(c1100b13.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f11110, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d1113 = AbstractC22989q.m66763d(c2307m19, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11110);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC39127r0M66763d1113);
                    AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m11110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N11110);
                    C3927k c3927kM14044e13 = cVar.getButton();
                    cVar2 = cVar;
                    boolean zM87157i13 = c28655q2.m87157i(cVar2);
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i13 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v3 = c28676v2;
                        if (objM87133R4 == c28676v3) {
                        }
                        AbstractC3926j.m11931e(c3927kM14044e13, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c33211q0M14048i = cVar2.getModalViewState();
                        if (c33211q0M14048i == null) {
                            c28655q2.m87150e0(884806612);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(884806613);
                            C33211q0 c33211q0M41056b115 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                            if (i24 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R5 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C14294a(function17, 10);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            Function0.m105274p(c33211q0M41056b115, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        function8 = function16;
                        function6 = function17;
                    } else {
                        c28676v3 = c28676v2;
                    }
                    objM87133R4 = new C14408a(1, cVar2, function17);
                    c28655q2.m87172p0(objM87133R4);
                    AbstractC3926j.m11931e(c3927kM14044e13, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b116 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b116, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v1 = c28676v0;
                }
                function14 = function12;
                objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
                c28655q9.m87172p0(objM87133R3);
                function15 = function14;
                c28676v2 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3396r14, textResourceM21278l7, c8691e7, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q9, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                c28655q2 = c28655q9;
                if (cVar.getIsSearching()) {
                    c28655q2.m87150e0(-1723332768);
                    m41084Y(c28655q2, 0);
                    c28655q2.m87173q(false);
                    function16 = function10;
                    function7 = function13;
                    function17 = function15;
                } else {
                    c28655q2.m87150e0(-1723260910);
                    function7 = function13;
                    Function1 function1111 = function10;
                    m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function1111, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                    function16 = function1111;
                    c28655q2 = c28655q2;
                    function17 = function15;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                C2307m c2307m111 = C2299e.f9105H;
                C1100b c1100b14 = C1100b.f4583a;
                Modifier modifierM3398t11111 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b14.mo3400a(c2314t, c2307m111)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d7.m121949b(c28655q2, i218).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d7.m121949b(c28655q2, i218).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f11111 * f1119, 0.0f, 3 * f1119, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d1114 = AbstractC22989q.m66763d(c2307m19, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11111);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC39127r0M66763d1114);
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m11111);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N11111);
                Modifier modifierM3398t11112 = AbstractC1099a.m3398t(c1100b14.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f11110, 0.0f, 11);
                InterfaceC39127r0 interfaceC39127r0M66763d1115 = AbstractC22989q.m66763d(c2307m19, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11112);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC39127r0M66763d1115);
                AbstractC28683x.m87239G(c28655q2, c0209i112, interfaceC28653p1M87165m11112);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N11112);
                C3927k c3927kM14044e14 = cVar.getButton();
                cVar2 = cVar;
                boolean zM87157i14 = c28655q2.m87157i(cVar2);
                if (i24 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i14 | z15;
                objM87133R4 = c28655q2.m87133R();
                if (z16) {
                    c28676v3 = c28676v2;
                    if (objM87133R4 == c28676v3) {
                    }
                    AbstractC3926j.m11931e(c3927kM14044e14, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b117 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b117, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v3 = c28676v2;
                }
                objM87133R4 = new C14408a(1, cVar2, function17);
                c28655q2.m87172p0(objM87133R4);
                AbstractC3926j.m11931e(c3927kM14044e14, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c33211q0M14048i = cVar2.getModalViewState();
                if (c33211q0M14048i == null) {
                    c28655q2.m87150e0(884806612);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(884806613);
                    C33211q0 c33211q0M41056b118 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function0.m105274p(c33211q0M41056b118, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function16;
                function6 = function17;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
            }
        }
        i15 |= 3072;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C14068f(12);
                    c28655q2.m87172p0(objM87133R8);
                }
                function9 = (Function1) objM87133R8;
            } else {
                function9 = function4;
            }
            if (i16 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C14068f(13);
                    c28655q2.m87172p0(objM87133R7);
                }
                function10 = (Function1) objM87133R7;
            } else {
                function10 = function5;
            }
            if (i18 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C14068f(14);
                    c28655q2.m87172p0(objM87133R6);
                }
                function11 = (Function1) objM87133R6;
            } else {
                function11 = function3;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c2314t = C2314t.f9131w;
            Modifier modifierM66725n8 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            function12 = function11;
            C2307m c2307m112 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d1116 = AbstractC22989q.m66763d(c2307m112, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q2.m87165m();
            Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q2, modifierM66725n8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i114 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC39127r0M66763d1116);
            C0209i c0209i115 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11113);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i116 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11113);
            float f11112 = 4;
            float f11113 = 8;
            f13 = f11112 * f11113;
            Modifier modifierM3398t11113 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), 0.0f, f13, 0.0f, 16 * f11113, 5);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q2.m87165m();
            Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11113);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i114, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11114);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11114);
            Modifier modifierM3398t11114 = AbstractC1099a.m3398t(AbstractC1102d.m3419p(12 * f11112, c2314t), 1 * f11113, 0.0f, 0.0f, 2 * f11113, 6);
            C27270o c27270o8 = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM92103Y8 = AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C14294a(function9, 13);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C14294a(function9, 13);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC27242b1.m82092d(c27270o8, strM92103Y8, modifierM3398t11114, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 384, 8);
            c28655q = c28655q2;
            interfaceC25312uM14052m = cVar.getTestTile();
            if (interfaceC25312uM14052m == null) {
                c28655q.m87150e0(-1726024158);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1726024157);
                AbstractC25303l.m74291r(interfaceC25312uM14052m, AbstractC25448c.m74678B0(), new C13168a(15), null, c28655q, C25307p.f99300b << 3, 8);
                c28655q = c28655q;
                AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
            }
            String strM14054o8 = cVar.getTitle();
            C38072d c38072d8 = C38072d.f163053a;
            int i2110 = C38072d.f163054b;
            C2886a t111 = c38072d8.m121952e(c28655q, i2110).getT2();
            long brandWhite8 = c38072d8.m121949b(c28655q, i2110).getBrandWhite();
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            float f11114 = f52575a;
            Modifier modifierM3396r15 = AbstractC1099a.m3396r(modifierM3409f8, f11114, 0.0f, 2);
            C36775k c36775k8 = new C36775k(5);
            int i2111 = C2886a.f11498d << 18;
            C28655q c28655q10 = c28655q;
            function13 = function9;
            AbstractC30795n.m94707h(strM14054o8, modifierM3396r15, brandWhite8, 0L, null, null, null, 0L, null, c36775k8, 0L, 0, false, 0, 0, null, t111, null, c28655q10, 48, i2111, 196088);
            float f11115 = 6;
            AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f11115, c2314t));
            AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11114, 0.0f, 2), c38072d8.m121949b(c28655q10, i2110).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q10, i2110).getB1(), null, c28655q10, 48, i2111, 196088);
            AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(28, c2314t));
            AbstractC30795n.m94707h(cVar.getSearchHeaderDisplay(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11114, 0.0f, 2), c38072d8.m121949b(c28655q10, i2110).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q10, i2110).getFormLabel(), null, c28655q10, 48, i2111, 196088);
            AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f11113, c2314t));
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(m41069J(interfaceC28601c1));
            TextResource.C8691e c8691e8 = new TextResource.C8691e("");
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f11114, 0.0f, 2);
            i24 = i15 & 7168;
            if (i24 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R3 = c28655q10.m87133R();
            if (z14) {
                c28676v1 = c28676v0;
                if (objM87133R3 == c28676v1) {
                    function14 = function12;
                }
                function15 = function14;
                c28676v2 = c28676v1;
                AbstractC17795v0.m51127j(modifierM3396r16, textResourceM21278l8, c8691e8, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q10, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
                c28655q2 = c28655q10;
                if (cVar.getIsSearching()) {
                    c28655q2.m87150e0(-1723332768);
                    m41084Y(c28655q2, 0);
                    c28655q2.m87173q(false);
                    function16 = function10;
                    function7 = function13;
                    function17 = function15;
                } else {
                    c28655q2.m87150e0(-1723260910);
                    function7 = function13;
                    Function1 function1112 = function10;
                    m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function1112, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                    function16 = function1112;
                    c28655q2 = c28655q2;
                    function17 = function15;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                C2307m c2307m113 = C2299e.f9105H;
                C1100b c1100b15 = C1100b.f4583a;
                Modifier modifierM3398t11115 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b15.mo3400a(c2314t, c2307m113)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d8.m121949b(c28655q2, i2110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d8.m121949b(c28655q2, i2110).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f11115 * f11113, 0.0f, 3 * f11113, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d1117 = AbstractC22989q.m66763d(c2307m112, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11115);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC39127r0M66763d1117);
                AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11115);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11115);
                Modifier modifierM3398t11116 = AbstractC1099a.m3398t(c1100b15.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f11114, 0.0f, 11);
                InterfaceC39127r0 interfaceC39127r0M66763d1118 = AbstractC22989q.m66763d(c2307m112, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
                Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11116);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC39127r0M66763d1118);
                AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11116);
                C3927k c3927kM14044e15 = cVar.getButton();
                cVar2 = cVar;
                boolean zM87157i15 = c28655q2.m87157i(cVar2);
                if (i24 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i15 | z15;
                objM87133R4 = c28655q2.m87133R();
                if (z16) {
                    c28676v3 = c28676v2;
                    if (objM87133R4 == c28676v3) {
                    }
                    AbstractC3926j.m11931e(c3927kM14044e15, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c33211q0M14048i = cVar2.getModalViewState();
                    if (c33211q0M14048i == null) {
                        c28655q2.m87150e0(884806612);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(884806613);
                        C33211q0 c33211q0M41056b119 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                        if (i24 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R5 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C14294a(function17, 10);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        Function0.m105274p(c33211q0M41056b119, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    function8 = function16;
                    function6 = function17;
                } else {
                    c28676v3 = c28676v2;
                }
                objM87133R4 = new C14408a(1, cVar2, function17);
                c28655q2.m87172p0(objM87133R4);
                AbstractC3926j.m11931e(c3927kM14044e15, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c33211q0M14048i = cVar2.getModalViewState();
                if (c33211q0M14048i == null) {
                    c28655q2.m87150e0(884806612);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(884806613);
                    C33211q0 c33211q0M41056b1110 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function0.m105274p(c33211q0M41056b1110, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function16;
                function6 = function17;
            } else {
                c28676v1 = c28676v0;
            }
            function14 = function12;
            objM87133R3 = new C2609r(function14, interfaceC28601c1, 11);
            c28655q10.m87172p0(objM87133R3);
            function15 = function14;
            c28676v2 = c28676v1;
            AbstractC17795v0.m51127j(modifierM3396r16, textResourceM21278l8, c8691e8, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q10, (TextResource.$stable << 3) | 6 | (TextResource.C8691e.f25898b << 6), 0, 16376);
            c28655q2 = c28655q10;
            if (cVar.getIsSearching()) {
                c28655q2.m87150e0(-1723332768);
                m41084Y(c28655q2, 0);
                c28655q2.m87173q(false);
                function16 = function10;
                function7 = function13;
                function17 = function15;
            } else {
                c28655q2.m87150e0(-1723260910);
                function7 = function13;
                Function1 function1113 = function10;
                m41109x(cVar.getFormContent(), cVar.getSelectedAppointment(), function1113, m41069J(interfaceC28601c1), cVar.getTestType(), function15, function7, c28655q2, (i15 & 896) | ((i15 << 6) & 458752) | ((i15 << 15) & 3670016), 0);
                function16 = function1113;
                c28655q2 = c28655q2;
                function17 = function15;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            C2307m c2307m114 = C2299e.f9105H;
            C1100b c1100b16 = C1100b.f4583a;
            Modifier modifierM3398t11117 = AbstractC1099a.m3398t(AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, c1100b16.mo3400a(c2314t, c2307m114)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, c38072d8.m121949b(c28655q2, i2110).getBackgroundDarkStd()))), new C23465k(Float.valueOf(0.5f), new C17919x(c38072d8.m121949b(c28655q2, i2110).getBackgroundDarkStd()))}, 0.0f, 0.0f, 14), null, 0.0f, 6), 0.0f, f11115 * f11113, 0.0f, 3 * f11113, 5);
            InterfaceC39127r0 interfaceC39127r0M66763d1119 = AbstractC22989q.m66763d(c2307m112, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q2.m87165m();
            Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11117);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j2 = c0213j;
                c28655q2.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC39127r0M66763d1119);
            AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11117);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11117);
            Modifier modifierM3398t11118 = AbstractC1099a.m3398t(c1100b16.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f11114, 0.0f, 11);
            InterfaceC39127r0 interfaceC39127r0M66763d11110 = AbstractC22989q.m66763d(c2307m112, false);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t11118);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC39127r0M66763d11110);
            AbstractC28683x.m87239G(c28655q2, c0209i115, interfaceC28653p1M87165m11118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i116, modifierM118962N11118);
            C3927k c3927kM14044e16 = cVar.getButton();
            cVar2 = cVar;
            boolean zM87157i16 = c28655q2.m87157i(cVar2);
            if (i24 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i16 | z15;
            objM87133R4 = c28655q2.m87133R();
            if (z16) {
                c28676v3 = c28676v2;
                if (objM87133R4 == c28676v3) {
                }
                AbstractC3926j.m11931e(c3927kM14044e16, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c33211q0M14048i = cVar2.getModalViewState();
                if (c33211q0M14048i == null) {
                    c28655q2.m87150e0(884806612);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(884806613);
                    C33211q0 c33211q0M41056b1111 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                    if (i24 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C14294a(function17, 10);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function0.m105274p(c33211q0M41056b1111, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                function8 = function16;
                function6 = function17;
            } else {
                c28676v3 = c28676v2;
            }
            objM87133R4 = new C14408a(1, cVar2, function17);
            c28655q2.m87172p0(objM87133R4);
            AbstractC3926j.m11931e(c3927kM14044e16, (Function1) objM87133R4, c28655q2, C3927k.f16020r, 0);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c33211q0M14048i = cVar2.getModalViewState();
            if (c33211q0M14048i == null) {
                c28655q2.m87150e0(884806612);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(884806613);
                C33211q0 c33211q0M41056b1112 = C14411a.f52567a.m41056b(c33211q0M14048i, cVar2.getButtonDestination(), function7);
                if (i24 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R5 = c28655q2.m87133R();
                if (z17) {
                    objM87133R5 = new C14294a(function17, 10);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C14294a(function17, 10);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function0.m105274p(c33211q0M41056b1112, (InterfaceC4339a) objM87133R5, null, c28655q2, C33211q0.f138501k, 4);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            function8 = function16;
            function6 = function17;
        } else {
            cVar2 = cVar;
            c28655q2.m87138X();
            function6 = function3;
            function7 = function4;
            function8 = function5;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) cVar2, (Object) function7, (Object) function8, (Object) function6, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m41066G(AbstractC3165a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m41067H(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m41068I(AbstractC4487b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final String m41069J(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final void m41070K(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m41071L(Function1 function1) {
        function1.invoke(AbstractC3165a.a.f12384a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m41072M(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-682348856);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, f52575a, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m41073N(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            m41070K(interfaceC28601c1, "");
        } else if (event instanceof AbstractC17801x0.c) {
            AbstractC17801x0.c cVar = (AbstractC17801x0.c) event;
            m41070K(interfaceC28601c1, cVar.getNewText());
            function1.invoke(new AbstractC4487b.e(cVar.getNewText(), null, false, 6, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m41074O(AbstractC4489d.c cVar, Function1 function1, EnumC3919c buttonClickType) {
        AbstractC22676k.m65750j(buttonClickType, "buttonClickType");
        C14411a.f52567a.m41057d(buttonClickType, cVar.getSelectedAppointment(), cVar.getEpisodeId(), cVar.getBiomarkerTestId(), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m41075P(Function1 function1) {
        function1.invoke(AbstractC4487b.c.f18036a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m41076Q(AbstractC4489d.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m41065F(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x0206  */
    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x0229  */
    /* JADX WARN: Code duplicated, block: B:110:0x0235  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x0198  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX INFO: renamed from: R */
    public static final void m41077R(AbstractC4489d viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
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
        Function1 function12;
        int i24;
        boolean z13;
        Object objM87133R;
        Function1 function13;
        Function1 function14;
        boolean z14;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(611462392);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
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
                        if (i25 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C14068f(7);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C14068f(10);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C14068f(11);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                        i24 = i15 & 112;
                        if (i24 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C14294a(function10, 11);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                        if (viewState instanceof AbstractC4489d.b) {
                            c28655q.m87150e0(1120340088);
                            C22961h c22961h = AbstractC22977m.f90654e;
                            C2305k c2305k = C2299e.f9111N;
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
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
                            if (viewState instanceof AbstractC4489d.a) {
                                c28655q.m87150e0(1120762525);
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                                if (i24 == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z14 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C14294a(function10, 12);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC4489d.c) {
                                    throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                                }
                                c28655q.m87150e0(1121198385);
                                function13 = function10;
                                function5 = function11;
                                function14 = function12;
                                m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                                c28655q.m87173q(false);
                            }
                            function7 = function13;
                            function8 = function14;
                        }
                        function13 = function10;
                        function5 = function11;
                        function14 = function12;
                        function7 = function13;
                        function8 = function14;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function6;
                    }
                    function9 = function5;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C14068f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C14068f(10);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C14068f(11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    if (viewState instanceof AbstractC4489d.b) {
                        c28655q.m87150e0(1120340088);
                        C22961h c22961h2 = AbstractC22977m.f90654e;
                        C2305k c2305k2 = C2299e.f9111N;
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h2, c2305k2, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
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
                        if (viewState instanceof AbstractC4489d.a) {
                            c28655q.m87150e0(1120762525);
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                            if (i24 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14) {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC4489d.c) {
                                throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                            }
                            c28655q.m87150e0(1121198385);
                            function13 = function10;
                            function5 = function11;
                            function14 = function12;
                            m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function5 = function11;
                    function14 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function6;
                }
                function9 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C14068f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C14068f(10);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C14068f(11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    if (viewState instanceof AbstractC4489d.b) {
                        c28655q.m87150e0(1120340088);
                        C22961h c22961h3 = AbstractC22977m.f90654e;
                        C2305k c2305k3 = C2299e.f9111N;
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22961h3, c2305k3, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
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
                        if (viewState instanceof AbstractC4489d.a) {
                            c28655q.m87150e0(1120762525);
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                            if (i24 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14) {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC4489d.c) {
                                throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                            }
                            c28655q.m87150e0(1121198385);
                            function13 = function10;
                            function5 = function11;
                            function14 = function12;
                            m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function5 = function11;
                    function14 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function6;
                }
                function9 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C14068f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C14068f(10);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14068f(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                if (viewState instanceof AbstractC4489d.b) {
                    c28655q.m87150e0(1120340088);
                    C22961h c22961h4 = AbstractC22977m.f90654e;
                    C2305k c2305k4 = C2299e.f9111N;
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22961h4, c2305k4, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
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
                    if (viewState instanceof AbstractC4489d.a) {
                        c28655q.m87150e0(1120762525);
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC4489d.c) {
                            throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                        }
                        c28655q.m87150e0(1121198385);
                        function13 = function10;
                        function5 = function11;
                        function14 = function12;
                        m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function5 = function11;
                function14 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function6;
            }
            function9 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C14068f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C14068f(10);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C14068f(11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C14294a(function10, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                    if (viewState instanceof AbstractC4489d.b) {
                        c28655q.m87150e0(1120340088);
                        C22961h c22961h5 = AbstractC22977m.f90654e;
                        C2305k c2305k5 = C2299e.f9111N;
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22961h5, c2305k5, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
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
                        if (viewState instanceof AbstractC4489d.a) {
                            c28655q.m87150e0(1120762525);
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                            if (i24 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14) {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C14294a(function10, 12);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC4489d.c) {
                                throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                            }
                            c28655q.m87150e0(1121198385);
                            function13 = function10;
                            function5 = function11;
                            function14 = function12;
                            m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                            c28655q.m87173q(false);
                        }
                        function7 = function13;
                        function8 = function14;
                    }
                    function13 = function10;
                    function5 = function11;
                    function14 = function12;
                    function7 = function13;
                    function8 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function6;
                }
                function9 = function5;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C14068f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C14068f(10);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14068f(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                if (viewState instanceof AbstractC4489d.b) {
                    c28655q.m87150e0(1120340088);
                    C22961h c22961h6 = AbstractC22977m.f90654e;
                    C2305k c2305k6 = C2299e.f9111N;
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22961h6, c2305k6, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
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
                    if (viewState instanceof AbstractC4489d.a) {
                        c28655q.m87150e0(1120762525);
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC4489d.c) {
                            throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                        }
                        c28655q.m87150e0(1121198385);
                        function13 = function10;
                        function5 = function11;
                        function14 = function12;
                        m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function5 = function11;
                function14 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function6;
            }
            function9 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C14068f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C14068f(10);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C14068f(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C14294a(function10, 11);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                if (viewState instanceof AbstractC4489d.b) {
                    c28655q.m87150e0(1120340088);
                    C22961h c22961h7 = AbstractC22977m.f90654e;
                    C2305k c2305k7 = C2299e.f9111N;
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22961h7, c2305k7, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
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
                    if (viewState instanceof AbstractC4489d.a) {
                        c28655q.m87150e0(1120762525);
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C14294a(function10, 12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC4489d.c) {
                            throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                        }
                        c28655q.m87150e0(1121198385);
                        function13 = function10;
                        function5 = function11;
                        function14 = function12;
                        m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                        c28655q.m87173q(false);
                    }
                    function7 = function13;
                    function8 = function14;
                }
                function13 = function10;
                function5 = function11;
                function14 = function12;
                function7 = function13;
                function8 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function6;
            }
            function9 = function5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
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
            if (i25 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C14068f(7);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C14068f(10);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C14068f(11);
                    c28655q.m87172p0(objM87133R3);
                }
                function12 = (Function1) objM87133R3;
            } else {
                function12 = function6;
            }
            AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_form", c28655q, (i15 & 14) | 48);
            i24 = i15 & 112;
            if (i24 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C14294a(function10, 11);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C14294a(function10, 11);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            if (viewState instanceof AbstractC4489d.b) {
                c28655q.m87150e0(1120340088);
                C22961h c22961h8 = AbstractC22977m.f90654e;
                C2305k c2305k8 = C2299e.f9111N;
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22961h8, c2305k8, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
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
                if (viewState instanceof AbstractC4489d.a) {
                    c28655q.m87150e0(1120762525);
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, 2, null), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null);
                    if (i24 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C14294a(function10, 12);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C14294a(function10, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC4489d.c) {
                        throw AbstractC11895b.m32003v(-795145685, c28655q, false);
                    }
                    c28655q.m87150e0(1121198385);
                    function13 = function10;
                    function5 = function11;
                    function14 = function12;
                    m41065F((AbstractC4489d.c) viewState, function13, function5, function14, c28655q, i15 & 8190, 0);
                    c28655q.m87173q(false);
                }
                function7 = function13;
                function8 = function14;
            }
            function13 = function10;
            function5 = function11;
            function14 = function12;
            function7 = function13;
            function8 = function14;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function6;
        }
        function9 = function5;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function7, (Object) function9, (Object) function8, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m41078S(AbstractC3165a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m41079T(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m41080U(AbstractC4487b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m41081V(Function1 function1) {
        function1.invoke(AbstractC3165a.a.f12384a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m41082W(Function1 function1) {
        function1.invoke(AbstractC3165a.a.f12384a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m41083X(AbstractC4489d abstractC4489d, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m41077R(abstractC4489d, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final void m41084Y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1863297096);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(4, f13, c2314t, c28655q);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13 * f13, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(60, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m41085Z(int i13, Composer composer, int i14) {
        m41084Y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:104:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x015f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:114:0x01af  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:128:0x0203  */
    /* JADX WARN: Code duplicated, block: B:130:0x0220  */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x022d  */
    /* JADX WARN: Code duplicated, block: B:139:0x025a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0265  */
    /* JADX WARN: Code duplicated, block: B:142:0x026f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0293  */
    /* JADX WARN: Code duplicated, block: B:146:0x0298  */
    /* JADX WARN: Code duplicated, block: B:149:0x029d  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02da  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0133  */
    /* JADX WARN: Code duplicated, block: B:92:0x013d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x014a  */
    /* JADX INFO: renamed from: x */
    public static final void m41109x(C4486a c4486a, C11980a c11980a, Function1 function1, String str, String str2, Function1 onViewEvent, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        String str3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        Function1 function5;
        String str4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        String str5;
        float f13;
        C2314t c2314t;
        String str6;
        int i24;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        int i25;
        boolean z17;
        InterfaceC25312u headerInfoCallout;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        boolean z24;
        InterfaceC25312u schedulingDatePicker;
        boolean z25;
        boolean z26;
        Object objM87133R3;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        int i26;
        int i27;
        String searchQuery = str;
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-604065722);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c4486a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c11980a) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(searchQuery)) {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i27;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    str3 = str2;
                    if (c28655q.m87153g(str3)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(onViewEvent)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    i15 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C14068f(8);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C14068f(9);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (c4486a == null) {
                        c28655q.m87150e0(191482836);
                        c28655q.m87173q(false);
                        function6 = function6;
                        str6 = str5;
                    } else {
                        c28655q.m87150e0(191482837);
                        f13 = 8;
                        c2314t = C2314t.f9131w;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                        if (c4486a.getErrorCard() != null) {
                            c28655q.m87150e0(-1205247122);
                            if ((i15 & 896) == 256) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28 | ((i15 & 57344) == 16384);
                            objM87133R4 = c28655q.m87133R();
                            if (z29 || objM87133R4 == c28676v0) {
                                objM87133R4 = new a(function6, searchQuery, str5, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c4486a);
                            AbstractC25303l.m74291r(c4486a.getErrorCard(), AbstractC25448c.m74678B0(), new C13168a(16), null, c28655q, C25307p.f99300b << 3, 8);
                            c28655q.m87173q(false);
                            function6 = function6;
                            z24 = false;
                            str6 = str5;
                            searchQuery = str;
                        } else {
                            str6 = str5;
                            c28655q.m87150e0(-1204753137);
                            i24 = i15 & 7168;
                            if (i24 == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean zM87157i = z13 | z14 | c28655q.m87157i(c4486a);
                            if ((i15 & 57344) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87157i | z15;
                            objM87133R = c28655q.m87133R();
                            if (!z16 || objM87133R == c28676v0) {
                                i25 = i15;
                                z17 = false;
                                b bVar = new b(str, function6, c4486a, str6, null);
                                searchQuery = str;
                                c28655q.m87172p0(bVar);
                                objM87133R = bVar;
                            } else {
                                i25 = i15;
                                z17 = false;
                                searchQuery = str;
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, searchQuery);
                            headerInfoCallout = c4486a.getHeaderInfoCallout();
                            if (headerInfoCallout == null) {
                                c28655q.m87150e0(-1204292354);
                                c28655q.m87173q(z17);
                                z24 = z17;
                            } else {
                                c28655q.m87150e0(-1204292353);
                                z18 = z17;
                                C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
                                C13168a c13168a = new C13168a(17);
                                if ((i25 & 3670016) == 1048576) {
                                    z19 = true;
                                } else {
                                    z19 = z18;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z19 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C12122i(function4, 25);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                z24 = z18;
                                AbstractC25303l.m74291r(headerInfoCallout, c25307pM74678B0, c13168a, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 0);
                                AbstractC25012a.m73388u(2, f13, c2314t, c28655q, z24);
                            }
                            schedulingDatePicker = c4486a.getSchedulingDatePicker();
                            if (schedulingDatePicker == null) {
                                c28655q.m87150e0(-1203658869);
                                c28655q.m87173q(z24);
                            } else {
                                c28655q.m87150e0(-1203658868);
                                if (schedulingDatePicker instanceof C15731f) {
                                    c28655q.m87150e0(509077894);
                                    C15731f c15731fM44337b = C15731f.m44337b((C15731f) schedulingDatePicker, null, null, null, c11980a, 7, null);
                                    C25307p c25307pM74678B1 = AbstractC25448c.m74678B0();
                                    if ((i25 & 458752) == 131072) {
                                        z25 = true;
                                    } else {
                                        z25 = z24;
                                    }
                                    z26 = z25 | (i24 != 2048 ? z24 : true);
                                    objM87133R3 = c28655q.m87133R();
                                    if (z26 || objM87133R3 == c28676v0) {
                                        objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    AbstractC25303l.m74291r(c15731fM44337b, c25307pM74678B1, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                                    c28655q.m87173q(z24);
                                } else {
                                    c28655q.m87150e0(509461891);
                                    c28655q.m87173q(z24);
                                }
                                c28655q.m87173q(z24);
                            }
                            c28655q.m87173q(z24);
                        }
                        c28655q.m87173q(z24);
                    }
                    str4 = str6;
                    function5 = function6;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    str4 = str3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) c4486a, (Object) c11980a, function5, (Object) searchQuery, (Object) str4, onViewEvent, (Object) function4, i13, i14, 7);
                }
            }
            i15 |= 24576;
            str3 = str2;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C14068f(8);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C14068f(9);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (c4486a == null) {
                    c28655q.m87150e0(191482836);
                    c28655q.m87173q(false);
                    function6 = function6;
                    str6 = str5;
                } else {
                    c28655q.m87150e0(191482837);
                    f13 = 8;
                    c2314t = C2314t.f9131w;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                    if (c4486a.getErrorCard() != null) {
                        c28655q.m87150e0(-1205247122);
                        if ((i15 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28 | ((i15 & 57344) == 16384);
                        objM87133R4 = c28655q.m87133R();
                        if (z29) {
                            objM87133R4 = new a(function6, searchQuery, str5, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(function6, searchQuery, str5, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c4486a);
                        AbstractC25303l.m74291r(c4486a.getErrorCard(), AbstractC25448c.m74678B0(), new C13168a(16), null, c28655q, C25307p.f99300b << 3, 8);
                        c28655q.m87173q(false);
                        function6 = function6;
                        z24 = false;
                        str6 = str5;
                        searchQuery = str;
                    } else {
                        str6 = str5;
                        c28655q.m87150e0(-1204753137);
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM87157i2 = z13 | z14 | c28655q.m87157i(c4486a);
                        if ((i15 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i2 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            i25 = i15;
                            z17 = false;
                            b bVar2 = new b(str, function6, c4486a, str6, null);
                            searchQuery = str;
                            c28655q.m87172p0(bVar2);
                            objM87133R = bVar2;
                        } else {
                            i25 = i15;
                            z17 = false;
                            b bVar3 = new b(str, function6, c4486a, str6, null);
                            searchQuery = str;
                            c28655q.m87172p0(bVar3);
                            objM87133R = bVar3;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, searchQuery);
                        headerInfoCallout = c4486a.getHeaderInfoCallout();
                        if (headerInfoCallout == null) {
                            c28655q.m87150e0(-1204292354);
                            c28655q.m87173q(z17);
                            z24 = z17;
                        } else {
                            c28655q.m87150e0(-1204292353);
                            z18 = z17;
                            C25307p c25307pM74678B2 = AbstractC25448c.m74678B0();
                            C13168a c13168a2 = new C13168a(17);
                            if ((i25 & 3670016) == 1048576) {
                                z19 = true;
                            } else {
                                z19 = z18;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z19) {
                                objM87133R2 = new C12122i(function4, 25);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12122i(function4, 25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            z24 = z18;
                            AbstractC25303l.m74291r(headerInfoCallout, c25307pM74678B2, c13168a2, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 0);
                            AbstractC25012a.m73388u(2, f13, c2314t, c28655q, z24);
                        }
                        schedulingDatePicker = c4486a.getSchedulingDatePicker();
                        if (schedulingDatePicker == null) {
                            c28655q.m87150e0(-1203658869);
                            c28655q.m87173q(z24);
                        } else {
                            c28655q.m87150e0(-1203658868);
                            if (schedulingDatePicker instanceof C15731f) {
                                c28655q.m87150e0(509077894);
                                C15731f c15731fM44337b2 = C15731f.m44337b((C15731f) schedulingDatePicker, null, null, null, c11980a, 7, null);
                                C25307p c25307pM74678B3 = AbstractC25448c.m74678B0();
                                if ((i25 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = z24;
                                }
                                z26 = z25 | (i24 != 2048 ? z24 : true);
                                objM87133R3 = c28655q.m87133R();
                                if (z26) {
                                    objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(c15731fM44337b2, c25307pM74678B3, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                                c28655q.m87173q(z24);
                            } else {
                                c28655q.m87150e0(509461891);
                                c28655q.m87173q(z24);
                            }
                            c28655q.m87173q(z24);
                        }
                        c28655q.m87173q(z24);
                    }
                    c28655q.m87173q(z24);
                }
                str4 = str6;
                function5 = function6;
            } else {
                c28655q.m87138X();
                function5 = function3;
                str4 = str3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) c4486a, (Object) c11980a, function5, (Object) searchQuery, (Object) str4, onViewEvent, (Object) function4, i13, i14, 7);
            }
        }
        i15 |= 384;
        function3 = function1;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87153g(searchQuery)) {
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i27;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                str3 = str2;
                if (c28655q.m87153g(str3)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C14068f(8);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C14068f(9);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (c4486a == null) {
                    c28655q.m87150e0(191482836);
                    c28655q.m87173q(false);
                    function6 = function6;
                    str6 = str5;
                } else {
                    c28655q.m87150e0(191482837);
                    f13 = 8;
                    c2314t = C2314t.f9131w;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                    if (c4486a.getErrorCard() != null) {
                        c28655q.m87150e0(-1205247122);
                        if ((i15 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28 | ((i15 & 57344) == 16384);
                        objM87133R4 = c28655q.m87133R();
                        if (z29) {
                            objM87133R4 = new a(function6, searchQuery, str5, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(function6, searchQuery, str5, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c4486a);
                        AbstractC25303l.m74291r(c4486a.getErrorCard(), AbstractC25448c.m74678B0(), new C13168a(16), null, c28655q, C25307p.f99300b << 3, 8);
                        c28655q.m87173q(false);
                        function6 = function6;
                        z24 = false;
                        str6 = str5;
                        searchQuery = str;
                    } else {
                        str6 = str5;
                        c28655q.m87150e0(-1204753137);
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM87157i3 = z13 | z14 | c28655q.m87157i(c4486a);
                        if ((i15 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i3 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            i25 = i15;
                            z17 = false;
                            b bVar4 = new b(str, function6, c4486a, str6, null);
                            searchQuery = str;
                            c28655q.m87172p0(bVar4);
                            objM87133R = bVar4;
                        } else {
                            i25 = i15;
                            z17 = false;
                            b bVar5 = new b(str, function6, c4486a, str6, null);
                            searchQuery = str;
                            c28655q.m87172p0(bVar5);
                            objM87133R = bVar5;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, searchQuery);
                        headerInfoCallout = c4486a.getHeaderInfoCallout();
                        if (headerInfoCallout == null) {
                            c28655q.m87150e0(-1204292354);
                            c28655q.m87173q(z17);
                            z24 = z17;
                        } else {
                            c28655q.m87150e0(-1204292353);
                            z18 = z17;
                            C25307p c25307pM74678B4 = AbstractC25448c.m74678B0();
                            C13168a c13168a3 = new C13168a(17);
                            if ((i25 & 3670016) == 1048576) {
                                z19 = true;
                            } else {
                                z19 = z18;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z19) {
                                objM87133R2 = new C12122i(function4, 25);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12122i(function4, 25);
                                c28655q.m87172p0(objM87133R2);
                            }
                            z24 = z18;
                            AbstractC25303l.m74291r(headerInfoCallout, c25307pM74678B4, c13168a3, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 0);
                            AbstractC25012a.m73388u(2, f13, c2314t, c28655q, z24);
                        }
                        schedulingDatePicker = c4486a.getSchedulingDatePicker();
                        if (schedulingDatePicker == null) {
                            c28655q.m87150e0(-1203658869);
                            c28655q.m87173q(z24);
                        } else {
                            c28655q.m87150e0(-1203658868);
                            if (schedulingDatePicker instanceof C15731f) {
                                c28655q.m87150e0(509077894);
                                C15731f c15731fM44337b3 = C15731f.m44337b((C15731f) schedulingDatePicker, null, null, null, c11980a, 7, null);
                                C25307p c25307pM74678B5 = AbstractC25448c.m74678B0();
                                if ((i25 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = z24;
                                }
                                z26 = z25 | (i24 != 2048 ? z24 : true);
                                objM87133R3 = c28655q.m87133R();
                                if (z26) {
                                    objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC25303l.m74291r(c15731fM44337b3, c25307pM74678B5, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                                c28655q.m87173q(z24);
                            } else {
                                c28655q.m87150e0(509461891);
                                c28655q.m87173q(z24);
                            }
                            c28655q.m87173q(z24);
                        }
                        c28655q.m87173q(z24);
                    }
                    c28655q.m87173q(z24);
                }
                str4 = str6;
                function5 = function6;
            } else {
                c28655q.m87138X();
                function5 = function3;
                str4 = str3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) c4486a, (Object) c11980a, function5, (Object) searchQuery, (Object) str4, onViewEvent, (Object) function4, i13, i14, 7);
            }
        }
        i15 |= 24576;
        str3 = str2;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function4)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C14068f(8);
                    c28655q.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C14068f(9);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            }
            if (c4486a == null) {
                c28655q.m87150e0(191482836);
                c28655q.m87173q(false);
                function6 = function6;
                str6 = str5;
            } else {
                c28655q.m87150e0(191482837);
                f13 = 8;
                c2314t = C2314t.f9131w;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f13, c2314t));
                if (c4486a.getErrorCard() != null) {
                    c28655q.m87150e0(-1205247122);
                    if ((i15 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z27 | z28 | ((i15 & 57344) == 16384);
                    objM87133R4 = c28655q.m87133R();
                    if (z29) {
                        objM87133R4 = new a(function6, searchQuery, str5, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(function6, searchQuery, str5, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c4486a);
                    AbstractC25303l.m74291r(c4486a.getErrorCard(), AbstractC25448c.m74678B0(), new C13168a(16), null, c28655q, C25307p.f99300b << 3, 8);
                    c28655q.m87173q(false);
                    function6 = function6;
                    z24 = false;
                    str6 = str5;
                    searchQuery = str;
                } else {
                    str6 = str5;
                    c28655q.m87150e0(-1204753137);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i4 = z13 | z14 | c28655q.m87157i(c4486a);
                    if ((i15 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i4 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        i25 = i15;
                        z17 = false;
                        b bVar6 = new b(str, function6, c4486a, str6, null);
                        searchQuery = str;
                        c28655q.m87172p0(bVar6);
                        objM87133R = bVar6;
                    } else {
                        i25 = i15;
                        z17 = false;
                        b bVar7 = new b(str, function6, c4486a, str6, null);
                        searchQuery = str;
                        c28655q.m87172p0(bVar7);
                        objM87133R = bVar7;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, searchQuery);
                    headerInfoCallout = c4486a.getHeaderInfoCallout();
                    if (headerInfoCallout == null) {
                        c28655q.m87150e0(-1204292354);
                        c28655q.m87173q(z17);
                        z24 = z17;
                    } else {
                        c28655q.m87150e0(-1204292353);
                        z18 = z17;
                        C25307p c25307pM74678B6 = AbstractC25448c.m74678B0();
                        C13168a c13168a4 = new C13168a(17);
                        if ((i25 & 3670016) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z19) {
                            objM87133R2 = new C12122i(function4, 25);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12122i(function4, 25);
                            c28655q.m87172p0(objM87133R2);
                        }
                        z24 = z18;
                        AbstractC25303l.m74291r(headerInfoCallout, c25307pM74678B6, c13168a4, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 0);
                        AbstractC25012a.m73388u(2, f13, c2314t, c28655q, z24);
                    }
                    schedulingDatePicker = c4486a.getSchedulingDatePicker();
                    if (schedulingDatePicker == null) {
                        c28655q.m87150e0(-1203658869);
                        c28655q.m87173q(z24);
                    } else {
                        c28655q.m87150e0(-1203658868);
                        if (schedulingDatePicker instanceof C15731f) {
                            c28655q.m87150e0(509077894);
                            C15731f c15731fM44337b4 = C15731f.m44337b((C15731f) schedulingDatePicker, null, null, null, c11980a, 7, null);
                            C25307p c25307pM74678B7 = AbstractC25448c.m74678B0();
                            if ((i25 & 458752) == 131072) {
                                z25 = true;
                            } else {
                                z25 = z24;
                            }
                            z26 = z25 | (i24 != 2048 ? z24 : true);
                            objM87133R3 = c28655q.m87133R();
                            if (z26) {
                                objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C0176c(onViewEvent, searchQuery, 1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC25303l.m74291r(c15731fM44337b4, c25307pM74678B7, null, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 4);
                            c28655q.m87173q(z24);
                        } else {
                            c28655q.m87150e0(509461891);
                            c28655q.m87173q(z24);
                        }
                        c28655q.m87173q(z24);
                    }
                    c28655q.m87173q(z24);
                }
                c28655q.m87173q(z24);
            }
            str4 = str6;
            function5 = function6;
        } else {
            c28655q.m87138X();
            function5 = function3;
            str4 = str3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) c4486a, (Object) c11980a, function5, (Object) searchQuery, (Object) str4, onViewEvent, (Object) function4, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m41110y(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m41111z(AbstractC3165a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
