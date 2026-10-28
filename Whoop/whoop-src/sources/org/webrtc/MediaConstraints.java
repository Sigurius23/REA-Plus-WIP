package org.webrtc;

import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyValuePair)) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            return this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value);
        }

        @CalledByNative("KeyValuePair")
        public String getKey() {
            return this.key;
        }

        @CalledByNative("KeyValuePair")
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + this.key.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53370k(this.key, ": ", this.value);
        }
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb4 = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb4.length() > 1) {
                sb4.append(", ");
            }
            sb4.append(keyValuePair.toString());
        }
        sb4.append("]");
        return sb4.toString();
    }

    @CalledByNative
    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    @CalledByNative
    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        return AbstractC31061c.m95640p("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }
}
