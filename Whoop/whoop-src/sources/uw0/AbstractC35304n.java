package uw0;

import a00.C0073h;
import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.List;
import jf3.C21647a;
import km0.C22580d;
import km0.C22581e;
import km0.C22582f;
import kotlin.C2028s;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nf3.C26669a;
import nw0.C27198e;
import ny0.AbstractC27274q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p734sl0.C32627j2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so2.C32848f;
import t80.C33592b;
import tw0.AbstractC34217c;
import tw0.C34218d;
import um0.C35076b;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: uw0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\nX\u008a\u0084\u0002"}, m65681d2 = {"", "", "initialSelectedIds", "Lkotlin/Function0;", "Ll83/a0;", "onBottomSheetDismissed", "r", "(Ljava/util/List;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Luw0/p;", "viewState", "Lkotlin/Function1;", "Ltw0/c;", "onEvent", "j", "(Luw0/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Luw0/p$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Luw0/p$a;Landroidx/compose/runtime/Composer;I)V", "Ltw0/d;", "viewModel", "Lb3/x2;", "keyboard", "custombottomsheet_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35304n {

    /* JADX INFO: renamed from: uw0.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetContent$1$1$1$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f150360x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35664f.a aVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150360x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f150360x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150359w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 modalBottomSheetState = this.f150360x.getModalBottomSheetState();
                this.f150359w = 1;
                if (modalBottomSheetState.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uw0.n$b */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetContent$2$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150361w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f150362x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150363y;

        /* JADX INFO: renamed from: uw0.n$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C15199y3 f150364w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f150365x;

            public a(C15199y3 c15199y3, Function1 function1) {
                this.f150364w = c15199y3;
                this.f150365x = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w && this.f150364w.m43221b() == EnumC15209z3.f57107x) {
                    this.f150365x.invoke(AbstractC34217c.b.f143528a);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150362x = c15199y3;
            this.f150363y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m112077h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f150362x, this.f150363y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150361w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C35305o(this.f150362x, 0));
                a aVar = new a(this.f150362x, this.f150363y);
                this.f150361w = 1;
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

    /* JADX INFO: renamed from: uw0.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetContent$3$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150366w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f150367x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f150368y;

        /* JADX INFO: renamed from: uw0.n$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f150369w;

            public a(InterfaceC28670t2 interfaceC28670t2) {
                this.f150369w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M112060k;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M112060k = AbstractC35304n.m112060k(this.f150369w)) != null) {
                    ((C2463x1) interfaceC2464x2M112060k).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150367x = c15199y3;
            this.f150368y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m112080h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f150367x, this.f150368y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150366w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C35305o(this.f150367x, 1));
                a aVar = new a(this.f150368y);
                this.f150366w = 1;
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

    /* JADX INFO: renamed from: uw0.n$d */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetContent$5$1$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150370w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f150371x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC35664f.a aVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150371x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f150371x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150370w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 modalBottomSheetState = this.f150371x.getModalBottomSheetState();
                this.f150370w = 1;
                if (modalBottomSheetState.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uw0.n$e */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetContent$6$1$1$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150372w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f150373x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC35664f.a aVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150373x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f150373x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150372w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 modalBottomSheetState = this.f150373x.getModalBottomSheetState();
                this.f150372w = 1;
                if (modalBottomSheetState.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uw0.n$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f150374w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f150375x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f150376y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f150377z;

        /* JADX INFO: renamed from: uw0.n$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f150378w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f150378w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f150378w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f150374w = c38266c;
            this.f150375x = interfaceC35951a;
            this.f150376y = interfaceC4339a;
            this.f150377z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, tw0.d] */
        @Override // c93.InterfaceC4339a
        public final C34218d invoke() {
            return AbstractC21598x.m60668X(this.f150374w, this.f150375x, new a(this.f150377z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34218d.class), null, this.f150376y);
        }
    }

    /* JADX INFO: renamed from: uw0.n$g */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetScreenKt$CustomBottomSheetScreen$1$1", m100430f = "CustomBottomSheetScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150379w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<String> f150380x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f150381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<String> list, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150380x = list;
            this.f150381y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f150380x, this.f150381y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150379w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC35304n.m112068s(this.f150381y).m108162n(new AbstractC34217c.f(this.f150380x));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m112059j(C35306p viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        InterfaceC2994c0 interfaceC2994c0;
        C28676v0 c28676v0;
        AbstractC35664f.a aVar;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC30057d interfaceC30057d;
        String strM65426k;
        Object c27198e;
        C28676v0 c28676v1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-655342125);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R == c28676v2) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q, 3078, 6);
            AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c);
            C22581e c22581eM112082a = viewState.getBottomSheetViewState();
            C35666g c35666g = new C35666g(c22581eM112082a != null ? c22581eM112082a.getTitle() : null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i15, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v2) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
                c28655q.m87150e0(1576437611);
                C22581e c22581eM112082a2 = viewState.getBottomSheetViewState();
                C22582f c22582fM65421f = c22581eM112082a2 != null ? c22581eM112082a2.getConfirmationModal() : null;
                if (c22582fM65421f == null) {
                    c28655q.m87150e0(1624925686);
                    c28655q.m87173q(false);
                    interfaceC2994c0 = interfaceC2994c1;
                    c28676v0 = c28676v2;
                    aVar = aVar2;
                    interfaceC28601c1 = interfaceC28601c2;
                } else {
                    c28655q.m87150e0(1624925687);
                    List<C22580d> listM65427l = viewState.getBottomSheetViewState().m65427l();
                    boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(interfaceC2994c1) | c28655q.m87157i(aVar2);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87157i || objM87133R3 == c28676v2) {
                        interfaceC2994c0 = interfaceC2994c1;
                        c28676v1 = c28676v2;
                        c27198e = new C27198e((Object) interfaceC28601c2, onEvent, (Object) interfaceC2994c0, (Object) aVar2, 18);
                        interfaceC28601c1 = interfaceC28601c2;
                        aVar = aVar2;
                        c28655q.m87172p0(c27198e);
                    } else {
                        interfaceC28601c1 = interfaceC28601c2;
                        c27198e = objM87133R3;
                        interfaceC2994c0 = interfaceC2994c1;
                        aVar = aVar2;
                        c28676v1 = c28676v2;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c27198e;
                    Object objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C35300j(interfaceC28601c1, 1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    z4 = false;
                    c28676v0 = c28676v1;
                    AbstractC35296f.m111992o(c22582fM65421f, listM65427l, false, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q, C22582f.f88880e | 24576, 4);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z4);
            } else {
                i14 = i14;
                interfaceC2994c0 = interfaceC2994c1;
                c28676v0 = c28676v2;
                aVar = aVar2;
                interfaceC28601c1 = interfaceC28601c2;
                c15199y3M3460c = c15199y3M3460c;
                c28655q.m87150e0(1625538991);
                c28655q.m87173q(false);
            }
            boolean zM87157i2 = c28655q.m87157i(c15199y3M3460c) | ((i14 & 112) != 32 ? z4 : true);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                interfaceC30057d = null;
                objM87133R5 = new b(c15199y3M3460c, onEvent, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                interfaceC30057d = null;
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c23454a0);
            boolean zM87157i3 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i3 || objM87133R6 == c28676v0) {
                objM87133R6 = new c(c15199y3M3460c, interfaceC28601c1M87238F, interfaceC30057d);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c23454a0);
            C22581e c22581eM112082a3 = viewState.getBottomSheetViewState();
            if (c22581eM112082a3 != null && (strM65426k = c22581eM112082a3.getPerformFuzzySearch()) != null) {
                onEvent.invoke(new AbstractC34217c.e(strM65426k));
            }
            AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
            EnumC39333f enumC39333f = EnumC39333f.TRANSPARENT;
            boolean zM87157i4 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i4 || objM87133R7 == c28676v0) {
                objM87133R7 = new C2028s(interfaceC2994c0, aVar, 7);
                c28655q.m87172p0(objM87133R7);
            }
            C28655q c28655q2 = c28655q;
            AbstractC35660d.m112871m(null, c35666g, aVar, enumC39333f, (InterfaceC4339a) objM87133R7, null, null, AbstractC37817c.m121344e(1397177573, c28655q, new C0563n(viewState, interfaceC2994c0, aVar, onEvent, interfaceC28601c1, 14)), false, bVar, null, null, false, null, C35291a.f150287a.m111975b(), c28655q2, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15713);
            c28655q = c28655q2;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC2464x2 m112060k(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m112061l(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        interfaceC28601c1.setValue(Boolean.FALSE);
        function1.invoke(new AbstractC34217c.g(true));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m112062m(InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112063n(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m112064o(C35306p c35306p, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C22581e c22581eM112082a = c35306p.getBottomSheetViewState();
            if (c35306p.getFullScreenModal() != null) {
                c28655q.m87150e0(-1637111339);
                C35306p.a aVarM112083b = c35306p.getFullScreenModal();
                int i14 = AbstractC33208p0.f138461d;
                int i15 = TextResource.$stable;
                m112072w(aVarM112083b, c28655q, i14 | i15 | i15);
                c28655q.m87173q(false);
            } else if (c22581eM112082a != null) {
                c28655q.m87150e0(789282959);
                int iIndexOf = c22581eM112082a.m65420e().indexOf(c22581eM112082a.getCurrentCategory());
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c35306p) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    C0073h c0073h = new C0073h(function1, c35306p, interfaceC2994c0, interfaceC28601c1, aVar, 25);
                    c28655q.m87172p0(c0073h);
                    objM87133R = c0073h;
                }
                AbstractC35307q.m112094g(c22581eM112082a, interfaceC2994c0, aVar, iIndexOf, false, function1, (InterfaceC4339a) objM87133R, c28655q, C22581e.f88865n | 24576 | (AbstractC35664f.a.f151587c << 6), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(790294365);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m112065p(Function1 function1, C35306p c35306p, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, AbstractC35664f.a aVar) {
        function1.invoke(new AbstractC34217c.g(false, 1, null));
        if (c35306p.getBottomSheetViewState().m65427l().isEmpty()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(aVar, null), 3);
        } else {
            interfaceC28601c1.setValue(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112066q(C35306p c35306p, Function1 function1, int i13, Composer composer, int i14) {
        m112059j(c35306p, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m112067r(List<String> list, InterfaceC4339a onBottomSheetDismissed, Composer composer, int i13, int i14) {
        List<String> list2;
        int i15;
        List<String> list3;
        Object obj;
        AbstractC22676k.m65750j(onBottomSheetDismissed, "onBottomSheetDismissed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2091082070);
        int i16 = i14 & 1;
        int i17 = 2;
        if (i16 != 0) {
            i15 = i13 | 6;
            list2 = list;
        } else if ((i13 & 6) == 0) {
            list2 = list;
            i15 = i13 | (c28655q.m87157i(list2) ? 4 : 2);
        } else {
            list2 = list;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onBottomSheetDismissed) ? 32 : 16;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 19) != 18)) {
            List<String> list4 = i16 != 0 ? C25271y.f99162w : list2;
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            C22581e c22581e = null;
            boolean z4 = false;
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G);
                obj = interfaceC23462hM92087G;
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            InterfaceC13058l viewState = m112068s(interfaceC23462h).getViewState();
            C35306p c35306p = new C35306p(new C35306p.a(AbstractC33208p0.c.f138471e, null, null, false, 14, null), c22581e, i17, z4 ? 1 : 0);
            int i19 = AbstractC33208p0.f138461d;
            int i24 = TextResource.$stable;
            int i25 = i19 | i24 | i24 | C22581e.f88865n;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, c35306p, null, c28655q, i25 << 3, 2);
            C34218d c34218dM112068s = m112068s(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(list4);
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87157i || objM87133R2 == c28676v0) {
                g gVar = new g(list4, interfaceC23462h, null);
                c28655q.m87172p0(gVar);
                obj2 = gVar;
            }
            AbstractC28683x.m87254h(c34218dM112068s, list4, (InterfaceC4351m) obj2, c28655q);
            C35306p c35306pM112069t = m112069t(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i18 & 112) == 32);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                C35076b c35076b = new C35076b(4, onBottomSheetDismissed, interfaceC23462h);
                c28655q.m87172p0(c35076b);
                obj3 = c35076b;
            }
            m112059j(c35306pM112069t, (Function1) obj3, c28655q, i25);
            list3 = list4;
        } else {
            c28655q.m87138X();
            list3 = list2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(list3, i13, onBottomSheetDismissed, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C34218d m112068s(InterfaceC23462h interfaceC23462h) {
        return (C34218d) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final C35306p m112069t(InterfaceC28670t2 interfaceC28670t2) {
        return (C35306p) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m112070u(InterfaceC4339a interfaceC4339a, InterfaceC23462h interfaceC23462h, AbstractC34217c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC34217c.b) {
            interfaceC4339a.invoke();
        } else {
            m112068s(interfaceC23462h).m108162n(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m112071v(List list, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m112067r(list, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m112072w(C35306p.a aVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(856919091);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3406c(0.9f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
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
            c28655q.m87150e0(1508551216);
            AbstractC33208p0 abstractC33208p0M112087d = aVar.getType();
            TextResource textResourceM112086c = aVar.getSupportText();
            TextResource textResourceM112084a = aVar.getPrimaryButtonText();
            boolean zM112085b = aVar.getRemoveBackgroundModifier();
            int i15 = AbstractC33208p0.f138461d;
            int i16 = TextResource.$stable;
            AbstractC33199m0.m105214F(abstractC33208p0M112087d, textResourceM112086c, null, textResourceM112084a, null, false, false, null, null, null, zM112085b, false, c28655q, i15 | (i16 << 3) | (i16 << 9), 0, 3060);
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(aVar, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112073x(C35306p.a aVar, int i13, Composer composer, int i14) {
        m112072w(aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
