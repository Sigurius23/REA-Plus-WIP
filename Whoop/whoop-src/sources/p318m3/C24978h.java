package p318m3;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p002a0.C0030i1;
import p035bp.AbstractC3511b;
import p356o3.C27494d;
import p356o3.C27495e;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: m3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C24978h {

    /* JADX INFO: renamed from: a */
    public final CharSequence f97752a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f97753b;

    /* JADX INFO: renamed from: c */
    public final int f97754c;

    /* JADX INFO: renamed from: d */
    public float f97755d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f97756e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f97757f;

    /* JADX INFO: renamed from: g */
    public boolean f97758g;

    /* JADX INFO: renamed from: h */
    public CharSequence f97759h;

    public C24978h(CharSequence charSequence, TextPaint textPaint, int i13) {
        this.f97752a = charSequence;
        this.f97753b = textPaint;
        this.f97754c = i13;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m73301a() {
        if (!this.f97758g) {
            TextDirectionHeuristic textDirectionHeuristicM73317a = AbstractC24984n.m73317a(this.f97754c);
            int i13 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f97752a;
            TextPaint textPaint = this.f97753b;
            this.f97757f = i13 >= 33 ? AbstractC24973c.m73297a(charSequence, textPaint, textDirectionHeuristicM73317a) : AbstractC3511b.m10396y(charSequence, textPaint, textDirectionHeuristicM73317a);
            this.f97758g = true;
        }
        return this.f97757f;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m73302b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f97759h;
        if (charSequence == null) {
            charSequence = this.f97752a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC24980j.m73306b(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(characterStyleArr);
                    SpannableString spannableString = null;
                    while (c0030i1M65777h.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) c0030i1M65777h.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f97759h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    public final float m73303c() {
        if (!Float.isNaN(this.f97755d)) {
            return this.f97755d;
        }
        BoringLayout.Metrics metricsM73301a = m73301a();
        float fCeil = metricsM73301a != null ? metricsM73301a.width : -1;
        TextPaint textPaint = this.f97753b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m73302b(), 0, m73302b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f97752a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC24980j.m73306b(spanned, C27495e.class) || AbstractC24980j.m73306b(spanned, C27494d.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f97755d = fCeil;
        return fCeil;
    }
}
