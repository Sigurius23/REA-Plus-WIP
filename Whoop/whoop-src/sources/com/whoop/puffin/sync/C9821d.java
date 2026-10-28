package com.whoop.puffin.sync;

import a52.C0397d;
import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c52.C4253d;
import c93.InterfaceC4351m;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import f52.AbstractC14110h;
import f52.C14104b;
import f52.C14109g;
import f52.InterfaceC14108f;
import fk0.C14547c;
import fk0.C14548d;
import fk0.C14550f;
import java.util.List;
import l83.C23454a0;
import lt0.AbstractC24726c;
import lt0.AbstractC24734k;
import m83.AbstractC25265s;
import ot0.C28323a;
import ou0.InterfaceC28370a;
import ou0.InterfaceC28374e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pu0.C29548b;
import pu0.C29550d;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.puffin.sync.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010%J\u001b\u0010(\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020**\u00020*2\u0006\u0010#\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020'0-2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lcom/whoop/puffin/sync/d;", "Lf52/f;", "Ltr2/n;", "logger", "Lcom/whoop/puffin/sync/a;", "entityMapper", "Lou0/a;", "batteryPackRelativeConsoleLogPacketDao", "Lou0/e;", "batteryPackRelativeFirmwareEventsPacketDao", "<init>", "(Ltr2/n;Lcom/whoop/puffin/sync/a;Lou0/a;Lou0/e;)V", "Lcom/whoop/puffin/sync/f;", "state", "Lcom/whoop/puffin/sync/f$b$c;", "n", "(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$c;", "Lfk0/d;", "blePacket", "m", "(Lcom/whoop/puffin/sync/f;Lfk0/d;Lq83/d;)Ljava/lang/Object;", "endPacket", "Lcom/whoop/puffin/sync/e$b;", "burst", "", "q", "(Lfk0/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/puffin/sync/f$a;", "Lfk0/f;", "startPacket", "Lc52/d;", "puffinMeta", "l", "(Lcom/whoop/puffin/sync/f$a;Lfk0/f;Lc52/d;)Lcom/whoop/puffin/sync/f$a;", "La52/d;", "packet", "p", "(Lcom/whoop/puffin/sync/f$a;La52/d;)Lcom/whoop/puffin/sync/f$a;", "o", "Llt0/k;", "j", "(Lcom/whoop/puffin/sync/f$a;Llt0/k;)Lcom/whoop/puffin/sync/f$a;", "Lf52/g;", "k", "(Lf52/g;Llt0/k;)Lf52/g;", "Lec3/l;", "upstream", "a", "(Lec3/l;Lc52/d;)Lec3/l;", "Ltr2/n;", "b", "Lcom/whoop/puffin/sync/a;", "c", "Lou0/a;", "d", "Lou0/e;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9821d implements InterfaceC14108f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9818a entityMapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28370a batteryPackRelativeConsoleLogPacketDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28374e batteryPackRelativeFirmwareEventsPacketDao;

    /* JADX INFO: renamed from: com.whoop.puffin.sync.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl", m100430f = "BatterySyncInteractor.kt", m100431l = {90}, m100432m = "handleBurstEnd", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28641E;

        /* JADX INFO: renamed from: w */
        Object f28642w;

        /* JADX INFO: renamed from: x */
        Object f28643x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28644y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28644y = obj;
            this.f28641E |= Integer.MIN_VALUE;
            return C9821d.this.m23679m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$sendPuffinEvents$1", m100430f = "BatterySyncInteractor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/puffin/sync/f;", "state", "Llt0/k;", "parsedPacket", "<anonymous>", "(Lcom/whoop/puffin/sync/f;Llt0/k;)Lcom/whoop/puffin/sync/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C4253d f28647F;

        /* JADX INFO: renamed from: w */
        Object f28648w;

        /* JADX INFO: renamed from: x */
        int f28649x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28650y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f28651z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4253d c4253d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f28647F = c4253d;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9823f interfaceC9823f, AbstractC24734k abstractC24734k, InterfaceC30057d<? super InterfaceC9823f> interfaceC30057d) {
            b bVar = C9821d.this.new b(this.f28647F, interfaceC30057d);
            bVar.f28650y = interfaceC9823f;
            bVar.f28651z = abstractC24734k;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9823f interfaceC9823fM23676j = (InterfaceC9823f) this.f28650y;
            AbstractC24734k abstractC24734k = (AbstractC24734k) this.f28651z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28649x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC24726c packet = abstractC24734k.getPacket();
                if (packet instanceof C14550f) {
                    if (!(interfaceC9823fM23676j instanceof InterfaceC9823f.a)) {
                        throw new IllegalStateException("Received history start packet while not actively syncing");
                    }
                    C9821d.this.logger.mo85228t("got PuffinHistoryStartMetadataPacket, creating new open burst", new AbstractC30556a.a[0]);
                    interfaceC9823fM23676j = C9821d.this.m23678l((InterfaceC9823f.a) interfaceC9823fM23676j, (C14550f) packet, this.f28647F);
                } else if (packet instanceof C14548d) {
                    this.f28650y = null;
                    this.f28651z = null;
                    this.f28648w = null;
                    this.f28649x = 1;
                    obj = C9821d.this.m23679m(interfaceC9823fM23676j, (C14548d) packet, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (packet instanceof C14547c) {
                    interfaceC9823fM23676j = C9821d.this.m23680n(interfaceC9823fM23676j);
                } else if (packet instanceof C28323a) {
                    C9821d.this.logger.mo85228t("Received event " + packet, new AbstractC30556a.a[0]);
                    if (!(interfaceC9823fM23676j instanceof InterfaceC9823f.a)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    interfaceC9823fM23676j = C9821d.this.m23676j((InterfaceC9823f.a) interfaceC9823fM23676j, abstractC24734k);
                } else {
                    C9821d.this.logger.mo85222m("Received unexpected packet " + packet + " " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(packet.getClass()), new AbstractC30556a.a[0]);
                }
                C9821d.this.logger.mo85219j("Current historical Pull State: " + interfaceC9823fM23676j, new AbstractC30556a.a[0]);
                return interfaceC9823fM23676j;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            interfaceC9823fM23676j = (InterfaceC9823f) obj;
            C9821d.this.logger.mo85219j("Current historical Pull State: " + interfaceC9823fM23676j, new AbstractC30556a.a[0]);
            return interfaceC9823fM23676j;
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2", m100430f = "BatterySyncInteractor.kt", m100431l = {129, 129, 134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f28652E;

        /* JADX INFO: renamed from: F */
        int f28653F;

        /* JADX INFO: renamed from: G */
        int f28654G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f28655H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C14548d f28656I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC9822e.b f28657J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C9821d f28658K;

        /* JADX INFO: renamed from: w */
        Object f28659w;

        /* JADX INFO: renamed from: x */
        Object f28660x;

        /* JADX INFO: renamed from: y */
        Object f28661y;

        /* JADX INFO: renamed from: z */
        Object f28662z;

        /* JADX INFO: renamed from: com.whoop.puffin.sync.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2$consoleLogEntities$1", m100430f = "BatterySyncInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lpu0/b;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28663w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C9821d f28664x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC9822e.b f28665y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C9821d c9821d, InterfaceC9822e.b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28664x = c9821d;
                this.f28665y = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f28664x, this.f28665y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<C29548b>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f28663w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return this.f28664x.entityMapper.m23648b(this.f28665y);
            }
        }

        /* JADX INFO: renamed from: com.whoop.puffin.sync.d$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2$firmwareEventsEntities$1", m100430f = "BatterySyncInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lpu0/d;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28666w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C9821d f28667x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC9822e.b f28668y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C9821d c9821d, InterfaceC9822e.b bVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28667x = c9821d;
                this.f28668y = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f28667x, this.f28668y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<C29550d>> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f28666w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return this.f28667x.entityMapper.m23649c(this.f28668y);
            }
        }

        /* JADX INFO: renamed from: com.whoop.puffin.sync.d$c$c, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2$insertConsoleLogs$1", m100430f = "BatterySyncInteractor.kt", m100431l = {121, 121}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41402c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            Object f28669w;

            /* JADX INFO: renamed from: x */
            int f28670x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C9821d f28671y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC3018i0 f28672z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41402c(C9821d c9821d, InterfaceC3018i0 interfaceC3018i0, InterfaceC30057d<? super C41402c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28671y = c9821d;
                this.f28672z = interfaceC3018i0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41402c(this.f28671y, this.f28672z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((C41402c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
            
                if (r1.insertList((java.util.List) r6, r5) == r0) goto L21;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f28670x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p505ts.AbstractC34132o.m107864I(r6)     // Catch: android.database.sqlite.SQLiteException -> L10
                    goto L54
                L10:
                    r6 = move-exception
                    goto L46
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    java.lang.Object r1 = r5.f28669w
                    ou0.a r1 = (ou0.InterfaceC28370a) r1
                    p505ts.AbstractC34132o.m107864I(r6)     // Catch: android.database.sqlite.SQLiteException -> L10
                    goto L38
                L22:
                    p505ts.AbstractC34132o.m107864I(r6)
                    com.whoop.puffin.sync.d r6 = r5.f28671y     // Catch: android.database.sqlite.SQLiteException -> L10
                    ou0.a r1 = com.whoop.puffin.sync.C9821d.m23670d(r6)     // Catch: android.database.sqlite.SQLiteException -> L10
                    bc3.i0 r6 = r5.f28672z     // Catch: android.database.sqlite.SQLiteException -> L10
                    r5.f28669w = r1     // Catch: android.database.sqlite.SQLiteException -> L10
                    r5.f28670x = r3     // Catch: android.database.sqlite.SQLiteException -> L10
                    java.lang.Object r6 = r6.await(r5)     // Catch: android.database.sqlite.SQLiteException -> L10
                    if (r6 != r0) goto L38
                    goto L45
                L38:
                    java.util.List r6 = (java.util.List) r6     // Catch: android.database.sqlite.SQLiteException -> L10
                    r4 = 0
                    r5.f28669w = r4     // Catch: android.database.sqlite.SQLiteException -> L10
                    r5.f28670x = r2     // Catch: android.database.sqlite.SQLiteException -> L10
                    java.lang.Object r6 = r1.insertList(r6, r5)     // Catch: android.database.sqlite.SQLiteException -> L10
                    if (r6 != r0) goto L54
                L45:
                    return r0
                L46:
                    com.whoop.puffin.sync.d r0 = r5.f28671y
                    tr2.n r0 = com.whoop.puffin.sync.C9821d.m23673g(r0)
                    java.lang.String r1 = "Failed to save console log data to database"
                    r3 = 0
                    qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r3]
                    r0.mo85230v(r1, r6, r2)
                L54:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.sync.C9821d.c.C41402c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C14548d c14548d, InterfaceC9822e.b bVar, C9821d c9821d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28656I = c14548d;
            this.f28657J = bVar;
            this.f28658K = c9821d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f28656I, this.f28657J, this.f28658K, interfaceC30057d);
            cVar.f28655H = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0129 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            InterfaceC28374e interfaceC28374e;
            InterfaceC3018i0 interfaceC3018i0;
            int i14;
            InterfaceC3018i0 interfaceC3018i1;
            Object objAwait;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f28655H;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.f28654G;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        i14 = this.f28653F;
                        i13 = this.f28652E;
                        interfaceC28374e = (InterfaceC28374e) this.f28662z;
                        interfaceC3018i0 = (InterfaceC3018i0) this.f28661y;
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                            return obj;
                        }
                        i14 = this.f28653F;
                        i13 = this.f28652E;
                        interfaceC3018i1 = (InterfaceC3018i0) this.f28661y;
                        AbstractC34132o.m107864I(obj);
                    }
                    this.f28655H = null;
                    this.f28659w = null;
                    this.f28660x = null;
                    this.f28661y = null;
                    this.f28652E = i13;
                    this.f28653F = i14;
                    this.f28654G = 3;
                    objAwait = interfaceC3018i1.await(this);
                    if (objAwait != enumC31071a) {
                        return enumC31071a;
                    }
                    return objAwait;
                }
                AbstractC34132o.m107864I(obj);
                Long lM41557J = this.f28656I.m41557J();
                if (lM41557J == null) {
                    Boolean bool = Boolean.FALSE;
                    this.f28658K.logger.mo85222m("Failed to read expected packet count", new AbstractC30556a.a[0]);
                    return bool;
                }
                int iLongValue = (int) lM41557J.longValue();
                int iM40203a = AbstractC14110h.m40203a(this.f28657J.getBurstData());
                this.f28658K.logger.mo85228t("Expected number of packets: " + this.f28656I.m41557J() + ", Received " + iM40203a + " packets: " + this.f28657J.getBurstData(), new AbstractC30556a.a[0]);
                if (iLongValue != iM40203a) {
                    return Boolean.FALSE;
                }
                C3022j0 c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new a(this.f28658K, this.f28657J, null), 3);
                C3022j0 c3022j0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c0, null, new b(this.f28658K, this.f28657J, null), 3);
                C3022j0 c3022j0M8711e3 = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C41402c(this.f28658K, c3022j0M8711e, null), 3);
                InterfaceC28374e interfaceC28374e2 = this.f28658K.batteryPackRelativeFirmwareEventsPacketDao;
                this.f28655H = null;
                this.f28659w = null;
                this.f28660x = null;
                this.f28661y = c3022j0M8711e3;
                this.f28662z = interfaceC28374e2;
                this.f28652E = iLongValue;
                this.f28653F = iM40203a;
                this.f28654G = 1;
                Object objM8817m = c3022j0M8711e2.m8817m(this);
                if (objM8817m != enumC31071a) {
                    i13 = iLongValue;
                    obj = objM8817m;
                    interfaceC28374e = interfaceC28374e2;
                    interfaceC3018i0 = c3022j0M8711e3;
                    i14 = iM40203a;
                }
                return enumC31071a;
                this.f28655H = null;
                this.f28659w = null;
                this.f28660x = null;
                this.f28661y = interfaceC3018i0;
                this.f28662z = null;
                this.f28652E = i13;
                this.f28653F = i14;
                this.f28654G = 2;
                if (interfaceC28374e.insertList((List) obj, this) != enumC31071a) {
                    interfaceC3018i1 = interfaceC3018i0;
                    this.f28655H = null;
                    this.f28659w = null;
                    this.f28660x = null;
                    this.f28661y = null;
                    this.f28652E = i13;
                    this.f28653F = i14;
                    this.f28654G = 3;
                    objAwait = interfaceC3018i1.await(this);
                    if (objAwait != enumC31071a) {
                        return objAwait;
                    }
                }
                return enumC31071a;
            } catch (SQLiteException e5) {
                this.f28658K.logger.mo85230v("Failed to save firmware event data to database", e5, new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
        }
    }

    public C9821d(InterfaceC34116n logger, C9818a entityMapper, InterfaceC28370a batteryPackRelativeConsoleLogPacketDao, InterfaceC28374e batteryPackRelativeFirmwareEventsPacketDao) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(entityMapper, "entityMapper");
        AbstractC22676k.m65750j(batteryPackRelativeConsoleLogPacketDao, "batteryPackRelativeConsoleLogPacketDao");
        AbstractC22676k.m65750j(batteryPackRelativeFirmwareEventsPacketDao, "batteryPackRelativeFirmwareEventsPacketDao");
        this.logger = logger;
        this.entityMapper = entityMapper;
        this.batteryPackRelativeConsoleLogPacketDao = batteryPackRelativeConsoleLogPacketDao;
        this.batteryPackRelativeFirmwareEventsPacketDao = batteryPackRelativeFirmwareEventsPacketDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC9823f.a m23676j(InterfaceC9823f.a aVar, AbstractC24734k abstractC24734k) {
        if (aVar.getOpenBurst() instanceof InterfaceC9822e.b) {
            return InterfaceC9823f.a.m23695e(aVar, InterfaceC9822e.b.m23689d((InterfaceC9822e.b) aVar.getOpenBurst(), m23677k(((InterfaceC9822e.b) aVar.getOpenBurst()).getBurstData(), abstractC24734k), null, 2, null), 0, 0, 0, 14, null);
        }
        throw new IllegalStateException("Tried to add packet to non open burst");
    }

    /* JADX INFO: renamed from: k */
    private final C14109g m23677k(C14109g c14109g, AbstractC24734k abstractC24734k) {
        if (AbstractC24726c.a.RELATIVE_BATTERY_PACK_CONSOLE_LOGS == abstractC24734k.getPacket().m72399L()) {
            return C14109g.m40199b(c14109g, AbstractC25265s.m74128f1(abstractC24734k, c14109g.m40201c()), null, 2, null);
        }
        if (AbstractC24726c.a.RELATIVE_PUFFIN_EVENTS == abstractC24734k.getPacket().m72399L()) {
            return C14109g.m40199b(c14109g, null, AbstractC25265s.m74128f1(abstractC24734k, c14109g.m40202d()), 1, null);
        }
        this.logger.mo85222m("Unexpected packet type found in battery burst: " + abstractC24734k.getPacket().m72399L(), new AbstractC30556a.a[0]);
        return c14109g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC9823f.a m23678l(InterfaceC9823f.a state, C14550f startPacket, C4253d puffinMeta) {
        int savedConsoleLogPacketsCount;
        int savedFirmwareEventPacketsCount;
        int burstCount;
        C14104b c14104b = new C14104b(startPacket.m41568a(), (byte) 0, startPacket.m41567V(), puffinMeta.getSerialNumber(), 2, null);
        if (state.getOpenBurst() instanceof InterfaceC9822e.d) {
            savedConsoleLogPacketsCount = ((InterfaceC9822e.d) state.getOpenBurst()).getBurstData().m40201c().size() + state.getSavedConsoleLogPacketsCount();
            savedFirmwareEventPacketsCount = ((InterfaceC9822e.d) state.getOpenBurst()).getBurstData().m40202d().size() + state.getSavedFirmwareEventPacketsCount();
            burstCount = state.getBurstCount() + 1;
        } else {
            if (state.getOpenBurst() instanceof InterfaceC9822e.a) {
                this.logger.mo85222m("Unexpected state: creating new open burst when prior burst not validated", new AbstractC30556a.a[0]);
            }
            savedConsoleLogPacketsCount = state.getSavedConsoleLogPacketsCount();
            savedFirmwareEventPacketsCount = state.getSavedFirmwareEventPacketsCount();
            burstCount = state.getBurstCount();
        }
        return new InterfaceC9823f.a(new InterfaceC9822e.b(null, c14104b, 1, null), savedConsoleLogPacketsCount, savedFirmwareEventPacketsCount, burstCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m23679m(InterfaceC9823f interfaceC9823f, C14548d c14548d, InterfaceC30057d<? super InterfaceC9823f> interfaceC30057d) {
        a aVar;
        boolean zBooleanValue;
        C0397d.Companion companion;
        C0397d c0397dM1094b;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f28641E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f28641E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM23683q = aVar.f28644y;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f28641E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM23683q);
            this.logger.mo85228t("got HISTORY END meta data!", new AbstractC30556a.a[0]);
            if (!(interfaceC9823f instanceof InterfaceC9823f.a)) {
                return new InterfaceC9823f.b.C41403b(interfaceC9823f.getSavedConsoleLogPacketsCount(), interfaceC9823f.getSavedFirmwareEventPacketsCount(), interfaceC9823f.getBurstCount());
            }
            InterfaceC9823f.a aVar2 = (InterfaceC9823f.a) interfaceC9823f;
            if (aVar2.getOpenBurst() instanceof InterfaceC9822e.b) {
                InterfaceC9822e.b bVar = (InterfaceC9822e.b) aVar2.getOpenBurst();
                aVar.f28642w = interfaceC9823f;
                aVar.f28643x = c14548d;
                aVar.f28641E = 1;
                objM23683q = m23683q(c14548d, bVar, aVar);
                if (objM23683q == obj) {
                    return obj;
                }
            } else {
                this.logger.mo85222m("Received history end packet while not in an open burst", new AbstractC30556a.a[0]);
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                return m23681o((InterfaceC9823f.a) interfaceC9823f, C0397d.INSTANCE.m1093a());
            }
            companion = C0397d.INSTANCE;
            c0397dM1094b = companion.m1094b(c14548d);
            if (c0397dM1094b != null) {
                return m23682p((InterfaceC9823f.a) interfaceC9823f, c0397dM1094b);
            }
            this.logger.mo85222m("Failed to create history result success packet!!", new AbstractC30556a.a[0]);
            return m23681o((InterfaceC9823f.a) interfaceC9823f, companion.m1093a());
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c14548d = (C14548d) aVar.f28643x;
        interfaceC9823f = (InterfaceC9823f) aVar.f28642w;
        AbstractC34132o.m107864I(objM23683q);
        zBooleanValue = ((Boolean) objM23683q).booleanValue();
        if (zBooleanValue) {
            return m23681o((InterfaceC9823f.a) interfaceC9823f, C0397d.INSTANCE.m1093a());
        }
        companion = C0397d.INSTANCE;
        c0397dM1094b = companion.m1094b(c14548d);
        if (c0397dM1094b != null) {
            return m23682p((InterfaceC9823f.a) interfaceC9823f, c0397dM1094b);
        }
        this.logger.mo85222m("Failed to create history result success packet!!", new AbstractC30556a.a[0]);
        return m23681o((InterfaceC9823f.a) interfaceC9823f, companion.m1093a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC9823f.b.c m23680n(InterfaceC9823f state) {
        this.logger.mo85228t("got HISTORY COMPLETE meta data!", new AbstractC30556a.a[0]);
        if (!(state instanceof InterfaceC9823f.a)) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC9823f.a aVar = (InterfaceC9823f.a) state;
        if ((aVar.getOpenBurst() instanceof InterfaceC9822e.c) || AbstractC14110h.m40203a(aVar.getOpenBurst().getBurstData()) == 0) {
            return new InterfaceC9823f.b.c(aVar.getSavedConsoleLogPacketsCount(), aVar.getSavedFirmwareEventPacketsCount(), aVar.getBurstCount());
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC9823f.a m23681o(InterfaceC9823f.a aVar, C0397d c0397d) {
        return InterfaceC9823f.a.m23695e(aVar, new InterfaceC9822e.a(aVar.getOpenBurst().getBurstData(), aVar.getOpenBurst().getMetadata(), c0397d), 0, 0, 0, 14, null);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC9823f.a m23682p(InterfaceC9823f.a aVar, C0397d c0397d) {
        return InterfaceC9823f.a.m23695e(aVar, new InterfaceC9822e.d(aVar.getOpenBurst().getBurstData(), aVar.getOpenBurst().getMetadata(), c0397d), 0, 0, 0, 14, null);
    }

    /* JADX INFO: renamed from: q */
    private final Object m23683q(C14548d c14548d, InterfaceC9822e.b bVar, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new c(c14548d, bVar, this, null), interfaceC30057d);
    }

    @Override // f52.InterfaceC14108f
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo23684a(InterfaceC13058l upstream, C4253d puffinMeta) {
        AbstractC22676k.m65750j(upstream, "upstream");
        AbstractC22676k.m65750j(puffinMeta, "puffinMeta");
        return new C13060l1(new InterfaceC9823f.a(null, 0, 0, 0, 15, null), upstream, new b(puffinMeta, null));
    }

    public /* synthetic */ C9821d(InterfaceC34116n interfaceC34116n, C9818a c9818a, InterfaceC28370a interfaceC28370a, InterfaceC28374e interfaceC28374e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatterySyncInteractorImpl") : interfaceC34116n, (i13 & 2) != 0 ? new C9818a() : c9818a, interfaceC28370a, interfaceC28374e);
    }
}
