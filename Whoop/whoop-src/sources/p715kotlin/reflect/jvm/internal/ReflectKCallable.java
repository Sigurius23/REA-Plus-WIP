package p715kotlin.reflect.jvm.internal;

import j93.EnumC21466f0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21459c;
import j93.InterfaceC21484q;
import java.util.List;
import java.util.Map;
import m93.InterfaceC25339g;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/ReflectKCallable;", "R", "Lj93/c;", "", "Lj93/q;", "", "args", "Lq83/d;", "continuationArgument", "callDefaultMethod", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "getRawBoundReceiver", "()Ljava/lang/Object;", "rawBoundReceiver", "", "getReceiverParameters", "()Ljava/util/List;", "receiverParameters", "Lm93/g;", "getCaller", "()Lm93/g;", "caller", "getDefaultCaller", "defaultCaller", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ReflectKCallable<R> extends InterfaceC21459c {
    @Override // j93.InterfaceC21459c
    /* synthetic */ Object call(Object... objArr);

    @Override // j93.InterfaceC21459c
    /* synthetic */ Object callBy(Map map);

    R callDefaultMethod(Map<InterfaceC21484q, ? extends Object> args, InterfaceC30057d<?> continuationArgument);

    @Override // j93.InterfaceC21457b
    /* synthetic */ List getAnnotations();

    InterfaceC25339g getCaller();

    KDeclarationContainerImpl getContainer();

    InterfaceC25339g getDefaultCaller();

    @Override // j93.InterfaceC21459c
    /* synthetic */ String getName();

    @Override // j93.InterfaceC21459c
    /* synthetic */ List getParameters();

    Object getRawBoundReceiver();

    List<InterfaceC21484q> getReceiverParameters();

    @Override // j93.InterfaceC21459c
    /* synthetic */ InterfaceC21456a0 getReturnType();

    @Override // j93.InterfaceC21459c
    /* synthetic */ List getTypeParameters();

    @Override // j93.InterfaceC21459c
    /* synthetic */ EnumC21466f0 getVisibility();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isAbstract();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isFinal();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isOpen();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isSuspend();
}
