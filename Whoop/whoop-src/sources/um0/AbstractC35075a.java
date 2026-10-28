package um0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: um0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0019\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH¥@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H¥@¢\u0006\u0004\b\u001f\u0010\bJ\u001e\u0010 \u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H¥@¢\u0006\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lum0/a;", "", "<init>", "()V", "", "uri", "Lum0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "b", "", "g", "(Lq83/d;)Ljava/lang/Object;", "a", "Lum0/c;", "entry", "", "Lum0/f;", "scopes", "Ll83/a0;", "j", "(Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "e", "scope", "d", "keep", "c", "(ILq83/d;)Ljava/lang/Object;", "l", "(Lum0/c;Lq83/d;)Ljava/lang/Object;", "f", "i", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35075a {

    /* JADX INFO: renamed from: um0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.BffCacheDao", m100430f = "BffCacheDao.kt", m100431l = {33, 34, 36}, m100432m = "upsert$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f148808F;

        /* JADX INFO: renamed from: w */
        Object f148809w;

        /* JADX INFO: renamed from: x */
        Object f148810x;

        /* JADX INFO: renamed from: y */
        Object f148811y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f148812z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148812z = obj;
            this.f148808F |= Integer.MIN_VALUE;
            return AbstractC35075a.m110920k(AbstractC35075a.this, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static Object m110920k(AbstractC35075a abstractC35075a, C35077c c35077c, List<C35080f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        AbstractC35075a abstractC35075a2;
        List<C35080f> list2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f148808F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f148808F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = abstractC35075a.new a(interfaceC30057d);
            }
        } else {
            aVar = abstractC35075a.new a(interfaceC30057d);
        }
        Object obj = aVar.f148812z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f148808F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            aVar.f148809w = abstractC35075a;
            aVar.f148810x = c35077c;
            aVar.f148811y = list;
            aVar.f148808F = 1;
            if (abstractC35075a.mo18337l(c35077c, aVar) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            list = (List) aVar.f148811y;
            c35077c = (C35077c) aVar.f148810x;
            abstractC35075a = (AbstractC35075a) aVar.f148809w;
            AbstractC34132o.m107864I(obj);
        } else if (i14 == 2) {
            list2 = (List) aVar.f148811y;
            abstractC35075a2 = (AbstractC35075a) aVar.f148809w;
            AbstractC34132o.m107864I(obj);
            if (!list2.isEmpty()) {
                aVar.f148809w = null;
                aVar.f148810x = null;
                aVar.f148811y = null;
                aVar.f148808F = 3;
                if (abstractC35075a2.mo18335i(list2, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
        String uri = c35077c.getUri();
        aVar.f148809w = abstractC35075a;
        aVar.f148810x = null;
        aVar.f148811y = list;
        aVar.f148808F = 2;
        if (abstractC35075a.mo18332f(uri, aVar) != enumC31071a) {
            abstractC35075a2 = abstractC35075a;
            list2 = list;
            if (!list2.isEmpty()) {
                aVar.f148809w = null;
                aVar.f148810x = null;
                aVar.f148811y = null;
                aVar.f148808F = 3;
                if (abstractC35075a2.mo18335i(list2, aVar) == enumC31071a) {
                }
            }
            return c23454a0;
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo18327a(InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    public abstract Object mo18328b(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    public abstract Object mo18329c(int i13, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    public abstract Object mo18330d(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    public abstract Object mo18331e(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    public abstract Object mo18332f(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    public abstract Object mo18333g(InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    public abstract Object mo18334h(String str, InterfaceC30057d<? super C35078d> interfaceC30057d);

    /* JADX INFO: renamed from: i */
    public abstract Object mo18335i(List<C35080f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: j */
    public Object mo18336j(C35077c c35077c, List<C35080f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m110920k(this, c35077c, list, interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo18337l(C35077c c35077c, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
