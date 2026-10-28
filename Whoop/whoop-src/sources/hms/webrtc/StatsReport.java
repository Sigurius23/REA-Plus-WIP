package hms.webrtc;

import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class StatsReport {

    /* JADX INFO: renamed from: id */
    public final String f67567id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("[");
            sb4.append(this.name);
            sb4.append(": ");
            return AbstractC25012a.m73376i(this.value, "]", sb4);
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d3, Value[] valueArr) {
        this.f67567id = str;
        this.type = str2;
        this.timestamp = d3;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("id: ");
        sb4.append(this.f67567id);
        sb4.append(", type: ");
        sb4.append(this.type);
        sb4.append(", timestamp: ");
        sb4.append(this.timestamp);
        sb4.append(", values: ");
        int i13 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i13 >= valueArr.length) {
                return sb4.toString();
            }
            sb4.append(valueArr[i13].toString());
            sb4.append(", ");
            i13++;
        }
    }
}
