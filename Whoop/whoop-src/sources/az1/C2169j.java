package az1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import py1.AbstractC29625d;

/* JADX INFO: renamed from: az1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Laz1/j;", "", "Lcom/whoop/design/util/TextResource;", "headerText", "bodyText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2169j {

    /* JADX INFO: renamed from: c */
    public static final int f8617c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource headerText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource bodyText;

    public C2169j(TextResource headerText, TextResource bodyText) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(bodyText, "bodyText");
        this.headerText = headerText;
        this.bodyText = bodyText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHeaderText() {
        return this.headerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2169j)) {
            return false;
        }
        C2169j c2169j = (C2169j) other;
        return AbstractC22676k.m65745e(this.headerText, c2169j.headerText) && AbstractC22676k.m65745e(this.bodyText, c2169j.bodyText);
    }

    public int hashCode() {
        return this.bodyText.hashCode() + (this.headerText.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79501e("MfaSetupIntroViewState(headerText=", this.headerText, ", bodyText=", this.bodyText, ")");
    }

    public /* synthetic */ C2169j(TextResource textResource, TextResource textResource2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f120974E) : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21277k(AbstractC29625d.f120972C) : textResource2);
    }
}
