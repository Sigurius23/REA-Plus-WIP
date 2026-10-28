package ba2;

import java.util.Arrays;
import java.util.Objects;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ba2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lba2/c;", "", "", "shortValue", "<init>", "(S)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "S", "getShortValue", "()S", "", "()F", "milliAmps", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2902c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final short shortValue;

    public C2902c(short s13) {
        this.shortValue = s13;
    }

    /* JADX INFO: renamed from: a */
    public final float m8498a() {
        return (this.shortValue / 255.0f) * 100;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && C2902c.class.equals(other.getClass()) && this.shortValue == ((C2902c) other).shortValue;
    }

    public int hashCode() {
        return Objects.hash(Short.valueOf(this.shortValue));
    }

    public String toString() {
        return String.format("LedDrive(%d|%.2f)", Arrays.copyOf(new Object[]{Short.valueOf(this.shortValue), Float.valueOf(m8498a())}, 2));
    }
}
