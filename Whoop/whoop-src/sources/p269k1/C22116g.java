package p269k1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p208i2.C17919x;

/* JADX INFO: renamed from: k1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C22116g extends RippleDrawable {

    /* JADX INFO: renamed from: w */
    public final boolean f85808w;

    /* JADX INFO: renamed from: x */
    public C17919x f85809x;

    /* JADX INFO: renamed from: y */
    public Integer f85810y;

    /* JADX INFO: renamed from: z */
    public boolean f85811z;

    public C22116g(boolean z4) {
        super(ColorStateList.valueOf(-16777216), null, z4 ? new ColorDrawable(-1) : null);
        this.f85808w = z4;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f85808w) {
            this.f85811z = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f85811z = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f85811z;
    }
}
