package z40;

import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C40060g {

    /* JADX INFO: renamed from: a */
    public final List f172874a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40058e f172875b;

    public C40060g(ArrayList audioDeviceList, AbstractC40058e abstractC40058e) {
        AbstractC22676k.m65750j(audioDeviceList, "audioDeviceList");
        this.f172874a = audioDeviceList;
        this.f172875b = abstractC40058e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40060g)) {
            return false;
        }
        C40060g c40060g = (C40060g) obj;
        return AbstractC22676k.m65745e(this.f172874a, c40060g.f172874a) && AbstractC22676k.m65745e(this.f172875b, c40060g.f172875b);
    }

    public final int hashCode() {
        int iHashCode = this.f172874a.hashCode() * 31;
        AbstractC40058e abstractC40058e = this.f172875b;
        return iHashCode + (abstractC40058e == null ? 0 : abstractC40058e.hashCode());
    }

    public final String toString() {
        return "AudioDeviceState(audioDeviceList=" + this.f172874a + ", selectedAudioDevice=" + this.f172875b + ")";
    }
}
