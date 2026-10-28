package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import java.util.concurrent.LinkedBlockingDeque;
import md3.InterfaceC25456b;
import nd3.C26591a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import rd3.AbstractC31252a;

/* JADX INFO: loaded from: classes5.dex */
class BleManagerHandler$4 extends BluetoothGattCallback {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f107299b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC26887c0 f107300a;

    public BleManagerHandler$4(AbstractC26887c0 abstractC26887c0) {
        this.f107300a = abstractC26887c0;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
        onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i13);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i13 == 0) {
            abstractC26887c0.m80323U1(4, new C26916r(bluetoothGattCharacteristic, 1));
            abstractC26887c0.m80331b2(bluetoothGatt, bluetoothGattCharacteristic);
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            if (abstractC26903k0 instanceof C26915q0) {
                C26915q0 c26915q0 = (C26915q0) abstractC26903k0;
                c26915q0.m80367o(bluetoothGatt.getDevice(), bluetoothGattCharacteristic.getValue());
                if (c26915q0.f107420v || c26915q0.f107399o || c26915q0.f107393l) {
                    c26915q0.mo80363h(bluetoothGatt.getDevice());
                } else {
                    abstractC26887c0.m80345x1(c26915q0);
                }
            }
        } else {
            if (i13 == 137) {
                AbstractC2875y.m8313z(i13, "Writing failed with status ", "BleManager");
                return;
            }
            if (i13 == 5 || i13 == 8) {
                abstractC26887c0.m80323U1(5, new C26910o(i13, 5));
                if (bluetoothGatt.getDevice().getBondState() == 12) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    abstractC26887c0.m80341k2();
                }
                AbstractC26903k0 abstractC26903k1 = abstractC26887c0.f107336d0;
                if (abstractC26903k1 instanceof C26915q0) {
                    ((C26915q0) abstractC26903k1).mo80360e(bluetoothGatt.getDevice(), i13);
                }
            } else {
                StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "onCharacteristicWrite error ", ", bond state: ");
                sbM30466t.append(bluetoothGatt.getDevice().getBondState());
                Log.e("BleManager", sbM30466t.toString());
                AbstractC26903k0 abstractC26903k2 = abstractC26887c0.f107336d0;
                if (abstractC26903k2 instanceof C26915q0) {
                    ((C26915q0) abstractC26903k2).mo80360e(bluetoothGatt.getDevice(), i13);
                }
                bluetoothGatt.getDevice();
                AbstractC26887c0.m80303t1(abstractC26887c0, i13);
            }
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, final int i13, final int i14) {
        int i15;
        int i16;
        int i17;
        InterfaceC26885b0 interfaceC26885b0 = new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.z
            @Override // no.nordicsemi.android.ble.InterfaceC26885b0
            /* JADX INFO: renamed from: b */
            public final String mo80233b() {
                String strM8296i;
                int i18 = BleManagerHandler$4.f107299b;
                int i19 = i13;
                int i24 = i14;
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i19, i24, "[Callback] Connection state changed with status: ", " and new state: ", " (");
                char[] cArr = AbstractC31252a.f128755a;
                if (i24 == 0) {
                    strM8296i = "DISCONNECTED";
                } else if (i24 == 1) {
                    strM8296i = "CONNECTING";
                } else if (i24 != 2) {
                    strM8296i = i24 != 3 ? AbstractC2875y.m8296i(i24, "UNKNOWN (", ")") : "DISCONNECTING";
                } else {
                    strM8296i = "CONNECTED";
                }
                return AbstractC25012a.m73376i(strM8296i, ")", sbM30465s);
            }
        };
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        abstractC26887c0.m80323U1(3, interfaceC26885b0);
        if (i13 == 0 && i14 == 2) {
            if (abstractC26887c0.f107344y == null) {
                Log.e("BleManager", "Device received notification after disconnection.");
                abstractC26887c0.m80323U1(3, new C26906m(12));
                try {
                    bluetoothGatt.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            abstractC26887c0.m80323U1(4, new C26908n(bluetoothGatt));
            abstractC26887c0.f107321O = true;
            abstractC26887c0.f107319M = 0L;
            abstractC26887c0.f107326T = 2;
            abstractC26887c0.m80341k2();
            abstractC26887c0.m80342l2(new C26908n(bluetoothGatt));
            if (abstractC26887c0.f107318L) {
                return;
            }
            int iM80242K = abstractC26887c0.f107311E.m80242K(bluetoothGatt.getDevice().getBondState() == 12);
            if (iM80242K > 0) {
                abstractC26887c0.m80323U1(3, new C26910o(iM80242K, 0));
            }
            int i18 = abstractC26887c0.f107320N + 1;
            abstractC26887c0.f107320N = i18;
            abstractC26887c0.mo80337g(new RunnableC26912p(this, i18, bluetoothGatt), iM80242K);
            return;
        }
        if (i14 == 0) {
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            C26891e0 c26891e0 = abstractC26887c0.f107335c0;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z4 = abstractC26887c0.f107319M > 0;
            boolean z13 = z4 && jElapsedRealtime > abstractC26887c0.f107319M + 20000;
            if (i13 != 0) {
                abstractC26887c0.m80323U1(5, new C26910o(i13, 1));
            }
            if (i13 != 0 && z4 && !z13 && c26891e0 != null && (i17 = c26891e0.f107354t) > 0) {
                c26891e0.f107354t = i17 - 1;
                int i19 = c26891e0.f107355u;
                if (i19 > 0) {
                    abstractC26887c0.m80323U1(3, new C26910o(i19, 2));
                }
                abstractC26887c0.mo80337g(new RunnableC26914q(this, bluetoothGatt, c26891e0, 0), i19);
                return;
            }
            if (c26891e0 != null && c26891e0.f107356v && abstractC26887c0.f107325S) {
                abstractC26887c0.m80323U1(3, new C26916r(this, 2));
                if (abstractC26887c0.f107321O) {
                    abstractC26887c0.f107321O = false;
                    abstractC26887c0.f107326T = 0;
                }
                abstractC26887c0.mo80334e(new RunnableC26914q(this, bluetoothGatt, c26891e0, 1));
                return;
            }
            abstractC26887c0.f107323Q = true;
            int i24 = -1;
            abstractC26887c0.m80344w1(-1);
            abstractC26887c0.f107322P = false;
            boolean z14 = abstractC26887c0.f107321O;
            boolean z15 = abstractC26887c0.f107317K;
            if (z13) {
                abstractC26887c0.m80325W1(bluetoothGatt.getDevice(), 10);
            } else if (z15) {
                abstractC26887c0.m80325W1(bluetoothGatt.getDevice(), 4);
            } else if (abstractC26903k0 == null || abstractC26903k0.f107385d != 3) {
                BluetoothDevice device = bluetoothGatt.getDevice();
                if (i13 == 0 || i13 == 8) {
                    i15 = 10;
                } else if (i13 != 19) {
                    i15 = i13 != 22 ? -1 : 1;
                } else {
                    i15 = 2;
                }
                abstractC26887c0.m80325W1(device, i15);
            } else {
                abstractC26887c0.m80325W1(bluetoothGatt.getDevice(), 0);
            }
            if (abstractC26903k0 != null && (i16 = abstractC26903k0.f107385d) != 3 && i16 != 6) {
                abstractC26903k0.mo80360e(bluetoothGatt.getDevice(), i13 == 0 ? -1 : i13);
                abstractC26887c0.f107336d0 = null;
            }
            if (c26891e0 != null) {
                if (z15) {
                    i24 = -2;
                } else if (i13 != 0) {
                    i24 = ((i13 == 133 || i13 == 147) && z13) ? -5 : i13;
                }
                c26891e0.mo80360e(bluetoothGatt.getDevice(), i24);
                abstractC26887c0.f107335c0 = null;
            }
            abstractC26887c0.f107323Q = false;
            if (abstractC26903k0 != null && abstractC26903k0.f107385d == 6) {
                return;
            }
            if (z14 && abstractC26887c0.f107325S) {
                abstractC26887c0.m80310G1(bluetoothGatt.getDevice(), null);
            } else {
                abstractC26887c0.f107325S = false;
                abstractC26887c0.m80324V1(false);
            }
            if (z14 || i13 == 0) {
                return;
            }
        } else if (i13 != 0) {
            abstractC26887c0.m80323U1(6, new C26910o(i13, 6));
        }
        abstractC26887c0.m80341k2();
    }

    @Keep
    public void onConnectionUpdated(BluetoothGatt bluetoothGatt, final int i13, final int i14, final int i15, final int i16) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i16 == 0) {
            final int i17 = 0;
            abstractC26887c0.m80323U1(4, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.w
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    int i18 = i17;
                    int i19 = i15;
                    int i24 = i14;
                    int i25 = i13;
                    switch (i18) {
                        case 0:
                            int i26 = BleManagerHandler$4.f107299b;
                            return "Connection parameters updated (interval: " + (((double) i25) * 1.25d) + "ms, latency: " + i24 + ", timeout: " + (i19 * 10) + "ms)";
                        default:
                            int i27 = BleManagerHandler$4.f107299b;
                            return "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: " + (((double) i25) * 1.25d) + "ms, latency: " + i24 + ", timeout: " + (i19 * 10) + "ms)";
                    }
                }
            });
            abstractC26887c0.f107330X = i13;
            abstractC26887c0.f107331Y = i14;
            abstractC26887c0.f107332Z = i15;
            abstractC26887c0.m80332c2(bluetoothGatt, i13, i14, i15);
            AbstractC26903k0 unused = abstractC26887c0.f107336d0;
        } else if (i16 == 59) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "onConnectionUpdated received status: Unacceptable connection interval, interval: ", ", latency: ", ", timeout: ");
            sbM30465s.append(i15);
            Log.e("BleManager", sbM30465s.toString());
            final int i18 = 1;
            abstractC26887c0.m80323U1(5, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.w
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    int i19 = i18;
                    int i110 = i15;
                    int i24 = i14;
                    int i25 = i13;
                    switch (i19) {
                        case 0:
                            int i26 = BleManagerHandler$4.f107299b;
                            return "Connection parameters updated (interval: " + (((double) i25) * 1.25d) + "ms, latency: " + i24 + ", timeout: " + (i110 * 10) + "ms)";
                        default:
                            int i27 = BleManagerHandler$4.f107299b;
                            return "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: " + (((double) i25) * 1.25d) + "ms, latency: " + i24 + ", timeout: " + (i110 * 10) + "ms)";
                    }
                }
            });
            AbstractC26903k0 unused2 = abstractC26887c0.f107336d0;
        } else {
            StringBuilder sbM30465s2 = AbstractC11266d.m30465s(i16, i13, "onConnectionUpdated received status: ", ", interval: ", ", latency: ");
            sbM30465s2.append(i14);
            sbM30465s2.append(", timeout: ");
            sbM30465s2.append(i15);
            Log.e("BleManager", sbM30465s2.toString());
            abstractC26887c0.m80323U1(5, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.x
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    int i19 = BleManagerHandler$4.f107299b;
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(i16, "Connection parameters update failed with status ", " (interval: ");
                    sbM30466t.append(((double) i13) * 1.25d);
                    sbM30466t.append("ms, latency: ");
                    sbM30466t.append(i14);
                    sbM30466t.append(", timeout: ");
                    sbM30466t.append(i15 * 10);
                    sbM30466t.append("ms)");
                    return sbM30466t.toString();
                }
            });
            AbstractC26903k0 unused3 = abstractC26887c0.f107336d0;
            abstractC26887c0.m80341k2();
        }
        if (abstractC26887c0.f107327U) {
            abstractC26887c0.f107327U = false;
            abstractC26887c0.m80324V1(true);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
        onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i13, bluetoothGattDescriptor.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
        byte[] value = bluetoothGattDescriptor.getValue();
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i13 == 0) {
            abstractC26887c0.m80323U1(4, new C26916r(bluetoothGattDescriptor, 0));
            if (AbstractC26886c.f107305j.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                abstractC26887c0.m80323U1(4, new C26906m(1));
            } else if (!AbstractC26886c.f107301f.equals(bluetoothGattDescriptor.getUuid())) {
                abstractC26887c0.m80335e2(bluetoothGatt, bluetoothGattDescriptor);
            } else if (value != null && value.length == 2 && value[1] == 0) {
                byte b = value[0];
                if (b == 0) {
                    abstractC26887c0.m80323U1(4, new C26906m(2));
                } else if (b == 1) {
                    abstractC26887c0.m80323U1(4, new C26906m(3));
                } else if (b == 2) {
                    abstractC26887c0.m80323U1(4, new C26906m(5));
                }
                abstractC26887c0.m80335e2(bluetoothGatt, bluetoothGattDescriptor);
            }
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            if (abstractC26903k0 instanceof C26915q0) {
                C26915q0 c26915q0 = (C26915q0) abstractC26903k0;
                c26915q0.m80367o(bluetoothGatt.getDevice(), value);
                if (c26915q0.f107420v || c26915q0.f107399o || c26915q0.f107393l) {
                    c26915q0.mo80363h(bluetoothGatt.getDevice());
                } else {
                    abstractC26887c0.m80345x1(c26915q0);
                }
            }
        } else {
            if (i13 == 137) {
                AbstractC2875y.m8313z(i13, "Writing descriptor failed with status ", "BleManager");
                return;
            }
            if (i13 == 5 || i13 == 8) {
                abstractC26887c0.m80323U1(5, new C26910o(i13, 3));
                if (bluetoothGatt.getDevice().getBondState() == 12) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    abstractC26887c0.m80341k2();
                }
                AbstractC26903k0 abstractC26903k1 = abstractC26887c0.f107336d0;
                if (abstractC26903k1 instanceof C26915q0) {
                    ((C26915q0) abstractC26903k1).mo80360e(bluetoothGatt.getDevice(), i13);
                }
            } else {
                StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "onDescriptorWrite error ", ", bond state: ");
                sbM30466t.append(bluetoothGatt.getDevice().getBondState());
                Log.e("BleManager", sbM30466t.toString());
                AbstractC26903k0 abstractC26903k2 = abstractC26887c0.f107336d0;
                if (abstractC26903k2 instanceof C26915q0) {
                    ((C26915q0) abstractC26903k2).mo80360e(bluetoothGatt.getDevice(), i13);
                }
                bluetoothGatt.getDevice();
                AbstractC26887c0.m80303t1(abstractC26887c0, i13);
            }
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i13, int i14) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i14 == 0) {
            abstractC26887c0.m80323U1(4, new C26910o(i13, 4));
            abstractC26887c0.f107329W = Math.min(515, i13);
            abstractC26887c0.m80340i2(bluetoothGatt, abstractC26887c0.f107329W);
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            if (abstractC26903k0 instanceof C26895g0) {
                C26895g0 c26895g0 = (C26895g0) abstractC26903k0;
                c26895g0.f107383b.mo80334e(new RunnableC26912p(c26895g0, bluetoothGatt.getDevice(), abstractC26887c0.f107329W));
                c26895g0.mo80363h(bluetoothGatt.getDevice());
            }
        } else {
            Log.e("BleManager", "onMtuChanged error: " + i14 + ", mtu: " + i13);
            AbstractC26903k0 abstractC26903k1 = abstractC26887c0.f107336d0;
            if (abstractC26903k1 instanceof C26895g0) {
                ((C26895g0) abstractC26903k1).mo80360e(bluetoothGatt.getDevice(), i14);
            }
            bluetoothGatt.getDevice();
            AbstractC26887c0.m80303t1(abstractC26887c0, i14);
        }
        if (abstractC26887c0.f107316J) {
            abstractC26887c0.m80324V1(true);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyRead(BluetoothGatt bluetoothGatt, int i13, int i14, int i15) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i15 == 0) {
            abstractC26887c0.m80323U1(4, new C26918t(i13, i14, 0));
            AbstractC26903k0 unused = abstractC26887c0.f107336d0;
        } else {
            abstractC26887c0.m80323U1(5, new C26917s(i15, 2));
            AbstractC26903k0 unused2 = abstractC26887c0.f107336d0;
            abstractC26887c0.m80341k2();
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyUpdate(BluetoothGatt bluetoothGatt, int i13, int i14, int i15) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i15 == 0) {
            abstractC26887c0.m80323U1(4, new C26918t(i13, i14, 1));
            AbstractC26903k0 unused = abstractC26887c0.f107336d0;
        } else {
            abstractC26887c0.m80323U1(5, new C26917s(i15, 5));
            AbstractC26903k0 unused2 = abstractC26887c0.f107336d0;
            abstractC26887c0.m80341k2();
        }
        AbstractC26903k0 unused3 = abstractC26887c0.f107336d0;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i13, int i14) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i14 == 0) {
            abstractC26887c0.m80323U1(4, new C26917s(i13, 0));
            AbstractC26903k0 unused = abstractC26887c0.f107336d0;
        } else {
            abstractC26887c0.m80323U1(5, new C26917s(i14, 1));
            AbstractC26903k0 unused2 = abstractC26887c0.f107336d0;
            abstractC26887c0.m80341k2();
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i13) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        boolean z4 = abstractC26887c0.f107336d0.f107385d == 14;
        abstractC26887c0.f107328V = false;
        if (i13 != 0) {
            Log.e("BleManager", "onReliableWriteCompleted execute " + z4 + ", error " + i13);
            abstractC26887c0.f107336d0.mo80360e(bluetoothGatt.getDevice(), i13);
            bluetoothGatt.getDevice();
            AbstractC26887c0.m80303t1(abstractC26887c0, i13);
        } else {
            if (!z4) {
                abstractC26887c0.m80323U1(5, new C26919u(4));
                abstractC26887c0.f107336d0.mo80363h(bluetoothGatt.getDevice());
                bluetoothGatt.getDevice();
                throw null;
            }
            abstractC26887c0.m80323U1(4, new C26919u(3));
            abstractC26887c0.f107336d0.mo80363h(bluetoothGatt.getDevice());
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @Keep
    public void onServiceChanged(BluetoothGatt bluetoothGatt) {
        C26919u c26919u = new C26919u(0);
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        abstractC26887c0.m80323U1(4, c26919u);
        abstractC26887c0.f107323Q = true;
        abstractC26887c0.f107311E.mo80251T();
        abstractC26887c0.mo80336f2();
        abstractC26887c0.m80344w1(-3);
        abstractC26887c0.f107318L = true;
        abstractC26887c0.f107316J = false;
        abstractC26887c0.m80323U1(2, new C26919u(1));
        abstractC26887c0.m80323U1(3, new C26919u(2));
        bluetoothGatt.discoverServices();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i13) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (abstractC26887c0.f107318L) {
            abstractC26887c0.f107318L = false;
            if (i13 != 0) {
                Log.e("BleManager", "onServicesDiscovered error " + i13);
                bluetoothGatt.getDevice();
                AbstractC26887c0.m80303t1(abstractC26887c0, i13);
                if (abstractC26887c0.f107335c0 != null) {
                    abstractC26887c0.f107335c0.mo80360e(bluetoothGatt.getDevice(), -4);
                    abstractC26887c0.f107335c0 = null;
                }
                abstractC26887c0.m80313J1(-1);
                return;
            }
            abstractC26887c0.m80323U1(4, new C26906m(0));
            abstractC26887c0.f107316J = true;
            if (!abstractC26887c0.f107311E.mo80246O(bluetoothGatt)) {
                abstractC26887c0.m80323U1(5, new C26906m(7));
                abstractC26887c0.f107317K = true;
                abstractC26887c0.m80341k2();
                abstractC26887c0.m80313J1(4);
                return;
            }
            abstractC26887c0.m80323U1(2, new C26906m(4));
            abstractC26887c0.f107317K = false;
            if (abstractC26887c0.f107311E.m80245N(bluetoothGatt)) {
                abstractC26887c0.m80323U1(2, new C26906m(6));
            }
            abstractC26887c0.m80341k2();
            abstractC26887c0.f107323Q = true;
            abstractC26887c0.f107315I = true;
            abstractC26887c0.f107314H = abstractC26887c0.m80308E1(bluetoothGatt);
            boolean z4 = abstractC26887c0.f107314H != null;
            if (z4) {
                for (AbstractC26903k0 abstractC26903k0 : abstractC26887c0.f107314H) {
                    abstractC26903k0.mo80352j(abstractC26887c0);
                    abstractC26903k0.f107391j = true;
                }
            }
            if (abstractC26887c0.f107314H == null) {
                abstractC26887c0.f107314H = new LinkedBlockingDeque();
            }
            if (Build.VERSION.SDK_INT == 28) {
                C26915q0 c26915q0 = new C26915q0(null, 30);
                c26915q0.m80366n(abstractC26887c0);
                abstractC26887c0.m80345x1(c26915q0);
                abstractC26887c0.f107323Q = true;
            }
            if (z4) {
                abstractC26887c0.f107311E.m80252U();
                abstractC26887c0.f107311E.getClass();
            }
            abstractC26887c0.f107311E.mo80243L();
            abstractC26887c0.f107315I = false;
            abstractC26887c0.m80324V1(true);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (bluetoothGattCharacteristic != null && AbstractC26886c.f107305j.equals(bluetoothGattCharacteristic.getUuid())) {
            if (Build.VERSION.SDK_INT <= 30) {
                abstractC26887c0.m80323U1(4, new C26906m(8));
                abstractC26887c0.f107323Q = true;
                abstractC26887c0.f107311E.mo80251T();
                abstractC26887c0.mo80336f2();
                abstractC26887c0.m80344w1(-3);
                abstractC26887c0.f107318L = true;
                abstractC26887c0.m80323U1(2, new C26906m(9));
                abstractC26887c0.m80323U1(3, new C26906m(10));
                bluetoothGatt.discoverServices();
                return;
            }
            return;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(AbstractC26886c.f107301f);
        if (descriptor == null || descriptor.getValue() == null || descriptor.getValue().length != 2 || descriptor.getValue()[0] == 1) {
            final int i13 = 0;
            abstractC26887c0.m80323U1(4, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.y
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    int i14 = i13;
                    byte[] bArr2 = bArr;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                    switch (i14) {
                        case 0:
                            int i15 = BleManagerHandler$4.f107299b;
                            return "Notification received from " + bluetoothGattCharacteristic2.getUuid() + ", value: " + AbstractC31252a.m96274a(bArr2);
                        default:
                            int i16 = BleManagerHandler$4.f107299b;
                            return "Indication received from " + bluetoothGattCharacteristic2.getUuid() + ", value: " + AbstractC31252a.m96274a(bArr2);
                    }
                }
            });
            abstractC26887c0.m80328Z1(bluetoothGatt, bluetoothGattCharacteristic);
        } else {
            final int i14 = 1;
            abstractC26887c0.m80323U1(4, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.y
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    int i15 = i14;
                    byte[] bArr2 = bArr;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                    switch (i15) {
                        case 0:
                            int i16 = BleManagerHandler$4.f107299b;
                            return "Notification received from " + bluetoothGattCharacteristic2.getUuid() + ", value: " + AbstractC31252a.m96274a(bArr2);
                        default:
                            int i17 = BleManagerHandler$4.f107299b;
                            return "Indication received from " + bluetoothGattCharacteristic2.getUuid() + ", value: " + AbstractC31252a.m96274a(bArr2);
                    }
                }
            });
            abstractC26887c0.m80327Y1(bluetoothGatt, bluetoothGattCharacteristic);
        }
        if (abstractC26887c0.f107339g0 != null && AbstractC26886c.f107303h.equals(bluetoothGattCharacteristic.getUuid())) {
            C26911o0 c26911o0 = abstractC26887c0.f107339g0;
            BluetoothDevice device = bluetoothGatt.getDevice();
            InterfaceC25456b interfaceC25456b = c26911o0.f107405a;
            if (interfaceC25456b != null) {
                c26911o0.f107406b.mo80334e(new RunnableC26914q(interfaceC25456b, device, new C26591a(bArr), 2));
            }
        }
        C26911o0 c26911o1 = (C26911o0) abstractC26887c0.f107337e0.get(bluetoothGattCharacteristic);
        if (c26911o1 != null) {
            BluetoothDevice device2 = bluetoothGatt.getDevice();
            InterfaceC25456b interfaceC25456b2 = c26911o1.f107405a;
            if (interfaceC25456b2 == null) {
                return;
            }
            c26911o1.f107406b.mo80334e(new RunnableC26914q(interfaceC25456b2, device2, new C26591a(bArr), 2));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i13 == 0) {
            abstractC26887c0.m80323U1(4, new C26920v(bluetoothGattCharacteristic, bArr, 1));
            abstractC26887c0.m80330a2(bluetoothGatt, bluetoothGattCharacteristic);
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            if (abstractC26903k0 instanceof C26897h0) {
                C26897h0 c26897h0 = (C26897h0) abstractC26903k0;
                c26897h0.m80357p(bluetoothGatt.getDevice(), bArr);
                if (c26897h0.m80356o()) {
                    abstractC26887c0.m80345x1(c26897h0);
                } else {
                    c26897h0.mo80363h(bluetoothGatt.getDevice());
                }
            }
        } else {
            if (i13 == 137) {
                AbstractC2875y.m8313z(i13, "Reading failed with status ", "BleManager");
                return;
            }
            if (i13 == 5 || i13 == 8) {
                abstractC26887c0.m80323U1(5, new C26917s(i13, 4));
                if (bluetoothGatt.getDevice().getBondState() == 12) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    abstractC26887c0.m80341k2();
                }
                AbstractC26903k0 abstractC26903k1 = abstractC26887c0.f107336d0;
                if (abstractC26903k1 instanceof C26897h0) {
                    ((C26897h0) abstractC26903k1).mo80360e(bluetoothGatt.getDevice(), i13);
                }
            } else {
                StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "onCharacteristicRead error ", ", bond state: ");
                sbM30466t.append(bluetoothGatt.getDevice().getBondState());
                Log.e("BleManager", sbM30466t.toString());
                AbstractC26903k0 abstractC26903k2 = abstractC26887c0.f107336d0;
                if (abstractC26903k2 instanceof C26897h0) {
                    ((C26897h0) abstractC26903k2).mo80360e(bluetoothGatt.getDevice(), i13);
                }
                bluetoothGatt.getDevice();
                AbstractC26887c0.m80303t1(abstractC26887c0, i13);
            }
        }
        abstractC26887c0.m80324V1(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13, byte[] bArr) {
        AbstractC26887c0 abstractC26887c0 = this.f107300a;
        if (i13 == 0) {
            abstractC26887c0.m80323U1(4, new C26920v(bluetoothGattDescriptor, bArr, 0));
            abstractC26887c0.m80333d2(bluetoothGatt, bluetoothGattDescriptor);
            AbstractC26903k0 abstractC26903k0 = abstractC26887c0.f107336d0;
            if (abstractC26903k0 instanceof C26897h0) {
                C26897h0 c26897h0 = (C26897h0) abstractC26903k0;
                c26897h0.m80357p(bluetoothGatt.getDevice(), bArr);
                if (c26897h0.m80356o()) {
                    abstractC26887c0.m80345x1(c26897h0);
                } else {
                    c26897h0.mo80363h(bluetoothGatt.getDevice());
                }
            }
        } else {
            if (i13 == 137) {
                AbstractC2875y.m8313z(i13, "Reading descriptor failed with status ", "BleManager");
                return;
            }
            if (i13 == 5 || i13 == 8) {
                abstractC26887c0.m80323U1(5, new C26917s(i13, 3));
                if (bluetoothGatt.getDevice().getBondState() == 12) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    abstractC26887c0.m80341k2();
                }
                AbstractC26903k0 abstractC26903k1 = abstractC26887c0.f107336d0;
                if (abstractC26903k1 instanceof C26897h0) {
                    ((C26897h0) abstractC26903k1).mo80360e(bluetoothGatt.getDevice(), i13);
                }
            } else {
                StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "onDescriptorRead error ", ", bond state: ");
                sbM30466t.append(bluetoothGatt.getDevice().getBondState());
                Log.e("BleManager", sbM30466t.toString());
                AbstractC26903k0 abstractC26903k2 = abstractC26887c0.f107336d0;
                if (abstractC26903k2 instanceof C26897h0) {
                    ((C26897h0) abstractC26903k2).mo80360e(bluetoothGatt.getDevice(), i13);
                }
                bluetoothGatt.getDevice();
                AbstractC26887c0.m80303t1(abstractC26887c0, i13);
            }
        }
        abstractC26887c0.m80324V1(true);
    }
}
