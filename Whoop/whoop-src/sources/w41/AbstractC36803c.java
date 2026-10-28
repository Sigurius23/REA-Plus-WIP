package w41;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.LatLngBounds;
import eu.C13612g;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p530up.C35145a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import v90.C35813e;

/* JADX INFO: renamed from: w41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\u000b\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "Leu/g;", "cameraPositionState", "Ll83/a0;", "b", "(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lq83/d;", "", "animate", "d", "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36803c {

    /* JADX INFO: renamed from: w41.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapCameraKt$StaticMapCameraEffect$1$1", m100430f = "ActivityMapCamera.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157429w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13612g f157430x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LatLngBounds f157431y;

        /* JADX INFO: renamed from: w41.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapCameraKt$StaticMapCameraEffect$1$1$1", m100430f = "ActivityMapCamera.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42575a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f157432w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13612g f157433x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ LatLngBounds f157434y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42575a(C13612g c13612g, LatLngBounds latLngBounds, InterfaceC30057d<? super C42575a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f157433x = c13612g;
                this.f157434y = latLngBounds;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42575a(this.f157433x, this.f157434y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f157432w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13612g c13612g = this.f157433x;
                    C35145a c35145aM99890l = AbstractC32103e.m99890l(this.f157434y, 150);
                    this.f157432w = 1;
                    if (c13612g.m38430b(c35145aM99890l, 10, this) == enumC31071a) {
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

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42575a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13612g c13612g, LatLngBounds latLngBounds, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157430x = c13612g;
            this.f157431y = latLngBounds;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f157430x, this.f157431y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157429w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C42575a c42575a = new C42575a(this.f157430x, this.f157431y, null);
                this.f157429w = 1;
                if (AbstractC36803c.m117946d(c42575a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: w41.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapCameraKt", m100430f = "ActivityMapCamera.kt", m100431l = {33}, m100432m = "animateActivityMapCamera", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f157435w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f157436x;

        /* JADX INFO: renamed from: y */
        int f157437y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f157436x = obj;
            this.f157437y |= Integer.MIN_VALUE;
            return AbstractC36803c.m117946d(null, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m117944b(LatLngBounds bounds, C13612g cameraPositionState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(bounds, "bounds");
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-842595794);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bounds) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(cameraPositionState) : c28655q.m87157i(cameraPositionState) ? 32 : 16;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(cameraPositionState))) {
                z4 = true;
            }
            boolean zM87157i = c28655q.m87157i(bounds) | z4;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(cameraPositionState, bounds, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bounds);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(bounds, cameraPositionState, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m117945c(LatLngBounds latLngBounds, C13612g c13612g, int i13, Composer composer, int i14) {
        m117944b(latLngBounds, c13612g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final Object m117946d(Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f157437y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f157437y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f157436x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f157437y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                bVar.f157435w = null;
                bVar.f157437y = 1;
                if (function1.invoke(bVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (IllegalStateException e5) {
            InterfaceC34116n.INSTANCE.m107850c().mo85230v("IllegalStateException on Live Activity GoogleMap", e5, new AbstractC30556a.a[0]);
        } catch (NullPointerException e13) {
            InterfaceC34116n.INSTANCE.m107850c().mo85230v("NullPointerException on Live Activity GoogleMap", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }
}
