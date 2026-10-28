package p728ql2;

import am2.C1018g;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9791o;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import j11.AbstractC21211n;
import j93.InterfaceC21467g;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import li1.AbstractC24100a;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26967q;
import nw0.C27198e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p179h.C16351i;
import p208i2.C17919x;
import p236j.C21062a;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
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
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf3.C29155a;
import pl2.C29351a;
import q51.C29979a;
import q81.C30047e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: ql2.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aM\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0004\u001a%\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aC\u0010 \u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "p", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lql2/c;", "viewState", "Lh/i;", "", "", "fineLocationPermissionLauncher", "Lkotlin/Function1;", "Lql2/b;", "onEvent", "y", "(Lc93/a;Lql2/c;Lh/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "B", "onEnableLocation", "n", "(Lql2/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "onGoToSettings", "onDismiss", "l", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Landroid/location/LocationManager;", "locationManager", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "Lj/a;", "settingsLauncher", "onDialogHide", "E", "(Landroid/location/LocationManager;Landroid/content/Context;Lh/i;Lc93/a;)V", "Lpl2/a;", "viewModel", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {

    /* JADX INFO: renamed from: ql2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f125221w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f125222x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f125223y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f125224z;

        /* JADX INFO: renamed from: ql2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42227a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f125225w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42227a(C21647a c21647a) {
                super(0);
                this.f125225w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f125225w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f125221w = c38266c;
            this.f125222x = interfaceC35951a;
            this.f125223y = interfaceC4339a;
            this.f125224z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pl2.a] */
        @Override // c93.InterfaceC4339a
        public final C29351a invoke() {
            return AbstractC21598x.m60668X(this.f125221w, this.f125222x, new C42227a(this.f125224z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29351a.class), null, this.f125223y);
        }
    }

    /* JADX INFO: renamed from: ql2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.training.locationsettings.view.LocationSettingsScreenKt$LocationSettingsScreen$1$1", m100430f = "LocationSettingsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125226w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f125227x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125227x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f125227x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125226w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function0.m93270q(this.f125227x).m89458n(AbstractC30475b.c.f125230a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ql2.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements Function1 {
        public c(Object obj) {
            super(1, 0, C29351a.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/training/locationsettings/view/LocationSettingsViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m93280a(AbstractC30475b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C29351a) this.receiver).m89458n(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93280a((AbstractC30475b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m93249A(InterfaceC4339a interfaceC4339a, C30476c c30476c, C16351i c16351i, Function1 function1, int i13, Composer composer, int i14) {
        m93278y(interfaceC4339a, c30476c, c16351i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m93250B(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1327383130);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC24100a.f95192h), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 16, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m93251C(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m93250B(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m93253E(LocationManager locationManager, Context context, C16351i settingsLauncher, InterfaceC4339a onDialogHide) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(settingsLauncher, "settingsLauncher");
        AbstractC22676k.m65750j(onDialogHide, "onDialogHide");
        if ((locationManager == null || !locationManager.isProviderEnabled("gps")) && (locationManager == null || !locationManager.isProviderEnabled("network"))) {
            settingsLauncher.mo4052a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
        } else {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent.addFlags(268435456);
            settingsLauncher.mo4052a(intent, null);
        }
        onDialogHide.invoke();
    }

    /* JADX INFO: renamed from: l */
    public static final void m93265l(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        InterfaceC4339a onGoToSettings = interfaceC4339a;
        InterfaceC4339a onDismiss = interfaceC4339a2;
        AbstractC22676k.m65750j(onGoToSettings, "onGoToSettings");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2002089098);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onGoToSettings) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onDismiss) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC24100a.f95185a);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC24100a.f95191g);
            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC24100a.f95186b);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC24100a.f95187c);
            int i15 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, interfaceC4339a, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 0, ((i14 << 3) & 896) | ((i14 << 12) & 57344), 247463409);
            onDismiss = interfaceC4339a2;
            onGoToSettings = interfaceC4339a;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onGoToSettings, onDismiss, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m93266m(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m93265l(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x016a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0170  */
    /* JADX WARN: Code duplicated, block: B:49:0x018c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0252  */
    /* JADX WARN: Code duplicated, block: B:53:0x0256  */
    /* JADX WARN: Code duplicated, block: B:58:0x0273  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    private static final void m93267n(C30476c c30476c, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        int i15;
        int i16;
        int iHashCode;
        int iHashCode2;
        C0209i c0209i;
        C0209i c0209i2;
        int iHashCode3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1541011531);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c30476c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1102d.m3407d(1.0f, c2314t));
            float f15 = 4;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15 * f15);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                C39282o.Companion companion = C39282o.INSTANCE;
                if (c30476c.getHasFineLocation() || !c30476c.getHasBackgroundLocation()) {
                    i16 = AbstractC24100a.f95188d;
                } else {
                    i16 = AbstractC24100a.f95190f;
                }
                int i17 = 2;
                AbstractC39281n.m125207c(null, C39282o.Companion.m125229d(companion, new TextResource.C8688b(i16, null, i17, 0 == true ? 1 : 0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSettings(), 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388446, null), interfaceC4339a, c28655q, (C39282o.f168987q << 3) | ((i15 << 3) & 896), 1);
                C2306l c2306l = C2299e.f9108K;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95189e);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
                long jM125385c1 = c38072d.m121949b(c28655q, i18).getWhite70();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM92103Y, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i19, 196602);
                float f16 = 1 * f14;
                AbstractC23124k3.m67099c(AbstractC1099a.m3396r(c2314t, f16, 0.0f, 2), c38072d.m121949b(c28655q, i18).getWhite10(), 0.0f, 6, c28655q, 2);
                c28655q.m87173q(true);
                AbstractC23124k3.m67099c(null, c38072d.m121949b(c28655q, i18).getWhite10(), 0.0f, 0, c28655q, 3);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i5;
                } else {
                    c0209i = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                c0209i2 = c0209i;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getLogo().getWhoop(), c28655q, 6), null, AbstractC1102d.m3419p(6 * f15, AbstractC1099a.m3394p(f16, c2314t)), C17919x.f69627d, c28655q, 3504, 0);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, f15, c2305k, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95189e), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95191g), null, c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
            }
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            C39282o.Companion companion2 = C39282o.INSTANCE;
            if (c30476c.getHasFineLocation()) {
                i16 = AbstractC24100a.f95188d;
            } else {
                i16 = AbstractC24100a.f95188d;
            }
            int i110 = 2;
            AbstractC39281n.m125207c(null, C39282o.Companion.m125229d(companion2, new TextResource.C8688b(i16, null, i110, 0 == true ? 1 : 0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getSettings(), 0 == true ? 1 : 0, i110, 0 == true ? 1 : 0), null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), 0 == true ? 1 : 0, i110, 0 == true ? 1 : 0), null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388446, null), interfaceC4339a, c28655q, (C39282o.f168987q << 3) | ((i15 << 3) & 896), 1);
            C2306l c2306l2 = C2299e.f9108K;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95189e);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i111).getB1();
            long jM125385c2 = c38072d2.m121949b(c28655q, i111).getWhite70();
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y2, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, i112, 196602);
            float f17 = 1 * f14;
            AbstractC23124k3.m67099c(AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d2.m121949b(c28655q, i111).getWhite10(), 0.0f, 6, c28655q, 2);
            c28655q.m87173q(true);
            AbstractC23124k3.m67099c(null, c38072d2.m121949b(c28655q, i111).getWhite10(), 0.0f, 0, c28655q, 3);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            c0209i2 = c0209i;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getLogo().getWhoop(), c28655q, 6), null, AbstractC1102d.m3419p(6 * f15, AbstractC1099a.m3394p(f17, c2314t)), C17919x.f69627d, c28655q, 3504, 0);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f13, f15, c2305k, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95189e), null, c38072d2.m121949b(c28655q, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB1(), null, c28655q, 0, i112, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC24100a.f95191g), null, c38072d2.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i112, 196602);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(c30476c, interfaceC4339a, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m93268o(C30476c c30476c, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m93267n(c30476c, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m93269p(InterfaceC4339a onBackClick, Composer composer, int i13) {
        int i14;
        InterfaceC23462h interfaceC23462h;
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1596157751);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onBackClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m93270q(interfaceC23462h2).getViewState(), new C30476c(false, false, false, false, 15, null), null, c28655q, 0, 2);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
            boolean zM87157i = c28655q.m87157i(interfaceC23462h2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C26967q(interfaceC23462h2, 3);
                c28655q.m87172p0(objM87133R2);
            }
            C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R2, c28655q, 0);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C26967q(interfaceC23462h2, 4);
                c28655q.m87172p0(objM87133R3);
            }
            C16351i c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult, (Function1) objM87133R3, c28655q, 0);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new b(interfaceC23462h2, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
            int i15 = i14;
            C30476c c30476cM93271r = m93271r(interfaceC28601c1M87260n);
            C29351a c29351aM93270q = m93270q(interfaceC23462h2);
            boolean zM87157i4 = c28655q.m87157i(c29351aM93270q);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new c(c29351aM93270q);
                c28655q.m87172p0(objM87133R5);
            }
            m93278y(onBackClick, c30476cM93271r, c16351iM118972a0, (Function1) ((InterfaceC21467g) objM87133R5), c28655q, (i15 & 14) | 512);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
            if (m93271r(interfaceC28601c1M87260n).getShowBackgroundLocationDialog()) {
                c28655q.m87150e0(-1551512999);
                boolean zM87157i5 = c28655q.m87157i(locationManager) | c28655q.m87157i(context) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87157i(interfaceC23462h2);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i5 || objM87133R6 == c28676v0) {
                    C27198e c27198e = new C27198e(locationManager, context, c16351iM118972a1, interfaceC23462h2, 8);
                    interfaceC23462h = interfaceC23462h2;
                    c28655q.m87172p0(c27198e);
                    objM87133R6 = c27198e;
                } else {
                    interfaceC23462h = interfaceC23462h2;
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                boolean zM87157i6 = c28655q.m87157i(interfaceC23462h);
                Object objM87133R7 = c28655q.m87133R();
                if (zM87157i6 || objM87133R7 == c28676v0) {
                    objM87133R7 = new C9791o(interfaceC23462h, 3);
                    c28655q.m87172p0(objM87133R7);
                }
                m93265l(interfaceC4339a, (InterfaceC4339a) objM87133R7, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1550959463);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 17, onBackClick);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C29351a m93270q(InterfaceC23462h interfaceC23462h) {
        return (C29351a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final C30476c m93271r(InterfaceC28670t2 interfaceC28670t2) {
        return (C30476c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m93272s(InterfaceC23462h interfaceC23462h, boolean z4) {
        m93270q(interfaceC23462h).m89458n(new AbstractC30475b.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m93273t(InterfaceC23462h interfaceC23462h, C21062a it) {
        AbstractC22676k.m65750j(it, "it");
        m93270q(interfaceC23462h).m89458n(AbstractC30475b.c.f125230a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m93274u(LocationManager locationManager, Context context, C16351i c16351i, InterfaceC23462h interfaceC23462h) {
        m93253E(locationManager, context, c16351i, new C9791o(interfaceC23462h, 4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m93275v(InterfaceC23462h interfaceC23462h) {
        m93270q(interfaceC23462h).m89458n(AbstractC30475b.b.f125229a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m93276w(InterfaceC23462h interfaceC23462h) {
        m93270q(interfaceC23462h).m89458n(AbstractC30475b.b.f125229a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m93277x(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m93269p(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m93278y(InterfaceC4339a onBackClick, C30476c viewState, C16351i fineLocationPermissionLauncher, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(fineLocationPermissionLauncher, "fineLocationPermissionLauncher");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1344958944);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onBackClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(fineLocationPermissionLauncher) : c28655q.m87157i(fineLocationPermissionLauncher) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM44032d0 = AbstractC15673b0.m44032d0(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44032d0);
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
            m93250B(onBackClick, c28655q, i14 & 14);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q.m87157i(fineLocationPermissionLauncher))) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C26057j(viewState, fineLocationPermissionLauncher, onEvent, 22);
                c28655q.m87172p0(objM87133R);
            }
            m93267n(viewState, (InterfaceC4339a) objM87133R, c28655q, (i14 >> 3) & 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29979a(onBackClick, viewState, fineLocationPermissionLauncher, onEvent, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m93279z(C30476c c30476c, C16351i c16351i, Function1 function1) {
        if (!c30476c.getHasFineLocation()) {
            c16351i.mo4052a("android.permission.ACCESS_FINE_LOCATION", null);
        } else if (!c30476c.getHasBackgroundLocation()) {
            function1.invoke(AbstractC30475b.d.f125231a);
        }
        return C23454a0.f92919a;
    }
}
