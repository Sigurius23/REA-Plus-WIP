package io.getstream.video.android.core.socket.common.parser2.adapters;

import b53.C2744b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23470p;
import p002a0.C0005a0;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.AbstractC32398l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/video/android/core/socket/common/parser2/adapters/DateAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Ljava/util/Date;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class DateAdapter extends JsonAdapter<Date> {

    /* JADX INFO: renamed from: a */
    public final C2744b f74942a = new C2744b();

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30729p
    public Date fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Date dateFrom = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.skipValue();
            return null;
        }
        String strNextString = reader.nextString();
        AbstractC22676k.m65747g(strNextString);
        C2744b c2744b = this.f74942a;
        c2744b.getClass();
        C23470p c23470p = c2744b.f10784b;
        AtomicInteger atomicInteger = c2744b.f10786d;
        atomicInteger.get();
        AtomicInteger atomicInteger2 = c2744b.f10785c;
        atomicInteger2.get();
        atomicInteger.incrementAndGet();
        Date date = (Date) ((C0005a0) c23470p.getValue()).m2c(strNextString);
        if (date != null) {
            atomicInteger2.incrementAndGet();
            return date;
        }
        if (strNextString.length() != 0) {
            try {
                try {
                    dateFrom = Date.from(AbstractC32398l.m100976i(strNextString).toInstant());
                } catch (Throwable unused) {
                    dateFrom = ((SimpleDateFormat) c2744b.f10783a.getValue(c2744b, C2744b.f10782e[1])).parse(strNextString);
                }
            } catch (Throwable unused2) {
            }
        }
        if (dateFrom != null) {
            ((C0005a0) c23470p.getValue()).m3d(strNextString, dateFrom);
        }
        return dateFrom;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30738t0
    public void toJson(AbstractC30704c0 writer, Date value) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value == null) {
            writer.mo94363J();
        } else {
            this.f74942a.getClass();
            writer.mo94362F0(AbstractC32398l.m100974g(value.toInstant().atOffset(ZoneOffset.UTC)));
        }
    }
}
