package com.mapbox.maps.renderer.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.os.Build;
import com.mapbox.maps.MapboxConstants;
import com.mapbox.maps.MapboxLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25269w;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001b\u001c\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser;", "", "translucentSurface", "", "antialiasingSampleCount", "", "mapName", "", "(ZILjava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "antialiasingEnabled", "getAntialiasingEnabled", "()Z", "configAttributes", "", "getConfigAttributes", "()[I", "chooseBestMatchConfig", "Landroid/opengl/EGLConfig;", "display", "Landroid/opengl/EGLDisplay;", "configs", "", "chooseConfig", "getConfigs", "BufferFormat", "Companion", "DepthStencilFormat", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class EGLConfigChooser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int STENCIL_SIZE = 8;
    private final String TAG;
    private int antialiasingSampleCount;
    private final boolean translucentSurface;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$BufferFormat;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Format32BitAlpha", "Format32BitNoAlpha", "Format24Bit", "Format16Bit", "Unknown", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum BufferFormat {
        Format32BitAlpha(0),
        Format32BitNoAlpha(1),
        Format24Bit(2),
        Format16Bit(3),
        Unknown(4);

        private int value;

        BufferFormat(int i13) {
            this.value = i13;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i13) {
            this.value = i13;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fR$\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$Companion;", "", "()V", "STENCIL_SIZE", "", "getSTENCIL_SIZE$maps_sdk_release$annotations", "getSTENCIL_SIZE$maps_sdk_release", "()I", "setSTENCIL_SIZE$maps_sdk_release", "(I)V", "inEmulator", "", "inEmulator$maps_sdk_release", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSTENCIL_SIZE$maps_sdk_release$annotations() {
        }

        public final int getSTENCIL_SIZE$maps_sdk_release() {
            return EGLConfigChooser.STENCIL_SIZE;
        }

        public final boolean inEmulator$maps_sdk_release() {
            String FINGERPRINT = Build.FINGERPRINT;
            AbstractC22676k.m65749i(FINGERPRINT, "FINGERPRINT");
            if (AbstractC39421y.m125930O(FINGERPRINT, "generic", false) || AbstractC39421y.m125930O(FINGERPRINT, "unknown", false)) {
                return true;
            }
            String MODEL = Build.MODEL;
            AbstractC22676k.m65749i(MODEL, "MODEL");
            if (AbstractC39414r.m125876U(MODEL, "google_sdk", false) || AbstractC39414r.m125876U(MODEL, "Emulator", false) || AbstractC39414r.m125876U(MODEL, "Android SDK built for x86", false)) {
                return true;
            }
            String BRAND = Build.BRAND;
            AbstractC22676k.m65749i(BRAND, "BRAND");
            if (AbstractC39421y.m125930O(BRAND, "generic", false)) {
                return true;
            }
            String DEVICE = Build.DEVICE;
            AbstractC22676k.m65749i(DEVICE, "DEVICE");
            if (AbstractC39421y.m125930O(DEVICE, "generic", false) || AbstractC22676k.m65745e(Build.PRODUCT, "google_sdk")) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC22676k.m65749i(MANUFACTURER, "MANUFACTURER");
            return AbstractC39414r.m125876U(MANUFACTURER, "Genymotion", false) || System.getProperty("ro.kernel.qemu") != null;
        }

        public final void setSTENCIL_SIZE$maps_sdk_release(int i13) {
            EGLConfigChooser.STENCIL_SIZE = i13;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$DepthStencilFormat;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Format24Depth8Stencil", "Format16Depth8Stencil", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum DepthStencilFormat {
        Format24Depth8Stencil(0),
        Format16Depth8Stencil(1);

        private int value;

        DepthStencilFormat(int i13) {
            this.value = i13;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i13) {
            this.value = i13;
        }
    }

    @Metadata(m65680d1 = {"\u0000-\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, m65681d2 = {"com/mapbox/maps/renderer/egl/EGLConfigChooser$chooseBestMatchConfig$Config", "", "bufferFormat", "Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$BufferFormat;", "depthStencilFormat", "Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$DepthStencilFormat;", "isNotConformant", "", "isCaveat", "index", "", "config", "Landroid/opengl/EGLConfig;", "samples", "(Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$BufferFormat;Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$DepthStencilFormat;ZZILandroid/opengl/EGLConfig;I)V", "getBufferFormat", "()Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$BufferFormat;", "getConfig", "()Landroid/opengl/EGLConfig;", "getDepthStencilFormat", "()Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$DepthStencilFormat;", "getIndex", "()I", "()Z", "getSamples", "compareTo", "other", "(Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$chooseBestMatchConfig$Config;)I", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Config implements Comparable<Config> {
        private final BufferFormat bufferFormat;
        private final EGLConfig config;
        private final DepthStencilFormat depthStencilFormat;
        private final int index;
        private final boolean isCaveat;
        private final boolean isNotConformant;
        private final int samples;

        public Config(BufferFormat bufferFormat, DepthStencilFormat depthStencilFormat, boolean z4, boolean z13, int i13, EGLConfig config, int i14) {
            AbstractC22676k.m65750j(bufferFormat, "bufferFormat");
            AbstractC22676k.m65750j(depthStencilFormat, "depthStencilFormat");
            AbstractC22676k.m65750j(config, "config");
            this.bufferFormat = bufferFormat;
            this.depthStencilFormat = depthStencilFormat;
            this.isNotConformant = z4;
            this.isCaveat = z13;
            this.index = i13;
            this.config = config;
            this.samples = i14;
        }

        public final BufferFormat getBufferFormat() {
            return this.bufferFormat;
        }

        public final EGLConfig getConfig() {
            return this.config;
        }

        public final DepthStencilFormat getDepthStencilFormat() {
            return this.depthStencilFormat;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getSamples() {
            return this.samples;
        }

        /* JADX INFO: renamed from: isCaveat, reason: from getter */
        public final boolean getIsCaveat() {
            return this.isCaveat;
        }

        /* JADX INFO: renamed from: isNotConformant, reason: from getter */
        public final boolean getIsNotConformant() {
            return this.isNotConformant;
        }

        @Override // java.lang.Comparable
        public int compareTo(Config other) {
            AbstractC22676k.m65750j(other, "other");
            int iCompare = Integer.compare(this.bufferFormat.getValue(), other.bufferFormat.getValue());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Integer.compare(this.depthStencilFormat.getValue(), other.depthStencilFormat.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Boolean.compare(this.isNotConformant, other.isNotConformant);
            if (iCompare3 != 0) {
                return iCompare3;
            }
            int iCompare4 = Boolean.compare(this.isCaveat, other.isCaveat);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            int iCompare5 = Integer.compare(this.index, other.index);
            if (iCompare5 != 0) {
                return iCompare5;
            }
            return 0;
        }
    }

    public EGLConfigChooser(boolean z4, int i13, String mapName) {
        AbstractC22676k.m65750j(mapName, "mapName");
        this.translucentSurface = z4;
        this.antialiasingSampleCount = i13;
        StringBuilder sb4 = new StringBuilder("Mbgl-EGLConfigChooser");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? "\\".concat(mapName) : "");
        this.TAG = sb4.toString();
    }

    private final EGLConfig chooseBestMatchConfig(EGLDisplay display, List<? extends EGLConfig> configs) {
        boolean z4;
        BufferFormat bufferFormat;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends EGLConfig> it = configs.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            EGLConfig next = it.next();
            int i14 = i13 + 1;
            Integer numChooseBestMatchConfig$getConfigAttr = chooseBestMatchConfig$getConfigAttr(display, next, this, 12327);
            if (numChooseBestMatchConfig$getConfigAttr == null) {
                return null;
            }
            int iIntValue = numChooseBestMatchConfig$getConfigAttr.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr2 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12354);
            if (numChooseBestMatchConfig$getConfigAttr2 == null) {
                return null;
            }
            int iIntValue2 = numChooseBestMatchConfig$getConfigAttr2.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr3 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12320);
            if (numChooseBestMatchConfig$getConfigAttr3 == null) {
                return null;
            }
            int iIntValue3 = numChooseBestMatchConfig$getConfigAttr3.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr4 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12324);
            if (numChooseBestMatchConfig$getConfigAttr4 == null) {
                return null;
            }
            int iIntValue4 = numChooseBestMatchConfig$getConfigAttr4.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr5 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12323);
            if (numChooseBestMatchConfig$getConfigAttr5 == null) {
                return null;
            }
            int iIntValue5 = numChooseBestMatchConfig$getConfigAttr5.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr6 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12322);
            if (numChooseBestMatchConfig$getConfigAttr6 == null) {
                return null;
            }
            int iIntValue6 = numChooseBestMatchConfig$getConfigAttr6.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr7 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12321);
            if (numChooseBestMatchConfig$getConfigAttr7 == null) {
                return null;
            }
            int iIntValue7 = numChooseBestMatchConfig$getConfigAttr7.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr8 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12325);
            if (numChooseBestMatchConfig$getConfigAttr8 != null) {
                int iIntValue8 = numChooseBestMatchConfig$getConfigAttr8.intValue();
                Integer numChooseBestMatchConfig$getConfigAttr9 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12326);
                if (numChooseBestMatchConfig$getConfigAttr9 != null) {
                    int iIntValue9 = numChooseBestMatchConfig$getConfigAttr9.intValue();
                    Integer numChooseBestMatchConfig$getConfigAttr10 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12338);
                    if (numChooseBestMatchConfig$getConfigAttr10 != null) {
                        int iIntValue10 = numChooseBestMatchConfig$getConfigAttr10.intValue();
                        Iterator<? extends EGLConfig> it3 = it;
                        Integer numChooseBestMatchConfig$getConfigAttr11 = chooseBestMatchConfig$getConfigAttr(display, next, this, 12337);
                        if (numChooseBestMatchConfig$getConfigAttr11 != null) {
                            int iIntValue11 = numChooseBestMatchConfig$getConfigAttr11.intValue();
                            boolean z13 = (iIntValue8 == 24 || iIntValue8 == 16) & (iIntValue9 == 8);
                            if (getAntialiasingEnabled()) {
                                z4 = (iIntValue11 >= this.antialiasingSampleCount) & z13 & (iIntValue10 >= 1);
                            } else {
                                z4 = z13 & (iIntValue10 == 0) & (iIntValue11 == 0);
                            }
                            if (z4) {
                                if (iIntValue3 == 16 && iIntValue4 == 5 && iIntValue5 == 6 && iIntValue6 == 5 && iIntValue7 == 0) {
                                    bufferFormat = BufferFormat.Format16Bit;
                                } else if (iIntValue3 == 32 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 0) {
                                    bufferFormat = BufferFormat.Format32BitNoAlpha;
                                } else if (iIntValue3 == 32 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 8) {
                                    bufferFormat = BufferFormat.Format32BitAlpha;
                                } else {
                                    bufferFormat = (iIntValue3 == 24 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 0) ? BufferFormat.Format24Bit : BufferFormat.Unknown;
                                }
                                BufferFormat bufferFormat2 = bufferFormat;
                                if (bufferFormat2 != BufferFormat.Unknown) {
                                    arrayList.add(new Config(bufferFormat2, (iIntValue8 == 16 && iIntValue9 == 8) ? DepthStencilFormat.Format16Depth8Stencil : DepthStencilFormat.Format24Depth8Stencil, (iIntValue2 & 4) != 4, iIntValue != 12344, i14, next, iIntValue11));
                                }
                            }
                            i13 = i14;
                            it = it3;
                        }
                    }
                }
            }
            return null;
        }
        if (arrayList.size() == 0) {
            MapboxLogger.logE(this.TAG, "No matching configurations after filtering");
            return null;
        }
        AbstractC25269w.m74165k0(arrayList);
        Object obj = arrayList.get(0);
        AbstractC22676k.m65749i(obj, "matches[0]");
        Config config = (Config) obj;
        if (config.getIsCaveat()) {
            MapboxLogger.logW(this.TAG, "Chosen config has a caveat.");
        }
        if (config.getIsNotConformant()) {
            MapboxLogger.logW(this.TAG, "Chosen config is not conformant.");
        }
        if (getAntialiasingEnabled() && config.getSamples() != this.antialiasingSampleCount) {
            MapboxLogger.logW(this.TAG, "MSAA x" + this.antialiasingSampleCount + " requested, but closest supported x" + config.getSamples() + " applied");
        }
        return config.getConfig();
    }

    private static final Integer chooseBestMatchConfig$getConfigAttr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLConfigChooser eGLConfigChooser, int i13) {
        int[] iArr = new int[1];
        if (EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i13, iArr, 0)) {
            return Integer.valueOf(iArr[0]);
        }
        MapboxLogger.logE(eGLConfigChooser.TAG, String.format(MapboxConstants.getMAPBOX_LOCALE(), "eglGetConfigAttrib(%d) returned error %d", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(EGL14.eglGetError())}, 2)));
        return null;
    }

    private final boolean getAntialiasingEnabled() {
        return this.antialiasingSampleCount > 1;
    }

    private final int[] getConfigAttributes() {
        boolean zInEmulator$maps_sdk_release = INSTANCE.inEmulator$maps_sdk_release();
        MapboxLogger.logI(this.TAG, "In emulator: " + zInEmulator$maps_sdk_release);
        int[] iArrM74031G0 = AbstractC25260n.m74031G0(AbstractC25260n.m74031G0(new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, this.translucentSurface ? 8 : 0, 12325, 16, 12326, STENCIL_SIZE, 12352, 4}, getAntialiasingEnabled() ? new int[]{12338, 1, 12337, this.antialiasingSampleCount} : new int[0]), zInEmulator$maps_sdk_release ? new int[]{12354, 4, 12351, 12430} : new int[0]);
        int length = iArrM74031G0.length;
        int[] iArrCopyOf = Arrays.copyOf(iArrM74031G0, length + 1);
        iArrCopyOf[length] = 12344;
        return iArrCopyOf;
    }

    private final List<EGLConfig> getConfigs(EGLDisplay display) {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[100];
        int i13 = this.antialiasingSampleCount;
        boolean z4 = false;
        while (!z4) {
            EGLDisplay eGLDisplay = display;
            if (EGL14.eglChooseConfig(eGLDisplay, getConfigAttributes(), 0, eGLConfigArr, 0, 100, iArr, 0) && iArr[0] >= 1) {
                z4 = true;
            } else {
                if (this.antialiasingSampleCount <= 1) {
                    MapboxLogger.logE(this.TAG, "No suitable EGL configs were found, eglChooseConfig returned error " + EGL14.eglGetError() + '.');
                    return C25271y.f99162w;
                }
                MapboxLogger.logW(this.TAG, "Reducing sample count in 2 times for MSAA as EGL_SAMPLES=" + this.antialiasingSampleCount + " is not supported");
                this.antialiasingSampleCount = this.antialiasingSampleCount / 2;
            }
            display = eGLDisplay;
        }
        int i14 = this.antialiasingSampleCount;
        if (i13 != i14) {
            MapboxLogger.logW(this.TAG, i14 == 1 ? "Found EGL configs only with MSAA disabled." : AbstractC11895b.m31999r(new StringBuilder("Found EGL configs with MSAA enabled, EGL_SAMPLES="), this.antialiasingSampleCount, '.'));
        }
        List<EGLConfig> listM74042R0 = AbstractC25260n.m74042R0(iArr[0], eGLConfigArr);
        Iterator<EGLConfig> it = listM74042R0.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + listM74042R0 + '.');
            }
        }
        return listM74042R0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final EGLConfig chooseConfig(EGLDisplay display) {
        AbstractC22676k.m65750j(display, "display");
        EGLConfig eGLConfigChooseBestMatchConfig = chooseBestMatchConfig(display, getConfigs(display));
        if (eGLConfigChooseBestMatchConfig == null) {
            MapboxLogger.logE(this.TAG, "No EGL config found, see log above for concrete error.");
        }
        return eGLConfigChooseBestMatchConfig;
    }
}
