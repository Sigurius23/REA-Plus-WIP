package p182h3;

import cg.C4559n;
import hb3.C17118h0;
import l83.C23454a0;
import p446r1.C30849c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import qa3.C30171w0;

/* JADX INFO: renamed from: h3.i */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16793i extends C22656a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64546w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16793i(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f64546w = i15;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f64546w) {
            case 0:
                ((C30849c) this.receiver).m94885b((C16795k) obj);
                return C23454a0.f92919a;
            case 1:
                C30171w0 p13 = (C30171w0) obj;
                AbstractC22676k.m65750j(p13, "p0");
                return ((C17118h0) this.receiver).m48361d(p13, true);
            case 2:
                String p14 = (String) obj;
                AbstractC22676k.m65750j(p14, "p0");
                return C4559n.m14242a((C4559n) this.receiver, p14);
            default:
                String p15 = (String) obj;
                AbstractC22676k.m65750j(p15, "p0");
                return C4559n.m14242a((C4559n) this.receiver, p15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16793i(Object obj) {
        super(1, 0, C17118h0.class, obj, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;");
        this.f64546w = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16793i(C30849c c30849c) {
        super(1, 8, C30849c.class, c30849c, "add", "add(Ljava/lang/Object;)Z");
        this.f64546w = 0;
    }
}
