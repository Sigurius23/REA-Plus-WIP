package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: hms.webrtc.Predicate.2
            @Override // hms.webrtc.Predicate
            public boolean test(T t14) {
                return Predicate.this.test(t14) && predicate.test(t14);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: hms.webrtc.Predicate.3
            @Override // hms.webrtc.Predicate
            public boolean test(T t14) {
                return !Predicate.this.test(t14);
            }
        };
    }

    /* JADX INFO: renamed from: or */
    default Predicate<T> m49592or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: hms.webrtc.Predicate.1
            @Override // hms.webrtc.Predicate
            public boolean test(T t14) {
                return Predicate.this.test(t14) || predicate.test(t14);
            }
        };
    }

    boolean test(T t14);
}
