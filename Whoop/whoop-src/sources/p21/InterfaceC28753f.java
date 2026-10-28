package p21;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p21.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lp21/f;", "", "c", "a", "b", "Lp21/f$a;", "Lp21/f$b;", "Lp21/f$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28753f {

    /* JADX INFO: renamed from: p21.f$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lp21/f$a;", "Lp21/f;", "Ly3/f;", "height", "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC28753f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float height;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float width;

        public /* synthetic */ a(float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f13, f14);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return C39174f.m124782b(this.height, aVar.height) && C39174f.m124782b(this.width, aVar.width);
        }

        public int hashCode() {
            return Float.hashCode(this.width) + (Float.hashCode(this.height) * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AdjustHeightAndWidth(height=", C39174f.m124783c(this.height), ", width=", C39174f.m124783c(this.width), ")");
        }

        private a(float f13, float f14) {
            this.height = f13;
            this.width = f14;
        }
    }

    /* JADX INFO: renamed from: p21.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lp21/f$b;", "Lp21/f;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28753f {

        /* JADX INFO: renamed from: a */
        public static final b f116454a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: p21.f$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lp21/f$c;", "Lp21/f;", "Ly3/f;", "height", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC28753f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float height;

        public /* synthetic */ c(float f13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f13);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && C39174f.m124782b(this.height, ((c) other).height);
        }

        public int hashCode() {
            return Float.hashCode(this.height);
        }

        public String toString() {
            return AbstractC11895b.m31996o("DefaultHeight(height=", C39174f.m124783c(this.height), ")");
        }

        private c(float f13) {
            this.height = f13;
        }

        public c(float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 216 : f13, null);
        }
    }
}
