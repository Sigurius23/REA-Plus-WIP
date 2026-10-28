package p287kq;

import android.util.Property;
import android.view.ViewGroup;
import com.whoop.android.R;

/* JADX INFO: renamed from: kq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22768c extends Property {

    /* JADX INFO: renamed from: a */
    public static final C22768c f89677a = new C22768c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f13 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f13 != null ? f13 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f13 = (Float) obj2;
        float fFloatValue = f13.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f13);
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            viewGroup.getChildAt(i13).setAlpha(fFloatValue);
        }
    }
}
