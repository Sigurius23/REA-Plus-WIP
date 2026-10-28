package com.mapbox.maps.renderer.p053gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p108e4.AbstractC12682p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0006*\u00020\t2\n\u0010\u000b\u001a\u00020\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u0006*\u00020\u000e2\n\u0010\u000b\u001a\u00020\t\"\u00020\n¢\u0006\u0004\b\f\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u000e*\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u0017\u0010\bJ\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/mapbox/maps/renderer/gl/GlUtils;", "", "<init>", "()V", "", "cmd", "Ll83/a0;", "throwIfError", "(Ljava/lang/String;)V", "", "", "values", "put", "([F[F)V", "Ljava/nio/FloatBuffer;", "(Ljava/nio/FloatBuffer;[F)V", "toFloatBuffer", "([F)Ljava/nio/FloatBuffer;", "", "type", "shaderCode", "loadShader", "(ILjava/lang/String;)I", "checkError", "shader", "checkCompileStatus", "(I)V", "getIdentityMatrix", "()[F", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GlUtils {
    public static final GlUtils INSTANCE = new GlUtils();

    private GlUtils() {
    }

    public static /* synthetic */ void checkError$default(GlUtils glUtils, String str, int i13, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfError(String cmd) {
        Object objValueOf;
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbM35484d = AbstractC12682p.m35484d(cmd, " - error in GL : ");
            switch (iGlGetError) {
                case 1280:
                    objValueOf = "GL_INVALID_ENUM";
                    break;
                case 1281:
                    objValueOf = "GL_INVALID_VALUE";
                    break;
                case 1282:
                    objValueOf = "GL_INVALID_OPERATION";
                    break;
                case 1283:
                case 1284:
                default:
                    objValueOf = Integer.valueOf(iGlGetError);
                    break;
                case 1285:
                    objValueOf = "GL_OUT_OF_MEMORY";
                    break;
                case 1286:
                    objValueOf = "GL_INVALID_FRAMEBUFFER_OPERATION";
                    break;
            }
            sbM35484d.append(objValueOf);
            throw new RuntimeException(sbM35484d.toString());
        }
    }

    public final void checkCompileStatus(int shader) {
    }

    public final void checkError(String cmd) {
    }

    public final float[] getIdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public final int loadShader(int type, String shaderCode) {
        AbstractC22676k.m65750j(shaderCode, "shaderCode");
        int iGlCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(iGlCreateShader, shaderCode);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public final void put(FloatBuffer floatBuffer, float... values) {
        AbstractC22676k.m65750j(floatBuffer, "<this>");
        AbstractC22676k.m65750j(values, "values");
        floatBuffer.rewind();
        for (float f13 : values) {
            floatBuffer.put(f13);
        }
        floatBuffer.rewind();
    }

    public final FloatBuffer toFloatBuffer(float[] fArr) {
        AbstractC22676k.m65750j(fArr, "<this>");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.rewind();
        return floatBufferAsFloatBuffer;
    }

    public final void put(float[] fArr, float... values) {
        AbstractC22676k.m65750j(fArr, "<this>");
        AbstractC22676k.m65750j(values, "values");
        int length = values.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            fArr[i14] = values[i13];
            i13++;
            i14++;
        }
    }
}
