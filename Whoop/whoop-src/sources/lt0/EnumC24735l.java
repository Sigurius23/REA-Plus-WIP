package lt0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: lt0.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m65681d2 = {"Llt0/l;", "Llt0/a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "", "byteValue", "B", "getByteValue", "()B", "Companion", "a", "PUFFIN_GET_HELLO", "PUFFIN_START_FW_LOAD", "PUFFIN_LOAD_FW_DATA", "PUFFIN_PROCESS_FW", "HISTORICAL_PULL_ABORT", "SEND_HISTORICAL_DATA", "HISTORICAL_PULL_RESULT", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC24735l implements InterfaceC24724a {
    PUFFIN_GET_HELLO(2),
    PUFFIN_START_FW_LOAD(3),
    PUFFIN_LOAD_FW_DATA(4),
    PUFFIN_PROCESS_FW(6),
    HISTORICAL_PULL_ABORT(20),
    SEND_HISTORICAL_DATA(22),
    HISTORICAL_PULL_RESULT(23);

    private final byte byteValue = (byte) getValue();
    private final int value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lt0.l$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llt0/l$a;", "", "<init>", "()V", "", "value", "Llt0/l;", "a", "(B)Llt0/l;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC24735l m72430a(byte value) {
            for (EnumC24735l enumC24735l : EnumC24735l.values()) {
                if (enumC24735l.getByteValue() == value) {
                    return enumC24735l;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    EnumC24735l(int i13) {
        this.value = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // lt0.InterfaceC24724a
    public /* bridge */ String commandName() {
        return super.commandName();
    }

    @Override // lt0.InterfaceC24724a
    public byte getByteValue() {
        return this.byteValue;
    }

    @Override // lt0.InterfaceC24724a
    public int getValue() {
        return this.value;
    }
}
