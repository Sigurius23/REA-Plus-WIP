package pw1;

import c93.InterfaceC4351m;
import com.whoop.membership.familyPlan.domain.api.FamilyPlanApi;
import com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse;
import com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: pw1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lpw1/d;", "Lod1/g;", "Lpw1/a;", "Lpw1/b;", "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;", "familyPlanApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;)V", "previousResult", "action", "l", "(Lpw1/b;Lpw1/a;)Lpw1/b;", "", "userId", "familyPlanId", "Lec3/l;", "Lpw1/e;", "j", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "i", "k", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;", "b", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29588d implements InterfaceC27844g<InterfaceC29585a, C29586b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FamilyPlanApi familyPlanApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: pw1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$deleteFamilyMemeber$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {71, 73, 76, 77, 78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f120763E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f120764F;

        /* JADX INFO: renamed from: w */
        Object f120765w;

        /* JADX INFO: renamed from: x */
        int f120766x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f120767y;

        /* JADX INFO: renamed from: pw1.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$deleteFamilyMemeber$1$response$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42199a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f120769w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29588d f120770x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f120771y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f120772z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42199a(C29588d c29588d, String str, String str2, InterfaceC30057d<? super C42199a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f120770x = c29588d;
                this.f120771y = str;
                this.f120772z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42199a(this.f120770x, this.f120771y, this.f120772z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f120769w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FamilyPlanApi familyPlanApi = this.f120770x.familyPlanApi;
                String str = this.f120771y;
                String str2 = this.f120772z;
                this.f120769w = 1;
                Object objDeleteFamilyMember = familyPlanApi.deleteFamilyMember(str, str2, this);
                return objDeleteFamilyMember == enumC31071a ? enumC31071a : objDeleteFamilyMember;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C42199a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120763E = str;
            this.f120764F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C29588d.this.new a(this.f120763E, this.f120764F, interfaceC30057d);
            aVar.f120767y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0070  */
        /* JADX WARN: Code duplicated, block: B:26:0x0083  */
        /* JADX WARN: Code duplicated, block: B:28:0x0087  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r8, r0, r14) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f120767y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r14.f120766x
                r10 = 5
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                if (r0 == 0) goto L36
                if (r0 == r2) goto L32
                if (r0 == r1) goto L2d
                if (r0 == r12) goto L24
                if (r0 == r11) goto L24
                if (r0 != r10) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r14.f120765w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto La5
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L6a
            L32:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L46
            L36:
                p505ts.AbstractC34132o.m107864I(r15)
                pw1.e$d r0 = pw1.AbstractC29589e.d.f120821a
                r14.f120767y = r8
                r14.f120766x = r2
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L46
                goto La4
            L46:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                pw1.d r2 = pw1.C29588d.this
                tr2.n r2 = pw1.C29588d.m90708g(r2)
                pw1.d$a$a r4 = new pw1.d$a$a
                pw1.d r3 = pw1.C29588d.this
                java.lang.String r6 = r14.f120763E
                java.lang.String r7 = r14.f120764F
                r4.<init>(r3, r6, r7, r13)
                r14.f120767y = r8
                r14.f120766x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L6a
                goto La4
            L6a:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L83
                pw1.d r0 = pw1.C29588d.this
                ec3.l r0 = pw1.C29588d.m90706e(r0)
                r14.f120767y = r13
                r14.f120765w = r13
                r14.f120766x = r12
                java.lang.Object r0 = ec3.AbstractC13091v.m36613w(r8, r0, r14)
                if (r0 != r9) goto La5
                goto La4
            L83:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b.a
                if (r0 == 0) goto L96
                pw1.e$f r0 = pw1.AbstractC29589e.f.f120823a
                r14.f120767y = r13
                r14.f120765w = r13
                r14.f120766x = r11
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto La5
                goto La4
            L96:
                pw1.e$e r0 = pw1.AbstractC29589e.e.f120822a
                r14.f120767y = r13
                r14.f120765w = r13
                r14.f120766x = r10
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto La5
            La4:
                return r9
            La5:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pw1.C29588d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pw1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$fetchConfirmRemovalDialog$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {59, 60, 64, 65, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f120773E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f120774F;

        /* JADX INFO: renamed from: w */
        Object f120775w;

        /* JADX INFO: renamed from: x */
        int f120776x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f120777y;

        /* JADX INFO: renamed from: pw1.d$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$fetchConfirmRemovalDialog$1$response$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f120779w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29588d f120780x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29588d c29588d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f120780x = c29588d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f120780x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f120779w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FamilyPlanApi familyPlanApi = this.f120780x.familyPlanApi;
                this.f120779w = 1;
                Object objFetchRemoveMemberDialog = familyPlanApi.fetchRemoveMemberDialog(this);
                return objFetchRemoveMemberDialog == enumC31071a ? enumC31071a : objFetchRemoveMemberDialog;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super RemoveFamilyMemberDialogResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120773E = str;
            this.f120774F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C29588d.this.new b(this.f120773E, this.f120774F, interfaceC30057d);
            bVar.f120777y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:26:0x008a  */
        /* JADX WARN: Code duplicated, block: B:28:0x008e  */
        /* JADX WARN: Code duplicated, block: B:31:0x009d  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        
            if (r8.emit(r1, r14) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f120777y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r14.f120776x
                r10 = 5
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                if (r0 == 0) goto L36
                if (r0 == r2) goto L32
                if (r0 == r1) goto L2d
                if (r0 == r12) goto L24
                if (r0 == r11) goto L24
                if (r0 != r10) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r14.f120775w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lb0
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L66
            L32:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L46
            L36:
                p505ts.AbstractC34132o.m107864I(r15)
                pw1.e$d r0 = pw1.AbstractC29589e.d.f120821a
                r14.f120777y = r8
                r14.f120776x = r2
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L46
                goto Laf
            L46:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                pw1.d r2 = pw1.C29588d.this
                tr2.n r2 = pw1.C29588d.m90708g(r2)
                pw1.d$b$a r4 = new pw1.d$b$a
                pw1.d r3 = pw1.C29588d.this
                r4.<init>(r3, r13)
                r14.f120777y = r8
                r14.f120776x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L66
                goto Laf
            L66:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L8a
                pw1.e$b r1 = new pw1.e$b
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse r0 = (com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse) r0
                java.lang.String r2 = r14.f120773E
                java.lang.String r3 = r14.f120774F
                r1.<init>(r0, r2, r3)
                r14.f120777y = r13
                r14.f120775w = r13
                r14.f120776x = r12
                java.lang.Object r0 = r8.emit(r1, r14)
                if (r0 != r9) goto Lb0
                goto Laf
            L8a:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b.a
                if (r1 == 0) goto L9d
                pw1.e$f r0 = pw1.AbstractC29589e.f.f120823a
                r14.f120777y = r13
                r14.f120775w = r13
                r14.f120776x = r11
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto Lb0
                goto Laf
            L9d:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b.C42432b
                if (r0 == 0) goto Lb3
                pw1.e$e r0 = pw1.AbstractC29589e.e.f120822a
                r14.f120777y = r13
                r14.f120775w = r13
                r14.f120776x = r10
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto Lb0
            Laf:
                return r9
            Lb0:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lb3:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pw1.C29588d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pw1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$fetchFamilyPlanScreen$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {83, 84, 89, 91, 92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f120781w;

        /* JADX INFO: renamed from: x */
        int f120782x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f120783y;

        /* JADX INFO: renamed from: pw1.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$fetchFamilyPlanScreen$1$response$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f120785w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29588d f120786x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29588d c29588d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f120786x = c29588d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f120786x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f120785w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FamilyPlanApi familyPlanApi = this.f120786x.familyPlanApi;
                this.f120785w = 1;
                Object objFetchFamilyPlanScreen = familyPlanApi.fetchFamilyPlanScreen(this);
                return objFetchFamilyPlanScreen == enumC31071a ? enumC31071a : objFetchFamilyPlanScreen;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super FamilyPlanScreenResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C29588d.this.new c(interfaceC30057d);
            cVar.f120783y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:28:0x008a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0099  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r8.emit(r1, r14) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f120783y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r14.f120782x
                r10 = 5
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                if (r0 == 0) goto L36
                if (r0 == r2) goto L32
                if (r0 == r1) goto L2d
                if (r0 == r12) goto L24
                if (r0 == r11) goto L24
                if (r0 != r10) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r14.f120781w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto La8
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L66
            L32:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L46
            L36:
                p505ts.AbstractC34132o.m107864I(r15)
                pw1.e$d r0 = pw1.AbstractC29589e.d.f120821a
                r14.f120783y = r8
                r14.f120782x = r2
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L46
                goto La7
            L46:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                pw1.d r2 = pw1.C29588d.this
                tr2.n r2 = pw1.C29588d.m90708g(r2)
                pw1.d$c$a r4 = new pw1.d$c$a
                pw1.d r3 = pw1.C29588d.this
                r4.<init>(r3, r13)
                r14.f120783y = r8
                r14.f120782x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L66
                goto La7
            L66:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L86
                pw1.e$a r1 = new pw1.e$a
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse r0 = (com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse) r0
                r1.<init>(r0)
                r14.f120783y = r13
                r14.f120781w = r13
                r14.f120782x = r12
                java.lang.Object r0 = r8.emit(r1, r14)
                if (r0 != r9) goto La8
                goto La7
            L86:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b.a
                if (r0 == 0) goto L99
                pw1.e$f r0 = pw1.AbstractC29589e.f.f120823a
                r14.f120783y = r13
                r14.f120781w = r13
                r14.f120782x = r11
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto La8
                goto La7
            L99:
                pw1.e$e r0 = pw1.AbstractC29589e.e.f120822a
                r14.f120783y = r13
                r14.f120781w = r13
                r14.f120782x = r10
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto La8
            La7:
                return r9
            La8:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pw1.C29588d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pw1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$$inlined$flatMapLatest$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f120787w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120788x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120789y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29588d f120790z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C29588d c29588d) {
            super(3, interfaceC30057d);
            this.f120790z = c29588d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC29585a interfaceC29585a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f120790z);
            dVar.f120788x = interfaceC13062m;
            dVar.f120789y = interfaceC29585a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120787w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120788x;
                InterfaceC29585a interfaceC29585a = (InterfaceC29585a) this.f120789y;
                if (interfaceC29585a instanceof InterfaceC29585a.b) {
                    c13084s1 = AbstractC13091v.m36590P(this.f120790z.m90712k(), new j(null));
                } else if (interfaceC29585a instanceof InterfaceC29585a.c) {
                    InterfaceC29585a.c cVar = (InterfaceC29585a.c) interfaceC29585a;
                    c13084s1 = AbstractC13091v.m36590P(this.f120790z.m90711j(cVar.getUserId(), cVar.getFamilyPlanId()), new k(null));
                } else if (interfaceC29585a instanceof InterfaceC29585a.d) {
                    InterfaceC29585a.d dVar = (InterfaceC29585a.d) interfaceC29585a;
                    c13084s1 = AbstractC13091v.m36590P(this.f120790z.m90710i(dVar.getUserId(), dVar.getFamilyPlanId()), new l(null));
                } else {
                    c13084s1 = new C13084s1(new h(interfaceC29585a, null));
                }
                this.f120788x = null;
                this.f120789y = null;
                this.f120787w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC29585a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pw1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$1$1$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120791w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120792x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29589e f120793y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC29589e abstractC29589e, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120793y = abstractC29589e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f120793y, interfaceC30057d);
            eVar.f120792x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120792x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120791w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29589e abstractC29589e = this.f120793y;
                this.f120792x = null;
                this.f120791w = 1;
                if (interfaceC13062m.emit(abstractC29589e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pw1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$1$2$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120794w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120795x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29589e f120796y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC29589e abstractC29589e, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120796y = abstractC29589e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f120796y, interfaceC30057d);
            fVar.f120795x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120795x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120794w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29589e abstractC29589e = this.f120796y;
                this.f120795x = null;
                this.f120794w = 1;
                if (interfaceC13062m.emit(abstractC29589e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pw1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$1$3$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120797w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120798x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29589e f120799y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC29589e abstractC29589e, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120799y = abstractC29589e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f120799y, interfaceC30057d);
            gVar.f120798x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120798x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120797w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29589e abstractC29589e = this.f120799y;
                this.f120798x = null;
                this.f120797w = 1;
                if (interfaceC13062m.emit(abstractC29589e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pw1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$1$4", m100430f = "FamilyPlanInteractor.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpw1/e$c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120800w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120801x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29585a f120802y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC29585a interfaceC29585a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120802y = interfaceC29585a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f120802y, interfaceC30057d);
            hVar.f120801x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120801x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120800w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29589e.c cVar = new AbstractC29589e.c(this.f120802y);
                this.f120801x = null;
                this.f120800w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pw1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$2", m100430f = "FamilyPlanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpw1/b;", "previousResult", "Lpw1/e;", "action", "<anonymous>", "(Lpw1/b;Lpw1/e;)Lpw1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f120803w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f120804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120805y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29586b c29586b, AbstractC29589e abstractC29589e, InterfaceC30057d<? super C29586b> interfaceC30057d) {
            i iVar = C29588d.this.new i(interfaceC30057d);
            iVar.f120804x = c29586b;
            iVar.f120805y = abstractC29589e;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C29586b c29586b = (C29586b) this.f120804x;
            AbstractC29589e abstractC29589e = (AbstractC29589e) this.f120805y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f120803w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC29589e instanceof AbstractC29589e.c) {
                return C29588d.this.m90713l(c29586b, ((AbstractC29589e.c) abstractC29589e).getDomainAction());
            }
            if (abstractC29589e instanceof AbstractC29589e.a) {
                return new C29586b(null, ((AbstractC29589e.a) abstractC29589e).getScreenResponse(), 1, null);
            }
            if (abstractC29589e instanceof AbstractC29589e.b) {
                AbstractC29589e.b bVar = (AbstractC29589e.b) abstractC29589e;
                return C29586b.m90697b(c29586b, new InterfaceC29587c.a(bVar.getDialogResponse(), bVar.getUserId(), bVar.getFamilyPlanId()), null, 2, null);
            }
            if (AbstractC22676k.m65745e(abstractC29589e, AbstractC29589e.d.f120821a)) {
                return C29586b.m90697b(c29586b, InterfaceC29587c.c.f120758a, null, 2, null);
            }
            if (AbstractC22676k.m65745e(abstractC29589e, AbstractC29589e.e.f120822a)) {
                return C29586b.m90697b(c29586b, InterfaceC29587c.d.f120759a, null, 2, null);
            }
            if (AbstractC22676k.m65745e(abstractC29589e, AbstractC29589e.f.f120823a)) {
                return C29586b.m90697b(c29586b, InterfaceC29587c.f.f120760a, null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: pw1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "FamilyPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f120807w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120808x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120809y;

        public j(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29589e abstractC29589e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f120808x = interfaceC13062m;
            jVar.f120809y = abstractC29589e;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120807w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120808x;
                C13084s1 c13084s1 = new C13084s1(new e((AbstractC29589e) this.f120809y, null));
                this.f120808x = null;
                this.f120809y = null;
                this.f120807w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC29589e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pw1.d$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$lambda$0$$inlined$flatMapLatest$2", m100430f = "FamilyPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f120810w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120811x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120812y;

        public k(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29589e abstractC29589e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d);
            kVar.f120811x = interfaceC13062m;
            kVar.f120812y = abstractC29589e;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120811x;
                C13084s1 c13084s1 = new C13084s1(new f((AbstractC29589e) this.f120812y, null));
                this.f120811x = null;
                this.f120812y = null;
                this.f120810w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC29589e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pw1.d$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$lambda$0$$inlined$flatMapLatest$3", m100430f = "FamilyPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f120813w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120814x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120815y;

        public l(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29589e abstractC29589e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f120814x = interfaceC13062m;
            lVar.f120815y = abstractC29589e;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120813w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120814x;
                C13084s1 c13084s1 = new C13084s1(new g((AbstractC29589e) this.f120815y, null));
                this.f120814x = null;
                this.f120815y = null;
                this.f120813w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC29589e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C29588d(FamilyPlanApi familyPlanApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(familyPlanApi, "familyPlanApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.familyPlanApi = familyPlanApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m90710i(String userId, String familyPlanId) {
        return new C13084s1(new a(familyPlanId, userId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m90711j(String userId, String familyPlanId) {
        return new C13084s1(new b(userId, familyPlanId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m90712k() {
        return new C13084s1(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C29586b m90713l(C29586b previousResult, InterfaceC29585a action) {
        return AbstractC22676k.m65745e(action, InterfaceC29585a.a.f120747a) ? C29586b.m90697b(previousResult, null, null, 2, null) : previousResult;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C29586b(InterfaceC29587c.c.f120758a, null, 2, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new i(null));
    }

    public /* synthetic */ C29588d(FamilyPlanApi familyPlanApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(familyPlanApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FamilyPlanInteractor") : interfaceC34116n);
    }
}
