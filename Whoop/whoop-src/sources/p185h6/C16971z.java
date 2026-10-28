package p185h6;

import android.text.Spannable;
import android.text.SpannableString;
import g73.C15556d;
import java.util.stream.IntStream;
import p035bp.AbstractC3511b;

/* JADX INFO: renamed from: h6.z */
/* JADX INFO: loaded from: classes.dex */
public final class C16971z implements Spannable {

    /* JADX INFO: renamed from: w */
    public boolean f65132w = false;

    /* JADX INFO: renamed from: x */
    public Spannable f65133x;

    public C16971z(Spannable spannable) {
        this.f65133x = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m47733a() {
        Spannable spannable = this.f65133x;
        if (!this.f65132w && new C15556d(3).m43810j(spannable)) {
            this.f65133x = new SpannableString(spannable);
        }
        this.f65132w = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f65133x.charAt(i13);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return AbstractC3511b.m10380i(this.f65133x);
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return AbstractC3511b.m10381j(this.f65133x);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f65133x.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f65133x.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f65133x.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i13, int i14, Class cls) {
        return this.f65133x.getSpans(i13, i14, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f65133x.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i13, int i14, Class cls) {
        return this.f65133x.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m47733a();
        this.f65133x.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i13, int i14, int i15) {
        m47733a();
        this.f65133x.setSpan(obj, i13, i14, i15);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return this.f65133x.subSequence(i13, i14);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f65133x.toString();
    }
}
