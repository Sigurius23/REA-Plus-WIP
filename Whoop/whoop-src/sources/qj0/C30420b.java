package qj0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13065m2;
import ec3.C13100y;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.BufferUnderflowException;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ut0.InterfaceC35229a;
import vk0.InterfaceC36081g;
import wj0.EnumC37318b;
import xj0.AbstractC38334b;
import zj0.C40727h;

/* JADX INFO: renamed from: qj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001$BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106¨\u00068"}, m65681d2 = {"Lqj0/b;", "", "Lut0/a;", "wire", "Lkotlin/Function2;", "", "Lq83/d;", "", "writeFrame", "Lec3/l;", "incoming", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "<init>", "(Lut0/a;Lc93/m;Lec3/l;Lbc3/c0;Ltr2/n;)V", "bytes", "Lzj0/h;", "i", "([BLq83/d;)Ljava/lang/Object;", "Lxj0/b;", "sent", "response", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxj0/b;Lzj0/h;)Z", "g", "Ll83/a0;", "l", "()V", "packet", "Lkotlin/time/Duration;", "timeout", "dualResponse", "j", "(Lxj0/b;JZLq83/d;)Ljava/lang/Object;", "a", "Lut0/a;", "b", "Lc93/m;", "c", "Lec3/l;", "d", "Lbc3/c0;", "e", "Ltr2/n;", "Lec3/o1;", "f", "Lec3/o1;", "responses", "Lmc3/a;", "Lmc3/a;", "oneInFlight", "", "B", "sequence", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30420b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35229a wire;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4351m writeFrame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l incoming;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13072o1 responses;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25435a oneInFlight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private byte sequence;

    /* JADX INFO: renamed from: qj0.b$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lqj0/b$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends Exception {
    }

    /* JADX INFO: renamed from: qj0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel", m100430f = "CommandChannel.kt", m100431l = {131, 76}, m100432m = "send-dWUq8MI", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f124854E;

        /* JADX INFO: renamed from: F */
        int f124855F;

        /* JADX INFO: renamed from: G */
        int f124856G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f124857H;

        /* JADX INFO: renamed from: J */
        int f124859J;

        /* JADX INFO: renamed from: w */
        Object f124860w;

        /* JADX INFO: renamed from: x */
        Object f124861x;

        /* JADX INFO: renamed from: y */
        Object f124862y;

        /* JADX INFO: renamed from: z */
        long f124863z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124857H = obj;
            this.f124859J |= Integer.MIN_VALUE;
            return C30420b.this.m92999j(null, 0L, false, this);
        }
    }

    /* JADX INFO: renamed from: qj0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$send$2$1", m100430f = "CommandChannel.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/h;", "<anonymous>", "(Lbc3/c0;)Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f124864E;

        /* JADX INFO: renamed from: w */
        int f124865w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ byte[] f124867y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC38334b f124868z;

        /* JADX INFO: renamed from: qj0.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$send$2$1$1", m100430f = "CommandChannel.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzj0/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f124869w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30420b f124870x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ byte[] f124871y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30420b c30420b, byte[] bArr, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f124870x = c30420b;
                this.f124871y = bArr;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f124870x, this.f124871y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws a {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f124869w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC4351m interfaceC4351m = this.f124870x.writeFrame;
                    byte[] bArr = this.f124871y;
                    this.f124869w = 1;
                    obj = interfaceC4351m.invoke(bArr, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return C23454a0.f92919a;
                }
                throw new a();
            }
        }

        /* JADX INFO: renamed from: qj0.b$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$send$2$1$3", m100430f = "CommandChannel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lzj0/h;", "it", "", "<anonymous>", "(Lzj0/h;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f124872w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f124873x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f124874y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f124874y = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f124874y, interfaceC30057d);
                bVar.f124873x = obj;
                return bVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C40727h c40727h, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((b) create(c40727h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C40727h c40727h = (C40727h) this.f124873x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f124872w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf((this.f124874y && c40727h.m132197V() == EnumC37318b.PENDING) ? false : true);
            }
        }

        /* JADX INFO: renamed from: qj0.b$c$c, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42224c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f124875w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30420b f124876x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC38334b f124877y;

            /* JADX INFO: renamed from: qj0.b$c$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f124878w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C30420b f124879x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ AbstractC38334b f124880y;

                /* JADX INFO: renamed from: qj0.b$c$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$send$2$1$invokeSuspend$$inlined$filter$1$2", m100430f = "CommandChannel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42225a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f124882F;

                    /* JADX INFO: renamed from: G */
                    Object f124883G;

                    /* JADX INFO: renamed from: H */
                    int f124884H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f124885w;

                    /* JADX INFO: renamed from: x */
                    int f124886x;

                    /* JADX INFO: renamed from: y */
                    Object f124887y;

                    /* JADX INFO: renamed from: z */
                    Object f124888z;

                    public C42225a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f124885w = obj;
                        this.f124886x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, C30420b c30420b, AbstractC38334b abstractC38334b) {
                    this.f124878w = interfaceC13062m;
                    this.f124879x = c30420b;
                    this.f124880y = abstractC38334b;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42225a c42225a;
                    if (interfaceC30057d instanceof C42225a) {
                        c42225a = (C42225a) interfaceC30057d;
                        int i13 = c42225a.f124886x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42225a.f124886x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42225a = new C42225a(interfaceC30057d);
                        }
                    } else {
                        c42225a = new C42225a(interfaceC30057d);
                    }
                    Object obj2 = c42225a.f124885w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42225a.f124886x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f124878w;
                        if (this.f124879x.m92996h(this.f124880y, (C40727h) obj)) {
                            c42225a.f124887y = null;
                            c42225a.f124888z = null;
                            c42225a.f124882F = null;
                            c42225a.f124883G = null;
                            c42225a.f124884H = 0;
                            c42225a.f124886x = 1;
                            if (interfaceC13062m.emit(obj, c42225a) == enumC31071a) {
                                return enumC31071a;
                            }
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

            public C42224c(InterfaceC13058l interfaceC13058l, C30420b c30420b, AbstractC38334b abstractC38334b) {
                this.f124875w = interfaceC13058l;
                this.f124876x = c30420b;
                this.f124877y = abstractC38334b;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f124875w.collect(new a(interfaceC13062m, this.f124876x, this.f124877y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr, AbstractC38334b abstractC38334b, boolean z4, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124867y = bArr;
            this.f124868z = abstractC38334b;
            this.f124864E = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30420b.this.new c(this.f124867y, this.f124868z, this.f124864E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124865w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C42224c c42224c = new C42224c(new C13065m2(C30420b.this.responses, new a(C30420b.this, this.f124867y, null)), C30420b.this, this.f124868z);
            b bVar = new b(this.f124864E, null);
            this.f124865w = 1;
            Object objM36616z = AbstractC13091v.m36616z(c42224c, bVar, this);
            return objM36616z == enumC31071a ? enumC31071a : objM36616z;
        }
    }

    /* JADX INFO: renamed from: qj0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$start$1", m100430f = "CommandChannel.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124889w;

        /* JADX INFO: renamed from: qj0.b$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$start$1$1", m100430f = "CommandChannel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f124891w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f124892x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C30420b f124893y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30420b c30420b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f124893y = c30420b;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                a aVar = new a(this.f124893y, interfaceC30057d);
                aVar.f124892x = th3;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:8:0x002d  */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                String strM31996o;
                Throwable th3 = (Throwable) this.f124892x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f124891w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC34116n interfaceC34116n = this.f124893y.logger;
                if (th3 != null) {
                    strM31996o = AbstractC11895b.m31996o(" (", AbstractC22671h0.f89337a.getOrCreateKotlinClass(th3.getClass()).getSimpleName(), ")");
                    if (strM31996o == null) {
                        strM31996o = "";
                    }
                } else {
                    strM31996o = "";
                }
                interfaceC34116n.mo85216g(AbstractC11895b.m31996o("command: incoming ended", strM31996o, ", no more responses will arrive"), new AbstractC30556a.a[0]);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: qj0.b$d$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C30420b f124894w;

            /* JADX INFO: renamed from: qj0.b$d$b$a */
            @InterfaceC32271e(m100429c = "com.whoop.ble.device.CommandChannel$start$1$2", m100430f = "CommandChannel.kt", m100431l = {49, 49}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ b<T> f124895E;

                /* JADX INFO: renamed from: F */
                int f124896F;

                /* JADX INFO: renamed from: w */
                Object f124897w;

                /* JADX INFO: renamed from: x */
                Object f124898x;

                /* JADX INFO: renamed from: y */
                int f124899y;

                /* JADX INFO: renamed from: z */
                /* synthetic */ Object f124900z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(b<? super T> bVar, InterfaceC30057d<? super a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f124895E = bVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f124900z = obj;
                    this.f124896F |= Integer.MIN_VALUE;
                    return this.f124895E.emit(null, this);
                }
            }

            public b(C30420b c30420b) {
                this.f124894w = c30420b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L23;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(byte[] r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof qj0.C30420b.d.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    qj0.b$d$b$a r0 = (qj0.C30420b.d.b.a) r0
                    int r1 = r0.f124896F
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f124896F = r1
                    goto L18
                L13:
                    qj0.b$d$b$a r0 = new qj0.b$d$b$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f124900z
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f124896F
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L43
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r7 = r0.f124898x
                    zj0.h r7 = (zj0.C40727h) r7
                    java.lang.Object r7 = r0.f124897w
                    byte[] r7 = (byte[]) r7
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L6d
                L33:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3b:
                    java.lang.Object r7 = r0.f124897w
                    byte[] r7 = (byte[]) r7
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L53
                L43:
                    p505ts.AbstractC34132o.m107864I(r8)
                    qj0.b r8 = r6.f124894w
                    r0.f124897w = r5
                    r0.f124896F = r4
                    java.lang.Object r8 = qj0.C30420b.m92994f(r8, r7, r0)
                    if (r8 != r1) goto L53
                    goto L6c
                L53:
                    zj0.h r8 = (zj0.C40727h) r8
                    if (r8 == 0) goto L6d
                    qj0.b r7 = r6.f124894w
                    ec3.o1 r7 = qj0.C30420b.m92991c(r7)
                    r0.f124897w = r5
                    r0.f124898x = r5
                    r2 = 0
                    r0.f124899y = r2
                    r0.f124896F = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L6d
                L6c:
                    return r1
                L6d:
                    l83.a0 r7 = l83.C23454a0.f92919a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: qj0.C30420b.d.b.emit(byte[], q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30420b.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124889w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13100y c13100y = new C13100y(C30420b.this.incoming, new a(C30420b.this, null));
                b bVar = new b(C30420b.this);
                this.f124889w = 1;
                if (c13100y.collect(bVar, this) == enumC31071a) {
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

    public C30420b(InterfaceC35229a wire, InterfaceC4351m writeFrame, InterfaceC13058l incoming, InterfaceC2994c0 scope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(wire, "wire");
        AbstractC22676k.m65750j(writeFrame, "writeFrame");
        AbstractC22676k.m65750j(incoming, "incoming");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        this.wire = wire;
        this.writeFrame = writeFrame;
        this.incoming = incoming;
        this.scope = scope;
        this.logger = logger;
        this.responses = AbstractC13091v.m36592b(0, 0, null, 7);
        this.oneInFlight = AbstractC25438d.m74669a();
    }

    /* JADX INFO: renamed from: g */
    private final boolean m92995g(AbstractC38334b sent, C40727h response) {
        boolean z4 = sent.mo72387N() == response.m132195T();
        boolean z13 = response.m132195T() == 0 && InterfaceC36081g.m114591B(sent, null, 1, null) == response.m132193Q();
        if (!z4 && z13) {
            this.logger.mo85226q("Seq#0 workaround: matched " + response.m132193Q() + " by command type instead of sequence number", new AbstractC30556a.a[0]);
        }
        if (!z4 || InterfaceC36081g.m114591B(sent, null, 1, null) == response.m132193Q()) {
            return z4 || z13;
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        byte bMo72387N = sent.mo72387N();
        interfaceC34116n.mo85222m("Sequence " + ((int) bMo72387N) + " matched but command numbers differ: sent " + InterfaceC36081g.m114591B(sent, null, 1, null) + ", received " + response.m132193Q(), new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final boolean m92996h(AbstractC38334b sent, C40727h response) {
        try {
            return m92995g(sent, response);
        } catch (IndexOutOfBoundsException e5) {
            this.logger.mo85230v("command: skipped a response that would not decode", e5, new AbstractC30556a.a[0]);
            return false;
        } catch (BufferUnderflowException e13) {
            this.logger.mo85230v("command: skipped a response that would not decode", e13, new AbstractC30556a.a[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m92997i(byte[] bArr, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        try {
            return this.wire.mo93113b(bArr);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(interfaceC30057d.getContext());
            this.logger.mo85230v(AbstractC2875y.m8296i(bArr.length, "parse: dropped ", " bytes"), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m92998k(C30420b c30420b, AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = abstractC38334b.mo114592I();
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            z4 = abstractC38334b.getDualResponse();
        }
        return c30420b.m92999j(abstractC38334b, j13, z4, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7 A[Catch: all -> 0x010e, a -> 0x0143, TRY_ENTER, TryCatch #1 {a -> 0x0143, blocks: (B:14:0x0040, B:30:0x00e1, B:33:0x00e7, B:36:0x0111), top: B:50:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0111 A[Catch: all -> 0x010e, a -> 0x0143, TRY_LEAVE, TryCatch #1 {a -> 0x0143, blocks: (B:14:0x0040, B:30:0x00e1, B:33:0x00e7, B:36:0x0111), top: B:50:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00e7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0111, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX INFO: renamed from: j */
    public final Object m92999j(AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d<? super C40727h> interfaceC30057d) throws Throwable {
        b bVar;
        Object obj;
        ?? r10;
        AbstractC38334b abstractC38334b2;
        long j13;
        boolean z13;
        InterfaceC25435a interfaceC25435a;
        int i13;
        byte[] bArrMo93112a;
        int i14;
        InterfaceC25435a interfaceC25435a2;
        InterfaceC25435a interfaceC25435a3;
        C40727h c40727h;
        InterfaceC25435a interfaceC25435a4;
        C40727h c40727h2;
        Object obj2 = "command: sending ";
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f124859J;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f124859J = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM8751e = bVar2.f124857H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar2.f124859J;
        try {
            try {
                try {
                    if (i16 == 0) {
                        AbstractC34132o.m107864I(objM8751e);
                        InterfaceC25435a interfaceC25435a5 = this.oneInFlight;
                        abstractC38334b2 = abstractC38334b;
                        bVar2.f124860w = abstractC38334b2;
                        bVar2.f124861x = interfaceC25435a5;
                        bVar2.f124863z = j7;
                        bVar2.f124854E = z4;
                        bVar2.f124855F = 0;
                        bVar2.f124859J = 1;
                        if (interfaceC25435a5.mo68211b(bVar2) != enumC31071a) {
                            j13 = j7;
                            z13 = z4;
                            interfaceC25435a = interfaceC25435a5;
                            i13 = 0;
                        }
                        return enumC31071a;
                    }
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = (InterfaceC25435a) bVar2.f124861x;
                        abstractC38334b2 = (AbstractC38334b) bVar2.f124860w;
                        try {
                            try {
                                AbstractC34132o.m107864I(objM8751e);
                                interfaceC25435a3 = interfaceC25435a2;
                                c40727h2 = (C40727h) objM8751e;
                                if (c40727h2 != null) {
                                    this.logger.mo85216g("command: " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + " answered " + c40727h2.m132197V(), new AbstractC30556a.a[0]);
                                } else {
                                    this.logger.mo85226q("command: " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + " seq " + ((int) abstractC38334b2.mo72387N()) + " timed out", new AbstractC30556a.a[0]);
                                    c40727h2 = null;
                                }
                                c40727h = c40727h2;
                                interfaceC25435a4 = interfaceC25435a3;
                            } catch (Throwable th3) {
                                th = th3;
                                obj = null;
                                r10 = interfaceC25435a2;
                                r10.mo68214i(obj);
                                throw th;
                            }
                        } catch (a unused) {
                            this.logger.mo85226q("command: write failed for " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + ", not awaiting a response", new AbstractC30556a.a[0]);
                            c40727h = null;
                            interfaceC25435a4 = interfaceC25435a2;
                        }
                        interfaceC25435a4.mo68214i(null);
                        return c40727h;
                    }
                    int i17 = bVar2.f124855F;
                    z13 = bVar2.f124854E;
                    j13 = bVar2.f124863z;
                    InterfaceC25435a interfaceC25435a6 = (InterfaceC25435a) bVar2.f124861x;
                    AbstractC38334b abstractC38334b3 = (AbstractC38334b) bVar2.f124860w;
                    AbstractC34132o.m107864I(objM8751e);
                    i13 = i17;
                    abstractC38334b2 = abstractC38334b3;
                    interfaceC25435a = interfaceC25435a6;
                    c cVar = new c(bArrMo93112a, abstractC38334b2, z13, null);
                    bVar2.f124860w = abstractC38334b2;
                    bVar2.f124861x = interfaceC25435a;
                    bVar2.f124862y = null;
                    bVar2.f124863z = j13;
                    bVar2.f124854E = z13;
                    bVar2.f124855F = i14;
                    bVar2.f124856G = 0;
                    bVar2.f124859J = 2;
                    objM8751e = AbstractC3028k2.m8751e(j13, cVar, bVar2);
                    if (objM8751e != enumC31071a) {
                        interfaceC25435a3 = interfaceC25435a;
                        c40727h2 = (C40727h) objM8751e;
                        if (c40727h2 != null) {
                            this.logger.mo85216g("command: " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + " answered " + c40727h2.m132197V(), new AbstractC30556a.a[0]);
                        } else {
                            this.logger.mo85226q("command: " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + " seq " + ((int) abstractC38334b2.mo72387N()) + " timed out", new AbstractC30556a.a[0]);
                            c40727h2 = null;
                        }
                        c40727h = c40727h2;
                        interfaceC25435a4 = interfaceC25435a3;
                        interfaceC25435a4.mo68214i(null);
                        return c40727h;
                    }
                    return enumC31071a;
                } catch (a unused2) {
                    interfaceC25435a2 = interfaceC25435a;
                    this.logger.mo85226q("command: write failed for " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + ", not awaiting a response", new AbstractC30556a.a[0]);
                    c40727h = null;
                    interfaceC25435a4 = interfaceC25435a2;
                }
                byte b6 = this.sequence;
                this.sequence = (byte) (b6 + 1);
                abstractC38334b2.mo72388P(b6);
                bArrMo93112a = this.wire.mo93112a(abstractC38334b2);
                i14 = i13;
                this.logger.mo85216g("command: sending " + InterfaceC36081g.m114591B(abstractC38334b2, null, 1, null) + " seq " + ((int) abstractC38334b2.mo72387N()), new AbstractC30556a.a[0]);
            } catch (Throwable th4) {
                th = th4;
                obj2 = interfaceC25435a;
                obj = null;
                r10 = obj2;
                r10.mo68214i(obj);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m93000l() {
        AbstractC3006f0.m8732z(this.scope, null, null, new d(null), 3);
    }
}
