package p535uv;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.mapbox.maps.MapboxLogger;
import com.whoop.android.R;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35277b extends AppCompatImageView implements InterfaceC35276a {
    public boolean getLogoEnabled() {
        return getVisibility() == 0;
    }

    public int getLogoGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public void setLogoEnabled(boolean z4) {
        int i13;
        if (z4) {
            i13 = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_logo_disabled);
            AbstractC22676k.m65749i(string, "context.getString(R.stri…ox_warning_logo_disabled)");
            MapboxLogger.logW("MbxLogo", string);
            i13 = 8;
        }
        setVisibility(i13);
    }

    public void setLogoGravity(int i13) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i13;
    }
}
