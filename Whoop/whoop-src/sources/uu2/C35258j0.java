package uu2;

import androidx.recyclerview.widget.AbstractC1707m0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: uu2.j0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u001bB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m65681d2 = {"Luu2/j0;", "", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Luu2/c;", "primaryClickEvent", "secondaryButtonText", "secondaryClickEvent", "followUpEvent", "", "showSecondaryButton", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luu2/c;Lcom/whoop/design/util/TextResource;Luu2/c;Luu2/c;Z)V", "f", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luu2/c;Lcom/whoop/design/util/TextResource;Luu2/c;Luu2/c;Z)Luu2/j0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "o", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "c", "i", "d", "Luu2/c;", "j", "()Luu2/c;", "e", "k", "l", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "m", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35258j0 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final int f149983j = TextResource.$stable | AbstractC33208p0.f138461d;

    /* JADX INFO: renamed from: k */
    private static final C35258j0 f149984k = new C35258j0(AbstractC33208p0.c.f138471e, null, null, null, null, null, null, false, 254, null);

    /* JADX INFO: renamed from: l */
    private static final C35258j0 f149985l;

    /* JADX INFO: renamed from: m */
    private static final C35258j0 f149986m;

    /* JADX INFO: renamed from: n */
    private static final C35258j0 f149987n;

    /* JADX INFO: renamed from: o */
    private static final C35258j0 f149988o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC33208p0 type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource supportText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC35243c primaryClickEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC35243c secondaryClickEvent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC35243c followUpEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showSecondaryButton;

    /* JADX INFO: renamed from: uu2.j0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m65681d2 = {"Luu2/j0$a;", "", "<init>", "()V", "Luu2/j0;", "loading", "Luu2/j0;", "c", "()Luu2/j0;", "networkError", "d", "serverError", "e", "deleting", "b", "deleted", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C35258j0 m111744a() {
            return C35258j0.f149988o;
        }

        /* JADX INFO: renamed from: b */
        public final C35258j0 m111745b() {
            return C35258j0.f149987n;
        }

        /* JADX INFO: renamed from: c */
        public final C35258j0 m111746c() {
            return C35258j0.f149984k;
        }

        /* JADX INFO: renamed from: d */
        public final C35258j0 m111747d() {
            return C35258j0.f149985l;
        }

        /* JADX INFO: renamed from: e */
        public final C35258j0 m111748e() {
            return C35258j0.f149986m;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        f149985l = new C35258j0(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), false, objArr, 6, 0 == true ? 1 : 0), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), objArr2, null, objArr3, null, false, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, null);
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        f149986m = new C35258j0(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), false, objArr4, 6, 0 == true ? 1 : 0), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), objArr5, null, objArr6, null, false, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, null);
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        f149987n = new C35258j0(AbstractC33208p0.a.f138465e, null, objArr7, 0 == true ? 1 : 0, objArr8, 0 == true ? 1 : 0, null, false, 254, null);
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        f149988o = new C35258j0(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC11128h.f35447Z1), 0L, objArr9, 6, null), null, null, null, objArr10, null, objArr11, false, 254, null);
    }

    public C35258j0(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC35243c interfaceC35243c, TextResource secondaryButtonText, InterfaceC35243c interfaceC35243c2, InterfaceC35243c interfaceC35243c3, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        this.type = type;
        this.supportText = supportText;
        this.primaryButtonText = primaryButtonText;
        this.primaryClickEvent = interfaceC35243c;
        this.secondaryButtonText = secondaryButtonText;
        this.secondaryClickEvent = interfaceC35243c2;
        this.followUpEvent = interfaceC35243c3;
        this.showSecondaryButton = z4;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C35258j0 m111734g(C35258j0 c35258j0, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC35243c interfaceC35243c, TextResource textResource3, InterfaceC35243c interfaceC35243c2, InterfaceC35243c interfaceC35243c3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC33208p0 = c35258j0.type;
        }
        if ((i13 & 2) != 0) {
            textResource = c35258j0.supportText;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c35258j0.primaryButtonText;
        }
        if ((i13 & 8) != 0) {
            interfaceC35243c = c35258j0.primaryClickEvent;
        }
        if ((i13 & 16) != 0) {
            textResource3 = c35258j0.secondaryButtonText;
        }
        if ((i13 & 32) != 0) {
            interfaceC35243c2 = c35258j0.secondaryClickEvent;
        }
        if ((i13 & 64) != 0) {
            interfaceC35243c3 = c35258j0.followUpEvent;
        }
        if ((i13 & 128) != 0) {
            z4 = c35258j0.showSecondaryButton;
        }
        InterfaceC35243c interfaceC35243c4 = interfaceC35243c3;
        boolean z13 = z4;
        TextResource textResource4 = textResource3;
        InterfaceC35243c interfaceC35243c5 = interfaceC35243c2;
        return c35258j0.m111735f(abstractC33208p0, textResource, textResource2, interfaceC35243c, textResource4, interfaceC35243c5, interfaceC35243c4, z13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35258j0)) {
            return false;
        }
        C35258j0 c35258j0 = (C35258j0) other;
        return AbstractC22676k.m65745e(this.type, c35258j0.type) && AbstractC22676k.m65745e(this.supportText, c35258j0.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, c35258j0.primaryButtonText) && AbstractC22676k.m65745e(this.primaryClickEvent, c35258j0.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, c35258j0.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryClickEvent, c35258j0.secondaryClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, c35258j0.followUpEvent) && this.showSecondaryButton == c35258j0.showSecondaryButton;
    }

    /* JADX INFO: renamed from: f */
    public final C35258j0 m111735f(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC35243c primaryClickEvent, TextResource secondaryButtonText, InterfaceC35243c secondaryClickEvent, InterfaceC35243c followUpEvent, boolean showSecondaryButton) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(supportText, "supportText");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        return new C35258j0(type, supportText, primaryButtonText, primaryClickEvent, secondaryButtonText, secondaryClickEvent, followUpEvent, showSecondaryButton);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC35243c getFollowUpEvent() {
        return this.followUpEvent;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
        InterfaceC35243c interfaceC35243c = this.primaryClickEvent;
        int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC35243c == null ? 0 : interfaceC35243c.hashCode())) * 31, this.secondaryButtonText, 31);
        InterfaceC35243c interfaceC35243c2 = this.secondaryClickEvent;
        int iHashCode = (iM95625a2 + (interfaceC35243c2 == null ? 0 : interfaceC35243c2.hashCode())) * 31;
        InterfaceC35243c interfaceC35243c3 = this.followUpEvent;
        return Boolean.hashCode(this.showSecondaryButton) + ((iHashCode + (interfaceC35243c3 != null ? interfaceC35243c3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC35243c getPrimaryClickEvent() {
        return this.primaryClickEvent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC35243c getSecondaryClickEvent() {
        return this.secondaryClickEvent;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowSecondaryButton() {
        return this.showSecondaryButton;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getSupportText() {
        return this.supportText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final AbstractC33208p0 getType() {
        return this.type;
    }

    public String toString() {
        AbstractC33208p0 abstractC33208p0 = this.type;
        TextResource textResource = this.supportText;
        TextResource textResource2 = this.primaryButtonText;
        InterfaceC35243c interfaceC35243c = this.primaryClickEvent;
        TextResource textResource3 = this.secondaryButtonText;
        InterfaceC35243c interfaceC35243c2 = this.secondaryClickEvent;
        InterfaceC35243c interfaceC35243c3 = this.followUpEvent;
        boolean z4 = this.showSecondaryButton;
        StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
        sbM30862n.append(textResource2);
        sbM30862n.append(", primaryClickEvent=");
        sbM30862n.append(interfaceC35243c);
        sbM30862n.append(", secondaryButtonText=");
        sbM30862n.append(textResource3);
        sbM30862n.append(", secondaryClickEvent=");
        sbM30862n.append(interfaceC35243c2);
        sbM30862n.append(", followUpEvent=");
        sbM30862n.append(interfaceC35243c3);
        sbM30862n.append(", showSecondaryButton=");
        sbM30862n.append(z4);
        sbM30862n.append(")");
        return sbM30862n.toString();
    }

    public /* synthetic */ C35258j0(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC35243c interfaceC35243c, TextResource textResource3, InterfaceC35243c interfaceC35243c2, InterfaceC35243c interfaceC35243c3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC35243c, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC35243c2, (i13 & 64) == 0 ? interfaceC35243c3 : null, (i13 & 128) != 0 ? false : z4);
    }
}
