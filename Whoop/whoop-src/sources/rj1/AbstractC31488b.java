package rj1;

import androidx.health.platform.client.proto.C1533u;
import l83.C23454a0;
import p322m7.InterfaceC25170r0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rj1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lrj1/b;", "", "a", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31488b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rj1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jz\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2:\u0010\u0010\u001a6\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lrj1/b$a;", "", "<init>", "()V", "Lm7/r0;", "T", "", "records", "", "deletions", "Ltr2/n;", "logger", "Lkotlin/Function3;", "Lq83/d;", "Lpg3/v0;", "Ll83/a0;", "sendChunksCallback", "", "a", "(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: rj1.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.healthconnect.utils.HealthConnectRecordsUtils$Companion", m100430f = "HealthConnectRecordsUtils.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "splitAndSendRecordsAndDeletions", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42272a<T extends InterfaceC25170r0> extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            Object f129736E;

            /* JADX INFO: renamed from: F */
            Object f129737F;

            /* JADX INFO: renamed from: G */
            int f129738G;

            /* JADX INFO: renamed from: H */
            /* synthetic */ Object f129739H;

            /* JADX INFO: renamed from: J */
            int f129741J;

            /* JADX INFO: renamed from: w */
            Object f129742w;

            /* JADX INFO: renamed from: x */
            Object f129743x;

            /* JADX INFO: renamed from: y */
            Object f129744y;

            /* JADX INFO: renamed from: z */
            Object f129745z;

            public C42272a(InterfaceC30057d<? super C42272a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f129739H = obj;
                this.f129741J |= Integer.MIN_VALUE;
                return Companion.this.m96984a(null, null, null, null, this);
            }
        }

        /* JADX INFO: renamed from: rj1.b$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.healthconnect.utils.HealthConnectRecordsUtils$Companion$splitAndSendRecordsAndDeletions$2", m100430f = "HealthConnectRecordsUtils.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f129746w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function3 f129747x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22669g0 f129748y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22669g0 f129749z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function3 function3, C22669g0 c22669g0, C22669g0 c22669g1, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f129747x = function3;
                this.f129748y = c22669g0;
                this.f129749z = c22669g1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f129747x, this.f129748y, this.f129749z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f129746w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                Function3 function3 = this.f129747x;
                Object obj2 = this.f129748y.f89336w;
                Object obj3 = this.f129749z.f89336w;
                this.f129746w = 1;
                Object objInvoke = function3.invoke(obj2, obj3, this);
                return objInvoke == enumC31071a ? enumC31071a : objInvoke;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009c  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d4 -> B:26:0x00dd). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: a */
        public final <T extends p322m7.InterfaceC25170r0> java.lang.Object m96984a(java.util.List<? extends T> r20, java.util.List<java.lang.String> r21, tr2.InterfaceC34116n r22, p715kotlin.jvm.functions.Function3 r23, q83.InterfaceC30057d<? super java.lang.Boolean> r24) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rj1.AbstractC31488b.Companion.m96984a(java.util.List, java.util.List, tr2.n, kotlin.jvm.functions.Function3, q83.d):java.lang.Object");
        }

        private Companion() {
        }
    }
}
