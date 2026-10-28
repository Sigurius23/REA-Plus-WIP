package kotlinx.serialization.internal;

import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, m65681d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "name", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "isInline", "", "()Z", "hashCode", "", "equals", "other", "", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {
    private final boolean isInline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(String name, GeneratedSerializer<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof InlineClassDescriptor) {
            InterfaceC39443g interfaceC39443g = (InterfaceC39443g) other;
            if (AbstractC22676k.m65745e(getSerialName(), interfaceC39443g.getSerialName())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) other;
                if (inlineClassDescriptor.getIsInline() && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), inlineClassDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == interfaceC39443g.getElementsCount()) {
                    int elementsCount = getElementsCount();
                    for (int i13 = 0; i13 < elementsCount; i13++) {
                        if (AbstractC22676k.m65745e(getElementDescriptor(i13).getSerialName(), interfaceC39443g.getElementDescriptor(i13).getSerialName()) && AbstractC22676k.m65745e(getElementDescriptor(i13).getKind(), interfaceC39443g.getElementDescriptor(i13).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }
}
