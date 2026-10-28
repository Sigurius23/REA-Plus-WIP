package hp1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hp1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m65681d2 = {"Lhp1/h;", "", "<init>", "()V", "d", "f", "l", "j", "i", "c", "a", "b", "g", "k", "m", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lhp1/h$a;", "Lhp1/h$b;", "Lhp1/h$c;", "Lhp1/h$d;", "Lhp1/h$e;", "Lhp1/h$f;", "Lhp1/h$g;", "Lhp1/h$h;", "Lhp1/h$i;", "Lhp1/h$j;", "Lhp1/h$k;", "Lhp1/h$l;", "Lhp1/h$m;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17548h {

    /* JADX INFO: renamed from: hp1.h$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$a;", "Lhp1/h;", "Lhp1/a;", "state", "<init>", "(Lhp1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/a;", "()Lhp1/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC17548h {

        /* JADX INFO: renamed from: b */
        public static final int f67915b = TextResource.$stable | AbstractC22403o.f87638a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17541a state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17541a state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17541a getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.state, ((a) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "CongratulationsViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$b;", "Lhp1/h;", "Lhp1/b;", "state", "<init>", "(Lhp1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/b;", "()Lhp1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC17548h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17542b state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C17542b state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17542b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.state, ((b) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "DateInputViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lhp1/h$c;", "Lhp1/h;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", HMSTrackSource.SCREEN, "", "id", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "getScreen", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "b", "Ljava/lang/String;", "getId", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC17548h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PostPartumScreenType screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PostPartumScreenType screen, String id4) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(id4, "id");
            this.screen = screen;
            this.id = id4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.screen == cVar.screen && AbstractC22676k.m65745e(this.id, cVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return "Error(screen=" + this.screen + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhp1/h$d;", "Lhp1/h;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC17548h {

        /* JADX INFO: renamed from: a */
        public static final d f67920a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hp1.h$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$e;", "Lhp1/h;", "Lhp1/d;", "state", "<init>", "(Lhp1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/d;", "()Lhp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC17548h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17544d state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C17544d state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17544d getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.state, ((e) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "MultiSelectViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhp1/h$f;", "Lhp1/h;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC17548h {

        /* JADX INFO: renamed from: a */
        public static final f f67922a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hp1.h$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$g;", "Lhp1/h;", "Lhp1/e;", "state", "<init>", "(Lhp1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/e;", "()Lhp1/e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC17548h {

        /* JADX INFO: renamed from: b */
        public static final int f67923b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17545e state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C17545e state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17545e getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.state, ((g) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "NumberPickerViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$h;", "Lhp1/h;", "Lhp1/i;", "state", "<init>", "(Lhp1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/i;", "()Lhp1/i;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC17548h {

        /* JADX INFO: renamed from: b */
        public static final int f67925b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17549i state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C17549i state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17549i getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.state, ((h) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "PregnancyNameViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lhp1/h$i;", "Lhp1/h;", "", "isStealthModeOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC17548h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeOn;

        public i(boolean z4) {
            super(null);
            this.isStealthModeOn = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStealthModeOn() {
            return this.isStealthModeOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.isStealthModeOn == ((i) other).isStealthModeOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStealthModeOn);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SaveError(isStealthModeOn=", ")", this.isStealthModeOn);
        }
    }

    /* JADX INFO: renamed from: hp1.h$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhp1/h$j;", "Lhp1/h;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC17548h {

        /* JADX INFO: renamed from: a */
        public static final j f67928a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hp1.h$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$k;", "Lhp1/h;", "Lhp1/j;", "state", "<init>", "(Lhp1/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/j;", "()Lhp1/j;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC17548h {

        /* JADX INFO: renamed from: b */
        public static final int f67929b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17550j state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C17550j state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17550j getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.state, ((k) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "SaveViewState(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: hp1.h$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhp1/h$l;", "Lhp1/h;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC17548h {

        /* JADX INFO: renamed from: a */
        public static final l f67931a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hp1.h$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhp1/h$m;", "Lhp1/h;", "Lhp1/m;", "state", "<init>", "(Lhp1/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhp1/m;", "()Lhp1/m;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC17548h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17553m state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C17553m state) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17553m getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && AbstractC22676k.m65745e(this.state, ((m) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "TextInputViewState(state=" + this.state + ")";
        }
    }

    public /* synthetic */ AbstractC17548h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17548h() {
    }
}
