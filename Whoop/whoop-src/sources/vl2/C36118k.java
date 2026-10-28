package vl2;

import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, m65681d2 = {"Lvl2/k;", "", "Lorg/joda/time/DateTime;", HttpHeaders.DATE, "", "dateString", "source", "fromLocation", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvl2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/DateTime;", "getDate", "()Lorg/joda/time/DateTime;", "b", "Ljava/lang/String;", "c", "d", "e", "Lvl2/a;", "()Lvl2/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36118k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateTime date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dateString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String fromLocation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC36106a duration;

    public C36118k(DateTime date, String dateString, String str, String fromLocation, EnumC36106a duration) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(dateString, "dateString");
        AbstractC22676k.m65750j(fromLocation, "fromLocation");
        AbstractC22676k.m65750j(duration, "duration");
        this.date = date;
        this.dateString = dateString;
        this.source = str;
        this.fromLocation = fromLocation;
        this.duration = duration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDateString() {
        return this.dateString;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC36106a getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFromLocation() {
        return this.fromLocation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36118k)) {
            return false;
        }
        C36118k c36118k = (C36118k) other;
        return AbstractC22676k.m65745e(this.date, c36118k.date) && AbstractC22676k.m65745e(this.dateString, c36118k.dateString) && AbstractC22676k.m65745e(this.source, c36118k.source) && AbstractC22676k.m65745e(this.fromLocation, c36118k.fromLocation) && this.duration == c36118k.duration;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.date.hashCode() * 31, 31, this.dateString);
        String str = this.source;
        return this.duration.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.fromLocation);
    }

    public String toString() {
        DateTime dateTime = this.date;
        String str = this.dateString;
        String str2 = this.source;
        String str3 = this.fromLocation;
        EnumC36106a enumC36106a = this.duration;
        StringBuilder sb4 = new StringBuilder("TrendArguments(date=");
        sb4.append(dateTime);
        sb4.append(", dateString=");
        sb4.append(str);
        sb4.append(", source=");
        AbstractC11266d.m30444B(sb4, str2, ", fromLocation=", str3, ", duration=");
        sb4.append(enumC36106a);
        sb4.append(")");
        return sb4.toString();
    }
}
