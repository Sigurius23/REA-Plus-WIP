package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5", m100430f = "EditProfileBottomSheet.kt", m100431l = {204}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC28601c1 $countryStateState$delegate;
    final /* synthetic */ InterfaceC28601c1 $currentBottomSheet$delegate;
    final /* synthetic */ C15199y3 $modalBottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$modalBottomSheetState = c15199y3;
        this.$currentBottomSheet$delegate = interfaceC28601c1;
        this.$countryStateState$delegate = interfaceC28601c2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5(this.$modalBottomSheetState, this.$currentBottomSheet$delegate, this.$countryStateState$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EditProfileBottomSheetKt$EditProfileBottomSheet$2$1$2$1$5) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C15199y3 c15199y3 = this.$modalBottomSheetState;
            this.label = 1;
            if (c15199y3.m43223d(this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.$currentBottomSheet$delegate.setValue(null);
        this.$countryStateState$delegate.setValue(new CountryStateSheetState(null, null, null, 7, null));
        return C23454a0.f92919a;
    }
}
