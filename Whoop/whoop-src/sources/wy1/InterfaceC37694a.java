package wy1;

import androidx.core.app.NotificationCompat;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xy1.EnumC38702c;

/* JADX INFO: renamed from: wy1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lwy1/a;", "", "b", "c", "e", "a", "d", "Lwy1/a$a;", "Lwy1/a$b;", "Lwy1/a$c;", "Lwy1/a$d;", "Lwy1/a$e;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37694a {

    /* JADX INFO: renamed from: wy1.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwy1/a$a;", "Lwy1/a;", "", "source", "", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "()F", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC37694a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float progress;

        public a(String source, float f13) {
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
            this.progress = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.source, aVar.source) && Float.compare(this.progress, aVar.progress) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.progress) + (this.source.hashCode() * 31);
        }

        public String toString() {
            return "Init(source=" + this.source + ", progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: wy1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwy1/a$b;", "Lwy1/a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC37694a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String value;

        public b(String value) {
            AbstractC22676k.m65750j(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.value, ((b) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnInputChanged(value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: wy1.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwy1/a$c;", "Lwy1/a;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC37694a {

        /* JADX INFO: renamed from: a */
        public static final c f161517a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: wy1.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwy1/a$d;", "Lwy1/a;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC37694a {

        /* JADX INFO: renamed from: a */
        public static final d f161518a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: wy1.a$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lwy1/a$e;", "Lwy1/a;", "", "input", "Lxy1/c;", "inputMode", "source", "<init>", "(Ljava/lang/String;Lxy1/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lxy1/c;", "()Lxy1/c;", "c", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC37694a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String input;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC38702c inputMode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public e(String input, EnumC38702c inputMode, String source) {
            AbstractC22676k.m65750j(input, "input");
            AbstractC22676k.m65750j(inputMode, "inputMode");
            AbstractC22676k.m65750j(source, "source");
            this.input = input;
            this.inputMode = inputMode;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC38702c getInputMode() {
            return this.inputMode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.input, eVar.input) && this.inputMode == eVar.inputMode && AbstractC22676k.m65745e(this.source, eVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + ((this.inputMode.hashCode() + (this.input.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.input;
            EnumC38702c enumC38702c = this.inputMode;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("SubmitInput(input=");
            sb4.append(str);
            sb4.append(", inputMode=");
            sb4.append(enumC38702c);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }
}
