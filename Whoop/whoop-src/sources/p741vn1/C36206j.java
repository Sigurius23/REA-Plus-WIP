package p741vn1;

import androidx.compose.animation.AbstractC1089a;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vn1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lvn1/j;", "", "<init>", "()V", "Lc0/q;", "Lm91/n;", "", "Lvn1/i;", "notificationCardDismissAnimation", "Lc0/l0;", "a", "(Lc0/q;Lvn1/i;)Lc0/l0;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36206j {

    /* JADX INFO: renamed from: a */
    public static final C36206j f155016a = new C36206j();

    /* JADX INFO: renamed from: vn1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155017a;

        static {
            int[] iArr = new int[EnumC36205i.values().length];
            try {
                iArr[EnumC36205i.SCALE_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36205i.LEFT_SWIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155017a = iArr;
        }
    }

    private C36206j() {
    }

    /* JADX INFO: renamed from: a */
    public final C3756l0 m115220a(InterfaceC3770q interfaceC3770q, EnumC36205i notificationCardDismissAnimation) {
        AbstractC22676k.m65750j(interfaceC3770q, "<this>");
        AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
        int i13 = a.f155017a[notificationCardDismissAnimation.ordinal()];
        if (i13 == 1) {
            return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30573u(0.0f, 0.0f, 7, null), 2).m11562a(AbstractC3788w0.m11579g(AbstractC11348f.m30574v(500, 0, null, 6), 1.5f, 4)), AbstractC3788w0.m11580h(AbstractC11348f.m30574v(500, 0, null, 6), 0L, 6));
        }
        if (i13 == 2) {
            return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(500, 0, null, 6), 2).m11562a(AbstractC3788w0.m11579g(AbstractC11348f.m30574v(500, 500, null, 4), 0.92f, 4)), InterfaceC3770q.m11570a(interfaceC3770q, 4, AbstractC11348f.m30574v(500, 0, null, 6), 4));
        }
        if (i13 == 3) {
            return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(500, 0, null, 6), 2).m11562a(AbstractC3788w0.m11579g(AbstractC11348f.m30574v(500, 500, null, 4), 0.92f, 4)), AbstractC3736e1.f15289a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
