package v33;

import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C35614a extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f151398a;

    public C35614a(LinkedHashMap linkedHashMap) {
        this.f151398a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35614a) && AbstractC22676k.m65745e(this.f151398a, ((C35614a) obj).f151398a);
    }

    public final int hashCode() {
        return this.f151398a.hashCode();
    }

    public final String toString() {
        return "AudioLevelChangedEvent(levels=" + this.f151398a + ")";
    }
}
