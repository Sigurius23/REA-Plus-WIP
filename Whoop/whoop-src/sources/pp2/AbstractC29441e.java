package pp2;

import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.AbstractC2195p;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import gz0.EnumC16313m0;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import l83.C23454a0;
import ln1.C24538p;
import no.nordicsemi.android.dfu.DfuBaseService;
import np2.C27036c;
import np2.InterfaceC27034a;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28325a;
import pc3.C29096r;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import v41.EnumC35671i0;
import y71.C39274g;

/* JADX INFO: renamed from: pp2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aC\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnp2/c$a;", "bottomSheetState", "Lg1/y3;", "modalSheetState", "Lkotlin/Function1;", "Lnp2/a;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "bodyContent", "i", "(Lnp2/c$a;Lg1/y3;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "", "selectionMade", "wasExpanded", "", "searchQuery", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29441e {

    /* JADX INFO: renamed from: pp2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$1$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27036c.a f119546E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC2994c0 f119547F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f119548G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C15199y3 f119549H;

        /* JADX INFO: renamed from: w */
        Object f119550w;

        /* JADX INFO: renamed from: x */
        int f119551x;

        /* JADX INFO: renamed from: y */
        int f119552y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f119553z;

        /* JADX INFO: renamed from: pp2.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$1$1$1$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42181a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f119554w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15199y3 f119555x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42181a(C15199y3 c15199y3, InterfaceC30057d<? super C42181a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f119555x = c15199y3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42181a(this.f119555x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42181a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f119554w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y3 = this.f119555x;
                    this.f119554w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C27036c.a aVar, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119546E = aVar;
            this.f119547F = interfaceC2994c0;
            this.f119548G = interfaceC28601c1;
            this.f119549H = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f119546E, this.f119547F, this.f119548G, this.f119549H, interfaceC30057d);
            aVar.f119553z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119552y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f119546E != null) {
                    InterfaceC2994c0 interfaceC2994c0 = this.f119547F;
                    InterfaceC28601c1 interfaceC28601c1 = this.f119548G;
                    C15199y3 c15199y3 = this.f119549H;
                    AbstractC29441e.m89845t(interfaceC28601c1, false);
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C42181a(c15199y3, null), 3);
                } else {
                    C15199y3 c15199y4 = this.f119549H;
                    this.f119553z = null;
                    this.f119550w = null;
                    this.f119551x = 0;
                    this.f119552y = 1;
                    if (c15199y4.m43223d(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: pp2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$2$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119556w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f119557x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f119558y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119557x = c15199y3;
            this.f119558y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f119557x, this.f119558y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119556w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f119557x.m43221b() == EnumC15209z3.f57107x) {
                AbstractC29441e.m89847v(this.f119558y, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pp2.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$3$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f119559E;

        /* JADX INFO: renamed from: w */
        int f119560w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f119561x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f119562y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f119563z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119561x = c15199y3;
            this.f119562y = function1;
            this.f119563z = interfaceC28601c1;
            this.f119559E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f119561x, this.f119562y, this.f119563z, this.f119559E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119560w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f119561x.m43221b() == EnumC15209z3.f57106w && AbstractC29441e.m89846u(this.f119563z) && !AbstractC29441e.m89835j(this.f119559E)) {
                AbstractC29441e.m89847v(this.f119563z, false);
                this.f119562y.invoke(InterfaceC27034a.d.f107839a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pp2.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$4$1$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f119565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f119566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119565x = c15199y3;
            this.f119566y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f119565x, this.f119566y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119564w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f119565x.m43224e()) {
                    C15199y3 c15199y3 = this.f119565x;
                    this.f119564w = 1;
                    if (c15199y3.m43223d(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    this.f119566y.invoke(InterfaceC27034a.l.f107852a);
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

    /* JADX INFO: renamed from: pp2.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$5$1$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f119568x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119568x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f119568x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119567w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f119568x;
                this.f119567w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pp2.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$7$1$3$1$1", m100430f = "ShippingAddressBottomSheet.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f119570x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119570x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f119570x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119569w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f119570x;
                this.f119569w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: i */
    public static final void m89834i(C27036c.a aVar, C15199y3 c15199y3, Function1 onEvent, InterfaceC4351m bodyContent, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC30057d interfaceC30057d;
        InterfaceC28601c1 interfaceC28601c2;
        Object cVar;
        Function1 function1;
        C15199y3 modalSheetState = c15199y3;
        AbstractC22676k.m65750j(modalSheetState, "modalSheetState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-944421928);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(modalSheetState) : c28655q.m87157i(modalSheetState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(bodyContent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            Long lValueOf = aVar != null ? Long.valueOf(aVar.getOpenTimestamp()) : null;
            int i16 = i15 & 112;
            boolean zM87157i = c28655q.m87157i(aVar) | c28655q.m87157i(interfaceC2994c0) | (i16 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(modalSheetState)));
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC30057d = null;
                a aVar2 = new a(aVar, interfaceC2994c0, interfaceC28601c3, modalSheetState, null);
                interfaceC28601c3 = interfaceC28601c3;
                modalSheetState = modalSheetState;
                c28655q.m87172p0(aVar2);
                objM87133R4 = aVar2;
            } else {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC30057d = null;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, lValueOf);
            EnumC15209z3 enumC15209z3M43221b = modalSheetState.m43221b();
            boolean z4 = i16 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(modalSheetState));
            Object objM87133R5 = c28655q.m87133R();
            if (z4 || objM87133R5 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R5 = new b(modalSheetState, interfaceC28601c2, interfaceC30057d);
                c28655q.m87172p0(objM87133R5);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, enumC15209z3M43221b);
            EnumC15209z3 enumC15209z3M43221b2 = modalSheetState.m43221b();
            int i17 = i15 & 896;
            boolean z13 = (i16 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(modalSheetState))) | (i17 == 256);
            Object objM87133R6 = c28655q.m87133R();
            if (z13 || objM87133R6 == c28676v0) {
                C15199y3 c15199y4 = modalSheetState;
                cVar = new c(c15199y4, onEvent, interfaceC28601c2, interfaceC28601c3, null);
                modalSheetState = c15199y4;
                function1 = onEvent;
                c28655q.m87172p0(cVar);
            } else {
                cVar = objM87133R6;
                function1 = onEvent;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) cVar, enumC15209z3M43221b2);
            boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | (i16 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(modalSheetState))) | (i17 == 256);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i2 || objM87133R7 == c28676v0) {
                objM87133R7 = new C24538p(interfaceC2994c0, modalSheetState, function1, 2);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, false, c28655q, 0, 1);
            C35666g c35666g = new C35666g(AbstractC8693b.m21278l(aVar != null ? aVar.getTitle() : null), new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21278l("Close")), null, EnumC35671i0.CENTER, null, 0.0f, 0.0f, 116, null);
            AbstractC35664f.a aVar3 = new AbstractC35664f.a(modalSheetState);
            boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0) | (i16 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(modalSheetState)));
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i3 || objM87133R8 == c28676v0) {
                objM87133R8 = new C3196h(interfaceC2994c0, modalSheetState, 22);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C29096r(14);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC35660d.m112871m(null, c35666g, aVar3, null, interfaceC4339a, (InterfaceC4339a) objM87133R9, null, AbstractC37817c.m121344e(-935508118, c28655q, new C0563n(aVar, interfaceC2994c0, modalSheetState, function1, interfaceC28601c3, 12)), false, null, null, null, false, null, bodyContent, c28655q, (C35666g.f151591h << 3) | 12779520 | (AbstractC35664f.a.f151587c << 6), (i15 << 3) & 57344, 16201);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(aVar, false, c15199y3, onEvent, bodyContent, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m89835j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m89836k(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m89837l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m89838m(C27036c.a aVar, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87138X();
        } else if (aVar == null) {
            c28655q.m87150e0(320500299);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(320500300);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, C2314t.f9131w);
            String strM89839n = m89839n(interfaceC28601c2);
            List<C27036c.e> listM81122c = aVar.m81122c();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29449m(interfaceC28601c2, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C29439c(interfaceC28601c2, 0);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1) | c28655q.m87157i(aVar);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                C29440d c29440d = new C29440d(interfaceC2994c0, function1, aVar, interfaceC28601c1, c15199y3, 0);
                c28655q.m87172p0(c29440d);
                objM87133R4 = c29440d;
            }
            AbstractC2195p.m6899A(modifierM3406c, null, false, false, strM89839n, "", listM81122c, function2, interfaceC4339a, null, (Function1) objM87133R4, null, c28655q, 113442822, 0, 2574);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final String m89839n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m89840o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m89841p(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m89840o(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m89842q(InterfaceC28601c1 interfaceC28601c1) {
        m89840o(interfaceC28601c1, "");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m89843r(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C27036c.a aVar, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, C27036c.e selection) {
        AbstractC22676k.m65750j(selection, "selection");
        m89845t(interfaceC28601c1, true);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y3, null), 3);
        function1.invoke(new InterfaceC27034a.e(aVar.getFieldType(), selection.getValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m89844s(C27036c.a aVar, C15199y3 c15199y3, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m89834i(aVar, c15199y3, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m89845t(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final boolean m89846u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m89847v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m89848w(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, function1, null), 3);
        return C23454a0.f92919a;
    }
}
