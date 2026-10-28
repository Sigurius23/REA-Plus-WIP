package sy1;

import c31.C3927k;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import py1.AbstractC29625d;
import ry1.C31910a;
import ty1.C34266k;
import ty1.InterfaceC34256a;
import xy1.EnumC38705f;
import xy1.EnumC38706g;
import zy1.C41219a;

/* JADX INFO: renamed from: sy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lsy1/b;", "", "Lzy1/a;", "progressButtonReducer", "<init>", "(Lzy1/a;)V", "Lry1/a;", "state", "Lty1/k;", "a", "(Lry1/a;)Lty1/k;", "Lzy1/a;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33097b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41219a progressButtonReducer;

    /* JADX INFO: renamed from: sy1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138064a;

        static {
            int[] iArr = new int[EnumC38705f.values().length];
            try {
                iArr[EnumC38705f.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38705f.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138064a = iArr;
        }
    }

    public C33097b(C41219a progressButtonReducer) {
        AbstractC22676k.m65750j(progressButtonReducer, "progressButtonReducer");
        this.progressButtonReducer = progressButtonReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C34266k m104860a(C31910a state) {
        EnumC38706g enumC38706g;
        AbstractC22676k.m65750j(state, "state");
        float fM36283m = AbstractC12889b.m36283m(state.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0.0f, 1.0f);
        int i13 = a.f138064a[state.getSubmissionState().ordinal()];
        if (i13 != 1) {
            enumC38706g = i13 != 2 ? EnumC38706g.IDLE : EnumC38706g.FAILED;
        } else {
            enumC38706g = EnumC38706g.LOADING;
        }
        boolean z4 = state.getCode().length() >= 1;
        return new C34266k(null, AbstractC8693b.m21277k(state.getUsingEmail() ? AbstractC29625d.f120989c : AbstractC29625d.f120990d), new TextResource.C8688b(AbstractC29625d.f120994h, new TextResource.AbstractC8690d.a(state.getCodeDestination())), state.getCode(), state.getTextFieldEnabled(), state.getResendButtonEnabled(), state.getButtonState() instanceof InterfaceC34256a.b ? InterfaceC34256a.b.m108321d((InterfaceC34256a.b) state.getButtonState(), null, z4, 1, null) : state.getButtonState(), state.getErrorMessageState(), state.getLastCodeSent(), state.getSuccess(), C3927k.m11937b(this.progressButtonReducer.m133903a(fM36283m, enumC38706g), null, null, null, null, null, null, 0, 0, null, z4, false, null, null, null, null, null, null, 130559, null), 1, null);
    }
}
