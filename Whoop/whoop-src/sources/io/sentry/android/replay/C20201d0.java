package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20201d0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75877w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f75878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20201d0(View view, int i13) {
        super(1);
        this.f75877w = i13;
        this.f75878x = view;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75877w) {
            case 0:
                WeakReference it = (WeakReference) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(AbstractC22676k.m65745e(it.get(), this.f75878x));
            default:
                WeakReference it3 = (WeakReference) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(AbstractC22676k.m65745e(it3.get(), this.f75878x));
        }
    }
}
