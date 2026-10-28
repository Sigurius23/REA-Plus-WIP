package y71;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y71.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ly71/l;", "", "<init>", "()V", "b", "c", "a", "Ly71/l$a;", "Ly71/l$b;", "Ly71/l$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39279l {

    /* JADX INFO: renamed from: y71.l$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ly71/l$a;", "Ly71/l;", "Lcom/whoop/design/util/TextResource;", "description", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC39279l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource description) {
            super(null);
            AbstractC22676k.m65750j(description, "description");
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
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
            return AbstractC36095b.m114678f("CenteredMenu(description=", this.description, ")");
        }
    }

    public /* synthetic */ AbstractC39279l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC39279l() {
    }

    /* JADX INFO: renamed from: y71.l$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u008e\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b/\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b0\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104¨\u00065"}, m65681d2 = {"Ly71/l$b;", "Ly71/l;", "Lcom/whoop/design/util/TextResource;", "supportText", "Ly81/e;", "supportColor", "Ly71/g;", "leftIcon", "iconColor", "rightIcon", "rightIconColor", "rightNumberValue", "rightNumberSuffix", "rightTitle", "rightTitleColor", "rightSubtitle", "", "readOnly", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Z)Ly71/l$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "m", "()Ly81/e;", "c", "Ly71/g;", "d", "()Ly71/g;", "e", "f", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "j", "l", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC39279l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC39332e supportColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39274g leftIcon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC39332e iconColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39274g rightIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC39332e rightIconColor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource rightNumberValue;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource rightNumberSuffix;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource rightTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC39332e rightTitleColor;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource rightSubtitle;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final boolean readOnly;

        /* JADX INFO: renamed from: y71.l$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f168961w = new a();

            /* JADX INFO: renamed from: a */
            public final long m125176a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite70();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125176a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.l$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42681b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42681b f168962w = new C42681b();

            /* JADX INFO: renamed from: a */
            public final long m125177a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125177a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.l$b$c */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final c f168963w = new c();

            /* JADX INFO: renamed from: a */
            public final long m125178a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125178a((C39336i) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource supportText, InterfaceC39332e supportColor, C39274g c39274g, InterfaceC39332e iconColor, C39274g c39274g2, InterfaceC39332e rightIconColor, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, InterfaceC39332e interfaceC39332e, TextResource rightSubtitle, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            this.supportText = supportText;
            this.supportColor = supportColor;
            this.leftIcon = c39274g;
            this.iconColor = iconColor;
            this.rightIcon = c39274g2;
            this.rightIconColor = rightIconColor;
            this.rightNumberValue = rightNumberValue;
            this.rightNumberSuffix = rightNumberSuffix;
            this.rightTitle = rightTitle;
            this.rightTitleColor = interfaceC39332e;
            this.rightSubtitle = rightSubtitle;
            this.readOnly = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m125162b(b bVar, TextResource textResource, InterfaceC39332e interfaceC39332e, C39274g c39274g, InterfaceC39332e interfaceC39332e2, C39274g c39274g2, InterfaceC39332e interfaceC39332e3, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e4, TextResource textResource5, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = bVar.supportText;
            }
            if ((i13 & 2) != 0) {
                interfaceC39332e = bVar.supportColor;
            }
            if ((i13 & 4) != 0) {
                c39274g = bVar.leftIcon;
            }
            if ((i13 & 8) != 0) {
                interfaceC39332e2 = bVar.iconColor;
            }
            if ((i13 & 16) != 0) {
                c39274g2 = bVar.rightIcon;
            }
            if ((i13 & 32) != 0) {
                interfaceC39332e3 = bVar.rightIconColor;
            }
            if ((i13 & 64) != 0) {
                textResource2 = bVar.rightNumberValue;
            }
            if ((i13 & 128) != 0) {
                textResource3 = bVar.rightNumberSuffix;
            }
            if ((i13 & 256) != 0) {
                textResource4 = bVar.rightTitle;
            }
            if ((i13 & 512) != 0) {
                interfaceC39332e4 = bVar.rightTitleColor;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                textResource5 = bVar.rightSubtitle;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                z4 = bVar.readOnly;
            }
            TextResource textResource6 = textResource5;
            boolean z13 = z4;
            TextResource textResource7 = textResource4;
            InterfaceC39332e interfaceC39332e5 = interfaceC39332e4;
            TextResource textResource8 = textResource2;
            TextResource textResource9 = textResource3;
            C39274g c39274g3 = c39274g2;
            InterfaceC39332e interfaceC39332e6 = interfaceC39332e3;
            return bVar.m125163a(textResource, interfaceC39332e, c39274g, interfaceC39332e2, c39274g3, interfaceC39332e6, textResource8, textResource9, textResource7, interfaceC39332e5, textResource6, z13);
        }

        /* JADX INFO: renamed from: a */
        public final b m125163a(TextResource supportText, InterfaceC39332e supportColor, C39274g leftIcon, InterfaceC39332e iconColor, C39274g rightIcon, InterfaceC39332e rightIconColor, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, InterfaceC39332e rightTitleColor, TextResource rightSubtitle, boolean readOnly) {
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            return new b(supportText, supportColor, leftIcon, iconColor, rightIcon, rightIconColor, rightNumberValue, rightNumberSuffix, rightTitle, rightTitleColor, rightSubtitle, readOnly);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC39332e getIconColor() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C39274g getLeftIcon() {
            return this.leftIcon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getReadOnly() {
            return this.readOnly;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.supportText, bVar.supportText) && AbstractC22676k.m65745e(this.supportColor, bVar.supportColor) && AbstractC22676k.m65745e(this.leftIcon, bVar.leftIcon) && AbstractC22676k.m65745e(this.iconColor, bVar.iconColor) && AbstractC22676k.m65745e(this.rightIcon, bVar.rightIcon) && AbstractC22676k.m65745e(this.rightIconColor, bVar.rightIconColor) && AbstractC22676k.m65745e(this.rightNumberValue, bVar.rightNumberValue) && AbstractC22676k.m65745e(this.rightNumberSuffix, bVar.rightNumberSuffix) && AbstractC22676k.m65745e(this.rightTitle, bVar.rightTitle) && AbstractC22676k.m65745e(this.rightTitleColor, bVar.rightTitleColor) && AbstractC22676k.m65745e(this.rightSubtitle, bVar.rightSubtitle) && this.readOnly == bVar.readOnly;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C39274g getRightIcon() {
            return this.rightIcon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC39332e getRightIconColor() {
            return this.rightIconColor;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getRightNumberSuffix() {
            return this.rightNumberSuffix;
        }

        public int hashCode() {
            int iM106648g = AbstractC33745d.m106648g(this.supportColor, this.supportText.hashCode() * 31, 31);
            C39274g c39274g = this.leftIcon;
            int iM106648g2 = AbstractC33745d.m106648g(this.iconColor, (iM106648g + (c39274g == null ? 0 : c39274g.hashCode())) * 31, 31);
            C39274g c39274g2 = this.rightIcon;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.rightIconColor, (iM106648g2 + (c39274g2 == null ? 0 : c39274g2.hashCode())) * 31, 31), this.rightNumberValue, 31), this.rightNumberSuffix, 31), this.rightTitle, 31);
            InterfaceC39332e interfaceC39332e = this.rightTitleColor;
            return Boolean.hashCode(this.readOnly) + AbstractC31061c.m95625a((iM95625a + (interfaceC39332e != null ? interfaceC39332e.hashCode() : 0)) * 31, this.rightSubtitle, 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getRightNumberValue() {
            return this.rightNumberValue;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getRightSubtitle() {
            return this.rightSubtitle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getRightTitle() {
            return this.rightTitle;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final InterfaceC39332e getRightTitleColor() {
            return this.rightTitleColor;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC39332e getSupportColor() {
            return this.supportColor;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        public String toString() {
            TextResource textResource = this.supportText;
            InterfaceC39332e interfaceC39332e = this.supportColor;
            C39274g c39274g = this.leftIcon;
            InterfaceC39332e interfaceC39332e2 = this.iconColor;
            C39274g c39274g2 = this.rightIcon;
            InterfaceC39332e interfaceC39332e3 = this.rightIconColor;
            TextResource textResource2 = this.rightNumberValue;
            TextResource textResource3 = this.rightNumberSuffix;
            TextResource textResource4 = this.rightTitle;
            InterfaceC39332e interfaceC39332e4 = this.rightTitleColor;
            TextResource textResource5 = this.rightSubtitle;
            boolean z4 = this.readOnly;
            StringBuilder sb4 = new StringBuilder("LeftAlignedIconMenu(supportText=");
            sb4.append(textResource);
            sb4.append(", supportColor=");
            sb4.append(interfaceC39332e);
            sb4.append(", leftIcon=");
            sb4.append(c39274g);
            sb4.append(", iconColor=");
            sb4.append(interfaceC39332e2);
            sb4.append(", rightIcon=");
            sb4.append(c39274g2);
            sb4.append(", rightIconColor=");
            sb4.append(interfaceC39332e3);
            sb4.append(", rightNumberValue=");
            AbstractC30007c.m91855y(sb4, textResource2, ", rightNumberSuffix=", textResource3, ", rightTitle=");
            sb4.append(textResource4);
            sb4.append(", rightTitleColor=");
            sb4.append(interfaceC39332e4);
            sb4.append(", rightSubtitle=");
            sb4.append(textResource5);
            sb4.append(", readOnly=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ b(TextResource textResource, InterfaceC39332e interfaceC39332e, C39274g c39274g, InterfaceC39332e interfaceC39332e2, C39274g c39274g2, InterfaceC39332e interfaceC39332e3, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e4, TextResource textResource5, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? p745y81.Function1.m125323a(a.f168961w) : interfaceC39332e, (i13 & 4) != 0 ? null : c39274g, (i13 & 8) != 0 ? p745y81.Function1.m125323a(C42681b.f168962w) : interfaceC39332e2, (i13 & 16) != 0 ? null : c39274g2, (i13 & 32) != 0 ? p745y81.Function1.m125323a(c.f168963w) : interfaceC39332e3, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 128) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 256) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 512) != 0 ? null : interfaceC39332e4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: y71.l$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u008e\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b/\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b0\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104¨\u00065"}, m65681d2 = {"Ly71/l$c;", "Ly71/l;", "Lcom/whoop/design/util/TextResource;", "supportText", "Ly81/e;", "supportColor", "Lkd1/o;", "leftIcon", "iconColor", "rightIcon", "rightIconColor", "rightNumberValue", "rightNumberSuffix", "rightTitle", "rightTitleColor", "rightSubtitle", "", "readOnly", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Ly81/e;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Ly81/e;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Z)Ly71/l$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "m", "()Ly81/e;", "c", "Lkd1/o;", "d", "()Lkd1/o;", "e", "f", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "j", "l", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC39279l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC39332e supportColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC22403o leftIcon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC39332e iconColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AbstractC22403o rightIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC39332e rightIconColor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource rightNumberValue;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource rightNumberSuffix;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource rightTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC39332e rightTitleColor;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource rightSubtitle;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final boolean readOnly;

        /* JADX INFO: renamed from: y71.l$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f168976w = new a();

            /* JADX INFO: renamed from: a */
            public final long m125193a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite70();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125193a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.l$c$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f168977w = new b();

            /* JADX INFO: renamed from: a */
            public final long m125194a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125194a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: y71.l$c$c, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42682c implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42682c f168978w = new C42682c();

            /* JADX INFO: renamed from: a */
            public final long m125195a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getWhite30();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m125195a((C39336i) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource supportText, InterfaceC39332e supportColor, AbstractC22403o abstractC22403o, InterfaceC39332e iconColor, AbstractC22403o abstractC22403o2, InterfaceC39332e rightIconColor, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, InterfaceC39332e interfaceC39332e, TextResource rightSubtitle, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            this.supportText = supportText;
            this.supportColor = supportColor;
            this.leftIcon = abstractC22403o;
            this.iconColor = iconColor;
            this.rightIcon = abstractC22403o2;
            this.rightIconColor = rightIconColor;
            this.rightNumberValue = rightNumberValue;
            this.rightNumberSuffix = rightNumberSuffix;
            this.rightTitle = rightTitle;
            this.rightTitleColor = interfaceC39332e;
            this.rightSubtitle = rightSubtitle;
            this.readOnly = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m125179b(c cVar, TextResource textResource, InterfaceC39332e interfaceC39332e, AbstractC22403o abstractC22403o, InterfaceC39332e interfaceC39332e2, AbstractC22403o abstractC22403o2, InterfaceC39332e interfaceC39332e3, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e4, TextResource textResource5, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = cVar.supportText;
            }
            if ((i13 & 2) != 0) {
                interfaceC39332e = cVar.supportColor;
            }
            if ((i13 & 4) != 0) {
                abstractC22403o = cVar.leftIcon;
            }
            if ((i13 & 8) != 0) {
                interfaceC39332e2 = cVar.iconColor;
            }
            if ((i13 & 16) != 0) {
                abstractC22403o2 = cVar.rightIcon;
            }
            if ((i13 & 32) != 0) {
                interfaceC39332e3 = cVar.rightIconColor;
            }
            if ((i13 & 64) != 0) {
                textResource2 = cVar.rightNumberValue;
            }
            if ((i13 & 128) != 0) {
                textResource3 = cVar.rightNumberSuffix;
            }
            if ((i13 & 256) != 0) {
                textResource4 = cVar.rightTitle;
            }
            if ((i13 & 512) != 0) {
                interfaceC39332e4 = cVar.rightTitleColor;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                textResource5 = cVar.rightSubtitle;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                z4 = cVar.readOnly;
            }
            TextResource textResource6 = textResource5;
            boolean z13 = z4;
            TextResource textResource7 = textResource4;
            InterfaceC39332e interfaceC39332e5 = interfaceC39332e4;
            TextResource textResource8 = textResource2;
            TextResource textResource9 = textResource3;
            AbstractC22403o abstractC22403o3 = abstractC22403o2;
            InterfaceC39332e interfaceC39332e6 = interfaceC39332e3;
            return cVar.m125180a(textResource, interfaceC39332e, abstractC22403o, interfaceC39332e2, abstractC22403o3, interfaceC39332e6, textResource8, textResource9, textResource7, interfaceC39332e5, textResource6, z13);
        }

        /* JADX INFO: renamed from: a */
        public final c m125180a(TextResource supportText, InterfaceC39332e supportColor, AbstractC22403o leftIcon, InterfaceC39332e iconColor, AbstractC22403o rightIcon, InterfaceC39332e rightIconColor, TextResource rightNumberValue, TextResource rightNumberSuffix, TextResource rightTitle, InterfaceC39332e rightTitleColor, TextResource rightSubtitle, boolean readOnly) {
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(supportColor, "supportColor");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(rightNumberValue, "rightNumberValue");
            AbstractC22676k.m65750j(rightNumberSuffix, "rightNumberSuffix");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(rightSubtitle, "rightSubtitle");
            return new c(supportText, supportColor, leftIcon, iconColor, rightIcon, rightIconColor, rightNumberValue, rightNumberSuffix, rightTitle, rightTitleColor, rightSubtitle, readOnly);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC39332e getIconColor() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC22403o getLeftIcon() {
            return this.leftIcon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getReadOnly() {
            return this.readOnly;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.supportText, cVar.supportText) && AbstractC22676k.m65745e(this.supportColor, cVar.supportColor) && AbstractC22676k.m65745e(this.leftIcon, cVar.leftIcon) && AbstractC22676k.m65745e(this.iconColor, cVar.iconColor) && AbstractC22676k.m65745e(this.rightIcon, cVar.rightIcon) && AbstractC22676k.m65745e(this.rightIconColor, cVar.rightIconColor) && AbstractC22676k.m65745e(this.rightNumberValue, cVar.rightNumberValue) && AbstractC22676k.m65745e(this.rightNumberSuffix, cVar.rightNumberSuffix) && AbstractC22676k.m65745e(this.rightTitle, cVar.rightTitle) && AbstractC22676k.m65745e(this.rightTitleColor, cVar.rightTitleColor) && AbstractC22676k.m65745e(this.rightSubtitle, cVar.rightSubtitle) && this.readOnly == cVar.readOnly;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC22403o getRightIcon() {
            return this.rightIcon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC39332e getRightIconColor() {
            return this.rightIconColor;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getRightNumberSuffix() {
            return this.rightNumberSuffix;
        }

        public int hashCode() {
            int iM106648g = AbstractC33745d.m106648g(this.supportColor, this.supportText.hashCode() * 31, 31);
            AbstractC22403o abstractC22403o = this.leftIcon;
            int iM106648g2 = AbstractC33745d.m106648g(this.iconColor, (iM106648g + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31);
            AbstractC22403o abstractC22403o2 = this.rightIcon;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.rightIconColor, (iM106648g2 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31, 31), this.rightNumberValue, 31), this.rightNumberSuffix, 31), this.rightTitle, 31);
            InterfaceC39332e interfaceC39332e = this.rightTitleColor;
            return Boolean.hashCode(this.readOnly) + AbstractC31061c.m95625a((iM95625a + (interfaceC39332e != null ? interfaceC39332e.hashCode() : 0)) * 31, this.rightSubtitle, 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getRightNumberValue() {
            return this.rightNumberValue;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getRightSubtitle() {
            return this.rightSubtitle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getRightTitle() {
            return this.rightTitle;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final InterfaceC39332e getRightTitleColor() {
            return this.rightTitleColor;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC39332e getSupportColor() {
            return this.supportColor;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        public String toString() {
            TextResource textResource = this.supportText;
            InterfaceC39332e interfaceC39332e = this.supportColor;
            AbstractC22403o abstractC22403o = this.leftIcon;
            InterfaceC39332e interfaceC39332e2 = this.iconColor;
            AbstractC22403o abstractC22403o2 = this.rightIcon;
            InterfaceC39332e interfaceC39332e3 = this.rightIconColor;
            TextResource textResource2 = this.rightNumberValue;
            TextResource textResource3 = this.rightNumberSuffix;
            TextResource textResource4 = this.rightTitle;
            InterfaceC39332e interfaceC39332e4 = this.rightTitleColor;
            TextResource textResource5 = this.rightSubtitle;
            boolean z4 = this.readOnly;
            StringBuilder sb4 = new StringBuilder("LeftAlignedImageMenu(supportText=");
            sb4.append(textResource);
            sb4.append(", supportColor=");
            sb4.append(interfaceC39332e);
            sb4.append(", leftIcon=");
            sb4.append(abstractC22403o);
            sb4.append(", iconColor=");
            sb4.append(interfaceC39332e2);
            sb4.append(", rightIcon=");
            sb4.append(abstractC22403o2);
            sb4.append(", rightIconColor=");
            sb4.append(interfaceC39332e3);
            sb4.append(", rightNumberValue=");
            AbstractC30007c.m91855y(sb4, textResource2, ", rightNumberSuffix=", textResource3, ", rightTitle=");
            sb4.append(textResource4);
            sb4.append(", rightTitleColor=");
            sb4.append(interfaceC39332e4);
            sb4.append(", rightSubtitle=");
            sb4.append(textResource5);
            sb4.append(", readOnly=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ c(TextResource textResource, InterfaceC39332e interfaceC39332e, AbstractC22403o abstractC22403o, InterfaceC39332e interfaceC39332e2, AbstractC22403o abstractC22403o2, InterfaceC39332e interfaceC39332e3, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e4, TextResource textResource5, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? p745y81.Function1.m125323a(a.f168976w) : interfaceC39332e, (i13 & 4) != 0 ? null : abstractC22403o, (i13 & 8) != 0 ? p745y81.Function1.m125323a(b.f168977w) : interfaceC39332e2, (i13 & 16) != 0 ? null : abstractC22403o2, (i13 & 32) != 0 ? p745y81.Function1.m125323a(C42682c.f168978w) : interfaceC39332e3, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 128) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 256) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 512) != 0 ? null : interfaceC39332e4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4);
        }
    }
}
