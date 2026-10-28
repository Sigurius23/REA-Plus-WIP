package ti1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ti1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lti1/e;", "", "", "index", "", "identity", "Lcom/whoop/design/util/TextResource;", "label", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/design/util/TextResource;)V", "I", "getIndex", "()I", "Ljava/lang/String;", "getIdentity", "()Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "getLabel", "()Lcom/whoop/design/util/TextResource;", "Companion", "a", "LastNight", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC33853e {
    LastNight(0, "lastnight", AbstractC8693b.m21277k(AbstractC33852d.f141773f));

    private final String identity;
    private final int index;
    private final TextResource label;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    EnumC33853e(int i13, String str, TextResource textResource) {
        this.index = i13;
        this.identity = str;
        this.label = textResource;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getIdentity() {
        return this.identity;
    }

    public final int getIndex() {
        return this.index;
    }

    public final TextResource getLabel() {
        return this.label;
    }
}
