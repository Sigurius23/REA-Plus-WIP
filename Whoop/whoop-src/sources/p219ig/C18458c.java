package p219ig;

import p194hg.InterfaceC17243d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ig.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18458c implements InterfaceC17243d {

    /* JADX INFO: renamed from: a */
    public final String f71882a;

    public C18458c(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f71882a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18458c) && AbstractC22676k.m65745e(this.f71882a, ((C18458c) obj).f71882a);
    }

    public final int hashCode() {
        return this.f71882a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("FormUrlSerialName(name="), this.f71882a, ')');
    }
}
