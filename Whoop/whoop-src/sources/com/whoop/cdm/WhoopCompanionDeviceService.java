package com.whoop.cdm;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceService;
import android.content.ComponentCallbacks;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13072o1;
import ep0.C13395a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.InterfaceC32957a;
import tr2.InterfaceC34116n;
import tt0.AbstractC34157b;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\f\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/cdm/WhoopCompanionDeviceService;", "Landroid/companion/CompanionDeviceService;", "<init>", "()V", "Ll83/a0;", "e", "j", "onCreate", "", "address", "onDeviceAppeared", "(Ljava/lang/String;)V", "onDeviceDisappeared", "Landroid/companion/AssociationInfo;", "associationInfo", "(Landroid/companion/AssociationInfo;)V", "Lst0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "f", "()Lst0/a;", "bleReconnectTickler", "Lbc3/c0;", "x", "g", "()Lbc3/c0;", "coroutineScope", "Lec3/o1;", "y", "Lec3/o1;", "_bleReconnectFlow", "Ltr2/n;", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "logger", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopCompanionDeviceService extends CompanionDeviceService {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h bleReconnectTickler;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 _bleReconnectFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: com.whoop.cdm.WhoopCompanionDeviceService$a */
    @InterfaceC32271e(m100429c = "com.whoop.cdm.WhoopCompanionDeviceService$emitBleReconnect$1", m100430f = "WhoopCompanionDeviceService.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6117a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24313w;

        public C6117a(InterfaceC30057d<? super C6117a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopCompanionDeviceService.this.new C6117a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6117a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24313w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                WhoopCompanionDeviceService.this.m18391h().mo85232x("CDS", "Emitting BLE reconnect event", new AbstractC30556a.a[0]);
                InterfaceC13072o1 interfaceC13072o1 = WhoopCompanionDeviceService.this._bleReconnectFlow;
                this.f24313w = 1;
                if (interfaceC13072o1.emit(c23454a0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.cdm.WhoopCompanionDeviceService$b */
    @InterfaceC32271e(m100429c = "com.whoop.cdm.WhoopCompanionDeviceService$onCreate$1", m100430f = "WhoopCompanionDeviceService.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ll83/a0;", "it", "<anonymous>", "(V)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6118b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24315w;

        public C6118b(InterfaceC30057d<? super C6118b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopCompanionDeviceService.this.new C6118b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C23454a0 c23454a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6118b) create(c23454a0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f24315w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            WhoopCompanionDeviceService.this.m18393j();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.cdm.WhoopCompanionDeviceService$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6119c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24317w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24318x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24319y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6119c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24317w = componentCallbacks;
            this.f24318x = interfaceC35951a;
            this.f24319y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, st0.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC32957a invoke() {
            ComponentCallbacks componentCallbacks = this.f24317w;
            InterfaceC35951a interfaceC35951a = this.f24318x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24319y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC32957a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.cdm.WhoopCompanionDeviceService$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6120d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24320w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24321x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24322y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6120d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24320w = componentCallbacks;
            this.f24321x = interfaceC35951a;
            this.f24322y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24320w;
            InterfaceC35951a interfaceC35951a = this.f24321x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24322y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    public WhoopCompanionDeviceService() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.bleReconnectTickler = AbstractC30060g.m92087G(enumC23463i, new C6119c(this, null, null));
        this.coroutineScope = AbstractC30060g.m92087G(enumC23463i, new C6120d(this, null, null));
        this._bleReconnectFlow = AbstractC13091v.m36592b(1, 0, null, 6);
        this.logger = AbstractC30060g.m92088H(new C13395a(7));
    }

    /* JADX INFO: renamed from: e */
    private final void m18388e() {
        AbstractC3006f0.m8732z(m18390g(), null, null, new C6117a(null), 3);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC32957a m18389f() {
        return (InterfaceC32957a) this.bleReconnectTickler.getValue();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC2994c0 m18390g() {
        return (InterfaceC2994c0) this.coroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC34116n m18391h() {
        return (InterfaceC34116n) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC34116n m18392i() {
        return InterfaceC34116n.INSTANCE.m107848a("WhoopCompanionDeviceService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m18393j() {
        m18391h().mo85232x("CDS", "Triggering a connection request to the strap", new AbstractC30556a.a[0]);
        m18389f().mo13713a(0L);
    }

    @Override // android.app.Service
    public void onCreate() {
        InterfaceC13072o1 interfaceC13072o1 = this._bleReconnectFlow;
        Duration.Companion companion = Duration.INSTANCE;
        AbstractC13091v.m36582H(new C13052j1(AbstractC34157b.m107936c(interfaceC13072o1, DurationKt.toDuration(5, DurationUnit.SECONDS)), new C6118b(null), 0), m18390g());
    }

    public void onDeviceAppeared(String address) {
        AbstractC22676k.m65750j(address, "address");
        m18391h().mo85220k("CDS Legacy", "Device appeared: ".concat(address), new AbstractC30556a.a[0]);
        m18388e();
    }

    public void onDeviceDisappeared(String address) {
        AbstractC22676k.m65750j(address, "address");
        m18391h().mo85220k("CDS Legacy", "Device disappeared: ".concat(address), new AbstractC30556a.a[0]);
    }

    public void onDeviceDisappeared(AssociationInfo associationInfo) {
        AbstractC22676k.m65750j(associationInfo, "associationInfo");
        super.onDeviceDisappeared(associationInfo);
        InterfaceC34116n interfaceC34116nM18391h = m18391h();
        CharSequence displayName = associationInfo.getDisplayName();
        interfaceC34116nM18391h.mo85220k("CDS", "Device disappeared: " + ((Object) displayName) + " " + associationInfo.getDeviceMacAddress(), new AbstractC30556a.a[0]);
    }

    public void onDeviceAppeared(AssociationInfo associationInfo) {
        AbstractC22676k.m65750j(associationInfo, "associationInfo");
        super.onDeviceAppeared(associationInfo);
        InterfaceC34116n interfaceC34116nM18391h = m18391h();
        CharSequence displayName = associationInfo.getDisplayName();
        interfaceC34116nM18391h.mo85220k("CDS", "Device appeared: " + ((Object) displayName) + " " + associationInfo.getDeviceMacAddress(), new AbstractC30556a.a[0]);
        m18388e();
    }
}
