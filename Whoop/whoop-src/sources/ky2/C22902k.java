package ky2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ky2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lky2/k;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "screeningSubmissionResponse", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22902k {

    /* JADX INFO: renamed from: d */
    public static final int f90443d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScreeningSubmissionResponse screeningSubmissionResponse;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f90443d = i13 | i14 | i14;
    }

    public C22902k(TextResource title, TextResource textResource, ScreeningSubmissionResponse screeningSubmissionResponse) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(screeningSubmissionResponse, "screeningSubmissionResponse");
        this.title = title;
        this.subtitle = textResource;
        this.screeningSubmissionResponse = screeningSubmissionResponse;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ScreeningSubmissionResponse getScreeningSubmissionResponse() {
        return this.screeningSubmissionResponse;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22902k)) {
            return false;
        }
        C22902k c22902k = (C22902k) other;
        return AbstractC22676k.m65745e(this.title, c22902k.title) && AbstractC22676k.m65745e(this.subtitle, c22902k.subtitle) && AbstractC22676k.m65745e(this.screeningSubmissionResponse, c22902k.screeningSubmissionResponse);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        return this.screeningSubmissionResponse.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        ScreeningSubmissionResponse screeningSubmissionResponse = this.screeningSubmissionResponse;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SubmittedViewState(title=", textResource, ", subtitle=", textResource2, ", screeningSubmissionResponse=");
        sbM106658q.append(screeningSubmissionResponse);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
