package iq2;

import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.user.journey.model.UnknownUserJourneyStep;
import com.whoop.user.journey.model.UserJourneyStep;
import com.whoop.user.journey.model.weekinreview.ChatStep;
import com.whoop.user.journey.model.weekinreview.PastSevenDaysStep;
import com.whoop.user.journey.model.weekinreview.WirIntroStep;
import com.whoop.user.journey.model.weekinreview.WirPillarIntroStep;
import com.whoop.user.journey.model.weekinreview.WirWrapUpRecommendationsStep;
import com.whoop.user.journey.model.yearinreview.DonutChartStep;
import com.whoop.user.journey.model.yearinreview.DualBarStep;
import com.whoop.user.journey.model.yearinreview.FinaleStep;
import com.whoop.user.journey.model.yearinreview.GaugeStep;
import com.whoop.user.journey.model.yearinreview.HorizontalBarStep;
import com.whoop.user.journey.model.yearinreview.HorizontalSleepBarStep;
import com.whoop.user.journey.model.yearinreview.ImageOnlyStep;
import com.whoop.user.journey.model.yearinreview.InReviewDesignItemStep;
import com.whoop.user.journey.model.yearinreview.IntroStepStep;
import com.whoop.user.journey.model.yearinreview.LongTextStep;
import com.whoop.user.journey.model.yearinreview.NumberWithImage;
import com.whoop.user.journey.model.yearinreview.PillarIntroStep;
import com.whoop.user.journey.model.yearinreview.QuizStep;
import com.whoop.user.journey.model.yearinreview.ShareableStep;
import com.whoop.user.journey.model.yearinreview.ShortTextStep;
import com.whoop.user.journey.model.yearinreview.StackedHorizontalBarsStep;
import com.whoop.user.journey.model.yearinreview.StatListStep;
import j93.InterfaceC21461d;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: iq2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Liq2/c;", "Lwc3/c;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/user/journey/model/UserJourneyStep;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/user/journey/model/UserJourneyStep;", "a", "Ltr2/n;", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20857c implements InterfaceC37138c {

    /* JADX INFO: renamed from: d */
    public static final int f78456d = 8;

    /* JADX INFO: renamed from: e */
    private static final Map<String, InterfaceC21461d> f78457e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f78457e = AbstractC25247g0.m73990Y(new C23465k("DONUT_CHART", c22673i0.getOrCreateKotlinClass(DonutChartStep.class)), new C23465k("GAUGE", c22673i0.getOrCreateKotlinClass(GaugeStep.class)), new C23465k("HORIZONTAL_BAR_CHART", c22673i0.getOrCreateKotlinClass(HorizontalBarStep.class)), new C23465k("IMAGE", c22673i0.getOrCreateKotlinClass(ImageOnlyStep.class)), new C23465k("LONG_TEXT", c22673i0.getOrCreateKotlinClass(LongTextStep.class)), new C23465k("NUMBER_WITH_IMAGE", c22673i0.getOrCreateKotlinClass(NumberWithImage.class)), new C23465k("RECAP", c22673i0.getOrCreateKotlinClass(FinaleStep.class)), new C23465k("QUIZ", c22673i0.getOrCreateKotlinClass(QuizStep.class)), new C23465k("SHAREABLE_CARD", c22673i0.getOrCreateKotlinClass(ShareableStep.class)), new C23465k("SHORT_TEXT", c22673i0.getOrCreateKotlinClass(ShortTextStep.class)), new C23465k("SLEEP_CONSISTENCY", c22673i0.getOrCreateKotlinClass(HorizontalSleepBarStep.class)), new C23465k("STACKED_HORIZONTAL_BARS", c22673i0.getOrCreateKotlinClass(StackedHorizontalBarsStep.class)), new C23465k("STAT_LIST", c22673i0.getOrCreateKotlinClass(StatListStep.class)), new C23465k("THEME_INTRO", c22673i0.getOrCreateKotlinClass(PillarIntroStep.class)), new C23465k("WELCOME_STEP", c22673i0.getOrCreateKotlinClass(IntroStepStep.class)), new C23465k("COMPARISON_STEP", c22673i0.getOrCreateKotlinClass(DualBarStep.class)), new C23465k("IN_REVIEW_DESIGN_ITEM_STEP", c22673i0.getOrCreateKotlinClass(InReviewDesignItemStep.class)), new C23465k("CHAT_STEP", c22673i0.getOrCreateKotlinClass(ChatStep.class)), new C23465k("PAST_SEVEN_DAYS_STEP", c22673i0.getOrCreateKotlinClass(PastSevenDaysStep.class)), new C23465k("WIR_INTRO_STEP", c22673i0.getOrCreateKotlinClass(WirIntroStep.class)), new C23465k("WIR_PILLAR_INTRO_STEP", c22673i0.getOrCreateKotlinClass(WirPillarIntroStep.class)), new C23465k("WIR_WRAP_UP_RECOMMENDATIONS_STEP", c22673i0.getOrCreateKotlinClass(WirWrapUpRecommendationsStep.class)));
    }

    public C20857c(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("UserJourneyStep")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("UserJourneyStep");
        m57609a(c39437a);
        this.descriptor = new C39444h("UserJourneyStep", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m57609a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserJourneyStep deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        try {
            InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
            if (interfaceC0768k == null) {
                throw new SerializationException("UserJourneyStepSerializer can only be used with JSON");
            }
            JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "type");
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                throw new SerializationException("UserJourneyStep is missing \"type\" field");
            }
            InterfaceC21461d interfaceC21461d = f78457e.get(strM1844f);
            if (interfaceC21461d == null) {
                this.logger.mo85226q("Unknown UserJourneyStep type: " + strM1844f + ", returning UnknownUserJourneyStep", new AbstractC30556a.a[0]);
                return UnknownUserJourneyStep.INSTANCE;
            }
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
            if (interfaceC37138cM113847j == null) {
                throw new SerializationException("No serializer found for step type: ".concat(strM1844f));
            }
            JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "content");
            if (jsonElement2 != null) {
                return (UserJourneyStep) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonElement2);
            }
            throw new SerializationException("UserJourneyStep is missing \"content\" field");
        } catch (SerializationException e5) {
            this.logger.mo85230v("UserJourneyStep deserialization failed", e5, new AbstractC30556a.a[0]);
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("Unexpected error during UserJourneyStep deserialization", e13, new AbstractC30556a.a[0]);
            throw new SerializationException("Unexpected error during UserJourneyStep deserialization", e13);
        }
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, UserJourneyStep value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of UserJourneyStep not supported. Steps only deserialized from backend.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    public /* synthetic */ C20857c(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UserJourneyStepSerializer") : interfaceC34116n);
    }
}
