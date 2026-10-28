package v11;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: v11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0082\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b'\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b3\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b/\u0010<R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b+\u0010>¨\u0006?"}, m65681d2 = {"Lv11/b;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "Lv11/c;", "style", "Lgz0/m0;", "icon", "", "enabled", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "modal", "Lv11/k;", "confirmationDialog", "Lv11/a;", "buttonSize", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lv11/c;Lgz0/m0;ZLcom/whoop/whoopaction/domain/models/Action;Ljava/lang/Object;Lv11/k;Lv11/a;Lcom/whoop/analytics/AnalyticEventModel;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lv11/c;Lgz0/m0;ZLcom/whoop/whoopaction/domain/models/Action;Ljava/lang/Object;Lv11/k;Lv11/a;Lcom/whoop/analytics/AnalyticEventModel;)Lv11/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "Lv11/c;", "k", "()Lv11/c;", "d", "Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lgz0/m0;", "e", "Z", "g", "()Z", "f", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "Lv11/k;", "()Lv11/k;", "Lv11/a;", "()Lv11/a;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35544b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC35545c style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object modal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C35553k confirmationDialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC35543a buttonSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C35544b(String str, TextResource title, EnumC35545c enumC35545c, EnumC16313m0 enumC16313m0, boolean z4, Action action, Object obj, C35553k c35553k, EnumC35543a buttonSize, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonSize, "buttonSize");
        this.id = str;
        this.title = title;
        this.style = enumC35545c;
        this.icon = enumC16313m0;
        this.enabled = z4;
        this.action = action;
        this.modal = obj;
        this.confirmationDialog = c35553k;
        this.buttonSize = buttonSize;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35544b m112692b(C35544b c35544b, String str, TextResource textResource, EnumC35545c enumC35545c, EnumC16313m0 enumC16313m0, boolean z4, Action action, Object obj, C35553k c35553k, EnumC35543a enumC35543a, AnalyticEventModel analyticEventModel, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = c35544b.id;
        }
        if ((i13 & 2) != 0) {
            textResource = c35544b.title;
        }
        if ((i13 & 4) != 0) {
            enumC35545c = c35544b.style;
        }
        if ((i13 & 8) != 0) {
            enumC16313m0 = c35544b.icon;
        }
        if ((i13 & 16) != 0) {
            z4 = c35544b.enabled;
        }
        if ((i13 & 32) != 0) {
            action = c35544b.action;
        }
        if ((i13 & 64) != 0) {
            obj = c35544b.modal;
        }
        if ((i13 & 128) != 0) {
            c35553k = c35544b.confirmationDialog;
        }
        if ((i13 & 256) != 0) {
            enumC35543a = c35544b.buttonSize;
        }
        if ((i13 & 512) != 0) {
            analyticEventModel = c35544b.analyticEvent;
        }
        EnumC35543a enumC35543a2 = enumC35543a;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        Object obj3 = obj;
        C35553k c35553k2 = c35553k;
        boolean z13 = z4;
        Action action2 = action;
        return c35544b.m112693a(str, textResource, enumC35545c, enumC16313m0, z13, action2, obj3, c35553k2, enumC35543a2, analyticEventModel2);
    }

    /* JADX INFO: renamed from: a */
    public final C35544b m112693a(String id4, TextResource title, EnumC35545c style, EnumC16313m0 icon, boolean enabled, Action action, Object modal, C35553k confirmationDialog, EnumC35543a buttonSize, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonSize, "buttonSize");
        return new C35544b(id4, title, style, icon, enabled, action, modal, confirmationDialog, buttonSize, analyticEvent);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC35543a getButtonSize() {
        return this.buttonSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35544b)) {
            return false;
        }
        C35544b c35544b = (C35544b) other;
        return AbstractC22676k.m65745e(this.id, c35544b.id) && AbstractC22676k.m65745e(this.title, c35544b.title) && this.style == c35544b.style && this.icon == c35544b.icon && this.enabled == c35544b.enabled && AbstractC22676k.m65745e(this.action, c35544b.action) && AbstractC22676k.m65745e(this.modal, c35544b.modal) && AbstractC22676k.m65745e(this.confirmationDialog, c35544b.confirmationDialog) && this.buttonSize == c35544b.buttonSize && AbstractC22676k.m65745e(this.analyticEvent, c35544b.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C35553k getConfirmationDialog() {
        return this.confirmationDialog;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31);
        EnumC35545c enumC35545c = this.style;
        int iHashCode = (iM95625a + (enumC35545c == null ? 0 : enumC35545c.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.enabled);
        Action action = this.action;
        int iHashCode2 = (iM8289b + (action == null ? 0 : action.hashCode())) * 31;
        Object obj = this.modal;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        C35553k c35553k = this.confirmationDialog;
        int iHashCode4 = (this.buttonSize.hashCode() + ((iHashCode3 + (c35553k == null ? 0 : c35553k.hashCode())) * 31)) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode4 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Object getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC35545c getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        EnumC35545c enumC35545c = this.style;
        EnumC16313m0 enumC16313m0 = this.icon;
        boolean z4 = this.enabled;
        Action action = this.action;
        Object obj = this.modal;
        C35553k c35553k = this.confirmationDialog;
        EnumC35543a enumC35543a = this.buttonSize;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("FollowerRequestButtonState(id=", str, ", title=", textResource, ", style=");
        sbM91847q.append(enumC35545c);
        sbM91847q.append(", icon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", enabled=");
        sbM91847q.append(z4);
        sbM91847q.append(", action=");
        sbM91847q.append(action);
        sbM91847q.append(", modal=");
        sbM91847q.append(obj);
        sbM91847q.append(", confirmationDialog=");
        sbM91847q.append(c35553k);
        sbM91847q.append(", buttonSize=");
        sbM91847q.append(enumC35543a);
        sbM91847q.append(", analyticEvent=");
        sbM91847q.append(analyticEventModel);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
