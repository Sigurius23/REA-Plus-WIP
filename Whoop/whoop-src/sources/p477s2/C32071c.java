package p477s2;

import android.view.KeyEvent;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s2.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C32071c {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f133019a;

    public /* synthetic */ C32071c(KeyEvent keyEvent) {
        this.f133019a = keyEvent;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C32071c m99690a(KeyEvent keyEvent) {
        return new C32071c(keyEvent);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KeyEvent m99691b() {
        return this.f133019a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32071c) {
            return AbstractC22676k.m65745e(this.f133019a, ((C32071c) obj).f133019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f133019a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f133019a + ')';
    }
}
