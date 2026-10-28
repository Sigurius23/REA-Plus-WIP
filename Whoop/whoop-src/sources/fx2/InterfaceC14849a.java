package fx2;

import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.ProtocolStep;
import com.whoop.whooplabs.data.domain.ProtocolStepConfig;
import com.whoop.whooplabs.data.domain.ProtocolStepResultWithStepType;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: fx2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0013\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0015\u0010\u0012J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\u001c\u0010\u000bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001f\u0010\u000bJ\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H§@¢\u0006\u0004\b$\u0010\u000eJ\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b%\u0010\u000bJ\u0010\u0010&\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010\u000eJ\u0010\u0010'\u001a\u00020\u0004H§@¢\u0006\u0004\b'\u0010\u000eJ\u0018\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H§@¢\u0006\u0004\b0\u0010/J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b1\u0010\u000bJ\u0018\u00102\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b2\u0010\u000bJ\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b3\u0010\u000bJ\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020,0\u001d2\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b4\u0010\u000bJ\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001d2\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b6\u0010\u000bJ\u0018\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u000107H§@¢\u0006\u0004\b;\u0010\u000eJ\u0018\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H§@¢\u0006\u0004\b>\u0010?J\u0018\u0010A\u001a\u00020\u00042\u0006\u0010=\u001a\u00020@H§@¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0004H§@¢\u0006\u0004\bC\u0010\u000eJ\u0010\u0010D\u001a\u00020\u0004H§@¢\u0006\u0004\bD\u0010\u000e¨\u0006EÀ\u0006\u0003"}, m65681d2 = {"Lfx2/a;", "", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "whoopLabsStudy", "Ll83/a0;", "p", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)Ljava/lang/Object;", "y", "", "campaignId", "B", "(ILq83/d;)Ljava/lang/Object;", "s", "D", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "whoopLabsHrDevice", "A", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Lq83/d;)Ljava/lang/Object;", "i", "hrDevice", "e", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "labsCampaign", "g", "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;", "o", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "j", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "c", "Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "protocolStep", "G", "(Lcom/whoop/whooplabs/data/domain/ProtocolStep;Lq83/d;)Ljava/lang/Object;", "l", "k", "b", "a", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;", "studyTag", "z", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "protocolStepResult", "C", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Lq83/d;)Ljava/lang/Object;", "q", "x", "E", "u", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;", "t", "Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;", "strapInfo", "d", "(Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Lq83/d;)Ljava/lang/Object;", "v", "Lcom/whoop/whooplabs/data/domain/OptionSelection;", "optionSelection", "n", "(Lcom/whoop/whooplabs/data/domain/OptionSelection;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "f", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Lq83/d;)Ljava/lang/Object;", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14849a {

    /* JADX INFO: renamed from: fx2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public static Object m42794a(InterfaceC14849a interfaceC14849a, int i13, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
            return InterfaceC14849a.super.mo42778j(i13, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: fx2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.room.dao.LabsDao", m100430f = "LabsDao.kt", m100431l = {91, 92}, m100432m = "getRemoteCampaign$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f55415E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f55416F;

        /* JADX INFO: renamed from: H */
        int f55418H;

        /* JADX INFO: renamed from: w */
        Object f55419w;

        /* JADX INFO: renamed from: x */
        Object f55420x;

        /* JADX INFO: renamed from: y */
        Object f55421y;

        /* JADX INFO: renamed from: z */
        int f55422z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55416F = obj;
            this.f55418H |= Integer.MIN_VALUE;
            return InterfaceC14849a.m42761F(InterfaceC14849a.this, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    static Object m42761F(InterfaceC14849a interfaceC14849a, int i13, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
        b bVar;
        LabsCampaign labsCampaign;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f55418H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f55418H = i14 - Integer.MIN_VALUE;
            } else {
                bVar = interfaceC14849a.new b(interfaceC30057d);
            }
        } else {
            bVar = interfaceC14849a.new b(interfaceC30057d);
        }
        Object objMo42782o = bVar.f55416F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f55418H;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objMo42782o);
            bVar.f55419w = interfaceC14849a;
            bVar.f55422z = i13;
            bVar.f55418H = 1;
            objMo42782o = interfaceC14849a.mo42782o(i13, bVar);
            if (objMo42782o != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i15 == 1) {
            i13 = bVar.f55422z;
            interfaceC14849a = (InterfaceC14849a) bVar.f55419w;
            AbstractC34132o.m107864I(objMo42782o);
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            labsCampaign = (LabsCampaign) bVar.f55421y;
            AbstractC34132o.m107864I(objMo42782o);
        }
        return new RemoteCampaign(labsCampaign, (List) objMo42782o, C25271y.f99162w);
        LabsCampaign labsCampaign2 = (LabsCampaign) objMo42782o;
        if (labsCampaign2 == null) {
            return null;
        }
        bVar.f55419w = null;
        bVar.f55420x = null;
        bVar.f55421y = labsCampaign2;
        bVar.f55422z = i13;
        bVar.f55415E = 0;
        bVar.f55418H = 2;
        Object objMo42771c = interfaceC14849a.mo42771c(i13, bVar);
        if (objMo42771c != enumC31071a) {
            objMo42782o = objMo42771c;
            labsCampaign = labsCampaign2;
            return new RemoteCampaign(labsCampaign, (List) objMo42782o, C25271y.f99162w);
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: A */
    Object mo42763A(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: B */
    Object mo42764B(int i13, InterfaceC30057d<? super WhoopLabsStudy> interfaceC30057d);

    /* JADX INFO: renamed from: C */
    Object mo42765C(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: D */
    Object mo42766D(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: E */
    Object mo42767E(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: G */
    Object mo42768G(ProtocolStep protocolStep, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: a */
    Object mo42769a(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo42770b(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo42771c(int i13, InterfaceC30057d<? super List<ProtocolStepWithOptions>> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo42772d(LastKnownStrapInfo lastKnownStrapInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo42773e(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo42774f(ProtocolStepConfig protocolStepConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    Object mo42775g(LabsCampaign labsCampaign, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    Object mo42776h(int i13, InterfaceC30057d<? super List<ProtocolStepResult>> interfaceC30057d);

    /* JADX INFO: renamed from: i */
    Object mo42777i(InterfaceC30057d<? super WhoopLabsHrDevice> interfaceC30057d);

    /* JADX INFO: renamed from: j */
    default Object mo42778j(int i13, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
        return m42761F(this, i13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    Object mo42779k(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: l */
    Object mo42780l(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: n */
    Object mo42781n(OptionSelection optionSelection, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: o */
    Object mo42782o(int i13, InterfaceC30057d<? super LabsCampaign> interfaceC30057d);

    /* JADX INFO: renamed from: p */
    Object mo42783p(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: q */
    Object mo42784q(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: r */
    Object mo42785r(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: s */
    Object mo42786s(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: t */
    Object mo42787t(int i13, InterfaceC30057d<? super List<ProtocolStepResultWithStepType>> interfaceC30057d);

    /* JADX INFO: renamed from: u */
    Object mo42788u(int i13, InterfaceC30057d<? super List<WhoopLabsStudyTag>> interfaceC30057d);

    /* JADX INFO: renamed from: v */
    Object mo42789v(InterfaceC30057d<? super LastKnownStrapInfo> interfaceC30057d);

    /* JADX INFO: renamed from: w */
    Object mo42790w(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: x */
    Object mo42791x(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: y */
    Object mo42792y(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: z */
    Object mo42793z(WhoopLabsStudyTag whoopLabsStudyTag, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
