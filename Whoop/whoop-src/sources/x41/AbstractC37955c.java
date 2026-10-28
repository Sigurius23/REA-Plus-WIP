package x41;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import eu.C13612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.AbstractC36816p;
import w41.AbstractC36826z;
import w41.C36823w;

/* JADX INFO: renamed from: x41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014H\u0081@¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001av\u0010$\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00150\u0014H\u0081@¢\u0006\u0004\b$\u0010%\u001a\u008f\u0001\u0010(\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0004\b(\u0010)\u001aX\u0010+\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014H\u0081@¢\u0006\u0004\b+\u0010,\u001ay\u0010-\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lw41/z$a;", "mapState", "Lx41/k;", "j", "(Lw41/z$a;)Lx41/k;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "lastFittedBounds", "Lx41/j;", "i", "(Lw41/z$a;Lcom/google/android/gms/maps/model/LatLngBounds;)Lx41/j;", "", "hasRoute", "preserveExternalZoom", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ZZ)Ljava/lang/Float;", "Leu/g;", "cameraPositionState", "", "paddingPx", "Lkotlin/Function1;", "Ll83/a0;", "onBoundsFitted", "a", "(Lw41/z$a;Leu/g;IZLcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "applyRevampLiveMapTweaks", "onIsFollowingRouteChange", "onPreserveExternalFollowZoomChange", "c", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "(ZLkotlin/jvm/functions/Function1;)V", "liveMapState", "interactive", "boundsPaddingPx", "onLastFittedBoundsChange", "g", "(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "Lq83/d;", "", "d", "(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "zoomIn", "f", "(Lw41/z$a;ZLeu/g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "e", "(Lw41/z$a;ZZZLeu/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37955c {

    /* JADX INFO: renamed from: x41.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f162442a;

        static {
            int[] iArr = new int[EnumC37962j.values().length];
            try {
                iArr[EnumC37962j.FollowLocation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37962j.FitRouteBounds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37962j.NoOp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f162442a = iArr;
        }
    }

    /* JADX INFO: renamed from: x41.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraControllerKt$createLiveMapRecenterAction$1", m100430f = "LiveMapCameraController.kt", m100431l = {161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C13612g f162443E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f162444F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f162445G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Function1 f162446H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Function1 f162447I;

        /* JADX INFO: renamed from: w */
        int f162448w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36826z.a f162449x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f162450y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f162451z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, Function1 function1, Function1 function2, Function1 function3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f162449x = aVar;
            this.f162450y = z4;
            this.f162451z = z13;
            this.f162443E = c13612g;
            this.f162444F = i13;
            this.f162445G = function1;
            this.f162446H = function2;
            this.f162447I = function3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f162449x, this.f162450y, this.f162451z, this.f162443E, this.f162444F, this.f162445G, this.f162446H, this.f162447I, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162448w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36826z.a aVar = this.f162449x;
                boolean z4 = this.f162450y;
                boolean z13 = this.f162451z;
                C13612g c13612g = this.f162443E;
                int i14 = this.f162444F;
                Function1 function1 = this.f162445G;
                Function1 function2 = this.f162446H;
                Function1 function3 = this.f162447I;
                this.f162448w = 1;
                if (AbstractC37955c.m121556g(aVar, z4, z13, c13612g, i14, function1, function2, function3, this) == enumC31071a) {
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
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: x41.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraControllerKt$createLiveMapZoomAction$1", m100430f = "LiveMapCameraController.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f162452E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f162453F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f162454G;

        /* JADX INFO: renamed from: w */
        int f162455w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36826z.a f162456x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f162457y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13612g f162458z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC36826z.a aVar, boolean z4, C13612g c13612g, boolean z13, Function1 function1, Function1 function2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f162456x = aVar;
            this.f162457y = z4;
            this.f162458z = c13612g;
            this.f162452E = z13;
            this.f162453F = function1;
            this.f162454G = function2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f162456x, this.f162457y, this.f162458z, this.f162452E, this.f162453F, this.f162454G, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162455w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36826z.a aVar = this.f162456x;
                boolean z4 = this.f162457y;
                C13612g c13612g = this.f162458z;
                boolean z13 = this.f162452E;
                Function1 function1 = this.f162453F;
                Function1 function2 = this.f162454G;
                this.f162455w = 1;
                if (AbstractC37955c.m121555f(aVar, z4, c13612g, z13, function1, function2, this) == enumC31071a) {
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
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: x41.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraControllerKt", m100430f = "LiveMapCameraController.kt", m100431l = {133}, m100432m = "recenterLiveMap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f162459E;

        /* JADX INFO: renamed from: F */
        boolean f162460F;

        /* JADX INFO: renamed from: G */
        boolean f162461G;

        /* JADX INFO: renamed from: H */
        int f162462H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f162463I;

        /* JADX INFO: renamed from: J */
        int f162464J;

        /* JADX INFO: renamed from: w */
        Object f162465w;

        /* JADX INFO: renamed from: x */
        Object f162466x;

        /* JADX INFO: renamed from: y */
        Object f162467y;

        /* JADX INFO: renamed from: z */
        Object f162468z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f162463I = obj;
            this.f162464J |= Integer.MIN_VALUE;
            return AbstractC37955c.m121556g(null, false, false, null, 0, null, null, null, this);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final Object m121550a(AbstractC36826z.a aVar, C13612g c13612g, int i13, boolean z4, LatLngBounds latLngBounds, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        LatLng latLngM118031a;
        int i14 = a.f162442a[m121558i(aVar, latLngBounds).ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 1) {
            if (i14 == 2) {
                Object objM121580h = AbstractC37960h.m121580h(aVar, c13612g, i13, function1, interfaceC30057d);
                return objM121580h == EnumC31071a.f128113w ? objM121580h : c23454a0;
            }
            if (i14 == 3) {
                return c23454a0;
            }
            throw new NoWhenBranchMatchedException();
        }
        C36823w currentLocation = aVar.getCurrentLocation();
        if (currentLocation != null && (latLngM118031a = AbstractC36816p.m118031a(currentLocation)) != null) {
            Object objM121576d = AbstractC37960h.m121576d(latLngM118031a, c13612g, m121557h(AbstractC36816p.m118032b(aVar).size() >= 2, z4), interfaceC30057d);
            if (objM121576d == EnumC31071a.f128113w) {
                return objM121576d;
            }
        }
        return c23454a0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final void m121551b(boolean z4, Function1 onIsFollowingRouteChange) {
        AbstractC22676k.m65750j(onIsFollowingRouteChange, "onIsFollowingRouteChange");
        if (z4) {
            onIsFollowingRouteChange.invoke(Boolean.TRUE);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final void m121552c(boolean z4, Function1 onIsFollowingRouteChange, Function1 onPreserveExternalFollowZoomChange) {
        AbstractC22676k.m65750j(onIsFollowingRouteChange, "onIsFollowingRouteChange");
        AbstractC22676k.m65750j(onPreserveExternalFollowZoomChange, "onPreserveExternalFollowZoomChange");
        if (z4) {
            onPreserveExternalFollowZoomChange.invoke(Boolean.FALSE);
        } else {
            onIsFollowingRouteChange.invoke(Boolean.TRUE);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final Function1 m121553d(AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g cameraPositionState, int i13, Function1 onIsFollowingRouteChange, Function1 onPreserveExternalFollowZoomChange, Function1 onLastFittedBoundsChange) {
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        AbstractC22676k.m65750j(onIsFollowingRouteChange, "onIsFollowingRouteChange");
        AbstractC22676k.m65750j(onPreserveExternalFollowZoomChange, "onPreserveExternalFollowZoomChange");
        AbstractC22676k.m65750j(onLastFittedBoundsChange, "onLastFittedBoundsChange");
        if (aVar != null && z4) {
            return new b(aVar, z4, z13, cameraPositionState, i13, onIsFollowingRouteChange, onPreserveExternalFollowZoomChange, onLastFittedBoundsChange, null);
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final Function1 m121554e(AbstractC36826z.a aVar, boolean z4, boolean z13, boolean z14, C13612g cameraPositionState, Function1 onIsFollowingRouteChange, Function1 onPreserveExternalFollowZoomChange) {
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        AbstractC22676k.m65750j(onIsFollowingRouteChange, "onIsFollowingRouteChange");
        AbstractC22676k.m65750j(onPreserveExternalFollowZoomChange, "onPreserveExternalFollowZoomChange");
        if (z13 && aVar != null && z4) {
            return new c(aVar, z4, cameraPositionState, z14, onIsFollowingRouteChange, onPreserveExternalFollowZoomChange, null);
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static final Object m121555f(AbstractC36826z.a aVar, boolean z4, C13612g c13612g, boolean z13, Function1 function1, Function1 function2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            return c23454a0;
        }
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        function2.invoke(bool);
        Object objM121581i = AbstractC37960h.m121581i(aVar, c13612g, z13, interfaceC30057d);
        return objM121581i == EnumC31071a.f128113w ? objM121581i : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static final Object m121556g(AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, Function1 function1, Function1 function2, Function1 function3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        boolean z14;
        Function1 function4;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f162464J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f162464J = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f162463I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar2.f162464J;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!z4) {
                return c23454a0;
            }
            m121552c(z13, function1, function2);
            dVar2.f162465w = null;
            dVar2.f162466x = null;
            dVar2.f162467y = function1;
            dVar2.f162468z = null;
            dVar2.f162459E = null;
            dVar2.f162460F = z4;
            dVar2.f162461G = z13;
            dVar2.f162462H = i13;
            dVar2.f162464J = 1;
            if (AbstractC37960h.m121577e(aVar, c13612g, i13, z13, function3, dVar2) == enumC31071a) {
                return enumC31071a;
            }
            z14 = z13;
            function4 = function1;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14 = dVar2.f162461G;
            function4 = (Function1) dVar2.f162467y;
            AbstractC34132o.m107864I(obj);
        }
        m121551b(z14, function4);
        return c23454a0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static final Float m121557h(boolean z4, boolean z13) {
        if (z13) {
            return null;
        }
        return Float.valueOf(AbstractC37960h.m121582j(z4, true));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static final EnumC37962j m121558i(AbstractC36826z.a mapState, LatLngBounds latLngBounds) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (mapState.getCurrentLocation() != null) {
            return EnumC37962j.FollowLocation;
        }
        if (AbstractC36816p.m118032b(mapState).size() >= 2 && AbstractC37954b.m121549b(AbstractC37954b.m121548a(mapState), latLngBounds)) {
            return EnumC37962j.FitRouteBounds;
        }
        return EnumC37962j.NoOp;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public static final EnumC37963k m121559j(AbstractC36826z.a mapState) {
        AbstractC22676k.m65750j(mapState, "mapState");
        List<C36823w> listM118032b = AbstractC36816p.m118032b(mapState);
        if (mapState.getCurrentLocation() != null) {
            return EnumC37963k.CenterOnLocation;
        }
        return listM118032b.size() >= 2 ? EnumC37963k.FitRouteBounds : EnumC37963k.NoOp;
    }
}
