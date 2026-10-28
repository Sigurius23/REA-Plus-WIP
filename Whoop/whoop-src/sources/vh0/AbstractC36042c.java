package vh0;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: vh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lvh0/c;", "", "<init>", "()V", "d", "f", "e", "c", "b", "a", "Lvh0/c$a;", "Lvh0/c$b;", "Lvh0/c$c;", "Lvh0/c$d;", "Lvh0/c$e;", "Lvh0/c$f;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36042c {

    /* JADX INFO: renamed from: vh0.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvh0/c$a;", "Lvh0/c;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36042c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String errorMessage) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorMessage, ((a) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteError(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: vh0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvh0/c$b;", "Lvh0/c;", "<init>", "()V", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36042c {

        /* JADX INFO: renamed from: a */
        public static final b f153773a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vh0.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvh0/c$c;", "Lvh0/c;", "<init>", "()V", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC36042c {

        /* JADX INFO: renamed from: a */
        public static final c f153774a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vh0.c$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lvh0/c$d;", "Lvh0/c;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorMessage", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36042c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String errorMessage) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.errorMessage, ((d) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: vh0.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvh0/c$e;", "Lvh0/c;", "<init>", "()V", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC36042c {

        /* JADX INFO: renamed from: a */
        public static final e f153776a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vh0.c$f */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b'\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b!\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b%\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b-\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b\u001d\u0010\u0014¨\u0006/"}, m65681d2 = {"Lvh0/c$f;", "Lvh0/c;", "Lcom/whoop/design/util/TextResource;", "header", "Lgz0/m0;", "headerRightIcon", "title", "message", "", "Lm91/u;", "contentItems", "Lvh0/e;", "generateAlternativesButton", "leftButton", "rightButton", "", "analyticsActivityString", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lvh0/e;Lvh0/e;Lvh0/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "c", "i", "g", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lvh0/e;", "()Lvh0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC36042c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource header;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC16313m0 headerRightIcon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<InterfaceC25312u> contentItems;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C36044e generateAlternativesButton;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C36044e leftButton;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C36044e rightButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String analyticsActivityString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(TextResource textResource, EnumC16313m0 enumC16313m0, TextResource textResource2, TextResource textResource3, List<? extends InterfaceC25312u> contentItems, C36044e c36044e, C36044e c36044e2, C36044e c36044e3, String analyticsActivityString) {
            super(null);
            AbstractC22676k.m65750j(contentItems, "contentItems");
            AbstractC22676k.m65750j(analyticsActivityString, "analyticsActivityString");
            this.header = textResource;
            this.headerRightIcon = enumC16313m0;
            this.title = textResource2;
            this.message = textResource3;
            this.contentItems = contentItems;
            this.generateAlternativesButton = c36044e;
            this.leftButton = c36044e2;
            this.rightButton = c36044e3;
            this.analyticsActivityString = analyticsActivityString;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsActivityString() {
            return this.analyticsActivityString;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m114409b() {
            return this.contentItems;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C36044e getGenerateAlternativesButton() {
            return this.generateAlternativesButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC16313m0 getHeaderRightIcon() {
            return this.headerRightIcon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.header, fVar.header) && this.headerRightIcon == fVar.headerRightIcon && AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.message, fVar.message) && AbstractC22676k.m65745e(this.contentItems, fVar.contentItems) && AbstractC22676k.m65745e(this.generateAlternativesButton, fVar.generateAlternativesButton) && AbstractC22676k.m65745e(this.leftButton, fVar.leftButton) && AbstractC22676k.m65745e(this.rightButton, fVar.rightButton) && AbstractC22676k.m65745e(this.analyticsActivityString, fVar.analyticsActivityString);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C36044e getLeftButton() {
            return this.leftButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C36044e getRightButton() {
            return this.rightButton;
        }

        public int hashCode() {
            TextResource textResource = this.header;
            int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            EnumC16313m0 enumC16313m0 = this.headerRightIcon;
            int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
            TextResource textResource2 = this.title;
            int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.message;
            int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, 31, this.contentItems);
            C36044e c36044e = this.generateAlternativesButton;
            int iHashCode4 = (iM31983b + (c36044e == null ? 0 : c36044e.hashCode())) * 31;
            C36044e c36044e2 = this.leftButton;
            int iHashCode5 = (iHashCode4 + (c36044e2 == null ? 0 : c36044e2.hashCode())) * 31;
            C36044e c36044e3 = this.rightButton;
            return this.analyticsActivityString.hashCode() + ((iHashCode5 + (c36044e3 != null ? c36044e3.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            TextResource textResource = this.header;
            EnumC16313m0 enumC16313m0 = this.headerRightIcon;
            TextResource textResource2 = this.title;
            TextResource textResource3 = this.message;
            List<InterfaceC25312u> list = this.contentItems;
            C36044e c36044e = this.generateAlternativesButton;
            C36044e c36044e2 = this.leftButton;
            C36044e c36044e3 = this.rightButton;
            String str = this.analyticsActivityString;
            StringBuilder sbM61140k = AbstractC21702c.m61140k("Success(header=", textResource, ", headerRightIcon=", enumC16313m0, ", title=");
            AbstractC30007c.m91855y(sbM61140k, textResource2, ", message=", textResource3, ", contentItems=");
            sbM61140k.append(list);
            sbM61140k.append(", generateAlternativesButton=");
            sbM61140k.append(c36044e);
            sbM61140k.append(", leftButton=");
            sbM61140k.append(c36044e2);
            sbM61140k.append(", rightButton=");
            sbM61140k.append(c36044e3);
            sbM61140k.append(", analyticsActivityString=");
            return AbstractC25012a.m73376i(str, ")", sbM61140k);
        }
    }

    public /* synthetic */ AbstractC36042c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36042c() {
    }
}
