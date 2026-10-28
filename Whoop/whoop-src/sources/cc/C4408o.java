package cc;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: cc.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C4408o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f17809a;

    public C4408o(Drawable.ConstantState constantState) {
        this.f17809a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f17809a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f17809a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C4409p c4409p = new C4409p();
        c4409p.f17755w = (VectorDrawable) this.f17809a.newDrawable();
        return c4409p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C4409p c4409p = new C4409p();
        c4409p.f17755w = (VectorDrawable) this.f17809a.newDrawable(resources);
        return c4409p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C4409p c4409p = new C4409p();
        c4409p.f17755w = (VectorDrawable) this.f17809a.newDrawable(resources, theme);
        return c4409p;
    }
}
