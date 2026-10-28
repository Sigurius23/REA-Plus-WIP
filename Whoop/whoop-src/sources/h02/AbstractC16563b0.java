package h02;

import ai1.C0910b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2194o;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagStyle;
import ep1.C13412g;
import f01.C13845b;
import f02.C13917c;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import jz0.AbstractC22070c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.b0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/c0;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Landroidx/compose/ui/Modifier;Lh02/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lkd1/o;", "layers", "Lh02/d0;", "productTag", "i", "(Ljava/util/List;Lh02/d0;Landroidx/compose/runtime/Composer;I)V", "", "index", "Lq0/y;", "pagerState", "p", "(Ljava/util/List;ILq0/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;", "Ly81/e;", "v", "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;)Ly81/e;", "textColor", "Li91/a;", "u", "(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryTagStyle;)Li91/a;", "background", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16563b0 {

    /* JADX INFO: renamed from: h02.b0$a */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.view.ProductImageGalleryItemKt$ProductImageGallery$1$1", m100430f = "ProductImageGalleryItem.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f63744w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f63745x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC29701y abstractC29701y, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f63745x = abstractC29701y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f63745x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f63744w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29701y abstractC29701y = this.f63745x;
                this.f63744w = 1;
                if (AbstractC29701y.m91158v(abstractC29701y, 0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: h02.b0$b */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.view.ProductImageGalleryItemKt$ProductImageGallery$2$1", m100430f = "ProductImageGalleryItem.kt", m100431l = {125, 127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f63746E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C26068u f63747F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ AbstractC29701y f63748G;

        /* JADX INFO: renamed from: w */
        Object f63749w;

        /* JADX INFO: renamed from: x */
        Object f63750x;

        /* JADX INFO: renamed from: y */
        int f63751y;

        /* JADX INFO: renamed from: z */
        int f63752z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26068u c26068u, AbstractC29701y abstractC29701y, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f63747F = c26068u;
            this.f63748G = abstractC29701y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f63747F, this.f63748G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        
            if (p180h0.AbstractC16444q3.m46621c(r9.f63747F, r4, p077d0.AbstractC11348f.m30573u(0.0f, 0.0f, 7, null), r9) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            if (r10.m77563f(r2, 0, r9) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f63746E
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L21
                if (r1 == r2) goto L15
                if (r1 != r3) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L15:
                java.lang.Object r0 = r9.f63750x
                n0.g r0 = (p329n0.InterfaceC26054g) r0
                java.lang.Object r0 = r9.f63749w
                n0.n r0 = (p329n0.C26061n) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L8e
            L21:
                p505ts.AbstractC34132o.m107864I(r10)
                n0.u r10 = r9.f63747F
                n0.n r10 = r10.m77565h()
                int r1 = r10.f103179m
                int r4 = r10.f103178l
                int r1 = r1 - r4
                java.lang.Object r10 = r10.f103177k
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                q0.y r4 = r9.f63748G
                java.util.Iterator r10 = r10.iterator()
            L39:
                boolean r5 = r10.hasNext()
                r6 = 0
                if (r5 == 0) goto L52
                java.lang.Object r5 = r10.next()
                r7 = r5
                n0.g r7 = (p329n0.InterfaceC26054g) r7
                n0.o r7 = (p329n0.C26062o) r7
                int r7 = r7.f103184a
                int r8 = r4.m91167q()
                if (r7 != r8) goto L39
                goto L53
            L52:
                r5 = r6
            L53:
                n0.g r5 = (p329n0.InterfaceC26054g) r5
                if (r5 == 0) goto L76
                n0.o r5 = (p329n0.C26062o) r5
                int r10 = r5.f103198o
                int r4 = r5.f103199p
                int r4 = r4 / r3
                int r4 = r4 + r10
                int r10 = r1 / 2
                int r4 = r4 - r10
                n0.u r10 = r9.f63747F
                float r3 = (float) r4
                r9.f63749w = r6
                r9.f63750x = r6
                r9.f63751y = r1
                r9.f63752z = r4
                r9.f63746E = r2
                java.lang.Object r10 = p180h0.AbstractC16444q3.m46622d(r10, r3, r9)
                if (r10 != r0) goto L8e
                goto L8d
            L76:
                n0.u r10 = r9.f63747F
                q0.y r2 = r9.f63748G
                int r2 = r2.m91167q()
                r9.f63749w = r6
                r9.f63750x = r6
                r9.f63751y = r1
                r9.f63746E = r3
                r1 = 0
                java.lang.Object r10 = r10.m77563f(r2, r1, r9)
                if (r10 != r0) goto L8e
            L8d:
                return r0
            L8e:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: h02.AbstractC16563b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: h02.b0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f63753w;

        public c(List list) {
            this.f63753w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m46915a(int i13) {
            this.f63753w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m46915a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h02.b0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f63754w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f63755x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f63756y;

        public d(List list, AbstractC29701y abstractC29701y, Function1 function1) {
            this.f63754w = list;
            this.f63755x = abstractC29701y;
            this.f63756y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m46916a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            List list = (List) this.f63754w.get(i13);
            c28655q.m87150e0(-164377522);
            AbstractC16563b0.m46908p(list, i13, this.f63755x, this.f63756y, c28655q, i15 & 112);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m46916a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h02.b0$e */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.view.ProductImageGalleryItemKt$ThumbnailImage$1$1$1", m100430f = "ProductImageGalleryItem.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f63757w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f63758x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f63759y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f63758x = abstractC29701y;
            this.f63759y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f63758x, this.f63759y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f63757w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29701y abstractC29701y = this.f63758x;
                int i14 = this.f63759y;
                this.f63757w = 1;
                if (AbstractC29701y.m91155g(abstractC29701y, i14, null, this, 6) == enumC31071a) {
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

    /* JADX INFO: renamed from: h02.b0$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63760a;

        static {
            int[] iArr = new int[ProductImageGalleryTagStyle.values().length];
            try {
                iArr[ProductImageGalleryTagStyle.SALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductImageGalleryTagStyle.COMING_SOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductImageGalleryTagStyle.OUT_OF_STOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductImageGalleryTagStyle.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f63760a = iArr;
        }
    }

    /* JADX INFO: renamed from: h02.b0$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f63761w = new g();

        /* JADX INFO: renamed from: a */
        public final long m46917a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46917a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h02.b0$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f63762w = new h();

        /* JADX INFO: renamed from: a */
        public final long m46918a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46918a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h02.b0$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f63763w = new i();

        /* JADX INFO: renamed from: a */
        public final long m46919a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46919a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h02.b0$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f63764w = new j();

        /* JADX INFO: renamed from: a */
        public final long m46920a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46920a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h02.b0$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f63765w = new k();

        /* JADX INFO: renamed from: a */
        public final long m46921a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46921a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h02.b0$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f63766w = new l();

        /* JADX INFO: renamed from: a */
        public final long m46922a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46922a((C39336i) obj));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    private static final void m46901i(List<? extends AbstractC22403o> list, C16567d0 c16567d0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1482834802);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c16567d0) : c28655q.m87157i(c16567d0) ? 32 : 16;
        }
        char c3 = 18;
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1334875038);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C28655q c28655q2 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0.0f, null, c28655q2, 432, 120);
                c28655q = c28655q2;
                c2314t = c2314t;
                z4 = z4;
                c3 = c3;
            }
            boolean z13 = z4;
            C2314t c2314t2 = c2314t;
            c28655q.m87173q(z13);
            if (c16567d0 == null) {
                c28655q.m87150e0(-1568309197);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1568309196);
                float f13 = 3;
                float f14 = 8;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16567d0.getText(), c28655q, TextResource.$stable), AbstractC1099a.m3395q(AbstractC18249c.m52565c(AbstractC18489d0.m53364e(AbstractC1099a.m3394p(f13 * f14, c2314t2), f13, 4), m46913u(c16567d0.getStyle())), ((float) 1.5d) * f14, 1 * f14), m46914v(c16567d0.getStyle()).mo134584toComposableColorWaAFU9c(c28655q, z13 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1(), null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q3;
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(list, c16567d0, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46902j(List list, C16567d0 c16567d0, int i13, Composer composer, int i14) {
        m46901i(list, c16567d0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0339  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0211  */
    /* JADX WARN: Code duplicated, block: B:83:0x021e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0284  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0326  */
    /* JADX WARN: Code duplicated, block: B:96:0x0328  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static final void m46903k(Modifier modifier, C16565c0 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function1;
        ?? r14;
        float f13;
        ?? r10;
        int i16;
        int iHashCode;
        int iHashCode2;
        ?? r15;
        C28676v0 c28676v0;
        C29674b c29674b;
        C26068u c26068u;
        boolean z4;
        Modifier modifier3;
        int i17;
        int i18;
        List list;
        ?? r16;
        C29674b c29674b2;
        ?? r17;
        ?? r18;
        Object obj;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1672347068);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            List<List<AbstractC22403o>> listM46935e = state.m46935e();
            boolean zM87157i = c28655q.m87157i(listM46935e);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            Object obj2 = objM87133R;
            if (zM87157i || objM87133R == c28676v1) {
                C16602z c16602z = new C16602z(listM46935e, 0);
                c28655q.m87172p0(c16602z);
                obj2 = c16602z;
            }
            C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) obj2, 0, 6, c28655q, 2);
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            List<AbstractC22403o> listM46934c = state.m46934c();
            List<List<AbstractC22403o>> listM46937g = state.m46937g();
            Integer numValueOf = listM46937g != null ? Integer.valueOf(listM46937g.size()) : null;
            boolean zM87153g = c28655q.m87153g(c29674bM91150b);
            Object objM87133R2 = c28655q.m87133R();
            Object obj3 = objM87133R2;
            if (zM87153g || objM87133R2 == c28676v1) {
                a aVar = new a(c29674bM91150b, null);
                c28655q.m87172p0(aVar);
                obj3 = aVar;
            }
            AbstractC28683x.m87254h(listM46934c, numValueOf, (InterfaceC4351m) obj3, c28655q);
            Integer numValueOf2 = Integer.valueOf(c29674bM91150b.m91167q());
            boolean zM87153g2 = c28655q.m87153g(c26068uM77569a) | c28655q.m87153g(c29674bM91150b);
            Object objM87133R3 = c28655q.m87133R();
            Object obj4 = objM87133R3;
            if (zM87153g2 || objM87133R3 == c28676v1) {
                b bVar = new b(c26068uM77569a, c29674bM91150b, null);
                c28655q.m87172p0(bVar);
                obj4 = bVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj4, numValueOf2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C2305k c2305k = C2299e.f9111N;
            float f14 = 8;
            float f15 = 2 * f14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i24 = i15;
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
            if (c28655q.f115903S) {
                f13 = f15;
            } else {
                f13 = f15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                r10 = C38072d.f163053a;
                i16 = C38072d.f163054b;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f2, r10.m121949b(c28655q, i16).getGreyL6(), AbstractC17918w0.f69621a);
                float f16 = 3 * f14;
                Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3358c, 0.0f, f16, 1);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3411h = AbstractC1102d.m3411h(80 * 4, AbstractC1102d.m3409f(1.0f, modifier2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (listM46935e.size() > 1) {
                    c28655q.m87150e0(507565364);
                    c29674b = c29674bM91150b;
                    Modifier modifier4 = modifier2;
                    i17 = i16;
                    modifier3 = modifier4;
                    c26068u = c26068uM77569a;
                    c28676v0 = c28676v1;
                    i18 = i24;
                    r15 = 1;
                    z4 = false;
                    AbstractC12240d.m34066d(c29674b, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(-49154606, c28655q, new C2194o(2, listM46935e, state)), c28655q, 48, 24576, 16380);
                    C28655q c28655q2 = c28655q;
                    c28655q2.m87173q(false);
                    r16 = c28655q2;
                } else {
                    r15 = 1;
                    c28676v0 = c28676v1;
                    c29674b = c29674bM91150b;
                    c26068u = c26068uM77569a;
                    z4 = false;
                    modifier3 = modifier2;
                    i17 = i16;
                    i18 = i24;
                    c28655q.m87150e0(508066169);
                    list = (List) AbstractC25265s.m74100H0(listM46935e);
                    if (list == null) {
                        c28655q.m87150e0(508066168);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(508066169);
                        m46901i(list, state.getProductTag(), c28655q, TextResource.$stable << 3);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    r16 = c28655q;
                }
                r16.m87173q(r15);
                if (listM46935e.size() > r15) {
                    r16.m87150e0(-111067316);
                    C29674b c29674b3 = c29674b;
                    c29674b2 = c29674b3;
                    AbstractC22070c.m63138d(listM46935e.size(), c29674b3.m91167q(), null, r25.m121949b(r16, i17).getBlack20(), r10.m121949b(r16, i17).getBrandBlack(), r16, 0, 4);
                    r16.m87173q(z4);
                } else {
                    c29674b2 = c29674b;
                    r16.m87150e0(-110784782);
                    r16.m87173q(z4);
                }
                r16.m87173q(r15);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f13, 0.0f, 2);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                int i25 = (r16.m87157i(listM46935e) ? 1 : 0) | (r16.m87153g(c29674b2) ? 1 : 0);
                if ((i18 & 896) == 256) {
                    r17 = r15;
                } else {
                    r17 = z4;
                }
                r18 = i25 | r17;
                Object objM87133R4 = r16.m87133R();
                if (r18 == 0 || objM87133R4 == c28676v0) {
                    function1 = onViewEvent;
                    C13412g c13412g = new C13412g(listM46935e, c29674b2, function1, 20);
                    r16.m87172p0(c13412g);
                    obj = c13412g;
                } else {
                    function1 = onViewEvent;
                    obj = objM87133R4;
                }
                ?? r24 = r16;
                AbstractC22674j.m65718d(modifierM3409f3, c26068u, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) obj, r24, 24966, 488);
                ?? r19 = r24;
                r19.m87173q(r15);
                modifier2 = modifier3;
                r14 = r19;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            r10 = C38072d.f163053a;
            i16 = C38072d.f163054b;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3409f4, r10.m121949b(c28655q, i16).getGreyL6(), AbstractC17918w0.f69621a);
            float f17 = 3 * f14;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifierM3358c2, 0.0f, f17, 1);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(80 * 4, AbstractC1102d.m3409f(1.0f, modifier2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            if (listM46935e.size() > 1) {
                c28655q.m87150e0(507565364);
                c29674b = c29674bM91150b;
                Modifier modifier5 = modifier2;
                i17 = i16;
                modifier3 = modifier5;
                c26068u = c26068uM77569a;
                c28676v0 = c28676v1;
                i18 = i24;
                r15 = 1;
                z4 = false;
                AbstractC12240d.m34066d(c29674b, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(-49154606, c28655q, new C2194o(2, listM46935e, state)), c28655q, 48, 24576, 16380);
                C28655q c28655q3 = c28655q;
                c28655q3.m87173q(false);
                r16 = c28655q3;
            } else {
                r15 = 1;
                c28676v0 = c28676v1;
                c29674b = c29674bM91150b;
                c26068u = c26068uM77569a;
                z4 = false;
                modifier3 = modifier2;
                i17 = i16;
                i18 = i24;
                c28655q.m87150e0(508066169);
                list = (List) AbstractC25265s.m74100H0(listM46935e);
                if (list == null) {
                    c28655q.m87150e0(508066168);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(508066169);
                    m46901i(list, state.getProductTag(), c28655q, TextResource.$stable << 3);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                r16 = c28655q;
            }
            r16.m87173q(r15);
            if (listM46935e.size() > r15) {
                r16.m87150e0(-111067316);
                C29674b c29674b4 = c29674b;
                c29674b2 = c29674b4;
                AbstractC22070c.m63138d(listM46935e.size(), c29674b4.m91167q(), null, r25.m121949b(r16, i17).getBlack20(), r10.m121949b(r16, i17).getBrandBlack(), r16, 0, 4);
                r16.m87173q(z4);
            } else {
                c29674b2 = c29674b;
                r16.m87150e0(-110784782);
                r16.m87173q(z4);
            }
            r16.m87173q(r15);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f13);
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(f13, 0.0f, 2);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
            int i26 = (r16.m87157i(listM46935e) ? 1 : 0) | (r16.m87153g(c29674b2) ? 1 : 0);
            if ((i18 & 896) == 256) {
                r17 = r15;
            } else {
                r17 = z4;
            }
            r18 = i26 | r17;
            Object objM87133R5 = r16.m87133R();
            if (r18 == 0) {
                function1 = onViewEvent;
                C13412g c13412g2 = new C13412g(listM46935e, c29674b2, function1, 20);
                r16.m87172p0(c13412g2);
                obj = c13412g2;
            } else {
                function1 = onViewEvent;
                C13412g c13412g3 = new C13412g(listM46935e, c29674b2, function1, 20);
                r16.m87172p0(c13412g3);
                obj = c13412g3;
            }
            ?? r25 = r16;
            AbstractC22674j.m65718d(modifierM3409f5, c26068u, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) obj, r25, 24966, 488);
            ?? r110 = r25;
            r110.m87173q(r15);
            modifier2 = modifier3;
            r14 = r110;
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
            r14 = c28655q;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 20, modifier2, function1, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final int m46904l(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m46905m(List list, C16565c0 c16565c0, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        m46901i((List) list.get(i13), c16565c0.getProductTag(), composer, TextResource.$stable << 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m46906n(List list, AbstractC29701y abstractC29701y, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        ((C26053f) LazyRow).m77529r(list.size(), null, new c(list), new C37816b(new d(list, abstractC29701y, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m46907o(Modifier modifier, C16565c0 c16565c0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46903k(modifier, c16565c0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public static final void m46908p(List<? extends AbstractC22403o> list, int i13, AbstractC29701y abstractC29701y, Function1 function1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1162652747);
        int i15 = (i14 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(abstractC29701y) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125426w = c38072d.m121949b(c28655q, i16).getBrandBlack();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            float f13 = 4;
            float f14 = 22 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f14, AbstractC1102d.m3424u(f14, c2314t)), 2, f13), c38072d.m121949b(c28655q, i16).getGreyL6(), AbstractC17918w0.f69621a);
            boolean zM87157i = ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((i15 & 112) == 32) | c28655q.m87157i(interfaceC2994c0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C16561a0(function1, i13, interfaceC2994c0, abstractC29701y);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            boolean z4 = i13 == abstractC29701y.m91167q();
            boolean zM87151f = c28655q.m87151f(jM125426w);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87151f || objM87133R3 == c28676v0) {
                objM87133R3 = new C0910b(jM125426w, 16);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3362g, z4, (Function1) objM87133R3);
            boolean z13 = false;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44099b);
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
            c28655q.m87150e0(1041299794);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                z13 = z13;
                c2314t = c2314t;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(list, i13, abstractC29701y, function1, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m46909q(Function1 function1, int i13, InterfaceC2994c0 interfaceC2994c0, AbstractC29701y abstractC29701y) {
        function1.invoke(new C16569e0(i13));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(abstractC29701y, i13, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m46910r(long j7, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15751g.m44455h(C2314t.f9131w, 1, j7, AbstractC33253j.m105489e(2 * 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m46911s(List list, int i13, AbstractC29701y abstractC29701y, Function1 function1, int i14, Composer composer, int i15) {
        m46908p(list, i13, abstractC29701y, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final AbstractC18247a m46913u(ProductImageGalleryTagStyle productImageGalleryTagStyle) {
        int i13 = f.f63760a[productImageGalleryTagStyle.ordinal()];
        if (i13 == 1) {
            return AbstractC18249c.m52575m(p745y81.Function1.m125323a(g.f63761w));
        }
        if (i13 == 2 || i13 == 3) {
            return AbstractC18249c.m52575m(p745y81.Function1.m125323a(h.f63762w));
        }
        if (i13 == 4) {
            return AbstractC18249c.m52575m(p745y81.Function1.m125323a(i.f63763w));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    private static final InterfaceC39332e m46914v(ProductImageGalleryTagStyle productImageGalleryTagStyle) {
        int i13 = f.f63760a[productImageGalleryTagStyle.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(j.f63764w);
        }
        if (i13 == 2 || i13 == 3) {
            return p745y81.Function1.m125323a(k.f63765w);
        }
        if (i13 == 4) {
            return p745y81.Function1.m125323a(l.f63766w);
        }
        throw new NoWhenBranchMatchedException();
    }
}
