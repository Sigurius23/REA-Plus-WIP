package gq2;

import com.whoop.user.journey.model.yearinreview.DonutStatisticsItem;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import sq2.C32885b;

/* JADX INFO: renamed from: gq2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lgq2/a;", "", "<init>", "()V", "", "style", "Li2/x;", "c", "(Ljava/lang/String;)J", "theme", "a", "", "Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;", "statItems", "Lsq2/b;", "b", "(Ljava/util/List;)Ljava/util/List;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16082a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    private final long m45435c(String style) {
        int iHashCode = style.hashCode();
        switch (iHashCode) {
            case -2139696221:
                if (style.equals("RED_RECOVERY")) {
                    return EnumC39333f.RECOVERY_LOW_RECOVERY.getColor();
                }
                break;
            case -1811737550:
                if (style.equals("STRENUOUS")) {
                    return AbstractC17918w0.m51517e(4278292192L);
                }
                break;
            case -1312106127:
                if (style.equals("GREEN_RECOVERY")) {
                    return EnumC39333f.RECOVERY_HIGH_RECOVERY.getColor();
                }
                break;
            case -1287200322:
                if (style.equals("MEDIUM_STRESS")) {
                    return AbstractC17918w0.m51517e(4278251935L);
                }
                break;
            case -934651617:
                if (style.equals("LOW_STRESS")) {
                    return AbstractC17918w0.m51517e(4284985062L);
                }
                break;
            case -587227381:
                if (style.equals("MAXIMAL_SLEEP")) {
                    return EnumC39333f.ACCENT_POSITIVE_TREND.getColor();
                }
                break;
            case -472919563:
                if (style.equals("AVERAGE_SLEEP")) {
                    return C17919x.m51541c(0.7f, EnumC39333f.SLEEP.getColor());
                }
                break;
            case -192891024:
                if (style.equals("ALL_OUT")) {
                    return AbstractC17918w0.m51517e(4284931839L);
                }
                break;
            case 62685541:
                if (style.equals("AWAKE")) {
                    return EnumC39333f.SLEEP_AWAKE.getColor();
                }
                break;
            case 98046843:
                if (style.equals("INSUFFICIENT_SLEEP")) {
                    return C17919x.m51541c(0.4f, EnumC39333f.SLEEP.getColor());
                }
                break;
            case 141110692:
                if (style.equals("DEEP_SLEEP")) {
                    return EnumC39333f.SLEEP_DEEP_SLEEP.getColor();
                }
                break;
            case 163769603:
                if (style.equals("MODERATE")) {
                    return AbstractC17918w0.m51517e(4278741938L);
                }
                break;
            case 229511858:
                if (style.equals("REM_SLEEP")) {
                    return EnumC39333f.SLEEP_REM_SLEEP.getColor();
                }
                break;
            case 325792497:
                if (style.equals("HIGH_STRESS")) {
                    return AbstractC17918w0.m51517e(4294944546L);
                }
                break;
            case 832867072:
                if (style.equals("YELLOW_RECOVERY")) {
                    return EnumC39333f.RECOVERY_MEDIUM_RECOVERY.getColor();
                }
                break;
            case 897762862:
                if (style.equals("LIGHT_SLEEP")) {
                    return EnumC39333f.SLEEP_LIGHT_SLEEP.getColor();
                }
                break;
            case 1685910614:
                if (style.equals("SUFFICIENT_SLEEP")) {
                    return EnumC39333f.SLEEP.getColor();
                }
                break;
            case 2068616414:
                if (style.equals("LIGHT_STRAIN")) {
                    return AbstractC17918w0.m51517e(4279126662L);
                }
                break;
            default:
                switch (iHashCode) {
                    case -1068657048:
                        if (style.equals("STRAIN_ZONE_1")) {
                            return EnumC39333f.STRAIN_ZONE_1.getColor();
                        }
                        break;
                    case -1068657047:
                        if (style.equals("STRAIN_ZONE_2")) {
                            return EnumC39333f.STRAIN_ZONE_2.getColor();
                        }
                        break;
                    case -1068657046:
                        if (style.equals("STRAIN_ZONE_3")) {
                            return EnumC39333f.STRAIN_ZONE_3.getColor();
                        }
                        break;
                    case -1068657045:
                        if (style.equals("STRAIN_ZONE_4")) {
                            return EnumC39333f.STRAIN_ZONE_4.getColor();
                        }
                        break;
                    case -1068657044:
                        if (style.equals("STRAIN_ZONE_5")) {
                            return EnumC39333f.STRAIN_ZONE_5.getColor();
                        }
                        break;
                }
                break;
        }
        return AbstractC17918w0.m51517e(4294967295L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r5.equals("OUTRO") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r5.equals("RECOVERY") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return p208i2.C17919x.m51541c(0.1f, p208i2.AbstractC17918w0.m51515c(442287359));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.equals("WIR_STRAIN") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r5.equals("WIR_SLEEP") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return p208i2.C17919x.m51541c(0.1f, p208i2.AbstractC17918w0.m51515c(442265087));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r5.equals("WIR_OUTRO") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        return p208i2.C17919x.m51541c(0.1f, p208i2.AbstractC17918w0.m51515c(446997489));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r5.equals("STRAIN") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        return p208i2.C17919x.m51541c(0.1f, p208i2.AbstractC17918w0.m51515c(436245479));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r5.equals("WIR_RECOVERY") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5.equals("SLEEP") == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m45436a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "theme"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r5, r0)
            int r0 = r5.hashCode()
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 442265087(0x1a5c6dff, float:4.5583788E-23)
            switch(r0) {
                case -1838664331: goto L75;
                case -1697379156: goto L60;
                case -1693968008: goto L4e;
                case -965629228: goto L45;
                case -16486507: goto L30;
                case 75573739: goto L27;
                case 78984887: goto L1e;
                case 1451624756: goto L14;
                default: goto L12;
            }
        L12:
            goto L89
        L14:
            java.lang.String r0 = "WIR_RECOVERY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L39
            goto L89
        L1e:
            java.lang.String r0 = "SLEEP"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L57
            goto L89
        L27:
            java.lang.String r0 = "OUTRO"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L69
            goto L89
        L30:
            java.lang.String r0 = "RECOVERY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L39
            goto L89
        L39:
            r5 = 442287359(0x1a5cc4ff, float:4.5654066E-23)
            long r2 = p208i2.AbstractC17918w0.m51515c(r5)
            long r0 = p208i2.C17919x.m51541c(r1, r2)
            return r0
        L45:
            java.lang.String r0 = "WIR_STRAIN"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L7d
            goto L89
        L4e:
            java.lang.String r0 = "WIR_SLEEP"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L57
            goto L89
        L57:
            long r2 = p208i2.AbstractC17918w0.m51515c(r2)
            long r0 = p208i2.C17919x.m51541c(r1, r2)
            return r0
        L60:
            java.lang.String r0 = "WIR_OUTRO"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L69
            goto L89
        L69:
            r5 = 446997489(0x1aa4a3f1, float:6.809367E-23)
            long r2 = p208i2.AbstractC17918w0.m51515c(r5)
            long r0 = p208i2.C17919x.m51541c(r1, r2)
            return r0
        L75:
            java.lang.String r0 = "STRAIN"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L89
        L7d:
            r5 = 436245479(0x1a0093e7, float:2.6589254E-23)
            long r2 = p208i2.AbstractC17918w0.m51515c(r5)
            long r0 = p208i2.C17919x.m51541c(r1, r2)
            return r0
        L89:
            long r2 = p208i2.AbstractC17918w0.m51515c(r2)
            long r0 = p208i2.C17919x.m51541c(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C16082a.m45436a(java.lang.String):long");
    }

    /* JADX INFO: renamed from: b */
    public final List<C32885b> m45437b(List<DonutStatisticsItem> statItems) {
        AbstractC22676k.m65750j(statItems, "statItems");
        List<DonutStatisticsItem> list = statItems;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (DonutStatisticsItem donutStatisticsItem : list) {
            arrayList.add(new C32885b(m45435c(donutStatisticsItem.getStyle()), donutStatisticsItem.getFillPercentage(), donutStatisticsItem.getPrimary(), donutStatisticsItem.getStatistic(), donutStatisticsItem.getValue(), null));
        }
        return arrayList;
    }
}
