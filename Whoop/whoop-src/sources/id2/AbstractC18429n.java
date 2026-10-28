package id2;

import a81.C0556g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import ep1.C13412g;
import f01.C13857f;
import i01.C17841d;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kd1.AbstractC22402n;
import kd1.AbstractC22404p;
import kd1.C22401m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.C15079m3;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39172d;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: id2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a_\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aE\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u001a2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ly3/f;", "width", "height", "Lid2/j;", "snapshotCapture", "Lkotlin/Function0;", "Ll83/a0;", "content", "l", "(Ly3/f;Ly3/f;Lid2/j;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "densityOverride", "Lkd1/m;", "imageLoadTracker", "m", "(Landroidx/compose/ui/Modifier;Ly3/f;Ly3/f;Ljava/lang/Float;Lid2/j;Lkd1/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "context", "", "Landroidx/compose/ui/platform/ComposeView;", "contentView", "Landroid/widget/FrameLayout;", "z", "(Landroid/content/Context;IILandroidx/compose/ui/platform/ComposeView;)Landroid/widget/FrameLayout;", "Ly3/c;", "t", "(Landroid/content/Context;Lid2/j;Lkd1/m;Ly3/c;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18429n {

    /* JADX INFO: renamed from: id2.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final a f71681w = new a();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: id2.n$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"id2/n$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C18425j f71682a;

        public b(C18425j c18425j) {
            this.f71682a = c18425j;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f71682a.m53046e(a.f71681w);
        }
    }

    /* JADX INFO: renamed from: id2.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.ViewSnapshotKt$composeContentView$1$1$2$1", m100430f = "ViewSnapshot.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71683w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22401m f71684x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C22401m c22401m, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71684x = c22401m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f71684x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71683w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22401m c22401m = this.f71684x;
            if (c22401m != null) {
                c22401m.m64481c();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id2.n$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final d f71685w = new d();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: id2.n$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"id2/n$e", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C18425j f71686a;

        public e(C18425j c18425j) {
            this.f71686a = c18425j;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f71686a.m53046e(d.f71685w);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m53059l(C39174f c39174f, C39174f c39174f2, C18425j snapshotCapture, InterfaceC4351m content, Composer composer, int i13, int i14) {
        C39174f c39174f3;
        int i15;
        C39174f c39174f4;
        int i16;
        boolean z4;
        C39174f c39174f5;
        C39174f c39174f6;
        C28677v1 c28677v1M87180u;
        C39174f c39174f7;
        C39174f c39174f8;
        boolean zIsFeatureEnabled;
        Object objM87133R;
        C28676v0 c28676v0;
        C18425j c18425j;
        Object objM87133R2;
        C18425j c18425j2;
        boolean zM87157i;
        Object objM87133R3;
        C18425j c18425j3;
        Modifier modifierM3414k;
        Modifier modifierM3411h;
        C22401m imageLoadTracker;
        int i17;
        int i18;
        int i19;
        int i24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        int i26;
        AbstractC22676k.m65750j(snapshotCapture, "snapshotCapture");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(949809353);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            c39174f3 = c39174f;
        } else if ((i13 & 6) == 0) {
            c39174f3 = c39174f;
            i15 = (c28655q.m87153g(c39174f3) ? 4 : 2) | i13;
        } else {
            c39174f3 = c39174f;
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                c39174f4 = c39174f2;
                i15 |= c28655q.m87153g(c39174f4) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(snapshotCapture)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i15 |= i26;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i25;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i27 != 0) {
                    c39174f7 = null;
                } else {
                    c39174f7 = c39174f3;
                }
                if (i28 != 0) {
                    c39174f8 = null;
                } else {
                    c39174f8 = c39174f4;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("share-high-res-export-android");
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C18425j();
                    c28655q.m87172p0(objM87133R);
                }
                c18425j = (C18425j) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18425j();
                    c28655q.m87172p0(objM87133R2);
                }
                c18425j2 = (C18425j) objM87133R2;
                Boolean boolValueOf = Boolean.valueOf(zIsFeatureEnabled);
                zM87157i = c28655q.m87157i(snapshotCapture) | c28655q.m87155h(zIsFeatureEnabled) | c28655q.m87157i(c18425j2) | c28655q.m87157i(c18425j);
                objM87133R3 = c28655q.m87133R();
                if (!zM87157i || objM87133R3 == c28676v0) {
                    C4614e c4614e = new C4614e(snapshotCapture, zIsFeatureEnabled, c18425j2, c18425j, 8);
                    c18425j3 = c18425j2;
                    c28655q.m87172p0(c4614e);
                    objM87133R3 = c4614e;
                } else {
                    c18425j3 = c18425j2;
                }
                AbstractC28683x.m87251e(boolValueOf, (Function1) objM87133R3, c28655q);
                modifierM3414k = C2314t.f9131w;
                if (c39174f7 != null || c39174f8 == null) {
                    modifierM3411h = modifierM3414k;
                } else {
                    modifierM3411h = AbstractC1102d.m3411h(c39174f8.f168413w, AbstractC1102d.m3424u(c39174f7.f168413w, modifierM3414k));
                }
                if (zIsFeatureEnabled == 0) {
                    imageLoadTracker = snapshotCapture.getImageLoadTracker();
                } else {
                    imageLoadTracker = null;
                }
                int i29 = i16 << 3;
                i17 = i29 & 112;
                i18 = i29 & 896;
                int i34 = i29 & MessageListItemViewType.GIPHY;
                i19 = C22401m.f87632e << 15;
                i24 = (i16 << 9) & 3670016;
                int i35 = i34 | i19 | i24;
                c39174f5 = c39174f7;
                c39174f6 = c39174f8;
                m53060m(modifierM3411h, c39174f5, c39174f6, null, c18425j, imageLoadTracker, content, c28655q, i35, 8);
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(527360716);
                    Modifier modifierM118995s = AbstractC37056f.m118995s(AbstractC1102d.m3419p(0, modifierM3414k));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118995s);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (c39174f5 != null && c39174f6 != null) {
                        modifierM3414k = AbstractC1102d.m3414k(c39174f6.f168413w, AbstractC1102d.m3418o(c39174f5.f168413w, modifierM3414k));
                    }
                    m53060m(modifierM3414k, c39174f5, c39174f6, Float.valueOf(3.0f), c18425j3, snapshotCapture.getImageLoadTracker(), content, c28655q, i17 | 3072 | i18 | i19 | i24, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(528049753);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                c39174f5 = c39174f3;
                c39174f6 = c39174f4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(c39174f5, c39174f6, snapshotCapture, content, i13, i14, 13);
            }
        }
        i15 |= 48;
        c39174f4 = c39174f2;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(snapshotCapture)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i15 |= i26;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(content)) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        }
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i27 != 0) {
                c39174f7 = null;
            } else {
                c39174f7 = c39174f3;
            }
            if (i28 != 0) {
                c39174f8 = null;
            } else {
                c39174f8 = c39174f4;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("share-high-res-export-android");
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C18425j();
                c28655q.m87172p0(objM87133R);
            }
            c18425j = (C18425j) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C18425j();
                c28655q.m87172p0(objM87133R2);
            }
            c18425j2 = (C18425j) objM87133R2;
            Boolean boolValueOf2 = Boolean.valueOf(zIsFeatureEnabled);
            zM87157i = c28655q.m87157i(snapshotCapture) | c28655q.m87155h(zIsFeatureEnabled) | c28655q.m87157i(c18425j2) | c28655q.m87157i(c18425j);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                C4614e c4614e2 = new C4614e(snapshotCapture, zIsFeatureEnabled, c18425j2, c18425j, 8);
                c18425j3 = c18425j2;
                c28655q.m87172p0(c4614e2);
                objM87133R3 = c4614e2;
            } else {
                C4614e c4614e3 = new C4614e(snapshotCapture, zIsFeatureEnabled, c18425j2, c18425j, 8);
                c18425j3 = c18425j2;
                c28655q.m87172p0(c4614e3);
                objM87133R3 = c4614e3;
            }
            AbstractC28683x.m87251e(boolValueOf2, (Function1) objM87133R3, c28655q);
            modifierM3414k = C2314t.f9131w;
            if (c39174f7 != null) {
                modifierM3411h = modifierM3414k;
            } else {
                modifierM3411h = modifierM3414k;
            }
            if (zIsFeatureEnabled == 0) {
                imageLoadTracker = snapshotCapture.getImageLoadTracker();
            } else {
                imageLoadTracker = null;
            }
            int i210 = i16 << 3;
            i17 = i210 & 112;
            i18 = i210 & 896;
            int i36 = i210 & MessageListItemViewType.GIPHY;
            i19 = C22401m.f87632e << 15;
            i24 = (i16 << 9) & 3670016;
            int i37 = i36 | i19 | i24;
            c39174f5 = c39174f7;
            c39174f6 = c39174f8;
            m53060m(modifierM3411h, c39174f5, c39174f6, null, c18425j, imageLoadTracker, content, c28655q, i37, 8);
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(527360716);
                Modifier modifierM118995s2 = AbstractC37056f.m118995s(AbstractC1102d.m3419p(0, modifierM3414k));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118995s2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (c39174f5 != null) {
                    modifierM3414k = AbstractC1102d.m3414k(c39174f6.f168413w, AbstractC1102d.m3418o(c39174f5.f168413w, modifierM3414k));
                }
                m53060m(modifierM3414k, c39174f5, c39174f6, Float.valueOf(3.0f), c18425j3, snapshotCapture.getImageLoadTracker(), content, c28655q, i17 | 3072 | i18 | i19 | i24, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(528049753);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            c39174f5 = c39174f3;
            c39174f6 = c39174f4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(c39174f5, c39174f6, snapshotCapture, content, i13, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[PHI: r17
      0x0097: PHI (r17v10 int) = (r17v0 int), (r17v5 int), (r17v6 int) binds: [B:54:0x0095, B:64:0x00b0, B:63:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX INFO: renamed from: m */
    private static final void m53060m(Modifier modifier, C39174f c39174f, C39174f c39174f2, Float f13, C18425j c18425j, C22401m c22401m, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C39174f c39174f3;
        int i16;
        C39174f c39174f4;
        int i17;
        int i18;
        Float f14;
        int i19;
        int i24;
        int i25;
        boolean zM87157i;
        boolean z4;
        C28655q c28655q;
        C22401m c22401m2;
        Modifier modifier3;
        C39174f c39174f5;
        C39174f c39174f6;
        Float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        InterfaceC39171c interfaceC39171c;
        float density;
        float fontScale;
        C39172d c39172d;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM87153g;
        Object objM87133R;
        int i26;
        int i27;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(452125551);
        int i28 = i14 & 1;
        if (i28 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                c39174f3 = c39174f;
                i15 |= c28655q2.m87153g(c39174f3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    c39174f4 = c39174f2;
                    if (c28655q2.m87153g(c39174f4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        f14 = f13;
                        if (c28655q2.m87153g(f14)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q2.m87157i(c18425j)) {
                            i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i27 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i27;
                    }
                    i24 = i14 & 32;
                    i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if (i24 == 0) {
                        i15 |= i25;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            zM87157i = c28655q2.m87153g(c22401m);
                        } else {
                            zM87157i = c28655q2.m87157i(c22401m);
                        }
                        if (zM87157i) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i29 != 0) {
                            c39174f3 = null;
                        } else {
                            c39174f3 = c39174f3;
                        }
                        if (i16 != 0) {
                            c39174f4 = null;
                        }
                        if (i18 != 0) {
                            f14 = null;
                        }
                        if (i24 != 0) {
                            c22401m2 = null;
                        } else {
                            c22401m2 = c22401m;
                        }
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        if (f14 != null) {
                            density = f14.floatValue();
                        } else {
                            density = interfaceC39171c.getDensity();
                        }
                        fontScale = interfaceC39171c.getFontScale();
                        if (fontScale > 1.0f) {
                            fontScale = 1.0f;
                        }
                        c39172d = new C39172d(density, fontScale);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean zM87153g2 = z13 | c28655q2.m87153g(c39172d);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM87157i2 = zM87153g2 | z14 | c28655q2.m87157i(c18425j);
                        if ((458752 & i15) != 131072 || ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && c28655q2.m87157i(c22401m2))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87153g = zM87157i2 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                        objM87133R = c28655q2.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            C3424a0 c3424a0 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                            c28655q2.m87172p0(c3424a0);
                            objM87133R = c3424a0;
                        }
                        int i34 = (i15 << 3) & 112;
                        c28655q = c28655q2;
                        modifier3 = modifier4;
                        AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i34, 4);
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c22401m2 = c22401m;
                        modifier3 = modifier2;
                    }
                    C28655q c28655q3 = c28655q;
                    c39174f5 = c39174f3;
                    c39174f6 = c39174f4;
                    f15 = f14;
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
                    }
                }
                i15 |= 3072;
                f14 = f13;
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(c18425j)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i = c28655q2.m87153g(c22401m);
                    } else {
                        zM87157i = c28655q2.m87157i(c22401m);
                    }
                    if (zM87157i) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f3;
                    }
                    if (i16 != 0) {
                        c39174f4 = null;
                    }
                    if (i18 != 0) {
                        f14 = null;
                    }
                    if (i24 != 0) {
                        c22401m2 = null;
                    } else {
                        c22401m2 = c22401m;
                    }
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    if (f14 != null) {
                        density = f14.floatValue();
                    } else {
                        density = interfaceC39171c.getDensity();
                    }
                    fontScale = interfaceC39171c.getFontScale();
                    if (fontScale > 1.0f) {
                        fontScale = 1.0f;
                    }
                    c39172d = new C39172d(density, fontScale);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g3 = z13 | c28655q2.m87153g(c39172d);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i3 = zM87153g3 | z14 | c28655q2.m87157i(c18425j);
                    if ((458752 & i15) != 131072) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zM87153g = zM87157i3 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        C3424a0 c3424a1 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a1);
                        objM87133R = c3424a1;
                    } else {
                        C3424a0 c3424a2 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a2);
                        objM87133R = c3424a2;
                    }
                    int i35 = (i15 << 3) & 112;
                    c28655q = c28655q2;
                    modifier3 = modifier4;
                    AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i35, 4);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c22401m2 = c22401m;
                    modifier3 = modifier2;
                }
                C28655q c28655q4 = c28655q;
                c39174f5 = c39174f3;
                c39174f6 = c39174f4;
                f15 = f14;
                c28677v1M87180u = c28655q4.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
                }
            }
            i15 |= 384;
            c39174f4 = c39174f2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q2.m87153g(f14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(c18425j)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i = c28655q2.m87153g(c22401m);
                    } else {
                        zM87157i = c28655q2.m87157i(c22401m);
                    }
                    if (zM87157i) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f3;
                    }
                    if (i16 != 0) {
                        c39174f4 = null;
                    }
                    if (i18 != 0) {
                        f14 = null;
                    }
                    if (i24 != 0) {
                        c22401m2 = null;
                    } else {
                        c22401m2 = c22401m;
                    }
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    if (f14 != null) {
                        density = f14.floatValue();
                    } else {
                        density = interfaceC39171c.getDensity();
                    }
                    fontScale = interfaceC39171c.getFontScale();
                    if (fontScale > 1.0f) {
                        fontScale = 1.0f;
                    }
                    c39172d = new C39172d(density, fontScale);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g4 = z13 | c28655q2.m87153g(c39172d);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i4 = zM87153g4 | z14 | c28655q2.m87157i(c18425j);
                    if ((458752 & i15) != 131072) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zM87153g = zM87157i4 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        C3424a0 c3424a3 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a3);
                        objM87133R = c3424a3;
                    } else {
                        C3424a0 c3424a4 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a4);
                        objM87133R = c3424a4;
                    }
                    int i36 = (i15 << 3) & 112;
                    c28655q = c28655q2;
                    modifier3 = modifier4;
                    AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i36, 4);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c22401m2 = c22401m;
                    modifier3 = modifier2;
                }
                C28655q c28655q5 = c28655q;
                c39174f5 = c39174f3;
                c39174f6 = c39174f4;
                f15 = f14;
                c28677v1M87180u = c28655q5.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
                }
            }
            i15 |= 3072;
            f14 = f13;
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(c18425j)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q2.m87153g(c22401m);
                } else {
                    zM87157i = c28655q2.m87157i(c22401m);
                }
                if (zM87157i) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i29 != 0) {
                    c39174f3 = null;
                } else {
                    c39174f3 = c39174f3;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                }
                if (i18 != 0) {
                    f14 = null;
                }
                if (i24 != 0) {
                    c22401m2 = null;
                } else {
                    c22401m2 = c22401m;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (f14 != null) {
                    density = f14.floatValue();
                } else {
                    density = interfaceC39171c.getDensity();
                }
                fontScale = interfaceC39171c.getFontScale();
                if (fontScale > 1.0f) {
                    fontScale = 1.0f;
                }
                c39172d = new C39172d(density, fontScale);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g5 = z13 | c28655q2.m87153g(c39172d);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i5 = zM87153g5 | z14 | c28655q2.m87157i(c18425j);
                if ((458752 & i15) != 131072) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                zM87153g = zM87157i5 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    C3424a0 c3424a5 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a5);
                    objM87133R = c3424a5;
                } else {
                    C3424a0 c3424a6 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a6);
                    objM87133R = c3424a6;
                }
                int i37 = (i15 << 3) & 112;
                c28655q = c28655q2;
                modifier3 = modifier4;
                AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i37, 4);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c22401m2 = c22401m;
                modifier3 = modifier2;
            }
            C28655q c28655q6 = c28655q;
            c39174f5 = c39174f3;
            c39174f6 = c39174f4;
            f15 = f14;
            c28677v1M87180u = c28655q6.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
            }
        }
        i15 |= 48;
        c39174f3 = c39174f;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                c39174f4 = c39174f2;
                if (c28655q2.m87153g(c39174f4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q2.m87153g(f14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(c18425j)) {
                        i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i27;
                }
                i24 = i14 & 32;
                i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i24 == 0) {
                    i15 |= i25;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i = c28655q2.m87153g(c22401m);
                    } else {
                        zM87157i = c28655q2.m87157i(c22401m);
                    }
                    if (zM87157i) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i29 != 0) {
                        c39174f3 = null;
                    } else {
                        c39174f3 = c39174f3;
                    }
                    if (i16 != 0) {
                        c39174f4 = null;
                    }
                    if (i18 != 0) {
                        f14 = null;
                    }
                    if (i24 != 0) {
                        c22401m2 = null;
                    } else {
                        c22401m2 = c22401m;
                    }
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    if (f14 != null) {
                        density = f14.floatValue();
                    } else {
                        density = interfaceC39171c.getDensity();
                    }
                    fontScale = interfaceC39171c.getFontScale();
                    if (fontScale > 1.0f) {
                        fontScale = 1.0f;
                    }
                    c39172d = new C39172d(density, fontScale);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87153g6 = z13 | c28655q2.m87153g(c39172d);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i6 = zM87153g6 | z14 | c28655q2.m87157i(c18425j);
                    if ((458752 & i15) != 131072) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zM87153g = zM87157i6 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g) {
                        C3424a0 c3424a7 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a7);
                        objM87133R = c3424a7;
                    } else {
                        C3424a0 c3424a8 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                        c28655q2.m87172p0(c3424a8);
                        objM87133R = c3424a8;
                    }
                    int i38 = (i15 << 3) & 112;
                    c28655q = c28655q2;
                    modifier3 = modifier4;
                    AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i38, 4);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c22401m2 = c22401m;
                    modifier3 = modifier2;
                }
                C28655q c28655q7 = c28655q;
                c39174f5 = c39174f3;
                c39174f6 = c39174f4;
                f15 = f14;
                c28677v1M87180u = c28655q7.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
                }
            }
            i15 |= 3072;
            f14 = f13;
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(c18425j)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q2.m87153g(c22401m);
                } else {
                    zM87157i = c28655q2.m87157i(c22401m);
                }
                if (zM87157i) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i29 != 0) {
                    c39174f3 = null;
                } else {
                    c39174f3 = c39174f3;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                }
                if (i18 != 0) {
                    f14 = null;
                }
                if (i24 != 0) {
                    c22401m2 = null;
                } else {
                    c22401m2 = c22401m;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (f14 != null) {
                    density = f14.floatValue();
                } else {
                    density = interfaceC39171c.getDensity();
                }
                fontScale = interfaceC39171c.getFontScale();
                if (fontScale > 1.0f) {
                    fontScale = 1.0f;
                }
                c39172d = new C39172d(density, fontScale);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g7 = z13 | c28655q2.m87153g(c39172d);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i7 = zM87153g7 | z14 | c28655q2.m87157i(c18425j);
                if ((458752 & i15) != 131072) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                zM87153g = zM87157i7 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    C3424a0 c3424a9 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a9);
                    objM87133R = c3424a9;
                } else {
                    C3424a0 c3424a10 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a10);
                    objM87133R = c3424a10;
                }
                int i39 = (i15 << 3) & 112;
                c28655q = c28655q2;
                modifier3 = modifier4;
                AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i39, 4);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c22401m2 = c22401m;
                modifier3 = modifier2;
            }
            C28655q c28655q8 = c28655q;
            c39174f5 = c39174f3;
            c39174f6 = c39174f4;
            f15 = f14;
            c28677v1M87180u = c28655q8.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
            }
        }
        i15 |= 384;
        c39174f4 = c39174f2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                if (c28655q2.m87153g(f14)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(c18425j)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i27;
            }
            i24 = i14 & 32;
            i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i24 == 0) {
                i15 |= i25;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i = c28655q2.m87153g(c22401m);
                } else {
                    zM87157i = c28655q2.m87157i(c22401m);
                }
                if (zM87157i) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i29 != 0) {
                    c39174f3 = null;
                } else {
                    c39174f3 = c39174f3;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                }
                if (i18 != 0) {
                    f14 = null;
                }
                if (i24 != 0) {
                    c22401m2 = null;
                } else {
                    c22401m2 = c22401m;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (f14 != null) {
                    density = f14.floatValue();
                } else {
                    density = interfaceC39171c.getDensity();
                }
                fontScale = interfaceC39171c.getFontScale();
                if (fontScale > 1.0f) {
                    fontScale = 1.0f;
                }
                c39172d = new C39172d(density, fontScale);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87153g8 = z13 | c28655q2.m87153g(c39172d);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i8 = zM87153g8 | z14 | c28655q2.m87157i(c18425j);
                if ((458752 & i15) != 131072) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                zM87153g = zM87157i8 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    C3424a0 c3424a11 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a11);
                    objM87133R = c3424a11;
                } else {
                    C3424a0 c3424a12 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                    c28655q2.m87172p0(c3424a12);
                    objM87133R = c3424a12;
                }
                int i310 = (i15 << 3) & 112;
                c28655q = c28655q2;
                modifier3 = modifier4;
                AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i310, 4);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c22401m2 = c22401m;
                modifier3 = modifier2;
            }
            C28655q c28655q9 = c28655q;
            c39174f5 = c39174f3;
            c39174f6 = c39174f4;
            f15 = f14;
            c28677v1M87180u = c28655q9.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(c18425j)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i27;
        }
        i24 = i14 & 32;
        i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i24 == 0) {
            i15 |= i25;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i = c28655q2.m87153g(c22401m);
            } else {
                zM87157i = c28655q2.m87157i(c22401m);
            }
            if (zM87157i) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q2.m87157i(interfaceC4351m)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i28 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i29 != 0) {
                c39174f3 = null;
            } else {
                c39174f3 = c39174f3;
            }
            if (i16 != 0) {
                c39174f4 = null;
            }
            if (i18 != 0) {
                f14 = null;
            }
            if (i24 != 0) {
                c22401m2 = null;
            } else {
                c22401m2 = c22401m;
            }
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            if (f14 != null) {
                density = f14.floatValue();
            } else {
                density = interfaceC39171c.getDensity();
            }
            fontScale = interfaceC39171c.getFontScale();
            if (fontScale > 1.0f) {
                fontScale = 1.0f;
            }
            c39172d = new C39172d(density, fontScale);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87153g9 = z13 | c28655q2.m87153g(c39172d);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zM87157i9 = zM87153g9 | z14 | c28655q2.m87157i(c18425j);
            if ((458752 & i15) != 131072) {
                z15 = true;
            } else {
                z15 = true;
            }
            zM87153g = zM87157i9 | z15 | c28655q2.m87153g(c39172d) | ((3670016 & i15) == 1048576);
            objM87133R = c28655q2.m87133R();
            if (zM87153g) {
                C3424a0 c3424a13 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                c28655q2.m87172p0(c3424a13);
                objM87133R = c3424a13;
            } else {
                C3424a0 c3424a14 = new C3424a0(c39174f3, c39172d, c39174f4, c18425j, c22401m2, c39172d, interfaceC4351m, 7);
                c28655q2.m87172p0(c3424a14);
                objM87133R = c3424a14;
            }
            int i311 = (i15 << 3) & 112;
            c28655q = c28655q2;
            modifier3 = modifier4;
            AbstractC1137a.m3601a((Function1) objM87133R, modifier3, null, c28655q, i311, 4);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c22401m2 = c22401m;
            modifier3 = modifier2;
        }
        C28655q c28655q10 = c28655q;
        c39174f5 = c39174f3;
        c39174f6 = c39174f4;
        f15 = f14;
        c28677v1M87180u = c28655q10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(modifier3, c39174f5, c39174f6, f15, c18425j, c22401m2, interfaceC4351m, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final FrameLayout m53061n(C39174f c39174f, InterfaceC39171c interfaceC39171c, C39174f c39174f2, C18425j c18425j, C22401m c22401m, InterfaceC39171c interfaceC39171c2, InterfaceC4351m interfaceC4351m, Context it) {
        AbstractC22676k.m65750j(it, "it");
        return m53073z(it, c39174f != null ? (int) interfaceC39171c.mo743q0(c39174f.f168413w) : -2, c39174f2 != null ? (int) interfaceC39171c.mo743q0(c39174f2.f168413w) : -2, m53067t(it, c18425j, c22401m, interfaceC39171c2, interfaceC4351m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m53062o(Modifier modifier, C39174f c39174f, C39174f c39174f2, Float f13, C18425j c18425j, C22401m c22401m, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m53060m(modifier, c39174f, c39174f2, f13, c18425j, c22401m, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28620h0 m53063p(C18425j c18425j, boolean z4, final C18425j c18425j2, final C18425j c18425j3, C28624i0 DisposableEffect) {
        InterfaceC4339a interfaceC4339a;
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        if (z4) {
            final int i13 = 0;
            interfaceC4339a = new InterfaceC4339a() { // from class: id2.m
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return AbstractC18429n.m53064q(c18425j2);
                        default:
                            return AbstractC18429n.m53065r(c18425j2);
                    }
                }
            };
        } else {
            final int i14 = 1;
            interfaceC4339a = new InterfaceC4339a() { // from class: id2.m
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return AbstractC18429n.m53064q(c18425j3);
                        default:
                            return AbstractC18429n.m53065r(c18425j3);
                    }
                }
            };
        }
        c18425j.m53046e(interfaceC4339a);
        return new b(c18425j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Bitmap m53064q(C18425j c18425j) {
        return c18425j.m53044b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Bitmap m53065r(C18425j c18425j) {
        return c18425j.m53044b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m53066s(C39174f c39174f, C39174f c39174f2, C18425j c18425j, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m53059l(c39174f, c39174f2, c18425j, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final ComposeView m53067t(Context context, C18425j c18425j, C22401m c22401m, InterfaceC39171c interfaceC39171c, InterfaceC4351m interfaceC4351m) {
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new C37816b(new C0556g(c22401m, c18425j, composeView, interfaceC39171c, interfaceC4351m, 6), true, 1497067479));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53068u(C22401m c22401m, C18425j c18425j, ComposeView composeView, InterfaceC39171c interfaceC39171c, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
        AbstractC28683x.m87248b(new C28673u1[]{AbstractC22404p.m64496e().mo86977a(Boolean.TRUE), AbstractC22402n.m64486c().mo86977a(c22401m)}, AbstractC37817c.m121344e(-1937734889, c28655q, new C13857f(26, interfaceC39171c, interfaceC4351m)), c28655q, 56);
        boolean zM87157i = c28655q.m87157i(c22401m);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new c(c22401m, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        boolean zM87157i2 = c28655q.m87157i(c18425j) | c28655q.m87157i(composeView) | c28655q.m87157i(view);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C13412g(c18425j, composeView, view, 29);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c18425j, (Function1) objM87133R2, c28655q);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m53069v(InterfaceC39171c interfaceC39171c, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (interfaceC39171c != null) {
            c28655q.m87150e0(1595394490);
            AbstractC28683x.m87247a(AbstractC2453v1.f9569h.mo86977a(interfaceC39171c), AbstractC37817c.m121344e(-272023972, c28655q, new C18427l(interfaceC4351m, 0)), c28655q, 56);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1595541058);
            interfaceC4351m.invoke(c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m53070w(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC28620h0 m53071x(C18425j c18425j, ComposeView composeView, View view, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        c18425j.m53046e(new C17841d(9, composeView, view));
        return new e(c18425j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Bitmap m53072y(ComposeView composeView, View view) {
        if (!composeView.isLaidOut()) {
            return null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: z */
    private static final FrameLayout m53073z(Context context, int i13, int i14, ComposeView composeView) {
        FrameLayout frameLayout = new FrameLayout(context);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
        frameLayout.addView(composeView);
        return frameLayout;
    }
}
