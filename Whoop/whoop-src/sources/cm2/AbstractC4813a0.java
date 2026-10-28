package cm2;

import am2.C1037p0;
import com.mapbox.common.HttpHeaders;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vl2.EnumC36106a;

/* JADX INFO: renamed from: cm2.a0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0004\u0005\r\f\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcm2/a0;", "Lfy1/k;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "screenTag", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "c", "d", "Lcm2/a0$b;", "Lcm2/a0$c;", "Lcm2/a0$d;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4813a0 implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cm2.a0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcm2/a0$a;", "", "<init>", "()V", "Lor2/h0;", "graphKey", "", "a", "(Lor2/h0;)Ljava/lang/String;", "SCREEN_TAG", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m15193a(EnumC28166h0 graphKey) {
            AbstractC22676k.m65750j(graphKey, "graphKey");
            return AbstractC11266d.m30461o("trends:", graphKey.name());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: cm2.a0$d */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, m65681d2 = {"Lcm2/a0$d;", "Lcm2/a0;", "Lam2/p0;", "viewState", "<init>", "(Lam2/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lam2/p0;", "()Lam2/p0;", "Lor2/h0;", "b", "()Lor2/h0;", "graphKey", "a", "screenTag", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC4813a0 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C1037p0 viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1037p0 viewState) {
            super(null);
            AbstractC22676k.m65750j(viewState, "viewState");
            this.viewState = viewState;
        }

        @Override // cm2.AbstractC4813a0
        /* JADX INFO: renamed from: a */
        public String getScreenTag() {
            return AbstractC4813a0.INSTANCE.m15193a(m15197b());
        }

        /* JADX INFO: renamed from: b */
        public EnumC28166h0 m15197b() {
            return this.viewState.getMetaData().getGraphKey();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1037p0 getViewState() {
            return this.viewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.viewState, ((d) other).viewState);
        }

        public int hashCode() {
            return this.viewState.hashCode();
        }

        public String toString() {
            return "SuccessV3(viewState=" + this.viewState + ")";
        }
    }

    public /* synthetic */ AbstractC4813a0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getScreenTag();

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof c) {
            return ScreenState.LOADING;
        }
        if (this instanceof b) {
            return ScreenState.ERROR;
        }
        if (this instanceof d) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC4813a0() {
    }

    /* JADX INFO: renamed from: cm2.a0$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m65681d2 = {"Lcm2/a0$c;", "Lcm2/a0;", "Lor2/h0;", "graphKey", "", "screenTag", "<init>", "(Lor2/h0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lor2/h0;", "getGraphKey", "()Lor2/h0;", "d", "Ljava/lang/String;", "a", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4813a0 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String screenTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC28166h0 graphKey, String screenTag) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(screenTag, "screenTag");
            this.graphKey = graphKey;
            this.screenTag = screenTag;
        }

        @Override // cm2.AbstractC4813a0
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getScreenTag() {
            return this.screenTag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.graphKey == cVar.graphKey && AbstractC22676k.m65745e(this.screenTag, cVar.screenTag);
        }

        public int hashCode() {
            return this.screenTag.hashCode() + (this.graphKey.hashCode() * 31);
        }

        public String toString() {
            return "Loading(graphKey=" + this.graphKey + ", screenTag=" + this.screenTag + ")";
        }

        public /* synthetic */ c(EnumC28166h0 enumC28166h0, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC28166h0, (i13 & 2) != 0 ? AbstractC4813a0.INSTANCE.m15193a(enumC28166h0) : str);
        }
    }

    /* JADX INFO: renamed from: cm2.a0$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, m65681d2 = {"Lcm2/a0$b;", "Lcm2/a0;", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", HttpHeaders.DATE, "screenTag", "<init>", "(Lor2/h0;Lvl2/a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lor2/h0;", "d", "()Lor2/h0;", "Lvl2/a;", "()Lvl2/a;", "e", "Ljava/lang/String;", "b", "f", "a", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4813a0 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String screenTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC28166h0 graphKey, EnumC36106a duration, String date, String screenTag) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(screenTag, "screenTag");
            this.graphKey = graphKey;
            this.duration = duration;
            this.date = date;
            this.screenTag = screenTag;
        }

        @Override // cm2.AbstractC4813a0
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getScreenTag() {
            return this.screenTag;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.graphKey == bVar.graphKey && this.duration == bVar.duration && AbstractC22676k.m65745e(this.date, bVar.date) && AbstractC22676k.m65745e(this.screenTag, bVar.screenTag);
        }

        public int hashCode() {
            return this.screenTag.hashCode() + AbstractC11266d.m30450d((this.duration.hashCode() + (this.graphKey.hashCode() * 31)) * 31, 31, this.date);
        }

        public String toString() {
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str = this.date;
            String str2 = this.screenTag;
            StringBuilder sb4 = new StringBuilder("ErrorV3(graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", date=");
            return AbstractC11266d.m30464r(sb4, str, ", screenTag=", str2, ")");
        }

        public /* synthetic */ b(EnumC28166h0 enumC28166h0, EnumC36106a enumC36106a, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC28166h0, enumC36106a, str, (i13 & 8) != 0 ? AbstractC4813a0.INSTANCE.m15193a(enumC28166h0) : str2);
        }
    }
}
