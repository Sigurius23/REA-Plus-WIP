package d61;

import cz0.AbstractC11258s;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d61.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\t\u0005R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Ld61/a;", "", "", "", "Lcz0/s;", "b", "()Ljava/util/Map;", "scrubbedData", "", "a", "()Ljava/lang/Float;", "positionOfX", "c", "Ld61/a$a;", "Ld61/a$b;", "Ld61/a$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11732a {

    /* JADX INFO: renamed from: d61.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ld61/a$a;", "Ld61/a;", "", "", "Lcz0/s;", "scrubbedData", "", "positionOfX", "<init>", "(Ljava/util/Map;Ljava/lang/Float;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11732a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, AbstractC11258s> scrubbedData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Float positionOfX;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<String, ? extends AbstractC11258s> scrubbedData, Float f13) {
            AbstractC22676k.m65750j(scrubbedData, "scrubbedData");
            this.scrubbedData = scrubbedData;
            this.positionOfX = f13;
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Float getPositionOfX() {
            return this.positionOfX;
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: b */
        public Map<String, AbstractC11258s> mo31360b() {
            return this.scrubbedData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.scrubbedData, aVar.scrubbedData) && AbstractC22676k.m65745e(this.positionOfX, aVar.positionOfX);
        }

        public int hashCode() {
            int iHashCode = this.scrubbedData.hashCode() * 31;
            Float f13 = this.positionOfX;
            return iHashCode + (f13 == null ? 0 : f13.hashCode());
        }

        public String toString() {
            return "Continue(scrubbedData=" + this.scrubbedData + ", positionOfX=" + this.positionOfX + ")";
        }
    }

    /* JADX INFO: renamed from: d61.a$b */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Ld61/a$b;", "Ld61/a;", "<init>", "()V", "", "", "Lcz0/s;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "scrubbedData", "", "c", "Ljava/lang/Float;", "a", "()Ljava/lang/Float;", "positionOfX", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC11732a {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final Float positionOfX = null;

        /* JADX INFO: renamed from: a */
        public static final b f37977a = new b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Map<String, AbstractC11258s> scrubbedData = C25272z.f99163w;

        /* JADX INFO: renamed from: d */
        public static final int f37980d = 8;

        private b() {
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: a */
        public Float getPositionOfX() {
            return positionOfX;
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: b */
        public Map<String, AbstractC11258s> mo31360b() {
            return scrubbedData;
        }
    }

    /* JADX INFO: renamed from: d61.a$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ld61/a$c;", "Ld61/a;", "", "", "Lcz0/s;", "scrubbedData", "", "positionOfX", "<init>", "(Ljava/util/Map;Ljava/lang/Float;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC11732a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, AbstractC11258s> scrubbedData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Float positionOfX;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Map<String, ? extends AbstractC11258s> scrubbedData, Float f13) {
            AbstractC22676k.m65750j(scrubbedData, "scrubbedData");
            this.scrubbedData = scrubbedData;
            this.positionOfX = f13;
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Float getPositionOfX() {
            return this.positionOfX;
        }

        @Override // d61.InterfaceC11732a
        /* JADX INFO: renamed from: b */
        public Map<String, AbstractC11258s> mo31360b() {
            return this.scrubbedData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.scrubbedData, cVar.scrubbedData) && AbstractC22676k.m65745e(this.positionOfX, cVar.positionOfX);
        }

        public int hashCode() {
            int iHashCode = this.scrubbedData.hashCode() * 31;
            Float f13 = this.positionOfX;
            return iHashCode + (f13 == null ? 0 : f13.hashCode());
        }

        public String toString() {
            return "Start(scrubbedData=" + this.scrubbedData + ", positionOfX=" + this.positionOfX + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    Float getPositionOfX();

    /* JADX INFO: renamed from: b */
    Map<String, AbstractC11258s> mo31360b();
}
