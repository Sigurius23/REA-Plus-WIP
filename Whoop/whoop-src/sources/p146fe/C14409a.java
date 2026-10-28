package p146fe;

import c13.AbstractC3855a;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.C39412p;

/* JADX INFO: renamed from: fe.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14409a {

    /* JADX INFO: renamed from: a */
    public final String f52557a;

    /* JADX INFO: renamed from: b */
    public final Map f52558b;

    /* JADX INFO: renamed from: c */
    public final C39412p f52559c;

    /* JADX INFO: renamed from: d */
    public final C14410b f52560d;

    public C14409a(String str, Map map, C39412p c39412p, C14410b c14410b) {
        this.f52557a = str;
        this.f52558b = map;
        this.f52559c = c39412p;
        this.f52560d = c14410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14409a)) {
            return false;
        }
        C14409a c14409a = (C14409a) obj;
        return AbstractC22676k.m65745e(this.f52557a, c14409a.f52557a) && AbstractC22676k.m65745e(this.f52558b, c14409a.f52558b) && AbstractC22676k.m65745e(this.f52559c, c14409a.f52559c) && AbstractC22676k.m65745e(this.f52560d, c14409a.f52560d);
    }

    public final int hashCode() {
        return this.f52560d.hashCode() + ((this.f52559c.hashCode() + AbstractC3855a.m11821e(this.f52558b, this.f52557a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Partition(id=" + this.f52557a + ", regions=" + this.f52558b + ", regionRegex=" + this.f52559c + ", baseConfig=" + this.f52560d + ')';
    }
}
