package live.hms.video.polls.network;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.managers.IManager;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.utils.HMSCoroutineScope;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/polls/network/HmsPollsStartManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;", "Llive/hms/video/sdk/SDKStore;", "store", "Lkotlin/Function2;", "", "Lq83/d;", "Llive/hms/video/polls/network/QuestionContainer;", "", "getAllPollQuestions", "<init>", "(Llive/hms/video/sdk/SDKStore;Lc93/m;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;)Ljava/util/List;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Lc93/m;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsPollsStartManager implements IManager<HMSNotifications.OnPollStart> {
    private final String TAG;
    private final InterfaceC4351m getAllPollQuestions;
    private final SDKStore store;

    /* JADX INFO: renamed from: live.hms.video.polls.network.HmsPollsStartManager$manage$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.polls.network.HmsPollsStartManager$manage$1", m100430f = "HmsPollsStartManager.kt", m100431l = {37, 55}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241881 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSNotifications.OnPollStart $params;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ HmsPollsStartManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241881(HMSNotifications.OnPollStart onPollStart, HmsPollsStartManager hmsPollsStartManager, InterfaceC30057d<? super C241881> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$params = onPollStart;
            this.this$0 = hmsPollsStartManager;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241881(this.$params, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241881) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005d  */
        /* JADX WARN: Code duplicated, block: B:16:0x007c  */
        /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:21:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:31:0x0109  */
        /* JADX WARN: Code duplicated, block: B:33:0x0125  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00dd -> B:26:0x00de). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0109 -> B:32:0x0123). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.polls.network.HmsPollsStartManager.C241881.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HmsPollsStartManager(SDKStore store, InterfaceC4351m getAllPollQuestions) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(getAllPollQuestions, "getAllPollQuestions");
        this.store = store;
        this.getAllPollQuestions = getAllPollQuestions;
        this.TAG = "HmsPollsManager";
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    public final String getTAG() {
        return this.TAG;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.OnPollStart params) {
        AbstractC22676k.m65750j(params, "params");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241881(params, this, null), 3);
        return C25271y.f99162w;
    }
}
