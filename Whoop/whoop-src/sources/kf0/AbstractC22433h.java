package kf0;

import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import am2.C1040r;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.AbstractC14874j;
import hg3.AbstractC17269i;
import j41.C21313a;
import jd0.C21608a;
import jd0.C21610c;
import jf3.C21647a;
import jp1.C21862n;
import jt1.C21937b;
import jx2.C22038b;
import kd0.C22382b;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kotlin.C2026r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p132f0.C13825t;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23124k3;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
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
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35662e;
import v41.C35666g;
import v63.AbstractC35745c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: kf0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001ag\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "source", "Ljd0/c;", "navRouter", "Ljd0/a;", "actionRouter", "", "showBackButton", "Ll83/a0;", "l", "(Ljava/lang/String;Ljd0/c;Ljd0/a;ZLandroidx/compose/runtime/Composer;II)V", "Lkd0/c;", "viewState", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "appointmentSummaryBottomSheet", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lkotlin/Function0;", "onHideBottomSheet", "Lkotlin/Function1;", "Lkd0/a;", "onEvent", "m", "(Ljava/lang/String;Lkd0/c;ZLcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/design/models/modal/AnyModal;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bottomSheetModel", "Ll1/w3;", "sheetState", "Lbc3/c0;", "coroutineScope", "A", "(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Ll1/w3;Lc93/a;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V", "Lkd0/b;", "viewModel", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22433h {

    /* JADX INFO: renamed from: kf0.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f87767w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f87768x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f87769y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f87770z;

        /* JADX INFO: renamed from: kf0.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41892a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f87771w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41892a(C21647a c21647a) {
                super(0);
                this.f87771w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f87771w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f87767w = c38266c;
            this.f87768x = interfaceC35951a;
            this.f87769y = interfaceC4339a;
            this.f87770z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, kd0.b] */
        @Override // c93.InterfaceC4339a
        public final C22382b invoke() {
            return AbstractC21598x.m60668X(this.f87767w, this.f87768x, new C41892a(this.f87770z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22382b.class), null, this.f87769y);
        }
    }

    /* JADX INFO: renamed from: kf0.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AdvancedLabsScreen$1$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87772w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f87773x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87773x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f87773x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87772w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC22433h.m64701n(this.f87773x).m64357r(InterfaceC22381a.k0.f87421a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kf0.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AdvancedLabsScreen$2$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f87775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21610c f87776y;

        /* JADX INFO: renamed from: kf0.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21610c f87777w;

            public a(C21610c c21610c) {
                this.f87777w = c21610c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC22381a.a0 a0Var, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f87777w.m60774e(a0Var);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C21610c c21610c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87775x = interfaceC23462h;
            this.f87776y = c21610c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f87775x, this.f87776y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87774w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM64355o = AbstractC22433h.m64701n(this.f87775x).getNavigationEvents();
                a aVar = new a(this.f87776y);
                this.f87774w = 1;
                if (interfaceC13058lM64355o.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kf0.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AdvancedLabsScreen$8$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87778w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f87779x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AppointmentSummaryBottomSheet f87780y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C23196w3 f87781z;

        /* JADX INFO: renamed from: kf0.h$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AdvancedLabsScreen$8$1$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {146, 148}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f87782w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AppointmentSummaryBottomSheet f87783x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C23196w3 f87784y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, C23196w3 c23196w3, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f87783x = appointmentSummaryBottomSheet;
                this.f87784y = c23196w3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f87783x, this.f87784y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
            
                if (r5.m67150b(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            
                if (r5.m67152d(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            
                return r0;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f87782w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r3) goto L15
                    if (r1 != r2) goto Ld
                    goto L15
                Ld:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L15:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L36
                L19:
                    p505ts.AbstractC34132o.m107864I(r5)
                    com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet r5 = r4.f87783x
                    if (r5 == 0) goto L2b
                    l1.w3 r5 = r4.f87784y
                    r4.f87782w = r3
                    java.lang.Object r5 = r5.m67150b(r4)
                    if (r5 != r0) goto L36
                    goto L35
                L2b:
                    l1.w3 r5 = r4.f87784y
                    r4.f87782w = r2
                    java.lang.Object r5 = r5.m67152d(r4)
                    if (r5 != r0) goto L36
                L35:
                    return r0
                L36:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kf0.AbstractC22433h.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2994c0 interfaceC2994c0, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, C23196w3 c23196w3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87779x = interfaceC2994c0;
            this.f87780y = appointmentSummaryBottomSheet;
            this.f87781z = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f87779x, this.f87780y, this.f87781z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87778w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f87779x, null, null, new a(this.f87780y, this.f87781z, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kf0.h$e */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AppointmentSummaryBottomSheet$1$1$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87785w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f87786x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C23196w3 c23196w3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87786x = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f87786x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87785w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f87786x;
                this.f87785w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kf0.h$f */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.AdvancedLabsScreenKt$AppointmentSummaryBottomSheet$2$1$1$1$1", m100430f = "AdvancedLabsScreen.kt", m100431l = {221}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87787w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f87788x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C23196w3 c23196w3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87788x = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f87788x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87787w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f87788x;
                this.f87787w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: A */
    private static final void m64682A(AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(232360471);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(appointmentSummaryBottomSheet) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c23196w3) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            int i15 = i14 & 112;
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | (i15 == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C22432g(interfaceC2994c0, interfaceC4339a, c23196w3, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35662e.m112943g(null, c23196w3, c35666g, null, null, null, (InterfaceC4339a) objM87133R, null, false, null, null, false, AbstractC37817c.m121344e(1986994685, c28655q, new C2026r(appointmentSummaryBottomSheet, interfaceC2994c0, c23196w3, interfaceC4339a, 11)), c28655q, (C35666g.f151591h << 6) | i15, 384, 4025);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(appointmentSummaryBottomSheet, c23196w3, interfaceC4339a, interfaceC2994c0, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m64683B(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C23196w3 c23196w3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c23196w3, null), 3);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m64684C(AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, 1 * f13);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            String title = appointmentSummaryBottomSheet.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i14).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13)));
            C36775k c36775k = new C36775k(5);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, modifierM38560g, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i15, 196088);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(16, c2314t));
            AbstractC30795n.m94707h(appointmentSummaryBottomSheet.getBody(), null, c38072d.m121949b(c28655q, i14).getWhite70(), AbstractC35745c.m113246h(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 3072, i15, 196594);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(appointmentSummaryBottomSheet.getCloseButtonTitle());
            C13825t c13825tM48880a = AbstractC17269i.m48880a(0 * f13, c38072d.m121949b(c28655q, i14).getBrandWhite());
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C22432g(interfaceC2994c0, interfaceC4339a, c23196w3, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27271o0.m82253b(modifierM3409f, false, textResourceM21278l, null, null, c13825tM48880a, null, null, false, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 6) | 6, 0, 986);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m64685D(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C23196w3 c23196w3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c23196w3, null), 3);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m64686E(AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, int i13, Composer composer, int i14) {
        m64682A(appointmentSummaryBottomSheet, c23196w3, interfaceC4339a, interfaceC2994c0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m64699l(String source, C21610c navRouter, C21608a actionRouter, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC23462h interfaceC23462h;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R6;
        boolean zM87157i3;
        Object objM87133R7;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1395169162);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(actionRouter) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m64701n(interfaceC23462h).getViewState(), new C22383c(null, new C22383c.d(C33205o0.f138451a.m105288b(), null, null, null, 14, null), 0 == true ? 1 : 0, 5, 0 == true ? 1 : 0), null, c28655q, 0, 2);
                AbstractC14874j.m42904c(m64702o(interfaceC28601c1M87260n), "advanced_labs_home", c28655q, 48);
                zM87157i = c28655q.m87157i(interfaceC23462h);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                C22382b c22382bM64701n = m64701n(interfaceC23462h);
                zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new c(interfaceC23462h, navRouter, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c22382bM64701n);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                C22383c c22383cM64702o = m64702o(interfaceC28601c1M87260n);
                AppointmentSummaryBottomSheet appointmentSummaryBottomSheetM64710w = m64710w(interfaceC28601c1);
                AnyModal anyModalM64712y = m64712y(interfaceC28601c2);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C21937b(7, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i3 || objM87133R7 == c28676v0) {
                    C1040r c1040r = new C1040r(actionRouter, navRouter, interfaceC28601c1, interfaceC28601c2, interfaceC23462h, 20);
                    c28655q.m87172p0(c1040r);
                    objM87133R7 = c1040r;
                }
                c28655q = c28655q;
                boolean z17 = z16;
                m64700m(source, c22383cM64702o, z17, appointmentSummaryBottomSheetM64710w, anyModalM64712y, interfaceC4339a, (Function1) objM87133R7, c28655q, (i16 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i16 >> 3) & 896) | (AnyModal.$stable << 12), 0);
                z15 = z17;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(source, navRouter, actionRouter, z15, i13, i14, 19);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            if (i17 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m64701n(interfaceC23462h).getViewState(), new C22383c(null, new C22383c.d(C33205o0.f138451a.m105288b(), null, null, null, 14, null), 0 == true ? 1 : 0, 5, 0 == true ? 1 : 0), null, c28655q, 0, 2);
            AbstractC14874j.m42904c(m64702o(interfaceC28601c1M87260n2), "advanced_labs_home", c28655q, 48);
            zM87157i = c28655q.m87157i(interfaceC23462h);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            C22382b c22382bM64701n2 = m64701n(interfaceC23462h);
            zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c22382bM64701n2);
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            C22383c c22383cM64702o2 = m64702o(interfaceC28601c1M87260n2);
            AppointmentSummaryBottomSheet appointmentSummaryBottomSheetM64710w2 = m64710w(interfaceC28601c1);
            AnyModal anyModalM64712y2 = m64712y(interfaceC28601c2);
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C21937b(7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
            zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i3) {
                C1040r c1040r2 = new C1040r(actionRouter, navRouter, interfaceC28601c1, interfaceC28601c2, interfaceC23462h, 20);
                c28655q.m87172p0(c1040r2);
                objM87133R7 = c1040r2;
            } else {
                C1040r c1040r3 = new C1040r(actionRouter, navRouter, interfaceC28601c1, interfaceC28601c2, interfaceC23462h, 20);
                c28655q.m87172p0(c1040r3);
                objM87133R7 = c1040r3;
            }
            c28655q = c28655q;
            boolean z18 = z16;
            m64700m(source, c22383cM64702o2, z18, appointmentSummaryBottomSheetM64710w2, anyModalM64712y2, interfaceC4339a2, (Function1) objM87133R7, c28655q, (i16 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i16 >> 3) & 896) | (AnyModal.$stable << 12), 0);
            z15 = z18;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(source, navRouter, actionRouter, z15, i13, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0187  */
    /* JADX WARN: Code duplicated, block: B:118:0x018d  */
    /* JADX WARN: Code duplicated, block: B:120:0x019a  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x0200  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:137:0x0255  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    /* JADX INFO: renamed from: m */
    public static final void m64700m(String source, C22383c viewState, boolean z4, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AnyModal anyModal, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet2;
        int i17;
        int i18;
        boolean zM87157i;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a2;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        Function1 function2;
        boolean z15;
        AnyModal anyModal2;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheet4;
        AnyModal anyModal3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function3;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        C23196w3 c23196w3M67108l;
        boolean z17;
        boolean zM87153g;
        Object objM87133R2;
        int i29;
        Function1 function4;
        boolean z18;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1366501455);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet;
                    if (c28655q.m87153g(appointmentSummaryBottomSheet2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q.m87153g(anyModal);
                    } else {
                        zM87157i = c28655q.m87157i(anyModal);
                    }
                    if (zM87157i) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = 1;
                    if ((i15 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i34 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i16 != 0) {
                            appointmentSummaryBottomSheet4 = null;
                        } else {
                            appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                        }
                        if (i18 != 0) {
                            anyModal3 = null;
                        } else {
                            anyModal3 = anyModal;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22038b(23);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i26 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22429d(i28);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function3 = (Function1) objM87133R4;
                        } else {
                            function3 = function1;
                        }
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
                        c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                        boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0);
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = z17 | zM87157i2 | c28655q.m87153g(c23196w3M67108l);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        i29 = i15 >> 9;
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(-1052065702);
                            AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                            c28655q.m87173q(false);
                            function4 = function3;
                            interfaceC4339a2 = interfaceC4339a4;
                            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        } else if (viewState.getScreenContent() != null) {
                            c28655q.m87150e0(1745838969);
                            if ((3670016 & i15) == 1048576) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z18 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C21862n(function3, 16);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i35 = i15 >> 12;
                            Function1 function5 = function3;
                            AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i35 & 14), 60);
                            AbstractC22428c.m64623c(viewState, function5, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                            function4 = function5;
                            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                            AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i35 & 896) | (i15 & 14), 8);
                            if (appointmentSummaryBottomSheet2 == null) {
                                c28655q.m87150e0(1746195189);
                                c28655q.m87173q(false);
                                interfaceC4339a2 = interfaceC4339a4;
                            } else {
                                c28655q.m87150e0(1746195190);
                                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                                m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a5, interfaceC2994c0, c28655q, i29 & 896);
                                interfaceC4339a2 = interfaceC4339a5;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        } else {
                            function4 = function3;
                            interfaceC4339a2 = interfaceC4339a4;
                            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                            c28655q.m87150e0(1746515699);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        function2 = function4;
                        anyModal2 = anyModal3;
                    } else {
                        c28655q.m87138X();
                        function2 = function1;
                        z15 = z13;
                        anyModal2 = anyModal;
                    }
                    appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = 1;
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        appointmentSummaryBottomSheet4 = null;
                    } else {
                        appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                    }
                    if (i18 != 0) {
                        anyModal3 = null;
                    } else {
                        anyModal3 = anyModal;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22038b(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(i28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    EnumC23202x3 enumC23202x4 = EnumC23202x3.f91820w;
                    c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                    boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | zM87157i3 | c28655q.m87153g(c23196w3M67108l);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i29 = i15 >> 9;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1052065702);
                        AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                        c28655q.m87173q(false);
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    } else if (viewState.getScreenContent() != null) {
                        c28655q.m87150e0(1745838969);
                        if ((3670016 & i15) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i36 = i15 >> 12;
                        Function1 function6 = function3;
                        AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i36 & 14), 60);
                        AbstractC22428c.m64623c(viewState, function6, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                        function4 = function6;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i36 & 896) | (i15 & 14), 8);
                        if (appointmentSummaryBottomSheet2 == null) {
                            c28655q.m87150e0(1746195189);
                            c28655q.m87173q(false);
                            interfaceC4339a2 = interfaceC4339a4;
                        } else {
                            c28655q.m87150e0(1746195190);
                            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                            m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a6, interfaceC2994c0, c28655q, i29 & 896);
                            interfaceC4339a2 = interfaceC4339a6;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        c28655q.m87150e0(1746515699);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    function2 = function4;
                    anyModal2 = anyModal3;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    z15 = z13;
                    anyModal2 = anyModal;
                }
                appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= 3072;
            appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet;
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(anyModal);
                } else {
                    zM87157i = c28655q.m87157i(anyModal);
                }
                if (zM87157i) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = 1;
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        appointmentSummaryBottomSheet4 = null;
                    } else {
                        appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                    }
                    if (i18 != 0) {
                        anyModal3 = null;
                    } else {
                        anyModal3 = anyModal;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22038b(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(i28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    EnumC23202x3 enumC23202x5 = EnumC23202x3.f91820w;
                    c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                    boolean zM87157i4 = c28655q.m87157i(interfaceC2994c0);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | zM87157i4 | c28655q.m87153g(c23196w3M67108l);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i29 = i15 >> 9;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1052065702);
                        AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                        c28655q.m87173q(false);
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    } else if (viewState.getScreenContent() != null) {
                        c28655q.m87150e0(1745838969);
                        if ((3670016 & i15) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i37 = i15 >> 12;
                        Function1 function7 = function3;
                        AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i37 & 14), 60);
                        AbstractC22428c.m64623c(viewState, function7, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                        function4 = function7;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i37 & 896) | (i15 & 14), 8);
                        if (appointmentSummaryBottomSheet2 == null) {
                            c28655q.m87150e0(1746195189);
                            c28655q.m87173q(false);
                            interfaceC4339a2 = interfaceC4339a4;
                        } else {
                            c28655q.m87150e0(1746195190);
                            InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                            m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a7, interfaceC2994c0, c28655q, i29 & 896);
                            interfaceC4339a2 = interfaceC4339a7;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        c28655q.m87150e0(1746515699);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    function2 = function4;
                    anyModal2 = anyModal3;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    z15 = z13;
                    anyModal2 = anyModal;
                }
                appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = 1;
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    appointmentSummaryBottomSheet4 = null;
                } else {
                    appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                }
                if (i18 != 0) {
                    anyModal3 = null;
                } else {
                    anyModal3 = anyModal;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22038b(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(i28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                EnumC23202x3 enumC23202x6 = EnumC23202x3.f91820w;
                c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                boolean zM87157i5 = c28655q.m87157i(interfaceC2994c0);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | zM87157i5 | c28655q.m87153g(c23196w3M67108l);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                }
                i29 = i15 >> 9;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1052065702);
                    AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                    c28655q.m87173q(false);
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(1745838969);
                    if ((3670016 & i15) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i38 = i15 >> 12;
                    Function1 function8 = function3;
                    AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i38 & 14), 60);
                    AbstractC22428c.m64623c(viewState, function8, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                    function4 = function8;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i38 & 896) | (i15 & 14), 8);
                    if (appointmentSummaryBottomSheet2 == null) {
                        c28655q.m87150e0(1746195189);
                        c28655q.m87173q(false);
                        interfaceC4339a2 = interfaceC4339a4;
                    } else {
                        c28655q.m87150e0(1746195190);
                        InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                        m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a8, interfaceC2994c0, c28655q, i29 & 896);
                        interfaceC4339a2 = interfaceC4339a8;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    c28655q.m87150e0(1746515699);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                function2 = function4;
                anyModal2 = anyModal3;
            } else {
                c28655q.m87138X();
                function2 = function1;
                z15 = z13;
                anyModal2 = anyModal;
            }
            appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet;
                if (c28655q.m87153g(appointmentSummaryBottomSheet2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(anyModal);
                } else {
                    zM87157i = c28655q.m87157i(anyModal);
                }
                if (zM87157i) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = 1;
                if ((i15 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        appointmentSummaryBottomSheet4 = null;
                    } else {
                        appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                    }
                    if (i18 != 0) {
                        anyModal3 = null;
                    } else {
                        anyModal3 = anyModal;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22038b(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22429d(i28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function1;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    EnumC23202x3 enumC23202x7 = EnumC23202x3.f91820w;
                    c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                    boolean zM87157i6 = c28655q.m87157i(interfaceC2994c0);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = z17 | zM87157i6 | c28655q.m87153g(c23196w3M67108l);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i29 = i15 >> 9;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1052065702);
                        AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                        c28655q.m87173q(false);
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    } else if (viewState.getScreenContent() != null) {
                        c28655q.m87150e0(1745838969);
                        if ((3670016 & i15) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z18) {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21862n(function3, 16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i39 = i15 >> 12;
                        Function1 function9 = function3;
                        AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i39 & 14), 60);
                        AbstractC22428c.m64623c(viewState, function9, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                        function4 = function9;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i39 & 896) | (i15 & 14), 8);
                        if (appointmentSummaryBottomSheet2 == null) {
                            c28655q.m87150e0(1746195189);
                            c28655q.m87173q(false);
                            interfaceC4339a2 = interfaceC4339a4;
                        } else {
                            c28655q.m87150e0(1746195190);
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                            m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a9, interfaceC2994c0, c28655q, i29 & 896);
                            interfaceC4339a2 = interfaceC4339a9;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        function4 = function3;
                        interfaceC4339a2 = interfaceC4339a4;
                        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                        c28655q.m87150e0(1746515699);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    function2 = function4;
                    anyModal2 = anyModal3;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    z15 = z13;
                    anyModal2 = anyModal;
                }
                appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = 1;
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    appointmentSummaryBottomSheet4 = null;
                } else {
                    appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                }
                if (i18 != 0) {
                    anyModal3 = null;
                } else {
                    anyModal3 = anyModal;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22038b(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(i28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                EnumC23202x3 enumC23202x8 = EnumC23202x3.f91820w;
                c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                boolean zM87157i7 = c28655q.m87157i(interfaceC2994c0);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | zM87157i7 | c28655q.m87153g(c23196w3M67108l);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                }
                i29 = i15 >> 9;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1052065702);
                    AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                    c28655q.m87173q(false);
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(1745838969);
                    if ((3670016 & i15) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i310 = i15 >> 12;
                    Function1 function10 = function3;
                    AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i310 & 14), 60);
                    AbstractC22428c.m64623c(viewState, function10, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                    function4 = function10;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i310 & 896) | (i15 & 14), 8);
                    if (appointmentSummaryBottomSheet2 == null) {
                        c28655q.m87150e0(1746195189);
                        c28655q.m87173q(false);
                        interfaceC4339a2 = interfaceC4339a4;
                    } else {
                        c28655q.m87150e0(1746195190);
                        InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                        m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a10, interfaceC2994c0, c28655q, i29 & 896);
                        interfaceC4339a2 = interfaceC4339a10;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    c28655q.m87150e0(1746515699);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                function2 = function4;
                anyModal2 = anyModal3;
            } else {
                c28655q.m87138X();
                function2 = function1;
                z15 = z13;
                anyModal2 = anyModal;
            }
            appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= 3072;
        appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet;
        i18 = i14 & 16;
        if (i18 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q.m87153g(anyModal);
            } else {
                zM87157i = c28655q.m87157i(anyModal);
            }
            if (zM87157i) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(function1)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = 1;
            if ((i15 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    appointmentSummaryBottomSheet4 = null;
                } else {
                    appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
                }
                if (i18 != 0) {
                    anyModal3 = null;
                } else {
                    anyModal3 = anyModal;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22038b(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22429d(i28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function1;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                EnumC23202x3 enumC23202x9 = EnumC23202x3.f91820w;
                c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                boolean zM87157i8 = c28655q.m87157i(interfaceC2994c0);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = z17 | zM87157i8 | c28655q.m87153g(c23196w3M67108l);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                    c28655q.m87172p0(objM87133R2);
                }
                i29 = i15 >> 9;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1052065702);
                    AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                    c28655q.m87173q(false);
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(1745838969);
                    if ((3670016 & i15) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z18) {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21862n(function3, 16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i311 = i15 >> 12;
                    Function1 function11 = function3;
                    AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i311 & 14), 60);
                    AbstractC22428c.m64623c(viewState, function11, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                    function4 = function11;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i311 & 896) | (i15 & 14), 8);
                    if (appointmentSummaryBottomSheet2 == null) {
                        c28655q.m87150e0(1746195189);
                        c28655q.m87173q(false);
                        interfaceC4339a2 = interfaceC4339a4;
                    } else {
                        c28655q.m87150e0(1746195190);
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a4;
                        m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a11, interfaceC2994c0, c28655q, i29 & 896);
                        interfaceC4339a2 = interfaceC4339a11;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    function4 = function3;
                    interfaceC4339a2 = interfaceC4339a4;
                    appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                    c28655q.m87150e0(1746515699);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                function2 = function4;
                anyModal2 = anyModal3;
            } else {
                c28655q.m87138X();
                function2 = function1;
                z15 = z13;
                anyModal2 = anyModal;
            }
            appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q.m87157i(function1)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i15 |= i27;
        }
        i28 = 1;
        if ((i15 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i34 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                appointmentSummaryBottomSheet4 = null;
            } else {
                appointmentSummaryBottomSheet4 = appointmentSummaryBottomSheet2;
            }
            if (i18 != 0) {
                anyModal3 = null;
            } else {
                anyModal3 = anyModal;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C22038b(23);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i26 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C22429d(i28);
                    c28655q.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function1;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            EnumC23202x3 enumC23202x10 = EnumC23202x3.f91820w;
            c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
            boolean zM87157i9 = c28655q.m87157i(interfaceC2994c0);
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87153g = z17 | zM87157i9 | c28655q.m87153g(c23196w3M67108l);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new d(interfaceC2994c0, appointmentSummaryBottomSheet4, c23196w3M67108l, null);
                c28655q.m87172p0(objM87133R2);
            }
            i29 = i15 >> 9;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, appointmentSummaryBottomSheet4);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1052065702);
                AbstractC22427b.m64613g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 15) & 112);
                c28655q.m87173q(false);
                function4 = function3;
                interfaceC4339a2 = interfaceC4339a4;
                appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1745838969);
                if ((3670016 & i15) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C21862n(function3, 16);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C21862n(function3, 16);
                    c28655q.m87172p0(objM87133R3);
                }
                int i312 = i15 >> 12;
                Function1 function12 = function3;
                AbstractC0564o.m1394P(anyModal3, (Function1) objM87133R3, null, null, null, null, c28655q, AnyModal.$stable | (i312 & 14), 60);
                AbstractC22428c.m64623c(viewState, function12, c28655q, ((i15 >> 3) & 14) | ((i15 >> 15) & 112));
                function4 = function12;
                appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                AbstractC22431f.m64677v(source, viewState.getScreenContent(), function4, null, z16, c28655q, ((i15 << 6) & 57344) | (i312 & 896) | (i15 & 14), 8);
                if (appointmentSummaryBottomSheet2 == null) {
                    c28655q.m87150e0(1746195189);
                    c28655q.m87173q(false);
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87150e0(1746195190);
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
                    m64682A(appointmentSummaryBottomSheet2, c23196w3M67108l, interfaceC4339a12, interfaceC2994c0, c28655q, i29 & 896);
                    interfaceC4339a2 = interfaceC4339a12;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                function4 = function3;
                interfaceC4339a2 = interfaceC4339a4;
                appointmentSummaryBottomSheet2 = appointmentSummaryBottomSheet4;
                c28655q.m87150e0(1746515699);
                c28655q.m87173q(false);
            }
            z15 = z16;
            function2 = function4;
            anyModal2 = anyModal3;
        } else {
            c28655q.m87138X();
            function2 = function1;
            z15 = z13;
            anyModal2 = anyModal;
        }
        appointmentSummaryBottomSheet3 = appointmentSummaryBottomSheet2;
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(source, viewState, z15, appointmentSummaryBottomSheet3, anyModal2, interfaceC4339a3, function2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C22382b m64701n(InterfaceC23462h interfaceC23462h) {
        return (C22382b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final C22383c m64702o(InterfaceC28670t2 interfaceC28670t2) {
        return (C22383c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m64703p(InterfaceC28601c1 interfaceC28601c1) {
        m64711x(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m64704q(C21608a c21608a, C21610c c21610c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC23462h interfaceC23462h, InterfaceC22381a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC22381a interfaceC22381aM60769d = c21608a.m60769d(event);
        if (interfaceC22381aM60769d instanceof InterfaceC22381a.f1) {
            InterfaceC22381a.f1 f1Var = (InterfaceC22381a.f1) interfaceC22381aM60769d;
            if (f1Var instanceof InterfaceC22381a.p0) {
                m64711x(interfaceC28601c1, ((InterfaceC22381a.p0) interfaceC22381aM60769d).getBottomSheet());
            } else if (f1Var instanceof InterfaceC22381a.j0) {
                m64713z(interfaceC28601c2, ((InterfaceC22381a.j0) interfaceC22381aM60769d).getModal());
            } else if (f1Var instanceof InterfaceC22381a.r) {
                m64713z(interfaceC28601c2, null);
            } else {
                m64701n(interfaceC23462h).m64357r(f1Var);
            }
        } else if (interfaceC22381aM60769d instanceof InterfaceC22381a.a0) {
            c21610c.m60774e((InterfaceC22381a.a0) interfaceC22381aM60769d);
        } else if (interfaceC22381aM60769d instanceof InterfaceC22381a.i) {
            m64701n(interfaceC23462h).m64356q(((InterfaceC22381a.i) interfaceC22381aM60769d).getActionViewEvent());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m64705r(String str, C21610c c21610c, C21608a c21608a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m64699l(str, c21610c, c21608a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m64706s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m64707t(InterfaceC22381a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m64708u(Function1 function1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        function1.invoke(AbstractC22439n.m64739a(modalEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m64709v(String str, C22383c c22383c, boolean z4, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet, AnyModal anyModal, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m64700m(str, c22383c, z4, appointmentSummaryBottomSheet, anyModal, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final AppointmentSummaryBottomSheet m64710w(InterfaceC28601c1 interfaceC28601c1) {
        return (AppointmentSummaryBottomSheet) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m64711x(InterfaceC28601c1 interfaceC28601c1, AppointmentSummaryBottomSheet appointmentSummaryBottomSheet) {
        interfaceC28601c1.setValue(appointmentSummaryBottomSheet);
    }

    /* JADX INFO: renamed from: y */
    private static final AnyModal m64712y(InterfaceC28601c1 interfaceC28601c1) {
        return (AnyModal) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m64713z(InterfaceC28601c1 interfaceC28601c1, AnyModal anyModal) {
        interfaceC28601c1.setValue(anyModal);
    }
}
