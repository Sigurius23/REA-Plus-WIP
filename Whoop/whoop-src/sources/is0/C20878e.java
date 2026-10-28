package is0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import es0.EnumC13588a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: is0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lis0/e;", "Lm91/n;", "", "id", "Lkd1/o;", "avatar", "Lcom/whoop/design/util/TextResource;", "name", "text", "badge", "Les0/a;", "renderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "longPressAction", "", "isPending", "<init>", "(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Z)V", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Z)Lis0/e;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lkd1/o;", "c", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "i", "e", "f", "Les0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Les0/a;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Z", "j", "()Z", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20878e implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: i */
    public static final int f78544i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource badge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC13588a renderStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final GenericInteraction longPressAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isPending;

    static {
        int i13 = GenericInteraction.$stable;
        int i14 = TextResource.$stable;
        f78544i = i13 | i14 | i14 | i14 | AbstractC22403o.f87638a;
    }

    public C20878e(String id4, AbstractC22403o avatar, TextResource name, TextResource text, TextResource textResource, EnumC13588a renderStyle, GenericInteraction genericInteraction, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        this.id = id4;
        this.avatar = avatar;
        this.name = name;
        this.text = text;
        this.badge = textResource;
        this.renderStyle = renderStyle;
        this.longPressAction = genericInteraction;
        this.isPending = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20878e m57689b(C20878e c20878e, String str, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC13588a enumC13588a, GenericInteraction genericInteraction, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c20878e.id;
        }
        if ((i13 & 2) != 0) {
            abstractC22403o = c20878e.avatar;
        }
        if ((i13 & 4) != 0) {
            textResource = c20878e.name;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c20878e.text;
        }
        if ((i13 & 16) != 0) {
            textResource3 = c20878e.badge;
        }
        if ((i13 & 32) != 0) {
            enumC13588a = c20878e.renderStyle;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = c20878e.longPressAction;
        }
        if ((i13 & 128) != 0) {
            z4 = c20878e.isPending;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        boolean z13 = z4;
        TextResource textResource4 = textResource3;
        EnumC13588a enumC13588a2 = enumC13588a;
        return c20878e.m57690a(str, abstractC22403o, textResource, textResource2, textResource4, enumC13588a2, genericInteraction2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C20878e m57690a(String id4, AbstractC22403o avatar, TextResource name, TextResource text, TextResource badge, EnumC13588a renderStyle, GenericInteraction longPressAction, boolean isPending) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        return new C20878e(id4, avatar, name, text, badge, renderStyle, longPressAction, isPending);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getBadge() {
        return this.badge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20878e)) {
            return false;
        }
        C20878e c20878e = (C20878e) other;
        return AbstractC22676k.m65745e(this.id, c20878e.id) && AbstractC22676k.m65745e(this.avatar, c20878e.avatar) && AbstractC22676k.m65745e(this.name, c20878e.name) && AbstractC22676k.m65745e(this.text, c20878e.text) && AbstractC22676k.m65745e(this.badge, c20878e.badge) && this.renderStyle == c20878e.renderStyle && AbstractC22676k.m65745e(this.longPressAction, c20878e.longPressAction) && this.isPending == c20878e.isPending;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GenericInteraction getLongPressAction() {
        return this.longPressAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC13588a getRenderStyle() {
        return this.renderStyle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.avatar, this.id.hashCode() * 31, 31), this.name, 31), this.text, 31);
        TextResource textResource = this.badge;
        int iHashCode = (this.renderStyle.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31;
        GenericInteraction genericInteraction = this.longPressAction;
        return Boolean.hashCode(this.isPending) + ((iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsPending() {
        return this.isPending;
    }

    public String toString() {
        String id4 = getId();
        EnumC13588a enumC13588a = this.renderStyle;
        boolean z4 = this.isPending;
        StringBuilder sb4 = new StringBuilder("ReactionCommentState(id=");
        sb4.append(id4);
        sb4.append(", renderStyle=");
        sb4.append(enumC13588a);
        sb4.append(", isPending=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public /* synthetic */ C20878e(String str, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC13588a enumC13588a, GenericInteraction genericInteraction, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abstractC22403o, textResource, textResource2, (i13 & 16) != 0 ? null : textResource3, (i13 & 32) != 0 ? EnumC13588a.TEXT : enumC13588a, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? false : z4);
    }
}
