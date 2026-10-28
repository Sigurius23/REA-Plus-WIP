package e33;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;
import stream.video.sfu.models.AudioBitrateProfile;

/* JADX INFO: renamed from: e33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12623c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12645n f43122w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12623c(C12645n c12645n) {
        super(0);
        this.f43122w = c12645n;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return (AudioBitrateProfile) this.f43122w.f43198w.f139758f.f139207r.getValue();
    }
}
