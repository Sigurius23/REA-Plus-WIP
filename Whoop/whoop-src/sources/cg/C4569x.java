package cg;

import androidx.room.C1832u;
import hg3.AbstractC17269i;
import io.sentry.hints.C20363j;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33775g;
import tg.InterfaceC33773e;

/* JADX INFO: renamed from: cg.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4569x {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f18385c = 0;

    /* JADX INFO: renamed from: a */
    public final List f18386a;

    /* JADX INFO: renamed from: b */
    public final boolean f18387b;

    static {
        ArrayList arrayList = new ArrayList();
        C4566u c4566u = C4566u.f18382w;
        C33775g c33775g = C33775g.f141359i;
        AbstractC17269i.m48914s(arrayList, c4566u, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 6));
        AbstractC17269i.m48914s(arrayList, C4567v.f18383w, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
        AbstractC25265s.m74093D1(arrayList);
    }

    public C4569x(List list, boolean z4) {
        this.f18386a = list;
        this.f18387b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4569x.class != obj.getClass()) {
            return false;
        }
        C4569x c4569x = (C4569x) obj;
        return AbstractC22676k.m65745e(this.f18386a, c4569x.f18386a) && this.f18387b == c4569x.f18387b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18387b) + (this.f18386a.hashCode() * 31);
    }

    public final String toString() {
        return C20363j.m56528i(this.f18386a, this.f18387b);
    }
}
