package p658yr;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p012ab.C0682h0;
import p108e4.AbstractC12682p;
import p463rj.AbstractC31484o;
import p508ty.C34249c;

/* JADX INFO: renamed from: yr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C39721h implements Iterator {

    /* JADX INFO: renamed from: F */
    public int f170962F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C34249c f170963G;

    /* JADX INFO: renamed from: x */
    public String f170965x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f170966y;

    /* JADX INFO: renamed from: z */
    public final AbstractC39714a f170967z;

    /* JADX INFO: renamed from: w */
    public int f170964w = 2;

    /* JADX INFO: renamed from: E */
    public int f170961E = 0;

    public C39721h(C34249c c34249c, C0682h0 c0682h0, CharSequence charSequence) {
        this.f170963G = c34249c;
        this.f170967z = (AbstractC39714a) c0682h0.f2433y;
        this.f170962F = c0682h0.f2432x;
        this.f170966y = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC39714a abstractC39714a;
        int i13 = this.f170964w;
        if (i13 == 4) {
            throw new IllegalStateException();
        }
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            return true;
        }
        if (iM35485e == 2) {
            return false;
        }
        this.f170964w = 4;
        int i14 = this.f170961E;
        while (true) {
            int length = this.f170961E;
            if (length == -1) {
                this.f170964w = 3;
                string = null;
                break;
            }
            C39715b c39715b = (C39715b) this.f170963G.f143660x;
            CharSequence charSequence = this.f170966y;
            int length2 = charSequence.length();
            AbstractC31484o.m96959k(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c39715b.mo127095a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f170961E = -1;
            } else {
                this.f170961E = length + 1;
            }
            int i15 = this.f170961E;
            if (i15 != i14) {
                while (true) {
                    abstractC39714a = this.f170967z;
                    if (i14 >= length || !abstractC39714a.mo127095a(charSequence.charAt(i14))) {
                        break;
                    }
                    i14++;
                }
                while (length > i14 && abstractC39714a.mo127095a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i16 = this.f170962F;
                if (i16 == 1) {
                    length = charSequence.length();
                    this.f170961E = -1;
                    while (length > i14 && abstractC39714a.mo127095a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f170962F = i16 - 1;
                }
                string = charSequence.subSequence(i14, length).toString();
                break;
            }
            int i17 = i15 + 1;
            this.f170961E = i17;
            if (i17 > charSequence.length()) {
                this.f170961E = -1;
            }
        }
        this.f170965x = string;
        if (this.f170964w == 3) {
            return false;
        }
        this.f170964w = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f170964w = 2;
        String str = this.f170965x;
        this.f170965x = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
