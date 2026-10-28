package com.mapbox.maps.renderer.p053gl;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001e\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/mapbox/maps/renderer/gl/PixelReader;", "", "", "width", "height", "", "legacyMode", "<init>", "(IIZ)V", "Ll83/a0;", "readPixelsWithPBO", "()V", "Ljava/nio/ByteBuffer;", "readPixels", "()Ljava/nio/ByteBuffer;", "release", "I", "getWidth", "()I", "getHeight", "Z", "getLegacyMode", "()Z", "supportsPbo", "bufferSize", "kotlin.jvm.PlatformType", "buffer", "Ljava/nio/ByteBuffer;", "", "idsPbo", "[I", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class PixelReader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int channelNum = 4;
    private ByteBuffer buffer;
    private final int bufferSize;
    private final int height;
    private final int[] idsPbo;
    private final boolean legacyMode;
    private final boolean supportsPbo;
    private final int width;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/maps/renderer/gl/PixelReader$Companion;", "", "()V", "channelNum", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PixelReader(int i13, int i14, boolean z4) {
        this.width = i13;
        this.height = i14;
        this.legacyMode = z4;
        this.supportsPbo = !z4;
        int i15 = i13 * i14 * 4;
        this.bufferSize = i15;
        this.buffer = ByteBuffer.allocateDirect(i15).order(ByteOrder.nativeOrder());
        int[] iArr = {0};
        this.idsPbo = iArr;
        if (z4) {
            return;
        }
        GLES20.glGenBuffers(iArr.length, iArr, 0);
        GLES20.glBindBuffer(35051, iArr[0]);
        GLES20.glBufferData(35051, i15, null, 35041);
        GLES20.glBindBuffer(35051, 0);
    }

    private final void readPixelsWithPBO() {
        GLES30.glReadBuffer(1028);
        GLES20.glBindBuffer(35051, this.idsPbo[0]);
        GLES30.glReadPixels(0, 0, this.width, this.height, 6408, 5121, 0);
        Buffer bufferGlMapBufferRange = GLES30.glMapBufferRange(35051, 0, this.bufferSize, 1);
        if (bufferGlMapBufferRange != null) {
            this.buffer = ((ByteBuffer) bufferGlMapBufferRange).order(ByteOrder.nativeOrder());
            GLES30.glUnmapBuffer(35051);
        }
        GLES20.glBindBuffer(35051, 0);
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getLegacyMode() {
        return this.legacyMode;
    }

    public final int getWidth() {
        return this.width;
    }

    @SuppressLint({"NewApi"})
    public final ByteBuffer readPixels() {
        this.buffer.rewind();
        if (this.supportsPbo) {
            readPixelsWithPBO();
        } else {
            GLES20.glReadPixels(0, 0, this.width, this.height, 6408, 5121, this.buffer);
        }
        ByteBuffer buffer = this.buffer;
        AbstractC22676k.m65749i(buffer, "buffer");
        return buffer;
    }

    public final void release() {
        if (this.supportsPbo) {
            int[] iArr = this.idsPbo;
            GLES20.glDeleteBuffers(iArr.length, IntBuffer.wrap(iArr));
        }
    }
}
