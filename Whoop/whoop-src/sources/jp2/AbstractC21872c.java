package jp2;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import java.util.List;
import np2.C27036c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Ljp2/c;", "", "<init>", "()V", "b", "a", "Ljp2/c$a;", "Ljp2/c$b;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21872c {

    /* JADX INFO: renamed from: jp2.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljp2/c$a;", "Ljp2/c;", "", "fieldId", "value", "pattern", "displayLabel", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21872c {

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
        public a(String fieldId, String str, String str2, String displayLabel, Integer num) {
            super(null);
            AbstractC22676k.m65750j(fieldId, "fieldId");
            AbstractC22676k.m65750j(displayLabel, "displayLabel");
            this.fieldId = fieldId;
            this.value = str;
            this.pattern = str2;
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.fieldId, aVar.fieldId) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.pattern, aVar.pattern) && AbstractC22676k.m65745e(this.displayLabel, aVar.displayLabel) && AbstractC22676k.m65745e(this.minLength, aVar.minLength);
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.pattern;
            int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.displayLabel);
            Integer num = this.minLength;
            return iM30450d + (num != null ? num.hashCode() : 0);
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

    /* JADX INFO: renamed from: jp2.c$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljp2/c$b;", "Ljp2/c;", "", "fieldType", "title", "", "Lnp2/c$e;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21872c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C27036c.e> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String fieldType, String title, List<C27036c.e> options) {
            super(null);
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(options, "options");
            this.fieldType = fieldType;
            this.title = title;
            this.options = options;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: b */
        public final List<C27036c.e> m62009b() {
            return this.options;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fieldType, bVar.fieldType) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.options, bVar.options);
        }

        public int hashCode() {
            return this.options.hashCode() + AbstractC11266d.m30450d(this.fieldType.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            String str = this.fieldType;
            String str2 = this.title;
            return AbstractC3855a.m11829m(AbstractC11895b.m32001t("OpenBottomSheetWithOptions(fieldType=", str, ", title=", str2, ", options="), this.options, ")");
        }
    }

    public /* synthetic */ AbstractC21872c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21872c() {
    }
}
