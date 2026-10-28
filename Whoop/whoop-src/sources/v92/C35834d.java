package v92;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import gs.AbstractC16125c;
import io.sentry.android.replay.video.C20245d;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import kc3.C22365e;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p154fs.C14730h;
import p154fs.InterfaceC14723a;
import p259js.AbstractC21906a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ps.C29499a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: v92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 ¨\u0006\""}, m65681d2 = {"Lv92/d;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll83/a0;", "g", "()V", "Lfs/a;", "f", "(Lq83/d;)Ljava/lang/Object;", "Lfs/h;", "e", "()Lfs/h;", "", "input", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "cipherText", "c", "([BLq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lfs/a;", "aead", "Lmc3/a;", "Lmc3/a;", "mutex", "Lps/a;", "Lps/a;", "keysetManager", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35834d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC14723a aead;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C29499a keysetManager;

    /* JADX INFO: renamed from: v92.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedKeyStore", m100430f = "EncryptedKeyStore.kt", m100431l = {80}, m100432m = "decrypt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f152552w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152553x;

        /* JADX INFO: renamed from: z */
        int f152555z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152553x = obj;
            this.f152555z |= Integer.MIN_VALUE;
            return C35834d.this.m113745c(null, this);
        }
    }

    /* JADX INFO: renamed from: v92.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedKeyStore", m100430f = "EncryptedKeyStore.kt", m100431l = {72}, m100432m = "encrypt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f152556w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152557x;

        /* JADX INFO: renamed from: z */
        int f152559z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152557x = obj;
            this.f152559z |= Integer.MIN_VALUE;
            return C35834d.this.m113746d(null, this);
        }
    }

    /* JADX INFO: renamed from: v92.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedKeyStore", m100430f = "EncryptedKeyStore.kt", m100431l = {90, 47}, m100432m = "getOrInitAead", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f152561F;

        /* JADX INFO: renamed from: w */
        Object f152562w;

        /* JADX INFO: renamed from: x */
        int f152563x;

        /* JADX INFO: renamed from: y */
        int f152564y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f152565z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152565z = obj;
            this.f152561F |= Integer.MIN_VALUE;
            return C35834d.this.m113743f(this);
        }
    }

    /* JADX INFO: renamed from: v92.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.encrypted.EncryptedKeyStore$getOrInitAead$2$1", m100430f = "EncryptedKeyStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lfs/a;", "<anonymous>", "(Lbc3/c0;)Lfs/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152566w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35834d.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14723a> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws GeneralSecurityException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152566w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14730h c14730hM113742e = C35834d.this.m113742e();
            if (c14730hM113742e != null) {
                return (InterfaceC14723a) c14730hM113742e.m42234b(InterfaceC14723a.class);
            }
            throw new GeneralSecurityException("Aead was null");
        }
    }

    public C35834d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.mutex = AbstractC25438d.m74669a();
        m113744g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C14730h m113742e() {
        C20245d c20245d = new C20245d(2);
        c20245d.m56175r(this.context, "auth_material_key_set", "auth_material_prefs_name");
        c20245d.m56173p(AbstractC16125c.f61253a);
        c20245d.m56174q("android-keystore://hello_world_master_key");
        C29499a c29499aM56160a = c20245d.m56160a();
        this.keysetManager = c29499aM56160a;
        return c29499aM56160a.m90130a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m113743f(InterfaceC30057d<? super InterfaceC14723a> interfaceC30057d) throws Throwable {
        d dVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        InterfaceC14723a interfaceC14723a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f152561F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f152561F = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f152565z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar.f152561F;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC14723a interfaceC14723a2 = this.aead;
                if (interfaceC14723a2 != null) {
                    return interfaceC14723a2;
                }
                interfaceC25435a = this.mutex;
                dVar.f152562w = interfaceC25435a;
                dVar.f152563x = 0;
                dVar.f152561F = 1;
                if (interfaceC25435a.mo68211b(dVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) dVar.f152562w;
                try {
                    AbstractC34132o.m107864I(obj);
                    this.aead = (InterfaceC14723a) obj;
                    interfaceC14723a = (InterfaceC14723a) obj;
                    interfaceC25435a = interfaceC25435a2;
                    interfaceC25435a.mo68214i(null);
                    return interfaceC14723a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = dVar.f152563x;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) dVar.f152562w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            interfaceC14723a = this.aead;
            if (interfaceC14723a == null) {
                C22365e c22365e = AbstractC3050q0.f12077a;
                e eVar = new e(null);
                dVar.f152562w = interfaceC25435a;
                dVar.f152563x = i13;
                dVar.f152564y = 0;
                dVar.f152561F = 2;
                Object objM8705K = AbstractC3006f0.m8705K(c22365e, eVar, dVar);
                if (objM8705K != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    obj = objM8705K;
                    this.aead = (InterfaceC14723a) obj;
                    interfaceC14723a = (InterfaceC14723a) obj;
                    interfaceC25435a = interfaceC25435a2;
                }
                return enumC31071a;
            }
            interfaceC25435a.mo68214i(null);
            return interfaceC14723a;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m113744g() {
        try {
            AbstractC21906a.m62324a();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m113745c(byte[] bArr, InterfaceC30057d<? super byte[]> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f152555z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f152555z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM113743f = bVar.f152553x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f152555z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM113743f);
            bVar.f152552w = bArr;
            bVar.f152555z = 1;
            objM113743f = m113743f(bVar);
            if (objM113743f == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) bVar.f152552w;
            AbstractC34132o.m107864I(objM113743f);
        }
        byte[] bytes = "".getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        byte[] bArrMo5980b = ((InterfaceC14723a) objM113743f).mo5980b(bArr, bytes);
        AbstractC22676k.m65749i(bArrMo5980b, "decrypt(...)");
        return bArrMo5980b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m113746d(String str, InterfaceC30057d<? super byte[]> interfaceC30057d) throws Throwable {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f152559z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f152559z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM113743f = cVar.f152557x;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f152559z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM113743f);
            cVar.f152556w = str;
            cVar.f152559z = 1;
            objM113743f = m113743f(cVar);
            if (objM113743f == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f152556w;
            AbstractC34132o.m107864I(objM113743f);
        }
        Charset charset = AbstractC39397a.f169546a;
        byte[] bytes = str.getBytes(charset);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        byte[] bytes2 = "".getBytes(charset);
        AbstractC22676k.m65749i(bytes2, "getBytes(...)");
        byte[] bArrMo5979a = ((InterfaceC14723a) objM113743f).mo5979a(bytes, bytes2);
        AbstractC22676k.m65749i(bArrMo5979a, "encrypt(...)");
        return bArrMo5979a;
    }
}
