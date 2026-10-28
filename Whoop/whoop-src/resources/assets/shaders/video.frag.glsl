#extension GL_OES_EGL_image_external : require

//necessary
precision highp float;
uniform samplerExternalOES camTexture;
uniform sampler2D displayTexture;

varying vec2 v_CamTexCoordinate;
varying vec2 v_TexCoordinate;

uniform bool tintEnabled;
uniform bool grayscaleEnabled;
uniform bool overlayEnabled;
uniform vec4 overlay;

uniform float offsetR;
uniform float offsetG;
uniform float offsetB;

const highp vec3 weight = vec3(0.2125, 0.7154, 0.0721);

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
    vec4 display = texture2D(displayTexture, v_TexCoordinate);

    if (tintEnabled)
    {
        // Color to apply in the "colorize" step. RGBA.
        vec4 c = vec4(offsetR, offsetG, offsetB, 1.0);

        // Convert to grayscale first
        vec4 grayscale = toGrayscale(cameraColor);

        // Then "colorize" by simply multiplying the grayscale with the desired color.
        vec4 colorizedOutput = colorize(grayscale, c);


        gl_FragColor = mix(colorizedOutput, display, display.a);
    } else if (grayscaleEnabled){
        //grayscale
        float luminance = dot(texture2D(camTexture, v_CamTexCoordinate).rgb, weight);
        vec4 colorizedOutput = vec4(vec3(luminance), 1.0);
        gl_FragColor = mix(colorizedOutput, display, display.a);
    } else if (overlayEnabled){
        gl_FragColor = mix(cameraColor * overlay, display, display.a);
    } else {
        //vec4 cameraColor2 = cameraColor * vec4(offsetR, offsetG, offsetB, 1.);
        vec4 cameraColor2 = texture2D(camTexture, v_CamTexCoordinate);
        gl_FragColor = mix(cameraColor2, display, display.a);
    }

}