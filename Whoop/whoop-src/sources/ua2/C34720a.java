package ua2;

import com.whoop.design.util.TextResource;
import kc2.C22359i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ua2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lua2/a;", "", "Lkc2/i;", "referAFriendCard", "<init>", "(Lkc2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc2/i;", "()Lkc2/i;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34720a {

    /* JADX INFO: renamed from: b */
    public static final int f146256b = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22359i referAFriendCard;

    public C34720a(C22359i c22359i) {
        this.referAFriendCard = c22359i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22359i getReferAFriendCard() {
        return this.referAFriendCard;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C34720a) && AbstractC22676k.m65745e(this.referAFriendCard, ((C34720a) other).referAFriendCard);
    }

    public int hashCode() {
        C22359i c22359i = this.referAFriendCard;
        if (c22359i == null) {
            return 0;
        }
        return c22359i.hashCode();
    }

    public String toString() {
        return "SettingsAffiliatesViewState(referAFriendCard=" + this.referAFriendCard + ")";
    }

    public /* synthetic */ C34720a(C22359i c22359i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c22359i);
    }
}
