package ul1;

import com.whoop.design.util.TextResource;
import fl1.AbstractC14569b;
import gk2.AbstractC15927b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import os0.AbstractC28312h;
import p000.AbstractC13767f0;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ul1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u001a*\u001e \u0018)\u0016\u001c+\"%&B\u008b\u0001\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001e\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b%\u0010\u0019\u0082\u0001\f./0123456789¨\u0006:"}, m65681d2 = {"Lul1/b;", "", "", "isVisible", "Lul1/c;", "type", "Lcom/whoop/design/util/TextResource;", "title", "", "icon", "subtitle", "primaryActionText", "Ly81/e;", "primaryActionTextColor", "secondaryActionText", "useSolidCtaButtons", "isDismissable", "Lj11/p;", "topDialogStyle", "showCloseIcon", "<init>", "(ZLul1/c;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLj11/p;Z)V", "a", "Z", "l", "()Z", "b", "Lul1/c;", "i", "()Lul1/c;", "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "f", "Ly81/e;", "()Ly81/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "k", "Lj11/p;", "()Lj11/p;", "Lul1/b$a;", "Lul1/b$b;", "Lul1/b$c;", "Lul1/b$d;", "Lul1/b$e;", "Lul1/b$f;", "Lul1/b$g;", "Lul1/b$h;", "Lul1/b$i;", "Lul1/b$j;", "Lul1/b$k;", "Lul1/b$l;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35065b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC35066c type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource primaryActionText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e primaryActionTextColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource secondaryActionText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean useSolidCtaButtons;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isDismissable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC21213p topDialogStyle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean showCloseIcon;

    /* JADX INFO: renamed from: ul1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lul1/b$a;", "Lul1/b;", "Lcom/whoop/design/util/TextResource;", "description", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Lcom/whoop/design/util/TextResource;", "getDescription", "()Lcom/whoop/design/util/TextResource;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35065b {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource description) {
            super(true, EnumC35066c.APP_CRASH, new TextResource.C8688b(AbstractC14569b.f53569c, null, 2, null), null, description, new TextResource.C8688b(AbstractC14569b.f53567a, null, 2, null), null, null, false, false, null, false, 3528, null);
            AbstractC22676k.m65750j(description, "description");
            this.description = description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.description, ((a) other).description);
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("AppCrash(description=", this.description, ")");
        }
    }

    /* JADX INFO: renamed from: ul1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$b;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final b f148645m = new b();

        /* JADX INFO: renamed from: n */
        public static final int f148646n = 8;

        private b() {
            super(false, null, null, null, null, null, null, null, false, false, null, false, 4094, null);
        }
    }

    /* JADX INFO: renamed from: ul1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$c;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final c f148647m = new c();

        /* JADX INFO: renamed from: n */
        public static final int f148648n = 8;

        private c() {
            super(false, null, null, null, null, null, null, null, false, false, null, false, 4094, null);
        }
    }

    /* JADX INFO: renamed from: ul1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Lul1/b$d;", "Lul1/b;", "Lcom/whoop/design/util/TextResource;", "titleWithLanguage", "bodyWithLanguage", "secondaryTextWithLanguage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Lcom/whoop/design/util/TextResource;", "getTitleWithLanguage", "()Lcom/whoop/design/util/TextResource;", "n", "getBodyWithLanguage", "o", "getSecondaryTextWithLanguage", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC35065b {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource titleWithLanguage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource bodyWithLanguage;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TextResource secondaryTextWithLanguage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource titleWithLanguage, TextResource bodyWithLanguage, TextResource secondaryTextWithLanguage) {
            super(true, EnumC35066c.PROCESS_FW, titleWithLanguage, null, bodyWithLanguage, new TextResource.C8688b(AbstractC28312h.f114143H, null, 2, null), null, secondaryTextWithLanguage, true, false, EnumC21213p.MARGIN, false, 2632, null);
            AbstractC22676k.m65750j(titleWithLanguage, "titleWithLanguage");
            AbstractC22676k.m65750j(bodyWithLanguage, "bodyWithLanguage");
            AbstractC22676k.m65750j(secondaryTextWithLanguage, "secondaryTextWithLanguage");
            this.titleWithLanguage = titleWithLanguage;
            this.bodyWithLanguage = bodyWithLanguage;
            this.secondaryTextWithLanguage = secondaryTextWithLanguage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.titleWithLanguage, dVar.titleWithLanguage) && AbstractC22676k.m65745e(this.bodyWithLanguage, dVar.bodyWithLanguage) && AbstractC22676k.m65745e(this.secondaryTextWithLanguage, dVar.secondaryTextWithLanguage);
        }

        public int hashCode() {
            return this.secondaryTextWithLanguage.hashCode() + AbstractC31061c.m95625a(this.titleWithLanguage.hashCode() * 31, this.bodyWithLanguage, 31);
        }

        public String toString() {
            TextResource textResource = this.titleWithLanguage;
            TextResource textResource2 = this.bodyWithLanguage;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("FirmwareUpdateDialog(titleWithLanguage=", textResource, ", bodyWithLanguage=", textResource2, ", secondaryTextWithLanguage="), this.secondaryTextWithLanguage, ")");
        }
    }

    /* JADX INFO: renamed from: ul1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lul1/b$e;", "Lul1/b;", "Lcom/whoop/design/util/TextResource;", "titleWithLanguage", "bodyWithLanguage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Lcom/whoop/design/util/TextResource;", "getTitleWithLanguage", "()Lcom/whoop/design/util/TextResource;", "n", "getBodyWithLanguage", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC35065b {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource titleWithLanguage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource bodyWithLanguage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextResource titleWithLanguage, TextResource bodyWithLanguage) {
            super(true, EnumC35066c.PROCESS_FW, titleWithLanguage, null, bodyWithLanguage, new TextResource.C8688b(AbstractC28312h.f114143H, null, 2, null), null, null, true, false, EnumC21213p.MARGIN, false, 2248, null);
            AbstractC22676k.m65750j(titleWithLanguage, "titleWithLanguage");
            AbstractC22676k.m65750j(bodyWithLanguage, "bodyWithLanguage");
            this.titleWithLanguage = titleWithLanguage;
            this.bodyWithLanguage = bodyWithLanguage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.titleWithLanguage, eVar.titleWithLanguage) && AbstractC22676k.m65745e(this.bodyWithLanguage, eVar.bodyWithLanguage);
        }

        public int hashCode() {
            return this.bodyWithLanguage.hashCode() + (this.titleWithLanguage.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("ForcedFirmwareUpdateDialog(titleWithLanguage=", this.titleWithLanguage, ", bodyWithLanguage=", this.bodyWithLanguage, ")");
        }
    }

    /* JADX INFO: renamed from: ul1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Lul1/b$f;", "Lul1/b;", "Lcom/whoop/design/util/TextResource;", "titleWithLanguage", "bodyWithLanguage", "primaryTextWithLanguage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Lcom/whoop/design/util/TextResource;", "getTitleWithLanguage", "()Lcom/whoop/design/util/TextResource;", "n", "getBodyWithLanguage", "o", "getPrimaryTextWithLanguage", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC35065b {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource titleWithLanguage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource bodyWithLanguage;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TextResource primaryTextWithLanguage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextResource titleWithLanguage, TextResource bodyWithLanguage, TextResource primaryTextWithLanguage) {
            super(true, EnumC35066c.PROCESS_FW, titleWithLanguage, null, bodyWithLanguage, primaryTextWithLanguage, null, null, true, false, EnumC21213p.LOTTIE, true, 712, null);
            AbstractC22676k.m65750j(titleWithLanguage, "titleWithLanguage");
            AbstractC22676k.m65750j(bodyWithLanguage, "bodyWithLanguage");
            AbstractC22676k.m65750j(primaryTextWithLanguage, "primaryTextWithLanguage");
            this.titleWithLanguage = titleWithLanguage;
            this.bodyWithLanguage = bodyWithLanguage;
            this.primaryTextWithLanguage = primaryTextWithLanguage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.titleWithLanguage, fVar.titleWithLanguage) && AbstractC22676k.m65745e(this.bodyWithLanguage, fVar.bodyWithLanguage) && AbstractC22676k.m65745e(this.primaryTextWithLanguage, fVar.primaryTextWithLanguage);
        }

        public int hashCode() {
            return this.primaryTextWithLanguage.hashCode() + AbstractC31061c.m95625a(this.titleWithLanguage.hashCode() * 31, this.bodyWithLanguage, 31);
        }

        public String toString() {
            TextResource textResource = this.titleWithLanguage;
            TextResource textResource2 = this.bodyWithLanguage;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("FwUpdateInProgressLockDialog(titleWithLanguage=", textResource, ", bodyWithLanguage=", textResource2, ", primaryTextWithLanguage="), this.primaryTextWithLanguage, ")");
        }
    }

    /* JADX INFO: renamed from: ul1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$g;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final g f148657m = new g();

        /* JADX INFO: renamed from: n */
        public static final int f148658n = 8;

        private g() {
            super(true, EnumC35066c.HARD_TOMBSTONE, new TextResource.C8688b(AbstractC15927b.f60251c, null, 2, null), null, new TextResource.C8688b(AbstractC15927b.f60250b, null, 2, null), new TextResource.C8688b(AbstractC15927b.f60249a, null, 2, null), null, null, false, false, null, false, 1480, null);
        }
    }

    /* JADX INFO: renamed from: ul1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$h;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final h f148659m = new h();

        /* JADX INFO: renamed from: n */
        public static final int f148660n = 8;

        private h() {
            super(true, EnumC35066c.CDM, new TextResource.C8688b(AbstractC14569b.f53572f, null, 2, null), null, new TextResource.C8688b(AbstractC14569b.f53571e, null, 2, null), new TextResource.C8688b(AbstractC14569b.f53570d, null, 2, null), null, null, false, false, null, false, 4040, null);
        }
    }

    /* JADX INFO: renamed from: ul1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lul1/b$i;", "Lul1/b;", "Lcom/whoop/design/util/TextResource;", "titleWithLanguage", "bodyWithLanguage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Lcom/whoop/design/util/TextResource;", "getTitleWithLanguage", "()Lcom/whoop/design/util/TextResource;", "n", "getBodyWithLanguage", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC35065b {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource titleWithLanguage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource bodyWithLanguage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextResource titleWithLanguage, TextResource bodyWithLanguage) {
            super(true, EnumC35066c.LANGUAGE_MODAL, titleWithLanguage, null, bodyWithLanguage, new TextResource.C8688b(AbstractC14569b.f53582p, null, 2, null), null, null, false, false, null, false, 1992, null);
            AbstractC22676k.m65750j(titleWithLanguage, "titleWithLanguage");
            AbstractC22676k.m65750j(bodyWithLanguage, "bodyWithLanguage");
            this.titleWithLanguage = titleWithLanguage;
            this.bodyWithLanguage = bodyWithLanguage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.titleWithLanguage, iVar.titleWithLanguage) && AbstractC22676k.m65745e(this.bodyWithLanguage, iVar.bodyWithLanguage);
        }

        public int hashCode() {
            return this.bodyWithLanguage.hashCode() + (this.titleWithLanguage.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("LanguageModalDialog(titleWithLanguage=", this.titleWithLanguage, ", bodyWithLanguage=", this.bodyWithLanguage, ")");
        }
    }

    /* JADX INFO: renamed from: ul1.b$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$j;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final j f148663m = new j();

        /* JADX INFO: renamed from: n */
        public static final int f148664n = 8;

        private j() {
            super(false, null, null, null, null, null, null, null, false, false, null, false, 4094, null);
        }
    }

    /* JADX INFO: renamed from: ul1.b$k */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lul1/b$k;", "Lul1/b;", "Lf0;", "sleepNeedModalViewState", "Lf0;", "m", "()Lf0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC35065b {
        /* JADX INFO: renamed from: m */
        public abstract AbstractC13767f0 m110894m();
    }

    /* JADX INFO: renamed from: ul1.b$l */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lul1/b$l;", "Lul1/b;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC35065b {

        /* JADX INFO: renamed from: m */
        public static final l f148665m = new l();

        /* JADX INFO: renamed from: n */
        public static final int f148666n = 8;

        private l() {
            super(true, EnumC35066c.SOFT_TOMBSTONE, new TextResource.C8688b(AbstractC15927b.f60253e, null, 2, null), null, new TextResource.C8688b(AbstractC15927b.f60252d, null, 2, null), new TextResource.C8688b(AbstractC15927b.f60249a, null, 2, null), null, null, false, true, null, false, 3528, null);
        }
    }

    public /* synthetic */ AbstractC35065b(boolean z4, EnumC35066c enumC35066c, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, InterfaceC39332e interfaceC39332e, TextResource textResource4, boolean z13, boolean z14, EnumC21213p enumC21213p, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, enumC35066c, textResource, num, textResource2, textResource3, interfaceC39332e, textResource4, z13, z14, enumC21213p, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryActionText() {
        return this.primaryActionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getPrimaryActionTextColor() {
        return this.primaryActionTextColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryActionText() {
        return this.secondaryActionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC21213p getTopDialogStyle() {
        return this.topDialogStyle;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC35066c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getUseSolidCtaButtons() {
        return this.useSolidCtaButtons;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDismissable() {
        return this.isDismissable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    private AbstractC35065b(boolean z4, EnumC35066c enumC35066c, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, InterfaceC39332e interfaceC39332e, TextResource textResource4, boolean z13, boolean z14, EnumC21213p enumC21213p, boolean z15) {
        this.isVisible = z4;
        this.type = enumC35066c;
        this.title = textResource;
        this.icon = num;
        this.subtitle = textResource2;
        this.primaryActionText = textResource3;
        this.primaryActionTextColor = interfaceC39332e;
        this.secondaryActionText = textResource4;
        this.useSolidCtaButtons = z13;
        this.isDismissable = z14;
        this.topDialogStyle = enumC21213p;
        this.showCloseIcon = z15;
    }

    public /* synthetic */ AbstractC35065b(boolean z4, EnumC35066c enumC35066c, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, InterfaceC39332e interfaceC39332e, TextResource textResource4, boolean z13, boolean z14, EnumC21213p enumC21213p, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? EnumC35066c.NONE : enumC35066c, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : textResource2, (i13 & 32) != 0 ? null : textResource3, (i13 & 64) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i13 & 128) == 0 ? textResource4 : null, (i13 & 256) == 0 ? z13 : false, (i13 & 512) != 0 ? true : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z15 : true, null);
    }
}
