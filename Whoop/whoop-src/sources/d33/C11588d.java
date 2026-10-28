package d33;

import j53.C21346d;
import j53.InterfaceC21348f;
import live.hms.video.utils.HMSConstantsKt;

/* JADX INFO: renamed from: d33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11588d extends AbstractC11591e {

    /* JADX INFO: renamed from: c */
    public static final C11588d f37378c = new C11588d("ALL_CALL_TYPES", 0);

    /* JADX INFO: renamed from: d */
    public static final C11588d f37379d = new C11588d("audio_call", 1);

    /* JADX INFO: renamed from: e */
    public static final C11588d f37380e = new C11588d("audio_room", 2);

    /* JADX INFO: renamed from: f */
    public static final C11588d f37381f = new C11588d(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, 3);

    /* JADX INFO: renamed from: g */
    public static final C11588d f37382g = new C11588d("livestream", 4);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11588d(String str, int i13) {
        super(str);
        this.f37383b = i13;
    }

    @Override // d33.AbstractC11591e
    /* JADX INFO: renamed from: a */
    public InterfaceC21348f mo31012a() {
        switch (this.f37383b) {
            case 2:
                return C21346d.f81664a;
            case 3:
            default:
                return super.mo31012a();
            case 4:
                return C21346d.f81664a;
        }
    }
}
