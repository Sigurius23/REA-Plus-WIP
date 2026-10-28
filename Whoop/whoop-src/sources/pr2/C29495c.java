package pr2;

import com.whoop.domain.model.User;
import com.whoop.util.avatar.AvatarApi;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: pr2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006#"}, m65681d2 = {"Lpr2/c;", "Lpr2/b;", "Lcom/whoop/util/avatar/AvatarApi;", "avatarApi", "Lz92/a;", "userInfoAccessor", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/util/avatar/AvatarApi;Lz92/a;Ltr2/n;)V", "", "firstName", "lastName", "Lpr2/d;", "d", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "e", "a", "(Lq83/d;)Ljava/lang/Object;", "", "imageData", "b", "([BLq83/d;)Ljava/lang/Object;", "Lcom/whoop/util/avatar/AvatarApi;", "Lz92/a;", "c", "Ltr2/n;", "Lec3/p1;", "Lpr2/e;", "Lec3/p1;", "_avatarUploadState", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "avatarUploadState", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29495c implements InterfaceC29494b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AvatarApi avatarApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 _avatarUploadState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 avatarUploadState;

    /* JADX INFO: renamed from: pr2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarServiceImpl", m100430f = "AvatarServiceImpl.kt", m100431l = {59, 64}, m100432m = "deleteCurrentUserAvatar", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f119909F;

        /* JADX INFO: renamed from: w */
        Object f119910w;

        /* JADX INFO: renamed from: x */
        Object f119911x;

        /* JADX INFO: renamed from: y */
        Object f119912y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f119913z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119913z = obj;
            this.f119909F |= Integer.MIN_VALUE;
            return C29495c.this.mo90116a(this);
        }
    }

    /* JADX INFO: renamed from: pr2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarServiceImpl", m100430f = "AvatarServiceImpl.kt", m100431l = {24}, m100432m = "generateAndUploadAvatar", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f119914E;

        /* JADX INFO: renamed from: w */
        Object f119915w;

        /* JADX INFO: renamed from: x */
        Object f119916x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f119917y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119917y = obj;
            this.f119914E |= Integer.MIN_VALUE;
            return C29495c.this.mo90119d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarServiceImpl", m100430f = "AvatarServiceImpl.kt", m100431l = {78}, m100432m = "uploadAvatar", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f119919w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119920x;

        /* JADX INFO: renamed from: z */
        int f119922z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119920x = obj;
            this.f119922z |= Integer.MIN_VALUE;
            return C29495c.this.mo90117b(null, this);
        }
    }

    public C29495c(AvatarApi avatarApi, InterfaceC40205a userInfoAccessor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(avatarApi, "avatarApi");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(logger, "logger");
        this.avatarApi = avatarApi;
        this.userInfoAccessor = userInfoAccessor;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(InterfaceC29497e.c.f119929a);
        this._avatarUploadState = c13045h2M36593c;
        this.avatarUploadState = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr2.InterfaceC29494b
    /* JADX INFO: renamed from: a */
    public Object mo90116a(InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f119909F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f119909F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo129089c = aVar.f119913z;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f119909F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            this.logger.mo85228t("Starting avatar deletion for current user", new AbstractC30556a.a[0]);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            aVar.f119909F = 1;
            objMo129089c = interfaceC40205a.mo129089c(aVar);
            if (objMo129089c != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
            return objMo129089c;
        }
        AbstractC34132o.m107864I(objMo129089c);
        User user = (User) objMo129089c;
        if (user == null) {
            this.logger.mo85222m("Cannot delete avatar: no current user session", new AbstractC30556a.a[0]);
            return new InterfaceC29496d.a("Cannot delete avatar: no current user session", null, 2, null);
        }
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        this.logger.mo85228t(AbstractC31061c.m95640p("Retrieved current user name: ", firstName, " ", lastName), new AbstractC30556a.a[0]);
        aVar.f119910w = null;
        aVar.f119911x = null;
        aVar.f119912y = null;
        aVar.f119909F = 2;
        Object objM90120e = m90120e(firstName, lastName, aVar);
        return objM90120e == obj ? obj : objM90120e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // pr2.InterfaceC29494b
    /* JADX INFO: renamed from: b */
    public Object mo90117b(byte[] bArr, InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f119922z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f119922z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM90129g = cVar.f119920x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f119922z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM90129g);
                this.logger.mo85228t(AbstractC2875y.m8296i(bArr.length, "Starting avatar upload, size: ", " bytes"), new AbstractC30556a.a[0]);
                ((C13045h2) this._avatarUploadState).m36570j(InterfaceC29497e.e.f119931a);
                C29498f c29498f = C29498f.f119932a;
                AvatarApi avatarApi = this.avatarApi;
                cVar.f119919w = null;
                cVar.f119922z = 1;
                objM90129g = c29498f.m90129g(avatarApi, bArr, cVar);
                if (objM90129g == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM90129g);
            }
            InterfaceC29496d interfaceC29496d = (InterfaceC29496d) objM90129g;
            if (interfaceC29496d instanceof InterfaceC29496d.b) {
                this.logger.mo85228t("Avatar upload successful", new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p1 = this._avatarUploadState;
                InterfaceC29497e.d dVar = new InterfaceC29497e.d("Avatar upload successful");
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, dVar);
                return new InterfaceC29496d.b("Avatar upload successful");
            }
            if (!(interfaceC29496d instanceof InterfaceC29496d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = "Avatar upload failed: " + ((InterfaceC29496d.a) interfaceC29496d).getMessage();
            Throwable throwable = ((InterfaceC29496d.a) interfaceC29496d).getThrowable();
            if (throwable != null) {
                this.logger.mo85230v(str, throwable, new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m(str, new AbstractC30556a.a[0]);
            }
            InterfaceC13075p1 interfaceC13075p2 = this._avatarUploadState;
            InterfaceC29497e.a aVar = new InterfaceC29497e.a(str, ((InterfaceC29496d.a) interfaceC29496d).getThrowable());
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
            c13045h3.getClass();
            c13045h3.m36571k(null, aVar);
            return new InterfaceC29496d.a(str, ((InterfaceC29496d.a) interfaceC29496d).getThrowable());
        } catch (Exception e5) {
            this.logger.mo85230v("Unexpected error during avatar upload", e5, new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p3 = this._avatarUploadState;
            InterfaceC29497e.a aVar2 = new InterfaceC29497e.a("Unexpected error during avatar upload", e5);
            C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
            c13045h4.getClass();
            c13045h4.m36571k(null, aVar2);
            return new InterfaceC29496d.a("Unexpected error during avatar upload", e5);
        }
    }

    @Override // pr2.InterfaceC29494b
    /* JADX INFO: renamed from: c, reason: from getter */
    public InterfaceC13037f2 getAvatarUploadState() {
        return this.avatarUploadState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // pr2.InterfaceC29494b
    /* JADX INFO: renamed from: d */
    public Object mo90119d(String str, String str2, InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f119914E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f119914E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM90127d = bVar.f119917y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f119914E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM90127d);
                InterfaceC34116n interfaceC34116n = this.logger;
                Character chM125883b0 = AbstractC39414r.m125883b0(str);
                char cCharValue = chM125883b0 != null ? chM125883b0.charValue() : '?';
                Character chM125883b1 = AbstractC39414r.m125883b0(str2);
                interfaceC34116n.mo85228t("Starting avatar generation and upload for user: " + cCharValue + (chM125883b1 != null ? chM125883b1.charValue() : '?'), new AbstractC30556a.a[0]);
                ((C13045h2) this._avatarUploadState).m36570j(InterfaceC29497e.b.f119928a);
                C29498f c29498f = C29498f.f119932a;
                AvatarApi avatarApi = this.avatarApi;
                bVar.f119915w = null;
                bVar.f119916x = null;
                bVar.f119914E = 1;
                objM90127d = c29498f.m90127d(avatarApi, str, str2, bVar);
                if (objM90127d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM90127d);
            }
            InterfaceC29496d interfaceC29496d = (InterfaceC29496d) objM90127d;
            if (interfaceC29496d instanceof InterfaceC29496d.b) {
                this.logger.mo85228t("Avatar upload successful", new AbstractC30556a.a[0]);
                InterfaceC13075p1 interfaceC13075p1 = this._avatarUploadState;
                InterfaceC29497e.d dVar = new InterfaceC29497e.d("Avatar upload successful");
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, dVar);
                return new InterfaceC29496d.b("Avatar upload successful");
            }
            if (!(interfaceC29496d instanceof InterfaceC29496d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = "Avatar upload failed: " + ((InterfaceC29496d.a) interfaceC29496d).getMessage();
            Throwable throwable = ((InterfaceC29496d.a) interfaceC29496d).getThrowable();
            if (throwable != null) {
                this.logger.mo85230v(str3, throwable, new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m(str3, new AbstractC30556a.a[0]);
            }
            InterfaceC13075p1 interfaceC13075p2 = this._avatarUploadState;
            InterfaceC29497e.a aVar = new InterfaceC29497e.a(str3, ((InterfaceC29496d.a) interfaceC29496d).getThrowable());
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
            c13045h3.getClass();
            c13045h3.m36571k(null, aVar);
            return new InterfaceC29496d.a(str3, ((InterfaceC29496d.a) interfaceC29496d).getThrowable());
        } catch (Exception e5) {
            this.logger.mo85230v("Unexpected error during avatar generation/upload", e5, new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p3 = this._avatarUploadState;
            InterfaceC29497e.a aVar2 = new InterfaceC29497e.a("Unexpected error during avatar generation/upload", e5);
            C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
            c13045h4.getClass();
            c13045h4.m36571k(null, aVar2);
            return new InterfaceC29496d.a("Unexpected error during avatar generation/upload", e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m90120e(String str, String str2, InterfaceC30057d<? super InterfaceC29496d> interfaceC30057d) {
        this.logger.mo85228t("Starting avatar deletion with initials for user.", new AbstractC30556a.a[0]);
        return mo90119d(str, str2, interfaceC30057d);
    }
}
