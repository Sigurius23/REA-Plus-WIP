package kotlinx.serialization.internal;

import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.Arrays;
import m83.AbstractC25265s;
import p002a0.C0030i1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.AbstractC39447k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aA\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m65681d2 = {"Lyc3/g;", "SD", "", "other", "Lkotlin/Function1;", "", "typeParamsAreEqual", "equalsImpl", "(Lyc3/g;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "typeParams", "", "hashCodeImpl", "(Lyc3/g;[Lyc3/g;)I", "", "toStringImpl", "(Lyc3/g;)Ljava/lang/String;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PluginGeneratedSerialDescriptorKt {
    public static final <SD extends InterfaceC39443g> boolean equalsImpl(SD sd, Object obj, Function1 typeParamsAreEqual) {
        AbstractC22676k.m65750j(sd, "<this>");
        AbstractC22676k.m65750j(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd == obj) {
            return true;
        }
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final int hashCodeImpl(InterfaceC39443g interfaceC39443g, InterfaceC39443g[] typeParams) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(typeParams, "typeParams");
        int iHashCode = (interfaceC39443g.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        C0030i1 c0030i1 = new C0030i1(interfaceC39443g);
        int iHashCode2 = 1;
        int i13 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!c0030i1.hasNext()) {
                break;
            }
            int i14 = i13 * 31;
            String serialName = ((InterfaceC39443g) c0030i1.next()).getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i13 = i14 + iHashCode3;
        }
        C0030i1 c0030i2 = new C0030i1(interfaceC39443g);
        while (c0030i2.hasNext()) {
            int i15 = iHashCode2 * 31;
            AbstractC39447k kind = ((InterfaceC39443g) c0030i2.next()).getKind();
            iHashCode2 = i15 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i13) * 31) + iHashCode2;
    }

    public static final String toStringImpl(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return AbstractC25265s.m74110N0(AbstractC12889b.m36278i0(0, interfaceC39443g.getElementsCount()), ", ", interfaceC39443g.getSerialName() + '(', ")", new C19962a(interfaceC39443g, 18), 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toStringImpl$lambda$2(InterfaceC39443g interfaceC39443g, int i13) {
        return interfaceC39443g.getElementName(i13) + ": " + interfaceC39443g.getElementDescriptor(i13).getSerialName();
    }
}
