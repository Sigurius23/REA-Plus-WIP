package p715kotlin.reflect.jvm.internal;

import j93.EnumC21466f0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21486s;
import j93.InterfaceC21493z;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/ReflectKProperty;", "V", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Lj93/z;", "", "getSignature", "()Ljava/lang/String;", "signature", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ReflectKProperty<V> extends InterfaceC21493z, ReflectKCallable<V> {
    @Override // j93.InterfaceC21459c
    /* synthetic */ Object call(Object... objArr);

    @Override // j93.InterfaceC21459c
    /* synthetic */ Object callBy(Map map);

    @Override // j93.InterfaceC21457b
    /* synthetic */ List getAnnotations();

    @Override // j93.InterfaceC21493z
    /* synthetic */ InterfaceC21486s getGetter();

    Field getJavaField();

    @Override // j93.InterfaceC21459c
    /* synthetic */ String getName();

    @Override // j93.InterfaceC21459c
    /* synthetic */ List getParameters();

    @Override // j93.InterfaceC21459c
    /* synthetic */ InterfaceC21456a0 getReturnType();

    String getSignature();

    @Override // j93.InterfaceC21459c
    /* synthetic */ List getTypeParameters();

    @Override // j93.InterfaceC21459c
    /* synthetic */ EnumC21466f0 getVisibility();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isAbstract();

    @Override // j93.InterfaceC21493z
    /* synthetic */ boolean isConst();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isFinal();

    @Override // j93.InterfaceC21493z
    /* synthetic */ boolean isLateinit();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isOpen();

    @Override // j93.InterfaceC21459c
    /* synthetic */ boolean isSuspend();
}
