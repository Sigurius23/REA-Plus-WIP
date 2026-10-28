package w40;

import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: w40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36798a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C36798a f157424a = new C36798a();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f157425b = AbstractC35952b.m114194b("DurationInSeconds", C39441e.f169696g);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m134260boximpl(DurationKt.toDuration(interfaceC40541d.decodeLong(), DurationUnit.SECONDS));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f157425b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        interfaceC40542e.encodeLong(Duration.m134276getInWholeSecondsimpl(((Duration) obj).getRawValue()));
    }
}
