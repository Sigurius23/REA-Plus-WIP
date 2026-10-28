package f80;

import android.content.Context;
import b90.C2885g;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import f70.C14201q0;
import h80.EnumC17007g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import v80.C35795c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: f80.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lf80/e;", "", "Lf80/a;", "helper", "Lf80/d;", "tracker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lf80/a;Lf80/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lm91/u;", "Lh80/g;", "c", "(Lm91/u;)Lh80/g;", "Landroid/content/Context;", "context", "currentScreen", "Lf70/q0;", "memberInfo", "", "skipIfAlreadyAuthenticated", "Lf80/c;", "a", "(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;", "Lf80/a;", "b", "Lf80/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14246e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14242a helper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14245d tracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f80.e$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.passwordmanager.SaveCredentialOnAdvanceUseCase", m100430f = "SaveCredentialOnAdvanceUseCase.kt", m100431l = {52}, m100432m = "invoke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f52032E;

        /* JADX INFO: renamed from: F */
        boolean f52033F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f52034G;

        /* JADX INFO: renamed from: I */
        int f52036I;

        /* JADX INFO: renamed from: w */
        Object f52037w;

        /* JADX INFO: renamed from: x */
        Object f52038x;

        /* JADX INFO: renamed from: y */
        Object f52039y;

        /* JADX INFO: renamed from: z */
        Object f52040z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52034G = obj;
            this.f52036I |= Integer.MIN_VALUE;
            return C14246e.this.m40711a(null, null, null, false, this);
        }
    }

    public C14246e(C14242a helper, C14245d tracker, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(helper, "helper");
        AbstractC22676k.m65750j(tracker, "tracker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.helper = helper;
        this.tracker = tracker;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m40709b(C14246e c14246e, Context context, InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return c14246e.m40711a(context, interfaceC25312u, c14201q0, z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    private final EnumC17007g m40710c(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C35795c) {
            return EnumC17007g.CreatePassword;
        }
        if (interfaceC25312u instanceof C2885g) {
            return EnumC17007g.EnterPassword;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40711a(Context context, InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, boolean z4, InterfaceC30057d<? super EnumC14244c> interfaceC30057d) {
        a aVar;
        EnumC17007g enumC17007gM40710c;
        EnumC17007g enumC17007g;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f52036I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f52036I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM40700b = aVar.f52034G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f52036I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40700b);
            if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.CREDENTIAL_MANAGER_ANDROID) && !z4 && (enumC17007gM40710c = m40710c(interfaceC25312u)) != null) {
                String strM31441a = c14201q0.getPassword().getValue();
                if (AbstractC39414r.m125890i0(strM31441a)) {
                    return EnumC14244c.NotAttempted;
                }
                C14242a c14242a = this.helper;
                String strM31439a = c14201q0.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
                aVar.f52037w = null;
                aVar.f52038x = null;
                aVar.f52039y = null;
                aVar.f52040z = enumC17007gM40710c;
                aVar.f52032E = null;
                aVar.f52033F = z4;
                aVar.f52036I = 1;
                objM40700b = c14242a.m40700b(context, strM31439a, strM31441a, aVar);
                if (objM40700b == enumC31071a) {
                    return enumC31071a;
                }
                enumC17007g = enumC17007gM40710c;
            }
            return EnumC14244c.NotAttempted;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        enumC17007g = (EnumC17007g) aVar.f52040z;
        AbstractC34132o.m107864I(objM40700b);
        EnumC14244c enumC14244c = (EnumC14244c) objM40700b;
        this.tracker.m40707e(enumC17007g, enumC14244c);
        return enumC14244c;
    }
}
