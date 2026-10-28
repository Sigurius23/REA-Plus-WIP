package wc3;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import yc3.C39437a;
import yc3.C39445i;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: wc3.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C37141f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158884w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37142g f158885x;

    public /* synthetic */ C37141f(C37142g c37142g, int i13) {
        this.f158884w = i13;
        this.f158885x = c37142g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C39437a buildSerialDescriptor = (C39437a) obj;
        switch (this.f158884w) {
            case 0:
                AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
                StringBuilder sb4 = new StringBuilder("kotlinx.serialization.Sealed<");
                C37142g c37142g = this.f158885x;
                sb4.append(c37142g.f158886a.getSimpleName());
                sb4.append('>');
                C37141f c37141f = new C37141f(c37142g, 1);
                buildSerialDescriptor.m125993a("value", AbstractC35952b.m114196d(sb4.toString(), C39445i.f169711a, new InterfaceC39443g[0], c37141f), false);
                List list = c37142g.f158887b;
                AbstractC22676k.m65750j(list, "<set-?>");
                buildSerialDescriptor.f169679b = list;
                break;
            default:
                AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f158885x.f158890e.entrySet()) {
                    buildSerialDescriptor.m125993a((String) entry.getKey(), ((InterfaceC37138c) entry.getValue()).getDescriptor(), false);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
