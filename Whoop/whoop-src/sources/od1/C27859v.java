package od1;

import com.whoop.data.repositories.ActiveSessionChecker;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: od1.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lod1/v;", "Lcom/whoop/data/repositories/ActiveSessionChecker;", "Lz92/a;", "userInfoAccessor", "Lod1/j;", "pendingUserSessionRepository", "<init>", "(Lz92/a;Lod1/j;)V", "", "hasSession", "(Lq83/d;)Ljava/lang/Object;", "a", "Lz92/a;", "b", "Lod1/j;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27859v implements ActiveSessionChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: od1.v$a */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserInfoActiveSessionChecker", m100430f = "UserInfoActiveSessionChecker.kt", m100431l = {12}, m100432m = "hasSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f112252w;

        /* JADX INFO: renamed from: y */
        int f112254y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112252w = obj;
            this.f112254y |= Integer.MIN_VALUE;
            return C27859v.this.hasSession(this);
        }
    }

    public C27859v(InterfaceC40205a userInfoAccessor, C27847j pendingUserSessionRepository) {
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        this.userInfoAccessor = userInfoAccessor;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.repositories.ActiveSessionChecker
    public Object hasSession(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f112254y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f112254y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM36575A = aVar.f112252w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f112254y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l user = this.userInfoAccessor.getUser();
            aVar.f112254y = 1;
            objM36575A = AbstractC13091v.m36575A(user, aVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        if (objM36575A == null && this.pendingUserSessionRepository.getAccessToken() == null) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
