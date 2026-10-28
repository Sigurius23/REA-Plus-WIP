package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import cc.C4409p;
import com.google.crypto.tink.internal.C5099k0;
import com.whoop.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p002a0.C0024g1;
import p002a0.C0062y;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: s.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C31943c2 {

    /* JADX INFO: renamed from: g */
    public static C31943c2 f132646g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f132648a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f132649b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f132650c;

    /* JADX INFO: renamed from: d */
    public boolean f132651d;

    /* JADX INFO: renamed from: e */
    public C5099k0 f132652e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f132645f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final C31939b2 f132647h = new C31939b2(6);

    /* JADX INFO: renamed from: b */
    public static synchronized C31943c2 m99422b() {
        try {
            if (f132646g == null) {
                f132646g = new C31943c2();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f132646g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m99423e(int i13, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C31939b2 c31939b2 = f132647h;
        c31939b2.getClass();
        int i14 = (31 + i13) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c31939b2.m2c(Integer.valueOf(mode.hashCode() + i14));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i13, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m99424a(Context context, int i13) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f132650c == null) {
            this.f132650c = new TypedValue();
        }
        TypedValue typedValue = this.f132650c;
        context.getResources().getValue(i13, typedValue, true);
        long j7 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0062y c0062y = (C0062y) this.f132649b.get(context);
            drawableNewDrawable = null;
            if (c0062y != null && (weakReference = (WeakReference) c0062y.m151c(j7)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c0062y.m156h(j7);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM15977B = null;
        if (this.f132652e != null) {
            if (i13 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM15977B = new LayerDrawable(new Drawable[]{m99425c(context, R.drawable.abc_cab_background_internal_bg), m99425c(context, 2131231188)});
            } else if (i13 == R.drawable.abc_ratingbar_material) {
                layerDrawableM15977B = C5099k0.m15977B(this, context, R.dimen.abc_star_big);
            } else if (i13 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM15977B = C5099k0.m15977B(this, context, R.dimen.abc_star_medium);
            } else if (i13 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM15977B = C5099k0.m15977B(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM15977B == null) {
            return layerDrawableM15977B;
        }
        layerDrawableM15977B.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM15977B.getConstantState();
                if (constantState2 != null) {
                    C0062y c0062y2 = (C0062y) this.f132649b.get(context);
                    if (c0062y2 == null) {
                        c0062y2 = new C0062y((Object) null);
                        this.f132649b.put(context, c0062y2);
                    }
                    c0062y2.m155g(j7, new WeakReference(constantState2));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return layerDrawableM15977B;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m99425c(Context context, int i13) {
        return m99426d(context, i13, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m99426d(Context context, int i13, boolean z4) {
        Drawable drawableM99424a;
        try {
            if (!this.f132651d) {
                this.f132651d = true;
                Drawable drawableM99425c = m99425c(context, R.drawable.abc_vector_test);
                if (drawableM99425c == null || (!(drawableM99425c instanceof C4409p) && !"android.graphics.drawable.VectorDrawable".equals(drawableM99425c.getClass().getName()))) {
                    this.f132651d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM99424a = m99424a(context, i13);
            if (drawableM99424a == null) {
                drawableM99424a = AbstractC32122c.getDrawable(context, i13);
            }
            if (drawableM99424a != null) {
                drawableM99424a = m99428g(context, i13, z4, drawableM99424a);
            }
            if (drawableM99424a != null) {
                AbstractC31950e1.m99443a(drawableM99424a);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return drawableM99424a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m99427f(Context context, int i13) {
        ColorStateList colorStateListM15985C;
        C0024g1 c0024g1;
        WeakHashMap weakHashMap = this.f132648a;
        colorStateListM15985C = (weakHashMap == null || (c0024g1 = (C0024g1) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0024g1.m55d(i13);
        if (colorStateListM15985C == null) {
            C5099k0 c5099k0 = this.f132652e;
            colorStateListM15985C = c5099k0 == null ? null : c5099k0.m15985C(context, i13);
            if (colorStateListM15985C != null) {
                if (this.f132648a == null) {
                    this.f132648a = new WeakHashMap();
                }
                C0024g1 c0024g2 = (C0024g1) this.f132648a.get(context);
                if (c0024g2 == null) {
                    c0024g2 = new C0024g1((Object) null);
                    this.f132648a.put(context, c0024g2);
                }
                c0024g2.m52a(i13, colorStateListM15985C);
            }
        }
        return colorStateListM15985C;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX INFO: renamed from: g */
    public final Drawable m99428g(Context context, int i13, boolean z4, Drawable drawable) {
        int i14;
        boolean z13;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM99427f = m99427f(context, i13);
        PorterDuff.Mode mode = null;
        if (colorStateListM99427f != null) {
            Drawable drawableMutate2 = drawable.mutate();
            AbstractC32121b.m99992E(drawableMutate2, colorStateListM99427f);
            if (this.f132652e != null && i13 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC32121b.m99993F(drawableMutate2, mode);
            }
            return drawableMutate2;
        }
        if (this.f132652e != null) {
            if (i13 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM99461c = AbstractC31967i2.m99461c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C31992p.f132796b;
                C5099k0.m15978R(drawableFindDrawableByLayerId, iM99461c, mode2);
                C5099k0.m15978R(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC31967i2.m99461c(context, R.attr.colorControlNormal), mode2);
                C5099k0.m15978R(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC31967i2.m99461c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i13 == R.drawable.abc_ratingbar_material || i13 == R.drawable.abc_ratingbar_indicator_material || i13 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM99460b = AbstractC31967i2.m99460b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C31992p.f132796b;
                C5099k0.m15978R(drawableFindDrawableByLayerId2, iM99460b, mode3);
                C5099k0.m15978R(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC31967i2.m99461c(context, R.attr.colorControlActivated), mode3);
                C5099k0.m15978R(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC31967i2.m99461c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C5099k0 c5099k0 = this.f132652e;
        boolean z14 = false;
        if (c5099k0 != null) {
            PorterDuff.Mode mode4 = C31992p.f132796b;
            if (C5099k0.m15979b((int[]) c5099k0.f21439x, i13)) {
                i14 = R.attr.colorControlNormal;
            } else if (C5099k0.m15979b((int[]) c5099k0.f21441z, i13)) {
                i14 = R.attr.colorControlActivated;
            } else {
                if (C5099k0.m15979b((int[]) c5099k0.f21436E, i13)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i13 == 2131231208) {
                        iRound = Math.round(40.8f);
                        i14 = 16842800;
                        z13 = true;
                    } else {
                        if (i13 != R.drawable.abc_dialog_material_background) {
                            i14 = 0;
                            z13 = false;
                        }
                        iRound = -1;
                    }
                    if (z13) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C31992p.m99506c(AbstractC31967i2.m99461c(context, i14), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z14 = true;
                    }
                }
                i14 = 16842801;
            }
            z13 = true;
            iRound = -1;
            if (z13) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C31992p.m99506c(AbstractC31967i2.m99461c(context, i14), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z14 = true;
            }
        }
        if (z14 || !z4) {
            return drawable;
        }
        return null;
    }
}
