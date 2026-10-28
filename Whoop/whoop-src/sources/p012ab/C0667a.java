package p012ab;

import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import bb.C2917d;
import p032bc.AbstractC2974w;
import p032bc.InterfaceC2972u;
import p032bc.InterfaceC2973v;
import p047c9.C4317h;
import p047c9.InterfaceC4311b;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33649r;
import p516u8.C34606n;
import p516u8.InterfaceC34595h0;
import p607x8.C38061p;
import p607x8.C38064s;
import p607x8.InterfaceC38051f;
import p607x8.InterfaceC38052g;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.InterfaceC30105j;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0667a implements InterfaceC33649r, InterfaceC39718e, InterfaceC38051f, InterfaceC2973v, InterfaceC38052g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2319w;

    public /* synthetic */ C0667a(int i13) {
        this.f2319w = i13;
    }

    @Override // p607x8.InterfaceC38052g
    /* JADX INFO: renamed from: a */
    public void mo1654a(Object obj, C34606n c34606n) {
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        return new C4317h((C38061p) obj);
    }

    @Override // p032bc.InterfaceC2973v
    /* JADX INFO: renamed from: b */
    public void mo1655b(InterfaceC2972u interfaceC2972u, AbstractC2974w abstractC2974w, boolean z4) {
        switch (this.f2319w) {
            case 10:
                interfaceC2972u.mo8608f(abstractC2974w);
                break;
            case 11:
                interfaceC2972u.mo8572c(abstractC2974w);
                break;
            case 12:
                interfaceC2972u.mo8573d(abstractC2974w);
                break;
            case 13:
                interfaceC2972u.mo8600a();
                break;
            default:
                interfaceC2972u.mo8601e();
                break;
        }
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: d */
    public InterfaceC33644n[] mo1656d() {
        int i13 = 0;
        switch (this.f2319w) {
            case 0:
                return new InterfaceC33644n[]{new C0669b()};
            case 1:
                return new InterfaceC33644n[]{new C0673d()};
            case 2:
                return new InterfaceC33644n[]{new C0675e(0)};
            case 3:
                return new InterfaceC33644n[]{new C0674d0()};
            case 4:
                C38064s c38064s = new C38064s(0L);
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                return new InterfaceC33644n[]{new C0686j0(1, InterfaceC30105j.f122843p, c38064s, new C0679g(C41060w0.f177067E, i13))};
            default:
                return new InterfaceC33644n[]{new C2917d()};
        }
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        switch (this.f2319w) {
            case 7:
                ((InterfaceC34595h0) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            case 8:
                ((InterfaceC34595h0) obj).onRenderedFirstFrame();
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 27:
            default:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 15:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 16:
                ((InterfaceC4311b) obj).getClass();
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((InterfaceC4311b) obj).getClass();
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((InterfaceC4311b) obj).getClass();
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 20:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 21:
                ((InterfaceC4311b) obj).getClass();
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((InterfaceC4311b) obj).getClass();
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 24:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 25:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 26:
                ((InterfaceC4311b) obj).getClass();
                break;
            case 28:
                ((InterfaceC4311b) obj).getClass();
                break;
        }
    }
}
