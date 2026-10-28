package w41;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4355q;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import e10.C12554k0;
import eu.C13607d0;
import eu.C13612g;
import eu.C13639z;
import eu.InterfaceC13606d;
import gb1.AbstractC15673b0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11412w1;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22973k1;
import p389p0.C28539n0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p530up.C35145a;
import p530up.C35146b;
import p591wp.C37486g;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vw0.C36541a;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import x41.AbstractC37953a;
import x41.AbstractC37955c;
import x41.AbstractC37959g;
import x41.AbstractC37960h;
import x41.AbstractC37961i;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: w41.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\u000b\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"C\u0010\u0017\u001a.\u0012*\u0012(\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00140\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001d²\u0006\u000e\u0010\u0018\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lw41/z;", "mapState", "Landroidx/compose/ui/Modifier;", "modifier", "", "interactive", "Lw41/f;", "controller", "showGradientOverlay", "Ll83/a0;", "l", "(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V", "n", "Lp1/t1;", "", "a", "Lp1/t1;", "M", "()Lp1/t1;", "LocalActivityMapStyle", "Lkotlin/Function5;", "b", "getLocalActivityMapRenderer", "LocalActivityMapRenderer", "hasInitializedExternalCamera", "isFollowingRoute", "preserveExternalFollowZoom", "Lcom/google/android/gms/maps/model/LatLngBounds;", "lastFittedBounds", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36811k {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f157470a = new C28596b0(new C36541a(26));

    /* JADX INFO: renamed from: b */
    private static final AbstractC28669t1 f157471b = new C28596b0(new C36541a(27));

    /* JADX INFO: renamed from: w41.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f157472w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(0);
            this.f157472w = function1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13612g invoke() {
            C13612g c13612g = new C13612g();
            this.f157472w.invoke(c13612g);
            return c13612g;
        }
    }

    /* JADX INFO: renamed from: w41.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapKt$DefaultActivityMap$1$1", m100430f = "ActivityMap.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ float f157473E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f157474F;

        /* JADX INFO: renamed from: w */
        int f157475w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36806f f157476x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13612g f157477y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ LatLng f157478z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36806f c36806f, C13612g c13612g, LatLng latLng, float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157476x = c36806f;
            this.f157477y = c13612g;
            this.f157478z = latLng;
            this.f157473E = f13;
            this.f157474F = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f157476x, this.f157477y, this.f157478z, this.f157473E, this.f157474F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157475w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f157476x != null && !AbstractC36811k.m118012z(this.f157474F)) {
                C13612g c13612g = this.f157477y;
                C35145a c35145aM99891n = AbstractC32103e.m99891n(this.f157478z, this.f157473E);
                c13612g.getClass();
                synchronized (c13612g.f48190d) {
                    try {
                        C35146b c35146b = c13612g.f48191e;
                        c13612g.f48193g = null;
                        if (c35146b == null) {
                            C12554k0 c12554k0 = new C12554k0(c35145aM99891n, 5);
                            InterfaceC13606d interfaceC13606d = c13612g.f48192f;
                            if (interfaceC13606d != null) {
                                interfaceC13606d.mo35231d();
                            }
                            c13612g.f48192f = c12554k0;
                        } else {
                            c35146b.m111148c(c35145aM99891n);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                AbstractC36811k.m117974A(this.f157474F, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w41.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapKt$DefaultActivityMap$5$2$1$1", m100430f = "ActivityMap.kt", m100431l = {165}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C13612g f157479E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f157480F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f157481G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f157482H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f157483I;

        /* JADX INFO: renamed from: w */
        int f157484w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36826z.a f157485x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f157486y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f157487z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157485x = aVar;
            this.f157486y = z4;
            this.f157487z = z13;
            this.f157479E = c13612g;
            this.f157480F = i13;
            this.f157481G = interfaceC28601c1;
            this.f157482H = interfaceC28601c2;
            this.f157483I = interfaceC28601c3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m118017j(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
            AbstractC36811k.m117976C(interfaceC28601c1, z4);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m118018k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
            AbstractC36811k.m118002p(interfaceC28601c1, z4);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final C23454a0 m118019l(InterfaceC28601c1 interfaceC28601c1, LatLngBounds latLngBounds) {
            if (latLngBounds != null) {
                AbstractC36811k.m118004r(interfaceC28601c1, latLngBounds);
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f157485x, this.f157486y, this.f157487z, this.f157479E, this.f157480F, this.f157481G, this.f157482H, this.f157483I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157484w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36826z.a aVar = this.f157485x;
                boolean z4 = this.f157486y;
                boolean z13 = this.f157487z;
                C13612g c13612g = this.f157479E;
                int i14 = this.f157480F;
                C36812l c36812l = new C36812l(this.f157481G, 0);
                C36812l c36812l2 = new C36812l(this.f157482H, 1);
                C36812l c36812l3 = new C36812l(this.f157483I, 2);
                this.f157484w = 1;
                if (AbstractC37955c.m121556g(aVar, z4, z13, c13612g, i14, c36812l, c36812l2, c36812l3, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m117974A(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m117975B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m117976C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m117977D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC4355q m117978E() {
        return C36822v.f157505a.m118043b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m117979F() {
        return "[\n  {\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#212121\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#212121\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.country\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#9e9e9e\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.land_parcel\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.locality\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#bdbdbd\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#181818\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#616161\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#1b1b1b\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#2c2c2c\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#8a8a8a\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.arterial\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#373737\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#3c3c3c\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway.controlled_access\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#4e4e4e\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.local\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#616161\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#000000\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#3d3d3d\"\n      }\n    ]\n  }\n]";
    }

    /* JADX INFO: renamed from: M */
    public static final AbstractC28669t1 m117986M() {
        return f157470a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m117998l(AbstractC36826z mapState, Modifier modifier, boolean z4, C36806f c36806f, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        C36806f c36806f2;
        int i19;
        int i24;
        boolean z15;
        int i25;
        boolean z16;
        Modifier modifierM3409f;
        boolean z17;
        C36806f c36806f3;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        AbstractC22676k.m65750j(mapState, "mapState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1344914825);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(mapState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        c36806f2 = c36806f;
                        if (c28655q.m87153g(c36806f2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            z15 = z13;
                            if (c28655q.m87155h(z15)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z16)) {
                            if (i26 != 0) {
                                modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                            } else {
                                modifierM3409f = modifier2;
                            }
                            if (i16 != 0) {
                                z19 = true;
                            } else {
                                z19 = z14;
                            }
                            if (i18 != 0) {
                                c36806f3 = null;
                            } else {
                                c36806f3 = c36806f2;
                            }
                            if (i24 != 0) {
                                z15 = true;
                            }
                            ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                            z17 = z19;
                        } else {
                            c28655q.m87138X();
                            modifierM3409f = modifier2;
                            z17 = z14;
                            c36806f3 = c36806f2;
                        }
                        z18 = z15;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                        }
                    }
                    i15 |= 24576;
                    z15 = z13;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                        } else {
                            modifierM3409f = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            c36806f3 = null;
                        } else {
                            c36806f3 = c36806f2;
                        }
                        if (i24 != 0) {
                            z15 = true;
                        }
                        ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                        z17 = z19;
                    } else {
                        c28655q.m87138X();
                        modifierM3409f = modifier2;
                        z17 = z14;
                        c36806f3 = c36806f2;
                    }
                    z18 = z15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                    }
                }
                i15 |= 3072;
                c36806f2 = c36806f;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                        } else {
                            modifierM3409f = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            c36806f3 = null;
                        } else {
                            c36806f3 = c36806f2;
                        }
                        if (i24 != 0) {
                            z15 = true;
                        }
                        ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                        z17 = z19;
                    } else {
                        c28655q.m87138X();
                        modifierM3409f = modifier2;
                        z17 = z14;
                        c36806f3 = c36806f2;
                    }
                    z18 = z15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                z15 = z13;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    c36806f2 = c36806f;
                    if (c28655q.m87153g(c36806f2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                        } else {
                            modifierM3409f = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            c36806f3 = null;
                        } else {
                            c36806f3 = c36806f2;
                        }
                        if (i24 != 0) {
                            z15 = true;
                        }
                        ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                        z17 = z19;
                    } else {
                        c28655q.m87138X();
                        modifierM3409f = modifier2;
                        z17 = z14;
                        c36806f3 = c36806f2;
                    }
                    z18 = z15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                z15 = z13;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 3072;
            c36806f2 = c36806f;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 24576;
            z15 = z13;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                } else {
                    modifierM3409f = modifier2;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    c36806f3 = null;
                } else {
                    c36806f3 = c36806f2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                z17 = z19;
            } else {
                c28655q.m87138X();
                modifierM3409f = modifier2;
                z17 = z14;
                c36806f3 = c36806f2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    c36806f2 = c36806f;
                    if (c28655q.m87153g(c36806f2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        if (i26 != 0) {
                            modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                        } else {
                            modifierM3409f = modifier2;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            c36806f3 = null;
                        } else {
                            c36806f3 = c36806f2;
                        }
                        if (i24 != 0) {
                            z15 = true;
                        }
                        ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                        z17 = z19;
                    } else {
                        c28655q.m87138X();
                        modifierM3409f = modifier2;
                        z17 = z14;
                        c36806f3 = c36806f2;
                    }
                    z18 = z15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                z15 = z13;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 3072;
            c36806f2 = c36806f;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 24576;
            z15 = z13;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                } else {
                    modifierM3409f = modifier2;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    c36806f3 = null;
                } else {
                    c36806f3 = c36806f2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                z17 = z19;
            } else {
                c28655q.m87138X();
                modifierM3409f = modifier2;
                z17 = z14;
                c36806f3 = c36806f2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                c36806f2 = c36806f;
                if (c28655q.m87153g(c36806f2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i26 != 0) {
                        modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                    } else {
                        modifierM3409f = modifier2;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        c36806f3 = null;
                    } else {
                        c36806f3 = c36806f2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    modifierM3409f = modifier2;
                    z17 = z14;
                    c36806f3 = c36806f2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
                }
            }
            i15 |= 24576;
            z15 = z13;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                } else {
                    modifierM3409f = modifier2;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    c36806f3 = null;
                } else {
                    c36806f3 = c36806f2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                z17 = z19;
            } else {
                c28655q.m87138X();
                modifierM3409f = modifier2;
                z17 = z14;
                c36806f3 = c36806f2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
            }
        }
        i15 |= 3072;
        c36806f2 = c36806f;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i26 != 0) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
                } else {
                    modifierM3409f = modifier2;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    c36806f3 = null;
                } else {
                    c36806f3 = c36806f2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
                z17 = z19;
            } else {
                c28655q.m87138X();
                modifierM3409f = modifier2;
                z17 = z14;
                c36806f3 = c36806f2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
            }
        }
        i15 |= 24576;
        z15 = z13;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i26 != 0) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(95 * 4, C2314t.f9131w));
            } else {
                modifierM3409f = modifier2;
            }
            if (i16 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            if (i18 != 0) {
                c36806f3 = null;
            } else {
                c36806f3 = c36806f2;
            }
            if (i24 != 0) {
                z15 = true;
            }
            ((InterfaceC4355q) c28655q.m87161k(f157471b)).invoke(mapState, modifierM3409f, Boolean.valueOf(z19), c36806f3, Boolean.valueOf(z15), c28655q, Integer.valueOf(i15 & 65534));
            z17 = z19;
        } else {
            c28655q.m87138X();
            modifierM3409f = modifier2;
            z17 = z14;
            c36806f3 = c36806f2;
        }
        z18 = z15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36808h(mapState, modifierM3409f, z17, c36806f3, z18, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117999m(AbstractC36826z abstractC36826z, Modifier modifier, boolean z4, C36806f c36806f, boolean z13, int i13, int i14, Composer composer, int i15) {
        m117998l(abstractC36826z, modifier, z4, c36806f, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01db  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:123:0x020b  */
    /* JADX WARN: Code duplicated, block: B:126:0x021c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0228  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232  */
    /* JADX WARN: Code duplicated, block: B:131:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0281  */
    /* JADX WARN: Code duplicated, block: B:135:0x0286  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:147:0x02de  */
    /* JADX WARN: Code duplicated, block: B:148:0x02fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x031c  */
    /* JADX WARN: Code duplicated, block: B:152:0x032c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0361  */
    /* JADX WARN: Code duplicated, block: B:160:0x0375  */
    /* JADX WARN: Code duplicated, block: B:161:0x0378  */
    /* JADX WARN: Code duplicated, block: B:164:0x0395  */
    /* JADX WARN: Code duplicated, block: B:165:0x0398  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x040d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0416  */
    /* JADX WARN: Code duplicated, block: B:177:0x041c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0426  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:84:0x013f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0141  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0189  */
    /* JADX INFO: renamed from: n */
    public static final void m118000n(final AbstractC36826z abstractC36826z, Modifier modifier, final boolean z4, C36806f c36806f, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        C36806f c36806f2;
        boolean z14;
        C36806f c36806f3;
        C28677v1 c28677v1M87180u;
        C36806f c36806f4;
        LatLngBounds latLngBoundsM117940a;
        boolean z15;
        LatLng latLngM15634f;
        float f13;
        boolean zIsFeatureEnabled;
        boolean z16;
        AbstractC36824x abstractC36824xM121585a;
        InterfaceC22973k1 interfaceC22973k1M3379a;
        C13612g c13612gM117960a;
        LatLngBounds latLngBounds;
        boolean z17;
        LatLng latLng;
        boolean z18;
        C13612g c13612g;
        int i16;
        boolean z19;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z24;
        LatLng latLng2;
        boolean zM87153g;
        Object objM87133R2;
        C13612g c13612g2;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        final InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        AbstractC36826z.a aVar;
        boolean z25;
        int iM121583k;
        Object objM87133R6;
        final InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        int i17;
        InterfaceC28601c1 interfaceC28601c5;
        LatLngBounds latLngBounds2;
        AbstractC36826z.a aVar2;
        int i18;
        final boolean z26;
        final C13612g c13612g3;
        C2314t c2314t;
        Modifier modifierM44032d0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z27;
        Object objM87133R10;
        InterfaceC28601c1 interfaceC28601c6;
        C2314t c2314t2;
        AbstractC36826z.a aVar3;
        boolean z28;
        final int i19;
        C28655q c28655q;
        Modifier modifierM3407d;
        LatLngBounds latLngBounds3;
        boolean z29;
        boolean zM87157i;
        Object objM87133R11;
        C28655q c28655q2;
        InterfaceC22973k1 interfaceC22973k1M118023d;
        C36823w currentLocation;
        int i24;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1884602468);
        int i25 = 4;
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(abstractC36826z) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87155h(z4) ? 256 : 128;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                c36806f2 = c36806f;
                i15 |= c28655q3.m87153g(c36806f2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z14)) {
                if (i26 != 0) {
                    c36806f4 = null;
                } else {
                    c36806f4 = c36806f2;
                }
                latLngBoundsM117940a = AbstractC36802b.m117940a(abstractC36826z);
                z15 = abstractC36826z instanceof AbstractC36826z.a;
                if (z15) {
                    currentLocation = ((AbstractC36826z.a) abstractC36826z).getCurrentLocation();
                    if (currentLocation != null || (latLngM15634f = AbstractC36816p.m118031a(currentLocation)) == null) {
                        latLngM15634f = latLngBoundsM117940a.m15634f();
                    }
                } else {
                    if (abstractC36826z instanceof AbstractC36826z.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    latLngM15634f = latLngBoundsM117940a.m15634f();
                }
                if (z15) {
                    f13 = 16.0f;
                } else {
                    f13 = 13.0f;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP);
                if (c36806f4 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                abstractC36824xM121585a = AbstractC37961i.m121585a(abstractC36826z, zIsFeatureEnabled, z16);
                if (abstractC36824xM121585a != null || (interfaceC22973k1M118023d = AbstractC36813m.m118023d(abstractC36824xM121585a)) == null) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k1M118023d;
                }
                if (c36806f4 != null) {
                    c13612gM117960a = c36806f4.getCameraPositionState();
                } else {
                    c13612gM117960a = null;
                }
                if (c13612gM117960a == null) {
                    c28655q3.m87150e0(-1373195556);
                    C11412w1 c11412w1 = new C11412w1(latLngM15634f, f13, i25);
                    c28655q3.m87152f0(-1911106014);
                    z17 = z15;
                    z18 = false;
                    latLngBounds = latLngBoundsM117940a;
                    latLng = latLngM15634f;
                    c13612gM117960a = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(c11412w1), c28655q3, 72, 0);
                    c28655q3.m87173q(false);
                    c28655q3.m87173q(false);
                } else {
                    latLngBounds = latLngBoundsM117940a;
                    z17 = z15;
                    latLng = latLngM15634f;
                    z18 = false;
                    c28655q3.m87150e0(-1373196641);
                    c28655q3.m87173q(false);
                }
                c13612g = c13612gM117960a;
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z19 || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Float fValueOf = Float.valueOf(f13);
                if (i16 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                latLng2 = latLng;
                zM87153g = z24 | c28655q3.m87153g(interfaceC28601c1) | c28655q3.m87157i(c13612g) | c28655q3.m87157i(latLng2) | c28655q3.m87147d(f13);
                objM87133R2 = c28655q3.m87133R();
                if (!zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(c36806f4, c13612g, latLng2, f13, interfaceC28601c1, null);
                    c13612g2 = c13612g;
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    c13612g2 = c13612g;
                }
                int i27 = (i15 >> 9) & 14;
                AbstractC28683x.m87255i(c36806f4, latLng2, fValueOf, (InterfaceC4351m) objM87133R2, c28655q3);
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                if (z17) {
                    aVar = (AbstractC36826z.a) abstractC36826z;
                } else {
                    aVar = null;
                }
                if (zIsFeatureEnabled || aVar == null) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                C13612g c13612g4 = c13612g2;
                iM121583k = AbstractC37960h.m121583k(z25);
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R6);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R6;
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C36812l(interfaceC28601c2, 3);
                    c28655q3.m87172p0(objM87133R7);
                }
                Function1 function1 = (Function1) objM87133R7;
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C36812l(interfaceC28601c3, 4);
                    c28655q3.m87172p0(objM87133R8);
                }
                Function1 function2 = (Function1) objM87133R8;
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C36812l(interfaceC28601c4, 5);
                    c28655q3.m87172p0(objM87133R9);
                }
                Function1 function3 = (Function1) objM87133R9;
                i17 = i15 & 896;
                C28539n0 c28539n0 = C13612g.f48186h;
                int i28 = i27 | 114819072 | i17 | 32768;
                interfaceC28601c5 = interfaceC28601c4;
                latLngBounds2 = latLngBounds;
                boolean z34 = z16;
                aVar2 = aVar;
                i18 = i15;
                C36806f c36806f5 = c36806f4;
                z26 = z25;
                AbstractC37959g.m121564e(c36806f5, aVar2, z4, z26, c13612g4, iM121583k, function1, function2, function3, c28655q3, i28);
                c13612g3 = c13612g4;
                c2314t = C2314t.f9131w;
                if (z13) {
                    modifierM44032d0 = AbstractC15673b0.m44032d0(c2314t);
                } else {
                    modifierM44032d0 = c2314t;
                }
                Modifier modifierMo3471e = modifierM44032d0.mo3471e(modifier);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                z27 = abstractC36826z instanceof AbstractC36826z.b;
                if (z27) {
                    c28655q3.m87150e0(-904096675);
                    AbstractC36803c.m117944b(latLngBounds2, c13612g3, c28655q3, 64);
                    c28655q3.m87173q(false);
                    i19 = iM121583k;
                    c28655q = c28655q3;
                    z27 = z27;
                    aVar3 = aVar2;
                    c2314t2 = c2314t;
                    latLngBounds2 = latLngBounds2;
                    z28 = zIsFeatureEnabled;
                } else {
                    if (z17) {
                        throw AbstractC11895b.m32003v(-904097952, c28655q3, false);
                    }
                    c28655q3.m87150e0(-904090894);
                    AbstractC36826z.a aVar4 = (AbstractC36826z.a) abstractC36826z;
                    boolean zM117975B = m117975B(interfaceC28601c2);
                    boolean zM117977D = m117977D(interfaceC28601c3);
                    LatLngBounds latLngBoundsM118003q = m118003q(interfaceC28601c5);
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28601c6 = interfaceC28601c5;
                        objM87133R10 = new C36812l(interfaceC28601c6, 6);
                        c28655q3.m87172p0(objM87133R10);
                    } else {
                        interfaceC28601c6 = interfaceC28601c5;
                    }
                    c2314t2 = c2314t;
                    aVar3 = aVar2;
                    interfaceC28601c5 = interfaceC28601c6;
                    z28 = zIsFeatureEnabled;
                    AbstractC37959g.m121568i(aVar4, zM117975B, zM117977D, z28, c13612g3, iM121583k, latLngBoundsM118003q, (Function1) objM87133R10, c28655q3, (i18 & 14) | 12615680);
                    i19 = iM121583k;
                    c28655q = c28655q3;
                    c13612g3 = c13612g3;
                    c28655q.m87173q(false);
                }
                if (z28 || !z17) {
                    modifierM3407d = c2314t2;
                } else {
                    modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
                }
                Modifier modifierM44032d1 = AbstractC15673b0.m44032d0(modifierM3407d);
                C37486g c37486g = new C37486g((String) c28655q.m87161k(f157470a));
                if (z27) {
                    latLngBounds3 = latLngBounds2;
                } else {
                    latLngBounds3 = null;
                }
                C13639z c13639z = new C13639z(AbstractC36817q.m118033a(abstractC36826z), latLngBounds3, c37486g, 395);
                C13607d0 c13607d0M118034b = AbstractC36817q.m118034b(z4, abstractC36826z, z28, z34);
                boolean zM87157i2 = c28655q.m87157i(aVar3);
                if (i17 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zM87157i = zM87157i2 | z29 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87155h(z26) | c28655q.m87157i(c13612g3) | c28655q.m87149e(i19);
                objM87133R11 = c28655q.m87133R();
                if (!zM87157i || objM87133R11 == c28676v0) {
                    c28655q2 = c28655q;
                    final AbstractC36826z.a aVar5 = aVar3;
                    final InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c5;
                    InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: w41.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return Boolean.valueOf(AbstractC36811k.m118009w(aVar5, z4, interfaceC2994c0, z26, c13612g3, i19, interfaceC28601c2, interfaceC28601c3, interfaceC28601c7));
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a);
                    objM87133R11 = interfaceC4339a;
                } else {
                    c28655q2 = c28655q;
                }
                C28655q c28655q4 = c28655q2;
                AbstractC37926s0.m121465c(modifierM44032d1, c13612g3, null, c13639z, c13607d0M118034b, null, null, null, null, (InterfaceC4339a) objM87133R11, null, null, interfaceC22973k1M3379a, AbstractC37817c.m121344e(-968650046, c28655q2, new InterfaceC4351m() { // from class: w41.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36811k.m118010x(abstractC36826z, (Composer) obj, iIntValue);
                    }
                }), c28655q4, 32832, ProfileVerifier.CompilationStatus.f6515xf2722a21, 14252);
                c28655q3 = c28655q4;
                c28655q3.m87173q(true);
                c36806f3 = c36806f5;
            } else {
                c28655q3.m87138X();
                c36806f3 = c36806f2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36808h(abstractC36826z, modifier, z4, c36806f3, z13, i13, i14, 1);
            }
        }
        i15 |= 3072;
        c36806f2 = c36806f;
        if ((i13 & 24576) == 0) {
            if (c28655q3.m87155h(z13)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z14)) {
            if (i26 != 0) {
                c36806f4 = null;
            } else {
                c36806f4 = c36806f2;
            }
            latLngBoundsM117940a = AbstractC36802b.m117940a(abstractC36826z);
            z15 = abstractC36826z instanceof AbstractC36826z.a;
            if (z15) {
                currentLocation = ((AbstractC36826z.a) abstractC36826z).getCurrentLocation();
                if (currentLocation != null) {
                    latLngM15634f = latLngBoundsM117940a.m15634f();
                } else {
                    latLngM15634f = latLngBoundsM117940a.m15634f();
                }
            } else {
                if (abstractC36826z instanceof AbstractC36826z.b) {
                    throw new NoWhenBranchMatchedException();
                }
                latLngM15634f = latLngBoundsM117940a.m15634f();
            }
            if (z15) {
                f13 = 16.0f;
            } else {
                f13 = 13.0f;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP);
            if (c36806f4 != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            abstractC36824xM121585a = AbstractC37961i.m121585a(abstractC36826z, zIsFeatureEnabled, z16);
            if (abstractC36824xM121585a != null) {
                interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
            } else {
                interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
            }
            if (c36806f4 != null) {
                c13612gM117960a = c36806f4.getCameraPositionState();
            } else {
                c13612gM117960a = null;
            }
            if (c13612gM117960a == null) {
                c28655q3.m87150e0(-1373195556);
                C11412w1 c11412w2 = new C11412w1(latLngM15634f, f13, i25);
                c28655q3.m87152f0(-1911106014);
                z17 = z15;
                z18 = false;
                latLngBounds = latLngBoundsM117940a;
                latLng = latLngM15634f;
                c13612gM117960a = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(c11412w2), c28655q3, 72, 0);
                c28655q3.m87173q(false);
                c28655q3.m87173q(false);
            } else {
                latLngBounds = latLngBoundsM117940a;
                z17 = z15;
                latLng = latLngM15634f;
                z18 = false;
                c28655q3.m87150e0(-1373196641);
                c28655q3.m87173q(false);
            }
            c13612g = c13612gM117960a;
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z19 = true;
            } else {
                z19 = z18;
            }
            objM87133R = c28655q3.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z19) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Float fValueOf2 = Float.valueOf(f13);
            if (i16 == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            latLng2 = latLng;
            zM87153g = z24 | c28655q3.m87153g(interfaceC28601c1) | c28655q3.m87157i(c13612g) | c28655q3.m87157i(latLng2) | c28655q3.m87147d(f13);
            objM87133R2 = c28655q3.m87133R();
            if (zM87153g) {
                objM87133R2 = new b(c36806f4, c13612g, latLng2, f13, interfaceC28601c1, null);
                c13612g2 = c13612g;
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(c36806f4, c13612g, latLng2, f13, interfaceC28601c1, null);
                c13612g2 = c13612g;
                c28655q3.m87172p0(objM87133R2);
            }
            int i29 = (i15 >> 9) & 14;
            AbstractC28683x.m87255i(c36806f4, latLng2, fValueOf2, (InterfaceC4351m) objM87133R2, c28655q3);
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q3.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q3.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87133R5);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            if (z17) {
                aVar = (AbstractC36826z.a) abstractC36826z;
            } else {
                aVar = null;
            }
            if (zIsFeatureEnabled) {
                z25 = false;
            } else {
                z25 = false;
            }
            C13612g c13612g5 = c13612g2;
            iM121583k = AbstractC37960h.m121583k(z25);
            objM87133R6 = c28655q3.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87262p(c28655q3);
                c28655q3.m87172p0(objM87133R6);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R6;
            objM87133R7 = c28655q3.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C36812l(interfaceC28601c2, 3);
                c28655q3.m87172p0(objM87133R7);
            }
            Function1 function4 = (Function1) objM87133R7;
            objM87133R8 = c28655q3.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C36812l(interfaceC28601c3, 4);
                c28655q3.m87172p0(objM87133R8);
            }
            Function1 function5 = (Function1) objM87133R8;
            objM87133R9 = c28655q3.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C36812l(interfaceC28601c4, 5);
                c28655q3.m87172p0(objM87133R9);
            }
            Function1 function6 = (Function1) objM87133R9;
            i17 = i15 & 896;
            C28539n0 c28539n1 = C13612g.f48186h;
            int i210 = i29 | 114819072 | i17 | 32768;
            interfaceC28601c5 = interfaceC28601c4;
            latLngBounds2 = latLngBounds;
            boolean z35 = z16;
            aVar2 = aVar;
            i18 = i15;
            C36806f c36806f6 = c36806f4;
            z26 = z25;
            AbstractC37959g.m121564e(c36806f6, aVar2, z4, z26, c13612g5, iM121583k, function4, function5, function6, c28655q3, i210);
            c13612g3 = c13612g5;
            c2314t = C2314t.f9131w;
            if (z13) {
                modifierM44032d0 = AbstractC15673b0.m44032d0(c2314t);
            } else {
                modifierM44032d0 = c2314t;
            }
            Modifier modifierMo3471e2 = modifierM44032d0.mo3471e(modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            z27 = abstractC36826z instanceof AbstractC36826z.b;
            if (z27) {
                c28655q3.m87150e0(-904096675);
                AbstractC36803c.m117944b(latLngBounds2, c13612g3, c28655q3, 64);
                c28655q3.m87173q(false);
                i19 = iM121583k;
                c28655q = c28655q3;
                z27 = z27;
                aVar3 = aVar2;
                c2314t2 = c2314t;
                latLngBounds2 = latLngBounds2;
                z28 = zIsFeatureEnabled;
            } else {
                if (z17) {
                    throw AbstractC11895b.m32003v(-904097952, c28655q3, false);
                }
                c28655q3.m87150e0(-904090894);
                AbstractC36826z.a aVar6 = (AbstractC36826z.a) abstractC36826z;
                boolean zM117975B2 = m117975B(interfaceC28601c2);
                boolean zM117977D2 = m117977D(interfaceC28601c3);
                LatLngBounds latLngBoundsM118003q2 = m118003q(interfaceC28601c5);
                objM87133R10 = c28655q3.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28601c6 = interfaceC28601c5;
                    objM87133R10 = new C36812l(interfaceC28601c6, 6);
                    c28655q3.m87172p0(objM87133R10);
                } else {
                    interfaceC28601c6 = interfaceC28601c5;
                }
                c2314t2 = c2314t;
                aVar3 = aVar2;
                interfaceC28601c5 = interfaceC28601c6;
                z28 = zIsFeatureEnabled;
                AbstractC37959g.m121568i(aVar6, zM117975B2, zM117977D2, z28, c13612g3, iM121583k, latLngBoundsM118003q2, (Function1) objM87133R10, c28655q3, (i18 & 14) | 12615680);
                i19 = iM121583k;
                c28655q = c28655q3;
                c13612g3 = c13612g3;
                c28655q.m87173q(false);
            }
            if (z28) {
                modifierM3407d = c2314t2;
            } else {
                modifierM3407d = c2314t2;
            }
            Modifier modifierM44032d2 = AbstractC15673b0.m44032d0(modifierM3407d);
            C37486g c37486g2 = new C37486g((String) c28655q.m87161k(f157470a));
            if (z27) {
                latLngBounds3 = latLngBounds2;
            } else {
                latLngBounds3 = null;
            }
            C13639z c13639z2 = new C13639z(AbstractC36817q.m118033a(abstractC36826z), latLngBounds3, c37486g2, 395);
            C13607d0 c13607d0M118034b2 = AbstractC36817q.m118034b(z4, abstractC36826z, z28, z35);
            boolean zM87157i3 = c28655q.m87157i(aVar3);
            if (i17 == 256) {
                z29 = true;
            } else {
                z29 = false;
            }
            zM87157i = zM87157i3 | z29 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87155h(z26) | c28655q.m87157i(c13612g3) | c28655q.m87149e(i19);
            objM87133R11 = c28655q.m87133R();
            if (zM87157i) {
                c28655q2 = c28655q;
                final AbstractC36826z.a aVar7 = aVar3;
                final InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c5;
                InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: w41.i
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC36811k.m118009w(aVar7, z4, interfaceC2994c0, z26, c13612g3, i19, interfaceC28601c2, interfaceC28601c3, interfaceC28601c8));
                    }
                };
                c28655q2.m87172p0(interfaceC4339a2);
                objM87133R11 = interfaceC4339a2;
            } else {
                c28655q2 = c28655q;
                final AbstractC36826z.a aVar8 = aVar3;
                final InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c5;
                InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: w41.i
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC36811k.m118009w(aVar8, z4, interfaceC2994c0, z26, c13612g3, i19, interfaceC28601c2, interfaceC28601c3, interfaceC28601c9));
                    }
                };
                c28655q2.m87172p0(interfaceC4339a3);
                objM87133R11 = interfaceC4339a3;
            }
            C28655q c28655q5 = c28655q2;
            AbstractC37926s0.m121465c(modifierM44032d2, c13612g3, null, c13639z2, c13607d0M118034b2, null, null, null, null, (InterfaceC4339a) objM87133R11, null, null, interfaceC22973k1M3379a, AbstractC37817c.m121344e(-968650046, c28655q2, new InterfaceC4351m() { // from class: w41.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36811k.m118010x(abstractC36826z, (Composer) obj, iIntValue);
                }
            }), c28655q5, 32832, ProfileVerifier.CompilationStatus.f6515xf2722a21, 14252);
            c28655q3 = c28655q5;
            c28655q3.m87173q(true);
            c36806f3 = c36806f6;
        } else {
            c28655q3.m87138X();
            c36806f3 = c36806f2;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36808h(abstractC36826z, modifier, z4, c36806f3, z13, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m118001o(LatLng latLng, float f13, C13612g rememberCameraPositionState) {
        AbstractC22676k.m65750j(rememberCameraPositionState, "$this$rememberCameraPositionState");
        rememberCameraPositionState.m38432d(new CameraPosition(latLng, f13, 0.0f, 0.0f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m118002p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: q */
    private static final LatLngBounds m118003q(InterfaceC28601c1 interfaceC28601c1) {
        return (LatLngBounds) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m118004r(InterfaceC28601c1 interfaceC28601c1, LatLngBounds latLngBounds) {
        interfaceC28601c1.setValue(latLngBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m118005s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m117976C(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m118006t(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m118002p(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m118007u(InterfaceC28601c1 interfaceC28601c1, LatLngBounds latLngBounds) {
        if (latLngBounds != null) {
            m118004r(interfaceC28601c1, latLngBounds);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m118008v(InterfaceC28601c1 interfaceC28601c1, LatLngBounds fittedBounds) {
        AbstractC22676k.m65750j(fittedBounds, "fittedBounds");
        m118004r(interfaceC28601c1, fittedBounds);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m118009w(AbstractC36826z.a aVar, boolean z4, InterfaceC2994c0 interfaceC2994c0, boolean z13, C13612g c13612g, int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        if (aVar == null || !z4) {
            return false;
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(aVar, z4, z13, c13612g, i13, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m118010x(AbstractC36826z abstractC36826z, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (abstractC36826z instanceof AbstractC36826z.b) {
            c28655q.m87150e0(1135211556);
            AbstractC36801a0.m117937b((AbstractC36826z.b) abstractC36826z, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC36826z instanceof AbstractC36826z.a)) {
                throw AbstractC11895b.m32003v(1135209663, c28655q, false);
            }
            c28655q.m87150e0(1135214082);
            AbstractC37953a.m121546b((AbstractC36826z.a) abstractC36826z, c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m118011y(AbstractC36826z abstractC36826z, Modifier modifier, boolean z4, C36806f c36806f, boolean z13, int i13, int i14, Composer composer, int i15) {
        m118000n(abstractC36826z, modifier, z4, c36806f, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final boolean m118012z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }
}
