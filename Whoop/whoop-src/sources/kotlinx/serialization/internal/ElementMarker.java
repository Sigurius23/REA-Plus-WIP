package kotlinx.serialization.internal;

import c93.InterfaceC4351m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@CoreFriendModuleApi
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Lyc3/g;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lyc3/g;Lc93/m;)V", "elementsCount", "", "prepareHighMarksArray", "(I)[J", "index", "Ll83/a0;", "markHigh", "(I)V", "nextUnmarkedHighIndex", "()I", "mark", "nextUnmarkedIndex", "Lyc3/g;", "Lc93/m;", "", "lowerMarks", "J", "highMarksArray", "[J", "Companion", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ElementMarker {
    private static final Companion Companion = new Companion(null);
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    private final InterfaceC39443g descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final InterfaceC4351m readIfAbsent;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "<init>", "()V", "EMPTY_HIGH_MARKS", "", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ElementMarker(InterfaceC39443g descriptor, InterfaceC4351m readIfAbsent) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = EMPTY_HIGH_MARKS;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = prepareHighMarksArray(elementsCount);
        }
    }

    private final void markHigh(int index) {
        int i13 = (index >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i13] = jArr[i13] | (1 << (index & 63));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 1;
            int i15 = i14 * 64;
            long j7 = this.highMarksArray[i13];
            while (j7 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j7);
                j7 |= 1 << iNumberOfTrailingZeros;
                int i16 = iNumberOfTrailingZeros + i15;
                if (((Boolean) this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i16))).booleanValue()) {
                    this.highMarksArray[i13] = j7;
                    return i16;
                }
            }
            this.highMarksArray[i13] = j7;
            i13 = i14;
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int elementsCount) {
        int i13 = (elementsCount - 1) >>> 6;
        long[] jArr = new long[i13];
        if ((elementsCount & 63) != 0) {
            jArr[i13 - 1] = (-1) << elementsCount;
        }
        return jArr;
    }

    public final void mark(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            markHigh(index);
        }
    }

    public final int nextUnmarkedIndex() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j7 = this.lowerMarks;
            if (j7 == -1) {
                if (elementsCount > 64) {
                    return nextUnmarkedHighIndex();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j7);
            this.lowerMarks |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
