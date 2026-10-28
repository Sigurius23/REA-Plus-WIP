package p474s;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.whoop.android.R;
import p444r.C30805b;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C31956g extends AppCompatImageView implements InterfaceC31964i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C31960h f132675w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31956g(C31960h c31960h, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f132675w = c31960h;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC32015u2.m99566a(this, getContentDescription());
        setOnTouchListener(new C30805b(this, this));
    }

    @Override // p474s.InterfaceC31964i
    /* JADX INFO: renamed from: a */
    public final boolean mo3250a() {
        return false;
    }

    @Override // p474s.InterfaceC31964i
    /* JADX INFO: renamed from: b */
    public final boolean mo3251b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f132675w.m99451l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i13, int i14, int i15, int i16) {
        boolean frame = super.setFrame(i13, i14, i15, i16);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
