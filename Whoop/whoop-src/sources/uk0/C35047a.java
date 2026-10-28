package uk0;

import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Luk0/a;", "", "<init>", "()V", "", "byteArray", "", "a", "([B)Ljava/lang/String;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35047a {

    /* JADX INFO: renamed from: a */
    public static final C35047a f148537a = new C35047a();

    private C35047a() {
    }

    /* JADX INFO: renamed from: a */
    public final String m110781a(byte[] byteArray) {
        AbstractC22676k.m65750j(byteArray, "byteArray");
        StringBuilder sb4 = new StringBuilder(byteArray.length * 2);
        for (byte b : byteArray) {
            sb4.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            sb4.append('-');
        }
        sb4.setLength(sb4.length() - 1);
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
