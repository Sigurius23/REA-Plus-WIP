package hw0;

import c13.AbstractC3855a;
import com.whoop.core.details.view.InterfaceC6471b;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import d13.AbstractC11478a;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iw0.C20972h0;
import iw0.C20980l0;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDateTime;
import ow0.C28431a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;
import vv0.AbstractC36529b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: hw0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lhw0/d;", "Lfy1/k;", "", "a", "()Ljava/lang/String;", "screenTag", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "c", "d", "Lhw0/d$b;", "Lhw0/d$c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17699d extends InterfaceC14875k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f68724a;

    /* JADX INFO: renamed from: hw0.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lhw0/d$a;", "", "<init>", "()V", "Lhw0/a;", "activityType", "", "a", "(Lhw0/a;)Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f68724a = new Companion();

        /* JADX INFO: renamed from: hw0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41719a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f68725a;

            static {
                int[] iArr = new int[EnumC17696a.values().length];
                try {
                    iArr[EnumC17696a.CARDIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17696a.RECOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f68725a = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m50615a(EnumC17696a activityType) {
            AbstractC22676k.m65750j(activityType, "activityType");
            int i13 = C41719a.f68725a[activityType.ordinal()];
            if (i13 != 1) {
                return i13 != 2 ? "core_details" : "core_details_recovery";
            }
            return "core_details_cardio";
        }
    }

    /* JADX INFO: renamed from: hw0.d$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lhw0/d$d;", "", "Lorg/joda/time/LocalDateTime;", "startDate", "endDate", "", "activityInternalName", "activityId", "activityType", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "e", "()Lorg/joda/time/LocalDateTime;", "b", "d", "c", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime startDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDateTime endDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityType;

        public d(LocalDateTime startDate, LocalDateTime endDate, String activityInternalName, String activityId, String activityType) {
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.startDate = startDate;
            this.endDate = endDate;
            this.activityInternalName = activityInternalName;
            this.activityId = activityId;
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDateTime getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDateTime getStartDate() {
            return this.startDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.startDate, dVar.startDate) && AbstractC22676k.m65745e(this.endDate, dVar.endDate) && AbstractC22676k.m65745e(this.activityInternalName, dVar.activityInternalName) && AbstractC22676k.m65745e(this.activityId, dVar.activityId) && AbstractC22676k.m65745e(this.activityType, dVar.activityType);
        }

        public int hashCode() {
            return this.activityType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.endDate.hashCode() + (this.startDate.hashCode() * 31)) * 31, 31, this.activityInternalName), 31, this.activityId);
        }

        public String toString() {
            LocalDateTime localDateTime = this.startDate;
            LocalDateTime localDateTime2 = this.endDate;
            String str = this.activityInternalName;
            String str2 = this.activityId;
            String str3 = this.activityType;
            StringBuilder sb4 = new StringBuilder("NavigateToEditActivityScreen(startDate=");
            sb4.append(localDateTime);
            sb4.append(", endDate=");
            sb4.append(localDateTime2);
            sb4.append(", activityInternalName=");
            AbstractC11266d.m30444B(sb4, str, ", activityId=", str2, ", activityType=");
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: a */
    String getScreenTag();

    @Override // fy1.InterfaceC14875k
    default ScreenState getState() {
        if (!(this instanceof c)) {
            if (this instanceof b) {
                return ScreenState.SUCCESS;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC33208p0 type = ((c) this).getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        if (type instanceof AbstractC33208p0.b) {
            return ScreenState.ERROR;
        }
        return type instanceof AbstractC33208p0.h ? ScreenState.SUCCESS : ScreenState.OTHER;
    }

    /* JADX INFO: renamed from: hw0.d$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u00011B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b.\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0013¨\u00062"}, m65681d2 = {"Lhw0/d$c;", "Lhw0/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lcom/whoop/core/details/view/b;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "", "screenTag", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/core/details/view/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/core/details/view/b;Lcom/whoop/core/details/view/b;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/core/details/view/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/core/details/view/b;Lcom/whoop/core/details/view/b;Ljava/lang/String;)Lhw0/d$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsz0/p0;", "p", "()Lsz0/p0;", "c", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "d", "l", "e", "Lcom/whoop/core/details/view/b;", "k", "()Lcom/whoop/core/details/view/b;", "f", "n", "g", "m", "j", "i", "Ljava/lang/String;", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC17699d {

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: k */
        public static final int f68742k = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: l */
        private static final c f68743l = new c(AbstractC33208p0.c.f138471e, null, null, null, null, null, null, null, 254, null);

        /* JADX INFO: renamed from: m */
        private static final c f68744m;

        /* JADX INFO: renamed from: n */
        private static final c f68745n;

        /* JADX INFO: renamed from: o */
        private static final c f68746o;

        /* JADX INFO: renamed from: p */
        private static final c f68747p;

        /* JADX INFO: renamed from: q */
        private static final c f68748q;

        /* JADX INFO: renamed from: r */
        private static final c f68749r;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC6471b primaryButtonClickEvent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC6471b secondaryButtonClickEvent;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC6471b followUpEvent;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String screenTag;

        /* JADX INFO: renamed from: hw0.d$c$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lhw0/d$c$a;", "", "<init>", "()V", "Lhw0/d$c;", "loading", "Lhw0/d$c;", "c", "()Lhw0/d$c;", "networkError", "d", "requestFailed", "e", "deleting", "b", "deleted", "a", "saved", "f", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final c m50645a() {
                return c.f68747p;
            }

            /* JADX INFO: renamed from: b */
            public final c m50646b() {
                return c.f68746o;
            }

            /* JADX INFO: renamed from: c */
            public final c m50647c() {
                return c.f68743l;
            }

            /* JADX INFO: renamed from: d */
            public final c m50648d() {
                return c.f68744m;
            }

            /* JADX INFO: renamed from: e */
            public final c m50649e() {
                return c.f68745n;
            }

            /* JADX INFO: renamed from: f */
            public final c m50650f() {
                return c.f68749r;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            f68744m = new c(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC36529b.f156342m), false, objArr, 6, 0 == true ? 1 : 0), null, AbstractC8693b.m21277k(AbstractC36529b.f156331b), objArr2, AbstractC8693b.m21277k(AbstractC36529b.f156330a), objArr3, objArr4, null, 234, null);
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            f68745n = new c(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC36529b.f156344o), false, null, 6, 0 == true ? 1 : 0), AbstractC8693b.m21277k(AbstractC36529b.f156343n), AbstractC8693b.m21277k(AbstractC36529b.f156331b), objArr7, AbstractC8693b.m21277k(AbstractC36529b.f156330a), objArr5, objArr6, null, 232, null);
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            f68746o = new c(AbstractC33208p0.a.f138465e, null, 0 == true ? 1 : 0, null, objArr8, objArr9, 0 == true ? 1 : 0, null, 254, null);
            Object[] objArr10 = 0 == true ? 1 : 0;
            TextResource textResource = null;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            f68747p = new c(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC36529b.f156338i), 0L, objArr10, 6, 0 == true ? 1 : 0), null, textResource, null, objArr11, null, objArr12, null, 254, null);
            Object[] objArr13 = 0 == true ? 1 : 0;
            Object[] objArr14 = 0 == true ? 1 : 0;
            f68748q = new c(AbstractC33208p0.f.f138478e, textResource, 0 == true ? 1 : 0, objArr13, 0 == true ? 1 : 0, objArr14, 0 == true ? 1 : 0, null, 254, null);
            Object[] objArr15 = 0 == true ? 1 : 0;
            Object[] objArr16 = 0 == true ? 1 : 0;
            Object[] objArr17 = 0 == true ? 1 : 0;
            Object[] objArr18 = 0 == true ? 1 : 0;
            Object[] objArr19 = 0 == true ? 1 : 0;
            Object[] objArr20 = 0 == true ? 1 : 0;
            f68749r = new c(new AbstractC33208p0.h(null, 0L, null, 7, null), objArr17, objArr15, objArr18, objArr16, objArr19, objArr20, null, 254, null);
        }

        public c(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC6471b interfaceC6471b, TextResource secondaryButtonText, InterfaceC6471b interfaceC6471b2, InterfaceC6471b interfaceC6471b3, String screenTag) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            AbstractC22676k.m65750j(screenTag, "screenTag");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC6471b;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC6471b2;
            this.followUpEvent = interfaceC6471b3;
            this.screenTag = screenTag;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ c m50636i(c cVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC6471b interfaceC6471b, TextResource textResource3, InterfaceC6471b interfaceC6471b2, InterfaceC6471b interfaceC6471b3, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = cVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = cVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = cVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC6471b = cVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = cVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC6471b2 = cVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC6471b3 = cVar.followUpEvent;
            }
            if ((i13 & 128) != 0) {
                str = cVar.screenTag;
            }
            InterfaceC6471b interfaceC6471b4 = interfaceC6471b3;
            String str2 = str;
            TextResource textResource4 = textResource3;
            InterfaceC6471b interfaceC6471b5 = interfaceC6471b2;
            return cVar.m50637h(abstractC33208p0, textResource, textResource2, interfaceC6471b, textResource4, interfaceC6471b5, interfaceC6471b4, str2);
        }

        @Override // hw0.InterfaceC17699d
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
            return AbstractC22676k.m65745e(this.type, cVar.type) && AbstractC22676k.m65745e(this.supportText, cVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, cVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, cVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, cVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, cVar.followUpEvent) && AbstractC22676k.m65745e(this.screenTag, cVar.screenTag);
        }

        @Override // hw0.InterfaceC17699d, fy1.InterfaceC14875k
        public /* bridge */ ScreenState getState() {
            return super.getState();
        }

        /* JADX INFO: renamed from: h */
        public final c m50637h(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC6471b primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC6471b secondaryButtonClickEvent, InterfaceC6471b followUpEvent, String screenTag) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            AbstractC22676k.m65750j(screenTag, "screenTag");
            return new c(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent, screenTag);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC6471b interfaceC6471b = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC6471b == null ? 0 : interfaceC6471b.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC6471b interfaceC6471b2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC6471b2 == null ? 0 : interfaceC6471b2.hashCode())) * 31;
            InterfaceC6471b interfaceC6471b3 = this.followUpEvent;
            return this.screenTag.hashCode() + ((iHashCode + (interfaceC6471b3 != null ? interfaceC6471b3.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC6471b getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final InterfaceC6471b getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC6471b getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC6471b interfaceC6471b = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC6471b interfaceC6471b2 = this.secondaryButtonClickEvent;
            InterfaceC6471b interfaceC6471b3 = this.followUpEvent;
            String str = this.screenTag;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC6471b);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC6471b2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC6471b3);
            sbM30862n.append(", screenTag=");
            sbM30862n.append(str);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ c(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC6471b interfaceC6471b, TextResource textResource3, InterfaceC6471b interfaceC6471b2, InterfaceC6471b interfaceC6471b3, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC6471b, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC6471b2, (i13 & 64) == 0 ? interfaceC6471b3 : null, (i13 & 128) != 0 ? "core_details" : str);
        }
    }

    /* JADX INFO: renamed from: hw0.d$b */
    @Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b1\u00106R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b-\u00106R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b8\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b7\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b)\u0010!R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b9\u0010A\u001a\u0004\b@\u0010BR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bG\u0010FR\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bC\u0010FR\u001a\u0010\u001d\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bI\u0010!¨\u0006J"}, m65681d2 = {"Lhw0/d$b;", "Lhw0/d;", "Liw0/h0;", "headerToolBarState", "", "Lcom/whoop/design/util/TextResource;", "Lhw0/e;", "headerDropdownOptionsMap", "Low0/a;", "dialogState", "", "Lm91/u;", "detailScreenViewStateItems", "designItems", "Lhy0/h1;", "tagsV2", "", "featureEducationKey", "Liw0/l0;", "exerciseSummary", "Lhw0/d$d;", "navigateToEditActivityScreen", "activityName", "Lep0/j;", "screenContextMetadata", "", "isExerciseImageNavigationEnabled", "isExerciseDetailsV2FFEnabled", "isEstimatedOneRepMaxEnabled", "screenTag", "<init>", "(Liw0/h0;Ljava/util/Map;Low0/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Liw0/l0;Lhw0/d$d;Ljava/lang/String;Lep0/j;ZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Liw0/h0;", "i", "()Liw0/h0;", "c", "Ljava/util/Map;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/Map;", "d", "Low0/a;", "e", "()Low0/a;", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", "l", "Ljava/lang/String;", "Liw0/l0;", "()Liw0/l0;", "j", "Lhw0/d$d;", "()Lhw0/d$d;", "k", "Lep0/j;", "()Lep0/j;", "m", "Z", "o", "()Z", "n", "p", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC17699d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C20972h0 headerToolBarState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<TextResource, C17700e> headerDropdownOptionsMap;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C28431a dialogState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<InterfaceC25312u> detailScreenViewStateItems;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<InterfaceC25312u> designItems;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<C17750h1> tagsV2;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String featureEducationKey;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C20980l0 exerciseSummary;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final d navigateToEditActivityScreen;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String activityName;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean isExerciseImageNavigationEnabled;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final boolean isExerciseDetailsV2FFEnabled;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final boolean isEstimatedOneRepMaxEnabled;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String screenTag;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C20972h0 headerToolBarState, Map<TextResource, C17700e> headerDropdownOptionsMap, C28431a c28431a, List<? extends InterfaceC25312u> detailScreenViewStateItems, List<? extends InterfaceC25312u> designItems, List<C17750h1> list, String str, C20980l0 c20980l0, d dVar, String str2, C13404j c13404j, boolean z4, boolean z13, boolean z14, String screenTag) {
            AbstractC22676k.m65750j(headerToolBarState, "headerToolBarState");
            AbstractC22676k.m65750j(headerDropdownOptionsMap, "headerDropdownOptionsMap");
            AbstractC22676k.m65750j(detailScreenViewStateItems, "detailScreenViewStateItems");
            AbstractC22676k.m65750j(designItems, "designItems");
            AbstractC22676k.m65750j(screenTag, "screenTag");
            this.headerToolBarState = headerToolBarState;
            this.headerDropdownOptionsMap = headerDropdownOptionsMap;
            this.dialogState = c28431a;
            this.detailScreenViewStateItems = detailScreenViewStateItems;
            this.designItems = designItems;
            this.tagsV2 = list;
            this.featureEducationKey = str;
            this.exerciseSummary = c20980l0;
            this.navigateToEditActivityScreen = dVar;
            this.activityName = str2;
            this.screenContextMetadata = c13404j;
            this.isExerciseImageNavigationEnabled = z4;
            this.isExerciseDetailsV2FFEnabled = z13;
            this.isEstimatedOneRepMaxEnabled = z14;
            this.screenTag = screenTag;
        }

        @Override // hw0.InterfaceC17699d
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getScreenTag() {
            return this.screenTag;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m50617c() {
            return this.designItems;
        }

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC25312u> m50618d() {
            return this.detailScreenViewStateItems;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C28431a getDialogState() {
            return this.dialogState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.headerToolBarState, bVar.headerToolBarState) && AbstractC22676k.m65745e(this.headerDropdownOptionsMap, bVar.headerDropdownOptionsMap) && AbstractC22676k.m65745e(this.dialogState, bVar.dialogState) && AbstractC22676k.m65745e(this.detailScreenViewStateItems, bVar.detailScreenViewStateItems) && AbstractC22676k.m65745e(this.designItems, bVar.designItems) && AbstractC22676k.m65745e(this.tagsV2, bVar.tagsV2) && AbstractC22676k.m65745e(this.featureEducationKey, bVar.featureEducationKey) && AbstractC22676k.m65745e(this.exerciseSummary, bVar.exerciseSummary) && AbstractC22676k.m65745e(this.navigateToEditActivityScreen, bVar.navigateToEditActivityScreen) && AbstractC22676k.m65745e(this.activityName, bVar.activityName) && AbstractC22676k.m65745e(this.screenContextMetadata, bVar.screenContextMetadata) && this.isExerciseImageNavigationEnabled == bVar.isExerciseImageNavigationEnabled && this.isExerciseDetailsV2FFEnabled == bVar.isExerciseDetailsV2FFEnabled && this.isEstimatedOneRepMaxEnabled == bVar.isEstimatedOneRepMaxEnabled && AbstractC22676k.m65745e(this.screenTag, bVar.screenTag);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C20980l0 getExerciseSummary() {
            return this.exerciseSummary;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFeatureEducationKey() {
            return this.featureEducationKey;
        }

        @Override // hw0.InterfaceC17699d, fy1.InterfaceC14875k
        public /* bridge */ ScreenState getState() {
            return super.getState();
        }

        /* JADX INFO: renamed from: h */
        public final Map<TextResource, C17700e> m50622h() {
            return this.headerDropdownOptionsMap;
        }

        public int hashCode() {
            int iM11821e = AbstractC3855a.m11821e(this.headerDropdownOptionsMap, this.headerToolBarState.hashCode() * 31, 31);
            C28431a c28431a = this.dialogState;
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM11821e + (c28431a == null ? 0 : c28431a.hashCode())) * 31, 31, this.detailScreenViewStateItems), 31, this.designItems);
            List<C17750h1> list = this.tagsV2;
            int iHashCode = (iM31983b + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.featureEducationKey;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C20980l0 c20980l0 = this.exerciseSummary;
            int iHashCode3 = (iHashCode2 + (c20980l0 == null ? 0 : c20980l0.hashCode())) * 31;
            d dVar = this.navigateToEditActivityScreen;
            int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str2 = this.activityName;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return this.screenTag.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (c13404j != null ? c13404j.hashCode() : 0)) * 31, 31, this.isExerciseImageNavigationEnabled), 31, this.isExerciseDetailsV2FFEnabled), 31, this.isEstimatedOneRepMaxEnabled);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C20972h0 getHeaderToolBarState() {
            return this.headerToolBarState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final d getNavigateToEditActivityScreen() {
            return this.navigateToEditActivityScreen;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: l */
        public final List<C17750h1> m50626l() {
            return this.tagsV2;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsEstimatedOneRepMaxEnabled() {
            return this.isEstimatedOneRepMaxEnabled;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsExerciseDetailsV2FFEnabled() {
            return this.isExerciseDetailsV2FFEnabled;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsExerciseImageNavigationEnabled() {
            return this.isExerciseImageNavigationEnabled;
        }

        public String toString() {
            C20972h0 c20972h0 = this.headerToolBarState;
            Map<TextResource, C17700e> map = this.headerDropdownOptionsMap;
            C28431a c28431a = this.dialogState;
            List<InterfaceC25312u> list = this.detailScreenViewStateItems;
            List<InterfaceC25312u> list2 = this.designItems;
            List<C17750h1> list3 = this.tagsV2;
            String str = this.featureEducationKey;
            C20980l0 c20980l0 = this.exerciseSummary;
            d dVar = this.navigateToEditActivityScreen;
            String str2 = this.activityName;
            C13404j c13404j = this.screenContextMetadata;
            boolean z4 = this.isExerciseImageNavigationEnabled;
            boolean z13 = this.isExerciseDetailsV2FFEnabled;
            boolean z14 = this.isEstimatedOneRepMaxEnabled;
            String str3 = this.screenTag;
            StringBuilder sb4 = new StringBuilder("CoreDetailsView(headerToolBarState=");
            sb4.append(c20972h0);
            sb4.append(", headerDropdownOptionsMap=");
            sb4.append(map);
            sb4.append(", dialogState=");
            sb4.append(c28431a);
            sb4.append(", detailScreenViewStateItems=");
            sb4.append(list);
            sb4.append(", designItems=");
            AbstractC21702c.m61148s(sb4, list2, ", tagsV2=", list3, ", featureEducationKey=");
            sb4.append(str);
            sb4.append(", exerciseSummary=");
            sb4.append(c20980l0);
            sb4.append(", navigateToEditActivityScreen=");
            sb4.append(dVar);
            sb4.append(", activityName=");
            sb4.append(str2);
            sb4.append(", screenContextMetadata=");
            sb4.append(c13404j);
            sb4.append(", isExerciseImageNavigationEnabled=");
            sb4.append(z4);
            sb4.append(", isExerciseDetailsV2FFEnabled=");
            AbstractC38963t7.m124392v(sb4, z13, ", isEstimatedOneRepMaxEnabled=", z14, ", screenTag=");
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(C20972h0 c20972h0, Map map, C28431a c28431a, List list, List list2, List list3, String str, C20980l0 c20980l0, d dVar, String str2, C13404j c13404j, boolean z4, boolean z13, boolean z14, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            C20972h0 c20972h1 = (i13 & 1) != 0 ? new C20972h0(null, null, null, 7, null) : c20972h0;
            Map map2 = (i13 & 2) != 0 ? C25272z.f99163w : map;
            C28431a c28431a2 = (i13 & 4) != 0 ? null : c28431a;
            int i14 = i13 & 8;
            List list4 = C25271y.f99162w;
            this(c20972h1, map2, c28431a2, i14 != 0 ? list4 : list, (i13 & 16) == 0 ? list2 : list4, (i13 & 32) != 0 ? null : list3, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : c20980l0, (i13 & 256) != 0 ? null : dVar, (i13 & 512) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? c13404j : null, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4, (i13 & 4096) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? z14 : false, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? "core_details" : str3);
        }
    }
}
