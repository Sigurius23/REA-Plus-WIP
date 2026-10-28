package p536uw;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p384ow.AbstractC28430z;
import p596ww.C37653a;
import p596ww.C37654b;
import rw.C31851a;

/* JADX INFO: renamed from: uw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35288a extends AbstractC28430z {

    /* JADX INFO: renamed from: c */
    public static final C31851a f150275c = new C31851a(4);

    /* JADX INFO: renamed from: d */
    public static final C31851a f150276d = new C31851a(5);

    /* JADX INFO: renamed from: e */
    public static final C31851a f150277e = new C31851a(6);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150278a;

    /* JADX INFO: renamed from: b */
    public final Object f150279b;

    public C35288a(int i13) {
        this.f150278a = i13;
        switch (i13) {
            case 1:
                this.f150279b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f150279b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        Date date;
        Time time;
        switch (this.f150278a) {
            case 0:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString = c37653a.nextString();
                synchronized (this) {
                    TimeZone timeZone = ((SimpleDateFormat) this.f150279b).getTimeZone();
                    try {
                        try {
                            date = new Date(((SimpleDateFormat) this.f150279b).parse(strNextString).getTime());
                            ((SimpleDateFormat) this.f150279b).setTimeZone(timeZone);
                        } catch (ParseException e5) {
                            throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Date; at path " + c37653a.m121060k(true), e5);
                        }
                    } catch (Throwable th3) {
                        ((SimpleDateFormat) this.f150279b).setTimeZone(timeZone);
                        throw th3;
                    }
                }
                return date;
            case 1:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString2 = c37653a.nextString();
                synchronized (this) {
                    TimeZone timeZone2 = ((SimpleDateFormat) this.f150279b).getTimeZone();
                    try {
                        try {
                            time = new Time(((SimpleDateFormat) this.f150279b).parse(strNextString2).getTime());
                            ((SimpleDateFormat) this.f150279b).setTimeZone(timeZone2);
                        } catch (ParseException e13) {
                            throw new JsonSyntaxException("Failed parsing '" + strNextString2 + "' as SQL Time; at path " + c37653a.m121060k(true), e13);
                        }
                    } catch (Throwable th4) {
                        ((SimpleDateFormat) this.f150279b).setTimeZone(timeZone2);
                        throw th4;
                    }
                }
                return time;
            default:
                java.util.Date date2 = (java.util.Date) ((AbstractC28430z) this.f150279b).mo86132b(c37653a);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f150278a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    c37654b.m121076m();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f150279b).format((java.util.Date) date);
                    break;
                }
                c37654b.m121078p0(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    c37654b.m121076m();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f150279b).format((java.util.Date) time);
                    break;
                }
                c37654b.m121078p0(str2);
                return;
            default:
                ((AbstractC28430z) this.f150279b).mo86133c(c37654b, (Timestamp) obj);
                return;
        }
    }

    public C35288a(AbstractC28430z abstractC28430z) {
        this.f150278a = 2;
        this.f150279b = abstractC28430z;
    }
}
