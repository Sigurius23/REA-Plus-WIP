package jp2;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: jp2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ljp2/i;", "", "<init>", "()V", "c", "b", "a", "Ljp2/i$a;", "Ljp2/i$b;", "Ljp2/i$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21878i {

    /* JADX INFO: renamed from: jp2.i$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ljp2/i$a;", "Ljp2/i;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21878i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.source, ((a) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CountryFieldClicked(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: jp2.i$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljp2/i$b;", "Ljp2/i;", "", "fieldId", "value", "pattern", "displayLabel", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21878i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String pattern;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String displayLabel;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Integer minLength;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String fieldId, String value, String str, String displayLabel, Integer num) {
            super(null);
            AbstractC22676k.m65750j(fieldId, "fieldId");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(displayLabel, "displayLabel");
            this.fieldId = fieldId;
            this.value = value;
            this.pattern = str;
            this.displayLabel = displayLabel;
            this.minLength = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisplayLabel() {
            return this.displayLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getMinLength() {
            return this.minLength;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fieldId, bVar.fieldId) && AbstractC22676k.m65745e(this.value, bVar.value) && AbstractC22676k.m65745e(this.pattern, bVar.pattern) && AbstractC22676k.m65745e(this.displayLabel, bVar.displayLabel) && AbstractC22676k.m65745e(this.minLength, bVar.minLength);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.fieldId.hashCode() * 31, 31, this.value);
            String str = this.pattern;
            int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayLabel);
            Integer num = this.minLength;
            return iM30450d2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.fieldId;
            String str2 = this.value;
            String str3 = this.pattern;
            String str4 = this.displayLabel;
            Integer num = this.minLength;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FieldFocusLost(fieldId=", str, ", value=", str2, ", pattern=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", displayLabel=", str4, ", minLength=");
            return AbstractC11478a.m30859k(sbM32001t, num, ")");
        }
    }

    /* JADX INFO: renamed from: jp2.i$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u001e"}, m65681d2 = {"Ljp2/i$c;", "Ljp2/i;", "", "fieldId", "value", "", "maxLength", "minLength", "pattern", "displayLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21878i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer maxLength;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer minLength;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String pattern;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String displayLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String fieldId, String value, Integer num, Integer num2, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(fieldId, "fieldId");
            AbstractC22676k.m65750j(value, "value");
            this.fieldId = fieldId;
            this.value = value;
            this.maxLength = num;
            this.minLength = num2;
            this.pattern = str;
            this.displayLabel = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisplayLabel() {
            return this.displayLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getMaxLength() {
            return this.maxLength;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getMinLength() {
            return this.minLength;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.fieldId, cVar.fieldId) && AbstractC22676k.m65745e(this.value, cVar.value) && AbstractC22676k.m65745e(this.maxLength, cVar.maxLength) && AbstractC22676k.m65745e(this.minLength, cVar.minLength) && AbstractC22676k.m65745e(this.pattern, cVar.pattern) && AbstractC22676k.m65745e(this.displayLabel, cVar.displayLabel);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.fieldId.hashCode() * 31, 31, this.value);
            Integer num = this.maxLength;
            int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minLength;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.pattern;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displayLabel;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.fieldId;
            String str2 = this.value;
            Integer num = this.maxLength;
            Integer num2 = this.minLength;
            String str3 = this.pattern;
            String str4 = this.displayLabel;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("TextChanged(fieldId=", str, ", value=", str2, ", maxLength=");
            AbstractC31061c.m95621A(sbM32001t, num, ", minLength=", num2, ", pattern=");
            return AbstractC11266d.m30464r(sbM32001t, str3, ", displayLabel=", str4, ")");
        }
    }

    public /* synthetic */ AbstractC21878i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21878i() {
    }
}
