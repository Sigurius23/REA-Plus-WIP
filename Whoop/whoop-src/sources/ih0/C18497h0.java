package ih0;

import ah0.C0888i;
import com.whoop.design.models.DesignSystemModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ih0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lih0/h0;", "Lm91/u;", "Lah0/i;", "viewState", "", "formKey", "conversationFingerprint", "turnId", "Lcom/whoop/design/models/DesignSystemModel;", "formModel", "<init>", "(Lah0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "a", "(Lah0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lih0/h0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lah0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lah0/i;", "b", "Ljava/lang/String;", "e", "c", "d", "g", "Lcom/whoop/design/models/DesignSystemModel;", "f", "()Lcom/whoop/design/models/DesignSystemModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18497h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C0888i viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String formKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String conversationFingerprint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final DesignSystemModel formModel;

    public C18497h0(C0888i viewState, String formKey, String conversationFingerprint, String turnId, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formKey, "formKey");
        AbstractC22676k.m65750j(conversationFingerprint, "conversationFingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        this.viewState = viewState;
        this.formKey = formKey;
        this.conversationFingerprint = conversationFingerprint;
        this.turnId = turnId;
        this.formModel = designSystemModel;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18497h0 m53547b(C18497h0 c18497h0, C0888i c0888i, String str, String str2, String str3, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c0888i = c18497h0.viewState;
        }
        if ((i13 & 2) != 0) {
            str = c18497h0.formKey;
        }
        if ((i13 & 4) != 0) {
            str2 = c18497h0.conversationFingerprint;
        }
        if ((i13 & 8) != 0) {
            str3 = c18497h0.turnId;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = c18497h0.formModel;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str4 = str2;
        return c18497h0.m53548a(c0888i, str, str4, str3, designSystemModel2);
    }

    /* JADX INFO: renamed from: a */
    public final C18497h0 m53548a(C0888i viewState, String formKey, String conversationFingerprint, String turnId, DesignSystemModel formModel) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formKey, "formKey");
        AbstractC22676k.m65750j(conversationFingerprint, "conversationFingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        return new C18497h0(viewState, formKey, conversationFingerprint, turnId, formModel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getConversationFingerprint() {
        return this.conversationFingerprint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFormKey() {
        return this.formKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18497h0)) {
            return false;
        }
        C18497h0 c18497h0 = (C18497h0) other;
        return AbstractC22676k.m65745e(this.viewState, c18497h0.viewState) && AbstractC22676k.m65745e(this.formKey, c18497h0.formKey) && AbstractC22676k.m65745e(this.conversationFingerprint, c18497h0.conversationFingerprint) && AbstractC22676k.m65745e(this.turnId, c18497h0.turnId) && AbstractC22676k.m65745e(this.formModel, c18497h0.formModel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DesignSystemModel getFormModel() {
        return this.formModel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C0888i getViewState() {
        return this.viewState;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.viewState.hashCode() * 31, 31, this.formKey), 31, this.conversationFingerprint), 31, this.turnId);
        DesignSystemModel designSystemModel = this.formModel;
        return iM30450d + (designSystemModel == null ? 0 : designSystemModel.hashCode());
    }

    public String toString() {
        C0888i c0888i = this.viewState;
        String str = this.formKey;
        String str2 = this.conversationFingerprint;
        String str3 = this.turnId;
        DesignSystemModel designSystemModel = this.formModel;
        StringBuilder sb4 = new StringBuilder("FormWidgetScreenState(viewState=");
        sb4.append(c0888i);
        sb4.append(", formKey=");
        sb4.append(str);
        sb4.append(", conversationFingerprint=");
        AbstractC11266d.m30444B(sb4, str2, ", turnId=", str3, ", formModel=");
        sb4.append(designSystemModel);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C18497h0(C0888i c0888i, String str, String str2, String str3, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0888i, str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : designSystemModel);
    }
}
