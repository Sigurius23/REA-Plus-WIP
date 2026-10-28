package ru;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ru.b */
/* JADX INFO: loaded from: classes.dex */
public final class C31816b {

    /* JADX INFO: renamed from: a */
    public final String f131825a;

    public C31816b(String str) {
        this.f131825a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31816b) && AbstractC22676k.m65745e(this.f131825a, ((C31816b) obj).f131825a);
    }

    public final int hashCode() {
        return this.f131825a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Tag(tag="), this.f131825a, ')');
    }
}
