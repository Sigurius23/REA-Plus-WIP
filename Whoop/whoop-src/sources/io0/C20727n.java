package io0;

import c93.InterfaceC4351m;
import com.whoop.clinicianintheloop.api.SaveVideoSchedulingFormRequest;
import com.whoop.clinicianintheloop.api.VideoSchedulePillModel;
import com.whoop.clinicianintheloop.api.VideoSchedulingDatePicker;
import com.whoop.clinicianintheloop.api.VideoSchedulingFormApi;
import com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h11.EnumC16612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0018B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio0/n;", "Lod1/g;", "Lio0/l;", "Lio0/m;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;Ltr2/n;)V", "", "usState", "rescheduleAppointmentId", "Lec3/l;", "Lio0/n$b;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "selectedTimeSlot", "intakeResponses", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;", "b", "Ltr2/n;", "c", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20727n implements InterfaceC27844g<AbstractC20725l, C20726m> {

    /* JADX INFO: renamed from: c */
    private static final a f77634c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f77635d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final VideoSchedulingFormApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: io0.n$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lio0/n$a;", "", "<init>", "()V", "", "APPOINTMENT_TYPE_SCHEDULED_AHEAD", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io0.n$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/n$b;", "", "<init>", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "g", "b", "f", "e", "d", "a", "Lio0/n$b$a;", "Lio0/n$b$b;", "Lio0/n$b$c;", "Lio0/n$b$d;", "Lio0/n$b$e;", "Lio0/n$b$f;", "Lio0/n$b$g;", "Lio0/n$b$h;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: io0.n$b$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/n$b$a;", "Lio0/n$b;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public static final a f77638a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.n$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/n$b$b;", "Lio0/n$b;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41769b extends b {

            /* JADX INFO: renamed from: a */
            public static final C41769b f77639a = new C41769b();

            private C41769b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.n$b$c */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/n$b$c;", "Lio0/n$b;", "", "selectionDisplay", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String selectionDisplay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String selectionDisplay) {
                super(null);
                AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
                this.selectionDisplay = selectionDisplay;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getSelectionDisplay() {
                return this.selectionDisplay;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.selectionDisplay, ((c) other).selectionDisplay);
            }

            public int hashCode() {
                return this.selectionDisplay.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("PillSelected(selectionDisplay=", this.selectionDisplay, ")");
            }
        }

        /* JADX INFO: renamed from: io0.n$b$d */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/n$b$d;", "Lio0/n$b;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a */
            public static final d f77641a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.n$b$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/n$b$e;", "Lio0/n$b;", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: b */
            public static final int f77642b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C9598e navigationAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C9598e navigationAction) {
                super(null);
                AbstractC22676k.m65750j(navigationAction, "navigationAction");
                this.navigationAction = navigationAction;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C9598e getNavigationAction() {
                return this.navigationAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.navigationAction, ((e) other).navigationAction);
            }

            public int hashCode() {
                return this.navigationAction.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106650i("SaveSuccess(navigationAction=", this.navigationAction, ")");
            }
        }

        /* JADX INFO: renamed from: io0.n$b$f */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/n$b$f;", "Lio0/n$b;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f extends b {

            /* JADX INFO: renamed from: a */
            public static final f f77644a = new f();

            private f() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.n$b$g */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio0/n$b$g;", "Lio0/n$b;", "", "timeSlot", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String timeSlot;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String timeSlot) {
                super(null);
                AbstractC22676k.m65750j(timeSlot, "timeSlot");
                this.timeSlot = timeSlot;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getTimeSlot() {
                return this.timeSlot;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.timeSlot, ((g) other).timeSlot);
            }

            public int hashCode() {
                return this.timeSlot.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("SlotSelected(timeSlot=", this.timeSlot, ")");
            }
        }

        /* JADX INFO: renamed from: io0.n$b$h */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/n$b$h;", "Lio0/n$b;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "form", "<init>", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final VideoSchedulingFormResponse form;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(VideoSchedulingFormResponse form) {
                super(null);
                AbstractC22676k.m65750j(form, "form");
                this.form = form;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final VideoSchedulingFormResponse getForm() {
                return this.form;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && AbstractC22676k.m65745e(this.form, ((h) other).form);
            }

            public int hashCode() {
                return this.form.hashCode();
            }

            public String toString() {
                return "Success(form=" + this.form + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: io0.n$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$getSchedulingForm$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {131, 132, 139, 140}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/n$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f77647E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f77648F;

        /* JADX INFO: renamed from: w */
        Object f77649w;

        /* JADX INFO: renamed from: x */
        int f77650x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f77651y;

        /* JADX INFO: renamed from: io0.n$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$getSchedulingForm$1$response$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f77653w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20727n f77654x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f77655y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f77656z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20727n c20727n, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f77654x = c20727n;
                this.f77655y = str;
                this.f77656z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f77654x, this.f77655y, this.f77656z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f77653w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                VideoSchedulingFormApi videoSchedulingFormApi = this.f77654x.api;
                String str = this.f77655y;
                String str2 = this.f77656z;
                if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                    str2 = null;
                }
                this.f77653w = 1;
                Object schedulingForm = videoSchedulingFormApi.getSchedulingForm(str, str2, this);
                return schedulingForm == enumC31071a ? enumC31071a : schedulingForm;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super VideoSchedulingFormResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77647E = str;
            this.f77648F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C20727n.this.new c(this.f77647E, this.f77648F, interfaceC30057d);
            cVar.f77651y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0088  */
        /* JADX WARN: Code duplicated, block: B:27:0x008c  */
        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f77651y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f77650x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f77649w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L9b
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L68
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L43
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                io0.n$b$b r0 = io0.C20727n.b.C41769b.f77639a
                r13.f77651y = r8
                r13.f77650x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L43
                goto L9a
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                io0.n r2 = io0.C20727n.this
                tr2.n r2 = io0.C20727n.m56933d(r2)
                io0.n$c$a r4 = new io0.n$c$a
                io0.n r3 = io0.C20727n.this
                java.lang.String r6 = r13.f77647E
                java.lang.String r7 = r13.f77648F
                r4.<init>(r3, r6, r7, r12)
                r13.f77651y = r8
                r13.f77650x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to fetch clinician video scheduling form"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L68
                goto L9a
            L68:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L88
                io0.n$b$h r1 = new io0.n$b$h
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse r0 = (com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse) r0
                r1.<init>(r0)
                r13.f77651y = r12
                r13.f77649w = r12
                r13.f77650x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L9b
                goto L9a
            L88:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L9e
                io0.n$b$a r0 = io0.C20727n.b.a.f77638a
                r13.f77651y = r12
                r13.f77649w = r12
                r13.f77650x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L9b
            L9a:
                return r9
            L9b:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L9e:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io0.C20727n.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io0.n$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77657w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77658x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77659y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20727n f77660z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C20727n c20727n) {
            super(3, interfaceC30057d);
            this.f77660z = c20727n;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC20725l abstractC20725l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f77660z);
            dVar.f77658x = interfaceC13062m;
            dVar.f77659y = abstractC20725l;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM56937h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77657w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77658x;
                AbstractC20725l abstractC20725l = (AbstractC20725l) this.f77659y;
                if (abstractC20725l instanceof AbstractC20725l.a) {
                    AbstractC20725l.a aVar = (AbstractC20725l.a) abstractC20725l;
                    interfaceC13058lM56937h = this.f77660z.m56936g(aVar.getUsState(), aVar.getRescheduleAppointmentId());
                } else if (abstractC20725l instanceof AbstractC20725l.c) {
                    interfaceC13058lM56937h = new C13084s1(new e(abstractC20725l, null));
                } else if (abstractC20725l instanceof AbstractC20725l.d) {
                    interfaceC13058lM56937h = new C13084s1(new f(abstractC20725l, null));
                } else {
                    if (!(abstractC20725l instanceof AbstractC20725l.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC20725l.b bVar = (AbstractC20725l.b) abstractC20725l;
                    interfaceC13058lM56937h = this.f77660z.m56937h(bVar.getUsState(), bVar.getSelectedTimeSlot(), bVar.getIntakeResponses(), bVar.getRescheduleAppointmentId());
                }
                this.f77658x = null;
                this.f77659y = null;
                this.f77657w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM56937h, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC20725l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io0.n$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$1$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/n$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f77661w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77662x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC20725l f77663y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC20725l abstractC20725l, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77663y = abstractC20725l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f77663y, interfaceC30057d);
            eVar.f77662x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77662x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77661w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b.c cVar = new b.c(((AbstractC20725l.c) this.f77663y).getSelectionDisplay());
                this.f77662x = null;
                this.f77661w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io0.n$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$1$2", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/n$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f77664w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77665x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC20725l f77666y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC20725l abstractC20725l, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77666y = abstractC20725l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f77666y, interfaceC30057d);
            fVar.f77665x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77665x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77664w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b.g gVar = new b.g(((AbstractC20725l.d) this.f77666y).getTimeSlot());
                this.f77665x = null;
                this.f77664w = 1;
                if (interfaceC13062m.emit(gVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io0.n$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$2", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lio0/m;", "previousState", "Lio0/n$b;", "internal", "<anonymous>", "(Lio0/m;Lio0/n$b;)Lio0/m;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77667w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f77668x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77669y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20726m c20726m, b bVar, InterfaceC30057d<? super C20726m> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f77668x = c20726m;
            gVar.f77669y = bVar;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String dateDisplay;
            C20726m c20726m = (C20726m) this.f77668x;
            b bVar = (b) this.f77669y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f77667w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(bVar, b.C41769b.f77639a)) {
                return C20726m.m56925b(c20726m, C20722i.f77618a, null, null, null, null, 14, null);
            }
            Object obj2 = null;
            if (bVar instanceof b.h) {
                VideoSchedulingFormResponse form = ((b.h) bVar).getForm();
                VideoSchedulingDatePicker schedulingDatePicker = form.getFormContent().getSchedulingDatePicker();
                for (Object obj3 : schedulingDatePicker.getSchedulingDatePickerItems()) {
                    if (((VideoSchedulePillModel) obj3).getStyle() == EnumC16612g.HAS_APPOINTMENT) {
                        obj2 = obj3;
                        break;
                    }
                }
                VideoSchedulePillModel videoSchedulePillModel = (VideoSchedulePillModel) obj2;
                if (videoSchedulePillModel == null || (dateDisplay = videoSchedulePillModel.getSelectionDisplay()) == null) {
                    dateDisplay = schedulingDatePicker.getDateDisplay();
                }
                return c20726m.m56926a(null, form, dateDisplay, null, null);
            }
            if (AbstractC22676k.m65745e(bVar, b.a.f77638a)) {
                return c20726m.m56926a(C20723j.f77619a, null, null, null, null);
            }
            if (!(bVar instanceof b.c)) {
                if (!(bVar instanceof b.g)) {
                    if (AbstractC22676k.m65745e(bVar, b.f.f77644a)) {
                        return C20726m.m56925b(c20726m, C20724k.f77620a, null, null, null, null, 14, null);
                    }
                    if (bVar instanceof b.e) {
                        return C20726m.m56925b(c20726m, null, null, null, null, ((b.e) bVar).getNavigationAction(), 15, null);
                    }
                    if (AbstractC22676k.m65745e(bVar, b.d.f77641a)) {
                        return C20726m.m56925b(c20726m, C20723j.f77619a, null, null, null, null, 14, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (c20726m.getResponse() != null) {
                    b.g gVar = (b.g) bVar;
                    return C20726m.m56925b(c20726m, null, null, null, AbstractC22676k.m65745e(c20726m.getSelectedTimeSlot(), gVar.getTimeSlot()) ? null : gVar.getTimeSlot(), null, 7, null);
                }
            } else if (c20726m.getResponse() != null) {
                return C20726m.m56925b(c20726m, null, null, ((b.c) bVar).getSelectionDisplay(), null, null, 3, null);
            }
            return c20726m;
        }
    }

    /* JADX INFO: renamed from: io0.n$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$saveSchedulingForm$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {150, 152, 160, 174, 175}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio0/n$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f77670E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f77671F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f77672G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C20727n f77673H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f77674I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f77675J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f77676K;

        /* JADX INFO: renamed from: w */
        Object f77677w;

        /* JADX INFO: renamed from: x */
        Object f77678x;

        /* JADX INFO: renamed from: y */
        Object f77679y;

        /* JADX INFO: renamed from: z */
        int f77680z;

        /* JADX INFO: renamed from: io0.n$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$saveSchedulingForm$1$response$1", m100430f = "ClinicianVideoSchedulingFormInteractor.kt", m100431l = {162, 167}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/navigation/e;", "<anonymous>", "()Lcom/whoop/navigation/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f77681w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f77682x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C20727n f77683y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ SaveVideoSchedulingFormRequest f77684z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, C20727n c20727n, SaveVideoSchedulingFormRequest saveVideoSchedulingFormRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f77682x = str;
                this.f77683y = c20727n;
                this.f77684z = saveVideoSchedulingFormRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f77682x, this.f77683y, this.f77684z, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            
                if (r5 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
            
                if (r5 == r0) goto L19;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f77681w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L4c
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L36
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    java.lang.String r5 = r4.f77682x
                    if (r5 == 0) goto L39
                    io0.n r5 = r4.f77683y
                    com.whoop.clinicianintheloop.api.VideoSchedulingFormApi r5 = io0.C20727n.m56932c(r5)
                    java.lang.String r1 = r4.f77682x
                    com.whoop.clinicianintheloop.api.SaveVideoSchedulingFormRequest r2 = r4.f77684z
                    r4.f77681w = r3
                    java.lang.Object r5 = r5.rescheduleSchedulingForm(r1, r2, r4)
                    if (r5 != r0) goto L36
                    goto L4b
                L36:
                    com.whoop.navigation.e r5 = (com.whoop.navigation.C9598e) r5
                    return r5
                L39:
                    io0.n r5 = r4.f77683y
                    com.whoop.clinicianintheloop.api.VideoSchedulingFormApi r5 = io0.C20727n.m56932c(r5)
                    com.whoop.clinicianintheloop.api.SaveVideoSchedulingFormRequest r1 = r4.f77684z
                    r4.f77681w = r2
                    java.lang.String r2 = "SCHEDULED_AHEAD"
                    java.lang.Object r5 = r5.saveSchedulingForm(r2, r1, r4)
                    if (r5 != r0) goto L4c
                L4b:
                    return r0
                L4c:
                    com.whoop.navigation.e r5 = (com.whoop.navigation.C9598e) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: io0.C20727n.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C9598e> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C20727n c20727n, String str2, String str3, String str4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77672G = str;
            this.f77673H = c20727n;
            this.f77674I = str2;
            this.f77675J = str3;
            this.f77676K = str4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f77672G, this.f77673H, this.f77674I, this.f77675J, this.f77676K, interfaceC30057d);
            hVar.f77671F = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            InterfaceC34385a interfaceC34385a;
            b.d dVar;
            b.e eVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77671F;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77670E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b.f fVar = b.f.f77644a;
                this.f77671F = interfaceC13062m;
                this.f77670E = 1;
                if (interfaceC13062m.emit(fVar, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                } else if (i13 == 3) {
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                } else {
                    if (i13 != 4 && i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                eVar = new b.e((C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
                this.f77671F = null;
                this.f77677w = null;
                this.f77678x = null;
                this.f77679y = null;
                this.f77670E = 4;
                if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = b.d.f77641a;
            this.f77671F = null;
            this.f77677w = null;
            this.f77678x = null;
            this.f77679y = null;
            this.f77670E = 5;
            if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
            List<JsonObject> listM57058a = AbstractC20739z.m57058a(this.f77672G, this.f77673H.logger);
            if (listM57058a == null) {
                b.d dVar2 = b.d.f77641a;
                this.f77671F = null;
                this.f77677w = null;
                this.f77680z = 0;
                this.f77670E = 2;
                if (interfaceC13062m.emit(dVar2, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                SaveVideoSchedulingFormRequest saveVideoSchedulingFormRequest = new SaveVideoSchedulingFormRequest(this.f77674I, this.f77675J, listM57058a);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f77673H.logger;
                a aVar = new a(this.f77676K, this.f77673H, saveVideoSchedulingFormRequest, null);
                this.f77671F = interfaceC13062m;
                this.f77677w = null;
                this.f77678x = null;
                this.f77670E = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to save clinician video scheduling form", aVar, this, 2, null);
                if (objM108729b != enumC31071a) {
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        eVar = new b.e((C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
                        this.f77671F = null;
                        this.f77677w = null;
                        this.f77678x = null;
                        this.f77679y = null;
                        this.f77670E = 4;
                        if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = b.d.f77641a;
                        this.f77671F = null;
                        this.f77677w = null;
                        this.f77678x = null;
                        this.f77679y = null;
                        this.f77670E = 5;
                        if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            }
            return enumC31071a;
        }
    }

    public C20727n(VideoSchedulingFormApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m56936g(String usState, String rescheduleAppointmentId) {
        return new C13084s1(new c(usState, rescheduleAppointmentId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m56937h(String usState, String selectedTimeSlot, String intakeResponses, String rescheduleAppointmentId) {
        return new C13084s1(new h(intakeResponses, this, selectedTimeSlot, usState, rescheduleAppointmentId, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C20726m(null, null, null, null, null, 31, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new g(null));
    }

    public /* synthetic */ C20727n(VideoSchedulingFormApi videoSchedulingFormApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoSchedulingFormApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ClinicianVideoSchedulingFormInteractor") : interfaceC34116n);
    }
}
