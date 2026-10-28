package u01;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m83.AbstractC25260n;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: u01.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J)\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b5\u0010=R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010=R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u00108R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bE\u00108R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\bF\u00108R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010M\u001a\u0004\bP\u0010OR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bQ\u0010OR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b>\u0010TR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u0010M\u001a\u0004\b9\u0010OR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\b2\u0010WR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bD\u0010ZR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b@\u0010]R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b^\u0010\\\u001a\u0004\bR\u0010]R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020/0\u00198F¢\u0006\u0006\u001a\u0004\bB\u0010WR\u0016\u0010a\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010`R\u0016\u0010b\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010`R\u0016\u0010c\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010`¨\u0006d"}, m65681d2 = {"Lu01/e;", "Lm91/u;", "Lm91/n;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "noDataLabel", "Lkd1/o;", "avatar", "streak", "streakImage", "recoveryScore", "recoveryLabel", "dayStrain", "strainLabel", "sleepScore", "sleepLabel", "Ly81/f;", "recoveryColor", "strainColor", "sleepColor", "Lu01/a;", "backgroundStyle", "avatarRingColor", "", "activityIcons", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "titleInteraction", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;Lu01/a;Ly81/f;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "value", "label", "valueColor", "Lu01/f;", "q", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)Lu01/f;", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "c", "i", "d", "Lkd1/o;", "()Lkd1/o;", "e", "m", "f", "n", "g", "getRecoveryScore", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getRecoveryLabel", "getDayStrain", "j", "getStrainLabel", "k", "getSleepScore", "l", "getSleepLabel", "Ly81/f;", "getRecoveryColor", "()Ly81/f;", "getStrainColor", "getSleepColor", "p", "Lu01/a;", "()Lu01/a;", "r", "Ljava/util/List;", "()Ljava/util/List;", "s", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "t", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "u", "metrics", "()Lu01/f;", "recoveryMetric", "strainMetric", "sleepMetric", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34383e implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource noDataLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource streak;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o streakImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource recoveryScore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource recoveryLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource dayStrain;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource strainLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource sleepScore;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource sleepLabel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC39333f recoveryColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC39333f strainColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC39333f sleepColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final EnumC34379a backgroundStyle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC39333f avatarRingColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<AbstractC22403o> activityIcons;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final GenericInteraction titleInteraction;

    /* JADX WARN: Multi-variable type inference failed */
    public C34383e(String id4, TextResource title, TextResource textResource, AbstractC22403o abstractC22403o, TextResource streak, AbstractC22403o abstractC22403o2, TextResource recoveryScore, TextResource recoveryLabel, TextResource dayStrain, TextResource strainLabel, TextResource sleepScore, TextResource sleepLabel, EnumC39333f recoveryColor, EnumC39333f strainColor, EnumC39333f sleepColor, EnumC34379a backgroundStyle, EnumC39333f enumC39333f, List<? extends AbstractC22403o> activityIcons, C9598e c9598e, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(streak, "streak");
        AbstractC22676k.m65750j(recoveryScore, "recoveryScore");
        AbstractC22676k.m65750j(recoveryLabel, "recoveryLabel");
        AbstractC22676k.m65750j(dayStrain, "dayStrain");
        AbstractC22676k.m65750j(strainLabel, "strainLabel");
        AbstractC22676k.m65750j(sleepScore, "sleepScore");
        AbstractC22676k.m65750j(sleepLabel, "sleepLabel");
        AbstractC22676k.m65750j(recoveryColor, "recoveryColor");
        AbstractC22676k.m65750j(strainColor, "strainColor");
        AbstractC22676k.m65750j(sleepColor, "sleepColor");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(activityIcons, "activityIcons");
        this.id = id4;
        this.title = title;
        this.noDataLabel = textResource;
        this.avatar = abstractC22403o;
        this.streak = streak;
        this.streakImage = abstractC22403o2;
        this.recoveryScore = recoveryScore;
        this.recoveryLabel = recoveryLabel;
        this.dayStrain = dayStrain;
        this.strainLabel = strainLabel;
        this.sleepScore = sleepScore;
        this.sleepLabel = sleepLabel;
        this.recoveryColor = recoveryColor;
        this.strainColor = strainColor;
        this.sleepColor = sleepColor;
        this.backgroundStyle = backgroundStyle;
        this.avatarRingColor = enumC39333f;
        this.activityIcons = activityIcons;
        this.navigation = c9598e;
        this.interaction = genericInteraction;
        this.titleInteraction = genericInteraction2;
    }

    /* JADX INFO: renamed from: j */
    private final C34384f m108710j() {
        return m108713q(this.recoveryScore, this.recoveryLabel, this.recoveryColor);
    }

    /* JADX INFO: renamed from: k */
    private final C34384f m108711k() {
        return m108713q(this.sleepScore, this.sleepLabel, this.sleepColor);
    }

    /* JADX INFO: renamed from: l */
    private final C34384f m108712l() {
        return m108713q(this.dayStrain, this.strainLabel, this.strainColor);
    }

    /* JADX INFO: renamed from: q */
    private final C34384f m108713q(TextResource value, TextResource label, EnumC39333f valueColor) {
        C34384f c34384f = new C34384f(value, label, valueColor);
        if (AbstractC8693b.m21270d(value) && AbstractC8693b.m21270d(label)) {
            return c34384f;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final List<AbstractC22403o> m108714a() {
        return this.activityIcons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getAvatarRingColor() {
        return this.avatarRingColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC34379a getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34383e)) {
            return false;
        }
        C34383e c34383e = (C34383e) other;
        return AbstractC22676k.m65745e(this.id, c34383e.id) && AbstractC22676k.m65745e(this.title, c34383e.title) && AbstractC22676k.m65745e(this.noDataLabel, c34383e.noDataLabel) && AbstractC22676k.m65745e(this.avatar, c34383e.avatar) && AbstractC22676k.m65745e(this.streak, c34383e.streak) && AbstractC22676k.m65745e(this.streakImage, c34383e.streakImage) && AbstractC22676k.m65745e(this.recoveryScore, c34383e.recoveryScore) && AbstractC22676k.m65745e(this.recoveryLabel, c34383e.recoveryLabel) && AbstractC22676k.m65745e(this.dayStrain, c34383e.dayStrain) && AbstractC22676k.m65745e(this.strainLabel, c34383e.strainLabel) && AbstractC22676k.m65745e(this.sleepScore, c34383e.sleepScore) && AbstractC22676k.m65745e(this.sleepLabel, c34383e.sleepLabel) && this.recoveryColor == c34383e.recoveryColor && this.strainColor == c34383e.strainColor && this.sleepColor == c34383e.sleepColor && this.backgroundStyle == c34383e.backgroundStyle && this.avatarRingColor == c34383e.avatarRingColor && AbstractC22676k.m65745e(this.activityIcons, c34383e.activityIcons) && AbstractC22676k.m65745e(this.navigation, c34383e.navigation) && AbstractC22676k.m65745e(this.interaction, c34383e.interaction) && AbstractC22676k.m65745e(this.titleInteraction, c34383e.titleInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: g */
    public final List<C34384f> m108719g() {
        return AbstractC25260n.m74077r0(new C34384f[]{m108711k(), m108710j(), m108712l()});
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        TextResource textResource = this.noDataLabel;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.avatar;
        int iM95625a2 = AbstractC31061c.m95625a((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.streak, 31);
        AbstractC22403o abstractC22403o2 = this.streakImage;
        int iHashCode2 = (this.backgroundStyle.hashCode() + AbstractC21702c.m61132c(this.sleepColor, AbstractC21702c.m61132c(this.strainColor, AbstractC21702c.m61132c(this.recoveryColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a2 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31, this.recoveryScore, 31), this.recoveryLabel, 31), this.dayStrain, 31), this.strainLabel, 31), this.sleepScore, 31), this.sleepLabel, 31), 31), 31), 31)) * 31;
        EnumC39333f enumC39333f = this.avatarRingColor;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.activityIcons);
        C9598e c9598e = this.navigation;
        int iHashCode3 = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.titleInteraction;
        return iHashCode4 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getNoDataLabel() {
        return this.noDataLabel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getStreak() {
        return this.streak;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC22403o getStreakImage() {
        return this.streakImage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final GenericInteraction getTitleInteraction() {
        return this.titleInteraction;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.noDataLabel;
        AbstractC22403o abstractC22403o = this.avatar;
        TextResource textResource3 = this.streak;
        AbstractC22403o abstractC22403o2 = this.streakImage;
        TextResource textResource4 = this.recoveryScore;
        TextResource textResource5 = this.recoveryLabel;
        TextResource textResource6 = this.dayStrain;
        TextResource textResource7 = this.strainLabel;
        TextResource textResource8 = this.sleepScore;
        TextResource textResource9 = this.sleepLabel;
        EnumC39333f enumC39333f = this.recoveryColor;
        EnumC39333f enumC39333f2 = this.strainColor;
        EnumC39333f enumC39333f3 = this.sleepColor;
        EnumC34379a enumC34379a = this.backgroundStyle;
        EnumC39333f enumC39333f4 = this.avatarRingColor;
        List<AbstractC22403o> list = this.activityIcons;
        C9598e c9598e = this.navigation;
        GenericInteraction genericInteraction = this.interaction;
        GenericInteraction genericInteraction2 = this.titleInteraction;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("CommunityFollowerCardState(id=", str, ", title=", textResource, ", noDataLabel=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", avatar=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", streak=");
        sbM91847q.append(textResource3);
        sbM91847q.append(", streakImage=");
        sbM91847q.append(abstractC22403o2);
        sbM91847q.append(", recoveryScore=");
        AbstractC30007c.m91855y(sbM91847q, textResource4, ", recoveryLabel=", textResource5, ", dayStrain=");
        AbstractC30007c.m91855y(sbM91847q, textResource6, ", strainLabel=", textResource7, ", sleepScore=");
        AbstractC30007c.m91855y(sbM91847q, textResource8, ", sleepLabel=", textResource9, ", recoveryColor=");
        sbM91847q.append(enumC39333f);
        sbM91847q.append(", strainColor=");
        sbM91847q.append(enumC39333f2);
        sbM91847q.append(", sleepColor=");
        sbM91847q.append(enumC39333f3);
        sbM91847q.append(", backgroundStyle=");
        sbM91847q.append(enumC34379a);
        sbM91847q.append(", avatarRingColor=");
        sbM91847q.append(enumC39333f4);
        sbM91847q.append(", activityIcons=");
        sbM91847q.append(list);
        sbM91847q.append(", navigation=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", interaction=");
        sbM91847q.append(genericInteraction);
        sbM91847q.append(", titleInteraction=");
        return AbstractC26725a.m79506j(sbM91847q, genericInteraction2, ")");
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
