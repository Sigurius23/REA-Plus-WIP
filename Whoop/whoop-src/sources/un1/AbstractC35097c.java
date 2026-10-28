package un1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import h01.AbstractC16539f;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: un1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "quantity", "", "isVisible", "", "rotation", "isUpdating", "shouldAnimateTransition", "playShimmer", "highlightCounter", "Lun1/h;", "transitionState", "Lkotlin/Function0;", "Ll83/a0;", "onShimmerFinished", "Lc0/c1;", "enter", "onClick", "c", "(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35097c {
    /* JADX INFO: renamed from: c */
    public static final void m111000c(Modifier modifier, final int i13, final boolean z4, final float f13, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final EnumC35102h transitionState, final InterfaceC4339a onShimmerFinished, AbstractC3730c1 abstractC3730c1, final InterfaceC4339a onClick, Composer composer, final int i14, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        float f14;
        boolean z17;
        int i18;
        C28655q c28655q;
        final AbstractC3730c1 abstractC3730c2;
        final Modifier modifier3;
        AbstractC3730c1 abstractC3730c3;
        Modifier modifier4;
        AbstractC22676k.m65750j(transitionState, "transitionState");
        AbstractC22676k.m65750j(onShimmerFinished, "onShimmerFinished");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1630770768);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            f14 = f13;
            i17 |= c28655q2.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            f14 = f13;
        }
        if ((i14 & 24576) == 0) {
            z17 = z13;
            i17 |= c28655q2.m87155h(z17) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            z17 = z13;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i17 |= c28655q2.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= c28655q2.m87155h(z15) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= c28655q2.m87155h(z16) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= c28655q2.m87149e(transitionState.ordinal()) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i14) == 0) {
            i17 |= c28655q2.m87157i(onShimmerFinished) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 && c28655q2.m87153g(abstractC3730c1)) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87157i(onClick) ? 32 : 16;
        }
        boolean z18 = false;
        if (c28655q2.m87135U(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            c28655q2.m87140Z();
            if ((i14 & 1) == 0 || c28655q2.m87118C()) {
                Modifier modifier5 = i19 != 0 ? C2314t.f9131w : modifier2;
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i18 &= -15;
                    modifier4 = modifier5;
                    abstractC3730c3 = AbstractC3730c1.f15251a;
                } else {
                    abstractC3730c3 = abstractC3730c1;
                    modifier4 = modifier5;
                }
            } else {
                c28655q2.m87138X();
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i18 &= -15;
                }
                abstractC3730c3 = abstractC3730c1;
                modifier4 = modifier2;
            }
            c28655q2.m87175r();
            if (z4 && (z14 || i13 > 0)) {
                z18 = true;
            }
            final float f15 = f14;
            final boolean z19 = z17;
            Modifier modifier6 = modifier4;
            c28655q = c28655q2;
            AbstractC1090b.m3351f(z18, modifier6, abstractC3730c3, z14 ? AbstractC3788w0.m11578f(AbstractC11348f.m30574v(1, 500, null, 4), 2) : AbstractC3736e1.f15289a, null, AbstractC37817c.m121344e(-2056895880, c28655q2, new Function3() { // from class: un1.a
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC35097c.m111001d(transitionState, i13, f15, z16, z19, z15, onShimmerFinished, onClick, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, ((i18 << 6) & 896) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 16);
            modifier3 = modifier6;
            abstractC3730c2 = abstractC3730c3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            abstractC3730c2 = abstractC3730c1;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: un1.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35097c.m111002e(modifier3, i13, z4, f13, z13, z14, z15, z16, transitionState, onShimmerFinished, abstractC3730c2, onClick, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m111001d(EnumC35102h enumC35102h, int i13, float f13, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i14) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC16539f.m46726e(null, i13, f13, 500, z4, z13, z14, enumC35102h == EnumC35102h.REPLAY, interfaceC4339a, interfaceC4339a2, composer, 3072, 1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m111002e(Modifier modifier, int i13, boolean z4, float f13, boolean z13, boolean z14, boolean z15, boolean z16, EnumC35102h enumC35102h, InterfaceC4339a interfaceC4339a, AbstractC3730c1 abstractC3730c1, InterfaceC4339a interfaceC4339a2, int i14, int i15, int i16, Composer composer, int i17) {
        m111000c(modifier, i13, z4, f13, z13, z14, z15, z16, enumC35102h, interfaceC4339a, abstractC3730c1, interfaceC4339a2, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }
}
