package vm1;

import com.whoop.design.util.TextResource;
import nh3.AbstractC26725a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: vm1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lvm1/b;", "", "<init>", "()V", "b", "c", "a", "Lvm1/b$a;", "Lvm1/b$b;", "Lvm1/b$c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36155b {

    /* JADX INFO: renamed from: vm1.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lvm1/b$a;", "Lvm1/b;", "Lcom/whoop/design/util/TextResource;", "title", "description", "ctaText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36155b {

        /* JADX INFO: renamed from: d */
        public static final int f154679d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource ctaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, TextResource description, TextResource ctaText) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(ctaText, "ctaText");
            this.title = title;
            this.description = description;
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
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.ctaText, aVar.ctaText);
        }

        public int hashCode() {
            return this.ctaText.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("Error(title=", textResource, ", description=", textResource2, ", ctaText="), this.ctaText, ")");
        }
    }

    /* JADX INFO: renamed from: vm1.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvm1/b$b;", "Lvm1/b;", "Lcom/whoop/design/util/TextResource;", "processingText", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36155b {

        /* JADX INFO: renamed from: b */
        public static final int f154683b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource processingText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource processingText) {
            super(null);
            AbstractC22676k.m65750j(processingText, "processingText");
            this.processingText = processingText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getProcessingText() {
            return this.processingText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.processingText, ((b) other).processingText);
        }

        public int hashCode() {
            return this.processingText.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Processing(processingText=", this.processingText, ")");
        }
    }

    /* JADX INFO: renamed from: vm1.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lvm1/b$c;", "Lvm1/b;", "Lcom/whoop/design/util/TextResource;", "title", "description", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36155b {

        /* JADX INFO: renamed from: c */
        public static final int f154685c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource title, TextResource description) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            this.title = title;
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.description, cVar.description);
        }

        public int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("Success(title=", this.title, ", description=", this.description, ")");
        }
    }

    public /* synthetic */ AbstractC36155b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36155b() {
    }
}
