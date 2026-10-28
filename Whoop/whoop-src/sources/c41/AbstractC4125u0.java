package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.u0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lc41/u0;", "", "<init>", "()V", "e", "d", "c", "b", "a", "Lc41/u0$a;", "Lc41/u0$b;", "Lc41/u0$c;", "Lc41/u0$d;", "Lc41/u0$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4125u0 {

    /* JADX INFO: renamed from: c41.u0$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, m65681d2 = {"Lc41/u0$c;", "Lc41/u0;", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "description", "Ly81/f;", "iconTint", "titleTint", "descriptionTint", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Ly81/f;", "()Ly81/f;", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4125u0 {

        /* JADX INFO: renamed from: g */
        public static final int f16756g = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC39333f iconTint;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC39333f titleTint;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC39333f descriptionTint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, TextResource title, TextResource description, EnumC39333f iconTint, EnumC39333f titleTint, EnumC39333f descriptionTint) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(iconTint, "iconTint");
            AbstractC22676k.m65750j(titleTint, "titleTint");
            AbstractC22676k.m65750j(descriptionTint, "descriptionTint");
            this.icon = i13;
            this.title = title;
            this.description = description;
            this.iconTint = iconTint;
            this.titleTint = titleTint;
            this.descriptionTint = descriptionTint;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC39333f getDescriptionTint() {
            return this.descriptionTint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC39333f getIconTint() {
            return this.iconTint;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.icon == cVar.icon && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.description, cVar.description) && this.iconTint == cVar.iconTint && this.titleTint == cVar.titleTint && this.descriptionTint == cVar.descriptionTint;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC39333f getTitleTint() {
            return this.titleTint;
        }

        public int hashCode() {
            return this.descriptionTint.hashCode() + AbstractC21702c.m61132c(this.titleTint, AbstractC21702c.m61132c(this.iconTint, AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31), this.description, 31), 31), 31);
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            EnumC39333f enumC39333f = this.iconTint;
            EnumC39333f enumC39333f2 = this.titleTint;
            EnumC39333f enumC39333f3 = this.descriptionTint;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("GenericInformational(icon=", i13, ", title=", textResource, ", description=");
            sbM91844n.append(textResource2);
            sbM91844n.append(", iconTint=");
            sbM91844n.append(enumC39333f);
            sbM91844n.append(", titleTint=");
            sbM91844n.append(enumC39333f2);
            sbM91844n.append(", descriptionTint=");
            sbM91844n.append(enumC39333f3);
            sbM91844n.append(")");
            return sbM91844n.toString();
        }
    }

    /* JADX INFO: renamed from: c41.u0$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lc41/u0$d;", "Lc41/u0;", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "description", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC4125u0 {

        /* JADX INFO: renamed from: d */
        public static final int f16763d = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, TextResource title, TextResource description) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            this.icon = i13;
            this.title = title;
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.icon == dVar.icon && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.description, dVar.description);
        }

        public int hashCode() {
            return this.description.hashCode() + AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31);
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.title;
            return AbstractC30007c.m91841k(AbstractC30007c.m91844n("Informational(icon=", i13, ", title=", textResource, ", description="), this.description, ")");
        }
    }

    public /* synthetic */ AbstractC4125u0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4125u0() {
    }

    /* JADX INFO: renamed from: c41.u0$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lc41/u0$a;", "Lc41/u0;", "", "icon", "Ly81/f;", "tint", "Lcom/whoop/design/util/TextResource;", NotificationCompat.CATEGORY_STATUS, "description", "ctaText", "<init>", "(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ly81/f;", "e", "()Ly81/f;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4125u0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f tint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource status;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource ctaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, EnumC39333f tint, TextResource status, TextResource textResource, TextResource ctaText) {
            super(null);
            AbstractC22676k.m65750j(tint, "tint");
            AbstractC22676k.m65750j(status, "status");
            AbstractC22676k.m65750j(ctaText, "ctaText");
            this.icon = i13;
            this.tint = tint;
            this.status = status;
            this.description = textResource;
            this.ctaText = ctaText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC39333f getTint() {
            return this.tint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.icon == aVar.icon && this.tint == aVar.tint && AbstractC22676k.m65745e(this.status, aVar.status) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.ctaText, aVar.ctaText);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.tint, Integer.hashCode(this.icon) * 31, 31), this.status, 31);
            TextResource textResource = this.description;
            return this.ctaText.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31);
        }

        public String toString() {
            int i13 = this.icon;
            EnumC39333f enumC39333f = this.tint;
            TextResource textResource = this.status;
            TextResource textResource2 = this.description;
            TextResource textResource3 = this.ctaText;
            StringBuilder sb4 = new StringBuilder("Embedded(icon=");
            sb4.append(i13);
            sb4.append(", tint=");
            sb4.append(enumC39333f);
            sb4.append(", status=");
            AbstractC30007c.m91855y(sb4, textResource, ", description=", textResource2, ", ctaText=");
            return AbstractC30007c.m91841k(sb4, textResource3, ")");
        }

        public /* synthetic */ a(int i13, EnumC39333f enumC39333f, TextResource textResource, TextResource textResource2, TextResource textResource3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, enumC39333f, textResource, (i14 & 8) != 0 ? null : textResource2, textResource3);
        }
    }

    /* JADX INFO: renamed from: c41.u0$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lc41/u0$e;", "Lc41/u0;", "", "icon", "Ly81/f;", "tint", "Lcom/whoop/design/util/TextResource;", NotificationCompat.CATEGORY_STATUS, "description", "ctaText", "<init>", "(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ly81/f;", "e", "()Ly81/f;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC4125u0 {

        /* JADX INFO: renamed from: f */
        public static final int f16767f = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f tint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource status;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource ctaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13, EnumC39333f tint, TextResource status, TextResource textResource, TextResource ctaText) {
            super(null);
            AbstractC22676k.m65750j(tint, "tint");
            AbstractC22676k.m65750j(status, "status");
            AbstractC22676k.m65750j(ctaText, "ctaText");
            this.icon = i13;
            this.tint = tint;
            this.status = status;
            this.description = textResource;
            this.ctaText = ctaText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC39333f getTint() {
            return this.tint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.icon == eVar.icon && this.tint == eVar.tint && AbstractC22676k.m65745e(this.status, eVar.status) && AbstractC22676k.m65745e(this.description, eVar.description) && AbstractC22676k.m65745e(this.ctaText, eVar.ctaText);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.tint, Integer.hashCode(this.icon) * 31, 31), this.status, 31);
            TextResource textResource = this.description;
            return this.ctaText.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31);
        }

        public String toString() {
            int i13 = this.icon;
            EnumC39333f enumC39333f = this.tint;
            TextResource textResource = this.status;
            TextResource textResource2 = this.description;
            TextResource textResource3 = this.ctaText;
            StringBuilder sb4 = new StringBuilder("TextLink(icon=");
            sb4.append(i13);
            sb4.append(", tint=");
            sb4.append(enumC39333f);
            sb4.append(", status=");
            AbstractC30007c.m91855y(sb4, textResource, ", description=", textResource2, ", ctaText=");
            return AbstractC30007c.m91841k(sb4, textResource3, ")");
        }

        public /* synthetic */ e(int i13, EnumC39333f enumC39333f, TextResource textResource, TextResource textResource2, TextResource textResource3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, enumC39333f, textResource, (i14 & 8) != 0 ? null : textResource2, textResource3);
        }
    }

    /* JADX INFO: renamed from: c41.u0$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0017\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001a\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lc41/u0$b;", "Lc41/u0;", "", "icon", "Ly81/f;", "tint", "Lcom/whoop/design/util/TextResource;", NotificationCompat.CATEGORY_STATUS, "description", "errorText", "", "showLink", "<init>", "(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ly81/f;", "f", "()Ly81/f;", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4125u0 {

        /* JADX INFO: renamed from: g */
        public static final int f16749g = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f tint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource status;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource errorText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, EnumC39333f tint, TextResource status, TextResource textResource, TextResource errorText, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(tint, "tint");
            AbstractC22676k.m65750j(status, "status");
            AbstractC22676k.m65750j(errorText, "errorText");
            this.icon = i13;
            this.tint = tint;
            this.status = status;
            this.description = textResource;
            this.errorText = errorText;
            this.showLink = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getErrorText() {
            return this.errorText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowLink() {
            return this.showLink;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getStatus() {
            return this.status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.icon == bVar.icon && this.tint == bVar.tint && AbstractC22676k.m65745e(this.status, bVar.status) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.errorText, bVar.errorText) && this.showLink == bVar.showLink;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC39333f getTint() {
            return this.tint;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.tint, Integer.hashCode(this.icon) * 31, 31), this.status, 31);
            TextResource textResource = this.description;
            return Boolean.hashCode(this.showLink) + AbstractC31061c.m95625a((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, this.errorText, 31);
        }

        public String toString() {
            int i13 = this.icon;
            EnumC39333f enumC39333f = this.tint;
            TextResource textResource = this.status;
            TextResource textResource2 = this.description;
            TextResource textResource3 = this.errorText;
            boolean z4 = this.showLink;
            StringBuilder sb4 = new StringBuilder("Error(icon=");
            sb4.append(i13);
            sb4.append(", tint=");
            sb4.append(enumC39333f);
            sb4.append(", status=");
            AbstractC30007c.m91855y(sb4, textResource, ", description=", textResource2, ", errorText=");
            sb4.append(textResource3);
            sb4.append(", showLink=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ b(int i13, EnumC39333f enumC39333f, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (i14 & 2) != 0 ? EnumC39333f.WHITE_70 : enumC39333f, textResource, (i14 & 8) != 0 ? null : textResource2, textResource3, (i14 & 32) != 0 ? false : z4);
        }
    }
}
