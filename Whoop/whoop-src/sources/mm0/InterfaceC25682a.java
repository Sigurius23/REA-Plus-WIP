package mm0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u0006J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lmm0/a;", "", "", "uri", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lmm0/b;", "b", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "entry", "Ll83/a0;", "g", "(Lmm0/b;Lq83/d;)Ljava/lang/Object;", "scope", "a", "c", "f", "(Lq83/d;)Ljava/lang/Object;", "", "i", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25682a {

    /* JADX INFO: renamed from: mm0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.BFFCache", m100430f = "BFFCache.kt", m100431l = {11}, m100432m = "lastUpdated$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f101019E;

        /* JADX INFO: renamed from: w */
        Object f101020w;

        /* JADX INFO: renamed from: x */
        Object f101021x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f101022y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101022y = obj;
            this.f101019E |= Integer.MIN_VALUE;
            return InterfaceC25682a.m75618e(InterfaceC25682a.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    static Object m75618e(InterfaceC25682a interfaceC25682a, String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f101019E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f101019E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = interfaceC25682a.new a(interfaceC30057d);
            }
        } else {
            aVar = interfaceC25682a.new a(interfaceC30057d);
        }
        Object objMo75620b = aVar.f101022y;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f101019E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75620b);
            aVar.f101020w = null;
            aVar.f101021x = null;
            aVar.f101019E = 1;
            objMo75620b = interfaceC25682a.mo75620b(str, aVar);
            if (objMo75620b == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75620b);
        }
        C25683b c25683b = (C25683b) objMo75620b;
        if (c25683b != null) {
            return new Long(c25683b.getLastUpdated());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    Object mo75619a(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo75620b(String str, InterfaceC30057d<? super C25683b> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo75621c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo75622d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo75623f(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    Object mo75624g(C25683b c25683b, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    default Object mo75625h(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return m75618e(this, str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    Object mo75626i(InterfaceC30057d<? super Integer> interfaceC30057d);
}
