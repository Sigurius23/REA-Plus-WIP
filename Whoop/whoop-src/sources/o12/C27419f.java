package o12;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import com.whoop.design.model.ParagraphInsets;
import com.whoop.design.model.ScreenTextStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.FeatureEducationButtonDto;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.educationModels.FeatureEducationParagraphDto;
import com.whoop.educationModels.FeatureEducationScreenDto;
import com.whoop.educationModels.FeatureEducationVideoDto;
import com.whoop.educationModels.ImageDto;
import com.whoop.educationModels.InsetDto;
import com.whoop.educationModels.NavBarDto;
import com.whoop.educationModels.ScreenTextStyleDto;
import com.whoop.educationModels.SentenceDto;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22398j;
import km0.C22581e;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ny0.EnumC27284v;
import p12.C28707a0;
import p12.C28708b;
import p12.C28709b0;
import p12.C28712d;
import p12.C28714e;
import p12.C28715e0;
import p12.C28716f;
import p12.C28735y;
import p12.C28736z;
import p12.EnumC28706a;
import p12.EnumC28710c;
import p12.EnumC28717g;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import sw0.C33050g;
import tw0.C34215a;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o12.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ)\u0010L\u001a\u00020K2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bN\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020B0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010R¨\u0006T"}, m65681d2 = {"Lo12/f;", "", "Ltw0/a;", "bottomSheetReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lo12/h;", "accumulator", "Lp12/y;", "a", "(Lo12/h;)Lp12/y;", "b", "", "isFinal", "Lp12/a0;", "o", "(Lo12/h;Z)Lp12/a0;", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", HMSTrackSource.SCREEN, "Lp12/f;", "e", "(Lcom/whoop/educationModels/FeatureEducationScreenDto;)Lp12/f;", "Lp12/c;", "c", "(Lcom/whoop/educationModels/FeatureEducationScreenDto;)Lp12/c;", "composeBackground", "Li91/a;", "d", "(Lp12/c;Lcom/whoop/educationModels/FeatureEducationScreenDto;)Li91/a;", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "videoInfo", "Lp12/e0;", "f", "(Lcom/whoop/educationModels/FeatureEducationVideoDto;)Lp12/e0;", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "button", "Lp12/b;", "l", "(Lcom/whoop/educationModels/FeatureEducationButtonDto;ZLo12/h;)Lp12/b;", "Lsw0/g;", "bottomSheet", "Lkm0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsw0/g;)Lkm0/e;", "Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "featureEducationParagraphDto", "Lcom/whoop/design/model/FeatureEducationParagraph;", "m", "(Lcom/whoop/educationModels/FeatureEducationParagraphDto;)Lcom/whoop/design/model/FeatureEducationParagraph;", "Lcom/whoop/educationModels/InsetDto;", "insetsDto", "Lcom/whoop/design/model/ParagraphInsets;", "i", "(Lcom/whoop/educationModels/InsetDto;)Lcom/whoop/design/model/ParagraphInsets;", "Lcom/whoop/educationModels/SentenceDto;", "sentenceDto", "Lcom/whoop/design/model/FeatureEducationSentence;", "n", "(Lcom/whoop/educationModels/SentenceDto;)Lcom/whoop/design/model/FeatureEducationSentence;", "Lcom/whoop/educationModels/ScreenTextStyleDto;", "textStyleDto", "Lcom/whoop/design/model/ScreenTextStyle;", "k", "(Lcom/whoop/educationModels/ScreenTextStyleDto;)Lcom/whoop/design/model/ScreenTextStyle;", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "p", "(Lcom/whoop/data/onboarding/FeatureEducationType;)Z", "", "pageNumber", "totalPages", "", "buttonText", "Lc31/k;", "j", "(IILjava/lang/String;)Lc31/k;", "g", "Ltw0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "Ljava/util/List;", "featuresThatAllowSkip", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27419f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<FeatureEducationType> featuresThatAllowSkip;

    /* JADX INFO: renamed from: o12.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f110465a;

        static {
            int[] iArr = new int[EnumC28710c.values().length];
            try {
                iArr[EnumC28710c.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28710c.BRUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28710c.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC28710c.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f110465a = iArr;
        }
    }

    public C27419f(C34215a bottomSheetReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.bottomSheetReducer = bottomSheetReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.featuresThatAllowSkip = AbstractC37056f.m118959K(FeatureEducationType.HEALTHSPAN_ONBOARDING, FeatureEducationType.SAGE_ONBOARDING);
    }

    /* JADX INFO: renamed from: a */
    private final C28735y m82824a(C27421h accumulator) {
        FeatureEducationType type;
        AbstractC27415b domainState = accumulator.getDomainState();
        if (domainState instanceof AbstractC27415b.c) {
            return new C28735y(true, false, null, false, null, 30, null);
        }
        if (domainState instanceof AbstractC27415b.b) {
            return new C28735y(false, true, null, false, null, 29, null);
        }
        if (!(domainState instanceof AbstractC27415b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        C28735y c28735yM82825b = m82825b(accumulator);
        FeatureEducationDto story = accumulator.getStory();
        return C28735y.m87469b(c28735yM82825b, false, false, null, (story == null || (type = story.getType()) == null) ? false : m82838p(type), null, 23, null);
    }

    /* JADX INFO: renamed from: b */
    private final C28735y m82825b(C27421h accumulator) {
        FeatureEducationButtonDto leftButton;
        FeatureEducationButtonDto ctaButton;
        if (accumulator.getStory() == null) {
            return new C28735y(false, true, null, false, null, 29, null);
        }
        boolean z4 = accumulator.getStory().getScreens().get(0).getCtaButton() != null;
        boolean z13 = !(!z4 ? accumulator.getPageNumber() + 1 != accumulator.getStory().getScreens().size() : !(accumulator.getPageNumber() == 0 || accumulator.getPageNumber() + 1 == accumulator.getStory().getScreens().size()));
        int pageNumber = accumulator.getPageNumber();
        if (z4) {
            pageNumber--;
        }
        int size = accumulator.getStory().getScreens().size();
        if (z4) {
            size--;
        }
        C28736z c28736z = new C28736z(z13, pageNumber, size, m82831i(accumulator.getStory().getScreens().get(0).getParagraphs().get(0).getInset()));
        int pageNumber2 = c28736z.getPageNumber();
        int totalPages = c28736z.getTotalPages();
        FeatureEducationScreenDto featureEducationScreenDto = (FeatureEducationScreenDto) AbstractC25265s.m74102I0(accumulator.getPageNumber(), accumulator.getStory().getScreens());
        C3927k c3927kM82832j = m82832j(pageNumber2, totalPages, (featureEducationScreenDto == null || (ctaButton = featureEducationScreenDto.getCtaButton()) == null) ? null : ctaButton.getText());
        C28707a0 c28707a0M82837o = m82837o(accumulator, accumulator.getPageNumber() + 1 == accumulator.getStory().getScreens().size());
        if (c28707a0M82837o == null) {
            return new C28735y(false, true, null, false, null, 29, null);
        }
        NavBarDto navBar = accumulator.getStory().getScreens().get(accumulator.getPageNumber()).getNavBar();
        if (navBar == null || (leftButton = navBar.getLeftButton()) == null) {
            NavBarDto navBar2 = accumulator.getStory().getNavBar();
            leftButton = navBar2 != null ? navBar2.getLeftButton() : null;
        }
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(leftButton != null ? leftButton.getButtonName() : null);
        C28714e c28714e = new C28714e(accumulator.getStory().getType(), accumulator.getStory().getStoryId());
        boolean z14 = accumulator.getStory().getType() != FeatureEducationType.SAVE_JOURNAL && (accumulator.getPageNumber() == 0 || enumC16313m0M46377b != null);
        boolean z15 = (z4 && accumulator.getPageNumber() == 0) ? false : true;
        FeatureEducationButtonDto ctaButton2 = ((FeatureEducationScreenDto) AbstractC25265s.m74112P0(accumulator.getStory().getScreens())).getCtaButton();
        return new C28735y(false, false, new C28712d(c28714e, c28736z, c3927kM82832j, c28707a0M82837o, z14, enumC16313m0M46377b, z15, ctaButton2 != null ? ctaButton2.getAction() : null), false, accumulator.m82845f(), 11, null);
    }

    /* JADX INFO: renamed from: c */
    private final EnumC28710c m82826c(FeatureEducationScreenDto screen) {
        ImageDto image = screen.getBackground().getImage();
        if ((image != null ? image.getScrim() : null) != null) {
            return EnumC28710c.OVERLAY;
        }
        ImageDto heroImage = screen.getHeroImage();
        if ((heroImage != null ? heroImage.getScrim() : null) != null) {
            return EnumC28710c.BRUSH;
        }
        return screen.getBackground().getGradient() != null ? EnumC28710c.BACKGROUND : EnumC28710c.NONE;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC18247a m82827d(EnumC28710c composeBackground, FeatureEducationScreenDto screen) {
        int i13 = a.f110465a[composeBackground.ordinal()];
        if (i13 == 1) {
            return C22398j.f87631a.m64470g(screen.getBackground().getGradient());
        }
        if (i13 == 2) {
            C22398j c22398j = C22398j.f87631a;
            ImageDto heroImage = screen.getHeroImage();
            return c22398j.m64470g(heroImage != null ? heroImage.getScrim() : null);
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        C22398j c22398j2 = C22398j.f87631a;
        ImageDto image = screen.getBackground().getImage();
        return c22398j2.m64470g(image != null ? image.getScrim() : null);
    }

    /* JADX INFO: renamed from: e */
    private final C28716f m82828e(FeatureEducationScreenDto screen) {
        boolean z4;
        EnumC28706a enumC28706a;
        ImageDto heroImage = screen.getHeroImage();
        String url = heroImage != null ? heroImage.getUrl() : null;
        ImageDto image = screen.getBackground().getImage();
        String url2 = image != null ? image.getUrl() : null;
        int i13 = 0;
        if (url == null && screen.getVideo() == null) {
            z4 = true;
            url = url2;
        } else {
            z4 = false;
        }
        EnumC28710c enumC28710cM82826c = m82826c(screen);
        AbstractC18247a abstractC18247aM82827d = m82827d(enumC28710cM82826c, screen);
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(url);
        ImageDto image2 = screen.getBackground().getImage();
        String mediaType = image2 != null ? image2.getMediaType() : null;
        if (mediaType == null) {
            mediaType = "";
        }
        EnumC28706a enumC28706a2 = EnumC28706a.IMAGE;
        EnumC28706a[] enumC28706aArrValues = EnumC28706a.values();
        int length = enumC28706aArrValues.length;
        while (true) {
            if (i13 >= length) {
                enumC28706a = null;
                break;
            }
            enumC28706a = enumC28706aArrValues[i13];
            if (AbstractC22676k.m65745e(enumC28706a.name(), mediaType)) {
                break;
            }
            i13++;
        }
        EnumC28706a enumC28706a3 = enumC28706a == null ? enumC28706a2 : enumC28706a;
        String strM113135b = url != null ? InterfaceC35689r0.e.m113135b(url) : null;
        return new C28716f(z4, abstractC22403oM64503l, enumC28706a3, strM113135b != null ? InterfaceC35689r0.e.m113134a(strM113135b) : null, abstractC18247aM82827d, enumC28710cM82826c);
    }

    /* JADX INFO: renamed from: f */
    private final C28715e0 m82829f(FeatureEducationVideoDto videoInfo) {
        if (videoInfo == null) {
            return null;
        }
        String title = videoInfo.getTitle();
        if (title == null) {
            title = "";
        }
        String playtime = videoInfo.getPlaytime();
        return new C28715e0(title, playtime != null ? playtime : "", new AbstractC22403o.c(videoInfo.getThumbnail().getUrl(), 0, 0, 0, 14, null), videoInfo.getUrl());
    }

    /* JADX INFO: renamed from: h */
    private final C22581e m82830h(C33050g bottomSheet) {
        return C34215a.m108144f(this.bottomSheetReducer, bottomSheet, this.bottomSheetReducer.m108145b(bottomSheet), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: i */
    private final ParagraphInsets m82831i(InsetDto insetsDto) {
        return new ParagraphInsets(insetsDto.getTop(), insetsDto.getLeading(), insetsDto.getBottom(), insetsDto.getTrailing());
    }

    /* JADX INFO: renamed from: j */
    private final C3927k m82832j(int pageNumber, int totalPages, String buttonText) {
        TextResource textResourceM21277k;
        String str;
        if (pageNumber == 0) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC27420g.f110468c);
        } else if (pageNumber != totalPages - 1) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC27420g.f110469d);
        } else if (buttonText == null || (textResourceM21277k = AbstractC8693b.m21278l(buttonText)) == null) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC27420g.f110466a);
        }
        TextResource textResource = textResourceM21277k;
        EnumC3920d enumC3920d = (pageNumber == 0 || pageNumber == totalPages + (-1)) ? EnumC3920d.FILLED : EnumC3920d.PROGRESS;
        EnumC3920d enumC3920d2 = enumC3920d;
        int i13 = totalPages - 1;
        EnumC39333f enumC39333f = pageNumber == i13 ? EnumC39333f.ACCENT_POSITIVE_TREND : null;
        AbstractC17911t abstractC17911tM43987H0 = pageNumber != i13 ? AbstractC15673b0.m43987H0() : null;
        if (pageNumber == 0) {
            str = "Get Started Button";
        } else {
            str = pageNumber == i13 ? "Done Button" : "Next Button";
        }
        return new C3927k(enumC3920d2, textResource, EnumC39333f.BRAND_WHITE, null, null, pageNumber == i13 ? EnumC16313m0.CHECKMARK : EnumC16313m0.ARROW_FORWARD, i13, pageNumber, null, false, false, enumC39333f, abstractC17911tM43987H0, pageNumber == i13 ? EnumC39333f.BRAND_BLACK : EnumC39333f.BRAND_WHITE, null, null, str, 50968, null);
    }

    /* JADX INFO: renamed from: k */
    private final ScreenTextStyle m82833k(ScreenTextStyleDto textStyleDto) {
        C22398j c22398j = C22398j.f87631a;
        return new ScreenTextStyle(c22398j.m64469f(textStyleDto.getStyleName()), c22398j.m64468e(textStyleDto.getColor()));
    }

    /* JADX INFO: renamed from: l */
    private final C28708b m82834l(FeatureEducationButtonDto button, boolean isFinal, C27421h accumulator) {
        EnumC28717g enumC28717g;
        C33050g customizeBottomSheetDomainState;
        if (button == null) {
            return null;
        }
        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
        EnumC39333f enumC39333fM64468e = C22398j.f87631a.m64468e(button.getColor());
        String text = button.getText();
        String clickAction = button.getClickAction();
        EnumC28717g enumC28717g2 = EnumC28717g.NEXT;
        EnumC28717g[] enumC28717gArrValues = EnumC28717g.values();
        int length = enumC28717gArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC28717g = null;
                break;
            }
            enumC28717g = enumC28717gArrValues[i13];
            if (AbstractC22676k.m65745e(enumC28717g.name(), clickAction)) {
                break;
            }
            i13++;
        }
        return new C28708b(new C28709b0(enumC27284v, enumC39333fM64468e, text, enumC28717g == null ? enumC28717g2 : enumC28717g, isFinal, (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.CUSTOM_BOTTOM_SHEET) || (customizeBottomSheetDomainState = accumulator.getCustomizeBottomSheetDomainState()) == null) ? null : m82830h(customizeBottomSheetDomainState)), null, 2, null);
    }

    /* JADX INFO: renamed from: m */
    private final FeatureEducationParagraph m82835m(FeatureEducationParagraphDto featureEducationParagraphDto) {
        List<SentenceDto> sentences = featureEducationParagraphDto.getSentences();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sentences, 10));
        Iterator<T> it = sentences.iterator();
        while (it.hasNext()) {
            arrayList.add(m82836n((SentenceDto) it.next()));
        }
        return new FeatureEducationParagraph(arrayList, featureEducationParagraphDto.getAlignment(), m82831i(featureEducationParagraphDto.getInset()), null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: n */
    private final FeatureEducationSentence m82836n(SentenceDto sentenceDto) {
        return new FeatureEducationSentence(m82833k(sentenceDto.getStyle()), sentenceDto.getText(), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: o */
    private final C28707a0 m82837o(C27421h accumulator, boolean isFinal) {
        List<FeatureEducationScreenDto> screens;
        FeatureEducationDto story = accumulator.getStory();
        FeatureEducationScreenDto featureEducationScreenDto = (story == null || (screens = story.getScreens()) == null) ? null : (FeatureEducationScreenDto) AbstractC25265s.m74102I0(accumulator.getPageNumber(), screens);
        if (featureEducationScreenDto == null) {
            return null;
        }
        List<FeatureEducationParagraphDto> paragraphs = featureEducationScreenDto.getParagraphs();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(paragraphs, 10));
        Iterator<T> it = paragraphs.iterator();
        while (it.hasNext()) {
            arrayList.add(m82835m((FeatureEducationParagraphDto) it.next()));
        }
        return new C28707a0(arrayList, m82828e(featureEducationScreenDto), m82834l(featureEducationScreenDto.getCtaButton(), isFinal, accumulator), m82829f(featureEducationScreenDto.getVideo()));
    }

    /* JADX INFO: renamed from: p */
    private final boolean m82838p(FeatureEducationType type) {
        return this.featuresThatAllowSkip.contains(type);
    }

    /* JADX INFO: renamed from: g */
    public final C28735y m82839g(C27421h accumulator) {
        AbstractC22676k.m65750j(accumulator, "accumulator");
        return m82824a(accumulator);
    }
}
