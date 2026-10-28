package y02;

import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import ne3.C26622k;
import ne3.C26624l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import w53.C36845b;

/* JADX INFO: renamed from: y02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf63/c;", "Lne3/l;", "a", "(Lf63/c;Lq83/d;)Ljava/lang/Object;", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39025a {

    /* JADX INFO: renamed from: y02.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.network.http.response.HttpResponseByteStringKt", m100430f = "HttpResponseByteString.kt", m100431l = {9}, m100432m = "bodyByteString", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f167976E;

        /* JADX INFO: renamed from: F */
        int f167977F;

        /* JADX INFO: renamed from: w */
        Object f167978w;

        /* JADX INFO: renamed from: x */
        Object f167979x;

        /* JADX INFO: renamed from: y */
        Object f167980y;

        /* JADX INFO: renamed from: z */
        int f167981z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f167976E = obj;
            this.f167977F |= Integer.MIN_VALUE;
            return AbstractC39025a.m124453a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m124453a(AbstractC14155c abstractC14155c, InterfaceC30057d<? super C26624l> interfaceC30057d) {
        a aVar;
        C26622k c26622k;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f167977F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f167977F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f167976E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f167977F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C26622k c26622k2 = C26624l.f105882z;
            C36845b c36845bMo13321a = abstractC14155c.mo13321a();
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(byte[].class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(byte[].class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            aVar.f167978w = null;
            aVar.f167979x = null;
            aVar.f167980y = c26622k2;
            aVar.f167981z = 0;
            aVar.f167977F = 1;
            Object objM118137a = c36845bMo13321a.m118137a(c32236aM44445Y, aVar);
            if (objM118137a == enumC31071a) {
                return enumC31071a;
            }
            obj = objM118137a;
            c26622k = c26622k2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26622k = (C26622k) aVar.f167980y;
            AbstractC34132o.m107864I(obj);
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
        c26622k.getClass();
        return C26622k.m79242c(-1234567890, (byte[]) obj);
    }
}
