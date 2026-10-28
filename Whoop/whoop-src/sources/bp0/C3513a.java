package bp0;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dp0.AbstractC12249e;
import ep0.C13404j;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;
import zo0.InterfaceC40915c;

/* JADX INFO: renamed from: bp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\rJ\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lbp0/a;", "", "Lzo0/c;", "internalCallbacks", "Lbc3/c0;", "scope", "<init>", "(Lzo0/c;Lbc3/c0;)V", "", "conversationId", "messageId", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "drawerState", "Lep0/j;", "screenContext", "d", "(Ljava/lang/String;Lep0/j;)V", "previewContent", "a", "screenId", "", "wasCutoff", "c", "(Ljava/lang/String;Z)V", "e", "Lzo0/c;", "Lbc3/c0;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3513a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40915c internalCallbacks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: bp0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.CoachOverlayCallbacks$onContentLoaded$1$1", m100430f = "CoachOverlayCallbacks.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13992w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40915c f13993x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f13994y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f13995z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40915c interfaceC40915c, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13993x = interfaceC40915c;
            this.f13994y = str;
            this.f13995z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f13993x, this.f13994y, this.f13995z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13992w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40915c interfaceC40915c = this.f13993x;
                String str = this.f13994y;
                String str2 = this.f13995z;
                this.f13992w = 1;
                if (interfaceC40915c.mo132626p(str, str2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.CoachOverlayCallbacks$onDismissPreview$1$1", m100430f = "CoachOverlayCallbacks.kt", m100431l = {C1533u.AVG_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13996w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40915c f13997x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f13998y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f13999z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC40915c interfaceC40915c, String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13997x = interfaceC40915c;
            this.f13998y = str;
            this.f13999z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f13997x, this.f13998y, this.f13999z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13996w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40915c interfaceC40915c = this.f13997x;
                String str = this.f13998y;
                String str2 = this.f13999z;
                this.f13996w = 1;
                if (interfaceC40915c.mo132627v(str, str2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C3513a(InterfaceC40915c interfaceC40915c, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.internalCallbacks = interfaceC40915c;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: a */
    public final void m10399a(String previewContent, String messageId) {
        AbstractC22676k.m65750j(previewContent, "previewContent");
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC40915c interfaceC40915c = this.internalCallbacks;
        if (interfaceC40915c != null) {
            AbstractC3006f0.m8732z(this.scope, null, null, new a(interfaceC40915c, previewContent, messageId, null), 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10400b(String conversationId, String messageId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC40915c interfaceC40915c = this.internalCallbacks;
        if (interfaceC40915c != null) {
            AbstractC3006f0.m8732z(this.scope, null, null, new b(interfaceC40915c, conversationId, messageId, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10401c(String screenId, boolean wasCutoff) {
        AbstractC22676k.m65750j(screenId, "screenId");
        InterfaceC40915c interfaceC40915c = this.internalCallbacks;
        if (interfaceC40915c != null) {
            interfaceC40915c.mo132625n(new AbstractC12249e.c(screenId, wasCutoff));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX INFO: renamed from: d */
    public final void m10402d(String drawerState, C13404j screenContext) {
        InterfaceC40915c interfaceC40915c;
        AbstractC22676k.m65750j(screenContext, "screenContext");
        if (drawerState == null || (interfaceC40915c = this.internalCallbacks) == null) {
            return;
        }
        String source = screenContext.getSource();
        if (source == null) {
            source = "";
        } else {
            if (AbstractC39414r.m125890i0(source)) {
                source = null;
            }
            if (source == null) {
                source = "";
            }
        }
        interfaceC40915c.mo132625n(new AbstractC12249e.d(source, drawerState, "drawer_dismiss"));
    }

    /* JADX INFO: renamed from: e */
    public final void m10403e(String screenId, boolean wasCutoff) {
        AbstractC22676k.m65750j(screenId, "screenId");
        InterfaceC40915c interfaceC40915c = this.internalCallbacks;
        if (interfaceC40915c != null) {
            interfaceC40915c.mo132625n(new AbstractC12249e.e(screenId, wasCutoff));
        }
    }
}
