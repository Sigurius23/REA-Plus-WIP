package org.joda.time.p378tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j7) {
            this.iPeriodStart = j7;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j7) {
            Info info = this.iNextInfo;
            if (info != null && j7 >= info.iPeriodStart) {
                return info.getNameKey(j7);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j7) {
            Info info = this.iNextInfo;
            if (info != null && j7 >= info.iPeriodStart) {
                return info.getOffset(j7);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j7) {
            Info info = this.iNextInfo;
            if (info != null && j7 >= info.iPeriodStart) {
                return info.getStandardOffset(j7);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i13;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i13 = 512;
        } else {
            int i14 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i14++;
            }
            i13 = 1 << i14;
        }
        cInfoCacheMask = i13 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j7) {
        long j13 = j7 & (-4294967296L);
        Info info = new Info(this.iZone, j13);
        long j14 = 4294967295L | j13;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j13);
            if (jNextTransition == j13 || jNextTransition > j14) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j13 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j7) {
        int i13 = (int) (j7 >> 32);
        Info[] infoArr = this.iInfoCache;
        int i14 = cInfoCacheMask & i13;
        Info info = infoArr[i14];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i13) {
            return info;
        }
        Info infoCreateInfo = createInfo(j7);
        infoArr[i14] = infoCreateInfo;
        return infoCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j7) {
        return getInfo(j7).getNameKey(j7);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j7) {
        return getInfo(j7).getOffset(j7);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j7) {
        return getInfo(j7).getStandardOffset(j7);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j7) {
        return this.iZone.nextTransition(j7);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j7) {
        return this.iZone.previousTransition(j7);
    }
}
