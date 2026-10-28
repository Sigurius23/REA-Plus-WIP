package vc3;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.YearMonth;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29098t;
import qc3.AbstractC30222a;
import qc3.AbstractC30257l1;
import rc3.AbstractC31237b;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C35897p implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35897p f152831a = new C35897p();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152832b = AbstractC35952b.m114194b("kotlinx.datetime.YearMonth", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29098t c29098t = YearMonth.Companion;
        String input = interfaceC40541d.decodeString();
        C23470p c23470p = AbstractC30257l1.f123799b;
        AbstractC30222a format = (AbstractC30222a) c23470p.getValue();
        c29098t.getClass();
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(format, "format");
        if (format != ((AbstractC30222a) c23470p.getValue())) {
            return (YearMonth) format.m92499c(input);
        }
        try {
            String input2 = input.toString();
            AbstractC22676k.m65750j(input2, "input");
            return new YearMonth(java.time.YearMonth.parse(AbstractC31237b.m96191c(3, input2.toString())));
        } catch (DateTimeParseException e5) {
            throw new DateTimeFormatException(e5);
        }
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152832b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        YearMonth value = (YearMonth) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.toString());
    }
}
