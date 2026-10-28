package px2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: px2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lpx2/g;", "", "Lpx2/b;", "a", "()Lpx2/b;", "bottomSheetContent", "c", "b", "Lpx2/g$a;", "Lpx2/g$b;", "Lpx2/g$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29604g {

    /* JADX INFO: renamed from: px2.g$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lpx2/g$a;", "Lpx2/g;", "Lpx2/b;", "content", "<init>", "(Lpx2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpx2/b;", "b", "()Lpx2/b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC29604g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC29599b content;

        public a(AbstractC29599b content) {
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        @Override // px2.InterfaceC29604g
        /* JADX INFO: renamed from: a */
        public /* bridge */ AbstractC29599b mo90844a() {
            return super.mo90844a();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC29599b getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.content, ((a) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "BottomSheet(content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: px2.g$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lpx2/g$b;", "Lpx2/g;", "Lpx2/l;", "content", "<init>", "(Lpx2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpx2/l;", "b", "()Lpx2/l;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC29604g {

        /* JADX INFO: renamed from: b */
        public static final int f120917b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C29609l content;

        public b(C29609l content) {
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        @Override // px2.InterfaceC29604g
        /* JADX INFO: renamed from: a */
        public /* bridge */ AbstractC29599b mo90844a() {
            return super.mo90844a();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C29609l getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.content, ((b) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Modal(content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: px2.g$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpx2/g$c;", "Lpx2/g;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC29604g {

        /* JADX INFO: renamed from: a */
        public static final c f120919a = new c();

        private c() {
        }

        @Override // px2.InterfaceC29604g
        /* JADX INFO: renamed from: a */
        public /* bridge */ AbstractC29599b mo90844a() {
            return super.mo90844a();
        }
    }

    /* JADX INFO: renamed from: a */
    default AbstractC29599b mo90844a() {
        return this instanceof a ? ((a) this).getContent() : AbstractC29599b.c.f120868a;
    }
}
