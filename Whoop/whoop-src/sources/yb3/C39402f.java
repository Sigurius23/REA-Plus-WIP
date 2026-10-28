package yb3;

import p000.AbstractC11266d;
import s40.AbstractC32145e0;

/* JADX INFO: renamed from: yb3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C39402f {

    /* JADX INFO: renamed from: d */
    public static final C39402f f169565d = new C39402f();

    /* JADX INFO: renamed from: a */
    public final boolean f169566a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f169567b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f169568c;

    public C39402f() {
        boolean z4 = true;
        if (!AbstractC32145e0.m100094a("  ") && !AbstractC32145e0.m100094a("") && !AbstractC32145e0.m100094a("") && !AbstractC32145e0.m100094a("")) {
            z4 = false;
        }
        this.f169568c = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m125840a(StringBuilder sb4, String str) {
        AbstractC11266d.m30470x(Integer.MAX_VALUE, str, "bytesPerLine = ", ",", sb4);
        sb4.append('\n');
        sb4.append(str);
        sb4.append("bytesPerGroup = ");
        sb4.append(Integer.MAX_VALUE);
        sb4.append(",");
        sb4.append('\n');
        sb4.append(str);
        sb4.append("groupSeparator = \"");
        sb4.append("  ");
        sb4.append("\",");
        sb4.append('\n');
        sb4.append(str);
        sb4.append("byteSeparator = \"");
        sb4.append("");
        sb4.append("\",");
        sb4.append('\n');
        AbstractC11266d.m30444B(sb4, str, "bytePrefix = \"", "", "\",");
        sb4.append('\n');
        sb4.append(str);
        sb4.append("byteSuffix = \"");
        sb4.append("");
        sb4.append("\"");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("BytesHexFormat(\n");
        m125840a(sb4, "    ");
        sb4.append('\n');
        sb4.append(")");
        return sb4.toString();
    }
}
