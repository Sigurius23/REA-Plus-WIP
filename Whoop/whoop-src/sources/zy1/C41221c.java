package zy1;

import c31.C3927k;
import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.User;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import py1.AbstractC29625d;
import wy1.C37695b;
import xy1.C38700a;
import xy1.EnumC38702c;
import xy1.EnumC38705f;
import xy1.EnumC38706g;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: zy1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lzy1/c;", "", "Lzy1/a;", "progressButtonReducer", "Lz92/a;", "userInfoAccessor", "<init>", "(Lzy1/a;Lz92/a;)V", "Lxy1/a;", "state", "Lwy1/b;", "a", "(Lxy1/a;)Lwy1/b;", "Lzy1/a;", "b", "Lz92/a;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41221c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41219a progressButtonReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: zy1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177879a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f177880b;

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
            f177879a = iArr;
            int[] iArr2 = new int[EnumC38702c.values().length];
            try {
                iArr2[EnumC38702c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC38702c.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f177880b = iArr2;
        }
    }

    public C41221c(C41219a progressButtonReducer, InterfaceC40205a userInfoAccessor) {
        AbstractC22676k.m65750j(progressButtonReducer, "progressButtonReducer");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.progressButtonReducer = progressButtonReducer;
        this.userInfoAccessor = userInfoAccessor;
    }

    /* JADX INFO: renamed from: a */
    public final C37695b m133909a(C38700a state) {
        EnumC38706g enumC38706g;
        String emailAddress;
        String inputValue;
        AbstractC22676k.m65750j(state, "state");
        float fM36283m = AbstractC12889b.m36283m(state.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0.0f, 1.0f);
        int i13 = a.f177879a[state.getSubmissionState().ordinal()];
        if (i13 != 1) {
            enumC38706g = i13 != 2 ? EnumC38706g.IDLE : EnumC38706g.FAILED;
        } else {
            enumC38706g = EnumC38706g.LOADING;
        }
        C3927k c3927kM133903a = this.progressButtonReducer.m133903a(fM36283m, enumC38706g);
        User userMo129090d = this.userInfoAccessor.mo129090d();
        if (userMo129090d == null || (emailAddress = userMo129090d.getEmailAddress()) == null) {
            emailAddress = "";
        }
        EnumC38702c inputMode = state.getInputMode();
        int[] iArr = a.f177880b;
        int i14 = iArr[inputMode.ordinal()];
        if (i14 == 1) {
            inputValue = emailAddress;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            inputValue = state.getInputValue();
        }
        C3927k c3927kM11937b = C3927k.m11937b(c3927kM133903a, null, null, null, null, null, null, 0, 0, null, inputValue.length() > 0, false, null, null, null, null, null, null, 130559, null);
        C4092p2 c4092p2 = enumC38706g == EnumC38706g.FAILED ? new C4092p2(EnumC16313m0.TINY_INFORMATION, 0.0f, null, null, AbstractC8693b.m21277k(AbstractC29625d.f121001o), null, EnumC39333f.ACCENT_ALERT_TREND_15, null, EnumC39333f.ACCENT_ALERT, null, null, null, null, false, null, null, null, null, null, null, 1048238, null) : null;
        int i15 = iArr[state.getInputMode().ordinal()];
        if (i15 == 1) {
            return new C37695b(AbstractC8693b.m21277k(AbstractC29625d.f121000n), AbstractC8693b.m21277k(AbstractC29625d.f120998l), new TextResource.C8691e(""), emailAddress, new TextResource.C8691e(""), AbstractC8693b.m21277k(AbstractC29625d.f120999m), c3927kM11937b, false, c4092p2, state.getSubmissionState() == EnumC38705f.SUCCESS, true, EnumC38702c.EMAIL);
        }
        if (i15 == 2) {
            return new C37695b(AbstractC8693b.m21277k(AbstractC29625d.f121006t), AbstractC8693b.m21277k(AbstractC29625d.f121004r), AbstractC8693b.m21277k(AbstractC29625d.f121002p), state.getInputValue(), AbstractC8693b.m21277k(AbstractC29625d.f121003q), AbstractC8693b.m21277k(AbstractC29625d.f121005s), c3927kM11937b, true, c4092p2, state.getSubmissionState() == EnumC38705f.SUCCESS, false, EnumC38702c.PHONE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
