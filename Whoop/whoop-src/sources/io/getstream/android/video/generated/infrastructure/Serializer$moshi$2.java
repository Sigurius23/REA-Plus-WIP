package io.getstream.android.video.generated.infrastructure;

import c93.InterfaceC4339a;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lqx/l0;", "kotlin.jvm.PlatformType", "invoke", "()Lqx/l0;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 9, 0})
public final class Serializer$moshi$2 extends AbstractC22680m implements InterfaceC4339a {
    public static final Serializer$moshi$2 INSTANCE = new Serializer$moshi$2();

    public Serializer$moshi$2() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final C30722l0 invoke() {
        C30716i0 moshiBuilder = Serializer.getMoshiBuilder();
        moshiBuilder.getClass();
        return new C30722l0(moshiBuilder);
    }
}
