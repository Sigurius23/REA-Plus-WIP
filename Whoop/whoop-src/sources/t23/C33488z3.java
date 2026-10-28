package t23;

import a33.C0351c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d33.C11585c;
import ec3.C13045h2;
import io.getstream.android.video.generated.models.CreateGuestResponse;
import io.getstream.android.video.generated.models.UserRequest;
import io.getstream.video.android.model.User;
import io.getstream.video.android.model.UserType;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y33.C39198a;
import y33.C39200c;

/* JADX INFO: renamed from: t23.z3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33488z3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f139815w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33366b4 f139816x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ User f139817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33488z3(C33366b4 c33366b4, User user, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f139816x = c33366b4;
        this.f139817y = user;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C33488z3(this.f139816x, this.f139817y, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C33488z3) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM105795m;
        C33366b4 c33366b4 = this.f139816x;
        C39200c c39200c = c33366b4.f139232E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f139815w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            User user = this.f139817y;
            UserRequest userRequest = new UserRequest(user.getId(), user.getImage(), null, null, user.getName(), user.getCustom(), 12, null);
            this.f139815w = 1;
            objM105795m = c33366b4.m105795m(new C0351c(c33366b4, userRequest, null, 11), this);
            if (objM105795m == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM105795m = obj;
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105795m;
        boolean z4 = abstractC26205h instanceof C26203f;
        if (z4) {
            throw new IllegalStateException("Failed to create guest user");
        }
        if (abstractC26205h instanceof C26204g) {
            CreateGuestResponse createGuestResponse = (CreateGuestResponse) ((C26204g) abstractC26205h).f103919a;
            C39198a c39198a = c39200c.f168477e;
            c39198a.getClass();
            c39198a.f168470y = "jwt";
            c39200c.m124885b(createGuestResponse.getAccessToken());
            C11585c c11585c = c33366b4.f139236I;
            User user2 = User.copy$default(AbstractC35903f.m114002V(createGuestResponse.getUser()), null, null, UserType.Guest.INSTANCE, null, null, null, null, null, null, null, 1019, null);
            c11585c.getClass();
            AbstractC22676k.m65750j(user2, "user");
            C13045h2 c13045h2 = c11585c.f37369a;
            c13045h2.getClass();
            c13045h2.m36571k(null, user2);
        } else if (!z4) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}
