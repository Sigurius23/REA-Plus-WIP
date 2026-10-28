package p208i2;

/* JADX INFO: renamed from: i2.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17875c1 extends AbstractC17911t {

    /* JADX INFO: renamed from: c */
    public final long f69559c;

    public C17875c1(long j7) {
        this.f69559c = j7;
    }

    @Override // p208i2.AbstractC17911t
    /* JADX INFO: renamed from: a */
    public final void mo51432a(long j7, InterfaceC17906q0 interfaceC17906q0, float f13) {
        C17887h c17887h = (C17887h) interfaceC17906q0;
        c17887h.m51445c(1.0f);
        long jM51541c = this.f69559c;
        if (f13 != 1.0f) {
            jM51541c = C17919x.m51541c(C17919x.m51543e(jM51541c) * f13, jM51541c);
        }
        c17887h.m51447e(jM51541c);
        if (c17887h.f69580c != null) {
            c17887h.m51451i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17875c1) {
            return C17919x.m51542d(this.f69559c, ((C17875c1) obj).f69559c);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f69559c);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C17919x.m51548j(this.f69559c)) + ')';
    }
}
