package mm;

import a00.C0072g;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3260g;
import com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment;
import com.whoop.p069ui.debug.PushDebugFragment;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import com.whoop.realtime.presentation.C9886j;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import com.whoop.realtime.presentation.StartActivityActivity;
import gm.C15981i;
import gm.C15990r;
import io.C20711w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import jm.EnumC21781c;
import live.hms.video.factories.C24148c;
import mo.C25735p;
import ng3.C26701n;
import ny0.C27266m;
import o52.C27564l0;
import o52.C27565m;
import o52.C27567n;
import od1.C27856s;
import om.InterfaceC28022a;
import p073cq.InterfaceC11037f;
import p127ev.C13668i;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p309lo.InterfaceC24550h;
import p344nm.C26827i;
import p344nm.InterfaceC26821c;
import p344nm.InterfaceC26822d;
import p351nx.InterfaceC27216e;
import p361o9.C27667g;
import p361o9.C27670j;
import p361o9.InterfaceC27674n;
import p377or.C28134h;
import p377or.InterfaceC28139m;
import p394p5.C28846c;
import p394p5.C28848e;
import p440qw.AbstractC30685t;
import p440qw.InterfaceC30680o;
import p465rm.C31551m0;
import p465rm.InterfaceC31582z0;
import p516u8.C34611p0;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p73.InterfaceC28961b;
import qa.C30096a;
import qa.C30102g;
import qa.C30103h;
import qm2.C30492i;
import s30.AbstractC32100b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: mm.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C25680d implements InterfaceC28022a, InterfaceC16915u, InterfaceC3260g, InterfaceC28961b, InterfaceC28139m, InterfaceC11037f, InterfaceC27674n, InterfaceC38049d, InterfaceC27216e, InterfaceC30680o, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101014w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f101015x;

    public /* synthetic */ C25680d(Object obj, int i13) {
        this.f101014w = i13;
        this.f101015x = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m75617a(Display display) {
        C25735p c25735p = (C25735p) this.f101015x;
        c25735p.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c25735p.f101416i = refreshRate;
            c25735p.f101417j = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c25735p.f101416i = -9223372036854775807L;
            c25735p.f101417j = -9223372036854775807L;
        }
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
        switch (this.f101014w) {
            case 8:
                C27567n.m83216R0((C27565m) this.f101015x, obj);
                break;
            case 10:
                StartActivityActivity.m23964k2((C27564l0) this.f101015x, obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C30103h c30103h = (C30103h) this.f101015x;
                C30096a c30096a = (C30096a) obj;
                C30102g c30102g = new C30102g(c30096a.f122819b, C26701n.m79402h(c30096a.f122818a, c30096a.f122820c));
                c30103h.f122834c.add(c30102g);
                long j7 = c30103h.f122841j;
                if (j7 == -9223372036854775807L || c30096a.f122819b >= j7) {
                    c30103h.m92226a(c30102g);
                }
                break;
            case 20:
                ((C41014d0) this.f101015x).m133222a((C30096a) obj);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                BleConnectStrapActivity.m27060O0((C30492i) this.f101015x, obj);
                break;
            default:
                BleConnectStrapActivity.m27064Q0((C30492i) this.f101015x, obj);
                break;
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f101014w) {
            case 6:
                return RealTimeFinishPromptActivity.m23737g0((C27266m) this.f101015x, obj);
            default:
                return ((C27856s) this.f101015x).m84010i((List) obj);
        }
    }

    @Override // p361o9.InterfaceC27674n
    /* JADX INFO: renamed from: c */
    public C41060w0 mo8620c(int i13, C34611p0 c34611p0, int[] iArr) {
        C27670j c27670j = (C27670j) this.f101015x;
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i14 = 0; i14 < c34611p0.f145796a; i14++) {
            c41014d0M133251l.m133222a(new C27667g(i13, c34611p0, i14, c27670j, iArr[i14]));
        }
        return c41014d0M133251l.m133239f();
    }

    @Override // p440qw.InterfaceC30680o
    public Object construct() {
        int i13 = this.f101014w;
        Object obj = this.f101015x;
        switch (i13) {
            case 25:
                Class cls = (Class) obj;
                try {
                    return AbstractC30685t.f126250a.mo94285a(cls);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e5);
                }
            default:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e13) {
                    AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e13);
                } catch (InstantiationException e14) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC34214c.m108137b(constructor) + "' with no args", e14);
                } catch (InvocationTargetException e15) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC34214c.m108137b(constructor) + "' with no args", e15.getCause());
                }
        }
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        switch (this.f101014w) {
            case 0:
                C26827i c26827i = (C26827i) ((InterfaceC26822d) this.f101015x);
                long time = c26827i.f106990x.getTime() - c26827i.f106992z.f106976d;
                SQLiteDatabase sQLiteDatabaseM80058b = c26827i.m80058b();
                sQLiteDatabaseM80058b.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseM80058b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c26827i.m80061m(cursorRawQuery.getInt(0), EnumC21781c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th3) {
                            cursorRawQuery.close();
                            throw th3;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM80058b.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM80058b.setTransactionSuccessful();
                    sQLiteDatabaseM80058b.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th4) {
                    sQLiteDatabaseM80058b.endTransaction();
                    throw th4;
                }
            case 1:
                C26827i c26827i2 = (C26827i) ((InterfaceC26821c) ((C13668i) this.f101015x).f48462i);
                SQLiteDatabase sQLiteDatabaseM80058b2 = c26827i2.m80058b();
                sQLiteDatabaseM80058b2.beginTransaction();
                try {
                    sQLiteDatabaseM80058b2.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM80058b2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c26827i2.f106990x.getTime()).execute();
                    sQLiteDatabaseM80058b2.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM80058b2.endTransaction();
                }
            default:
                C0072g c0072g = (C0072g) this.f101015x;
                Iterator it = ((Iterable) ((C26827i) ((InterfaceC26822d) c0072g.f224y)).m80059i(new C24148c(18))).iterator();
                while (it.hasNext()) {
                    ((C15990r) c0072g.f225z).m45149O((C15981i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p377or.InterfaceC28139m
    /* JADX INFO: renamed from: f */
    public void mo71065f(C28134h c28134h, int i13) {
        C9886j.m24067n0((C9886j) this.f101015x, c28134h, i13);
    }

    @Override // p309lo.InterfaceC24550h
    public void invoke(Object obj) {
        switch (this.f101014w) {
            case 28:
                ((InterfaceC31582z0) obj).mo97314s((C31551m0) this.f101015x);
                break;
            default:
                ((InterfaceC31582z0) obj).mo97313o((C20711w) this.f101015x);
                break;
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f101014w) {
            case 3:
                return PushDebugFragment.m26813f0((PushDebugFragment) this.f101015x, view, c16905q1);
            case 4:
            default:
                return BleConnectStrapActivity.m27124v0((BleConnectStrapActivity) this.f101015x, view, c16905q1);
            case 5:
                return SleepCoachWizardConductorFragment.m18590Z((SleepCoachWizardConductorFragment) this.f101015x, view, c16905q1);
        }
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        int i13 = this.f101014w;
        Object obj2 = this.f101015x;
        switch (i13) {
            case 11:
                StartActivityActivity.m23896N1((C27564l0) obj2, obj);
                break;
            case 12:
            case 13:
            default:
                int i14 = HiddenActivity.f5313y;
                ((C28848e) obj2).invoke(obj);
                break;
            case 14:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0((C28846c) obj2, obj);
                break;
            case 15:
                int i15 = HiddenActivity.f5313y;
                ((C28848e) obj2).invoke(obj);
                break;
            case 16:
                int i16 = HiddenActivity.f5313y;
                ((C28848e) obj2).invoke(obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int i17 = HiddenActivity.f5313y;
                ((C28848e) obj2).invoke(obj);
                break;
        }
    }
}
