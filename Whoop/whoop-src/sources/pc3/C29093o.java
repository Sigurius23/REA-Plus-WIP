package pc3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pc3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C29093o implements Externalizable {

    /* JADX INFO: renamed from: w */
    public int f117687w;

    /* JADX INFO: renamed from: x */
    public Serializable f117688x;

    public C29093o(int i13, Serializable serializable) {
        this.f117687w = i13;
        this.f117688x = serializable;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput in3) throws IOException {
        Serializable localDate;
        AbstractC22676k.m65750j(in3, "in");
        byte b = in3.readByte();
        this.f117687w = b;
        if (b == 2) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(in3.readLong());
            AbstractC22676k.m65749i(localDateOfEpochDay, "ofEpochDay(...)");
            localDate = new kotlinx.datetime.LocalDate(localDateOfEpochDay);
        } else if (b == 3) {
            C29090l c29090l = LocalTime.Companion;
            long j7 = in3.readLong();
            c29090l.getClass();
            try {
                localDate = new LocalTime(java.time.LocalTime.ofNanoOfDay(j7));
            } catch (DateTimeException e5) {
                throw new IllegalArgumentException(e5);
            }
        } else if (b == 4) {
            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(in3.readLong());
            AbstractC22676k.m65749i(localDateOfEpochDay2, "ofEpochDay(...)");
            kotlinx.datetime.LocalDate localDate2 = new kotlinx.datetime.LocalDate(localDateOfEpochDay2);
            C29090l c29090l2 = LocalTime.Companion;
            long j13 = in3.readLong();
            c29090l2.getClass();
            try {
                localDate = new LocalDateTime(localDate2, new LocalTime(java.time.LocalTime.ofNanoOfDay(j13)));
            } catch (DateTimeException e13) {
                throw new IllegalArgumentException(e13);
            }
        } else if (b == 10) {
            localDate = AbstractC29097s.m88411a(null, null, Integer.valueOf(in3.readInt()));
        } else {
            if (b != 11) {
                throw new IOException("Unknown type tag: " + this.f117687w);
            }
            C29098t c29098t = YearMonth.Companion;
            long j14 = in3.readLong();
            C23470p c23470p = AbstractC29099u.f117693a;
            AbstractC22676k.m65750j(c29098t, "<this>");
            long j15 = 12;
            long j16 = j14 / j15;
            if ((j14 ^ j15) < 0 && j16 * j15 != j14) {
                j16--;
            }
            long j17 = j14 % j15;
            localDate = new YearMonth((int) (j16 + ((long) 1970)), ((int) (j17 + (j15 & (((j17 ^ j15) & ((-j17) | j17)) >> 63)))) + 1);
        }
        this.f117688x = localDate;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput out) throws IOException {
        AbstractC22676k.m65750j(out, "out");
        out.writeByte(this.f117687w);
        Serializable serializable = this.f117688x;
        int i13 = this.f117687w;
        if (i13 == 2) {
            out.writeLong(((kotlinx.datetime.LocalDate) serializable).getValue().toEpochDay());
            return;
        }
        if (i13 == 3) {
            out.writeLong(((LocalTime) serializable).toNanosecondOfDay());
            return;
        }
        if (i13 == 4) {
            LocalDateTime localDateTime = (LocalDateTime) serializable;
            out.writeLong(localDateTime.getDate().getValue().toEpochDay());
            out.writeLong(localDateTime.getTime().toNanosecondOfDay());
        } else {
            if (i13 == 10) {
                out.writeInt(((UtcOffset) serializable).getTotalSeconds());
                return;
            }
            if (i13 == 11) {
                YearMonth yearMonth = (YearMonth) serializable;
                C23470p c23470p = AbstractC29099u.f117693a;
                out.writeLong((((((long) yearMonth.getYear()) - 1970) * ((long) 12)) + ((long) yearMonth.getMonthNumber$kotlinx_datetime())) - 1);
            } else {
                throw new IllegalStateException("Unknown type tag: " + this.f117687w + " for value: " + serializable);
            }
        }
    }
}
