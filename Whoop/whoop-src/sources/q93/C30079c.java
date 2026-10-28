package q93;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;

/* JADX INFO: renamed from: q93.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30079c {

    /* JADX INFO: renamed from: a */
    public final C35845c f122756a;

    /* JADX INFO: renamed from: b */
    public final C35845c f122757b;

    /* JADX INFO: renamed from: c */
    public final C35845c f122758c;

    public C30079c(C35845c c35845c, C35845c c35845c2, C35845c c35845c3) {
        this.f122756a = c35845c;
        this.f122757b = c35845c2;
        this.f122758c = c35845c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30079c)) {
            return false;
        }
        C30079c c30079c = (C30079c) obj;
        return AbstractC22676k.m65745e(this.f122756a, c30079c.f122756a) && AbstractC22676k.m65745e(this.f122757b, c30079c.f122757b) && AbstractC22676k.m65745e(this.f122758c, c30079c.f122758c);
    }

    public final int hashCode() {
        return this.f122758c.hashCode() + ((this.f122757b.hashCode() + (this.f122756a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f122756a + ", kotlinReadOnly=" + this.f122757b + ", kotlinMutable=" + this.f122758c + ')';
    }
}
