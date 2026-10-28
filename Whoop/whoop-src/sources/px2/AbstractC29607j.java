package px2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lx2.AbstractC24796a;
import mx2.InterfaceC26015b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: px2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u0012B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001fR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001f\u0082\u0001\u0002\"#¨\u0006$"}, m65681d2 = {"Lpx2/j;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "text", "Lgz0/m0;", "icon", "Lpx2/i;", "ctaViewState", "Llx2/a;", "ctaEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Llx2/a;)V", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "g", "d", "Lgz0/m0;", "()Lgz0/m0;", "e", "Lpx2/i;", "()Lpx2/i;", "Llx2/a;", "()Llx2/a;", "Ly81/e;", "()Ly81/e;", "statusTextColor", "statusBackgroundColor", "Lpx2/j$a;", "Lpx2/j$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29607j {

    /* JADX INFO: renamed from: g */
    public static final int f120928g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29606i ctaViewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC24796a ctaEvent;

    /* JADX INFO: renamed from: px2.j$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m65681d2 = {"Lpx2/j$a;", "Lpx2/j;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "text", "Lgz0/m0;", "icon", "Lpx2/i;", "ctaViewState", "Lmx2/b;", "action", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;Lmx2/b;)V", "Ly81/e;", "e", "()Ly81/e;", "statusTextColor", "d", "statusBackgroundColor", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29607j {

        /* JADX INFO: renamed from: h */
        public static final int f120935h = TextResource.$stable;

        /* JADX INFO: renamed from: px2.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42200a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42200a f120936w = new C42200a();

            /* JADX INFO: renamed from: a */
            public final long m90860a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentPositiveTrend15();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m90860a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: px2.j$a$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f120937w = new b();

            /* JADX INFO: renamed from: a */
            public final long m90861a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentPositiveTrend();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m90861a((C39336i) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, TextResource subtitle, TextResource text, EnumC16313m0 icon, C29606i ctaViewState, InterfaceC26015b action) {
            super(title, subtitle, text, icon, ctaViewState, new AbstractC24796a.c(action), null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(ctaViewState, "ctaViewState");
            AbstractC22676k.m65750j(action, "action");
        }

        @Override // px2.AbstractC29607j
        /* JADX INFO: renamed from: d */
        public InterfaceC39332e mo90855d() {
            return p745y81.Function1.m125323a(C42200a.f120936w);
        }

        @Override // px2.AbstractC29607j
        /* JADX INFO: renamed from: e */
        public InterfaceC39332e mo90856e() {
            return p745y81.Function1.m125323a(b.f120937w);
        }
    }

    /* JADX INFO: renamed from: px2.j$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, m65681d2 = {"Lpx2/j$b;", "Lpx2/j;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "text", "Lgz0/m0;", "icon", "Lpx2/i;", "ctaViewState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lpx2/i;)V", "Ly81/e;", "e", "()Ly81/e;", "statusTextColor", "d", "statusBackgroundColor", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC29607j {

        /* JADX INFO: renamed from: h */
        public static final int f120938h = TextResource.$stable;

        /* JADX INFO: renamed from: px2.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f120939w = new a();

            /* JADX INFO: renamed from: a */
            public final long m90862a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentNegativeTrend15();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m90862a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: px2.j$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42201b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42201b f120940w = new C42201b();

            /* JADX INFO: renamed from: a */
            public final long m90863a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentNegativeTrend();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m90863a((C39336i) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource title, TextResource subtitle, TextResource text, EnumC16313m0 icon, C29606i ctaViewState) {
            super(title, subtitle, text, icon, ctaViewState, AbstractC24796a.h.f97051a, null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(ctaViewState, "ctaViewState");
        }

        @Override // px2.AbstractC29607j
        /* JADX INFO: renamed from: d */
        public InterfaceC39332e mo90855d() {
            return p745y81.Function1.m125323a(a.f120939w);
        }

        @Override // px2.AbstractC29607j
        /* JADX INFO: renamed from: e */
        public InterfaceC39332e mo90856e() {
            return p745y81.Function1.m125323a(C42201b.f120940w);
        }
    }

    public /* synthetic */ AbstractC29607j(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, C29606i c29606i, AbstractC24796a abstractC24796a, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, enumC16313m0, c29606i, abstractC24796a);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC24796a getCtaEvent() {
        return this.ctaEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C29606i getCtaViewState() {
        return this.ctaViewState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC39332e mo90855d();

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC39332e mo90856e();

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    private AbstractC29607j(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC16313m0 enumC16313m0, C29606i c29606i, AbstractC24796a abstractC24796a) {
        this.title = textResource;
        this.subtitle = textResource2;
        this.text = textResource3;
        this.icon = enumC16313m0;
        this.ctaViewState = c29606i;
        this.ctaEvent = abstractC24796a;
    }
}
