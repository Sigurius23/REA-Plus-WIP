package p318m3;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: m3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C24974d implements CharacterIterator {

    /* JADX INFO: renamed from: w */
    public final CharSequence f97744w;

    /* JADX INFO: renamed from: x */
    public final int f97745x;

    /* JADX INFO: renamed from: y */
    public int f97746y = 0;

    public C24974d(int i13, CharSequence charSequence) {
        this.f97744w = charSequence;
        this.f97745x = i13;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i13 = this.f97746y;
        if (i13 == this.f97745x) {
            return (char) 65535;
        }
        return this.f97744w.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f97746y = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f97745x;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f97746y;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i13 = this.f97745x;
        if (i13 == 0) {
            this.f97746y = i13;
            return (char) 65535;
        }
        int i14 = i13 - 1;
        this.f97746y = i14;
        return this.f97744w.charAt(i14);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i13 = this.f97746y + 1;
        this.f97746y = i13;
        int i14 = this.f97745x;
        if (i13 < i14) {
            return this.f97744w.charAt(i13);
        }
        this.f97746y = i14;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i13 = this.f97746y;
        if (i13 <= 0) {
            return (char) 65535;
        }
        int i14 = i13 - 1;
        this.f97746y = i14;
        return this.f97744w.charAt(i14);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i13) {
        if (i13 > this.f97745x || i13 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f97746y = i13;
        return current();
    }
}
