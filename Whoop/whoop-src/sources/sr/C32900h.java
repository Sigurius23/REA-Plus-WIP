package sr;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import ng3.C26701n;
import ng3.C26702o;
import p073cq.C11040i;
import p463rj.AbstractC31484o;
import p623xr.C38606b;
import p623xr.C38619o;
import p623xr.C38624t;

/* JADX INFO: renamed from: sr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C32900h {

    /* JADX INFO: renamed from: a */
    public final C38624t f137114a;

    /* JADX INFO: renamed from: b */
    public final String f137115b;

    /* JADX INFO: renamed from: c */
    public final C11040i f137116c;

    /* JADX INFO: renamed from: d */
    public final C26701n f137117d;

    /* JADX INFO: renamed from: e */
    public final C38606b f137118e;

    public C32900h(Context context, C38624t c38624t, C26701n c26701n) {
        C11040i c11040i = new C11040i();
        this.f137116c = c11040i;
        this.f137115b = context.getPackageName();
        this.f137114a = c38624t;
        this.f137117d = c26701n;
        C38606b c38606b = new C38606b(context, c38624t, AbstractC32901i.f137119a, new C26702o(27, false));
        this.f137118e = c38606b;
        c38606b.m123803a().post(new C32895c(this, c11040i, context));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m103295a(C32900h c32900h, C32907o c32907o, long j7, long j13) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c32900h.f137115b);
        bundle.putLong("cloud.prj", j7);
        bundle.putString("nonce", c32907o.f137127a);
        bundle.putLong("warm.up.sid", j13);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(c32907o.f137128b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38619o(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC31484o.m96955g(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m103296b(C32900h c32900h, long j7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c32900h.f137115b);
        bundle.putLong("cloud.prj", j7);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38619o(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC31484o.m96955g(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m103297c(C32900h c32900h) {
        return c32900h.f137116c.f34644a.isSuccessful() && ((Integer) c32900h.f137116c.f34644a.getResult()).intValue() < 83420000;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m103298d(C32900h c32900h) {
        return c32900h.f137116c.f34644a.isSuccessful() && ((Integer) c32900h.f137116c.f34644a.getResult()).intValue() == 0;
    }
}
