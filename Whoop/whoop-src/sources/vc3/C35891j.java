package vc3;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.AbstractC29089k;
import pc3.C29088j;
import qc3.C30226b0;
import rc3.AbstractC31237b;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C35891j implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35891j f152819a = new C35891j();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152820b = AbstractC35952b.m114194b("kotlinx.datetime.LocalDateTime", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29088j c29088j = LocalDateTime.Companion;
        String input = interfaceC40541d.decodeString();
        C30226b0 format = AbstractC29089k.f117683a;
        c29088j.getClass();
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(format, "format");
        try {
            String input2 = input.toString();
            AbstractC22676k.m65750j(input2, "input");
            return new LocalDateTime(java.time.LocalDateTime.parse(AbstractC31237b.m96191c(12, input2.toString())));
        } catch (DateTimeParseException e5) {
            throw new DateTimeFormatException(e5);
        }
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152820b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        LocalDateTime value = (LocalDateTime) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.toString());
    }
}
