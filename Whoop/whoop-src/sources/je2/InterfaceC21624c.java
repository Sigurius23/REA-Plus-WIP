package je2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import gy0.AbstractC16272a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd2.AbstractC22415a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: je2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lje2/c;", "", "a", "b", "Lje2/c$a;", "Lje2/c$b;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21624c {

    /* JADX INFO: renamed from: je2.c$b */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lje2/c$b;", "Lje2/c;", "", "icon", "Lcom/whoop/design/util/TextResource;", "pageTitle", "Lje2/f;", "shepherdDetectionToggleViewState", "shepherdNotificationToggleViewState", "Lm91/u;", "aboutCtaTile", "<init>", "(ILcom/whoop/design/util/TextResource;Lje2/f;Lje2/f;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Lje2/f;", "d", "()Lje2/f;", "e", "Lm91/u;", "()Lm91/u;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21624c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource pageTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C21627f shepherdDetectionToggleViewState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C21627f shepherdNotificationToggleViewState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25312u aboutCtaTile;

        public b(int i13, TextResource pageTitle, C21627f shepherdDetectionToggleViewState, C21627f shepherdNotificationToggleViewState, InterfaceC25312u aboutCtaTile) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(shepherdDetectionToggleViewState, "shepherdDetectionToggleViewState");
            AbstractC22676k.m65750j(shepherdNotificationToggleViewState, "shepherdNotificationToggleViewState");
            AbstractC22676k.m65750j(aboutCtaTile, "aboutCtaTile");
            this.icon = i13;
            this.pageTitle = pageTitle;
            this.shepherdDetectionToggleViewState = shepherdDetectionToggleViewState;
            this.shepherdNotificationToggleViewState = shepherdNotificationToggleViewState;
            this.aboutCtaTile = aboutCtaTile;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getAboutCtaTile() {
            return this.aboutCtaTile;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPageTitle() {
            return this.pageTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C21627f getShepherdDetectionToggleViewState() {
            return this.shepherdDetectionToggleViewState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C21627f getShepherdNotificationToggleViewState() {
            return this.shepherdNotificationToggleViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.icon == bVar.icon && AbstractC22676k.m65745e(this.pageTitle, bVar.pageTitle) && AbstractC22676k.m65745e(this.shepherdDetectionToggleViewState, bVar.shepherdDetectionToggleViewState) && AbstractC22676k.m65745e(this.shepherdNotificationToggleViewState, bVar.shepherdNotificationToggleViewState) && AbstractC22676k.m65745e(this.aboutCtaTile, bVar.aboutCtaTile);
        }

        public int hashCode() {
            return this.aboutCtaTile.hashCode() + ((this.shepherdNotificationToggleViewState.hashCode() + ((this.shepherdDetectionToggleViewState.hashCode() + AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.pageTitle, 31)) * 31)) * 31);
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.pageTitle;
            C21627f c21627f = this.shepherdDetectionToggleViewState;
            C21627f c21627f2 = this.shepherdNotificationToggleViewState;
            InterfaceC25312u interfaceC25312u = this.aboutCtaTile;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(icon=", i13, ", pageTitle=", textResource, ", shepherdDetectionToggleViewState=");
            sbM91844n.append(c21627f);
            sbM91844n.append(", shepherdNotificationToggleViewState=");
            sbM91844n.append(c21627f2);
            sbM91844n.append(", aboutCtaTile=");
            sbM91844n.append(interfaceC25312u);
            sbM91844n.append(")");
            return sbM91844n.toString();
        }
    }

    /* JADX INFO: renamed from: je2.c$a */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u001bBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b,\u0010(¨\u0006-"}, m65681d2 = {"Lje2/c$a;", "Lje2/c;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lje2/a;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lje2/a;Lcom/whoop/design/util/TextResource;Lje2/a;Lje2/a;)V", "e", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lje2/a;Lcom/whoop/design/util/TextResource;Lje2/a;Lje2/a;)Lje2/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "m", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "i", "d", "Lje2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lje2/a;", "k", "f", "j", "g", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21624c {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i */
        public static final int f83023i = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: j */
        private static final a f83024j;

        /* JADX INFO: renamed from: k */
        private static final a f83025k;

        /* JADX INFO: renamed from: l */
        private static final a f83026l;

        /* JADX INFO: renamed from: m */
        private static final a f83027m;

        /* JADX INFO: renamed from: n */
        private static final a f83028n;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC21622a primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC21622a secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC21622a followUpEvent;

        /* JADX INFO: renamed from: je2.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lje2/c$a$a;", "", "<init>", "()V", "Lje2/c$a;", "loading", "Lje2/c$a;", "c", "()Lje2/c$a;", "saving", "d", "loadScreenError", "b", "failedToUpdate", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m60852a() {
                return a.f83028n;
            }

            /* JADX INFO: renamed from: b */
            public final a m60853b() {
                return a.f83027m;
            }

            /* JADX INFO: renamed from: c */
            public final a m60854c() {
                return a.f83024j;
            }

            /* JADX INFO: renamed from: d */
            public final a m60855d() {
                return a.f83026l;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            TextResource textResource = null;
            f83024j = new a(AbstractC33208p0.c.f138471e, null, textResource, null, null, null, null, 126, null);
            InterfaceC21622a interfaceC21622a = null;
            f83025k = new a(AbstractC33208p0.a.f138465e, textResource, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC21622a, 126, null);
            Object[] objArr = 0 == true ? 1 : 0;
            f83026l = new a(new AbstractC33208p0.e(objArr, AbstractC16272a.f61976O4, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC21622a, null, 126, null);
            InterfaceC21622a interfaceC21622a2 = null;
            f83027m = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87693j), false, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0), null, new TextResource.C8688b(AbstractC22415a.f87691h, null, 2, null), InterfaceC21622a.f.f82994a, AbstractC8693b.m21277k(AbstractC22415a.f87692i), InterfaceC21622a.b.f82990a, interfaceC21622a2, 66, null);
            f83028n = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87689f), false, null, 6, null), AbstractC8693b.m21277k(AbstractC22415a.f87690g), AbstractC8693b.m21277k(AbstractC22415a.f87691h), null, AbstractC8693b.m21277k(AbstractC22415a.f87692i), interfaceC21622a2, null, 104, null);
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC21622a interfaceC21622a, TextResource secondaryButtonText, InterfaceC21622a interfaceC21622a2, InterfaceC21622a interfaceC21622a3) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC21622a;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC21622a2;
            this.followUpEvent = interfaceC21622a3;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ a m60843f(a aVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC21622a interfaceC21622a, TextResource textResource3, InterfaceC21622a interfaceC21622a2, InterfaceC21622a interfaceC21622a3, int i13, Object obj) {
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
                interfaceC21622a = aVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = aVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC21622a2 = aVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC21622a3 = aVar.followUpEvent;
            }
            InterfaceC21622a interfaceC21622a4 = interfaceC21622a2;
            InterfaceC21622a interfaceC21622a5 = interfaceC21622a3;
            TextResource textResource4 = textResource3;
            TextResource textResource5 = textResource2;
            return aVar.m60844e(abstractC33208p0, textResource, textResource5, interfaceC21622a, textResource4, interfaceC21622a4, interfaceC21622a5);
        }

        /* JADX INFO: renamed from: e */
        public final a m60844e(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC21622a primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC21622a secondaryButtonClickEvent, InterfaceC21622a followUpEvent) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new a(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent);
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

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC21622a getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC21622a getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC21622a interfaceC21622a = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC21622a == null ? 0 : interfaceC21622a.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC21622a interfaceC21622a2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC21622a2 == null ? 0 : interfaceC21622a2.hashCode())) * 31;
            InterfaceC21622a interfaceC21622a3 = this.followUpEvent;
            return iHashCode + (interfaceC21622a3 != null ? interfaceC21622a3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC21622a getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC21622a interfaceC21622a = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC21622a interfaceC21622a2 = this.secondaryButtonClickEvent;
            InterfaceC21622a interfaceC21622a3 = this.followUpEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC21622a);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC21622a2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC21622a3);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC21622a interfaceC21622a, TextResource textResource3, InterfaceC21622a interfaceC21622a2, InterfaceC21622a interfaceC21622a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC21622a, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC21622a2, (i13 & 64) != 0 ? null : interfaceC21622a3);
        }
    }
}
