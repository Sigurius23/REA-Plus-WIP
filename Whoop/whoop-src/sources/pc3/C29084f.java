package pc3;

import java.time.DateTimeException;
import kotlinx.datetime.LocalDate;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc3.C35890i;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: pc3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C29084f {
    /* JADX INFO: renamed from: a */
    public static LocalDate m88408a(long j7) {
        try {
            java.time.LocalDate localDateOfEpochDay = java.time.LocalDate.ofEpochDay(j7);
            AbstractC22676k.m65749i(localDateOfEpochDay, "ofEpochDay(...)");
            return new LocalDate(localDateOfEpochDay);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final InterfaceC37138c serializer() {
        return C35890i.f152817a;
    }
}
