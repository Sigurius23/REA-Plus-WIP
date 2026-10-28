package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.GraphDescriptionCardModel;
import com.whoop.design.models.cards.GraphDescriptionFooterModel;
import com.whoop.design.models.cards.HeroImageCardModel;
import com.whoop.design.models.cards.HeroWithFooterCtaModel;
import com.whoop.design.models.cards.ImageAndButtonCardModel;
import com.whoop.design.models.cards.LeftAlignedImageCardModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.DescriptionCardModel;
import com.whoop.design.models.items.FeatureItemModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.PricingSelectionCardModel;
import com.whoop.design.models.items.Spacing;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.models.items.UpsellCardSmallModel;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import f01.AbstractC13882n0;
import f01.C13844a1;
import f01.C13853d1;
import f01.C13873k0;
import f01.C13885o0;
import f01.C13888p0;
import f01.C13903u0;
import f01.C13910x0;
import f01.EnumC13909x;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17730c1;
import hy0.C17731c2;
import hy0.C17750h1;
import hy0.EnumC17727b2;
import hy0.EnumC17775o1;
import i01.C17845h;
import i01.EnumC17838a;
import i01.EnumC17846i;
import i91.AbstractC18247a;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l01.C23030b;
import l01.C23031c;
import l01.C23032d;
import l01.C23042n;
import l01.C23047s;
import l01.EnumC23029a;
import l01.EnumC23033e;
import l01.EnumC23048t;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import v41.InterfaceC35689r0;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.z */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u0002*\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a)\u0010)\u001a\u00020(*\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020(*\u0004\u0018\u00010#2\b\u0010+\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b,\u0010-\"\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/cards/ImageAndButtonCardModel;", "model", "Lm91/u;", "B", "(Lcom/whoop/design/models/cards/ImageAndButtonCardModel;)Lm91/u;", "Lcom/whoop/design/models/cards/LeftAlignedImageCardModel;", "C", "(Lcom/whoop/design/models/cards/LeftAlignedImageCardModel;)Lm91/u;", "Lcom/whoop/design/models/cards/HeroImageCardModel;", "Lf01/u0;", "x", "(Lcom/whoop/design/models/cards/HeroImageCardModel;)Lf01/u0;", "Lcom/whoop/design/models/cards/HeroWithFooterCtaModel;", "Lf01/x0;", "z", "(Lcom/whoop/design/models/cards/HeroWithFooterCtaModel;)Lf01/x0;", "Lcom/whoop/design/models/cards/GraphDescriptionCardModel;", "Lf01/o0;", "D", "(Lcom/whoop/design/models/cards/GraphDescriptionCardModel;)Lf01/o0;", "Lcom/whoop/design/models/items/UpsellCardSmallModel;", "Ll01/s;", "I", "(Lcom/whoop/design/models/items/UpsellCardSmallModel;)Ll01/s;", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "Ll01/n;", "G", "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)Ll01/n;", "Lcom/whoop/design/models/items/PricingSelectionCardModel;", "F", "(Lcom/whoop/design/models/items/PricingSelectionCardModel;)Lm91/u;", "Lcom/whoop/design/models/items/TagModel;", "Lhy0/h1;", "J", "(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;", "Li01/i;", "Lcom/whoop/design/models/items/TagBackgroundStyle;", "tagStyle", "", "fallbackBackgroundColor", "Ly81/f;", "K", "(Li01/i;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;)Ly81/f;", "fallbackTextColor", "L", "(Li01/i;Ljava/lang/String;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Llb1/y0;", "cardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23748z {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94079a = Function1.m68251a(new C23724v(5));

    /* JADX INFO: renamed from: lb1.z$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94080a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f94081b;

        static {
            int[] iArr = new int[TagBackgroundStyle.values().length];
            try {
                iArr[TagBackgroundStyle.AI_COACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagBackgroundStyle.CHROMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TagBackgroundStyle.FEATURE_TRANSPARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TagBackgroundStyle.BLUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f94080a = iArr;
            int[] iArr2 = new int[EnumC17846i.values().length];
            try {
                iArr2[EnumC17846i.SAVINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC17846i.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC17846i.CHROMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC17846i.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC17846i.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC17846i.CURRENT_WITH_CHECKMARK.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC17846i.BLUE_SIMPLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC17846i.BLUE_SIMPLE_SELECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f94081b = iArr2;
        }
    }

    /* JADX INFO: renamed from: lb1.z$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94082w;

        public b(Function1 function1) {
            this.f94082w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94082w.invoke((ImageAndButtonCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94083w;

        public c(Function1 function1) {
            this.f94083w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94083w.invoke((LeftAlignedImageCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94084w;

        public d(Function1 function1) {
            this.f94084w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94084w.invoke((HeroImageCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94085w;

        public e(Function1 function1) {
            this.f94085w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94085w.invoke((HeroWithFooterCtaModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94086w;

        public f(Function1 function1) {
            this.f94086w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94086w.invoke((GraphDescriptionCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94087w;

        public g(Function1 function1) {
            this.f94087w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94087w.invoke((UpsellCardSmallModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94088w;

        public h(Function1 function1) {
            this.f94088w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94088w.invoke((UpsellCardFeaturesModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94089w;

        public i(Function1 function1) {
            this.f94089w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94089w.invoke((PricingSelectionCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.z$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m69718A(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27256h.class), new j());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC25312u m69719B(ImageAndButtonCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null);
        TextResource title = model.getTitle();
        TextResource description = model.getDescription();
        TextResource buttonText = model.getButtonText();
        String buttonStyle = model.getButtonStyle();
        EnumC13909x enumC13909x = null;
        if (buttonStyle != null) {
            EnumC13909x enumC13909x2 = EnumC13909x.NORMAL;
            for (EnumC13909x enumC13909x3 : EnumC13909x.values()) {
                if (AbstractC22676k.m65745e(enumC13909x3.name(), buttonStyle)) {
                    enumC13909x = enumC13909x3;
                    break;
                }
            }
            if (enumC13909x == null) {
                enumC13909x = enumC13909x2;
            }
        }
        return new C13844a1(cVar, title, description, buttonText, enumC13909x, model.getDestination());
    }

    /* JADX INFO: renamed from: C */
    public static final InterfaceC25312u m69720C(LeftAlignedImageCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C13853d1(new AbstractC22403o.c(model.getImageUrl(), AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null), model.getTitle(), model.getDescription());
    }

    /* JADX INFO: renamed from: D */
    public static final C13885o0 m69721D(GraphDescriptionCardModel graphDescriptionCardModel) {
        C17731c2 c17731c2;
        C13888p0 c13888p0;
        AbstractC22676k.m65750j(graphDescriptionCardModel, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(6));
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h(graphDescriptionCardModel.getGraph());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        C21395c c21395c = (C21395c) interfaceC25312uM60541h;
        String cardName = graphDescriptionCardModel.getCardName();
        if (cardName == null) {
            cardName = "Unknown Card : " + graphDescriptionCardModel.getTitle();
        }
        TextResource title = graphDescriptionCardModel.getTitle();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(graphDescriptionCardModel.getEndIcon());
        TextResource title2 = graphDescriptionCardModel.getBody().getTitle();
        TextResource magnitude = graphDescriptionCardModel.getBody().getMagnitude();
        TextResource magnitudeSuffix = graphDescriptionCardModel.getBody().getMagnitudeSuffix();
        ImpactModel trend = graphDescriptionCardModel.getBody().getTrend();
        if (trend != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(trend.getTitleDisplay());
            boolean backgroundEnabled = trend.getBackgroundEnabled();
            EnumC17727b2 trend2 = trend.getTrend();
            EnumC16313m0 enumC16313m0M46377b2 = AbstractC16315n0.m46377b(trend.getIcon());
            String icon = trend.getIcon();
            c17731c2 = new C17731c2(textResourceM21278l, backgroundEnabled, trend2, false, enumC16313m0M46377b2, null, !(icon == null || icon.length() == 0), false, 0, 0, 0.0f, null, null, 0.0f, null, 32672, null);
        } else {
            c17731c2 = null;
        }
        C13873k0 c13873k0 = new C13873k0(title2, magnitude, magnitudeSuffix, c17731c2);
        DesignSystemModel rightItem = graphDescriptionCardModel.getRightItem();
        InterfaceC25312u interfaceC25312uM60541h2 = rightItem != null ? c21535aM60554d.m60541h(rightItem) : null;
        C21374h plane = c21395c.getPlane();
        C21395c c21395cM60092b = C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : AbstractC13882n0.m39416D(), (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        GraphDescriptionFooterModel footer = graphDescriptionCardModel.getFooter();
        if (footer != null) {
            TextResource textResourceM21272f = AbstractC8693b.m21272f(footer.getStartTitle());
            TextResource textResourceM21272f2 = AbstractC8693b.m21272f(footer.getEndTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(footer.getTrend().getTitleDisplay());
            boolean backgroundEnabled2 = footer.getTrend().getBackgroundEnabled();
            EnumC17727b2 trend3 = footer.getTrend().getTrend();
            String icon2 = footer.getTrend().getIcon();
            c13888p0 = new C13888p0(textResourceM21272f, textResourceM21272f2, new C17731c2(textResourceM21278l2, backgroundEnabled2, trend3, false, icon2 != null ? AbstractC16315n0.m46377b(icon2) : null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32736, null), graphDescriptionCardModel.getRightItem() instanceof WhoopAgeAmoeba);
        } else {
            c13888p0 = null;
        }
        InterfaceC25312u interfaceC25312u = interfaceC25312uM60541h2;
        C9598e destination = graphDescriptionCardModel.getDestination();
        TagModel navigationTag = graphDescriptionCardModel.getNavigationTag();
        InterfaceC25312u interfaceC25312uM60541h3 = navigationTag != null ? c21535aM60554d.m60541h(navigationTag) : null;
        List<DesignSystemModel> subItems = graphDescriptionCardModel.getSubItems();
        return new C13885o0(cardName, title, enumC16313m0M46377b, interfaceC25312u, c21395cM60092b, c13873k0, c13888p0, destination, interfaceC25312uM60541h3, subItems != null ? c21535aM60554d.m60540g(subItems) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m69722E(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC25312u m69723F(PricingSelectionCardModel pricingSelectionCardModel) {
        EnumC17846i enumC17846i;
        C17750h1 c17750h1;
        C18250d c18250d;
        C18250d c18250d2;
        String rightIcon;
        C39274g c39274g;
        Integer numM46376a;
        AbstractC22676k.m65750j(pricingSelectionCardModel, "<this>");
        ArrayList arrayList = null;
        switch (pricingSelectionCardModel.getStyle()) {
            case "CHROMATIC":
                enumC17846i = EnumC17846i.CHROMATIC;
                break;
            case "DEFAULT":
                enumC17846i = EnumC17846i.DEFAULT;
                break;
            case "SAVINGS":
                enumC17846i = EnumC17846i.SAVINGS;
                break;
            case "BLUE_SIMPLE_SELECTED":
                enumC17846i = EnumC17846i.BLUE_SIMPLE_SELECTED;
                break;
            case "CURRENT_WITH_CHECKMARK":
                enumC17846i = EnumC17846i.CURRENT_WITH_CHECKMARK;
                break;
            case "BLUE":
                enumC17846i = EnumC17846i.BLUE;
                break;
            case "BLUE_SIMPLE":
                enumC17846i = EnumC17846i.BLUE_SIMPLE;
                break;
            case "CURRENT":
                enumC17846i = EnumC17846i.CURRENT;
                break;
            default:
                enumC17846i = null;
                break;
        }
        String id4 = pricingSelectionCardModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(pricingSelectionCardModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(pricingSelectionCardModel.getSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(pricingSelectionCardModel.getPriceLabel());
        String priceLabelSize = pricingSelectionCardModel.getPriceLabelSize();
        EnumC17838a enumC17838a = (!AbstractC22676k.m65745e(priceLabelSize, "LARGE") && AbstractC22676k.m65745e(priceLabelSize, "MEDIUM")) ? EnumC17838a.MEDIUM : EnumC17838a.LARGE;
        EnumC17838a enumC17838a2 = enumC17838a;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(pricingSelectionCardModel.getPriceSubLabel());
        String priceSubLabelMarkdown = pricingSelectionCardModel.getPriceSubLabelMarkdown();
        if (pricingSelectionCardModel.getTag() != null) {
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(pricingSelectionCardModel.getTag().getTitle());
            Integer numM46376a2 = AbstractC16315n0.m46376a(pricingSelectionCardModel.getTag().getLeftIcon());
            C39274g c39274g2 = numM46376a2 != null ? new C39274g(numM46376a2.intValue(), null, 2, null) : null;
            TagBackgroundStyle tagStyle = pricingSelectionCardModel.getTag().getTagStyle();
            int i13 = tagStyle == null ? -1 : a.f94080a[tagStyle.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    c18250d2 = null;
                } else {
                    c18250d = new C18250d(p712j91.Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null);
                }
                EnumC39333f enumC39333fM69728K = m69728K(enumC17846i, pricingSelectionCardModel.getTag().getTagStyle(), pricingSelectionCardModel.getTag().getBackgroundColor());
                EnumC39333f enumC39333fM69729L = m69729L(enumC17846i, pricingSelectionCardModel.getTag().getTextColor());
                rightIcon = pricingSelectionCardModel.getTag().getRightIcon();
                if (rightIcon != null || (numM46376a = AbstractC16315n0.m46376a(rightIcon)) == null) {
                    c39274g = null;
                } else {
                    c39274g = new C39274g(numM46376a.intValue(), null, 2, null);
                }
                c17750h1 = new C17750h1(textResourceM21278l5, c39274g2, enumC39333fM69728K, c18250d2, enumC39333fM69729L, null, null, null, false, null, 0.0f, 0.0f, 0.0f, c39274g, 0.0f, null, pricingSelectionCardModel.getTag().getDestination(), null, null, null, null, null, 4120544, null);
            } else {
                c18250d = new C18250d(p712j91.Function1.m60318a(AbstractC15673b0.m43978D()), 0.0f, 2, null);
            }
            c18250d2 = c18250d;
            EnumC39333f enumC39333fM69728K2 = m69728K(enumC17846i, pricingSelectionCardModel.getTag().getTagStyle(), pricingSelectionCardModel.getTag().getBackgroundColor());
            EnumC39333f enumC39333fM69729L2 = m69729L(enumC17846i, pricingSelectionCardModel.getTag().getTextColor());
            rightIcon = pricingSelectionCardModel.getTag().getRightIcon();
            if (rightIcon != null) {
                c39274g = null;
            } else {
                c39274g = null;
            }
            c17750h1 = new C17750h1(textResourceM21278l5, c39274g2, enumC39333fM69728K2, c18250d2, enumC39333fM69729L2, null, null, null, false, null, 0.0f, 0.0f, 0.0f, c39274g, 0.0f, null, pricingSelectionCardModel.getTag().getDestination(), null, null, null, null, null, 4120544, null);
        } else {
            c17750h1 = null;
        }
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(pricingSelectionCardModel.getDescription());
        if (enumC17846i == null) {
            enumC17846i = EnumC17846i.DEFAULT;
        }
        EnumC17846i enumC17846i2 = enumC17846i;
        Action action = pricingSelectionCardModel.getAction();
        List<TagModel> features = pricingSelectionCardModel.getFeatures();
        if (features != null) {
            List<TagModel> list = features;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m69727J((TagModel) it.next()));
            }
        }
        return new C17845h(id4, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, enumC17838a2, textResourceM21278l4, priceSubLabelMarkdown, c17750h1, textResourceM21278l6, enumC17846i2, action, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX INFO: renamed from: G */
    public static final C23042n m69724G(UpsellCardFeaturesModel upsellCardFeaturesModel) {
        String str;
        EnumC2888c enumC2888c;
        AbstractC22403o.c cVar;
        EnumC23048t enumC23048t;
        C27256h c27256hM68661k;
        C23032d c23032d;
        C17750h1 c17750h1;
        List listM60536k;
        EnumC23033e enumC23033e;
        String str2;
        EnumC2888c enumC2888c2;
        AbstractC22676k.m65750j(upsellCardFeaturesModel, "<this>");
        String id4 = upsellCardFeaturesModel.getId();
        String title = upsellCardFeaturesModel.getTitle();
        if (title != null) {
            if (title.length() == 0) {
                title = null;
            }
            str = title;
        } else {
            str = null;
        }
        String titleTypography = upsellCardFeaturesModel.getTitleTypography();
        if (titleTypography != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length = enumC2888cArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC2888c = null;
                    break;
                }
                enumC2888c = enumC2888cArrValues[i13];
                if (AbstractC22676k.m65745e(enumC2888c.name(), titleTypography)) {
                    break;
                }
                i13++;
            }
            if (enumC2888c == null) {
                enumC2888c = EnumC2888c.B2;
            }
        } else {
            enumC2888c = EnumC2888c.B2;
        }
        EnumC2888c enumC2888c3 = enumC2888c;
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(upsellCardFeaturesModel.getEndIcon());
        String titleImage = upsellCardFeaturesModel.getTitleImage();
        C38072d c38072d = C38072d.f163053a;
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(titleImage, c38072d.m121951d().getLogo().getWhoopText(), 0, 0, 12, null);
        String header = upsellCardFeaturesModel.getHeader();
        String tierImage = upsellCardFeaturesModel.getTierImage();
        if (tierImage == null) {
            cVar = null;
        } else {
            String str3 = tierImage.length() > 0 ? tierImage : null;
            if (str3 != null) {
                cVar = new AbstractC22403o.c(str3, c38072d.m121951d().getLogo().getWhoop(), 0, 0, 12, null);
            } else {
                cVar = null;
            }
        }
        String category = upsellCardFeaturesModel.getCategory();
        String trackingValue = upsellCardFeaturesModel.getTrackingValue();
        String style = upsellCardFeaturesModel.getStyle();
        EnumC23048t[] enumC23048tArrValues = EnumC23048t.values();
        int length2 = enumC23048tArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC23048t = null;
                break;
            }
            EnumC23048t enumC23048t2 = enumC23048tArrValues[i14];
            if (AbstractC22676k.m65745e(enumC23048t2.name(), style)) {
                enumC23048t = enumC23048t2;
                break;
            }
            i14++;
        }
        CardButtonModel cardButton = upsellCardFeaturesModel.getCardButton();
        if (cardButton != null) {
            c27256hM68661k = AbstractC23613d4.m68661k(cardButton, upsellCardFeaturesModel.getSecondCardButton() == null ? upsellCardFeaturesModel.getStyle() : null);
        } else {
            c27256hM68661k = null;
        }
        CardButtonModel secondCardButton = upsellCardFeaturesModel.getSecondCardButton();
        C27256h c27256hM68661k2 = secondCardButton != null ? AbstractC23613d4.m68661k(secondCardButton, upsellCardFeaturesModel.getStyle()) : null;
        String str4 = "PDP";
        boolean z4 = !AbstractC25260n.m74059b1(new String[]{"ADVANCED_LABS", "PDP", "DEVICE"}).contains(upsellCardFeaturesModel.getStyle());
        AbstractC18247a abstractC18247aM68655e = AbstractC23613d4.m68655e(upsellCardFeaturesModel.getStyle());
        FeatureListModel featureList = upsellCardFeaturesModel.getFeatureList();
        if (featureList != null) {
            String title2 = featureList.getTitle();
            TextResource.C8691e c8691eM21279m = title2 != null ? AbstractC8693b.m21279m(title2) : null;
            Boolean showDivider = featureList.getShowDivider();
            boolean zBooleanValue = showDivider != null ? showDivider.booleanValue() : false;
            String style2 = featureList.getStyle();
            if (style2 == null) {
                style2 = "";
            }
            String str5 = style2;
            EnumC23033e enumC23033e2 = EnumC23033e.CHECKLIST;
            EnumC23033e[] enumC23033eArrValues = EnumC23033e.values();
            int length3 = enumC23033eArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC23033e = null;
                    break;
                }
                enumC23033e = enumC23033eArrValues[i15];
                int i16 = i15;
                if (AbstractC22676k.m65745e(enumC23033e.name(), str5)) {
                    break;
                }
                i15 = i16 + 1;
            }
            EnumC23033e enumC23033e3 = enumC23033e == null ? enumC23033e2 : enumC23033e;
            List<FeatureItemModel> items = featureList.getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator it = items.iterator();
            while (it.hasNext()) {
                FeatureItemModel featureItemModel = (FeatureItemModel) it.next();
                String title3 = featureItemModel.getTitle();
                EnumC16313m0 enumC16313m0M46377b2 = AbstractC16315n0.m46377b(featureItemModel.getIcon());
                Iterator it3 = it;
                String style3 = upsellCardFeaturesModel.getStyle();
                EnumC23029a enumC23029a = (AbstractC22676k.m65745e(style3, "ADVANCED_LABS") || AbstractC22676k.m65745e(style3, str4)) ? EnumC23029a.ROUNDED_SQUARE : null;
                String style4 = upsellCardFeaturesModel.getStyle();
                EnumC39333f enumC39333f = (AbstractC22676k.m65745e(style4, "ADVANCED_LABS") || AbstractC22676k.m65745e(style4, str4)) ? EnumC39333f.ACCENT_POSITIVE_TREND_15 : null;
                String style5 = upsellCardFeaturesModel.getStyle();
                EnumC39333f enumC39333f2 = (AbstractC22676k.m65745e(style5, "ADVANCED_LABS") || AbstractC22676k.m65745e(style5, str4)) ? EnumC39333f.ACCENT_POSITIVE_TREND : null;
                String textStyle = featureItemModel.getTextStyle();
                if (textStyle != null) {
                    EnumC2888c[] enumC2888cArrValues2 = EnumC2888c.values();
                    str2 = str4;
                    int length4 = enumC2888cArrValues2.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length4) {
                            enumC2888c2 = null;
                            break;
                        }
                        enumC2888c2 = enumC2888cArrValues2[i17];
                        int i18 = length4;
                        if (AbstractC22676k.m65745e(enumC2888c2.name(), textStyle)) {
                            break;
                        }
                        i17++;
                        length4 = i18;
                    }
                    if (enumC2888c2 == null) {
                    }
                    arrayList.add(new C23031c(title3, null, enumC16313m0M46377b2, enumC39333f, enumC39333f2, enumC23029a, 0.0f, enumC2888c2, 66, null));
                    it = it3;
                    str4 = str2;
                } else {
                    str2 = str4;
                }
                enumC2888c2 = EnumC2888c.B2;
                arrayList.add(new C23031c(title3, null, enumC16313m0M46377b2, enumC39333f, enumC39333f2, enumC23029a, 0.0f, enumC2888c2, 66, null));
                it = it3;
                str4 = str2;
            }
            c23032d = new C23032d(c8691eM21279m, zBooleanValue, enumC23033e3, arrayList);
        } else {
            c23032d = null;
        }
        DescriptionCardModel descriptionCard = upsellCardFeaturesModel.getDescriptionCard();
        C23030b c23030b = descriptionCard != null ? new C23030b(AbstractC8693b.m21278l(descriptionCard.getTitle()), AbstractC8693b.m21278l(descriptionCard.getSubtitle())) : null;
        List<DesignSystemModel> items2 = upsellCardFeaturesModel.getItems();
        if (items2 != null) {
            c17750h1 = null;
            listM60536k = C21535a.m60536k(AbstractC21537c.m60554d(new C23670m(5)), items2, null, 2, null);
        } else {
            c17750h1 = null;
            listM60536k = null;
        }
        float sectionTopPadding = upsellCardFeaturesModel.getSectionTopPadding();
        float sectionBottomPadding = upsellCardFeaturesModel.getSectionBottomPadding();
        float interItemPadding = upsellCardFeaturesModel.getInterItemPadding();
        TagModel badge = upsellCardFeaturesModel.getBadge();
        return new C23042n(id4, enumC16313m0M46377b, cVar2, str, enumC2888c3, cVar, header, category, trackingValue, enumC23048t, c27256hM68661k, c27256hM68661k2, c23032d, c23030b, listM60536k, sectionTopPadding, sectionBottomPadding, interItemPadding, abstractC18247aM68655e, z4, badge != null ? AbstractC23699q4.m69314d(badge) : c17750h1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m69725H(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    public static final C23047s m69726I(UpsellCardSmallModel upsellCardSmallModel) {
        AbstractC22676k.m65750j(upsellCardSmallModel, "<this>");
        String title = upsellCardSmallModel.getTitle();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(upsellCardSmallModel.getEndIcon());
        String titleImage = upsellCardSmallModel.getTitleImage();
        C38072d c38072d = C38072d.f163053a;
        AbstractC22403o.c cVar = new AbstractC22403o.c(titleImage, c38072d.m121951d().getLogo().getWhoopText(), 0, 0, 12, null);
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(upsellCardSmallModel.getSideImage(), c38072d.m121951d().getLogo().getWhoop(), 0, 0, 12, null);
        String style = upsellCardSmallModel.getStyle();
        for (EnumC23048t enumC23048t : EnumC23048t.values()) {
            if (AbstractC22676k.m65745e(enumC23048t.name(), style)) {
                return new C23047s(title, enumC16313m0M46377b, cVar, cVar2, enumC23048t, upsellCardSmallModel.getDestination());
            }
        }
        enumC23048t = null;
        return new C23047s(title, enumC16313m0M46377b, cVar, cVar2, enumC23048t, upsellCardSmallModel.getDestination());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX INFO: renamed from: J */
    private static final C17750h1 m69727J(TagModel tagModel) {
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        Integer numM46376a;
        EnumC39333f enumC39333f3;
        TagBackgroundStyle tagStyle = tagModel.getTagStyle();
        EnumC39333f enumC39333f4 = (tagStyle == null ? -1 : a.f94080a[tagStyle.ordinal()]) == 3 ? EnumC39333f.TRANSPARENT : EnumC39333f.WHITE_10;
        TagBackgroundStyle tagStyle2 = tagModel.getTagStyle();
        EnumC39333f enumC39333f5 = (tagStyle2 == null ? -1 : a.f94080a[tagStyle2.ordinal()]) == 3 ? EnumC39333f.WHITE_70 : EnumC39333f.BRAND_WHITE;
        TagBackgroundStyle tagStyle3 = tagModel.getTagStyle();
        EnumC17775o1 enumC17775o1 = (tagStyle3 == null ? -1 : a.f94080a[tagStyle3.ordinal()]) == 3 ? EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL : EnumC17775o1.NONE;
        TagBackgroundStyle tagStyle4 = tagModel.getTagStyle();
        C17730c1 c17730c1 = (tagStyle4 != null ? a.f94080a[tagStyle4.ordinal()] : -1) == 3 ? new C17730c1(null, 0.0f, 3, null) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(tagModel.getTitle());
        Integer numM46376a2 = AbstractC16315n0.m46376a(tagModel.getLeftIcon());
        C39274g c39274g = numM46376a2 != null ? new C39274g(numM46376a2.intValue(), null, 2, null) : null;
        String backgroundColor = tagModel.getBackgroundColor();
        int i13 = 0;
        if (backgroundColor != null) {
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length = enumC39333fArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC39333f3 = null;
                    break;
                }
                enumC39333f3 = enumC39333fArrValues[i14];
                if (AbstractC22676k.m65745e(enumC39333f3.name(), backgroundColor)) {
                    break;
                }
                i14++;
            }
            if (enumC39333f3 == null) {
                enumC39333f = enumC39333f4;
            } else {
                enumC39333f = enumC39333f3;
            }
        } else {
            enumC39333f = enumC39333f4;
        }
        String textColor = tagModel.getTextColor();
        if (textColor != null) {
            EnumC39333f[] enumC39333fArrValues2 = EnumC39333f.values();
            int length2 = enumC39333fArrValues2.length;
            while (true) {
                if (i13 >= length2) {
                    enumC39333f2 = null;
                    break;
                }
                enumC39333f2 = enumC39333fArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC39333f2.name(), textColor)) {
                    break;
                }
                i13++;
            }
            if (enumC39333f2 == null) {
                enumC39333f2 = enumC39333f5;
            }
        } else {
            enumC39333f2 = enumC39333f5;
        }
        String rightIcon = tagModel.getRightIcon();
        return new C17750h1(textResourceM21278l, c39274g, enumC39333f, null, enumC39333f2, null, null, enumC17775o1, false, null, 0.0f, 0.0f, 0.0f, (rightIcon == null || (numM46376a = AbstractC16315n0.m46376a(rightIcon)) == null) ? null : new C39274g(numM46376a.intValue(), null, 2, null), 0.0f, null, tagModel.getDestination(), tagModel.getAction(), c17730c1, null, null, null, 3727208, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[RETURN] */
    /* JADX INFO: renamed from: K */
    private static final EnumC39333f m69728K(EnumC17846i enumC17846i, TagBackgroundStyle tagBackgroundStyle, String str) {
        EnumC39333f enumC39333f = null;
        int i13 = 0;
        switch (enumC17846i == null ? -1 : a.f94081b[enumC17846i.ordinal()]) {
            case -1:
                if (str != null) {
                    EnumC39333f enumC39333f2 = EnumC39333f.WHITE_10;
                    EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                    int length = enumC39333fArrValues.length;
                    while (i13 < length) {
                        EnumC39333f enumC39333f3 = enumC39333fArrValues[i13];
                        if (AbstractC22676k.m65745e(enumC39333f3.name(), str)) {
                            enumC39333f = enumC39333f3;
                            if (enumC39333f != null) {
                                enumC39333f2 = enumC39333f;
                            }
                            if (enumC39333f2 != null) {
                                return enumC39333f2;
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (enumC39333f != null) {
                        enumC39333f2 = enumC39333f;
                    }
                    if (enumC39333f2 != null) {
                        return enumC39333f2;
                    }
                }
                return EnumC39333f.WHITE_10;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnumC39333f.ACCENT_POSITIVE_TREND;
            case 2:
                return EnumC39333f.RECOVERY;
            case 3:
                return EnumC39333f.BRAND_WHOOP_PRO;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if ((tagBackgroundStyle != null ? a.f94080a[tagBackgroundStyle.ordinal()] : -1) == 4) {
                    return EnumC39333f.RECOVERY;
                }
                if (str != null) {
                    EnumC39333f enumC39333f4 = EnumC39333f.BRAND_WHITE;
                    EnumC39333f[] enumC39333fArrValues2 = EnumC39333f.values();
                    int length2 = enumC39333fArrValues2.length;
                    while (i13 < length2) {
                        EnumC39333f enumC39333f5 = enumC39333fArrValues2[i13];
                        if (AbstractC22676k.m65745e(enumC39333f5.name(), str)) {
                            enumC39333f = enumC39333f5;
                            if (enumC39333f != null) {
                                enumC39333f4 = enumC39333f;
                            }
                            if (enumC39333f4 != null) {
                                return enumC39333f4;
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (enumC39333f != null) {
                        enumC39333f4 = enumC39333f;
                    }
                    if (enumC39333f4 != null) {
                        return enumC39333f4;
                    }
                }
                return EnumC39333f.BRAND_WHITE;
        }
    }

    /* JADX INFO: renamed from: L */
    private static final EnumC39333f m69729L(EnumC17846i enumC17846i, String str) {
        EnumC39333f enumC39333f;
        switch (enumC17846i == null ? -1 : a.f94081b[enumC17846i.ordinal()]) {
            case -1:
                if (str != null) {
                    EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
                    EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                    int length = enumC39333fArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            enumC39333f = enumC39333fArrValues[i13];
                            if (!AbstractC22676k.m65745e(enumC39333f.name(), str)) {
                                i13++;
                            }
                        } else {
                            enumC39333f = null;
                        }
                    }
                    if (enumC39333f != null) {
                        enumC39333f2 = enumC39333f;
                    }
                    if (enumC39333f2 != null) {
                        return enumC39333f2;
                    }
                }
                return EnumC39333f.BRAND_WHITE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return EnumC39333f.BRAND_BLACK;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m69743n(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23724v c23724v = new C23724v(6);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImageAndButtonCardModel.class), new b(c23724v));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LeftAlignedImageCardModel.class), new c(new C23724v(7)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeroImageCardModel.class), new d(new C23724v(8)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HeroWithFooterCtaModel.class), new e(new C23724v(9)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GraphDescriptionCardModel.class), new f(new C23724v(10)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UpsellCardSmallModel.class), new g(new C23724v(11)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(UpsellCardFeaturesModel.class), new h(new C23724v(12)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(PricingSelectionCardModel.class), new i(new C23724v(13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC25312u m69744o(ImageAndButtonCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69719B(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC25312u m69745p(LeftAlignedImageCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69720C(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C13903u0 m69746q(HeroImageCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69753x(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C13910x0 m69747r(HeroWithFooterCtaModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69755z(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C13885o0 m69748s(GraphDescriptionCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69721D(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23047s m69749t(UpsellCardSmallModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69726I(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23042n m69750u(UpsellCardFeaturesModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69724G(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC25312u m69751v(PricingSelectionCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69723F(model);
    }

    /* JADX INFO: renamed from: w */
    public static final C23743y0 m69752w() {
        return f94079a;
    }

    /* JADX INFO: renamed from: x */
    public static final C13903u0 m69753x(HeroImageCardModel heroImageCardModel) {
        AbstractC22676k.m65750j(heroImageCardModel, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(7));
        String id4 = heroImageCardModel.getId();
        AbstractC22403o.c cVar = new AbstractC22403o.c(heroImageCardModel.getImageUrl(), AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null);
        String title = heroImageCardModel.getTitle();
        String subtitle = heroImageCardModel.getSubtitle();
        List<DesignSystemModel> items = heroImageCardModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(c21535aM60554d.m60541h((DesignSystemModel) it.next()));
        }
        boolean transparentBackground = heroImageCardModel.getTransparentBackground();
        Spacing contentSpacing = heroImageCardModel.getContentSpacing();
        return new C13903u0(id4, cVar, title, subtitle, arrayList, transparentBackground, contentSpacing != null ? new C39174f(AbstractC23630g0.m68777i(contentSpacing)) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m69754y(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final C13910x0 m69755z(HeroWithFooterCtaModel heroWithFooterCtaModel) {
        AbstractC22676k.m65750j(heroWithFooterCtaModel, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(8));
        String id4 = heroWithFooterCtaModel.getId();
        String imageUrl = heroWithFooterCtaModel.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null) : null;
        String lottieUrl = heroWithFooterCtaModel.getLottieUrl();
        String strM113135b = lottieUrl != null ? InterfaceC35689r0.e.m113135b(lottieUrl) : null;
        return new C13910x0(id4, cVar, strM113135b != null ? InterfaceC35689r0.e.m113134a(strM113135b) : null, heroWithFooterCtaModel.getTitle(), heroWithFooterCtaModel.getSubtitle(), c21535aM60554d.m60540g(heroWithFooterCtaModel.getFooterItems()));
    }
}
