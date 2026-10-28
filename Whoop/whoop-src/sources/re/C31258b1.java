package re;

/* JADX INFO: renamed from: re.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31258b1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31258b1.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "SoftwareTokenMfaSettingsType(enabled=false,preferredMfa=false)";
    }
}
