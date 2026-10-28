package p523uh;

import p715kotlin.jvm.internal.AbstractC22676k;
import sh.EnumC32482h;
import sh.InterfaceC32491q;

/* JADX INFO: renamed from: uh.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C34962h implements InterfaceC34958d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32491q f147929a;

    /* JADX INFO: renamed from: b */
    public final String f147930b;

    /* JADX INFO: renamed from: c */
    public final EnumC32482h f147931c;

    public C34962h(InterfaceC32491q interfaceC32491q, String str, EnumC32482h enumC32482h) {
        this.f147929a = interfaceC32491q;
        this.f147930b = str;
        this.f147931c = enumC32482h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34962h)) {
            return false;
        }
        C34962h c34962h = (C34962h) obj;
        return AbstractC22676k.m65745e(this.f147929a, c34962h.f147929a) && AbstractC22676k.m65745e(this.f147930b, c34962h.f147930b) && this.f147931c == c34962h.f147931c;
    }

    public final int hashCode() {
        int iHashCode = this.f147929a.hashCode() * 31;
        String str = this.f147930b;
        return this.f147931c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f147929a + ", mimeType=" + this.f147930b + ", dataSource=" + this.f147931c + ')';
    }
}
