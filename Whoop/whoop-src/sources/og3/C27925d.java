package og3;

import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.p379bp.zone.ZoneRulesException;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: og3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C27925d {

    /* JADX INFO: renamed from: c */
    public static final CopyOnWriteArrayList f112630c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f112631d = new ConcurrentHashMap(512, 0.75f, 2);

    /* JADX INFO: renamed from: a */
    public List f112632a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentSkipListMap f112633b = new ConcurrentSkipListMap();

    static {
        if (AbstractC27931j.f112647a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference atomicReference = AbstractC27931j.f112648b;
        C27930i c27930i = new C27930i();
        while (!atomicReference.compareAndSet(null, c27930i) && atomicReference.get() == null) {
        }
        ((AbstractC27931j) atomicReference.get()).mo76789a();
    }

    public C27925d(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            m84274b(inputStream);
        } catch (Exception e5) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC27929h m84272a(String str) {
        AbstractC27929h abstractC27929h;
        AbstractC5583n.m16762V(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f112631d;
        C27925d c27925d = (C27925d) concurrentHashMap.get(str);
        if (c27925d == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
        }
        C27924c c27924c = (C27924c) c27925d.f112633b.lastEntry().getValue();
        int iBinarySearch = Arrays.binarySearch(c27924c.f112627b, str);
        if (iBinarySearch < 0) {
            abstractC27929h = null;
        } else {
            try {
                short s13 = c27924c.f112628c[iBinarySearch];
                AtomicReferenceArray atomicReferenceArray = c27924c.f112629d;
                Object objM84261b = atomicReferenceArray.get(s13);
                if (objM84261b instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objM84261b));
                    objM84261b = C27922a.m84261b(dataInputStream.readByte(), dataInputStream);
                    atomicReferenceArray.set(s13, objM84261b);
                }
                abstractC27929h = (AbstractC27929h) objM84261b;
            } catch (Exception e5) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Invalid binary time-zone data: TZDB:", str, ", version: ");
                sbM53375p.append(c27924c.f112626a);
                throw new ZoneRulesException(sbM53375p.toString(), e5);
            }
        }
        if (abstractC27929h != null) {
            return abstractC27929h;
        }
        throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public static void m84273c(C27925d c27925d) {
        AbstractC5583n.m16762V(c27925d, "provider");
        for (String str : new HashSet(c27925d.f112632a)) {
            AbstractC5583n.m16762V(str, "zoneId");
            if (((C27925d) f112631d.putIfAbsent(str, c27925d)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c27925d);
            }
        }
        f112630c.add(c27925d);
    }

    /* JADX INFO: renamed from: b */
    public final void m84274b(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i13 = dataInputStream.readShort();
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            strArr[i14] = dataInputStream.readUTF();
        }
        int i15 = dataInputStream.readShort();
        String[] strArr2 = new String[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            strArr2[i16] = dataInputStream.readUTF();
        }
        this.f112632a = Arrays.asList(strArr2);
        int i17 = dataInputStream.readShort();
        Object[] objArr = new Object[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i18] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet<C27924c> hashSet = new HashSet(i13);
        for (int i19 = 0; i19 < i13; i19++) {
            int i24 = dataInputStream.readShort();
            String[] strArr3 = new String[i24];
            short[] sArr = new short[i24];
            for (int i25 = 0; i25 < i24; i25++) {
                strArr3[i25] = strArr2[dataInputStream.readShort()];
                sArr[i25] = dataInputStream.readShort();
            }
            hashSet.add(new C27924c(strArr[i19], strArr3, sArr, atomicReferenceArray));
        }
        for (C27924c c27924c : hashSet) {
            String str = c27924c.f112626a;
            C27924c c27924c2 = (C27924c) this.f112633b.putIfAbsent(str, c27924c);
            if (c27924c2 != null && !c27924c2.f112626a.equals(str)) {
                throw new ZoneRulesException(AbstractC11266d.m30461o("Data already loaded for TZDB time-zone rules version: ", str));
            }
        }
    }

    public final String toString() {
        return "TZDB";
    }
}
