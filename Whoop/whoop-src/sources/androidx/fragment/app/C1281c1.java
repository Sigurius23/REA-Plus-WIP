package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import p236j.C21062a;
import p236j.InterfaceC21063b;

/* JADX INFO: renamed from: androidx.fragment.app.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1281c1 implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5559w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1329o1 f5560x;

    public /* synthetic */ C1281c1(AbstractC1329o1 abstractC1329o1, int i13) {
        this.f5559w = i13;
        this.f5560x = abstractC1329o1;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        switch (this.f5559w) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    iArr[i13] = ((Boolean) arrayList.get(i13)).booleanValue() ? 0 : -1;
                }
                AbstractC1329o1 abstractC1329o1 = this.f5560x;
                C1305i1 c1305i1 = (C1305i1) abstractC1329o1.f5704H.pollFirst();
                if (c1305i1 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = c1305i1.f5649w;
                    int i14 = c1305i1.f5650x;
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4056c = abstractC1329o1.f5717c.m4056c(str);
                    if (abstractComponentCallbacksC1320m0M4056c == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        abstractComponentCallbacksC1320m0M4056c.onRequestPermissionsResult(i14, strArr, iArr);
                    }
                }
                break;
            case 1:
                C21062a c21062a = (C21062a) obj;
                AbstractC1329o1 abstractC1329o2 = this.f5560x;
                C1305i1 c1305i2 = (C1305i1) abstractC1329o2.f5704H.pollLast();
                if (c1305i2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = c1305i2.f5649w;
                    int i15 = c1305i2.f5650x;
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4056c2 = abstractC1329o2.f5717c.m4056c(str2);
                    if (abstractComponentCallbacksC1320m0M4056c2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC1320m0M4056c2.onActivityResult(i15, c21062a.f79915w, c21062a.f79916x);
                    }
                }
                break;
            default:
                C21062a c21062a2 = (C21062a) obj;
                AbstractC1329o1 abstractC1329o3 = this.f5560x;
                C1305i1 c1305i3 = (C1305i1) abstractC1329o3.f5704H.pollFirst();
                if (c1305i3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = c1305i3.f5649w;
                    int i16 = c1305i3.f5650x;
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4056c3 = abstractC1329o3.f5717c.m4056c(str3);
                    if (abstractComponentCallbacksC1320m0M4056c3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC1320m0M4056c3.onActivityResult(i16, c21062a2.f79915w, c21062a2.f79916x);
                    }
                }
                break;
        }
    }
}
