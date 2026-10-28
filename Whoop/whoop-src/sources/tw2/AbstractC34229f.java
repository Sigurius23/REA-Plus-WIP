package tw2;

import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tw2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"", "maxBytes", "Lkotlin/Function1;", "Ltw2/a;", "", "encode", "b", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)[B", "", "byteCount", "a", "(I)J", "", "Ljava/util/List;", "getENCODE_LADDER", "()Ljava/util/List;", "ENCODE_LADDER", "whoop-action_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34229f {

    /* JADX INFO: renamed from: a */
    private static final List<C34224a> f143596a = AbstractC37056f.m118959K(new C34224a(90, false), new C34224a(80, false), new C34224a(70, false), new C34224a(90, true), new C34224a(80, true), new C34224a(70, true));

    /* JADX INFO: renamed from: a */
    public static final long m108191a(int i13) {
        return ((long) ((i13 + 2) / 3)) * 4;
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m108192b(Long l7, Function1 encode) {
        AbstractC22676k.m65750j(encode, "encode");
        if (l7 != null && l7.longValue() <= 0) {
            return null;
        }
        Iterator<C34224a> it = f143596a.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) encode.invoke(it.next());
            if (l7 == null || m108191a(bArr.length) <= l7.longValue()) {
                return bArr;
            }
        }
        return null;
    }
}
