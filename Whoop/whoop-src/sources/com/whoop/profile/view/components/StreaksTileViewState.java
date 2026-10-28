package com.whoop.profile.view.components;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import v41.InterfaceC35689r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001b¨\u00063"}, m65681d2 = {"Lcom/whoop/profile/view/components/StreaksTileViewState;", "Lm91/u;", "", "id", "title", "subtitle", "Lv41/r0;", "lottieUrl", "Lkd1/o;", "image", "Lgz0/m0;", "endIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lv41/r0;", "component5", "()Lkd1/o;", "component6", "()Lgz0/m0;", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/StreaksTileViewState;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Lv41/r0;", "getLottieUrl", "Lkd1/o;", "getImage", "Lgz0/m0;", "getEndIcon", "Lcom/whoop/navigation/e;", "getDestination", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StreaksTileViewState implements InterfaceC25312u {
    public static final int $stable = 8;
    private final C9598e destination;
    private final EnumC16313m0 endIcon;
    private final String id;
    private final AbstractC22403o image;
    private final InterfaceC35689r0 lottieUrl;
    private final String subtitle;
    private final String title;

    public StreaksTileViewState(String id4, String title, String subtitle, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.title = title;
        this.subtitle = subtitle;
        this.lottieUrl = interfaceC35689r0;
        this.image = abstractC22403o;
        this.endIcon = enumC16313m0;
        this.destination = c9598e;
    }

    public static /* synthetic */ StreaksTileViewState copy$default(StreaksTileViewState streaksTileViewState, String str, String str2, String str3, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m0, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = streaksTileViewState.id;
        }
        if ((i13 & 2) != 0) {
            str2 = streaksTileViewState.title;
        }
        if ((i13 & 4) != 0) {
            str3 = streaksTileViewState.subtitle;
        }
        if ((i13 & 8) != 0) {
            interfaceC35689r0 = streaksTileViewState.lottieUrl;
        }
        if ((i13 & 16) != 0) {
            abstractC22403o = streaksTileViewState.image;
        }
        if ((i13 & 32) != 0) {
            enumC16313m0 = streaksTileViewState.endIcon;
        }
        if ((i13 & 64) != 0) {
            c9598e = streaksTileViewState.destination;
        }
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        C9598e c9598e2 = c9598e;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        String str4 = str3;
        return streaksTileViewState.copy(str, str2, str4, interfaceC35689r0, abstractC22403o2, enumC16313m1, c9598e2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InterfaceC35689r0 getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final StreaksTileViewState copy(String id4, String title, String subtitle, InterfaceC35689r0 lottieUrl, AbstractC22403o image, EnumC16313m0 endIcon, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new StreaksTileViewState(id4, title, subtitle, lottieUrl, image, endIcon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreaksTileViewState)) {
            return false;
        }
        StreaksTileViewState streaksTileViewState = (StreaksTileViewState) other;
        return AbstractC22676k.m65745e(this.id, streaksTileViewState.id) && AbstractC22676k.m65745e(this.title, streaksTileViewState.title) && AbstractC22676k.m65745e(this.subtitle, streaksTileViewState.subtitle) && AbstractC22676k.m65745e(this.lottieUrl, streaksTileViewState.lottieUrl) && AbstractC22676k.m65745e(this.image, streaksTileViewState.image) && this.endIcon == streaksTileViewState.endIcon && AbstractC22676k.m65745e(this.destination, streaksTileViewState.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent */
    public /* bridge */ Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return super.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
    }

    public final String getId() {
        return this.id;
    }

    public final AbstractC22403o getImage() {
        return this.image;
    }

    public final InterfaceC35689r0 getLottieUrl() {
        return this.lottieUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle);
        InterfaceC35689r0 interfaceC35689r0 = this.lottieUrl;
        int iHashCode = (iM30450d + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieUrl;
        AbstractC22403o abstractC22403o = this.image;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StreaksTileViewState(id=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", lottieUrl=");
        sbM32001t.append(interfaceC35689r0);
        sbM32001t.append(", image=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", endIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }
}
