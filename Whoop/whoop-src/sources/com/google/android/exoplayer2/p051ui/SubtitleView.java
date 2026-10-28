package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import bo.InterfaceC3500b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jo.C21813c;
import jo.C21814c0;
import jo.C21815d;
import jo.InterfaceC21837z;
import p108e4.AbstractC12667a;
import p309lo.AbstractC24567y;
import p465rm.InterfaceC31582z0;
import p621xn.C38464a;
import p621xn.C38465b;

/* JADX INFO: loaded from: classes6.dex */
public final class SubtitleView extends FrameLayout implements InterfaceC31582z0 {

    /* JADX INFO: renamed from: E */
    public boolean f20427E;

    /* JADX INFO: renamed from: F */
    public boolean f20428F;

    /* JADX INFO: renamed from: G */
    public int f20429G;

    /* JADX INFO: renamed from: H */
    public InterfaceC21837z f20430H;

    /* JADX INFO: renamed from: I */
    public View f20431I;

    /* JADX INFO: renamed from: w */
    public List f20432w;

    /* JADX INFO: renamed from: x */
    public C21815d f20433x;

    /* JADX INFO: renamed from: y */
    public float f20434y;

    /* JADX INFO: renamed from: z */
    public float f20435z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20432w = Collections.EMPTY_LIST;
        this.f20433x = C21815d.f84083g;
        this.f20434y = 0.0533f;
        this.f20435z = 0.08f;
        this.f20427E = true;
        this.f20428F = true;
        C21813c c21813c = new C21813c(context, 0);
        this.f20430H = c21813c;
        this.f20431I = c21813c;
        addView(c21813c);
        this.f20429G = 1;
    }

    private List<C38465b> getCuesWithStylingPreferencesApplied() {
        if (this.f20427E && this.f20428F) {
            return this.f20432w;
        }
        ArrayList arrayList = new ArrayList(this.f20432w.size());
        for (int i13 = 0; i13 < this.f20432w.size(); i13++) {
            C38464a c38464aM123259a = ((C38465b) this.f20432w.get(i13)).m123259a();
            if (!this.f20427E) {
                c38464aM123259a.f164719n = false;
                CharSequence charSequence = c38464aM123259a.f164706a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c38464aM123259a.f164706a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c38464aM123259a.f164706a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC3500b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC12667a.m35443O(c38464aM123259a);
            } else if (!this.f20428F) {
                AbstractC12667a.m35443O(c38464aM123259a);
            }
            arrayList.add(c38464aM123259a.m123258a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (AbstractC24567y.f95875a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C21815d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i13 = AbstractC24567y.f95875a;
        C21815d c21815d = C21815d.f84083g;
        if (i13 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c21815d;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i13 >= 21) {
            return new C21815d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C21815d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC21837z> void setView(T t14) {
        removeView(this.f20431I);
        View view = this.f20431I;
        if (view instanceof C21814c0) {
            ((C21814c0) view).f84080x.destroy();
        }
        this.f20431I = t14;
        this.f20430H = t14;
        addView(t14);
    }

    /* JADX INFO: renamed from: d */
    public final void m15579d() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: h */
    public final void m15580h() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onCues(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z4) {
        this.f20428F = z4;
        m15581t();
    }

    public void setApplyEmbeddedStyles(boolean z4) {
        this.f20427E = z4;
        m15581t();
    }

    public void setBottomPaddingFraction(float f13) {
        this.f20435z = f13;
        m15581t();
    }

    public void setCues(List<C38465b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f20432w = list;
        m15581t();
    }

    public void setFractionalTextSize(float f13) {
        this.f20434y = f13;
        m15581t();
    }

    public void setStyle(C21815d c21815d) {
        this.f20433x = c21815d;
        m15581t();
    }

    public void setViewType(int i13) {
        if (this.f20429G == i13) {
            return;
        }
        if (i13 == 1) {
            setView(new C21813c(getContext(), 0));
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C21814c0(getContext()));
        }
        this.f20429G = i13;
    }

    /* JADX INFO: renamed from: t */
    public final void m15581t() {
        this.f20430H.mo61742a(getCuesWithStylingPreferencesApplied(), this.f20433x, this.f20434y, this.f20435z);
    }
}
