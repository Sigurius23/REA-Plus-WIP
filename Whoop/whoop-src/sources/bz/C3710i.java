package bz;

import android.content.Context;
import p442qy.C30765d;
import p442qy.C30766e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3710i {

    /* JADX INFO: renamed from: a */
    public final C30765d f15163a;

    public C3710i(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f15163a = (context.getApplicationInfo().flags & 2) != 0 ? C30766e.f126696a : C30766e.f126697b;
    }

    /* JADX INFO: renamed from: a */
    public final void m11528a(String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f15163a.m94514d(message);
    }
}
