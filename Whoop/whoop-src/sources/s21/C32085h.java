package s21;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: s21.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b.\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b4\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b8\u0010#R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\b>\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b?\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b,\u00107R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b>\u0010G\u001a\u0004\b@\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010I\u001a\u0004\b5\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bB\u0010K\u001a\u0004\b(\u0010LR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b=\u0010O¨\u0006P"}, m65681d2 = {"Ls21/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "id", "Lkd1/o;", "image", "cta", "Ly81/f;", "ctaColor", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "filledCount", "totalCount", "progressColor", "", "isUnlocked", "color", "Ls21/i;", "type", "navigationTag", "Ls21/a;", "dialogInfo", "Ls21/b;", "analytics", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/navigation/e;IILy81/f;ZLy81/f;Ls21/i;Lm91/u;Ls21/a;Ls21/b;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/lang/String;", "getId", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "e", "f", "Ly81/f;", "()Ly81/f;", "g", "Lcom/whoop/navigation/e;", "j", "()Lcom/whoop/navigation/e;", "I", "i", "n", "l", "k", "Z", "p", "()Z", "Ls21/i;", "o", "()Ls21/i;", "Lm91/u;", "()Lm91/u;", "Ls21/a;", "()Ls21/a;", "Ls21/b;", "()Ls21/b;", "q", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32085h implements InterfaceC25312u {

    /* JADX INFO: renamed from: r */
    public static final int f133051r = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource cta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f ctaColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int filledCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int totalCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f progressColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isUnlocked;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC32086i type;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC25312u navigationTag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C32078a dialogInfo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C32079b analytics;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C32085h(TextResource title, TextResource subtitle, String id4, AbstractC22403o image, TextResource cta, EnumC39333f enumC39333f, C9598e c9598e, int i13, int i14, EnumC39333f enumC39333f2, boolean z4, EnumC39333f enumC39333f3, EnumC32086i enumC32086i, InterfaceC25312u interfaceC25312u, C32078a c32078a, C32079b c32079b, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(cta, "cta");
        this.title = title;
        this.subtitle = subtitle;
        this.id = id4;
        this.image = image;
        this.cta = cta;
        this.ctaColor = enumC39333f;
        this.navigation = c9598e;
        this.filledCount = i13;
        this.totalCount = i14;
        this.progressColor = enumC39333f2;
        this.isUnlocked = z4;
        this.color = enumC39333f3;
        this.type = enumC32086i;
        this.navigationTag = interfaceC25312u;
        this.dialogInfo = c32078a;
        this.analytics = c32079b;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32079b getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getCtaColor() {
        return this.ctaColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32085h)) {
            return false;
        }
        C32085h c32085h = (C32085h) other;
        return AbstractC22676k.m65745e(this.title, c32085h.title) && AbstractC22676k.m65745e(this.subtitle, c32085h.subtitle) && AbstractC22676k.m65745e(this.id, c32085h.id) && AbstractC22676k.m65745e(this.image, c32085h.image) && AbstractC22676k.m65745e(this.cta, c32085h.cta) && this.ctaColor == c32085h.ctaColor && AbstractC22676k.m65745e(this.navigation, c32085h.navigation) && this.filledCount == c32085h.filledCount && this.totalCount == c32085h.totalCount && this.progressColor == c32085h.progressColor && this.isUnlocked == c32085h.isUnlocked && this.color == c32085h.color && this.type == c32085h.type && AbstractC22676k.m65745e(this.navigationTag, c32085h.navigationTag) && AbstractC22676k.m65745e(this.dialogInfo, c32085h.dialogInfo) && AbstractC22676k.m65745e(this.analytics, c32085h.analytics) && AbstractC22676k.m65745e(this.interaction, c32085h.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C32078a getDialogInfo() {
        return this.dialogInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getFilledCount() {
        return this.filledCount;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.image, AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.id), 31), this.cta, 31);
        EnumC39333f enumC39333f = this.ctaColor;
        int iHashCode = (iM95625a + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iM30448b = AbstractC11266d.m30448b(this.totalCount, AbstractC11266d.m30448b(this.filledCount, (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31), 31);
        EnumC39333f enumC39333f2 = this.progressColor;
        int iM8289b = AbstractC2875y.m8289b((iM30448b + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31, 31, this.isUnlocked);
        EnumC39333f enumC39333f3 = this.color;
        int iHashCode2 = (iM8289b + (enumC39333f3 == null ? 0 : enumC39333f3.hashCode())) * 31;
        EnumC32086i enumC32086i = this.type;
        int iHashCode3 = (iHashCode2 + (enumC32086i == null ? 0 : enumC32086i.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.navigationTag;
        int iHashCode4 = (iHashCode3 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        C32078a c32078a = this.dialogInfo;
        int iHashCode5 = (iHashCode4 + (c32078a == null ? 0 : c32078a.hashCode())) * 31;
        C32079b c32079b = this.analytics;
        int iHashCode6 = (iHashCode5 + (c32079b == null ? 0 : c32079b.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode6 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC25312u getNavigationTag() {
        return this.navigationTag;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC39333f getProgressColor() {
        return this.progressColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final EnumC32086i getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsUnlocked() {
        return this.isUnlocked;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.id;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource3 = this.cta;
        EnumC39333f enumC39333f = this.ctaColor;
        C9598e c9598e = this.navigation;
        int i13 = this.filledCount;
        int i14 = this.totalCount;
        EnumC39333f enumC39333f2 = this.progressColor;
        boolean z4 = this.isUnlocked;
        EnumC39333f enumC39333f3 = this.color;
        EnumC32086i enumC32086i = this.type;
        InterfaceC25312u interfaceC25312u = this.navigationTag;
        C32078a c32078a = this.dialogInfo;
        C32079b c32079b = this.analytics;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MilestoneCardViewState(title=", textResource, ", subtitle=", textResource2, ", id=");
        sbM106658q.append(str);
        sbM106658q.append(", image=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", cta=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", navigation=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", filledCount=");
        sbM106658q.append(i13);
        sbM106658q.append(", totalCount=");
        sbM106658q.append(i14);
        sbM106658q.append(", progressColor=");
        sbM106658q.append(enumC39333f2);
        sbM106658q.append(", isUnlocked=");
        sbM106658q.append(z4);
        sbM106658q.append(", color=");
        sbM106658q.append(enumC39333f3);
        sbM106658q.append(", type=");
        sbM106658q.append(enumC32086i);
        sbM106658q.append(", navigationTag=");
        sbM106658q.append(interfaceC25312u);
        sbM106658q.append(", dialogInfo=");
        sbM106658q.append(c32078a);
        sbM106658q.append(", analytics=");
        sbM106658q.append(c32079b);
        sbM106658q.append(", interaction=");
        return AbstractC26725a.m79506j(sbM106658q, genericInteraction, ")");
    }

    public /* synthetic */ C32085h(TextResource textResource, TextResource textResource2, String str, AbstractC22403o abstractC22403o, TextResource textResource3, EnumC39333f enumC39333f, C9598e c9598e, int i13, int i14, EnumC39333f enumC39333f2, boolean z4, EnumC39333f enumC39333f3, EnumC32086i enumC32086i, InterfaceC25312u interfaceC25312u, C32078a c32078a, C32079b c32079b, GenericInteraction genericInteraction, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, abstractC22403o, textResource3, (i15 & 32) != 0 ? null : enumC39333f, (i15 & 64) != 0 ? null : c9598e, i13, i14, (i15 & 512) != 0 ? null : enumC39333f2, z4, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC39333f.WHITE_10 : enumC39333f3, (i15 & 4096) != 0 ? null : enumC32086i, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : interfaceC25312u, c32078a, (32768 & i15) != 0 ? null : c32079b, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : genericInteraction);
    }
}
