package p242j4;

/* JADX INFO: renamed from: j4.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C21305e implements InterfaceC21304d {

    /* JADX INFO: renamed from: a */
    public final float f81455a;

    /* JADX INFO: renamed from: b */
    public float f81456b;

    public C21305e(float f13, float f14) {
        this.f81455a = f14;
        this.f81456b = f13;
    }

    @Override // p242j4.InterfaceC21304d
    public final float value() {
        float f13 = this.f81456b + this.f81455a;
        this.f81456b = f13;
        return f13;
    }
}
