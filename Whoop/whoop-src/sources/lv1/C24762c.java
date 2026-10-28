package lv1;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import in2.InterfaceC18732d;
import l83.C23454a0;
import mv1.C25971a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: lv1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Llv1/c;", "", "Lin2/d;", "dispatcher", "Lmv1/a;", "memberDataExportServiceRepository", "<init>", "(Lin2/d;Lmv1/a;)V", "Llv1/a;", "action", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "b", "(Llv1/a;Lq83/d;)Ljava/lang/Object;", "a", "Lin2/d;", "Lmv1/a;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24762c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25971a memberDataExportServiceRepository;

    /* JADX INFO: renamed from: lv1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memberdataexport.interactors.MemberDataExportStateInteractor$interact$2", m100430f = "MemberDataExportStateInteractor.kt", m100431l = {15, C1533u.MAX_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f96853w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC24760a f96854x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C24762c f96855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC24760a abstractC24760a, C24762c c24762c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f96854x = abstractC24760a;
            this.f96855y = c24762c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f96854x, this.f96855y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super MemberDataExportModel> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r5 == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f96853w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L52
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L34
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                lv1.a r5 = r4.f96854x
                boolean r1 = r5 instanceof lv1.AbstractC24760a.a
                if (r1 == 0) goto L37
                lv1.c r5 = r4.f96855y
                mv1.a r5 = lv1.C24762c.m72503a(r5)
                r4.f96853w = r3
                java.lang.Object r5 = r5.m76987b(r4)
                if (r5 != r0) goto L34
                goto L51
            L34:
                com.whoop.memberdataexport.models.MemberDataExportModel r5 = (com.whoop.memberdataexport.models.MemberDataExportModel) r5
                return r5
            L37:
                boolean r5 = r5 instanceof lv1.AbstractC24760a.b
                if (r5 == 0) goto L55
                lv1.c r5 = r4.f96855y
                mv1.a r5 = lv1.C24762c.m72503a(r5)
                lv1.a r1 = r4.f96854x
                lv1.a$b r1 = (lv1.AbstractC24760a.b) r1
                java.lang.String r1 = r1.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String()
                r4.f96853w = r2
                java.lang.Object r5 = r5.m76988c(r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                com.whoop.memberdataexport.models.MemberDataExportModel r5 = (com.whoop.memberdataexport.models.MemberDataExportModel) r5
                return r5
            L55:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: lv1.C24762c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C24762c(InterfaceC18732d dispatcher, C25971a memberDataExportServiceRepository) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(memberDataExportServiceRepository, "memberDataExportServiceRepository");
        this.dispatcher = dispatcher;
        this.memberDataExportServiceRepository = memberDataExportServiceRepository;
    }

    /* JADX INFO: renamed from: b */
    public final Object m72504b(AbstractC24760a abstractC24760a, InterfaceC30057d<? super MemberDataExportModel> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new a(abstractC24760a, this, null), interfaceC30057d);
    }
}
