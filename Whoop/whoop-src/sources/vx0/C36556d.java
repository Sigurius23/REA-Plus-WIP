package vx0;

import ft0.InterfaceC14765a;
import ft0.InterfaceC14766b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import mj0.C25616e;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vx0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b!\u0010$¨\u0006("}, m65681d2 = {"Lvx0/d;", "", "", "Lft0/b;", "pairedDevices", "Lft0/a;", "primarySensor", "", "scanning", "Lmj0/e;", "discovered", "", "statusMessage", "busy", "<init>", "(Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;Z)Lvx0/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lft0/a;", "f", "()Lft0/a;", "c", "Z", "g", "()Z", "d", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36556d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC14766b> pairedDevices;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14765a primarySensor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean scanning;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C25616e> discovered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String statusMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean busy;

    /* JADX WARN: Multi-variable type inference failed */
    public C36556d(List<? extends InterfaceC14766b> pairedDevices, InterfaceC14765a interfaceC14765a, boolean z4, List<C25616e> discovered, String str, boolean z13) {
        AbstractC22676k.m65750j(pairedDevices, "pairedDevices");
        AbstractC22676k.m65750j(discovered, "discovered");
        this.pairedDevices = pairedDevices;
        this.primarySensor = interfaceC14765a;
        this.scanning = z4;
        this.discovered = discovered;
        this.statusMessage = str;
        this.busy = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36556d m117257b(C36556d c36556d, List list, InterfaceC14765a interfaceC14765a, boolean z4, List list2, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c36556d.pairedDevices;
        }
        if ((i13 & 2) != 0) {
            interfaceC14765a = c36556d.primarySensor;
        }
        if ((i13 & 4) != 0) {
            z4 = c36556d.scanning;
        }
        if ((i13 & 8) != 0) {
            list2 = c36556d.discovered;
        }
        if ((i13 & 16) != 0) {
            str = c36556d.statusMessage;
        }
        if ((i13 & 32) != 0) {
            z13 = c36556d.busy;
        }
        String str2 = str;
        boolean z14 = z13;
        return c36556d.m117258a(list, interfaceC14765a, z4, list2, str2, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C36556d m117258a(List<? extends InterfaceC14766b> pairedDevices, InterfaceC14765a primarySensor, boolean scanning, List<C25616e> discovered, String statusMessage, boolean busy) {
        AbstractC22676k.m65750j(pairedDevices, "pairedDevices");
        AbstractC22676k.m65750j(discovered, "discovered");
        return new C36556d(pairedDevices, primarySensor, scanning, discovered, statusMessage, busy);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBusy() {
        return this.busy;
    }

    /* JADX INFO: renamed from: d */
    public final List<C25616e> m117260d() {
        return this.discovered;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC14766b> m117261e() {
        return this.pairedDevices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36556d)) {
            return false;
        }
        C36556d c36556d = (C36556d) other;
        return AbstractC22676k.m65745e(this.pairedDevices, c36556d.pairedDevices) && AbstractC22676k.m65745e(this.primarySensor, c36556d.primarySensor) && this.scanning == c36556d.scanning && AbstractC22676k.m65745e(this.discovered, c36556d.discovered) && AbstractC22676k.m65745e(this.statusMessage, c36556d.statusMessage) && this.busy == c36556d.busy;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC14765a getPrimarySensor() {
        return this.primarySensor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getScanning() {
        return this.scanning;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        int iHashCode = this.pairedDevices.hashCode() * 31;
        InterfaceC14765a interfaceC14765a = this.primarySensor;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b((iHashCode + (interfaceC14765a == null ? 0 : interfaceC14765a.hashCode())) * 31, 31, this.scanning), 31, this.discovered);
        String str = this.statusMessage;
        return Boolean.hashCode(this.busy) + ((iM31983b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<InterfaceC14766b> list = this.pairedDevices;
        InterfaceC14765a interfaceC14765a = this.primarySensor;
        boolean z4 = this.scanning;
        List<C25616e> list2 = this.discovered;
        String str = this.statusMessage;
        boolean z13 = this.busy;
        StringBuilder sb4 = new StringBuilder("WhoopBleDebugUiState(pairedDevices=");
        sb4.append(list);
        sb4.append(", primarySensor=");
        sb4.append(interfaceC14765a);
        sb4.append(", scanning=");
        AbstractC25012a.m73391x(", discovered=", ", statusMessage=", sb4, list2, z4);
        return AbstractC21702c.m61137h(sb4, str, ", busy=", z13, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36556d(List list, InterfaceC14765a interfaceC14765a, boolean z4, List list2, String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? null : interfaceC14765a, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? c25271y : list2, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? false : z13);
    }
}
