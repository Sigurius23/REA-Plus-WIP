package eg2;

import c31.EnumC3920d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import vf2.AbstractC35950b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INTRO_V2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: eg2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m65681d2 = {"Leg2/k;", "", "Lcom/whoop/design/util/TextResource;", "buttonText", "", "filledCount", "Lc31/d;", "buttonState", "<init>", "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V", "Lcom/whoop/design/util/TextResource;", "getButtonText", "()Lcom/whoop/design/util/TextResource;", "I", "getFilledCount", "()I", "Lc31/d;", "getButtonState", "()Lc31/d;", "INTRO_V2", "INTRO", "INPUT", "ENTER_CODE", "COMPLETED", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC13178k {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC13178k[] $VALUES;
    public static final EnumC13178k COMPLETED;
    public static final EnumC13178k ENTER_CODE;
    public static final EnumC13178k INPUT;
    public static final EnumC13178k INTRO;
    public static final EnumC13178k INTRO_V2;
    private final EnumC3920d buttonState;
    private final TextResource buttonText;
    private final int filledCount;

    private static final /* synthetic */ EnumC13178k[] $values() {
        return new EnumC13178k[]{INTRO_V2, INTRO, INPUT, ENTER_CODE, COMPLETED};
    }

    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153056A);
        EnumC3920d enumC3920d = EnumC3920d.FILLED;
        INTRO_V2 = new EnumC13178k("INTRO_V2", 0, c8688bM21277k, 0, enumC3920d);
        INTRO = new EnumC13178k("INTRO", 1, AbstractC8693b.m21277k(AbstractC35950b.f153106z), 0, enumC3920d);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC35950b.f153096p);
        EnumC3920d enumC3920d2 = EnumC3920d.PROGRESS;
        INPUT = new EnumC13178k("INPUT", 2, c8688bM21277k2, 35, enumC3920d2);
        ENTER_CODE = new EnumC13178k("ENTER_CODE", 3, AbstractC8693b.m21277k(AbstractC35950b.f153090j), 65, enumC3920d2);
        COMPLETED = new EnumC13178k("COMPLETED", 4, AbstractC8693b.m21277k(AbstractC35950b.f153082b), 0, enumC3920d);
        EnumC13178k[] enumC13178kArr$values = $values();
        $VALUES = enumC13178kArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC13178kArr$values);
    }

    private EnumC13178k(String str, int i13, TextResource textResource, int i14, EnumC3920d enumC3920d) {
        super(str, i13);
        this.buttonText = textResource;
        this.filledCount = i14;
        this.buttonState = enumC3920d;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC13178k valueOf(String str) {
        return (EnumC13178k) Enum.valueOf(EnumC13178k.class, str);
    }

    public static EnumC13178k[] values() {
        return (EnumC13178k[]) $VALUES.clone();
    }

    public final EnumC3920d getButtonState() {
        return this.buttonState;
    }

    public final TextResource getButtonText() {
        return this.buttonText;
    }

    public final int getFilledCount() {
        return this.filledCount;
    }
}
