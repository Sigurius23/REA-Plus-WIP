package com.whoop.memberdataexport.p063ui;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import jv1.AbstractC21968a;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: com.whoop.memberdataexport.ui.a */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC9070a {

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.a$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f27154a;

        public /* synthetic */ a(int i13, String str, String str2, String str3) {
            this(str, str2, str3);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC21968a.f85038a;
        }

        /* JADX INFO: renamed from: b */
        public String m22601b() {
            return (String) this.f27154a.get(NotificationCompat.CATEGORY_EMAIL);
        }

        /* JADX INFO: renamed from: c */
        public String m22602c() {
            return (String) this.f27154a.get("submissionLoadingDisplay");
        }

        /* JADX INFO: renamed from: d */
        public String m22603d() {
            return (String) this.f27154a.get("submissionSuccessDisplay");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27154a.containsKey(NotificationCompat.CATEGORY_EMAIL) != aVar.f27154a.containsKey(NotificationCompat.CATEGORY_EMAIL)) {
                return false;
            }
            if (m22601b() == null ? aVar.m22601b() != null : !m22601b().equals(aVar.m22601b())) {
                return false;
            }
            if (this.f27154a.containsKey("submissionLoadingDisplay") != aVar.f27154a.containsKey("submissionLoadingDisplay")) {
                return false;
            }
            if (m22602c() == null ? aVar.m22602c() != null : !m22602c().equals(aVar.m22602c())) {
                return false;
            }
            if (this.f27154a.containsKey("submissionSuccessDisplay") != aVar.f27154a.containsKey("submissionSuccessDisplay")) {
                return false;
            }
            if (m22603d() == null ? aVar.m22603d() == null : m22603d().equals(aVar.m22603d())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f27154a.containsKey(NotificationCompat.CATEGORY_EMAIL)) {
                bundle.putString(NotificationCompat.CATEGORY_EMAIL, (String) this.f27154a.get(NotificationCompat.CATEGORY_EMAIL));
            }
            if (this.f27154a.containsKey("submissionLoadingDisplay")) {
                bundle.putString("submissionLoadingDisplay", (String) this.f27154a.get("submissionLoadingDisplay"));
            }
            if (this.f27154a.containsKey("submissionSuccessDisplay")) {
                bundle.putString("submissionSuccessDisplay", (String) this.f27154a.get("submissionSuccessDisplay"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((((m22601b() != null ? m22601b().hashCode() : 0) + 31) * 31) + (m22602c() != null ? m22602c().hashCode() : 0)) * 31) + (m22603d() != null ? m22603d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "MemberdataexportActionMemberdataexportMdefragmentToMemberdataexportSubmitmdefragment(actionId=" + mo19186a() + "){email=" + m22601b() + ", submissionLoadingDisplay=" + m22602c() + ", submissionSuccessDisplay=" + m22603d() + "}";
        }

        private a(String str, String str2, String str3) {
            HashMap map = new HashMap();
            this.f27154a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put(NotificationCompat.CATEGORY_EMAIL, str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"submissionLoadingDisplay\" is marked as non-null but was passed a null value.");
            }
            map.put("submissionLoadingDisplay", str2);
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"submissionSuccessDisplay\" is marked as non-null but was passed a null value.");
            }
            map.put("submissionSuccessDisplay", str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m22600a(String str, String str2, String str3) {
        return new a(0, str, str2, str3);
    }
}
