package a82;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.whoop.data.repositories.CastlePairingChecker;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: a82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"La82/a;", "", "Lcom/whoop/data/repositories/CastlePairingChecker;", "castlePairingChecker", "<init>", "(Lcom/whoop/data/repositories/CastlePairingChecker;)V", "Landroid/bluetooth/le/ScanResult;", "result", "", "Lst0/v;", "devicesServicesIds", "d", "(Landroid/bluetooth/le/ScanResult;Ljava/util/List;)Lst0/v;", "", "e", "(Landroid/bluetooth/le/ScanResult;)Z", "c", "(Landroid/bluetooth/le/ScanResult;)Lst0/v;", "a", "Lcom/whoop/data/repositories/CastlePairingChecker;", "Landroid/bluetooth/le/ScanSettings;", "b", "Landroid/bluetooth/le/ScanSettings;", "()Landroid/bluetooth/le/ScanSettings;", "lowLatencyScanSettings", "Ljava/util/ArrayList;", "Landroid/bluetooth/le/ScanFilter;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "emptyScanFilter", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0570a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CastlePairingChecker castlePairingChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ScanSettings lowLatencyScanSettings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ArrayList<ScanFilter> emptyScanFilter;

    public C0570a(CastlePairingChecker castlePairingChecker) {
        AbstractC22676k.m65750j(castlePairingChecker, "castlePairingChecker");
        this.castlePairingChecker = castlePairingChecker;
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setLegacy(false).setScanMode(2).build();
        AbstractC22676k.m65749i(scanSettingsBuild, "build(...)");
        this.lowLatencyScanSettings = scanSettingsBuild;
        this.emptyScanFilter = new ArrayList<>();
    }

    /* JADX INFO: renamed from: d */
    private final EnumC32978v m1474d(ScanResult result, List<? extends EnumC32978v> devicesServicesIds) {
        List<ParcelUuid> serviceUuids;
        ScanRecord scanRecord = result.getScanRecord();
        Object obj = null;
        if (scanRecord == null || (serviceUuids = scanRecord.getServiceUuids()) == null) {
            return null;
        }
        if (!this.castlePairingChecker.isPairingFeatureEnabled()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : devicesServicesIds) {
                EnumC32978v enumC32978v = (EnumC32978v) obj2;
                if (enumC32978v != EnumC32978v.MONUMENT && enumC32978v != EnumC32978v.SYMPHONY) {
                    arrayList.add(obj2);
                }
            }
            devicesServicesIds = arrayList;
        }
        for (Object obj3 : devicesServicesIds) {
            if (serviceUuids.contains(new ParcelUuid(((EnumC32978v) obj3).getServiceId()))) {
                obj = obj3;
                break;
            }
        }
        return (EnumC32978v) obj;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<ScanFilter> m1475a() {
        return this.emptyScanFilter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ScanSettings getLowLatencyScanSettings() {
        return this.lowLatencyScanSettings;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC32978v m1477c(ScanResult result) {
        AbstractC22676k.m65750j(result, "result");
        EnumC32978v.Companion companion = EnumC32978v.INSTANCE;
        return m1474d(result, AbstractC25265s.m74129g1(companion.m104088a(), companion.m104090c()));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1478e(ScanResult result) {
        AbstractC22676k.m65750j(result, "result");
        return m1474d(result, EnumC32978v.INSTANCE.m104088a()) != null;
    }
}
