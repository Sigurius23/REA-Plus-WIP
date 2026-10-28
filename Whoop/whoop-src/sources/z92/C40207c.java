package z92;

import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vs0.InterfaceC36471a;

/* JADX INFO: renamed from: z92.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lz92/c;", "Lvs0/a;", "Lz92/a;", "userInfoAccessor", "<init>", "(Lz92/a;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "Lz92/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40207c implements InterfaceC36471a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: z92.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoSignedInProvider", m100430f = "UserInfoSignedInProvider.kt", m100431l = {10}, m100432m = "isSignedIn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f173627w;

        /* JADX INFO: renamed from: y */
        int f173629y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173627w = obj;
            this.f173629y |= Integer.MIN_VALUE;
            return C40207c.this.mo116827a(this);
        }
    }

    public C40207c(InterfaceC40205a userInfoAccessor) {
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.userInfoAccessor = userInfoAccessor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vs0.InterfaceC36471a
    /* JADX INFO: renamed from: a */
    public Object mo116827a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f173629y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f173629y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo129089c = aVar.f173627w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f173629y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            aVar.f173629y = 1;
            objMo129089c = interfaceC40205a.mo129089c(aVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        return Boolean.valueOf(objMo129089c != null);
    }
}
