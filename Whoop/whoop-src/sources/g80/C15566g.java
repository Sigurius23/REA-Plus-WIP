package g80;

import c31.C3927k;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import f70.C14201q0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import u80.C34631a;

/* JADX INFO: renamed from: g80.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b%\b\u0081\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010.R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b1\u00104R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b/\u0010=R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b8\u0010:¨\u0006?"}, m65681d2 = {"Lg80/g;", "", "", "currentStepIndex", "Lc31/k;", "progressButtonState", "", "Lm91/u;", "screens", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Lu80/a;", "countriesList", "statesList", "Lg80/c;", "navigationBarState", "footerButtons", "Lcom/whoop/activation/domain/models/FooterAlignment;", "footerAlignment", "", "shouldReserveBottomSpace", "Lf70/q0;", "memberInfo", "isProgressButtonLoading", "<init>", "(ILc31/k;Ljava/util/List;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/List;Ljava/util/List;Lg80/c;Ljava/util/List;Lcom/whoop/activation/domain/models/FooterAlignment;ZLf70/q0;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lc31/k;", "g", "()Lc31/k;", "c", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "d", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "e", "getCountriesList", "f", "getStatesList", "Lg80/c;", "()Lg80/c;", "i", "Lcom/whoop/activation/domain/models/FooterAlignment;", "()Lcom/whoop/activation/domain/models/FooterAlignment;", "j", "Z", "()Z", "k", "Lf70/q0;", "()Lf70/q0;", "l", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15566g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3927k progressButtonState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> screens;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ActivationFlowDestination currentDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C34631a> countriesList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C34631a> statesList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C15562c navigationBarState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footerButtons;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final FooterAlignment footerAlignment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean shouldReserveBottomSpace;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C14201q0 memberInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isProgressButtonLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public C15566g(int i13, C3927k c3927k, List<? extends InterfaceC25312u> screens, ActivationFlowDestination activationFlowDestination, List<C34631a> list, List<C34631a> list2, C15562c c15562c, List<? extends InterfaceC25312u> list3, FooterAlignment footerAlignment, boolean z4, C14201q0 memberInfo, boolean z13) {
        AbstractC22676k.m65750j(screens, "screens");
        AbstractC22676k.m65750j(memberInfo, "memberInfo");
        this.currentStepIndex = i13;
        this.progressButtonState = c3927k;
        this.screens = screens;
        this.currentDestination = activationFlowDestination;
        this.countriesList = list;
        this.statesList = list2;
        this.navigationBarState = c15562c;
        this.footerButtons = list3;
        this.footerAlignment = footerAlignment;
        this.shouldReserveBottomSpace = z4;
        this.memberInfo = memberInfo;
        this.isProgressButtonLoading = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ActivationFlowDestination getCurrentDestination() {
        return this.currentDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FooterAlignment getFooterAlignment() {
        return this.footerAlignment;
    }

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC25312u> m43835d() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C14201q0 getMemberInfo() {
        return this.memberInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15566g)) {
            return false;
        }
        C15566g c15566g = (C15566g) other;
        return this.currentStepIndex == c15566g.currentStepIndex && AbstractC22676k.m65745e(this.progressButtonState, c15566g.progressButtonState) && AbstractC22676k.m65745e(this.screens, c15566g.screens) && this.currentDestination == c15566g.currentDestination && AbstractC22676k.m65745e(this.countriesList, c15566g.countriesList) && AbstractC22676k.m65745e(this.statesList, c15566g.statesList) && AbstractC22676k.m65745e(this.navigationBarState, c15566g.navigationBarState) && AbstractC22676k.m65745e(this.footerButtons, c15566g.footerButtons) && this.footerAlignment == c15566g.footerAlignment && this.shouldReserveBottomSpace == c15566g.shouldReserveBottomSpace && AbstractC22676k.m65745e(this.memberInfo, c15566g.memberInfo) && this.isProgressButtonLoading == c15566g.isProgressButtonLoading;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C15562c getNavigationBarState() {
        return this.navigationBarState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C3927k getProgressButtonState() {
        return this.progressButtonState;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC25312u> m43839h() {
        return this.screens;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currentStepIndex) * 31;
        C3927k c3927k = this.progressButtonState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (c3927k == null ? 0 : c3927k.hashCode())) * 31, 31, this.screens);
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        int iHashCode2 = (iM31983b + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31;
        List<C34631a> list = this.countriesList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<C34631a> list2 = this.statesList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C15562c c15562c = this.navigationBarState;
        int iHashCode5 = (iHashCode4 + (c15562c == null ? 0 : c15562c.hashCode())) * 31;
        List<InterfaceC25312u> list3 = this.footerButtons;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FooterAlignment footerAlignment = this.footerAlignment;
        return Boolean.hashCode(this.isProgressButtonLoading) + ((this.memberInfo.hashCode() + AbstractC2875y.m8289b((iHashCode6 + (footerAlignment != null ? footerAlignment.hashCode() : 0)) * 31, 31, this.shouldReserveBottomSpace)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShouldReserveBottomSpace() {
        return this.shouldReserveBottomSpace;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsProgressButtonLoading() {
        return this.isProgressButtonLoading;
    }

    public String toString() {
        int i13 = this.currentStepIndex;
        C3927k c3927k = this.progressButtonState;
        List<InterfaceC25312u> list = this.screens;
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        List<C34631a> list2 = this.countriesList;
        List<C34631a> list3 = this.statesList;
        C15562c c15562c = this.navigationBarState;
        List<InterfaceC25312u> list4 = this.footerButtons;
        FooterAlignment footerAlignment = this.footerAlignment;
        boolean z4 = this.shouldReserveBottomSpace;
        C14201q0 c14201q0 = this.memberInfo;
        boolean z13 = this.isProgressButtonLoading;
        StringBuilder sb4 = new StringBuilder("BffScreenContainerState(currentStepIndex=");
        sb4.append(i13);
        sb4.append(", progressButtonState=");
        sb4.append(c3927k);
        sb4.append(", screens=");
        sb4.append(list);
        sb4.append(", currentDestination=");
        sb4.append(activationFlowDestination);
        sb4.append(", countriesList=");
        AbstractC21702c.m61148s(sb4, list2, ", statesList=", list3, ", navigationBarState=");
        sb4.append(c15562c);
        sb4.append(", footerButtons=");
        sb4.append(list4);
        sb4.append(", footerAlignment=");
        sb4.append(footerAlignment);
        sb4.append(", shouldReserveBottomSpace=");
        sb4.append(z4);
        sb4.append(", memberInfo=");
        sb4.append(c14201q0);
        sb4.append(", isProgressButtonLoading=");
        sb4.append(z13);
        sb4.append(")");
        return sb4.toString();
    }
}
