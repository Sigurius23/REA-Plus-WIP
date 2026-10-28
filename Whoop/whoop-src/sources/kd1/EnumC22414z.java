package kd1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: kd1.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lkd1/z;", "", "", "symbol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/whoop/design/util/TextResource;", "toTextResource", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "BULLET", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22414z {
    BULLET("•");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String symbol;

    EnumC22414z(String str) {
        this.symbol = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final TextResource toTextResource() {
        return AbstractC8693b.m21278l(this.symbol);
    }
}
