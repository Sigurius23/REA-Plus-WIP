package f23;

import android.content.Context;
import android.view.ViewConfiguration;
import m23.C24968b;

/* JADX INFO: renamed from: f23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14036b {

    /* JADX INFO: renamed from: a */
    public final C24968b f50091a;

    /* JADX INFO: renamed from: b */
    public final int f50092b;

    /* JADX INFO: renamed from: c */
    public float f50093c;

    /* JADX INFO: renamed from: d */
    public float f50094d;

    /* JADX INFO: renamed from: e */
    public boolean f50095e;

    public C14036b(Context context, C24968b c24968b) {
        this.f50091a = c24968b;
        this.f50092b = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
