package qw1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.familyPlan.domain.model.InviteFamilyMemberResponse;
import live.hms.video.media.tracks.HMSTrackSource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: qw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lqw1/c;", "", "Lqw1/a;", "currentDialogType", "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", HMSTrackSource.SCREEN, "", "currentEmailText", "", "isNewMember", "Lcom/whoop/design/util/TextResource;", "validationError", "<init>", "(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;)V", "a", "(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;)Lqw1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lqw1/a;", "c", "()Lqw1/a;", "b", "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "e", "()Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;", "Ljava/lang/String;", "d", "Z", "g", "()Z", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30689c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30687a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InviteFamilyMemberResponse screen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentEmailText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isNewMember;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource validationError;

    public C30689c(InterfaceC30687a interfaceC30687a, InviteFamilyMemberResponse inviteFamilyMemberResponse, String currentEmailText, boolean z4, TextResource validationError) {
        AbstractC22676k.m65750j(currentEmailText, "currentEmailText");
        AbstractC22676k.m65750j(validationError, "validationError");
        this.currentDialogType = interfaceC30687a;
        this.screen = inviteFamilyMemberResponse;
        this.currentEmailText = currentEmailText;
        this.isNewMember = z4;
        this.validationError = validationError;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C30689c m94291b(C30689c c30689c, InterfaceC30687a interfaceC30687a, InviteFamilyMemberResponse inviteFamilyMemberResponse, String str, boolean z4, TextResource textResource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC30687a = c30689c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            inviteFamilyMemberResponse = c30689c.screen;
        }
        if ((i13 & 4) != 0) {
            str = c30689c.currentEmailText;
        }
        if ((i13 & 8) != 0) {
            z4 = c30689c.isNewMember;
        }
        if ((i13 & 16) != 0) {
            textResource = c30689c.validationError;
        }
        TextResource textResource2 = textResource;
        String str2 = str;
        return c30689c.m94292a(interfaceC30687a, inviteFamilyMemberResponse, str2, z4, textResource2);
    }

    /* JADX INFO: renamed from: a */
    public final C30689c m94292a(InterfaceC30687a currentDialogType, InviteFamilyMemberResponse screen, String currentEmailText, boolean isNewMember, TextResource validationError) {
        AbstractC22676k.m65750j(currentEmailText, "currentEmailText");
        AbstractC22676k.m65750j(validationError, "validationError");
        return new C30689c(currentDialogType, screen, currentEmailText, isNewMember, validationError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC30687a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrentEmailText() {
        return this.currentEmailText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InviteFamilyMemberResponse getScreen() {
        return this.screen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30689c)) {
            return false;
        }
        C30689c c30689c = (C30689c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c30689c.currentDialogType) && AbstractC22676k.m65745e(this.screen, c30689c.screen) && AbstractC22676k.m65745e(this.currentEmailText, c30689c.currentEmailText) && this.isNewMember == c30689c.isNewMember && AbstractC22676k.m65745e(this.validationError, c30689c.validationError);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getValidationError() {
        return this.validationError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsNewMember() {
        return this.isNewMember;
    }

    public int hashCode() {
        InterfaceC30687a interfaceC30687a = this.currentDialogType;
        int iHashCode = (interfaceC30687a == null ? 0 : interfaceC30687a.hashCode()) * 31;
        InviteFamilyMemberResponse inviteFamilyMemberResponse = this.screen;
        return this.validationError.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (inviteFamilyMemberResponse != null ? inviteFamilyMemberResponse.hashCode() : 0)) * 31, 31, this.currentEmailText), 31, this.isNewMember);
    }

    public String toString() {
        InterfaceC30687a interfaceC30687a = this.currentDialogType;
        InviteFamilyMemberResponse inviteFamilyMemberResponse = this.screen;
        String str = this.currentEmailText;
        boolean z4 = this.isNewMember;
        TextResource textResource = this.validationError;
        StringBuilder sb4 = new StringBuilder("InviteFamilyMemberDomainResult(currentDialogType=");
        sb4.append(interfaceC30687a);
        sb4.append(", screen=");
        sb4.append(inviteFamilyMemberResponse);
        sb4.append(", currentEmailText=");
        AbstractC38963t7.m124390t(sb4, str, ", isNewMember=", z4, ", validationError=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }

    public /* synthetic */ C30689c(InterfaceC30687a interfaceC30687a, InviteFamilyMemberResponse inviteFamilyMemberResponse, String str, boolean z4, TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC30687a, (i13 & 2) != 0 ? null : inviteFamilyMemberResponse, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource);
    }
}
