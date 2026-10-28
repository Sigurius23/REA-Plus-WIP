package fl0;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: fl0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lfl0/f;", "", "<init>", "()V", "", "orientation", "Lfl0/f$a;", "a", "(I)Lfl0/f$a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14561f {

    /* JADX INFO: renamed from: a */
    public static final C14561f f53517a = new C14561f();

    /* JADX INFO: renamed from: fl0.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lfl0/f$a;", "", "", "rotationDegrees", "", "flipHorizontal", "flipVertical", "<init>", "(FZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "Z", "()Z", "d", "isIdentity", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float rotationDegrees;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean flipHorizontal;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean flipVertical;

        public a(float f13, boolean z4, boolean z13) {
            this.rotationDegrees = f13;
            this.flipHorizontal = z4;
            this.flipVertical = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFlipHorizontal() {
            return this.flipHorizontal;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFlipVertical() {
            return this.flipVertical;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getRotationDegrees() {
            return this.rotationDegrees;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m41687d() {
            return (this.rotationDegrees != 0.0f || this.flipHorizontal || this.flipVertical) ? false : true;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.rotationDegrees, aVar.rotationDegrees) == 0 && this.flipHorizontal == aVar.flipHorizontal && this.flipVertical == aVar.flipVertical;
        }

        public int hashCode() {
            return Boolean.hashCode(this.flipVertical) + AbstractC2875y.m8289b(Float.hashCode(this.rotationDegrees) * 31, 31, this.flipHorizontal);
        }

        public String toString() {
            float f13 = this.rotationDegrees;
            boolean z4 = this.flipHorizontal;
            boolean z13 = this.flipVertical;
            StringBuilder sb4 = new StringBuilder("Transform(rotationDegrees=");
            sb4.append(f13);
            sb4.append(", flipHorizontal=");
            sb4.append(z4);
            sb4.append(", flipVertical=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }
    }

    private C14561f() {
    }

    /* JADX INFO: renamed from: a */
    public final a m41683a(int orientation) {
        switch (orientation) {
            case 2:
                return new a(0.0f, true, false);
            case 3:
                return new a(180.0f, false, false);
            case 4:
                return new a(0.0f, false, true);
            case 5:
                return new a(90.0f, true, false);
            case 6:
                return new a(90.0f, false, false);
            case 7:
                return new a(270.0f, true, false);
            case 8:
                return new a(270.0f, false, false);
            default:
                return new a(0.0f, false, false);
        }
    }
}
