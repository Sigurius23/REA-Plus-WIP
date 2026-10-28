package p381ot;

/* JADX INFO: renamed from: ot.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28315a implements InterfaceC28319e {

    /* JADX INFO: renamed from: a */
    public final int f114198a;

    public C28315a(int i13) {
        this.f114198a = i13;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC28319e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC28319e)) {
            return false;
        }
        if (this.f114198a != ((C28315a) ((InterfaceC28319e) obj)).f114198a) {
            return false;
        }
        Object obj2 = EnumC28318d.f114200w;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f114198a) + (EnumC28318d.f114200w.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f114198a + "intEncoding=" + EnumC28318d.f114200w + ')';
    }
}
