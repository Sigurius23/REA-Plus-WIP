package g72;

import c13.AbstractC3855a;
import j72.EnumC21402g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lg72/a;", "", "<init>", "()V", "c", "b", "a", "d", "Lg72/a$a;", "Lg72/a$b;", "Lg72/a$c;", "Lg72/a$d;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15547a {

    /* JADX INFO: renamed from: g72.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lg72/a$a;", "Lg72/a;", "<init>", "()V", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC15547a {

        /* JADX INFO: renamed from: a */
        public static final a f58310a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: g72.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lg72/a$b;", "Lg72/a;", "Lj72/g;", "nextScreen", "Lg72/f;", "content", "<init>", "(Lj72/g;Lg72/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj72/g;", "b", "()Lj72/g;", "Lg72/f;", "()Lg72/f;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC15547a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC21402g nextScreen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15552f content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC21402g enumC21402g, C15552f content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.nextScreen = enumC21402g;
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15552f getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC21402g getNextScreen() {
            return this.nextScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.nextScreen == bVar.nextScreen && AbstractC22676k.m65745e(this.content, bVar.content);
        }

        public int hashCode() {
            EnumC21402g enumC21402g = this.nextScreen;
            return this.content.hashCode() + ((enumC21402g == null ? 0 : enumC21402g.hashCode()) * 31);
        }

        public String toString() {
            return "Forward(nextScreen=" + this.nextScreen + ", content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: g72.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lg72/a$c;", "Lg72/a;", "", "skipToManualEntry", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC15547a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean skipToManualEntry;

        public c(boolean z4) {
            super(null);
            this.skipToManualEntry = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSkipToManualEntry() {
            return this.skipToManualEntry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.skipToManualEntry == ((c) other).skipToManualEntry;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipToManualEntry);
        }

        public String toString() {
            return AbstractC3855a.m11827k("LoadData(skipToManualEntry=", ")", this.skipToManualEntry);
        }
    }

    /* JADX INFO: renamed from: g72.a$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lg72/a$d;", "Lg72/a;", "Lg72/e;", "progressResult", "Lg72/f;", "saveRequest", "<init>", "(Lg72/e;Lg72/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg72/e;", "()Lg72/e;", "b", "Lg72/f;", "()Lg72/f;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC15547a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C15551e progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15552f saveRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15551e progressResult, C15552f saveRequest) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15551e getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C15552f getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.progressResult, dVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, dVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "ShowMostRecentSuccess(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    public /* synthetic */ AbstractC15547a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15547a() {
    }
}
