package p524ui;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import p119ej.C13226c;

/* JADX INFO: renamed from: ui.z */
/* JADX INFO: loaded from: classes.dex */
public final class C34998z {

    /* JADX INFO: renamed from: a */
    public final ArrayList f148054a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f148055b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f148056c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f148057d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f148058e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f148059f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f148060g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f148061h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f148062i;

    public C34998z(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C34970a0) obj).m110466c() instanceof Integer) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C34970a0) obj2).m110466c() instanceof PointF) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((C34970a0) obj3).m110466c() instanceof Float) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((C34970a0) obj4).m110466c() instanceof C13226c) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (((C34970a0) obj5).m110466c() instanceof ColorFilter) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (((C34970a0) obj6).m110466c() instanceof Object[]) {
                arrayList7.add(obj6);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj7 : arrayList) {
            if (((C34970a0) obj7).m110466c() instanceof Typeface) {
                arrayList8.add(obj7);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj8 : arrayList) {
            if (((C34970a0) obj8).m110466c() instanceof Bitmap) {
                arrayList9.add(obj8);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj9 : arrayList) {
            if (((C34970a0) obj9).m110466c() instanceof CharSequence) {
                arrayList10.add(obj9);
            }
        }
        this.f148054a = arrayList2;
        this.f148055b = arrayList3;
        this.f148056c = arrayList4;
        this.f148057d = arrayList5;
        this.f148058e = arrayList6;
        this.f148059f = arrayList7;
        this.f148060g = arrayList8;
        this.f148061h = arrayList9;
        this.f148062i = arrayList10;
    }
}
