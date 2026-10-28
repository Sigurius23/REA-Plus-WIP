package p715kotlin.reflect.jvm.internal;

import j93.EnumC21483p;
import j93.InterfaceC21456a0;
import j93.InterfaceC21484q;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/ReflectKParameter;", "Lj93/q;", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "getCallable", "()Lkotlin/reflect/jvm/internal/ReflectKCallable;", "callable", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ReflectKParameter extends InterfaceC21484q {
    @Override // j93.InterfaceC21457b
    /* synthetic */ List getAnnotations();

    ReflectKCallable<?> getCallable();

    @Override // j93.InterfaceC21484q
    /* synthetic */ int getIndex();

    @Override // j93.InterfaceC21484q
    /* synthetic */ EnumC21483p getKind();

    @Override // j93.InterfaceC21484q
    /* synthetic */ String getName();

    @Override // j93.InterfaceC21484q
    /* synthetic */ InterfaceC21456a0 getType();

    @Override // j93.InterfaceC21484q
    /* synthetic */ boolean isOptional();

    @Override // j93.InterfaceC21484q
    /* synthetic */ boolean isVararg();
}
