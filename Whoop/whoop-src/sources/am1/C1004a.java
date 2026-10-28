package am1;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import il1.AbstractC18643t;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u92.C34660d;

/* JADX INFO: renamed from: am1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lam1/a;", "Lod1/g;", "Lil1/t;", "Lam1/b;", "Lu92/d;", "sharedPreferences", "<init>", "(Lu92/d;)V", "", "j", "()Z", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "i", "g", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu92/d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1004a implements InterfaceC27844g<AbstractC18643t, C1005b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: am1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.onboarding.HomeOnboardingInteractor$interact$1", m100430f = "HomeOnboardingInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lam1/b;", "state", "Lil1/t;", "action", "<anonymous>", "(Lam1/b;Lil1/t;)Lam1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f3769w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3770x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f3771y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1005b c1005b, AbstractC18643t abstractC18643t, InterfaceC30057d<? super C1005b> interfaceC30057d) {
            a aVar = C1004a.this.new a(interfaceC30057d);
            aVar.f3770x = c1005b;
            aVar.f3771y = abstractC18643t;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1005b c1005b = (C1005b) this.f3770x;
            AbstractC18643t abstractC18643t = (AbstractC18643t) this.f3771y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f3769w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC18643t, AbstractC18643t.a.f73149a)) {
                return new C1005b(C1004a.this.m2714j(), C1004a.this.m2713i());
            }
            if (AbstractC22676k.m65745e(abstractC18643t, AbstractC18643t.c.f73151a)) {
                C1004a.this.m2712h();
                return C1005b.m2716b(c1005b, true, false, 2, null);
            }
            if (!AbstractC22676k.m65745e(abstractC18643t, AbstractC18643t.b.f73150a)) {
                throw new NoWhenBranchMatchedException();
            }
            C1004a.this.m2711g();
            return C1005b.m2716b(c1005b, false, true, 1, null);
        }
    }

    public C1004a(C34660d sharedPreferences) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m2711g() {
        this.sharedPreferences.m109538q(SharedPreferenceConstants.HAS_SEEN_FAB_ONBOARDING, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m2712h() {
        this.sharedPreferences.m109538q(SharedPreferenceConstants.HAS_SEEN_NEW_HOME_ONBOARDING, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final boolean m2713i() {
        return this.sharedPreferences.m109528e(SharedPreferenceConstants.HAS_SEEN_FAB_ONBOARDING, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final boolean m2714j() {
        return this.sharedPreferences.m109528e(SharedPreferenceConstants.HAS_SEEN_NEW_HOME_ONBOARDING, false);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C1005b(false, false, 3, null), upstream, new a(null));
    }
}
