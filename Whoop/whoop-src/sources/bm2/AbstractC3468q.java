package bm2;

import am2.C1042s;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kd1.C22411w;
import kotlin.C2040y;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.C3966j0;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p181h2.C16620e;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: bm2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a]\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lbm2/r;", "viewState", "Lcom/whoop/util/TrendKey;", "trendKey", "Lor2/h0;", "graphKey", "Lkotlin/Function1;", "Ll83/a0;", "onInterTrendNavigationEvent", "onInterTrendNavigationEventV3", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lbm2/r;Lcom/whoop/util/TrendKey;Lor2/h0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lh2/e;", "size", "", "expanded", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3468q {

    /* JADX INFO: renamed from: bm2.q$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f13607w = new a();

        /* JADX INFO: renamed from: a */
        public final long m10186a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10186a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.q$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f13608w;

        public b(InterfaceC28601c1 interfaceC28601c1) {
            this.f13608w = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m10187a() {
            AbstractC3468q.m10177l(this.f13608w, false);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m10187a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm2.q$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f13609w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f13610x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f13611y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f13612z;

        /* JADX INFO: renamed from: bm2.q$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function3 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC25312u f13613w;

            public a(InterfaceC25312u interfaceC25312u) {
                this.f13613w = interfaceC25312u;
            }

            /* JADX INFO: renamed from: a */
            public final Modifier m10189a(InterfaceC25312u it, Composer composer, int i13) {
                Modifier modifierM3599a;
                AbstractC22676k.m65750j(it, "it");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1760564358);
                boolean z4 = this.f13613w instanceof C17736e;
                C2314t c2314t = C2314t.f9131w;
                if (z4) {
                    c28655q.m87150e0(-1167753591);
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2), "divider " + AbstractC8693b.m21274h(((C17736e) this.f13613w).getTitle(), c28655q, TextResource.$stable));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1167476761);
                    InterfaceC25312u interfaceC25312u = this.f13613w;
                    AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState");
                    modifierM3599a = AbstractC1136a.m3599a(c2314t, "menu item " + AbstractC8693b.m21274h(((C39282o) interfaceC25312u).getTitle(), c28655q, TextResource.$stable));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                return modifierM3599a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m10189a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX INFO: renamed from: bm2.q$c$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f13614w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f13615x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f13616y;

            public b(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
                this.f13614w = function1;
                this.f13615x = function2;
                this.f13616y = interfaceC28601c1;
            }

            /* JADX INFO: renamed from: a */
            public final void m10190a(Object it) {
                AbstractC22676k.m65750j(it, "it");
                if (it instanceof TrendKey) {
                    this.f13614w.invoke(it);
                    AbstractC3468q.m10177l(this.f13616y, false);
                }
                if (it instanceof EnumC28166h0) {
                    this.f13615x.invoke(it);
                    AbstractC3468q.m10177l(this.f13616y, false);
                }
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10190a(obj);
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
            this.f13609w = interfaceC25312u;
            this.f13610x = function1;
            this.f13611y = function2;
            this.f13612z = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m10188a(InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
            AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = this.f13609w;
            C25307p c25307pM74307h = p720m91.Function1.m74307h(null, 1, null);
            a aVar = new a(this.f13609w);
            boolean zM87153g = c28655q.m87153g(this.f13610x) | c28655q.m87153g(this.f13611y);
            Function1 function1 = this.f13610x;
            Function1 function2 = this.f13611y;
            InterfaceC28601c1 interfaceC28601c1 = this.f13612z;
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new b(function1, function2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74307h, aVar, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m10188a((InterfaceC22997s1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm2.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.InterTrendNavigationKt$InterTrendNavigation$1$4$4$1", m100430f = "InterTrendNavigation.kt", m100431l = {171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C3470r f13617E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C26068u f13618F;

        /* JADX INFO: renamed from: w */
        int f13619w;

        /* JADX INFO: renamed from: x */
        int f13620x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TrendKey f13621y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC28166h0 f13622z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TrendKey trendKey, EnumC28166h0 enumC28166h0, C3470r c3470r, C26068u c26068u, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13621y = trendKey;
            this.f13622z = enumC28166h0;
            this.f13617E = c3470r;
            this.f13618F = c26068u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f13621y, this.f13622z, this.f13617E, this.f13618F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13620x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                int iNextIndex = -1;
                if (this.f13621y.getIsRecovery() || this.f13622z.getIsRecovery()) {
                    Iterator it = AbstractC25265s.m74161z0(this.f13617E.m10206b(), 1).iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        if (((InterfaceC25312u) it.next()) instanceof C17736e) {
                            iNextIndex = i14;
                            break;
                        }
                        i14++;
                    }
                    iNextIndex++;
                } else if (this.f13621y.getIsSleep() || this.f13622z.getIsSleep() || this.f13622z.getIsOther()) {
                    List<InterfaceC25312u> listM10206b = this.f13617E.m10206b();
                    ListIterator<InterfaceC25312u> listIterator = listM10206b.listIterator(listM10206b.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous() instanceof C17736e) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                } else {
                    if (!this.f13621y.getIsStrain()) {
                        this.f13622z.getIsStrain();
                    }
                    iNextIndex = 0;
                }
                C26068u c26068u = this.f13618F;
                this.f13619w = iNextIndex;
                this.f13620x = 1;
                C28539n0 c28539n0 = C26068u.f103217x;
                if (c26068u.m77567j(iNextIndex, 0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bm2.q$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f13623w;

        public e(List list) {
            this.f13623w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m10191a(int i13) {
            this.f13623w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m10191a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: bm2.q$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f13624w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f13625x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f13626y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f13627z;

        public f(List list, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Function1 function2) {
            this.f13624w = list;
            this.f13625x = interfaceC28601c1;
            this.f13626y = function1;
            this.f13627z = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m10192a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f13624w.get(i13);
            c28655q.m87150e0(-1169640715);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f13625x);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            float f13 = 0;
            AbstractC15002f0.m43106b(interfaceC4339a, null, false, new C22976l1(f13, f13, f13, f13), AbstractC37817c.m121344e(-40939242, c28655q, new c(interfaceC25312u, this.f13626y, this.f13627z, this.f13625x)), c28655q, 199686, 22);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m10192a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m10173h(Modifier modifier, C3470r viewState, TrendKey trendKey, EnumC28166h0 enumC28166h0, Function1 onInterTrendNavigationEvent, Function1 onInterTrendNavigationEventV3, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TrendKey trendKey2;
        EnumC28166h0 enumC28166h1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onInterTrendNavigationEvent, "onInterTrendNavigationEvent");
        AbstractC22676k.m65750j(onInterTrendNavigationEventV3, "onInterTrendNavigationEventV3");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1402600328);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(trendKey == null ? -1 : trendKey.ordinal()) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC28166h0 != null ? enumC28166h0.ordinal() : -1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onInterTrendNavigationEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onInterTrendNavigationEventV3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            TrendKey trendKey3 = i17 != 0 ? TrendKey.NONE : trendKey;
            EnumC28166h0 enumC28166h2 = i18 != 0 ? EnumC28166h0.NONE : enumC28166h0;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C16620e(0L));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            TrendKey trendKey4 = trendKey3;
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier4 = modifier3;
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
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "interTrendNavigation");
            C33252i c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3599a, c38072d.m121949b(c28655q, i19).getWhite10(), c33252iM64090c);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C3425a1(1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3358c, (Function1) objM87133R3);
            C39282o c39282oM10205a = viewState.getInitial();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = a.f13607w;
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
            AbstractC39279l alignment = viewState.getInitial().getAlignment();
            AbstractC22676k.m65748h(alignment, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemAlignment.LeftAlignedIconMenu");
            C39282o c39282oM125211a = c39282oM10205a.m125211a((32735 & 1) != 0 ? c39282oM10205a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282oM10205a.title : null, (32735 & 4) != 0 ? c39282oM10205a.titleColor : null, (32735 & 8) != 0 ? c39282oM10205a.enabled : false, (32735 & 16) != 0 ? c39282oM10205a.selected : false, (32735 & 32) != 0 ? c39282oM10205a.alignment : new AbstractC39279l.b(null, null, ((AbstractC39279l.b) alignment).getLeftIcon(), null, new C39274g(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, false, 4075, null), (32735 & 64) != 0 ? c39282oM10205a.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282oM10205a.background : interfaceC39332eM125323a, (32735 & 256) != 0 ? c39282oM10205a.border : null, (32735 & 512) != 0 ? c39282oM10205a.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282oM10205a.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282oM10205a.menuItemStyle : null, (32735 & 4096) != 0 ? c39282oM10205a.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282oM10205a.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282oM10205a.analyticEvent : null);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C3464o(0, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC39281n.m125207c(modifierM3500d, c39282oM125211a, (InterfaceC4339a) objM87133R5, c28655q, (C39282o.f168987q << 3) | 384, 0);
            EnumC28166h0 enumC28166h3 = enumC28166h2;
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, c38072d.m121949b(c28655q, i19).getBrandBlack(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(2 * 4), 5), AbstractC37817c.m121344e(-1563118366, c28655q, new C3466p(trendKey4, enumC28166h3, viewState, c26068uM77569a, interfaceC28601c2, interfaceC28601c1, onInterTrendNavigationEvent, onInterTrendNavigationEventV3)), c28655q, 3072, 2);
            c28655q.m87173q(true);
            enumC28166h1 = enumC28166h3;
            trendKey2 = trendKey4;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            trendKey2 = trendKey;
            enumC28166h1 = enumC28166h0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(i13, i14, 2, modifier2, viewState, trendKey2, enumC28166h1, onInterTrendNavigationEvent, onInterTrendNavigationEventV3);
        }
    }

    /* JADX INFO: renamed from: i */
    private static final long m10174i(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16620e) interfaceC28601c1.getValue()).f63951a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m10175j(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16620e(j7));
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m10176k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m10177l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m10178m(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m10175j(interfaceC28601c1, AbstractC35744b.m113239l(coordinates.mo3541n()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m10179n(InterfaceC28601c1 interfaceC28601c1) {
        m10177l(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m10180o(TrendKey trendKey, EnumC28166h0 enumC28166h0, C3470r c3470r, C26068u c26068u, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, Function1 function2, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c3;
        boolean z4 = true;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        boolean zM10176k = m10176k(interfaceC28601c1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            interfaceC28601c3 = interfaceC28601c1;
            objM87133R = new C3464o(1, interfaceC28601c3);
            c28655q.m87172p0(objM87133R);
        } else {
            interfaceC28601c3 = interfaceC28601c1;
        }
        AbstractC15002f0.m43105a(zM10176k, (InterfaceC4339a) objM87133R, AbstractC1102d.m3424u(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo734f0(Float.intBitsToFloat((int) (m10174i(interfaceC28601c2) >> 32))), C2314t.f9131w), (((long) Float.floatToRawIntBits(4)) & 4294967295L) | (((long) Float.floatToRawIntBits(0)) << 32), null, new C3966j0(z4, 8), AbstractC37817c.m121344e(1567587343, c28655q, new C2040y(interfaceC28601c2, c26068u, c3470r, function1, function2, interfaceC28601c3)), c28655q, 1772592, 16);
        boolean zM87149e = c28655q.m87149e(trendKey.ordinal()) | c28655q.m87149e(enumC28166h0.ordinal()) | c28655q.m87157i(c3470r) | c28655q.m87153g(c26068u);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87149e || objM87133R2 == c28676v0) {
            objM87133R2 = new d(trendKey, enumC28166h0, c3470r, c26068u, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m10181p(InterfaceC28601c1 interfaceC28601c1) {
        m10177l(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m10182q(InterfaceC28601c1 interfaceC28601c1, C26068u c26068u, C3470r c3470r, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c2, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo734f0(Float.intBitsToFloat((int) (m10174i(interfaceC28601c1) >> 32))), AbstractC1102d.m3411h(110 * 4, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(c3470r) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C1042s c1042s = new C1042s((Object) c3470r, interfaceC28601c2, (Object) function1, (Object) function2, 5);
                c28655q.m87172p0(c1042s);
                objM87133R = c1042s;
            }
            AbstractC22674j.m65717c(modifierM3407d, c26068u, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m10183r(C3470r c3470r, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Function1 function2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM10206b = c3470r.m10206b();
        ((C26053f) LazyColumn).m77529r(listM10206b.size(), null, new e(listM10206b), new C37816b(new f(listM10206b, interfaceC28601c1, function1, function2), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m10184s(Modifier modifier, C3470r c3470r, TrendKey trendKey, EnumC28166h0 enumC28166h0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m10173h(modifier, c3470r, trendKey, enumC28166h0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
