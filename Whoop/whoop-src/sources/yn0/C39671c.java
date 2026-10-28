package yn0;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3034m0;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.HomeScreenModel;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12997x0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: yn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lyn0/c;", "", "Leb/a0;", "navController", "Lz92/a;", "userInfoAccessor", "Lj02/o0;", "navigator", "Lo02/d;", "navigationReducer", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Leb/a0;Lz92/a;Lj02/o0;Lo02/d;Lj02/i0;)V", "Lyn0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lyn0/b;Lq83/d;)Ljava/lang/Object;", "Leb/a0;", "b", "Lz92/a;", "c", "Lj02/o0;", "d", "Lo02/d;", "e", "Lj02/i0;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39671c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: yn0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.navigation.ResetPasswordNavigationRouter", m100430f = "ResetPasswordNavigationRouter.kt", m100431l = {28}, m100432m = "route", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f170729w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170730x;

        /* JADX INFO: renamed from: z */
        int f170732z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f170730x = obj;
            this.f170732z |= Integer.MIN_VALUE;
            return C39671c.this.m126815a(null, this);
        }
    }

    public C39671c(AbstractC12939a0 navController, InterfaceC40205a userInfoAccessor, InterfaceC21159o0 navigator, InterfaceC27353d navigationReducer, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navController = navController;
        this.userInfoAccessor = userInfoAccessor;
        this.navigator = navigator;
        this.navigationReducer = navigationReducer;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m126815a(InterfaceC39670b interfaceC39670b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f170732z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f170732z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f170730x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f170732z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (interfaceC39670b instanceof InterfaceC39670b.d) {
                aVar.f170729w = null;
                aVar.f170732z = 1;
                if (AbstractC3034m0.m8782b(1000L, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (!(interfaceC39670b instanceof InterfaceC39670b.b) && !(interfaceC39670b instanceof InterfaceC39670b.a) && !(interfaceC39670b instanceof InterfaceC39670b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC12939a0 abstractC12939a0 = this.navController;
                Context context = abstractC12939a0.f44680a;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                } else {
                    abstractC12939a0.m36410z();
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (this.userInfoAccessor.mo129090d() != null) {
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(new HomeScreenModel((String) null, (AiAction) null, 3, (DefaultConstructorMarker) null));
            if (interfaceC21134cMo67681a instanceof AbstractC21155m0) {
                this.navigator.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a);
            }
        } else {
            this.navController.m36405t(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/activation?startScreen=START_SCREEN"), new C12997x0(true, false, this.navController.m36396k().f44819H, true, false, -1, -1, -1, -1));
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C39671c(AbstractC12939a0 abstractC12939a0, InterfaceC40205a interfaceC40205a, InterfaceC21159o0 interfaceC21159o0, InterfaceC27353d interfaceC27353d, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, interfaceC40205a, interfaceC21159o0, interfaceC27353d, (i13 & 16) != 0 ? new C21147i0() : c21147i0);
    }
}
