package yk1;

import c41.C4092p2;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.helpcenter.data.network.model.CallSectionDto;
import com.whoop.helpcenter.data.network.model.CommonQuestionCard;
import com.whoop.helpcenter.data.network.model.HelpCenterLandingBffDto;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import x81.C38072d;
import xk1.C38427a;
import xk1.C38428b;
import xk1.C38429c;
import xk1.C38430d;
import xk1.C38431e;
import xk1.C38433g;
import xk1.EnumC38432f;
import xk1.EnumC38434h;
import yb1.C39389a;

/* JADX INFO: renamed from: yk1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;", "Ljb1/a;", "reducer", "Lxk1/e;", "b", "(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;)Lxk1/e;", "Lcom/whoop/helpcenter/data/network/model/CallSectionDto;", "Lxk1/b;", "g", "(Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)Lxk1/b;", "", "Lxk1/f;", "f", "(Ljava/lang/String;)Lxk1/f;", "", "e", "(Ljava/lang/String;)I", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39600b {
    /* JADX INFO: renamed from: b */
    public static final C38431e m126484b(HelpCenterLandingBffDto helpCenterLandingBffDto, C21535a reducer) {
        EnumC38434h enumC38434h;
        C4092p2 c4092p2;
        AbstractC22676k.m65750j(helpCenterLandingBffDto, "<this>");
        AbstractC22676k.m65750j(reducer, "reducer");
        int iM126487e = m126487e(helpCenterLandingBffDto.getLeftNavBarIcon());
        int iM126487e2 = m126487e(helpCenterLandingBffDto.getRightNavBarIcon());
        String header = helpCenterLandingBffDto.getHeader();
        String pageTitle = helpCenterLandingBffDto.getPageTitle();
        String commonQuestionsTitle = helpCenterLandingBffDto.getCommonQuestionsSection().getCommonQuestionsTitle();
        List<CommonQuestionCard> commonQuestionCards = helpCenterLandingBffDto.getCommonQuestionsSection().getCommonQuestionCards();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(commonQuestionCards, 10));
        Iterator<T> it = commonQuestionCards.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CommonQuestionCard commonQuestionCard = (CommonQuestionCard) it.next();
            String title = commonQuestionCard.getTitle();
            String subTitle = commonQuestionCard.getSubTitle();
            if (subTitle == null) {
                subTitle = "";
            }
            arrayList.add(new C38429c(title, subTitle, m126488f(commonQuestionCard.getQuestionType()), m126487e(commonQuestionCard.getLeftIconType()), m126487e(commonQuestionCard.getRightIconType()), commonQuestionCard.getArticleUrl(), commonQuestionCard.getPreviewText()));
        }
        C38430d c38430d = new C38430d(commonQuestionsTitle, arrayList);
        String sectionTitle = helpCenterLandingBffDto.getBrowseAllSection().getSectionTitle();
        String articleUrl = helpCenterLandingBffDto.getBrowseAllSection().getArticleUrl();
        C38427a c38427a = new C38427a(sectionTitle, articleUrl != null ? articleUrl : "", helpCenterLandingBffDto.getBrowseAllSection().getTitle(), m126488f(helpCenterLandingBffDto.getBrowseAllSection().getQuestionType()));
        String title2 = helpCenterLandingBffDto.getNeedMoreHelpSection().getTitle();
        String messageUsButtonTitle = helpCenterLandingBffDto.getNeedMoreHelpSection().getMessageUsButtonTitle();
        String webFormUrl = helpCenterLandingBffDto.getNeedMoreHelpSection().getWebFormUrl();
        String supportType = helpCenterLandingBffDto.getNeedMoreHelpSection().getSupportType();
        EnumC38434h enumC38434h2 = EnumC38434h.WHOOP_COACH;
        EnumC38434h[] enumC38434hArrValues = EnumC38434h.values();
        int length = enumC38434hArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC38434h = null;
                break;
            }
            enumC38434h = enumC38434hArrValues[i13];
            if (AbstractC22676k.m65745e(enumC38434h.name(), supportType)) {
                break;
            }
            i13++;
        }
        C38433g c38433g = new C38433g(title2, messageUsButtonTitle, webFormUrl, enumC38434h == null ? enumC38434h2 : enumC38434h, helpCenterLandingBffDto.getNeedMoreHelpSection().getAiAction());
        DesignSystemModel callTile = helpCenterLandingBffDto.getCallTile();
        if (callTile != null) {
            InterfaceC25312u interfaceC25312uM60544l = reducer.m60544l(callTile);
            c4092p2 = interfaceC25312uM60544l instanceof C4092p2 ? (C4092p2) interfaceC25312uM60544l : null;
        } else {
            c4092p2 = null;
        }
        CallSectionDto callSection = helpCenterLandingBffDto.getCallSection();
        return new C38431e(iM126487e, iM126487e2, header, pageTitle, c38430d, c38427a, c38433g, c4092p2, callSection != null ? m126489g(callSection) : null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C38431e m126485c(HelpCenterLandingBffDto helpCenterLandingBffDto, C21535a c21535a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21535a = AbstractC21537c.m60554d(new C39389a(28));
        }
        return m126484b(helpCenterLandingBffDto, c21535a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m126486d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: e */
    private static final int m126487e(String str) {
        for (EnumC16313m0 enumC16313m0 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m0.name(), str)) {
                return enumC16313m0 != null ? enumC16313m0.toWhoopIcon() : C38072d.f163053a.m121951d().getLogo().getWhoop();
            }
        }
        enumC16313m0 = null;
        if (enumC16313m0 != null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    /* JADX INFO: renamed from: f */
    private static final EnumC38432f m126488f(String str) {
        for (EnumC38432f enumC38432f : EnumC38432f.values()) {
            if (AbstractC22676k.m65745e(enumC38432f.name(), str)) {
                if (enumC38432f == null) {
                    return EnumC38432f.UNKNOWN;
                }
                return enumC38432f;
            }
        }
        enumC38432f = null;
        if (enumC38432f == null) {
            return EnumC38432f.UNKNOWN;
        }
        return enumC38432f;
    }

    /* JADX INFO: renamed from: g */
    private static final C38428b m126489g(CallSectionDto callSectionDto) {
        Action action;
        String buttonTitle = callSectionDto.getButtonTitle();
        if (buttonTitle == null || (action = callSectionDto.getAction()) == null) {
            return null;
        }
        return new C38428b(buttonTitle, callSectionDto.getCaption(), action);
    }
}
