package hms.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class GlUtil {

    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int i13, String str) {
            super(i13, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            if (iGlGetError != 1285) {
                throw new GLException(iGlGetError, AbstractC25012a.m73373f(iGlGetError, str, ": GLES20 error: "));
            }
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i13) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i14 = iArr[0];
        GLES20.glBindTexture(i13, i14);
        GLES20.glTexParameterf(i13, 10241, 9729.0f);
        GLES20.glTexParameterf(i13, 10240, 9729.0f);
        GLES20.glTexParameterf(i13, 10242, 33071.0f);
        GLES20.glTexParameterf(i13, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i14;
    }
}
