package jw0;

import com.whoop.design.util.TextResource;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jw0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ljw0/c;", "", "<init>", "()V", "c", "d", "a", "b", "e", "g", "f", "Ljw0/c$a;", "Ljw0/c$b;", "Ljw0/c$c;", "Ljw0/c$d;", "Ljw0/c$e;", "Ljw0/c$f;", "Ljw0/c$g;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21985c {

    /* JADX INFO: renamed from: jw0.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Ljw0/c$a;", "Ljw0/c;", "Lcom/whoop/design/util/TextResource;", "errorTitle", "message", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21985c {

        /* JADX INFO: renamed from: c */
        public static final int f85128c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource errorTitle, TextResource message) {
            super(null);
            AbstractC22676k.m65750j(errorTitle, "errorTitle");
            AbstractC22676k.m65750j(message, "message");
            this.errorTitle = errorTitle;
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.errorTitle, aVar.errorTitle) && AbstractC22676k.m65745e(this.message, aVar.message);
        }

        public int hashCode() {
            return this.message.hashCode() + (this.errorTitle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("DeleteError(errorTitle=", this.errorTitle, ", message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: jw0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/c$b;", "Ljw0/c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21985c {

        /* JADX INFO: renamed from: a */
        public static final b f85131a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/c$c;", "Ljw0/c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21985c {

        /* JADX INFO: renamed from: a */
        public static final c f85132a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/c$d;", "Ljw0/c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21985c {

        /* JADX INFO: renamed from: a */
        public static final d f85133a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/c$e;", "Ljw0/c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC21985c {

        /* JADX INFO: renamed from: a */
        public static final e f85134a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Ljw0/c$f;", "Ljw0/c;", "Lcom/whoop/design/util/TextResource;", "errorTitle", "message", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21985c {

        /* JADX INFO: renamed from: c */
        public static final int f85135c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextResource errorTitle, TextResource message) {
            super(null);
            AbstractC22676k.m65750j(errorTitle, "errorTitle");
            AbstractC22676k.m65750j(message, "message");
            this.errorTitle = errorTitle;
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.errorTitle, fVar.errorTitle) && AbstractC22676k.m65745e(this.message, fVar.message);
        }

        public int hashCode() {
            return this.message.hashCode() + (this.errorTitle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("NapToSleepError(errorTitle=", this.errorTitle, ", message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: jw0.c$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/c$g;", "Ljw0/c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC21985c {

        /* JADX INFO: renamed from: a */
        public static final g f85138a = new g();

        private g() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC21985c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21985c() {
    }
}
