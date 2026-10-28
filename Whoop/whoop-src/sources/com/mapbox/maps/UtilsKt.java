package com.mapbox.maps;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import bc3.C3033m;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import ge3.AbstractC15751g;
import java.lang.ref.WeakReference;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\r\u001a\u00028\u0002\"\u0006\b\u0000\u0010\u0007\u0018\u0001\"\u0006\b\u0001\u0010\b\u0018\u0001\"\u0016\b\u0002\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m65681d2 = {"T", "R", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "method", NotificationCompat.CATEGORY_CALL, "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "E", "V", "Lcom/mapbox/bindgen/Expected;", "Lq83/d;", "Lcom/mapbox/common/Cancelable;", "block", "suspendMapboxCancellableCoroutine", "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "", "Landroid/content/Context;", "context", "toDP", "(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class UtilsKt {
    public static final <T, R> R call(WeakReference<T> weakReference, Function1 method) {
        AbstractC22676k.m65750j(weakReference, "<this>");
        AbstractC22676k.m65750j(method, "method");
        T t14 = weakReference.get();
        if (t14 != null) {
            return (R) method.invoke(t14);
        }
        throw new IllegalStateException();
    }

    public static final <E, V, T extends Expected<E, V>> Object suspendMapboxCancellableCoroutine(Function1 function1, InterfaceC30057d<? super T> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1((Cancelable) function1.invoke(c3033m)));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static final <T extends Number> T toDP(T t14, Context context) {
        AbstractC22676k.m65750j(t14, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return Float.valueOf(TypedValue.applyDimension(1, t14.floatValue(), context.getResources().getDisplayMetrics()));
    }
}
