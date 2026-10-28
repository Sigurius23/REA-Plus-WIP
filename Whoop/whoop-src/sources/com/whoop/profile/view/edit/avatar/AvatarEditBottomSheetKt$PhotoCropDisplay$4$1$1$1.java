package com.whoop.profile.view.edit.avatar;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import e93.AbstractC12889b;
import l83.C23454a0;
import p180h0.AbstractC16444q3;
import p180h0.C16464u3;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ InterfaceC28601c1 $offset$delegate;
    final /* synthetic */ InterfaceC28690z0 $scale$delegate;

    public AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1(InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1) {
        this.$scale$delegate = interfaceC28690z0;
        this.$offset$delegate = interfaceC28601c1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 invoke$lambda$0(InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1, C16617b c16617b, C16617b c16617b2, float f13, float f14) {
        AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$3(interfaceC28690z0, AbstractC12889b.m36283m(AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$2(interfaceC28690z0) * f13, 0.5f, 3.0f));
        float fM36283m = AbstractC12889b.m36283m(Float.intBitsToFloat((int) (c16617b2.f63937a >> 32)) + Float.intBitsToFloat((int) (AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$5(interfaceC28601c1) >> 32)), -200.0f, 200.0f);
        float fM36283m2 = AbstractC12889b.m36283m(Float.intBitsToFloat((int) (c16617b2.f63937a & 4294967295L)) + Float.intBitsToFloat((int) (AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$5(interfaceC28601c1) & 4294967295L)), -200.0f, 200.0f);
        AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$6(interfaceC28601c1, (((long) Float.floatToRawIntBits(fM36283m)) << 32) | (((long) Float.floatToRawIntBits(fM36283m2)) & 4294967295L));
        return C23454a0.f92919a;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C16464u3(new C9770c(this.$scale$delegate, this.$offset$delegate), null), interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM46625g != enumC31071a) {
            objM46625g = c23454a0;
        }
        return objM46625g == enumC31071a ? objM46625g : c23454a0;
    }
}
