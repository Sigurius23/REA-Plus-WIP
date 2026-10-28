package p348nt;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import lt.InterfaceC24722e;
import lt.InterfaceC24723f;

/* JADX INFO: renamed from: nt.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C27110c implements InterfaceC24722e {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f108352a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StreamDateFormatter.DATE_FORMAT, Locale.US);
        f108352a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        ((InterfaceC24723f) obj2).mo72383c(f108352a.format((Date) obj));
    }
}
