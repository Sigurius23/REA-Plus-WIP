package yd2;

import am2.C1020h;
import am2.C1044u;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C11012z;
import d30.C11547l0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gy0.AbstractC16276e;
import java.util.List;
import kd2.AbstractC22415a;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p698au1.C2069n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35684p;
import v41.C35658c;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import wr0.C37550r;
import wr0.C37564y;
import x81.C38072d;
import xd2.C38207c;
import xd2.C38208d;
import xd2.C38210f;
import xd2.C38211g;
import xd2.C38217m;
import y71.C39274g;

/* JADX INFO: renamed from: yd2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a}\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001ac\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0018\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010$\u001a\u00020\u00058\u0000X\u0080D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lxd2/g;", "historyViewState", "", "isLoadingMoreHistory", "Lkotlin/Function1;", "", "Ll83/a0;", "onLoadMore", "", "onClearAllClicked", "onClickHistoryRecord", "onClearByDateClicked", "Lkotlin/Function0;", "onLoading", "u", "(Lxd2/g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lxd2/m;", "paginatedHistoryViewState", "q", "(Lxd2/m;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ln0/u;", "", "buffer", "nextToken", "n", "(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lxd2/c;", "emptyHistoryViewState", "j", "(Lxd2/c;Landroidx/compose/runtime/Composer;I)V", "l", "(Landroidx/compose/runtime/Composer;I)V", "a", "Ljava/lang/String;", "getPAGINATED_HISTORY_SECTION_TEST_TAG", "()Ljava/lang/String;", "PAGINATED_HISTORY_SECTION_TEST_TAG", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39462d {

    /* JADX INFO: renamed from: a */
    private static final String f169791a = "PaginatedHistorySection";

    /* JADX INFO: renamed from: yd2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.view.ShepherdHistoryKt$OnBottomReached$1$1", m100430f = "ShepherdHistory.kt", m100431l = {159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169792w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f169793x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f169794y;

        /* JADX INFO: renamed from: yd2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42690a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4339a f169795w;

            public C42690a(InterfaceC4339a interfaceC4339a) {
                this.f169795w = interfaceC4339a;
            }

            /* JADX INFO: renamed from: b */
            public final Object m126039b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f169795w.invoke();
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m126039b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: yd2.d$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f169796w;

            /* JADX INFO: renamed from: yd2.d$a$b$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42691a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f169797w;

                /* JADX INFO: renamed from: yd2.d$a$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.view.ShepherdHistoryKt$OnBottomReached$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "ShepherdHistory.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42692a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f169799F;

                    /* JADX INFO: renamed from: G */
                    Object f169800G;

                    /* JADX INFO: renamed from: H */
                    int f169801H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f169802w;

                    /* JADX INFO: renamed from: x */
                    int f169803x;

                    /* JADX INFO: renamed from: y */
                    Object f169804y;

                    /* JADX INFO: renamed from: z */
                    Object f169805z;

                    public C42692a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f169802w = obj;
                        this.f169803x |= Integer.MIN_VALUE;
                        return C42691a.this.emit(null, this);
                    }
                }

                public C42691a(InterfaceC13062m interfaceC13062m) {
                    this.f169797w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42692a c42692a;
                    if (interfaceC30057d instanceof C42692a) {
                        c42692a = (C42692a) interfaceC30057d;
                        int i13 = c42692a.f169803x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42692a.f169803x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42692a = new C42692a(interfaceC30057d);
                        }
                    } else {
                        c42692a = new C42692a(interfaceC30057d);
                    }
                    Object obj2 = c42692a.f169802w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42692a.f169803x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f169797w;
                        if (((Boolean) obj).booleanValue()) {
                            c42692a.f169804y = null;
                            c42692a.f169805z = null;
                            c42692a.f169799F = null;
                            c42692a.f169800G = null;
                            c42692a.f169801H = 0;
                            c42692a.f169803x = 1;
                            if (interfaceC13062m.emit(obj, c42692a) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC13058l interfaceC13058l) {
                this.f169796w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f169796w.collect(new C42691a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169793x = interfaceC28670t2;
            this.f169794y = interfaceC4339a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m126038h(InterfaceC28670t2 interfaceC28670t2) {
            return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169793x, this.f169794y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169792w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b bVar = new b(AbstractC28683x.m87240H(new C39461c(this.f169793x, 2)));
                C42690a c42690a = new C42690a(this.f169794y);
                this.f169792w = 1;
                if (bVar.collect(c42690a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yd2.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f169806w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C38210f c38210f) {
            return null;
        }
    }

    /* JADX INFO: renamed from: yd2.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f169807w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f169808x;

        public c(Function1 function1, List list) {
            this.f169807w = function1;
            this.f169808x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m126041a(int i13) {
            return this.f169807w.invoke(this.f169808x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m126041a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yd2.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f169809w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f169810x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f169811y;

        public d(List list, Function1 function1, Function1 function2) {
            this.f169809w = list;
            this.f169810x = function1;
            this.f169811y = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m126042a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C38210f c38210f = (C38210f) this.f169809w.get(i13);
            c28655q.m87150e0(-462170607);
            AbstractC39464f.m126057o(c38210f, this.f169810x, this.f169811y, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m126042a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m126022j(C38207c c38207c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-630458568);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c38207c) : c28655q.m87157i(c38207c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 6 * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 5 * 4, 7);
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c38207c.getIcon(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM3398t, c38072d.m121949b(c28655q, i15).getWhite30(), c28655q, 432, 0);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            TextResource textResourceM122419c = c38207c.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM122419c, c28655q, i16);
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i15).getH3();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t2, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 48, i17, 196088);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c38207c.getDescription(), c28655q, i16), null, c38072d.m121949b(c28655q, i15).getGreyL1(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i17, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(c38207c, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126023k(C38207c c38207c, int i13, Composer composer, int i14) {
        m126022j(c38207c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m126024l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-250280314);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m126025m(int i13, Composer composer, int i14) {
        m126024l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m126026n(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(25164799);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                i13 = 0;
            }
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C1020h(c26068u, str, i13, 4));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i16 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(interfaceC28670t2, interfaceC4339a, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
        } else {
            c28655q.m87138X();
        }
        int i18 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2069n(c26068u, i18, str, interfaceC4339a, i14, i15, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: o */
    public static final boolean m126027o(C26068u c26068u, String str, int i13) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return (interfaceC26054g == null || str == null || ((C26062o) interfaceC26054g).f103184a < (c26068u.m77565h().f103180n - i13) - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m126028p(C26068u c26068u, int i13, String str, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m126026n(c26068u, i13, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m126029q(C38217m paginatedHistoryViewState, boolean z4, Function1 onClickHistoryRecord, Function1 onClearByDateClicked, InterfaceC4339a onLoadMore, InterfaceC4339a onLoading, Composer composer, int i13) {
        int i14;
        boolean z13;
        AbstractC22676k.m65750j(paginatedHistoryViewState, "paginatedHistoryViewState");
        AbstractC22676k.m65750j(onClickHistoryRecord, "onClickHistoryRecord");
        AbstractC22676k.m65750j(onClearByDateClicked, "onClearByDateClicked");
        AbstractC22676k.m65750j(onLoadMore, "onLoadMore");
        AbstractC22676k.m65750j(onLoading, "onLoading");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-523528662);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(paginatedHistoryViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z13 = z4;
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onClickHistoryRecord) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onClearByDateClicked) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onLoadMore) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onLoading) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), f169791a);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i = c28655q.m87157i(paginatedHistoryViewState) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((i15 & 112) == 32) | ((57344 & i15) == 16384);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                C11012z c11012z = new C11012z(5, paginatedHistoryViewState, onLoadMore, onClickHistoryRecord, onClearByDateClicked, z13);
                c28655q.m87172p0(c11012z);
                objM87133R = c11012z;
            }
            AbstractC22674j.m65717c(modifierM3599a, c26068uM77569a, null, c22957g, c2305k, null, false, null, (Function1) objM87133R, c28655q, 221190, 460);
            c28655q = c28655q;
            String strM122488a = paginatedHistoryViewState.getNextToken();
            boolean z14 = (i15 & 458752) == 131072;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39461c(onLoading, 0);
                c28655q.m87172p0(objM87133R2);
            }
            m126026n(c26068uM77569a, 0, strM122488a, (InterfaceC4339a) objM87133R2, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(paginatedHistoryViewState, z4, onClickHistoryRecord, onClearByDateClicked, onLoadMore, onLoading, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m126030r(C38217m c38217m, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C38210f> listM122489b = c38217m.m122489b();
        b bVar = b.f169806w;
        ((C26053f) LazyColumn).m77529r(listM122489b.size(), null, new c(bVar, listM122489b), new C37816b(new d(listM122489b, function1, function2), true, 802480018));
        if (z4) {
            InterfaceC26064q.m77556b(LazyColumn, null, C39459a.f169785a.m126009b(), 3);
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m126031s(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m126032t(C38217m c38217m, boolean z4, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m126029q(c38217m, z4, function1, function2, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m126033u(C38211g historyViewState, boolean z4, Function1 onLoadMore, Function1 onClearAllClicked, Function1 onClickHistoryRecord, Function1 onClearByDateClicked, InterfaceC4339a onLoading, Composer composer, int i13) {
        int i14;
        int i15;
        int i16;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(historyViewState, "historyViewState");
        AbstractC22676k.m65750j(onLoadMore, "onLoadMore");
        AbstractC22676k.m65750j(onClearAllClicked, "onClearAllClicked");
        AbstractC22676k.m65750j(onClickHistoryRecord, "onClickHistoryRecord");
        AbstractC22676k.m65750j(onClearByDateClicked, "onClearByDateClicked");
        AbstractC22676k.m65750j(onLoading, "onLoading");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1727552898);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(historyViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onLoadMore) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onClearAllClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onClickHistoryRecord) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onClearByDateClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onLoading) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM122433e = historyViewState.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM122433e, c28655q, i17);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            int i19 = 2;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            C38208d c38208dM122431c = historyViewState.getShepherdHistoryClearAllViewState();
            if (c38208dM122431c == null) {
                c28655q.m87150e0(-1218524746);
                c28655q.m87173q(false);
                i15 = i17;
                i16 = i14;
                z13 = false;
                z14 = true;
            } else {
                c28655q.m87150e0(-1218524745);
                i15 = i17;
                i16 = i14;
                z13 = false;
                AbstractC27265l0.m82217i(null, EnumC27269n0.TextSmall, c38208dM122431c.getTitle(), null, new C39274g(c38208dM122431c.getIcon(), new TextResource.C8688b(AbstractC22415a.f87684a, null, i19, 0 == true ? 1 : 0)), historyViewState.getClearAllButtonEnabled(), null, null, false, false, null, null, onClearAllClicked, c28655q, (i17 << 6) | 48 | (C39274g.f168929c << 12), (i14 >> 3) & 896, 4041);
                c28655q = c28655q;
                c28655q.m87173q(false);
                z14 = true;
            }
            c28655q.m87173q(z14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, c2314t));
            C38207c c38207cM122430b = historyViewState.getShepherdEmptyHistoryViewState();
            if (c38207cM122430b == null) {
                c28655q.m87150e0(-1063429988);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1063429987);
                m126022j(c38207cM122430b, c28655q, i15);
                c28655q.m87173q(z13);
            }
            boolean z15 = z14;
            C38217m c38217mM122432d = historyViewState.getShepherdPaginatedHistoryViewState();
            if (c38217mM122432d == null) {
                c28655q.m87150e0(-1063292503);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1063292502);
                boolean zM87157i = c28655q.m87157i(c38217mM122432d) | ((i16 & 896) == 256 ? z15 : z13);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C37550r(21, c38217mM122432d, onLoadMore);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                int i24 = i16 >> 6;
                m126029q(c38217mM122432d, z4, onClickHistoryRecord, onClearByDateClicked, interfaceC4339a, onLoading, c28655q, (i16 & 112) | (i24 & 896) | (i24 & 7168) | ((i16 >> 3) & 458752));
                c28655q.m87173q(z13);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(historyViewState, z4, onLoadMore, onClearAllClicked, onClickHistoryRecord, onClearByDateClicked, onLoading, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m126034v(C38217m c38217m, Function1 function1) {
        String strM122488a = c38217m.getNextToken();
        if (strM122488a != null) {
            function1.invoke(strM122488a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m126035w(C38211g c38211g, boolean z4, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m126033u(c38211g, z4, function1, function2, function3, function4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
