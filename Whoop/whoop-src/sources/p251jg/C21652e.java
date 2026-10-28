package p251jg;

import p194hg.InterfaceC17243d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C21652e implements InterfaceC17243d {

    /* JADX INFO: renamed from: a */
    public final String f83166a;

    public C21652e(String str) {
        this.f83166a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21652e) && AbstractC22676k.m65745e(this.f83166a, ((C21652e) obj).f83166a);
    }

    public final int hashCode() {
        return this.f83166a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("JsonSerialName(name="), this.f83166a, ')');
    }
}
