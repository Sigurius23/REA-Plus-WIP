package nt1;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kt1.C22830f;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: nt1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lnt1/g;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Lkt1/f;", "interactor", "<init>", "(Lbc3/c0;Lkt1/f;)V", "Lec3/l;", "Lnt1/f;", "Lnt1/h;", "j", "(Lec3/l;Lkt1/f;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lnt1/f;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "g", "()Lec3/o1;", "events", "y", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27128g extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 events;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: nt1.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.presentation.LabradorSubmitEligibilityViewModel$sendViewEvent$1", m100430f = "LabradorSubmitEligibilityViewModel.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108465w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27127f f108467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27127f interfaceC27127f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108467y = interfaceC27127f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27128g.this.new a(this.f108467y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108465w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 events = C27128g.this.getEvents();
                InterfaceC27127f interfaceC27127f = this.f108467y;
                this.f108465w = 1;
                if (events.emit(interfaceC27127f, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nt1.g$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.presentation.LabradorSubmitEligibilityViewModel$viewState$1", m100430f = "LabradorSubmitEligibilityViewModel.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnt1/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108468w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108469x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f108469x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108469x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108468w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27127f.a aVar = InterfaceC27127f.a.f108461a;
                this.f108469x = null;
                this.f108468w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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
    public C27128g(InterfaceC2994c0 coroutineScope, C22830f interactor) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(interactor, "interactor");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.events = c13096w1M36592b;
        this.viewState = m81548j(new C13015a0(new b(null), c13096w1M36592b), interactor);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m81548j(InterfaceC13058l interfaceC13058l, C22830f c22830f) {
        return c22830f.m66206d(interfaceC13058l);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC13072o1 getEvents() {
        return this.events;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m81550l(InterfaceC27127f event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C27128g(InterfaceC2994c0 interfaceC2994c0, C22830f c22830f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c22830f);
    }
}
