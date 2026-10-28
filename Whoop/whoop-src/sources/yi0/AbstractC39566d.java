package yi0;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import as1.C1949j;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.archv2.model.template.BackBehavior;
import com.whoop.archv2.model.template.BackgroundModel;
import com.whoop.archv2.model.template.FlowStepTransition;
import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import d30.C11520c;
import io.sentry.config.AbstractC20301a;
import java.util.Map;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22948d2;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23716t3;
import q83.InterfaceC30057d;
import r20.C30867e;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ri0.InterfaceC31443b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import si0.AbstractC32536b;
import ti0.AbstractC33846k;
import ti0.C33836a;
import ti0.C33839d;
import ti0.EnumC33847l;
import wb3.AbstractC37056f;
import x30.C37900j1;
import xi0.AbstractC38319a;
import xi0.AbstractC38320b;
import y00.AbstractC38963t7;
import yf1.C39516e;

/* JADX INFO: renamed from: yi0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\u0018\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010!\u001a\u0004\u0018\u00010 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lti0/d;", "contentState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "action", "m", "(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isForward", "isRtl", "Lc0/l0;", "B", "(ZZ)Lc0/l0;", "", "width", "E", "(ZIZ)I", "F", "previousStackSize", "currentStackSize", "G", "(II)Z", "", "", "Lcom/whoop/analytics/AnalyticEventModel;", "events", "I", "(Ljava/util/Map;II)Lcom/whoop/analytics/AnalyticEventModel;", "H", "(Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;", "currentAction", "Lcom/whoop/navigation/models/GenericInteraction;", "currentOnStartInteraction", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39566d {

    /* JADX INFO: renamed from: yi0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.template.flow.FlowTemplateScreenContentKt$FlowTemplateScreenContent$1$1", m100430f = "FlowTemplateScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Map<String, AnalyticEventModel> f170218E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f170219F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f170220G;

        /* JADX INFO: renamed from: w */
        int f170221w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f170222x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f170223y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f170224z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC28593a1 interfaceC28593a1, int i13, Map<String, AnalyticEventModel> map, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170222x = str;
            this.f170223y = interfaceC28593a1;
            this.f170224z = i13;
            this.f170218E = map;
            this.f170219F = interfaceC28670t2;
            this.f170220G = interfaceC28670t3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170222x, this.f170223y, this.f170224z, this.f170218E, this.f170219F, this.f170220G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170221w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = this.f170222x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (str == null) {
                return c23454a0;
            }
            int iM87024x = ((C28621h1) this.f170223y).m87024x();
            ((C28621h1) this.f170223y).m87025y(this.f170224z);
            AnalyticEventModel analyticEventModelM126338I = AbstractC39566d.m126338I(this.f170218E, iM87024x, this.f170224z);
            if (analyticEventModelM126338I != null) {
                AbstractC39566d.m126352n(this.f170219F).invoke(new InterfaceC31443b.v(analyticEventModelM126338I));
            }
            GenericInteraction genericInteractionM126353o = AbstractC39566d.m126353o(this.f170220G);
            if (genericInteractionM126353o != null) {
                AbstractC39566d.m126352n(this.f170219F).invoke(new InterfaceC31443b.j(genericInteractionM126353o, C39564b.f170215a));
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: yi0.d$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"yi0/d$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f170225a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28670t2 f170226b;

        public b(Map map, InterfaceC28670t2 interfaceC28670t2) {
            this.f170225a = map;
            this.f170226b = interfaceC28670t2;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            AnalyticEventModel analyticEventModelM126337H = AbstractC39566d.m126337H(this.f170225a);
            if (analyticEventModelM126337H != null) {
                AbstractC39566d.m126352n(this.f170226b).invoke(new InterfaceC31443b.g(analyticEventModelM126337H));
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static final C3756l0 m126331B(boolean z4, boolean z13) {
        return AbstractC1089a.m3345c(AbstractC3788w0.m11586n(1, new C30867e(2, z4, z13)).m11562a(AbstractC3788w0.m11577e(null, 3)), AbstractC3788w0.m11590r(new C30867e(3, z4, z13)).m11563a(AbstractC3788w0.m11578f(null, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final int m126332C(boolean z4, boolean z13, int i13) {
        return m126334E(z4, i13, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final int m126333D(boolean z4, boolean z13, int i13) {
        return m126335F(z4, i13, z13);
    }

    /* JADX INFO: renamed from: E */
    public static final int m126334E(boolean z4, int i13, boolean z13) {
        if (!z4) {
            i13 = -i13;
        }
        return z13 ? -i13 : i13;
    }

    /* JADX INFO: renamed from: F */
    public static final int m126335F(boolean z4, int i13, boolean z13) {
        if (z4) {
            i13 = -i13;
        }
        return z13 ? -i13 : i13;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m126336G(int i13, int i14) {
        return i13 == -1 || i14 >= i13;
    }

    /* JADX INFO: renamed from: H */
    public static final AnalyticEventModel m126337H(Map<String, AnalyticEventModel> map) {
        if (map != null) {
            return map.get("step_dismissed");
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static final AnalyticEventModel m126338I(Map<String, AnalyticEventModel> map, int i13, int i14) {
        if ((i13 == -1 || i14 > i13) && map != null) {
            return map.get("step_entered");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:101:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:106:0x0309  */
    /* JADX WARN: Code duplicated, block: B:113:0x0327  */
    /* JADX WARN: Code duplicated, block: B:116:0x0337  */
    /* JADX WARN: Code duplicated, block: B:117:0x034d  */
    /* JADX WARN: Code duplicated, block: B:120:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0373  */
    /* JADX WARN: Code duplicated, block: B:126:0x038e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0396  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x0410  */
    /* JADX WARN: Code duplicated, block: B:146:0x045d  */
    /* JADX WARN: Code duplicated, block: B:147:0x046b  */
    /* JADX WARN: Code duplicated, block: B:149:0x049c  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:168:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:90:0x0275  */
    /* JADX WARN: Code duplicated, block: B:96:0x028f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX INFO: renamed from: m */
    public static final void m126351m(final C33839d contentState, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        String str;
        Object obj;
        Object obj2;
        EnumC33847l enumC33847lM101547a;
        C0209i c0209i;
        C0209i c0209i2;
        int i15;
        C0209i c0209i3;
        boolean zM87155h;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        final int i16;
        boolean z4;
        boolean z13;
        C2314t c2314t;
        C28655q c28655q2;
        ?? r10;
        int iHashCode;
        C0209i c0209i4;
        C0209i c0209i5;
        Modifier modifierM124374d;
        Modifier modifierMo3471e;
        C2307m c2307m;
        int iHashCode2;
        boolean z14;
        boolean z15;
        boolean zM87155h2;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        float f13;
        C2307m c2307m2;
        C0209i c0209i6;
        int i17;
        boolean z16;
        C28655q c28655q3;
        ProgressButtonModel progressButtonModelM107016h;
        int iHashCode3;
        boolean z17;
        boolean z18;
        Object objM87133R5;
        boolean z19;
        C33836a c33836aM107009a;
        int i18;
        BackgroundModel backgroundModelM107010b;
        String url;
        String str2;
        boolean z24;
        boolean z25;
        C28655q c28655q4;
        TemplateBackgroundTheme theme;
        Function1 action = function1;
        AbstractC22676k.m65750j(contentState, "contentState");
        AbstractC22676k.m65750j(action, "action");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(1622323358);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q5.m87157i(contentState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q5.m87157i(action) ? 32 : 16;
        }
        if (c28655q5.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String strM107011c = contentState.getActiveStepKey();
            int iM107017i = contentState.getStackSize();
            Map<String, AnalyticEventModel> mapM107012d = contentState.m107012d();
            GenericInteraction genericInteractionM107015g = contentState.getOnStartInteraction();
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(action, c28655q5);
            GenericInteraction.Companion companion = GenericInteraction.INSTANCE;
            InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(genericInteractionM107015g, c28655q5);
            Object objM87133R6 = c28655q5.m87133R();
            Object obj3 = C28635l.f115821a;
            if (objM87133R6 == obj3) {
                objM87133R6 = AbstractC31061c.m95646v(-1, c28655q5);
            }
            C28621h1 c28621h1 = (C28621h1) ((InterfaceC28593a1) objM87133R6);
            boolean zM126336G = m126336G(c28621h1.m87024x(), iM107017i);
            boolean z26 = c28655q5.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
            boolean zM87153g = c28655q5.m87153g(strM107011c) | c28655q5.m87149e(iM107017i) | c28655q5.m87157i(mapM107012d) | c28655q5.m87153g(interfaceC28601c1M87238F) | c28655q5.m87153g(interfaceC28601c1M87238F2);
            Object objM87133R7 = c28655q5.m87133R();
            if (zM87153g || objM87133R7 == obj3) {
                objM87133R7 = new a(strM107011c, c28621h1, iM107017i, mapM107012d, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, null);
                str = strM107011c;
                obj = mapM107012d;
                obj2 = interfaceC28601c1M87238F;
                c28655q5.m87172p0(objM87133R7);
            } else {
                str = strM107011c;
                obj = mapM107012d;
                obj2 = interfaceC28601c1M87238F;
            }
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R7, str);
            boolean zM87157i3 = c28655q5.m87157i(obj) | c28655q5.m87153g(obj2);
            Object objM87133R8 = c28655q5.m87133R();
            if (zM87157i3 || objM87133R8 == obj3) {
                objM87133R8 = new C37900j1(10, obj, obj2);
                c28655q5.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87251e(str, (Function1) objM87133R8, c28655q5);
            String strM107014f = contentState.getCurrentStepListKey();
            boolean z27 = contentState.getBackBehavior() == BackBehavior.POP && strM107014f != null;
            int i19 = i14 & 112;
            boolean zM87153g2 = (i19 == 32) | c28655q5.m87153g(strM107014f);
            Object objM87133R9 = c28655q5.m87133R();
            if (zM87153g2 || objM87133R9 == obj3) {
                objM87133R9 = new C4048j0(action, strM107014f, 17);
                c28655q5.m87172p0(objM87133R9);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R9, z27, c28655q5, 0, 0);
            BackgroundModel backgroundModelM107010b2 = contentState.getActiveStepBackground();
            if (backgroundModelM107010b2 == null || (theme = backgroundModelM107010b2.getTheme()) == null || (enumC33847lM101547a = AbstractC32536b.m101547a(theme)) == null) {
                enumC33847lM101547a = EnumC33847l.DEFAULT;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM107049a = AbstractC33846k.m107049a(c2314t2, enumC33847lM101547a, c28655q5, 6);
            boolean z28 = contentState.getStepTransition() == FlowStepTransition.INSTANT;
            Modifier modifierMo3471e2 = AbstractC1102d.m3407d(1.0f, c2314t2).mo3471e(modifierM107049a);
            C2307m c2307m3 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m3, false);
            C2307m c2307m4 = c2307m3;
            int iHashCode4 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC39127r0M66763d);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i8, interfaceC28653p1M87165m);
            C0209i c0209i9 = C0217k.f732j;
            C0209i c0209i10 = c0209i7;
            if (c28655q5.f115903S) {
                c0209i = c0209i8;
            } else {
                c0209i = c0209i8;
                if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                c0209i2 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i2, modifierM118962N);
                i15 = 8;
                if (z28) {
                    c28655q5.m87150e0(-678215275);
                    backgroundModelM107010b = contentState.getActiveStepBackground();
                    if (backgroundModelM107010b != null) {
                        url = backgroundModelM107010b.getUrl();
                    } else {
                        url = null;
                    }
                    str2 = url;
                    if (str2 == null) {
                        c28655q5.m87150e0(-678215276);
                        z25 = false;
                        c28655q5.m87173q(false);
                        c28655q4 = c28655q5;
                        c0209i3 = c0209i9;
                        z24 = zM126336G;
                    } else {
                        c28655q5.m87150e0(-678215275);
                        C28655q c28655q6 = c28655q5;
                        z24 = zM126336G;
                        c0209i3 = c0209i9;
                        AbstractC38319a.m122792f(C1100b.f4583a, new AbstractC22403o.c(str2, 0, 0, 0, 14, null), new C39174f(AbstractC38319a.m122798l()), 0.0f, null, c28655q6, 390 | (AbstractC22403o.c.f87642f << 3), 12);
                        z25 = false;
                        c28655q6.m87173q(false);
                        c28655q4 = c28655q6;
                    }
                    c28655q4.m87173q(z25);
                    r10 = z25;
                    z4 = z26;
                    z13 = z24;
                    c2314t = c2314t2;
                    c28655q2 = c28655q4;
                } else {
                    i19 = i19;
                    c0209i2 = c0209i2;
                    c2307m4 = c2307m4;
                    c0209i10 = c0209i10;
                    c0209i = c0209i;
                    c0209i3 = c0209i9;
                    c28655q5.m87150e0(-678038389);
                    BackgroundModel backgroundModelM107010b3 = contentState.getActiveStepBackground();
                    zM87155h = c28655q5.m87155h(zM126336G) | c28655q5.m87155h(z26);
                    objM87133R = c28655q5.m87133R();
                    if (zM87155h || objM87133R == obj3) {
                        objM87133R = new C30867e(4, zM126336G, z26);
                        c28655q5.m87172p0(objM87133R);
                    }
                    Function1 function2 = (Function1) objM87133R;
                    zM87157i = c28655q5.m87157i(contentState);
                    objM87133R2 = c28655q5.m87133R();
                    if (!zM87157i || objM87133R2 == obj3) {
                        i16 = 0;
                        objM87133R2 = new Function1() { // from class: yi0.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i16) {
                                    case 0:
                                        return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                    default:
                                        return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                                }
                            }
                        };
                        c28655q5.m87172p0(objM87133R2);
                    } else {
                        i16 = 0;
                    }
                    z4 = z26;
                    z13 = zM126336G;
                    boolean z29 = i16;
                    c2314t = c2314t2;
                    AbstractC1089a.m3344b(backgroundModelM107010b3, null, function2, null, "FlowBackgroundTransition", (Function1) objM87133R2, AbstractC37817c.m121344e(-205812290, c28655q5, new C11520c(i15)), c28655q5, 1597440, 10);
                    C28655q c28655q7 = c28655q5;
                    c28655q7.m87173q(z29);
                    r10 = z29;
                    c28655q2 = c28655q7;
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, r10);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    c0209i4 = c0209i3;
                } else {
                    c0209i4 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                c0209i5 = c0209i2;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                c28655q2.m87150e0(-252520485);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                if (contentState.getProgressButton() != null) {
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    modifierMo3471e = modifierM124374d.mo3471e(AbstractC37056f.m118997u(c2314t, new C22948d2(C22949e.m66712e(c28655q2).f90558e, r10)));
                } else {
                    modifierMo3471e = modifierM124374d.mo3471e(c2314t);
                }
                c28655q2.m87173q(r10);
                c2307m = c2307m4;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, r10);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                if (z28) {
                    c28655q2.m87150e0(-1222953596);
                    c33836aM107009a = contentState.getActiveStep();
                    if (c33836aM107009a == null) {
                        c28655q2.m87150e0(-1222953597);
                        c28655q2.m87173q(r10);
                        i18 = i19;
                    } else {
                        c28655q2.m87150e0(-2117660098);
                        i18 = i19;
                        AbstractC38320b.m122800b(c33836aM107009a, function1, c28655q2, i18);
                        c28655q2.m87173q(r10);
                    }
                    c28655q2.m87173q(r10);
                    c0209i6 = c0209i5;
                    i17 = i18;
                    z16 = r10;
                    f13 = 1.0f;
                    c2307m2 = c2307m;
                    c28655q3 = c28655q2;
                } else {
                    int i24 = i19;
                    c28655q2.m87150e0(-1222846677);
                    C33836a c33836aM107009a2 = contentState.getActiveStep();
                    z14 = z13;
                    z15 = z4;
                    zM87155h2 = c28655q2.m87155h(z14) | c28655q2.m87155h(z15);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87155h2 || objM87133R3 == obj3) {
                        objM87133R3 = new C30867e(5, z14, z15);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function3 = (Function1) objM87133R3;
                    zM87157i2 = c28655q2.m87157i(contentState);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R4 == obj3) {
                        final int i25 = 1;
                        objM87133R4 = new Function1() { // from class: yi0.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i25) {
                                    case 0:
                                        return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                    default:
                                        return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    C28655q c28655q8 = c28655q2;
                    f13 = 1.0f;
                    c2307m2 = c2307m;
                    c0209i6 = c0209i5;
                    i17 = i24;
                    AbstractC1089a.m3344b(c33836aM107009a2, null, function3, null, "FlowStepTransition", (Function1) objM87133R4, AbstractC37817c.m121344e(100394845, c28655q2, new C1949j(function1, 11)), c28655q8, 1597440, 10);
                    C28655q c28655q9 = c28655q8;
                    z16 = 0;
                    c28655q9.m87173q(false);
                    c28655q3 = c28655q9;
                }
                c28655q3.m87173q(true);
                progressButtonModelM107016h = contentState.getProgressButton();
                if (progressButtonModelM107016h == null) {
                    c28655q3.m87150e0(763301260);
                    c28655q3.m87173q(z16);
                    action = function1;
                    z19 = true;
                } else {
                    c28655q3.m87150e0(763301261);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3409f(f13, c2314t)));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, z16);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i10, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC28653p1M87165m4);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N4);
                    C3927k c3927kM69429g = AbstractC23716t3.m69429g(progressButtonModelM107016h);
                    boolean zM87157i4 = c28655q3.m87157i(progressButtonModelM107016h);
                    if (i17 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i4 | z17;
                    objM87133R5 = c28655q3.m87133R();
                    if (!z18 || objM87133R5 == obj3) {
                        action = function1;
                        objM87133R5 = new C37900j1(11, progressButtonModelM107016h, action);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        action = function1;
                    }
                    AbstractC3926j.m11931e(c3927kM69429g, (Function1) objM87133R5, c28655q3, C3927k.f16020r, 0);
                    z19 = true;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z19);
                c28655q3.m87173q(z19);
                c28655q = c28655q3;
            }
            AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i9);
            c0209i2 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i2, modifierM118962N);
            i15 = 8;
            if (z28) {
                c28655q5.m87150e0(-678215275);
                backgroundModelM107010b = contentState.getActiveStepBackground();
                if (backgroundModelM107010b != null) {
                    url = backgroundModelM107010b.getUrl();
                } else {
                    url = null;
                }
                str2 = url;
                if (str2 == null) {
                    c28655q5.m87150e0(-678215276);
                    z25 = false;
                    c28655q5.m87173q(false);
                    c28655q4 = c28655q5;
                    c0209i3 = c0209i9;
                    z24 = zM126336G;
                } else {
                    c28655q5.m87150e0(-678215275);
                    C28655q c28655q10 = c28655q5;
                    z24 = zM126336G;
                    c0209i3 = c0209i9;
                    AbstractC38319a.m122792f(C1100b.f4583a, new AbstractC22403o.c(str2, 0, 0, 0, 14, null), new C39174f(AbstractC38319a.m122798l()), 0.0f, null, c28655q10, 390 | (AbstractC22403o.c.f87642f << 3), 12);
                    z25 = false;
                    c28655q10.m87173q(false);
                    c28655q4 = c28655q10;
                }
                c28655q4.m87173q(z25);
                r10 = z25;
                z4 = z26;
                z13 = z24;
                c2314t = c2314t2;
                c28655q2 = c28655q4;
            } else {
                i19 = i19;
                c0209i2 = c0209i2;
                c2307m4 = c2307m4;
                c0209i10 = c0209i10;
                c0209i = c0209i;
                c0209i3 = c0209i9;
                c28655q5.m87150e0(-678038389);
                BackgroundModel backgroundModelM107010b4 = contentState.getActiveStepBackground();
                zM87155h = c28655q5.m87155h(zM126336G) | c28655q5.m87155h(z26);
                objM87133R = c28655q5.m87133R();
                if (zM87155h) {
                    objM87133R = new C30867e(4, zM126336G, z26);
                    c28655q5.m87172p0(objM87133R);
                } else {
                    objM87133R = new C30867e(4, zM126336G, z26);
                    c28655q5.m87172p0(objM87133R);
                }
                Function1 function4 = (Function1) objM87133R;
                zM87157i = c28655q5.m87157i(contentState);
                objM87133R2 = c28655q5.m87133R();
                if (zM87157i) {
                    i16 = 0;
                    objM87133R2 = new Function1() { // from class: yi0.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i16) {
                                case 0:
                                    return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                default:
                                    return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                            }
                        }
                    };
                    c28655q5.m87172p0(objM87133R2);
                } else {
                    i16 = 0;
                    objM87133R2 = new Function1() { // from class: yi0.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i16) {
                                case 0:
                                    return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                default:
                                    return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                            }
                        }
                    };
                    c28655q5.m87172p0(objM87133R2);
                }
                z4 = z26;
                z13 = zM126336G;
                boolean z210 = i16;
                c2314t = c2314t2;
                AbstractC1089a.m3344b(backgroundModelM107010b4, null, function4, null, "FlowBackgroundTransition", (Function1) objM87133R2, AbstractC37817c.m121344e(-205812290, c28655q5, new C11520c(i15)), c28655q5, 1597440, 10);
                C28655q c28655q11 = c28655q5;
                c28655q11.m87173q(z210);
                r10 = z210;
                c28655q2 = c28655q11;
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, r10);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                c0209i4 = c0209i3;
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            } else {
                c0209i4 = c0209i3;
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            c0209i5 = c0209i2;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
            c28655q2.m87150e0(-252520485);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            if (contentState.getProgressButton() != null) {
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                modifierMo3471e = modifierM124374d.mo3471e(AbstractC37056f.m118997u(c2314t, new C22948d2(C22949e.m66712e(c28655q2).f90558e, r10)));
            } else {
                modifierMo3471e = modifierM124374d.mo3471e(c2314t);
            }
            c28655q2.m87173q(r10);
            c2307m = c2307m4;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, r10);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N6);
            if (z28) {
                c28655q2.m87150e0(-1222953596);
                c33836aM107009a = contentState.getActiveStep();
                if (c33836aM107009a == null) {
                    c28655q2.m87150e0(-1222953597);
                    c28655q2.m87173q(r10);
                    i18 = i19;
                } else {
                    c28655q2.m87150e0(-2117660098);
                    i18 = i19;
                    AbstractC38320b.m122800b(c33836aM107009a, function1, c28655q2, i18);
                    c28655q2.m87173q(r10);
                }
                c28655q2.m87173q(r10);
                c0209i6 = c0209i5;
                i17 = i18;
                z16 = r10;
                f13 = 1.0f;
                c2307m2 = c2307m;
                c28655q3 = c28655q2;
            } else {
                int i26 = i19;
                c28655q2.m87150e0(-1222846677);
                C33836a c33836aM107009a3 = contentState.getActiveStep();
                z14 = z13;
                z15 = z4;
                zM87155h2 = c28655q2.m87155h(z14) | c28655q2.m87155h(z15);
                objM87133R3 = c28655q2.m87133R();
                if (zM87155h2) {
                    objM87133R3 = new C30867e(5, z14, z15);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C30867e(5, z14, z15);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function5 = (Function1) objM87133R3;
                zM87157i2 = c28655q2.m87157i(contentState);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2) {
                    final int i27 = 1;
                    objM87133R4 = new Function1() { // from class: yi0.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i27) {
                                case 0:
                                    return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                default:
                                    return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i28 = 1;
                    objM87133R4 = new Function1() { // from class: yi0.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i28) {
                                case 0:
                                    return AbstractC39566d.m126357s(contentState, (BackgroundModel) obj4);
                                default:
                                    return AbstractC39566d.m126360v(contentState, (C33836a) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                C28655q c28655q12 = c28655q2;
                f13 = 1.0f;
                c2307m2 = c2307m;
                c0209i6 = c0209i5;
                i17 = i26;
                AbstractC1089a.m3344b(c33836aM107009a3, null, function5, null, "FlowStepTransition", (Function1) objM87133R4, AbstractC37817c.m121344e(100394845, c28655q2, new C1949j(function1, 11)), c28655q12, 1597440, 10);
                C28655q c28655q13 = c28655q12;
                z16 = 0;
                c28655q13.m87173q(false);
                c28655q3 = c28655q13;
            }
            c28655q3.m87173q(true);
            progressButtonModelM107016h = contentState.getProgressButton();
            if (progressButtonModelM107016h == null) {
                c28655q3.m87150e0(763301260);
                c28655q3.m87173q(z16);
                action = function1;
                z19 = true;
            } else {
                c28655q3.m87150e0(763301261);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC22953f.m66722k(AbstractC1102d.m3409f(f13, c2314t)));
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, z16);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3394p2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC28653p1M87165m7);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N7);
                C3927k c3927kM69429g2 = AbstractC23716t3.m69429g(progressButtonModelM107016h);
                boolean zM87157i5 = c28655q3.m87157i(progressButtonModelM107016h);
                if (i17 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i5 | z17;
                objM87133R5 = c28655q3.m87133R();
                if (z18) {
                    action = function1;
                    objM87133R5 = new C37900j1(11, progressButtonModelM107016h, action);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    action = function1;
                    objM87133R5 = new C37900j1(11, progressButtonModelM107016h, action);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC3926j.m11931e(c3927kM69429g2, (Function1) objM87133R5, c28655q3, C3927k.f16020r, 0);
                z19 = true;
                c28655q3.m87173q(true);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(z19);
            c28655q3.m87173q(z19);
            c28655q = c28655q3;
        } else {
            C28655q c28655q14 = c28655q5;
            c28655q14.m87138X();
            c28655q = c28655q14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(contentState, action, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Function1 m126352n(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final GenericInteraction m126353o(InterfaceC28670t2 interfaceC28670t2) {
        return (GenericInteraction) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28620h0 m126354p(Map map, InterfaceC28670t2 interfaceC28670t2, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new b(map, interfaceC28670t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m126355q(Function1 function1, String str) {
        AbstractC22676k.m65747g(str);
        function1.invoke(new InterfaceC31443b.p(new StatePopAction(str)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C3756l0 m126356r(boolean z4, boolean z13, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return m126331B(z4, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Object m126357s(C33839d c33839d, BackgroundModel backgroundModel) {
        return c33839d.getActiveStepKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m126358t(InterfaceC23001u interfaceC23001u, InterfaceC3764o AnimatedContent, BackgroundModel backgroundModel, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        String url = backgroundModel != null ? backgroundModel.getUrl() : null;
        C28655q c28655q = (C28655q) composer;
        if (url == null) {
            c28655q.m87150e0(1859420154);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1859420155);
            AbstractC38319a.m122792f(interfaceC23001u, new AbstractC22403o.c(url, 0, 0, 0, 14, null), new C39174f(AbstractC38319a.m122798l()), 0.0f, null, c28655q, (AbstractC22403o.c.f87642f << 3) | 384, 12);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C3756l0 m126359u(boolean z4, boolean z13, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return m126331B(z4, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Object m126360v(C33839d c33839d, C33836a c33836a) {
        return c33839d.getActiveStepKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m126361w(Function1 function1, InterfaceC3764o AnimatedContent, C33836a c33836a, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        C28655q c28655q = (C28655q) composer;
        if (c33836a == null) {
            c28655q.m87150e0(1565629990);
        } else {
            c28655q.m87150e0(1990166843);
            AbstractC38320b.m122800b(c33836a, function1, c28655q, (i13 >> 3) & 14);
        }
        c28655q.m87173q(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m126362x(ProgressButtonModel progressButtonModel, Function1 function1, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        GenericInteraction interaction = progressButtonModel.getInteraction();
        if (interaction != null) {
            function1.invoke(new InterfaceC31443b.j(interaction, C39563a.f170214a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m126363y(C33839d c33839d, Function1 function1, int i13, Composer composer, int i14) {
        m126351m(c33839d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
