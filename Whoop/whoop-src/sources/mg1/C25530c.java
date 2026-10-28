package mg1;

import ad3.AbstractC0757c;
import ad3.C0755b;
import com.mapbox.maps.MapboxMap;
import com.whoop.firmwareUpdateService.data.helper.FirmwarePointer;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.ArrayListSerializer;
import l83.C23454a0;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: mg1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0014\u0010\u0013J(\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001d\u0010\u0013J \u0010 \u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b&\u0010\u0013J \u0010(\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010'\u001a\u00020\"H\u0086@¢\u0006\u0004\b(\u0010%J\u0018\u0010)\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b)\u0010\u0013J\u0018\u0010*\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010\u0013J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b+\u0010\u0013J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b,\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/¨\u00060"}, m65681d2 = {"Lmg1/c;", "", "Lu92/d;", "sharedPrefs", "Lmc3/a;", "mutex", "Ltr2/n;", "logger", "<init>", "(Lu92/d;Lmc3/a;Ltr2/n;)V", "", "key", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "obj", "Ll83/a0;", "k", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "serial", "firmwareVersion", "", MapboxMap.QFE_OFFSET, "j", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "g", "", "isForcedUpdate", "l", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "", "rePromptCadence", "m", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "f", "time", "n", "e", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lu92/d;", "Lmc3/a;", "Ltr2/n;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25530c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPrefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: mg1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "clearFirmwareMetaData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99954F;

        /* JADX INFO: renamed from: w */
        Object f99955w;

        /* JADX INFO: renamed from: x */
        Object f99956x;

        /* JADX INFO: renamed from: y */
        int f99957y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f99958z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99958z = obj;
            this.f99954F |= Integer.MIN_VALUE;
            return C25530c.this.m75092a(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "getFilePointer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f99959E;

        /* JADX INFO: renamed from: G */
        int f99961G;

        /* JADX INFO: renamed from: w */
        Object f99962w;

        /* JADX INFO: renamed from: x */
        Object f99963x;

        /* JADX INFO: renamed from: y */
        Object f99964y;

        /* JADX INFO: renamed from: z */
        int f99965z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99959E = obj;
            this.f99961G |= Integer.MIN_VALUE;
            return C25530c.this.m75093b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "getFirmwareMetaData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99967F;

        /* JADX INFO: renamed from: w */
        Object f99968w;

        /* JADX INFO: renamed from: x */
        Object f99969x;

        /* JADX INFO: renamed from: y */
        int f99970y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f99971z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99971z = obj;
            this.f99967F |= Integer.MIN_VALUE;
            return C25530c.this.m75094c(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "getIsForcedUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99973F;

        /* JADX INFO: renamed from: w */
        Object f99974w;

        /* JADX INFO: renamed from: x */
        Object f99975x;

        /* JADX INFO: renamed from: y */
        int f99976y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f99977z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99977z = obj;
            this.f99973F |= Integer.MIN_VALUE;
            return C25530c.this.m75095d(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "getLastDialogShownTime", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99979F;

        /* JADX INFO: renamed from: w */
        Object f99980w;

        /* JADX INFO: renamed from: x */
        Object f99981x;

        /* JADX INFO: renamed from: y */
        int f99982y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f99983z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99983z = obj;
            this.f99979F |= Integer.MIN_VALUE;
            return C25530c.this.m75096e(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "getRePromptCadence", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f99984E;

        /* JADX INFO: renamed from: G */
        int f99986G;

        /* JADX INFO: renamed from: w */
        Object f99987w;

        /* JADX INFO: renamed from: x */
        Object f99988x;

        /* JADX INFO: renamed from: y */
        long f99989y;

        /* JADX INFO: renamed from: z */
        int f99990z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99984E = obj;
            this.f99986G |= Integer.MIN_VALUE;
            return C25530c.this.m75097f(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "removeFilePointer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99992F;

        /* JADX INFO: renamed from: w */
        Object f99993w;

        /* JADX INFO: renamed from: x */
        Object f99994x;

        /* JADX INFO: renamed from: y */
        int f99995y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f99996z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99996z = obj;
            this.f99992F |= Integer.MIN_VALUE;
            return C25530c.this.m75098g(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "removeForcedUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f99998F;

        /* JADX INFO: renamed from: w */
        Object f99999w;

        /* JADX INFO: renamed from: x */
        Object f100000x;

        /* JADX INFO: renamed from: y */
        int f100001y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f100002z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100002z = obj;
            this.f99998F |= Integer.MIN_VALUE;
            return C25530c.this.m75099h(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "removeRePromptCadence", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f100004F;

        /* JADX INFO: renamed from: w */
        Object f100005w;

        /* JADX INFO: renamed from: x */
        Object f100006x;

        /* JADX INFO: renamed from: y */
        int f100007y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f100008z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100008z = obj;
            this.f100004F |= Integer.MIN_VALUE;
            return C25530c.this.m75100i(null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "saveFilePointer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f100009E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f100010F;

        /* JADX INFO: renamed from: H */
        int f100012H;

        /* JADX INFO: renamed from: w */
        Object f100013w;

        /* JADX INFO: renamed from: x */
        Object f100014x;

        /* JADX INFO: renamed from: y */
        Object f100015y;

        /* JADX INFO: renamed from: z */
        int f100016z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100010F = obj;
            this.f100012H |= Integer.MIN_VALUE;
            return C25530c.this.m75101j(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "saveFirmwareMetaData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100017E;

        /* JADX INFO: renamed from: G */
        int f100019G;

        /* JADX INFO: renamed from: w */
        Object f100020w;

        /* JADX INFO: renamed from: x */
        Object f100021x;

        /* JADX INFO: renamed from: y */
        Object f100022y;

        /* JADX INFO: renamed from: z */
        int f100023z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100017E = obj;
            this.f100019G |= Integer.MIN_VALUE;
            return C25530c.this.m75102k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "saveIsForcedUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100024E;

        /* JADX INFO: renamed from: G */
        int f100026G;

        /* JADX INFO: renamed from: w */
        Object f100027w;

        /* JADX INFO: renamed from: x */
        Object f100028x;

        /* JADX INFO: renamed from: y */
        boolean f100029y;

        /* JADX INFO: renamed from: z */
        int f100030z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100024E = obj;
            this.f100026G |= Integer.MIN_VALUE;
            return C25530c.this.m75103l(null, false, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "saveRePromptCadence", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100031E;

        /* JADX INFO: renamed from: G */
        int f100033G;

        /* JADX INFO: renamed from: w */
        Object f100034w;

        /* JADX INFO: renamed from: x */
        Object f100035x;

        /* JADX INFO: renamed from: y */
        long f100036y;

        /* JADX INFO: renamed from: z */
        int f100037z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100031E = obj;
            this.f100033G |= Integer.MIN_VALUE;
            return C25530c.this.m75104m(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: mg1.c$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwarePrefs", m100430f = "FirmwarePrefs.kt", m100431l = {198}, m100432m = "setLastDialogShownTime", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100038E;

        /* JADX INFO: renamed from: G */
        int f100040G;

        /* JADX INFO: renamed from: w */
        Object f100041w;

        /* JADX INFO: renamed from: x */
        Object f100042x;

        /* JADX INFO: renamed from: y */
        long f100043y;

        /* JADX INFO: renamed from: z */
        int f100044z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100038E = obj;
            this.f100040G |= Integer.MIN_VALUE;
            return C25530c.this.m75105n(null, 0L, this);
        }
    }

    public C25530c(C34660d sharedPrefs, InterfaceC25435a mutex, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sharedPrefs, "sharedPrefs");
        AbstractC22676k.m65750j(mutex, "mutex");
        AbstractC22676k.m65750j(logger, "logger");
        this.sharedPrefs = sharedPrefs;
        this.mutex = mutex;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m75092a(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f99954F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f99954F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f99958z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f99954F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            aVar.f99955w = str;
            aVar.f99956x = interfaceC25435a;
            aVar.f99957y = 0;
            aVar.f99954F = 1;
            if (interfaceC25435a.mo68211b(aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) aVar.f99956x;
            String str2 = (String) aVar.f99955w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109537p(str);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    public final Object m75093b(String str, String str2, InterfaceC30057d<? super Integer> interfaceC30057d) {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        int offset;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f99961G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f99961G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f99959E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f99961G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            bVar.f99962w = str;
            bVar.f99963x = str2;
            bVar.f99964y = interfaceC25435a;
            bVar.f99965z = 0;
            bVar.f99961G = 1;
            if (interfaceC25435a.mo68211b(bVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) bVar.f99964y;
            str2 = (String) bVar.f99963x;
            String str3 = (String) bVar.f99962w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str3;
        }
        try {
            String strM109533j = this.sharedPrefs.m109533j("Whoop" + str);
            if (strM109533j == null) {
                strM109533j = "";
            }
            C0755b c0755b = AbstractC0757c.f2762d;
            c0755b.getClass();
            FirmwarePointer firmwarePointer = (FirmwarePointer) c0755b.m1831b(FirmwarePointer.INSTANCE.serializer(), strM109533j);
            if (AbstractC22676k.m65745e(firmwarePointer.getVersion(), str2)) {
                offset = firmwarePointer.getOffset();
            } else {
                this.logger.mo85222m("No firmware pointer found for " + str, new AbstractC30556a.a[0]);
                offset = 0;
            }
            return new Integer(offset);
        } catch (SerializationException e5) {
            this.logger.mo85230v("Failed to deserialize file pointer for " + str, e5, new AbstractC30556a.a[0]);
            return new Integer(0);
        } catch (IllegalArgumentException e13) {
            this.logger.mo85230v("Caught IllegalArgumentException. Failed to deserialize file pointer for " + str, e13, new AbstractC30556a.a[0]);
            return new Integer(0);
        } catch (NullPointerException e14) {
            this.logger.mo85230v("Caught a NPE and failed to deserialize file pointer", e14, new AbstractC30556a.a[0]);
            return new Integer(0);
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: c */
    public final Object m75094c(String str, InterfaceC30057d<? super List<ChipFirmwareVersion>> interfaceC30057d) {
        c cVar;
        InterfaceC25435a interfaceC25435a;
        String str2 = "";
        C25271y c25271y = C25271y.f99162w;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f99967F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f99967F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f99971z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f99967F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            cVar.f99968w = str;
            cVar.f99969x = interfaceC25435a;
            cVar.f99970y = 0;
            cVar.f99967F = 1;
            if (interfaceC25435a.mo68211b(cVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) cVar.f99969x;
            String str3 = (String) cVar.f99968w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str3;
        }
        try {
            String strM109534k = this.sharedPrefs.m109534k(str, "");
            if (strM109534k != null) {
                str2 = strM109534k;
            }
            C0755b c0755b = AbstractC0757c.f2762d;
            c0755b.getClass();
            return c0755b.m1831b(new ArrayListSerializer(ChipFirmwareVersion.INSTANCE.serializer()), str2);
        } catch (IllegalArgumentException e5) {
            this.logger.mo85230v("Caught IllegalArgumentException " + str, e5, new AbstractC30556a.a[0]);
            return c25271y;
        } catch (NullPointerException e13) {
            this.logger.mo85230v("Caught a NPE " + str, e13, new AbstractC30556a.a[0]);
            return c25271y;
        } catch (SerializationException unused) {
            this.logger.mo85222m("No firmware found for " + str, new AbstractC30556a.a[0]);
            return c25271y;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public final Object m75095d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f99973F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f99973F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f99977z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f99973F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            dVar.f99974w = str;
            dVar.f99975x = interfaceC25435a;
            dVar.f99976y = 0;
            dVar.f99973F = 1;
            if (interfaceC25435a.mo68211b(dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) dVar.f99975x;
            String str2 = (String) dVar.f99974w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            return Boolean.valueOf(this.sharedPrefs.m109528e("Whoop" + str + "_is_forced_update", false));
        } catch (IllegalArgumentException e5) {
            this.logger.mo85230v("Caught IllegalArgumentException", e5, new AbstractC30556a.a[0]);
            return Boolean.FALSE;
        } catch (NullPointerException e13) {
            this.logger.mo85230v("Caught a NPE", e13, new AbstractC30556a.a[0]);
            return Boolean.FALSE;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public final Object m75096e(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        e eVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f99979F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f99979F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f99983z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f99979F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            eVar.f99980w = str;
            eVar.f99981x = interfaceC25435a;
            eVar.f99982y = 0;
            eVar.f99979F = 1;
            if (interfaceC25435a.mo68211b(eVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) eVar.f99981x;
            String str2 = (String) eVar.f99980w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            return new Long(this.sharedPrefs.m109532i("Whoop" + str + "_last_dialog_shown_time", 0L));
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public final Object m75097f(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        f fVar;
        InterfaceC25435a interfaceC25435a;
        long j7;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f99986G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f99986G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f99984E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f99986G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long jM134273getInWholeMillisecondsimpl = Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(24, DurationUnit.HOURS));
            interfaceC25435a = this.mutex;
            fVar.f99987w = str;
            fVar.f99988x = interfaceC25435a;
            fVar.f99989y = jM134273getInWholeMillisecondsimpl;
            fVar.f99990z = 0;
            fVar.f99986G = 1;
            if (interfaceC25435a.mo68211b(fVar) == enumC31071a) {
                return enumC31071a;
            }
            j7 = jM134273getInWholeMillisecondsimpl;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = fVar.f99989y;
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) fVar.f99988x;
            String str2 = (String) fVar.f99987w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            return new Long(this.sharedPrefs.m109532i("Whoop" + str + "_rePrompt_cadence", j7));
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: g */
    public final Object m75098g(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f99992F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f99992F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f99996z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f99992F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            gVar.f99993w = str;
            gVar.f99994x = interfaceC25435a;
            gVar.f99995y = 0;
            gVar.f99992F = 1;
            if (interfaceC25435a.mo68211b(gVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) gVar.f99994x;
            String str2 = (String) gVar.f99993w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109537p("Whoop" + str);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: h */
    public final Object m75099h(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f99998F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f99998F = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f100002z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f99998F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            hVar.f99999w = str;
            hVar.f100000x = interfaceC25435a;
            hVar.f100001y = 0;
            hVar.f99998F = 1;
            if (interfaceC25435a.mo68211b(hVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) hVar.f100000x;
            String str2 = (String) hVar.f99999w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109537p("Whoop" + str + "_is_forced_update");
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    public final Object m75100i(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f100004F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f100004F = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f100008z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f100004F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            iVar.f100005w = str;
            iVar.f100006x = interfaceC25435a;
            iVar.f100007y = 0;
            iVar.f100004F = 1;
            if (interfaceC25435a.mo68211b(iVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) iVar.f100006x;
            String str2 = (String) iVar.f100005w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109537p("Whoop" + str + "_rePrompt_cadence");
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: j */
    public final Object m75101j(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i14 = jVar.f100012H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f100012H = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f100010F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = jVar.f100012H;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            jVar.f100013w = str;
            jVar.f100014x = str2;
            jVar.f100015y = interfaceC25435a;
            jVar.f100016z = i13;
            jVar.f100009E = 0;
            jVar.f100012H = 1;
            if (interfaceC25435a.mo68211b(jVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = jVar.f100016z;
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) jVar.f100015y;
            str2 = (String) jVar.f100014x;
            String str3 = (String) jVar.f100013w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str3;
        }
        try {
            try {
                FirmwarePointer firmwarePointer = new FirmwarePointer(str2, i13);
                C0755b c0755b = AbstractC0757c.f2762d;
                c0755b.getClass();
                this.sharedPrefs.m109543v("Whoop" + str, c0755b.m1833d(FirmwarePointer.INSTANCE.serializer(), firmwarePointer));
            } catch (SerializationException e5) {
                this.logger.mo85230v("Could not save firmware file pointer for " + str, e5, new AbstractC30556a.a[0]);
            } catch (IllegalArgumentException e13) {
                this.logger.mo85230v("Caught IllegalArgumentException. Could not save firmware file pointer for " + str, e13, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: k */
    public final Object m75102k(String str, List<ChipFirmwareVersion> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        k kVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f100019G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f100019G = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f100017E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar.f100019G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            kVar.f100020w = str;
            kVar.f100021x = list;
            kVar.f100022y = interfaceC25435a;
            kVar.f100023z = 0;
            kVar.f100019G = 1;
            if (interfaceC25435a.mo68211b(kVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) kVar.f100022y;
            list = (List) kVar.f100021x;
            String str2 = (String) kVar.f100020w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            try {
                C0755b c0755b = AbstractC0757c.f2762d;
                c0755b.getClass();
                this.sharedPrefs.m109543v(str, c0755b.m1833d(new ArrayListSerializer(ChipFirmwareVersion.INSTANCE.serializer()), list));
                this.logger.mo85216g("Firmware metadata saved for " + str, new AbstractC30556a.a[0]);
            } catch (SerializationException e5) {
                this.logger.mo85230v("Failed to serialize List of ChipFirmwareVersion. Could not save firmware meta data for " + str, e5, new AbstractC30556a.a[0]);
            } catch (IllegalArgumentException e13) {
                this.logger.mo85230v("Caught IllegalArgumentException. Could not save firmware meta data for " + str, e13, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: l */
    public final Object m75103l(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        l lVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f100026G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f100026G = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f100024E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f100026G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            lVar.f100027w = str;
            lVar.f100028x = interfaceC25435a;
            lVar.f100029y = z4;
            lVar.f100030z = 0;
            lVar.f100026G = 1;
            if (interfaceC25435a.mo68211b(lVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = lVar.f100029y;
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) lVar.f100028x;
            String str2 = (String) lVar.f100027w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            try {
                try {
                    this.sharedPrefs.m109538q("Whoop" + str + "_is_forced_update", z4);
                    this.logger.mo85216g("Firmware forced update saved", new AbstractC30556a.a[0]);
                } catch (SerializationException e5) {
                    this.logger.mo85230v("Could not save firmware forced update", e5, new AbstractC30556a.a[0]);
                }
            } catch (IllegalArgumentException e13) {
                this.logger.mo85230v("Caught IllegalArgumentException. Could not save firmware forced update ", e13, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: m */
    public final Object m75104m(String str, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m mVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f100033G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f100033G = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object obj = mVar.f100031E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f100033G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            mVar.f100034w = str;
            mVar.f100035x = interfaceC25435a;
            mVar.f100036y = j7;
            mVar.f100037z = 0;
            mVar.f100033G = 1;
            if (interfaceC25435a.mo68211b(mVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = mVar.f100036y;
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) mVar.f100035x;
            String str2 = (String) mVar.f100034w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109542u("Whoop" + str + "_rePrompt_cadence", j7);
            this.logger.mo85216g("Firmware reprompt cadence saved", new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: n */
    public final Object m75105n(String str, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        n nVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f100040G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f100040G = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        Object obj = nVar.f100038E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = nVar.f100040G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            nVar.f100041w = str;
            nVar.f100042x = interfaceC25435a;
            nVar.f100043y = j7;
            nVar.f100044z = 0;
            nVar.f100040G = 1;
            if (interfaceC25435a.mo68211b(nVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = nVar.f100043y;
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) nVar.f100042x;
            String str2 = (String) nVar.f100041w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.sharedPrefs.m109542u("Whoop" + str + "_last_dialog_shown_time", j7);
            this.logger.mo85216g("Last dialog shown time saved", new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    public /* synthetic */ C25530c(C34660d c34660d, InterfaceC25435a interfaceC25435a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34660d, (i13 & 2) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FirmwarePrefs") : interfaceC34116n);
    }
}
