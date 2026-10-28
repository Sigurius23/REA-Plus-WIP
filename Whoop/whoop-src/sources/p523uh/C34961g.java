package p523uh;

import p031b9.AbstractC2875y;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;
import sh.EnumC32482h;

/* JADX INFO: renamed from: uh.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C34961g implements InterfaceC34958d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f147926a;

    /* JADX INFO: renamed from: b */
    public final boolean f147927b;

    /* JADX INFO: renamed from: c */
    public final EnumC32482h f147928c;

    public C34961g(InterfaceC31421j interfaceC31421j, boolean z4, EnumC32482h enumC32482h) {
        this.f147926a = interfaceC31421j;
        this.f147927b = z4;
        this.f147928c = enumC32482h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34961g)) {
            return false;
        }
        C34961g c34961g = (C34961g) obj;
        return AbstractC22676k.m65745e(this.f147926a, c34961g.f147926a) && this.f147927b == c34961g.f147927b && this.f147928c == c34961g.f147928c;
    }

    public final int hashCode() {
        return this.f147928c.hashCode() + AbstractC2875y.m8289b(this.f147926a.hashCode() * 31, 31, this.f147927b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f147926a + ", isSampled=" + this.f147927b + ", dataSource=" + this.f147928c + ')';
    }
}
