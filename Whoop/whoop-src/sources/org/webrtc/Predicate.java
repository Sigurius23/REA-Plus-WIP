package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.2
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t14) {
                return this.this$0.test(t14) && predicate.test(t14);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate
            public boolean test(T t14) {
                return !Predicate.this.test(t14);
            }
        };
    }

    /* JADX INFO: renamed from: or */
    default Predicate<T> m85641or(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.1
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t14) {
                return this.this$0.test(t14) || predicate.test(t14);
            }
        };
    }

    boolean test(T t14);
}
