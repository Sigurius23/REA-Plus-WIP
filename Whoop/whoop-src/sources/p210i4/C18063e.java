package p210i4;

/* JADX INFO: renamed from: i4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18063e extends AbstractC18061c {

    /* JADX INFO: renamed from: E */
    public float f70150E;

    public C18063e(float f13) {
        super(null);
        this.f70150E = f13;
    }

    @Override // p210i4.AbstractC18061c
    /* JADX INFO: renamed from: d */
    public final float mo51907d() {
        char[] cArr;
        if (Float.isNaN(this.f70150E) && (cArr = this.f70146w) != null && cArr.length >= 1) {
            this.f70150E = Float.parseFloat(m51906c());
        }
        return this.f70150E;
    }

    @Override // p210i4.AbstractC18061c
    /* JADX INFO: renamed from: e */
    public final int mo51908e() {
        char[] cArr;
        if (Float.isNaN(this.f70150E) && (cArr = this.f70146w) != null && cArr.length >= 1) {
            this.f70150E = Integer.parseInt(m51906c());
        }
        return (int) this.f70150E;
    }

    @Override // p210i4.AbstractC18061c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18063e) {
            float fMo51907d = mo51907d();
            float fMo51907d2 = ((C18063e) obj).mo51907d();
            if ((Float.isNaN(fMo51907d) && Float.isNaN(fMo51907d2)) || fMo51907d == fMo51907d2) {
                return true;
            }
        }
        return false;
    }

    @Override // p210i4.AbstractC18061c
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f13 = this.f70150E;
        return iHashCode + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
    }
}
