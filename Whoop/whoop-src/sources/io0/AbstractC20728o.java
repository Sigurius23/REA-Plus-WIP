package io0;

import c13.AbstractC3855a;
import com.whoop.clinicianintheloop.api.HealthIntakeResponseItem;
import com.whoop.domain.model.UnitSystem;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: io0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m65681d2 = {"Lio0/o;", "", "<init>", "()V", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "e", "f", "l", "m", "o", "n", "k", "j", "b", "d", "c", "Lio0/o$a;", "Lio0/o$b;", "Lio0/o$c;", "Lio0/o$d;", "Lio0/o$e;", "Lio0/o$f;", "Lio0/o$g;", "Lio0/o$h;", "Lio0/o$i;", "Lio0/o$j;", "Lio0/o$k;", "Lio0/o$l;", "Lio0/o$m;", "Lio0/o$n;", "Lio0/o$o;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20728o {

    /* JADX INFO: renamed from: io0.o$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lio0/o$a;", "Lio0/o;", "", "appointmentType", "intakeType", "appointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String intakeType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String appointmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String appointmentType, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(appointmentType, "appointmentType");
            this.appointmentType = appointmentType;
            this.intakeType = str;
            this.appointmentId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppointmentId() {
            return this.appointmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAppointmentType() {
            return this.appointmentType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIntakeType() {
            return this.intakeType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.appointmentType, aVar.appointmentType) && AbstractC22676k.m65745e(this.intakeType, aVar.intakeType) && AbstractC22676k.m65745e(this.appointmentId, aVar.appointmentId);
        }

        public int hashCode() {
            int iHashCode = this.appointmentType.hashCode() * 31;
            String str = this.intakeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appointmentId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.appointmentId, ")", AbstractC11895b.m32001t("Initialize(appointmentType=", this.appointmentType, ", intakeType=", this.intakeType, ", appointmentId="));
        }
    }

    /* JADX INFO: renamed from: io0.o$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio0/o$b;", "Lio0/o;", "", "intakeResponses", "usState", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String intakeResponses;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String usState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String intakeResponses, String usState) {
            super(null);
            AbstractC22676k.m65750j(intakeResponses, "intakeResponses");
            AbstractC22676k.m65750j(usState, "usState");
            this.intakeResponses = intakeResponses;
            this.usState = usState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntakeResponses() {
            return this.intakeResponses;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUsState() {
            return this.usState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.intakeResponses, bVar.intakeResponses) && AbstractC22676k.m65745e(this.usState, bVar.usState);
        }

        public int hashCode() {
            return this.usState.hashCode() + (this.intakeResponses.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Save(intakeResponses=", this.intakeResponses, ", usState=", this.usState, ")");
        }
    }

    /* JADX INFO: renamed from: io0.o$c */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio0/o$c;", "Lio0/o;", "", "appointmentId", "", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "intakeResponses", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<HealthIntakeResponseItem> intakeResponses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String appointmentId, List<HealthIntakeResponseItem> intakeResponses) {
            super(null);
            AbstractC22676k.m65750j(appointmentId, "appointmentId");
            AbstractC22676k.m65750j(intakeResponses, "intakeResponses");
            this.appointmentId = appointmentId;
            this.intakeResponses = intakeResponses;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppointmentId() {
            return this.appointmentId;
        }

        /* JADX INFO: renamed from: b */
        public final List<HealthIntakeResponseItem> m56949b() {
            return this.intakeResponses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.appointmentId, cVar.appointmentId) && AbstractC22676k.m65745e(this.intakeResponses, cVar.intakeResponses);
        }

        public int hashCode() {
            return this.intakeResponses.hashCode() + (this.appointmentId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("SaveHealthIntake(appointmentId=", this.appointmentId, ", intakeResponses=", ")", this.intakeResponses);
        }
    }

    /* JADX INFO: renamed from: io0.o$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio0/o$d;", "Lio0/o;", "", "appointmentType", "Lio0/u;", "responses", "<init>", "(Ljava/lang/String;Lio0/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lio0/u;", "()Lio0/u;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C20734u responses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String appointmentType, C20734u responses) {
            super(null);
            AbstractC22676k.m65750j(appointmentType, "appointmentType");
            AbstractC22676k.m65750j(responses, "responses");
            this.appointmentType = appointmentType;
            this.responses = responses;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAppointmentType() {
            return this.appointmentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C20734u getResponses() {
            return this.responses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.appointmentType, dVar.appointmentType) && AbstractC22676k.m65745e(this.responses, dVar.responses);
        }

        public int hashCode() {
            return this.responses.hashCode() + (this.appointmentType.hashCode() * 31);
        }

        public String toString() {
            return "SavePersonalIntake(appointmentType=" + this.appointmentType + ", responses=" + this.responses + ")";
        }
    }

    /* JADX INFO: renamed from: io0.o$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/o$e;", "Lio0/o;", "", "stateId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String stateId;

        public e(String str) {
            super(null);
            this.stateId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStateId() {
            return this.stateId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.stateId, ((e) other).stateId);
        }

        public int hashCode() {
            String str = this.stateId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectState(stateId=", this.stateId, ")");
        }
    }

    /* JADX INFO: renamed from: io0.o$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/o$f;", "Lio0/o;", "", "", "selectedIds", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> selectedIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<String> selectedIds) {
            super(null);
            AbstractC22676k.m65750j(selectedIds, "selectedIds");
            this.selectedIds = selectedIds;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m56953a() {
            return this.selectedIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.selectedIds, ((f) other).selectedIds);
        }

        public int hashCode() {
            return this.selectedIds.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("SetMultiSelectSelectedIds(selectedIds=", ")", this.selectedIds);
        }
    }

    /* JADX INFO: renamed from: io0.o$g */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio0/o$g;", "Lio0/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC20728o {

        /* JADX INFO: renamed from: a */
        public static final g f77696a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return -26026164;
        }

        public String toString() {
            return "Skip";
        }
    }

    /* JADX INFO: renamed from: io0.o$h */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio0/o$h;", "Lio0/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC20728o {

        /* JADX INFO: renamed from: a */
        public static final h f77697a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return -1786870496;
        }

        public String toString() {
            return "StepBack";
        }
    }

    /* JADX INFO: renamed from: io0.o$i */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio0/o$i;", "Lio0/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC20728o {

        /* JADX INFO: renamed from: a */
        public static final i f77698a = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return -1164117012;
        }

        public String toString() {
            return "StepForward";
        }
    }

    /* JADX INFO: renamed from: io0.o$j */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio0/o$j;", "Lio0/o;", "", "isSelected", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSelected;

        public j(boolean z4) {
            super(null);
            this.isSelected = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.isSelected == ((j) other).isSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleTextEntryCheckbox(isSelected=", ")", this.isSelected);
        }
    }

    /* JADX INFO: renamed from: io0.o$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio0/o$k;", "Lio0/o;", "", "height", "weight", "Lcom/whoop/domain/model/UnitSystem;", "unit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer height;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer weight;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final UnitSystem unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Integer num, Integer num2, UnitSystem unit) {
            super(null);
            AbstractC22676k.m65750j(unit, "unit");
            this.height = num;
            this.weight = num2;
            this.unit = unit;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UnitSystem getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getWeight() {
            return this.weight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.height, kVar.height) && AbstractC22676k.m65745e(this.weight, kVar.weight) && this.unit == kVar.unit;
        }

        public int hashCode() {
            Integer num = this.height;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.weight;
            return this.unit.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public String toString() {
            Integer num = this.height;
            Integer num2 = this.weight;
            UnitSystem unitSystem = this.unit;
            StringBuilder sbM114684l = AbstractC36095b.m114684l("UpdateHeightWeightSelection(height=", num, ", weight=", num2, ", unit=");
            sbM114684l.append(unitSystem);
            sbM114684l.append(")");
            return sbM114684l.toString();
        }
    }

    /* JADX INFO: renamed from: io0.o$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/o$l;", "Lio0/o;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.text, ((l) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateMultiSelectTextInput(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: io0.o$m */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio0/o$m;", "Lio0/o;", "Lio0/v;", "type", "", "newValue", "", "validate", "<init>", "(Lio0/v;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lio0/v;", "b", "()Lio0/v;", "Ljava/lang/String;", "c", "Z", "()Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC20735v type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String newValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean validate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(EnumC20735v type, String newValue, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(newValue, "newValue");
            this.type = type;
            this.newValue = newValue;
            this.validate = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewValue() {
            return this.newValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC20735v getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getValidate() {
            return this.validate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return this.type == mVar.type && AbstractC22676k.m65745e(this.newValue, mVar.newValue) && this.validate == mVar.validate;
        }

        public int hashCode() {
            return Boolean.hashCode(this.validate) + AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.newValue);
        }

        public String toString() {
            EnumC20735v enumC20735v = this.type;
            String str = this.newValue;
            boolean z4 = this.validate;
            StringBuilder sb4 = new StringBuilder("UpdatePersonalIntakeField(type=");
            sb4.append(enumC20735v);
            sb4.append(", newValue=");
            sb4.append(str);
            sb4.append(", validate=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: io0.o$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio0/o$n;", "Lio0/o;", "", "textAreaId", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String textAreaId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String textAreaId, String text) {
            super(null);
            AbstractC22676k.m65750j(textAreaId, "textAreaId");
            AbstractC22676k.m65750j(text, "text");
            this.textAreaId = textAreaId;
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTextAreaId() {
            return this.textAreaId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.textAreaId, nVar.textAreaId) && AbstractC22676k.m65745e(this.text, nVar.text);
        }

        public int hashCode() {
            return this.text.hashCode() + (this.textAreaId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UpdateTextEntryInput(textAreaId=", this.textAreaId, ", text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: io0.o$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/o$o;", "Lio0/o;", "Lio0/v;", "type", "<init>", "(Lio0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio0/v;", "()Lio0/v;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC20728o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC20735v type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC20735v type) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC20735v getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.type == ((o) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "ValidatePersonalIntakeField(type=" + this.type + ")";
        }
    }

    public /* synthetic */ AbstractC20728o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20728o() {
    }
}
