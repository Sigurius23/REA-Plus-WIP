package p231iv;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.mapbox.maps.MapboxLogger;
import com.whoop.android.R;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iv.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C20948i extends AppCompatImageView implements InterfaceC20947h {
    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    public void setEnable(boolean z4) {
        int i13;
        if (z4) {
            i13 = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_attribution_disabled);
            AbstractC22676k.m65749i(string, "context.getString(R.stri…ing_attribution_disabled)");
            MapboxLogger.logW("MbxAttribution", string);
            i13 = 8;
        }
        setVisibility(i13);
    }

    public void setGravity(int i13) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i13;
    }

    public void setIconColor(int i13) {
        setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i13, i13}));
    }

    public void setViewOnClickListener(View.OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        setOnClickListener(listener);
    }
}
