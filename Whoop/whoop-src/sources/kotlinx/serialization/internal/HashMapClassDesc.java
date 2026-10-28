package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lyc3/g;", "keyDesc", "valueDesc", "<init>", "(Lyc3/g;Lyc3/g;)V", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HashMapClassDesc extends MapLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapClassDesc(InterfaceC39443g keyDesc, InterfaceC39443g valueDesc) {
        super(CollectionDescriptorsKt.HASH_MAP_NAME, keyDesc, valueDesc, null);
        AbstractC22676k.m65750j(keyDesc, "keyDesc");
        AbstractC22676k.m65750j(valueDesc, "valueDesc");
    }
}
