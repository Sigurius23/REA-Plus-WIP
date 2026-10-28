package c41;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.f0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001e\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b)\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b\u001b\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b\"\u0010+¨\u0006-"}, m65681d2 = {"Lc41/f0;", "Lm91/u;", "", "id", "Lgz0/m0;", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lcom/whoop/navigation/e;", "destination", "rightIcon", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "dismissAction", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "f", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4020f0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Action dismissAction;

    public C4020f0(String id4, EnumC16313m0 enumC16313m0, TextResource title, TextResource textResource, C9598e c9598e, EnumC16313m0 enumC16313m1, Action action, Action action2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.leftIcon = enumC16313m0;
        this.title = title;
        this.subtitle = textResource;
        this.destination = c9598e;
        this.rightIcon = enumC16313m1;
        this.action = action;
        this.dismissAction = action2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4020f0)) {
            return false;
        }
        C4020f0 c4020f0 = (C4020f0) other;
        return AbstractC22676k.m65745e(this.id, c4020f0.id) && this.leftIcon == c4020f0.leftIcon && AbstractC22676k.m65745e(this.title, c4020f0.title) && AbstractC22676k.m65745e(this.subtitle, c4020f0.subtitle) && AbstractC22676k.m65745e(this.destination, c4020f0.destination) && this.rightIcon == c4020f0.rightIcon && AbstractC22676k.m65745e(this.action, c4020f0.action) && AbstractC22676k.m65745e(this.dismissAction, c4020f0.dismissAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        int iHashCode4 = (iHashCode3 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31;
        Action action = this.action;
        int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.dismissAction;
        return iHashCode5 + (action2 != null ? action2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C9598e c9598e = this.destination;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        Action action = this.action;
        Action action2 = this.dismissAction;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("AiActionTileViewState(id=", str, ", leftIcon=", enumC16313m0, ", title=");
        AbstractC30007c.m91855y(sbM61141l, textResource, ", subtitle=", textResource2, ", destination=");
        sbM61141l.append(c9598e);
        sbM61141l.append(", rightIcon=");
        sbM61141l.append(enumC16313m1);
        sbM61141l.append(", action=");
        sbM61141l.append(action);
        sbM61141l.append(", dismissAction=");
        sbM61141l.append(action2);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public /* synthetic */ C4020f0(String str, EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, C9598e c9598e, EnumC16313m0 enumC16313m1, Action action, Action action2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : enumC16313m0, textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? null : c9598e, (i13 & 32) != 0 ? null : enumC16313m1, (i13 & 64) != 0 ? null : action, (i13 & 128) != 0 ? null : action2);
    }
}
