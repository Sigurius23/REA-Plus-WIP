package o11;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.C25271y;
import mi2.C25592o;
import no.nordicsemi.android.dfu.DfuBaseService;
import nr0.C27072e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27266m;
import ny0.C27270o;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p163g1.AbstractC15005f3;
import p209i3.AbstractC18041w;
import p209i3.C18027i;
import p209i3.InterfaceC18044z;
import p271k3.EnumC22167a;
import p355o2.C27430e;
import p390p1.C28635l;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p718lz1.C24823a;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: o11.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0015\u0017\u000f\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\fR \u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u001a\u0010'\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012R\u001c\u0010)\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001a\u0010+\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b%\u0010\u0012R4\u00103\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,\u0012\u0004\u0012\u00020.\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00108\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u001a\u0010<\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b=\u0010;R\u001a\u0010@\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b?\u0010\fR\u001c\u0010E\u001a\u0004\u0018\u00010A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b*\u0010DR\u001b\u0010H\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b!\u00107R&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020.0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bF\u0010KR\u001c\u0010Q\u001a\u0004\u0018\u00010M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bB\u0010PR\u0014\u0010R\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0018R\u0014\u0010U\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010T\u0082\u0001\u0004VWXY¨\u0006Z"}, m65681d2 = {"Lo11/m;", "Lm91/u;", "<init>", "()V", "", "Lkd1/o$c;", "y", "(Ljava/lang/String;)Lkd1/o$c;", "", "a", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "enabled", "Ly81/f;", "b", "Ly81/f;", "u", "()Ly81/f;", "titleTextColor", "Lcom/whoop/design/util/TextResource;", "c", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "subtitle", "q", "subtitleTextColor", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "isSubtitleAboveTitle", "", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "achievementIcons", "g", "k", "imageBackgroundColor", "l", "imageContentDescription", "i", "backgroundColor", "Lkotlin/Function1;", "", "Ll83/a0;", "j", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "", "F", "t", "()F", "titleBarEndContentRotation", "Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "onTitleBarClickEvent", "m", "onImageClickEvent", "v", "isExpanded", "Lo11/h;", "o", "Lo11/h;", "()Lo11/h;", "expandedContent", "p", "Ll83/h;", "alpha", "Li3/z;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "semanticsProperties", "Li3/i;", "r", "Li3/i;", "()Li3/i;", "role", "title", "Lkd1/o;", "()Lkd1/o;", "image", "Lo11/m$a;", "Lo11/m$b;", "Lo11/m$c;", "Lo11/m$d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27407m implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f titleTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f subtitleTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSubtitleAboveTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<Integer> achievementIcons;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f imageBackgroundColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource imageContentDescription;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Function3 titleBarEndContent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float titleBarEndContentRotation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Object onTitleBarClickEvent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Object onImageClickEvent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC27402h expandedContent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC23462h alpha;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Function1 semanticsProperties;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C18027i role;

    /* JADX INFO: renamed from: o11.m$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002/0B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u000e\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019R4\u0010!\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u001b\u0010$\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\r\u0010\u0014R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0010\u0082\u0001\u000212¨\u00063"}, m65681d2 = {"Lo11/m$b;", "Lo11/m;", "Lm91/n;", "Ljava/util/UUID;", "<init>", "()V", "Lkd1/o$c;", "s", "Ll83/h;", "K", "()Lkd1/o$c;", "image", "Li3/i;", "t", "I", "M", "()I", "role", "Ly3/f;", "u", "()F", "endIconSize", "", "v", "H", "()Ljava/lang/Integer;", "endIconContentDescriptionResId", "Lkotlin/Function1;", "", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "", "x", "titleBarEndContentRotation", "", "L", "()Ljava/lang/String;", "imageUrl", "Lo11/h$b;", "J", "()Lo11/h$b;", "expandedContent", "G", "endIcon", "a", "b", "Lo11/m$b$a;", "Lo11/m$b$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b extends AbstractC27407m implements InterfaceC25305n<UUID> {

        /* JADX INFO: renamed from: y */
        public static final int f110261y = 8;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final InterfaceC23462h image;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final int role;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final InterfaceC23462h endIconSize;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final InterfaceC23462h endIconContentDescriptionResId;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Function3 titleBarEndContent;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final InterfaceC23462h titleBarEndContentRotation;

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: E */
        public static final Integer m82710E(b bVar) {
            int endIcon = bVar.getEndIcon();
            C38072d c38072d = C38072d.f163053a;
            if (endIcon == c38072d.m121951d().getVarious().getDrag()) {
                return Integer.valueOf(AbstractC16277f.f62319e0);
            }
            if (endIcon == c38072d.m121951d().getTinyIcons().getDownArrow()) {
                return Integer.valueOf(bVar.getIsExpanded() ? AbstractC16277f.f62278S : AbstractC16277f.f62363p0);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: F */
        public static final C39174f m82711F(b bVar) {
            float f13;
            if (bVar.getEndIcon() == C38072d.f163053a.m121951d().getVarious().getDrag()) {
                f13 = 7 * 4;
            } else {
                float f14 = 4;
                f13 = f14 * f14;
            }
            return new C39174f(f13);
        }

        /* JADX INFO: renamed from: H */
        private final Integer m82712H() {
            return (Integer) this.endIconContentDescriptionResId.getValue();
        }

        /* JADX INFO: renamed from: I */
        private final float m82713I() {
            return ((C39174f) this.endIconSize.getValue()).f168413w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: N */
        public static final AbstractC22403o.c m82714N(b bVar) {
            return bVar.m82704y(bVar.getImageUrl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: O */
        public static final C23454a0 m82715O(b bVar, Function1 it, Composer composer, int i13) throws XmlPullParserException, IOException {
            String strM92103Y;
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
                Modifier modifierM3419p = AbstractC1102d.m3419p(bVar.m82713I(), C2314t.f9131w);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(bVar.getEndIcon(), c28655q, 6);
                Integer numM82712H = bVar.m82712H();
                if (numM82712H == null) {
                    c28655q.m87150e0(755736435);
                    c28655q.m87173q(false);
                    strM92103Y = null;
                } else {
                    c28655q.m87150e0(755736436);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, numM82712H.intValue());
                    c28655q.m87173q(false);
                }
                AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, modifierM3419p, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
            } else {
                c28655q.m87138X();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: P */
        public static final float m82716P(b bVar) {
            return (bVar.getIsExpanded() && bVar.getEndIcon() == C38072d.f163053a.m121951d().getTinyIcons().getDownArrow()) ? -180.0f : 0.0f;
        }

        /* JADX INFO: renamed from: G */
        public abstract int getEndIcon();

        /* JADX INFO: renamed from: J */
        public abstract InterfaceC27402h.b getExpandedContent();

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public AbstractC22403o.c mo82690j() {
            return (AbstractC22403o.c) this.image.getValue();
        }

        /* JADX INFO: renamed from: L */
        public abstract String getImageUrl();

        /* JADX INFO: renamed from: M, reason: from getter */
        public int getRole() {
            return this.role;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: o */
        public /* synthetic */ C18027i getRole() {
            return new C18027i(getRole());
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: s, reason: from getter */
        public Function3 getTitleBarEndContent() {
            return this.titleBarEndContent;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: t */
        public float getTitleBarEndContentRotation() {
            return ((Number) this.titleBarEndContentRotation.getValue()).floatValue();
        }

        private b() {
            super(null);
            final int i13 = 0;
            this.image = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o11.n

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AbstractC27407m.b f110369x;

                {
                    this.f110369x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return AbstractC27407m.b.m82714N(this.f110369x);
                        case 1:
                            return AbstractC27407m.b.m82711F(this.f110369x);
                        case 2:
                            return AbstractC27407m.b.m82710E(this.f110369x);
                        default:
                            return Float.valueOf(AbstractC27407m.b.m82716P(this.f110369x));
                    }
                }
            });
            this.role = 2;
            final int i14 = 1;
            this.endIconSize = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o11.n

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AbstractC27407m.b f110369x;

                {
                    this.f110369x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return AbstractC27407m.b.m82714N(this.f110369x);
                        case 1:
                            return AbstractC27407m.b.m82711F(this.f110369x);
                        case 2:
                            return AbstractC27407m.b.m82710E(this.f110369x);
                        default:
                            return Float.valueOf(AbstractC27407m.b.m82716P(this.f110369x));
                    }
                }
            });
            final int i15 = 2;
            this.endIconContentDescriptionResId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o11.n

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AbstractC27407m.b f110369x;

                {
                    this.f110369x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return AbstractC27407m.b.m82714N(this.f110369x);
                        case 1:
                            return AbstractC27407m.b.m82711F(this.f110369x);
                        case 2:
                            return AbstractC27407m.b.m82710E(this.f110369x);
                        default:
                            return Float.valueOf(AbstractC27407m.b.m82716P(this.f110369x));
                    }
                }
            });
            this.titleBarEndContent = new C37816b(new C24823a(this, 4), true, -684493612);
            final int i16 = 3;
            this.titleBarEndContentRotation = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o11.n

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AbstractC27407m.b f110369x;

                {
                    this.f110369x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return AbstractC27407m.b.m82714N(this.f110369x);
                        case 1:
                            return AbstractC27407m.b.m82711F(this.f110369x);
                        case 2:
                            return AbstractC27407m.b.m82710E(this.f110369x);
                        default:
                            return Float.valueOf(AbstractC27407m.b.m82716P(this.f110369x));
                    }
                }
            });
        }

        /* JADX INFO: renamed from: o11.m$b$a */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b;\u00107¨\u0006<"}, m65681d2 = {"Lo11/m$b$a;", "Lo11/m$b;", "Ljava/util/UUID;", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "imageContentDescription", "", "endIcon", "", "onTitleBarClickEvent", "onImageClickEvent", "", "isExpanded", "Lo11/h$b;", "expandedContent", "enabled", "<init>", "(Ljava/util/UUID;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;Ljava/lang/Object;ZLo11/h$b;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "z", "Ljava/util/UUID;", "Q", "()Ljava/util/UUID;", "A", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "B", "d", "C", "Ljava/lang/String;", "L", "D", "l", "E", "I", "G", "F", "Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "m", "H", "Z", "v", "()Z", "Lo11/h$b;", "J", "()Lo11/h$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: K */
            public static final int f110268K = 8;

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final int endIcon;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            private final boolean isExpanded;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            private final InterfaceC27402h.b expandedContent;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            private final boolean enabled;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final UUID id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UUID id4, TextResource title, TextResource subtitle, String str, TextResource textResource, int i13, Object onTitleBarClickEvent, Object onImageClickEvent, boolean z4, InterfaceC27402h.b expandedContent, boolean z13) {
                super(null);
                AbstractC22676k.m65750j(id4, "id");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(subtitle, "subtitle");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                AbstractC22676k.m65750j(expandedContent, "expandedContent");
                this.id = id4;
                this.title = title;
                this.subtitle = subtitle;
                this.imageUrl = str;
                this.imageContentDescription = textResource;
                this.endIcon = i13;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                this.isExpanded = z4;
                this.expandedContent = expandedContent;
                this.enabled = z13;
            }

            @Override // o11.AbstractC27407m.b
            /* JADX INFO: renamed from: G, reason: from getter */
            public int getEndIcon() {
                return this.endIcon;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: J, reason: from getter */
            public InterfaceC27402h.b getExpandedContent() {
                return this.expandedContent;
            }

            @Override // o11.AbstractC27407m.b
            /* JADX INFO: renamed from: L, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            @Override // p720m91.InterfaceC25305n
            /* JADX INFO: renamed from: Q, reason: from getter */
            public UUID getId() {
                return this.id;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSubtitle() {
                return this.subtitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.id, aVar.id) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.imageUrl, aVar.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, aVar.imageContentDescription) && this.endIcon == aVar.endIcon && AbstractC22676k.m65745e(this.onTitleBarClickEvent, aVar.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, aVar.onImageClickEvent) && this.isExpanded == aVar.isExpanded && AbstractC22676k.m65745e(this.expandedContent, aVar.expandedContent) && this.enabled == aVar.enabled;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31);
                String str = this.imageUrl;
                int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource = this.imageContentDescription;
                return Boolean.hashCode(this.enabled) + ((this.expandedContent.hashCode() + AbstractC2875y.m8289b(AbstractC33745d.m106644c(AbstractC33745d.m106644c(AbstractC11266d.m30448b(this.endIcon, (iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31), 31, this.onTitleBarClickEvent), 31, this.onImageClickEvent), 31, this.isExpanded)) * 31);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            public String toString() {
                UUID uuid = this.id;
                TextResource textResource = this.title;
                TextResource textResource2 = this.subtitle;
                String str = this.imageUrl;
                TextResource textResource3 = this.imageContentDescription;
                int i13 = this.endIcon;
                Object obj = this.onTitleBarClickEvent;
                Object obj2 = this.onImageClickEvent;
                boolean z4 = this.isExpanded;
                InterfaceC27402h.b bVar = this.expandedContent;
                boolean z13 = this.enabled;
                StringBuilder sb4 = new StringBuilder("Edit(id=");
                sb4.append(uuid);
                sb4.append(", title=");
                sb4.append(textResource);
                sb4.append(", subtitle=");
                AbstractC30007c.m91856z(sb4, textResource2, ", imageUrl=", str, ", imageContentDescription=");
                sb4.append(textResource3);
                sb4.append(", endIcon=");
                sb4.append(i13);
                sb4.append(", onTitleBarClickEvent=");
                sb4.append(obj);
                sb4.append(", onImageClickEvent=");
                sb4.append(obj2);
                sb4.append(", isExpanded=");
                sb4.append(z4);
                sb4.append(", expandedContent=");
                sb4.append(bVar);
                sb4.append(", enabled=");
                return AbstractC18489d0.m53372m(sb4, z13, ")");
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: v, reason: from getter */
            public boolean getIsExpanded() {
                return this.isExpanded;
            }

            public /* synthetic */ a(UUID uuid, TextResource textResource, TextResource textResource2, String str, TextResource textResource3, int i13, Object obj, Object obj2, boolean z4, InterfaceC27402h.b bVar, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(uuid, textResource, textResource2, str, (i14 & 16) != 0 ? null : textResource3, (i14 & 32) != 0 ? C38072d.f163053a.m121951d().getTinyIcons().getDownArrow() : i13, obj, (i14 & 128) != 0 ? C23454a0.f92919a : obj2, z4, bVar, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z13);
            }
        }

        /* JADX INFO: renamed from: o11.m$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0003\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b8\u0010 R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010 R4\u0010C\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020?0>\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010H\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u0010G¨\u0006I"}, m65681d2 = {"Lo11/m$b$b;", "Lo11/m$b;", "", "isCompleted", "Ljava/util/UUID;", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "imageContentDescription", "", "endIcon", "", "onTitleBarClickEvent", "onImageClickEvent", "isExpanded", "Lo11/h$b;", "expandedContent", "enabled", "<init>", "(ZLjava/util/UUID;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;Ljava/lang/Object;ZLo11/h$b;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "z", "Z", "()Z", "A", "Ljava/util/UUID;", "Q", "()Ljava/util/UUID;", "B", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "C", "d", "D", "Ljava/lang/String;", "L", "E", "l", "F", "I", "G", "Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "H", "m", "v", "J", "Lo11/h$b;", "()Lo11/h$b;", "K", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lkotlin/Function1;", "Ll83/a0;", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "", "M", "t", "()F", "titleBarEndContentRotation", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42105b extends b {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final UUID id;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final int endIcon;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            private final boolean isExpanded;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            private final InterfaceC27402h.b expandedContent;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            private final boolean enabled;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            private final float titleBarEndContentRotation;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final boolean isCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42105b(boolean z4, UUID id4, TextResource title, TextResource subtitle, String str, TextResource textResource, int i13, Object onTitleBarClickEvent, Object onImageClickEvent, boolean z13, InterfaceC27402h.b expandedContent, boolean z14) {
                super(null);
                AbstractC22676k.m65750j(id4, "id");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(subtitle, "subtitle");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                AbstractC22676k.m65750j(expandedContent, "expandedContent");
                this.isCompleted = z4;
                this.id = id4;
                this.title = title;
                this.subtitle = subtitle;
                this.imageUrl = str;
                this.imageContentDescription = textResource;
                this.endIcon = i13;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                this.isExpanded = z13;
                this.expandedContent = expandedContent;
                this.enabled = z14;
                this.titleBarEndContent = z4 ? C27395a.f110113a.m82552e() : super.getTitleBarEndContent();
                this.titleBarEndContentRotation = z4 ? 0.0f : super.getTitleBarEndContentRotation();
            }

            @Override // o11.AbstractC27407m.b
            /* JADX INFO: renamed from: G, reason: from getter */
            public int getEndIcon() {
                return this.endIcon;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: J, reason: from getter */
            public InterfaceC27402h.b getExpandedContent() {
                return this.expandedContent;
            }

            @Override // o11.AbstractC27407m.b
            /* JADX INFO: renamed from: L, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            @Override // p720m91.InterfaceC25305n
            /* JADX INFO: renamed from: Q, reason: from getter */
            public UUID getId() {
                return this.id;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSubtitle() {
                return this.subtitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42105b)) {
                    return false;
                }
                C42105b c42105b = (C42105b) other;
                return this.isCompleted == c42105b.isCompleted && AbstractC22676k.m65745e(this.id, c42105b.id) && AbstractC22676k.m65745e(this.title, c42105b.title) && AbstractC22676k.m65745e(this.subtitle, c42105b.subtitle) && AbstractC22676k.m65745e(this.imageUrl, c42105b.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, c42105b.imageContentDescription) && this.endIcon == c42105b.endIcon && AbstractC22676k.m65745e(this.onTitleBarClickEvent, c42105b.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, c42105b.onImageClickEvent) && this.isExpanded == c42105b.isExpanded && AbstractC22676k.m65745e(this.expandedContent, c42105b.expandedContent) && this.enabled == c42105b.enabled;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.id.hashCode() + (Boolean.hashCode(this.isCompleted) * 31)) * 31, this.title, 31), this.subtitle, 31);
                String str = this.imageUrl;
                int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource = this.imageContentDescription;
                return Boolean.hashCode(this.enabled) + ((this.expandedContent.hashCode() + AbstractC2875y.m8289b(AbstractC33745d.m106644c(AbstractC33745d.m106644c(AbstractC11266d.m30448b(this.endIcon, (iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31), 31, this.onTitleBarClickEvent), 31, this.onImageClickEvent), 31, this.isExpanded)) * 31);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m.b, o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            @Override // o11.AbstractC27407m.b, o11.AbstractC27407m
            /* JADX INFO: renamed from: t, reason: from getter */
            public float getTitleBarEndContentRotation() {
                return this.titleBarEndContentRotation;
            }

            public String toString() {
                boolean z4 = this.isCompleted;
                UUID uuid = this.id;
                TextResource textResource = this.title;
                TextResource textResource2 = this.subtitle;
                String str = this.imageUrl;
                TextResource textResource3 = this.imageContentDescription;
                int i13 = this.endIcon;
                Object obj = this.onTitleBarClickEvent;
                Object obj2 = this.onImageClickEvent;
                boolean z13 = this.isExpanded;
                InterfaceC27402h.b bVar = this.expandedContent;
                boolean z14 = this.enabled;
                StringBuilder sb4 = new StringBuilder("InProgress(isCompleted=");
                sb4.append(z4);
                sb4.append(", id=");
                sb4.append(uuid);
                sb4.append(", title=");
                AbstractC30007c.m91855y(sb4, textResource, ", subtitle=", textResource2, ", imageUrl=");
                AbstractC30007c.m91826A(sb4, str, ", imageContentDescription=", textResource3, ", endIcon=");
                sb4.append(i13);
                sb4.append(", onTitleBarClickEvent=");
                sb4.append(obj);
                sb4.append(", onImageClickEvent=");
                sb4.append(obj2);
                sb4.append(", isExpanded=");
                sb4.append(z13);
                sb4.append(", expandedContent=");
                sb4.append(bVar);
                sb4.append(", enabled=");
                sb4.append(z14);
                sb4.append(")");
                return sb4.toString();
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: v, reason: from getter */
            public boolean getIsExpanded() {
                return this.isExpanded;
            }

            public /* synthetic */ C42105b(boolean z4, UUID uuid, TextResource textResource, TextResource textResource2, String str, TextResource textResource3, int i13, Object obj, Object obj2, boolean z13, InterfaceC27402h.b bVar, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this((i14 & 1) != 0 ? false : z4, uuid, textResource, textResource2, str, (i14 & 32) != 0 ? null : textResource3, (i14 & 64) != 0 ? C38072d.f163053a.m121951d().getTinyIcons().getDownArrow() : i13, obj, (i14 & 256) != 0 ? C23454a0.f92919a : obj2, z13, bVar, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? true : z14);
            }
        }
    }

    /* JADX INFO: renamed from: o11.m$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003 !\"¨\u0006#"}, m65681d2 = {"Lo11/m$c;", "Lo11/m;", "<init>", "()V", "Lkd1/o$c;", "s", "Ll83/h;", "C", "()Lkd1/o$c;", "image", "Ly81/f;", "t", "Ly81/f;", "A", "()Ly81/f;", "endIconColor", "u", "B", "endIconPressedColor", "Li3/i;", "v", "I", "E", "()I", "role", "", "D", "()Ljava/lang/String;", "imageUrl", "c", "a", "b", "Lo11/m$c$a;", "Lo11/m$c$b;", "Lo11/m$c$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class c extends AbstractC27407m {

        /* JADX INFO: renamed from: w */
        public static final int f110294w = 8;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final InterfaceC23462h image;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final EnumC39333f endIconColor;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final EnumC39333f endIconPressedColor;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final int role;

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: F */
        public static final AbstractC22403o.c m82725F(c cVar) {
            return cVar.m82704y(cVar.getImageUrl());
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public EnumC39333f getEndIconColor() {
            return this.endIconColor;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public EnumC39333f getEndIconPressedColor() {
            return this.endIconPressedColor;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public AbstractC22403o.c mo82690j() {
            return (AbstractC22403o.c) this.image.getValue();
        }

        /* JADX INFO: renamed from: D */
        public abstract String getImageUrl();

        /* JADX INFO: renamed from: E, reason: from getter */
        public int getRole() {
            return this.role;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: o */
        public /* synthetic */ C18027i getRole() {
            return new C18027i(getRole());
        }

        private c() {
            super(null);
            this.image = AbstractC30060g.m92088H(new C27072e(this, 8));
            this.endIconColor = EnumC39333f.BRAND_WHITE;
            this.endIconPressedColor = EnumC39333f.BRAND_BLACK;
            this.role = 1;
        }

        /* JADX INFO: renamed from: o11.m$c$b */
        @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010-\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\"\u0010,R\u001a\u00100\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b*\u0010\u0012R2\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020201\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Lo11/m$c$b;", "Lo11/m$c;", "", "exerciseId", "Lcom/whoop/design/util/TextResource;", "title", "imageUrl", "imageContentDescription", "", "onTitleBarClickEvent", "onEndIconClickEvent", "onImageClickEvent", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "x", "Ljava/lang/String;", "I", "y", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "z", "D", "A", "l", "B", "Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "C", "J", "m", "Ly81/f;", "E", "Ly81/f;", "()Ly81/f;", "endIconPressedColor", "Li3/i;", "F", "role", "Lkotlin/Function1;", "Ll83/a0;", "G", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: H */
            public static final int f110310H = 8;

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final Object onEndIconClickEvent;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final EnumC39333f endIconPressedColor;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final int role;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final String exerciseId;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String exerciseId, TextResource title, String str, TextResource textResource, Object onTitleBarClickEvent, Object onEndIconClickEvent, Object onImageClickEvent) {
                super(null);
                AbstractC22676k.m65750j(exerciseId, "exerciseId");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onEndIconClickEvent, "onEndIconClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                this.exerciseId = exerciseId;
                this.title = title;
                this.imageUrl = str;
                this.imageContentDescription = textResource;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onEndIconClickEvent = onEndIconClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                this.endIconPressedColor = EnumC39333f.BRAND_WHITE;
                this.role = 0;
                this.titleBarEndContent = new C37816b(new C24823a(this, 6), true, -506464741);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: K */
            public static final C23454a0 m82741K(b bVar, Function1 onViewEvent, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(onViewEvent) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), bVar.getEndIconColor(), null, bVar.getEndIconPressedColor(), false, false, false, 0.0f, false, 1000, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62329g2);
                    boolean zM87157i = c28655q.m87157i(bVar) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C25592o(18, onViewEvent, bVar);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: L */
            public static final C23454a0 m82742L(Function1 function1, b bVar) {
                function1.invoke(bVar.getOnEndIconClickEvent());
                return C23454a0.f92919a;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: B, reason: from getter */
            public EnumC39333f getEndIconPressedColor() {
                return this.endIconPressedColor;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: D, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: E, reason: from getter */
            public int getRole() {
                return this.role;
            }

            /* JADX INFO: renamed from: I, reason: from getter */
            public String getExerciseId() {
                return this.exerciseId;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public Object getOnEndIconClickEvent() {
                return this.onEndIconClickEvent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.exerciseId, bVar.exerciseId) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.imageUrl, bVar.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, bVar.imageContentDescription) && AbstractC22676k.m65745e(this.onTitleBarClickEvent, bVar.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onEndIconClickEvent, bVar.onEndIconClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, bVar.onImageClickEvent);
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.exerciseId.hashCode() * 31, this.title, 31);
                String str = this.imageUrl;
                int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource = this.imageContentDescription;
                return this.onImageClickEvent.hashCode() + AbstractC33745d.m106644c(AbstractC33745d.m106644c((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.onTitleBarClickEvent), 31, this.onEndIconClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m.c, o11.AbstractC27407m
            /* JADX INFO: renamed from: o */
            public /* synthetic */ C18027i getRole() {
                return new C18027i(getRole());
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            public String toString() {
                String str = this.exerciseId;
                TextResource textResource = this.title;
                String str2 = this.imageUrl;
                TextResource textResource2 = this.imageContentDescription;
                Object obj = this.onTitleBarClickEvent;
                Object obj2 = this.onEndIconClickEvent;
                Object obj3 = this.onImageClickEvent;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("Removable(exerciseId=", str, ", title=", textResource, ", imageUrl=");
                AbstractC30007c.m91826A(sbM91847q, str2, ", imageContentDescription=", textResource2, ", onTitleBarClickEvent=");
                sbM91847q.append(obj);
                sbM91847q.append(", onEndIconClickEvent=");
                sbM91847q.append(obj2);
                sbM91847q.append(", onImageClickEvent=");
                return AbstractC2875y.m8303p(sbM91847q, ")", obj3);
            }

            public /* synthetic */ b(String str, TextResource textResource, String str2, TextResource textResource2, Object obj, Object obj2, Object obj3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, textResource, str2, (i13 & 8) != 0 ? null : textResource2, obj, obj2, (i13 & 64) != 0 ? C23454a0.f92919a : obj3);
            }
        }

        /* JADX INFO: renamed from: o11.m$c$a */
        @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R4\u0010:\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002000.\u0012\u0004\u0012\u000200\u0018\u00010.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, m65681d2 = {"Lo11/m$c$a;", "Lo11/m$c;", "", "exerciseId", "Lcom/whoop/design/util/TextResource;", "title", "imageUrl", "imageContentDescription", "", "onEndIconClickEvent", "onTitleBarClickEvent", "onImageClickEvent", "", "showInformationIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "x", "Ljava/lang/String;", "getExerciseId", "y", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "z", "D", "A", "l", "B", "Ljava/lang/Object;", "J", "()Ljava/lang/Object;", "C", "n", "m", "E", "Z", "getShowInformationIcon", "()Z", "Lkotlin/Function1;", "Li3/z;", "Ll83/a0;", "F", "Lkotlin/jvm/functions/Function1;", "p", "()Lkotlin/jvm/functions/Function1;", "semanticsProperties", "G", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: H */
            public static final int f110299H = 8;

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final Object onEndIconClickEvent;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final boolean showInformationIcon;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final Function1 semanticsProperties;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final String exerciseId;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String exerciseId, TextResource title, String str, TextResource textResource, Object onEndIconClickEvent, Object onTitleBarClickEvent, Object onImageClickEvent, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(exerciseId, "exerciseId");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(onEndIconClickEvent, "onEndIconClickEvent");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                this.exerciseId = exerciseId;
                this.title = title;
                this.imageUrl = str;
                this.imageContentDescription = textResource;
                this.onEndIconClickEvent = onEndIconClickEvent;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                this.showInformationIcon = z4;
                this.semanticsProperties = new C27266m(10);
                this.titleBarEndContent = z4 ? new C37816b(new C24823a(this, 5), true, 1929397075) : super.getTitleBarEndContent();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: K */
            public static final C23454a0 m82735K(a aVar, Function1 it, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(it, "it");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(it) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.g.f109144f, C38072d.f163053a.m121951d().getTinyIcons().getTinyInformation(), aVar.getEndIconColor(), null, aVar.getEndIconPressedColor(), false, false, false, 0.5f, false, 744, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62248I2);
                    boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C25592o(17, it, aVar);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: L */
            public static final C23454a0 m82736L(Function1 function1, a aVar) {
                function1.invoke(aVar.getOnEndIconClickEvent());
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: x */
            public static final C23454a0 m82737x(InterfaceC18044z interfaceC18044z) {
                AbstractC22676k.m65750j(interfaceC18044z, "<this>");
                AbstractC18041w.m51814m(interfaceC18044z, EnumC22167a.f85978x);
                return C23454a0.f92919a;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: D, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public Object getOnEndIconClickEvent() {
                return this.onEndIconClickEvent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.exerciseId, aVar.exerciseId) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.imageUrl, aVar.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, aVar.imageContentDescription) && AbstractC22676k.m65745e(this.onEndIconClickEvent, aVar.onEndIconClickEvent) && AbstractC22676k.m65745e(this.onTitleBarClickEvent, aVar.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, aVar.onImageClickEvent) && this.showInformationIcon == aVar.showInformationIcon;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.exerciseId.hashCode() * 31, this.title, 31);
                String str = this.imageUrl;
                int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource = this.imageContentDescription;
                return Boolean.hashCode(this.showInformationIcon) + AbstractC33745d.m106644c(AbstractC33745d.m106644c(AbstractC33745d.m106644c((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.onEndIconClickEvent), 31, this.onTitleBarClickEvent), 31, this.onImageClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: p, reason: from getter */
            public Function1 getSemanticsProperties() {
                return this.semanticsProperties;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            public String toString() {
                String str = this.exerciseId;
                TextResource textResource = this.title;
                String str2 = this.imageUrl;
                TextResource textResource2 = this.imageContentDescription;
                Object obj = this.onEndIconClickEvent;
                Object obj2 = this.onTitleBarClickEvent;
                Object obj3 = this.onImageClickEvent;
                boolean z4 = this.showInformationIcon;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("NotSelected(exerciseId=", str, ", title=", textResource, ", imageUrl=");
                AbstractC30007c.m91826A(sbM91847q, str2, ", imageContentDescription=", textResource2, ", onEndIconClickEvent=");
                sbM91847q.append(obj);
                sbM91847q.append(", onTitleBarClickEvent=");
                sbM91847q.append(obj2);
                sbM91847q.append(", onImageClickEvent=");
                sbM91847q.append(obj3);
                sbM91847q.append(", showInformationIcon=");
                sbM91847q.append(z4);
                sbM91847q.append(")");
                return sbM91847q.toString();
            }

            public /* synthetic */ a(String str, TextResource textResource, String str2, TextResource textResource2, Object obj, Object obj2, Object obj3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, textResource, str2, (i13 & 8) != 0 ? null : textResource2, obj, obj2, (i13 & 64) != 0 ? C23454a0.f92919a : obj3, (i13 & 128) != 0 ? true : z4);
            }
        }

        /* JADX INFO: renamed from: o11.m$c$c, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001a\u00103\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b \u0010-R\u001a\u00105\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b\"\u0010-R&\u0010=\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R2\u0010A\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020806\u0012\u0004\u0012\u000208068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, m65681d2 = {"Lo11/m$c$c;", "Lo11/m$c;", "", "exerciseId", "Lcom/whoop/design/util/TextResource;", "title", "imageUrl", "imageContentDescription", "", "onEndIconClickEvent", "onTitleBarClickEvent", "onImageClickEvent", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "x", "Ljava/lang/String;", "getExerciseId", "y", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "z", "D", "A", "l", "B", "Ljava/lang/Object;", "J", "()Ljava/lang/Object;", "C", "n", "m", "Ly81/f;", "E", "Ly81/f;", "g", "()Ly81/f;", "backgroundColor", "F", "u", "titleTextColor", "G", "endIconColor", "H", "endIconPressedColor", "Lkotlin/Function1;", "Li3/z;", "Ll83/a0;", "I", "Lkotlin/jvm/functions/Function1;", "p", "()Lkotlin/jvm/functions/Function1;", "semanticsProperties", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42106c extends c {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final Object onEndIconClickEvent;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final EnumC39333f backgroundColor;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final EnumC39333f titleTextColor;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final EnumC39333f endIconColor;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            private final EnumC39333f endIconPressedColor;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            private final Function1 semanticsProperties;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final String exerciseId;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42106c(String exerciseId, TextResource title, String str, TextResource textResource, Object onEndIconClickEvent, Object onTitleBarClickEvent, Object onImageClickEvent) {
                super(null);
                AbstractC22676k.m65750j(exerciseId, "exerciseId");
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(onEndIconClickEvent, "onEndIconClickEvent");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                this.exerciseId = exerciseId;
                this.title = title;
                this.imageUrl = str;
                this.imageContentDescription = textResource;
                this.onEndIconClickEvent = onEndIconClickEvent;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
                this.backgroundColor = enumC39333f;
                EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
                this.titleTextColor = enumC39333f2;
                this.endIconColor = enumC39333f2;
                this.endIconPressedColor = enumC39333f;
                this.semanticsProperties = new C27266m(11);
                this.titleBarEndContent = new C37816b(new C24823a(this, 7), true, -784557639);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: K */
            public static final C23454a0 m82748K(C42106c c42106c, Function1 onViewEvent, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(onViewEvent) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.g.f109144f, C38072d.f163053a.m121951d().getTinyIcons().getTinyInformation(), c42106c.getEndIconColor(), null, c42106c.getEndIconPressedColor(), false, false, false, 0.7f, false, 744, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62248I2);
                    boolean zM87157i = c28655q.m87157i(c42106c) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C25592o(19, onViewEvent, c42106c);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: L */
            public static final C23454a0 m82749L(Function1 function1, C42106c c42106c) {
                function1.invoke(c42106c.getOnEndIconClickEvent());
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: x */
            public static final C23454a0 m82750x(InterfaceC18044z interfaceC18044z) {
                AbstractC22676k.m65750j(interfaceC18044z, "<this>");
                AbstractC18041w.m51814m(interfaceC18044z, EnumC22167a.f85977w);
                return C23454a0.f92919a;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: A, reason: from getter */
            public EnumC39333f getEndIconColor() {
                return this.endIconColor;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: B, reason: from getter */
            public EnumC39333f getEndIconPressedColor() {
                return this.endIconPressedColor;
            }

            @Override // o11.AbstractC27407m.c
            /* JADX INFO: renamed from: D, reason: from getter */
            public String getImageUrl() {
                return this.imageUrl;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public Object getOnEndIconClickEvent() {
                return this.onEndIconClickEvent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42106c)) {
                    return false;
                }
                C42106c c42106c = (C42106c) other;
                return AbstractC22676k.m65745e(this.exerciseId, c42106c.exerciseId) && AbstractC22676k.m65745e(this.title, c42106c.title) && AbstractC22676k.m65745e(this.imageUrl, c42106c.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, c42106c.imageContentDescription) && AbstractC22676k.m65745e(this.onEndIconClickEvent, c42106c.onEndIconClickEvent) && AbstractC22676k.m65745e(this.onTitleBarClickEvent, c42106c.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, c42106c.onImageClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: g, reason: from getter */
            public EnumC39333f getBackgroundColor() {
                return this.backgroundColor;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(this.exerciseId.hashCode() * 31, this.title, 31);
                String str = this.imageUrl;
                int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource = this.imageContentDescription;
                return this.onImageClickEvent.hashCode() + AbstractC33745d.m106644c(AbstractC33745d.m106644c((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.onEndIconClickEvent), 31, this.onTitleBarClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: p, reason: from getter */
            public Function1 getSemanticsProperties() {
                return this.semanticsProperties;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            public String toString() {
                String str = this.exerciseId;
                TextResource textResource = this.title;
                String str2 = this.imageUrl;
                TextResource textResource2 = this.imageContentDescription;
                Object obj = this.onEndIconClickEvent;
                Object obj2 = this.onTitleBarClickEvent;
                Object obj3 = this.onImageClickEvent;
                StringBuilder sbM91847q = AbstractC30007c.m91847q("Selected(exerciseId=", str, ", title=", textResource, ", imageUrl=");
                AbstractC30007c.m91826A(sbM91847q, str2, ", imageContentDescription=", textResource2, ", onEndIconClickEvent=");
                sbM91847q.append(obj);
                sbM91847q.append(", onTitleBarClickEvent=");
                sbM91847q.append(obj2);
                sbM91847q.append(", onImageClickEvent=");
                return AbstractC2875y.m8303p(sbM91847q, ")", obj3);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: u, reason: from getter */
            public EnumC39333f getTitleTextColor() {
                return this.titleTextColor;
            }

            public /* synthetic */ C42106c(String str, TextResource textResource, String str2, TextResource textResource2, Object obj, Object obj2, Object obj3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, textResource, str2, (i13 & 8) != 0 ? null : textResource2, obj, obj2, (i13 & 64) != 0 ? C23454a0.f92919a : obj3);
            }
        }
    }

    /* JADX INFO: renamed from: o11.m$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lo11/m$d;", "Lo11/m;", "<init>", "()V", "", "s", "Z", "v", "()Z", "isExpanded", "Ly81/f;", "t", "Ly81/f;", "z", "()Ly81/f;", "endIconColor", "u", "A", "endIconPressedColor", "a", "b", "Lo11/m$d$a;", "Lo11/m$d$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class d extends AbstractC27407m {

        /* JADX INFO: renamed from: v */
        public static final int f110334v = 8;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean isExpanded;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final EnumC39333f endIconColor;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final EnumC39333f endIconPressedColor;

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public EnumC39333f getEndIconPressedColor() {
            return this.endIconPressedColor;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: v, reason: from getter */
        public boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public EnumC39333f getEndIconColor() {
            return this.endIconColor;
        }

        private d() {
            super(null);
            this.isExpanded = true;
            this.endIconColor = EnumC39333f.BRAND_WHITE;
            this.endIconPressedColor = EnumC39333f.BRAND_BLACK;
        }

        /* JADX INFO: renamed from: o11.m$d$b */
        @Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00107\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001a\u0010?\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R4\u0010F\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020A0@\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m65681d2 = {"Lo11/m$d$b;", "Lo11/m$d;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lo11/h$c;", "expandedContent", "", "enabled", "", "endIconRes", "", "onEndIconClickEvent", "", "achievementIcons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lo11/h$c;ZLjava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "x", "d", "y", "Lo11/h$c;", "D", "()Lo11/h$c;", "z", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "A", "Ljava/lang/Integer;", "getEndIconRes", "()Ljava/lang/Integer;", "B", "Ljava/lang/Object;", "getOnEndIconClickEvent", "()Ljava/lang/Object;", "C", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ly81/f;", "Ly81/f;", "q", "()Ly81/f;", "subtitleTextColor", "Lkd1/o$a;", "E", "Lkd1/o$a;", "()Lkd1/o$a;", "image", "F", "k", "imageBackgroundColor", "Lkotlin/Function1;", "Ll83/a0;", "G", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final Integer endIconRes;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final Object onEndIconClickEvent;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final List<Integer> achievementIcons;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final EnumC39333f subtitleTextColor;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final AbstractC22403o.a image;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final EnumC39333f imageBackgroundColor;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final InterfaceC27402h.c expandedContent;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final boolean enabled;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TextResource title, TextResource subtitle, InterfaceC27402h.c expandedContent, boolean z4, Integer num, Object onEndIconClickEvent, List<Integer> achievementIcons) {
                super(null);
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(subtitle, "subtitle");
                AbstractC22676k.m65750j(expandedContent, "expandedContent");
                AbstractC22676k.m65750j(onEndIconClickEvent, "onEndIconClickEvent");
                AbstractC22676k.m65750j(achievementIcons, "achievementIcons");
                this.title = title;
                this.subtitle = subtitle;
                this.expandedContent = expandedContent;
                this.enabled = z4;
                this.endIconRes = num;
                this.onEndIconClickEvent = onEndIconClickEvent;
                this.achievementIcons = achievementIcons;
                this.subtitleTextColor = EnumC39333f.STRAIN;
                this.image = new AbstractC22403o.a(C38072d.f163053a.m121951d().getActivities().getWeightlifting());
                this.imageBackgroundColor = EnumC39333f.WHITE_10;
                this.titleBarEndContent = num != null ? new C37816b(new C24823a(this, 8), true, -1415924812) : super.getTitleBarEndContent();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: F */
            public static final C23454a0 m82765F(b bVar, Function1 onViewEvent, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(onViewEvent) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, bVar.endIconRes.intValue(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, true, 504, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62248I2);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "exercise_tile_end_icon_" + AbstractC8693b.m21274h(bVar.getTitle(), c28655q, 0));
                    boolean zM87157i = c28655q.m87157i(bVar) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C25592o(20, onViewEvent, bVar);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3599a, null, (InterfaceC4339a) objM87133R, c28655q, 0, 8);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: G */
            public static final C23454a0 m82766G(Function1 function1, b bVar) {
                function1.invoke(bVar.onEndIconClickEvent);
                return C23454a0.f92919a;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: D, reason: from getter */
            public InterfaceC27402h.c getExpandedContent() {
                return this.expandedContent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: E, reason: from getter and merged with bridge method [inline-methods] */
            public AbstractC22403o.a mo82690j() {
                return this.image;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSubtitle() {
                return this.subtitle;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: e */
            public List<Integer> mo82685e() {
                return this.achievementIcons;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.subtitle, bVar.subtitle) && AbstractC22676k.m65745e(this.expandedContent, bVar.expandedContent) && this.enabled == bVar.enabled && AbstractC22676k.m65745e(this.endIconRes, bVar.endIconRes) && AbstractC22676k.m65745e(this.onEndIconClickEvent, bVar.onEndIconClickEvent) && AbstractC22676k.m65745e(this.achievementIcons, bVar.achievementIcons);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.expandedContent.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31, 31, this.enabled);
                Integer num = this.endIconRes;
                return this.achievementIcons.hashCode() + AbstractC33745d.m106644c((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.onEndIconClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: k, reason: from getter */
            public EnumC39333f getImageBackgroundColor() {
                return this.imageBackgroundColor;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: q, reason: from getter */
            public EnumC39333f getSubtitleTextColor() {
                return this.subtitleTextColor;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            public String toString() {
                TextResource textResource = this.title;
                TextResource textResource2 = this.subtitle;
                InterfaceC27402h.c cVar = this.expandedContent;
                boolean z4 = this.enabled;
                Integer num = this.endIconRes;
                Object obj = this.onEndIconClickEvent;
                List<Integer> list = this.achievementIcons;
                StringBuilder sbM106658q = AbstractC33745d.m106658q("Workout(title=", textResource, ", subtitle=", textResource2, ", expandedContent=");
                sbM106658q.append(cVar);
                sbM106658q.append(", enabled=");
                sbM106658q.append(z4);
                sbM106658q.append(", endIconRes=");
                sbM106658q.append(num);
                sbM106658q.append(", onEndIconClickEvent=");
                sbM106658q.append(obj);
                sbM106658q.append(", achievementIcons=");
                return AbstractC3855a.m11829m(sbM106658q, list, ")");
            }

            public /* synthetic */ b(TextResource textResource, TextResource textResource2, InterfaceC27402h.c cVar, boolean z4, Integer num, Object obj, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(textResource, textResource2, cVar, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? C23454a0.f92919a : obj, (i13 & 64) != 0 ? C25271y.f99162w : list);
            }
        }

        /* JADX INFO: renamed from: o11.m$d$a */
        @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010S\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b;\u0010RR\u001a\u0010U\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\b \u00108R4\u0010\\\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020W0V\u0012\u0004\u0012\u00020W\u0018\u00010V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006]"}, m65681d2 = {"Lo11/m$d$a;", "Lo11/m$d;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "imageContentDescription", "", "onTitleBarClickEvent", "onImageClickEvent", "Lo11/h;", "expandedContent", "", "enabled", "informationIconClickEvent", "showInformationIcon", "shouldSubtitleBeAboveTitle", "", "endIconRes", "onEndIconClickEvent", "", "achievementIcons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Lo11/h;ZLjava/lang/Object;ZZLjava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "x", "d", "y", "Ljava/lang/String;", "getImageUrl", "z", "l", "A", "Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "B", "m", "C", "Lo11/h;", "i", "()Lo11/h;", "D", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "E", "getInformationIconClickEvent", "F", "getShowInformationIcon", "G", "getShouldSubtitleBeAboveTitle", "H", "Ljava/lang/Integer;", "getEndIconRes", "()Ljava/lang/Integer;", "I", "getOnEndIconClickEvent", "J", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ly81/f;", "K", "Ly81/f;", "q", "()Ly81/f;", "subtitleTextColor", "Lkd1/o$c;", "L", "Lkd1/o$c;", "()Lkd1/o$c;", "image", "M", "isSubtitleAboveTitle", "Lkotlin/Function1;", "Ll83/a0;", "N", "Lkotlin/jvm/functions/Function3;", "s", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: O */
            public static final int f110338O = 8;

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final Object onTitleBarClickEvent;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final Object onImageClickEvent;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final InterfaceC27402h expandedContent;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final boolean enabled;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final Object informationIconClickEvent;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final boolean showInformationIcon;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final boolean shouldSubtitleBeAboveTitle;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            private final Integer endIconRes;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            private final Object onEndIconClickEvent;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            private final List<Integer> achievementIcons;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            private final EnumC39333f subtitleTextColor;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            private final AbstractC22403o.c image;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            private final boolean isSubtitleAboveTitle;

            /* JADX INFO: renamed from: N, reason: from kotlin metadata */
            private final Function3 titleBarEndContent;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            private final TextResource title;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final TextResource subtitle;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final TextResource imageContentDescription;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TextResource title, TextResource textResource, String str, TextResource textResource2, Object onTitleBarClickEvent, Object onImageClickEvent, InterfaceC27402h expandedContent, boolean z4, Object informationIconClickEvent, boolean z13, boolean z14, Integer num, Object onEndIconClickEvent, List<Integer> achievementIcons) {
                Function3 titleBarEndContent;
                super(null);
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(onTitleBarClickEvent, "onTitleBarClickEvent");
                AbstractC22676k.m65750j(onImageClickEvent, "onImageClickEvent");
                AbstractC22676k.m65750j(expandedContent, "expandedContent");
                AbstractC22676k.m65750j(informationIconClickEvent, "informationIconClickEvent");
                AbstractC22676k.m65750j(onEndIconClickEvent, "onEndIconClickEvent");
                AbstractC22676k.m65750j(achievementIcons, "achievementIcons");
                this.title = title;
                this.subtitle = textResource;
                this.imageUrl = str;
                this.imageContentDescription = textResource2;
                this.onTitleBarClickEvent = onTitleBarClickEvent;
                this.onImageClickEvent = onImageClickEvent;
                this.expandedContent = expandedContent;
                this.enabled = z4;
                this.informationIconClickEvent = informationIconClickEvent;
                this.showInformationIcon = z13;
                this.shouldSubtitleBeAboveTitle = z14;
                this.endIconRes = num;
                this.onEndIconClickEvent = onEndIconClickEvent;
                this.achievementIcons = achievementIcons;
                this.subtitleTextColor = EnumC39333f.ACCENT_ACTION;
                this.image = m82704y(str);
                this.isSubtitleAboveTitle = z14;
                if (z13) {
                    final int i13 = 0;
                    titleBarEndContent = new C37816b(new Function3(this) { // from class: o11.o

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ AbstractC27407m.d.a f110371x;

                        {
                            this.f110371x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i14 = i13;
                            Function1 function1 = (Function1) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i14) {
                                case 0:
                                    return AbstractC27407m.d.a.m82758G(this.f110371x, function1, composer, iIntValue);
                                default:
                                    return AbstractC27407m.d.a.m82760I(this.f110371x, function1, composer, iIntValue);
                            }
                        }
                    }, true, -2006694616);
                } else if (num != null) {
                    final int i14 = 1;
                    titleBarEndContent = new C37816b(new Function3(this) { // from class: o11.o

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ AbstractC27407m.d.a f110371x;

                        {
                            this.f110371x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i15 = i14;
                            Function1 function1 = (Function1) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i15) {
                                case 0:
                                    return AbstractC27407m.d.a.m82758G(this.f110371x, function1, composer, iIntValue);
                                default:
                                    return AbstractC27407m.d.a.m82760I(this.f110371x, function1, composer, iIntValue);
                            }
                        }
                    }, true, -1608366369);
                } else {
                    titleBarEndContent = super.getTitleBarEndContent();
                }
                this.titleBarEndContent = titleBarEndContent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: G */
            public static final C23454a0 m82758G(a aVar, Function1 onViewEvent, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(onViewEvent) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.g.f109144f, C38072d.f163053a.m121951d().getTinyIcons().getTinyInformation(), aVar.getEndIconColor(), null, aVar.getEndIconPressedColor(), false, false, false, 0.5f, false, 744, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62248I2);
                    boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C27410p(onViewEvent, aVar, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: H */
            public static final C23454a0 m82759H(Function1 function1, a aVar) {
                function1.invoke(aVar.informationIconClickEvent);
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: I */
            public static final C23454a0 m82760I(a aVar, Function1 onViewEvent, Composer composer, int i13) {
                int i14;
                AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
                if ((i13 & 6) == 0) {
                    i14 = i13 | (((C28655q) composer).m87157i(onViewEvent) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
                    C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, aVar.endIconRes.intValue(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, true, 504, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62248I2);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "exercise_tile_end_icon_" + AbstractC8693b.m21274h(aVar.getTitle(), c28655q, 0));
                    boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 14) == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C27410p(onViewEvent, aVar, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3599a, null, (InterfaceC4339a) objM87133R, c28655q, 0, 8);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: J */
            public static final C23454a0 m82761J(Function1 function1, a aVar) {
                function1.invoke(aVar.onEndIconClickEvent);
                return C23454a0.f92919a;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: F, reason: from getter and merged with bridge method [inline-methods] */
            public AbstractC22403o.c mo82690j() {
                return this.image;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: d, reason: from getter */
            public TextResource getSubtitle() {
                return this.subtitle;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: e */
            public List<Integer> mo82685e() {
                return this.achievementIcons;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.imageUrl, aVar.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, aVar.imageContentDescription) && AbstractC22676k.m65745e(this.onTitleBarClickEvent, aVar.onTitleBarClickEvent) && AbstractC22676k.m65745e(this.onImageClickEvent, aVar.onImageClickEvent) && AbstractC22676k.m65745e(this.expandedContent, aVar.expandedContent) && this.enabled == aVar.enabled && AbstractC22676k.m65745e(this.informationIconClickEvent, aVar.informationIconClickEvent) && this.showInformationIcon == aVar.showInformationIcon && this.shouldSubtitleBeAboveTitle == aVar.shouldSubtitleBeAboveTitle && AbstractC22676k.m65745e(this.endIconRes, aVar.endIconRes) && AbstractC22676k.m65745e(this.onEndIconClickEvent, aVar.onEndIconClickEvent) && AbstractC22676k.m65745e(this.achievementIcons, aVar.achievementIcons);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                TextResource textResource = this.subtitle;
                int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
                String str = this.imageUrl;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                TextResource textResource2 = this.imageContentDescription;
                int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106644c(AbstractC2875y.m8289b((this.expandedContent.hashCode() + AbstractC33745d.m106644c(AbstractC33745d.m106644c((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.onTitleBarClickEvent), 31, this.onImageClickEvent)) * 31, 31, this.enabled), 31, this.informationIconClickEvent), 31, this.showInformationIcon), 31, this.shouldSubtitleBeAboveTitle);
                Integer num = this.endIconRes;
                return this.achievementIcons.hashCode() + AbstractC33745d.m106644c((iM8289b + (num != null ? num.hashCode() : 0)) * 31, 31, this.onEndIconClickEvent);
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: i, reason: from getter */
            public InterfaceC27402h getExpandedContent() {
                return this.expandedContent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getImageContentDescription() {
                return this.imageContentDescription;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: m, reason: from getter */
            public Object getOnImageClickEvent() {
                return this.onImageClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: n, reason: from getter */
            public Object getOnTitleBarClickEvent() {
                return this.onTitleBarClickEvent;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: q, reason: from getter */
            public EnumC39333f getSubtitleTextColor() {
                return this.subtitleTextColor;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: r, reason: from getter */
            public TextResource getTitle() {
                return this.title;
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: s, reason: from getter */
            public Function3 getTitleBarEndContent() {
                return this.titleBarEndContent;
            }

            public String toString() {
                TextResource textResource = this.title;
                TextResource textResource2 = this.subtitle;
                String str = this.imageUrl;
                TextResource textResource3 = this.imageContentDescription;
                Object obj = this.onTitleBarClickEvent;
                Object obj2 = this.onImageClickEvent;
                InterfaceC27402h interfaceC27402h = this.expandedContent;
                boolean z4 = this.enabled;
                Object obj3 = this.informationIconClickEvent;
                boolean z13 = this.showInformationIcon;
                boolean z14 = this.shouldSubtitleBeAboveTitle;
                Integer num = this.endIconRes;
                Object obj4 = this.onEndIconClickEvent;
                List<Integer> list = this.achievementIcons;
                StringBuilder sbM106658q = AbstractC33745d.m106658q("Exercise(title=", textResource, ", subtitle=", textResource2, ", imageUrl=");
                AbstractC30007c.m91826A(sbM106658q, str, ", imageContentDescription=", textResource3, ", onTitleBarClickEvent=");
                sbM106658q.append(obj);
                sbM106658q.append(", onImageClickEvent=");
                sbM106658q.append(obj2);
                sbM106658q.append(", expandedContent=");
                sbM106658q.append(interfaceC27402h);
                sbM106658q.append(", enabled=");
                sbM106658q.append(z4);
                sbM106658q.append(", informationIconClickEvent=");
                sbM106658q.append(obj3);
                sbM106658q.append(", showInformationIcon=");
                sbM106658q.append(z13);
                sbM106658q.append(", shouldSubtitleBeAboveTitle=");
                sbM106658q.append(z14);
                sbM106658q.append(", endIconRes=");
                sbM106658q.append(num);
                sbM106658q.append(", onEndIconClickEvent=");
                sbM106658q.append(obj4);
                sbM106658q.append(", achievementIcons=");
                sbM106658q.append(list);
                sbM106658q.append(")");
                return sbM106658q.toString();
            }

            @Override // o11.AbstractC27407m
            /* JADX INFO: renamed from: w, reason: from getter */
            public boolean getIsSubtitleAboveTitle() {
                return this.isSubtitleAboveTitle;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ a(TextResource textResource, TextResource textResource2, String str, TextResource textResource3, Object obj, Object obj2, InterfaceC27402h interfaceC27402h, boolean z4, Object obj3, boolean z13, boolean z14, Integer num, Object obj4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                TextResource textResource4 = (i13 & 2) != 0 ? null : textResource2;
                TextResource textResource5 = (i13 & 8) != 0 ? null : textResource3;
                int i14 = i13 & 16;
                C23454a0 c23454a0 = C23454a0.f92919a;
                this(textResource, textResource4, str, textResource5, i14 != 0 ? c23454a0 : obj, (i13 & 32) != 0 ? c23454a0 : obj2, interfaceC27402h, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? c23454a0 : obj3, (i13 & 512) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : num, (i13 & 4096) != 0 ? c23454a0 : obj4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25271y.f99162w : list);
            }
        }
    }

    public /* synthetic */ AbstractC27407m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final float m82682c(AbstractC27407m abstractC27407m) {
        return abstractC27407m.getEnabled() ? 1.0f : 0.4f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m82683x(InterfaceC18044z interfaceC18044z) {
        AbstractC22676k.m65750j(interfaceC18044z, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public List<Integer> mo82685e() {
        return this.achievementIcons;
    }

    /* JADX INFO: renamed from: f */
    public final float m82686f() {
        return ((Number) this.alpha.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public InterfaceC27402h getExpandedContent() {
        return this.expandedContent;
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC22403o mo82690j();

    /* JADX INFO: renamed from: k, reason: from getter */
    public EnumC39333f getImageBackgroundColor() {
        return this.imageBackgroundColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public TextResource getImageContentDescription() {
        return this.imageContentDescription;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public Object getOnImageClickEvent() {
        return this.onImageClickEvent;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public Object getOnTitleBarClickEvent() {
        return this.onTitleBarClickEvent;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public C18027i getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public Function1 getSemanticsProperties() {
        return this.semanticsProperties;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public EnumC39333f getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    /* JADX INFO: renamed from: r */
    public abstract TextResource getTitle();

    /* JADX INFO: renamed from: s, reason: from getter */
    public Function3 getTitleBarEndContent() {
        return this.titleBarEndContent;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public float getTitleBarEndContentRotation() {
        return this.titleBarEndContentRotation;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public EnumC39333f getTitleTextColor() {
        return this.titleTextColor;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public boolean getIsSubtitleAboveTitle() {
        return this.isSubtitleAboveTitle;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC22403o.c m82704y(String str) {
        C38072d c38072d = C38072d.f163053a;
        return new AbstractC22403o.c(str, c38072d.m121951d().getLogo().getWhoop(), 0, c38072d.m121951d().getLogo().getWhoop(), 4, null);
    }

    private AbstractC27407m() {
        this.enabled = true;
        this.titleTextColor = EnumC39333f.BRAND_WHITE;
        this.subtitleTextColor = EnumC39333f.WHITE_50;
        this.achievementIcons = C25271y.f99162w;
        this.imageBackgroundColor = EnumC39333f.BRAND_BLACK;
        this.backgroundColor = EnumC39333f.WHITE_10;
        C23454a0 c23454a0 = C23454a0.f92919a;
        this.onTitleBarClickEvent = c23454a0;
        this.onImageClickEvent = c23454a0;
        this.alpha = AbstractC30060g.m92088H(new C27072e(this, 7));
        this.semanticsProperties = new C27266m(9);
    }

    /* JADX INFO: renamed from: o11.m$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R2\u00101\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020.0-\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b\u0016\u00100¨\u00062"}, m65681d2 = {"Lo11/m$a;", "Lo11/m;", "", "exerciseId", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "imageUrl", "imageContentDescription", "", "enabled", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Ljava/lang/String;", "getExerciseId", "t", "Lcom/whoop/design/util/TextResource;", "r", "()Lcom/whoop/design/util/TextResource;", "u", "d", "v", "getImageUrl", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "l", "x", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "Lkd1/o$c;", "y", "Lkd1/o$c;", "z", "()Lkd1/o$c;", "image", "Lkotlin/Function1;", "Ll83/a0;", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "titleBarEndContent", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27407m {

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final String exerciseId;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final String imageUrl;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final TextResource imageContentDescription;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final boolean enabled;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final AbstractC22403o.c image;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final Function3 titleBarEndContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String exerciseId, TextResource title, TextResource subtitle, String str, TextResource textResource, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.exerciseId = exerciseId;
            this.title = title;
            this.subtitle = subtitle;
            this.imageUrl = str;
            this.imageContentDescription = textResource;
            this.enabled = z4;
            this.image = m82704y(str);
            this.titleBarEndContent = C27395a.f110113a.m82554g();
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getSubtitle() {
            return this.subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.exerciseId, aVar.exerciseId) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.imageUrl, aVar.imageUrl) && AbstractC22676k.m65745e(this.imageContentDescription, aVar.imageContentDescription) && this.enabled == aVar.enabled;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: h, reason: from getter */
        public boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.exerciseId.hashCode() * 31, this.title, 31), this.subtitle, 31);
            String str = this.imageUrl;
            int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
            TextResource textResource = this.imageContentDescription;
            return Boolean.hashCode(this.enabled) + ((iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31);
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: l, reason: from getter */
        public TextResource getImageContentDescription() {
            return this.imageContentDescription;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: r, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: s, reason: from getter */
        public Function3 getTitleBarEndContent() {
            return this.titleBarEndContent;
        }

        public String toString() {
            String str = this.exerciseId;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            String str2 = this.imageUrl;
            TextResource textResource3 = this.imageContentDescription;
            boolean z4 = this.enabled;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("Drag(exerciseId=", str, ", title=", textResource, ", subtitle=");
            AbstractC30007c.m91856z(sbM91847q, textResource2, ", imageUrl=", str2, ", imageContentDescription=");
            sbM91847q.append(textResource3);
            sbM91847q.append(", enabled=");
            sbM91847q.append(z4);
            sbM91847q.append(")");
            return sbM91847q.toString();
        }

        @Override // o11.AbstractC27407m
        /* JADX INFO: renamed from: z, reason: from getter and merged with bridge method [inline-methods] */
        public AbstractC22403o.c mo82690j() {
            return this.image;
        }

        public /* synthetic */ a(String str, TextResource textResource, TextResource textResource2, String str2, TextResource textResource3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textResource, textResource2, str2, (i13 & 16) != 0 ? null : textResource3, (i13 & 32) != 0 ? true : z4);
        }
    }
}
