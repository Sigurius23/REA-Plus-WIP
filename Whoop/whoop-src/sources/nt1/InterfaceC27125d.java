package nt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;

/* JADX INFO: renamed from: nt1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lnt1/d;", "", "a", "b", "Lnt1/d$a;", "Lnt1/d$b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27125d {

    /* JADX INFO: renamed from: nt1.d$b */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b\u001f\u00102R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lnt1/d$b;", "Lnt1/d;", "", "icon", "Lcom/whoop/design/util/TextResource;", "pageTitle", "Lkd1/o;", "backgroundImage", "title", "body", "", "conditions", "Lnt1/i;", "regionPicker", "Lnt1/b;", "acknowledgeAllToggle", "buttonLabel", "Lcom/whoop/navigation/e;", "destination", "<init>", "(ILcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lnt1/i;Lnt1/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "Lkd1/o;", "()Lkd1/o;", "d", "i", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lnt1/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lnt1/i;", "Lnt1/b;", "()Lnt1/b;", "j", "Lcom/whoop/navigation/e;", "getDestination", "()Lcom/whoop/navigation/e;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27125d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource pageTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC22403o backgroundImage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<TextResource> conditions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C27130i regionPicker;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C27123b acknowledgeAllToggle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource buttonLabel;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i13, TextResource pageTitle, AbstractC22403o backgroundImage, TextResource title, TextResource body, List<? extends TextResource> conditions, C27130i regionPicker, C27123b acknowledgeAllToggle, TextResource buttonLabel, C9598e destination) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(conditions, "conditions");
            AbstractC22676k.m65750j(regionPicker, "regionPicker");
            AbstractC22676k.m65750j(acknowledgeAllToggle, "acknowledgeAllToggle");
            AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
            AbstractC22676k.m65750j(destination, "destination");
            this.icon = i13;
            this.pageTitle = pageTitle;
            this.backgroundImage = backgroundImage;
            this.title = title;
            this.body = body;
            this.conditions = conditions;
            this.regionPicker = regionPicker;
            this.acknowledgeAllToggle = acknowledgeAllToggle;
            this.buttonLabel = buttonLabel;
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27123b getAcknowledgeAllToggle() {
            return this.acknowledgeAllToggle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC22403o getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getButtonLabel() {
            return this.buttonLabel;
        }

        /* JADX INFO: renamed from: e */
        public final List<TextResource> m81539e() {
            return this.conditions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.icon == bVar.icon && AbstractC22676k.m65745e(this.pageTitle, bVar.pageTitle) && AbstractC22676k.m65745e(this.backgroundImage, bVar.backgroundImage) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.body, bVar.body) && AbstractC22676k.m65745e(this.conditions, bVar.conditions) && AbstractC22676k.m65745e(this.regionPicker, bVar.regionPicker) && AbstractC22676k.m65745e(this.acknowledgeAllToggle, bVar.acknowledgeAllToggle) && AbstractC22676k.m65745e(this.buttonLabel, bVar.buttonLabel) && AbstractC22676k.m65745e(this.destination, bVar.destination);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getPageTitle() {
            return this.pageTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C27130i getRegionPicker() {
            return this.regionPicker;
        }

        public int hashCode() {
            return this.destination.hashCode() + AbstractC31061c.m95625a((this.acknowledgeAllToggle.hashCode() + ((this.regionPicker.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.backgroundImage, AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.pageTitle, 31), 31), this.title, 31), this.body, 31), 31, this.conditions)) * 31)) * 31, this.buttonLabel, 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.pageTitle;
            AbstractC22403o abstractC22403o = this.backgroundImage;
            TextResource textResource2 = this.title;
            TextResource textResource3 = this.body;
            List<TextResource> list = this.conditions;
            C27130i c27130i = this.regionPicker;
            C27123b c27123b = this.acknowledgeAllToggle;
            TextResource textResource4 = this.buttonLabel;
            C9598e c9598e = this.destination;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(icon=", i13, ", pageTitle=", textResource, ", backgroundImage=");
            AbstractC13673n.m38549A(sbM91844n, abstractC22403o, ", title=", textResource2, ", body=");
            AbstractC21702c.m61143n(textResource3, ", conditions=", ", regionPicker=", sbM91844n, list);
            sbM91844n.append(c27130i);
            sbM91844n.append(", acknowledgeAllToggle=");
            sbM91844n.append(c27123b);
            sbM91844n.append(", buttonLabel=");
            sbM91844n.append(textResource4);
            sbM91844n.append(", destination=");
            sbM91844n.append(c9598e);
            sbM91844n.append(")");
            return sbM91844n.toString();
        }
    }

    /* JADX INFO: renamed from: nt1.d$a */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b!\u0010%¨\u0006("}, m65681d2 = {"Lnt1/d$a;", "Lnt1/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lnt1/a;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lnt1/a;Lcom/whoop/design/util/TextResource;Lnt1/a;Lnt1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "i", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "e", "d", "Lnt1/a;", "()Lnt1/a;", "g", "f", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC27125d {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i */
        public static final int f108429i = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: j */
        private static final a f108430j = new a(AbstractC33208p0.c.f138471e, null, null, null, null, null, null, 126, null);

        /* JADX INFO: renamed from: k */
        private static final a f108431k = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC31794f.f131688v0), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC31794f.f131665k), InterfaceC27122a.d.f108402a, AbstractC8693b.m21277k(AbstractC31794f.f131649c), InterfaceC27122a.a.f108400a, null, 66, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC27122a primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC27122a secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC27122a followUpEvent;

        /* JADX INFO: renamed from: nt1.d$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lnt1/d$a$a;", "", "<init>", "()V", "Lnt1/d$a;", "loading", "Lnt1/d$a;", "b", "()Lnt1/d$a;", "loadScreenError", "a", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m81533a() {
                return a.f108431k;
            }

            /* JADX INFO: renamed from: b */
            public final a m81534b() {
                return a.f108430j;
            }

            private Companion() {
            }
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC27122a interfaceC27122a, TextResource secondaryButtonText, InterfaceC27122a interfaceC27122a2, InterfaceC27122a interfaceC27122a3) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC27122a;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC27122a2;
            this.followUpEvent = interfaceC27122a3;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC27122a getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC27122a getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, aVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, aVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, aVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, aVar.followUpEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC27122a getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC27122a interfaceC27122a = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC27122a == null ? 0 : interfaceC27122a.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC27122a interfaceC27122a2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC27122a2 == null ? 0 : interfaceC27122a2.hashCode())) * 31;
            InterfaceC27122a interfaceC27122a3 = this.followUpEvent;
            return iHashCode + (interfaceC27122a3 != null ? interfaceC27122a3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC27122a interfaceC27122a = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC27122a interfaceC27122a2 = this.secondaryButtonClickEvent;
            InterfaceC27122a interfaceC27122a3 = this.followUpEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC27122a);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC27122a2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC27122a3);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC27122a interfaceC27122a, TextResource textResource3, InterfaceC27122a interfaceC27122a2, InterfaceC27122a interfaceC27122a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC27122a, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC27122a2, (i13 & 64) != 0 ? null : interfaceC27122a3);
        }
    }
}
