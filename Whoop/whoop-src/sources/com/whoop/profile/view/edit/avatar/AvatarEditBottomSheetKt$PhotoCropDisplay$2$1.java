package com.whoop.profile.view.edit.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bc3.InterfaceC2994c0;
import bh.C3247j;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mh.AbstractC25543k;
import mh.C25540h;
import mh.C25542j;
import p341nh.C26714h;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetKt$PhotoCropDisplay$2$1", m100430f = "AvatarEditBottomSheet.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class AvatarEditBottomSheetKt$PhotoCropDisplay$2$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Context $context;
    final /* synthetic */ InterfaceC28601c1 $imageSize$delegate;
    final /* synthetic */ Uri $imageUri;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarEditBottomSheetKt$PhotoCropDisplay$2$1(Context context, Uri uri, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super AvatarEditBottomSheetKt$PhotoCropDisplay$2$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$context = context;
        this.$imageUri = uri;
        this.$imageSize$delegate = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new AvatarEditBottomSheetKt$PhotoCropDisplay$2$1(this.$context, this.$imageUri, this.$imageSize$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((AvatarEditBottomSheetKt$PhotoCropDisplay$2$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C3247j c3247jM65738x = AbstractC22674j.m65738x(this.$context);
                C25540h c25540h = new C25540h(this.$context);
                c25540h.f100079c = this.$imageUri;
                c25540h.m75121e(C26714h.f106216c);
                C25542j c25542jM75117a = c25540h.m75117a();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = c3247jM65738x.m9386b(c25542jM75117a, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Drawable drawableMo75114a = ((AbstractC25543k) obj).mo75114a();
            if (drawableMo75114a != null) {
                this.$imageSize$delegate.setValue(new C39180l((((long) drawableMo75114a.getIntrinsicWidth()) << 32) | (((long) drawableMo75114a.getIntrinsicHeight()) & 4294967295L)));
            }
        } catch (Exception unused) {
            this.$imageSize$delegate.setValue(null);
        }
        return C23454a0.f92919a;
    }
}
