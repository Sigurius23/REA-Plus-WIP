package tr2;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tr2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u000bR\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Ltr2/h;", "", "", "userId", "", "utcDateTime", "localDateTime", "body", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "e", "c", "", "J", "()J", "f", "(J)V", "id", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34110h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String utcDateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String localDateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long id;

    public C34110h(Integer num, String str, String str2, String body) {
        AbstractC22676k.m65750j(body, "body");
        this.userId = num;
        this.utcDateTime = str;
        this.localDateTime = str2;
        this.body = body;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLocalDateTime() {
        return this.localDateTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUtcDateTime() {
        return this.utcDateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34110h)) {
            return false;
        }
        C34110h c34110h = (C34110h) other;
        return AbstractC22676k.m65745e(this.userId, c34110h.userId) && AbstractC22676k.m65745e(this.utcDateTime, c34110h.utcDateTime) && AbstractC22676k.m65745e(this.localDateTime, c34110h.localDateTime) && AbstractC22676k.m65745e(this.body, c34110h.body);
    }

    /* JADX INFO: renamed from: f */
    public final void m107839f(long j7) {
        this.id = j7;
    }

    public int hashCode() {
        Integer num = this.userId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.utcDateTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localDateTime;
        return this.body.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.userId;
        String str = this.utcDateTime;
        return AbstractC11266d.m30464r(AbstractC31061c.m95643s("LogEventsDto(userId=", ", utcDateTime=", num, str, ", localDateTime="), this.localDateTime, ", body=", this.body, ")");
    }
}
