package wr0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27270o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wr0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Lwr0/t;", "Lm91/n;", "", "id", "Lm91/u;", "leading", "Lcom/whoop/design/util/TextResource;", "placeholder", "captionText", "stateUpdateValueKey", "Lny0/o;", "saveButton", "saveContentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "submitInteraction", "<init>", "(Ljava/lang/String;Lm91/u;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lny0/o;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lm91/u;", "()Lm91/u;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "g", "f", "Lny0/o;", "()Lny0/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37554t implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u leading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource placeholder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String captionText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String stateUpdateValueKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27270o saveButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String saveContentDescription;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction submitInteraction;

    public C37554t(String id4, InterfaceC25312u interfaceC25312u, TextResource placeholder, String captionText, String str, C27270o saveButton, String saveContentDescription, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(captionText, "captionText");
        AbstractC22676k.m65750j(saveButton, "saveButton");
        AbstractC22676k.m65750j(saveContentDescription, "saveContentDescription");
        this.id = id4;
        this.leading = interfaceC25312u;
        this.placeholder = placeholder;
        this.captionText = captionText;
        this.stateUpdateValueKey = str;
        this.saveButton = saveButton;
        this.saveContentDescription = saveContentDescription;
        this.submitInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaptionText() {
        return this.captionText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27270o getSaveButton() {
        return this.saveButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37554t)) {
            return false;
        }
        C37554t c37554t = (C37554t) other;
        return AbstractC22676k.m65745e(this.id, c37554t.id) && AbstractC22676k.m65745e(this.leading, c37554t.leading) && AbstractC22676k.m65745e(this.placeholder, c37554t.placeholder) && AbstractC22676k.m65745e(this.captionText, c37554t.captionText) && AbstractC22676k.m65745e(this.stateUpdateValueKey, c37554t.stateUpdateValueKey) && AbstractC22676k.m65745e(this.saveButton, c37554t.saveButton) && AbstractC22676k.m65745e(this.saveContentDescription, c37554t.saveContentDescription) && AbstractC22676k.m65745e(this.submitInteraction, c37554t.submitInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSaveContentDescription() {
        return this.saveContentDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getSubmitInteraction() {
        return this.submitInteraction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        InterfaceC25312u interfaceC25312u = this.leading;
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a((iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, this.placeholder, 31), 31, this.captionText);
        String str = this.stateUpdateValueKey;
        int iM30450d2 = AbstractC11266d.m30450d((this.saveButton.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.saveContentDescription);
        GenericInteraction genericInteraction = this.submitInteraction;
        return iM30450d2 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        InterfaceC25312u interfaceC25312u = this.leading;
        TextResource textResource = this.placeholder;
        String str2 = this.captionText;
        String str3 = this.stateUpdateValueKey;
        C27270o c27270o = this.saveButton;
        String str4 = this.saveContentDescription;
        GenericInteraction genericInteraction = this.submitInteraction;
        StringBuilder sb4 = new StringBuilder("MomentCaptionBarState(id=");
        sb4.append(str);
        sb4.append(", leading=");
        sb4.append(interfaceC25312u);
        sb4.append(", placeholder=");
        AbstractC30007c.m91856z(sb4, textResource, ", captionText=", str2, ", stateUpdateValueKey=");
        sb4.append(str3);
        sb4.append(", saveButton=");
        sb4.append(c27270o);
        sb4.append(", saveContentDescription=");
        sb4.append(str4);
        sb4.append(", submitInteraction=");
        sb4.append(genericInteraction);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
