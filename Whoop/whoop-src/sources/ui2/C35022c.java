package ui2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hc3.AbstractC17176i;
import i51.C18112i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33194k1;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: ui2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b:\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b&\u0010BR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b8\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b(\u0010E\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b6\u0010F\u001a\u0004\b2\u0010G¨\u0006H"}, m65681d2 = {"Lui2/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lv41/r0;", "lottieWrapper", "Lkd1/o;", "image", "Li51/i;", "celebrationMedia", "Lsz0/k1;", "titleSubtitle", "streakValue", "streakSubtitle", "Lui2/a;", "streakState", "Ly81/f;", "streakTextColor", "Lui2/b;", "backgroundType", "", "Lm91/u;", "items", "", "headerIcon", "Lcom/whoop/navigation/e;", "headerIconDestination", "<init>", "(Lcom/whoop/design/util/TextResource;Lv41/r0;Lkd1/o;Li51/i;Lsz0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lui2/a;Ly81/f;Lui2/b;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "b", "Lv41/r0;", "g", "()Lv41/r0;", "c", "Lkd1/o;", "e", "()Lkd1/o;", "d", "Li51/i;", "()Li51/i;", "Lsz0/k1;", "m", "()Lsz0/k1;", "f", "k", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lui2/a;", "()Lui2/a;", "Ly81/f;", "j", "()Ly81/f;", "Lui2/b;", "()Lui2/b;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35022c {

    /* JADX INFO: renamed from: n */
    public static final int f148189n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18112i celebrationMedia;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33194k1 titleSubtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource streakValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource streakSubtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC35020a streakState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f streakTextColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC35021b backgroundType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String headerIcon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C9598e headerIconDestination;

    /* JADX WARN: Multi-variable type inference failed */
    public C35022c(TextResource title, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, C18112i c18112i, C33194k1 c33194k1, TextResource streakValue, TextResource streakSubtitle, EnumC35020a enumC35020a, EnumC39333f streakTextColor, EnumC35021b backgroundType, List<? extends InterfaceC25312u> items, String str, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakSubtitle, "streakSubtitle");
        AbstractC22676k.m65750j(streakTextColor, "streakTextColor");
        AbstractC22676k.m65750j(backgroundType, "backgroundType");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.lottieWrapper = interfaceC35689r0;
        this.image = abstractC22403o;
        this.celebrationMedia = c18112i;
        this.titleSubtitle = c33194k1;
        this.streakValue = streakValue;
        this.streakSubtitle = streakSubtitle;
        this.streakState = enumC35020a;
        this.streakTextColor = streakTextColor;
        this.backgroundType = backgroundType;
        this.items = items;
        this.headerIcon = str;
        this.headerIconDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC35021b getBackgroundType() {
        return this.backgroundType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18112i getCelebrationMedia() {
        return this.celebrationMedia;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C9598e getHeaderIconDestination() {
        return this.headerIconDestination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35022c)) {
            return false;
        }
        C35022c c35022c = (C35022c) other;
        return AbstractC22676k.m65745e(this.title, c35022c.title) && AbstractC22676k.m65745e(this.lottieWrapper, c35022c.lottieWrapper) && AbstractC22676k.m65745e(this.image, c35022c.image) && AbstractC22676k.m65745e(this.celebrationMedia, c35022c.celebrationMedia) && AbstractC22676k.m65745e(this.titleSubtitle, c35022c.titleSubtitle) && AbstractC22676k.m65745e(this.streakValue, c35022c.streakValue) && AbstractC22676k.m65745e(this.streakSubtitle, c35022c.streakSubtitle) && this.streakState == c35022c.streakState && this.streakTextColor == c35022c.streakTextColor && this.backgroundType == c35022c.backgroundType && AbstractC22676k.m65745e(this.items, c35022c.items) && AbstractC22676k.m65745e(this.headerIcon, c35022c.headerIcon) && AbstractC22676k.m65745e(this.headerIconDestination, c35022c.headerIconDestination);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m110688f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC35020a getStreakState() {
        return this.streakState;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        int iHashCode2 = (iHashCode + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C18112i c18112i = this.celebrationMedia;
        int iHashCode4 = (iHashCode3 + (c18112i == null ? 0 : c18112i.hashCode())) * 31;
        C33194k1 c33194k1 = this.titleSubtitle;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode4 + (c33194k1 == null ? 0 : c33194k1.hashCode())) * 31, this.streakValue, 31), this.streakSubtitle, 31);
        EnumC35020a enumC35020a = this.streakState;
        int iM31983b = AbstractC11895b.m31983b((this.backgroundType.hashCode() + AbstractC21702c.m61132c(this.streakTextColor, (iM95625a + (enumC35020a == null ? 0 : enumC35020a.hashCode())) * 31, 31)) * 31, 31, this.items);
        String str = this.headerIcon;
        int iHashCode5 = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.headerIconDestination;
        return iHashCode5 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getStreakSubtitle() {
        return this.streakSubtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC39333f getStreakTextColor() {
        return this.streakTextColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getStreakValue() {
        return this.streakValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C33194k1 getTitleSubtitle() {
        return this.titleSubtitle;
    }

    public String toString() {
        TextResource textResource = this.title;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        AbstractC22403o abstractC22403o = this.image;
        C18112i c18112i = this.celebrationMedia;
        C33194k1 c33194k1 = this.titleSubtitle;
        TextResource textResource2 = this.streakValue;
        TextResource textResource3 = this.streakSubtitle;
        EnumC35020a enumC35020a = this.streakState;
        EnumC39333f enumC39333f = this.streakTextColor;
        EnumC35021b enumC35021b = this.backgroundType;
        List<InterfaceC25312u> list = this.items;
        String str = this.headerIcon;
        C9598e c9598e = this.headerIconDestination;
        StringBuilder sb4 = new StringBuilder("StreaksViewData(title=");
        sb4.append(textResource);
        sb4.append(", lottieWrapper=");
        sb4.append(interfaceC35689r0);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", celebrationMedia=");
        sb4.append(c18112i);
        sb4.append(", titleSubtitle=");
        sb4.append(c33194k1);
        sb4.append(", streakValue=");
        sb4.append(textResource2);
        sb4.append(", streakSubtitle=");
        sb4.append(textResource3);
        sb4.append(", streakState=");
        sb4.append(enumC35020a);
        sb4.append(", streakTextColor=");
        sb4.append(enumC39333f);
        sb4.append(", backgroundType=");
        sb4.append(enumC35021b);
        sb4.append(", items=");
        AbstractC17176i.m48511m(", headerIcon=", str, ", headerIconDestination=", sb4, list);
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public /* synthetic */ C35022c(TextResource textResource, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, C18112i c18112i, C33194k1 c33194k1, TextResource textResource2, TextResource textResource3, EnumC35020a enumC35020a, EnumC39333f enumC39333f, EnumC35021b enumC35021b, List list, String str, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, interfaceC35689r0, abstractC22403o, (i13 & 8) != 0 ? null : c18112i, (i13 & 16) != 0 ? null : c33194k1, textResource2, textResource3, enumC35020a, enumC39333f, enumC35021b, list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str, (i13 & 4096) != 0 ? null : c9598e);
    }
}
