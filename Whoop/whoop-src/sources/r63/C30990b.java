package r63;

import java.util.List;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r63.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C30990b extends AbstractC30993e {

    /* JADX INFO: renamed from: E */
    public int f127955E;

    /* JADX INFO: renamed from: x */
    public final List f127956x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC30063j f127957y;

    /* JADX INFO: renamed from: z */
    public Object f127958z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30990b(Object context, List interceptors, Object subject, InterfaceC30063j interfaceC30063j) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(interceptors, "interceptors");
        AbstractC22676k.m65750j(subject, "subject");
        this.f127956x = interceptors;
        this.f127957y = interfaceC30063j;
        this.f127958z = subject;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: a */
    public final Object mo95523a(Object obj, AbstractC32269c abstractC32269c) {
        this.f127955E = 0;
        AbstractC22676k.m65750j(obj, "<set-?>");
        this.f127958z = obj;
        return mo95525c(abstractC32269c);
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: b */
    public final Object mo95524b() {
        return this.f127958z;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: c */
    public final Object mo95525c(InterfaceC30057d interfaceC30057d) {
        int i13 = this.f127955E;
        if (i13 < 0) {
            return this.f127958z;
        }
        if (i13 < this.f127956x.size()) {
            return m95527e(interfaceC30057d);
        }
        this.f127955E = -1;
        return this.f127958z;
    }

    @Override // r63.AbstractC30993e
    /* JADX INFO: renamed from: d */
    public final Object mo95526d(Object obj, InterfaceC30057d interfaceC30057d) {
        AbstractC22676k.m65750j(obj, "<set-?>");
        this.f127958z = obj;
        return mo95525c(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m95527e(InterfaceC30057d interfaceC30057d) {
        C30989a c30989a;
        C30990b c30990b;
        Function3 function3;
        Object obj;
        if (interfaceC30057d instanceof C30989a) {
            c30989a = (C30989a) interfaceC30057d;
            int i13 = c30989a.f127954z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c30989a.f127954z = i13 - Integer.MIN_VALUE;
            } else {
                c30989a = new C30989a(this, interfaceC30057d);
            }
        } else {
            c30989a = new C30989a(this, interfaceC30057d);
        }
        Object obj2 = c30989a.f127952x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c30989a.f127954z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c30990b = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30990b = c30989a.f127951w;
            AbstractC34132o.m107864I(obj2);
        }
        do {
            int i15 = c30990b.f127955E;
            if (i15 != -1) {
                List list = c30990b.f127956x;
                if (i15 >= list.size()) {
                    c30990b.f127955E = -1;
                } else {
                    function3 = (Function3) list.get(i15);
                    c30990b.f127955E = i15 + 1;
                    AbstractC22676k.m65748h(function3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    obj = c30990b.f127958z;
                    c30989a.f127951w = c30990b;
                    c30989a.f127954z = 1;
                }
            }
            return c30990b.f127958z;
        } while (function3.invoke(c30990b, obj, c30989a) != enumC31071a);
        return enumC31071a;
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f127957y;
    }
}
