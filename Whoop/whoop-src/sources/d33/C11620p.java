package d33;

import a00.C0072g;
import ec3.C13045h2;
import i93.C18284j;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import org.webrtc.audio.JavaAudioDeviceModule;
import p33.AbstractC28808a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import t23.C33368c0;
import t23.C33414l;

/* JADX INFO: renamed from: d33.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C11620p extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11602h1 f37515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11620p(C11602h1 c11602h1) {
        super(1);
        this.f37515w = c11602h1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaAudioDeviceModule.AudioSamples it = (JavaAudioDeviceModule.AudioSamples) obj;
        AbstractC22676k.m65750j(it, "it");
        C33368c0 c33368c0 = this.f37515w.f37440b;
        c33368c0.getClass();
        C0072g c0072g = c33368c0.f139310x;
        byte[] data = it.getData();
        AbstractC22676k.m65749i(data, "getData(...)");
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0072g.f224y;
        int length = data.length / 2;
        short[] sArr = new short[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            sArr[i13] = (short) ((data[i14] & 255) | ((data[i14 + 1] & 255) << 8));
        }
        double size = 0.0d;
        double d3 = 0.0d;
        for (int i15 = 0; i15 < length; i15++) {
            double d14 = ((double) sArr[i15]) / ((double) 32767);
            d3 += d14 * d14;
        }
        double dLog10 = Math.log10(Math.sqrt(d3 / ((double) length))) * ((double) 20);
        C18284j c18284j = AbstractC28808a.f116630a;
        int i16 = c18284j.f71133w;
        float fAbs = dLog10 < i16 ? 0.0f : dLog10 > ((double) c18284j.f71134x) ? 1.0f : (float) Math.abs((dLog10 - Integer.valueOf(i16).doubleValue()) / ((double) AbstractC28808a.f116631b));
        C13045h2 c13045h2 = (C13045h2) c0072g.f225z;
        Float fValueOf = Float.valueOf(fAbs);
        c13045h2.getClass();
        c13045h2.m36571k(null, fValueOf);
        if (!Double.isInfinite(dLog10)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!linkedHashMap.isEmpty()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Set setKeySet = linkedHashMap.keySet();
                AbstractC22676k.m65749i(setKeySet, "<get-keys>(...)");
                Object objM74111O0 = AbstractC25265s.m74111O0(setKeySet);
                AbstractC22676k.m65749i(objM74111O0, "last(...)");
                if (jCurrentTimeMillis2 - ((Number) objM74111O0).longValue() > 600) {
                    linkedHashMap.clear();
                }
            }
            linkedHashMap.put(Long.valueOf(jCurrentTimeMillis), Double.valueOf(dLog10));
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                AbstractC22676k.m65749i(next, "next(...)");
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                Object key = ((Map.Entry) next).getKey();
                AbstractC22676k.m65749i(key, "<get-key>(...)");
                if (jCurrentTimeMillis3 - ((Number) key).longValue() > 600) {
                    it3.remove();
                }
            }
            if (!linkedHashMap.isEmpty()) {
                Collection<Double> collectionValues = linkedHashMap.values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                for (Double d15 : collectionValues) {
                    AbstractC22676k.m65747g(d15);
                    size += d15.doubleValue();
                }
                size /= (double) linkedHashMap.size();
            }
            if (size >= -45) {
                ((C33414l) c0072g.f223x).invoke();
                linkedHashMap.clear();
            }
        }
        return C23454a0.f92919a;
    }
}
