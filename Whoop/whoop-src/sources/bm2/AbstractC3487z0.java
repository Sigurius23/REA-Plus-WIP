package bm2;

import a00.C0073h;
import a01.C0084d;
import a01.C0086f;
import am2.InterfaceC1038q;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.DatePicker;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b72.C2783a;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4835w;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d42.C11689e;
import gy0.AbstractC16277f;
import hv1.C17671a;
import hv1.C17672b;
import hv1.C17673c;
import hv1.C17675e;
import hv1.C17676f;
import hv1.C17677g;
import hy0.AbstractC17755i2;
import hy0.C17736e;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.C2026r;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p000.C17820i;
import p000.C21061j;
import p000.C22079k;
import p000.C24827m;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p294l3.C23254g;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl2.AbstractC32706a;
import sl2.AbstractC32707b;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x21.AbstractC37861d;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: bm2.z0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aQ\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006&²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lhv1/e;", "viewState", "Lg1/y3;", "bottomSheetState", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function1;", "Lam2/q;", "Ll83/a0;", "onMenuBottomSheetEvent", "Lcm2/w;", "onAnalyticsEvent", "M", "(Lhv1/e;Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "E", "(Lhv1/e;Lkotlin/jvm/functions/Function1;Lg1/y3;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V", "Lhv1/c;", "item", "y", "(Lhv1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhv1/g;", "R", "(Lhv1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhv1/f;", "selectedSource", "", "sourceItems", "b0", "(Lhv1/f;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhv1/b;", "bottomSheetDialogState", "Ljava/time/LocalDateTime;", "currentDateTime", "", "currentValue", "", "showPicker", "dropdownExpanded", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3487z0 {

    /* JADX INFO: renamed from: bm2.z0$a */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.TrendMenuSheetScreenKt$SheetContent$1$3$3$1$1", m100430f = "TrendMenuSheetScreen.kt", m100431l = {188}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f13712x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13712x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f13712x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13711w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f13712x;
                this.f13711w = 1;
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

    /* JADX INFO: renamed from: bm2.z0$b */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.TrendMenuSheetScreenKt$TrendMenuSheetScreen$2$1", m100430f = "TrendMenuSheetScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C17675e f13713E;

        /* JADX INFO: renamed from: w */
        int f13714w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f13715x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f13716y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f13717z;

        /* JADX INFO: renamed from: bm2.z0$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.TrendMenuSheetScreenKt$TrendMenuSheetScreen$2$1$1", m100430f = "TrendMenuSheetScreen.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f13718w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15199y3 f13719x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Function1 f13720y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C17675e f13721z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C15199y3 c15199y3, Function1 function1, C17675e c17675e, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f13719x = c15199y3;
                this.f13720y = function1;
                this.f13721z = c17675e;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f13719x, this.f13720y, this.f13721z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f13718w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y3 = this.f13719x;
                    this.f13718w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (this.f13719x.m43221b() == EnumC15209z3.f57107x) {
                    this.f13720y.invoke(new AbstractC4835w.b(this.f13721z.getMeasurementType()));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, C17675e c17675e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13715x = interfaceC2994c0;
            this.f13716y = c15199y3;
            this.f13717z = function1;
            this.f13713E = c17675e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f13715x, this.f13716y, this.f13717z, this.f13713E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13714w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f13715x, null, null, new a(this.f13716y, this.f13717z, this.f13713E, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm2.z0$c */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.component.TrendMenuSheetScreenKt$TrendMenuSheetScreen$3$1$1", m100430f = "TrendMenuSheetScreen.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13722w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2464x2 f13723x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f13724y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2464x2 interfaceC2464x2, C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13723x = interfaceC2464x2;
            this.f13724y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f13723x, this.f13724y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13722w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC2464x2 interfaceC2464x2 = this.f13723x;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                C15199y3 c15199y3 = this.f13724y;
                this.f13722w = 1;
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

    /* JADX INFO: renamed from: bm2.z0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f13725w;

        public d(InterfaceC28601c1 interfaceC28601c1) {
            this.f13725w = interfaceC28601c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m10283b(InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
            AbstractC3487z0.m10239V(interfaceC28601c1, false);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C3425a1(0, this.f13725w), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m10218A(InterfaceC28601c1 interfaceC28601c1, LocalDateTime localDateTime) {
        interfaceC28601c1.setValue(localDateTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m10219B(Calendar calendar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        LocalDateTime localDateTimeOf = LocalDateTime.of(calendar.get(1), calendar.get(2) + 1, calendar.get(5), m10281z(interfaceC28601c1).getHour(), m10281z(interfaceC28601c1).getMinute());
        AbstractC22676k.m65747g(localDateTimeOf);
        m10218A(interfaceC28601c1, localDateTimeOf);
        function1.invoke(new InterfaceC1038q.a(localDateTimeOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m10220C(DatePickerDialog datePickerDialog) {
        datePickerDialog.show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m10221D(C17673c c17673c, Function1 function1, int i13, Composer composer, int i14) {
        m10280y(c17673c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:102:0x031f  */
    /* JADX WARN: Code duplicated, block: B:104:0x032c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0342  */
    /* JADX WARN: Code duplicated, block: B:110:0x0355  */
    /* JADX WARN: Code duplicated, block: B:111:0x0357  */
    /* JADX WARN: Code duplicated, block: B:120:0x0375  */
    /* JADX WARN: Code duplicated, block: B:126:0x0383  */
    /* JADX WARN: Code duplicated, block: B:90:0x0296  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f4  */
    /* JADX INFO: renamed from: E */
    private static final void m10222E(C17675e c17675e, Function1 function1, C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Composer composer, int i13) {
        C28655q c28655q;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z4;
        C17671a c17671aM50434e;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        C17672b c17672bM10223F;
        C23254g c23254gM50415a;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        boolean z18;
        C2314t c2314t;
        C28676v0 c28676v2;
        float f13;
        int i14;
        C28655q c28655q2;
        C2305k c2305k = C2299e.f9111N;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(511121128);
        int i15 = (i13 & 6) == 0 ? (c28655q3.m87157i(c17675e) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(c15199y3) : c28655q3.m87157i(c15199y3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Object objM87133R4 = c28655q3.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            C23254g c23254gM9922p = null;
            if (objM87133R4 == c28676v3) {
                objM87133R4 = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            int i16 = i15;
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 8;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC1099a.m3394p(1 * f14, AbstractC1102d.m3407d(1.0f, c2314t2))), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(6, 4, c2305k, c28655q3, 54);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            c28655q3.m87150e0(1359905745);
            for (InterfaceC25312u interfaceC25312u : c17675e.m50431a()) {
                if (interfaceC25312u instanceof C17736e) {
                    c28655q3.m87150e0(1346207712);
                    C2314t c2314t3 = c2314t2;
                    f13 = f14;
                    i14 = i16;
                    C28655q c28655q4 = c28655q3;
                    c28676v2 = c28676v3;
                    AbstractC17755i2.m50938j(null, null, null, ((C17736e) interfaceC25312u).getTitle(), null, 0L, 0L, null, c28655q4, TextResource.$stable << 9, 247);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                    interfaceC28601c2 = interfaceC28601c2;
                    c2314t = c2314t3;
                } else {
                    c2314t = c2314t2;
                    c28676v2 = c28676v3;
                    f13 = f14;
                    i14 = i16;
                    c28655q2 = c28655q3;
                    if (interfaceC25312u instanceof C17673c) {
                        c28655q2.m87150e0(1346210187);
                        m10280y((C17673c) interfaceC25312u, function1, c28655q2, i14 & 112);
                        c28655q2.m87173q(false);
                    } else if (interfaceC25312u instanceof C17677g) {
                        c28655q2.m87150e0(1346212937);
                        m10235R((C17677g) interfaceC25312u, function1, c28655q2, i14 & 112);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-1217018622);
                        c28655q2.m87173q(false);
                    }
                }
                c28655q3 = c28655q2;
                c2314t2 = c2314t;
                i16 = i14;
                f14 = f13;
                c28676v3 = c28676v2;
            }
            C2314t c2314t4 = c2314t2;
            C28676v0 c28676v4 = c28676v3;
            float f15 = f14;
            int i17 = i16;
            C28655q c28655q5 = c28655q3;
            c28655q5.m87173q(false);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q5, new LayoutWeightElement(1.0f, true));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q5, 54);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j2);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m2);
            C0209i c0209i2 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N2);
            c28655q5.m87150e0(-574564790);
            C17671a c17671aM50433c = c17675e.getPrimaryButtonState();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t4);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            TextResource textResourceM50413b = c17671aM50433c.getText();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM50413b, c28655q5, i18);
            boolean zM50414c = c17671aM50433c.getIsEnabled();
            long jM125371X = C38072d.f163053a.m121949b(c28655q5, C38072d.f163054b).getRecovery();
            boolean zM87157i2 = c28655q5.m87157i(c17671aM50433c);
            Object objM87133R5 = c28655q5.m87133R();
            if (zM87157i2) {
                c28676v0 = c28676v4;
            } else {
                c28676v0 = c28676v4;
                if (objM87133R5 == c28676v0) {
                }
                c28676v1 = c28676v0;
                interfaceC28601c1 = interfaceC28601c2;
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h, zM50414c, jM125371X, null, false, (InterfaceC4339a) objM87133R5, c28655q5, 54, 96);
                c28655q = c28655q5;
                z4 = false;
                c28655q.m87173q(false);
                c17671aM50434e = c17675e.getSecondaryButtonState();
                if (c17671aM50434e == null) {
                    c28655q.m87150e0(-631168167);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-631168166);
                    TextResource textResourceM50413b2 = c17671aM50434e.getText();
                    zM87157i = c28655q.m87157i(c17671aM50434e);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v1) {
                        objM87133R = new C3169c(3, c17671aM50434e, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM50413b2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, i18 << 6, 0, 4091);
                    c28655q = c28655q;
                    z4 = false;
                    c28655q.m87173q(false);
                }
                z13 = true;
                c28655q.m87173q(true);
                c17672bM10223F = m10223F(interfaceC28601c1);
                if (c17672bM10223F == null) {
                    c28655q.m87150e0(-791311867);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-791311866);
                    TextResource textResourceM50422h = c17672bM10223F.getTitle();
                    TextResource textResourceM50417c = c17672bM10223F.getDescription();
                    TextResource textResourceM50419e = c17672bM10223F.getPrimaryButtonTitle();
                    TextResource textResourceM50420f = c17672bM10223F.getSecondaryButtonTitle();
                    EnumC39333f enumC39333fM50418d = c17672bM10223F.getPrimaryActionColor();
                    c23254gM50415a = c17672bM10223F.getAnnotatedString();
                    if (c23254gM50415a == null) {
                        c28655q.m87150e0(1679689503);
                        z14 = false;
                    } else {
                        z14 = false;
                        c28655q.m87150e0(1679689504);
                        c23254gM9922p = AbstractC3435e.m9922p(c23254gM50415a, c28655q, 0);
                    }
                    c28655q.m87173q(z14);
                    C23254g c23254g = c23254gM9922p;
                    boolean zM50421g = c17672bM10223F.getShowCloseIcon();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v1) {
                        objM87133R2 = new C3464o(5, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if ((i17 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    boolean zM87157i3 = z15 | c28655q.m87157i(c17672bM10223F) | c28655q.m87157i(interfaceC2994c0);
                    if ((i17 & 896) != 256 || ((i17 & 512) != 0 && c28655q.m87157i(c15199y3))) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    z17 = z16 | zM87157i3;
                    objM87133R3 = c28655q.m87133R();
                    if (!z17 || objM87133R3 == c28676v1) {
                        z18 = true;
                        C0073h c0073h = new C0073h(function1, c17672bM10223F, interfaceC2994c0, interfaceC28601c1, c15199y3, 5);
                        c28655q.m87172p0(c0073h);
                        objM87133R3 = c0073h;
                    } else {
                        z18 = true;
                    }
                    C28655q c28655q6 = c28655q;
                    z13 = z18;
                    AbstractC21211n.m59497o(null, textResourceM50422h, textResourceM50417c, textResourceM50419e, false, enumC39333fM50418d, null, null, null, textResourceM50420f, null, false, zM50421g, null, null, false, 0, null, c23254g, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q6, (i18 << 3) | (i18 << 6) | (i18 << 9) | (i18 << 27), 0, 384, 247197137);
                    c28655q = c28655q6;
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z13);
            }
            objM87133R5 = new C17820i(27, c17671aM50433c, interfaceC28601c2);
            c28655q5.m87172p0(objM87133R5);
            c28676v1 = c28676v0;
            interfaceC28601c1 = interfaceC28601c2;
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h, zM50414c, jM125371X, null, false, (InterfaceC4339a) objM87133R5, c28655q5, 54, 96);
            c28655q = c28655q5;
            z4 = false;
            c28655q.m87173q(false);
            c17671aM50434e = c17675e.getSecondaryButtonState();
            if (c17671aM50434e == null) {
                c28655q.m87150e0(-631168167);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-631168166);
                TextResource textResourceM50413b3 = c17671aM50434e.getText();
                zM87157i = c28655q.m87157i(c17671aM50434e);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C3169c(3, c17671aM50434e, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3169c(3, c17671aM50434e, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM50413b3, null, null, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, i18 << 6, 0, 4091);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            }
            z13 = true;
            c28655q.m87173q(true);
            c17672bM10223F = m10223F(interfaceC28601c1);
            if (c17672bM10223F == null) {
                c28655q.m87150e0(-791311867);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-791311866);
                TextResource textResourceM50422h2 = c17672bM10223F.getTitle();
                TextResource textResourceM50417c2 = c17672bM10223F.getDescription();
                TextResource textResourceM50419e2 = c17672bM10223F.getPrimaryButtonTitle();
                TextResource textResourceM50420f2 = c17672bM10223F.getSecondaryButtonTitle();
                EnumC39333f enumC39333fM50418d2 = c17672bM10223F.getPrimaryActionColor();
                c23254gM50415a = c17672bM10223F.getAnnotatedString();
                if (c23254gM50415a == null) {
                    c28655q.m87150e0(1679689503);
                    z14 = false;
                } else {
                    z14 = false;
                    c28655q.m87150e0(1679689504);
                    c23254gM9922p = AbstractC3435e.m9922p(c23254gM50415a, c28655q, 0);
                }
                c28655q.m87173q(z14);
                C23254g c23254g2 = c23254gM9922p;
                boolean zM50421g2 = c17672bM10223F.getShowCloseIcon();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v1) {
                    objM87133R2 = new C3464o(5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if ((i17 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                boolean zM87157i4 = z15 | c28655q.m87157i(c17672bM10223F) | c28655q.m87157i(interfaceC2994c0);
                if ((i17 & 896) != 256) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                z17 = z16 | zM87157i4;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    z18 = true;
                    C0073h c0073h2 = new C0073h(function1, c17672bM10223F, interfaceC2994c0, interfaceC28601c1, c15199y3, 5);
                    c28655q.m87172p0(c0073h2);
                    objM87133R3 = c0073h2;
                } else {
                    z18 = true;
                    C0073h c0073h3 = new C0073h(function1, c17672bM10223F, interfaceC2994c0, interfaceC28601c1, c15199y3, 5);
                    c28655q.m87172p0(c0073h3);
                    objM87133R3 = c0073h3;
                }
                C28655q c28655q7 = c28655q;
                z13 = z18;
                AbstractC21211n.m59497o(null, textResourceM50422h2, textResourceM50417c2, textResourceM50419e2, false, enumC39333fM50418d2, null, null, null, textResourceM50420f2, null, false, zM50421g2, null, null, false, 0, null, c23254g2, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q7, (i18 << 3) | (i18 << 6) | (i18 << 9) | (i18 << 27), 0, 384, 247197137);
                c28655q = c28655q7;
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(i13, 29, c17675e, c15199y3, interfaceC2994c0, function1);
        }
    }

    /* JADX INFO: renamed from: F */
    private static final C17672b m10223F(InterfaceC28601c1 interfaceC28601c1) {
        return (C17672b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m10224G(InterfaceC28601c1 interfaceC28601c1, C17672b c17672b) {
        interfaceC28601c1.setValue(c17672b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m10225H(C17671a c17671a, InterfaceC28601c1 interfaceC28601c1) {
        m10224G(interfaceC28601c1, c17671a.getDialogState());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m10226I(C17671a c17671a, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m10224G(interfaceC28601c1, c17671a.getDialogState());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m10227J(InterfaceC28601c1 interfaceC28601c1) {
        m10224G(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m10228K(Function1 function1, C17672b c17672b, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3) {
        function1.invoke(c17672b.getApproveEvent());
        m10224G(interfaceC28601c1, null);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m10229L(C17675e c17675e, Function1 function1, C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, int i13, Composer composer, int i14) {
        m10222E(c17675e, function1, c15199y3, interfaceC2994c0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    public static final void m10230M(C17675e c17675e, C15199y3 bottomSheetState, InterfaceC2994c0 interfaceC2994c0, Function1 onMenuBottomSheetEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC2464x2 interfaceC2464x2;
        int i17;
        boolean z13;
        boolean z14;
        boolean zM87157i;
        Object objM87133R;
        int i18;
        Function1 function4;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        Object objM87133R3;
        C17675e viewState = c17675e;
        InterfaceC2994c0 coroutineScope = interfaceC2994c0;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(onMenuBottomSheetEvent, "onMenuBottomSheetEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-910570438);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(bottomSheetState) : c28655q2.m87157i(bottomSheetState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(coroutineScope) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(onMenuBottomSheetEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2783a(26);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
                boolean zM87157i2 = c28655q2.m87157i(coroutineScope);
                i17 = i16 & 112;
                if (i17 != 32 || ((i16 & 64) != 0 && c28655q2.m87157i(bottomSheetState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = zM87157i2 | z13;
                if ((i16 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z17 | z14 | c28655q2.m87157i(viewState);
                objM87133R = c28655q2.m87133R();
                if (!zM87157i || objM87133R == c28676v0) {
                    Function1 function5 = function2;
                    i18 = i17;
                    b bVar = new b(coroutineScope, bottomSheetState, function5, viewState, null);
                    coroutineScope = coroutineScope;
                    viewState = viewState;
                    function4 = function5;
                    c28655q2.m87172p0(bVar);
                    objM87133R = bVar;
                } else {
                    Function1 function6 = function2;
                    i18 = i17;
                    function4 = function6;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
                C35666g c35666g = new C35666g(viewState.getSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
                C33252i c33252i = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
                AbstractC35664f.a aVar = new AbstractC35664f.a(bottomSheetState);
                boolean zM87157i3 = c28655q2.m87157i(coroutineScope) | c28655q2.m87153g(interfaceC2464x2);
                if (i18 != 32 || ((i16 & 64) != 0 && c28655q2.m87157i(bottomSheetState))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i3 | z15;
                objM87133R2 = c28655q2.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3718c(coroutineScope, interfaceC2464x2, bottomSheetState, 20);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC35660d.m112871m(modifierM66724m, c35666g, aVar, null, (InterfaceC4339a) objM87133R2, null, c33252i, AbstractC37817c.m121344e(-1139991860, c28655q2, new C2026r(viewState, onMenuBottomSheetEvent, bottomSheetState, coroutineScope)), true, null, null, null, false, null, C3426b.f13411a.m9898b(), c28655q, (C35666g.f151591h << 3) | 113246208 | (AbstractC35664f.a.f151587c << 6), 24576, 15912);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(viewState, bottomSheetState, coroutineScope, onMenuBottomSheetEvent, function3, i13, i14, 9);
            }
        }
        i15 |= 24576;
        function2 = function1;
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C2783a(26);
                    c28655q2.m87172p0(objM87133R3);
                }
                function2 = (Function1) objM87133R3;
            }
            interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            boolean zM87157i4 = c28655q2.m87157i(coroutineScope);
            i17 = i16 & 112;
            if (i17 != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            boolean z18 = zM87157i4 | z13;
            if ((i16 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z18 | z14 | c28655q2.m87157i(viewState);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                Function1 function7 = function2;
                i18 = i17;
                b bVar2 = new b(coroutineScope, bottomSheetState, function7, viewState, null);
                coroutineScope = coroutineScope;
                viewState = viewState;
                function4 = function7;
                c28655q2.m87172p0(bVar2);
                objM87133R = bVar2;
            } else {
                Function1 function8 = function2;
                i18 = i17;
                b bVar3 = new b(coroutineScope, bottomSheetState, function8, viewState, null);
                coroutineScope = coroutineScope;
                viewState = viewState;
                function4 = function8;
                c28655q2.m87172p0(bVar3);
                objM87133R = bVar3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            C35666g c35666g2 = new C35666g(viewState.getSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
            C33252i c33252i2 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
            AbstractC35664f.a aVar2 = new AbstractC35664f.a(bottomSheetState);
            boolean zM87157i5 = c28655q2.m87157i(coroutineScope) | c28655q2.m87153g(interfaceC2464x2);
            if (i18 != 32) {
                z15 = true;
            } else {
                z15 = true;
            }
            z16 = zM87157i5 | z15;
            objM87133R2 = c28655q2.m87133R();
            if (z16) {
                objM87133R2 = new C3718c(coroutineScope, interfaceC2464x2, bottomSheetState, 20);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3718c(coroutineScope, interfaceC2464x2, bottomSheetState, 20);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC35660d.m112871m(modifierM66724m2, c35666g2, aVar2, null, (InterfaceC4339a) objM87133R2, null, c33252i2, AbstractC37817c.m121344e(-1139991860, c28655q2, new C2026r(viewState, onMenuBottomSheetEvent, bottomSheetState, coroutineScope)), true, null, null, null, false, null, C3426b.f13411a.m9898b(), c28655q, (C35666g.f151591h << 3) | 113246208 | (AbstractC35664f.a.f151587c << 6), 24576, 15912);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(viewState, bottomSheetState, coroutineScope, onMenuBottomSheetEvent, function3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m10231N(AbstractC4835w it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m10232O(InterfaceC2994c0 interfaceC2994c0, InterfaceC2464x2 interfaceC2464x2, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(interfaceC2464x2, c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m10233P(C17675e c17675e, Function1 function1, C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m10222E(c17675e, function1, c15199y3, interfaceC2994c0, c28655q, 512);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m10234Q(C17675e c17675e, C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m10230M(c17675e, c15199y3, interfaceC2994c0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:102:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0408  */
    /* JADX WARN: Code duplicated, block: B:113:0x0433  */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:46:0x019e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:68:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0309  */
    /* JADX WARN: Code duplicated, block: B:79:0x033c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0344  */
    /* JADX WARN: Code duplicated, block: B:86:0x0364  */
    /* JADX WARN: Code duplicated, block: B:92:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:93:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
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
    /* JADX INFO: renamed from: R */
    public static final void m10235R(C17677g item, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        float f13;
        C0209i c0209i;
        int i15;
        C38072d c38072d;
        int i16;
        float f14;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i2;
        InterfaceC28601c1 interfaceC28601c2;
        int iHashCode2;
        C0209i c0209i3;
        InterfaceC4339a interfaceC4339a2;
        ?? r10;
        int i17;
        Object objM87133R2;
        Object objM87133R3;
        int iHashCode3;
        InterfaceC4339a interfaceC4339a3;
        C0209i c0209i4;
        int iHashCode4;
        boolean z4;
        Object objM87133R4;
        Object objM87133R5;
        Object onMenuBottomSheetEvent = function1;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(onMenuBottomSheetEvent, "onMenuBottomSheetEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-211377011);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(item) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onMenuBottomSheetEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R6 = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R6 == obj) {
                objM87133R6 = AbstractC31061c.m95646v(item.getVo2MaxValue(), c28655q2);
            }
            InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R6;
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == obj) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R7);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == obj) {
                objM87133R8 = new d(interfaceC28601c3);
                c28655q2.m87172p0(objM87133R8);
            }
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3409f, C23454a0.f92919a, (PointerInputEventHandler) objM87133R8);
            float f15 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15 * f15), C2299e.f9110M, c28655q2, 6);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM108903b);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a4 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a4);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            int i18 = i14;
            if (c28655q2.f115903S) {
                f13 = f15;
            } else {
                f13 = f15;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
                TextResource textResourceM50438a = item.getMeasurementTitle();
                i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM50438a, c28655q2, i15);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i16).getH5();
                long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 0, i19, 196602);
                float f16 = 2;
                f14 = f16 * f13;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i16).getBlack30(), AbstractC33253j.m105489e(f14));
                objM87133R = c28655q2.m87133R();
                if (objM87133R == obj) {
                    interfaceC28601c1 = interfaceC28601c3;
                    objM87133R = new C3464o(6, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC28601c1 = interfaceC28601c3;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    interfaceC4339a = interfaceC4339a4;
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    interfaceC4339a = interfaceC4339a4;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    c0209i2 = c0209i7;
                } else {
                    c0209i2 = c0209i7;
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N2);
                float f17 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f16 * f17, AbstractC1102d.m3409f(1.0f, c2314t));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                interfaceC28601c2 = interfaceC28601c1;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N3);
                c0209i3 = c0209i2;
                interfaceC4339a2 = interfaceC4339a;
                AbstractC30795n.m94707h(String.valueOf(m10236S(interfaceC28593a1)), null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(item.getUnit(), c28655q2, i15), null, c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i19, 196602);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                if (m10238U(interfaceC28601c2)) {
                    c28655q2.m87150e0(-379776605);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C3464o(7, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3407d, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        c0209i4 = c0209i3;
                    } else {
                        c0209i4 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N4);
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), c38072d.m121949b(c28655q2, i16).getTransparent(), AbstractC33253j.m105489e(f14));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N5);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    int iM10236S = m10236S(interfaceC28593a1);
                    int iM50445i = item.getVo2MinAllowedValue();
                    int iM50443g = item.getVo2MaxAllowedValue();
                    if ((i18 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objM87133R4 = c28655q2.m87133R();
                    if (z4 || objM87133R4 == obj) {
                        objM87133R4 = new C3481w0(function1, interfaceC28593a1, 0);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function2 = (Function1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == obj) {
                        objM87133R5 = new C2783a(25);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    i17 = i15;
                    r10 = 1;
                    AbstractC37861d.m121396i(textResourceM21267a, iM10236S, iM50445i, iM50443g, true, function2, (Function1) objM87133R5, true, false, null, null, c28655q2, i15 | 114843648, 0, 1536);
                    AbstractC25012a.m73392y(c28655q2, true, true, false);
                } else {
                    r10 = 1;
                    i17 = i15;
                    c28655q2.m87150e0(-378396609);
                    c28655q2.m87173q(false);
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(item.getSourceHeader(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getH5(), null, c28655q2, 0, i19, 196602);
                m10247b0(item.getSource(), item.m50441e(), function1, c28655q2, i17 | ((i18 << 3) & 896));
                onMenuBottomSheetEvent = function1;
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC32706a.f135968v, c28655q2, 0), AbstractC1099a.m3394p(((float) r10) * f17, c2314t), c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB2(), null, c28655q2, 48, i19, 196600);
                C28655q c28655q3 = c28655q2;
                c28655q3.m87173q(r10);
                c28655q = c28655q3;
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i7);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N);
            TextResource textResourceM50438a2 = item.getMeasurementTitle();
            i15 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM50438a2, c28655q2, i15);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            C2886a c2886aM8438s2 = c38072d.m121952e(c28655q2, i16).getH5();
            long jM125430y2 = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q2, 0, i110, 196602);
            float f18 = 2;
            f14 = f18 * f13;
            Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i16).getBlack30(), AbstractC33253j.m105489e(f14));
            objM87133R = c28655q2.m87133R();
            if (objM87133R == obj) {
                interfaceC28601c1 = interfaceC28601c3;
                objM87133R = new C3464o(6, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R);
            } else {
                interfaceC28601c1 = interfaceC28601c3;
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3358c3, false, null, null, (InterfaceC4339a) objM87133R, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9117z, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3362g2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                interfaceC4339a = interfaceC4339a4;
                c28655q2.m87163l(interfaceC4339a);
            } else {
                interfaceC4339a = interfaceC4339a4;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i7;
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            } else {
                c0209i2 = c0209i7;
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N6);
            float f19 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f18 * f19, AbstractC1102d.m3409f(1.0f, c2314t));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            interfaceC28601c2 = interfaceC28601c1;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m7);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N7);
            c0209i3 = c0209i2;
            interfaceC4339a2 = interfaceC4339a;
            AbstractC30795n.m94707h(String.valueOf(m10236S(interfaceC28593a1)), null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i110, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(item.getUnit(), c28655q2, i15), null, c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i110, 196602);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (m10238U(interfaceC28601c2)) {
                c28655q2.m87150e0(-379776605);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C3464o(7, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3407d2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3360e2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q2.m87163l(interfaceC4339a3);
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    c0209i4 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                } else {
                    c0209i4 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N8);
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), c38072d.m121949b(c28655q2, i16).getTransparent(), AbstractC33253j.m105489e(f14));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3358c4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N9);
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                int iM10236S2 = m10236S(interfaceC28593a1);
                int iM50445i2 = item.getVo2MinAllowedValue();
                int iM50443g2 = item.getVo2MaxAllowedValue();
                if ((i18 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R4 = c28655q2.m87133R();
                if (z4) {
                    objM87133R4 = new C3481w0(function1, interfaceC28593a1, 0);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C3481w0(function1, interfaceC28593a1, 0);
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function3 = (Function1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == obj) {
                    objM87133R5 = new C2783a(25);
                    c28655q2.m87172p0(objM87133R5);
                }
                i17 = i15;
                r10 = 1;
                AbstractC37861d.m121396i(textResourceM21267a2, iM10236S2, iM50445i2, iM50443g2, true, function3, (Function1) objM87133R5, true, false, null, null, c28655q2, i15 | 114843648, 0, 1536);
                AbstractC25012a.m73392y(c28655q2, true, true, false);
            } else {
                r10 = 1;
                i17 = i15;
                c28655q2.m87150e0(-378396609);
                c28655q2.m87173q(false);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(item.getSourceHeader(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getH5(), null, c28655q2, 0, i110, 196602);
            m10247b0(item.getSource(), item.m50441e(), function1, c28655q2, i17 | ((i18 << 3) & 896));
            onMenuBottomSheetEvent = function1;
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC32706a.f135968v, c28655q2, 0), AbstractC1099a.m3394p(((float) r10) * f19, c2314t), c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB2(), null, c28655q2, 48, i110, 196600);
            C28655q c28655q4 = c28655q2;
            c28655q4.m87173q(r10);
            c28655q = c28655q4;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(item, onMenuBottomSheetEvent, i13, 24);
        }
    }

    /* JADX INFO: renamed from: S */
    private static final int m10236S(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: T */
    private static final void m10237T(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: U */
    private static final boolean m10238U(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m10239V(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m10240W(InterfaceC28601c1 interfaceC28601c1) {
        m10239V(interfaceC28601c1, !m10238U(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m10241X(InterfaceC28601c1 interfaceC28601c1) {
        m10239V(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m10242Y(Function1 function1, InterfaceC28593a1 interfaceC28593a1, int i13) {
        m10237T(interfaceC28593a1, i13);
        function1.invoke(new InterfaceC1038q.g(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m10243Z(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m10245a0(C17677g c17677g, Function1 function1, int i13, Composer composer, int i14) {
        m10235R(c17677g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public static final void m10247b0(C17676f selectedSource, List<C17676f> sourceItems, Function1 onMenuBottomSheetEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(selectedSource, "selectedSource");
        AbstractC22676k.m65750j(sourceItems, "sourceItems");
        AbstractC22676k.m65750j(onMenuBottomSheetEvent, "onMenuBottomSheetEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-176033516);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(selectedSource) : c28655q.m87157i(selectedSource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(sourceItems) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onMenuBottomSheetEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i15).getBlack10(), AbstractC17918w0.f69621a);
            DefaultConstructorMarker defaultConstructorMarker = null;
            C39282o c39282o = new C39282o(null, selectedSource.getSourceText(), null, false, false, new AbstractC39279l.b(null, null, null, null, null, null, null, null, null, null, null, false, 4095, defaultConstructorMarker), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32733, defaultConstructorMarker);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C3464o(8, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC39281n.m125207c(modifierM3358c, c39282o, (InterfaceC4339a) objM87133R2, c28655q, (C39282o.f168987q << 3) | 384, 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a), 0L, c38072d.m121949b(c28655q, i15).getBrandBlack(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(2 * 4), 5), AbstractC37817c.m121344e(-1392636828, c28655q, new C0084d(interfaceC28601c1, sourceItems, onMenuBottomSheetEvent, 6)), c28655q, 3072, 2);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(selectedSource, sourceItems, onMenuBottomSheetEvent, i13, 14);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private static final boolean m10249c0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    private static final void m10251d0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m10253e0(InterfaceC28601c1 interfaceC28601c1) {
        m10251d0(interfaceC28601c1, !m10249c0(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m10255f0(InterfaceC28601c1 interfaceC28601c1, List list, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3417n(AbstractC1102d.m3424u(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (4 * f13), C2314t.f9131w), 0.0f, 0.0f, 0.0f, 200, 7), 2 * f13, 0.0f, 2);
            boolean zM10249c0 = m10249c0(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C3464o(4, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15002f0.m43105a(zM10249c0, (InterfaceC4339a) objM87133R, modifierM3396r, 0L, null, null, AbstractC37817c.m121344e(755423633, c28655q, new C3483x0(list, function1, interfaceC28601c1)), c28655q, 1572912, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m10257g0(InterfaceC28601c1 interfaceC28601c1) {
        m10251d0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m10259h0(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C17676f c17676f = (C17676f) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c17676f);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3718c(function1, c17676f, interfaceC28601c1, 19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, AbstractC37817c.m121344e(470260026, c28655q, new Function3() { // from class: bm2.y0
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC3487z0.m10263j0(c17676f, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m10261i0(Function1 function1, C17676f c17676f, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new InterfaceC1038q.f(c17676f.getSourceValue()));
        m10251d0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m10263j0(C17676f c17676f, InterfaceC22997s1 DropdownMenuItem, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenuItem, "$this$DropdownMenuItem");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c17676f.getSourceText(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m10265k0(C17676f c17676f, List list, Function1 function1, int i13, Composer composer, int i14) {
        m10247b0(c17676f, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
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
    /* JADX INFO: renamed from: y */
    public static final void m10280y(C17673c item, Function1 onMenuBottomSheetEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(onMenuBottomSheetEvent, "onMenuBottomSheetEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1868776109);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onMenuBottomSheetEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(item.getFormattedDate());
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Calendar calendar = Calendar.getInstance();
            calendar.set(m10281z(interfaceC28601c1).getYear(), m10281z(interfaceC28601c1).getMonthValue() - 1, m10281z(interfaceC28601c1).getDayOfMonth());
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, AbstractC32707b.f135973a, new C11689e(calendar, onMenuBottomSheetEvent, interfaceC28601c1, 2), calendar.get(1), calendar.get(2), calendar.get(5));
                datePickerDialog.getDatePicker().setMinDate(item.getStartDate());
                datePickerDialog.getDatePicker().setMaxDate(item.getCurrentDate());
                c28655q.m87172p0(datePickerDialog);
                objM87133R2 = datePickerDialog;
            }
            DatePickerDialog datePickerDialog2 = (DatePickerDialog) objM87133R2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC32706a.f135946D, c28655q, 0), new LayoutWeightElement(1.0f, true), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262136);
            c28655q = c28655q;
            String strM50424b = item.getDisplayDate();
            AbstractC27285v0.c cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
            boolean zM87157i = c28655q.m87157i(datePickerDialog2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C3480w(datePickerDialog2, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27283u0.m82318q(null, strM50424b, null, null, cVar, false, false, 0.0f, null, (InterfaceC4339a) objM87133R3, c28655q, (AbstractC27285v0.c.f109206f << 12) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 461);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(item, onMenuBottomSheetEvent, i13, 23);
        }
    }

    /* JADX INFO: renamed from: z */
    private static final LocalDateTime m10281z(InterfaceC28601c1 interfaceC28601c1) {
        return (LocalDateTime) interfaceC28601c1.getValue();
    }
}
