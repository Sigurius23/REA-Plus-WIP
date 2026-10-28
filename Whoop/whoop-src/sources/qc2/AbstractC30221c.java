package qc2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qc2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lqc2/c;", "", "<init>", "()V", "a", "b", "Lqc2/c$a;", "Lqc2/c$b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30221c {

    /* JADX INFO: renamed from: qc2.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqc2/c$a;", "Lqc2/c;", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30221c {

        /* JADX INFO: renamed from: b */
        public static final int f123756b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.text, ((a) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("OnlyText(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: qc2.c$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lqc2/c$b;", "Lqc2/c;", "", "Lcom/whoop/design/util/TextResource;", "titles", "Lqc2/a;", "content", "<init>", "(Ljava/util/List;Lqc2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lqc2/a;", "()Lqc2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30221c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<TextResource> titles;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC30219a content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends TextResource> titles, AbstractC30219a content) {
            super(null);
            AbstractC22676k.m65750j(titles, "titles");
            AbstractC22676k.m65750j(content, "content");
            this.titles = titles;
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC30219a getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b */
        public final List<TextResource> m92496b() {
            return this.titles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.titles, bVar.titles) && AbstractC22676k.m65745e(this.content, bVar.content);
        }

        public int hashCode() {
            return this.content.hashCode() + (this.titles.hashCode() * 31);
        }

        public String toString() {
            return "TitleWithContent(titles=" + this.titles + ", content=" + this.content + ")";
        }
    }

    public /* synthetic */ AbstractC30221c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC30221c() {
    }
}
