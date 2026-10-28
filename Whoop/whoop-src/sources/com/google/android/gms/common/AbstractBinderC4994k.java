package com.google.android.gms.common;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p072cp.BinderC10935b;
import p310lp.AbstractBinderC24628g;
import p310lp.AbstractC24629h;
import p529uo.AbstractC35135w;
import p529uo.InterfaceC35122j0;

/* JADX INFO: renamed from: com.google.android.gms.common.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4994k extends AbstractBinderC24628g implements InterfaceC35122j0 {

    /* JADX INFO: renamed from: f */
    public final int f20545f;

    public AbstractBinderC4994k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC35135w.m111089a(bArr.length == 25);
        this.f20545f = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: c0 */
    public static byte[] m15620c0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    /* JADX INFO: renamed from: X */
    public abstract byte[] mo15619X();

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC35122j0) {
            try {
                InterfaceC35122j0 interfaceC35122j0 = (InterfaceC35122j0) obj;
                if (((AbstractBinderC4994k) interfaceC35122j0).f20545f == this.f20545f) {
                    return Arrays.equals(mo15619X(), (byte[]) BinderC10935b.m28987c0(BinderC10935b.m28988j0(((AbstractBinderC4994k) interfaceC35122j0).mo15619X())));
                }
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20545f;
    }

    @Override // p310lp.AbstractBinderC24628g
    /* JADX INFO: renamed from: s */
    public final boolean mo15621s(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 == 1) {
            BinderC10935b binderC10935bM28988j0 = BinderC10935b.m28988j0(mo15619X());
            parcel2.writeNoException();
            AbstractC24629h.m71963b(parcel2, binderC10935bM28988j0);
            return true;
        }
        if (i13 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f20545f);
        return true;
    }
}
