package ng3;

import com.squareup.wire.AbstractC5583n;
import jg3.C21675b;

/* JADX INFO: renamed from: ng3.b */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC26689b implements InterfaceC26705r {
    NANOS("Nanos"),
    /* JADX INFO: Fake field, exist only in values array */
    MICROS("Micros"),
    /* JADX INFO: Fake field, exist only in values array */
    MILLIS("Millis"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDS("Seconds"),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTES("Minutes"),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS("Hours"),
    /* JADX INFO: Fake field, exist only in values array */
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    /* JADX INFO: Fake field, exist only in values array */
    DECADES("Decades"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTURIES("Centuries"),
    /* JADX INFO: Fake field, exist only in values array */
    MILLENNIA("Millennia"),
    /* JADX INFO: Fake field, exist only in values array */
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: w */
    public final String f106182w;

    static {
        C21675b c21675b = C21675b.f83231y;
        C21675b.m60989a(AbstractC5583n.m16743B(1000000000, 999999999L), AbstractC5583n.m16763W(Long.MAX_VALUE, AbstractC5583n.m16742A(999999999L, 1000000000L)));
    }

    EnumC26689b(String str) {
        this.f106182w = str;
    }

    @Override // ng3.InterfaceC26705r
    /* JADX INFO: renamed from: a */
    public final InterfaceC26697j mo79396a(InterfaceC26697j interfaceC26697j, long j7) {
        return interfaceC26697j.mo60994c(j7, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f106182w;
    }
}
