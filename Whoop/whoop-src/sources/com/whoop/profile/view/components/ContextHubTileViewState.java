package com.whoop.profile.view.components;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, m65681d2 = {"Lcom/whoop/profile/view/components/ContextHubTileViewState;", "Lm91/u;", "", "id", "title", "Lgz0/m0;", "endIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lgz0/m0;", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/ContextHubTileViewState;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lgz0/m0;", "getEndIcon", "Lcom/whoop/navigation/e;", "getDestination", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ContextHubTileViewState implements InterfaceC25312u {
    public static final int $stable = C9598e.f28134d;
    private final C9598e destination;
    private final EnumC16313m0 endIcon;
    private final String id;
    private final String title;

    public ContextHubTileViewState(String id4, String title, EnumC16313m0 enumC16313m0, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.title = title;
        this.endIcon = enumC16313m0;
        this.destination = c9598e;
    }

    public static /* synthetic */ ContextHubTileViewState copy$default(ContextHubTileViewState contextHubTileViewState, String str, String str2, EnumC16313m0 enumC16313m0, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextHubTileViewState.id;
        }
        if ((i13 & 2) != 0) {
            str2 = contextHubTileViewState.title;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = contextHubTileViewState.endIcon;
        }
        if ((i13 & 8) != 0) {
            c9598e = contextHubTileViewState.destination;
        }
        return contextHubTileViewState.copy(str, str2, enumC16313m0, c9598e);
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
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ContextHubTileViewState copy(String id4, String title, EnumC16313m0 endIcon, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        return new ContextHubTileViewState(id4, title, endIcon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextHubTileViewState)) {
            return false;
        }
        ContextHubTileViewState contextHubTileViewState = (ContextHubTileViewState) other;
        return AbstractC22676k.m65745e(this.id, contextHubTileViewState.id) && AbstractC22676k.m65745e(this.title, contextHubTileViewState.title) && this.endIcon == contextHubTileViewState.endIcon && AbstractC22676k.m65745e(this.destination, contextHubTileViewState.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    @Override // p720m91.InterfaceC25312u
    public /* bridge */ Object getEvent() {
        return super.getEvent();
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextHubTileViewState(id=", str, ", title=", str2, ", endIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
