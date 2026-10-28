package vo1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1911e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f11.C14003c;
import f11.C14005e;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import np1.C27033k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ro1.AbstractC31635g;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.AbstractC32803a0;
import so1.AbstractC32807c0;
import so1.C32823k0;
import so1.C32841y;
import uf0.C34904e;
import um0.C35076b;
import uv0.AbstractC35283c;
import v71.C35766g;
import ve0.C35926d;
import wb3.AbstractC37056f;
import wo1.AbstractC37474w;
import x81.C38072d;
import xn1.AbstractC38480c;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: renamed from: vo1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aq\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lso1/c0;", "viewState", "", "analyticsSource", "Lkotlin/Function1;", "Lso1/a0;", "Ll83/a0;", "onViewEvent", "Lro1/g;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "Lvo1/z;", "manualSelectedCyclesId", "m", "(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;Landroidx/compose/runtime/Composer;II)V", "Lso1/c0$f;", "selectedCyclesId", "onSelectedCyclesIdChange", "v", "(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedSegmentId", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36245t {

    /* JADX INFO: renamed from: vo1.t$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciSymptomsScreenKt$MciSymptomsScreen$4$1", m100430f = "MciSymptomsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155252w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155253x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155253x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f155253x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155252w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f155253x.invoke(AbstractC32803a0.g.f136565a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.t$b */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciSymptomsScreenKt$MciSymptomsScreen$5$1", m100430f = "MciSymptomsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155254w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f155255x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f155256y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f155257z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155255x = str;
            this.f155256y = str2;
            this.f155257z = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f155255x, this.f155256y, this.f155257z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155254w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = this.f155255x;
            String strM126876c = str != null ? C39673b.INSTANCE.m126876c(str) : null;
            if (AbstractC22676k.m65745e(this.f155256y, "possible_symptoms_today")) {
                this.f155257z.invoke(new AbstractC39672a.k0(strM126876c));
            }
            this.f155257z.invoke(new AbstractC39672a.n0(this.f155256y, strM126876c));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.t$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f155258w = new c();

        /* JADX INFO: renamed from: a */
        public final void m115599a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m115599a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo1.t$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f155259w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vo1.t$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155261x;

        public e(Function1 function1, List list) {
            this.f155260w = function1;
            this.f155261x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m115601a(int i13) {
            return this.f155260w.invoke(this.f155261x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m115601a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vo1.t$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155262w;

        public f(List list) {
            this.f155262w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m115602a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f155262w.get(i13);
            c28655q.m87150e0(436982053);
            boolean z4 = interfaceC25312u instanceof C32841y;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(437019004);
                AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
                AbstractC37474w.m120154b((C32841y) interfaceC25312u, c28655q, 0);
                c28655q.m87173q(false);
            } else if (interfaceC25312u instanceof C14005e) {
                c28655q.m87150e0(437292827);
                C14003c c14003c = new C14003c();
                C14005e c14005eM39876b = C14005e.m39876b((C14005e) interfaceC25312u, null, false, false, null, null, false, false, 0.0f, 12.0f, false, null, null, 3839, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = c.f155258w;
                    c28655q.m87172p0(objM87133R);
                }
                c14003c.Compose(c14005eM39876b, (Function1) objM87133R, c28655q, C14005e.f49972m | 48 | (C14003c.f49967a << 6));
                float f13 = 4;
                AbstractC31061c.m95650z(f13, f13, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(437696354);
                AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
                float f14 = 4;
                AbstractC31061c.m95650z(f14, f14, c2314t, c28655q, false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m115602a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m115571A(String str, AbstractC32807c0.f fVar, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM102995b = (!AbstractC22676k.m65745e(str, "CURRENT_CYCLE") && AbstractC22676k.m65745e(str, "LAST_THREE_CYCLES")) ? fVar.getSymptomsScreen().m102995b() : fVar.getSymptomsScreen().m102994a();
        ((C26053f) LazyColumn).m77529r(listM102995b.size(), null, new e(d.f155259w, listM102995b), new C37816b(new f(listM102995b), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m115572B(AbstractC32807c0.f fVar, String str, Function1 function1, EnumC36251z enumC36251z, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m115594v(fVar, str, function1, enumC36251z, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x0189  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:150:0x0211  */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x024d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0250  */
    /* JADX WARN: Code duplicated, block: B:158:0x0254  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257  */
    /* JADX WARN: Code duplicated, block: B:162:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0263  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0338  */
    /* JADX WARN: Code duplicated, block: B:179:0x0347  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX INFO: renamed from: m */
    public static final void m115585m(AbstractC32807c0 viewState, String str, Function1 function1, Function1 function2, Function1 function3, EnumC36251z enumC36251z, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        Function1 function5;
        int i19;
        int i24;
        Function1 function6;
        int i25;
        int i26;
        int iOrdinal;
        int i27;
        boolean z4;
        EnumC36251z enumC36251z2;
        String str3;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        String str4;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        EnumC36251z enumC36251z3;
        int i28;
        Function1 function12;
        EnumC36251z enumC36251z4;
        Function1 function13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        Object objM87133R2;
        AbstractC32807c0.f fVar;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        C32823k0 c32823k0M102934i;
        String strM81080a;
        List<C27033k> listM102997d;
        C27033k c27033k;
        InterfaceC28601c1 interfaceC28601c1;
        String strM115590r;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R4;
        boolean zM87153g;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1016303630);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function1;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function5 = function2;
                        if (c28655q.m87157i(function5)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function6 = function3;
                            if (c28655q.m87157i(function6)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (enumC36251z == null) {
                                iOrdinal = -1;
                            } else {
                                iOrdinal = enumC36251z.ordinal();
                            }
                            if (c28655q.m87149e(iOrdinal)) {
                                i27 = 131072;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        if ((74899 & i15) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            if (i29 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R8 = c28655q.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    objM87133R8 = new C35926d(29);
                                    c28655q.m87172p0(objM87133R8);
                                }
                                function4 = (Function1) objM87133R8;
                            }
                            function10 = function4;
                            if (i18 != 0) {
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C36244s(0);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function11 = (Function1) objM87133R7;
                            } else {
                                function11 = function5;
                            }
                            if (i24 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C36244s(1);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function6 = (Function1) objM87133R6;
                            }
                            if (i26 != 0) {
                                enumC36251z3 = null;
                            } else {
                                enumC36251z3 = enumC36251z;
                            }
                            i28 = i15 & 14;
                            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                            if (viewState instanceof AbstractC32807c0.f) {
                                c28655q.m87150e0(1477565726);
                                Boolean bool = Boolean.TRUE;
                                if ((i15 & 896) == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z16 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new a(function10, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool);
                                fVar = (AbstractC32807c0.f) viewState;
                                boolean zM87153g2 = c28655q.m87153g(fVar.getSymptomsScreen());
                                if ((458752 & i15) == 131072) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z17 | zM87153g2;
                                objM87133R3 = c28655q.m87133R();
                                if (z18 || objM87133R3 == c28676v0) {
                                    if (enumC36251z3 != null || (strM81080a = enumC36251z3.name()) == null) {
                                        c32823k0M102934i = fVar.getSymptomsScreen();
                                        if (c32823k0M102934i != null || (listM102997d = c32823k0M102934i.m102997d()) == null || (c27033k = (C27033k) AbstractC25265s.m74100H0(listM102997d)) == null) {
                                            strM81080a = null;
                                        } else {
                                            strM81080a = c27033k.getId();
                                        }
                                    }
                                    objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                                if (enumC36251z3 != null || (strM115590r = enumC36251z3.name()) == null) {
                                    strM115590r = m115590r(interfaceC28601c1);
                                }
                                boolean zM87153g3 = c28655q.m87153g(strM115590r);
                                if ((i15 & 112) == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z26 = z19 | zM87153g3;
                                if ((i15 & 57344) == 16384) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z26 | z24;
                                objM87133R4 = c28655q.m87133R();
                                if (z25 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new b(strM115590r, str4, function6, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                                String strM115590r2 = m115590r(interfaceC28601c1);
                                zM87153g = c28655q.m87153g(interfaceC28601c1);
                                objM87133R5 = c28655q.m87133R();
                                if (zM87153g || objM87133R5 == c28676v0) {
                                    objM87133R5 = new C29802c(23, interfaceC28601c1);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                EnumC36251z enumC36251z5 = enumC36251z3;
                                m115594v(fVar, strM115590r2, (Function1) objM87133R5, enumC36251z5, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                                enumC36251z4 = enumC36251z5;
                                function12 = function11;
                                c28655q.m87173q(false);
                                function13 = function10;
                            } else {
                                function12 = function11;
                                enumC36251z4 = enumC36251z3;
                                if (viewState instanceof AbstractC32807c0.a) {
                                    c28655q.m87150e0(1478966027);
                                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                    TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                    if ((i15 & 896) == 256) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (i28 == 4) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = z13 | z14;
                                    objM87133R = c28655q.m87133R();
                                    if (z15 || objM87133R == c28676v0) {
                                        objM87133R = new C36242q(function10, viewState, 1);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    int i34 = AbstractC33208p0.b.f138467h;
                                    int i35 = TextResource.$stable;
                                    function13 = function10;
                                    AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i34 | (i35 << 3) | (i35 << 9), 0, 4068);
                                    c28655q = c28655q;
                                    c28655q.m87173q(false);
                                } else {
                                    function13 = function10;
                                    c28655q.m87150e0(1479463453);
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
                            function8 = function12;
                            enumC36251z2 = enumC36251z4;
                            str3 = str4;
                            function9 = function6;
                            function7 = function13;
                        } else {
                            c28655q.m87138X();
                            enumC36251z2 = enumC36251z;
                            str3 = str2;
                            function7 = function4;
                            function8 = function5;
                            function9 = function6;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                        }
                    }
                    i15 |= 24576;
                    function6 = function3;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (enumC36251z == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36251z.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i27 = 131072;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i29 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35926d(29);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function4 = (Function1) objM87133R8;
                        }
                        function10 = function4;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C36244s(0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function11 = (Function1) objM87133R7;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C36244s(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function6 = (Function1) objM87133R6;
                        }
                        if (i26 != 0) {
                            enumC36251z3 = null;
                        } else {
                            enumC36251z3 = enumC36251z;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC32807c0.f) {
                            c28655q.m87150e0(1477565726);
                            Boolean bool2 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool2);
                            fVar = (AbstractC32807c0.f) viewState;
                            boolean zM87153g4 = c28655q.m87153g(fVar.getSymptomsScreen());
                            if ((458752 & i15) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | zM87153g4;
                            objM87133R3 = c28655q.m87133R();
                            if (z18) {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                            if (enumC36251z3 != null) {
                                strM115590r = m115590r(interfaceC28601c1);
                            } else {
                                strM115590r = m115590r(interfaceC28601c1);
                            }
                            boolean zM87153g5 = c28655q.m87153g(strM115590r);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z27 = z19 | zM87153g5;
                            if ((i15 & 57344) == 16384) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z27 | z24;
                            objM87133R4 = c28655q.m87133R();
                            if (z25) {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                            String strM115590r3 = m115590r(interfaceC28601c1);
                            zM87153g = c28655q.m87153g(interfaceC28601c1);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            EnumC36251z enumC36251z6 = enumC36251z3;
                            m115594v(fVar, strM115590r3, (Function1) objM87133R5, enumC36251z6, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                            enumC36251z4 = enumC36251z6;
                            function12 = function11;
                            c28655q.m87173q(false);
                            function13 = function10;
                        } else {
                            function12 = function11;
                            enumC36251z4 = enumC36251z3;
                            if (viewState instanceof AbstractC32807c0.a) {
                                c28655q.m87150e0(1478966027);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i28 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z13 | z14;
                                objM87133R = c28655q.m87133R();
                                if (z15) {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i36 = AbstractC33208p0.b.f138467h;
                                int i37 = TextResource.$stable;
                                function13 = function10;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i36 | (i37 << 3) | (i37 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function13 = function10;
                                c28655q.m87150e0(1479463453);
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
                        function8 = function12;
                        enumC36251z2 = enumC36251z4;
                        str3 = str4;
                        function9 = function6;
                        function7 = function13;
                    } else {
                        c28655q.m87138X();
                        enumC36251z2 = enumC36251z;
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                    }
                }
                i15 |= 3072;
                function5 = function2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (enumC36251z == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36251z.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i27 = 131072;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i29 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35926d(29);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function4 = (Function1) objM87133R8;
                        }
                        function10 = function4;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C36244s(0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function11 = (Function1) objM87133R7;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C36244s(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function6 = (Function1) objM87133R6;
                        }
                        if (i26 != 0) {
                            enumC36251z3 = null;
                        } else {
                            enumC36251z3 = enumC36251z;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC32807c0.f) {
                            c28655q.m87150e0(1477565726);
                            Boolean bool3 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool3);
                            fVar = (AbstractC32807c0.f) viewState;
                            boolean zM87153g6 = c28655q.m87153g(fVar.getSymptomsScreen());
                            if ((458752 & i15) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | zM87153g6;
                            objM87133R3 = c28655q.m87133R();
                            if (z18) {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                            if (enumC36251z3 != null) {
                                strM115590r = m115590r(interfaceC28601c1);
                            } else {
                                strM115590r = m115590r(interfaceC28601c1);
                            }
                            boolean zM87153g7 = c28655q.m87153g(strM115590r);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z28 = z19 | zM87153g7;
                            if ((i15 & 57344) == 16384) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z28 | z24;
                            objM87133R4 = c28655q.m87133R();
                            if (z25) {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                            String strM115590r4 = m115590r(interfaceC28601c1);
                            zM87153g = c28655q.m87153g(interfaceC28601c1);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            EnumC36251z enumC36251z7 = enumC36251z3;
                            m115594v(fVar, strM115590r4, (Function1) objM87133R5, enumC36251z7, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                            enumC36251z4 = enumC36251z7;
                            function12 = function11;
                            c28655q.m87173q(false);
                            function13 = function10;
                        } else {
                            function12 = function11;
                            enumC36251z4 = enumC36251z3;
                            if (viewState instanceof AbstractC32807c0.a) {
                                c28655q.m87150e0(1478966027);
                                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i28 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z13 | z14;
                                objM87133R = c28655q.m87133R();
                                if (z15) {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i38 = AbstractC33208p0.b.f138467h;
                                int i39 = TextResource.$stable;
                                function13 = function10;
                                AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i38 | (i39 << 3) | (i39 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function13 = function10;
                                c28655q.m87150e0(1479463453);
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
                        function8 = function12;
                        enumC36251z2 = enumC36251z4;
                        str3 = str4;
                        function9 = function6;
                        function7 = function13;
                    } else {
                        c28655q.m87138X();
                        enumC36251z2 = enumC36251z;
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool4 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool4);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g8 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g8;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g9 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z29 = z19 | zM87153g9;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z29 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r5 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z8 = enumC36251z3;
                        m115594v(fVar, strM115590r5, (Function1) objM87133R5, enumC36251z8, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z8;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i310 = AbstractC33208p0.b.f138467h;
                            int i311 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i310 | (i311 << 3) | (i311 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
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
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 384;
            function4 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (enumC36251z == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36251z.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i27 = 131072;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i29 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35926d(29);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function4 = (Function1) objM87133R8;
                        }
                        function10 = function4;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C36244s(0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function11 = (Function1) objM87133R7;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C36244s(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function6 = (Function1) objM87133R6;
                        }
                        if (i26 != 0) {
                            enumC36251z3 = null;
                        } else {
                            enumC36251z3 = enumC36251z;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC32807c0.f) {
                            c28655q.m87150e0(1477565726);
                            Boolean bool5 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool5);
                            fVar = (AbstractC32807c0.f) viewState;
                            boolean zM87153g10 = c28655q.m87153g(fVar.getSymptomsScreen());
                            if ((458752 & i15) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | zM87153g10;
                            objM87133R3 = c28655q.m87133R();
                            if (z18) {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                            if (enumC36251z3 != null) {
                                strM115590r = m115590r(interfaceC28601c1);
                            } else {
                                strM115590r = m115590r(interfaceC28601c1);
                            }
                            boolean zM87153g11 = c28655q.m87153g(strM115590r);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z210 = z19 | zM87153g11;
                            if ((i15 & 57344) == 16384) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z210 | z24;
                            objM87133R4 = c28655q.m87133R();
                            if (z25) {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                            String strM115590r6 = m115590r(interfaceC28601c1);
                            zM87153g = c28655q.m87153g(interfaceC28601c1);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            EnumC36251z enumC36251z9 = enumC36251z3;
                            m115594v(fVar, strM115590r6, (Function1) objM87133R5, enumC36251z9, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                            enumC36251z4 = enumC36251z9;
                            function12 = function11;
                            c28655q.m87173q(false);
                            function13 = function10;
                        } else {
                            function12 = function11;
                            enumC36251z4 = enumC36251z3;
                            if (viewState instanceof AbstractC32807c0.a) {
                                c28655q.m87150e0(1478966027);
                                AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i28 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z13 | z14;
                                objM87133R = c28655q.m87133R();
                                if (z15) {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i312 = AbstractC33208p0.b.f138467h;
                                int i313 = TextResource.$stable;
                                function13 = function10;
                                AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i312 | (i313 << 3) | (i313 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function13 = function10;
                                c28655q.m87150e0(1479463453);
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
                        function8 = function12;
                        enumC36251z2 = enumC36251z4;
                        str3 = str4;
                        function9 = function6;
                        function7 = function13;
                    } else {
                        c28655q.m87138X();
                        enumC36251z2 = enumC36251z;
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool6 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool6);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g12 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g12;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g13 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z211 = z19 | zM87153g13;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z211 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r7 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z10 = enumC36251z3;
                        m115594v(fVar, strM115590r7, (Function1) objM87133R5, enumC36251z10, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z10;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i314 = AbstractC33208p0.b.f138467h;
                            int i315 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i314 | (i315 << 3) | (i315 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
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
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool7 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool7);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g14 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g14;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g15 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z212 = z19 | zM87153g15;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z212 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r8 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z11 = enumC36251z3;
                        m115594v(fVar, strM115590r8, (Function1) objM87133R5, enumC36251z11, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z11;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i316 = AbstractC33208p0.b.f138467h;
                            int i317 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i316 | (i317 << 3) | (i317 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
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
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 24576;
            function6 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC36251z == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36251z.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 131072;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35926d(29);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                }
                function10 = function4;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C36244s(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function11 = (Function1) objM87133R7;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36244s(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                }
                if (i26 != 0) {
                    enumC36251z3 = null;
                } else {
                    enumC36251z3 = enumC36251z;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                if (viewState instanceof AbstractC32807c0.f) {
                    c28655q.m87150e0(1477565726);
                    Boolean bool8 = Boolean.TRUE;
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool8);
                    fVar = (AbstractC32807c0.f) viewState;
                    boolean zM87153g16 = c28655q.m87153g(fVar.getSymptomsScreen());
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87153g16;
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (enumC36251z3 != null) {
                        strM115590r = m115590r(interfaceC28601c1);
                    } else {
                        strM115590r = m115590r(interfaceC28601c1);
                    }
                    boolean zM87153g17 = c28655q.m87153g(strM115590r);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z213 = z19 | zM87153g17;
                    if ((i15 & 57344) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z213 | z24;
                    objM87133R4 = c28655q.m87133R();
                    if (z25) {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                    String strM115590r9 = m115590r(interfaceC28601c1);
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    EnumC36251z enumC36251z12 = enumC36251z3;
                    m115594v(fVar, strM115590r9, (Function1) objM87133R5, enumC36251z12, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                    enumC36251z4 = enumC36251z12;
                    function12 = function11;
                    c28655q.m87173q(false);
                    function13 = function10;
                } else {
                    function12 = function11;
                    enumC36251z4 = enumC36251z3;
                    if (viewState instanceof AbstractC32807c0.a) {
                        c28655q.m87150e0(1478966027);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i28 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i318 = AbstractC33208p0.b.f138467h;
                        int i319 = TextResource.$stable;
                        function13 = function10;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i318 | (i319 << 3) | (i319 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function10;
                        c28655q.m87150e0(1479463453);
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
                function8 = function12;
                enumC36251z2 = enumC36251z4;
                str3 = str4;
                function9 = function6;
                function7 = function13;
            } else {
                c28655q.m87138X();
                enumC36251z2 = enumC36251z;
                str3 = str2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (enumC36251z == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36251z.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i27 = 131072;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i29 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C35926d(29);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function4 = (Function1) objM87133R8;
                        }
                        function10 = function4;
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C36244s(0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function11 = (Function1) objM87133R7;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C36244s(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function6 = (Function1) objM87133R6;
                        }
                        if (i26 != 0) {
                            enumC36251z3 = null;
                        } else {
                            enumC36251z3 = enumC36251z;
                        }
                        i28 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                        if (viewState instanceof AbstractC32807c0.f) {
                            c28655q.m87150e0(1477565726);
                            Boolean bool9 = Boolean.TRUE;
                            if ((i15 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z16) {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new a(function10, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool9);
                            fVar = (AbstractC32807c0.f) viewState;
                            boolean zM87153g18 = c28655q.m87153g(fVar.getSymptomsScreen());
                            if ((458752 & i15) == 131072) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | zM87153g18;
                            objM87133R3 = c28655q.m87133R();
                            if (z18) {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                if (enumC36251z3 != null) {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                } else {
                                    c32823k0M102934i = fVar.getSymptomsScreen();
                                    if (c32823k0M102934i != null) {
                                        strM81080a = null;
                                    } else {
                                        strM81080a = null;
                                    }
                                }
                                objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                            if (enumC36251z3 != null) {
                                strM115590r = m115590r(interfaceC28601c1);
                            } else {
                                strM115590r = m115590r(interfaceC28601c1);
                            }
                            boolean zM87153g19 = c28655q.m87153g(strM115590r);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z214 = z19 | zM87153g19;
                            if ((i15 & 57344) == 16384) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z214 | z24;
                            objM87133R4 = c28655q.m87133R();
                            if (z25) {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(strM115590r, str4, function6, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                            String strM115590r10 = m115590r(interfaceC28601c1);
                            zM87153g = c28655q.m87153g(interfaceC28601c1);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C29802c(23, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R5);
                            }
                            EnumC36251z enumC36251z13 = enumC36251z3;
                            m115594v(fVar, strM115590r10, (Function1) objM87133R5, enumC36251z13, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                            enumC36251z4 = enumC36251z13;
                            function12 = function11;
                            c28655q.m87173q(false);
                            function13 = function10;
                        } else {
                            function12 = function11;
                            enumC36251z4 = enumC36251z3;
                            if (viewState instanceof AbstractC32807c0.a) {
                                c28655q.m87150e0(1478966027);
                                AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                                TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                                TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i28 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = z13 | z14;
                                objM87133R = c28655q.m87133R();
                                if (z15) {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C36242q(function10, viewState, 1);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i3110 = AbstractC33208p0.b.f138467h;
                                int i3111 = TextResource.$stable;
                                function13 = function10;
                                AbstractC33199m0.m105214F(bVar9, textResourceM21278l17, null, textResourceM21278l18, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3110 | (i3111 << 3) | (i3111 << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function13 = function10;
                                c28655q.m87150e0(1479463453);
                                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                        }
                        function8 = function12;
                        enumC36251z2 = enumC36251z4;
                        str3 = str4;
                        function9 = function6;
                        function7 = function13;
                    } else {
                        c28655q.m87138X();
                        enumC36251z2 = enumC36251z;
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool10 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool10);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g110 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g110;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g111 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z215 = z19 | zM87153g111;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z215 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r11 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z14 = enumC36251z3;
                        m115594v(fVar, strM115590r11, (Function1) objM87133R5, enumC36251z14, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z14;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3112 = AbstractC33208p0.b.f138467h;
                            int i3113 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3112 | (i3113 << 3) | (i3113 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
                            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool11 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool11);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g112 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g112;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g113 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z216 = z19 | zM87153g113;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z216 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r12 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z15 = enumC36251z3;
                        m115594v(fVar, strM115590r12, (Function1) objM87133R5, enumC36251z15, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z15;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3114 = AbstractC33208p0.b.f138467h;
                            int i3115 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar11, textResourceM21278l111, null, textResourceM21278l112, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3114 | (i3115 << 3) | (i3115 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
                            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 24576;
            function6 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC36251z == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36251z.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 131072;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35926d(29);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                }
                function10 = function4;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C36244s(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function11 = (Function1) objM87133R7;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36244s(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                }
                if (i26 != 0) {
                    enumC36251z3 = null;
                } else {
                    enumC36251z3 = enumC36251z;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                if (viewState instanceof AbstractC32807c0.f) {
                    c28655q.m87150e0(1477565726);
                    Boolean bool12 = Boolean.TRUE;
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool12);
                    fVar = (AbstractC32807c0.f) viewState;
                    boolean zM87153g114 = c28655q.m87153g(fVar.getSymptomsScreen());
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87153g114;
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (enumC36251z3 != null) {
                        strM115590r = m115590r(interfaceC28601c1);
                    } else {
                        strM115590r = m115590r(interfaceC28601c1);
                    }
                    boolean zM87153g115 = c28655q.m87153g(strM115590r);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z217 = z19 | zM87153g115;
                    if ((i15 & 57344) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z217 | z24;
                    objM87133R4 = c28655q.m87133R();
                    if (z25) {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                    String strM115590r13 = m115590r(interfaceC28601c1);
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    EnumC36251z enumC36251z16 = enumC36251z3;
                    m115594v(fVar, strM115590r13, (Function1) objM87133R5, enumC36251z16, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                    enumC36251z4 = enumC36251z16;
                    function12 = function11;
                    c28655q.m87173q(false);
                    function13 = function10;
                } else {
                    function12 = function11;
                    enumC36251z4 = enumC36251z3;
                    if (viewState instanceof AbstractC32807c0.a) {
                        c28655q.m87150e0(1478966027);
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i28 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3116 = AbstractC33208p0.b.f138467h;
                        int i3117 = TextResource.$stable;
                        function13 = function10;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3116 | (i3117 << 3) | (i3117 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function10;
                        c28655q.m87150e0(1479463453);
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function12;
                enumC36251z2 = enumC36251z4;
                str3 = str4;
                function9 = function6;
                function7 = function13;
            } else {
                c28655q.m87138X();
                enumC36251z2 = enumC36251z;
                str3 = str2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
            }
        }
        i15 |= 384;
        function4 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (enumC36251z == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36251z.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i27 = 131072;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i29 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C35926d(29);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    }
                    function10 = function4;
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C36244s(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function11 = (Function1) objM87133R7;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36244s(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    }
                    if (i26 != 0) {
                        enumC36251z3 = null;
                    } else {
                        enumC36251z3 = enumC36251z;
                    }
                    i28 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                    if (viewState instanceof AbstractC32807c0.f) {
                        c28655q.m87150e0(1477565726);
                        Boolean bool13 = Boolean.TRUE;
                        if ((i15 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function10, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool13);
                        fVar = (AbstractC32807c0.f) viewState;
                        boolean zM87153g116 = c28655q.m87153g(fVar.getSymptomsScreen());
                        if ((458752 & i15) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | zM87153g116;
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            if (enumC36251z3 != null) {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            } else {
                                c32823k0M102934i = fVar.getSymptomsScreen();
                                if (c32823k0M102934i != null) {
                                    strM81080a = null;
                                } else {
                                    strM81080a = null;
                                }
                            }
                            objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        if (enumC36251z3 != null) {
                            strM115590r = m115590r(interfaceC28601c1);
                        } else {
                            strM115590r = m115590r(interfaceC28601c1);
                        }
                        boolean zM87153g117 = c28655q.m87153g(strM115590r);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z218 = z19 | zM87153g117;
                        if ((i15 & 57344) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z218 | z24;
                        objM87133R4 = c28655q.m87133R();
                        if (z25) {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(strM115590r, str4, function6, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                        String strM115590r14 = m115590r(interfaceC28601c1);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29802c(23, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        EnumC36251z enumC36251z17 = enumC36251z3;
                        m115594v(fVar, strM115590r14, (Function1) objM87133R5, enumC36251z17, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                        enumC36251z4 = enumC36251z17;
                        function12 = function11;
                        c28655q.m87173q(false);
                        function13 = function10;
                    } else {
                        function12 = function11;
                        enumC36251z4 = enumC36251z3;
                        if (viewState instanceof AbstractC32807c0.a) {
                            c28655q.m87150e0(1478966027);
                            AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                            TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                            TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i28 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z13 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C36242q(function10, viewState, 1);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3118 = AbstractC33208p0.b.f138467h;
                            int i3119 = TextResource.$stable;
                            function13 = function10;
                            AbstractC33199m0.m105214F(bVar13, textResourceM21278l115, null, textResourceM21278l116, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i3118 | (i3119 << 3) | (i3119 << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function13 = function10;
                            c28655q.m87150e0(1479463453);
                            C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                    }
                    function8 = function12;
                    enumC36251z2 = enumC36251z4;
                    str3 = str4;
                    function9 = function6;
                    function7 = function13;
                } else {
                    c28655q.m87138X();
                    enumC36251z2 = enumC36251z;
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
                }
            }
            i15 |= 24576;
            function6 = function3;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC36251z == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36251z.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 131072;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35926d(29);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                }
                function10 = function4;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C36244s(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function11 = (Function1) objM87133R7;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36244s(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                }
                if (i26 != 0) {
                    enumC36251z3 = null;
                } else {
                    enumC36251z3 = enumC36251z;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                if (viewState instanceof AbstractC32807c0.f) {
                    c28655q.m87150e0(1477565726);
                    Boolean bool14 = Boolean.TRUE;
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool14);
                    fVar = (AbstractC32807c0.f) viewState;
                    boolean zM87153g118 = c28655q.m87153g(fVar.getSymptomsScreen());
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87153g118;
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (enumC36251z3 != null) {
                        strM115590r = m115590r(interfaceC28601c1);
                    } else {
                        strM115590r = m115590r(interfaceC28601c1);
                    }
                    boolean zM87153g119 = c28655q.m87153g(strM115590r);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z219 = z19 | zM87153g119;
                    if ((i15 & 57344) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z219 | z24;
                    objM87133R4 = c28655q.m87133R();
                    if (z25) {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                    String strM115590r15 = m115590r(interfaceC28601c1);
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    EnumC36251z enumC36251z18 = enumC36251z3;
                    m115594v(fVar, strM115590r15, (Function1) objM87133R5, enumC36251z18, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                    enumC36251z4 = enumC36251z18;
                    function12 = function11;
                    c28655q.m87173q(false);
                    function13 = function10;
                } else {
                    function12 = function11;
                    enumC36251z4 = enumC36251z3;
                    if (viewState instanceof AbstractC32807c0.a) {
                        c28655q.m87150e0(1478966027);
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i28 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i31110 = AbstractC33208p0.b.f138467h;
                        int i31111 = TextResource.$stable;
                        function13 = function10;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i31110 | (i31111 << 3) | (i31111 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function10;
                        c28655q.m87150e0(1479463453);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function12;
                enumC36251z2 = enumC36251z4;
                str3 = str4;
                function9 = function6;
                function7 = function13;
            } else {
                c28655q.m87138X();
                enumC36251z2 = enumC36251z;
                str3 = str2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC36251z == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36251z.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i27 = 131072;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i29 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C35926d(29);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                }
                function10 = function4;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C36244s(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function11 = (Function1) objM87133R7;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36244s(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                }
                if (i26 != 0) {
                    enumC36251z3 = null;
                } else {
                    enumC36251z3 = enumC36251z;
                }
                i28 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
                if (viewState instanceof AbstractC32807c0.f) {
                    c28655q.m87150e0(1477565726);
                    Boolean bool15 = Boolean.TRUE;
                    if ((i15 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function10, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool15);
                    fVar = (AbstractC32807c0.f) viewState;
                    boolean zM87153g1110 = c28655q.m87153g(fVar.getSymptomsScreen());
                    if ((458752 & i15) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87153g1110;
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        if (enumC36251z3 != null) {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        } else {
                            c32823k0M102934i = fVar.getSymptomsScreen();
                            if (c32823k0M102934i != null) {
                                strM81080a = null;
                            } else {
                                strM81080a = null;
                            }
                        }
                        objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    if (enumC36251z3 != null) {
                        strM115590r = m115590r(interfaceC28601c1);
                    } else {
                        strM115590r = m115590r(interfaceC28601c1);
                    }
                    boolean zM87153g1111 = c28655q.m87153g(strM115590r);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z2110 = z19 | zM87153g1111;
                    if ((i15 & 57344) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z2110 | z24;
                    objM87133R4 = c28655q.m87133R();
                    if (z25) {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(strM115590r, str4, function6, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                    String strM115590r16 = m115590r(interfaceC28601c1);
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29802c(23, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    EnumC36251z enumC36251z19 = enumC36251z3;
                    m115594v(fVar, strM115590r16, (Function1) objM87133R5, enumC36251z19, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                    enumC36251z4 = enumC36251z19;
                    function12 = function11;
                    c28655q.m87173q(false);
                    function13 = function10;
                } else {
                    function12 = function11;
                    enumC36251z4 = enumC36251z3;
                    if (viewState instanceof AbstractC32807c0.a) {
                        c28655q.m87150e0(1478966027);
                        AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                        TextResource textResourceM21278l119 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                        TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i28 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C36242q(function10, viewState, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i31112 = AbstractC33208p0.b.f138467h;
                        int i31113 = TextResource.$stable;
                        function13 = function10;
                        AbstractC33199m0.m105214F(bVar15, textResourceM21278l119, null, textResourceM21278l1110, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i31112 | (i31113 << 3) | (i31113 << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function13 = function10;
                        c28655q.m87150e0(1479463453);
                        C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                function8 = function12;
                enumC36251z2 = enumC36251z4;
                str3 = str4;
                function9 = function6;
                function7 = function13;
            } else {
                c28655q.m87138X();
                enumC36251z2 = enumC36251z;
                str3 = str2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
            }
        }
        i15 |= 24576;
        function6 = function3;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (enumC36251z == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC36251z.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i27 = 131072;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i29 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C35926d(29);
                    c28655q.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            }
            function10 = function4;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C36244s(0);
                    c28655q.m87172p0(objM87133R7);
                }
                function11 = (Function1) objM87133R7;
            } else {
                function11 = function5;
            }
            if (i24 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C36244s(1);
                    c28655q.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            }
            if (i26 != 0) {
                enumC36251z3 = null;
            } else {
                enumC36251z3 = enumC36251z;
            }
            i28 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "healthcare_womens_health_symptom_patterns", c28655q, i28 | 48);
            if (viewState instanceof AbstractC32807c0.f) {
                c28655q.m87150e0(1477565726);
                Boolean bool16 = Boolean.TRUE;
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new a(function10, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function10, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool16);
                fVar = (AbstractC32807c0.f) viewState;
                boolean zM87153g1112 = c28655q.m87153g(fVar.getSymptomsScreen());
                if ((458752 & i15) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87153g1112;
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    if (enumC36251z3 != null) {
                        c32823k0M102934i = fVar.getSymptomsScreen();
                        if (c32823k0M102934i != null) {
                            strM81080a = null;
                        } else {
                            strM81080a = null;
                        }
                    } else {
                        c32823k0M102934i = fVar.getSymptomsScreen();
                        if (c32823k0M102934i != null) {
                            strM81080a = null;
                        } else {
                            strM81080a = null;
                        }
                    }
                    objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    if (enumC36251z3 != null) {
                        c32823k0M102934i = fVar.getSymptomsScreen();
                        if (c32823k0M102934i != null) {
                            strM81080a = null;
                        } else {
                            strM81080a = null;
                        }
                    } else {
                        c32823k0M102934i = fVar.getSymptomsScreen();
                        if (c32823k0M102934i != null) {
                            strM81080a = null;
                        } else {
                            strM81080a = null;
                        }
                    }
                    objM87133R3 = AbstractC28683x.m87272z(strM81080a);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                if (enumC36251z3 != null) {
                    strM115590r = m115590r(interfaceC28601c1);
                } else {
                    strM115590r = m115590r(interfaceC28601c1);
                }
                boolean zM87153g1113 = c28655q.m87153g(strM115590r);
                if ((i15 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z2111 = z19 | zM87153g1113;
                if ((i15 & 57344) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z2111 | z24;
                objM87133R4 = c28655q.m87133R();
                if (z25) {
                    objM87133R4 = new b(strM115590r, str4, function6, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new b(strM115590r, str4, function6, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(str4, strM115590r, (InterfaceC4351m) objM87133R4, c28655q);
                String strM115590r17 = m115590r(interfaceC28601c1);
                zM87153g = c28655q.m87153g(interfaceC28601c1);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R5 = new C29802c(23, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C29802c(23, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                EnumC36251z enumC36251z110 = enumC36251z3;
                m115594v(fVar, strM115590r17, (Function1) objM87133R5, enumC36251z110, function11, c28655q, ((i15 << 3) & 57344) | ((i15 >> 6) & 7168) | i28, 0);
                enumC36251z4 = enumC36251z110;
                function12 = function11;
                c28655q.m87173q(false);
                function13 = function10;
            } else {
                function12 = function11;
                enumC36251z4 = enumC36251z3;
                if (viewState instanceof AbstractC32807c0.a) {
                    c28655q.m87150e0(1478966027);
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164864k)), false, null, 6, null);
                    TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164858e));
                    TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164859f));
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i28 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C36242q(function10, viewState, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C36242q(function10, viewState, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i31114 = AbstractC33208p0.b.f138467h;
                    int i31115 = TextResource.$stable;
                    function13 = function10;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i31114 | (i31115 << 3) | (i31115 << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function13 = function10;
                    c28655q.m87150e0(1479463453);
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            }
            function8 = function12;
            enumC36251z2 = enumC36251z4;
            str3 = str4;
            function9 = function6;
            function7 = function13;
        } else {
            c28655q.m87138X();
            enumC36251z2 = enumC36251z;
            str3 = str2;
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(i13, i14, 10, viewState, str3, function7, enumC36251z2, function8, function9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m115586n(AbstractC32803a0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m115587o(AbstractC31635g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m115588p(AbstractC32807c0 abstractC32807c0, String str, Function1 function1, Function1 function2, Function1 function3, EnumC36251z enumC36251z, int i13, int i14, Composer composer, int i15) {
        m115585m(abstractC32807c0, str, function1, function2, function3, enumC36251z, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m115589q(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final String m115590r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m115591s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m115592t(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m115591s(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m115593u(Function1 function1, AbstractC32807c0 abstractC32807c0) {
        function1.invoke(new AbstractC32803a0.k(((AbstractC32807c0.a) abstractC32807c0).getCom.mapbox.common.HttpHeaders.DATE java.lang.String()));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x021b A[LOOP:0: B:108:0x0204->B:113:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0253  */
    /* JADX WARN: Code duplicated, block: B:118:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x0278  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0 A[LOOP:1: B:125:0x029a->B:127:0x02a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0314  */
    /* JADX WARN: Code duplicated, block: B:149:0x0338  */
    /* JADX WARN: Code duplicated, block: B:151:0x034b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0358  */
    /* JADX WARN: Code duplicated, block: B:156:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x021f A[EDGE_INSN: B:157:0x021f->B:115:0x021f BREAK  A[LOOP:0: B:108:0x0204->B:113:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0177  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final void m115594v(AbstractC32807c0.f viewState, String str, Function1 onSelectedCyclesIdChange, EnumC36251z enumC36251z, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        EnumC36251z enumC36251z2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        EnumC36251z enumC36251z3;
        C28676v0 c28676v0;
        Function1 function4;
        String strName;
        Context context;
        Activity activity;
        Window window;
        String str3;
        long jM51517e;
        boolean zM87157i;
        Object objM87133R;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C32823k0 c32823k0M102934i;
        TextResource c8688b;
        Object[] objArr;
        boolean z13;
        Object objM87133R2;
        Iterator<C27033k> it;
        int i16;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        ArrayList arrayList;
        Iterator<T> it3;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R3;
        C28676v0 c28676v1;
        boolean zM87153g;
        Object objM87133R4;
        Object objM87133R5;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSelectedCyclesIdChange, "onSelectedCyclesIdChange");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1155888259);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onSelectedCyclesIdChange) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(enumC36251z == null ? -1 : enumC36251z.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    enumC36251z3 = null;
                } else {
                    enumC36251z3 = enumC36251z;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36244s(2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (enumC36251z3 != null || (strName = enumC36251z3.name()) == null) {
                    strName = str2;
                }
                context = ((View) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4980f)).getContext();
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                str3 = strName;
                jM51517e = AbstractC17918w0.m51517e(4280824633L);
                zM87157i = c28655q2.m87157i(window);
                objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C1911e(window, jM51517e, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q2);
                c2314t = C2314t.f9131w;
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                c32823k0M102934i = viewState.getSymptomsScreen();
                if (c32823k0M102934i != null || (c8688b = c32823k0M102934i.getNavigationTitle()) == null) {
                    objArr = null;
                    c8688b = new TextResource.C8688b(AbstractC38480c.f164874u, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                } else {
                    objArr = null;
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(c8688b, null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C34904e(function4, 23);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function5 = function4;
                c28655q = c28655q2;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                if (viewState.getSymptomsScreen() != null) {
                    c28655q.m87150e0(1648810480);
                    it = viewState.getSymptomsScreen().m102997d().iterator();
                    i16 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i16 = -1;
                            break;
                        } else if (AbstractC22676k.m65745e(it.next().getId(), str3)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    float f13 = 4;
                    AbstractC18489d0.m53380u(3, f13, c2314t, c28655q);
                    float f14 = 8;
                    float f15 = 2 * f14;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    List<C27033k> listM102997d = viewState.getSymptomsScreen().m102997d();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM102997d, 10));
                    it3 = listM102997d.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C33223u0(((C27033k) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                    }
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i2 = z14 | c28655q.m87157i(viewState);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                        }
                        AbstractC33231x0.m105420e(arrayList, i16, null, null, (Function1) objM87133R3, c28655q, 0, 12);
                        c28655q.m87173q(true);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f14, c2314t));
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
                        zM87153g = c28655q.m87153g(str3) | c28655q.m87157i(viewState);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g || objM87133R4 == c28676v1) {
                            objM87133R4 = new C35076b(7, str3, viewState);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22674j.m65717c(modifierM3396r2, null, null, null, null, null, false, null, (Function1) objM87133R4, c28655q, 6, 510);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    objM87133R3 = new C35076b(8, onSelectedCyclesIdChange, viewState);
                    c28655q.m87172p0(objM87133R3);
                    AbstractC33231x0.m105420e(arrayList, i16, null, null, (Function1) objM87133R3, c28655q, 0, 12);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f14, c2314t));
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
                    zM87153g = c28655q.m87153g(str3) | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C35076b(7, str3, viewState);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C35076b(7, str3, viewState);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22674j.m65717c(modifierM3396r3, null, null, null, null, null, false, null, (Function1) objM87133R4, c28655q, 6, 510);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1651060181);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                enumC36251z2 = enumC36251z3;
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC36251z2 = enumC36251z;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) viewState, str, onSelectedCyclesIdChange, (Object) enumC36251z2, function3, i13, i14, 1);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                enumC36251z3 = null;
            } else {
                enumC36251z3 = enumC36251z;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C36244s(2);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            if (enumC36251z3 != null) {
                strName = str2;
            } else {
                strName = str2;
            }
            context = ((View) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4980f)).getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            str3 = strName;
            jM51517e = AbstractC17918w0.m51517e(4280824633L);
            zM87157i = c28655q2.m87157i(window);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new C1911e(window, jM51517e, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C1911e(window, jM51517e, 1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q2);
            c2314t = C2314t.f9131w;
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM66724m2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
            c32823k0M102934i = viewState.getSymptomsScreen();
            if (c32823k0M102934i != null) {
                objArr = null;
                c8688b = new TextResource.C8688b(AbstractC38480c.f164874u, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            } else {
                objArr = null;
                c8688b = new TextResource.C8688b(AbstractC38480c.f164874u, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(c8688b, null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C34904e(function4, 23);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C34904e(function4, 23);
                c28655q2.m87172p0(objM87133R2);
            }
            Function1 function6 = function4;
            c28655q = c28655q2;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            if (viewState.getSymptomsScreen() != null) {
                c28655q.m87150e0(1648810480);
                it = viewState.getSymptomsScreen().m102997d().iterator();
                i16 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i16 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getId(), str3)) {
                            break;
                            break;
                        }
                        i16++;
                    }
                }
                float f16 = 4;
                AbstractC18489d0.m53380u(3, f16, c2314t, c28655q);
                float f17 = 8;
                float f18 = 2 * f17;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f18, 0.0f, 2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                List<C27033k> listM102997d2 = viewState.getSymptomsScreen().m102997d();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM102997d2, 10));
                it3 = listM102997d2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C33223u0(((C27033k) it3.next()).getNameDisplay(), null, 2, 0 == true ? 1 : 0));
                }
                if (i16 == -1) {
                    i16 = 0;
                }
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i2 = z14 | c28655q.m87157i(viewState);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                    }
                    AbstractC33231x0.m105420e(arrayList, i16, null, null, (Function1) objM87133R3, c28655q, 0, 12);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16 * f17, c2314t));
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f18, 0.0f, 2);
                    zM87153g = c28655q.m87153g(str3) | c28655q.m87157i(viewState);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R4 = new C35076b(7, str3, viewState);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C35076b(7, str3, viewState);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22674j.m65717c(modifierM3396r5, null, null, null, null, null, false, null, (Function1) objM87133R4, c28655q, 6, 510);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R3 = new C35076b(8, onSelectedCyclesIdChange, viewState);
                c28655q.m87172p0(objM87133R3);
                AbstractC33231x0.m105420e(arrayList, i16, null, null, (Function1) objM87133R3, c28655q, 0, 12);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16 * f17, c2314t));
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, f18, 0.0f, 2);
                zM87153g = c28655q.m87153g(str3) | c28655q.m87157i(viewState);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C35076b(7, str3, viewState);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C35076b(7, str3, viewState);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22674j.m65717c(modifierM3396r6, null, null, null, null, null, false, null, (Function1) objM87133R4, c28655q, 6, 510);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1651060181);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            enumC36251z2 = enumC36251z3;
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            enumC36251z2 = enumC36251z;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g((Object) viewState, str, onSelectedCyclesIdChange, (Object) enumC36251z2, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m115595w(AbstractC31635g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m115596x(Window window, long j7) {
        if (window != null) {
            window.setStatusBarColor(AbstractC17918w0.m51506H(j7));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m115597y(Function1 function1) {
        function1.invoke(AbstractC31635g.a.f130697a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m115598z(Function1 function1, AbstractC32807c0.f fVar, int i13) {
        function1.invoke(fVar.getSymptomsScreen().m102997d().get(i13).getId());
        return C23454a0.f92919a;
    }
}
