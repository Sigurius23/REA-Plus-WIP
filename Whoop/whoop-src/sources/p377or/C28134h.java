package p377or;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: or.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C28134h {

    /* JADX INFO: renamed from: a */
    public Drawable f113776a;

    /* JADX INFO: renamed from: b */
    public CharSequence f113777b;

    /* JADX INFO: renamed from: c */
    public CharSequence f113778c;

    /* JADX INFO: renamed from: d */
    public int f113779d;

    /* JADX INFO: renamed from: e */
    public View f113780e;

    /* JADX INFO: renamed from: f */
    public TabLayout f113781f;

    /* JADX INFO: renamed from: g */
    public C28137k f113782g;

    /* JADX INFO: renamed from: a */
    public final void m85123a(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f113778c) && !TextUtils.isEmpty(charSequence)) {
            this.f113782g.setContentDescription(charSequence);
        }
        this.f113777b = charSequence;
        C28137k c28137k = this.f113782g;
        if (c28137k != null) {
            c28137k.m85128e();
        }
    }
}
