package p513u4;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C34521i {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f145112a;

    /* JADX INFO: renamed from: b */
    public final Configuration f145113b;

    /* JADX INFO: renamed from: c */
    public final int f145114c;

    public C34521i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f145112a = colorStateList;
        this.f145113b = configuration;
        this.f145114c = theme == null ? 0 : theme.hashCode();
    }
}
