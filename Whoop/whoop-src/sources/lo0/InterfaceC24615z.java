package lo0;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.clinicianintheloop.api.HealthIntakeResponseItem;
import com.whoop.domain.model.UnitSystem;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.C20734u;
import io0.EnumC20735v;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lo0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0002\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Llo0/z;", "", "v", "d", "n", "o", "m", "k", "l", "r", "s", "u", "t", "p", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "i", "g", "b", "a", "f", "e", "c", "Llo0/z$g;", "Llo0/z$v;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC24615z {

    /* JADX INFO: renamed from: lo0.z$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llo0/z$a;", "Llo0/z$g;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements g {

        /* JADX INFO: renamed from: b */
        public static final int f96220b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public a(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.navAction, ((a) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llo0/z$b;", "Llo0/z$g;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements g {

        /* JADX INFO: renamed from: a */
        public static final b f96222a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: lo0.z$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llo0/z$c;", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC24615z {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        public c(Object event) {
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.event, ((c) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.event, "HeightWeightChanged(event=", ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llo0/z$e;", "", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lm91/u;", "getElement", "()Lm91/u;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC24615z {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        public e(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.event, eVar.event) && AbstractC22676k.m65745e(this.element, eVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llo0/z$f;", "Llo0/z$g;", "", "usState", "intakeResponsesJson", "rescheduleAppointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String usState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String intakeResponsesJson;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String rescheduleAppointmentId;

        public f(String str, String intakeResponsesJson, String str2) {
            AbstractC22676k.m65750j(intakeResponsesJson, "intakeResponsesJson");
            this.usState = str;
            this.intakeResponsesJson = intakeResponsesJson;
            this.rescheduleAppointmentId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIntakeResponsesJson() {
            return this.intakeResponsesJson;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRescheduleAppointmentId() {
            return this.rescheduleAppointmentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUsState() {
            return this.usState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.usState, fVar.usState) && AbstractC22676k.m65745e(this.intakeResponsesJson, fVar.intakeResponsesJson) && AbstractC22676k.m65745e(this.rescheduleAppointmentId, fVar.rescheduleAppointmentId);
        }

        public int hashCode() {
            String str = this.usState;
            int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.intakeResponsesJson);
            String str2 = this.rescheduleAppointmentId;
            return iM30450d + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.rescheduleAppointmentId, ")", AbstractC11895b.m32001t("NavigateToSchedulingForm(usState=", this.usState, ", intakeResponsesJson=", this.intakeResponsesJson, ", rescheduleAppointmentId="));
        }
    }

    /* JADX INFO: renamed from: lo0.z$g */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Llo0/z$g;", "Llo0/z;", "Llo0/z$a;", "Llo0/z$b;", "Llo0/z$f;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC24615z {
    }

    /* JADX INFO: renamed from: lo0.z$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llo0/z$h;", "Llo0/z$v;", "", "intakeResponses", "usState", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String intakeResponses;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String usState;

        public h(String intakeResponses, String usState) {
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
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.intakeResponses, hVar.intakeResponses) && AbstractC22676k.m65745e(this.usState, hVar.usState);
        }

        public int hashCode() {
            return this.usState.hashCode() + (this.intakeResponses.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Save(intakeResponses=", this.intakeResponses, ", usState=", this.usState, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$i */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llo0/z$i;", "Llo0/z$v;", "", "appointmentId", "", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "intakeResponses", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<HealthIntakeResponseItem> intakeResponses;

        public i(String appointmentId, List<HealthIntakeResponseItem> intakeResponses) {
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
        public final List<HealthIntakeResponseItem> m71889b() {
            return this.intakeResponses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.appointmentId, iVar.appointmentId) && AbstractC22676k.m65745e(this.intakeResponses, iVar.intakeResponses);
        }

        public int hashCode() {
            return this.intakeResponses.hashCode() + (this.appointmentId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("SaveHealthIntake(appointmentId=", this.appointmentId, ", intakeResponses=", ")", this.intakeResponses);
        }
    }

    /* JADX INFO: renamed from: lo0.z$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llo0/z$j;", "Llo0/z$v;", "", "appointmentType", "Lio0/u;", "responses", "<init>", "(Ljava/lang/String;Lio0/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lio0/u;", "()Lio0/u;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C20734u responses;

        public j(String appointmentType, C20734u responses) {
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
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.appointmentType, jVar.appointmentType) && AbstractC22676k.m65745e(this.responses, jVar.responses);
        }

        public int hashCode() {
            return this.responses.hashCode() + (this.appointmentType.hashCode() * 31);
        }

        public String toString() {
            return "SavePersonalIntake(appointmentType=" + this.appointmentType + ", responses=" + this.responses + ")";
        }
    }

    /* JADX INFO: renamed from: lo0.z$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llo0/z$k;", "Llo0/z$v;", "", "stateId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String stateId;

        public k(String str) {
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
            return (other instanceof k) && AbstractC22676k.m65745e(this.stateId, ((k) other).stateId);
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

    /* JADX INFO: renamed from: lo0.z$l */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llo0/z$l;", "Llo0/z$v;", "", "", "selectedIds", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> selectedIds;

        public l(List<String> selectedIds) {
            AbstractC22676k.m65750j(selectedIds, "selectedIds");
            this.selectedIds = selectedIds;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m71893a() {
            return this.selectedIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.selectedIds, ((l) other).selectedIds);
        }

        public int hashCode() {
            return this.selectedIds.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("SetMultiSelectSelectedIds(selectedIds=", ")", this.selectedIds);
        }
    }

    /* JADX INFO: renamed from: lo0.z$m */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llo0/z$m;", "Llo0/z$v;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements v {

        /* JADX INFO: renamed from: a */
        public static final m f96240a = new m();

        private m() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return -961424220;
        }

        public String toString() {
            return "Skip";
        }
    }

    /* JADX INFO: renamed from: lo0.z$n */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llo0/z$n;", "Llo0/z$v;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements v {

        /* JADX INFO: renamed from: a */
        public static final n f96241a = new n();

        private n() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        public int hashCode() {
            return -1877799304;
        }

        public String toString() {
            return "StepBack";
        }
    }

    /* JADX INFO: renamed from: lo0.z$o */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llo0/z$o;", "Llo0/z$v;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements v {

        /* JADX INFO: renamed from: a */
        public static final o f96242a = new o();

        private o() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        public int hashCode() {
            return 100127636;
        }

        public String toString() {
            return "StepForward";
        }
    }

    /* JADX INFO: renamed from: lo0.z$p */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llo0/z$p;", "Llo0/z$v;", "", "isSelected", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSelected;

        public p(boolean z4) {
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
            return (other instanceof p) && this.isSelected == ((p) other).isSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleTextEntryCheckbox(isSelected=", ")", this.isSelected);
        }
    }

    /* JADX INFO: renamed from: lo0.z$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llo0/z$r;", "Llo0/z$v;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        public r(String text) {
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
            return (other instanceof r) && AbstractC22676k.m65745e(this.text, ((r) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateMultiSelectTextInput(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$t */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llo0/z$t;", "Llo0/z$v;", "", "textAreaId", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String textAreaId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        public t(String textAreaId, String text) {
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
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.textAreaId, tVar.textAreaId) && AbstractC22676k.m65745e(this.text, tVar.text);
        }

        public int hashCode() {
            return this.text.hashCode() + (this.textAreaId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UpdateTextEntryInput(textAreaId=", this.textAreaId, ", text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.z$u */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llo0/z$u;", "Llo0/z$v;", "Lio0/v;", "type", "<init>", "(Lio0/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio0/v;", "()Lio0/v;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC20735v type;

        public u(EnumC20735v type) {
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
            return (other instanceof u) && this.type == ((u) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "ValidatePersonalIntakeField(type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: lo0.z$v */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Llo0/z$v;", "Llo0/z;", "Llo0/z$d;", "Llo0/z$h;", "Llo0/z$i;", "Llo0/z$j;", "Llo0/z$k;", "Llo0/z$l;", "Llo0/z$m;", "Llo0/z$n;", "Llo0/z$o;", "Llo0/z$p;", "Llo0/z$q;", "Llo0/z$r;", "Llo0/z$s;", "Llo0/z$t;", "Llo0/z$u;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface v extends InterfaceC24615z {
    }

    /* JADX INFO: renamed from: lo0.z$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llo0/z$d;", "Llo0/z$v;", "", "appointmentType", "intakeType", "appointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String appointmentType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String intakeType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String appointmentId;

        public d(String appointmentType, String str, String str2) {
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
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.appointmentType, dVar.appointmentType) && AbstractC22676k.m65745e(this.intakeType, dVar.intakeType) && AbstractC22676k.m65745e(this.appointmentId, dVar.appointmentId);
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

        public /* synthetic */ d(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: lo0.z$q */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llo0/z$q;", "Llo0/z$v;", "", "height", "weight", "Lcom/whoop/domain/model/UnitSystem;", "unit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer height;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer weight;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final UnitSystem unit;

        public q(Integer num, Integer num2, UnitSystem unit) {
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
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.height, qVar.height) && AbstractC22676k.m65745e(this.weight, qVar.weight) && this.unit == qVar.unit;
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
            StringBuilder sbM114684l = AbstractC36095b.m114684l("UpdateHeightWeightSelections(height=", num, ", weight=", num2, ", unit=");
            sbM114684l.append(unitSystem);
            sbM114684l.append(")");
            return sbM114684l.toString();
        }

        public /* synthetic */ q(Integer num, Integer num2, UnitSystem unitSystem, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, unitSystem);
        }
    }

    /* JADX INFO: renamed from: lo0.z$s */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llo0/z$s;", "Llo0/z$v;", "Lio0/v;", "type", "", "newValue", "", "validate", "<init>", "(Lio0/v;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lio0/v;", "b", "()Lio0/v;", "Ljava/lang/String;", "c", "Z", "()Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC20735v type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String newValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean validate;

        public s(EnumC20735v type, String newValue, boolean z4) {
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
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return this.type == sVar.type && AbstractC22676k.m65745e(this.newValue, sVar.newValue) && this.validate == sVar.validate;
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

        public /* synthetic */ s(EnumC20735v enumC20735v, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC20735v, str, (i13 & 4) != 0 ? false : z4);
        }
    }
}
