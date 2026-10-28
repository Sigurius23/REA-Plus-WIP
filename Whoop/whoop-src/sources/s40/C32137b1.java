package s40;

import android.R;
import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: s40.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32137b1 {

    /* JADX INFO: renamed from: a */
    public final Context f133165a;

    /* JADX INFO: renamed from: b */
    public final int f133166b = m100081a(R.attr.colorAccent).data;

    /* JADX INFO: renamed from: c */
    public final int f133167c = m100081a(R.attr.colorControlNormal).data;

    /* JADX INFO: renamed from: d */
    public final int f133168d = m100081a(R.attr.textColorPrimary).data;

    /* JADX INFO: renamed from: e */
    public final int f133169e = m100081a(R.attr.textColorSecondary).data;

    /* JADX INFO: renamed from: f */
    public final int f133170f = m100081a(R.attr.colorPrimary).data;

    public C32137b1(Context context) {
        this.f133165a = context;
    }

    /* JADX INFO: renamed from: a */
    public final TypedValue m100081a(int i13) {
        TypedValue typedValue = new TypedValue();
        this.f133165a.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue;
    }
}
