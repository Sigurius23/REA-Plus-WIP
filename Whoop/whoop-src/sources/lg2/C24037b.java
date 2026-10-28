package lg2;

import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lg2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001c\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b(\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b.\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b/\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b+\u0010*¨\u00060"}, m65681d2 = {"Llg2/b;", "Lm91/u;", "", "title", "", "showToggle", "isToggleOn", "Lgz0/m0;", "endIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "endIconAction", "", "body", "footer", "toggleOnInteraction", "toggleOffInteraction", "onAppearInteraction", "<init>", "(Ljava/lang/String;ZZLgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Z", "g", "()Z", "c", "k", "d", "Lgz0/m0;", "()Lgz0/m0;", "e", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "f", "Ljava/util/List;", "()Ljava/util/List;", "j", "i", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24037b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showToggle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isToggleOn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final GenericInteraction endIconAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<InterfaceC25312u> body;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction toggleOnInteraction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final GenericInteraction toggleOffInteraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final GenericInteraction onAppearInteraction;

    /* JADX WARN: Multi-variable type inference failed */
    public C24037b(String title, boolean z4, boolean z13, EnumC16313m0 enumC16313m0, GenericInteraction genericInteraction, List<? extends InterfaceC25312u> body, List<? extends InterfaceC25312u> footer, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, GenericInteraction genericInteraction4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.showToggle = z4;
        this.isToggleOn = z13;
        this.endIcon = enumC16313m0;
        this.endIconAction = genericInteraction;
        this.body = body;
        this.footer = footer;
        this.toggleOnInteraction = genericInteraction2;
        this.toggleOffInteraction = genericInteraction3;
        this.onAppearInteraction = genericInteraction4;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m70904a() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GenericInteraction getEndIconAction() {
        return this.endIconAction;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m70907e() {
        return this.footer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24037b)) {
            return false;
        }
        C24037b c24037b = (C24037b) other;
        return AbstractC22676k.m65745e(this.title, c24037b.title) && this.showToggle == c24037b.showToggle && this.isToggleOn == c24037b.isToggleOn && this.endIcon == c24037b.endIcon && AbstractC22676k.m65745e(this.endIconAction, c24037b.endIconAction) && AbstractC22676k.m65745e(this.body, c24037b.body) && AbstractC22676k.m65745e(this.footer, c24037b.footer) && AbstractC22676k.m65745e(this.toggleOnInteraction, c24037b.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, c24037b.toggleOffInteraction) && AbstractC22676k.m65745e(this.onAppearInteraction, c24037b.onAppearInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GenericInteraction getOnAppearInteraction() {
        return this.onAppearInteraction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowToggle() {
        return this.showToggle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.title.hashCode() * 31, 31, this.showToggle), 31, this.isToggleOn);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode = (iM8289b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        GenericInteraction genericInteraction = this.endIconAction;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31, this.body), 31, this.footer);
        GenericInteraction genericInteraction2 = this.toggleOnInteraction;
        int iHashCode2 = (iM31983b + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        GenericInteraction genericInteraction3 = this.toggleOffInteraction;
        int iHashCode3 = (iHashCode2 + (genericInteraction3 == null ? 0 : genericInteraction3.hashCode())) * 31;
        GenericInteraction genericInteraction4 = this.onAppearInteraction;
        return iHashCode3 + (genericInteraction4 != null ? genericInteraction4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsToggleOn() {
        return this.isToggleOn;
    }

    public String toString() {
        String str = this.title;
        boolean z4 = this.showToggle;
        boolean z13 = this.isToggleOn;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        GenericInteraction genericInteraction = this.endIconAction;
        List<InterfaceC25312u> list = this.body;
        List<InterfaceC25312u> list2 = this.footer;
        GenericInteraction genericInteraction2 = this.toggleOnInteraction;
        GenericInteraction genericInteraction3 = this.toggleOffInteraction;
        GenericInteraction genericInteraction4 = this.onAppearInteraction;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("TargetCardItemViewState(title=", str, ", showToggle=", ", isToggleOn=", z4);
        sbM73379l.append(z13);
        sbM73379l.append(", endIcon=");
        sbM73379l.append(enumC16313m0);
        sbM73379l.append(", endIconAction=");
        sbM73379l.append(genericInteraction);
        sbM73379l.append(", body=");
        sbM73379l.append(list);
        sbM73379l.append(", footer=");
        sbM73379l.append(list2);
        sbM73379l.append(", toggleOnInteraction=");
        sbM73379l.append(genericInteraction2);
        sbM73379l.append(", toggleOffInteraction=");
        sbM73379l.append(genericInteraction3);
        sbM73379l.append(", onAppearInteraction=");
        sbM73379l.append(genericInteraction4);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
