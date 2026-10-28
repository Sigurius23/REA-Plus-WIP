package w21;

import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: w21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\t\u0017B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lw21/b;", "Lm91/u;", "", "id", "", "Lw21/b$a;", "wheels", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Lw21/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36738b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<a> wheels;

    /* JADX INFO: renamed from: w21.b$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0010¨\u0006!"}, m65681d2 = {"Lw21/b$a;", "", "", "key", "", "Lw21/b$b;", "values", "unitLabel", "", "selectedIndex", "stateUpdateKey", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)Lw21/b$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "d", "I", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<b> values;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String unitLabel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int selectedIndex;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String stateUpdateKey;

        public a(String key, List<b> values, String str, int i13, String str2) {
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(values, "values");
            this.key = key;
            this.values = values;
            this.unitLabel = str;
            this.selectedIndex = i13;
            this.stateUpdateKey = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m117849b(a aVar, String str, List list, String str2, int i13, String str3, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = aVar.key;
            }
            if ((i14 & 2) != 0) {
                list = aVar.values;
            }
            if ((i14 & 4) != 0) {
                str2 = aVar.unitLabel;
            }
            if ((i14 & 8) != 0) {
                i13 = aVar.selectedIndex;
            }
            if ((i14 & 16) != 0) {
                str3 = aVar.stateUpdateKey;
            }
            String str4 = str3;
            String str5 = str2;
            return aVar.m117850a(str, list, str5, i13, str4);
        }

        /* JADX INFO: renamed from: a */
        public final a m117850a(String key, List<b> values, String unitLabel, int selectedIndex, String stateUpdateKey) {
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(values, "values");
            return new a(key, values, unitLabel, selectedIndex, stateUpdateKey);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStateUpdateKey() {
            return this.stateUpdateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.key, aVar.key) && AbstractC22676k.m65745e(this.values, aVar.values) && AbstractC22676k.m65745e(this.unitLabel, aVar.unitLabel) && this.selectedIndex == aVar.selectedIndex && AbstractC22676k.m65745e(this.stateUpdateKey, aVar.stateUpdateKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getUnitLabel() {
            return this.unitLabel;
        }

        /* JADX INFO: renamed from: g */
        public final List<b> m117855g() {
            return this.values;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.key.hashCode() * 31, 31, this.values);
            String str = this.unitLabel;
            int iM30448b = AbstractC11266d.m30448b(this.selectedIndex, (iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.stateUpdateKey;
            return iM30448b + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.key;
            List<b> list = this.values;
            String str2 = this.unitLabel;
            int i13 = this.selectedIndex;
            String str3 = this.stateUpdateKey;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("WheelState(key=", str, ", values=", ", unitLabel=", list);
            AbstractC11266d.m30470x(i13, str2, ", selectedIndex=", ", stateUpdateKey=", sbM94766o);
            return AbstractC25012a.m73376i(str3, ")", sbM94766o);
        }
    }

    /* JADX INFO: renamed from: w21.b$b */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lw21/b$b;", "", "", "displayValue", "rawValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String displayValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String rawValue;

        public b(String displayValue, String rawValue) {
            AbstractC22676k.m65750j(displayValue, "displayValue");
            AbstractC22676k.m65750j(rawValue, "rawValue");
            this.displayValue = displayValue;
            this.rawValue = rawValue;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisplayValue() {
            return this.displayValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRawValue() {
            return this.rawValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.displayValue, bVar.displayValue) && AbstractC22676k.m65745e(this.rawValue, bVar.rawValue);
        }

        public int hashCode() {
            return this.rawValue.hashCode() + (this.displayValue.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("WheelValue(displayValue=", this.displayValue, ", rawValue=", this.rawValue, ")");
        }
    }

    public C36738b(String id4, List<a> wheels) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(wheels, "wheels");
        this.id = id4;
        this.wheels = wheels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36738b m117846b(C36738b c36738b, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c36738b.id;
        }
        if ((i13 & 2) != 0) {
            list = c36738b.wheels;
        }
        return c36738b.m117847a(str, list);
    }

    /* JADX INFO: renamed from: a */
    public final C36738b m117847a(String id4, List<a> wheels) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(wheels, "wheels");
        return new C36738b(id4, wheels);
    }

    /* JADX INFO: renamed from: c */
    public final List<a> m117848c() {
        return this.wheels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36738b)) {
            return false;
        }
        C36738b c36738b = (C36738b) other;
        return AbstractC22676k.m65745e(this.id, c36738b.id) && AbstractC22676k.m65745e(this.wheels, c36738b.wheels);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.wheels.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("MultiWheelPickerItemViewState(id=", this.id, ", wheels=", ")", this.wheels);
    }
}
