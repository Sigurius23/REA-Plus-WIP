package kotlinx.serialization.internal;

import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lyc3/g;", "", "", "jsonCachedSerialNames", "(Lyc3/g;)Ljava/util/Set;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class JsonInternalDependenciesKt {
    @CoreFriendModuleApi
    public static final Set<String> jsonCachedSerialNames(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return Platform_commonKt.cachedSerialNames(interfaceC39443g);
    }
}
