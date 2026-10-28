package ai;

import android.app.ActivityManager;
import android.content.Context;
import c93.InterfaceC4339a;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ai.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0895a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ double f3280w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f3281x;

    public /* synthetic */ C0895a(Context context, double d3) {
        this.f3280w = d3;
        this.f3281x = context;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int largeMemoryClass;
        Context context = this.f3281x;
        try {
            Object systemService = AbstractC32122c.getSystemService(context, ActivityManager.class);
            AbstractC22676k.m65747g(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return Long.valueOf((long) (this.f3280w * ((long) largeMemoryClass) * 1048576));
    }
}
