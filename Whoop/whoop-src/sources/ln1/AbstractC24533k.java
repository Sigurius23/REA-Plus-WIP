package ln1;

import an1.AbstractC1057a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e41.C12704i;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import eu2.C13648e;
import ge3.AbstractC15751g;
import ih1.C18522f;
import in1.InterfaceC18722b;
import in1.InterfaceC18724d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import java.util.ListIterator;
import jp2.C21881l;
import l72.C23407n;
import l83.C23454a0;
import lf0.C23956p1;
import live.hms.video.utils.C24405c;
import n83.C26459b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23016z;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23013y;
import p31.AbstractC28805p;
import p31.C28801l;
import p31.EnumC28807r;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p668z1.C39967p;
import p711j31.AbstractC21270a;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ln1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, m65681d2 = {"Ll0/y;", "Lin1/d$c;", "viewState", "Ln0/u;", "listState", "Lkotlin/Function1;", "Lin1/b;", "Ll83/a0;", "onViewEvent", "m", "(Ll0/y;Lin1/d$c;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "T", "", "Lz1/p;", "z", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;", "originalList", "cachedList", "Lj31/k;", "reorderableListState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/util/List;Lz1/p;Lj31/k;Landroidx/compose/runtime/Composer;I)V", "k", "(Lj31/k;Landroidx/compose/runtime/Composer;I)V", "", "scaleFactor", "home-customization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24533k {

    /* JADX INFO: renamed from: ln1.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.view.CustomizeOverviewScreenContentKt$HandleReorderingUX$1$1", m100430f = "CustomizeOverviewScreenContent.kt", m100431l = {228}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f95705w;

        /* JADX INFO: renamed from: x */
        int f95706x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21280k f95707y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC29805a f95708z;

        /* JADX INFO: renamed from: ln1.k$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41955a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f95709w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC29805a f95710x;

            public C41955a(C22669g0 c22669g0, InterfaceC29805a interfaceC29805a) {
                this.f95709w = c22669g0;
                this.f95710x = interfaceC29805a;
            }

            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (obj != null && this.f95709w.f89336w == null) {
                    this.f95710x.mo7428a(0);
                }
                this.f95709w.f89336w = obj;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21280k c21280k, InterfaceC29805a interfaceC29805a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95707y = c21280k;
            this.f95708z = interfaceC29805a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Object m71474h(C21280k c21280k) {
            return c21280k.m59778v();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f95707y, this.f95708z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95706x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C24532j(this.f95707y, 0));
                C41955a c41955a = new C41955a(c22669g0M32004w, this.f95708z);
                this.f95705w = null;
                this.f95706x = 1;
                if (c13084s1M87240H.collect(c41955a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ln1.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12704i f95711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f95712x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f95713y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21280k f95714z;

        /* JADX INFO: renamed from: ln1.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function3 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21280k f95715w;

            public a(C21280k c21280k) {
                this.f95715w = c21280k;
            }

            /* JADX INFO: renamed from: a */
            public final Modifier m71476a(C12704i unused$var$, Composer composer, int i13) {
                AbstractC22676k.m65750j(unused$var$, "$unused$var$");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-2096874675);
                Modifier modifierM59681a = AbstractC21270a.m59681a(C2314t.f9131w, this.f95715w);
                c28655q.m87173q(false);
                return modifierM59681a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m71476a((C12704i) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX INFO: renamed from: ln1.k$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41956b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f95716w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f95717x;

            public C41956b(Function1 function1, int i13) {
                this.f95716w = function1;
                this.f95717x = i13;
            }

            /* JADX INFO: renamed from: a */
            public final void m71477a(Object it) {
                AbstractC22676k.m65750j(it, "it");
                this.f95716w.invoke(new InterfaceC18722b.d(this.f95717x));
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m71477a(obj);
                return C23454a0.f92919a;
            }
        }

        public b(C12704i c12704i, Function1 function1, int i13, C21280k c21280k) {
            this.f95711w = c12704i;
            this.f95712x = function1;
            this.f95713y = i13;
            this.f95714z = c21280k;
        }

        /* JADX INFO: renamed from: a */
        public final void m71475a(InterfaceC23001u ReorderableItem, boolean z4, Composer composer, int i13) {
            AbstractC22676k.m65750j(ReorderableItem, "$this$ReorderableItem");
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 129) != 128)) {
                c28655q.m87138X();
                return;
            }
            C12704i c12704i = this.f95711w;
            a aVar = new a(this.f95714z);
            boolean zM87153g = c28655q.m87153g(this.f95712x) | c28655q.m87149e(this.f95713y);
            Function1 function1 = this.f95712x;
            int i14 = this.f95713y;
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C41956b(function1, i14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c12704i, null, aVar, (Function1) objM87133R, c28655q, C12704i.f43436m, 2);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m71475a((InterfaceC23001u) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ln1.k$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f95718w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f95719x;

        public c(Function1 function1, int i13) {
            this.f95718w = function1;
            this.f95719x = i13;
        }

        /* JADX INFO: renamed from: a */
        public final void m71478a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            this.f95718w.invoke(new InterfaceC18722b.a(this.f95719x));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m71478a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ln1.k$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4351m f95720w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f95721x;

        public d(InterfaceC4351m interfaceC4351m, List list) {
            this.f95720w = interfaceC4351m;
            this.f95721x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m71479a(int i13) {
            return this.f95720w.invoke(Integer.valueOf(i13), this.f95721x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m71479a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ln1.k$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f95722w;

        public e(List list) {
            this.f95722w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m71480a(int i13) {
            this.f95722w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m71480a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ln1.k$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f95723E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f95724w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21280k f95725x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f95726y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f95727z;

        public f(List list, C21280k c21280k, C39967p c39967p, int i13, Function1 function1) {
            this.f95724w = list;
            this.f95725x = c21280k;
            this.f95726y = c39967p;
            this.f95727z = i13;
            this.f95723E = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m71481a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C12704i c12704i = (C12704i) this.f95724w.get(i13);
            c28655q.m87150e0(-2030303621);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(AbstractC22676k.m65745e(this.f95725x.m59778v(), c12704i.getId()) ? 0.95f : 1.0f, null, "", null, c28655q, 3072, 22);
            ListIterator listIterator = this.f95726y.listIterator();
            int i16 = 0;
            while (true) {
                C26459b c26459b = (C26459b) listIterator;
                if (!c26459b.hasNext()) {
                    i16 = -1;
                    break;
                } else if (AbstractC22676k.m65745e(((C12704i) c26459b.next()).getId(), c12704i.getId())) {
                    break;
                } else {
                    i16++;
                }
            }
            int i17 = this.f95727z;
            int i18 = i16 >= 0 ? i16 + i17 : i13 + i17;
            String id4 = c12704i.getId();
            float fM71465s = AbstractC24533k.m71465s(interfaceC28670t2M30588b);
            C2314t c2314t = C2314t.f9131w;
            AbstractC21275f.m59698e(interfaceC1103a, this.f95725x, id4, AbstractC12350b.m34565N(fM71465s, c2314t), Integer.valueOf(i18), false, AbstractC37817c.m121344e(-23915632, c28655q, new b(c12704i, this.f95723E, i13, this.f95725x)), c28655q, (i15 & 14) | 1572864 | (C21280k.f81267t << 3), 16);
            AbstractC25012a.m73388u((float) 1.5d, 8, c2314t, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m71481a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ln1.k$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f95728w;

        public g(List list) {
            this.f95728w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m71482a(int i13) {
            this.f95728w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m71482a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ln1.k$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f95729w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f95730x;

        public h(List list, Function1 function1) {
            this.f95729w = list;
            this.f95730x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m71483a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            C12704i c12704i = (C12704i) this.f95729w.get(i13);
            c28655q.m87150e0(-1863144873);
            boolean zM87153g = c28655q.m87153g(this.f95730x);
            if ((((i15 & 112) ^ 48) <= 32 || !c28655q.m87149e(i13)) && (i15 & 48) != 32) {
                z4 = false;
            }
            boolean z13 = zM87153g | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f95730x, i13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c12704i, null, null, (Function1) objM87133R, c28655q, C12704i.f43436m, 6);
            AbstractC25012a.m73388u((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m71483a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ln1.k$i */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.view.CustomizeOverviewScreenContentKt$SetupDragProtection$1$1", m100430f = "CustomizeOverviewScreenContent.kt", m100431l = {202}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95731w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f95732x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21280k f95733y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39967p f95734z;

        /* JADX INFO: renamed from: ln1.k$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21280k f95735w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39967p f95736x;

            public a(C21280k c21280k, C39967p c39967p) {
                this.f95735w = c21280k;
                this.f95736x = c39967p;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends T> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (this.f95735w.m59778v() == null) {
                    this.f95736x.clear();
                    this.f95736x.addAll(list);
                } else if (this.f95736x.size() == list.size() && !AbstractC22676k.m65745e(this.f95736x, list)) {
                    this.f95736x.clear();
                    this.f95736x.addAll(list);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC28670t2 interfaceC28670t2, C21280k c21280k, C39967p c39967p, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95732x = interfaceC28670t2;
            this.f95733y = c21280k;
            this.f95734z = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final List m71485h(InterfaceC28670t2 interfaceC28670t2) {
            return (List) interfaceC28670t2.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f95732x, this.f95733y, this.f95734z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95731w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C24534l(this.f95732x, 0));
                a aVar = new a(this.f95733y, this.f95734z);
                this.f95731w = 1;
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

    /* JADX INFO: renamed from: ln1.k$j */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.view.CustomizeOverviewScreenContentKt$cacheAsStateList$1$1", m100430f = "CustomizeOverviewScreenContent.kt", m100431l = {184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95737w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f95738x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f95739y;

        /* JADX INFO: renamed from: ln1.k$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39967p f95740w;

            public a(C39967p c39967p) {
                this.f95740w = c39967p;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends T> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f95740w.clear();
                this.f95740w.addAll(list);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC28670t2 interfaceC28670t2, C39967p c39967p, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95738x = interfaceC28670t2;
            this.f95739y = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final List m71488h(InterfaceC28670t2 interfaceC28670t2) {
            return (List) interfaceC28670t2.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f95738x, this.f95739y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95737w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C24534l(this.f95738x, 1));
                a aVar = new a(this.f95739y);
                this.f95737w = 1;
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

    /* JADX INFO: renamed from: k */
    private static final void m71457k(C21280k c21280k, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1798225708);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21280k) : c28655q.m87157i(c21280k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 0;
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC29805a interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
            if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(c21280k))) {
                z4 = false;
            }
            boolean zM87157i = c28655q.m87157i(interfaceC29805a) | z4;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c21280k, interfaceC29805a, null);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = C21280k.f81267t;
            AbstractC28683x.m87254h(c21280k, interfaceC29805a, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24530h(c21280k, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m71458l(C21280k c21280k, int i13, Composer composer, int i14) {
        m71457k(c21280k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m71459m(InterfaceC23013y interfaceC23013y, InterfaceC18724d.c viewState, C26068u listState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(473309234);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(listState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            List<C12704i> listM54463b = viewState.getPinnedSection().m54463b();
            C39967p c39967pM71472z = m71472z(listM54463b, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c39967pM71472z, c28655q);
            int i15 = i14 & 7168;
            boolean zM87153g = c28655q.m87153g(c39967pM71472z) | (i15 == 2048);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C13648e(1, onViewEvent, c39967pM71472z);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24527e(interfaceC28601c1M87238F, 1);
                c28655q.m87172p0(objM87133R2);
            }
            C21280k c21280kM59746a = Function2.m59746a(interfaceC4351m, listState, (InterfaceC4351m) objM87133R2, null, 0.0f, null, c28655q, (i14 >> 3) & 112, 56);
            int i16 = C21280k.f81267t;
            m71469w(listM54463b, c39967pM71472z, c21280kM59746a, c28655q, i16 << 6);
            m71457k(c21280kM59746a, c28655q, i16);
            float f13 = 2 * 8;
            Modifier modifierM59705b = AbstractC21277h.m59705b(AbstractC1099a.m3398t(((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f), f13, 0.0f, f13, 0.0f, 10), c21280kM59746a);
            C26068u c26068uM59738g0 = c21280kM59746a.getListState();
            boolean z4 = c21280kM59746a.m59778v() == null;
            boolean zM87157i = c28655q.m87157i(viewState) | (i15 == 2048) | c28655q.m87153g(c39967pM71472z) | c28655q.m87157i(c21280kM59746a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                C21881l c21881l = new C21881l(c39967pM71472z, viewState, onViewEvent, c21280kM59746a, 8);
                c28655q.m87172p0(c21881l);
                objM87133R3 = c21881l;
            }
            AbstractC22674j.m65717c(modifierM59705b, c26068uM59738g0, null, null, null, null, z4, null, (Function1) objM87133R3, c28655q, 0, 380);
            c28655q = c28655q;
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC1057a.f4127k);
            boolean zM87157i2 = (i15 == 2048) | c28655q.m87157i(viewState);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                function1 = onViewEvent;
                objM87133R4 = new C24529g(function1, viewState, 0);
                c28655q.m87172p0(objM87133R4);
            } else {
                function1 = onViewEvent;
            }
            AbstractC24540r.m71553f(strM92103Y, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(i13, 14, interfaceC23013y, viewState, listState, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m71460n(C39967p c39967p, int i13, Function1 function1, C21273d from, C21273d to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        c39967p.add(to3.m59692c() - i13, c39967p.remove(from.m59692c() - i13));
        function1.invoke(new InterfaceC18722b.e(from.m59692c() - i13, to3.m59692c() - i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m71461o(InterfaceC28670t2 interfaceC28670t2, int i13, C21273d c21273d, C21273d c21273d2) {
        AbstractC22676k.m65750j(c21273d, "<destruct>");
        AbstractC22676k.m65750j(c21273d2, "<unused var>");
        int iM59690a = c21273d.getIndex();
        c21273d.getKey();
        return iM59690a <= (((C39967p) interfaceC28670t2.getValue()).size() + i13) - 1 && iM59690a >= i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m71462p(C39967p c39967p, InterfaceC18724d.c cVar, Function1 function1, C21280k c21280k, int i13, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C18522f(21, cVar, function1), true, 857397181), 3);
        C24405c c24405c = new C24405c(25);
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(c39967p.size(), new d(c24405c, c39967p), new e(c39967p), new C37816b(new f(c39967p, c21280k, c39967p, i13, function1), true, 2039820996));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C24531i(cVar, 0), true, 1137455014), 3);
        List<C12704i> listM54463b = cVar.getUnpinnedSection().m54463b();
        c26053f.m77529r(listM54463b.size(), null, new g(listM54463b), new C37816b(new h(listM54463b, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m71463q(InterfaceC18724d.c cVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            cVar.m54457c();
            c28655q.m87150e0(548991173);
            c28655q.m87173q(false);
            DefaultConstructorMarker defaultConstructorMarker = null;
            AbstractC25303l.m74291r(new C28801l(new AbstractC28805p.a(cVar.getPinnedSection().getHeader(), null, EnumC28807r.LARGE, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null), defaultConstructorMarker, 2, defaultConstructorMarker), null, null, null, c28655q, C28801l.f116582c, 14);
            AbstractC11266d.m30469w((float) 1.5d, 8, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Object m71464r(int i13, C12704i tile) {
        AbstractC22676k.m65750j(tile, "tile");
        return tile.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final float m71465s(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m71466t(InterfaceC18724d.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(3, f13, c2314t, c28655q);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String strM21274h = AbstractC8693b.m21274h(cVar.getUnpinnedSection().getHeader(), c28655q, TextResource.$stable);
            C2886a c2886aM8438s = AbstractC2890e.m8450e().getH5();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, C2886a.f11498d << 18, 196602);
            float f14 = 1;
            AbstractC15751g.m44449b(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f14, c2314t)), f14 * f13, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i14).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
            c28655q.m87173q(true);
            AbstractC11266d.m30469w((float) 1.5d, f13, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m71467u(Function1 function1, InterfaceC18724d.c cVar) {
        function1.invoke(new InterfaceC18722b.f(cVar));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m71468v(InterfaceC23013y interfaceC23013y, InterfaceC18724d.c cVar, C26068u c26068u, Function1 function1, int i13, Composer composer, int i14) {
        m71459m(interfaceC23013y, cVar, c26068u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final <T> void m71469w(List<? extends T> list, C39967p c39967p, C21280k c21280k, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1448600985);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c39967p) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c21280k) : c28655q.m87157i(c21280k) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(list, c28655q);
            boolean zM87153g = ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q.m87157i(c21280k))) | c28655q.m87153g(interfaceC28601c1M87238F) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new i(interfaceC28601c1M87238F, c21280k, c39967p, null);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = C21280k.f81267t;
            AbstractC28683x.m87254h(list, c21280k, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(list, c39967p, c21280k, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m71470x(List list, C39967p c39967p, C21280k c21280k, int i13, Composer composer, int i14) {
        m71469w(list, c39967p, c21280k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final <T> C39967p m71472z(List<? extends T> list, Composer composer, int i13) {
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
            objM87133R2 = new j(interfaceC28601c1M87238F, c39967p, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28601c1M87238F);
        return c39967p;
    }
}
