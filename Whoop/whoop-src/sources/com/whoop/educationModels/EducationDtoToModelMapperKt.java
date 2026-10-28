package com.whoop.educationModels;

import com.whoop.design.model.CtaNavigationDestination;
import com.whoop.design.model.EducationVideoType;
import com.whoop.design.model.FeatureEducationCtaButton;
import com.whoop.design.model.FeatureEducationImage;
import com.whoop.design.model.FeatureEducationInlineIcon;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import com.whoop.design.model.FeatureEducationThumbnail;
import com.whoop.design.model.FeatureEducationVideo;
import com.whoop.design.model.IconType;
import com.whoop.design.model.MediaType;
import com.whoop.design.model.ParagraphInsets;
import com.whoop.design.model.ScreenTextStyle;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d11.C11474i;
import gz0.EnumC16313m0;
import hy0.C17736e;
import hy0.EnumC17744g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.C22398j;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import me1.AbstractC25472a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import ve0.C35926d;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n¨\u0006\u000b"}, m65681d2 = {"toStressEducationSections", "", "Lcom/whoop/design/model/FeatureEducationParagraph;", "Lcom/whoop/educationModels/FeatureEducationDto;", "toEducationSections", "toEducationCtaButton", "Lcom/whoop/design/model/FeatureEducationCtaButton;", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "toIcon", "Lcom/whoop/design/model/FeatureEducationInlineIcon;", "Lcom/whoop/educationModels/InlineIcon;", "education-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EducationDtoToModelMapperKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.WHOOP_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.SHAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FeatureEducationCtaButton toEducationCtaButton(FeatureEducationButtonDto featureEducationButtonDto) {
        CtaNavigationDestination ctaNavigationDestination;
        EnumC39333f enumC39333fM64468e = C22398j.f87631a.m64468e(featureEducationButtonDto.getColor());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(featureEducationButtonDto.getText());
        String clickAction = featureEducationButtonDto.getClickAction();
        CtaNavigationDestination[] ctaNavigationDestinationArrValues = CtaNavigationDestination.values();
        int length = ctaNavigationDestinationArrValues.length;
        for (int i13 = 0; i13 < length; i13++) {
            ctaNavigationDestination = ctaNavigationDestinationArrValues[i13];
            if (AbstractC22676k.m65745e(ctaNavigationDestination.name(), clickAction)) {
                return new FeatureEducationCtaButton(enumC39333fM64468e, textResourceM21278l, ctaNavigationDestination);
            }
        }
        ctaNavigationDestination = null;
        return new FeatureEducationCtaButton(enumC39333fM64468e, textResourceM21278l, ctaNavigationDestination);
    }

    public static final List<FeatureEducationParagraph> toEducationSections(FeatureEducationDto featureEducationDto) {
        Iterator it;
        FeatureEducationImage featureEducationImage;
        FeatureEducationVideo featureEducationVideo;
        int i13;
        ArrayList arrayList;
        List<CtaTileModel> ctas;
        FeatureEducationButtonDto ctaButton;
        EducationVideoType educationVideoType;
        MediaType mediaType;
        Iterator it3;
        C17736e c17736e;
        EnumC17744g enumC17744g;
        AbstractC22676k.m65750j(featureEducationDto, "<this>");
        List<FeatureEducationScreenDto> screens = featureEducationDto.getScreens();
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = screens.iterator();
        while (it4.hasNext()) {
            FeatureEducationScreenDto featureEducationScreenDto = (FeatureEducationScreenDto) it4.next();
            List<FeatureEducationParagraphDto> sections = featureEducationScreenDto.getSections();
            int i14 = 10;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            Iterator it5 = sections.iterator();
            int i15 = 0;
            while (it5.hasNext()) {
                Object next = it5.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                FeatureEducationParagraphDto featureEducationParagraphDto = (FeatureEducationParagraphDto) next;
                C21535a c21535aM60554d = AbstractC21537c.m60554d(new C35926d(1));
                List<SentenceDto> sentences = featureEducationParagraphDto.getSentences();
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(sentences, i14));
                for (SentenceDto sentenceDto : sentences) {
                    C22398j c22398j = C22398j.f87631a;
                    ScreenTextStyle screenTextStyle = new ScreenTextStyle(c22398j.m64469f(sentenceDto.getStyle().getStyleName()), c22398j.m64468e(sentenceDto.getStyle().getColor()));
                    String text = sentenceDto.getText();
                    if (sentenceDto.getDivider() != null) {
                        EnumC17744g[] enumC17744gArrValues = EnumC17744g.values();
                        int length = enumC17744gArrValues.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                it3 = it4;
                                featureEducationScreenDto = featureEducationScreenDto;
                                enumC17744g = null;
                                break;
                            }
                            enumC17744g = enumC17744gArrValues[i17];
                            it3 = it4;
                            String strName = enumC17744g.name();
                            Divider divider = sentenceDto.getDivider();
                            if (AbstractC22676k.m65745e(strName, divider != null ? divider.getDividerType() : null)) {
                                break;
                            }
                            i17++;
                            it4 = it3;
                            featureEducationScreenDto = featureEducationScreenDto;
                        }
                        if (enumC17744g == null) {
                            enumC17744g = EnumC17744g.SOLID;
                        }
                        EnumC17744g enumC17744g2 = enumC17744g;
                        Divider divider2 = sentenceDto.getDivider();
                        c17736e = new C17736e(enumC17744g2, null, AbstractC8693b.m21278l(divider2 != null ? divider2.getTitle() : null), 2, null);
                    } else {
                        it3 = it4;
                        featureEducationScreenDto = featureEducationScreenDto;
                        c17736e = null;
                    }
                    String clickableTextUrl = sentenceDto.getClickableTextUrl();
                    InlineIcon inlineIcon = sentenceDto.getInlineIcon();
                    arrayList4.add(new FeatureEducationSentence(screenTextStyle, text, c17736e, clickableTextUrl, inlineIcon != null ? toIcon(inlineIcon) : null));
                    it4 = it3;
                    featureEducationScreenDto = featureEducationScreenDto;
                }
                Iterator it6 = it4;
                FeatureEducationScreenDto featureEducationScreenDto2 = featureEducationScreenDto;
                String alignment = featureEducationParagraphDto.getAlignment();
                ParagraphInsets paragraphInsets = new ParagraphInsets(featureEducationParagraphDto.getInset().getTop(), featureEducationParagraphDto.getInset().getLeading(), featureEducationParagraphDto.getInset().getBottom(), featureEducationParagraphDto.getInset().getTrailing());
                ImageDto image = featureEducationParagraphDto.getImage();
                if (image != null) {
                    String url = image.getUrl();
                    String mediaType2 = image.getMediaType();
                    if (mediaType2 == null) {
                        mediaType2 = "";
                    }
                    MediaType mediaType3 = MediaType.IMAGE;
                    MediaType[] mediaTypeArrValues = MediaType.values();
                    int length2 = mediaTypeArrValues.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length2) {
                            it = it5;
                            mediaType = null;
                            break;
                        }
                        mediaType = mediaTypeArrValues[i18];
                        it = it5;
                        if (AbstractC22676k.m65745e(mediaType.name(), mediaType2)) {
                            break;
                        }
                        i18++;
                        it5 = it;
                    }
                    if (mediaType != null) {
                        mediaType3 = mediaType;
                    }
                    featureEducationImage = new FeatureEducationImage(url, mediaType3);
                } else {
                    it = it5;
                    featureEducationImage = null;
                }
                FeatureEducationVideoDto video = featureEducationParagraphDto.getVideo();
                if (video != null) {
                    int id4 = video.getId();
                    FeatureEducationThumbnailDto thumbnail = video.getThumbnail();
                    FeatureEducationThumbnail featureEducationThumbnail = new FeatureEducationThumbnail(thumbnail.getId(), thumbnail.getCreatedAt(), thumbnail.getUpdatedAt(), thumbnail.getUrl(), thumbnail.getScrim(), thumbnail.getAlignment(), thumbnail.getBackgroundImage());
                    String createdAt = video.getCreatedAt();
                    String updatedAt = video.getUpdatedAt();
                    String title = video.getTitle();
                    String playtime = video.getPlaytime();
                    String url2 = video.getUrl();
                    EducationVideoType[] educationVideoTypeArrValues = EducationVideoType.values();
                    int length3 = educationVideoTypeArrValues.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length3) {
                            educationVideoType = null;
                            break;
                        }
                        EducationVideoType educationVideoType2 = educationVideoTypeArrValues[i19];
                        String strName2 = educationVideoType2.name();
                        EducationVideoTypeDto type = video.getType();
                        if (AbstractC22676k.m65745e(strName2, type != null ? type.name() : null)) {
                            educationVideoType = educationVideoType2;
                            break;
                        }
                        i19++;
                    }
                    featureEducationVideo = new FeatureEducationVideo(id4, featureEducationThumbnail, createdAt, updatedAt, title, playtime, url2, educationVideoType);
                } else {
                    featureEducationVideo = null;
                }
                FeatureEducationCtaButton educationCtaButton = (i15 != AbstractC37056f.m118951C(featureEducationScreenDto2.getSections()) || (ctaButton = featureEducationScreenDto2.getCtaButton()) == null) ? null : toEducationCtaButton(ctaButton);
                if (i15 != AbstractC37056f.m118951C(featureEducationScreenDto2.getSections()) || (ctas = featureEducationScreenDto2.getCtas()) == null) {
                    i13 = 10;
                    arrayList = null;
                } else {
                    List<CtaTileModel> list = ctas;
                    i13 = 10;
                    ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator<T> it7 = list.iterator();
                    while (it7.hasNext()) {
                        InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h((CtaTileModel) it7.next());
                        if (interfaceC25312uM60541h instanceof C11474i) {
                            interfaceC25312uM60541h = C11474i.m30808f((C11474i) interfaceC25312uM60541h, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null, null, 469762047, null);
                        }
                        arrayList5.add(interfaceC25312uM60541h);
                    }
                    arrayList = arrayList5;
                }
                arrayList3.add(new FeatureEducationParagraph(arrayList4, alignment, paragraphInsets, featureEducationImage, featureEducationVideo, educationCtaButton, arrayList));
                i14 = i13;
                i15 = i16;
                it4 = it6;
                featureEducationScreenDto = featureEducationScreenDto2;
                it5 = it;
            }
            AbstractC25265s.m74141p0(arrayList2, arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 toEducationSections$lambda$0$0$0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    public static final FeatureEducationInlineIcon toIcon(InlineIcon inlineIcon) {
        IconType iconType;
        AbstractC22676k.m65750j(inlineIcon, "<this>");
        String strValueOf = String.valueOf(inlineIcon.getType());
        IconType iconType2 = IconType.WHOOP_ICON;
        IconType[] iconTypeArrValues = IconType.values();
        int length = iconTypeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                iconType = null;
                break;
            }
            iconType = iconTypeArrValues[i13];
            if (AbstractC22676k.m65745e(iconType.name(), strValueOf)) {
                break;
            }
            i13++;
        }
        if (iconType != null) {
            iconType2 = iconType;
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[iconType2.ordinal()];
        if (i14 == 1) {
            try {
                return new FeatureEducationInlineIcon(EnumC16313m0.valueOf(inlineIcon.getName()).toWhoopIcon(), C22398j.f87631a.m64468e(String.valueOf(inlineIcon.getColor())));
            } catch (Exception unused) {
                return null;
            }
        }
        if (i14 == 2) {
            return new FeatureEducationInlineIcon(AbstractC25472a.f99742a, C22398j.f87631a.m64468e(String.valueOf(inlineIcon.getColor())));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<FeatureEducationParagraph> toStressEducationSections(FeatureEducationDto featureEducationDto) {
        AbstractC22676k.m65750j(featureEducationDto, "<this>");
        ArrayList<FeatureEducationParagraphDto> arrayList = new ArrayList();
        Iterator<T> it = featureEducationDto.getScreens().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((FeatureEducationScreenDto) it.next()).getSections());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (FeatureEducationParagraphDto featureEducationParagraphDto : arrayList) {
            List<SentenceDto> sentences = featureEducationParagraphDto.getSentences();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(sentences, 10));
            for (SentenceDto sentenceDto : sentences) {
                C22398j c22398j = C22398j.f87631a;
                arrayList3.add(new FeatureEducationSentence(new ScreenTextStyle(c22398j.m64469f(sentenceDto.getStyle().getStyleName()), c22398j.m64468e(sentenceDto.getStyle().getColor())), sentenceDto.getText(), null, null, null, 28, null));
            }
            String alignment = featureEducationParagraphDto.getAlignment();
            ParagraphInsets paragraphInsets = new ParagraphInsets(featureEducationParagraphDto.getInset().getTop(), featureEducationParagraphDto.getInset().getLeading(), featureEducationParagraphDto.getInset().getBottom(), featureEducationParagraphDto.getInset().getTrailing());
            ImageDto image = featureEducationParagraphDto.getImage();
            Object featureEducationImage = null;
            if (image != null) {
                String url = image.getUrl();
                String mediaType = image.getMediaType();
                if (mediaType == null) {
                    mediaType = "";
                }
                MediaType mediaType2 = MediaType.IMAGE;
                for (MediaType mediaType3 : MediaType.values()) {
                    if (AbstractC22676k.m65745e(mediaType3.name(), mediaType)) {
                        featureEducationImage = mediaType3;
                        break;
                    }
                }
                if (featureEducationImage != null) {
                    mediaType2 = featureEducationImage;
                }
                featureEducationImage = new FeatureEducationImage(url, mediaType2);
            }
            arrayList2.add(new FeatureEducationParagraph(arrayList3, alignment, paragraphInsets, featureEducationImage, null, null, null, 112, null));
        }
        return arrayList2;
    }
}
