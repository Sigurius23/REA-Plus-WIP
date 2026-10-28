package rd2;

import com.mapbox.common.HttpHeaders;
import java.util.Iterator;
import org.joda.time.format.DateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rd2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", HttpHeaders.DATE, "Ltr2/n;", "logger", "a", "(Ljava/lang/String;Ltr2/n;)Ljava/lang/String;", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31250d {
    /* JADX INFO: renamed from: a */
    public static final String m96271a(String date, InterfaceC34116n logger) {
        String string;
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(logger, "logger");
        Iterator it = AbstractC37056f.m118959K("yyyy-MM-dd", "MMM d, yyyy", "dd MMM yyyy").iterator();
        do {
            string = null;
            if (!it.hasNext()) {
                logger.mo85222m("Failed to convert history date to backend date format.", new AbstractC30556a.a[0]);
                return null;
            }
            try {
                string = DateTimeFormat.forPattern((String) it.next()).parseDateTime(date).toString(DateTimeFormat.forPattern("yyyy-MM-dd"));
            } catch (Exception unused) {
            }
        } while (string == null);
        return string;
    }
}
