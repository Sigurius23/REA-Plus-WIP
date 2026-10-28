package mh;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mh.p */
/* JADX INFO: loaded from: classes.dex */
public final class C25548p {

    /* JADX INFO: renamed from: b */
    public static final C25548p f100159b = new C25548p(C25272z.f99163w);

    /* JADX INFO: renamed from: a */
    public final Map f100160a;

    public C25548p(Map map) {
        this.f100160a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25548p) {
            return AbstractC22676k.m65745e(this.f100160a, ((C25548p) obj).f100160a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100160a.hashCode();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("Tags(tags="), this.f100160a, ')');
    }
}
