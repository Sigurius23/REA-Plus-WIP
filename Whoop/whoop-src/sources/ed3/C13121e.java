package ed3;

import dd3.C11972a;
import dd3.EnumC11973b;
import e10.C12554k0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ed3.e */
/* JADX INFO: loaded from: classes3.dex */
public class C13121e extends C13130n {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f45388g = 1;

    /* JADX INFO: renamed from: h */
    public final long f45389h;

    /* JADX INFO: renamed from: i */
    public final C12554k0 f45390i;

    /* JADX INFO: renamed from: j */
    public final C13118b f45391j;

    public C13121e(long j7, C11972a proto, C12554k0 parentWriter, InterfaceC39443g descriptor) {
        C13118b c13118b = new C13118b();
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(parentWriter, "parentWriter");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        super(proto, new C12554k0(c13118b, 3), descriptor);
        this.f45389h = j7;
        this.f45390i = parentWriter;
        this.f45391j = c13118b;
    }

    @Override // ed3.C13130n
    /* JADX INFO: renamed from: P */
    public void mo36723P(InterfaceC39443g descriptor) {
        switch (this.f45388g) {
            case 0:
                AbstractC22676k.m65750j(descriptor, "descriptor");
                int i13 = (int) (this.f45389h & 2147483647L);
                C12554k0 c12554k0 = this.f45390i;
                c12554k0.getClass();
                C13118b output = this.f45391j;
                AbstractC22676k.m65750j(output, "output");
                C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, EnumC13128l.SIZE_DELIMITED.m36726a(i13));
                c12554k0.m35229R(output);
                break;
            default:
                AbstractC22676k.m65750j(descriptor, "descriptor");
                long j7 = this.f45389h;
                C13118b output2 = this.f45391j;
                C12554k0 c12554k1 = this.f45390i;
                if (j7 == 19500) {
                    c12554k1.m35229R(output2);
                } else {
                    c12554k1.getClass();
                    AbstractC22676k.m65750j(output2, "output");
                    C12554k0.m35216o(c12554k1, (C13118b) c12554k1.f42881x, EnumC13128l.SIZE_DELIMITED.m36726a((int) (j7 & 2147483647L)));
                    c12554k1.m35229R(output2);
                }
                break;
        }
    }

    @Override // ed3.C13130n
    /* JADX INFO: renamed from: Q */
    public long mo36722Q(InterfaceC39443g interfaceC39443g, int i13) {
        switch (this.f45388g) {
            case 0:
                AbstractC22676k.m65750j(interfaceC39443g, "<this>");
                EnumC11973b enumC11973b = EnumC11973b.DEFAULT;
                return 1;
            default:
                return super.mo36722Q(interfaceC39443g, i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13121e(C11972a proto, C12554k0 writer, long j7, InterfaceC39443g descriptor, C13118b c13118b) {
        super(proto, new C12554k0(c13118b, 3), descriptor);
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(writer, "writer");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45390i = writer;
        this.f45389h = j7;
        this.f45391j = c13118b;
    }
}
