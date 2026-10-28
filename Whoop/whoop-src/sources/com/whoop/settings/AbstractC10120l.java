package com.whoop.settings;

import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: com.whoop.settings.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, m65681d2 = {"", "isModal", "", "statusBarTop", "a", "(ZI)I", "modalTopPx", "nonModalTopPx", "b", "(ZII)I", "sectionGated", "c", "(ZZ)Z", "featureFlagEnabled", "movedToDeviceSettings", "d", "(ZZZ)Z", "giftGated", "shopGated", "e", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10120l {

    /* JADX INFO: renamed from: com.whoop.settings.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f30472w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f30472w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f30472w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30472w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m25508a(boolean z4, int i13) {
        if (z4) {
            return 0;
        }
        return i13;
    }

    /* JADX INFO: renamed from: b */
    public static final int m25509b(boolean z4, int i13, int i14) {
        return z4 ? i13 : i14;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m25510c(boolean z4, boolean z13) {
        return z4 || z13;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m25511d(boolean z4, boolean z13, boolean z14) {
        return z4 && z13 && !z14;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m25512e(boolean z4, boolean z13, boolean z14) {
        return (z13 && m25510c(z4, z14)) ? false : true;
    }
}
