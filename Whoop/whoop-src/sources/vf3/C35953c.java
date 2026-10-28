package vf3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vf3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35953c implements InterfaceC35951a {

    /* JADX INFO: renamed from: a */
    public final String f153107a;

    public C35953c(String str) {
        this.f153107a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35953c) && AbstractC22676k.m65745e(this.f153107a, ((C35953c) obj).f153107a);
    }

    public final int hashCode() {
        return this.f153107a.hashCode();
    }

    public final String toString() {
        return this.f153107a;
    }
}
