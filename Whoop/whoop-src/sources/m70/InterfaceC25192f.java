package m70;

import java.util.List;
import jy1.C22047a;
import m83.C25271y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m70.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lm70/f;", "", "Ljy1/a;", "b", "()Ljy1/a;", "", "getName", "()Ljava/lang/String;", "name", "", "a", "()Ljava/util/List;", "tags", "Lm70/f$a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25192f {
    /* JADX INFO: renamed from: a */
    List<String> mo73765a();

    /* JADX INFO: renamed from: b */
    default C22047a mo73766b() {
        return new C22047a(0, getName(), null, mo73765a(), null, 21, null);
    }

    String getName();

    /* JADX INFO: renamed from: m70.f$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lm70/f$a;", "Lm70/f;", "", "name", "", "tags", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC25192f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> tags;

        public a(String name, List<String> tags) {
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(tags, "tags");
            this.name = name;
            this.tags = tags;
        }

        @Override // m70.InterfaceC25192f
        /* JADX INFO: renamed from: a */
        public List<String> mo73765a() {
            return this.tags;
        }

        @Override // m70.InterfaceC25192f
        /* JADX INFO: renamed from: b */
        public /* bridge */ C22047a mo73766b() {
            return super.mo73766b();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.name, aVar.name) && AbstractC22676k.m65745e(this.tags, aVar.tags);
        }

        @Override // m70.InterfaceC25192f
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.tags.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("StripeException(name=", this.name, ", tags=", ")", this.tags);
        }

        public /* synthetic */ a(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "whoop.stripe.oobe.exception" : str, (i13 & 2) != 0 ? C25271y.f99162w : list);
        }
    }
}
