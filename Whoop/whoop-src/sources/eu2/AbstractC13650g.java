package eu2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c41.AbstractC3992b0;
import c41.AbstractC4158z;
import c41.C3985a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import cu2.AbstractC11128h;
import cy1.C11186b;
import dw1.C12413a;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep1.C13412g;
import hu2.C17656c;
import hu2.C17658e;
import hu2.C17660g;
import hu2.C17661h;
import hu2.C17663j;
import hu2.C17664k;
import hu2.C17665l;
import hu2.C17667n;
import hu2.InterfaceC17654a;
import in2.C18733e;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import o11.AbstractC27407m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p291l0.C22976l1;
import p291l0.InterfaceC23001u;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p668z1.AbstractC39968q;
import p668z1.C39967p;
import p701ce2.C4494b;
import p711j31.AbstractC21275f;
import p711j31.AbstractC21277h;
import p711j31.C21273d;
import p711j31.C21280k;
import p711j31.Function2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r41.C30919c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eu2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aQ\u0010\r\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0001¢\u0006\u0004\b \u0010!\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "Leu2/p;", "workoutGroups", "Landroidx/compose/ui/Modifier;", "modifier", "Ln0/u;", "listState", "Lin2/e;", "initialListPosition", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "v", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Ln0/u;Lin2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "uncachedWorkoutGroups", "l", "(Ljava/util/List;Ln0/u;Lin2/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lj31/k;", "reorderableListState", "x", "(Lj31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "z", "(Lin2/e;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "group", "", "groupIndex", "viewEvent", "E", "(Leu2/p;ILjava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "T", "Lz1/p;", "D", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;", "Ly3/f;", "a", "F", "workoutGroupPadding", "", "scaleFactor", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13650g {

    /* JADX INFO: renamed from: a */
    private static final float f48357a = ((float) 1.5d) * 8;

    /* JADX INFO: renamed from: eu2.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f48358E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C13659p f48359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21280k f48360x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f48361y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C13659p> f48362z;

        /* JADX INFO: renamed from: eu2.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41570a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C13659p f48363w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f48364x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<C13659p> f48365y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ Function1 f48366z;

            public C41570a(C13659p c13659p, int i13, List<C13659p> list, Function1 function1) {
                this.f48363w = c13659p;
                this.f48364x = i13;
                this.f48365y = list;
                this.f48366z = function1;
            }

            /* JADX INFO: renamed from: a */
            public final void m38480a(Object viewEvent) {
                AbstractC22676k.m65750j(viewEvent, "viewEvent");
                AbstractC13650g.m38452E(this.f48363w, this.f48364x, this.f48365y, viewEvent, this.f48366z);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m38480a(obj);
                return C23454a0.f92919a;
            }
        }

        public a(C13659p c13659p, C21280k c21280k, int i13, List<C13659p> list, Function1 function1) {
            this.f48359w = c13659p;
            this.f48360x = c21280k;
            this.f48361y = i13;
            this.f48362z = list;
            this.f48358E = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m38479a(InterfaceC23001u ReorderableItem, boolean z4, Composer composer, int i13) {
            AbstractC22676k.m65750j(ReorderableItem, "$this$ReorderableItem");
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 129) != 128)) {
                c28655q.m87138X();
                return;
            }
            C13659p c13659p = this.f48359w;
            C21280k c21280k = this.f48360x;
            Integer numValueOf = Integer.valueOf(this.f48361y);
            boolean zM87157i = c28655q.m87157i(this.f48359w) | c28655q.m87149e(this.f48361y) | c28655q.m87157i(this.f48362z) | c28655q.m87153g(this.f48358E);
            C13659p c13659p2 = this.f48359w;
            int i14 = this.f48361y;
            List<C13659p> list = this.f48362z;
            Function1 function1 = this.f48358E;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C41570a(c13659p2, i14, list, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13658o.m38516f(null, c13659p, c21280k, numValueOf, (Function1) objM87133R, c28655q, C21280k.f81267t << 6, 1);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m38479a((InterfaceC23001u) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eu2.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4351m f48367w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f48368x;

        public b(InterfaceC4351m interfaceC4351m, List list) {
            this.f48367w = interfaceC4351m;
            this.f48368x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m38481a(int i13) {
            return this.f48367w.invoke(Integer.valueOf(i13), this.f48368x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m38481a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: eu2.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f48369w;

        public c(List list) {
            this.f48369w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m38482a(int i13) {
            this.f48369w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m38482a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: eu2.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f48370w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21280k f48371x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List f48372y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f48373z;

        public d(List list, C21280k c21280k, List list2, Function1 function1) {
            this.f48370w = list;
            this.f48371x = c21280k;
            this.f48372y = list2;
            this.f48373z = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m38483a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            int i16 = i15;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            int i17 = i16 & 126;
            C13659p c13659p = (C13659p) this.f48370w.get(i13);
            c28655q.m87150e0(1151176393);
            AbstractC21275f.m59698e(interfaceC1103a, this.f48371x, c13659p.getStateUpdateKey(), AbstractC12350b.m34565N(AbstractC13650g.m38470r(AbstractC11352g.m30588b(AbstractC22676k.m65745e(this.f48371x.m59778v(), c13659p.getStateUpdateKey()) ? 0.95f : 1.0f, null, null, null, c28655q, 0, 30)), AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, i13 == 0 ? 0 : 8, 0.0f, 0.0f, 13)), Integer.valueOf(i13), false, AbstractC37817c.m121344e(704884786, c28655q, new a(c13659p, this.f48371x, i13, this.f48372y, this.f48373z)), c28655q, (i16 & 14) | 1572864 | (C21280k.f81267t << 3) | ((i17 << 9) & 57344), 16);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m38483a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eu2.g$e */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.common.compose.EditableWorkoutGroupsKt$HandleReorderingUX$1$1", m100430f = "EditableWorkoutGroups.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC29805a f48374E;

        /* JADX INFO: renamed from: w */
        Object f48375w;

        /* JADX INFO: renamed from: x */
        int f48376x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21280k f48377y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f48378z;

        /* JADX INFO: renamed from: eu2.g$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f48379w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22669g0 f48380x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC29805a f48381y;

            public a(Function1 function1, C22669g0 c22669g0, InterfaceC29805a interfaceC29805a) {
                this.f48379w = function1;
                this.f48380x = c22669g0;
                this.f48381y = interfaceC29805a;
            }

            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (obj != null) {
                    this.f48379w.invoke(C17658e.f68513w);
                    if (this.f48380x.f89336w == null) {
                        this.f48381y.mo7428a(0);
                    }
                }
                this.f48380x.f89336w = obj;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C21280k c21280k, Function1 function1, InterfaceC29805a interfaceC29805a, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48377y = c21280k;
            this.f48378z = function1;
            this.f48374E = interfaceC29805a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Object m38485h(C21280k c21280k) {
            return c21280k.m59778v();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f48377y, this.f48378z, this.f48374E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48376x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C13651h(this.f48377y, 0));
                a aVar = new a(this.f48378z, c22669g0M32004w, this.f48374E);
                this.f48375w = null;
                this.f48376x = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: eu2.g$f */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.common.compose.EditableWorkoutGroupsKt$ScrollToInitialListPosition$1$1", m100430f = "EditableWorkoutGroups.kt", m100431l = {171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48382w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18733e f48383x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26068u f48384y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f48385z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C18733e c18733e, C26068u c26068u, Function1 function1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48383x = c18733e;
            this.f48384y = c26068u;
            this.f48385z = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f48383x, this.f48384y, this.f48385z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48382w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C18733e c18733e = this.f48383x;
                if (c18733e != null) {
                    C26068u c26068u = this.f48384y;
                    int iM54472b = c18733e.getFirstVisibleItemIndex();
                    int iM54473f = this.f48383x.getFirstVisibleItemOffset();
                    this.f48382w = 1;
                    if (c26068u.m77567j(iM54472b, iM54473f, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f48385z.invoke(C17661h.f68517w);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eu2.g$g */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.common.compose.EditableWorkoutGroupsKt$cacheAsStateList$1$1", m100430f = "EditableWorkoutGroups.kt", m100431l = {243}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48386w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f48387x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f48388y;

        /* JADX INFO: renamed from: eu2.g$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39967p f48389w;

            public a(C39967p c39967p) {
                this.f48389w = c39967p;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends T> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C39967p c39967p = this.f48389w;
                c39967p.getClass();
                boolean zM65745e = AbstractC22676k.m65745e(AbstractC39968q.m128190e(c39967p).f172504c, list);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (zM65745e) {
                    return c23454a0;
                }
                this.f48389w.clear();
                this.f48389w.addAll(list);
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC28670t2 interfaceC28670t2, C39967p c39967p, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48387x = interfaceC28670t2;
            this.f48388y = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final List m38487h(InterfaceC28670t2 interfaceC28670t2) {
            return (List) interfaceC28670t2.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f48387x, this.f48388y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48386w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36599i = AbstractC13091v.m36599i(AbstractC28683x.m87240H(new C13651h(this.f48387x, 1)), -1, 2);
                a aVar = new a(this.f48388y);
                this.f48386w = 1;
                if (interfaceC13058lM36599i.collect(aVar, this) == enumC31071a) {
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
    public static final C23454a0 m38448A(C18733e c18733e, C26068u c26068u, Function1 function1, int i13, Composer composer, int i14) {
        m38478z(c18733e, c26068u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final <T> C39967p m38451D(List<? extends T> list, Composer composer, int i13) {
        AbstractC22676k.m65750j(list, "<this>");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87242J(list);
            c28655q.m87172p0(objM87133R);
        }
        C39967p c39967p = (C39967p) objM87133R;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(list, c28655q);
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new g(interfaceC28601c1M87238F, c39967p, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28601c1M87238F);
        return c39967p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m38452E(C13659p c13659p, int i13, List<C13659p> list, Object obj, Function1 function1) {
        List<AbstractC27407m.b> listM38524c;
        if (obj instanceof C13655l) {
            C13655l c13655l = (C13655l) obj;
            function1.invoke(new C17664k(i13, c13655l.getExerciseIndex(), c13655l.getSetIndex(), c13655l.getNewRepsText()));
            return;
        }
        if (obj instanceof C13656m) {
            C13656m c13656m = (C13656m) obj;
            function1.invoke(new C17665l(i13, c13656m.getExerciseIndex(), c13656m.getSetIndex(), c13656m.getNewTimeText()));
            return;
        }
        if (obj instanceof C13657n) {
            C13657n c13657n = (C13657n) obj;
            function1.invoke(new C17667n(i13, c13657n.getExerciseIndex(), c13657n.getSetIndex(), c13657n.getNewWeightText()));
            return;
        }
        if (!(obj instanceof C13654k)) {
            if (obj instanceof C30919c) {
                return;
            }
            function1.invoke(obj);
            return;
        }
        C13654k c13654k = (C13654k) obj;
        boolean z4 = c13654k.getCurrentSetIndex() == AbstractC37056f.m118951C(c13659p.m38524c().get(c13654k.getCurrentExerciseIndex()).getExpandedContent().m82629m());
        AbstractC27407m.b bVar = (AbstractC27407m.b) AbstractC25265s.m74102I0(c13654k.getCurrentExerciseIndex() + 1, c13659p.m38524c());
        if (bVar == null) {
            C13659p c13659p2 = (C13659p) AbstractC25265s.m74102I0(i13 + 1, list);
            bVar = (c13659p2 == null || (listM38524c = c13659p2.m38524c()) == null) ? null : listM38524c.get(0);
        }
        if (!z4 || bVar == null || bVar.getIsExpanded()) {
            return;
        }
        function1.invoke(new C17660g(bVar.getId()));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x0178  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private static final void m38464l(List<C13659p> list, C26068u c26068u, C18733e c18733e, Modifier modifier, final Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        C26068u c26068u2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C39967p c39967pM38451D;
        final InterfaceC28601c1 interfaceC28601c1M87238F;
        int i17;
        boolean z13;
        boolean z14;
        Object objM87133R;
        boolean zM87153g;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        C21280k c21280kM59746a;
        Object obj;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-568002407);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c26068u) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(c18733e) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function1)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c39967pM38451D = m38451D(list, c28655q, i16 & 14);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c39967pM38451D, c28655q);
                boolean zM87153g2 = c28655q.m87153g(c39967pM38451D);
                i17 = 57344 & i16;
                if (i17 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g2 | z13;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C13648e(0, function1, c39967pM38451D);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
                zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    final int i24 = 0;
                    objM87133R2 = new InterfaceC4351m() { // from class: eu2.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i24) {
                                case 0:
                                    return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) interfaceC28601c1M87238F, (C21273d) obj2, (C21273d) obj3));
                                default:
                                    return AbstractC13650g.m38467o((Function1) interfaceC28601c1M87238F, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R2;
                if (i17 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15 || objM87133R3 == c28676v0) {
                    final int i25 = 1;
                    objM87133R3 = new InterfaceC4351m() { // from class: eu2.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i25) {
                                case 0:
                                    return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) function1, (C21273d) obj2, (C21273d) obj3));
                                default:
                                    return AbstractC13650g.m38467o((Function1) function1, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                int i26 = i16 & 112;
                Modifier modifier5 = modifier4;
                c26068u2 = c26068u;
                c21280kM59746a = Function2.m59746a(interfaceC4351m, c26068u2, interfaceC4351m2, (InterfaceC4351m) objM87133R3, 0.0f, null, c28655q, i26, 48);
                if (c21280kM59746a.m59778v() != null) {
                    obj = c39967pM38451D;
                } else {
                    obj = list;
                }
                m38476x(c21280kM59746a, function1, c28655q, C21280k.f81267t | ((i16 >> 9) & 112));
                int i27 = i16 >> 6;
                m38478z(c18733e, c26068u2, function1, c28655q, (i27 & 896) | (i27 & 14) | i26);
                C26068u listState = c21280kM59746a.getListState();
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f48357a, 1);
                Modifier modifierM59705b = AbstractC21277h.m59705b(modifier5, c21280kM59746a);
                if (c21280kM59746a.m59778v() == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i = c28655q.m87157i(obj) | c28655q.m87157i(c21280kM59746a);
                if (i17 == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i | z17;
                objM87133R4 = c28655q.m87133R();
                if (z18 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C13412g(obj, c21280kM59746a, function1, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22674j.m65717c(modifierM59705b, listState, c22976l1M3379a, null, null, null, z16, null, (Function1) objM87133R4, c28655q, 384, 376);
                modifier3 = modifier5;
            } else {
                c26068u2 = c26068u;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13646c(list, c26068u2, c18733e, modifier3, function1, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(function1)) {
                i18 = 16384;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c39967pM38451D = m38451D(list, c28655q, i16 & 14);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c39967pM38451D, c28655q);
            boolean zM87153g3 = c28655q.m87153g(c39967pM38451D);
            i17 = 57344 & i16;
            if (i17 == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87153g3 | z13;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z14) {
                objM87133R = new C13648e(0, function1, c39967pM38451D);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13648e(0, function1, c39967pM38451D);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R;
            zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                final int i28 = 0;
                objM87133R2 = new InterfaceC4351m() { // from class: eu2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i28) {
                            case 0:
                                return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) interfaceC28601c1M87238F, (C21273d) obj2, (C21273d) obj3));
                            default:
                                return AbstractC13650g.m38467o((Function1) interfaceC28601c1M87238F, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i29 = 0;
                objM87133R2 = new InterfaceC4351m() { // from class: eu2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i29) {
                            case 0:
                                return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) interfaceC28601c1M87238F, (C21273d) obj2, (C21273d) obj3));
                            default:
                                return AbstractC13650g.m38467o((Function1) interfaceC28601c1M87238F, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R2;
            if (i17 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                final int i210 = 1;
                objM87133R3 = new InterfaceC4351m() { // from class: eu2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i210) {
                            case 0:
                                return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) function1, (C21273d) obj2, (C21273d) obj3));
                            default:
                                return AbstractC13650g.m38467o((Function1) function1, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i211 = 1;
                objM87133R3 = new InterfaceC4351m() { // from class: eu2.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i211) {
                            case 0:
                                return Boolean.valueOf(AbstractC13650g.m38466n((InterfaceC28601c1) function1, (C21273d) obj2, (C21273d) obj3));
                            default:
                                return AbstractC13650g.m38467o((Function1) function1, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            int i212 = i16 & 112;
            Modifier modifier6 = modifier4;
            c26068u2 = c26068u;
            c21280kM59746a = Function2.m59746a(interfaceC4351m3, c26068u2, interfaceC4351m4, (InterfaceC4351m) objM87133R3, 0.0f, null, c28655q, i212, 48);
            if (c21280kM59746a.m59778v() != null) {
                obj = c39967pM38451D;
            } else {
                obj = list;
            }
            m38476x(c21280kM59746a, function1, c28655q, C21280k.f81267t | ((i16 >> 9) & 112));
            int i213 = i16 >> 6;
            m38478z(c18733e, c26068u2, function1, c28655q, (i213 & 896) | (i213 & 14) | i212);
            C26068u listState2 = c21280kM59746a.getListState();
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(0.0f, f48357a, 1);
            Modifier modifierM59705b2 = AbstractC21277h.m59705b(modifier6, c21280kM59746a);
            if (c21280kM59746a.m59778v() == null) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zM87157i2 = c28655q.m87157i(obj) | c28655q.m87157i(c21280kM59746a);
            if (i17 == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zM87157i2 | z17;
            objM87133R4 = c28655q.m87133R();
            if (z18) {
                objM87133R4 = new C13412g(obj, c21280kM59746a, function1, 1);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C13412g(obj, c21280kM59746a, function1, 1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22674j.m65717c(modifierM59705b2, listState2, c22976l1M3379a2, null, null, null, z16, null, (Function1) objM87133R4, c28655q, 384, 376);
            modifier3 = modifier6;
        } else {
            c26068u2 = c26068u;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13646c(list, c26068u2, c18733e, modifier3, function1, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m38465m(C39967p c39967p, Function1 function1, C21273d from, C21273d to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        c39967p.add(to3.m59692c(), c39967p.remove(from.m59692c()));
        function1.invoke(new C17663j(from.m59692c(), to3.m59692c()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m38466n(InterfaceC28670t2 interfaceC28670t2, C21273d c21273d, C21273d c21273d2) {
        AbstractC22676k.m65750j(c21273d, "<destruct>");
        AbstractC22676k.m65750j(c21273d2, "<unused var>");
        int index = c21273d.getIndex();
        return index < ((C39967p) interfaceC28670t2.getValue()).size() && ((C13659p) ((C39967p) interfaceC28670t2.getValue()).get(index)).getCanDragOver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m38467o(Function1 function1, int i13, int i14) {
        function1.invoke(InterfaceC17654a.y.f68488w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m38468p(List list, C21280k c21280k, final Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C12413a c12413a = new C12413a(10);
        ((C26053f) LazyColumn).m77529r(list.size(), new b(c12413a, list), new c(list), new C37816b(new d(list, c21280k, list, function1), true, 2039820996));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: eu2.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13650g.m38471s(function1, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            }
        }, true, 2070719534), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Object m38469q(int i13, C13659p group) {
        AbstractC22676k.m65750j(group, "group");
        return group.getStateUpdateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final float m38470r(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m38471s(Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C3985a0 c3985a0 = new C3985a0(null, AbstractC3992b0.b.f16256g, AbstractC8693b.m21277k(AbstractC11128h.f35456c), false, 0, null, null, 121, null);
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 1 * 8, 0.0f, 0.0f, 13);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13651h(function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC4158z.m12975d(c3985a0, modifierM3398t, null, null, (InterfaceC4339a) objM87133R, c28655q, C3985a0.f16213h | 48, 12);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m38472t(Function1 function1) {
        function1.invoke(C17656c.f68511w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m38473u(List list, C26068u c26068u, C18733e c18733e, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38464l(list, c26068u, c18733e, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m38474v(List<C13659p> workoutGroups, Modifier modifier, C26068u c26068u, C18733e c18733e, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C26068u c26068u2;
        C18733e c18733e2;
        C26068u c26068uM77569a;
        Modifier modifier3;
        C18733e c18733e3;
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1771107854);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(workoutGroups) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87153g(c26068u)) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(c18733e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if (i16 != 0) {
                    modifier = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    i15 &= -897;
                } else {
                    c26068uM77569a = c26068u;
                }
                if (i17 != 0) {
                    c18733e3 = null;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                }
                c28655q.m87175r();
                int i18 = i15 >> 3;
                m38464l(workoutGroups, c26068uM77569a, c18733e3, modifier3, onViewEvent, c28655q, (i15 & 14) | (i18 & 112) | (i18 & 896) | ((i15 << 6) & 7168) | (i15 & 57344), 0);
                c18733e2 = c18733e3;
                modifier2 = modifier3;
                c26068u2 = c26068uM77569a;
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                modifier3 = modifier;
                c26068uM77569a = c26068u;
            }
            c18733e3 = c18733e;
            c28655q.m87175r();
            int i19 = i15 >> 3;
            m38464l(workoutGroups, c26068uM77569a, c18733e3, modifier3, onViewEvent, c28655q, (i15 & 14) | (i19 & 112) | (i19 & 896) | ((i15 << 6) & 7168) | (i15 & 57344), 0);
            c18733e2 = c18733e3;
            modifier2 = modifier3;
            c26068u2 = c26068uM77569a;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            c26068u2 = c26068u;
            c18733e2 = c18733e;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13646c(workoutGroups, modifier2, c26068u2, c18733e2, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m38475w(List list, Modifier modifier, C26068u c26068u, C18733e c18733e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38474v(list, modifier, c26068u, c18733e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m38476x(C21280k c21280k, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(236609864);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21280k) : c28655q.m87157i(c21280k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC29805a interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
            boolean zM87157i = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c21280k))) | ((i14 & 112) == 32) | c28655q.m87157i(interfaceC29805a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new e(c21280k, function1, interfaceC29805a, null);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = C21280k.f81267t;
            AbstractC28683x.m87254h(c21280k, interfaceC29805a, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(c21280k, function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m38477y(C21280k c21280k, Function1 function1, int i13, Composer composer, int i14) {
        m38476x(c21280k, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m38478z(C18733e c18733e, C26068u c26068u, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-881368905);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c18733e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c26068u) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87157i = c28655q.m87157i(c18733e) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new f(c18733e, c26068u, function1, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 8, c18733e, c26068u, function1);
        }
    }
}
