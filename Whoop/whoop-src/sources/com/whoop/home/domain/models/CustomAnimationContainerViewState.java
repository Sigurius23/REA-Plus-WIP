package com.whoop.home.domain.models;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jx\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010\"¨\u0006;"}, m65681d2 = {"Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "Lm91/u;", "", "id", "key", "", "finalIndex", NotificationCompat.CATEGORY_STATUS, "initial", "completed", "", "visibility", "Lcom/whoop/home/domain/models/BorderAnimation;", "animateBorder", "highlightCard", "Lcom/whoop/home/domain/models/ContainerBorderStyle;", "containerBorderStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Lm91/u;", "component6", "component7", "()Z", "component8", "()Lcom/whoop/home/domain/models/BorderAnimation;", "component9", "component10", "()Lcom/whoop/home/domain/models/ContainerBorderStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getKey", "I", "getFinalIndex", "getStatus", "Lm91/u;", "getInitial", "getCompleted", "Z", "getVisibility", "Lcom/whoop/home/domain/models/BorderAnimation;", "getAnimateBorder", "getHighlightCard", "Lcom/whoop/home/domain/models/ContainerBorderStyle;", "getContainerBorderStyle", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CustomAnimationContainerViewState implements InterfaceC25312u {
    public static final int $stable = 8;
    private final BorderAnimation animateBorder;
    private final InterfaceC25312u completed;
    private final ContainerBorderStyle containerBorderStyle;
    private final int finalIndex;
    private final boolean highlightCard;
    private final String id;
    private final InterfaceC25312u initial;
    private final String key;
    private final String status;
    private final boolean visibility;

    public CustomAnimationContainerViewState(String id4, String key, int i13, String status, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, boolean z4, BorderAnimation animateBorder, boolean z13, ContainerBorderStyle containerBorderStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(animateBorder, "animateBorder");
        AbstractC22676k.m65750j(containerBorderStyle, "containerBorderStyle");
        this.id = id4;
        this.key = key;
        this.finalIndex = i13;
        this.status = status;
        this.initial = interfaceC25312u;
        this.completed = interfaceC25312u2;
        this.visibility = z4;
        this.animateBorder = animateBorder;
        this.highlightCard = z13;
        this.containerBorderStyle = containerBorderStyle;
    }

    public static /* synthetic */ CustomAnimationContainerViewState copy$default(CustomAnimationContainerViewState customAnimationContainerViewState, String str, String str2, int i13, String str3, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, boolean z4, BorderAnimation borderAnimation, boolean z13, ContainerBorderStyle containerBorderStyle, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = customAnimationContainerViewState.id;
        }
        if ((i14 & 2) != 0) {
            str2 = customAnimationContainerViewState.key;
        }
        if ((i14 & 4) != 0) {
            i13 = customAnimationContainerViewState.finalIndex;
        }
        if ((i14 & 8) != 0) {
            str3 = customAnimationContainerViewState.status;
        }
        if ((i14 & 16) != 0) {
            interfaceC25312u = customAnimationContainerViewState.initial;
        }
        if ((i14 & 32) != 0) {
            interfaceC25312u2 = customAnimationContainerViewState.completed;
        }
        if ((i14 & 64) != 0) {
            z4 = customAnimationContainerViewState.visibility;
        }
        if ((i14 & 128) != 0) {
            borderAnimation = customAnimationContainerViewState.animateBorder;
        }
        if ((i14 & 256) != 0) {
            z13 = customAnimationContainerViewState.highlightCard;
        }
        if ((i14 & 512) != 0) {
            containerBorderStyle = customAnimationContainerViewState.containerBorderStyle;
        }
        boolean z14 = z13;
        ContainerBorderStyle containerBorderStyle2 = containerBorderStyle;
        boolean z15 = z4;
        BorderAnimation borderAnimation2 = borderAnimation;
        InterfaceC25312u interfaceC25312u3 = interfaceC25312u;
        InterfaceC25312u interfaceC25312u4 = interfaceC25312u2;
        return customAnimationContainerViewState.copy(str, str2, i13, str3, interfaceC25312u3, interfaceC25312u4, z15, borderAnimation2, z14, containerBorderStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ContainerBorderStyle getContainerBorderStyle() {
        return this.containerBorderStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFinalIndex() {
        return this.finalIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InterfaceC25312u getInitial() {
        return this.initial;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InterfaceC25312u getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BorderAnimation getAnimateBorder() {
        return this.animateBorder;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHighlightCard() {
        return this.highlightCard;
    }

    public final CustomAnimationContainerViewState copy(String id4, String key, int finalIndex, String status, InterfaceC25312u initial, InterfaceC25312u completed, boolean visibility, BorderAnimation animateBorder, boolean highlightCard, ContainerBorderStyle containerBorderStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(animateBorder, "animateBorder");
        AbstractC22676k.m65750j(containerBorderStyle, "containerBorderStyle");
        return new CustomAnimationContainerViewState(id4, key, finalIndex, status, initial, completed, visibility, animateBorder, highlightCard, containerBorderStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAnimationContainerViewState)) {
            return false;
        }
        CustomAnimationContainerViewState customAnimationContainerViewState = (CustomAnimationContainerViewState) other;
        return AbstractC22676k.m65745e(this.id, customAnimationContainerViewState.id) && AbstractC22676k.m65745e(this.key, customAnimationContainerViewState.key) && this.finalIndex == customAnimationContainerViewState.finalIndex && AbstractC22676k.m65745e(this.status, customAnimationContainerViewState.status) && AbstractC22676k.m65745e(this.initial, customAnimationContainerViewState.initial) && AbstractC22676k.m65745e(this.completed, customAnimationContainerViewState.completed) && this.visibility == customAnimationContainerViewState.visibility && this.animateBorder == customAnimationContainerViewState.animateBorder && this.highlightCard == customAnimationContainerViewState.highlightCard && this.containerBorderStyle == customAnimationContainerViewState.containerBorderStyle;
    }

    public final BorderAnimation getAnimateBorder() {
        return this.animateBorder;
    }

    public final InterfaceC25312u getCompleted() {
        return this.completed;
    }

    public final ContainerBorderStyle getContainerBorderStyle() {
        return this.containerBorderStyle;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent */
    public /* bridge */ Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return super.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
    }

    public final int getFinalIndex() {
        return this.finalIndex;
    }

    public final boolean getHighlightCard() {
        return this.highlightCard;
    }

    public final String getId() {
        return this.id;
    }

    public final InterfaceC25312u getInitial() {
        return this.initial;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.finalIndex, AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.key), 31), 31, this.status);
        InterfaceC25312u interfaceC25312u = this.initial;
        int iHashCode = (iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.completed;
        return this.containerBorderStyle.hashCode() + AbstractC2875y.m8289b((this.animateBorder.hashCode() + AbstractC2875y.m8289b((iHashCode + (interfaceC25312u2 != null ? interfaceC25312u2.hashCode() : 0)) * 31, 31, this.visibility)) * 31, 31, this.highlightCard);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.key;
        int i13 = this.finalIndex;
        String str3 = this.status;
        InterfaceC25312u interfaceC25312u = this.initial;
        InterfaceC25312u interfaceC25312u2 = this.completed;
        boolean z4 = this.visibility;
        BorderAnimation borderAnimation = this.animateBorder;
        boolean z13 = this.highlightCard;
        ContainerBorderStyle containerBorderStyle = this.containerBorderStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomAnimationContainerViewState(id=", str, ", key=", str2, ", finalIndex=");
        AbstractC11895b.m31979B(i13, ", status=", str3, ", initial=", sbM32001t);
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", completed=");
        sbM32001t.append(interfaceC25312u2);
        sbM32001t.append(", visibility=");
        sbM32001t.append(z4);
        sbM32001t.append(", animateBorder=");
        sbM32001t.append(borderAnimation);
        sbM32001t.append(", highlightCard=");
        sbM32001t.append(z13);
        sbM32001t.append(", containerBorderStyle=");
        sbM32001t.append(containerBorderStyle);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ CustomAnimationContainerViewState(String str, String str2, int i13, String str3, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, boolean z4, BorderAnimation borderAnimation, boolean z13, ContainerBorderStyle containerBorderStyle, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i13, str3, interfaceC25312u, interfaceC25312u2, (i14 & 64) != 0 ? true : z4, (i14 & 128) != 0 ? BorderAnimation.NONE : borderAnimation, (i14 & 256) != 0 ? false : z13, (i14 & 512) != 0 ? ContainerBorderStyle.ONBOARDING : containerBorderStyle);
    }
}
