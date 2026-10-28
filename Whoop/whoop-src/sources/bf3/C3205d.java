package bf3;

import af3.C0849y;

/* JADX INFO: renamed from: bf3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3205d {

    /* JADX INFO: renamed from: a */
    public final CharSequence f12559a;

    /* JADX INFO: renamed from: b */
    public final C0849y f12560b;

    public C3205d(CharSequence charSequence, C0849y c0849y) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.f12559a = charSequence;
        this.f12560b = c0849y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: a */
    public final C3205d m9253a(int i13, int i14) {
        C0849y c0849y;
        CharSequence charSequenceSubSequence = this.f12559a.subSequence(i13, i14);
        C0849y c0849y2 = this.f12560b;
        if (c0849y2 != null) {
            int i15 = c0849y2.f3050b + i13;
            int i16 = i14 - i13;
            if (i16 != 0) {
                c0849y = new C0849y(c0849y2.f3049a, i15, i16);
            } else {
                c0849y = null;
            }
        } else {
            c0849y = null;
        }
        return new C3205d(charSequenceSubSequence, c0849y);
    }
}
