package ex2;

import com.whoop.whooplabs.data.domain.ProtocolStepResultWithStepType;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag;
import fx2.InterfaceC14849a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Comparator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ex2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001b\u0010\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001c\u0010\u000fJ\u0010\u0010\u001d\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001e\u0010\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b'\u0010&J\u0018\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010)\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b)\u0010\u000fJ\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0*2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b+\u0010\u000fJ\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020#0*2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b,\u0010\u000fJ\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b.\u0010\u000fJ\u0018\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010/H\u0086@¢\u0006\u0004\b3\u0010\u0016J\u0010\u00104\u001a\u00020\bH\u0086@¢\u0006\u0004\b4\u0010\u0016J\u0010\u00105\u001a\u00020\bH\u0086@¢\u0006\u0004\b5\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106¨\u00067"}, m65681d2 = {"Lex2/c;", "", "Lfx2/a;", "labsDao", "<init>", "(Lfx2/a;)V", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "whoopLabsStudy", "Ll83/a0;", "u", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)Ljava/lang/Object;", "x", "", "campaignId", "p", "(ILq83/d;)Ljava/lang/Object;", "i", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "whoopLabsHrDevice", "r", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Lq83/d;)Ljava/lang/Object;", "k", "(Lq83/d;)Ljava/lang/Object;", "hrDevice", "b", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "o", "a", "f", "d", "c", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;", "whoopLabsStudyTag", "v", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "protocolStepResult", "s", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "j", "e", "", "q", "m", "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;", "n", "Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;", "strapInfo", "t", "(Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Lq83/d;)Ljava/lang/Object;", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lfx2/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13732c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14849a labsDao;

    /* JADX INFO: renamed from: ex2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((ProtocolStepWithOptions) t14).getProtocolStep().getOrder()), Integer.valueOf(((ProtocolStepWithOptions) t15).getProtocolStep().getOrder()));
        }
    }

    /* JADX INFO: renamed from: ex2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsRepository", m100430f = "LabsRepository.kt", m100431l = {35}, m100432m = "getRemoteCampaign", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f48987w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48988x;

        /* JADX INFO: renamed from: z */
        int f48990z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48988x = obj;
            this.f48990z |= Integer.MIN_VALUE;
            return C13732c.this.m38995o(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsRepository", m100430f = "LabsRepository.kt", m100431l = {24, 25}, m100432m = "saveHrDevice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f48991w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48992x;

        /* JADX INFO: renamed from: z */
        int f48994z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48992x = obj;
            this.f48994z |= Integer.MIN_VALUE;
            return C13732c.this.m38998r(null, this);
        }
    }

    public C13732c(InterfaceC14849a labsDao) {
        AbstractC22676k.m65750j(labsDao, "labsDao");
        this.labsDao = labsDao;
    }

    /* JADX INFO: renamed from: a */
    public final Object m38981a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42780l = this.labsDao.mo42780l(interfaceC30057d);
        return objMo42780l == EnumC31071a.f128113w ? objMo42780l : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m38982b(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42773e = this.labsDao.mo42773e(whoopLabsHrDevice, interfaceC30057d);
        return objMo42773e == EnumC31071a.f128113w ? objMo42773e : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m38983c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42769a = this.labsDao.mo42769a(interfaceC30057d);
        return objMo42769a == EnumC31071a.f128113w ? objMo42769a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m38984d(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42770b = this.labsDao.mo42770b(interfaceC30057d);
        return objMo42770b == EnumC31071a.f128113w ? objMo42770b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m38985e(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42767E = this.labsDao.mo42767E(i13, interfaceC30057d);
        return objMo42767E == EnumC31071a.f128113w ? objMo42767E : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m38986f(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42779k = this.labsDao.mo42779k(i13, interfaceC30057d);
        return objMo42779k == EnumC31071a.f128113w ? objMo42779k : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m38987g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42790w = this.labsDao.mo42790w(interfaceC30057d);
        return objMo42790w == EnumC31071a.f128113w ? objMo42790w : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m38988h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42785r = this.labsDao.mo42785r(interfaceC30057d);
        return objMo42785r == EnumC31071a.f128113w ? objMo42785r : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m38989i(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42786s = this.labsDao.mo42786s(i13, interfaceC30057d);
        return objMo42786s == EnumC31071a.f128113w ? objMo42786s : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m38990j(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42791x = this.labsDao.mo42791x(i13, interfaceC30057d);
        return objMo42791x == EnumC31071a.f128113w ? objMo42791x : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m38991k(InterfaceC30057d<? super WhoopLabsHrDevice> interfaceC30057d) {
        return this.labsDao.mo42777i(interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public final Object m38992l(InterfaceC30057d<? super LastKnownStrapInfo> interfaceC30057d) {
        return this.labsDao.mo42789v(interfaceC30057d);
    }

    /* JADX INFO: renamed from: m */
    public final Object m38993m(int i13, InterfaceC30057d<? super List<ProtocolStepResult>> interfaceC30057d) {
        return this.labsDao.mo42776h(i13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: n */
    public final Object m38994n(int i13, InterfaceC30057d<? super List<ProtocolStepResultWithStepType>> interfaceC30057d) {
        return this.labsDao.mo42787t(i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m38995o(int i13, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
        b bVar;
        List<ProtocolStepWithOptions> protocolSteps;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f48990z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f48990z = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo42778j = bVar.f48988x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f48990z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objMo42778j);
            InterfaceC14849a interfaceC14849a = this.labsDao;
            bVar.f48987w = i13;
            bVar.f48990z = 1;
            objMo42778j = interfaceC14849a.mo42778j(i13, bVar);
            if (objMo42778j == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo42778j);
        }
        RemoteCampaign remoteCampaign = (RemoteCampaign) objMo42778j;
        List listM74152u1 = (remoteCampaign == null || (protocolSteps = remoteCampaign.getProtocolSteps()) == null) ? C25271y.f99162w : AbstractC25265s.m74152u1(protocolSteps, new a());
        if (remoteCampaign != null) {
            return RemoteCampaign.copy$default(remoteCampaign, null, listM74152u1, null, 5, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Object m38996p(int i13, InterfaceC30057d<? super WhoopLabsStudy> interfaceC30057d) {
        return this.labsDao.mo42764B(i13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: q */
    public final Object m38997q(int i13, InterfaceC30057d<? super List<WhoopLabsStudyTag>> interfaceC30057d) {
        return this.labsDao.mo42788u(i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.mo42763A(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m38998r(com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ex2.C13732c.c
            if (r0 == 0) goto L13
            r0 = r7
            ex2.c$c r0 = (ex2.C13732c.c) r0
            int r1 = r0.f48994z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48994z = r1
            goto L18
        L13:
            ex2.c$c r0 = new ex2.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f48992x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f48994z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f48991w
            com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice r6 = (com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f48991w
            com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice r6 = (com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4e
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            fx2.a r7 = r5.labsDao
            r0.f48991w = r6
            r0.f48994z = r4
            java.lang.Object r7 = r7.mo42766D(r0)
            if (r7 != r1) goto L4e
            goto L5b
        L4e:
            fx2.a r7 = r5.labsDao
            r2 = 0
            r0.f48991w = r2
            r0.f48994z = r3
            java.lang.Object r6 = r7.mo42763A(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ex2.C13732c.m38998r(com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: s */
    public final Object m38999s(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42765C = this.labsDao.mo42765C(protocolStepResult, interfaceC30057d);
        return objMo42765C == EnumC31071a.f128113w ? objMo42765C : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public final Object m39000t(LastKnownStrapInfo lastKnownStrapInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42772d = this.labsDao.mo42772d(lastKnownStrapInfo, interfaceC30057d);
        return objMo42772d == EnumC31071a.f128113w ? objMo42772d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public final Object m39001u(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42783p = this.labsDao.mo42783p(whoopLabsStudy, interfaceC30057d);
        return objMo42783p == EnumC31071a.f128113w ? objMo42783p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public final Object m39002v(WhoopLabsStudyTag whoopLabsStudyTag, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42793z = this.labsDao.mo42793z(whoopLabsStudyTag, interfaceC30057d);
        return objMo42793z == EnumC31071a.f128113w ? objMo42793z : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public final Object m39003w(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42784q = this.labsDao.mo42784q(protocolStepResult, interfaceC30057d);
        return objMo42784q == EnumC31071a.f128113w ? objMo42784q : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public final Object m39004x(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo42792y = this.labsDao.mo42792y(whoopLabsStudy, interfaceC30057d);
        return objMo42792y == EnumC31071a.f128113w ? objMo42792y : C23454a0.f92919a;
    }
}
