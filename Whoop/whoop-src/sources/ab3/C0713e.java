package ab3;

import java.util.Arrays;
import lb3.AbstractC23811y;
import o93.AbstractC27736h;
import o93.EnumC27738j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;

/* JADX INFO: renamed from: ab3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0713e extends AbstractC0724p {
    public C0713e(char c3) {
        super(Character.valueOf(c3));
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC22676k.m65750j(module, "module");
        AbstractC27736h abstractC27736hMo78661c = module.mo78661c();
        abstractC27736hMo78661c.getClass();
        return abstractC27736hMo78661c.m83831t(EnumC27738j.CHAR);
    }

    @Override // ab3.AbstractC0715g
    public final String toString() {
        String strValueOf;
        Object obj = this.f2696a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : "?";
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
