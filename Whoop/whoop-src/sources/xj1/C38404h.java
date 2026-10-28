package xj1;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.User;
import java.io.File;
import l83.C23454a0;
import or2.C28144a0;
import or2.C28204u;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import uj1.AbstractC35037a;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: xj1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$¨\u0006%"}, m65681d2 = {"Lxj1/h;", "", "Lor2/a0;", "fileManager", "Landroid/content/Context;", "context", "Lz92/a;", "userInfoAccessor", "Ltr2/n;", "logger", "Lq83/j;", "ioContext", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lor2/a0;Landroid/content/Context;Lz92/a;Ltr2/n;Lq83/j;Lzr2/a;)V", "", "e", "(Lq83/d;)Ljava/lang/Object;", "Lud3/a1;", "responseBody", "Ljava/io/File;", "f", "(Lud3/a1;Lq83/d;)Ljava/lang/Object;", "file", "Ll83/a0;", "d", "(Ljava/io/File;)V", "a", "Lor2/a0;", "b", "Landroid/content/Context;", "c", "Lz92/a;", "Ltr2/n;", "Lq83/j;", "Lzr2/a;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38404h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: xj1.h$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.HealthReportPdfHandler", m100430f = "HealthReportPdfHandler.kt", m100431l = {42}, m100432m = "generateHealthReportTitle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f164388w;

        /* JADX INFO: renamed from: y */
        int f164390y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164388w = obj;
            this.f164390y |= Integer.MIN_VALUE;
            return C38404h.this.m123004e(this);
        }
    }

    /* JADX INFO: renamed from: xj1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.HealthReportPdfHandler$saveHealthReport$2", m100430f = "HealthReportPdfHandler.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ljava/io/File;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164391w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f164392x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34799a1 f164394z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC34799a1 abstractC34799a1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164394z = abstractC34799a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C38404h.this.new b(this.f164394z, interfaceC30057d);
            bVar.f164392x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super File> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f164392x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164391w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38404h c38404h = C38404h.this;
                    this.f164392x = interfaceC2994c0;
                    this.f164391w = 1;
                    obj = c38404h.m123004e(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C38404h.this.fileManager.m85164h((String) obj, this.f164394z);
            } catch (Exception e5) {
                AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                C38404h.this.logger.mo85230v("Failed to save health report pdf file", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    public C38404h(C28144a0 fileManager, Context context, InterfaceC40205a userInfoAccessor, InterfaceC34116n logger, InterfaceC30063j ioContext, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.fileManager = fileManager;
        this.context = context;
        this.userInfoAccessor = userInfoAccessor;
        this.logger = logger;
        this.ioContext = ioContext;
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m123004e(InterfaceC30057d<? super String> interfaceC30057d) {
        a aVar;
        String fullName;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f164390y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f164390y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo129089c = aVar.f164388w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f164390y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            aVar.f164390y = 1;
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
        User user = (User) objMo129089c;
        if (user == null || (fullName = user.getFullName()) == null) {
            fullName = "";
        }
        String strM85360c = C28204u.INSTANCE.m85360c(this.dateAndTimeProvider.mo133364c(), "MMMM dd, yyyy");
        String string = this.context.getString(AbstractC35037a.f148476e);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = this.context.getString(AbstractC35037a.f148474c);
        AbstractC22676k.m65749i(string2, "getString(...)");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(" ");
        sb4.append(string2);
        AbstractC11266d.m30444B(sb4, " ", fullName, " ", strM85360c);
        sb4.append(".pdf");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m123005d(File file) {
        AbstractC22676k.m65750j(file, "file");
        this.fileManager.m85162e(file);
    }

    /* JADX INFO: renamed from: f */
    public final Object m123006f(AbstractC34799a1 abstractC34799a1, InterfaceC30057d<? super File> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new b(abstractC34799a1, null), interfaceC30057d);
    }
}
