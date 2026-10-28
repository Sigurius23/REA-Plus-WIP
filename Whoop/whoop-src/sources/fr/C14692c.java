package fr;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import cc.C4395b;
import p504tq.C34080b;

/* JADX INFO: renamed from: fr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14692c {

    /* JADX INFO: renamed from: a */
    public C4395b f54298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f54299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f54300c;

    public /* synthetic */ C14692c(View view, int i13) {
        this.f54299b = i13;
        this.f54300c = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m42126a(Drawable drawable) {
        switch (this.f54299b) {
            case 0:
                AbstractC14693d abstractC14693d = (AbstractC14693d) this.f54300c;
                abstractC14693d.setIndeterminate(false);
                abstractC14693d.mo15774b(abstractC14693d.f54309x);
                break;
            case 1:
                AbstractC14693d abstractC14693d2 = (AbstractC14693d) this.f54300c;
                if (!abstractC14693d2.f54302F) {
                    abstractC14693d2.setVisibility(abstractC14693d2.f54303G);
                }
                break;
            default:
                ColorStateList colorStateList = ((C34080b) this.f54300c).f142931O;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42127b(Drawable drawable) {
        switch (this.f54299b) {
            case 2:
                C34080b c34080b = (C34080b) this.f54300c;
                ColorStateList colorStateList = c34080b.f142931O;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(c34080b.f142935S, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m42128c(Drawable drawable) {
    }
}
