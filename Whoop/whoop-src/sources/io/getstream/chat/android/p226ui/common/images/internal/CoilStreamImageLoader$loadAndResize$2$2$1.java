package io.getstream.chat.android.p226ui.common.images.internal;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import gi.C15877h;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p552vh.AbstractC36039g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2$2$1", m100430f = "CoilStreamImageLoader.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CoilStreamImageLoader$loadAndResize$2$2$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Drawable $drawable;
    final /* synthetic */ ImageView $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoilStreamImageLoader$loadAndResize$2$2$1(Drawable drawable, ImageView imageView, InterfaceC30057d<? super CoilStreamImageLoader$loadAndResize$2$2$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$drawable = drawable;
        this.$target = imageView;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new CoilStreamImageLoader$loadAndResize$2$2$1(this.$drawable, this.$target, interfaceC30057d);
    }

    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        CoilStreamImageLoader$loadAndResize$2$2$1 coilStreamImageLoader$loadAndResize$2$2$1 = (CoilStreamImageLoader$loadAndResize$2$2$1) create(interfaceC2994c0, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        coilStreamImageLoader$loadAndResize$2$2$1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        Drawable drawable = this.$drawable;
        if ((drawable instanceof C15877h) && (((C15877h) drawable).f59988w instanceof AnimatedImageDrawable)) {
            Drawable drawable2 = ((C15877h) drawable).f59988w;
            AbstractC22676k.m65748h(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
            ((AnimatedImageDrawable) drawable2).start();
        } else if (drawable instanceof AbstractC36039g) {
            ((AbstractC36039g) drawable).start();
        }
        this.$target.setImageDrawable(this.$drawable);
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }
}
