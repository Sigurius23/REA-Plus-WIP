package gb;

import androidx.compose.animation.AbstractC1089a;
import java.util.List;
import java.util.Map;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.C3756l0;
import p040c0.C3775r1;
import p040c0.C3789x;
import p040c0.InterfaceC3770q;
import p114eb.C12982q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15634a0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f58675E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28670t2 f58676F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f58677G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Map f58678w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15648i f58679x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f58680y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f58681z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15634a0(Map map, C15648i c15648i, Function1 function1, Function1 function2, Function1 function3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f58678w = map;
        this.f58679x = c15648i;
        this.f58680y = function1;
        this.f58681z = function2;
        this.f58675E = function3;
        this.f58676F = interfaceC28670t2;
        this.f58677G = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        C3789x c3789x = (C3789x) ((InterfaceC3770q) obj);
        if (!((List) this.f58676F.getValue()).contains(c3789x.mo11596c())) {
            return AbstractC1089a.m3345c(AbstractC3730c1.f15251a, AbstractC3736e1.f15289a);
        }
        String str = ((C12982q) c3789x.mo11596c()).f44835F;
        Map map = this.f58678w;
        Float f13 = (Float) map.get(str);
        if (f13 != null) {
            fFloatValue = f13.floatValue();
        } else {
            map.put(((C12982q) c3789x.mo11596c()).f44835F, Float.valueOf(0.0f));
            fFloatValue = 0.0f;
        }
        if (!AbstractC22676k.m65745e(((C12982q) c3789x.mo11595b()).f44835F, ((C12982q) c3789x.mo11596c()).f44835F)) {
            fFloatValue = (((Boolean) this.f58679x.f58731c.getValue()).booleanValue() || ((Boolean) this.f58677G.getValue()).booleanValue()) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
        }
        map.put(((C12982q) c3789x.mo11595b()).f44835F, Float.valueOf(fFloatValue));
        return new C3756l0((AbstractC3730c1) this.f58680y.invoke(c3789x), (AbstractC3736e1) this.f58681z.invoke(c3789x), fFloatValue, (C3775r1) this.f58675E.invoke(c3789x));
    }
}
