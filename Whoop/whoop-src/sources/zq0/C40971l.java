package zq0;

import com.whoop.communityeverydaystats.domain.models.SecurityPolicyModel;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m51.InterfaceC25079a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25288a0;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import xq0.EnumC38541a;

/* JADX INFO: renamed from: zq0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\b?\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\b+\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b1\u0010C\u001a\u0004\b4\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\b(\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b-\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bH\u0010J\u001a\u0004\b;\u0010K¨\u0006L"}, m65681d2 = {"Lzq0/l;", "Lm91/a0;", "", "id", "", "progressSegmentCount", "activeSegmentIndex", "Lcom/whoop/navigation/models/GenericInteraction;", "nextAction", "backAction", "Lkd1/o;", "backgroundImage", "", "photoRevealFraction", "", "Lm91/u;", "items", "headerOverlayItems", "footerOverlayItems", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "achievementBackgroundStyle", "Lm51/a;", "background", "Ly81/e;", "accentColor", "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "securityPolicy", "Lxq0/a;", "borderStyle", "<init>", "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkd1/o;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Ly81/e;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "I", "n", "c", "d", "Lcom/whoop/navigation/models/GenericInteraction;", "l", "()Lcom/whoop/navigation/models/GenericInteraction;", "e", "f", "Lkd1/o;", "g", "()Lkd1/o;", "F", "m", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "k", "()Ljava/util/List;", "i", "j", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "()Lcom/whoop/design/models/AchievementsBackgroundStyle;", "Lm51/a;", "()Lm51/a;", "Ly81/e;", "()Ly81/e;", "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "o", "()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;", "Lxq0/a;", "()Lxq0/a;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40971l implements InterfaceC25288a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int progressSegmentCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int activeSegmentIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction nextAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final GenericInteraction backAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float photoRevealFraction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<InterfaceC25312u> headerOverlayItems;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footerOverlayItems;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AchievementsBackgroundStyle achievementBackgroundStyle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC25079a background;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC39332e accentColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final SecurityPolicyModel securityPolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC38541a borderStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public C40971l(String id4, int i13, int i14, GenericInteraction nextAction, GenericInteraction genericInteraction, AbstractC22403o abstractC22403o, float f13, List<? extends InterfaceC25312u> items, List<? extends InterfaceC25312u> headerOverlayItems, List<? extends InterfaceC25312u> footerOverlayItems, AchievementsBackgroundStyle achievementsBackgroundStyle, InterfaceC25079a interfaceC25079a, InterfaceC39332e interfaceC39332e, SecurityPolicyModel securityPolicyModel, EnumC38541a borderStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(nextAction, "nextAction");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(headerOverlayItems, "headerOverlayItems");
        AbstractC22676k.m65750j(footerOverlayItems, "footerOverlayItems");
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        this.id = id4;
        this.progressSegmentCount = i13;
        this.activeSegmentIndex = i14;
        this.nextAction = nextAction;
        this.backAction = genericInteraction;
        this.backgroundImage = abstractC22403o;
        this.photoRevealFraction = f13;
        this.items = items;
        this.headerOverlayItems = headerOverlayItems;
        this.footerOverlayItems = footerOverlayItems;
        this.achievementBackgroundStyle = achievementsBackgroundStyle;
        this.background = interfaceC25079a;
        this.accentColor = interfaceC39332e;
        this.securityPolicy = securityPolicyModel;
        this.borderStyle = borderStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AchievementsBackgroundStyle getAchievementBackgroundStyle() {
        return this.achievementBackgroundStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getActiveSegmentIndex() {
        return this.activeSegmentIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final GenericInteraction getBackAction() {
        return this.backAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40971l)) {
            return false;
        }
        C40971l c40971l = (C40971l) other;
        return AbstractC22676k.m65745e(this.id, c40971l.id) && this.progressSegmentCount == c40971l.progressSegmentCount && this.activeSegmentIndex == c40971l.activeSegmentIndex && AbstractC22676k.m65745e(this.nextAction, c40971l.nextAction) && AbstractC22676k.m65745e(this.backAction, c40971l.backAction) && AbstractC22676k.m65745e(this.backgroundImage, c40971l.backgroundImage) && Float.compare(this.photoRevealFraction, c40971l.photoRevealFraction) == 0 && AbstractC22676k.m65745e(this.items, c40971l.items) && AbstractC22676k.m65745e(this.headerOverlayItems, c40971l.headerOverlayItems) && AbstractC22676k.m65745e(this.footerOverlayItems, c40971l.footerOverlayItems) && this.achievementBackgroundStyle == c40971l.achievementBackgroundStyle && AbstractC22676k.m65745e(this.background, c40971l.background) && AbstractC22676k.m65745e(this.accentColor, c40971l.accentColor) && AbstractC22676k.m65745e(this.securityPolicy, c40971l.securityPolicy) && this.borderStyle == c40971l.borderStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC25079a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC38541a getBorderStyle() {
        return this.borderStyle;
    }

    public int hashCode() {
        int iHashCode = (this.nextAction.hashCode() + AbstractC11266d.m30448b(this.activeSegmentIndex, AbstractC11266d.m30448b(this.progressSegmentCount, this.id.hashCode() * 31, 31), 31)) * 31;
        GenericInteraction genericInteraction = this.backAction;
        int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.photoRevealFraction, (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31), 31, this.items), 31, this.headerOverlayItems), 31, this.footerOverlayItems);
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        int iHashCode3 = (iM31983b + (achievementsBackgroundStyle == null ? 0 : achievementsBackgroundStyle.hashCode())) * 31;
        InterfaceC25079a interfaceC25079a = this.background;
        int iHashCode4 = (iHashCode3 + (interfaceC25079a == null ? 0 : interfaceC25079a.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.accentColor;
        int iHashCode5 = (iHashCode4 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        SecurityPolicyModel securityPolicyModel = this.securityPolicy;
        return this.borderStyle.hashCode() + ((iHashCode5 + (securityPolicyModel != null ? securityPolicyModel.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC25312u> m133007i() {
        return this.footerOverlayItems;
    }

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC25312u> m133008j() {
        return this.headerOverlayItems;
    }

    /* JADX INFO: renamed from: k */
    public final List<InterfaceC25312u> m133009k() {
        return this.items;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final GenericInteraction getNextAction() {
        return this.nextAction;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getPhotoRevealFraction() {
        return this.photoRevealFraction;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getProgressSegmentCount() {
        return this.progressSegmentCount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final SecurityPolicyModel getSecurityPolicy() {
        return this.securityPolicy;
    }

    public String toString() {
        String str = this.id;
        int i13 = this.progressSegmentCount;
        int i14 = this.activeSegmentIndex;
        GenericInteraction genericInteraction = this.nextAction;
        GenericInteraction genericInteraction2 = this.backAction;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        float f13 = this.photoRevealFraction;
        List<InterfaceC25312u> list = this.items;
        List<InterfaceC25312u> list2 = this.headerOverlayItems;
        List<InterfaceC25312u> list3 = this.footerOverlayItems;
        AchievementsBackgroundStyle achievementsBackgroundStyle = this.achievementBackgroundStyle;
        InterfaceC25079a interfaceC25079a = this.background;
        InterfaceC39332e interfaceC39332e = this.accentColor;
        SecurityPolicyModel securityPolicyModel = this.securityPolicy;
        EnumC38541a enumC38541a = this.borderStyle;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "CommunitySnapshotContainerState(id=", str, ", progressSegmentCount=", ", activeSegmentIndex=");
        sbM30467u.append(i14);
        sbM30467u.append(", nextAction=");
        sbM30467u.append(genericInteraction);
        sbM30467u.append(", backAction=");
        sbM30467u.append(genericInteraction2);
        sbM30467u.append(", backgroundImage=");
        sbM30467u.append(abstractC22403o);
        sbM30467u.append(", photoRevealFraction=");
        sbM30467u.append(f13);
        sbM30467u.append(", items=");
        sbM30467u.append(list);
        sbM30467u.append(", headerOverlayItems=");
        AbstractC21702c.m61148s(sbM30467u, list2, ", footerOverlayItems=", list3, ", achievementBackgroundStyle=");
        sbM30467u.append(achievementsBackgroundStyle);
        sbM30467u.append(", background=");
        sbM30467u.append(interfaceC25079a);
        sbM30467u.append(", accentColor=");
        sbM30467u.append(interfaceC39332e);
        sbM30467u.append(", securityPolicy=");
        sbM30467u.append(securityPolicyModel);
        sbM30467u.append(", borderStyle=");
        sbM30467u.append(enumC38541a);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
