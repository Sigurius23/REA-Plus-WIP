package uz2;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3255b;
import com.whoop.whooplive.selfie.SelfieActivity;
import rz2.EnumC31928a;
import vz2.C36620f;
import vz2.EnumC36621g;

/* JADX INFO: renamed from: uz2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35448e implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150950w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SelfieActivity f150951x;

    public /* synthetic */ C35448e(SelfieActivity selfieActivity, int i13) {
        this.f150950w = i13;
        this.f150951x = selfieActivity;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f150950w) {
            case 0:
                this.f150951x.m28804W1((EnumC35444a) obj);
                break;
            case 1:
                this.f150951x.m28878v1((Integer) obj);
                break;
            case 2:
                this.f150951x.m28876u2((EnumC31928a) obj);
                break;
            case 3:
                this.f150951x.m28845k1((View) obj);
                break;
            case 4:
                this.f150951x.m28756G1((View) obj);
                break;
            case 5:
                this.f150951x.m28762I1((View) obj);
                break;
            case 6:
                this.f150951x.m28889z1((View) obj);
                break;
            case 7:
                this.f150951x.m28884x1((View) obj);
                break;
            case 8:
                this.f150951x.m28742B1((View) obj);
                break;
            case 9:
                this.f150951x.m28857o1((byte[]) obj);
                break;
            case 10:
                this.f150951x.m28848l1((View) obj);
                break;
            case 11:
                this.f150951x.m28887y1((View) obj);
                break;
            case 12:
                this.f150951x.m28765J1((View) obj);
                break;
            case 13:
                this.f150951x.m28739A1((View) obj);
                break;
            case 14:
                this.f150951x.m28753F1((View) obj);
                break;
            case 15:
                this.f150951x.m28851m1((View) obj);
                break;
            case 16:
                this.f150951x.m28854n1((View) obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                this.f150951x.m28747D1((View) obj);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                this.f150951x.m28759H1((View) obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                this.f150951x.m28860p1((Throwable) obj);
                break;
            case 20:
                this.f150951x.m28744C1((View) obj);
                break;
            case 21:
                this.f150951x.m28750E1((View) obj);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f150951x.m28863q1((EnumC36621g) obj);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f150951x.m28866r1((C36620f) obj);
                break;
            case 24:
                this.f150951x.m28869s1((Boolean) obj);
                break;
            default:
                this.f150951x.m28881w1((String) obj);
                break;
        }
    }
}
