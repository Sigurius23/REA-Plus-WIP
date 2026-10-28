package zl2;

import android.os.Bundle;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import or2.AbstractC28188o1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vl2.C36118k;
import vl2.EnumC36106a;

/* JADX INFO: renamed from: zl2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lzl2/a;", "", "<init>", "()V", "", "dateString", "Lorg/joda/time/DateTime;", "c", "(Ljava/lang/String;)Lorg/joda/time/DateTime;", "", "durationIndex", "Lvl2/a;", "d", "(I)Lvl2/a;", HttpHeaders.DATE, "a", "(Lorg/joda/time/DateTime;)Ljava/lang/String;", "Landroid/os/Bundle;", "bundle", "Lvl2/k;", "b", "(Landroid/os/Bundle;)Lvl2/k;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40880a {
    /* JADX INFO: renamed from: a */
    private final String m132495a(DateTime date) {
        String strPrint = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.UTC).print(date);
        AbstractC22676k.m65749i(strPrint, "print(...)");
        return strPrint;
    }

    /* JADX INFO: renamed from: c */
    private final DateTime m132496c(String dateString) {
        DateTime dateTime;
        if (dateString != null) {
            try {
                dateTime = ISODateTimeFormat.dateOptionalTimeParser().withZoneUTC().parseDateTime(dateString);
            } catch (Exception unused) {
                dateTime = null;
            }
            if (dateTime != null) {
                return dateTime;
            }
        }
        DateTime dateTimeNow = DateTime.now();
        AbstractC22676k.m65749i(dateTimeNow, "now(...)");
        return dateTimeNow;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    /* JADX INFO: renamed from: d */
    private final EnumC36106a m132497d(int durationIndex) {
        for (EnumC36106a enumC36106a : EnumC36106a.values()) {
            if (enumC36106a.getIndex() == durationIndex) {
                if (enumC36106a == null) {
                    return EnumC36106a.MONTHLY;
                }
                return enumC36106a;
            }
        }
        enumC36106a = null;
        if (enumC36106a == null) {
            return EnumC36106a.MONTHLY;
        }
        return enumC36106a;
    }

    /* JADX INFO: renamed from: b */
    public final C36118k m132498b(Bundle bundle) {
        String strM85312b;
        AbstractC22676k.m65750j(bundle, "bundle");
        DateTime dateTimeM132496c = m132496c(bundle.getString(HttpHeaders.DATE));
        String string = bundle.getString("source");
        String strM85312b2 = string != null ? AbstractC28188o1.m85312b(string) : null;
        String string2 = bundle.getString("pillar");
        if (string2 == null || (strM85312b = AbstractC28188o1.m85312b(string2)) == null) {
            strM85312b = "";
        }
        return new C36118k(dateTimeM132496c, m132495a(dateTimeM132496c), strM85312b2, strM85312b, m132497d(bundle.getInt(AttachmentExtensionsKt.EXTRA_DURATION, 1)));
    }
}
