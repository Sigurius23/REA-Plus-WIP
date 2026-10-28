package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ih0.C18508r;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import l83.C23465k;
import m83.C25271y;
import nl0.AbstractC26802d;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.C22971k;
import p291l0.C22976l1;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;

/* JADX INFO: renamed from: sl0.u1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0011²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsl0/v1;", "viewState", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "", "isEnabled", "d", "(Lsl0/v1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "", "selectedIndex", "isAnimating", "", "", "displayedSuggestions", "hasScrolled", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32680u1 {

    /* JADX INFO: renamed from: sl0.u1$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.HorizontalBubbleSuggestionsViewKt$HorizontalBubbleSuggestionsView$2$1", m100430f = "HorizontalBubbleSuggestionsView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135643E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135644F;

        /* JADX INFO: renamed from: w */
        int f135645w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32684v1 f135646x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AtomicReference<C23465k> f135647y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f135648z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32684v1 c32684v1, AtomicReference<C23465k> atomicReference, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135646x = c32684v1;
            this.f135647y = atomicReference;
            this.f135648z = interfaceC28601c1;
            this.f135643E = interfaceC28601c2;
            this.f135644F = interfaceC28601c3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135646x, this.f135647y, this.f135648z, this.f135643E, this.f135644F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135645w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f135646x.m102494c().isEmpty() && !AbstractC32680u1.m102433l(this.f135648z)) {
                AbstractC32680u1.m102436o(this.f135643E, this.f135646x.m102494c());
                AbstractC32680u1.m102432k(this.f135644F, null);
                AbstractC32680u1.m102434m(this.f135648z, false);
                this.f135647y.set(null);
            } else if (this.f135646x.m102494c().isEmpty() && !AbstractC32680u1.m102433l(this.f135648z)) {
                AbstractC32680u1.m102436o(this.f135643E, C25271y.f99162w);
                AbstractC32680u1.m102432k(this.f135644F, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.u1$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.HorizontalBubbleSuggestionsViewKt$HorizontalBubbleSuggestionsView$3$1", m100430f = "HorizontalBubbleSuggestionsView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135649E;

        /* JADX INFO: renamed from: w */
        int f135650w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26068u f135651x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f135652y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32684v1 f135653z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26068u c26068u, Function1 function1, C32684v1 c32684v1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135651x = c26068u;
            this.f135652y = function1;
            this.f135653z = c32684v1;
            this.f135649E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135651x, this.f135652y, this.f135653z, this.f135649E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135650w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if ((((C28621h1) this.f135651x.f103222e.f91958b).m87024x() > 0 || ((C28621h1) this.f135651x.f103222e.f91959c).m87024x() > 0) && !AbstractC32680u1.m102427f(this.f135649E)) {
                AbstractC32680u1.m102428g(this.f135649E, true);
                this.f135652y.invoke(new AbstractC26802d.o(this.f135653z.getConversationId(), "wce-android-horizontal-scrolling"));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.u1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135654E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135655F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f135656w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f135657x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f135658y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AtomicReference<C23465k> f135659z;

        public c(boolean z4, String str, int i13, AtomicReference<C23465k> atomicReference, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f135656w = z4;
            this.f135657x = str;
            this.f135658y = i13;
            this.f135659z = atomicReference;
            this.f135654E = interfaceC28601c1;
            this.f135655F = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m102444a() {
            if (this.f135656w) {
                C23465k c23465k = new C23465k(this.f135657x, Integer.valueOf(this.f135658y));
                AtomicReference<C23465k> atomicReference = this.f135659z;
                while (!atomicReference.compareAndSet(null, c23465k)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                AbstractC32680u1.m102432k(this.f135654E, Integer.valueOf(this.f135658y));
                AbstractC32680u1.m102434m(this.f135655F, true);
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m102444a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.u1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135660E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135661F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AtomicReference<C23465k> f135662w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f135663x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32684v1 f135664y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f135665z;

        public d(AtomicReference<C23465k> atomicReference, Function1 function1, C32684v1 c32684v1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f135662w = atomicReference;
            this.f135663x = function1;
            this.f135664y = c32684v1;
            this.f135665z = interfaceC28601c1;
            this.f135660E = interfaceC28601c2;
            this.f135661F = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m102445a() {
            C23465k andSet = this.f135662w.getAndSet(null);
            if (andSet != null) {
                this.f135663x.invoke(new AbstractC26802d.m((String) andSet.f92937w, ((Number) andSet.f92938x).intValue(), this.f135664y.getMessageCount(), this.f135664y.getConversationId(), null, null, 48, null));
                AbstractC32680u1.m102432k(this.f135665z, null);
                AbstractC32680u1.m102434m(this.f135660E, false);
                if (this.f135664y.m102494c().isEmpty()) {
                    AbstractC32680u1.m102436o(this.f135661F, C25271y.f99162w);
                }
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m102445a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.u1$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f135666w;

        public e(List list) {
            this.f135666w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m102446a(int i13) {
            this.f135666w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m102446a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: sl0.u1$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C32684v1 f135667E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135668F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f135669G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f135670H;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f135671w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AtomicReference f135672x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f135673y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f135674z;

        public f(List list, AtomicReference atomicReference, boolean z4, Function1 function1, C32684v1 c32684v1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f135671w = list;
            this.f135672x = atomicReference;
            this.f135673y = z4;
            this.f135674z = function1;
            this.f135667E = c32684v1;
            this.f135668F = interfaceC28601c1;
            this.f135669G = interfaceC28601c2;
            this.f135670H = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m102447a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            InterfaceC4339a interfaceC4339a;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            boolean z4 = true;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            String str = (String) this.f135671w.get(i13);
            c28655q.m87150e0(1854977093);
            Integer numM102431j = AbstractC32680u1.m102431j(this.f135668F);
            C32701z2 c32701z2 = new C32701z2(str, numM102431j != null && numM102431j.intValue() == i13, AbstractC32680u1.m102433l(this.f135669G), this.f135672x.get() == null);
            boolean zM87155h = c28655q.m87155h(this.f135673y) | c28655q.m87153g(str);
            if ((((i15 & 112) ^ 48) <= 32 || !c28655q.m87149e(i13)) && (i15 & 48) != 32) {
                z4 = false;
            }
            boolean zM87157i = zM87155h | z4 | c28655q.m87157i(this.f135672x);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                c cVar = new c(this.f135673y, str, i13, this.f135672x, this.f135668F, this.f135669G);
                c28655q.m87172p0(cVar);
                objM87133R = cVar;
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            Integer numM102431j2 = AbstractC32680u1.m102431j(this.f135668F);
            if (numM102431j2 == null || numM102431j2.intValue() != i13 || this.f135672x.get() == null) {
                c28655q.m87150e0(1856936013);
                c28655q.m87173q(false);
                interfaceC4339a = null;
            } else {
                c28655q.m87150e0(1855855973);
                boolean zM87157i2 = c28655q.m87157i(this.f135672x) | c28655q.m87153g(this.f135674z) | c28655q.m87157i(this.f135667E);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    d dVar = new d(this.f135672x, this.f135674z, this.f135667E, this.f135668F, this.f135669G, this.f135670H);
                    c28655q.m87172p0(dVar);
                    objM87133R2 = dVar;
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
                c28655q.m87173q(false);
            }
            AbstractC32697y2.m102591d(c32701z2, interfaceC4339a2, interfaceC4339a, c28655q, 0, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m102447a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:97:0x021d  */
    /* JADX WARN: Code duplicated, block: B:98:0x022b  */
    /* JADX INFO: renamed from: d */
    public static final void m102425d(C32684v1 c32684v1, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        boolean z14;
        C28655q c28655q;
        Function1 function3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z16;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        C26068u c26068uM77569a;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        AtomicReference atomicReference;
        List<String> listM102494c;
        boolean zM87157i;
        Object aVar;
        List<String> list;
        Integer numValueOf;
        int i19;
        boolean z17;
        boolean zM87157i2;
        Object objM87133R6;
        Integer num;
        C26068u c26068u;
        boolean z18;
        boolean z19;
        boolean zM87157i3;
        Object c18508r;
        Object objM87133R7;
        C32684v1 viewState = c32684v1;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1210525800);
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
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C32375n(25);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function4 = (Function1) objM87133R7;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(viewState.m102494c());
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new AtomicReference(null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    atomicReference = (AtomicReference) objM87133R5;
                    listM102494c = viewState.m102494c();
                    zM87157i = c28655q2.m87157i(viewState) | c28655q2.m87157i(atomicReference);
                    Object objM87133R8 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R8 == c28676v0) {
                        list = listM102494c;
                        aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                        c28655q2.m87172p0(aVar);
                    } else {
                        aVar = objM87133R8;
                        list = listM102494c;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) aVar, list);
                    Integer numValueOf2 = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91958b).m87024x());
                    numValueOf = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91959c).m87024x());
                    boolean zM87153g = c28655q2.m87153g(c26068uM77569a);
                    i19 = i18 & 112;
                    if (i19 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i2 = zM87153g | z17 | c28655q2.m87157i(viewState);
                    objM87133R6 = c28655q2.m87133R();
                    if (!zM87157i2 || objM87133R6 == c28676v0) {
                        num = numValueOf;
                        function3 = function4;
                        b bVar = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                        c26068u = c26068uM77569a;
                        viewState = viewState;
                        c28655q2.m87172p0(bVar);
                        objM87133R6 = bVar;
                    } else {
                        num = numValueOf;
                        c26068u = c26068uM77569a;
                        function3 = function4;
                    }
                    AbstractC28683x.m87254h(numValueOf2, num, (InterfaceC4351m) objM87133R6, c28655q2);
                    if (m102435n(interfaceC28601c3).isEmpty()) {
                        c28655q = c28655q2;
                        z15 = z16;
                        c28655q.m87150e0(-2062003174);
                        c28655q.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-2064506765);
                        float f13 = 8;
                        float f14 = 1 * f13;
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f14, 1), "HorizontalBubbleSuggestions");
                        C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(((float) 5.5d) * f13, 0.0f, 2 * f13, 0.0f, 10);
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                        boolean zM87157i4 = c28655q2.m87157i(atomicReference);
                        if ((i18 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z24 = zM87157i4 | z18;
                        if (i19 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i3 = z19 | z24 | c28655q2.m87157i(viewState);
                        Object objM87133R9 = c28655q2.m87133R();
                        if (!zM87157i3 || objM87133R9 == c28676v0) {
                            Function1 function5 = function3;
                            z15 = z16;
                            c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function5, viewState, interfaceC28601c1, interfaceC28601c2);
                            function3 = function5;
                            c28655q2.m87172p0(c18508r);
                        } else {
                            c18508r = objM87133R9;
                            z15 = z16;
                        }
                        AbstractC22674j.m65718d(modifierM3599a, c26068u, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) c18508r, c28655q2, 24966, 488);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32676t1(c32684v1, function3, z15, i13, i14, 0);
                }
            }
            i15 |= 384;
            z13 = z4;
            i18 = i15;
            if ((i18 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C32375n(25);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.m102494c());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new AtomicReference(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                atomicReference = (AtomicReference) objM87133R5;
                listM102494c = viewState.m102494c();
                zM87157i = c28655q2.m87157i(viewState) | c28655q2.m87157i(atomicReference);
                Object objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    list = listM102494c;
                    aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                    c28655q2.m87172p0(aVar);
                } else {
                    list = listM102494c;
                    aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                    c28655q2.m87172p0(aVar);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) aVar, list);
                Integer numValueOf3 = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91958b).m87024x());
                numValueOf = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91959c).m87024x());
                boolean zM87153g2 = c28655q2.m87153g(c26068uM77569a);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i2 = zM87153g2 | z17 | c28655q2.m87157i(viewState);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    num = numValueOf;
                    function3 = function4;
                    b bVar2 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                    c26068u = c26068uM77569a;
                    viewState = viewState;
                    c28655q2.m87172p0(bVar2);
                    objM87133R6 = bVar2;
                } else {
                    num = numValueOf;
                    function3 = function4;
                    b bVar3 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                    c26068u = c26068uM77569a;
                    viewState = viewState;
                    c28655q2.m87172p0(bVar3);
                    objM87133R6 = bVar3;
                }
                AbstractC28683x.m87254h(numValueOf3, num, (InterfaceC4351m) objM87133R6, c28655q2);
                if (m102435n(interfaceC28601c3).isEmpty()) {
                    c28655q2.m87150e0(-2064506765);
                    float f15 = 8;
                    float f16 = 1 * f15;
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f16, 1), "HorizontalBubbleSuggestions");
                    C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(((float) 5.5d) * f15, 0.0f, 2 * f15, 0.0f, 10);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16);
                    boolean zM87157i5 = c28655q2.m87157i(atomicReference);
                    if ((i18 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z25 = zM87157i5 | z18;
                    if (i19 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i3 = z19 | z25 | c28655q2.m87157i(viewState);
                    Object objM87133R11 = c28655q2.m87133R();
                    if (zM87157i3) {
                        Function1 function6 = function3;
                        z15 = z16;
                        c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function6, viewState, interfaceC28601c1, interfaceC28601c2);
                        function3 = function6;
                        c28655q2.m87172p0(c18508r);
                    } else {
                        Function1 function7 = function3;
                        z15 = z16;
                        c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function7, viewState, interfaceC28601c1, interfaceC28601c2);
                        function3 = function7;
                        c28655q2.m87172p0(c18508r);
                    }
                    AbstractC22674j.m65718d(modifierM3599a2, c26068u, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) c18508r, c28655q2, 24966, 488);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    z15 = z16;
                    c28655q.m87150e0(-2062003174);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c32684v1, function3, z15, i13, i14, 0);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C32375n(25);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(viewState.m102494c());
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new AtomicReference(null);
                    c28655q2.m87172p0(objM87133R5);
                }
                atomicReference = (AtomicReference) objM87133R5;
                listM102494c = viewState.m102494c();
                zM87157i = c28655q2.m87157i(viewState) | c28655q2.m87157i(atomicReference);
                Object objM87133R12 = c28655q2.m87133R();
                if (zM87157i) {
                    list = listM102494c;
                    aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                    c28655q2.m87172p0(aVar);
                } else {
                    list = listM102494c;
                    aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                    c28655q2.m87172p0(aVar);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) aVar, list);
                Integer numValueOf4 = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91958b).m87024x());
                numValueOf = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91959c).m87024x());
                boolean zM87153g3 = c28655q2.m87153g(c26068uM77569a);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i2 = zM87153g3 | z17 | c28655q2.m87157i(viewState);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    num = numValueOf;
                    function3 = function4;
                    b bVar4 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                    c26068u = c26068uM77569a;
                    viewState = viewState;
                    c28655q2.m87172p0(bVar4);
                    objM87133R6 = bVar4;
                } else {
                    num = numValueOf;
                    function3 = function4;
                    b bVar5 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                    c26068u = c26068uM77569a;
                    viewState = viewState;
                    c28655q2.m87172p0(bVar5);
                    objM87133R6 = bVar5;
                }
                AbstractC28683x.m87254h(numValueOf4, num, (InterfaceC4351m) objM87133R6, c28655q2);
                if (m102435n(interfaceC28601c3).isEmpty()) {
                    c28655q2.m87150e0(-2064506765);
                    float f17 = 8;
                    float f18 = 1 * f17;
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f18, 1), "HorizontalBubbleSuggestions");
                    C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(((float) 5.5d) * f17, 0.0f, 2 * f17, 0.0f, 10);
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f18);
                    boolean zM87157i6 = c28655q2.m87157i(atomicReference);
                    if ((i18 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z26 = zM87157i6 | z18;
                    if (i19 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i3 = z19 | z26 | c28655q2.m87157i(viewState);
                    Object objM87133R13 = c28655q2.m87133R();
                    if (zM87157i3) {
                        Function1 function8 = function3;
                        z15 = z16;
                        c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function8, viewState, interfaceC28601c1, interfaceC28601c2);
                        function3 = function8;
                        c28655q2.m87172p0(c18508r);
                    } else {
                        Function1 function9 = function3;
                        z15 = z16;
                        c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function9, viewState, interfaceC28601c1, interfaceC28601c2);
                        function3 = function9;
                        c28655q2.m87172p0(c18508r);
                    }
                    AbstractC22674j.m65718d(modifierM3599a3, c26068u, c22976l1M3381c3, c22971kM66746i3, null, null, false, null, (Function1) c18508r, c28655q2, 24966, 488);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    z15 = z16;
                    c28655q.m87150e0(-2062003174);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c32684v1, function3, z15, i13, i14, 0);
            }
        }
        i15 |= 384;
        z13 = z4;
        i18 = i15;
        if ((i18 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C32375n(25);
                    c28655q2.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(viewState.m102494c());
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new AtomicReference(null);
                c28655q2.m87172p0(objM87133R5);
            }
            atomicReference = (AtomicReference) objM87133R5;
            listM102494c = viewState.m102494c();
            zM87157i = c28655q2.m87157i(viewState) | c28655q2.m87157i(atomicReference);
            Object objM87133R14 = c28655q2.m87133R();
            if (zM87157i) {
                list = listM102494c;
                aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
            } else {
                list = listM102494c;
                aVar = new a(viewState, atomicReference, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) aVar, list);
            Integer numValueOf5 = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91958b).m87024x());
            numValueOf = Integer.valueOf(((C28621h1) c26068uM77569a.f103222e.f91959c).m87024x());
            boolean zM87153g4 = c28655q2.m87153g(c26068uM77569a);
            i19 = i18 & 112;
            if (i19 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i2 = zM87153g4 | z17 | c28655q2.m87157i(viewState);
            objM87133R6 = c28655q2.m87133R();
            if (zM87157i2) {
                num = numValueOf;
                function3 = function4;
                b bVar6 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                c26068u = c26068uM77569a;
                viewState = viewState;
                c28655q2.m87172p0(bVar6);
                objM87133R6 = bVar6;
            } else {
                num = numValueOf;
                function3 = function4;
                b bVar7 = new b(c26068uM77569a, function3, viewState, interfaceC28601c4, null);
                c26068u = c26068uM77569a;
                viewState = viewState;
                c28655q2.m87172p0(bVar7);
                objM87133R6 = bVar7;
            }
            AbstractC28683x.m87254h(numValueOf5, num, (InterfaceC4351m) objM87133R6, c28655q2);
            if (m102435n(interfaceC28601c3).isEmpty()) {
                c28655q2.m87150e0(-2064506765);
                float f19 = 8;
                float f110 = 1 * f19;
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, f110, 1), "HorizontalBubbleSuggestions");
                C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(((float) 5.5d) * f19, 0.0f, 2 * f19, 0.0f, 10);
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f110);
                boolean zM87157i7 = c28655q2.m87157i(atomicReference);
                if ((i18 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z27 = zM87157i7 | z18;
                if (i19 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i3 = z19 | z27 | c28655q2.m87157i(viewState);
                Object objM87133R15 = c28655q2.m87133R();
                if (zM87157i3) {
                    Function1 function10 = function3;
                    z15 = z16;
                    c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function10, viewState, interfaceC28601c1, interfaceC28601c2);
                    function3 = function10;
                    c28655q2.m87172p0(c18508r);
                } else {
                    Function1 function11 = function3;
                    z15 = z16;
                    c18508r = new C18508r(interfaceC28601c3, atomicReference, z15, function11, viewState, interfaceC28601c1, interfaceC28601c2);
                    function3 = function11;
                    c28655q2.m87172p0(c18508r);
                }
                AbstractC22674j.m65718d(modifierM3599a4, c26068u, c22976l1M3381c4, c22971kM66746i4, null, null, false, null, (Function1) c18508r, c28655q2, 24966, 488);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                z15 = z16;
                c28655q.m87150e0(-2062003174);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(c32684v1, function3, z15, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m102426e(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final boolean m102427f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m102428g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m102429h(InterfaceC28601c1 interfaceC28601c1, AtomicReference atomicReference, boolean z4, Function1 function1, C32684v1 c32684v1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<String> listM102435n = m102435n(interfaceC28601c1);
        ((C26053f) LazyRow).m77529r(listM102435n.size(), null, new e(listM102435n), new C37816b(new f(listM102435n, atomicReference, z4, function1, c32684v1, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m102430i(C32684v1 c32684v1, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m102425d(c32684v1, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Integer m102431j(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m102432k(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m102433l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m102434m(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: n */
    private static final List<String> m102435n(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m102436o(InterfaceC28601c1 interfaceC28601c1, List<String> list) {
        interfaceC28601c1.setValue(list);
    }
}
