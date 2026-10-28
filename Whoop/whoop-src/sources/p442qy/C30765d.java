package p442qy;

import android.util.Log;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qy.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C30765d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126695a;

    /* JADX INFO: renamed from: a */
    public final void m94511a(String msg) {
        switch (this.f126695a) {
            case 0:
                AbstractC22676k.m65750j(msg, "msg");
                break;
            default:
                AbstractC22676k.m65750j(msg, "msg");
                Log.d("StripeSdk", msg);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m94512b(String msg, Throwable th3) {
        switch (this.f126695a) {
            case 0:
                AbstractC22676k.m65750j(msg, "msg");
                break;
            default:
                AbstractC22676k.m65750j(msg, "msg");
                Log.e("StripeSdk", msg, th3);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94513c(String msg) {
        switch (this.f126695a) {
            case 0:
                AbstractC22676k.m65750j(msg, "msg");
                break;
            default:
                AbstractC22676k.m65750j(msg, "msg");
                Log.i("StripeSdk", msg);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m94514d(String msg) {
        switch (this.f126695a) {
            case 0:
                AbstractC22676k.m65750j(msg, "msg");
                break;
            default:
                AbstractC22676k.m65750j(msg, "msg");
                Log.w("StripeSdk", msg);
                break;
        }
    }
}
