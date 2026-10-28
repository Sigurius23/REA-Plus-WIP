package pk0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import dk0.C12111k;
import ec3.AbstractC13091v;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import g83.C15578d;
import hk0.C17386u;
import hk0.EnumC17380o;
import hk0.EnumC17381p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import lt0.AbstractC24732i;
import lt0.AbstractC24734k;
import lt0.C24731h;
import lt0.C24736m;
import lt0.EnumC24737n;
import lt0.InterfaceC24729f;
import mt0.C25932b;
import mt0.C25933c;
import mt0.C25934d;
import mt0.C25935e;
import mt0.C25936f;
import mt0.C25938h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p167g5.C15486e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import us0.C35213i;
import us0.C35214j;
import us0.C35215k;
import us0.C35216l;
import us0.C35217m;
import us0.InterfaceC35212h;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: pk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u000274B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\nR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00132\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u001c2\n\u0010\u000b\u001a\u00060\nR\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\f*\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\f*\u00020/H\u0002¢\u0006\u0004\b2\u00101J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c03H\u0016¢\u0006\u0004\b4\u00105J!\u00107\u001a\u0004\u0018\u0001062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010C\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u001e\u0010D\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010L¨\u0006N"}, m65681d2 = {"Lpk0/a;", "Lpk0/c;", "Lbc3/c0;", "coroutineScope", "Lq83/j;", "threadSafeDispatcherContext", "Lus0/h;", "packetParsingAnalytics", "<init>", "(Lbc3/c0;Lq83/j;Lus0/h;)V", "Lpk0/a$b;", "packet", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpk0/a$b;)Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "e", "()Ljava/nio/ByteBuffer;", "buffer", "Ll83/a0;", "j", "(Ljava/nio/ByteBuffer;)V", "", "packets", "k", "(Ljava/util/List;)V", "Lst0/v;", "gen", "Llt0/k;", "g", "(Lpk0/a$b;Lst0/v;)Llt0/k;", "Lmt0/b;", "framedPacket", "n", "(Lmt0/b;Lst0/v;)V", "", "data", "o", "([BLst0/v;)V", "Llt0/i;", "frame", "Llt0/c;", "i", "(Llt0/i;Lmt0/b;)Llt0/c;", "Lhk0/u;", "f", "(Lhk0/u;Lst0/v;)V", "", "l", "(I)Ljava/lang/String;", "m", "Lec3/t1;", "b", "()Lec3/t1;", "Llt0/m;", "a", "([BLst0/v;)Llt0/m;", "Lbc3/c0;", "Lq83/j;", "c", "Lus0/h;", "Lg83/d;", "d", "Lg83/d;", "packetSubject", "", "Ljava/util/List;", "potentialPackets", "packetsToDrop", "Lg5/e;", "Lg5/e;", "bufferPool", "Ltr2/n;", "Ltr2/n;", "logger", "Lec3/o1;", "Lec3/o1;", "_packetsFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29331a implements InterfaceC29333c {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30063j threadSafeDispatcherContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC35212h packetParsingAnalytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15578d packetSubject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<b> potentialPackets;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<b> packetsToDrop;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C15486e bufferPool;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13072o1 _packetsFlow;

    /* JADX INFO: renamed from: pk0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lpk0/a$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "buffer", "", "length", "Ltr2/n;", "logger", "", "a", "(Ljava/nio/ByteBuffer;ILtr2/n;)Ljava/lang/String;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m89260a(ByteBuffer buffer, int length, InterfaceC34116n logger) {
            AbstractC22676k.m65750j(buffer, "buffer");
            AbstractC22676k.m65750j(logger, "logger");
            byte[] bArr = new byte[length];
            try {
                logger.mo85226q("Potential packet buffer: " + AbstractC40586b.m131619d(buffer), new AbstractC30556a.a[0]);
                buffer.get(bArr, 0, length);
                return AbstractC40586b.m131620e(bArr);
            } catch (BufferUnderflowException unused) {
                logger.mo85222m("Caught BufferUnderflowException while printing potential packet", new AbstractC30556a.a[0]);
                return "";
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: pk0.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lpk0/a$b;", "", "Llt0/i;", "frame", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Lpk0/a;Llt0/i;Ljava/nio/ByteBuffer;)V", "", "data", "Ll83/a0;", "a", "([B)V", "", "d", "()Z", "Llt0/i;", "c", "()Llt0/i;", "b", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "value", "Z", "e", "isFailure", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC24732i frame;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ByteBuffer buffer;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isFailure;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C29331a f118804d;

        public b(C29331a c29331a, AbstractC24732i frame, ByteBuffer buffer) {
            AbstractC22676k.m65750j(frame, "frame");
            AbstractC22676k.m65750j(buffer, "buffer");
            this.f118804d = c29331a;
            this.frame = frame;
            this.buffer = buffer;
        }

        /* JADX INFO: renamed from: a */
        public final void m89261a(byte[] data) {
            AbstractC22676k.m65750j(data, "data");
            if (this.buffer.remaining() >= data.length) {
                this.buffer.put(data);
            } else {
                this.f118804d.logger.mo85222m("Buffer overflow - dumping packet", new AbstractC30556a.a[0]);
                this.isFailure = true;
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ByteBuffer getBuffer() {
            return this.buffer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC24732i getFrame() {
            return this.frame;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m89264d() {
            return this.buffer.position() >= this.frame.m72418i();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsFailure() {
            return this.isFailure;
        }
    }

    /* JADX INFO: renamed from: pk0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118805a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f118806b;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f118805a = iArr;
            int[] iArr2 = new int[EnumC24737n.values().length];
            try {
                iArr2[EnumC24737n.FAIL_CRC32.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC24737n.FAIL_FRAME_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC24737n.FAIL_TOO_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC24737n.FAIL_UNALIGNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC24737n.FAIL_NO_PAYLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC24737n.FAIL_OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC24737n.FAIL_CRC16.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC24737n.FAIL_CRC8.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC24737n.SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            f118806b = iArr2;
        }
    }

    /* JADX INFO: renamed from: pk0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.strap.packetparsing.BlePacketReader$onCharacteristicChange$1", m100430f = "BlePacketReader.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118807w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC24734k f118809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC24734k abstractC24734k, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118809y = abstractC24734k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29331a.this.new d(this.f118809y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118807w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29331a.this._packetsFlow;
                AbstractC24734k abstractC24734k = this.f118809y;
                this.f118807w = 1;
                if (interfaceC13072o1.emit(abstractC24734k, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pk0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.strap.packetparsing.BlePacketReader$onCharacteristicChange$2", m100430f = "BlePacketReader.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118810w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC24734k f118812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC24734k abstractC24734k, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118812y = abstractC24734k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29331a.this.new e(this.f118812y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118810w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29331a.this._packetsFlow;
                AbstractC24734k abstractC24734k = this.f118812y;
                this.f118810w = 1;
                if (interfaceC13072o1.emit(abstractC24734k, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pk0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"pk0/a$f", "Llt0/c;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC24726c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ByteBuffer byteBuffer) {
            super(byteBuffer);
            AbstractC22676k.m65747g(byteBuffer);
        }
    }

    public C29331a(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, InterfaceC35212h interfaceC35212h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, (i13 & 2) != 0 ? AbstractC3076z.limitedParallelism$default(AbstractC3050q0.f12077a, 1, null, 2, null) : interfaceC30063j, interfaceC35212h);
    }

    /* JADX INFO: renamed from: e */
    private final ByteBuffer m89247e() {
        ByteBuffer byteBufferOrder = (ByteBuffer) this.bufferPool.mo43684b();
        if (byteBufferOrder == null) {
            byteBufferOrder = ByteBuffer.allocate(65535).order(AbstractC24727d.m72403a());
        }
        AbstractC22676k.m65747g(byteBufferOrder);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: f */
    private final void m89248f(C17386u packet, EnumC32978v gen) {
        if (packet.m49175S() == EnumC17380o.UNKNOWN) {
            this.logger.mo85226q(AbstractC31061c.m95640p("Rev2 unknown packet category: category_byte=0x", m89254l(packet.m49176T()), ", whoop_device=", gen.getCodeName()), new AbstractC30556a.a[0]);
            this.packetParsingAnalytics.mo71211a(new C35216l(gen));
            return;
        }
        if (packet.m49178V() == EnumC17381p.UNKNOWN) {
            String lowerCase = packet.m49175S().name().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM89255m = m89255m(packet.m49177U());
            String codeName = gen.getCodeName();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Rev2 unknown packet type: type_byte=0x", strM89255m, ", category=", lowerCase, ", whoop_device=");
            sbM32001t.append(codeName);
            interfaceC34116n.mo85226q(sbM32001t.toString(), new AbstractC30556a.a[0]);
            this.packetParsingAnalytics.mo71212b(new C35217m(gen, lowerCase));
        }
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC24734k m89249g(b packet, EnumC32978v gen) {
        AbstractC24732i c25933c;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(Arrays.copyOf(packet.getBuffer().array(), packet.getFrame().m72418i())).order(AbstractC24727d.m72403a());
        byteBufferOrder.limit(packet.getFrame().m72418i());
        switch (c.f118805a[gen.ordinal()]) {
            case 1:
                c25933c = new C25933c(byteBufferOrder);
                break;
            case 2:
                c25933c = new C25935e(byteBufferOrder);
                break;
            case 3:
                ByteBuffer byteBufferOrder2 = byteBufferOrder.order(AbstractC24727d.m72403a());
                AbstractC22676k.m65749i(byteBufferOrder2, "order(...)");
                c25933c = new C25936f(byteBufferOrder2);
                break;
            case 4:
                c25933c = new C25934d(byteBufferOrder);
                break;
            case 5:
            case 6:
                c25933c = new C25938h(byteBufferOrder);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C25932b c25932bM89280h = C29332b.f118813a.m89280h(c25933c);
        if (c25932bM89280h != null) {
            AbstractC24726c abstractC24726cM89251i = m89251i(c25933c, c25932bM89280h);
            if (abstractC24726cM89251i != null) {
                if (abstractC24726cM89251i instanceof C17386u) {
                    m89248f((C17386u) abstractC24726cM89251i, gen);
                }
                return new C24736m(c25932bM89280h, abstractC24726cM89251i);
            }
            this.logger.mo85222m(AbstractC11266d.m30461o("Error reading packet from data: ", AbstractC40586b.m131617b(byteBufferOrder)), new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85222m("Found a Packet Frame but couldn't parse the Framed Packet. Dropping the data.", new AbstractC30556a.a[0]);
        }
        C25932b c25932b = new C25932b(c25933c);
        if (c25932bM89280h == null) {
            m89256n(c25932b, gen);
        }
        AbstractC24726c abstractC24726cM89251i2 = m89251i(c25933c, c25932b);
        if (abstractC24726cM89251i2 == null) {
            abstractC24726cM89251i2 = new f(byteBufferOrder);
        }
        return new C24731h(c25932b, abstractC24726cM89251i2);
    }

    /* JADX INFO: renamed from: h */
    private final String m89250h(b packet) {
        return INSTANCE.m89260a(packet.getBuffer(), packet.getFrame().m72413d(), this.logger);
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC24726c m89251i(AbstractC24732i frame, C25932b framedPacket) {
        return frame instanceof C25938h ? C29334d.f118823a.m89289h(framedPacket) : C29332b.f118813a.m89281k(framedPacket);
    }

    /* JADX INFO: renamed from: j */
    private final void m89252j(ByteBuffer buffer) {
        buffer.clear();
        buffer.order(AbstractC24727d.m72403a());
        this.bufferPool.mo43683a(buffer);
    }

    /* JADX INFO: renamed from: k */
    private final void m89253k(List<b> packets) {
        Iterator<b> it = packets.iterator();
        while (it.hasNext()) {
            m89252j(it.next().getBuffer());
        }
    }

    /* JADX INFO: renamed from: l */
    private final String m89254l(int i13) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
    }

    /* JADX INFO: renamed from: m */
    private final String m89255m(int i13) {
        return String.format("%04X", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
    }

    /* JADX INFO: renamed from: n */
    private final void m89256n(C25932b framedPacket, EnumC32978v gen) {
        EnumC24737n enumC24737nM76713j = framedPacket.m76713j();
        switch (c.f118806b[enumC24737nM76713j.ordinal()]) {
            case 1:
                this.packetParsingAnalytics.mo71215e(new C35214j(gen));
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.packetParsingAnalytics.mo71214d(new C35215k(gen, enumC24737nM76713j));
                return;
            case 7:
            case 8:
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m89257o(byte[] data, EnumC32978v gen) {
        AbstractC24732i abstractC24732iM89278a = C29332b.f118813a.m89278a(data, gen);
        if (abstractC24732iM89278a != null && abstractC24732iM89278a.mo72427r(true) == EnumC24737n.FAIL_CRC16) {
            this.packetParsingAnalytics.mo71213c(new C35213i(gen));
        }
    }

    @Override // pk0.InterfaceC29333c
    /* JADX INFO: renamed from: a */
    public synchronized C24736m mo89258a(byte[] data, EnumC32978v gen) {
        C24736m c24736m;
        try {
            AbstractC22676k.m65750j(data, "data");
            AbstractC22676k.m65750j(gen, "gen");
            AbstractC24732i abstractC24732iM89279b = C29332b.f118813a.m89279b(data, gen);
            if (abstractC24732iM89279b != null) {
                this.potentialPackets.add(new b(this, abstractC24732iM89279b, m89247e()));
            } else {
                m89257o(data, gen);
            }
            c24736m = null;
            boolean z4 = false;
            for (b bVar : this.potentialPackets) {
                bVar.m89261a(data);
                if (bVar.getIsFailure()) {
                    this.logger.mo85226q("Dropping a failed packet: " + m89250h(bVar), new AbstractC30556a.a[0]);
                    this.packetsToDrop.add(bVar);
                } else if (bVar.m89264d()) {
                    AbstractC24734k abstractC24734kM89249g = m89249g(bVar, gen);
                    if (abstractC24734kM89249g instanceof C24736m) {
                        c24736m = (C24736m) abstractC24734kM89249g;
                        this.packetSubject.onNext(abstractC24734kM89249g);
                        AbstractC3006f0.m8732z(this.coroutineScope, this.threadSafeDispatcherContext, null, new d(abstractC24734kM89249g, null), 2);
                        if (!(abstractC24734kM89249g.getPacket() instanceof InterfaceC24729f) && !(abstractC24734kM89249g.getPacket() instanceof C12111k)) {
                            this.logger.mo85228t("got packet " + abstractC24734kM89249g.getPacket(), new AbstractC30556a.a[0]);
                        }
                        z4 = true;
                    } else {
                        if (!(abstractC24734kM89249g instanceof C24731h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.logger.mo85226q("Found a complete packet which couldn't be parsed: " + m89250h(bVar), new AbstractC30556a.a[0]);
                        this.packetSubject.onNext(abstractC24734kM89249g);
                        AbstractC3006f0.m8732z(this.coroutineScope, this.threadSafeDispatcherContext, null, new e(abstractC24734kM89249g, null), 2);
                    }
                } else {
                    continue;
                }
            }
            if (z4) {
                if (this.potentialPackets.size() > 1) {
                    this.logger.mo85226q("Found a packet while we were considering " + this.potentialPackets.size() + " possibilities", new AbstractC30556a.a[0]);
                }
                m89253k(this.potentialPackets);
                this.potentialPackets.clear();
                this.packetsToDrop.clear();
            } else if (!this.packetsToDrop.isEmpty()) {
                m89253k(this.packetsToDrop);
                this.potentialPackets.removeAll(this.packetsToDrop);
                this.packetsToDrop.clear();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return c24736m;
    }

    @Override // pk0.InterfaceC29333c
    /* JADX INFO: renamed from: b */
    public InterfaceC13087t1 mo89259b() {
        return AbstractC13091v.m36597g(this._packetsFlow);
    }

    public C29331a(InterfaceC2994c0 coroutineScope, InterfaceC30063j threadSafeDispatcherContext, InterfaceC35212h packetParsingAnalytics) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(threadSafeDispatcherContext, "threadSafeDispatcherContext");
        AbstractC22676k.m65750j(packetParsingAnalytics, "packetParsingAnalytics");
        this.coroutineScope = coroutineScope;
        this.threadSafeDispatcherContext = threadSafeDispatcherContext;
        this.packetParsingAnalytics = packetParsingAnalytics;
        this.packetSubject = new C15578d();
        this.potentialPackets = new ArrayList();
        this.packetsToDrop = new ArrayList();
        this.bufferPool = new C15486e(5);
        this.logger = InterfaceC34116n.INSTANCE.m107848a("BlePacketReader");
        this._packetsFlow = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38982w, 2);
    }
}
