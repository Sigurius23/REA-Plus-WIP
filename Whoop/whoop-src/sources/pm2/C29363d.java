package pm2;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bh3.InterfaceC3255b;
import c52.AbstractC4251b;
import c52.C4253d;
import c93.InterfaceC4351m;
import ci2.AbstractC4732a;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.WhoopStrapInfo;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import gt0.InterfaceC16186h;
import hj0.AbstractC17356o;
import ih0.AbstractC18489d0;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23465k;
import oh2.InterfaceC27939b;
import or2.C28150c;
import or2.C28180m;
import or2.C28196r0;
import or2.C28199s0;
import p031b9.AbstractC2875y;
import p389p0.C28557w0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import ws0.C37605a;
import xg3.C38280g;
import y42.C39228j;
import y42.InterfaceC39219a;
import z82.C40191e;
import zg3.C40634a;

/* JADX INFO: renamed from: pm2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010\u0018J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010!J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010!J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010!J\r\u0010+\u001a\u00020\u0016¢\u0006\u0004\b+\u0010\u0018J\r\u0010,\u001a\u00020\u0016¢\u0006\u0004\b,\u0010\u0018J\r\u0010-\u001a\u00020\u0016¢\u0006\u0004\b-\u0010\u0018J\u000f\u0010.\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0018J\u000f\u0010/\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\u0016H\u0002¢\u0006\u0004\b0\u0010\u0018J\u0017\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00162\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b7\u00104J\u000f\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b8\u0010\u0018J\u000f\u00109\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010\u0018J\u000f\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bG\u0010LR\u001a\u0010S\u001a\u00020N8\u0016X\u0096D¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00100T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100T8\u0006¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00100T8\u0006¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\bU\u0010XR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00100T8\u0006¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\bH\u0010XR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020`0T8\u0006¢\u0006\f\n\u0004\ba\u0010V\u001a\u0004\bb\u0010XR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020N0T8\u0006¢\u0006\f\n\u0004\bd\u0010V\u001a\u0004\be\u0010XR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020h0g8\u0006¢\u0006\f\n\u0004\bb\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010n\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bj\u0010K\u001a\u0004\bm\u0010LR\u0017\u0010o\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010p\u001a\u00020I8\u0006¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bE\u0010LR\u0017\u0010q\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bO\u0010LR\u0017\u0010r\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bH\u0010K\u001a\u0004\bZ\u0010LR\u0016\u0010u\u001a\u0004\u0018\u00010s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010tR\u0016\u0010v\u001a\u0004\u0018\u00010s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010t¨\u0006w"}, m65681d2 = {"Lpm2/d;", "Lhj0/o;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Ltd1/b;", "strap", "Lor2/c;", "appDiagnostics", "Lgt0/e;", "firmwareUpdateApi", "Lci2/b;", "whoopStrapProvider", "Lz82/e;", "eventDispatcher", "Ly42/j;", "puffinManager", "", "isProdFlavor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagRepository;Ltd1/b;Lor2/c;Lgt0/e;Lci2/b;Lz82/e;Ly42/j;ZLbc3/c0;)V", "Ll83/a0;", "o0", "()V", "n0", "g0", "i0", "p0", "l0", "j0", "powerCycle", "k0", "(Z)V", "f0", "shouldReboot", "m0", "shouldErase", "e0", "shouldUnpair", "q0", "shouldUpdate", "h0", "d0", "c0", "b0", "s0", "v0", "w0", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "fwDevice", "t0", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V", "H", "()Z", "I", "y0", "x0", "r0", "E", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "F", "Ltd1/b;", "G", "Lor2/c;", "Lgt0/e;", "Lci2/b;", "J", "Lz82/e;", "K", "Ly42/j;", "L", "Z", "Lor2/r0;", "M", "Lor2/r0;", "()Lor2/r0;", "actionShowPowerCycleConfirmation", "", "N", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "O", "Landroidx/lifecycle/p0;", "Y", "()Landroidx/lifecycle/p0;", "strapConnected", "P", "R", "commandCapableStrapConnected", "Q", "advancedEmailDiagnosticButtonEnabled", "toggleRawDataButtonsEnabled", "Lcom/whoop/domain/model/WhoopStrapInfo;", "S", "U", "deviceInfo", "T", "X", "puffinFirmwareVersion", "Lor2/s0;", "Lpm2/g;", "Lor2/s0;", "V", "()Lor2/s0;", "firmwareLiveData", "W", "goToPairStrapBle", "actionShowRebootStrapConfirmation", "actionEraseStrapDataConfirmation", "actionUnpairStrapConfirmation", "clearStrapInfoUi", "Ljk0/d;", "()Ljk0/d;", "currentStrap", "commandCapableStrap", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29363d extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC33704b strap;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final boolean isProdFlavor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C28196r0 actionShowPowerCycleConfirmation;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final AbstractC1615p0 strapConnected;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final AbstractC1615p0 commandCapableStrapConnected;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final AbstractC1615p0 advancedEmailDiagnosticButtonEnabled;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final AbstractC1615p0 toggleRawDataButtonsEnabled;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final AbstractC1615p0 deviceInfo;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final AbstractC1615p0 puffinFirmwareVersion;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final C28199s0<EnumC29366g> firmwareLiveData;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final C28196r0 goToPairStrapBle;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final C28196r0 actionShowRebootStrapConfirmation;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C28196r0 actionEraseStrapDataConfirmation;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final C28196r0 actionUnpairStrapConfirmation;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final C28196r0 clearStrapInfoUi;

    /* JADX INFO: renamed from: pm2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119062a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f119062a = iArr;
        }
    }

    /* JADX INFO: renamed from: pm2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$checkForUpdate$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lgt0/h;", "result", "Ll83/a0;", "<anonymous>", "(Lgt0/h;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119063w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119064x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C29363d.this.new b(interfaceC30057d);
            bVar.f119064x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC16186h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.f119064x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119063w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(interfaceC16186h, InterfaceC16186h.f.f61487b)) {
                C29363d.this.m89502V().m85347e(EnumC29366g.FIRMWARE_SHOW_UPDATE_DIALOG);
            } else if (AbstractC22676k.m65745e(interfaceC16186h, InterfaceC16186h.h.f61490b)) {
                C29363d.this.m89502V().m85347e(EnumC29366g.FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pm2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$onDisableR20R21RawDataClicked$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {311}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119066w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29363d.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119066w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21750d interfaceC21750dM89482S = C29363d.this.m89482S();
                if (interfaceC21750dM89482S != null) {
                    this.f119066w = 1;
                    if (InterfaceC21750d.m61377Z0(interfaceC21750dM89482S, false, 0L, this, 2, null) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: pm2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$onEnableR20R21RawDataClicked$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {305}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119068w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29363d.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119068w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21750d interfaceC21750dM89482S = C29363d.this.m89482S();
                if (interfaceC21750dM89482S != null) {
                    this.f119068w = 1;
                    if (InterfaceC21750d.m61377Z0(interfaceC21750dM89482S, true, 0L, this, 2, null) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: pm2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$onEraseStrapConfirmationAccepted$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {260}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119070w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f119071x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29363d f119072y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, C29363d c29363d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119071x = z4;
            this.f119072y = c29363d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f119071x, this.f119072y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119070w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f119071x) {
                    this.f119072y.eventDispatcher.m128989G(this.f119072y.strap.mo106491d().analyticsName());
                    InterfaceC33704b interfaceC33704b = this.f119072y.strap;
                    this.f119070w = 1;
                    if (interfaceC33704b.mo106485B(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: pm2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$onPowerCycleConfirmationAccepted$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {238}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119073w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f119074x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29363d f119075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, C29363d c29363d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119074x = z4;
            this.f119075y = c29363d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f119074x, this.f119075y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC21750d interfaceC21750dM89481Q;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119073w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f119074x && (interfaceC21750dM89481Q = this.f119075y.m89481Q()) != null) {
                    this.f119073w = 1;
                    if (InterfaceC21750d.m61375W(interfaceC21750dM89481Q, 0L, this, 1, null) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: pm2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$onRebootConfirmationAccepted$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {251}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119076w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f119077x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29363d f119078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, C29363d c29363d, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119077x = z4;
            this.f119078y = c29363d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f119077x, this.f119078y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC32978v enumC32978vMo24752w0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f119077x) {
                    C40191e c40191e = this.f119078y.eventDispatcher;
                    InterfaceC21750d interfaceC21750dM89481Q = this.f119078y.m89481Q();
                    String strM104089b = (interfaceC21750dM89481Q == null || (enumC32978vMo24752w0 = interfaceC21750dM89481Q.mo24752w0()) == null) ? null : EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0);
                    if (strM104089b == null) {
                        strM104089b = "";
                    }
                    c40191e.m129033e0(strM104089b);
                    InterfaceC21750d interfaceC21750dM89481Q2 = this.f119078y.m89481Q();
                    if (interfaceC21750dM89481Q2 != null) {
                        this.f119076w = 1;
                        if (InterfaceC21750d.m61378k0(interfaceC21750dM89481Q2, 0L, this, 1, null) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
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

    /* JADX INFO: renamed from: pm2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToCommandCapableStrapConnected$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119079w;

        /* JADX INFO: renamed from: pm2.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C29363d f119081w;

            public a(C29363d c29363d) {
                this.f119081w = c29363d;
            }

            /* JADX INFO: renamed from: b */
            public final Object m89524b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C29363d c29363d = this.f119081w;
                c29363d.m49140v(c29363d.getCommandCapableStrapConnected(), Boolean.valueOf(z4));
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m89524b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: pm2.d$h$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f119082w;

            /* JADX INFO: renamed from: pm2.d$h$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f119083w;

                /* JADX INFO: renamed from: pm2.d$h$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToCommandCapableStrapConnected$1$invokeSuspend$$inlined$map$1$2", m100430f = "AdvancedStrapViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42176a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f119084E;

                    /* JADX INFO: renamed from: F */
                    Object f119085F;

                    /* JADX INFO: renamed from: G */
                    Object f119086G;

                    /* JADX INFO: renamed from: H */
                    int f119087H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f119088w;

                    /* JADX INFO: renamed from: x */
                    int f119089x;

                    /* JADX INFO: renamed from: y */
                    Object f119090y;

                    public C42176a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f119088w = obj;
                        this.f119089x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f119083w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42176a c42176a;
                    if (interfaceC30057d instanceof C42176a) {
                        c42176a = (C42176a) interfaceC30057d;
                        int i13 = c42176a.f119089x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42176a.f119089x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42176a = new C42176a(interfaceC30057d);
                        }
                    } else {
                        c42176a = new C42176a(interfaceC30057d);
                    }
                    Object obj2 = c42176a.f119088w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42176a.f119089x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f119083w;
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC21750d) obj) != null);
                        c42176a.f119090y = null;
                        c42176a.f119084E = null;
                        c42176a.f119085F = null;
                        c42176a.f119086G = null;
                        c42176a.f119087H = 0;
                        c42176a.f119089x = 1;
                        if (interfaceC13062m.emit(boolValueOf, c42176a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC13058l interfaceC13058l) {
                this.f119082w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f119082w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29363d.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119079w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new b(C29363d.this.whoopStrapProvider.getCommandCapableStrapFlow()));
                a aVar = new a(C29363d.this);
                this.f119079w = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pm2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToNewFwUpdateAction$2", m100430f = "AdvancedStrapViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lgt0/h;", "result", "Ll83/a0;", "<anonymous>", "(Lgt0/h;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119092w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119093x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C29363d.this.new i(interfaceC30057d);
            iVar.f119093x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC16186h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.f119093x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119092w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if ((interfaceC16186h instanceof InterfaceC16186h.g) && ((InterfaceC16186h.g) interfaceC16186h).getIsForeground()) {
                C29363d.this.m89502V().m85347e(EnumC29366g.FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pm2.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToPuffinConnectionState$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119095w;

        /* JADX INFO: renamed from: pm2.d$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToPuffinConnectionState$1$2", m100430f = "AdvancedStrapViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Ly42/a;", "Lc52/b;", "<destruct>", "Ll83/a0;", "<anonymous>", "(Ll83/k;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f119097w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f119098x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C29363d f119099y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29363d c29363d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f119099y = c29363d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f119099y, interfaceC30057d);
                aVar.f119098x = obj;
                return aVar;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC27939b firmwareVersion;
                String strMo84319a;
                C23465k c23465k = (C23465k) this.f119098x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f119097w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC39219a interfaceC39219a = (InterfaceC39219a) c23465k.f92937w;
                if (AbstractC22676k.m65745e((AbstractC4251b) c23465k.f92938x, AbstractC4251b.f.f17287a)) {
                    C4253d c4253dMo124935O = interfaceC39219a.mo124935O();
                    if (c4253dMo124935O != null && (firmwareVersion = c4253dMo124935O.getFirmwareVersion()) != null && (strMo84319a = firmwareVersion.mo84319a()) != null) {
                        C29363d c29363d = this.f119099y;
                        c29363d.m49140v(c29363d.getPuffinFirmwareVersion(), strMo84319a);
                    }
                } else {
                    C29363d c29363d2 = this.f119099y;
                    c29363d2.m49140v(c29363d2.getPuffinFirmwareVersion(), "");
                }
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c23465k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: pm2.d$j$b */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToPuffinConnectionState$1$invokeSuspend$$inlined$flatMapLatest$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f119100w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f119101x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f119102y;

            public b(InterfaceC30057d interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d);
                bVar.f119101x = interfaceC13062m;
                bVar.f119102y = interfaceC39219a;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f119100w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f119101x;
                    InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f119102y;
                    c cVar = new c(interfaceC39219a.getConnectionStatus(), interfaceC39219a);
                    this.f119101x = null;
                    this.f119102y = null;
                    this.f119100w = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m, cVar, this) == enumC31071a) {
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
                return invoke((InterfaceC13062m) obj, (InterfaceC39219a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            }
        }

        /* JADX INFO: renamed from: pm2.d$j$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f119103w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC39219a f119104x;

            /* JADX INFO: renamed from: pm2.d$j$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f119105w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC39219a f119106x;

                /* JADX INFO: renamed from: pm2.d$j$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToPuffinConnectionState$1$invokeSuspend$lambda$0$$inlined$map$1$2", m100430f = "AdvancedStrapViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42177a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f119107E;

                    /* JADX INFO: renamed from: F */
                    Object f119108F;

                    /* JADX INFO: renamed from: G */
                    Object f119109G;

                    /* JADX INFO: renamed from: H */
                    int f119110H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f119111w;

                    /* JADX INFO: renamed from: x */
                    int f119112x;

                    /* JADX INFO: renamed from: y */
                    Object f119113y;

                    public C42177a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f119111w = obj;
                        this.f119112x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, InterfaceC39219a interfaceC39219a) {
                    this.f119105w = interfaceC13062m;
                    this.f119106x = interfaceC39219a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42177a c42177a;
                    if (interfaceC30057d instanceof C42177a) {
                        c42177a = (C42177a) interfaceC30057d;
                        int i13 = c42177a.f119112x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42177a.f119112x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42177a = new C42177a(interfaceC30057d);
                        }
                    } else {
                        c42177a = new C42177a(interfaceC30057d);
                    }
                    Object obj2 = c42177a.f119111w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42177a.f119112x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f119105w;
                        C23465k c23465k = new C23465k(this.f119106x, (AbstractC4251b) obj);
                        c42177a.f119113y = null;
                        c42177a.f119107E = null;
                        c42177a.f119108F = null;
                        c42177a.f119109G = null;
                        c42177a.f119110H = 0;
                        c42177a.f119112x = 1;
                        if (interfaceC13062m.emit(c23465k, c42177a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public c(InterfaceC13058l interfaceC13058l, InterfaceC39219a interfaceC39219a) {
                this.f119103w = interfaceC13058l;
                this.f119104x = interfaceC39219a;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f119103w.collect(new a(interfaceC13062m, this.f119104x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29363d.this.new j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119095w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14380k c14380kM36590P = AbstractC13091v.m36590P(C29363d.this.puffinManager.m124994e(), new b(null));
                a aVar = new a(C29363d.this, null);
                this.f119095w = 1;
                if (AbstractC13091v.m36604n(c14380kM36590P, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pm2.d$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$subscribeToStrapConnectionState$1", m100430f = "AdvancedStrapViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119115w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m89528i(C29363d c29363d, EnumC33707e enumC33707e) {
            boolean z4 = enumC33707e == EnumC33707e.READY;
            c29363d.m49140v(c29363d.getStrapConnected(), Boolean.valueOf(z4));
            if (z4) {
                c29363d.m89492y0();
            } else {
                c29363d.getClearStrapInfoUi().m85330e();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m89529j(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29363d.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119115w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C38280g<EnumC33707e> c38280gM122652B = C29363d.this.strap.mo106496i().m122652B(C40634a.m131874a());
            final C29360a c29360a = new C29360a(C29363d.this, 19);
            C29363d.this.getSubscriptions().m75179c(c38280gM122652B.m122661K(new InterfaceC3255b() { // from class: pm2.e
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj2) {
                    C29363d.k.m89529j(c29360a, obj2);
                }
            }));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29363d(FeatureFlagRepository featureFlagRepository, InterfaceC33704b strap, C28150c appDiagnostics, InterfaceC16183e firmwareUpdateApi, InterfaceC4733b whoopStrapProvider, C40191e eventDispatcher, C39228j puffinManager, boolean z4, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.featureFlagRepository = featureFlagRepository;
        this.strap = strap;
        this.appDiagnostics = appDiagnostics;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.whoopStrapProvider = whoopStrapProvider;
        this.eventDispatcher = eventDispatcher;
        this.puffinManager = puffinManager;
        this.isProdFlavor = z4;
        this.actionShowPowerCycleConfirmation = new C28196r0();
        this.logTag = "AdvancedStrapViewModel";
        this.strapConnected = new C1630u0();
        Boolean bool = Boolean.FALSE;
        this.commandCapableStrapConnected = new C1630u0(bool);
        this.advancedEmailDiagnosticButtonEnabled = new C1630u0(bool);
        this.toggleRawDataButtonsEnabled = new C1630u0(bool);
        this.deviceInfo = new C1630u0();
        this.puffinFirmwareVersion = new C1630u0();
        this.firmwareLiveData = new C28199s0<>();
        this.goToPairStrapBle = new C28196r0();
        this.actionShowRebootStrapConfirmation = new C28196r0();
        this.actionEraseStrapDataConfirmation = new C28196r0();
        this.actionUnpairStrapConfirmation = new C28196r0();
        this.clearStrapInfoUi = new C28196r0();
    }

    /* JADX INFO: renamed from: H */
    private final boolean m89479H() {
        C37605a c37605a;
        if (!this.appDiagnostics.m85182e()) {
            this.firmwareLiveData.m85347e(EnumC29366g.NO_NETWORK_CONNECTED_PROMPT);
            return false;
        }
        InterfaceC21750d interfaceC21750dM89481Q = m89481Q();
        if (interfaceC21750dM89481Q == null || (c37605a = interfaceC21750dM89481Q.get_whoopBatteryLevel()) == null || !c37605a.getIsLowForFirmwareUpdate()) {
            return true;
        }
        this.firmwareLiveData.m85347e(EnumC29366g.CHARGE_STRAP_PROMPT);
        if (c37605a.getLevel() != this.strap.getBatteryLevel().getUserDisplayPercent()) {
            m49136n().mo85226q(AbstractC2875y.m8294g(c37605a.getLevel(), this.strap.getBatteryLevel().getUserDisplayPercent(), "Can't start FW Update, battery level data gap. WhoopStrap: ", ", WhoopStrapProxy: "), new AbstractC30556a.a[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    private final void m89480I(WhoopFwDevice fwDevice) {
        AbstractC13091v.m36582H(new C13052j1(this.firmwareUpdateApi.mo45721b(new AbstractC16185g.b(fwDevice)), new b(null), 0), AbstractC1640x1.m5043b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final InterfaceC21750d m89481Q() {
        return (InterfaceC21750d) this.whoopStrapProvider.getCommandCapableStrapFlow().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final InterfaceC21750d m89482S() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m89483r0() {
        m49140v(this.toggleRawDataButtonsEnabled, Boolean.valueOf(this.featureFlagRepository.isFeatureEnabled(ConnectivityFeatureFlagsKt.ADVANCED_STRAP_SETTINGS_TOGGLE_RAW_DATA)));
    }

    /* JADX INFO: renamed from: s0 */
    private final void m89484s0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new h(null), 3);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m89485t0(WhoopFwDevice fwDevice) {
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36609s(new C28557w0(11), this.firmwareUpdateApi.mo45721b(new AbstractC16185g.d(fwDevice))), new i(null), 0), AbstractC1640x1.m5043b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final boolean m89486u0(InterfaceC16186h previousResult, InterfaceC16186h currentResult) {
        AbstractC22676k.m65750j(previousResult, "previousResult");
        AbstractC22676k.m65750j(currentResult, "currentResult");
        return previousResult.getClass() == currentResult.getClass();
    }

    /* JADX INFO: renamed from: v0 */
    private final void m89487v0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new j(null), 3);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m89489w0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new k(null), 3);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m89490x0() {
        m49140v(this.advancedEmailDiagnosticButtonEnabled, Boolean.valueOf(this.featureFlagRepository.isFeatureEnabled(ConnectivityFeatureFlagsKt.ENABLE_EMAIL_DIAGNOSTIC_BUTTON) || !this.isProdFlavor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m89492y0() {
        WhoopStrapInfo whoopStrapInfoMo106493f = this.strap.mo106493f();
        if (whoopStrapInfoMo106493f != null) {
            m49138t(this.deviceInfo, whoopStrapInfoMo106493f);
        }
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final C28196r0 getActionEraseStrapDataConfirmation() {
        return this.actionEraseStrapDataConfirmation;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final C28196r0 getActionShowPowerCycleConfirmation() {
        return this.actionShowPowerCycleConfirmation;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final C28196r0 getActionShowRebootStrapConfirmation() {
        return this.actionShowRebootStrapConfirmation;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final C28196r0 getActionUnpairStrapConfirmation() {
        return this.actionUnpairStrapConfirmation;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AbstractC1615p0 getAdvancedEmailDiagnosticButtonEnabled() {
        return this.advancedEmailDiagnosticButtonEnabled;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final C28196r0 getClearStrapInfoUi() {
        return this.clearStrapInfoUi;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final AbstractC1615p0 getCommandCapableStrapConnected() {
        return this.commandCapableStrapConnected;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final AbstractC1615p0 getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: V */
    public final C28199s0<EnumC29366g> m89502V() {
        return this.firmwareLiveData;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final C28196r0 getGoToPairStrapBle() {
        return this.goToPairStrapBle;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final AbstractC1615p0 getPuffinFirmwareVersion() {
        return this.puffinFirmwareVersion;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final AbstractC1615p0 getStrapConnected() {
        return this.strapConnected;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final AbstractC1615p0 getToggleRawDataButtonsEnabled() {
        return this.toggleRawDataButtonsEnabled;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m89507b0() {
        this.firmwareLiveData.m85347e(EnumC29366g.FIRMWARE_HIDE_COMPOSE_DIALOG);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m89508c0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m89509d0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m89510e0(boolean shouldErase) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(shouldErase, this, null), 3);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m89511f0() {
        this.actionEraseStrapDataConfirmation.m85330e();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m89512g0() {
        EnumC32978v enumC32978vMo24752w0;
        InterfaceC21750d interfaceC21750dM89481Q = m89481Q();
        C40191e c40191e = this.eventDispatcher;
        String strM104089b = (interfaceC21750dM89481Q == null || (enumC32978vMo24752w0 = interfaceC21750dM89481Q.mo24752w0()) == null) ? null : EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0);
        if (strM104089b == null) {
            strM104089b = "";
        }
        c40191e.m128999L(strM104089b);
        if (m89479H()) {
            EnumC32978v enumC32978vMo24752w1 = interfaceC21750dM89481Q != null ? interfaceC21750dM89481Q.mo24752w0() : null;
            switch (enumC32978vMo24752w1 == null ? -1 : a.f119062a[enumC32978vMo24752w1.ordinal()]) {
                case -1:
                    this.firmwareLiveData.m85347e(EnumC29366g.NO_STRAP_CONNECTED);
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    m89480I(AbstractC4732a.m14816b(interfaceC21750dM89481Q));
                    return;
                case 6:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m89513h0(boolean shouldUpdate) {
        InterfaceC21750d interfaceC21750dM89481Q;
        if (!shouldUpdate) {
            m49136n().mo85228t("User dismissed the FW Update Prompt Modal", new AbstractC30556a.a[0]);
            return;
        }
        if (m89479H() && (interfaceC21750dM89481Q = m89481Q()) != null) {
            int i13 = a.f119062a[interfaceC21750dM89481Q.mo24752w0().ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
                AbstractC13091v.m36582H(this.firmwareUpdateApi.mo45721b(new AbstractC16185g.e(AbstractC4732a.m14816b(interfaceC21750dM89481Q))), AbstractC1640x1.m5043b(this));
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m89514i0() {
        this.goToPairStrapBle.m85330e();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m89515j0() {
        this.actionShowPowerCycleConfirmation.m85330e();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m89516k0(boolean powerCycle) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(powerCycle, this, null), 3);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m89517l0() {
        this.actionShowRebootStrapConfirmation.m85330e();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m89518m0(boolean shouldReboot) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(shouldReboot, this, null), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m89519n0() {
        m89492y0();
        m89490x0();
        m89483r0();
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m89520o0() {
        m89489w0();
        m89487v0();
        m89484s0();
        InterfaceC21750d interfaceC21750dM89481Q = m89481Q();
        if (interfaceC21750dM89481Q != null) {
            m89485t0(AbstractC4732a.m14816b(interfaceC21750dM89481Q));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m89521p0() {
        this.actionUnpairStrapConfirmation.m85330e();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m89522q0(boolean shouldUnpair) {
        InterfaceC21750d interfaceC21750dM89481Q = m89481Q();
        if (!shouldUnpair || interfaceC21750dM89481Q == null) {
            return;
        }
        m49136n().mo85228t("User confirmed to unpair WHOOP strap from the app", new AbstractC30556a.a[0]);
        this.eventDispatcher.m128990G0(EnumC32978v.INSTANCE.m104089b(interfaceC21750dM89481Q.mo24752w0()));
        interfaceC21750dM89481Q.mo24690G0();
        this.strap.mo106499l();
    }

    public /* synthetic */ C29363d(FeatureFlagRepository featureFlagRepository, InterfaceC33704b interfaceC33704b, C28150c c28150c, InterfaceC16183e interfaceC16183e, InterfaceC4733b interfaceC4733b, C40191e c40191e, C39228j c39228j, boolean z4, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagRepository, interfaceC33704b, c28150c, interfaceC16183e, interfaceC4733b, c40191e, c39228j, z4, (i13 & 256) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
