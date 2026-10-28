package androidx.profileinstaller;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
class DexProfileData {
    final String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    public DexProfileData(String str, String str2, long j7, long j13, int i13, int i14, int i15, int[] iArr, TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j7;
        this.mTypeIdCount = j13;
        this.classSetSize = i13;
        this.hotMethodRegionSize = i14;
        this.numMethodIds = i15;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
