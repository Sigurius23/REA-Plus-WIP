package io.getstream.chat.android.core.internal.lazy;

import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.HashMap;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003B+\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096B¢\u0006\u0004\b\n\u0010\u000bR0\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR2\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;", "T", "R", "Lkotlin/Function2;", "Lq83/d;", "", "initializer", "<init>", "(Lc93/m;)V", "param", "invoke", "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "Lc93/m;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "values", "Ljava/util/HashMap;", "Lmc3/a;", "mutex", "Lmc3/a;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ParameterizedLazy<T, R> implements InterfaceC4351m {
    private final InterfaceC4351m initializer;
    private final InterfaceC25435a mutex;
    private HashMap<T, R> values;

    /* JADX INFO: renamed from: io.getstream.chat.android.core.internal.lazy.ParameterizedLazy$invoke$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.internal.lazy.ParameterizedLazy", m100430f = "ParameterizedLazy.kt", m100431l = {63, 43}, m100432m = "invoke")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194621 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ParameterizedLazy<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194621(ParameterizedLazy<T, R> parameterizedLazy, InterfaceC30057d<? super C194621> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = parameterizedLazy;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.invoke((Object) null, (InterfaceC30057d) this);
        }
    }

    public ParameterizedLazy(InterfaceC4351m initializer) {
        AbstractC22676k.m65750j(initializer, "initializer");
        this.initializer = initializer;
        this.values = new HashMap<>();
        this.mutex = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c93.InterfaceC4351m
    public final Object invoke(T t14, InterfaceC30057d<? super R> interfaceC30057d) throws Throwable {
        C194621 c194621;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        Object obj;
        Object obj2;
        if (interfaceC30057d instanceof C194621) {
            c194621 = (C194621) interfaceC30057d;
            int i14 = c194621.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c194621.label = i14 - Integer.MIN_VALUE;
            } else {
                c194621 = new C194621(this, interfaceC30057d);
            }
        } else {
            c194621 = new C194621(this, interfaceC30057d);
        }
        Object obj3 = c194621.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c194621.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj3);
                R r10 = this.values.get(t14);
                if (r10 != null) {
                    return r10;
                }
                interfaceC25435a = this.mutex;
                c194621.L$0 = t14;
                c194621.L$1 = interfaceC25435a;
                c194621.I$0 = 0;
                c194621.label = 1;
                if (interfaceC25435a.mo68211b(c194621) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c194621.L$1;
                obj2 = c194621.L$0;
                try {
                    AbstractC34132o.m107864I(obj3);
                    this.values.put(obj2, obj3);
                    obj = obj3;
                    interfaceC25435a = interfaceC25435a2;
                    interfaceC25435a.mo68214i(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = c194621.I$0;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c194621.L$1;
            Object obj4 = c194621.L$0;
            AbstractC34132o.m107864I(obj3);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            t14 = (T) obj4;
            obj = this.values.get(t14);
            if (obj == null) {
                InterfaceC4351m interfaceC4351m = this.initializer;
                c194621.L$0 = t14;
                c194621.L$1 = interfaceC25435a;
                c194621.I$0 = i13;
                c194621.I$1 = 0;
                c194621.label = 2;
                Object objInvoke = interfaceC4351m.invoke(t14, c194621);
                if (objInvoke != enumC31071a) {
                    obj2 = t14;
                    interfaceC25435a2 = interfaceC25435a;
                    obj3 = objInvoke;
                    this.values.put(obj2, obj3);
                    obj = obj3;
                    interfaceC25435a = interfaceC25435a2;
                }
                return enumC31071a;
            }
            interfaceC25435a.mo68214i(null);
            return obj;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }
}
