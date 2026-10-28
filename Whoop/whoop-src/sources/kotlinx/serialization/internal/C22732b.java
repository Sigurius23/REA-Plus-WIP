package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import wc3.InterfaceC37137b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22732b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89408w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TaggedDecoder f89409x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC37137b f89410y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f89411z;

    public /* synthetic */ C22732b(TaggedDecoder taggedDecoder, InterfaceC37137b interfaceC37137b, Object obj, int i13) {
        this.f89408w = i13;
        this.f89409x = taggedDecoder;
        this.f89410y = interfaceC37137b;
        this.f89411z = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f89408w) {
            case 0:
                return this.f89409x.decodeSerializableValue(this.f89410y, this.f89411z);
            default:
                return TaggedDecoder.decodeNullableSerializableElement$lambda$3(this.f89409x, this.f89410y, this.f89411z);
        }
    }
}
