package oo1;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qw2.InterfaceC30693a;
import r80.AbstractC31061c;
import so1.C32834r;

/* JADX INFO: renamed from: oo1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m65681d2 = {"Loo1/e;", "", "<init>", "()V", "d", "e", "k", "m", "g", "f", "c", "j", "a", "b", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Loo1/e$a;", "Loo1/e$b;", "Loo1/e$c;", "Loo1/e$d;", "Loo1/e$e;", "Loo1/e$f;", "Loo1/e$g;", "Loo1/e$h;", "Loo1/e$i;", "Loo1/e$j;", "Loo1/e$k;", "Loo1/e$l;", "Loo1/e$m;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28059e {

    /* JADX INFO: renamed from: oo1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/e$a;", "Loo1/e;", "Lqw2/a;", "actionDomainAction", "<init>", "(Lqw2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqw2/a;", "()Lqw2/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC30693a actionDomainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30693a actionDomainAction) {
            super(null);
            AbstractC22676k.m65750j(actionDomainAction, "actionDomainAction");
            this.actionDomainAction = actionDomainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC30693a getActionDomainAction() {
            return this.actionDomainAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.actionDomainAction, ((a) other).actionDomainAction);
        }

        public int hashCode() {
            return this.actionDomainAction.hashCode();
        }

        public String toString() {
            return "BackendDrivenAction(actionDomainAction=" + this.actionDomainAction + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/e$b;", "Loo1/e;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC28059e {

        /* JADX INFO: renamed from: b */
        public static final int f113276b = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final GenericInteraction interaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GenericInteraction interaction) {
            super(null);
            AbstractC22676k.m65750j(interaction, "interaction");
            this.interaction = interaction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInteraction getInteraction() {
            return this.interaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.interaction, ((b) other).interaction);
        }

        public int hashCode() {
            return this.interaction.hashCode();
        }

        public String toString() {
            return "BffInteraction(interaction=" + this.interaction + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/e$c;", "Loo1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC28059e {

        /* JADX INFO: renamed from: a */
        public static final c f113278a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.e$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Loo1/e$d;", "Loo1/e;", "", "id", "", HttpHeaders.DATE, "selectedDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Loo1/e$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "e", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String selectedDate;

        public d(Integer num, String str, String str2) {
            super(null);
            this.id = num;
            this.date = str;
            this.selectedDate = str2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m84747b(d dVar, Integer num, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                num = dVar.id;
            }
            if ((i13 & 2) != 0) {
                str = dVar.date;
            }
            if ((i13 & 4) != 0) {
                str2 = dVar.selectedDate;
            }
            return dVar.m84748a(num, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final d m84748a(Integer id4, String date, String selectedDate) {
            return new d(id4, date, selectedDate);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && AbstractC22676k.m65745e(this.date, dVar.date) && AbstractC22676k.m65745e(this.selectedDate, dVar.selectedDate);
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.date;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.selectedDate;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.selectedDate, ")", AbstractC31061c.m95643s("LoadCalendar(id=", ", date=", this.id, this.date, ", selectedDate="));
        }

        public /* synthetic */ d(Integer num, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, (i13 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: oo1.e$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Loo1/e$e;", "Loo1/e;", "", HttpHeaders.DATE, "", "doPoll", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Boolean doPoll;

        public e(String str, Boolean bool) {
            super(null);
            this.date = str;
            this.doPoll = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getDoPoll() {
            return this.doPoll;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.date, eVar.date) && AbstractC22676k.m65745e(this.doPoll, eVar.doPoll);
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.doPoll;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LoadData(date=" + this.date + ", doPoll=" + this.doPoll + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/e$f;", "Loo1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC28059e {

        /* JADX INFO: renamed from: a */
        public static final f f113284a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.e$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/e$g;", "Loo1/e;", "Lso1/r;", "data", "<init>", "(Lso1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lso1/r;", "()Lso1/r;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32834r data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C32834r data) {
            super(null);
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32834r getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.data, ((g) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "LogPeriod(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/e$h;", "Loo1/e;", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/models/modal/DecodedGenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "()Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC28059e {

        /* JADX INFO: renamed from: b */
        public static final int f113286b = DecodedGenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DecodedGenericInteraction interaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DecodedGenericInteraction interaction) {
            super(null);
            AbstractC22676k.m65750j(interaction, "interaction");
            this.interaction = interaction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DecodedGenericInteraction getInteraction() {
            return this.interaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.interaction, ((h) other).interaction);
        }

        public int hashCode() {
            return this.interaction.hashCode();
        }

        public String toString() {
            return "NaturalCyclesCardTapped(interaction=" + this.interaction + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/e$i;", "Loo1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC28059e {

        /* JADX INFO: renamed from: a */
        public static final i f113288a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.e$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/e$j;", "Loo1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC28059e {

        /* JADX INFO: renamed from: a */
        public static final j f113289a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.e$k */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Loo1/e$k;", "Loo1/e;", "", "doPoll", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean doPoll;

        public k(boolean z4) {
            super(null);
            this.doPoll = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDoPoll() {
            return this.doPoll;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.doPoll == ((k) other).doPoll;
        }

        public int hashCode() {
            return Boolean.hashCode(this.doPoll);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Refresh(doPoll=", ")", this.doPoll);
        }
    }

    /* JADX INFO: renamed from: oo1.e$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/e$l;", "Loo1/e;", "Loo1/f;", "domainState", "<init>", "(Loo1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo1/f;", "()Loo1/f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC28059e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC28060f domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC28060f domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC28060f getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.domainState, ((l) other).domainState);
        }

        public int hashCode() {
            return this.domainState.hashCode();
        }

        public String toString() {
            return "SetDomainState(domainState=" + this.domainState + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.e$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/e$m;", "Loo1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC28059e {

        /* JADX INFO: renamed from: a */
        public static final m f113292a = new m();

        private m() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC28059e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28059e() {
    }
}
