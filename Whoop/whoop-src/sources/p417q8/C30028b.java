package p417q8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.media.session.HandlerC1074h;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import pg3.C29205p;

/* JADX INFO: renamed from: q8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C30028b {

    /* JADX INFO: renamed from: f */
    public static final Object f122546f = new Object();

    /* JADX INFO: renamed from: g */
    public static C30028b f122547g;

    /* JADX INFO: renamed from: a */
    public final Context f122548a;

    /* JADX INFO: renamed from: b */
    public final HashMap f122549b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f122550c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f122551d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HandlerC1074h f122552e;

    public C30028b(Context context) {
        this.f122548a = context;
        this.f122552e = new HandlerC1074h(this, context.getMainLooper(), 3);
    }

    /* JADX INFO: renamed from: a */
    public static C30028b m91918a(Context context) {
        C30028b c30028b;
        synchronized (f122546f) {
            try {
                if (f122547g == null) {
                    f122547g = new C30028b(context.getApplicationContext());
                }
                c30028b = f122547g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c30028b;
    }

    /* JADX INFO: renamed from: b */
    public final void m91919b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f122549b) {
            try {
                C30027a c30027a = new C30027a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f122549b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f122549b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c30027a);
                for (int i13 = 0; i13 < intentFilter.countActions(); i13++) {
                    String action = intentFilter.getAction(i13);
                    ArrayList arrayList2 = (ArrayList) this.f122550c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f122550c.put(action, arrayList2);
                    }
                    arrayList2.add(c30027a);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m91920c(Intent intent) {
        String str;
        synchronized (this.f122549b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f122548a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f122550c.get(intent.getAction());
                if (arrayList != null) {
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        C30027a c30027a = (C30027a) arrayList.get(i13);
                        if (z4) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c30027a.f122542a);
                        }
                        if (c30027a.f122544c) {
                            if (z4) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = c30027a.f122542a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z4) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(c30027a);
                                c30027a.f122544c = true;
                            } else {
                                arrayList = arrayList;
                                if (z4) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i13++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            ((C30027a) arrayList2.get(i14)).f122544c = false;
                        }
                        this.f122551d.add(new C29205p(intent, arrayList2, false, 2));
                        if (!this.f122552e.hasMessages(1)) {
                            this.f122552e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m91921d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f122549b) {
            try {
                ArrayList arrayList = (ArrayList) this.f122549b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C30027a c30027a = (C30027a) arrayList.get(size);
                    c30027a.f122545d = true;
                    for (int i13 = 0; i13 < c30027a.f122542a.countActions(); i13++) {
                        String action = c30027a.f122542a.getAction(i13);
                        ArrayList arrayList2 = (ArrayList) this.f122550c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C30027a c30027a2 = (C30027a) arrayList2.get(size2);
                                if (c30027a2.f122543b == broadcastReceiver) {
                                    c30027a2.f122545d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f122550c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
