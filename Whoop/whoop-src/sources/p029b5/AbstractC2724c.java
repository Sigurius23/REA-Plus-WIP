package p029b5;

import android.app.Activity;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2724c {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m7689a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC22676k.m65749i(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    /* JADX INFO: renamed from: b */
    public static Object m7690b(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public static Serializable m7691c(Bundle bundle) {
        return bundle.getSerializable("LinkFailure", Exception.class);
    }

    /* JADX INFO: renamed from: d */
    public static void m7692d(Object dispatcher, Object callback) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    /* JADX INFO: renamed from: e */
    public static void m7693e(Object dispatcher, Object callback) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
