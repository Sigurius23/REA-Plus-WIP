package sc2;

import hi0.AbstractC17306d;
import hi0.AbstractC17312j;
import l83.C23465k;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: sc2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lsc2/e;", "", "", "lastSyncText", "cloudIcon", "textViewColor", "Ll83/k;", "", "", "lastSyncTimeStampPair", "<init>", "(IIILl83/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "Ll83/k;", "()Ll83/k;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32366e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int lastSyncText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cloudIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int textViewColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23465k lastSyncTimeStampPair;

    public C32366e(int i13, int i14, int i15, C23465k lastSyncTimeStampPair) {
        AbstractC22676k.m65750j(lastSyncTimeStampPair, "lastSyncTimeStampPair");
        this.lastSyncText = i13;
        this.cloudIcon = i14;
        this.textViewColor = i15;
        this.lastSyncTimeStampPair = lastSyncTimeStampPair;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCloudIcon() {
        return this.cloudIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLastSyncText() {
        return this.lastSyncText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23465k getLastSyncTimeStampPair() {
        return this.lastSyncTimeStampPair;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTextViewColor() {
        return this.textViewColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32366e)) {
            return false;
        }
        C32366e c32366e = (C32366e) other;
        return this.lastSyncText == c32366e.lastSyncText && this.cloudIcon == c32366e.cloudIcon && this.textViewColor == c32366e.textViewColor && AbstractC22676k.m65745e(this.lastSyncTimeStampPair, c32366e.lastSyncTimeStampPair);
    }

    public int hashCode() {
        return this.lastSyncTimeStampPair.hashCode() + AbstractC11266d.m30448b(this.textViewColor, AbstractC11266d.m30448b(this.cloudIcon, Integer.hashCode(this.lastSyncText) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.lastSyncText;
        int i14 = this.cloudIcon;
        int i15 = this.textViewColor;
        C23465k c23465k = this.lastSyncTimeStampPair;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "LastSyncViewState(lastSyncText=", ", cloudIcon=", ", textViewColor=");
        sbM30465s.append(i15);
        sbM30465s.append(", lastSyncTimeStampPair=");
        sbM30465s.append(c23465k);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ C32366e(int i13, int i14, int i15, C23465k c23465k, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? AbstractC17312j.f66992i1 : i13, (i16 & 2) != 0 ? AbstractC17306d.f66537h : i14, (i16 & 4) != 0 ? AbstractC36510a.f156006O : i15, (i16 & 8) != 0 ? new C23465k("10:35AM", Boolean.FALSE) : c23465k);
    }
}
