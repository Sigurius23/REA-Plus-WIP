package p209i3;

/* JADX INFO: renamed from: i3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18027i {

    /* JADX INFO: renamed from: a */
    public final int f69949a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18027i) {
            return this.f69949a == ((C18027i) obj).f69949a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69949a);
    }

    public final String toString() {
        int i13 = this.f69949a;
        if (i13 == 0) {
            return "Button";
        }
        if (i13 == 1) {
            return "Checkbox";
        }
        if (i13 == 2) {
            return "Switch";
        }
        if (i13 == 3) {
            return "RadioButton";
        }
        if (i13 == 4) {
            return "Tab";
        }
        if (i13 == 5) {
            return "Image";
        }
        if (i13 == 6) {
            return "DropdownList";
        }
        if (i13 == 7) {
            return "Picker";
        }
        return i13 == 8 ? "Carousel" : "Unknown";
    }
}
