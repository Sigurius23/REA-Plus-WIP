package com.whoop.recommendationtile.domain;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.recommendationtile.RecommendationTileStatus;
import com.whoop.navigation.C9598e;
import h31.C16814g;
import h31.EnumC16809b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: com.whoop.recommendationtile.domain.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0098\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b.\u00107R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b8\u0010+R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b9\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b(\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b2\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b5\u0010\u001b¨\u0006>"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/c;", "", "", "recommendationId", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", NotificationCompat.CATEGORY_STATUS, "", "isCommitting", "showCommitError", "Lm91/u;", "header", "", "body", "Lh31/g;", "button", "isExpanded", "isSelected", "Lh31/b;", "backgroundStyle", "Lcom/whoop/navigation/e;", "dismiss", "followupMessage", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "k", "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "c", "Z", "l", "()Z", "d", "j", "e", "Lm91/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lm91/u;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "Lh31/g;", "()Lh31/g;", "m", "n", "Lh31/b;", "()Lh31/b;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C9912c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String recommendationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RecommendationTileStatus status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCommitting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showCommitError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<InterfaceC25312u> body;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C16814g button;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC16809b backgroundStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C9598e dismiss;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String followupMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public C9912c(String recommendationId, RecommendationTileStatus status, boolean z4, boolean z13, InterfaceC25312u interfaceC25312u, List<? extends InterfaceC25312u> body, C16814g c16814g, boolean z14, boolean z15, EnumC16809b enumC16809b, C9598e c9598e, String str) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        this.recommendationId = recommendationId;
        this.status = status;
        this.isCommitting = z4;
        this.showCommitError = z13;
        this.header = interfaceC25312u;
        this.body = body;
        this.button = c16814g;
        this.isExpanded = z14;
        this.isSelected = z15;
        this.backgroundStyle = enumC16809b;
        this.dismiss = c9598e;
        this.followupMessage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9912c m24297b(C9912c c9912c, String str, RecommendationTileStatus recommendationTileStatus, boolean z4, boolean z13, InterfaceC25312u interfaceC25312u, List list, C16814g c16814g, boolean z14, boolean z15, EnumC16809b enumC16809b, C9598e c9598e, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c9912c.recommendationId;
        }
        if ((i13 & 2) != 0) {
            recommendationTileStatus = c9912c.status;
        }
        if ((i13 & 4) != 0) {
            z4 = c9912c.isCommitting;
        }
        if ((i13 & 8) != 0) {
            z13 = c9912c.showCommitError;
        }
        if ((i13 & 16) != 0) {
            interfaceC25312u = c9912c.header;
        }
        if ((i13 & 32) != 0) {
            list = c9912c.body;
        }
        if ((i13 & 64) != 0) {
            c16814g = c9912c.button;
        }
        if ((i13 & 128) != 0) {
            z14 = c9912c.isExpanded;
        }
        if ((i13 & 256) != 0) {
            z15 = c9912c.isSelected;
        }
        if ((i13 & 512) != 0) {
            enumC16809b = c9912c.backgroundStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = c9912c.dismiss;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str2 = c9912c.followupMessage;
        }
        C9598e c9598e2 = c9598e;
        String str3 = str2;
        boolean z16 = z15;
        EnumC16809b enumC16809b2 = enumC16809b;
        C16814g c16814g2 = c16814g;
        boolean z17 = z14;
        InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
        List list2 = list;
        return c9912c.m24298a(str, recommendationTileStatus, z4, z13, interfaceC25312u2, list2, c16814g2, z17, z16, enumC16809b2, c9598e2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final C9912c m24298a(String recommendationId, RecommendationTileStatus status, boolean isCommitting, boolean showCommitError, InterfaceC25312u header, List<? extends InterfaceC25312u> body, C16814g button, boolean isExpanded, boolean isSelected, EnumC16809b backgroundStyle, C9598e dismiss, String followupMessage) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        return new C9912c(recommendationId, status, isCommitting, showCommitError, header, body, button, isExpanded, isSelected, backgroundStyle, dismiss, followupMessage);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16809b getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC25312u> m24300d() {
        return this.body;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C16814g getButton() {
        return this.button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C9912c)) {
            return false;
        }
        C9912c c9912c = (C9912c) other;
        return AbstractC22676k.m65745e(this.recommendationId, c9912c.recommendationId) && this.status == c9912c.status && this.isCommitting == c9912c.isCommitting && this.showCommitError == c9912c.showCommitError && AbstractC22676k.m65745e(this.header, c9912c.header) && AbstractC22676k.m65745e(this.body, c9912c.body) && AbstractC22676k.m65745e(this.button, c9912c.button) && this.isExpanded == c9912c.isExpanded && this.isSelected == c9912c.isSelected && this.backgroundStyle == c9912c.backgroundStyle && AbstractC22676k.m65745e(this.dismiss, c9912c.dismiss) && AbstractC22676k.m65745e(this.followupMessage, c9912c.followupMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDismiss() {
        return this.dismiss;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getHeader() {
        return this.header;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.status.hashCode() + (this.recommendationId.hashCode() * 31)) * 31, 31, this.isCommitting), 31, this.showCommitError);
        InterfaceC25312u interfaceC25312u = this.header;
        int iM31983b = AbstractC11895b.m31983b((iM8289b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.body);
        C16814g c16814g = this.button;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (c16814g == null ? 0 : c16814g.hashCode())) * 31, 31, this.isExpanded), 31, this.isSelected);
        EnumC16809b enumC16809b = this.backgroundStyle;
        int iHashCode = (iM8289b2 + (enumC16809b == null ? 0 : enumC16809b.hashCode())) * 31;
        C9598e c9598e = this.dismiss;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.followupMessage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowCommitError() {
        return this.showCommitError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final RecommendationTileStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsCommitting() {
        return this.isCommitting;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.recommendationId;
        RecommendationTileStatus recommendationTileStatus = this.status;
        boolean z4 = this.isCommitting;
        boolean z13 = this.showCommitError;
        InterfaceC25312u interfaceC25312u = this.header;
        List<InterfaceC25312u> list = this.body;
        C16814g c16814g = this.button;
        boolean z14 = this.isExpanded;
        boolean z15 = this.isSelected;
        EnumC16809b enumC16809b = this.backgroundStyle;
        C9598e c9598e = this.dismiss;
        String str2 = this.followupMessage;
        StringBuilder sb4 = new StringBuilder("RecommendationTileDomainState(recommendationId=");
        sb4.append(str);
        sb4.append(", status=");
        sb4.append(recommendationTileStatus);
        sb4.append(", isCommitting=");
        AbstractC38963t7.m124392v(sb4, z4, ", showCommitError=", z13, ", header=");
        sb4.append(interfaceC25312u);
        sb4.append(", body=");
        sb4.append(list);
        sb4.append(", button=");
        sb4.append(c16814g);
        sb4.append(", isExpanded=");
        sb4.append(z14);
        sb4.append(", isSelected=");
        sb4.append(z15);
        sb4.append(", backgroundStyle=");
        sb4.append(enumC16809b);
        sb4.append(", dismiss=");
        sb4.append(c9598e);
        sb4.append(", followupMessage=");
        sb4.append(str2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C9912c(String str, RecommendationTileStatus recommendationTileStatus, boolean z4, boolean z13, InterfaceC25312u interfaceC25312u, List list, C16814g c16814g, boolean z14, boolean z15, EnumC16809b enumC16809b, C9598e c9598e, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? RecommendationTileStatus.UNCOMMITTED : recommendationTileStatus, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : interfaceC25312u, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? null : c16814g, (i13 & 128) != 0 ? true : z14, (i13 & 256) == 0 ? z15 : false, (i13 & 512) != 0 ? null : enumC16809b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str2);
    }
}
