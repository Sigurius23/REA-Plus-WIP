package p580wd;

import p319m4.AbstractC25012a;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C37155h extends AbstractC32004s {

    /* JADX INFO: renamed from: a */
    public final String f158911a;

    public C37155h(String errorMessage) {
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.f158911a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37155h) && AbstractC22676k.m65745e(this.f158911a, ((C37155h) obj).f158911a);
    }

    public final int hashCode() {
        return this.f158911a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Err(errorMessage="), this.f158911a, ')');
    }
}
