package no.nordicsemi.android.ble;

import androidx.health.platform.client.proto.C1533u;
import p031b9.AbstractC2875y;
import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26917s implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f107424b;

    public /* synthetic */ C26917s(int i13, int i14) {
        this.f107423a = i14;
        this.f107424b = i13;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        String strM8296i;
        String strM8296i2;
        String strM8296i3;
        int i13 = this.f107423a;
        int i14 = this.f107424b;
        switch (i13) {
            case 0:
                int i15 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "Remote RSSI received: ", " dBm");
            case 1:
                int i16 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8295h(i14, "Reading remote RSSI failed with status ");
            case 2:
                int i17 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8295h(i14, "PHY read failed with status ");
            case 3:
                int i18 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "Authentication required (", ")");
            case 4:
                int i19 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "Authentication required (", ")");
            case 5:
                int i24 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8295h(i14, "PHY updated failed with status ");
            case 6:
                StringBuilder sb4 = new StringBuilder("Error (0x");
                sb4.append(Integer.toHexString(i14));
                sb4.append("): ");
                if (i14 == 34) {
                    strM8296i = "GATT CONN LMP TIMEOUT";
                } else if (i14 == 41) {
                    strM8296i = "GATT PAIRING WITH UNIT KEY NOT SUPPORTED";
                } else if (i14 == 147) {
                    strM8296i = "GATT TIMEOUT";
                } else if (i14 == 257) {
                    strM8296i = "TOO MANY OPEN CONNECTIONS";
                } else if (i14 == 58) {
                    strM8296i = "GATT CONTROLLER BUSY";
                } else if (i14 != 59) {
                    switch (i14) {
                        case 1:
                            strM8296i = "GATT INVALID HANDLE";
                            break;
                        case 2:
                            strM8296i = "GATT READ NOT PERMIT";
                            break;
                        case 3:
                            strM8296i = "GATT WRITE NOT PERMIT";
                            break;
                        case 4:
                            strM8296i = "GATT INVALID PDU";
                            break;
                        case 5:
                            strM8296i = "GATT INSUF AUTHENTICATION";
                            break;
                        case 6:
                            strM8296i = "GATT REQ NOT SUPPORTED";
                            break;
                        case 7:
                            strM8296i = "GATT INVALID OFFSET";
                            break;
                        case 8:
                            strM8296i = "GATT INSUF AUTHORIZATION";
                            break;
                        case 9:
                            strM8296i = "GATT PREPARE Q FULL";
                            break;
                        case 10:
                            strM8296i = "GATT NOT FOUND";
                            break;
                        case 11:
                            strM8296i = "GATT NOT LONG";
                            break;
                        case 12:
                            strM8296i = "GATT INSUF KEY SIZE";
                            break;
                        case 13:
                            strM8296i = "GATT INVALID ATTR LEN";
                            break;
                        case 14:
                            strM8296i = "GATT ERR UNLIKELY";
                            break;
                        case 15:
                            strM8296i = "GATT INSUF ENCRYPTION";
                            break;
                        case 16:
                            strM8296i = "GATT UNSUPPORT GRP TYPE";
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            strM8296i = "GATT INSUF RESOURCE";
                            break;
                        default:
                            switch (i14) {
                                case 128:
                                    strM8296i = "GATT NO RESOURCES";
                                    break;
                                case 129:
                                    strM8296i = "GATT INTERNAL ERROR";
                                    break;
                                case 130:
                                    strM8296i = "GATT WRONG STATE";
                                    break;
                                case 131:
                                    strM8296i = "GATT DB FULL";
                                    break;
                                case 132:
                                    strM8296i = "GATT BUSY";
                                    break;
                                case 133:
                                    strM8296i = "GATT ERROR";
                                    break;
                                case 134:
                                    strM8296i = "GATT CMD STARTED";
                                    break;
                                case 135:
                                    strM8296i = "GATT ILLEGAL PARAMETER";
                                    break;
                                case 136:
                                    strM8296i = "GATT PENDING";
                                    break;
                                case 137:
                                    strM8296i = "GATT AUTH FAIL";
                                    break;
                                case 138:
                                    strM8296i = "GATT MORE";
                                    break;
                                case 139:
                                    strM8296i = "GATT INVALID CFG";
                                    break;
                                case 140:
                                    strM8296i = "GATT SERVICE STARTED";
                                    break;
                                case 141:
                                    strM8296i = "GATT ENCRYPTED NO MITM";
                                    break;
                                case 142:
                                    strM8296i = "GATT NOT ENCRYPTED";
                                    break;
                                case 143:
                                    strM8296i = "GATT CONGESTED";
                                    break;
                                default:
                                    switch (i14) {
                                        case 253:
                                            strM8296i = "GATT CCCD CFG ERROR";
                                            break;
                                        case 254:
                                            strM8296i = "GATT PROCEDURE IN PROGRESS";
                                            break;
                                        case 255:
                                            strM8296i = "GATT VALUE OUT OF RANGE";
                                            break;
                                        default:
                                            strM8296i = AbstractC2875y.m8296i(i14, "UNKNOWN (", ")");
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    strM8296i = "GATT UNACCEPT CONN INTERVAL";
                }
                sb4.append(strM8296i);
                return sb4.toString();
            case 7:
                StringBuilder sb5 = new StringBuilder("[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to ");
                switch (i14) {
                    case 10:
                        strM8296i2 = "OFF";
                        break;
                    case 11:
                        strM8296i2 = "TURNING ON";
                        break;
                    case 12:
                        strM8296i2 = "ON";
                        break;
                    case 13:
                        strM8296i2 = "TURNING OFF";
                        break;
                    default:
                        strM8296i2 = AbstractC2875y.m8296i(i14, "UNKNOWN (", ")");
                        break;
                }
                sb5.append(strM8296i2);
                return sb5.toString();
            default:
                StringBuilder sb6 = new StringBuilder("[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: ");
                char[] cArr = AbstractC31252a.f128755a;
                switch (i14) {
                    case 10:
                        strM8296i3 = "BOND_NONE";
                        break;
                    case 11:
                        strM8296i3 = "BOND_BONDING";
                        break;
                    case 12:
                        strM8296i3 = "BOND_BONDED";
                        break;
                    default:
                        strM8296i3 = AbstractC2875y.m8296i(i14, "UNKNOWN (", ")");
                        break;
                }
                sb6.append(strM8296i3);
                sb6.append(" (");
                sb6.append(i14);
                sb6.append(")");
                return sb6.toString();
        }
    }

    public /* synthetic */ C26917s(C26904l c26904l, int i13) {
        this.f107423a = 7;
        this.f107424b = i13;
    }
}
