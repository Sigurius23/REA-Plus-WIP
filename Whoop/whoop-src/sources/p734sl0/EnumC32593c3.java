package p734sl0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: sl0.c3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lsl0/c3;", "", "", "symbol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "next", "()Lsl0/c3;", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "DOT", "WHITE_DOT", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC32593c3 {
    DOT("•"),
    WHITE_DOT("◦");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String symbol;

    EnumC32593c3(String str) {
        this.symbol = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final EnumC32593c3 next() {
        return values()[(ordinal() + 1) % values().length];
    }
}
