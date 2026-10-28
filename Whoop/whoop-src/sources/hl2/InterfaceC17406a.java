package hl2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;

/* JADX INFO: renamed from: hl2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lhl2/a;", "", "a", "b", "Lhl2/a$a;", "Lhl2/a$b;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17406a {

    /* JADX INFO: renamed from: hl2.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lhl2/a$a;", "Lhl2/a;", "", "value", "minValue", "maxValue", "<init>", "(III)V", "a", "(III)Lhl2/a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "d", "c", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC17406a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int minValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int maxValue;

        public a(int i13, int i14, int i15) {
            this.value = i13;
            this.minValue = i14;
            this.maxValue = i15;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m49357b(a aVar, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i13 = aVar.value;
            }
            if ((i16 & 2) != 0) {
                i14 = aVar.minValue;
            }
            if ((i16 & 4) != 0) {
                i15 = aVar.maxValue;
            }
            return aVar.m49358a(i13, i14, i15);
        }

        /* JADX INFO: renamed from: a */
        public final a m49358a(int value, int minValue, int maxValue) {
            return new a(value, minValue, maxValue);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public int getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public int getMinValue() {
            return this.minValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public int getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.value == aVar.value && this.minValue == aVar.minValue && this.maxValue == aVar.maxValue;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxValue) + AbstractC11266d.m30448b(this.minValue, Integer.hashCode(this.value) * 31, 31);
        }

        public String toString() {
            int i13 = this.value;
            int i14 = this.minValue;
            return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "BottomSheetMaxHrDomainState(value=", ", minValue=", ", maxValue="), this.maxValue, ")");
        }
    }

    /* JADX INFO: renamed from: hl2.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lhl2/a$b;", "Lhl2/a;", "", "id", "", "value", "minValue", "maxValue", "Lsz0/v1;", "type", "<init>", "(Ljava/lang/String;IIILsz0/v1;)V", "a", "(Ljava/lang/String;IIILsz0/v1;)Lhl2/a$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "I", "g", "e", "d", "Lsz0/v1;", "f", "()Lsz0/v1;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC17406a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int minValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int maxValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC33227v1 type;

        public b(String id4, int i13, int i14, int i15, EnumC33227v1 type) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(type, "type");
            this.id = id4;
            this.value = i13;
            this.minValue = i14;
            this.maxValue = i15;
            this.type = type;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m49362b(b bVar, String str, int i13, int i14, int i15, EnumC33227v1 enumC33227v1, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                str = bVar.id;
            }
            if ((i16 & 2) != 0) {
                i13 = bVar.value;
            }
            if ((i16 & 4) != 0) {
                i14 = bVar.minValue;
            }
            if ((i16 & 8) != 0) {
                i15 = bVar.maxValue;
            }
            if ((i16 & 16) != 0) {
                enumC33227v1 = bVar.type;
            }
            EnumC33227v1 enumC33227v2 = enumC33227v1;
            int i17 = i14;
            return bVar.m49363a(str, i13, i17, i15, enumC33227v2);
        }

        /* JADX INFO: renamed from: a */
        public final b m49363a(String id4, int value, int minValue, int maxValue, EnumC33227v1 type) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(type, "type");
            return new b(id4, value, minValue, maxValue, type);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public int getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public int getMinValue() {
            return this.minValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.id, bVar.id) && this.value == bVar.value && this.minValue == bVar.minValue && this.maxValue == bVar.maxValue && this.type == bVar.type;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC33227v1 getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.type.hashCode() + AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC11266d.m30448b(this.value, this.id.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            String str = this.id;
            int i13 = this.value;
            int i14 = this.minValue;
            int i15 = this.maxValue;
            EnumC33227v1 enumC33227v1 = this.type;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "BottomSheetZoneDomainState(id=", str, ", value=", ", minValue=");
            AbstractC30802r.m94773v(sbM30467u, i14, ", maxValue=", i15, ", type=");
            sbM30467u.append(enumC33227v1);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }
    }
}
