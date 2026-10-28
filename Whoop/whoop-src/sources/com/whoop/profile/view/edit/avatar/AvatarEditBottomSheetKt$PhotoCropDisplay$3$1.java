package com.whoop.profile.view.edit.avatar;

import android.graphics.Rect;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetKt$PhotoCropDisplay$3$1", m100430f = "AvatarEditBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class AvatarEditBottomSheetKt$PhotoCropDisplay$3$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC28601c1 $imageSize$delegate;
    final /* synthetic */ InterfaceC28601c1 $offset$delegate;
    final /* synthetic */ Function1 $onCropBoundsChanged;
    final /* synthetic */ InterfaceC28690z0 $scale$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarEditBottomSheetKt$PhotoCropDisplay$3$1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super AvatarEditBottomSheetKt$PhotoCropDisplay$3$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$onCropBoundsChanged = function1;
        this.$imageSize$delegate = interfaceC28601c1;
        this.$scale$delegate = interfaceC28690z0;
        this.$offset$delegate = interfaceC28601c2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new AvatarEditBottomSheetKt$PhotoCropDisplay$3$1(this.$onCropBoundsChanged, this.$imageSize$delegate, this.$scale$delegate, this.$offset$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((AvatarEditBottomSheetKt$PhotoCropDisplay$3$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C39180l c39180lPhotoCropDisplay$lambda$8 = AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$8(this.$imageSize$delegate);
        if (c39180lPhotoCropDisplay$lambda$8 != null) {
            Function1 function1 = this.$onCropBoundsChanged;
            InterfaceC28690z0 interfaceC28690z0 = this.$scale$delegate;
            InterfaceC28601c1 interfaceC28601c1 = this.$offset$delegate;
            long j7 = c39180lPhotoCropDisplay$lambda$8.f168422a;
            int i13 = (int) (j7 >> 32);
            float f13 = i13;
            float fPhotoCropDisplay$lambda$2 = f13 / AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$2(interfaceC28690z0);
            int i14 = (int) (j7 & 4294967295L);
            float f14 = i14;
            float fPhotoCropDisplay$lambda$3 = f14 / AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$2(interfaceC28690z0);
            float fIntBitsToFloat = (f13 / 2.0f) - ((Float.intBitsToFloat((int) (AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$5(interfaceC28601c1) >> 32)) * (f13 / 252.0f)) / AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$2(interfaceC28690z0));
            float fIntBitsToFloat2 = (f14 / 2.0f) - ((Float.intBitsToFloat((int) (AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$5(interfaceC28601c1) & 4294967295L)) * (f14 / 252.0f)) / AvatarEditBottomSheetKt.PhotoCropDisplay$lambda$2(interfaceC28690z0));
            float fMin = Math.min(fPhotoCropDisplay$lambda$2, fPhotoCropDisplay$lambda$3) / 2.0f;
            int iM36284n = AbstractC12889b.m36284n((int) (fIntBitsToFloat - fMin), 0, i13);
            int iM36284n2 = AbstractC12889b.m36284n((int) (fIntBitsToFloat2 - fMin), 0, i14);
            int iM36284n3 = AbstractC12889b.m36284n((int) (fIntBitsToFloat + fMin), 0, i13);
            int iM36284n4 = AbstractC12889b.m36284n((int) (fIntBitsToFloat2 + fMin), 0, i14);
            if (iM36284n3 <= iM36284n || iM36284n4 <= iM36284n2) {
                function1.invoke(null);
            } else {
                function1.invoke(new Rect(iM36284n, iM36284n2, iM36284n3, iM36284n4));
            }
        } else {
            this.$onCropBoundsChanged.invoke(null);
        }
        return C23454a0.f92919a;
    }
}
