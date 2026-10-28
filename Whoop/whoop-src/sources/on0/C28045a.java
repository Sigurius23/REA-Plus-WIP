package on0;

import com.whoop.challengedetails.domain.models.ChallengeCardItem;
import com.whoop.challengedetails.domain.models.ChallengeDetailsResponse;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jn0.InterfaceC21799b;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import mn0.C25709c;
import nn0.C26864a;
import nn0.C26865b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: on0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lon0/a;", "", "<init>", "()V", "Ljn0/b;", "domainResult", "Lmn0/c;", "a", "(Ljn0/b;)Lmn0/c;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28045a {
    /* JADX INFO: renamed from: a */
    public final C25709c m84575a(InterfaceC21799b domainResult) {
        EnumC39333f enumC39333f;
        EnumC16313m0 enumC16313m0;
        InterfaceC21799b.c cVar;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof InterfaceC21799b.b) {
            return new C25709c(true, false, null, null, 14, null);
        }
        if (domainResult instanceof InterfaceC21799b.a) {
            return new C25709c(false, true, null, null, 13, null);
        }
        if (!(domainResult instanceof InterfaceC21799b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC21799b.c cVar2 = (InterfaceC21799b.c) domainResult;
        ChallengeDetailsResponse bffData = cVar2.getBffData();
        TextResource toolbarTitle = bffData.getToolbarTitle();
        AbstractC22403o.c cVar3 = new AbstractC22403o.c(bffData.getHeaderImageUrl(), 0, 0, 0, 14, null);
        boolean zIsMemberEligible = bffData.isMemberEligible();
        TextResource ineligibleText = bffData.getIneligibleText();
        TextResource challengeTitle = bffData.getChallengeTitle();
        List<ChallengeCardItem> challengeCardItems = bffData.getChallengeCardItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(challengeCardItems, 10));
        for (ChallengeCardItem challengeCardItem : challengeCardItems) {
            String icon = challengeCardItem.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.GOALS;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                enumC39333f = null;
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            String iconColor = challengeCardItem.getIconColor();
            EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHOOP_PRO;
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length2 = enumC39333fArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    cVar = cVar2;
                    break;
                }
                EnumC39333f enumC39333f3 = enumC39333fArrValues[i14];
                cVar = cVar2;
                if (AbstractC22676k.m65745e(enumC39333f3.name(), iconColor)) {
                    enumC39333f = enumC39333f3;
                    break;
                }
                i14++;
                cVar2 = cVar;
            }
            if (enumC39333f != null) {
                enumC39333f2 = enumC39333f;
            }
            arrayList.add(new C26865b(enumC16313m1, enumC39333f2, challengeCardItem.getText(), challengeCardItem.getSubText()));
            cVar2 = cVar;
        }
        return new C25709c(false, false, new C26864a(toolbarTitle, cVar3, zIsMemberEligible, ineligibleText, challengeTitle, arrayList, bffData.getDescriptionTitle(), bffData.getDescriptionText(), bffData.getCtaText(), bffData.getStyle(), bffData.getSavingText(), bffData.getSavingSubText()), cVar2.getJoinChallengeState());
    }
}
