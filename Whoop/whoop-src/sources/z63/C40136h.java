package z63;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z63.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C40136h implements Appendable, CharSequence {

    /* JADX INFO: renamed from: x */
    public final ArrayDeque f173191x = new ArrayDeque(8);

    /* JADX INFO: renamed from: w */
    public final StringBuilder f173190w = new StringBuilder((CharSequence) "");

    public C40136h() {
        m128680b(0, "");
    }

    /* JADX INFO: renamed from: c */
    public static void m128678c(C40136h c40136h, Object obj, int i13, int i14) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c40136h.f173191x.push(new C40134f(obj, i13, i14, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m128678c(c40136h, obj2, i13, i14);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m128679a(char c3) {
        this.f173190w.append(c3);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f173190w.append(c3);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m128680b(int i13, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z4 = spanned instanceof C40135g;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f173191x;
                if (!z4) {
                    for (int i14 = 0; i14 < length; i14++) {
                        Object obj = spans[i14];
                        arrayDeque.push(new C40134f(obj, spanned.getSpanStart(obj) + i13, spanned.getSpanEnd(obj) + i13, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i15 = length - 1; i15 >= 0; i15--) {
                    Object obj2 = spans[i15];
                    arrayDeque.push(new C40134f(obj2, spanned.getSpanStart(obj2) + i13, spanned.getSpanEnd(obj2) + i13, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f173190w.charAt(i13);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f173190w.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        List<C40134f> listUnmodifiableList;
        int i15;
        StringBuilder sb4 = this.f173190w;
        int length = sb4.length();
        if (i14 <= i13 || i13 < 0 || i14 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.f173191x;
            if (i13 == 0 && length == i14) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C40134f c40134f = (C40134f) itDescendingIterator.next();
                    int i16 = c40134f.f173187b;
                    if ((i16 >= i13 && i16 < i14) || (((i15 = c40134f.f173188c) <= i14 && i15 > i13) || (i16 < i13 && i15 > i14))) {
                        arrayList2.add(c40134f);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb4.subSequence(i13, i14);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb4.subSequence(i13, i14));
        int length2 = spannableStringBuilder.length();
        for (C40134f c40134f2 : listUnmodifiableList) {
            int iMax = Math.max(0, c40134f2.f173187b - i13);
            spannableStringBuilder.setSpan(c40134f2.f173186a, iMax, Math.min(length2, (c40134f2.f173188c - c40134f2.f173187b) + iMax), c40134f2.f173189d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f173190w.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i13, i14);
        StringBuilder sb4 = this.f173190w;
        m128680b(sb4.length(), charSequenceSubSequence);
        sb4.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb4 = this.f173190w;
        m128680b(sb4.length(), charSequence);
        sb4.append(charSequence);
        return this;
    }
}
