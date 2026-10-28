package p127ev;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ev.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13676q {

    /* JADX INFO: renamed from: a */
    public final String f48472a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13669j f48473b;

    public AbstractC13676q(String str, InterfaceC13669j interfaceC13669j) {
        this.f48472a = str;
        this.f48473b = interfaceC13669j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass().equals(obj.getClass()) && AbstractC22676k.m65745e(((AbstractC13676q) obj).f48472a, this.f48472a);
    }

    public final int hashCode() {
        return this.f48472a.hashCode() + 31;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("pluginId = ");
        sb4.append(this.f48472a);
        sb4.append(", pluginInstance = ");
        InterfaceC13669j interfaceC13669j = this.f48473b;
        sb4.append(interfaceC13669j != null ? interfaceC13669j.getClass() : null);
        return sb4.toString();
    }
}
