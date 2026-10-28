package f53;

import io.getstream.android.video.generated.models.CallParticipantResponse;
import io.getstream.android.video.generated.models.CallSessionParticipantLeftEvent;
import io.getstream.android.video.generated.models.VideoEvent;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37979k;

/* JADX INFO: renamed from: f53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14117e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50731w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ VideoEvent f50732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14117e(VideoEvent videoEvent, int i13) {
        super(1);
        this.f50731w = i13;
        this.f50732x = videoEvent;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f50731w) {
            case 0:
                AbstractC37979k listener = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(listener, "listener");
                listener.mo40223h(this.f50732x);
                return C23454a0.f92919a;
            default:
                CallParticipantResponse it = (CallParticipantResponse) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(AbstractC22676k.m65745e(it.getUserSessionId(), ((CallSessionParticipantLeftEvent) this.f50732x).getParticipant().getUserSessionId()));
        }
    }
}
