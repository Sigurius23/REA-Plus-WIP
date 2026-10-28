package org.webrtc;

import ih0.AbstractC18489d0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RTCStats {

    /* JADX INFO: renamed from: id */
    private final String f114043id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j7, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j7;
        this.type = str;
        this.f114043id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb4, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb4.append(obj);
                return;
            }
            sb4.append('\"');
            sb4.append(obj);
            sb4.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb4.append('[');
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (i13 != 0) {
                sb4.append(", ");
            }
            appendValue(sb4, objArr[i13]);
        }
        sb4.append(']');
    }

    @CalledByNative
    public static RTCStats create(long j7, String str, String str2, Map map) {
        return new RTCStats(j7, str, str2, map);
    }

    public String getId() {
        return this.f114043id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("{ timestampUs: ");
        sbM53374o.append(this.timestampUs);
        sbM53374o.append(", type: ");
        sbM53374o.append(this.type);
        sbM53374o.append(", id: ");
        sbM53374o.append(this.f114043id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sbM53374o.append(", ");
            sbM53374o.append(entry.getKey());
            sbM53374o.append(": ");
            appendValue(sbM53374o, entry.getValue());
        }
        sbM53374o.append(" }");
        return sbM53374o.toString();
    }
}
