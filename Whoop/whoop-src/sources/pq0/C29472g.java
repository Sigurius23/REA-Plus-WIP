package pq0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36512c;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: pq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m65681d2 = {"Lpq0/g;", "", "", "errorTitle", "errorDescription", "errorIcon", "", "isRetryVisible", "shareButtonEnable", "shareButtonVisible", "<init>", "(IIIZZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "d", "c", "e", "Z", "i", "()Z", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29472g {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    private static final C29472g f119708h;

    /* JADX INFO: renamed from: i */
    private static final C29472g f119709i;

    /* JADX INFO: renamed from: j */
    private static final C29472g f119710j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int errorDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int errorIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRetryVisible;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean shareButtonEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean shareButtonVisible;

    /* JADX INFO: renamed from: pq0.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m65681d2 = {"Lpq0/g$a;", "", "<init>", "()V", "Lpq0/g;", "NO_NETWORK_STATE", "Lpq0/g;", "b", "()Lpq0/g;", "EMPTY_DATA_STATE", "a", "SOMETHING_WENT_WRONG_STATE", "c", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C29472g m90002a() {
            return C29472g.f119709i;
        }

        /* JADX INFO: renamed from: b */
        public final C29472g m90003b() {
            return C29472g.f119708h;
        }

        /* JADX INFO: renamed from: c */
        public final C29472g m90004c() {
            return C29472g.f119710j;
        }

        private Companion() {
        }
    }

    static {
        int i13 = AbstractC38505d0.f165611Q;
        f119708h = new C29472g(i13, i13, AbstractC36512c.f156068k, true, false, false);
        f119709i = new C29472g(AbstractC38505d0.f165620T, AbstractC38505d0.f165590J, AbstractC38529z.f165824q, false, false, true);
        int i14 = AbstractC38505d0.f165729x0;
        f119710j = new C29472g(i14, i14, AbstractC38529z.f165831x, true, false, false);
    }

    public C29472g(int i13, int i14, int i15, boolean z4, boolean z13, boolean z14) {
        this.errorTitle = i13;
        this.errorDescription = i14;
        this.errorIcon = i15;
        this.isRetryVisible = z4;
        this.shareButtonEnable = z13;
        this.shareButtonVisible = z14;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29472g)) {
            return false;
        }
        C29472g c29472g = (C29472g) other;
        return this.errorTitle == c29472g.errorTitle && this.errorDescription == c29472g.errorDescription && this.errorIcon == c29472g.errorIcon && this.isRetryVisible == c29472g.isRetryVisible && this.shareButtonEnable == c29472g.shareButtonEnable && this.shareButtonVisible == c29472g.shareButtonVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShareButtonEnable() {
        return this.shareButtonEnable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShareButtonVisible() {
        return this.shareButtonVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shareButtonVisible) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.errorIcon, AbstractC11266d.m30448b(this.errorDescription, Integer.hashCode(this.errorTitle) * 31, 31), 31), 31, this.isRetryVisible), 31, this.shareButtonEnable);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsRetryVisible() {
        return this.isRetryVisible;
    }

    public String toString() {
        int i13 = this.errorTitle;
        int i14 = this.errorDescription;
        int i15 = this.errorIcon;
        boolean z4 = this.isRetryVisible;
        boolean z13 = this.shareButtonEnable;
        boolean z14 = this.shareButtonVisible;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "GlobalShareErrorState(errorTitle=", ", errorDescription=", ", errorIcon=");
        AbstractC13673n.m38573t(i15, ", isRetryVisible=", ", shareButtonEnable=", sbM30465s, z4);
        return AbstractC36095b.m114682j(sbM30465s, z13, ", shareButtonVisible=", z14, ")");
    }
}
