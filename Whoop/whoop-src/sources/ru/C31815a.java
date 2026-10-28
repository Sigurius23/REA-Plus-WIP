package ru;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ru.a */
/* JADX INFO: loaded from: classes.dex */
public final class C31815a {

    /* JADX INFO: renamed from: a */
    public final String f131824a;

    public C31815a(String str) {
        this.f131824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31815a) && AbstractC22676k.m65745e(this.f131824a, ((C31815a) obj).f131824a);
    }

    public final int hashCode() {
        return this.f131824a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Message(message="), this.f131824a, ')');
    }
}
