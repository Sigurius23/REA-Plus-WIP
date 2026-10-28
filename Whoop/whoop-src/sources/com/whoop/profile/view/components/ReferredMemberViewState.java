package com.whoop.profile.view.components;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\f¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/view/components/ReferredMemberViewState;", "", "", "name", "Lkd1/o;", "avatar", "", "endIcon", "subtitle", "<init>", "(Ljava/lang/String;Lkd1/o;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkd1/o;", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Lkd1/o;ILjava/lang/String;)Lcom/whoop/profile/view/components/ReferredMemberViewState;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lkd1/o;", "getAvatar", "I", "getEndIcon", "getSubtitle", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferredMemberViewState {
    public static final int $stable = AbstractC22403o.f87638a;
    private final AbstractC22403o avatar;
    private final int endIcon;
    private final String name;
    private final String subtitle;

    public ReferredMemberViewState(String name, AbstractC22403o avatar, int i13, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatar, "avatar");
        this.name = name;
        this.avatar = avatar;
        this.endIcon = i13;
        this.subtitle = str;
    }

    public static /* synthetic */ ReferredMemberViewState copy$default(ReferredMemberViewState referredMemberViewState, String str, AbstractC22403o abstractC22403o, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = referredMemberViewState.name;
        }
        if ((i14 & 2) != 0) {
            abstractC22403o = referredMemberViewState.avatar;
        }
        if ((i14 & 4) != 0) {
            i13 = referredMemberViewState.endIcon;
        }
        if ((i14 & 8) != 0) {
            str2 = referredMemberViewState.subtitle;
        }
        return referredMemberViewState.copy(str, abstractC22403o, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ReferredMemberViewState copy(String name, AbstractC22403o avatar, int endIcon, String subtitle) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatar, "avatar");
        return new ReferredMemberViewState(name, avatar, endIcon, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferredMemberViewState)) {
            return false;
        }
        ReferredMemberViewState referredMemberViewState = (ReferredMemberViewState) other;
        return AbstractC22676k.m65745e(this.name, referredMemberViewState.name) && AbstractC22676k.m65745e(this.avatar, referredMemberViewState.avatar) && this.endIcon == referredMemberViewState.endIcon && AbstractC22676k.m65745e(this.subtitle, referredMemberViewState.subtitle);
    }

    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    public final int getEndIcon() {
        return this.endIcon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.endIcon, AbstractC30007c.m91833c(this.avatar, this.name.hashCode() * 31, 31), 31);
        String str = this.subtitle;
        return iM30448b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.name;
        AbstractC22403o abstractC22403o = this.avatar;
        int i13 = this.endIcon;
        String str2 = this.subtitle;
        StringBuilder sb4 = new StringBuilder("ReferredMemberViewState(name=");
        sb4.append(str);
        sb4.append(", avatar=");
        sb4.append(abstractC22403o);
        sb4.append(", endIcon=");
        return AbstractC38963t7.m124376f(i13, ", subtitle=", str2, ")", sb4);
    }

    public /* synthetic */ ReferredMemberViewState(String str, AbstractC22403o abstractC22403o, int i13, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abstractC22403o, i13, (i14 & 8) != 0 ? null : str2);
    }
}
