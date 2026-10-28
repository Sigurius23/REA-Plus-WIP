package a33;

import io.getstream.android.video.generated.models.ClientEvent;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0350b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C0350b f1229x;

    /* JADX INFO: renamed from: y */
    public static final C0350b f1230y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1231w;

    static {
        int i13 = 1;
        f1229x = new C0350b(i13, 0);
        f1230y = new C0350b(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0350b(int i13, int i14) {
        super(i13);
        this.f1231w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1231w) {
            case 0:
                ClientEvent it = (ClientEvent) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.toLog$stream_video_android_core_release();
            default:
                ClientEvent it3 = (ClientEvent) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3.toLog$stream_video_android_core_release();
        }
    }
}
