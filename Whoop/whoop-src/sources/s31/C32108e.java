package s31;

import com.whoop.navigation.models.GenericInteraction;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: s31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b \u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b\u001c\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b$\u0010/¨\u00060"}, m65681d2 = {"Ls31/e;", "Lm91/u;", "Lkd1/o;", "media", "Lhy0/h1;", "tag", "Lsz0/c0;", "title", "description", "Ls31/a;", "cta", "Ls31/d;", "size", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lkd1/o;Lhy0/h1;Lsz0/c0;Lsz0/c0;Ls31/a;Ls31/d;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "e", "()Lkd1/o;", "b", "Lhy0/h1;", "g", "()Lhy0/h1;", "c", "Lsz0/c0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lsz0/c0;", "d", "Ls31/a;", "()Ls31/a;", "f", "Ls31/d;", "()Ls31/d;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32108e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o media;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33169c0 title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33169c0 description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC32104a cta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC32107d size;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C32108e(AbstractC22403o abstractC22403o, C17750h1 c17750h1, C33169c0 title, C33169c0 c33169c0, InterfaceC32104a interfaceC32104a, EnumC32107d size, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(size, "size");
        this.media = abstractC22403o;
        this.tag = c17750h1;
        this.title = title;
        this.description = c33169c0;
        this.cta = interfaceC32104a;
        this.size = size;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC32104a getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33169c0 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getMedia() {
        return this.media;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32108e)) {
            return false;
        }
        C32108e c32108e = (C32108e) other;
        return AbstractC22676k.m65745e(this.media, c32108e.media) && AbstractC22676k.m65745e(this.tag, c32108e.tag) && AbstractC22676k.m65745e(this.title, c32108e.title) && AbstractC22676k.m65745e(this.description, c32108e.description) && AbstractC22676k.m65745e(this.cta, c32108e.cta) && this.size == c32108e.size && AbstractC22676k.m65745e(this.interaction, c32108e.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC32107d getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C33169c0 getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.media;
        int iHashCode = (abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31;
        C17750h1 c17750h1 = this.tag;
        int iHashCode2 = (this.title.hashCode() + ((iHashCode + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31)) * 31;
        C33169c0 c33169c0 = this.description;
        int iHashCode3 = (iHashCode2 + (c33169c0 == null ? 0 : c33169c0.hashCode())) * 31;
        InterfaceC32104a interfaceC32104a = this.cta;
        int iHashCode4 = (this.size.hashCode() + ((iHashCode3 + (interfaceC32104a == null ? 0 : interfaceC32104a.hashCode())) * 31)) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode4 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.media;
        C17750h1 c17750h1 = this.tag;
        C33169c0 c33169c0 = this.title;
        C33169c0 c33169c1 = this.description;
        InterfaceC32104a interfaceC32104a = this.cta;
        EnumC32107d enumC32107d = this.size;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sb4 = new StringBuilder("ShopMediaCardViewState(media=");
        sb4.append(abstractC22403o);
        sb4.append(", tag=");
        sb4.append(c17750h1);
        sb4.append(", title=");
        sb4.append(c33169c0);
        sb4.append(", description=");
        sb4.append(c33169c1);
        sb4.append(", cta=");
        sb4.append(interfaceC32104a);
        sb4.append(", size=");
        sb4.append(enumC32107d);
        sb4.append(", interaction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }
}
