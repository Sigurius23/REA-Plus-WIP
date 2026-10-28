package x41;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whoop.profile.view.edit.C9785i;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import eu.C13612g;
import eu.EnumC13600a;
import eu2.C13652i;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p505ts.AbstractC34132o;
import p530up.C35145a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.AbstractC36803c;
import w41.AbstractC36816p;
import w41.AbstractC36826z;
import w41.C36806f;
import w41.C36823w;

/* JADX INFO: renamed from: x41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0081\u0001\u0010\u0011\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a]\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lw41/f;", "controller", "Lw41/z$a;", "liveMapState", "", "interactive", "applyRevampLiveMapTweaks", "Leu/g;", "cameraPositionState", "", "boundsPaddingPx", "Lkotlin/Function1;", "Ll83/a0;", "onIsFollowingRouteChange", "onPreserveExternalFollowZoomChange", "Lcom/google/android/gms/maps/model/LatLngBounds;", "onLastFittedBoundsChange", "e", "(Lw41/f;Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "mapState", "isFollowingRoute", "preserveExternalFollowZoom", "isStartActivityRevampEnabled", "lastFittedBounds", "i", "(Lw41/z$a;ZZZLeu/g;ILcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37959g {

    /* JADX INFO: renamed from: x41.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraEffectsKt$LiveMapControllerEffects$2$1", m100430f = "LiveMapCameraEffects.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f162481E;

        /* JADX INFO: renamed from: w */
        int f162482w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36826z.a f162483x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13612g f162484y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f162485z;

        /* JADX INFO: renamed from: x41.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42620a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f162486w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f162487x;

            public C42620a(Function1 function1, Function1 function2) {
                this.f162486w = function1;
                this.f162487x = function2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                boolean zBooleanValue = ((Boolean) c23465k.f92937w).booleanValue();
                EnumC13600a enumC13600a = (EnumC13600a) c23465k.f92938x;
                if (zBooleanValue && enumC13600a == EnumC13600a.GESTURE) {
                    Function1 function1 = this.f162486w;
                    Boolean bool = Boolean.FALSE;
                    function1.invoke(bool);
                    this.f162487x.invoke(bool);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36826z.a aVar, C13612g c13612g, Function1 function1, Function1 function2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f162483x = aVar;
            this.f162484y = c13612g;
            this.f162485z = function1;
            this.f162481E = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23465k m121571h(C13612g c13612g) {
            Boolean bool = (Boolean) c13612g.f48187a.getValue();
            bool.getClass();
            return new C23465k(bool, (EnumC13600a) c13612g.f48188b.getValue());
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f162483x, this.f162484y, this.f162485z, this.f162481E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162482w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (this.f162483x != null) {
                final C13612g c13612g = this.f162484y;
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new InterfaceC4339a() { // from class: x41.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC37959g.a.m121571h(c13612g);
                    }
                });
                C42620a c42620a = new C42620a(this.f162485z, this.f162481E);
                this.f162482w = 1;
                if (c13084s1M87240H.collect(c42620a, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: x41.g$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"x41/g$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C36806f f162488a;

        public b(C36806f c36806f) {
            this.f162488a = c36806f;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            C36806f c36806f = this.f162488a;
            if (c36806f != null) {
                c36806f.m117966g(null);
            }
            C36806f c36806f2 = this.f162488a;
            if (c36806f2 != null) {
                c36806f2.m117968i(null);
            }
            C36806f c36806f3 = this.f162488a;
            if (c36806f3 != null) {
                c36806f3.m117969j(null);
            }
            C36806f c36806f4 = this.f162488a;
            if (c36806f4 != null) {
                c36806f4.m117967h(false);
            }
        }
    }

    /* JADX INFO: renamed from: x41.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraEffectsKt$LiveMapFollowEffect$1$1", m100430f = "LiveMapCameraEffects.kt", m100431l = {114, 128, 141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f162489E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f162490F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ AbstractC36826z.a f162491G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C13612g f162492H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ int f162493I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ boolean f162494J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ LatLngBounds f162495K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ Function1 f162496L;

        /* JADX INFO: renamed from: w */
        Object f162497w;

        /* JADX INFO: renamed from: x */
        Object f162498x;

        /* JADX INFO: renamed from: y */
        int f162499y;

        /* JADX INFO: renamed from: z */
        int f162500z;

        /* JADX INFO: renamed from: x41.g$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraEffectsKt$LiveMapFollowEffect$1$1$1$1", m100430f = "LiveMapCameraEffects.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f162501w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13612g f162502x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36823w f162503y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C13612g c13612g, C36823w c36823w, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f162502x = c13612g;
                this.f162503y = c36823w;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f162502x, this.f162503y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162501w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13612g c13612g = this.f162502x;
                    C35145a c35145aM99891n = AbstractC32103e.m99891n(AbstractC36816p.m118031a(this.f162503y), 16.0f);
                    this.f162501w = 1;
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
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, boolean z13, AbstractC36826z.a aVar, C13612g c13612g, int i13, boolean z14, LatLngBounds latLngBounds, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f162489E = z4;
            this.f162490F = z13;
            this.f162491G = aVar;
            this.f162492H = c13612g;
            this.f162493I = i13;
            this.f162494J = z14;
            this.f162495K = latLngBounds;
            this.f162496L = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f162489E, this.f162490F, this.f162491G, this.f162492H, this.f162493I, this.f162494J, this.f162495K, this.f162496L, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162500z;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 2) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f162489E) {
                return c23454a0;
            }
            if (this.f162490F) {
                AbstractC36826z.a aVar = this.f162491G;
                C13612g c13612g = this.f162492H;
                int i14 = this.f162493I;
                boolean z4 = this.f162494J;
                LatLngBounds latLngBounds = this.f162495K;
                Function1 function1 = this.f162496L;
                this.f162500z = 1;
                if (AbstractC37955c.m121550a(aVar, c13612g, i14, z4, latLngBounds, function1, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                if (AbstractC36816p.m118032b(this.f162491G).size() < 2) {
                    C36823w currentLocation = this.f162491G.getCurrentLocation();
                    if (currentLocation != null) {
                        a aVar2 = new a(this.f162492H, currentLocation, null);
                        this.f162497w = null;
                        this.f162498x = null;
                        this.f162499y = 0;
                        this.f162500z = 2;
                        if (AbstractC36803c.m117946d(aVar2, this) == enumC31071a) {
                        }
                    }
                    return c23454a0;
                }
                if (!AbstractC37954b.m121549b(AbstractC37954b.m121548a(this.f162491G), this.f162495K)) {
                    return c23454a0;
                }
                AbstractC36826z.a aVar3 = this.f162491G;
                C13612g c13612g2 = this.f162492H;
                int i15 = this.f162493I;
                Function1 function2 = this.f162496L;
                this.f162497w = null;
                this.f162498x = null;
                this.f162500z = 3;
                if (AbstractC37960h.m121580h(aVar3, c13612g2, i15, function2, this) != enumC31071a) {
                    return c23454a0;
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m121564e(final C36806f c36806f, AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, final Function1 onIsFollowingRouteChange, final Function1 onPreserveExternalFollowZoomChange, final Function1 onLastFittedBoundsChange, Composer composer, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        int i16;
        final AbstractC36826z.a aVar2 = aVar;
        final C13612g cameraPositionState = c13612g;
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        AbstractC22676k.m65750j(onIsFollowingRouteChange, "onIsFollowingRouteChange");
        AbstractC22676k.m65750j(onPreserveExternalFollowZoomChange, "onPreserveExternalFollowZoomChange");
        AbstractC22676k.m65750j(onLastFittedBoundsChange, "onLastFittedBoundsChange");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1320216558);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(c36806f) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(aVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z14 = z4;
            i15 |= c28655q.m87155h(z14) ? 256 : 128;
        } else {
            z14 = z4;
        }
        if ((i14 & 3072) == 0) {
            z15 = z13;
            i15 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z15 = z13;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (i14 & 32768) == 0 ? c28655q.m87153g(cameraPositionState) : c28655q.m87157i(cameraPositionState) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 = i13;
            i15 |= c28655q.m87149e(i16) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            i16 = i13;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= c28655q.m87157i(onIsFollowingRouteChange) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= c28655q.m87157i(onPreserveExternalFollowZoomChange) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= c28655q.m87157i(onLastFittedBoundsChange) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 38347923) != 38347922)) {
            Object[] objArr = {c36806f, aVar2, Boolean.valueOf(z14), Integer.valueOf(i16), Boolean.valueOf(z15)};
            int i17 = i15 & 57344;
            int i18 = i15;
            int i19 = i18 & 3670016;
            int i24 = i18 & 29360128;
            boolean zM87157i = ((458752 & i15) == 131072) | ((i15 & 14) == 4) | c28655q.m87157i(aVar2) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | (i17 == 16384 || ((i15 & 32768) != 0 && c28655q.m87157i(cameraPositionState))) | (i19 == 1048576) | (i24 == 8388608) | ((i18 & 234881024) == 67108864);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final boolean z16 = z15;
                final boolean z17 = z14;
                final int i25 = i16;
                Function1 function1 = new Function1() { // from class: x41.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC37959g.m121565f(c36806f, aVar2, z17, z16, cameraPositionState, i25, onIsFollowingRouteChange, onPreserveExternalFollowZoomChange, onLastFittedBoundsChange, (C28624i0) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC28683x.m87252f(objArr, (Function1) objM87133R, c28655q);
            boolean zM87157i2 = c28655q.m87157i(aVar2) | (i17 == 16384 || ((i18 & 32768) != 0 && c28655q.m87157i(cameraPositionState))) | (i19 == 1048576) | (i24 == 8388608);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                a aVar3 = new a(aVar2, c13612g, onIsFollowingRouteChange, onPreserveExternalFollowZoomChange, null);
                cameraPositionState = c13612g;
                aVar2 = aVar2;
                c28655q.m87172p0(aVar3);
                objM87133R2 = aVar3;
            }
            C28539n0 c28539n0 = C13612g.f48186h;
            AbstractC28683x.m87254h(cameraPositionState, aVar2, (InterfaceC4351m) objM87133R2, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(c36806f, aVar2, z4, z13, cameraPositionState, i13, onIsFollowingRouteChange, onPreserveExternalFollowZoomChange, onLastFittedBoundsChange, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC28620h0 m121565f(C36806f c36806f, AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, Function1 function1, Function1 function2, Function1 function3, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        if (c36806f != null) {
            c36806f.m117966g(AbstractC37955c.m121553d(aVar, z4, z13, c13612g, i13, function1, function2, new C37957e(function3, 0)));
            c36806f.m117968i(AbstractC37955c.m121554e(aVar, z4, z13, true, c13612g, function1, function2));
            c36806f.m117969j(AbstractC37955c.m121554e(aVar, z4, z13, false, c13612g, function1, function2));
            c36806f.m117967h(aVar != null && z4);
        }
        return new b(c36806f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m121566g(Function1 function1, LatLngBounds latLngBounds) {
        if (latLngBounds != null) {
            function1.invoke(latLngBounds);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m121567h(C36806f c36806f, AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, Function1 function1, Function1 function2, Function1 function3, int i14, Composer composer, int i15) {
        m121564e(c36806f, aVar, z4, z13, c13612g, i13, function1, function2, function3, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m121568i(AbstractC36826z.a mapState, boolean z4, boolean z13, boolean z14, C13612g cameraPositionState, int i13, LatLngBounds latLngBounds, Function1 onLastFittedBoundsChange, Composer composer, int i14) {
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        AbstractC22676k.m65750j(mapState, "mapState");
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        AbstractC22676k.m65750j(onLastFittedBoundsChange, "onLastFittedBoundsChange");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1270661646);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87157i(mapState) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z4;
            i15 |= c28655q.m87155h(z15) ? 32 : 16;
        } else {
            z15 = z4;
        }
        if ((i14 & 384) == 0) {
            z16 = z13;
            i15 |= c28655q.m87155h(z16) ? 256 : 128;
        } else {
            z16 = z13;
        }
        if ((i14 & 3072) == 0) {
            z17 = z14;
            i15 |= c28655q.m87155h(z17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z17 = z14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (i14 & 32768) == 0 ? c28655q.m87153g(cameraPositionState) : c28655q.m87157i(cameraPositionState) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 = i13;
            i15 |= c28655q.m87149e(i16) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            i16 = i13;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= c28655q.m87157i(latLngBounds) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= c28655q.m87157i(onLastFittedBoundsChange) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 4793491) != 4793490)) {
            Object[] objArr = {mapState.m118056e(), mapState.getCurrentLocation(), Boolean.valueOf(z15), Boolean.valueOf(z16), Boolean.valueOf(z17)};
            boolean zM87157i = ((i15 & 112) == 32) | ((i15 & 7168) == 2048) | c28655q.m87157i(mapState) | ((57344 & i15) == 16384 || ((i15 & 32768) != 0 && c28655q.m87157i(cameraPositionState))) | ((458752 & i15) == 131072) | ((i15 & 896) == 256) | c28655q.m87157i(latLngBounds) | ((i15 & 29360128) == 8388608);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                c cVar = new c(z15, z14, mapState, cameraPositionState, i16, z16, latLngBounds, onLastFittedBoundsChange, null);
                c28655q.m87172p0(cVar);
                objM87133R = cVar;
            }
            AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13652i(mapState, z4, z13, z14, cameraPositionState, i13, latLngBounds, onLastFittedBoundsChange, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m121569j(AbstractC36826z.a aVar, boolean z4, boolean z13, boolean z14, C13612g c13612g, int i13, LatLngBounds latLngBounds, Function1 function1, int i14, Composer composer, int i15) {
        m121568i(aVar, z4, z13, z14, c13612g, i13, latLngBounds, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
