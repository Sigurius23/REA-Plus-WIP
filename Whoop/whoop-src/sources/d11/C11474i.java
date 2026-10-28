package d11;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k91.C22302a;
import kd1.AbstractC22403o;
import kd1.C22411w;
import kd1.EnumC22400l;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p294l3.C23285v0;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: d11.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bI\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0001CBÉ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020)\u0012\b\b\u0002\u0010-\u001a\u00020)\u0012\b\b\u0002\u0010.\u001a\u00020)\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103JÖ\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020)2\b\b\u0002\u0010/\u001a\u00020\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u000100HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u0010L\u001a\u0004\bO\u0010NR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010JR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bX\u0010W\u001a\u0004\bZ\u0010YR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b[\u0010_R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010cR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\b]\u0010hR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bf\u0010kR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bi\u0010nR\u0017\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bo\u0010a\u001a\u0004\bp\u0010cR\u0017\u0010 \u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bq\u0010a\u001a\u0004\bq\u0010cR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bb\u0010r\u001a\u0004\bl\u0010sR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\\\u0010t\u001a\u0004\bR\u0010uR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bV\u0010xR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\by\u0010{R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\b|\u0010}R\u0017\u0010+\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b~\u0010I\u001a\u0004\b\u007f\u0010}R\u0017\u0010,\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bp\u0010I\u001a\u0004\bd\u0010}R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b\u007f\u0010I\u001a\u0004\b`\u0010}R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b|\u0010I\u001a\u0004\bv\u0010}R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\bo\u0010BR\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\bO\u0010\u0080\u0001\u001a\u0005\b~\u0010\u0081\u0001¨\u0006\u0082\u0001"}, m65681d2 = {"Ld11/i;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lkd1/l;", "type", "Ll3/v0;", "titleTextStyle", "Lcom/whoop/design/util/TextResource;", "title", "supportText", "supportTextStyle", "Ly71/g;", "leftIcon", "Lkd1/o;", "backgroundImg", "startImageUrl", "endImageUrl", "Lkotlin/Function1;", "Lmh/h;", "Ll83/a0;", "backgroundImgBuilder", "", "enabled", "isComplete", "Ld11/a;", "borderInfo", "Lk91/a;", "cornerRadius", "Ld11/b;", "ctaButtonInformation", "showCaretIcon", "dismissible", "Ld11/c;", "ctaSupplementalInfoState", "Li91/a;", "backgroundColor", "Lj91/b;", "backgroundGradient", "Li2/t;", "imageOverlayBrush", "Ly3/f;", "startImageSize", "startImagePadding", "contentVerticalPadding", "contentEndPadding", "height", "dismissEvent", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;)Ld11/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lkd1/l;", "G", "()Lkd1/l;", "c", "Ll3/v0;", "F", "()Ll3/v0;", "d", "Lcom/whoop/design/util/TextResource;", "E", "()Lcom/whoop/design/util/TextResource;", "C", "f", "D", "g", "Ly71/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ly71/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lkd1/o;", "i", "()Lkd1/o;", "B", "j", "t", "k", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "l", "Z", "s", "()Z", "m", "H", "n", "Ld11/a;", "()Ld11/a;", "o", "Lk91/a;", "()Lk91/a;", "p", "Ld11/b;", "()Ld11/b;", "q", "y", "r", "Ld11/c;", "()Ld11/c;", "Li91/a;", "()Li91/a;", "u", "Lj91/b;", "()Lj91/b;", "v", "Li2/t;", "()Li2/t;", "A", "()F", "x", "z", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11474i implements InterfaceC25312u {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E */
    public static final int f36854E = 8;

    /* JADX INFO: renamed from: F */
    private static final float f36855F = 30 * 4;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Object dismissEvent;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final C9598e navigationAction;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC22400l type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23285v0 titleTextStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource supportText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C23285v0 supportTextStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39274g leftIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AbstractC22403o startImageUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC22403o endImageUrl;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1 backgroundImgBuilder;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isComplete;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC11466a borderInfo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C22302a cornerRadius;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C11467b ctaButtonInformation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean showCaretIcon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean dismissible;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C11468c ctaSupplementalInfoState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final AbstractC18247a backgroundColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final InterfaceC21430b backgroundGradient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final AbstractC17911t imageOverlayBrush;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final float startImageSize;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final float startImagePadding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final float contentVerticalPadding;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final float contentEndPadding;

    /* JADX INFO: renamed from: d11.i$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f36885w = new a();

        /* JADX INFO: renamed from: a */
        public final long m30838a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBlack50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30838a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d11.i$b, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ld11/i$b;", "", "<init>", "()V", "Ly3/f;", "DEFAULT_HEIGHT", "F", "a", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m30839a() {
            return C11474i.f36855F;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C11474i(Object obj, EnumC22400l enumC22400l, C23285v0 c23285v0, TextResource textResource, TextResource textResource2, C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, AbstractC22403o abstractC22403o3, Function1 function1, boolean z4, boolean z13, InterfaceC11466a interfaceC11466a, C22302a c22302a, C11467b c11467b, boolean z14, boolean z15, C11468c c11468c, AbstractC18247a abstractC18247a, InterfaceC21430b interfaceC21430b, AbstractC17911t abstractC17911t, float f13, float f14, float f15, float f16, float f17, Object obj2, C9598e c9598e, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, enumC22400l, c23285v0, textResource, textResource2, c23285v1, c39274g, abstractC22403o, abstractC22403o2, abstractC22403o3, function1, z4, z13, interfaceC11466a, c22302a, c11467b, z14, z15, c11468c, abstractC18247a, interfaceC21430b, abstractC17911t, f13, f14, f15, f16, f17, obj2, c9598e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m30806b(C25540h c25540h) {
        AbstractC22676k.m65750j(c25540h, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C11474i m30808f(C11474i c11474i, Object obj, EnumC22400l enumC22400l, C23285v0 c23285v0, TextResource textResource, TextResource textResource2, C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, AbstractC22403o abstractC22403o3, Function1 function1, boolean z4, boolean z13, InterfaceC11466a interfaceC11466a, C22302a c22302a, C11467b c11467b, boolean z14, boolean z15, C11468c c11468c, AbstractC18247a abstractC18247a, InterfaceC21430b interfaceC21430b, AbstractC17911t abstractC17911t, float f13, float f14, float f15, float f16, float f17, Object obj2, C9598e c9598e, int i13, Object obj3) {
        C9598e c9598e2;
        Object obj4;
        Object obj5 = (i13 & 1) != 0 ? c11474i.event : obj;
        EnumC22400l enumC22400l2 = (i13 & 2) != 0 ? c11474i.type : enumC22400l;
        C23285v0 c23285v2 = (i13 & 4) != 0 ? c11474i.titleTextStyle : c23285v0;
        TextResource textResource3 = (i13 & 8) != 0 ? c11474i.title : textResource;
        TextResource textResource4 = (i13 & 16) != 0 ? c11474i.supportText : textResource2;
        C23285v0 c23285v3 = (i13 & 32) != 0 ? c11474i.supportTextStyle : c23285v1;
        C39274g c39274g2 = (i13 & 64) != 0 ? c11474i.leftIcon : c39274g;
        AbstractC22403o abstractC22403o4 = (i13 & 128) != 0 ? c11474i.backgroundImg : abstractC22403o;
        AbstractC22403o abstractC22403o5 = (i13 & 256) != 0 ? c11474i.startImageUrl : abstractC22403o2;
        AbstractC22403o abstractC22403o6 = (i13 & 512) != 0 ? c11474i.endImageUrl : abstractC22403o3;
        Function1 function2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c11474i.backgroundImgBuilder : function1;
        boolean z16 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c11474i.enabled : z4;
        boolean z17 = (i13 & 4096) != 0 ? c11474i.isComplete : z13;
        InterfaceC11466a interfaceC11466a2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c11474i.borderInfo : interfaceC11466a;
        Object obj6 = obj5;
        C22302a c22302a2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c11474i.cornerRadius : c22302a;
        C11467b c11467b2 = (i13 & 32768) != 0 ? c11474i.ctaButtonInformation : c11467b;
        boolean z18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c11474i.showCaretIcon : z14;
        boolean z19 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c11474i.dismissible : z15;
        C11468c c11468c2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c11474i.ctaSupplementalInfoState : c11468c;
        AbstractC18247a abstractC18247a2 = (i13 & 524288) != 0 ? c11474i.backgroundColor : abstractC18247a;
        InterfaceC21430b interfaceC21430b2 = (i13 & 1048576) != 0 ? c11474i.backgroundGradient : interfaceC21430b;
        AbstractC17911t abstractC17911t2 = (i13 & 2097152) != 0 ? c11474i.imageOverlayBrush : abstractC17911t;
        float f18 = (i13 & 4194304) != 0 ? c11474i.startImageSize : f13;
        float f19 = (i13 & 8388608) != 0 ? c11474i.startImagePadding : f14;
        float f24 = (i13 & 16777216) != 0 ? c11474i.contentVerticalPadding : f15;
        float f25 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? c11474i.contentEndPadding : f16;
        float f26 = (i13 & 67108864) != 0 ? c11474i.height : f17;
        Object obj7 = (i13 & 134217728) != 0 ? c11474i.dismissEvent : obj2;
        if ((i13 & 268435456) != 0) {
            obj4 = obj7;
            c9598e2 = c11474i.navigationAction;
        } else {
            c9598e2 = c9598e;
            obj4 = obj7;
        }
        return c11474i.m30817e(obj6, enumC22400l2, c23285v2, textResource3, textResource4, c23285v3, c39274g2, abstractC22403o4, abstractC22403o5, abstractC22403o6, function2, z16, z17, interfaceC11466a2, c22302a2, c11467b2, z18, z19, c11468c2, abstractC18247a2, interfaceC21430b2, abstractC17911t2, f18, f19, f24, f25, f26, obj4, c9598e2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getStartImageSize() {
        return this.startImageSize;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final AbstractC22403o getStartImageUrl() {
        return this.startImageUrl;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final TextResource getSupportText() {
        return this.supportText;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final C23285v0 getSupportTextStyle() {
        return this.supportTextStyle;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final C23285v0 getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final EnumC22400l getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: e */
    public final C11474i m30817e(Object event, EnumC22400l type, C23285v0 titleTextStyle, TextResource title, TextResource supportText, C23285v0 supportTextStyle, C39274g leftIcon, AbstractC22403o backgroundImg, AbstractC22403o startImageUrl, AbstractC22403o endImageUrl, Function1 backgroundImgBuilder, boolean enabled, boolean isComplete, InterfaceC11466a borderInfo, C22302a cornerRadius, C11467b ctaButtonInformation, boolean showCaretIcon, boolean dismissible, C11468c ctaSupplementalInfoState, AbstractC18247a backgroundColor, InterfaceC21430b backgroundGradient, AbstractC17911t imageOverlayBrush, float startImageSize, float startImagePadding, float contentVerticalPadding, float contentEndPadding, float height, Object dismissEvent, C9598e navigationAction) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(backgroundImgBuilder, "backgroundImgBuilder");
        AbstractC22676k.m65750j(cornerRadius, "cornerRadius");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
        return new C11474i(event, type, titleTextStyle, title, supportText, supportTextStyle, leftIcon, backgroundImg, startImageUrl, endImageUrl, backgroundImgBuilder, enabled, isComplete, borderInfo, cornerRadius, ctaButtonInformation, showCaretIcon, dismissible, ctaSupplementalInfoState, backgroundColor, backgroundGradient, imageOverlayBrush, startImageSize, startImagePadding, contentVerticalPadding, contentEndPadding, height, dismissEvent, navigationAction, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11474i)) {
            return false;
        }
        C11474i c11474i = (C11474i) other;
        return AbstractC22676k.m65745e(this.event, c11474i.event) && this.type == c11474i.type && AbstractC22676k.m65745e(this.titleTextStyle, c11474i.titleTextStyle) && AbstractC22676k.m65745e(this.title, c11474i.title) && AbstractC22676k.m65745e(this.supportText, c11474i.supportText) && AbstractC22676k.m65745e(this.supportTextStyle, c11474i.supportTextStyle) && AbstractC22676k.m65745e(this.leftIcon, c11474i.leftIcon) && AbstractC22676k.m65745e(this.backgroundImg, c11474i.backgroundImg) && AbstractC22676k.m65745e(this.startImageUrl, c11474i.startImageUrl) && AbstractC22676k.m65745e(this.endImageUrl, c11474i.endImageUrl) && AbstractC22676k.m65745e(this.backgroundImgBuilder, c11474i.backgroundImgBuilder) && this.enabled == c11474i.enabled && this.isComplete == c11474i.isComplete && AbstractC22676k.m65745e(this.borderInfo, c11474i.borderInfo) && AbstractC22676k.m65745e(this.cornerRadius, c11474i.cornerRadius) && AbstractC22676k.m65745e(this.ctaButtonInformation, c11474i.ctaButtonInformation) && this.showCaretIcon == c11474i.showCaretIcon && this.dismissible == c11474i.dismissible && AbstractC22676k.m65745e(this.ctaSupplementalInfoState, c11474i.ctaSupplementalInfoState) && AbstractC22676k.m65745e(this.backgroundColor, c11474i.backgroundColor) && AbstractC22676k.m65745e(this.backgroundGradient, c11474i.backgroundGradient) && AbstractC22676k.m65745e(this.imageOverlayBrush, c11474i.imageOverlayBrush) && C39174f.m124782b(this.startImageSize, c11474i.startImageSize) && C39174f.m124782b(this.startImagePadding, c11474i.startImagePadding) && C39174f.m124782b(this.contentVerticalPadding, c11474i.contentVerticalPadding) && C39174f.m124782b(this.contentEndPadding, c11474i.contentEndPadding) && C39174f.m124782b(this.height, c11474i.height) && AbstractC22676k.m65745e(this.dismissEvent, c11474i.dismissEvent) && AbstractC22676k.m65745e(this.navigationAction, c11474i.navigationAction);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC18247a getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC21430b getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.event.hashCode() * 31)) * 31;
        C23285v0 c23285v0 = this.titleTextStyle;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (c23285v0 == null ? 0 : c23285v0.hashCode())) * 31, this.title, 31), this.supportText, 31);
        C23285v0 c23285v1 = this.supportTextStyle;
        int iHashCode2 = (iM95625a + (c23285v1 == null ? 0 : c23285v1.hashCode())) * 31;
        C39274g c39274g = this.leftIcon;
        int iHashCode3 = (iHashCode2 + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.backgroundImg;
        int iHashCode4 = (iHashCode3 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        AbstractC22403o abstractC22403o2 = this.startImageUrl;
        int iHashCode5 = (iHashCode4 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31;
        AbstractC22403o abstractC22403o3 = this.endImageUrl;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC30802r.m94756e(this.backgroundImgBuilder, (iHashCode5 + (abstractC22403o3 == null ? 0 : abstractC22403o3.hashCode())) * 31, 31), 31, this.enabled), 31, this.isComplete);
        InterfaceC11466a interfaceC11466a = this.borderInfo;
        int iHashCode6 = (this.cornerRadius.hashCode() + ((iM8289b + (interfaceC11466a == null ? 0 : interfaceC11466a.hashCode())) * 31)) * 31;
        C11467b c11467b = this.ctaButtonInformation;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode6 + (c11467b == null ? 0 : c11467b.hashCode())) * 31, 31, this.showCaretIcon), 31, this.dismissible);
        C11468c c11468c = this.ctaSupplementalInfoState;
        int iHashCode7 = (this.backgroundColor.hashCode() + ((iM8289b2 + (c11468c == null ? 0 : c11468c.hashCode())) * 31)) * 31;
        InterfaceC21430b interfaceC21430b = this.backgroundGradient;
        int iHashCode8 = (iHashCode7 + (interfaceC21430b == null ? 0 : interfaceC21430b.hashCode())) * 31;
        AbstractC17911t abstractC17911t = this.imageOverlayBrush;
        int iM106644c = AbstractC33745d.m106644c(AbstractC11266d.m30447a(this.height, AbstractC11266d.m30447a(this.contentEndPadding, AbstractC11266d.m30447a(this.contentVerticalPadding, AbstractC11266d.m30447a(this.startImagePadding, AbstractC11266d.m30447a(this.startImageSize, (iHashCode8 + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.dismissEvent);
        C9598e c9598e = this.navigationAction;
        return iM106644c + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getBackgroundImg() {
        return this.backgroundImg;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Function1 getBackgroundImgBuilder() {
        return this.backgroundImgBuilder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC11466a getBorderInfo() {
        return this.borderInfo;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getContentEndPadding() {
        return this.contentEndPadding;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getContentVerticalPadding() {
        return this.contentVerticalPadding;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C22302a getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C11467b getCtaButtonInformation() {
        return this.ctaButtonInformation;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C11468c getCtaSupplementalInfoState() {
        return this.ctaSupplementalInfoState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Object getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AbstractC22403o getEndImageUrl() {
        return this.endImageUrl;
    }

    public String toString() {
        Object obj = this.event;
        EnumC22400l enumC22400l = this.type;
        C23285v0 c23285v0 = this.titleTextStyle;
        TextResource textResource = this.title;
        TextResource textResource2 = this.supportText;
        C23285v0 c23285v1 = this.supportTextStyle;
        C39274g c39274g = this.leftIcon;
        AbstractC22403o abstractC22403o = this.backgroundImg;
        AbstractC22403o abstractC22403o2 = this.startImageUrl;
        AbstractC22403o abstractC22403o3 = this.endImageUrl;
        Function1 function1 = this.backgroundImgBuilder;
        boolean z4 = this.enabled;
        boolean z13 = this.isComplete;
        InterfaceC11466a interfaceC11466a = this.borderInfo;
        C22302a c22302a = this.cornerRadius;
        C11467b c11467b = this.ctaButtonInformation;
        boolean z14 = this.showCaretIcon;
        boolean z15 = this.dismissible;
        C11468c c11468c = this.ctaSupplementalInfoState;
        AbstractC18247a abstractC18247a = this.backgroundColor;
        InterfaceC21430b interfaceC21430b = this.backgroundGradient;
        AbstractC17911t abstractC17911t = this.imageOverlayBrush;
        String strM124783c = C39174f.m124783c(this.startImageSize);
        String strM124783c2 = C39174f.m124783c(this.startImagePadding);
        String strM124783c3 = C39174f.m124783c(this.contentVerticalPadding);
        String strM124783c4 = C39174f.m124783c(this.contentEndPadding);
        String strM124783c5 = C39174f.m124783c(this.height);
        Object obj2 = this.dismissEvent;
        C9598e c9598e = this.navigationAction;
        StringBuilder sb4 = new StringBuilder("CtaTileState(event=");
        sb4.append(obj);
        sb4.append(", type=");
        sb4.append(enumC22400l);
        sb4.append(", titleTextStyle=");
        sb4.append(c23285v0);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", supportText=");
        sb4.append(textResource2);
        sb4.append(", supportTextStyle=");
        sb4.append(c23285v1);
        sb4.append(", leftIcon=");
        sb4.append(c39274g);
        sb4.append(", backgroundImg=");
        sb4.append(abstractC22403o);
        sb4.append(", startImageUrl=");
        sb4.append(abstractC22403o2);
        sb4.append(", endImageUrl=");
        sb4.append(abstractC22403o3);
        sb4.append(", backgroundImgBuilder=");
        sb4.append(function1);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", isComplete=");
        sb4.append(z13);
        sb4.append(", borderInfo=");
        sb4.append(interfaceC11466a);
        sb4.append(", cornerRadius=");
        sb4.append(c22302a);
        sb4.append(", ctaButtonInformation=");
        sb4.append(c11467b);
        sb4.append(", showCaretIcon=");
        AbstractC38963t7.m124392v(sb4, z14, ", dismissible=", z15, ", ctaSupplementalInfoState=");
        sb4.append(c11468c);
        sb4.append(", backgroundColor=");
        sb4.append(abstractC18247a);
        sb4.append(", backgroundGradient=");
        sb4.append(interfaceC21430b);
        sb4.append(", imageOverlayBrush=");
        sb4.append(abstractC17911t);
        sb4.append(", startImageSize=");
        AbstractC11266d.m30444B(sb4, strM124783c, ", startImagePadding=", strM124783c2, ", contentVerticalPadding=");
        AbstractC11266d.m30444B(sb4, strM124783c3, ", contentEndPadding=", strM124783c4, ", height=");
        sb4.append(strM124783c5);
        sb4.append(", dismissEvent=");
        sb4.append(obj2);
        sb4.append(", navigationAction=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final AbstractC17911t getImageOverlayBrush() {
        return this.imageOverlayBrush;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final C39274g getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getShowCaretIcon() {
        return this.showCaretIcon;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final float getStartImagePadding() {
        return this.startImagePadding;
    }

    private C11474i(Object event, EnumC22400l type, C23285v0 c23285v0, TextResource title, TextResource supportText, C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, AbstractC22403o abstractC22403o3, Function1 backgroundImgBuilder, boolean z4, boolean z13, InterfaceC11466a interfaceC11466a, C22302a cornerRadius, C11467b c11467b, boolean z14, boolean z15, C11468c c11468c, AbstractC18247a backgroundColor, InterfaceC21430b interfaceC21430b, AbstractC17911t abstractC17911t, float f13, float f14, float f15, float f16, float f17, Object dismissEvent, C9598e c9598e) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(backgroundImgBuilder, "backgroundImgBuilder");
        AbstractC22676k.m65750j(cornerRadius, "cornerRadius");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
        this.event = event;
        this.type = type;
        this.titleTextStyle = c23285v0;
        this.title = title;
        this.supportText = supportText;
        this.supportTextStyle = c23285v1;
        this.leftIcon = c39274g;
        this.backgroundImg = abstractC22403o;
        this.startImageUrl = abstractC22403o2;
        this.endImageUrl = abstractC22403o3;
        this.backgroundImgBuilder = backgroundImgBuilder;
        this.enabled = z4;
        this.isComplete = z13;
        this.borderInfo = interfaceC11466a;
        this.cornerRadius = cornerRadius;
        this.ctaButtonInformation = c11467b;
        this.showCaretIcon = z14;
        this.dismissible = z15;
        this.ctaSupplementalInfoState = c11468c;
        this.backgroundColor = backgroundColor;
        this.backgroundGradient = interfaceC21430b;
        this.imageOverlayBrush = abstractC17911t;
        this.startImageSize = f13;
        this.startImagePadding = f14;
        this.contentVerticalPadding = f15;
        this.contentEndPadding = f16;
        this.height = f17;
        this.dismissEvent = dismissEvent;
        this.navigationAction = c9598e;
    }

    public C11474i(Object obj, EnumC22400l enumC22400l, C23285v0 c23285v0, TextResource textResource, TextResource textResource2, C23285v0 c23285v1, C39274g c39274g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, AbstractC22403o abstractC22403o3, Function1 function1, boolean z4, boolean z13, InterfaceC11466a interfaceC11466a, C22302a c22302a, C11467b c11467b, boolean z14, boolean z15, C11468c c11468c, AbstractC18247a abstractC18247a, InterfaceC21430b interfaceC21430b, AbstractC17911t abstractC17911t, float f13, float f14, float f15, float f16, float f17, Object obj2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? EnumC22400l.JOURNAL : enumC22400l, (i13 & 4) != 0 ? null : c23285v0, textResource, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 32) != 0 ? null : c23285v1, (i13 & 64) != 0 ? null : c39274g, abstractC22403o, (i13 & 256) != 0 ? null : abstractC22403o2, (i13 & 512) != 0 ? null : abstractC22403o3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C11473h(0) : function1, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? true : z4, (i13 & 4096) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : interfaceC11466a, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C22411w.f87680a.m64535a() : c22302a, (32768 & i13) != 0 ? null : c11467b, (65536 & i13) != 0 ? true : z14, (131072 & i13) != 0 ? false : z15, (262144 & i13) != 0 ? null : c11468c, (524288 & i13) != 0 ? AbstractC18249c.m52574l(a.f36885w) : abstractC18247a, (1048576 & i13) != 0 ? null : interfaceC21430b, (2097152 & i13) != 0 ? null : abstractC17911t, (4194304 & i13) != 0 ? 18 * 4 : f13, (8388608 & i13) != 0 ? ((float) 1.5d) * 8 : f14, (16777216 & i13) != 0 ? ((float) 1.5d) * 8 : f15, (33554432 & i13) != 0 ? 2 * 8 : f16, (67108864 & i13) != 0 ? f36855F : f17, (134217728 & i13) != 0 ? EnumC11472g.TILE_DISMISSED : obj2, (i13 & 268435456) != 0 ? null : c9598e, null);
    }
}
