package f80;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import com.whoop.data.datastore.EmailDataStoreHelper;
import java.util.concurrent.CancellationException;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p108e4.AbstractC12667a;
import p320m5.C25070n;
import p320m5.C25071o;
import p320m5.C25072p;
import p320m5.C25073q;
import p320m5.InterfaceC25062f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: f80.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lf80/a;", "", "Lm5/f;", "credentialManager", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Ltr2/n;", "logger", "<init>", "(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;)V", "Landroid/content/Context;", "context", "Lf80/b;", "a", "(Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "", NotificationCompat.CATEGORY_EMAIL, "password", "Lf80/c;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lm5/f;", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "c", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14242a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25062f credentialManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f80.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.passwordmanager.ActivationCredentialManagerHelper", m100430f = "ActivationCredentialManagerHelper.kt", m100431l = {43}, m100432m = "retrievePassword", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f52010E;

        /* JADX INFO: renamed from: w */
        Object f52011w;

        /* JADX INFO: renamed from: x */
        Object f52012x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52013y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52013y = obj;
            this.f52010E |= Integer.MIN_VALUE;
            return C14242a.this.m40699a(null, this);
        }
    }

    /* JADX INFO: renamed from: f80.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.passwordmanager.ActivationCredentialManagerHelper", m100430f = "ActivationCredentialManagerHelper.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 81}, m100432m = "savePassword", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f52015E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f52016F;

        /* JADX INFO: renamed from: H */
        int f52018H;

        /* JADX INFO: renamed from: w */
        Object f52019w;

        /* JADX INFO: renamed from: x */
        Object f52020x;

        /* JADX INFO: renamed from: y */
        Object f52021y;

        /* JADX INFO: renamed from: z */
        Object f52022z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52016F = obj;
            this.f52018H |= Integer.MIN_VALUE;
            return C14242a.this.m40700b(null, null, null, this);
        }
    }

    public C14242a(InterfaceC25062f credentialManager, EmailDataStoreHelper emailDataStoreHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(credentialManager, "credentialManager");
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.credentialManager = credentialManager;
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40699a(Context context, InterfaceC30057d<? super AbstractC14243b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f52010E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f52010E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM73536a = aVar.f52013y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f52010E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM73536a);
                C25070n c25070n = new C25070n(AbstractC37056f.m118958J(new C25072p()));
                InterfaceC25062f interfaceC25062f = this.credentialManager;
                aVar.f52011w = null;
                aVar.f52012x = null;
                aVar.f52010E = 1;
                interfaceC25062f.getClass();
                objM73536a = InterfaceC25062f.m73536a(context, c25070n, aVar);
                if (objM73536a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM73536a);
            }
            AbstractC12667a abstractC12667aM73538a = ((C25071o) objM73536a).m73538a();
            C25073q c25073q = abstractC12667aM73538a instanceof C25073q ? (C25073q) abstractC12667aM73538a : null;
            String strM73539U = c25073q != null ? c25073q.m73539U() : null;
            if (strM73539U != null && !AbstractC39414r.m125890i0(strM73539U)) {
                return new AbstractC14243b.b(strM73539U);
            }
            return new AbstractC14243b.a("no_password_credential");
        } catch (GetCredentialCancellationException e5) {
            this.logger.mo85211a("CredentialManager: retrievePassword cancelled by user", e5, new AbstractC30556a.a[0]);
            return AbstractC14243b.c.f52025a;
        } catch (GetCredentialException e13) {
            this.logger.mo85211a("CredentialManager: retrievePassword failed", e13, new AbstractC30556a.a[0]);
            return new AbstractC14243b.a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(e13.getClass()).getSimpleName());
        } catch (CancellationException e14) {
            throw e14;
        } catch (Exception e15) {
            this.logger.mo85211a("CredentialManager: retrievePassword failed (unexpected)", e15, new AbstractC30556a.a[0]);
            return new AbstractC14243b.a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(e15.getClass()).getSimpleName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r9.m73537b(r8, r11, r0) == r1) goto L52;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40700b(android.content.Context r8, java.lang.String r9, java.lang.String r10, q83.InterfaceC30057d<? super f80.EnumC14244c> r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.C14242a.m40700b(android.content.Context, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ C14242a(InterfaceC25062f interfaceC25062f, EmailDataStoreHelper emailDataStoreHelper, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25062f, emailDataStoreHelper, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationCredentialManagerHelper") : interfaceC34116n);
    }
}
