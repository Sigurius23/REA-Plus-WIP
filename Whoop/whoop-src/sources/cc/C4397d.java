package cc;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p002a0.C0022g;

/* JADX INFO: renamed from: cc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4397d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C4409p f17746a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f17747b;

    /* JADX INFO: renamed from: c */
    public ArrayList f17748c;

    /* JADX INFO: renamed from: d */
    public C0022g f17749d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
