package vc3;

import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.AbstractC29097s;
import pc3.C29095q;
import qc3.AbstractC30224a1;
import qc3.C30285z0;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C35896o implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35896o f152829a = new C35896o();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152830b = AbstractC35952b.m114194b("kotlinx.datetime.UtcOffset", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29095q c29095q = UtcOffset.Companion;
        String input = interfaceC40541d.decodeString();
        C23470p c23470p = AbstractC30224a1.f123761a;
        C30285z0 format = (C30285z0) c23470p.getValue();
        c29095q.getClass();
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(format, "format");
        if (format == ((C30285z0) c23470p.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) AbstractC29097s.f117690a.getValue();
            AbstractC22676k.m65749i(dateTimeFormatter, "access$getIsoFormat(...)");
            return AbstractC29097s.m88412b(input, dateTimeFormatter);
        }
        if (format == ((C30285z0) AbstractC30224a1.f123762b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) AbstractC29097s.f117691b.getValue();
            AbstractC22676k.m65749i(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return AbstractC29097s.m88412b(input, dateTimeFormatter2);
        }
        if (format != ((C30285z0) AbstractC30224a1.f123763c.getValue())) {
            return (UtcOffset) format.m92499c(input);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) AbstractC29097s.f117692c.getValue();
        AbstractC22676k.m65749i(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return AbstractC29097s.m88412b(input, dateTimeFormatter3);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152830b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        UtcOffset value = (UtcOffset) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.toString());
    }
}
