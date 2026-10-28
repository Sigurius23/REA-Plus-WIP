package n71;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fz0.C14889d;
import gy0.AbstractC16277f;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Ln71/f;", "", "Lcom/whoop/design/util/TextResource;", "a", "()Lcom/whoop/design/util/TextResource;", "defaultStatTitle", "", "Lfz0/d;", "b", "()Ljava/util/List;", "hrZonesState", "Ln71/f$a;", "Ln71/f$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26425f {

    /* JADX INFO: renamed from: n71.f$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, m65681d2 = {"Ln71/f$a;", "Ln71/f;", "", "currentHr", "maxHr", "", "Lfz0/d;", "hrZonesState", "<init>", "(IILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "getMaxHr", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource$b;", "d", "Lcom/whoop/design/util/TextResource$b;", "()Lcom/whoop/design/util/TextResource$b;", "defaultStatTitle", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC26425f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int currentHr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int maxHr;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C14889d> hrZonesState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource.C8688b defaultStatTitle;

        public a(int i13, int i14, List<C14889d> hrZonesState) {
            AbstractC22676k.m65750j(hrZonesState, "hrZonesState");
            this.currentHr = i13;
            this.maxHr = i14;
            this.hrZonesState = hrZonesState;
            this.defaultStatTitle = AbstractC8693b.m21277k(AbstractC16277f.f62234F0);
        }

        @Override // n71.InterfaceC26425f
        /* JADX INFO: renamed from: b */
        public List<C14889d> mo78184b() {
            return this.hrZonesState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentHr() {
            return this.currentHr;
        }

        @Override // n71.InterfaceC26425f
        /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo78183a() {
            return this.defaultStatTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.currentHr == aVar.currentHr && this.maxHr == aVar.maxHr && AbstractC22676k.m65745e(this.hrZonesState, aVar.hrZonesState);
        }

        public int hashCode() {
            return this.hrZonesState.hashCode() + AbstractC11266d.m30448b(this.maxHr, Integer.hashCode(this.currentHr) * 31, 31);
        }

        public String toString() {
            int i13 = this.currentHr;
            int i14 = this.maxHr;
            return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "Default(currentHr=", ", maxHr=", ", hrZonesState="), this.hrZonesState, ")");
        }
    }

    /* JADX INFO: renamed from: n71.f$b */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Ln71/f$b;", "Ln71/f;", "", "Lfz0/d;", "hrZonesState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource$b;", "Lcom/whoop/design/util/TextResource$b;", "c", "()Lcom/whoop/design/util/TextResource$b;", "defaultStatTitle", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC26425f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C14889d> hrZonesState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource.C8688b defaultStatTitle;

        public b(List<C14889d> hrZonesState) {
            AbstractC22676k.m65750j(hrZonesState, "hrZonesState");
            this.hrZonesState = hrZonesState;
            this.defaultStatTitle = AbstractC8693b.m21277k(AbstractC16277f.f62238G0);
        }

        @Override // n71.InterfaceC26425f
        /* JADX INFO: renamed from: b */
        public List<C14889d> mo78184b() {
            return this.hrZonesState;
        }

        @Override // n71.InterfaceC26425f
        /* JADX INFO: renamed from: c, reason: from getter and merged with bridge method [inline-methods] */
        public TextResource.C8688b mo78183a() {
            return this.defaultStatTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.hrZonesState, ((b) other).hrZonesState);
        }

        public int hashCode() {
            return this.hrZonesState.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("Disconnected(hrZonesState=", ")", this.hrZonesState);
        }
    }

    /* JADX INFO: renamed from: a */
    TextResource mo78183a();

    /* JADX INFO: renamed from: b */
    List<C14889d> mo78184b();
}
