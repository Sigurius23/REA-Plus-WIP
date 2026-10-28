package g91;

import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
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

/* JADX INFO: renamed from: g91.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lg91/b;", "Lod1/g;", "Lg91/a;", "Lg91/c;", "<init>", "()V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15603b implements InterfaceC27844g<AbstractC15602a, C15604c> {

    /* JADX INFO: renamed from: g91.b$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.domain.DesignShowcaseDomainInteractor$interact$1", m100430f = "DesignShowcaseDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lg91/c;", "state", "Lg91/a;", "action", "<anonymous>", "(Lg91/c;Lg91/a;)Lg91/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f58571w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f58572x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f58573y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C15604c c15604c, AbstractC15602a abstractC15602a, InterfaceC30057d<? super C15604c> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f58572x = c15604c;
            aVar.f58573y = abstractC15602a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C15604c c15604c = (C15604c) this.f58572x;
            AbstractC15602a abstractC15602a = (AbstractC15602a) this.f58573y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f58571w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC15602a instanceof AbstractC15602a.a) {
                return c15604c.m43919a("", ((AbstractC15602a.a) abstractC15602a).getItemType());
            }
            if (abstractC15602a instanceof AbstractC15602a.b) {
                return C15604c.m43918b(c15604c, ((AbstractC15602a.b) abstractC15602a).getSearchQuery(), null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C15604c("", DesignShowcaseMenuType.ROOT), upstream, new a(null));
    }
}
