package ih0;

import ah0.EnumC0884e;
import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ih0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lih0/b;", "", "c", "a", "d", "e", "b", "Lih0/b$a;", "Lih0/b$b;", "Lih0/b$c;", "Lih0/b$d;", "Lih0/b$e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC18484b {

    /* JADX INFO: renamed from: ih0.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lih0/b$a;", "Lih0/b;", "", "formId", "formKey", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC18484b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer version;

        public a(String formId, String formKey, Integer num) {
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.formId, aVar.formId) && AbstractC22676k.m65745e(this.formKey, aVar.formKey) && AbstractC22676k.m65745e(this.version, aVar.version);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.formKey);
            Integer num = this.version;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.formKey;
            return AbstractC11478a.m30859k(AbstractC11895b.m32001t("BackgroundTapped(formId=", str, ", formKey=", str2, ", version="), this.version, ")");
        }
    }

    /* JADX INFO: renamed from: ih0.b$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lih0/b$b;", "Lih0/b;", "", "formId", "formKey", "", "version", "Lah0/e;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lah0/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lah0/e;", "()Lah0/e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC18484b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC0884e errorType;

        public b(String formId, String formKey, Integer num, EnumC0884e errorType) {
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC0884e getErrorType() {
            return this.errorType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.formId, bVar.formId) && AbstractC22676k.m65745e(this.formKey, bVar.formKey) && AbstractC22676k.m65745e(this.version, bVar.version) && this.errorType == bVar.errorType;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.formKey);
            Integer num = this.version;
            return this.errorType.hashCode() + ((iM30450d + (num == null ? 0 : num.hashCode())) * 31);
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.formKey;
            Integer num = this.version;
            EnumC0884e enumC0884e = this.errorType;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ErrorImpression(formId=", str, ", formKey=", str2, ", version=");
            sbM32001t.append(num);
            sbM32001t.append(", errorType=");
            sbM32001t.append(enumC0884e);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: ih0.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lih0/b$c;", "Lih0/b;", "", "formId", "formKey", "", "version", "questionId", "optionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC18484b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String questionId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String optionId;

        public c(String formId, String formKey, Integer num, String questionId, String optionId) {
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            AbstractC22676k.m65750j(questionId, "questionId");
            AbstractC22676k.m65750j(optionId, "optionId");
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.questionId = questionId;
            this.optionId = optionId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.formId, cVar.formId) && AbstractC22676k.m65745e(this.formKey, cVar.formKey) && AbstractC22676k.m65745e(this.version, cVar.version) && AbstractC22676k.m65745e(this.questionId, cVar.questionId) && AbstractC22676k.m65745e(this.optionId, cVar.optionId);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.formKey);
            Integer num = this.version;
            return this.optionId.hashCode() + AbstractC11266d.m30450d((iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31, this.questionId);
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.formKey;
            Integer num = this.version;
            String str3 = this.questionId;
            String str4 = this.optionId;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OptionSelected(formId=", str, ", formKey=", str2, ", version=");
            AbstractC13673n.m38577x(num, ", questionId=", str3, ", optionId=", sbM32001t);
            return AbstractC25012a.m73376i(str4, ")", sbM32001t);
        }
    }

    /* JADX INFO: renamed from: ih0.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lih0/b$d;", "Lih0/b;", "", "formId", "formKey", "", "version", "selectedOptionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC18484b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer version;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String selectedOptionId;

        public d(String formId, String formKey, Integer num, String str) {
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
            this.selectedOptionId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedOptionId() {
            return this.selectedOptionId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.formId, dVar.formId) && AbstractC22676k.m65745e(this.formKey, dVar.formKey) && AbstractC22676k.m65745e(this.version, dVar.version) && AbstractC22676k.m65745e(this.selectedOptionId, dVar.selectedOptionId);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.formKey);
            Integer num = this.version;
            int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.selectedOptionId;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.formKey;
            Integer num = this.version;
            String str3 = this.selectedOptionId;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SubmitTapped(formId=", str, ", formKey=", str2, ", version=");
            sbM32001t.append(num);
            sbM32001t.append(", selectedOptionId=");
            sbM32001t.append(str3);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: ih0.b$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lih0/b$e;", "Lih0/b;", "", "formId", "formKey", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC18484b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String formKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer version;

        public e(String formId, String formKey, Integer num) {
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(formKey, "formKey");
            this.formId = formId;
            this.formKey = formKey;
            this.version = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormKey() {
            return this.formKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Integer getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.formId, eVar.formId) && AbstractC22676k.m65745e(this.formKey, eVar.formKey) && AbstractC22676k.m65745e(this.version, eVar.version);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.formKey);
            Integer num = this.version;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.formKey;
            return AbstractC11478a.m30859k(AbstractC11895b.m32001t("ViewImpression(formId=", str, ", formKey=", str2, ", version="), this.version, ")");
        }
    }
}
