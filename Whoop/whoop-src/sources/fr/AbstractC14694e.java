package fr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.whoop.android.R;
import cr.AbstractC11075m;
import p257jq.AbstractC21885a;
import p463rj.AbstractC31484o;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: fr.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14694e {

    /* JADX INFO: renamed from: a */
    public int f54312a;

    /* JADX INFO: renamed from: b */
    public int f54313b;

    /* JADX INFO: renamed from: c */
    public int[] f54314c;

    /* JADX INFO: renamed from: d */
    public int f54315d;

    /* JADX INFO: renamed from: e */
    public int f54316e;

    /* JADX INFO: renamed from: f */
    public int f54317f;

    /* JADX INFO: renamed from: g */
    public int f54318g;

    public AbstractC14694e(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f54314c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        AbstractC11075m.m29867a(context, attributeSet, i13, i14);
        int[] iArr = AbstractC21885a.f84544d;
        AbstractC11075m.m29868b(context, attributeSet, iArr, i13, i14, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        this.f54312a = AbstractC22674j.m65697E(context, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        this.f54313b = Math.min(AbstractC22674j.m65697E(context, typedArrayObtainStyledAttributes, 8, 0), this.f54312a / 2);
        this.f54316e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f54317f = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f54318g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f54314c = new int[]{AbstractC31484o.m96968t(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f54314c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f54314c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f54315d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            this.f54315d = this.f54314c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f13 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f54315d = AbstractC31484o.m96961m(this.f54315d, (int) (f13 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void mo42130a() {
        if (this.f54318g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
