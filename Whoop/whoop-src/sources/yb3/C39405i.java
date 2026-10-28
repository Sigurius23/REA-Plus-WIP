package yb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C39405i implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public int f169574E;

    /* JADX INFO: renamed from: w */
    public final CharSequence f169575w;

    /* JADX INFO: renamed from: x */
    public int f169576x;

    /* JADX INFO: renamed from: y */
    public int f169577y;

    /* JADX INFO: renamed from: z */
    public int f169578z;

    public C39405i(CharSequence string) {
        AbstractC22676k.m65750j(string, "string");
        this.f169575w = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13;
        int i14;
        int i15 = this.f169576x;
        if (i15 != 0) {
            return i15 == 1;
        }
        if (this.f169574E < 0) {
            this.f169576x = 2;
            return false;
        }
        CharSequence charSequence = this.f169575w;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i16 = this.f169577y; i16 < length2; i16++) {
            char cCharAt = charSequence.charAt(i16);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i13 = (cCharAt == '\r' && (i14 = i16 + 1) < charSequence.length() && charSequence.charAt(i14) == '\n') ? 2 : 1;
                length = i16;
                this.f169576x = 1;
                this.f169574E = i13;
                this.f169578z = length;
                return true;
            }
        }
        i13 = -1;
        this.f169576x = 1;
        this.f169574E = i13;
        this.f169578z = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f169576x = 0;
        int i13 = this.f169578z;
        int i14 = this.f169577y;
        this.f169577y = this.f169574E + i13;
        return this.f169575w.subSequence(i14, i13).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
