package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "seen", "goldenMask", "Lyc3/g;", "descriptor", "Ll83/a0;", "throwMissingFieldException", "(IILyc3/g;)V", "", "seenArray", "goldenMaskArray", "throwArrayMissingFieldException", "([I[ILyc3/g;)V", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PluginExceptionsKt {
    public static final void throwArrayMissingFieldException(int[] seenArray, int[] goldenMaskArray, InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(seenArray, "seenArray");
        AbstractC22676k.m65750j(goldenMaskArray, "goldenMaskArray");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = goldenMaskArray[i13] & (~seenArray[i13]);
            if (i14 != 0) {
                for (int i15 = 0; i15 < 32; i15++) {
                    if ((i14 & 1) != 0) {
                        arrayList.add(descriptor.getElementName((i13 * 32) + i15));
                    }
                    i14 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(descriptor.getSerialName(), arrayList);
    }

    public static final void throwMissingFieldException(int i13, int i14, InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i15 = (~i13) & i14;
        for (int i16 = 0; i16 < 32; i16++) {
            if ((i15 & 1) != 0) {
                arrayList.add(descriptor.getElementName(i16));
            }
            i15 >>>= 1;
        }
        throw new MissingFieldException(descriptor.getSerialName(), arrayList);
    }
}
