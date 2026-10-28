package p553vj;

import android.content.Context;
import android.graphics.Rect;
import e93.AbstractC12889b;

/* JADX INFO: renamed from: vj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36065b {

    /* JADX INFO: renamed from: a */
    public final Context f154017a;

    public C36065b(Context context) {
        this.f154017a = context;
    }

    /* JADX INFO: renamed from: a */
    public final int m114534a(int i13) {
        return AbstractC12889b.m36258X(i13 / this.f154017a.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public final Rect m114535b(Rect rect) {
        return new Rect(m114534a(rect.left), m114534a(rect.top), m114534a(rect.right), m114534a(rect.bottom));
    }
}
