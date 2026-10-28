package x90;

import com.whoop.navigation.C9598e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: x90.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lx90/e;", "", "Lx90/f;", "activitySessionHandler", "Ltr2/n;", "logger", "<init>", "(Lx90/f;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lx90/f;", "b", "Ltr2/n;", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38099e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC38100f activitySessionHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x90.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.activitysession.ActiveSessionNavigationResolver", m100430f = "ActiveSessionNavigationResolver.kt", m100431l = {12}, m100432m = "resolveDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163167w;

        /* JADX INFO: renamed from: y */
        int f163169y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163167w = obj;
            this.f163169y |= Integer.MIN_VALUE;
            return C38099e.this.m122071a(this);
        }
    }

    public C38099e(InterfaceC38100f activitySessionHandler, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activitySessionHandler, "activitySessionHandler");
        AbstractC22676k.m65750j(logger, "logger");
        this.activitySessionHandler = activitySessionHandler;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m122071a(InterfaceC30057d<? super C9598e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f163169y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f163169y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo122073b = aVar.f163167w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f163169y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo122073b);
            InterfaceC38100f interfaceC38100f = this.activitySessionHandler;
            aVar.f163169y = 1;
            objMo122073b = interfaceC38100f.mo122073b(aVar);
            if (objMo122073b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo122073b);
        }
        C38098d c38098d = (C38098d) objMo122073b;
        if (c38098d == null) {
            return null;
        }
        C9598e resumeSessionDestination = c38098d.getResumeSessionDestination();
        if (resumeSessionDestination != null) {
            return resumeSessionDestination;
        }
        this.logger.mo85222m("Active session (" + c38098d.getState() + ") found with no resumeSessionDestination", new AbstractC30556a.a[0]);
        return null;
    }
}
