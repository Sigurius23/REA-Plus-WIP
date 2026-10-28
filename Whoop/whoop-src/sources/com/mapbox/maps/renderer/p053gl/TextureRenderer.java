package com.mapbox.maps.renderer.p053gl;

import android.opengl.GLES20;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "", "", "depth", "<init>", "(F)V", "Ll83/a0;", "prepare", "()V", "", "vertexArray", "textureArray", "setupVbo", "([F[F)V", "", "textureID", "render", "(I)V", "release", "F", "program", "I", "attributePosition", "attributeTextureCoord", "uniformTexture", "", "vbo", "[I", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class TextureRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_TEX = 2;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 3;

    @Deprecated
    public static final int TEX_STRIDE = 8;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 12;
    private int attributePosition;
    private int attributeTextureCoord;
    private final float depth;
    private int program;
    private int uniformTexture;
    private int[] vbo;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = "precision highp float;\nattribute vec4 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nvoid main()\n{\n    gl_Position = aPosition;\n    vTexCoord = aTexCoord;\n}";

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = "precision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\nvoid main()\n{\n    gl_FragColor = texture2D(uTexture, vTexCoord);\n}";

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;", "", "()V", "BYTES_PER_FLOAT", "", "COORDS_PER_TEX", "COORDS_PER_VERTEX", "FRAGMENT_SHADER_CODE", "", "getFRAGMENT_SHADER_CODE", "()Ljava/lang/String;", "TEX_STRIDE", "VERTEX_COUNT", "VERTEX_SHADER_CODE", "getVERTEX_SHADER_CODE", "VERTEX_STRIDE", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return TextureRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return TextureRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    public TextureRenderer() {
        this(0.0f, 1, null);
    }

    private final void prepare() {
        float f13 = this.depth;
        setupVbo(new float[]{-1.0f, -1.0f, f13, 1.0f, -1.0f, f13, -1.0f, 1.0f, f13, 1.0f, 1.0f, f13}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        GlUtils glUtils = GlUtils.INSTANCE;
        int iLoadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
        glUtils.checkCompileStatus(iLoadShader);
        int iLoadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
        glUtils.checkCompileStatus(iLoadShader2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        this.program = iGlCreateProgram;
        this.attributePosition = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        this.attributeTextureCoord = GLES20.glGetAttribLocation(this.program, "aTexCoord");
        this.uniformTexture = GLES20.glGetUniformLocation(this.program, "uTexture");
    }

    private final void setupVbo(float[] vertexArray, float[] textureArray) {
        GLES20.glGenBuffers(2, this.vbo, 0);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        int length = vertexArray.length * 4;
        GlUtils glUtils = GlUtils.INSTANCE;
        GLES20.glBufferData(34962, length, glUtils.toFloatBuffer(vertexArray), 35044);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glBufferData(34962, textureArray.length * 4, glUtils.toFloatBuffer(textureArray), 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public final void release() {
        if (this.program != 0) {
            int[] iArr = this.vbo;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            GLES20.glDeleteProgram(this.program);
            this.program = 0;
        }
    }

    public final void render(int textureID) {
        if (this.program == 0) {
            prepare();
        }
        GLES20.glUseProgram(this.program);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        GLES20.glVertexAttribPointer(this.attributePosition, 3, 5126, false, 12, 0);
        GLES20.glEnableVertexAttribArray(this.attributePosition);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glVertexAttribPointer(this.attributeTextureCoord, 2, 5126, false, 8, 0);
        GLES20.glEnableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textureID);
        GLES20.glUniform1i(this.uniformTexture, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.attributePosition);
        GLES20.glDisableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glUseProgram(0);
    }

    public TextureRenderer(float f13) {
        this.depth = f13;
        this.vbo = new int[2];
    }

    public /* synthetic */ TextureRenderer(float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13);
    }
}
