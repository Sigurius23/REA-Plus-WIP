package w31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.C9723b;
import dp0.C12253i;
import e93.AbstractC12889b;
import fy1.C14873i;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p027b3.AbstractC2453v1;
import p163g1.C14972c3;
import p163g1.C15093n7;
import p163g1.InterfaceC15022g9;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q21.C29843b;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: w31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0085\u0001\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u000e\u0010\u001d\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "actionWidth", "", "swipeEnabled", "swipeToLeftToReveal", "Lkotlin/Function0;", "Ll83/a0;", "onConfirmAction", "Lg1/n7;", "Lw31/b;", "swipeableState", "Lgz0/m0;", "actionIcon", "Li2/x;", "actionIconTint", "actionBackgroundColor", "Lkotlin/Function1;", "mainContent", "n", "(Landroidx/compose/ui/Modifier;FZZLc93/a;Lg1/n7;Lgz0/m0;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "swipeActionState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lw31/b;Landroidx/compose/runtime/Composer;II)V", "isError", "isLoading", "j", "(ZZLw31/b;Landroidx/compose/runtime/Composer;II)V", "isLoadingInternal", "internalIsLoading", "internalIsError", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36791e {

    /* JADX INFO: renamed from: w31.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ EnumC36788b f157388w;

        public a(EnumC36788b enumC36788b) {
            this.f157388w = enumC36788b;
        }

        /* JADX INFO: renamed from: a */
        public final void m117914a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(310631419);
            C15093n7 c15093n7M60417W = AbstractC21478l0.m60417W(this.f157388w, c28655q, 0);
            float f13 = 80;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = b.f157389w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36791e.m117902n(null, f13, false, true, (InterfaceC4339a) objM87133R, c15093n7M60417W, null, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), 0L, C36787a.f157370a.m117887c(), c28655q, 805334064, 325);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m117914a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final b f157389w = new b();

        /* JADX INFO: renamed from: a */
        public final void m117915a() {
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m117915a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ EnumC36788b f157390w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f157391x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f157392y;

        public c(EnumC36788b enumC36788b, boolean z4, boolean z13) {
            this.f157390w = enumC36788b;
            this.f157391x = z4;
            this.f157392y = z13;
        }

        /* JADX INFO: renamed from: a */
        public final void m117916a(Composer composer, int i13) {
            InterfaceC28601c1 interfaceC28601c1;
            InterfaceC28601c1 interfaceC28601c2;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-252672193);
            C15093n7 c15093n7M60417W = AbstractC21478l0.m60417W(this.f157390w, c28655q, 0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(this.f157392y, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(this.f157391x, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Boolean boolValueOf = Boolean.valueOf(this.f157391x);
            Boolean boolValueOf2 = Boolean.valueOf(this.f157392y);
            boolean zM87155h = c28655q.m87155h(this.f157392y) | c28655q.m87155h(this.f157391x);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87155h || objM87133R3 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC28601c2 = interfaceC28601c3;
                d dVar = new d(this.f157392y, this.f157391x, interfaceC28601c2, interfaceC28601c1, null);
                c28655q.m87172p0(dVar);
                objM87133R3 = dVar;
            } else {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC28601c2 = interfaceC28601c3;
            }
            AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) objM87133R3, c28655q);
            Object value = c15093n7M60417W.f56510c.getValue();
            boolean zM87153g = c28655q.m87153g(c15093n7M60417W) | c28655q.m87155h(this.f157392y) | c28655q.m87155h(this.f157391x);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c2;
                e eVar = new e(c15093n7M60417W, this.f157392y, this.f157391x, interfaceC28601c5, interfaceC28601c1, null);
                interfaceC28601c2 = interfaceC28601c5;
                c28655q.m87172p0(eVar);
                objM87133R4 = eVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, value);
            float f13 = 80;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new f(interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC36791e.m117902n(null, f13, false, false, (InterfaceC4339a) objM87133R5, c15093n7M60417W, null, 0L, 0L, C36787a.f157370a.m117888d(), c28655q, 805334064, 453);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m117916a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.swipelayout.SwipeLayoutKt$SampleSwipeLayoutRightToReveal$1$1$1", m100430f = "SwipeLayout.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f157393E;

        /* JADX INFO: renamed from: w */
        int f157394w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f157395x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f157396y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f157397z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, boolean z13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157395x = z4;
            this.f157396y = z13;
            this.f157397z = interfaceC28601c1;
            this.f157393E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f157395x, this.f157396y, this.f157397z, this.f157393E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157394w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36791e.m117899k(this.f157397z, this.f157395x);
            AbstractC36791e.m117900l(this.f157393E, this.f157396y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.swipelayout.SwipeLayoutKt$SampleSwipeLayoutRightToReveal$1$2$1", m100430f = "SwipeLayout.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f157398E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f157399F;

        /* JADX INFO: renamed from: w */
        int f157400w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15093n7 f157401x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f157402y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f157403z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15093n7 c15093n7, boolean z4, boolean z13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157401x = c15093n7;
            this.f157402y = z4;
            this.f157403z = z13;
            this.f157398E = interfaceC28601c1;
            this.f157399F = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f157401x, this.f157402y, this.f157403z, this.f157398E, this.f157399F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157400w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f157401x.f56510c.getValue() == EnumC36788b.DEFAULT) {
                AbstractC36791e.m117899k(this.f157398E, this.f157402y);
                AbstractC36791e.m117900l(this.f157399F, this.f157403z);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f157404w;

        public f(InterfaceC28601c1 interfaceC28601c1) {
            this.f157404w = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m117917a() {
            AbstractC36791e.m117899k(this.f157404w, true);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m117917a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w31.e$g */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.swipelayout.SwipeLayoutKt$SwipeLayout$1$1", m100430f = "SwipeLayout.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15093n7 f157406x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f157407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15093n7 c15093n7, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157406x = c15093n7;
            this.f157407y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f157406x, this.f157407y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157405w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f157406x.f56510c.getValue() == EnumC36788b.DEFAULT && AbstractC36791e.m117903o(this.f157407y)) {
                AbstractC36791e.m117904p(this.f157407y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m117896h(EnumC36788b enumC36788b, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-817151823);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC36788b == null ? -1 : enumC36788b.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                enumC36788b = EnumC36788b.DEFAULT;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a(enumC36788b)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9723b(enumC36788b, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m117897i(EnumC36788b enumC36788b, int i13, int i14, Composer composer, int i15) {
        m117896h(enumC36788b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m117898j(boolean z4, boolean z13, EnumC36788b enumC36788b, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2076138652);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC36788b == null ? -1 : enumC36788b.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                z4 = false;
            }
            if (i17 != 0) {
                z13 = false;
            }
            if (i18 != 0) {
                enumC36788b = EnumC36788b.DEFAULT;
            }
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c(enumC36788b, z4, z13)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        boolean z14 = z4;
        boolean z15 = z13;
        EnumC36788b enumC36788b2 = enumC36788b;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29843b(z14, z15, enumC36788b2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m117899k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m117900l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117901m(boolean z4, boolean z13, EnumC36788b enumC36788b, int i13, int i14, Composer composer, int i15) {
        m117898j(z4, z13, enumC36788b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: n */
    public static final void m117902n(androidx.compose.p018ui.Modifier r38, float r39, boolean r40, boolean r41, c93.InterfaceC4339a r42, p163g1.C15093n7 r43, gz0.EnumC16313m0 r44, long r45, long r47, p715kotlin.jvm.functions.Function3 r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w31.AbstractC36791e.m117902n(androidx.compose.ui.Modifier, float, boolean, boolean, c93.a, g1.n7, gz0.m0, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m117903o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m117904p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC15022g9 m117905q(EnumC36788b enumC36788b, EnumC36788b enumC36788b2) {
        AbstractC22676k.m65750j(enumC36788b, "<unused var>");
        AbstractC22676k.m65750j(enumC36788b2, "<unused var>");
        return new C14972c3(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117906r(float f13, float f14, boolean z4, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        float f15 = f13 > f14 ? f14 : f13;
        if (f15 > 0.1f) {
            if (z4) {
                C22128b c22128b = ((C0238p0) drawWithContent).f815w;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) - f15;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & c22128b.mo731d()));
                C0237p c0237pMo744t0 = drawWithContent.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2346d(fIntBitsToFloat, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, 1);
                    ((C0238p0) drawWithContent).m728a();
                } finally {
                    AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                }
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & ((C0238p0) drawWithContent).f815w.mo731d()));
                C0237p c0237pMo744t1 = drawWithContent.mo744t0();
                long jM670A2 = c0237pMo744t1.m670A();
                c0237pMo744t1.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t1.f812x).m2346d(0.0f, 0.0f, f15, fIntBitsToFloat4, 1);
                    ((C0238p0) drawWithContent).m728a();
                } finally {
                    AbstractC11266d.m30472z(c0237pMo744t1, jM670A2);
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m117907s(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        m117904p(interfaceC28601c1, true);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C39178j m117908t(C15093n7 c15093n7, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) AbstractC12889b.m36258X(((Number) c15093n7.f56512e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117909u(Modifier modifier, float f13, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, C15093n7 c15093n7, EnumC16313m0 enumC16313m0, long j7, long j13, Function3 function3, int i13, int i14, Composer composer, int i15) {
        m117902n(modifier, f13, z4, z13, interfaceC4339a, c15093n7, enumC16313m0, j7, j13, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
