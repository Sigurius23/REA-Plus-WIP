package tx0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.InterfaceC2994c0;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import gv1.AbstractC16241o;
import gv1.AbstractC16242p;
import gv1.C16229c;
import gv1.C16230d;
import gv1.C16231e;
import gv1.InterfaceC16239m;
import i51.AbstractC18111h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: tx0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Ltx0/f;", "Landroidx/lifecycle/w1;", "Lgv1/c;", "globalLottieTesterState", "Lgv1/d;", "localLottieTesterOverrideController", "Lbc3/c0;", "coroutineScope", "<init>", "(Lgv1/c;Lgv1/d;Lbc3/c0;)V", "Ltx0/e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "j", "(Ltx0/e;)V", "Lgv1/m;", "g", "(Lgv1/m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lgv1/c;", "x", "Lgv1/d;", "Lec3/f2;", "Ltx0/g;", "y", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34243f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C16229c globalLottieTesterState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C16230d localLottieTesterOverrideController;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: tx0.f$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.debug.lottietester.LottieTesterViewModel$viewState$1", m100430f = "LottieTesterViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "isOverrideEnabled", "Lgv1/e;", "localLottieState", "Ltx0/g;", "<anonymous>", "(ZLgv1/e;)Ltx0/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143630w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f143631x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143632y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m108281f(boolean z4, C16231e c16231e, InterfaceC30057d<? super C34244g> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f143631x = z4;
            aVar.f143632y = c16231e;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m108281f(((Boolean) obj).booleanValue(), (C16231e) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f143631x;
            C16231e c16231e = (C16231e) this.f143632y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143630w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC16241o lottieSource = c16231e.getLottieSource();
            AbstractC18111h cVar = null;
            InterfaceC35689r0 interfaceC35689r0M46026b = lottieSource != null ? AbstractC16242p.m46026b(lottieSource) : null;
            AbstractC16241o lottieSource2 = c16231e.getLottieSource();
            AbstractC22403o abstractC22403oM46025a = lottieSource2 != null ? AbstractC16242p.m46025a(lottieSource2) : null;
            if (interfaceC35689r0M46026b != null) {
                cVar = new AbstractC18111h.d(interfaceC35689r0M46026b);
            } else if (abstractC22403oM46025a != null) {
                cVar = new AbstractC18111h.c(abstractC22403oM46025a);
            }
            return new C34244g(z4, c16231e.getIsSelectLottieSheetVisible(), c16231e.getLottieSource(), cVar);
        }
    }

    public C34243f(C16229c globalLottieTesterState, C16230d localLottieTesterOverrideController, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(globalLottieTesterState, "globalLottieTesterState");
        AbstractC22676k.m65750j(localLottieTesterOverrideController, "localLottieTesterOverrideController");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.globalLottieTesterState = globalLottieTesterState;
        this.localLottieTesterOverrideController = localLottieTesterOverrideController;
        this.viewState = AbstractC13091v.m36587M(new C13060l1(globalLottieTesterState.getIsOverrideEnabled(), localLottieTesterOverrideController.getState(), new a(null), 1), coroutineScope, C13105z1.f45288a, new C34244g(false, false, null, null, 15, null));
    }

    /* JADX INFO: renamed from: g */
    public final void m108279g(InterfaceC16239m event) {
        AbstractC22676k.m65750j(event, "event");
        this.localLottieTesterOverrideController.m45940b(event);
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: j */
    public final void m108280j(InterfaceC34242e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC34242e.a) {
            this.globalLottieTesterState.m45938b(((InterfaceC34242e.a) event).getIsEnabled());
        } else if (event instanceof InterfaceC34242e.b) {
            this.localLottieTesterOverrideController.m45940b(new InterfaceC16239m.f(true));
        } else {
            if (!(event instanceof InterfaceC34242e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.localLottieTesterOverrideController.m45940b(new InterfaceC16239m.f(false));
        }
    }

    public /* synthetic */ C34243f(C16229c c16229c, C16230d c16230d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16229c, c16230d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
