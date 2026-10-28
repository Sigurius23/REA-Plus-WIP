package bs1;

import c13.AbstractC3855a;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import w71.C36906y;

/* JADX INFO: renamed from: bs1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lbs1/h;", "", "<init>", "()V", "b", "a", "Lbs1/h$a;", "Lbs1/h$b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC3589h {

    /* JADX INFO: renamed from: bs1.h$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lbs1/h$a;", "Lbs1/h;", "Lhy0/e;", "item", "<init>", "(Lhy0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhy0/e;", "()Lhy0/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC3589h {

        /* JADX INFO: renamed from: b */
        public static final int f14578b = C17736e.f68939d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17736e item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17736e item) {
            super(null);
            AbstractC22676k.m65750j(item, "item");
            this.item = item;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17736e getItem() {
            return this.item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.item, ((a) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Divider(item=" + this.item + ")";
        }
    }

    /* JADX INFO: renamed from: bs1.h$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lbs1/h$b;", "Lbs1/h;", "", "id", "", "groupName", "", "Lw71/y;", "items", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getGroupName", "c", "Ljava/util/List;", "()Ljava/util/List;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC3589h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String groupName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C36906y> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, String groupName, List<C36906y> items) {
            super(null);
            AbstractC22676k.m65750j(groupName, "groupName");
            AbstractC22676k.m65750j(items, "items");
            this.id = i13;
            this.groupName = groupName;
            this.items = items;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b */
        public final List<C36906y> m10950b() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.id == bVar.id && AbstractC22676k.m65745e(this.groupName, bVar.groupName) && AbstractC22676k.m65745e(this.items, bVar.items);
        }

        public int hashCode() {
            return this.items.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.groupName);
        }

        public String toString() {
            int i13 = this.id;
            String str = this.groupName;
            return AbstractC3855a.m11829m(AbstractC18489d0.m53373n(i13, "JournalQuestion(id=", ", groupName=", str, ", items="), this.items, ")");
        }
    }

    public /* synthetic */ AbstractC3589h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3589h() {
    }
}
