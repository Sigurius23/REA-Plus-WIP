package o30;

import ge3.AbstractC15751g;
import java.util.List;
import m83.AbstractC25260n;
import p350nw.C27188i;
import t83.C33617b;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF13' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: o30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC27505c {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC27505c[] f110774y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f110775z;

    /* JADX INFO: renamed from: w */
    public final List f110776w;

    /* JADX INFO: renamed from: x */
    public final C27188i f110777x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC27505c EF13;

    static {
        List listM118958J = AbstractC37056f.m118958J("F055545342");
        EnumC27503a[] enumC27503aArr = EnumC27503a.f110768x;
        EnumC27505c[] enumC27505cArr = {new EnumC27505c("TestRsa", 0, listM118958J), new EnumC27505c("TestEc", 1, AbstractC37056f.m118958J("F155545342")), new EnumC27505c("Visa", 2, AbstractC37056f.m118958J("A000000003")), new EnumC27505c("Mastercard", 3, AbstractC37056f.m118958J("A000000004")), new EnumC27505c("Amex", 4, AbstractC37056f.m118958J("A000000025")), new EnumC27505c("Discover", 5, AbstractC37056f.m118959K("A000000152", "A000000324"), null), new EnumC27505c("CartesBancaires", 6, AbstractC37056f.m118958J("A000000042"))};
        f110774y = enumC27505cArr;
        f110775z = AbstractC15751g.m44468u(enumC27505cArr);
        AbstractC25260n.m74059b1(new String[]{".crt", ".cer", ".pem"});
    }

    public EnumC27505c(String str, int i13, List list, C27188i c27188i) {
        super(str, i13);
        this.f110776w = list;
        this.f110777x = c27188i;
    }

    public static EnumC27505c valueOf(String str) {
        return (EnumC27505c) Enum.valueOf(EnumC27505c.class, str);
    }

    public static EnumC27505c[] values() {
        return (EnumC27505c[]) f110774y.clone();
    }

    public /* synthetic */ EnumC27505c(String str, int i13, List list) {
        this(str, i13, list, C27188i.f108836x);
    }
}
