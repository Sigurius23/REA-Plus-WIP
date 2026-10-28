package vc3;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29090l;
import qc3.AbstractC30238f0;
import qc3.C30235e0;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C35892k implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35892k f152821a = new C35892k();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152822b = AbstractC35952b.m114194b("kotlinx.datetime.LocalTime", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29090l c29090l = LocalTime.Companion;
        String input = interfaceC40541d.decodeString();
        C23470p c23470p = AbstractC30238f0.f123780a;
        C30235e0 format = (C30235e0) c23470p.getValue();
        c29090l.getClass();
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(format, "format");
        if (format != ((C30235e0) c23470p.getValue())) {
            return (LocalTime) format.m92499c(input);
        }
        try {
            return new LocalTime(java.time.LocalTime.parse(input));
        } catch (DateTimeParseException e5) {
            throw new DateTimeFormatException(e5);
        }
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152822b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        LocalTime value = (LocalTime) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.toString());
    }
}
