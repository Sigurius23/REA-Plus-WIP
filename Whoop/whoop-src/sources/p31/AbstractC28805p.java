package p31;

import b91.EnumC2888c;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.EnumC22400l;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: p31.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lp31/p;", "", "<init>", "()V", "a", "d", "e", "c", "b", "Lp31/p$a;", "Lp31/p$b;", "Lp31/p$c;", "Lp31/p$d;", "Lp31/p$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28805p {

    /* JADX INFO: renamed from: a */
    public static final int f116590a = 0;

    /* JADX INFO: renamed from: p31.p$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006'"}, m65681d2 = {"Lp31/p$c;", "Lp31/p;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "subtitleEnd", "Lp31/r;", "style", "Lb91/c;", "typography", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getId", "c", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "e", "f", "Lp31/r;", "a", "()Lp31/r;", "g", "Lb91/c;", "()Lb91/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28805p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource subtitleEnd;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC28807r style;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC2888c typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, TextResource title, TextResource subtitle, TextResource subtitleEnd, EnumC28807r enumC28807r, EnumC2888c enumC2888c) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(subtitleEnd, "subtitleEnd");
            this.id = id4;
            this.title = title;
            this.subtitle = subtitle;
            this.subtitleEnd = subtitleEnd;
            this.style = enumC28807r;
            this.typography = enumC2888c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC28807r getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getSubtitleEnd() {
            return this.subtitleEnd;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC2888c getTypography() {
            return this.typography;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.subtitleEnd, cVar.subtitleEnd) && this.style == cVar.style && this.typography == cVar.typography;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), this.subtitle, 31), this.subtitleEnd, 31);
            EnumC28807r enumC28807r = this.style;
            int iHashCode = (iM95625a + (enumC28807r == null ? 0 : enumC28807r.hashCode())) * 31;
            EnumC2888c enumC2888c = this.typography;
            return iHashCode + (enumC2888c != null ? enumC2888c.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            TextResource textResource3 = this.subtitleEnd;
            EnumC28807r enumC28807r = this.style;
            EnumC2888c enumC2888c = this.typography;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("ThreeTitles(id=", str, ", title=", textResource, ", subtitle=");
            AbstractC30007c.m91855y(sbM91847q, textResource2, ", subtitleEnd=", textResource3, ", style=");
            sbM91847q.append(enumC28807r);
            sbM91847q.append(", typography=");
            sbM91847q.append(enumC2888c);
            sbM91847q.append(")");
            return sbM91847q.toString();
        }
    }

    public /* synthetic */ AbstractC28805p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28805p() {
    }

    /* JADX INFO: renamed from: p31.p$d */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lp31/p$d;", "Lp31/p;", "Lcom/whoop/design/util/TextResource;", "leftTitle", "rightTitle", "Lp31/r;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "a", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lp31/r;", "()Lp31/r;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC28805p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource leftTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource rightTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC28807r style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource leftTitle, TextResource rightTitle, EnumC28807r enumC28807r) {
            super(null);
            AbstractC22676k.m65750j(leftTitle, "leftTitle");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            this.leftTitle = leftTitle;
            this.rightTitle = rightTitle;
            this.style = enumC28807r;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getLeftTitle() {
            return this.leftTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getRightTitle() {
            return this.rightTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28807r getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.leftTitle, dVar.leftTitle) && AbstractC22676k.m65745e(this.rightTitle, dVar.rightTitle) && this.style == dVar.style;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(this.leftTitle.hashCode() * 31, this.rightTitle, 31);
            EnumC28807r enumC28807r = this.style;
            return iM95625a + (enumC28807r == null ? 0 : enumC28807r.hashCode());
        }

        public String toString() {
            TextResource textResource = this.leftTitle;
            TextResource textResource2 = this.rightTitle;
            EnumC28807r enumC28807r = this.style;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("TwoTitles(leftTitle=", textResource, ", rightTitle=", textResource2, ", style=");
            sbM106658q.append(enumC28807r);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ d(TextResource textResource, TextResource textResource2, EnumC28807r enumC28807r, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, (i13 & 4) != 0 ? null : enumC28807r);
        }
    }

    /* JADX INFO: renamed from: p31.p$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lp31/p$b;", "Lp31/p;", "Lcom/whoop/design/util/TextResource;", "title", "", "icon", "rightTitleMaxLines", "Lp31/r;", "style", "Lb91/c;", "typography", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;IILp31/r;Lb91/c;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "I", "getRightTitleMaxLines", "e", "Lp31/r;", "()Lp31/r;", "f", "Lb91/c;", "()Lb91/c;", "g", "Lcom/whoop/navigation/e;", "a", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC28805p {

        /* JADX INFO: renamed from: h */
        public static final int f116601h = C9598e.f28134d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int rightTitleMaxLines;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC28807r style;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC2888c typography;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource title, int i13, int i14, EnumC28807r enumC28807r, EnumC2888c enumC2888c, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.icon = i13;
            this.rightTitleMaxLines = i14;
            this.style = enumC28807r;
            this.typography = enumC2888c;
            this.destination = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28807r getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC2888c getTypography() {
            return this.typography;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && this.icon == bVar.icon && this.rightTitleMaxLines == bVar.rightTitleMaxLines && this.style == bVar.style && this.typography == bVar.typography && AbstractC22676k.m65745e(this.destination, bVar.destination);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.rightTitleMaxLines, AbstractC11266d.m30448b(this.icon, this.title.hashCode() * 31, 31), 31);
            EnumC28807r enumC28807r = this.style;
            int iHashCode = (iM30448b + (enumC28807r == null ? 0 : enumC28807r.hashCode())) * 31;
            EnumC2888c enumC2888c = this.typography;
            int iHashCode2 = (iHashCode + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
            C9598e c9598e = this.destination;
            return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            return "OneTitleWithIcon(title=" + this.title + ", icon=" + this.icon + ", rightTitleMaxLines=" + this.rightTitleMaxLines + ", style=" + this.style + ", typography=" + this.typography + ", destination=" + this.destination + ")";
        }

        public /* synthetic */ b(TextResource textResource, int i13, int i14, EnumC28807r enumC28807r, EnumC2888c enumC2888c, C9598e c9598e, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, i13, (i15 & 4) != 0 ? 2 : i14, (i15 & 8) != 0 ? null : enumC28807r, (i15 & 16) != 0 ? null : enumC2888c, (i15 & 32) != 0 ? null : c9598e);
        }
    }

    /* JADX INFO: renamed from: p31.p$a */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0088\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b'\u00104R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b5\u0010$¨\u00068"}, m65681d2 = {"Lp31/p$a;", "Lp31/p;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lp31/r;", "style", "Lb91/c;", "typography", "subtitleTypography", "Lp31/i;", "subtitleLocation", "", "leadingButton", "journalEnabled", "", "Lp31/b;", "fabTooltipItems", "titleEnd", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;)Lp31/p$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "Lp31/r;", "f", "()Lp31/r;", "e", "Lb91/c;", "k", "()Lb91/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lp31/i;", "getSubtitleLocation", "()Lp31/i;", "Z", "()Z", "j", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28805p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC28807r style;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC2888c typography;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC2888c subtitleTypography;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC28798i subtitleLocation;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean leadingButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean journalEnabled;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final List<C28791b> fabTooltipItems;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource titleEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, TextResource textResource, EnumC28807r enumC28807r, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, EnumC28798i enumC28798i, boolean z4, boolean z13, List<C28791b> list, TextResource textResource2) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.subtitle = textResource;
            this.style = enumC28807r;
            this.typography = enumC2888c;
            this.subtitleTypography = enumC2888c2;
            this.subtitleLocation = enumC28798i;
            this.leadingButton = z4;
            this.journalEnabled = z13;
            this.fabTooltipItems = list;
            this.titleEnd = textResource2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m87633b(a aVar, TextResource textResource, TextResource textResource2, EnumC28807r enumC28807r, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, EnumC28798i enumC28798i, boolean z4, boolean z13, List list, TextResource textResource3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = aVar.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = aVar.subtitle;
            }
            if ((i13 & 4) != 0) {
                enumC28807r = aVar.style;
            }
            if ((i13 & 8) != 0) {
                enumC2888c = aVar.typography;
            }
            if ((i13 & 16) != 0) {
                enumC2888c2 = aVar.subtitleTypography;
            }
            if ((i13 & 32) != 0) {
                enumC28798i = aVar.subtitleLocation;
            }
            if ((i13 & 64) != 0) {
                z4 = aVar.leadingButton;
            }
            if ((i13 & 128) != 0) {
                z13 = aVar.journalEnabled;
            }
            if ((i13 & 256) != 0) {
                list = aVar.fabTooltipItems;
            }
            if ((i13 & 512) != 0) {
                textResource3 = aVar.titleEnd;
            }
            List list2 = list;
            TextResource textResource4 = textResource3;
            boolean z14 = z4;
            boolean z15 = z13;
            EnumC2888c enumC2888c3 = enumC2888c2;
            EnumC28798i enumC28798i2 = enumC28798i;
            return aVar.m87634a(textResource, textResource2, enumC28807r, enumC2888c, enumC2888c3, enumC28798i2, z14, z15, list2, textResource4);
        }

        /* JADX INFO: renamed from: a */
        public final a m87634a(TextResource title, TextResource subtitle, EnumC28807r style, EnumC2888c typography, EnumC2888c subtitleTypography, EnumC28798i subtitleLocation, boolean leadingButton, boolean journalEnabled, List<C28791b> fabTooltipItems, TextResource titleEnd) {
            AbstractC22676k.m65750j(title, "title");
            return new a(title, subtitle, style, typography, subtitleTypography, subtitleLocation, leadingButton, journalEnabled, fabTooltipItems, titleEnd);
        }

        /* JADX INFO: renamed from: c */
        public final List<C28791b> m87635c() {
            return this.fabTooltipItems;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getJournalEnabled() {
            return this.journalEnabled;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getLeadingButton() {
            return this.leadingButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && this.style == aVar.style && this.typography == aVar.typography && this.subtitleTypography == aVar.subtitleTypography && this.subtitleLocation == aVar.subtitleLocation && this.leadingButton == aVar.leadingButton && this.journalEnabled == aVar.journalEnabled && AbstractC22676k.m65745e(this.fabTooltipItems, aVar.fabTooltipItems) && AbstractC22676k.m65745e(this.titleEnd, aVar.titleEnd);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC28807r getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final EnumC2888c getSubtitleTypography() {
            return this.subtitleTypography;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.subtitle;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            EnumC28807r enumC28807r = this.style;
            int iHashCode3 = (iHashCode2 + (enumC28807r == null ? 0 : enumC28807r.hashCode())) * 31;
            EnumC2888c enumC2888c = this.typography;
            int iHashCode4 = (iHashCode3 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
            EnumC2888c enumC2888c2 = this.subtitleTypography;
            int iHashCode5 = (iHashCode4 + (enumC2888c2 == null ? 0 : enumC2888c2.hashCode())) * 31;
            EnumC28798i enumC28798i = this.subtitleLocation;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (enumC28798i == null ? 0 : enumC28798i.hashCode())) * 31, 31, this.leadingButton), 31, this.journalEnabled);
            List<C28791b> list = this.fabTooltipItems;
            int iHashCode6 = (iM8289b + (list == null ? 0 : list.hashCode())) * 31;
            TextResource textResource2 = this.titleEnd;
            return iHashCode6 + (textResource2 != null ? textResource2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getTitleEnd() {
            return this.titleEnd;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final EnumC2888c getTypography() {
            return this.typography;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            EnumC28807r enumC28807r = this.style;
            EnumC2888c enumC2888c = this.typography;
            EnumC2888c enumC2888c2 = this.subtitleTypography;
            EnumC28798i enumC28798i = this.subtitleLocation;
            boolean z4 = this.leadingButton;
            boolean z13 = this.journalEnabled;
            List<C28791b> list = this.fabTooltipItems;
            TextResource textResource3 = this.titleEnd;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("OneTitle(title=", textResource, ", subtitle=", textResource2, ", style=");
            sbM106658q.append(enumC28807r);
            sbM106658q.append(", typography=");
            sbM106658q.append(enumC2888c);
            sbM106658q.append(", subtitleTypography=");
            sbM106658q.append(enumC2888c2);
            sbM106658q.append(", subtitleLocation=");
            sbM106658q.append(enumC28798i);
            sbM106658q.append(", leadingButton=");
            AbstractC38963t7.m124392v(sbM106658q, z4, ", journalEnabled=", z13, ", fabTooltipItems=");
            sbM106658q.append(list);
            sbM106658q.append(", titleEnd=");
            sbM106658q.append(textResource3);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, EnumC28807r enumC28807r, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, EnumC28798i enumC28798i, boolean z4, boolean z13, List list, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : enumC28807r, (i13 & 8) != 0 ? null : enumC2888c, (i13 & 16) != 0 ? null : enumC2888c2, (i13 & 32) != 0 ? null : enumC28798i, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : textResource3);
        }
    }

    /* JADX INFO: renamed from: p31.p$e */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0090\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\u001dR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b2\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b(\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b6\u0010%¨\u0006<"}, m65681d2 = {"Lp31/p$e;", "Lp31/p;", "Lcom/whoop/design/util/TextResource;", "leftTitle", "rightTitle", "", "icon", "Lkd1/l;", "ctaType", "", "shouldShowOnboarding", "shouldShowAiGradient", "rightTitleMaxLines", "isEnabled", "Lp31/r;", "style", "Lb91/c;", "typography", "Lcom/whoop/navigation/e;", "destination", "titleEnd", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)Lp31/p$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "I", "e", "Lkd1/l;", "()Lkd1/l;", "Z", "i", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getRightTitleMaxLines", "m", "j", "Lp31/r;", "()Lp31/r;", "k", "Lb91/c;", "l", "()Lb91/c;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC28805p {

        /* JADX INFO: renamed from: n */
        public static final int f116617n = C9598e.f28134d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource leftTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource rightTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC22400l ctaType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean shouldShowOnboarding;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean shouldShowAiGradient;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final int rightTitleMaxLines;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final EnumC28807r style;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final EnumC2888c typography;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource titleEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextResource leftTitle, TextResource rightTitle, int i13, EnumC22400l ctaType, boolean z4, boolean z13, int i14, boolean z14, EnumC28807r enumC28807r, EnumC2888c enumC2888c, C9598e c9598e, TextResource textResource) {
            super(null);
            AbstractC22676k.m65750j(leftTitle, "leftTitle");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(ctaType, "ctaType");
            this.leftTitle = leftTitle;
            this.rightTitle = rightTitle;
            this.icon = i13;
            this.ctaType = ctaType;
            this.shouldShowOnboarding = z4;
            this.shouldShowAiGradient = z13;
            this.rightTitleMaxLines = i14;
            this.isEnabled = z14;
            this.style = enumC28807r;
            this.typography = enumC2888c;
            this.destination = c9598e;
            this.titleEnd = textResource;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ e m87657b(e eVar, TextResource textResource, TextResource textResource2, int i13, EnumC22400l enumC22400l, boolean z4, boolean z13, int i14, boolean z14, EnumC28807r enumC28807r, EnumC2888c enumC2888c, C9598e c9598e, TextResource textResource3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                textResource = eVar.leftTitle;
            }
            if ((i15 & 2) != 0) {
                textResource2 = eVar.rightTitle;
            }
            if ((i15 & 4) != 0) {
                i13 = eVar.icon;
            }
            if ((i15 & 8) != 0) {
                enumC22400l = eVar.ctaType;
            }
            if ((i15 & 16) != 0) {
                z4 = eVar.shouldShowOnboarding;
            }
            if ((i15 & 32) != 0) {
                z13 = eVar.shouldShowAiGradient;
            }
            if ((i15 & 64) != 0) {
                i14 = eVar.rightTitleMaxLines;
            }
            if ((i15 & 128) != 0) {
                z14 = eVar.isEnabled;
            }
            if ((i15 & 256) != 0) {
                enumC28807r = eVar.style;
            }
            if ((i15 & 512) != 0) {
                enumC2888c = eVar.typography;
            }
            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                c9598e = eVar.destination;
            }
            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                textResource3 = eVar.titleEnd;
            }
            C9598e c9598e2 = c9598e;
            TextResource textResource4 = textResource3;
            EnumC28807r enumC28807r2 = enumC28807r;
            EnumC2888c enumC2888c2 = enumC2888c;
            int i16 = i14;
            boolean z15 = z14;
            boolean z16 = z4;
            boolean z17 = z13;
            return eVar.m87658a(textResource, textResource2, i13, enumC22400l, z16, z17, i16, z15, enumC28807r2, enumC2888c2, c9598e2, textResource4);
        }

        /* JADX INFO: renamed from: a */
        public final e m87658a(TextResource leftTitle, TextResource rightTitle, int icon, EnumC22400l ctaType, boolean shouldShowOnboarding, boolean shouldShowAiGradient, int rightTitleMaxLines, boolean isEnabled, EnumC28807r style, EnumC2888c typography, C9598e destination, TextResource titleEnd) {
            AbstractC22676k.m65750j(leftTitle, "leftTitle");
            AbstractC22676k.m65750j(rightTitle, "rightTitle");
            AbstractC22676k.m65750j(ctaType, "ctaType");
            return new e(leftTitle, rightTitle, icon, ctaType, shouldShowOnboarding, shouldShowAiGradient, rightTitleMaxLines, isEnabled, style, typography, destination, titleEnd);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC22400l getCtaType() {
            return this.ctaType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.leftTitle, eVar.leftTitle) && AbstractC22676k.m65745e(this.rightTitle, eVar.rightTitle) && this.icon == eVar.icon && this.ctaType == eVar.ctaType && this.shouldShowOnboarding == eVar.shouldShowOnboarding && this.shouldShowAiGradient == eVar.shouldShowAiGradient && this.rightTitleMaxLines == eVar.rightTitleMaxLines && this.isEnabled == eVar.isEnabled && this.style == eVar.style && this.typography == eVar.typography && AbstractC22676k.m65745e(this.destination, eVar.destination) && AbstractC22676k.m65745e(this.titleEnd, eVar.titleEnd);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getLeftTitle() {
            return this.leftTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getRightTitle() {
            return this.rightTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShouldShowAiGradient() {
            return this.shouldShowAiGradient;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.rightTitleMaxLines, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.ctaType.hashCode() + AbstractC11266d.m30448b(this.icon, AbstractC31061c.m95625a(this.leftTitle.hashCode() * 31, this.rightTitle, 31), 31)) * 31, 31, this.shouldShowOnboarding), 31, this.shouldShowAiGradient), 31), 31, this.isEnabled);
            EnumC28807r enumC28807r = this.style;
            int iHashCode = (iM8289b + (enumC28807r == null ? 0 : enumC28807r.hashCode())) * 31;
            EnumC2888c enumC2888c = this.typography;
            int iHashCode2 = (iHashCode + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
            C9598e c9598e = this.destination;
            int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
            TextResource textResource = this.titleEnd;
            return iHashCode3 + (textResource != null ? textResource.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShouldShowOnboarding() {
            return this.shouldShowOnboarding;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final EnumC28807r getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getTitleEnd() {
            return this.titleEnd;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final EnumC2888c getTypography() {
            return this.typography;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            TextResource textResource = this.leftTitle;
            TextResource textResource2 = this.rightTitle;
            int i13 = this.icon;
            EnumC22400l enumC22400l = this.ctaType;
            boolean z4 = this.shouldShowOnboarding;
            boolean z13 = this.shouldShowAiGradient;
            int i14 = this.rightTitleMaxLines;
            boolean z14 = this.isEnabled;
            EnumC28807r enumC28807r = this.style;
            EnumC2888c enumC2888c = this.typography;
            C9598e c9598e = this.destination;
            TextResource textResource3 = this.titleEnd;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("TwoTitlesWithButton(leftTitle=", textResource, ", rightTitle=", textResource2, ", icon=");
            sbM106658q.append(i13);
            sbM106658q.append(", ctaType=");
            sbM106658q.append(enumC22400l);
            sbM106658q.append(", shouldShowOnboarding=");
            AbstractC38963t7.m124392v(sbM106658q, z4, ", shouldShowAiGradient=", z13, ", rightTitleMaxLines=");
            AbstractC13673n.m38573t(i14, ", isEnabled=", ", style=", sbM106658q, z14);
            sbM106658q.append(enumC28807r);
            sbM106658q.append(", typography=");
            sbM106658q.append(enumC2888c);
            sbM106658q.append(", destination=");
            sbM106658q.append(c9598e);
            sbM106658q.append(", titleEnd=");
            sbM106658q.append(textResource3);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ e(TextResource textResource, TextResource textResource2, int i13, EnumC22400l enumC22400l, boolean z4, boolean z13, int i14, boolean z14, EnumC28807r enumC28807r, EnumC2888c enumC2888c, C9598e c9598e, TextResource textResource3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, i13, enumC22400l, (i15 & 16) != 0 ? false : z4, (i15 & 32) != 0 ? false : z13, (i15 & 64) != 0 ? 2 : i14, (i15 & 128) != 0 ? true : z14, (i15 & 256) != 0 ? null : enumC28807r, (i15 & 512) != 0 ? null : enumC2888c, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : textResource3);
        }
    }
}
