package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lkotlinx/serialization/internal/GeneratedSerializer;", "T", "Lwc3/c;", "", "childSerializers", "()[Lwc3/c;", "typeParametersSerializers", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface GeneratedSerializer<T> extends InterfaceC37138c {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> InterfaceC37138c[] typeParametersSerializers(GeneratedSerializer<T> generatedSerializer) {
            return GeneratedSerializer.super.typeParametersSerializers();
        }
    }

    InterfaceC37138c[] childSerializers();

    /* synthetic */ Object deserialize(InterfaceC40541d interfaceC40541d);

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    /* synthetic */ InterfaceC39443g getDescriptor();

    @Override // wc3.InterfaceC37145j
    /* synthetic */ void serialize(InterfaceC40542e interfaceC40542e, Object obj);

    default InterfaceC37138c[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
