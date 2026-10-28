package tn1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import h01.C16534a0;
import h01.C16550q;
import h01.C16553t;
import h01.EnumC16533a;
import h01.InterfaceC16556w;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p291l0.C22976l1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.AbstractC36203g;
import pn1.AbstractC29379b;
import qc1.C30217a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ltn1/b;", "", "<init>", "()V", "Lcom/whoop/design/models/NotificationCardModel;", "", "index", "Lh01/w;", "e", "(Lcom/whoop/design/models/NotificationCardModel;I)Lh01/w;", "", "imageUrl", "title", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;", "Lh01/a;", "cardType", "backgroundStyle", "d", "(Lh01/a;Ljava/lang/String;)Lh01/a;", "Lpn1/b;", "domainResult", "Lvn1/g;", "c", "(Lpn1/b;)Lvn1/g;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33960b {
    /* JADX INFO: renamed from: b */
    private final C9598e m107410b(String imageUrl, String title, C9598e navigation) {
        C9598e c9598eM23127b;
        if (navigation == null) {
            return null;
        }
        NavigationScreenModel parameters = navigation.getParameters();
        CoachScreenModel coachScreenModel = parameters instanceof CoachScreenModel ? (CoachScreenModel) parameters : null;
        return (coachScreenModel == null || (c9598eM23127b = C9598e.m23127b(navigation, null, coachScreenModel.copy((16359 & 1) != 0 ? coachScreenModel.sourceType : null, (16359 & 2) != 0 ? coachScreenModel.entryText : null, (16359 & 4) != 0 ? coachScreenModel.conversationSeedId : null, (16359 & 8) != 0 ? coachScreenModel.cardVariant : new C33959a().m107408a(imageUrl), (16359 & 16) != 0 ? coachScreenModel.label : title, (16359 & 32) != 0 ? coachScreenModel.presetQuestion : null, (16359 & 64) != 0 ? coachScreenModel.includeInitialMessage : false, (16359 & 128) != 0 ? coachScreenModel.sourceId : null, (16359 & 256) != 0 ? coachScreenModel.args : null, (16359 & 512) != 0 ? coachScreenModel.source : null, (16359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? coachScreenModel.educationType : null, (16359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? coachScreenModel.deeplinkConversationId : null, (16359 & 4096) != 0 ? coachScreenModel.deeplinkSourceId : null, (16359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? coachScreenModel.shouldOpenFullSize : false), null, 5, null)) == null) ? navigation : c9598eM23127b;
    }

    /* JADX INFO: renamed from: d */
    private final EnumC16533a m107411d(EnumC16533a cardType, String backgroundStyle) {
        return (backgroundStyle != null && backgroundStyle.equals("ONBOARDING") && cardType == EnumC16533a.ONBOARDING) ? EnumC16533a.ONBOARDING_BG_GRADIENT : cardType;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC16556w m107412e(NotificationCardModel notificationCardModel, int i13) {
        if (notificationCardModel instanceof TextOnlyCardModel) {
            TextOnlyCardModel textOnlyCardModel = (TextOnlyCardModel) notificationCardModel;
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            return new C16534a0(textOnlyCardModel.getId(), AbstractC8693b.m21278l(textOnlyCardModel.getBody()), textOnlyCardModel.getAppNotificationType(), textOnlyCardModel.getTemplateName(), i13 == 0, new C22976l1(f14, f14, 9 * f13, f14), m107411d(textOnlyCardModel.getCardType(), textOnlyCardModel.getBackgroundStyle()), AbstractC8693b.m21278l(textOnlyCardModel.getTitle()), textOnlyCardModel.getShowHighlight() && i13 == 0, null, null, 1536, null);
        }
        if (notificationCardModel instanceof TextWithIllustrationCardModel) {
            TextWithIllustrationCardModel textWithIllustrationCardModel = (TextWithIllustrationCardModel) notificationCardModel;
            String id4 = textWithIllustrationCardModel.getId();
            String appNotificationType = textWithIllustrationCardModel.getAppNotificationType();
            String templateName = textWithIllustrationCardModel.getTemplateName();
            EnumC22400l cta = textWithIllustrationCardModel.getCta();
            if (cta == null) {
                cta = EnumC22400l.NONE;
            }
            EnumC22400l enumC22400l = cta;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(textWithIllustrationCardModel.getCtaText());
            AbstractC22403o.c cVar = new AbstractC22403o.c(textWithIllustrationCardModel.getImageUrl(), 0, 0, 0, 14, null);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(textWithIllustrationCardModel.getBody());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(textWithIllustrationCardModel.getTitle());
            EnumC16533a enumC16533aM107411d = m107411d(textWithIllustrationCardModel.getCardType(), textWithIllustrationCardModel.getBackgroundStyle());
            boolean z4 = textWithIllustrationCardModel.getShowHighlight() && i13 == 0;
            boolean z13 = i13 == 0;
            float f15 = 8;
            float f16 = ((float) 2.5d) * f15;
            C22976l1 c22976l1 = new C22976l1(f16, f16, ((float) 5.5d) * f15, f16);
            C9598e c9598eM107410b = m107410b(textWithIllustrationCardModel.getImageUrl(), textWithIllustrationCardModel.getTitle(), textWithIllustrationCardModel.getNavigation());
            String ctaText = textWithIllustrationCardModel.getCtaText();
            return new C16550q(id4, textResourceM21278l2, appNotificationType, templateName, z13, c22976l1, enumC16533aM107411d, enumC22400l, textResourceM21278l, cVar, textResourceM21278l3, false, z4, false, false, c9598eM107410b, (ctaText != null ? ctaText.length() : 0) > 20, null, null, null, null, 1992704, null);
        }
        if (!(notificationCardModel instanceof TextWithDesignItemCardModel)) {
            if (!(notificationCardModel instanceof TextAndImageCardModel)) {
                throw new IllegalArgumentException("No mapper exists for: " + notificationCardModel);
            }
            TextAndImageCardModel textAndImageCardModel = (TextAndImageCardModel) notificationCardModel;
            float f17 = 8;
            float f18 = ((float) 2.5d) * f17;
            return new C16553t(textAndImageCardModel.getId(), AbstractC8693b.m21278l(textAndImageCardModel.getBody()), textAndImageCardModel.getAppNotificationType(), textAndImageCardModel.getTemplateName(), i13 == 0, new C22976l1(f18, f18, ((float) 5.5d) * f17, f18), m107411d(textAndImageCardModel.getCardType(), textAndImageCardModel.getBackgroundStyle()), new AbstractC22403o.c(textAndImageCardModel.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(textAndImageCardModel.getTitle()), false, textAndImageCardModel.getShowHighlight() && i13 == 0, null, null, 6656, null);
        }
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C30217a(29));
        TextWithDesignItemCardModel textWithDesignItemCardModel = (TextWithDesignItemCardModel) notificationCardModel;
        String id5 = textWithDesignItemCardModel.getId();
        String appNotificationType2 = textWithDesignItemCardModel.getAppNotificationType();
        String templateName2 = textWithDesignItemCardModel.getTemplateName();
        EnumC22400l cta2 = textWithDesignItemCardModel.getCta();
        if (cta2 == null) {
            cta2 = EnumC22400l.NONE;
        }
        EnumC22400l enumC22400l2 = cta2;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(textWithDesignItemCardModel.getCtaText());
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(textWithDesignItemCardModel.getImageUrl(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(textWithDesignItemCardModel.getBody());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(textWithDesignItemCardModel.getTitle());
        EnumC16533a enumC16533aM107411d2 = m107411d(textWithDesignItemCardModel.getCardType(), textWithDesignItemCardModel.getBackgroundStyle());
        boolean z14 = textWithDesignItemCardModel.getShowHighlight() && i13 == 0;
        boolean z15 = i13 == 0;
        float f19 = 8;
        float f24 = ((float) 2.5d) * f19;
        C22976l1 c22976l2 = new C22976l1(f24, f24, ((float) 5.5d) * f19, f24);
        C9598e c9598eM107410b2 = m107410b(textWithDesignItemCardModel.getImageUrl(), textWithDesignItemCardModel.getTitle(), textWithDesignItemCardModel.getNavigation());
        String ctaText2 = textWithDesignItemCardModel.getCtaText();
        boolean z16 = (ctaText2 != null ? ctaText2.length() : 0) > 20;
        DesignSystemModel rightItem = textWithDesignItemCardModel.getRightItem();
        return new C16550q(id5, textResourceM21278l5, appNotificationType2, templateName2, z15, c22976l2, enumC16533aM107411d2, enumC22400l2, textResourceM21278l4, cVar2, textResourceM21278l6, false, z14, false, false, c9598eM107410b2, z16, null, null, null, rightItem != null ? c21535aM60554d.m60541h(rightItem) : null, 944128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m107413f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC36203g m107414c(AbstractC29379b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC29379b.c) {
            AbstractC29379b.c cVar = (AbstractC29379b.c) domainResult;
            int size = cVar.m89551c().size();
            List<NotificationCardModel> listM89551c = cVar.m89551c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM89551c, 10));
            int i13 = 0;
            for (Object obj : listM89551c) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                arrayList.add(m107412e((NotificationCardModel) obj, i13));
                i13 = i14;
            }
            return new AbstractC36203g.c((InterfaceC16556w) AbstractC25265s.m74102I0(0, arrayList), size, false, cVar.getPlayShimmer(), cVar.getHighlightCounter(), (InterfaceC16556w) AbstractC25265s.m74102I0(1, arrayList), cVar.getNotificationCardDismissAnimation(), arrayList, 4, null);
        }
        if (!(domainResult instanceof AbstractC29379b.d)) {
            return domainResult instanceof AbstractC29379b.b ? AbstractC36203g.b.f155006b : AbstractC36203g.a.f155004b;
        }
        AbstractC29379b.d dVar = (AbstractC29379b.d) domainResult;
        int size2 = dVar.m89559c().size();
        List<NotificationCardModel> listM89559c = dVar.m89559c();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM89559c, 10));
        int i15 = 0;
        for (Object obj2 : listM89559c) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList2.add(m107412e((NotificationCardModel) obj2, i15));
            i15 = i16;
        }
        return new AbstractC36203g.c((InterfaceC16556w) AbstractC25265s.m74102I0(0, arrayList2), size2, true, false, false, (InterfaceC16556w) AbstractC25265s.m74102I0(1, arrayList2), null, arrayList2, 88, null);
    }
}
