package y71;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gb1.AbstractC15673b0;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p132f0.C13825t;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: y71.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0001/B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ²\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b/\u0010;R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b9\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\b<\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b>\u0010CR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b8\u0010F\u001a\u0004\bD\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\bI\u0010!R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bA\u0010KR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b-\u0010L\u001a\u0004\b7\u0010M¨\u0006N"}, m65681d2 = {"Ly71/o;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "title", "Ly81/e;", "titleColor", "", "enabled", "selected", "Ly71/l;", "alignment", "shouldApplyCardGradient", "background", "Lf0/t;", "border", "Lcom/whoop/navigation/e;", "destination", "showCaretIcon", "Ly71/q;", "menuItemStyle", "", "trackingId", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V", "a", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)Ly71/o;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", "p", "()Ly81/e;", "d", "Z", "i", "()Z", "e", "l", "f", "Ly71/l;", "()Ly71/l;", "g", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lf0/t;", "()Lf0/t;", "j", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "k", "n", "Ly71/q;", "()Ly71/q;", "Ljava/lang/String;", "q", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39282o implements InterfaceC25312u {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    public static final int f168987q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e titleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC39279l alignment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean shouldApplyCardGradient;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e background;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C13825t border;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean showCaretIcon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC39284q menuItemStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String trackingId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final GenericInteraction genericInteraction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: y71.o$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f169003w = new a();

        /* JADX INFO: renamed from: a */
        public final long m125226a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125226a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: y71.o$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f169004w = new b();

        /* JADX INFO: renamed from: a */
        public final long m125227a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125227a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: y71.o$c, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jÿ\u0001\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010%J¥\u0001\u0010)\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u0015¢\u0006\u0004\b)\u0010*JE\u0010,\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Ly71/o$c;", "", "<init>", "()V", "Lcom/whoop/design/util/TextResource;", "title", "Ly81/e;", "titleColor", "rightTitleColor", "supportText", "supportColor", "Ly71/g;", "leftIcon", "iconColor", "rightIcon", "rightIconColor", "rightNumberValue", "rightNumberSuffix", "rightTitle", "rightSubtitle", "background", "", "enabled", "selected", "Lcom/whoop/navigation/e;", "destination", "showCaretIcon", "", "trackingId", "Ly71/q;", "style", NotificationCompat.CATEGORY_EVENT, "readOnly", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Ly71/o;", "c", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;)Ly71/o;", "Lkd1/o;", "leftImageSource", "rightImageSource", "e", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLjava/lang/Object;Z)Ly71/o;", "description", "a", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;)Ly71/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: y71.o$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f169005a;

            static {
                int[] iArr = new int[EnumC39284q.values().length];
                try {
                    iArr[EnumC39284q.ONBOARDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC39284q.OUTLINED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC39284q.ALERT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f169005a = iArr;
            }
        }

        /* JADX INFO: renamed from: y71.o$c$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f169006w = new b();

            /* JADX INFO: renamed from: a */
            public final long m125234a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhite();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125234a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$c, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42683c implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42683c f169007w = new C42683c();

            /* JADX INFO: renamed from: a */
            public final long m125235a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhite();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125235a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$d */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final d f169008w = new d();

            /* JADX INFO: renamed from: a */
            public final long m125236a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite70();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125236a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$e */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class e implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final e f169009w = new e();

            /* JADX INFO: renamed from: a */
            public final long m125237a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125237a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$f */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final f f169010w = new f();

            /* JADX INFO: renamed from: a */
            public final long m125238a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125238a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$g */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class g implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final g f169011w = new g();

            /* JADX INFO: renamed from: a */
            public final long m125239a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite10();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125239a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$h */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class h implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final h f169012w = new h();

            /* JADX INFO: renamed from: a */
            public final long m125240a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentAlert();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125240a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$i */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class i implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final i f169013w = new i();

            /* JADX INFO: renamed from: a */
            public final long m125241a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhite();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125241a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$j */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class j implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final j f169014w = new j();

            /* JADX INFO: renamed from: a */
            public final long m125242a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite70();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125242a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.o$c$k */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class k implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final k f169015w = new k();

            /* JADX INFO: renamed from: a */
            public final long m125243a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite10();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125243a((C39336i) obj));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C39282o m125228b(Companion companion, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, boolean z4, boolean z13, Object obj, int i13, Object obj2) {
            if ((i13 & 2) != 0) {
                interfaceC39332e = p745y81.Function1.m125323a(b.f169006w);
            }
            InterfaceC39332e interfaceC39332e2 = interfaceC39332e;
            if ((i13 & 8) != 0) {
                z4 = true;
            }
            boolean z14 = z4;
            if ((i13 & 16) != 0) {
                z13 = false;
            }
            boolean z15 = z13;
            if ((i13 & 32) != 0) {
                obj = C23454a0.f92919a;
            }
            return companion.m125231a(textResource, interfaceC39332e2, textResource2, z14, z15, obj);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C39282o m125229d(Companion companion, TextResource textResource, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, TextResource textResource2, InterfaceC39332e interfaceC39332e3, C39274g c39274g, InterfaceC39332e interfaceC39332e4, C39274g c39274g2, InterfaceC39332e interfaceC39332e5, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, InterfaceC39332e interfaceC39332e6, boolean z4, boolean z13, C9598e c9598e, boolean z14, String str, EnumC39284q enumC39284q, Object obj, boolean z15, GenericInteraction genericInteraction, int i13, Object obj2) {
            InterfaceC39332e interfaceC39332eM125323a = (i13 & 2) != 0 ? p745y81.Function1.m125323a(C42683c.f169007w) : interfaceC39332e;
            InterfaceC39332e interfaceC39332e7 = (i13 & 4) != 0 ? null : interfaceC39332e2;
            TextResource textResourceM21267a = (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2;
            InterfaceC39332e interfaceC39332eM125323a2 = (i13 & 16) != 0 ? p745y81.Function1.m125323a(d.f169008w) : interfaceC39332e3;
            C39274g c39274g3 = (i13 & 32) != 0 ? null : c39274g;
            InterfaceC39332e interfaceC39332eM125323a3 = (i13 & 64) != 0 ? p745y81.Function1.m125323a(e.f169009w) : interfaceC39332e4;
            C39274g c39274g4 = (i13 & 128) != 0 ? null : c39274g2;
            InterfaceC39332e interfaceC39332eM125323a4 = (i13 & 256) != 0 ? p745y81.Function1.m125323a(f.f169010w) : interfaceC39332e5;
            TextResource textResourceM21267a2 = (i13 & 512) != 0 ? AbstractC8693b.m21267a() : textResource3;
            TextResource textResourceM21267a3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource4;
            TextResource textResourceM21267a4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC8693b.m21267a() : textResource5;
            TextResource textResourceM21267a5 = (i13 & 4096) != 0 ? AbstractC8693b.m21267a() : textResource6;
            InterfaceC39332e interfaceC39332eM125323a5 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? p745y81.Function1.m125323a(g.f169011w) : interfaceC39332e6;
            boolean z16 = true;
            boolean z17 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? true : z4;
            boolean z18 = (i13 & 32768) != 0 ? false : z13;
            C9598e c9598e2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : c9598e;
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0) {
                z16 = z14;
            } else if (c9598e2 == null) {
                z16 = false;
            }
            return companion.m125232c(textResource, interfaceC39332eM125323a, interfaceC39332e7, textResourceM21267a, interfaceC39332eM125323a2, c39274g3, interfaceC39332eM125323a3, c39274g4, interfaceC39332eM125323a4, textResourceM21267a2, textResourceM21267a3, textResourceM21267a4, textResourceM21267a5, interfaceC39332eM125323a5, z17, z18, c9598e2, z16, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str, (i13 & 524288) != 0 ? null : enumC39284q, (i13 & 1048576) != 0 ? C23454a0.f92919a : obj, (i13 & 2097152) == 0 ? z15 : false, (i13 & 4194304) != 0 ? null : genericInteraction);
        }

        /* JADX INFO: renamed from: a */
        public final C39282o m125231a(TextResource title, InterfaceC39332e titleColor, TextResource description, boolean enabled, boolean selected, Object event) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(event, "event");
            return new C39282o(event, title, titleColor, enabled, selected, new AbstractC39279l.a(description), false, null, null, null, false, null, null, null, null, 32704, null);
        }

        /* JADX INFO: renamed from: c */
        public final C39282o m125232c(TextResource title, InterfaceC39332e titleColor, InterfaceC39332e rightTitleColor, TextResource supportText, InterfaceC39332e supportColor, C39274g leftIcon, InterfaceC39332e iconColor, C39274g rightIcon, InterfaceC39332e rightIconColor, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, TextResource rightSubtitle, InterfaceC39332e background, boolean enabled, boolean selected, C9598e destination, boolean showCaretIcon, String trackingId, EnumC39284q style, Object event, boolean readOnly, GenericInteraction genericInteraction) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            AbstractC22676k.m65750j(background, "background");
            AbstractC22676k.m65750j(event, "event");
            AbstractC39279l.b bVar = new AbstractC39279l.b(supportText, supportColor, leftIcon, iconColor, rightIcon, rightIconColor, rightNumberValue, rightNumberSuffix, rightTitle, rightTitleColor, rightSubtitle, readOnly);
            boolean z4 = style == EnumC39284q.RAF_MENU_ITEM || style == EnumC39284q.SHOP_PROMO;
            C13825t c13825t = null;
            if (style != null) {
                int i13 = a.f169005a[style.ordinal()];
                if (i13 == 1) {
                    c13825t = new C13825t(1, AbstractC15673b0.m43983F0());
                } else if (i13 == 2) {
                    c13825t = new C13825t(((float) 0.5d) * 4, AbstractC15673b0.m43981E0());
                } else if (i13 == 3) {
                    c13825t = AbstractC17269i.m48880a(((float) 0.5d) * 4, p745y81.Function1.m125323a(h.f169012w).getColor());
                }
            }
            return new C39282o(event, title, titleColor, enabled, selected, bVar, z4, background, c13825t, destination, showCaretIcon, style, trackingId, genericInteraction, null, DfuBaseService.ERROR_CONNECTION_MASK, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public final C39282o m125233e(TextResource title, InterfaceC39332e titleColor, TextResource supportText, InterfaceC39332e supportColor, AbstractC22403o leftImageSource, AbstractC22403o rightImageSource, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, TextResource rightSubtitle, InterfaceC39332e background, boolean enabled, boolean selected, Object event, boolean readOnly) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            AbstractC22676k.m65750j(background, "background");
            AbstractC22676k.m65750j(event, "event");
            InterfaceC39332e interfaceC39332e = null;
            InterfaceC39332e interfaceC39332e2 = null;
            InterfaceC39332e interfaceC39332e3 = null;
            boolean z4 = false;
            EnumC39284q enumC39284q = null;
            String str = null;
            AnalyticEventModel analyticEventModel = null;
            return new C39282o(event, title, titleColor, enabled, selected, new AbstractC39279l.c(supportText, supportColor, leftImageSource, interfaceC39332e, rightImageSource, interfaceC39332e2, rightNumberValue, rightNumberSuffix, rightTitle, interfaceC39332e3, rightSubtitle, readOnly, 552, null), false, background, null, 0 == true ? 1 : 0, z4, enumC39284q, str, 0 == true ? 1 : 0, analyticEventModel, 32576, null);
        }

        private Companion() {
        }
    }

    public C39282o(Object event, TextResource title, InterfaceC39332e titleColor, boolean z4, boolean z13, AbstractC39279l alignment, boolean z14, InterfaceC39332e background, C13825t c13825t, C9598e c9598e, boolean z15, EnumC39284q enumC39284q, String str, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(background, "background");
        this.event = event;
        this.title = title;
        this.titleColor = titleColor;
        this.enabled = z4;
        this.selected = z13;
        this.alignment = alignment;
        this.shouldApplyCardGradient = z14;
        this.background = background;
        this.border = c13825t;
        this.destination = c9598e;
        this.showCaretIcon = z15;
        this.menuItemStyle = enumC39284q;
        this.trackingId = str;
        this.genericInteraction = genericInteraction;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a */
    public final C39282o m125211a(Object event, TextResource title, InterfaceC39332e titleColor, boolean enabled, boolean selected, AbstractC39279l alignment, boolean shouldApplyCardGradient, InterfaceC39332e background, C13825t border, C9598e destination, boolean showCaretIcon, EnumC39284q menuItemStyle, String trackingId, GenericInteraction genericInteraction, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(background, "background");
        return new C39282o(event, title, titleColor, enabled, selected, alignment, shouldApplyCardGradient, background, border, destination, showCaretIcon, menuItemStyle, trackingId, genericInteraction, analyticEvent);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC39279l getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39282o)) {
            return false;
        }
        C39282o c39282o = (C39282o) other;
        return AbstractC22676k.m65745e(this.event, c39282o.event) && AbstractC22676k.m65745e(this.title, c39282o.title) && AbstractC22676k.m65745e(this.titleColor, c39282o.titleColor) && this.enabled == c39282o.enabled && this.selected == c39282o.selected && AbstractC22676k.m65745e(this.alignment, c39282o.alignment) && this.shouldApplyCardGradient == c39282o.shouldApplyCardGradient && AbstractC22676k.m65745e(this.background, c39282o.background) && AbstractC22676k.m65745e(this.border, c39282o.border) && AbstractC22676k.m65745e(this.destination, c39282o.destination) && this.showCaretIcon == c39282o.showCaretIcon && this.menuItemStyle == c39282o.menuItemStyle && AbstractC22676k.m65745e(this.trackingId, c39282o.trackingId) && AbstractC22676k.m65745e(this.genericInteraction, c39282o.genericInteraction) && AbstractC22676k.m65745e(this.analyticEvent, c39282o.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C13825t getBorder() {
        return this.border;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public int hashCode() {
        int iM106648g = AbstractC33745d.m106648g(this.background, AbstractC2875y.m8289b((this.alignment.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.titleColor, AbstractC31061c.m95625a(this.event.hashCode() * 31, this.title, 31), 31), 31, this.enabled), 31, this.selected)) * 31, 31, this.shouldApplyCardGradient), 31);
        C13825t c13825t = this.border;
        int iHashCode = (iM106648g + (c13825t == null ? 0 : c13825t.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31, this.showCaretIcon);
        EnumC39284q enumC39284q = this.menuItemStyle;
        int iHashCode2 = (iM8289b + (enumC39284q == null ? 0 : enumC39284q.hashCode())) * 31;
        String str = this.trackingId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode4 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39284q getMenuItemStyle() {
        return this.menuItemStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShouldApplyCardGradient() {
        return this.shouldApplyCardGradient;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShowCaretIcon() {
        return this.showCaretIcon;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC39332e getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.title;
        InterfaceC39332e interfaceC39332e = this.titleColor;
        boolean z4 = this.enabled;
        boolean z13 = this.selected;
        AbstractC39279l abstractC39279l = this.alignment;
        boolean z14 = this.shouldApplyCardGradient;
        InterfaceC39332e interfaceC39332e2 = this.background;
        C13825t c13825t = this.border;
        C9598e c9598e = this.destination;
        boolean z15 = this.showCaretIcon;
        EnumC39284q enumC39284q = this.menuItemStyle;
        String str = this.trackingId;
        GenericInteraction genericInteraction = this.genericInteraction;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sb4 = new StringBuilder("MenuItemState(event=");
        sb4.append(obj);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", titleColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", selected=");
        sb4.append(z13);
        sb4.append(", alignment=");
        sb4.append(abstractC39279l);
        sb4.append(", shouldApplyCardGradient=");
        sb4.append(z14);
        sb4.append(", background=");
        sb4.append(interfaceC39332e2);
        sb4.append(", border=");
        sb4.append(c13825t);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", showCaretIcon=");
        sb4.append(z15);
        sb4.append(", menuItemStyle=");
        sb4.append(enumC39284q);
        sb4.append(", trackingId=");
        sb4.append(str);
        sb4.append(", genericInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C39282o(Object obj, TextResource textResource, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, AbstractC39279l abstractC39279l, boolean z14, InterfaceC39332e interfaceC39332e2, C13825t c13825t, C9598e c9598e, boolean z15, EnumC39284q enumC39284q, String str, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z16;
        Object obj2 = (i13 & 1) != 0 ? C23454a0.f92919a : obj;
        InterfaceC39332e interfaceC39332eM125323a = (i13 & 4) != 0 ? p745y81.Function1.m125323a(a.f169003w) : interfaceC39332e;
        boolean z17 = (i13 & 8) != 0 ? true : z4;
        boolean z18 = (i13 & 16) != 0 ? false : z13;
        boolean z19 = (i13 & 64) != 0 ? false : z14;
        InterfaceC39332e interfaceC39332eM125323a2 = (i13 & 128) != 0 ? p745y81.Function1.m125323a(b.f169004w) : interfaceC39332e2;
        C13825t c13825t2 = (i13 & 256) != 0 ? null : c13825t;
        C9598e c9598e2 = (i13 & 512) != 0 ? null : c9598e;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z16 = c9598e2 != null;
        } else {
            z16 = z15;
        }
        this(obj2, textResource, interfaceC39332eM125323a, z17, z18, abstractC39279l, z19, interfaceC39332eM125323a2, c13825t2, c9598e2, z16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC39284q, (i13 & 4096) != 0 ? null : str, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : analyticEventModel);
    }
}
