package gl0;

import com.whoop.design.models.items.ArticleTileCarouselModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lgl0/c;", "", "<init>", "()V", "a", "c", "b", "Lgl0/c$a;", "Lgl0/c$b;", "Lgl0/c$c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15964c {

    /* JADX INFO: renamed from: gl0.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgl0/c$a;", "Lgl0/c;", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "carousel", "<init>", "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC15964c {

        /* JADX INFO: renamed from: b */
        public static final int f60430b = ArticleTileCarouselModel.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ArticleTileCarouselModel carousel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArticleTileCarouselModel carousel) {
            super(null);
            AbstractC22676k.m65750j(carousel, "carousel");
            this.carousel = carousel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ArticleTileCarouselModel getCarousel() {
            return this.carousel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.carousel, ((a) other).carousel);
        }

        public int hashCode() {
            return this.carousel.hashCode();
        }

        public String toString() {
            return "Fetch(carousel=" + this.carousel + ")";
        }
    }

    /* JADX INFO: renamed from: gl0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgl0/c$b;", "Lgl0/c;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC15964c {

        /* JADX INFO: renamed from: a */
        public static final b f60432a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gl0.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgl0/c$c;", "Lgl0/c;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC15964c {

        /* JADX INFO: renamed from: a */
        public static final c f60433a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC15964c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15964c() {
    }
}
