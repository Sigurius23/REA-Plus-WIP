package ub0;

import java.util.List;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ub0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lub0/c;", "", "<init>", "()V", "c", "e", "d", "f", "a", "b", "Lub0/c$a;", "Lub0/c$b;", "Lub0/c$c;", "Lub0/c$d;", "Lub0/c$e;", "Lub0/c$f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34738c {

    /* JADX INFO: renamed from: ub0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lub0/c$a;", "Lub0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC34738c {

        /* JADX INFO: renamed from: a */
        public static final a f146284a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ub0.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lub0/c$b;", "Lub0/c;", "", "biomarkerId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34738c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String biomarkerId) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            this.biomarkerId = biomarkerId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.biomarkerId, ((b) other).biomarkerId);
        }

        public int hashCode() {
            return this.biomarkerId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("IncludeBiomarker(biomarkerId=", this.biomarkerId, ")");
        }
    }

    /* JADX INFO: renamed from: ub0.c$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lub0/c$c;", "Lub0/c;", "", "testId", "", "isAiConfirmation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC34738c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isAiConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String testId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            this.testId = testId;
            this.isAiConfirmation = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsAiConfirmation() {
            return this.isAiConfirmation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.testId, cVar.testId) && this.isAiConfirmation == cVar.isAiConfirmation;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAiConfirmation) + (this.testId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("LoadData(testId=", this.testId, ", isAiConfirmation=", ")", this.isAiConfirmation);
        }
    }

    /* JADX INFO: renamed from: ub0.c$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lub0/c$d;", "Lub0/c;", "", "biomarkerId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC34738c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String biomarkerId) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            this.biomarkerId = biomarkerId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.biomarkerId, ((d) other).biomarkerId);
        }

        public int hashCode() {
            return this.biomarkerId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ToggleBiomarkerIncluded(biomarkerId=", this.biomarkerId, ")");
        }
    }

    /* JADX INFO: renamed from: ub0.c$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lub0/c$e;", "Lub0/c;", "", "Lub0/b;", "biomarkers", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC34738c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C34737b> biomarkers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<C34737b> biomarkers) {
            super(null);
            AbstractC22676k.m65750j(biomarkers, "biomarkers");
            this.biomarkers = biomarkers;
        }

        /* JADX INFO: renamed from: a */
        public final List<C34737b> m109692a() {
            return this.biomarkers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.biomarkers, ((e) other).biomarkers);
        }

        public int hashCode() {
            return this.biomarkers.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UpdateBiomarkers(biomarkers=", ")", this.biomarkers);
        }
    }

    /* JADX INFO: renamed from: ub0.c$f */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lub0/c$f;", "Lub0/c;", "", "biomarkerId", "", "value", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC34738c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Double value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String biomarkerId, Double d3, String str) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            this.biomarkerId = biomarkerId;
            this.value = d3;
            this.unit = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.biomarkerId, fVar.biomarkerId) && AbstractC22676k.m65745e(this.value, fVar.value) && AbstractC22676k.m65745e(this.unit, fVar.unit);
        }

        public int hashCode() {
            int iHashCode = this.biomarkerId.hashCode() * 31;
            Double d3 = this.value;
            int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
            String str = this.unit;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.biomarkerId;
            Double d3 = this.value;
            String str2 = this.unit;
            StringBuilder sb4 = new StringBuilder("UpdateSingleBiomarkerValueAndUnit(biomarkerId=");
            sb4.append(str);
            sb4.append(", value=");
            sb4.append(d3);
            sb4.append(", unit=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    public /* synthetic */ AbstractC34738c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34738c() {
    }
}
