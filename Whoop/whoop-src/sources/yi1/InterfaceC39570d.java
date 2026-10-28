package yi1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import ti1.AbstractC33852d;

/* JADX INFO: renamed from: yi1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lyi1/d;", "", "c", "b", "a", "Lyi1/d$a;", "Lyi1/d$b;", "Lyi1/d$c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC39570d {

    /* JADX INFO: renamed from: yi1.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyi1/d$b;", "Lyi1/d;", "<init>", "()V", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC39570d {

        /* JADX INFO: renamed from: a */
        public static final b f170266a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: yi1.d$c */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lyi1/d$c;", "Lyi1/d;", "", "Lm91/u;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC39570d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m126376a() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.items, ((c) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("Success(items=", ")", this.items);
        }
    }

    /* JADX INFO: renamed from: yi1.d$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lyi1/d$a;", "Lyi1/d;", "Lcom/whoop/design/util/TextResource;", "title", "message", "Lgz0/m0;", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC39570d {

        /* JADX INFO: renamed from: d */
        public static final int f170262d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        public a(TextResource title, TextResource message, EnumC16313m0 icon) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(icon, "icon");
            this.title = title;
            this.message = message;
            this.icon = icon;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
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
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.message, aVar.message) && this.icon == aVar.icon;
        }

        public int hashCode() {
            return this.icon.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.message, 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.message;
            EnumC16313m0 enumC16313m0 = this.icon;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("Error(title=", textResource, ", message=", textResource2, ", icon=");
            sbM106658q.append(enumC16313m0);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21277k(AbstractC33852d.f141776i) : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21277k(AbstractC33852d.f141777j) : textResource2, (i13 & 4) != 0 ? EnumC16313m0.TINY_INFORMATION : enumC16313m0);
        }
    }
}
