package m51;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: m51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lm51/a;", "", "c", "b", "a", "Lm51/a$a;", "Lm51/a$b;", "Lm51/a$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25079a {

    /* JADX INFO: renamed from: m51.a$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lm51/a$a;", "Lm51/a;", "", "Ly81/e;", "colors", "", "opacity", "<init>", "(Ljava/util/List;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC25079a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC39332e> colors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float opacity;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC39332e> colors, float f13) {
            AbstractC22676k.m65750j(colors, "colors");
            this.colors = colors;
            this.opacity = f13;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC39332e> m73571a() {
            return this.colors;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public float getOpacity() {
            return this.opacity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.colors, aVar.colors) && Float.compare(this.opacity, aVar.opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity) + (this.colors.hashCode() * 31);
        }

        public String toString() {
            return "Linear(colors=" + this.colors + ", opacity=" + this.opacity + ")";
        }
    }

    /* JADX INFO: renamed from: m51.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lm51/a$b;", "Lm51/a;", "Ly81/e;", "color", "", "opacity", "<init>", "(Ly81/e;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "()Ly81/e;", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC25079a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC39332e color;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float opacity;

        public b(InterfaceC39332e color, float f13) {
            AbstractC22676k.m65750j(color, "color");
            this.color = color;
            this.opacity = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC39332e getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public float getOpacity() {
            return this.opacity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.color, bVar.color) && Float.compare(this.opacity, bVar.opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity) + (this.color.hashCode() * 31);
        }

        public String toString() {
            return "Radial(color=" + this.color + ", opacity=" + this.opacity + ")";
        }
    }

    /* JADX INFO: renamed from: m51.a$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lm51/a$c;", "Lm51/a;", "Ly81/e;", "color", "", "opacity", "<init>", "(Ly81/e;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "()Ly81/e;", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC25079a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC39332e color;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float opacity;

        public c(InterfaceC39332e color, float f13) {
            AbstractC22676k.m65750j(color, "color");
            this.color = color;
            this.opacity = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC39332e getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public float getOpacity() {
            return this.opacity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.color, cVar.color) && Float.compare(this.opacity, cVar.opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity) + (this.color.hashCode() * 31);
        }

        public String toString() {
            return "Solid(color=" + this.color + ", opacity=" + this.opacity + ")";
        }
    }
}
