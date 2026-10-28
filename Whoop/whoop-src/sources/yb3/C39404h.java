package yb3;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C39404h {

    /* JADX INFO: renamed from: d */
    public static final C39404h f169570d;

    /* JADX INFO: renamed from: a */
    public final boolean f169571a;

    /* JADX INFO: renamed from: b */
    public final C39402f f169572b;

    /* JADX INFO: renamed from: c */
    public final C39403g f169573c;

    static {
        C39402f c39402f = C39402f.f169565d;
        C39403g c39403g = C39403g.f169569a;
        f169570d = new C39404h(false, c39402f, c39403g);
        new C39404h(true, c39402f, c39403g);
    }

    public C39404h(boolean z4, C39402f bytes, C39403g number) {
        AbstractC22676k.m65750j(bytes, "bytes");
        AbstractC22676k.m65750j(number, "number");
        this.f169571a = z4;
        this.f169572b = bytes;
        this.f169573c = number;
    }

    public final String toString() {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("HexFormat(\n    upperCase = ");
        sbM53374o.append(this.f169571a);
        sbM53374o.append(",\n    bytes = BytesHexFormat(\n");
        this.f169572b.m125840a(sbM53374o, "        ");
        sbM53374o.append('\n');
        sbM53374o.append("    ),");
        sbM53374o.append('\n');
        sbM53374o.append("    number = NumberHexFormat(");
        sbM53374o.append('\n');
        this.f169573c.m125841a(sbM53374o, "        ");
        sbM53374o.append('\n');
        sbM53374o.append("    )");
        sbM53374o.append('\n');
        sbM53374o.append(")");
        return sbM53374o.toString();
    }
}
