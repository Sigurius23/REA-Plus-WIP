package rt1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import qt1.C30588b;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rt1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lrt1/h;", "", "a", "b", "Lrt1/h$a;", "Lrt1/h$b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31810h {

    /* JADX INFO: renamed from: rt1.h$a */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001\u001cB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b+\u0010.¨\u0006/"}, m65681d2 = {"Lrt1/h$a;", "Lrt1/h;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lrt1/b;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "", "overlayBackground", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;Lcom/whoop/design/util/TextResource;Lrt1/b;Lrt1/b;Z)V", "c", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;Lcom/whoop/design/util/TextResource;Lrt1/b;Lrt1/b;Z)Lrt1/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "l", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Lrt1/b;", "g", "()Lrt1/b;", "e", "j", "f", "i", "Z", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC31810h {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: j */
        public static final int f131767j = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: k */
        private static final a f131768k;

        /* JADX INFO: renamed from: l */
        private static final a f131769l;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC31804b primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC31804b secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC31804b followUpEvent;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean overlayBackground;

        /* JADX INFO: renamed from: rt1.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lrt1/h$a$a;", "", "<init>", "()V", "Lrt1/h$a;", "loading", "Lrt1/h$a;", "a", "()Lrt1/h$a;", "strapConnectionError", "b", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m98830a() {
                return a.f131768k;
            }

            /* JADX INFO: renamed from: b */
            public final a m98831b() {
                return a.f131769l;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            InterfaceC31804b interfaceC31804b = null;
            f131768k = new a(AbstractC33208p0.c.f138471e, null, null, null, null, null, interfaceC31804b, false, 254, null);
            f131769l = new a(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC31794f.f131630L, null, 2, null), false, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0), new TextResource.C8688b(AbstractC31794f.f131629K, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131649c, null, 2, null), null, 0 == true ? 1 : 0, interfaceC31804b, null, true, 120, null);
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC31804b interfaceC31804b, TextResource secondaryButtonText, InterfaceC31804b interfaceC31804b2, InterfaceC31804b interfaceC31804b3, boolean z4) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC31804b;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC31804b2;
            this.followUpEvent = interfaceC31804b3;
            this.overlayBackground = z4;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ a m98820d(a aVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC31804b interfaceC31804b, TextResource textResource3, InterfaceC31804b interfaceC31804b2, InterfaceC31804b interfaceC31804b3, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = aVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = aVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = aVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC31804b = aVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = aVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC31804b2 = aVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC31804b3 = aVar.followUpEvent;
            }
            if ((i13 & 128) != 0) {
                z4 = aVar.overlayBackground;
            }
            InterfaceC31804b interfaceC31804b4 = interfaceC31804b3;
            boolean z13 = z4;
            TextResource textResource4 = textResource3;
            InterfaceC31804b interfaceC31804b5 = interfaceC31804b2;
            return aVar.m98821c(abstractC33208p0, textResource, textResource2, interfaceC31804b, textResource4, interfaceC31804b5, interfaceC31804b4, z13);
        }

        /* JADX INFO: renamed from: c */
        public final a m98821c(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC31804b primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC31804b secondaryButtonClickEvent, InterfaceC31804b followUpEvent, boolean overlayBackground) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new a(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent, overlayBackground);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC31804b getFollowUpEvent() {
            return this.followUpEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, aVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, aVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, aVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, aVar.followUpEvent) && this.overlayBackground == aVar.overlayBackground;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getOverlayBackground() {
            return this.overlayBackground;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC31804b getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC31804b == null ? 0 : interfaceC31804b.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC31804b interfaceC31804b2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC31804b2 == null ? 0 : interfaceC31804b2.hashCode())) * 31;
            InterfaceC31804b interfaceC31804b3 = this.followUpEvent;
            return Boolean.hashCode(this.overlayBackground) + ((iHashCode + (interfaceC31804b3 != null ? interfaceC31804b3.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final InterfaceC31804b getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC31804b interfaceC31804b2 = this.secondaryButtonClickEvent;
            InterfaceC31804b interfaceC31804b3 = this.followUpEvent;
            boolean z4 = this.overlayBackground;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC31804b);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC31804b2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC31804b3);
            sbM30862n.append(", overlayBackground=");
            sbM30862n.append(z4);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC31804b interfaceC31804b, TextResource textResource3, InterfaceC31804b interfaceC31804b2, InterfaceC31804b interfaceC31804b3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC31804b, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC31804b2, (i13 & 64) == 0 ? interfaceC31804b3 : null, (i13 & 128) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: rt1.h$b */
    @Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001+BÍ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJÖ\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b\f\u0010=R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\bD\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b8\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\bQ\u0010=R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bO\u0010R\u001a\u0004\b?\u0010S¨\u0006T"}, m65681d2 = {"Lrt1/h$b;", "Lrt1/h;", "Lcom/whoop/design/util/TextResource;", "pageTitle", "heartRateUnit", "countDownTimeUnit", "primaryButtonText", "labradorReadingStatusTitle", "labradorReadingStatusSubTitle", "labradorReadingDisclaimer", "", "isInstructionImageVisible", "isLabradorGraphVisible", "isCheckmarkVisible", "Lrt1/c;", "readingFailedDialogViewState", "Lrt1/d;", "readingInitialInconclusiveDialogViewState", "heartRateReading", "Lrt1/e;", "labradorReadingProgress", "Lrt1/k;", "symptomsBottomSheetViewState", "", "Lqt1/b;", "lineData", "readingUnsuccessful", "Lrt1/a;", "calibration", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLrt1/c;Lrt1/d;Lcom/whoop/design/util/TextResource;Lrt1/e;Lrt1/k;Ljava/util/List;ZLrt1/a;)Lrt1/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "s", "()Lcom/whoop/design/util/TextResource;", "b", "m", "c", "k", "d", "t", "e", "q", "f", "p", "g", "n", "Z", "y", "()Z", "i", "j", "x", "Lrt1/c;", "u", "()Lrt1/c;", "l", "Lrt1/d;", "v", "()Lrt1/d;", "Lrt1/e;", "o", "()Lrt1/e;", "Lrt1/k;", "getSymptomsBottomSheetViewState", "()Lrt1/k;", "Ljava/util/List;", "r", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lrt1/a;", "()Lrt1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC31810h {

        /* JADX INFO: renamed from: A */
        private static final b f131778A;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t */
        public static final int f131780t = 8;

        /* JADX INFO: renamed from: u */
        private static final b f131781u;

        /* JADX INFO: renamed from: v */
        private static final b f131782v;

        /* JADX INFO: renamed from: w */
        private static final b f131783w;

        /* JADX INFO: renamed from: x */
        private static final b f131784x;

        /* JADX INFO: renamed from: y */
        private static final b f131785y;

        /* JADX INFO: renamed from: z */
        private static final b f131786z;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource pageTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource heartRateUnit;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource countDownTimeUnit;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource labradorReadingStatusTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource labradorReadingStatusSubTitle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource labradorReadingDisclaimer;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isInstructionImageVisible;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isLabradorGraphVisible;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isCheckmarkVisible;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C31805c readingFailedDialogViewState;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C31806d readingInitialInconclusiveDialogViewState;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource heartRateReading;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final C31807e labradorReadingProgress;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C31813k symptomsBottomSheetViewState;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final List<C30588b> lineData;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final boolean readingUnsuccessful;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final C31803a calibration;

        /* JADX INFO: renamed from: rt1.h$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lrt1/h$b$a;", "", "<init>", "()V", "Lrt1/h$b;", "initialState", "Lrt1/h$b;", "a", "()Lrt1/h$b;", "readingInProgressState", "d", "readingStopped", "f", "readingCompleted", "b", "readingUnsuccessful", "g", "readingFailed", "c", "readingInitialInconclusive", "e", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m98857a() {
                return b.f131781u;
            }

            /* JADX INFO: renamed from: b */
            public final b m98858b() {
                return b.f131784x;
            }

            /* JADX INFO: renamed from: c */
            public final b m98859c() {
                return b.f131786z;
            }

            /* JADX INFO: renamed from: d */
            public final b m98860d() {
                return b.f131782v;
            }

            /* JADX INFO: renamed from: e */
            public final b m98861e() {
                return b.f131778A;
            }

            /* JADX INFO: renamed from: f */
            public final b m98862f() {
                return b.f131783w;
            }

            /* JADX INFO: renamed from: g */
            public final b m98863g() {
                return b.f131785y;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            TextResource textResource = null;
            b bVar = new b(null, null, null, null, new TextResource.C8688b(AbstractC31794f.f131656f0, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131654e0, null, 2, null), textResource, true, false, false, null, null, null, C31807e.INSTANCE.m98810a((short) 0), null, null, false, null, 253775, null);
            f131781u = bVar;
            TextResource textResource2 = null;
            boolean z4 = true;
            boolean z13 = false;
            Object[] objArr = 0 == true ? 1 : 0;
            f131782v = new b(null, 0 == true ? 1 : 0, textResource2, objArr, new TextResource.C8688b(AbstractC31794f.f131648b0, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131646a0, null, 2, null), null, false, z4, z13, null, null, null, null, null, null, false, null, 261839, null);
            TextResource textResource3 = null;
            boolean z14 = false;
            Object[] objArr2 = 0 == true ? 1 : 0;
            f131783w = new b(0 == true ? 1 : 0, textResource2, objArr2, textResource3, new TextResource.C8688b(AbstractC31794f.f131639U, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131638T, null, 2, null), null, z4, z13, z14, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, null, 261967, null);
            TextResource textResource4 = null;
            f131784x = new b(textResource2, 0 == true ? 1 : 0, textResource3, textResource4, new TextResource.C8688b(AbstractC31794f.f131660h0, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131658g0, null, 2, null), null, z13, z14, true, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, null, 261583, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            f131785y = new b(objArr3, textResource3, textResource4, new TextResource.C8688b(AbstractC31794f.f131657g, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131666k0, null, 2, null), new TextResource.C8688b(AbstractC31794f.f131664j0, null, 2, null), null, z14, false, false, new C31805c(0, null, null, textResource, InterfaceC31804b.f.f131725a, null, InterfaceC31804b.d.f131724a, 47, 0 == true ? 1 : 0), objArr4, objArr5, objArr6, objArr7, null, true, null, 195527, null);
            TextResource textResource5 = null;
            TextResource textResource6 = null;
            f131786z = m98839i(bVar, null, null, null, null, null, null, null, false, false, false, new C31805c(0, null, textResource5, textResource6, InterfaceC31804b.a.f131721a, null, InterfaceC31804b.b.f131722a, 47, 0 == true ? 1 : 0), null, null, null, null, null, false, null, 261119, null);
            f131778A = m98839i(bVar, null, null, null, null, null, null, null, false, false, false, null, new C31806d(0, textResource5, textResource6, null, InterfaceC31804b.c.f131723a, 15, null), null, null, null, null, false, null, 260095, null);
        }

        public b(TextResource pageTitle, TextResource heartRateUnit, TextResource countDownTimeUnit, TextResource primaryButtonText, TextResource labradorReadingStatusTitle, TextResource labradorReadingStatusSubTitle, TextResource labradorReadingDisclaimer, boolean z4, boolean z13, boolean z14, C31805c c31805c, C31806d c31806d, TextResource textResource, C31807e c31807e, C31813k c31813k, List<C30588b> list, boolean z15, C31803a calibration) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(heartRateUnit, "heartRateUnit");
            AbstractC22676k.m65750j(countDownTimeUnit, "countDownTimeUnit");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(labradorReadingStatusTitle, "labradorReadingStatusTitle");
            AbstractC22676k.m65750j(labradorReadingStatusSubTitle, "labradorReadingStatusSubTitle");
            AbstractC22676k.m65750j(labradorReadingDisclaimer, "labradorReadingDisclaimer");
            AbstractC22676k.m65750j(calibration, "calibration");
            this.pageTitle = pageTitle;
            this.heartRateUnit = heartRateUnit;
            this.countDownTimeUnit = countDownTimeUnit;
            this.primaryButtonText = primaryButtonText;
            this.labradorReadingStatusTitle = labradorReadingStatusTitle;
            this.labradorReadingStatusSubTitle = labradorReadingStatusSubTitle;
            this.labradorReadingDisclaimer = labradorReadingDisclaimer;
            this.isInstructionImageVisible = z4;
            this.isLabradorGraphVisible = z13;
            this.isCheckmarkVisible = z14;
            this.readingFailedDialogViewState = c31805c;
            this.readingInitialInconclusiveDialogViewState = c31806d;
            this.heartRateReading = textResource;
            this.labradorReadingProgress = c31807e;
            this.symptomsBottomSheetViewState = c31813k;
            this.lineData = list;
            this.readingUnsuccessful = z15;
            this.calibration = calibration;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ b m98839i(b bVar, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, boolean z4, boolean z13, boolean z14, C31805c c31805c, C31806d c31806d, TextResource textResource8, C31807e c31807e, C31813k c31813k, List list, boolean z15, C31803a c31803a, int i13, Object obj) {
            C31803a c31803a2;
            boolean z16;
            TextResource textResource9 = (i13 & 1) != 0 ? bVar.pageTitle : textResource;
            TextResource textResource10 = (i13 & 2) != 0 ? bVar.heartRateUnit : textResource2;
            TextResource textResource11 = (i13 & 4) != 0 ? bVar.countDownTimeUnit : textResource3;
            TextResource textResource12 = (i13 & 8) != 0 ? bVar.primaryButtonText : textResource4;
            TextResource textResource13 = (i13 & 16) != 0 ? bVar.labradorReadingStatusTitle : textResource5;
            TextResource textResource14 = (i13 & 32) != 0 ? bVar.labradorReadingStatusSubTitle : textResource6;
            TextResource textResource15 = (i13 & 64) != 0 ? bVar.labradorReadingDisclaimer : textResource7;
            boolean z17 = (i13 & 128) != 0 ? bVar.isInstructionImageVisible : z4;
            boolean z18 = (i13 & 256) != 0 ? bVar.isLabradorGraphVisible : z13;
            boolean z19 = (i13 & 512) != 0 ? bVar.isCheckmarkVisible : z14;
            C31805c c31805c2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? bVar.readingFailedDialogViewState : c31805c;
            C31806d c31806d2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? bVar.readingInitialInconclusiveDialogViewState : c31806d;
            TextResource textResource16 = (i13 & 4096) != 0 ? bVar.heartRateReading : textResource8;
            C31807e c31807e2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? bVar.labradorReadingProgress : c31807e;
            TextResource textResource17 = textResource9;
            C31813k c31813k2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? bVar.symptomsBottomSheetViewState : c31813k;
            List list2 = (i13 & 32768) != 0 ? bVar.lineData : list;
            boolean z24 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? bVar.readingUnsuccessful : z15;
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
                z16 = z24;
                c31803a2 = bVar.calibration;
            } else {
                c31803a2 = c31803a;
                z16 = z24;
            }
            return bVar.m98840h(textResource17, textResource10, textResource11, textResource12, textResource13, textResource14, textResource15, z17, z18, z19, c31805c2, c31806d2, textResource16, c31807e2, c31813k2, list2, z16, c31803a2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.pageTitle, bVar.pageTitle) && AbstractC22676k.m65745e(this.heartRateUnit, bVar.heartRateUnit) && AbstractC22676k.m65745e(this.countDownTimeUnit, bVar.countDownTimeUnit) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.labradorReadingStatusTitle, bVar.labradorReadingStatusTitle) && AbstractC22676k.m65745e(this.labradorReadingStatusSubTitle, bVar.labradorReadingStatusSubTitle) && AbstractC22676k.m65745e(this.labradorReadingDisclaimer, bVar.labradorReadingDisclaimer) && this.isInstructionImageVisible == bVar.isInstructionImageVisible && this.isLabradorGraphVisible == bVar.isLabradorGraphVisible && this.isCheckmarkVisible == bVar.isCheckmarkVisible && AbstractC22676k.m65745e(this.readingFailedDialogViewState, bVar.readingFailedDialogViewState) && AbstractC22676k.m65745e(this.readingInitialInconclusiveDialogViewState, bVar.readingInitialInconclusiveDialogViewState) && AbstractC22676k.m65745e(this.heartRateReading, bVar.heartRateReading) && AbstractC22676k.m65745e(this.labradorReadingProgress, bVar.labradorReadingProgress) && AbstractC22676k.m65745e(this.symptomsBottomSheetViewState, bVar.symptomsBottomSheetViewState) && AbstractC22676k.m65745e(this.lineData, bVar.lineData) && this.readingUnsuccessful == bVar.readingUnsuccessful && AbstractC22676k.m65745e(this.calibration, bVar.calibration);
        }

        /* JADX INFO: renamed from: h */
        public final b m98840h(TextResource pageTitle, TextResource heartRateUnit, TextResource countDownTimeUnit, TextResource primaryButtonText, TextResource labradorReadingStatusTitle, TextResource labradorReadingStatusSubTitle, TextResource labradorReadingDisclaimer, boolean isInstructionImageVisible, boolean isLabradorGraphVisible, boolean isCheckmarkVisible, C31805c readingFailedDialogViewState, C31806d readingInitialInconclusiveDialogViewState, TextResource heartRateReading, C31807e labradorReadingProgress, C31813k symptomsBottomSheetViewState, List<C30588b> lineData, boolean readingUnsuccessful, C31803a calibration) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(heartRateUnit, "heartRateUnit");
            AbstractC22676k.m65750j(countDownTimeUnit, "countDownTimeUnit");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(labradorReadingStatusTitle, "labradorReadingStatusTitle");
            AbstractC22676k.m65750j(labradorReadingStatusSubTitle, "labradorReadingStatusSubTitle");
            AbstractC22676k.m65750j(labradorReadingDisclaimer, "labradorReadingDisclaimer");
            AbstractC22676k.m65750j(calibration, "calibration");
            return new b(pageTitle, heartRateUnit, countDownTimeUnit, primaryButtonText, labradorReadingStatusTitle, labradorReadingStatusSubTitle, labradorReadingDisclaimer, isInstructionImageVisible, isLabradorGraphVisible, isCheckmarkVisible, readingFailedDialogViewState, readingInitialInconclusiveDialogViewState, heartRateReading, labradorReadingProgress, symptomsBottomSheetViewState, lineData, readingUnsuccessful, calibration);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.pageTitle.hashCode() * 31, this.heartRateUnit, 31), this.countDownTimeUnit, 31), this.primaryButtonText, 31), this.labradorReadingStatusTitle, 31), this.labradorReadingStatusSubTitle, 31), this.labradorReadingDisclaimer, 31), 31, this.isInstructionImageVisible), 31, this.isLabradorGraphVisible), 31, this.isCheckmarkVisible);
            C31805c c31805c = this.readingFailedDialogViewState;
            int iHashCode = (iM8289b + (c31805c == null ? 0 : c31805c.hashCode())) * 31;
            C31806d c31806d = this.readingInitialInconclusiveDialogViewState;
            int iHashCode2 = (iHashCode + (c31806d == null ? 0 : c31806d.hashCode())) * 31;
            TextResource textResource = this.heartRateReading;
            int iHashCode3 = (iHashCode2 + (textResource == null ? 0 : textResource.hashCode())) * 31;
            C31807e c31807e = this.labradorReadingProgress;
            int iHashCode4 = (iHashCode3 + (c31807e == null ? 0 : c31807e.hashCode())) * 31;
            C31813k c31813k = this.symptomsBottomSheetViewState;
            int iHashCode5 = (iHashCode4 + (c31813k == null ? 0 : c31813k.hashCode())) * 31;
            List<C30588b> list = this.lineData;
            return this.calibration.hashCode() + AbstractC2875y.m8289b((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31, 31, this.readingUnsuccessful);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C31803a getCalibration() {
            return this.calibration;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getCountDownTimeUnit() {
            return this.countDownTimeUnit;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getHeartRateReading() {
            return this.heartRateReading;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getHeartRateUnit() {
            return this.heartRateUnit;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getLabradorReadingDisclaimer() {
            return this.labradorReadingDisclaimer;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final C31807e getLabradorReadingProgress() {
            return this.labradorReadingProgress;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final TextResource getLabradorReadingStatusSubTitle() {
            return this.labradorReadingStatusSubTitle;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final TextResource getLabradorReadingStatusTitle() {
            return this.labradorReadingStatusTitle;
        }

        /* JADX INFO: renamed from: r */
        public final List<C30588b> m98849r() {
            return this.lineData;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final TextResource getPageTitle() {
            return this.pageTitle;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public String toString() {
            TextResource textResource = this.pageTitle;
            TextResource textResource2 = this.heartRateUnit;
            TextResource textResource3 = this.countDownTimeUnit;
            TextResource textResource4 = this.primaryButtonText;
            TextResource textResource5 = this.labradorReadingStatusTitle;
            TextResource textResource6 = this.labradorReadingStatusSubTitle;
            TextResource textResource7 = this.labradorReadingDisclaimer;
            boolean z4 = this.isInstructionImageVisible;
            boolean z13 = this.isLabradorGraphVisible;
            boolean z14 = this.isCheckmarkVisible;
            C31805c c31805c = this.readingFailedDialogViewState;
            C31806d c31806d = this.readingInitialInconclusiveDialogViewState;
            TextResource textResource8 = this.heartRateReading;
            C31807e c31807e = this.labradorReadingProgress;
            C31813k c31813k = this.symptomsBottomSheetViewState;
            List<C30588b> list = this.lineData;
            boolean z15 = this.readingUnsuccessful;
            C31803a c31803a = this.calibration;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("Loaded(pageTitle=", textResource, ", heartRateUnit=", textResource2, ", countDownTimeUnit=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", primaryButtonText=", textResource4, ", labradorReadingStatusTitle=");
            AbstractC30007c.m91855y(sbM106658q, textResource5, ", labradorReadingStatusSubTitle=", textResource6, ", labradorReadingDisclaimer=");
            AbstractC33745d.m106664w(textResource7, ", isInstructionImageVisible=", ", isLabradorGraphVisible=", sbM106658q, z4);
            AbstractC38963t7.m124392v(sbM106658q, z13, ", isCheckmarkVisible=", z14, ", readingFailedDialogViewState=");
            sbM106658q.append(c31805c);
            sbM106658q.append(", readingInitialInconclusiveDialogViewState=");
            sbM106658q.append(c31806d);
            sbM106658q.append(", heartRateReading=");
            sbM106658q.append(textResource8);
            sbM106658q.append(", labradorReadingProgress=");
            sbM106658q.append(c31807e);
            sbM106658q.append(", symptomsBottomSheetViewState=");
            sbM106658q.append(c31813k);
            sbM106658q.append(", lineData=");
            sbM106658q.append(list);
            sbM106658q.append(", readingUnsuccessful=");
            sbM106658q.append(z15);
            sbM106658q.append(", calibration=");
            sbM106658q.append(c31803a);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final C31805c getReadingFailedDialogViewState() {
            return this.readingFailedDialogViewState;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final C31806d getReadingInitialInconclusiveDialogViewState() {
            return this.readingInitialInconclusiveDialogViewState;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getReadingUnsuccessful() {
            return this.readingUnsuccessful;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getIsCheckmarkVisible() {
            return this.isCheckmarkVisible;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getIsInstructionImageVisible() {
            return this.isInstructionImageVisible;
        }

        public /* synthetic */ b(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, boolean z4, boolean z13, boolean z14, C31805c c31805c, C31806d c31806d, TextResource textResource8, C31807e c31807e, C31813k c31813k, List list, boolean z15, C31803a c31803a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC31794f.f131662i0, null, 2, null) : textResource, (i13 & 2) != 0 ? new TextResource.C8688b(AbstractC31794f.f131644Z, null, 2, null) : textResource2, (i13 & 4) != 0 ? new TextResource.C8688b(AbstractC31794f.f131640V, null, 2, null) : textResource3, (i13 & 8) != 0 ? new TextResource.C8688b(AbstractC31794f.f131649c, null, 2, null) : textResource4, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource5, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource6, (i13 & 64) != 0 ? new TextResource.C8688b(AbstractC31794f.f131641W, null, 2, null) : textResource7, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c31805c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c31806d, (i13 & 4096) != 0 ? null : textResource8, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c31807e, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c31813k, (i13 & 32768) != 0 ? null : list, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z15, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? new C31803a(false, null, null, 7, null) : c31803a);
        }
    }
}
