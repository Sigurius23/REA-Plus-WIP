#extension GL_OES_EGL_image_external : require

precision mediump float;
uniform samplerExternalOES camTexture;

varying vec2 v_CamTexCoordinate;
varying vec2 v_TexCoordinate;

uniform float tintR;
uniform float tintG;
uniform float tintB;
uniform bool tintEnabled;
uniform vec4 overlay;

vec4 toGrayscale(in vec4 color)
{
  float average = (color.r + color.g + color.b) / 3.0;
  return vec4(average, average, average, 1.0);
}

vec4 colorize(in vec4 grayscale, in vec4 color)
{
    return (grayscale * color);
}

void main ()
{
    vec4 cameraColor = texture2D(camTexture, v_CamTexCoordinate);
    if (tintEnabled)
    {
        // Color to apply in the "colorize" step. RGBA.
        vec4 c = vec4(tintR, tintG, tintB, 1.0);

        // Convert to grayscale first
        vec4 grayscale = toGrayscale(cameraColor);

        // Then "colorize" by simply multiplying the grayscale with the desired color.
        vec4 colorizedOutput = colorize(grayscale, c);

        gl_FragColor = colorizedOutput;
    }
    else
    {
        gl_FragColor = cameraColor * overlay;
    }
}
