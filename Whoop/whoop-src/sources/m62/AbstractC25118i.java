package m62;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m62.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lm62/i;", "", "<init>", "()V", "a", "b", "Lm62/i$a;", "Lm62/i$b;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25118i {

    /* JADX INFO: renamed from: m62.i$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lm62/i$a;", "Lm62/i;", "", "code", "title", "body", "Lm62/f;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm62/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lm62/f;", "()Lm62/f;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25118i {

        /* JADX INFO: renamed from: e */
        public static final int f98443e = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C25115f cta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String code, String title, String body, C25115f cta) {
            super(null);
            AbstractC22676k.m65750j(code, "code");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(cta, "cta");
            this.code = code;
            this.title = title;
            this.body = body;
            this.cta = cta;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C25115f getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.code, aVar.code) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.body, aVar.body) && AbstractC22676k.m65745e(this.cta, aVar.cta);
        }

        public int hashCode() {
            return this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.title), 31, this.body);
        }

        public String toString() {
            String str = this.code;
            String str2 = this.title;
            String str3 = this.body;
            C25115f c25115f = this.cta;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PromotionRewardModalViewState(code=", str, ", title=", str2, ", body=");
            sbM32001t.append(str3);
            sbM32001t.append(", cta=");
            sbM32001t.append(c25115f);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: m62.i$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lm62/i$b;", "Lm62/i;", "", "title", "body", "closeCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25118i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String closeCtaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String title, String body, String closeCtaText) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(closeCtaText, "closeCtaText");
            this.title = title;
            this.body = body;
            this.closeCtaText = closeCtaText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCloseCtaText() {
            return this.closeCtaText;
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
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.body, bVar.body) && AbstractC22676k.m65745e(this.closeCtaText, bVar.closeCtaText);
        }

        public int hashCode() {
            return this.closeCtaText.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.closeCtaText, ")", AbstractC11895b.m32001t("PromotionTermsModalViewState(title=", this.title, ", body=", this.body, ", closeCtaText="));
        }
    }

    public /* synthetic */ AbstractC25118i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25118i() {
    }
}
