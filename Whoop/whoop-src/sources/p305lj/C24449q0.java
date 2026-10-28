package p305lj;

import ad3.C0764g;
import ad3.C0769l;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yc3.C39437a;

/* JADX INFO: renamed from: lj.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24449q0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C24449q0 f95327x;

    /* JADX INFO: renamed from: y */
    public static final C24449q0 f95328y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95329w;

    static {
        int i13 = 1;
        f95327x = new C24449q0(i13, 0);
        f95328y = new C24449q0(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24449q0(int i13, int i14) {
        super(i13);
        this.f95329w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f95329w) {
            case 0:
                C39437a buildClassSerialDescriptor = (C39437a) obj;
                AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                buildClassSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
                C0769l c0769l = JsonElement.Companion;
                buildClassSerialDescriptor.m125993a("data", c0769l.serializer().getDescriptor(), true);
                buildClassSerialDescriptor.m125993a("conditions", new ArrayListSerializer(new ArrayListSerializer(c0769l.serializer())).getDescriptor(), true);
                break;
            default:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                break;
        }
        return C23454a0.f92919a;
    }
}
