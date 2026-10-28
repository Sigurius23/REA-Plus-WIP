package p716lb1;

import a41.C0365a;
import a41.C0377m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BackgroundStyle;
import com.whoop.design.models.items.ImpactCardModel;
import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.models.items.InsufficientAnswerCount;
import com.whoop.design.models.items.TagStyle;
import com.whoop.design.models.items.TestimonialModel;
import com.whoop.design.models.items.TestimonialsModel;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import i21.C18000j;
import i21.C18011u;
import i21.EnumC18012v;
import i21.InterfaceC18002l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import or2.AbstractC28188o1;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.C39065r;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.s2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a%\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b*\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010 \u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%\"\u001a\u0010+\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactCardModel;", "model", "Li21/l;", "e", "(Lcom/whoop/design/models/items/ImpactCardModel;)Li21/l;", "", "Lcom/whoop/design/models/items/TileTagModel;", "tileTags", "Lhy0/h1;", "m", "(Ljava/util/List;)Lhy0/h1;", "q", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "Ly81/f;", "g", "(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;", "f", "Lcom/whoop/design/util/TextResource;", "title", "", "style", "Li21/u;", "n", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Li21/u;", "s", "(Lcom/whoop/design/models/items/TileTagModel;)Lhy0/h1;", "styleString", "p", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lhy0/h1;", "tileTag", "o", "(Ljava/util/List;Lcom/whoop/design/models/items/TileTagModel;)Ly81/f;", "Lcom/whoop/design/models/items/TestimonialsModel;", "La41/m;", "r", "(Lcom/whoop/design/models/items/TestimonialsModel;)La41/m;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "listItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23709s2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93959a = Function1.m68251a(new C23714t1(27));

    /* JADX INFO: renamed from: lb1.s2$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93960a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93961b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f93962c;

        static {
            int[] iArr = new int[BackgroundStyle.values().length];
            try {
                iArr[BackgroundStyle.BACKGROUND_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackgroundStyle.BORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackgroundStyle.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93960a = iArr;
            int[] iArr2 = new int[ImpactStyle.values().length];
            try {
                iArr2[ImpactStyle.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ImpactStyle.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImpactStyle.ELIGIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f93961b = iArr2;
            int[] iArr3 = new int[TagStyle.values().length];
            try {
                iArr3[TagStyle.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TagStyle.CONFUSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TagStyle.AUTOMATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TagStyle.POSITIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TagStyle.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TagStyle.NEUTRAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TagStyle.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f93962c = iArr3;
        }
    }

    /* JADX INFO: renamed from: lb1.s2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93963w;

        public b(Function1 function1) {
            this.f93963w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93963w.invoke((ImpactCardModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.s2$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93964w;

        public c(Function1 function1) {
            this.f93964w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93964w.invoke((TestimonialsModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final InterfaceC18002l m69387e(ImpactCardModel impactCardModel) {
        TextResource textResourceM21278l;
        ImpactStyle answerCountStyle;
        TextResource textResourceM21278l2;
        ImpactStyle answerCountStyle2;
        int i13 = a.f93960a[impactCardModel.getCardBackgroundStyle().ordinal()];
        if (i13 == 1) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(impactCardModel.getImpactPercentageDisplay());
            TextResource textResourceM21278l4 = AbstractC28188o1.m85314d(impactCardModel.getImpactCardSubtitleDisplay()) ? AbstractC8693b.m21278l(impactCardModel.getImpactCardSubtitleDisplay()) : null;
            EnumC39333f enumC39333fM69389g = m69389g(impactCardModel.getImpactStyle());
            TileTagModel tileTag = impactCardModel.getTileTag();
            TextResource tagTitleDisplay = tileTag != null ? tileTag.getTagTitleDisplay() : null;
            TileTagModel tileTag2 = impactCardModel.getTileTag();
            return new InterfaceC18002l.a(textResourceM21278l3, false, enumC39333fM69389g, textResourceM21278l4, null, m69396n(tagTitleDisplay, tileTag2 != null ? tileTag2.getTagStyle() : null), m69395m(impactCardModel.getTileTags()), m69399q(impactCardModel.getTileTags()), m69397o(impactCardModel.getTileTags(), impactCardModel.getTileTag()), impactCardModel.getImpactUuid(), 16, null);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return InterfaceC18002l.b.f69876a;
            }
            throw new NoWhenBranchMatchedException();
        }
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(impactCardModel.getImpactCardSubtitleDisplay());
        InsufficientAnswerCount noAnswerCount = impactCardModel.getNoAnswerCount();
        if (noAnswerCount == null || (textResourceM21278l = noAnswerCount.getAnswerCountTextDisplay()) == null) {
            textResourceM21278l = AbstractC8693b.m21278l(WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID);
        }
        TextResource textResource = textResourceM21278l;
        InsufficientAnswerCount noAnswerCount2 = impactCardModel.getNoAnswerCount();
        if (noAnswerCount2 == null || (answerCountStyle = noAnswerCount2.getAnswerCountStyle()) == null) {
            answerCountStyle = ImpactStyle.INSUFFICIENT;
        }
        EnumC39333f enumC39333fM69388f = m69388f(answerCountStyle);
        InsufficientAnswerCount yesAnswerCount = impactCardModel.getYesAnswerCount();
        if (yesAnswerCount == null || (textResourceM21278l2 = yesAnswerCount.getAnswerCountTextDisplay()) == null) {
            textResourceM21278l2 = AbstractC8693b.m21278l(WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID);
        }
        TextResource textResource2 = textResourceM21278l2;
        InsufficientAnswerCount yesAnswerCount2 = impactCardModel.getYesAnswerCount();
        if (yesAnswerCount2 == null || (answerCountStyle2 = yesAnswerCount2.getAnswerCountStyle()) == null) {
            answerCountStyle2 = ImpactStyle.INSUFFICIENT;
        }
        return new InterfaceC18002l.d(textResourceM21278l5, textResource, textResource2, enumC39333fM69388f, m69388f(answerCountStyle2), m69399q(impactCardModel.getTileTags()), impactCardModel.getImpactUuid());
    }

    /* JADX INFO: renamed from: f */
    private static final EnumC39333f m69388f(ImpactStyle impactStyle) {
        return a.f93961b[impactStyle.ordinal()] == 3 ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_50;
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC39333f m69389g(ImpactStyle impactStyle) {
        int i13 = a.f93961b[impactStyle.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? EnumC39333f.WHITE_50 : EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        return EnumC39333f.ACCENT_POSITIVE_TREND;
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m69390h() {
        return f93959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69391i(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23714t1 c23714t1 = new C23714t1(28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ImpactCardModel.class), new b(c23714t1));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TestimonialsModel.class), new c(new C23714t1(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C18000j m69392j(ImpactCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(29));
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getImpactCardTitleDisplay());
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h(model.getImpactBarSegment());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.graphing.HorizontalImpactBarViewState");
        return new C18000j(textResourceM21278l, enumC39333f, (C39065r) interfaceC25312uM60541h, m69387e(model));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m69393k(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C0377m m69394l(TestimonialsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69400r(model);
    }

    /* JADX INFO: renamed from: m */
    private static final C17750h1 m69395m(List<TileTagModel> list) {
        Object next;
        TagStyle tagStyle;
        TagStyle tagStyle2;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String tagStyle3 = ((TileTagModel) next).getTagStyle();
                tagStyle = TagStyle.NEUTRAL;
                TagStyle[] tagStyleArrValues = TagStyle.values();
                int length = tagStyleArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        tagStyle2 = null;
                        break;
                    }
                    tagStyle2 = tagStyleArrValues[i13];
                    if (AbstractC22676k.m65745e(tagStyle2.name(), tagStyle3)) {
                        break;
                    }
                    i13++;
                }
                if (tagStyle2 != null) {
                    tagStyle = tagStyle2;
                }
            } while (tagStyle != TagStyle.AUTOMATED);
            TileTagModel tileTagModel = (TileTagModel) next;
            if (tileTagModel != null) {
                return m69398p(tileTagModel.getTagTitleDisplay(), tileTagModel.getTagStyle());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private static final C18011u m69396n(TextResource textResource, String str) {
        EnumC18012v enumC18012v;
        EnumC39333f enumC39333f;
        TagStyle tagStyle = null;
        if (str == null) {
            return null;
        }
        TagStyle tagStyle2 = TagStyle.NEUTRAL;
        for (TagStyle tagStyle3 : TagStyle.values()) {
            if (AbstractC22676k.m65745e(tagStyle3.name(), str)) {
                tagStyle = tagStyle3;
                break;
            }
        }
        if (tagStyle != null) {
            tagStyle2 = tagStyle;
        }
        int[] iArr = a.f93962c;
        switch (iArr[tagStyle2.ordinal()]) {
            case 1:
                enumC18012v = EnumC18012v.NEW;
                break;
            case 2:
                enumC18012v = EnumC18012v.TREND_INDICATOR;
                break;
            case 3:
                enumC18012v = EnumC18012v.AUTO_DETECTED;
                break;
            case 4:
                enumC18012v = EnumC18012v.POSITIVE;
                break;
            case 5:
                enumC18012v = EnumC18012v.NEGATIVE;
                break;
            case 6:
            case 7:
                enumC18012v = EnumC18012v.NEUTRAL;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i13 = iArr[tagStyle2.ordinal()];
        EnumC39333f enumC39333f2 = i13 != 4 ? i13 != 5 ? EnumC39333f.NEUTRAL_15 : EnumC39333f.ACCENT_NEGATIVE_TREND_15 : EnumC39333f.ACCENT_POSITIVE_TREND_15;
        int i14 = iArr[tagStyle2.ordinal()];
        if (i14 == 4) {
            enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        } else if (i14 != 5) {
            enumC39333f = i14 != 6 ? EnumC39333f.RECOVERY : EnumC39333f.BRAND_WHITE;
        } else {
            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        return new C18011u(enumC18012v, textResource, enumC39333f2, enumC39333f);
    }

    /* JADX INFO: renamed from: o */
    private static final EnumC39333f m69397o(List<TileTagModel> list, TileTagModel tileTagModel) {
        TagStyle tagStyle;
        if (list == null) {
            list = AbstractC37056f.m118960L(tileTagModel);
        }
        List<TileTagModel> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                String tagStyle2 = ((TileTagModel) it.next()).getTagStyle();
                TagStyle tagStyle3 = TagStyle.NEUTRAL;
                TagStyle[] tagStyleArrValues = TagStyle.values();
                int length = tagStyleArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        tagStyle = null;
                        break;
                    }
                    tagStyle = tagStyleArrValues[i13];
                    if (AbstractC22676k.m65745e(tagStyle.name(), tagStyle2)) {
                        break;
                    }
                    i13++;
                }
                if (tagStyle != null) {
                    tagStyle3 = tagStyle;
                }
                if (tagStyle3 == TagStyle.NEW) {
                    return EnumC39333f.RECOVERY;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private static final C17750h1 m69398p(TextResource textResource, String str) {
        TagStyle tagStyle = null;
        if (str == null) {
            return null;
        }
        TagStyle tagStyle2 = TagStyle.NEUTRAL;
        for (TagStyle tagStyle3 : TagStyle.values()) {
            if (AbstractC22676k.m65745e(tagStyle3.name(), str)) {
                tagStyle = tagStyle3;
                break;
            }
        }
        if (tagStyle != null) {
            tagStyle2 = tagStyle;
        }
        switch (a.f93962c[tagStyle2.ordinal()]) {
            case 1:
                return new C17750h1(textResource == null ? AbstractC8693b.m21267a() : textResource, null, EnumC39333f.NEUTRAL_15, null, EnumC39333f.RECOVERY, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null);
            case 2:
                float f13 = ((float) 0.5d) * 8;
                return new C17750h1(AbstractC8693b.m21267a(), new C39274g(EnumC16313m0.TINY_ATTENTION_WHITE.toWhoopIcon(), AbstractC8693b.m21278l("Trend Indicator")), EnumC39333f.NEUTRAL_15, null, EnumC39333f.RECOVERY, null, null, EnumC17775o1.JOURNAL_TRENDS, false, null, f13, f13, 3 * 4, null, 0.0f, null, null, null, null, null, null, null, 4186984, null);
            case 3:
                float f14 = ((float) 0.5d) * 8;
                return new C17750h1(AbstractC8693b.m21267a(), new C39274g(EnumC16313m0.AI_SPARKLE.toWhoopIcon(), AbstractC8693b.m21278l("Auto Detected")), EnumC39333f.NEUTRAL_15, null, EnumC39333f.RECOVERY, null, null, EnumC17775o1.JOURNAL_TRENDS, false, null, f14, f14, 3 * 4, null, 0.0f, null, null, null, null, null, null, null, 4186984, null);
            case 4:
                return new C17750h1(textResource == null ? AbstractC8693b.m21267a() : textResource, null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, EnumC17775o1.JOURNAL_TRENDS, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194154, null);
            case 5:
                return new C17750h1(textResource == null ? AbstractC8693b.m21267a() : textResource, null, EnumC39333f.ACCENT_NEGATIVE_TREND_15, null, EnumC39333f.ACCENT_NEGATIVE_TREND, null, null, EnumC17775o1.JOURNAL_TRENDS, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194154, null);
            case 6:
                return new C17750h1(textResource == null ? AbstractC8693b.m21267a() : textResource, null, EnumC39333f.NEUTRAL_15, null, EnumC39333f.BRAND_WHITE, null, null, EnumC17775o1.JOURNAL_TRENDS, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194154, null);
            case 7:
                return AbstractC17746g1.m50885u(textResource == null ? AbstractC8693b.m21267a() : textResource);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: q */
    private static final List<C17750h1> m69399q(List<TileTagModel> list) {
        TagStyle tagStyle;
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList<TileTagModel> arrayList = new ArrayList();
        for (Object obj : list) {
            String tagStyle2 = ((TileTagModel) obj).getTagStyle();
            TagStyle tagStyle3 = TagStyle.NEUTRAL;
            TagStyle[] tagStyleArrValues = TagStyle.values();
            int length = tagStyleArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    tagStyle = null;
                    break;
                }
                tagStyle = tagStyleArrValues[i13];
                if (AbstractC22676k.m65745e(tagStyle.name(), tagStyle2)) {
                    break;
                }
                i13++;
            }
            if (tagStyle != null) {
                tagStyle3 = tagStyle;
            }
            if (tagStyle3 != TagStyle.AUTOMATED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (TileTagModel tileTagModel : arrayList) {
            C17750h1 c17750h1M69398p = m69398p(tileTagModel.getTagTitleDisplay(), tileTagModel.getTagStyle());
            if (c17750h1M69398p != null) {
                arrayList2.add(c17750h1M69398p);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: r */
    public static final C0377m m69400r(TestimonialsModel testimonialsModel) {
        AbstractC22676k.m65750j(testimonialsModel, "<this>");
        List<TestimonialModel> testimonials = testimonialsModel.getTestimonials();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(testimonials, 10));
        for (TestimonialModel testimonialModel : testimonials) {
            String id4 = testimonialModel.getId();
            String testimonial = testimonialModel.getTestimonial();
            String title = testimonialModel.getTitle();
            String str = !AbstractC39414r.m125890i0(title) ? title : null;
            String subtitle = testimonialModel.getSubtitle();
            if (AbstractC39414r.m125890i0(subtitle)) {
                subtitle = null;
            }
            String imageUrl = testimonialModel.getImageUrl();
            String str2 = !AbstractC39414r.m125890i0(imageUrl) ? imageUrl : null;
            arrayList.add(new C0365a(id4, testimonial, str, subtitle, str2 != null ? new AbstractC22403o.c(str2, AbstractC11895b.m31985d(C38072d.f163053a), 0, 0, 12, null) : null));
        }
        return new C0377m(arrayList, testimonialsModel.getSelectedTestimonialId(), AbstractC22676k.m65745e(testimonialsModel.getAutoscroll(), Boolean.TRUE));
    }

    /* JADX INFO: renamed from: s */
    public static final C17750h1 m69401s(TileTagModel tileTagModel) {
        AbstractC22676k.m65750j(tileTagModel, "<this>");
        return m69398p(tileTagModel.getTagTitleDisplay(), tileTagModel.getTagStyle());
    }
}
