package ar;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import cc.C4399f;
import p283kl.C22553b;

/* JADX INFO: renamed from: ar.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C1913a extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7565a;

    /* JADX INFO: renamed from: b */
    public final Object f7566b;

    public /* synthetic */ C1913a(Object obj, int i13) {
        this.f7565a = i13;
        this.f7566b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f7565a) {
            case 1:
                return ((Drawable.ConstantState) this.f7566b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f7565a) {
            case 0:
                return 0;
            case 1:
                return ((Drawable.ConstantState) this.f7566b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f7565a) {
            case 0:
                return (C1914b) this.f7566b;
            case 1:
                C4399f c4399f = new C4399f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f7566b).newDrawable();
                c4399f.f17755w = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4399f.f17751F);
                return c4399f;
            default:
                return new C22553b(this);
        }
    }

    public C1913a(C1914b c1914b) {
        this.f7565a = 0;
        this.f7566b = c1914b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f7565a) {
            case 1:
                C4399f c4399f = new C4399f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f7566b).newDrawable(resources);
                c4399f.f17755w = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4399f.f17751F);
                return c4399f;
            case 2:
                return new C22553b(this);
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f7565a) {
            case 1:
                C4399f c4399f = new C4399f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f7566b).newDrawable(resources, theme);
                c4399f.f17755w = drawableNewDrawable;
                drawableNewDrawable.setCallback(c4399f.f17751F);
                return c4399f;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
