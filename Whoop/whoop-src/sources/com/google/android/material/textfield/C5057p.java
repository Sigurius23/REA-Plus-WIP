package com.google.android.material.textfield;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.util.SparseArray;
import java.text.BreakIterator;
import java.util.Locale;
import m83.AbstractC25260n;
import na.C26503p;
import p000.AbstractC11266d;
import p002a0.C0028i;
import p185h6.C16955j;
import p236j.C21073l;
import p318m3.C24974d;
import p448r3.AbstractC30895a;
import p474s.C31983m2;
import p530up.AbstractC35148d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.google.android.material.textfield.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C5057p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21236a;

    /* JADX INFO: renamed from: b */
    public int f21237b;

    /* JADX INFO: renamed from: c */
    public int f21238c;

    /* JADX INFO: renamed from: d */
    public Object f21239d;

    /* JADX INFO: renamed from: e */
    public Object f21240e;

    public /* synthetic */ C5057p() {
        this.f21236a = 5;
    }

    /* JADX INFO: renamed from: a */
    public C21073l m15858a() {
        return new C21073l((IntentSender) this.f21239d, (Intent) this.f21240e, this.f21237b, this.f21238c);
    }

    /* JADX INFO: renamed from: b */
    public void m15859b(int i13) {
        int i14 = this.f21237b;
        int i15 = this.f21238c;
        boolean z4 = false;
        if (i13 <= i15 && i14 <= i13) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Invalid offset: ", ". Valid range is [", " , ");
        sbM30465s.append(i15);
        sbM30465s.append(']');
        AbstractC30895a.m95015a(sbM30465s.toString());
    }

    /* JADX INFO: renamed from: c */
    public int m15860c() {
        C0028i c0028i = (C0028i) this.f21240e;
        if (c0028i == null) {
            return ((String) this.f21239d).length();
        }
        return (c0028i.f70b - c0028i.m69c()) + (((String) this.f21239d).length() - (this.f21238c - this.f21237b));
    }

    /* JADX INFO: renamed from: d */
    public boolean m15861d(int i13) {
        CharSequence charSequence = (CharSequence) this.f21239d;
        int i14 = this.f21237b + 1;
        if (i13 > this.f21238c || i14 > i13) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i13))) {
            int i15 = i13 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i15))) {
                if (!C16955j.m47709d()) {
                    return false;
                }
                C16955j c16955jM47708a = C16955j.m47708a();
                if (c16955jM47708a.m47711c() != 1 || c16955jM47708a.m47710b(i15, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m15862e(int i13) {
        int i14 = this.f21237b + 1;
        if (i13 > this.f21238c || i14 > i13) {
            return false;
        }
        return AbstractC35148d.m111156G(Character.codePointBefore((CharSequence) this.f21239d, i13));
    }

    /* JADX INFO: renamed from: f */
    public boolean m15863f(int i13) {
        m15859b(i13);
        if (!((BreakIterator) this.f21240e).isBoundary(i13)) {
            return false;
        }
        if (m15865h(i13) && m15865h(i13 - 1) && m15865h(i13 + 1)) {
            return false;
        }
        return i13 <= 0 || i13 >= ((CharSequence) this.f21239d).length() - 1 || !(m15864g(i13) || m15864g(i13 + 1));
    }

    /* JADX INFO: renamed from: g */
    public boolean m15864g(int i13) {
        CharSequence charSequence = (CharSequence) this.f21239d;
        int i14 = i13 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i14));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC22676k.m65745e(unicodeBlockOf, unicodeBlock) && AbstractC22676k.m65745e(Character.UnicodeBlock.of(charSequence.charAt(i13)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC22676k.m65745e(Character.UnicodeBlock.of(charSequence.charAt(i13)), unicodeBlock) && AbstractC22676k.m65745e(Character.UnicodeBlock.of(charSequence.charAt(i14)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: h */
    public boolean m15865h(int i13) {
        CharSequence charSequence = (CharSequence) this.f21239d;
        int i14 = this.f21237b;
        if (i13 >= this.f21238c || i14 > i13) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i13)) && !Character.isSurrogate(charSequence.charAt(i13))) {
            if (!C16955j.m47709d()) {
                return false;
            }
            C16955j c16955jM47708a = C16955j.m47708a();
            if (c16955jM47708a.m47711c() != 1 || c16955jM47708a.m47710b(i13, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15866i(int i13) {
        int i14 = this.f21237b;
        if (i13 >= this.f21238c || i14 > i13) {
            return false;
        }
        return AbstractC35148d.m111156G(Character.codePointAt((CharSequence) this.f21239d, i13));
    }

    /* JADX INFO: renamed from: j */
    public int m15867j(int i13) {
        m15859b(i13);
        int iFollowing = ((BreakIterator) this.f21240e).following(i13);
        return (m15865h(iFollowing + (-1)) && m15865h(iFollowing) && !m15864g(iFollowing)) ? m15867j(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: k */
    public int m15868k(int i13) {
        m15859b(i13);
        int iPreceding = ((BreakIterator) this.f21240e).preceding(i13);
        return (m15865h(iPreceding) && m15861d(iPreceding) && !m15864g(iPreceding)) ? m15868k(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: l */
    public void m15869l(int i13, int i14, String str) {
        if (i13 > i14) {
            AbstractC30895a.m95015a("start index must be less than or equal to end index: " + i13 + " > " + i14);
        }
        if (i13 < 0) {
            AbstractC30895a.m95015a("start must be non-negative, but was " + i13);
        }
        C0028i c0028i = (C0028i) this.f21240e;
        if (c0028i == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i13, 64);
            int iMin2 = Math.min(((String) this.f21239d).length() - i14, 64);
            String str2 = (String) this.f21239d;
            int i15 = i13 - iMin;
            AbstractC22676k.m65748h(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i15, i13, cArr, 0);
            String str3 = (String) this.f21239d;
            int i16 = iMax - iMin2;
            int i17 = iMin2 + i14;
            AbstractC22676k.m65748h(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i14, i17, cArr, i16);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0028i c0028i2 = new C0028i(2);
            c0028i2.f70b = iMax;
            c0028i2.f73e = cArr;
            c0028i2.f71c = length;
            c0028i2.f72d = i16;
            this.f21240e = c0028i2;
            this.f21237b = i15;
            this.f21238c = i17;
            return;
        }
        int i18 = this.f21237b;
        int i19 = i13 - i18;
        int i24 = i14 - i18;
        if (i19 < 0 || i24 > c0028i.f70b - c0028i.m69c()) {
            this.f21239d = toString();
            this.f21240e = null;
            this.f21237b = -1;
            this.f21238c = -1;
            m15869l(i13, i14, str);
            return;
        }
        int length2 = str.length() - (i24 - i19);
        if (length2 > c0028i.m69c()) {
            int iM69c = length2 - c0028i.m69c();
            int i25 = c0028i.f70b;
            do {
                i25 *= 2;
            } while (i25 - c0028i.f70b < iM69c);
            char[] cArr2 = new char[i25];
            AbstractC25260n.m74065f0((char[]) c0028i.f73e, cArr2, 0, 0, c0028i.f71c);
            int i26 = c0028i.f70b;
            int i27 = c0028i.f72d;
            int i28 = i26 - i27;
            int i29 = i25 - i28;
            AbstractC25260n.m74065f0((char[]) c0028i.f73e, cArr2, i29, i27, i28 + i27);
            c0028i.f73e = cArr2;
            c0028i.f70b = i25;
            c0028i.f72d = i29;
        }
        int i34 = c0028i.f71c;
        if (i19 < i34 && i24 <= i34) {
            int i35 = i34 - i24;
            char[] cArr3 = (char[]) c0028i.f73e;
            AbstractC25260n.m74065f0(cArr3, cArr3, c0028i.f72d - i35, i24, i34);
            c0028i.f71c = i19;
            c0028i.f72d -= i35;
        } else if (i19 >= i34 || i24 < i34) {
            int iM69c2 = c0028i.m69c() + i19;
            int iM69c3 = c0028i.m69c() + i24;
            int i36 = c0028i.f72d;
            char[] cArr4 = (char[]) c0028i.f73e;
            AbstractC25260n.m74065f0(cArr4, cArr4, c0028i.f71c, i36, iM69c2);
            c0028i.f71c += iM69c2 - i36;
            c0028i.f72d = iM69c3;
        } else {
            c0028i.f72d = c0028i.m69c() + i24;
            c0028i.f71c = i19;
        }
        str.getChars(0, str.length(), (char[]) c0028i.f73e, c0028i.f71c);
        c0028i.f71c = str.length() + c0028i.f71c;
    }

    /* JADX INFO: renamed from: m */
    public void m15870m(Intent intent) {
        this.f21240e = intent;
    }

    /* JADX INFO: renamed from: n */
    public void m15871n(int i13, int i14) {
        this.f21238c = i13;
        this.f21237b = i14;
    }

    public String toString() {
        switch (this.f21236a) {
            case 5:
                C0028i c0028i = (C0028i) this.f21240e;
                if (c0028i == null) {
                    return (String) this.f21239d;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) this.f21239d, 0, this.f21237b);
                sb4.append((char[]) c0028i.f73e, 0, c0028i.f71c);
                char[] cArr = (char[]) c0028i.f73e;
                int i13 = c0028i.f72d;
                sb4.append(cArr, i13, c0028i.f70b - i13);
                String str = (String) this.f21239d;
                sb4.append((CharSequence) str, this.f21238c, str.length());
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public C5057p(CharSequence charSequence, int i13, Locale locale) {
        this.f21236a = 2;
        this.f21239d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC30895a.m95015a("input start index is outside the CharSequence");
        }
        if (i13 < 0 || i13 > charSequence.length()) {
            AbstractC30895a.m95015a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f21240e = wordInstance;
        this.f21237b = Math.max(0, -50);
        this.f21238c = Math.min(charSequence.length(), i13 + 50);
        wordInstance.setText(new C24974d(i13, charSequence));
    }

    public C5057p(int i13, int i14, String str, String str2) {
        this.f21236a = 4;
        this.f21237b = i13;
        this.f21239d = str;
        this.f21238c = i14;
        this.f21240e = str2;
    }

    public C5057p(IntentSender intentSender) {
        this.f21236a = 1;
        AbstractC22676k.m65750j(intentSender, "intentSender");
        this.f21239d = intentSender;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5057p(PendingIntent pendingIntent) {
        this.f21236a = 1;
        IntentSender intentSender = pendingIntent.getIntentSender();
        AbstractC22676k.m65749i(intentSender, "pendingIntent.intentSender");
        this(intentSender);
    }

    public C5057p(C5058q c5058q, C31983m2 c31983m2) {
        this.f21236a = 0;
        this.f21239d = new SparseArray();
        this.f21240e = c5058q;
        TypedArray typedArray = (TypedArray) c31983m2.f132769x;
        this.f21237b = typedArray.getResourceId(28, 0);
        this.f21238c = typedArray.getResourceId(52, 0);
    }

    public C5057p(int i13) {
        this.f21236a = 3;
        this.f21239d = new C26503p[i13];
        this.f21238c = 0;
    }
}
