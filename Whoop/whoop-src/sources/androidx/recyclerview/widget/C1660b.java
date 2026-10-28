package androidx.recyclerview.widget;

import java.util.ArrayList;
import p167g5.C15486e;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1660b {

    /* JADX INFO: renamed from: d */
    public final C1684g1 f6575d;

    /* JADX INFO: renamed from: a */
    public final C15486e f6572a = new C15486e(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList f6573b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f6574c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f6577f = 0;

    /* JADX INFO: renamed from: e */
    public final C1665c f6576e = new C1665c(this);

    public C1660b(C1684g1 c1684g1) {
        this.f6575d = c1684g1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5166a(int i13) {
        ArrayList arrayList = this.f6574c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C1655a c1655a = (C1655a) arrayList.get(i14);
            int i15 = c1655a.f6559a;
            if (i15 != 8) {
                if (i15 == 1) {
                    int i16 = c1655a.f6560b;
                    int i17 = c1655a.f6562d + i16;
                    while (i16 < i17) {
                        if (m5171f(i16, i14 + 1) == i13) {
                            return true;
                        }
                        i16++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m5171f(c1655a.f6562d, i14 + 1) == i13) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m5167b() {
        ArrayList arrayList = this.f6574c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f6575d.m5245a((C1655a) arrayList.get(i13));
        }
        m5176k(arrayList);
        this.f6577f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m5168c() {
        m5167b();
        ArrayList arrayList = this.f6573b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C1655a c1655a = (C1655a) arrayList.get(i13);
            int i14 = c1655a.f6559a;
            C1684g1 c1684g1 = this.f6575d;
            if (i14 == 1) {
                c1684g1.m5245a(c1655a);
                int i15 = c1655a.f6560b;
                int i16 = c1655a.f6562d;
                RecyclerView recyclerView = c1684g1.f6659a;
                recyclerView.offsetPositionRecordsForInsert(i15, i16);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i14 == 2) {
                c1684g1.m5245a(c1655a);
                int i17 = c1655a.f6560b;
                int i18 = c1655a.f6562d;
                RecyclerView recyclerView2 = c1684g1.f6659a;
                recyclerView2.offsetPositionRecordsForRemove(i17, i18, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f6723c += i18;
            } else if (i14 == 4) {
                c1684g1.m5245a(c1655a);
                int i19 = c1655a.f6560b;
                int i24 = c1655a.f6562d;
                Object obj = c1655a.f6561c;
                RecyclerView recyclerView3 = c1684g1.f6659a;
                recyclerView3.viewRangeUpdate(i19, i24, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i14 == 8) {
                c1684g1.m5245a(c1655a);
                int i25 = c1655a.f6560b;
                int i26 = c1655a.f6562d;
                RecyclerView recyclerView4 = c1684g1.f6659a;
                recyclerView4.offsetPositionRecordsForMove(i25, i26);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        m5176k(arrayList);
        this.f6577f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m5169d(C1655a c1655a) {
        int i13;
        C15486e c15486e;
        int i14 = c1655a.f6559a;
        if (i14 == 1 || i14 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM5177l = m5177l(c1655a.f6560b, i14);
        int i15 = c1655a.f6560b;
        int i16 = c1655a.f6559a;
        if (i16 == 2) {
            i13 = 0;
        } else {
            if (i16 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1655a);
            }
            i13 = 1;
        }
        int i17 = 1;
        int i18 = 1;
        while (true) {
            int i19 = c1655a.f6562d;
            c15486e = this.f6572a;
            if (i17 >= i19) {
                break;
            }
            int iM5177l2 = m5177l((i13 * i17) + c1655a.f6560b, c1655a.f6559a);
            int i24 = c1655a.f6559a;
            if (i24 == 2 ? iM5177l2 != iM5177l : !(i24 == 4 && iM5177l2 == iM5177l + 1)) {
                C1655a c1655aM5173h = m5173h(c1655a.f6561c, i24, iM5177l, i18);
                m5170e(c1655aM5173h, i15);
                c1655aM5173h.f6561c = null;
                c15486e.mo43683a(c1655aM5173h);
                if (c1655a.f6559a == 4) {
                    i15 += i18;
                }
                i18 = 1;
                iM5177l = iM5177l2;
            } else {
                i18++;
            }
            i17++;
        }
        Object obj = c1655a.f6561c;
        c1655a.f6561c = null;
        c15486e.mo43683a(c1655a);
        if (i18 > 0) {
            C1655a c1655aM5173h2 = m5173h(obj, c1655a.f6559a, iM5177l, i18);
            m5170e(c1655aM5173h2, i15);
            c1655aM5173h2.f6561c = null;
            c15486e.mo43683a(c1655aM5173h2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5170e(C1655a c1655a, int i13) {
        C1684g1 c1684g1 = this.f6575d;
        c1684g1.m5245a(c1655a);
        RecyclerView recyclerView = c1684g1.f6659a;
        int i14 = c1655a.f6559a;
        if (i14 != 2) {
            if (i14 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i13, c1655a.f6562d, c1655a.f6561c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i15 = c1655a.f6562d;
        recyclerView.offsetPositionRecordsForRemove(i13, i15, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f6723c += i15;
    }

    /* JADX INFO: renamed from: f */
    public final int m5171f(int i13, int i14) {
        ArrayList arrayList = this.f6574c;
        int size = arrayList.size();
        while (i14 < size) {
            C1655a c1655a = (C1655a) arrayList.get(i14);
            int i15 = c1655a.f6559a;
            if (i15 == 8) {
                int i16 = c1655a.f6560b;
                if (i16 == i13) {
                    i13 = c1655a.f6562d;
                } else {
                    if (i16 < i13) {
                        i13--;
                    }
                    if (c1655a.f6562d <= i13) {
                        i13++;
                    }
                }
            } else {
                int i17 = c1655a.f6560b;
                if (i17 > i13) {
                    continue;
                } else if (i15 == 2) {
                    int i18 = c1655a.f6562d;
                    if (i13 < i17 + i18) {
                        return -1;
                    }
                    i13 -= i18;
                } else if (i15 == 1) {
                    i13 += c1655a.f6562d;
                }
            }
            i14++;
        }
        return i13;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5172g() {
        return this.f6573b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public final C1655a m5173h(Object obj, int i13, int i14, int i15) {
        C1655a c1655a = (C1655a) this.f6572a.mo43684b();
        if (c1655a != null) {
            c1655a.f6559a = i13;
            c1655a.f6560b = i14;
            c1655a.f6562d = i15;
            c1655a.f6561c = obj;
            return c1655a;
        }
        C1655a c1655a2 = new C1655a();
        c1655a2.f6559a = i13;
        c1655a2.f6560b = i14;
        c1655a2.f6562d = i15;
        c1655a2.f6561c = obj;
        return c1655a2;
    }

    /* JADX INFO: renamed from: i */
    public final void m5174i(C1655a c1655a) {
        this.f6574c.add(c1655a);
        int i13 = c1655a.f6559a;
        C1684g1 c1684g1 = this.f6575d;
        if (i13 == 1) {
            int i14 = c1655a.f6560b;
            int i15 = c1655a.f6562d;
            RecyclerView recyclerView = c1684g1.f6659a;
            recyclerView.offsetPositionRecordsForInsert(i14, i15);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i13 == 2) {
            int i16 = c1655a.f6560b;
            int i17 = c1655a.f6562d;
            RecyclerView recyclerView2 = c1684g1.f6659a;
            recyclerView2.offsetPositionRecordsForRemove(i16, i17, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i13 == 4) {
            int i18 = c1655a.f6560b;
            int i19 = c1655a.f6562d;
            Object obj = c1655a.f6561c;
            RecyclerView recyclerView3 = c1684g1.f6659a;
            recyclerView3.viewRangeUpdate(i18, i19, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i13 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c1655a);
        }
        int i24 = c1655a.f6560b;
        int i25 = c1655a.f6562d;
        RecyclerView recyclerView4 = c1684g1.f6659a;
        recyclerView4.offsetPositionRecordsForMove(i24, i25);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:186:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    /* JADX INFO: renamed from: j */
    public final void m5175j() {
        ArrayList arrayList;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C1655a c1655aM5173h;
        int i18;
        int i19;
        int i24;
        C1655a c1655aM5173h2;
        boolean z4;
        boolean z13;
        Object obj;
        C1655a c1655a;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        C1665c c1665c = this.f6576e;
        c1665c.getClass();
        while (true) {
            arrayList = this.f6573b;
            i13 = 1;
            int size = arrayList.size() - 1;
            boolean z14 = false;
            while (true) {
                i14 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1655a) arrayList.get(size)).f6559a != 8) {
                    z14 = true;
                } else if (z14) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i37 = size + 1;
            C1660b c1660b = (C1660b) c1665c.f6585w;
            C15486e c15486e = c1660b.f6572a;
            C1655a c1655a2 = (C1655a) arrayList.get(size);
            C1655a c1655a3 = (C1655a) arrayList.get(i37);
            int i38 = c1655a3.f6559a;
            if (i38 == 1) {
                int i39 = c1655a2.f6562d;
                int i44 = c1655a3.f6560b;
                int i45 = i39 < i44 ? -1 : 0;
                int i46 = c1655a2.f6560b;
                if (i46 < i44) {
                    i45++;
                }
                if (i44 <= i46) {
                    c1655a2.f6560b = i46 + c1655a3.f6562d;
                }
                int i47 = c1655a3.f6560b;
                if (i47 <= i39) {
                    c1655a2.f6562d = i39 + c1655a3.f6562d;
                }
                c1655a3.f6560b = i47 + i45;
                arrayList.set(size, c1655a3);
                arrayList.set(i37, c1655a2);
            } else if (i38 == 2) {
                int i48 = c1655a2.f6560b;
                int i49 = c1655a2.f6562d;
                if (i48 < i49) {
                    z13 = c1655a3.f6560b == i48 && c1655a3.f6562d == i49 - i48;
                    z4 = false;
                } else if (c1655a3.f6560b == i49 + 1 && c1655a3.f6562d == i48 - i49) {
                    z13 = true;
                    z4 = true;
                } else {
                    z4 = true;
                    z13 = false;
                }
                int i54 = c1655a3.f6560b;
                if (i49 < i54) {
                    c1655a3.f6560b = i54 - 1;
                } else {
                    int i55 = c1655a3.f6562d;
                    if (i49 < i54 + i55) {
                        c1655a3.f6562d = i55 - 1;
                        c1655a2.f6559a = 2;
                        c1655a2.f6562d = 1;
                        if (c1655a3.f6562d == 0) {
                            arrayList.remove(i37);
                            c1655a3.f6561c = null;
                            c15486e.mo43683a(c1655a3);
                        }
                    }
                }
                int i56 = c1655a2.f6560b;
                int i57 = c1655a3.f6560b;
                if (i56 <= i57) {
                    c1655a3.f6560b = i57 + 1;
                } else {
                    int i58 = i57 + c1655a3.f6562d;
                    if (i56 < i58) {
                        obj = null;
                        C1655a c1655aM5173h3 = c1660b.m5173h(null, 2, i56 + 1, i58 - i56);
                        c1655a3.f6562d = c1655a2.f6560b - c1655a3.f6560b;
                        c1655a = c1655aM5173h3;
                    }
                    if (z13) {
                        arrayList.set(size, c1655a3);
                        arrayList.remove(i37);
                        c1655a2.f6561c = obj;
                        c15486e.mo43683a(c1655a2);
                    } else {
                        if (z4) {
                            if (c1655a != null) {
                                i35 = c1655a2.f6560b;
                                if (i35 > c1655a.f6560b) {
                                    c1655a2.f6560b = i35 - c1655a.f6562d;
                                }
                                i36 = c1655a2.f6562d;
                                if (i36 > c1655a.f6560b) {
                                    c1655a2.f6562d = i36 - c1655a.f6562d;
                                }
                            }
                            i29 = c1655a2.f6560b;
                            if (i29 > c1655a3.f6560b) {
                                c1655a2.f6560b = i29 - c1655a3.f6562d;
                            }
                            i34 = c1655a2.f6562d;
                            if (i34 > c1655a3.f6560b) {
                                c1655a2.f6562d = i34 - c1655a3.f6562d;
                            }
                        } else {
                            if (c1655a != null) {
                                i27 = c1655a2.f6560b;
                                if (i27 >= c1655a.f6560b) {
                                    c1655a2.f6560b = i27 - c1655a.f6562d;
                                }
                                i28 = c1655a2.f6562d;
                                if (i28 >= c1655a.f6560b) {
                                    c1655a2.f6562d = i28 - c1655a.f6562d;
                                }
                            }
                            i25 = c1655a2.f6560b;
                            if (i25 >= c1655a3.f6560b) {
                                c1655a2.f6560b = i25 - c1655a3.f6562d;
                            }
                            i26 = c1655a2.f6562d;
                            if (i26 >= c1655a3.f6560b) {
                                c1655a2.f6562d = i26 - c1655a3.f6562d;
                            }
                        }
                        arrayList.set(size, c1655a3);
                        if (c1655a2.f6560b != c1655a2.f6562d) {
                            arrayList.set(i37, c1655a2);
                        } else {
                            arrayList.remove(i37);
                        }
                        if (c1655a != null) {
                            arrayList.add(size, c1655a);
                        }
                    }
                }
                obj = null;
                c1655a = null;
                if (z13) {
                    arrayList.set(size, c1655a3);
                    arrayList.remove(i37);
                    c1655a2.f6561c = obj;
                    c15486e.mo43683a(c1655a2);
                } else {
                    if (z4) {
                        if (c1655a != null) {
                            i35 = c1655a2.f6560b;
                            if (i35 > c1655a.f6560b) {
                                c1655a2.f6560b = i35 - c1655a.f6562d;
                            }
                            i36 = c1655a2.f6562d;
                            if (i36 > c1655a.f6560b) {
                                c1655a2.f6562d = i36 - c1655a.f6562d;
                            }
                        }
                        i29 = c1655a2.f6560b;
                        if (i29 > c1655a3.f6560b) {
                            c1655a2.f6560b = i29 - c1655a3.f6562d;
                        }
                        i34 = c1655a2.f6562d;
                        if (i34 > c1655a3.f6560b) {
                            c1655a2.f6562d = i34 - c1655a3.f6562d;
                        }
                    } else {
                        if (c1655a != null) {
                            i27 = c1655a2.f6560b;
                            if (i27 >= c1655a.f6560b) {
                                c1655a2.f6560b = i27 - c1655a.f6562d;
                            }
                            i28 = c1655a2.f6562d;
                            if (i28 >= c1655a.f6560b) {
                                c1655a2.f6562d = i28 - c1655a.f6562d;
                            }
                        }
                        i25 = c1655a2.f6560b;
                        if (i25 >= c1655a3.f6560b) {
                            c1655a2.f6560b = i25 - c1655a3.f6562d;
                        }
                        i26 = c1655a2.f6562d;
                        if (i26 >= c1655a3.f6560b) {
                            c1655a2.f6562d = i26 - c1655a3.f6562d;
                        }
                    }
                    arrayList.set(size, c1655a3);
                    if (c1655a2.f6560b != c1655a2.f6562d) {
                        arrayList.set(i37, c1655a2);
                    } else {
                        arrayList.remove(i37);
                    }
                    if (c1655a != null) {
                        arrayList.add(size, c1655a);
                    }
                }
            } else if (i38 == 4) {
                int i59 = c1655a2.f6562d;
                int i64 = c1655a3.f6560b;
                if (i59 < i64) {
                    c1655a3.f6560b = i64 - 1;
                } else {
                    int i65 = c1655a3.f6562d;
                    if (i59 < i64 + i65) {
                        c1655a3.f6562d = i65 - 1;
                        c1655aM5173h = c1660b.m5173h(c1655a3.f6561c, 4, c1655a2.f6560b, 1);
                    }
                    i18 = c1655a2.f6560b;
                    i19 = c1655a3.f6560b;
                    if (i18 <= i19) {
                        c1655a3.f6560b = i19 + 1;
                    } else {
                        i24 = i19 + c1655a3.f6562d;
                        if (i18 < i24) {
                            int i66 = i24 - i18;
                            c1655aM5173h2 = c1660b.m5173h(c1655a3.f6561c, 4, i18 + 1, i66);
                            c1655a3.f6562d -= i66;
                        }
                        arrayList.set(i37, c1655a2);
                        if (c1655a3.f6562d > 0) {
                            arrayList.set(size, c1655a3);
                        } else {
                            arrayList.remove(size);
                            c1655a3.f6561c = null;
                            c15486e.mo43683a(c1655a3);
                        }
                        if (c1655aM5173h != null) {
                            arrayList.add(size, c1655aM5173h);
                        }
                        if (c1655aM5173h2 != null) {
                            arrayList.add(size, c1655aM5173h2);
                        }
                    }
                    c1655aM5173h2 = null;
                    arrayList.set(i37, c1655a2);
                    if (c1655a3.f6562d > 0) {
                        arrayList.set(size, c1655a3);
                    } else {
                        arrayList.remove(size);
                        c1655a3.f6561c = null;
                        c15486e.mo43683a(c1655a3);
                    }
                    if (c1655aM5173h != null) {
                        arrayList.add(size, c1655aM5173h);
                    }
                    if (c1655aM5173h2 != null) {
                        arrayList.add(size, c1655aM5173h2);
                    }
                }
                c1655aM5173h = null;
                i18 = c1655a2.f6560b;
                i19 = c1655a3.f6560b;
                if (i18 <= i19) {
                    c1655a3.f6560b = i19 + 1;
                } else {
                    i24 = i19 + c1655a3.f6562d;
                    if (i18 < i24) {
                        int i67 = i24 - i18;
                        c1655aM5173h2 = c1660b.m5173h(c1655a3.f6561c, 4, i18 + 1, i67);
                        c1655a3.f6562d -= i67;
                    }
                    arrayList.set(i37, c1655a2);
                    if (c1655a3.f6562d > 0) {
                        arrayList.set(size, c1655a3);
                    } else {
                        arrayList.remove(size);
                        c1655a3.f6561c = null;
                        c15486e.mo43683a(c1655a3);
                    }
                    if (c1655aM5173h != null) {
                        arrayList.add(size, c1655aM5173h);
                    }
                    if (c1655aM5173h2 != null) {
                        arrayList.add(size, c1655aM5173h2);
                    }
                }
                c1655aM5173h2 = null;
                arrayList.set(i37, c1655a2);
                if (c1655a3.f6562d > 0) {
                    arrayList.set(size, c1655a3);
                } else {
                    arrayList.remove(size);
                    c1655a3.f6561c = null;
                    c15486e.mo43683a(c1655a3);
                }
                if (c1655aM5173h != null) {
                    arrayList.add(size, c1655aM5173h);
                }
                if (c1655aM5173h2 != null) {
                    arrayList.add(size, c1655aM5173h2);
                }
            }
        }
        int size2 = arrayList.size();
        int i68 = 0;
        while (i68 < size2) {
            C1655a c1655aM5173h4 = (C1655a) arrayList.get(i68);
            int i69 = c1655aM5173h4.f6559a;
            if (i69 != i13) {
                C15486e c15486e2 = this.f6572a;
                C1684g1 c1684g1 = this.f6575d;
                if (i69 != 2) {
                    if (i69 == 4) {
                        int i74 = c1655aM5173h4.f6560b;
                        int i75 = c1655aM5173h4.f6562d + i74;
                        int i76 = i74;
                        int i77 = -1;
                        int i78 = 0;
                        while (i74 < i75) {
                            if (c1684g1.m5246b(i74) != null || m5166a(i74)) {
                                if (i77 == 0) {
                                    m5169d(m5173h(c1655aM5173h4.f6561c, 4, i76, i78));
                                    i76 = i74;
                                    i78 = 0;
                                }
                                i77 = i13;
                            } else {
                                if (i77 == i13) {
                                    m5174i(m5173h(c1655aM5173h4.f6561c, 4, i76, i78));
                                    i76 = i74;
                                    i78 = 0;
                                }
                                i77 = 0;
                            }
                            i78 += i13;
                            i74++;
                        }
                        if (i78 != c1655aM5173h4.f6562d) {
                            Object obj2 = c1655aM5173h4.f6561c;
                            c1655aM5173h4.f6561c = null;
                            c15486e2.mo43683a(c1655aM5173h4);
                            c1655aM5173h4 = m5173h(obj2, 4, i76, i78);
                        }
                        if (i77 == 0) {
                            m5169d(c1655aM5173h4);
                        } else {
                            m5174i(c1655aM5173h4);
                        }
                    } else if (i69 == i14) {
                        m5174i(c1655aM5173h4);
                    }
                    i15 = i13;
                } else {
                    int i79 = c1655aM5173h4.f6560b;
                    int i83 = c1655aM5173h4.f6562d + i79;
                    int i84 = i79;
                    int i85 = -1;
                    int i86 = 0;
                    while (i84 < i83) {
                        if (c1684g1.m5246b(i84) != null || m5166a(i84)) {
                            i16 = i13;
                            if (i85 == 0) {
                                m5169d(m5173h(null, 2, i79, i86));
                                i17 = i16;
                            } else {
                                i17 = 0;
                            }
                            i85 = i16;
                        } else {
                            i16 = i13;
                            if (i85 == i13) {
                                m5174i(m5173h(null, 2, i79, i86));
                                i17 = i16;
                            } else {
                                i17 = 0;
                            }
                            i85 = 0;
                        }
                        if (i17 != 0) {
                            i84 -= i86;
                            i83 -= i86;
                            i86 = i16;
                        } else {
                            i86++;
                        }
                        i84++;
                        i13 = i16;
                    }
                    i15 = i13;
                    if (i86 != c1655aM5173h4.f6562d) {
                        c1655aM5173h4.f6561c = null;
                        c15486e2.mo43683a(c1655aM5173h4);
                        c1655aM5173h4 = m5173h(null, 2, i79, i86);
                    }
                    if (i85 == 0) {
                        m5169d(c1655aM5173h4);
                    } else {
                        m5174i(c1655aM5173h4);
                    }
                }
            } else {
                i15 = i13;
                m5174i(c1655aM5173h4);
            }
            i68++;
            i13 = i15;
            i14 = 8;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m5176k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C1655a c1655a = (C1655a) arrayList.get(i13);
            c1655a.f6561c = null;
            this.f6572a.mo43683a(c1655a);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: l */
    public final int m5177l(int i13, int i14) {
        int i15;
        int i16;
        ArrayList arrayList = this.f6574c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1655a c1655a = (C1655a) arrayList.get(size);
            int i17 = c1655a.f6559a;
            if (i17 == 8) {
                int i18 = c1655a.f6560b;
                int i19 = c1655a.f6562d;
                if (i18 < i19) {
                    i16 = i18;
                    i15 = i19;
                } else {
                    i15 = i18;
                    i16 = i19;
                }
                if (i13 < i16 || i13 > i15) {
                    if (i13 < i18) {
                        if (i14 == 1) {
                            c1655a.f6560b = i18 + 1;
                            c1655a.f6562d = i19 + 1;
                        } else if (i14 == 2) {
                            c1655a.f6560b = i18 - 1;
                            c1655a.f6562d = i19 - 1;
                        }
                    }
                } else if (i16 == i18) {
                    if (i14 == 1) {
                        c1655a.f6562d = i19 + 1;
                    } else if (i14 == 2) {
                        c1655a.f6562d = i19 - 1;
                    }
                    i13++;
                } else {
                    if (i14 == 1) {
                        c1655a.f6560b = i18 + 1;
                    } else if (i14 == 2) {
                        c1655a.f6560b = i18 - 1;
                    }
                    i13--;
                }
            } else {
                int i24 = c1655a.f6560b;
                if (i24 <= i13) {
                    if (i17 == 1) {
                        i13 -= c1655a.f6562d;
                    } else if (i17 == 2) {
                        i13 += c1655a.f6562d;
                    }
                } else if (i14 == 1) {
                    c1655a.f6560b = i24 + 1;
                } else if (i14 == 2) {
                    c1655a.f6560b = i24 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1655a c1655a2 = (C1655a) arrayList.get(size2);
            int i25 = c1655a2.f6559a;
            C15486e c15486e = this.f6572a;
            if (i25 == 8) {
                int i26 = c1655a2.f6562d;
                if (i26 == c1655a2.f6560b || i26 < 0) {
                    arrayList.remove(size2);
                    c1655a2.f6561c = null;
                    c15486e.mo43683a(c1655a2);
                }
            } else if (c1655a2.f6562d <= 0) {
                arrayList.remove(size2);
                c1655a2.f6561c = null;
                c15486e.mo43683a(c1655a2);
            }
        }
        return i13;
    }
}
