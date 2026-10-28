package kotlinx.serialization.internal;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "Lj93/d;", "key", "", "Lj93/a0;", "types", "Ll83/n;", "Lwc3/c;", "get-gIAlu-s", "(Lj93/d;Ljava/util/List;)Ljava/lang/Object;", "get", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ParametrizedSerializerCache<T> {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: get-gIAlu-s$default, reason: not valid java name */
    static /* synthetic */ Object m134413getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, InterfaceC21461d interfaceC21461d, List list, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
        if ((i13 & 2) != 0) {
            list = C25271y.f99162w;
        }
        return parametrizedSerializerCache.mo134409getgIAlus(interfaceC21461d, list);
    }

    /* JADX INFO: renamed from: get-gIAlu-s */
    Object mo134409getgIAlus(InterfaceC21461d key, List<? extends InterfaceC21456a0> types);
}
