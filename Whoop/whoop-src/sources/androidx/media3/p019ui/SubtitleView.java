package androidx.media3.p019ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p087db.C11841c;
import p087db.C11843d;
import p087db.C11880v0;
import p087db.InterfaceC11868p0;
import p550vd.AbstractC35902e;
import p576w8.C36931a;
import p576w8.C36932b;
import p576w8.InterfaceC36936f;

/* JADX INFO: loaded from: classes5.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public boolean f6490E;

    /* JADX INFO: renamed from: F */
    public boolean f6491F;

    /* JADX INFO: renamed from: G */
    public int f6492G;

    /* JADX INFO: renamed from: H */
    public InterfaceC11868p0 f6493H;

    /* JADX INFO: renamed from: I */
    public View f6494I;

    /* JADX INFO: renamed from: w */
    public List f6495w;

    /* JADX INFO: renamed from: x */
    public C11843d f6496x;

    /* JADX INFO: renamed from: y */
    public float f6497y;

    /* JADX INFO: renamed from: z */
    public float f6498z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6495w = Collections.EMPTY_LIST;
        this.f6496x = C11843d.f38619g;
        this.f6497y = 0.0533f;
        this.f6498z = 0.08f;
        this.f6490E = true;
        this.f6491F = true;
        C11841c c11841c = new C11841c(context, 0);
        this.f6493H = c11841c;
        this.f6494I = c11841c;
        addView(c11841c);
        this.f6492G = 1;
    }

    private List<C36932b> getCuesWithStylingPreferencesApplied() {
        if (this.f6490E && this.f6491F) {
            return this.f6495w;
        }
        ArrayList arrayList = new ArrayList(this.f6495w.size());
        for (int i13 = 0; i13 < this.f6495w.size(); i13++) {
            C36931a c36931aM118551a = ((C36932b) this.f6495w.get(i13)).m118551a();
            if (!this.f6490E) {
                c36931aM118551a.f158022n = false;
                CharSequence charSequence = c36931aM118551a.f158009a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c36931aM118551a.f158009a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c36931aM118551a.f158009a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC36936f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC35902e.m113945P(c36931aM118551a);
            } else if (!this.f6491F) {
                AbstractC35902e.m113945P(c36931aM118551a);
            }
            arrayList.add(c36931aM118551a.m118550a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C11843d getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        C11843d c11843d = C11843d.f38619g;
        if (zIsInEditMode) {
            return c11843d;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            c11843d = new C11843d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return c11843d;
    }

    private <T extends View & InterfaceC11868p0> void setView(T t14) {
        removeView(this.f6494I);
        View view = this.f6494I;
        if (view instanceof C11880v0) {
            ((C11880v0) view).f38770x.destroy();
        }
        this.f6494I = t14;
        this.f6493H = t14;
        addView(t14);
    }

    /* JADX INFO: renamed from: a */
    public final void m5089a() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: b */
    public final void m5090b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: c */
    public final void m5091c() {
        this.f6493H.mo31783a(getCuesWithStylingPreferencesApplied(), this.f6496x, this.f6497y, this.f6498z);
    }

    public void setApplyEmbeddedFontSizes(boolean z4) {
        this.f6491F = z4;
        m5091c();
    }

    public void setApplyEmbeddedStyles(boolean z4) {
        this.f6490E = z4;
        m5091c();
    }

    public void setBottomPaddingFraction(float f13) {
        this.f6498z = f13;
        m5091c();
    }

    public void setCues(List<C36932b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f6495w = list;
        m5091c();
    }

    public void setFractionalTextSize(float f13) {
        this.f6497y = f13;
        m5091c();
    }

    public void setStyle(C11843d c11843d) {
        this.f6496x = c11843d;
        m5091c();
    }

    public void setViewType(int i13) {
        if (this.f6492G == i13) {
            return;
        }
        if (i13 == 1) {
            setView(new C11841c(getContext(), 0));
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C11880v0(getContext()));
        }
        this.f6492G = i13;
    }
}
