package x41;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import e93.AbstractC12889b;
import eu.C13612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p375op.AbstractC28076h;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p530up.C35145a;
import p558vp.C36257a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.AbstractC36803c;
import w41.AbstractC36816p;
import w41.AbstractC36826z;
import w41.C36823w;

/* JADX INFO: renamed from: x41.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0081@¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0081@¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0081@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a<\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001dH\u0081@¢\u0006\u0004\b \u0010!\u001aH\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000b0\u001dH\u0081@¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"", "hasRoute", "isStartActivityRevampEnabled", "", "j", "(ZZ)F", "Lcom/google/android/gms/maps/model/LatLng;", "location", "Leu/g;", "cameraPositionState", "zoom", "Ll83/a0;", "d", "(Lcom/google/android/gms/maps/model/LatLng;Leu/g;Ljava/lang/Float;Lq83/d;)Ljava/lang/Object;", "currentZoom", "zoomIn", "l", "(FZ)F", "c", "(Lcom/google/android/gms/maps/model/LatLng;Leu/g;FLq83/d;)Ljava/lang/Object;", "Lw41/z$a;", "mapState", "i", "(Lw41/z$a;Leu/g;ZLq83/d;)Ljava/lang/Object;", "applyRevampLiveMapTweaks", "", "k", "(Z)I", "paddingPx", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "onBoundsFitted", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lw41/z$a;Leu/g;ILkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "e", "(Lw41/z$a;Leu/g;IZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37960h {

    /* JADX INFO: renamed from: x41.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f162504a;

        static {
            int[] iArr = new int[EnumC37963k.values().length];
            try {
                iArr[EnumC37963k.CenterOnLocation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37963k.FitRouteBounds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37963k.NoOp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f162504a = iArr;
        }
    }

    /* JADX INFO: renamed from: x41.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraKt$animateLiveMapCenterOnUserLocation$2", m100430f = "LiveMapCamera.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f162505w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13612g f162506x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LatLng f162507y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f162508z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13612g c13612g, LatLng latLng, float f13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f162506x = c13612g;
            this.f162507y = latLng;
            this.f162508z = f13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f162506x, this.f162507y, this.f162508z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162505w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13612g c13612g = this.f162506x;
                C35145a c35145aM99891n = AbstractC32103e.m99891n(this.f162507y, this.f162508z);
                this.f162505w = 1;
                if (c13612g.m38430b(c35145aM99891n, 300, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: x41.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraKt$animateLiveMapFollow$2", m100430f = "LiveMapCamera.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C13612g f162509E;

        /* JADX INFO: renamed from: w */
        Object f162510w;

        /* JADX INFO: renamed from: x */
        int f162511x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Float f162512y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ LatLng f162513z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Float f13, LatLng latLng, C13612g c13612g, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f162512y = f13;
            this.f162513z = latLng;
            this.f162509E = c13612g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f162512y, this.f162513z, this.f162509E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C35145a c35145aM99891n;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162511x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Float f13 = this.f162512y;
                if (f13 == null) {
                    LatLng latLng = this.f162513z;
                    AbstractC35135w.m111095g(latLng, "latLng must not be null");
                    try {
                        C36257a c36257aM99894q = AbstractC32103e.m99894q();
                        Parcel parcelM57322k0 = c36257aM99894q.m57322k0();
                        AbstractC28076h.m84851c(parcelM57322k0, latLng);
                        Parcel parcelM57321j0 = c36257aM99894q.m57321j0(parcelM57322k0, 8);
                        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
                        parcelM57321j0.recycle();
                        c35145aM99891n = new C35145a(interfaceC10934aM28986X);
                    } catch (RemoteException e5) {
                        throw new RuntimeRemoteException(e5);
                    }
                } else {
                    c35145aM99891n = AbstractC32103e.m99891n(this.f162513z, f13.floatValue());
                }
                C13612g c13612g = this.f162509E;
                this.f162510w = null;
                this.f162511x = 1;
                if (c13612g.m38430b(c35145aM99891n, 300, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: x41.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraKt", m100430f = "LiveMapCamera.kt", m100431l = {110, 118, 130, 138}, m100432m = "animateLiveMapRecenter", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f162514E;

        /* JADX INFO: renamed from: F */
        int f162515F;

        /* JADX INFO: renamed from: G */
        boolean f162516G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f162517H;

        /* JADX INFO: renamed from: I */
        int f162518I;

        /* JADX INFO: renamed from: w */
        Object f162519w;

        /* JADX INFO: renamed from: x */
        Object f162520x;

        /* JADX INFO: renamed from: y */
        Object f162521y;

        /* JADX INFO: renamed from: z */
        Object f162522z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f162517H = obj;
            this.f162518I |= Integer.MIN_VALUE;
            return AbstractC37960h.m121577e(null, null, 0, false, null, this);
        }
    }

    /* JADX INFO: renamed from: x41.h$e */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraKt$animateLiveMapRouteBounds$2", m100430f = "LiveMapCamera.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f162523E;

        /* JADX INFO: renamed from: w */
        int f162524w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13612g f162525x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LatLngBounds f162526y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f162527z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C13612g c13612g, LatLngBounds latLngBounds, int i13, Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f162525x = c13612g;
            this.f162526y = latLngBounds;
            this.f162527z = i13;
            this.f162523E = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f162525x, this.f162526y, this.f162527z, this.f162523E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162524w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13612g c13612g = this.f162525x;
                C35145a c35145aM99890l = AbstractC32103e.m99890l(this.f162526y, this.f162527z);
                this.f162524w = 1;
                if (c13612g.m38430b(c35145aM99890l, 300, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f162523E.invoke(this.f162526y);
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final Object m121575c(LatLng latLng, C13612g c13612g, float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new b(c13612g, latLng, f13, null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final Object m121576d(LatLng latLng, C13612g c13612g, Float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new c(f13, latLng, c13612g, null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (m121575c(r9, r10, r14, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (m121575c(r9, r10, 16.0f, r0) == r1) goto L61;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m121577e(w41.AbstractC36826z.a r9, eu.C13612g r10, int r11, boolean r12, p715kotlin.jvm.functions.Function1 r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x41.AbstractC37960h.m121577e(w41.z$a, eu.g, int, boolean, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m121578f(Function1 function1, LatLngBounds bounds) {
        AbstractC22676k.m65750j(bounds, "bounds");
        function1.invoke(bounds);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m121579g(Function1 function1, LatLngBounds bounds) {
        AbstractC22676k.m65750j(bounds, "bounds");
        function1.invoke(bounds);
        return C23454a0.f92919a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static final Object m121580h(AbstractC36826z.a aVar, C13612g c13612g, int i13, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new e(c13612g, AbstractC37954b.m121548a(aVar), i13, function1, null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static final Object m121581i(AbstractC36826z.a aVar, C13612g c13612g, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        LatLng latLngM118031a;
        Object objM121575c;
        C36823w currentLocation = aVar.getCurrentLocation();
        return (currentLocation == null || (latLngM118031a = AbstractC36816p.m118031a(currentLocation)) == null || (objM121575c = m121575c(latLngM118031a, c13612g, m121584l(((CameraPosition) c13612g.f48189c.getValue()).f20611x, z4), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM121575c;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public static final float m121582j(boolean z4, boolean z13) {
        return 16.0f;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static final int m121583k(boolean z4) {
        return z4 ? 200 : 150;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public static final float m121584l(float f13, boolean z4) {
        return AbstractC12889b.m36283m(z4 ? f13 + 1.0f : f13 - 1.0f, 2.0f, 21.0f);
    }
}
