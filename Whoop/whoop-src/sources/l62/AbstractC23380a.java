package l62;

import com.whoop.navigation.C9598e;
import h62.C16982b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: l62.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ll62/a;", "", "<init>", "()V", "a", "b", "c", "Ll62/a$a;", "Ll62/a$b;", "Ll62/a$c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23380a {

    /* JADX INFO: renamed from: l62.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll62/a$a;", "Ll62/a;", "<init>", "()V", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC23380a {

        /* JADX INFO: renamed from: a */
        public static final a f92669a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: l62.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll62/a$b;", "Ll62/a;", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC23380a {

        /* JADX INFO: renamed from: b */
        public static final int f92670b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9598e action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("NavigationEvent(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: l62.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Ll62/a$c;", "Ll62/a;", "", "shareMessage", "code", "Lh62/b$a$a;", "source", "codeNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lh62/b$a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lh62/b$a$a;", "d", "()Lh62/b$a$a;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC23380a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String shareMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String code;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C16982b.Companion.EnumC41682a source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String codeNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String shareMessage, String code, C16982b.Companion.EnumC41682a source, String codeNumber) {
            super(null);
            AbstractC22676k.m65750j(shareMessage, "shareMessage");
            AbstractC22676k.m65750j(code, "code");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(codeNumber, "codeNumber");
            this.shareMessage = shareMessage;
            this.code = code;
            this.source = source;
            this.codeNumber = codeNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCodeNumber() {
            return this.codeNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getShareMessage() {
            return this.shareMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C16982b.Companion.EnumC41682a getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.shareMessage, cVar.shareMessage) && AbstractC22676k.m65745e(this.code, cVar.code) && this.source == cVar.source && AbstractC22676k.m65745e(this.codeNumber, cVar.codeNumber);
        }

        public int hashCode() {
            return this.codeNumber.hashCode() + ((this.source.hashCode() + AbstractC11266d.m30450d(this.shareMessage.hashCode() * 31, 31, this.code)) * 31);
        }

        public String toString() {
            String str = this.shareMessage;
            String str2 = this.code;
            C16982b.Companion.EnumC41682a enumC41682a = this.source;
            String str3 = this.codeNumber;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareTrialPromoCode(shareMessage=", str, ", code=", str2, ", source=");
            sbM32001t.append(enumC41682a);
            sbM32001t.append(", codeNumber=");
            sbM32001t.append(str3);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public /* synthetic */ AbstractC23380a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC23380a() {
    }
}
