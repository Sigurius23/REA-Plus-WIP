package tm2;

import android.net.Uri;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
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
import um2.AbstractC35088a;
import um2.C35089b;
import xm2.C38462c;
import xm2.C38463d;

/* JADX INFO: renamed from: tm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ltm2/a;", "Lod1/g;", "Lum2/a;", "Lum2/b;", "<init>", "()V", "result", "Lum2/a$a;", "action", "d", "(Lum2/b;Lum2/a$a;)Lum2/b;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33954a implements InterfaceC27844g<AbstractC35088a, C35089b> {

    /* JADX INFO: renamed from: tm2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.domain.MainDomainInteractor$interact$1", m100430f = "MainDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lum2/b;", "domainState", "Lum2/a;", "action", "<anonymous>", "(Lum2/b;Lum2/a;)Lum2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f142366w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f142367x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f142368y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35089b c35089b, AbstractC35088a abstractC35088a, InterfaceC30057d<? super C35089b> interfaceC30057d) {
            b bVar = C33954a.this.new b(interfaceC30057d);
            bVar.f142367x = c35089b;
            bVar.f142368y = abstractC35088a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C35089b c35089b = (C35089b) this.f142367x;
            AbstractC35088a abstractC35088a = (AbstractC35088a) this.f142368y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f142366w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC35088a instanceof AbstractC35088a.a) {
                return C33954a.this.m107401d(c35089b, (AbstractC35088a.a) abstractC35088a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final C35089b m107401d(C35089b result, AbstractC35088a.a action) {
        Uri intentUri = action.getIntentUri();
        if (intentUri != null) {
            String queryParameter = intentUri.getQueryParameter("code");
            String queryParameter2 = intentUri.getQueryParameter("scope");
            String queryParameter3 = intentUri.getQueryParameter("state");
            if (AbstractC22676k.m65745e(intentUri.getPath(), "/strava_integration") && queryParameter != null && queryParameter2 != null && queryParameter3 != null) {
                return result.m110973a(new C38463d(new C38462c(queryParameter, queryParameter3, queryParameter2), 0, 2, null));
            }
        }
        return result.m110973a(null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C35089b(null, 1, null), upstream, new b(null));
    }
}
