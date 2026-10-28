package com.whoop.stories;

import android.os.Bundle;
import hi0.AbstractC17307e;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: com.whoop.stories.a */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC10268a {

    /* JADX INFO: renamed from: com.whoop.stories.a$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f31024a;

        public /* synthetic */ a(String str, int i13) {
            this(str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66718d;
        }

        /* JADX INFO: renamed from: b */
        public String m26183b() {
            return (String) this.f31024a.get("onboardingStoryType");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f31024a.containsKey("onboardingStoryType") != aVar.f31024a.containsKey("onboardingStoryType")) {
                return false;
            }
            if (m26183b() == null ? aVar.m26183b() == null : m26183b().equals(aVar.m26183b())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f31024a.containsKey("onboardingStoryType")) {
                bundle.putString("onboardingStoryType", (String) this.f31024a.get("onboardingStoryType"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m26183b() != null ? m26183b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionDebugOnboardingToOnboarding(actionId=" + mo19186a() + "){onboardingStoryType=" + m26183b() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f31024a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"onboardingStoryType\" is marked as non-null but was passed a null value.");
            }
            map.put("onboardingStoryType", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m26182a(String str) {
        return new a(str, 0);
    }
}
