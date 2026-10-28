package oy2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: oy2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Loy2/h;", "", "e", "c", "d", "f", "a", "b", "Loy2/h$a;", "Loy2/h$b;", "Loy2/h$c;", "Loy2/h$d;", "Loy2/h$e;", "Loy2/h$f;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28482h {

    /* JADX INFO: renamed from: oy2.h$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loy2/h$a;", "Loy2/h;", "", "inputLabel", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC28482h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String inputLabel;

        public a(String str) {
            this.inputLabel = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInputLabel() {
            return this.inputLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.inputLabel, ((a) other).inputLabel);
        }

        public int hashCode() {
            String str = this.inputLabel;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DateTimePickerInputConfig(inputLabel=", this.inputLabel, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.h$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/h$b;", "Loy2/h;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28482h {

        /* JADX INFO: renamed from: a */
        public static final b f115284a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: oy2.h$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b \u0010\u000f¨\u0006#"}, m65681d2 = {"Loy2/h$c;", "Loy2/h;", "", "required", "", "inputLabel", "", "min", "max", "hint", "minErrorText", "maxErrorText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "d", "f", "g", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC28482h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean required;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String inputLabel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer min;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer max;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String hint;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String minErrorText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String maxErrorText;

        public c(Boolean bool, String str, Integer num, Integer num2, String str2, String str3, String str4) {
            this.required = bool;
            this.inputLabel = str;
            this.min = num;
            this.max = num2;
            this.hint = str2;
            this.minErrorText = str3;
            this.maxErrorText = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInputLabel() {
            return this.inputLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMaxErrorText() {
            return this.maxErrorText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.required, cVar.required) && AbstractC22676k.m65745e(this.inputLabel, cVar.inputLabel) && AbstractC22676k.m65745e(this.min, cVar.min) && AbstractC22676k.m65745e(this.max, cVar.max) && AbstractC22676k.m65745e(this.hint, cVar.hint) && AbstractC22676k.m65745e(this.minErrorText, cVar.minErrorText) && AbstractC22676k.m65745e(this.maxErrorText, cVar.maxErrorText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMinErrorText() {
            return this.minErrorText;
        }

        public int hashCode() {
            Boolean bool = this.required;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.inputLabel;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.min;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.max;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.hint;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.minErrorText;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.maxErrorText;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            Boolean bool = this.required;
            String str = this.inputLabel;
            Integer num = this.min;
            Integer num2 = this.max;
            String str2 = this.hint;
            String str3 = this.minErrorText;
            String str4 = this.maxErrorText;
            StringBuilder sb4 = new StringBuilder("NumberInputConfig(required=");
            sb4.append(bool);
            sb4.append(", inputLabel=");
            sb4.append(str);
            sb4.append(", min=");
            AbstractC31061c.m95621A(sb4, num, ", max=", num2, ", hint=");
            AbstractC11266d.m30444B(sb4, str2, ", minErrorText=", str3, ", maxErrorText=");
            return AbstractC25012a.m73376i(str4, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: oy2.h$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010\u0010¨\u0006%"}, m65681d2 = {"Loy2/h$d;", "Loy2/h;", "", "required", "", "inputLabel", "", "rowCount", "min", "max", "hint", "minErrorText", "maxErrorText", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "e", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC28482h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean required;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String inputLabel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer rowCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer min;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Integer max;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String hint;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String minErrorText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String maxErrorText;

        public d(Boolean bool, String str, Integer num, Integer num2, Integer num3, String str2, String str3, String str4) {
            this.required = bool;
            this.inputLabel = str;
            this.rowCount = num;
            this.min = num2;
            this.max = num3;
            this.hint = str2;
            this.minErrorText = str3;
            this.maxErrorText = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInputLabel() {
            return this.inputLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMaxErrorText() {
            return this.maxErrorText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.required, dVar.required) && AbstractC22676k.m65745e(this.inputLabel, dVar.inputLabel) && AbstractC22676k.m65745e(this.rowCount, dVar.rowCount) && AbstractC22676k.m65745e(this.min, dVar.min) && AbstractC22676k.m65745e(this.max, dVar.max) && AbstractC22676k.m65745e(this.hint, dVar.hint) && AbstractC22676k.m65745e(this.minErrorText, dVar.minErrorText) && AbstractC22676k.m65745e(this.maxErrorText, dVar.maxErrorText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMinErrorText() {
            return this.minErrorText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getRowCount() {
            return this.rowCount;
        }

        public int hashCode() {
            Boolean bool = this.required;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.inputLabel;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.rowCount;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.min;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.max;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str2 = this.hint;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.minErrorText;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.maxErrorText;
            return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            Boolean bool = this.required;
            String str = this.inputLabel;
            Integer num = this.rowCount;
            Integer num2 = this.min;
            Integer num3 = this.max;
            String str2 = this.hint;
            String str3 = this.minErrorText;
            String str4 = this.maxErrorText;
            StringBuilder sb4 = new StringBuilder("TextInputConfig(required=");
            sb4.append(bool);
            sb4.append(", inputLabel=");
            sb4.append(str);
            sb4.append(", rowCount=");
            AbstractC31061c.m95621A(sb4, num, ", min=", num2, ", max=");
            AbstractC13673n.m38577x(num3, ", hint=", str2, ", minErrorText=", sb4);
            return AbstractC11266d.m30464r(sb4, str3, ", maxErrorText=", str4, ")");
        }
    }

    /* JADX INFO: renamed from: oy2.h$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Loy2/h$e;", "Loy2/h;", "", "required", "", "Loy2/k;", "inputOptions", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "b", "Ljava/util/List;", "()Ljava/util/List;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC28482h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Boolean required;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C28485k> inputOptions;

        public e(Boolean bool, List<C28485k> inputOptions) {
            AbstractC22676k.m65750j(inputOptions, "inputOptions");
            this.required = bool;
            this.inputOptions = inputOptions;
        }

        /* JADX INFO: renamed from: a */
        public final List<C28485k> m86730a() {
            return this.inputOptions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.required, eVar.required) && AbstractC22676k.m65745e(this.inputOptions, eVar.inputOptions);
        }

        public int hashCode() {
            Boolean bool = this.required;
            return this.inputOptions.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public String toString() {
            return "TextSelectionInputConfig(required=" + this.required + ", inputOptions=" + this.inputOptions + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.h$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loy2/h$f;", "Loy2/h;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC28482h {

        /* JADX INFO: renamed from: a */
        public static final f f115302a = new f();

        private f() {
        }
    }
}
