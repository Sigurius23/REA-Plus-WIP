package v40;

import c93.InterfaceC4339a;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import u40.AbstractC34529e;

/* JADX INFO: renamed from: v40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35649a implements Serializable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC4339a f151470w = AbstractC34529e.f145148a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35649a) && AbstractC22676k.m65745e(this.f151470w, ((C35649a) obj).f151470w);
    }

    public final int hashCode() {
        return this.f151470w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106653l("HCaptchaInternalConfig(htmlProvider=", ")", this.f151470w);
    }
}
