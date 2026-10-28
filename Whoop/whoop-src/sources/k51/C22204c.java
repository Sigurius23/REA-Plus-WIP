package k51;

import c41.C4118t0;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: k51.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, m65681d2 = {"Lk51/c;", "Lm91/u;", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lc41/t0;", "coachingCtaTileState", "<init>", "(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Lc41/t0;", "()Lc41/t0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22204c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f86236e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4118t0 coachingCtaTileState;

    public C22204c(Integer num, TextResource title, TextResource body, C4118t0 c4118t0) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        this.icon = num;
        this.title = title;
        this.body = body;
        this.coachingCtaTileState = c4118t0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4118t0 getCoachingCtaTileState() {
        return this.coachingCtaTileState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22204c)) {
            return false;
        }
        C22204c c22204c = (C22204c) other;
        return AbstractC22676k.m65745e(this.icon, c22204c.icon) && AbstractC22676k.m65745e(this.title, c22204c.title) && AbstractC22676k.m65745e(this.body, c22204c.body) && AbstractC22676k.m65745e(this.coachingCtaTileState, c22204c.coachingCtaTileState);
    }

    public int hashCode() {
        Integer num = this.icon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((num == null ? 0 : num.hashCode()) * 31, this.title, 31), this.body, 31);
        C4118t0 c4118t0 = this.coachingCtaTileState;
        return iM95625a + (c4118t0 != null ? c4118t0.hashCode() : 0);
    }

    public String toString() {
        return "CoachingCardState(icon=" + this.icon + ", title=" + this.title + ", body=" + this.body + ", coachingCtaTileState=" + this.coachingCtaTileState + ")";
    }

    public /* synthetic */ C22204c(Integer num, TextResource textResource, TextResource textResource2, C4118t0 c4118t0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? Integer.valueOf(C38072d.f163053a.m121951d().getLogo().getWhoopRounded()) : num, textResource, textResource2, (i13 & 8) != 0 ? null : c4118t0);
    }
}
