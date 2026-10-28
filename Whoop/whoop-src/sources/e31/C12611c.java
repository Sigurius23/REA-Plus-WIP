package e31;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dx2.C12430a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p026b2.C2314t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;

/* JADX INFO: renamed from: e31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, m65681d2 = {"Le31/c;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "Le31/a;", "primaryButton", "secondaryButton", "Lkotlin/Function0;", "Ll83/a0;", "onScrimClicked", "<init>", "(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;)V", "c", "(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;)Le31/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "e", "()Landroidx/compose/ui/Modifier;", "b", "Lsz0/p0;", "j", "()Lsz0/p0;", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "d", "Le31/a;", "g", "()Le31/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lc93/a;", "()Lc93/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12611c {

    /* JADX INFO: renamed from: g */
    public static final int f43049g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC33208p0 type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource supportText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12609a primaryButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C12609a secondaryButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a onScrimClicked;

    public C12611c(Modifier modifier, AbstractC33208p0 type, TextResource textResource, C12609a c12609a, C12609a c12609a2, InterfaceC4339a onScrimClicked) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(onScrimClicked, "onScrimClicked");
        this.modifier = modifier;
        this.type = type;
        this.supportText = textResource;
        this.primaryButton = c12609a;
        this.secondaryButton = c12609a2;
        this.onScrimClicked = onScrimClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m35357b() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C12611c m35358d(C12611c c12611c, Modifier modifier, AbstractC33208p0 abstractC33208p0, TextResource textResource, C12609a c12609a, C12609a c12609a2, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            modifier = c12611c.modifier;
        }
        if ((i13 & 2) != 0) {
            abstractC33208p0 = c12611c.type;
        }
        if ((i13 & 4) != 0) {
            textResource = c12611c.supportText;
        }
        if ((i13 & 8) != 0) {
            c12609a = c12611c.primaryButton;
        }
        if ((i13 & 16) != 0) {
            c12609a2 = c12611c.secondaryButton;
        }
        if ((i13 & 32) != 0) {
            interfaceC4339a = c12611c.onScrimClicked;
        }
        C12609a c12609a3 = c12609a2;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        return c12611c.m35359c(modifier, abstractC33208p0, textResource, c12609a, c12609a3, interfaceC4339a2);
    }

    /* JADX INFO: renamed from: c */
    public final C12611c m35359c(Modifier modifier, AbstractC33208p0 type, TextResource supportText, C12609a primaryButton, C12609a secondaryButton, InterfaceC4339a onScrimClicked) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(onScrimClicked, "onScrimClicked");
        return new C12611c(modifier, type, supportText, primaryButton, secondaryButton, onScrimClicked);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12611c)) {
            return false;
        }
        C12611c c12611c = (C12611c) other;
        return AbstractC22676k.m65745e(this.modifier, c12611c.modifier) && AbstractC22676k.m65745e(this.type, c12611c.type) && AbstractC22676k.m65745e(this.supportText, c12611c.supportText) && AbstractC22676k.m65745e(this.primaryButton, c12611c.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, c12611c.secondaryButton) && AbstractC22676k.m65745e(this.onScrimClicked, c12611c.onScrimClicked);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC4339a getOnScrimClicked() {
        return this.onScrimClicked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C12609a getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C12609a getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.modifier.hashCode() * 31)) * 31;
        TextResource textResource = this.supportText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C12609a c12609a = this.primaryButton;
        int iHashCode3 = (iHashCode2 + (c12609a == null ? 0 : c12609a.hashCode())) * 31;
        C12609a c12609a2 = this.secondaryButton;
        return this.onScrimClicked.hashCode() + ((iHashCode3 + (c12609a2 != null ? c12609a2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSupportText() {
        return this.supportText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC33208p0 getType() {
        return this.type;
    }

    public String toString() {
        return "MiniArchProgressModalState(modifier=" + this.modifier + ", type=" + this.type + ", supportText=" + this.supportText + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", onScrimClicked=" + this.onScrimClicked + ")";
    }

    public /* synthetic */ C12611c(Modifier modifier, AbstractC33208p0 abstractC33208p0, TextResource textResource, C12609a c12609a, C12609a c12609a2, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C2314t.f9131w : modifier, abstractC33208p0, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? null : c12609a, (i13 & 16) != 0 ? null : c12609a2, (i13 & 32) != 0 ? new C12430a(16) : interfaceC4339a);
    }
}
