package androidx.constraintlayout.core.parser;

import p210i4.AbstractC18061c;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: w */
    public final String f4990w;

    /* JADX INFO: renamed from: x */
    public final String f4991x;

    public CLParsingException(String str, AbstractC18061c abstractC18061c) {
        super(str);
        this.f4990w = str;
        if (abstractC18061c != null) {
            this.f4991x = abstractC18061c.m51909f();
        } else {
            this.f4991x = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CLParsingException (");
        sb4.append(hashCode());
        sb4.append(") : ");
        sb4.append(this.f4990w + " (" + this.f4991x + " at line 0)");
        return sb4.toString();
    }
}
