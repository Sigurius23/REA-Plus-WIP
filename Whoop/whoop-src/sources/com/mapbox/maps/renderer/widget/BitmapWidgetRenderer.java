package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.mapbox.maps.renderer.p053gl.GlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.locks.ReentrantLock;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000 O2\u00020\u0001:\u0001OB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010?\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u0019\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010*R*\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020C8W@WX\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006P"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "position", "<init>", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "Ll83/a0;", "updateVertexBuffer", "()V", "", "topY", "()F", "leftX", "textureFromBitmapIfChanged", "updateTranslateMatrix", "", "width", "height", "onSurfaceChanged", "(II)V", "prepare", "render", "release", "updateBitmap", "(Landroid/graphics/Bitmap;)V", "angleDegrees", "setRotation", "(F)V", "getRotation", "widgetPosition", "setPosition", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "getPosition", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "halfBitmapWidth", "F", "halfBitmapHeight", "surfaceWidth", "I", "surfaceHeight", "program", "vertexShader", "fragmentShader", "attributeVertexPosition", "attributeTexturePosition", "uniformTexture", "uniformMvpMatrix", "", "textures", "[I", "", "screenMatrix", "[F", "translateRotate", "rotationMatrix", "translateMatrix", "mvpMatrix", "Ljava/nio/FloatBuffer;", "mvpMatrixBuffer", "Ljava/nio/FloatBuffer;", "", "Z", "updateMatrix", "vertexPositionBuffer", "texturePositionBuffer", "rotationDegrees", "<set-?>", "needRender", "getNeedRender", "()Z", "setNeedRender", "(Z)V", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class BitmapWidgetRenderer implements WidgetRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 2;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 8;
    private int attributeTexturePosition;
    private int attributeVertexPosition;
    private Bitmap bitmap;
    private int fragmentShader;
    private float halfBitmapHeight;
    private float halfBitmapWidth;
    private final ReentrantLock lock;
    private final float[] mvpMatrix;
    private final FloatBuffer mvpMatrixBuffer;
    private boolean needRender;
    private volatile WidgetPosition position;
    private int program;
    private volatile float rotationDegrees;
    private final float[] rotationMatrix;
    private float[] screenMatrix;
    private int surfaceHeight;
    private int surfaceWidth;
    private final FloatBuffer texturePositionBuffer;
    private final int[] textures;
    private final float[] translateMatrix;
    private float[] translateRotate;
    private int uniformMvpMatrix;
    private int uniformTexture;
    private boolean updateBitmap;
    private boolean updateMatrix;
    private final FloatBuffer vertexPositionBuffer;
    private int vertexShader;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = "precision highp float;\nuniform mat4 uMvpMatrix;\nattribute vec2 aPosition;\nattribute vec2 aCoordinate;\nvarying vec2 vCoordinate;\nvoid main() {\n  vCoordinate = aCoordinate;\n  gl_Position = uMvpMatrix * vec4(aPosition, 0.0, 1.0);\n}";

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = "precision mediump float;\nuniform sampler2D uTexture;\nvarying vec2 vCoordinate;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vCoordinate);\n}";

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;", "", "()V", "BYTES_PER_FLOAT", "", "COORDS_PER_VERTEX", "FRAGMENT_SHADER_CODE", "", "getFRAGMENT_SHADER_CODE", "()Ljava/lang/String;", "VERTEX_COUNT", "VERTEX_SHADER_CODE", "getVERTEX_SHADER_CODE", "VERTEX_STRIDE", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return BitmapWidgetRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return BitmapWidgetRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WidgetPosition.Vertical.values().length];
            try {
                iArr[WidgetPosition.Vertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WidgetPosition.Horizontal.values().length];
            try {
                iArr2[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BitmapWidgetRenderer(Bitmap bitmap, WidgetPosition position) {
        AbstractC22676k.m65750j(position, "position");
        this.bitmap = bitmap;
        this.position = position;
        this.lock = new ReentrantLock();
        Bitmap bitmap2 = this.bitmap;
        this.halfBitmapWidth = (bitmap2 != null ? bitmap2.getWidth() : 0) / 2.0f;
        Bitmap bitmap3 = this.bitmap;
        this.halfBitmapHeight = (bitmap3 != null ? bitmap3.getHeight() : 0) / 2.0f;
        this.textures = new int[]{0};
        this.screenMatrix = new float[16];
        this.translateRotate = new float[16];
        GlUtils glUtils = GlUtils.INSTANCE;
        this.rotationMatrix = glUtils.getIdentityMatrix();
        this.translateMatrix = glUtils.getIdentityMatrix();
        float[] identityMatrix = glUtils.getIdentityMatrix();
        this.mvpMatrix = identityMatrix;
        this.mvpMatrixBuffer = glUtils.toFloatBuffer(identityMatrix);
        this.updateBitmap = true;
        this.updateMatrix = true;
        this.vertexPositionBuffer = glUtils.toFloatBuffer(new float[8]);
        this.texturePositionBuffer = glUtils.toFloatBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        this.needRender = true;
    }

    private final float leftX() {
        float f13;
        float offsetX = this.position.getOffsetX();
        int i13 = WhenMappings.$EnumSwitchMapping$1[this.position.getHorizontalAlignment().ordinal()];
        if (i13 == 1) {
            f13 = this.halfBitmapWidth;
        } else if (i13 == 2) {
            f13 = this.surfaceWidth / 2;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f13 = this.surfaceWidth - this.halfBitmapWidth;
        }
        return offsetX + f13;
    }

    private final void textureFromBitmapIfChanged() {
        if (!this.updateBitmap || this.bitmap == null) {
            return;
        }
        int[] iArr = this.textures;
        if (iArr[0] == 0) {
            GLES20.glGenTextures(1, iArr, 0);
        }
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        this.updateBitmap = false;
    }

    private final float topY() {
        float f13;
        float offsetY = this.position.getOffsetY();
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.position.getVerticalAlignment().ordinal()];
        if (i13 == 1) {
            f13 = this.halfBitmapHeight;
        } else if (i13 == 2) {
            f13 = this.surfaceHeight / 2;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f13 = this.surfaceHeight - this.halfBitmapHeight;
        }
        return offsetY + f13;
    }

    private final void updateTranslateMatrix() {
        Matrix.setIdentityM(this.translateMatrix, 0);
        Matrix.translateM(this.translateMatrix, 0, leftX(), topY(), 0.0f);
        this.updateMatrix = true;
        setNeedRender(true);
    }

    private final void updateVertexBuffer() {
        GlUtils glUtils = GlUtils.INSTANCE;
        FloatBuffer floatBuffer = this.vertexPositionBuffer;
        float f13 = this.halfBitmapWidth;
        float f14 = this.halfBitmapHeight;
        glUtils.put(floatBuffer, -f13, -f14, -f13, f14, f13, -f14, f13, f14);
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public boolean getNeedRender() {
        return this.needRender;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public WidgetPosition getPosition() {
        return this.position;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    /* JADX INFO: renamed from: getRotation, reason: from getter */
    public float getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void onSurfaceChanged(int width, int height) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.surfaceWidth = width;
            this.surfaceHeight = height;
            GlUtils.INSTANCE.put(this.screenMatrix, 2.0f / width, 0.0f, 0.0f, 0.0f, 0.0f, (-2.0f) / height, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f);
            updateVertexBuffer();
            updateTranslateMatrix();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void prepare() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            GLES20.glGetIntegerv(34921, new int[1], 0);
            GlUtils glUtils = GlUtils.INSTANCE;
            int iLoadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
            glUtils.checkCompileStatus(iLoadShader);
            this.vertexShader = iLoadShader;
            int iLoadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
            glUtils.checkCompileStatus(iLoadShader2);
            this.fragmentShader = iLoadShader2;
            int iGlCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(iGlCreateProgram, this.vertexShader);
            GLES20.glAttachShader(iGlCreateProgram, this.fragmentShader);
            GLES20.glLinkProgram(iGlCreateProgram);
            this.program = iGlCreateProgram;
            this.uniformMvpMatrix = GLES20.glGetUniformLocation(iGlCreateProgram, "uMvpMatrix");
            this.attributeVertexPosition = GLES20.glGetAttribLocation(this.program, "aPosition");
            this.attributeTexturePosition = GLES20.glGetAttribLocation(this.program, "aCoordinate");
            this.uniformTexture = GLES20.glGetUniformLocation(this.program, "uTexture");
            setNeedRender(true);
            this.updateBitmap = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program != 0) {
                GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
                GLES20.glDetachShader(this.program, this.vertexShader);
                GLES20.glDetachShader(this.program, this.fragmentShader);
                GLES20.glDeleteShader(this.vertexShader);
                GLES20.glDeleteShader(this.fragmentShader);
                int[] iArr = this.textures;
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                GLES20.glDeleteProgram(this.program);
                this.program = 0;
            }
            setNeedRender(false);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void render() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program == 0) {
                prepare();
            }
            GLES20.glUseProgram(this.program);
            GlUtils glUtils = GlUtils.INSTANCE;
            if (this.updateMatrix) {
                Matrix.setIdentityM(this.mvpMatrix, 0);
                Matrix.multiplyMM(this.translateRotate, 0, this.translateMatrix, 0, this.rotationMatrix, 0);
                Matrix.multiplyMM(this.mvpMatrix, 0, this.screenMatrix, 0, this.translateRotate, 0);
                this.mvpMatrixBuffer.rewind();
                this.mvpMatrixBuffer.put(this.mvpMatrix);
                this.mvpMatrixBuffer.rewind();
                this.updateMatrix = false;
            }
            GLES20.glUniformMatrix4fv(this.uniformMvpMatrix, 1, false, this.mvpMatrixBuffer);
            textureFromBitmapIfChanged();
            GLES20.glBindTexture(3553, this.textures[0]);
            GLES20.glUniform1i(this.uniformTexture, 0);
            GLES20.glEnableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glVertexAttribPointer(this.attributeVertexPosition, 2, 5126, false, 8, (Buffer) this.vertexPositionBuffer);
            GLES20.glEnableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glVertexAttribPointer(this.attributeTexturePosition, 2, 5126, false, 8, (Buffer) this.texturePositionBuffer);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glDisableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glUseProgram(0);
            setNeedRender(false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void setNeedRender(boolean z4) {
        this.needRender = z4;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setPosition(WidgetPosition widgetPosition) {
        AbstractC22676k.m65750j(widgetPosition, "widgetPosition");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.position = widgetPosition;
            updateTranslateMatrix();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setRotation(float angleDegrees) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.rotationDegrees = angleDegrees;
            Matrix.setIdentityM(this.rotationMatrix, 0);
            Matrix.setRotateM(this.rotationMatrix, 0, angleDegrees, 0.0f, 0.0f, 1.0f);
            this.updateMatrix = true;
            setNeedRender(true);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void updateBitmap(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.bitmap = bitmap;
            this.halfBitmapWidth = bitmap.getWidth() / 2.0f;
            this.halfBitmapHeight = bitmap.getHeight() / 2.0f;
            updateTranslateMatrix();
            updateVertexBuffer();
            this.updateBitmap = true;
            this.updateMatrix = true;
            setNeedRender(true);
        } finally {
            reentrantLock.unlock();
        }
    }
}
