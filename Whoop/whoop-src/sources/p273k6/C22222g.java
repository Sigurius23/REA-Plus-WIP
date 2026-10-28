package p273k6;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import e93.AbstractC12889b;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: k6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C22222g {

    /* JADX INFO: renamed from: A */
    public static final byte[] f86587A;

    /* JADX INFO: renamed from: B */
    public static final String[] f86588B;

    /* JADX INFO: renamed from: C */
    public static final int[] f86589C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f86590D;

    /* JADX INFO: renamed from: E */
    public static final C22219d f86591E;

    /* JADX INFO: renamed from: F */
    public static final C22219d[][] f86592F;

    /* JADX INFO: renamed from: G */
    public static final C22219d[] f86593G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f86594H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f86595I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f86596J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f86597K;

    /* JADX INFO: renamed from: L */
    public static final Charset f86598L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f86599M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f86600N;

    /* JADX INFO: renamed from: l */
    public static final boolean f86601l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f86602m;

    /* JADX INFO: renamed from: n */
    public static final int[] f86603n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f86604o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f86605p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f86606q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f86607r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f86608s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f86609t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f86610u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f86611v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f86612w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f86613x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f86614y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f86615z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f86616a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f86617b;

    /* JADX INFO: renamed from: c */
    public int f86618c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f86619d;

    /* JADX INFO: renamed from: e */
    public final HashSet f86620e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f86621f;

    /* JADX INFO: renamed from: g */
    public boolean f86622g;

    /* JADX INFO: renamed from: h */
    public int f86623h;

    /* JADX INFO: renamed from: i */
    public int f86624i;

    /* JADX INFO: renamed from: j */
    public int f86625j;

    /* JADX INFO: renamed from: k */
    public int f86626k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f86602m = new int[]{8, 8, 8};
        f86603n = new int[]{8};
        f86604o = new byte[]{-1, -40, -1};
        f86605p = new byte[]{102, 116, 121, 112};
        f86606q = new byte[]{109, 105, 102, 49};
        f86607r = new byte[]{104, 101, 105, 99};
        f86608s = new byte[]{79, 76, 89, 77, 80, 0};
        f86609t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f86610u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f86611v = new byte[]{101, 88, 73, 102};
        f86612w = new byte[]{73, 72, 68, 82};
        f86613x = new byte[]{73, 69, 78, 68};
        f86614y = new byte[]{82, 73, 70, 70};
        f86615z = new byte[]{87, 69, 66, 80};
        f86587A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f86588B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f86589C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f86590D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C22219d[] c22219dArr = {new C22219d("NewSubfileType", 254, 4), new C22219d("SubfileType", 255, 4), new C22219d("ImageWidth", 256, 3, 4), new C22219d("ImageLength", 257, 3, 4), new C22219d("BitsPerSample", 258, 3), new C22219d("Compression", 259, 3), new C22219d("PhotometricInterpretation", 262, 3), new C22219d("ImageDescription", 270, 2), new C22219d("Make", 271, 2), new C22219d("Model", 272, 2), new C22219d("StripOffsets", 273, 3, 4), new C22219d("Orientation", 274, 3), new C22219d("SamplesPerPixel", 277, 3), new C22219d("RowsPerStrip", 278, 3, 4), new C22219d("StripByteCounts", 279, 3, 4), new C22219d("XResolution", 282, 5), new C22219d("YResolution", DfuBaseService.NOTIFICATION_ID, 5), new C22219d("PlanarConfiguration", 284, 3), new C22219d("ResolutionUnit", 296, 3), new C22219d("TransferFunction", 301, 3), new C22219d("Software", 305, 2), new C22219d("DateTime", 306, 2), new C22219d("Artist", 315, 2), new C22219d("WhitePoint", 318, 5), new C22219d("PrimaryChromaticities", 319, 5), new C22219d("SubIFDPointer", 330, 4), new C22219d("JPEGInterchangeFormat", 513, 4), new C22219d("JPEGInterchangeFormatLength", 514, 4), new C22219d("YCbCrCoefficients", 529, 5), new C22219d("YCbCrSubSampling", 530, 3), new C22219d("YCbCrPositioning", 531, 3), new C22219d("ReferenceBlackWhite", 532, 5), new C22219d("Copyright", 33432, 2), new C22219d("ExifIFDPointer", 34665, 4), new C22219d("GPSInfoIFDPointer", 34853, 4), new C22219d("SensorTopBorder", 4, 4), new C22219d("SensorLeftBorder", 5, 4), new C22219d("SensorBottomBorder", 6, 4), new C22219d("SensorRightBorder", 7, 4), new C22219d("ISO", 23, 3), new C22219d("JpgFromRaw", 46, 7), new C22219d("Xmp", 700, 1)};
        C22219d[] c22219dArr2 = {new C22219d("ExposureTime", 33434, 5), new C22219d("FNumber", 33437, 5), new C22219d("ExposureProgram", 34850, 3), new C22219d("SpectralSensitivity", 34852, 2), new C22219d("PhotographicSensitivity", 34855, 3), new C22219d("OECF", 34856, 7), new C22219d("SensitivityType", 34864, 3), new C22219d("StandardOutputSensitivity", 34865, 4), new C22219d("RecommendedExposureIndex", 34866, 4), new C22219d("ISOSpeed", 34867, 4), new C22219d("ISOSpeedLatitudeyyy", 34868, 4), new C22219d("ISOSpeedLatitudezzz", 34869, 4), new C22219d("ExifVersion", 36864, 2), new C22219d("DateTimeOriginal", 36867, 2), new C22219d("DateTimeDigitized", 36868, 2), new C22219d("OffsetTime", 36880, 2), new C22219d("OffsetTimeOriginal", 36881, 2), new C22219d("OffsetTimeDigitized", 36882, 2), new C22219d("ComponentsConfiguration", 37121, 7), new C22219d("CompressedBitsPerPixel", 37122, 5), new C22219d("ShutterSpeedValue", 37377, 10), new C22219d("ApertureValue", 37378, 5), new C22219d("BrightnessValue", 37379, 10), new C22219d("ExposureBiasValue", 37380, 10), new C22219d("MaxApertureValue", 37381, 5), new C22219d("SubjectDistance", 37382, 5), new C22219d("MeteringMode", 37383, 3), new C22219d("LightSource", 37384, 3), new C22219d("Flash", 37385, 3), new C22219d("FocalLength", 37386, 5), new C22219d("SubjectArea", 37396, 3), new C22219d("MakerNote", 37500, 7), new C22219d("UserComment", 37510, 7), new C22219d("SubSecTime", 37520, 2), new C22219d("SubSecTimeOriginal", 37521, 2), new C22219d("SubSecTimeDigitized", 37522, 2), new C22219d("FlashpixVersion", 40960, 7), new C22219d("ColorSpace", 40961, 3), new C22219d("PixelXDimension", 40962, 3, 4), new C22219d("PixelYDimension", 40963, 3, 4), new C22219d("RelatedSoundFile", 40964, 2), new C22219d("InteroperabilityIFDPointer", 40965, 4), new C22219d("FlashEnergy", 41483, 5), new C22219d("SpatialFrequencyResponse", 41484, 7), new C22219d("FocalPlaneXResolution", 41486, 5), new C22219d("FocalPlaneYResolution", 41487, 5), new C22219d("FocalPlaneResolutionUnit", 41488, 3), new C22219d("SubjectLocation", 41492, 3), new C22219d("ExposureIndex", 41493, 5), new C22219d("SensingMethod", 41495, 3), new C22219d("FileSource", 41728, 7), new C22219d("SceneType", 41729, 7), new C22219d("CFAPattern", 41730, 7), new C22219d("CustomRendered", 41985, 3), new C22219d("ExposureMode", 41986, 3), new C22219d("WhiteBalance", 41987, 3), new C22219d("DigitalZoomRatio", 41988, 5), new C22219d("FocalLengthIn35mmFilm", 41989, 3), new C22219d("SceneCaptureType", 41990, 3), new C22219d("GainControl", 41991, 3), new C22219d("Contrast", 41992, 3), new C22219d("Saturation", 41993, 3), new C22219d("Sharpness", 41994, 3), new C22219d("DeviceSettingDescription", 41995, 7), new C22219d("SubjectDistanceRange", 41996, 3), new C22219d("ImageUniqueID", 42016, 2), new C22219d("CameraOwnerName", 42032, 2), new C22219d("BodySerialNumber", 42033, 2), new C22219d("LensSpecification", 42034, 5), new C22219d("LensMake", 42035, 2), new C22219d("LensModel", 42036, 2), new C22219d("Gamma", 42240, 5), new C22219d("DNGVersion", 50706, 1), new C22219d("DefaultCropSize", 50720, 3, 4)};
        C22219d[] c22219dArr3 = {new C22219d("GPSVersionID", 0, 1), new C22219d("GPSLatitudeRef", 1, 2), new C22219d("GPSLatitude", 2, 5, 10), new C22219d("GPSLongitudeRef", 3, 2), new C22219d("GPSLongitude", 4, 5, 10), new C22219d("GPSAltitudeRef", 5, 1), new C22219d("GPSAltitude", 6, 5), new C22219d("GPSTimeStamp", 7, 5), new C22219d("GPSSatellites", 8, 2), new C22219d("GPSStatus", 9, 2), new C22219d("GPSMeasureMode", 10, 2), new C22219d("GPSDOP", 11, 5), new C22219d("GPSSpeedRef", 12, 2), new C22219d("GPSSpeed", 13, 5), new C22219d("GPSTrackRef", 14, 2), new C22219d("GPSTrack", 15, 5), new C22219d("GPSImgDirectionRef", 16, 2), new C22219d("GPSImgDirection", 17, 5), new C22219d("GPSMapDatum", 18, 2), new C22219d("GPSDestLatitudeRef", 19, 2), new C22219d("GPSDestLatitude", 20, 5), new C22219d("GPSDestLongitudeRef", 21, 2), new C22219d("GPSDestLongitude", 22, 5), new C22219d("GPSDestBearingRef", 23, 2), new C22219d("GPSDestBearing", 24, 5), new C22219d("GPSDestDistanceRef", 25, 2), new C22219d("GPSDestDistance", 26, 5), new C22219d("GPSProcessingMethod", 27, 7), new C22219d("GPSAreaInformation", 28, 7), new C22219d("GPSDateStamp", 29, 2), new C22219d("GPSDifferential", 30, 3), new C22219d("GPSHPositioningError", 31, 5)};
        C22219d[] c22219dArr4 = {new C22219d("InteroperabilityIndex", 1, 2)};
        C22219d[] c22219dArr5 = {new C22219d("NewSubfileType", 254, 4), new C22219d("SubfileType", 255, 4), new C22219d("ThumbnailImageWidth", 256, 3, 4), new C22219d("ThumbnailImageLength", 257, 3, 4), new C22219d("BitsPerSample", 258, 3), new C22219d("Compression", 259, 3), new C22219d("PhotometricInterpretation", 262, 3), new C22219d("ImageDescription", 270, 2), new C22219d("Make", 271, 2), new C22219d("Model", 272, 2), new C22219d("StripOffsets", 273, 3, 4), new C22219d("ThumbnailOrientation", 274, 3), new C22219d("SamplesPerPixel", 277, 3), new C22219d("RowsPerStrip", 278, 3, 4), new C22219d("StripByteCounts", 279, 3, 4), new C22219d("XResolution", 282, 5), new C22219d("YResolution", DfuBaseService.NOTIFICATION_ID, 5), new C22219d("PlanarConfiguration", 284, 3), new C22219d("ResolutionUnit", 296, 3), new C22219d("TransferFunction", 301, 3), new C22219d("Software", 305, 2), new C22219d("DateTime", 306, 2), new C22219d("Artist", 315, 2), new C22219d("WhitePoint", 318, 5), new C22219d("PrimaryChromaticities", 319, 5), new C22219d("SubIFDPointer", 330, 4), new C22219d("JPEGInterchangeFormat", 513, 4), new C22219d("JPEGInterchangeFormatLength", 514, 4), new C22219d("YCbCrCoefficients", 529, 5), new C22219d("YCbCrSubSampling", 530, 3), new C22219d("YCbCrPositioning", 531, 3), new C22219d("ReferenceBlackWhite", 532, 5), new C22219d("Copyright", 33432, 2), new C22219d("ExifIFDPointer", 34665, 4), new C22219d("GPSInfoIFDPointer", 34853, 4), new C22219d("DNGVersion", 50706, 1), new C22219d("DefaultCropSize", 50720, 3, 4)};
        f86591E = new C22219d("StripOffsets", 273, 3);
        f86592F = new C22219d[][]{c22219dArr, c22219dArr2, c22219dArr3, c22219dArr4, c22219dArr5, c22219dArr, new C22219d[]{new C22219d("ThumbnailImage", 256, 7), new C22219d("CameraSettingsIFDPointer", 8224, 4), new C22219d("ImageProcessingIFDPointer", 8256, 4)}, new C22219d[]{new C22219d("PreviewImageStart", 257, 4), new C22219d("PreviewImageLength", 258, 4)}, new C22219d[]{new C22219d("AspectFrame", 4371, 3)}, new C22219d[]{new C22219d("ColorSpace", 55, 3)}};
        f86593G = new C22219d[]{new C22219d("SubIFDPointer", 330, 4), new C22219d("ExifIFDPointer", 34665, 4), new C22219d("GPSInfoIFDPointer", 34853, 4), new C22219d("InteroperabilityIFDPointer", 40965, 4), new C22219d("CameraSettingsIFDPointer", 8224, 1), new C22219d("ImageProcessingIFDPointer", 8256, 1)};
        f86594H = new HashMap[10];
        f86595I = new HashMap[10];
        f86596J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f86597K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f86598L = charsetForName;
        f86599M = "Exif\u0000\u0000".getBytes(charsetForName);
        f86600N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i13 = 0;
        while (true) {
            C22219d[][] c22219dArr6 = f86592F;
            if (i13 >= c22219dArr6.length) {
                HashMap map = f86597K;
                C22219d[] c22219dArr7 = f86593G;
                map.put(Integer.valueOf(c22219dArr7[0].f86581a), 5);
                map.put(Integer.valueOf(c22219dArr7[1].f86581a), 1);
                map.put(Integer.valueOf(c22219dArr7[2].f86581a), 2);
                map.put(Integer.valueOf(c22219dArr7[3].f86581a), 3);
                map.put(Integer.valueOf(c22219dArr7[4].f86581a), 7);
                map.put(Integer.valueOf(c22219dArr7[5].f86581a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f86594H[i13] = new HashMap();
            f86595I[i13] = new HashMap();
            for (C22219d c22219d : c22219dArr6[i13]) {
                f86594H[i13].put(Integer.valueOf(c22219d.f86581a), c22219d);
                f86595I[i13].put(c22219d.f86582b, c22219d);
            }
            i13++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public C22222g(InputStream inputStream) throws IOException {
        C22219d[][] c22219dArr = f86592F;
        this.f86619d = new HashMap[c22219dArr.length];
        this.f86620e = new HashSet(c22219dArr.length);
        this.f86621f = ByteOrder.BIG_ENDIAN;
        boolean z4 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z13 = f86601l;
        if (z4) {
            this.f86617b = (AssetManager.AssetInputStream) inputStream;
            this.f86616a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC22223h.m63716c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f86617b = null;
                this.f86616a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z13) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f86617b = null;
                this.f86616a = null;
            }
        } else {
            this.f86617b = null;
            this.f86616a = null;
        }
        for (int i13 = 0; i13 < c22219dArr.length; i13++) {
            try {
                try {
                    this.f86619d[i13] = new HashMap();
                } catch (Throwable th3) {
                    m63689a();
                    if (z13) {
                        m63707s();
                    }
                    throw th3;
                }
            } catch (IOException e5) {
                e = e5;
                if (z13) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m63689a();
                if (!z13) {
                    return;
                }
            } catch (UnsupportedOperationException e13) {
                e = e13;
                if (z13) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m63689a();
                if (!z13) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, ErrorCodes.WebsocketMethodErrors.cServerErrors);
        int iM63695g = m63695g(bufferedInputStream);
        this.f86618c = iM63695g;
        if (iM63695g == 4 || iM63695g == 9 || iM63695g == 13 || iM63695g == 14) {
            C22217b c22217b = new C22217b(bufferedInputStream);
            int i14 = this.f86618c;
            if (i14 == 4) {
                m63694f(c22217b, 0, 0);
            } else if (i14 == 13) {
                m63697i(c22217b);
            } else if (i14 == 9) {
                m63698j(c22217b);
            } else if (i14 == 14) {
                m63702n(c22217b);
            }
        } else {
            C22221f c22221f = new C22221f(bufferedInputStream);
            int i15 = this.f86618c;
            if (i15 == 12) {
                m63693e(c22221f);
            } else if (i15 == 7) {
                m63696h(c22221f);
            } else if (i15 == 10) {
                m63701m(c22221f);
            } else {
                m63699k(c22221f);
            }
            c22221f.m63686h(this.f86623h);
            m63711x(c22221f);
        }
        m63689a();
        if (!z13) {
            return;
        }
        m63707s();
    }

    /* JADX INFO: renamed from: t */
    public static ByteOrder m63687t(C22217b c22217b) throws IOException {
        short s13 = c22217b.readShort();
        boolean z4 = f86601l;
        if (s13 == 18761) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s13 == 19789) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s13));
    }

    /* JADX INFO: renamed from: A */
    public final void m63688A() throws Throwable {
        m63712y(0, 5);
        m63712y(0, 4);
        m63712y(5, 4);
        HashMap[] mapArr = this.f86619d;
        C22218c c22218c = (C22218c) mapArr[1].get("PixelXDimension");
        C22218c c22218c2 = (C22218c) mapArr[1].get("PixelYDimension");
        if (c22218c != null && c22218c2 != null) {
            mapArr[0].put("ImageWidth", c22218c);
            mapArr[0].put("ImageLength", c22218c2);
        }
        if (mapArr[4].isEmpty() && m63705q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m63705q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m63710w(0, "ThumbnailOrientation", "Orientation");
        m63710w(0, "ThumbnailImageLength", "ImageLength");
        m63710w(0, "ThumbnailImageWidth", "ImageWidth");
        m63710w(5, "ThumbnailOrientation", "Orientation");
        m63710w(5, "ThumbnailImageLength", "ImageLength");
        m63710w(5, "ThumbnailImageWidth", "ImageWidth");
        m63710w(4, "Orientation", "ThumbnailOrientation");
        m63710w(4, "ImageLength", "ThumbnailImageLength");
        m63710w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: a */
    public final void m63689a() {
        String strM63690b = m63690b("DateTimeOriginal");
        HashMap[] mapArr = this.f86619d;
        if (strM63690b != null && m63690b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM63690b.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f86598L);
            map.put("DateTime", new C22218c(bytes, 2, bytes.length));
        }
        if (m63690b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C22218c.m63678a(0L, this.f86621f));
        }
        if (m63690b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C22218c.m63678a(0L, this.f86621f));
        }
        if (m63690b("Orientation") == null) {
            mapArr[0].put("Orientation", C22218c.m63678a(0L, this.f86621f));
        }
        if (m63690b("LightSource") == null) {
            mapArr[1].put("LightSource", C22218c.m63678a(0L, this.f86621f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m63690b(String str) {
        C22218c c22218cM63692d = m63692d(str);
        if (c22218cM63692d != null) {
            int i13 = c22218cM63692d.f86577a;
            if (!f86596J.contains(str)) {
                return c22218cM63692d.m63683f(this.f86621f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i13 != 5 && i13 != 10) {
                    AbstractC2875y.m8313z(i13, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                C22220e[] c22220eArr = (C22220e[]) c22218cM63692d.m63684g(this.f86621f);
                if (c22220eArr == null || c22220eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c22220eArr));
                    return null;
                }
                C22220e c22220e = c22220eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c22220e.f86585a / c22220e.f86586b));
                C22220e c22220e2 = c22220eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c22220e2.f86585a / c22220e2.f86586b));
                C22220e c22220e3 = c22220eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c22220e3.f86585a / c22220e3.f86586b)));
            }
            try {
                return Double.toString(c22218cM63692d.m63681d(this.f86621f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m63691c() {
        C22218c c22218cM63692d = m63692d("Orientation");
        if (c22218cM63692d == null) {
            return 1;
        }
        try {
            return c22218cM63692d.m63682e(this.f86621f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C22218c m63692d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f86601l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i13 = 0; i13 < f86592F.length; i13++) {
            C22218c c22218c = (C22218c) this.f86619d[i13].get(str);
            if (c22218c != null) {
                return c22218c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m63693e(C22221f c22221f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i13;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC22224i.m63717a(mediaMetadataRetriever, new C22216a(c22221f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f86619d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C22218c.m63680c(Integer.parseInt(strExtractMetadata), this.f86621f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C22218c.m63680c(Integer.parseInt(strExtractMetadata2), this.f86621f));
                }
                if (strExtractMetadata3 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata3);
                    if (i14 == 90) {
                        i13 = 6;
                    } else if (i14 != 180) {
                        i13 = i14 != 270 ? 1 : 8;
                    } else {
                        i13 = 3;
                    }
                    mapArr[0].put("Orientation", C22218c.m63680c(i13, this.f86621f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i15 = Integer.parseInt(strExtractMetadata4);
                    int i16 = Integer.parseInt(strExtractMetadata5);
                    if (i16 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c22221f.m63686h(i15);
                    byte[] bArr = new byte[6];
                    c22221f.readFully(bArr);
                    int i17 = i15 + 6;
                    int i18 = i16 - 6;
                    if (!Arrays.equals(bArr, f86599M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i18];
                    c22221f.readFully(bArr2);
                    this.f86623h = i17;
                    m63708u(0, bArr2);
                }
                if (f86601l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b A[LOOP:2: B:65:0x0131->B:70:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: f */
    public final void m63694f(p273k6.C22217b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p273k6.C22222g.m63694f(k6.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152 A[LOOP:2: B:112:0x0144->B:117:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0162  */
    /* JADX WARN: Code duplicated, block: B:128:0x016b A[LOOP:3: B:123:0x015d->B:128:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:135:0x017f A[LOOP:4: B:130:0x0170->B:135:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0168 A[EDGE_INSN: B:173:0x0168->B:127:0x0168 BREAK  A[LOOP:3: B:123:0x015d->B:128:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0182 A[EDGE_INSN: B:174:0x0182->B:136:0x0182 BREAK  A[LOOP:4: B:130:0x0170->B:135:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0168 A[EDGE_INSN: B:175:0x0168->B:127:0x0168 BREAK  A[LOOP:3: B:123:0x015d->B:128:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX INFO: renamed from: g */
    public final int m63695g(BufferedInputStream bufferedInputStream) throws Throwable {
        C22217b c22217b;
        int i13;
        C22217b c22217b2;
        C22217b c22217b3;
        C22217b c22217b4;
        int i14;
        C22217b c22217b5;
        C22217b c22217b6;
        int i15;
        int i16;
        byte[] bArr;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        byte[] bArr3;
        C22217b c22217b7;
        short s13;
        long j7;
        bufferedInputStream.mark(ErrorCodes.WebsocketMethodErrors.cServerErrors);
        byte[] bArr4 = new byte[ErrorCodes.WebsocketMethodErrors.cServerErrors];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i24 = 0;
        while (true) {
            byte[] bArr5 = f86604o;
            if (i24 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i24] != bArr5[i24]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i25 = 0; i25 < bytes.length; i25++) {
                    if (bArr4[i25] != bytes[i25]) {
                        int i26 = 1;
                        try {
                            try {
                                try {
                                    c22217b2 = new C22217b(bArr4);
                                    try {
                                        try {
                                            long j13 = c22217b2.readInt();
                                            byte[] bArr6 = new byte[4];
                                            c22217b2.readFully(bArr6);
                                            if (Arrays.equals(bArr6, f86605p)) {
                                                if (j13 == 1) {
                                                    j13 = c22217b2.readLong();
                                                    j7 = 16;
                                                    if (j13 < 16) {
                                                    }
                                                    c22217b4 = new C22217b(bArr4);
                                                    ByteOrder byteOrderM63687t = m63687t(c22217b4);
                                                    this.f86621f = byteOrderM63687t;
                                                    c22217b4.f86575y = byteOrderM63687t;
                                                    s13 = c22217b4.readShort();
                                                    if (s13 != 20306 || s13 == 21330) {
                                                        i14 = 1;
                                                    } else {
                                                        i14 = i13;
                                                    }
                                                    c22217b4.close();
                                                    if (i14 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c22217b7 = new C22217b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM63687t2 = m63687t(c22217b7);
                                                            this.f86621f = byteOrderM63687t2;
                                                            c22217b7.f86575y = byteOrderM63687t2;
                                                            if (c22217b7.readShort() == 85) {
                                                                i15 = 1;
                                                            } else {
                                                                i15 = i13;
                                                            }
                                                            c22217b7.close();
                                                        } catch (Exception unused) {
                                                            c22217b6 = c22217b7;
                                                            if (c22217b6 != null) {
                                                                c22217b6.close();
                                                            }
                                                            i15 = i13;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            c22217b5 = c22217b7;
                                                            if (c22217b5 != null) {
                                                                c22217b5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        c22217b6 = null;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        c22217b5 = null;
                                                    }
                                                    if (i15 != 0) {
                                                        return 10;
                                                    }
                                                    i16 = i13;
                                                    while (true) {
                                                        bArr = f86610u;
                                                        if (i16 < bArr.length) {
                                                            i17 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i16] != bArr[i16]) {
                                                            i17 = i13;
                                                            break;
                                                        }
                                                        i16++;
                                                    }
                                                    if (i17 != 0) {
                                                        return 13;
                                                    }
                                                    i18 = i13;
                                                    while (true) {
                                                        bArr2 = f86614y;
                                                        if (i18 < bArr2.length) {
                                                            i19 = i13;
                                                            while (true) {
                                                                bArr3 = f86615z;
                                                                if (i19 >= bArr3.length) {
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i19 + 4] != bArr3[i19]) {
                                                                    break;
                                                                }
                                                                i19++;
                                                            }
                                                            if (i26 != 0) {
                                                                return 14;
                                                            }
                                                            return i13;
                                                        }
                                                        if (bArr4[i18] != bArr2[i18]) {
                                                            break;
                                                        }
                                                        i18++;
                                                    }
                                                    i26 = i13;
                                                    if (i26 != 0) {
                                                        return 14;
                                                    }
                                                    return i13;
                                                }
                                                j7 = 8;
                                                i13 = 0;
                                                long j14 = ErrorCodes.WebsocketMethodErrors.cServerErrors;
                                                if (j13 > j14) {
                                                    j13 = j14;
                                                }
                                                long j15 = j13 - j7;
                                                if (j15 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z4 = false;
                                                        boolean z13 = false;
                                                        for (long j16 = 0; j16 < j15 / 4; j16++) {
                                                            try {
                                                                c22217b2.readFully(bArr7);
                                                                if (j16 != 1) {
                                                                    if (Arrays.equals(bArr7, f86606q)) {
                                                                        z4 = true;
                                                                    } else if (Arrays.equals(bArr7, f86607r)) {
                                                                        z13 = true;
                                                                    }
                                                                    if (z4 && z13) {
                                                                        c22217b2.close();
                                                                        return 12;
                                                                    }
                                                                }
                                                            } catch (EOFException unused3) {
                                                            }
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        if (f86601l) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (c22217b2 != null) {
                                                        }
                                                        c22217b4 = new C22217b(bArr4);
                                                        ByteOrder byteOrderM63687t3 = m63687t(c22217b4);
                                                        this.f86621f = byteOrderM63687t3;
                                                        c22217b4.f86575y = byteOrderM63687t3;
                                                        s13 = c22217b4.readShort();
                                                        if (s13 != 20306) {
                                                            i14 = 1;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        c22217b4.close();
                                                        if (i14 != 0) {
                                                            return 7;
                                                        }
                                                        c22217b7 = new C22217b(bArr4);
                                                        ByteOrder byteOrderM63687t4 = m63687t(c22217b7);
                                                        this.f86621f = byteOrderM63687t4;
                                                        c22217b7.f86575y = byteOrderM63687t4;
                                                        if (c22217b7.readShort() == 85) {
                                                            i15 = 1;
                                                        } else {
                                                            i15 = i13;
                                                        }
                                                        c22217b7.close();
                                                        if (i15 != 0) {
                                                            return 10;
                                                        }
                                                        i16 = i13;
                                                        while (true) {
                                                            bArr = f86610u;
                                                            if (i16 < bArr.length) {
                                                                i17 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i16] != bArr[i16]) {
                                                                i17 = i13;
                                                                break;
                                                            }
                                                            i16++;
                                                        }
                                                        if (i17 != 0) {
                                                            return 13;
                                                        }
                                                        i18 = i13;
                                                        while (true) {
                                                            bArr2 = f86614y;
                                                            if (i18 < bArr2.length) {
                                                                i19 = i13;
                                                                while (true) {
                                                                    bArr3 = f86615z;
                                                                    if (i19 >= bArr3.length) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i19 + 4] != bArr3[i19]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                }
                                                                if (i26 != 0) {
                                                                    return 14;
                                                                }
                                                                return i13;
                                                            }
                                                            if (bArr4[i18] != bArr2[i18]) {
                                                                break;
                                                                break;
                                                            }
                                                            i18++;
                                                        }
                                                        i26 = i13;
                                                        if (i26 != 0) {
                                                            return 14;
                                                        }
                                                        return i13;
                                                    }
                                                }
                                                c22217b2.close();
                                                c22217b4 = new C22217b(bArr4);
                                                ByteOrder byteOrderM63687t5 = m63687t(c22217b4);
                                                this.f86621f = byteOrderM63687t5;
                                                c22217b4.f86575y = byteOrderM63687t5;
                                                s13 = c22217b4.readShort();
                                                if (s13 != 20306) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = 1;
                                                }
                                                c22217b4.close();
                                                if (i14 != 0) {
                                                    return 7;
                                                }
                                                c22217b7 = new C22217b(bArr4);
                                                ByteOrder byteOrderM63687t6 = m63687t(c22217b7);
                                                this.f86621f = byteOrderM63687t6;
                                                c22217b7.f86575y = byteOrderM63687t6;
                                                if (c22217b7.readShort() == 85) {
                                                    i15 = 1;
                                                } else {
                                                    i15 = i13;
                                                }
                                                c22217b7.close();
                                                if (i15 != 0) {
                                                    return 10;
                                                }
                                                i16 = i13;
                                                while (true) {
                                                    bArr = f86610u;
                                                    if (i16 < bArr.length) {
                                                        i17 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i16] != bArr[i16]) {
                                                        i17 = i13;
                                                        break;
                                                    }
                                                    i16++;
                                                }
                                                if (i17 != 0) {
                                                    return 13;
                                                }
                                                i18 = i13;
                                                while (true) {
                                                    bArr2 = f86614y;
                                                    if (i18 < bArr2.length) {
                                                        i19 = i13;
                                                        while (true) {
                                                            bArr3 = f86615z;
                                                            if (i19 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i19 + 4] != bArr3[i19]) {
                                                                break;
                                                                break;
                                                            }
                                                            i19++;
                                                        }
                                                        if (i26 != 0) {
                                                            return 14;
                                                        }
                                                        return i13;
                                                    }
                                                    if (bArr4[i18] != bArr2[i18]) {
                                                        break;
                                                        break;
                                                    }
                                                    i18++;
                                                }
                                                i26 = i13;
                                                if (i26 != 0) {
                                                    return 14;
                                                }
                                                return i13;
                                            }
                                            c22217b2.close();
                                            i13 = 0;
                                        } catch (Exception e13) {
                                            e = e13;
                                            i13 = 0;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c22217b = c22217b2;
                                        if (c22217b != null) {
                                            c22217b.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    i13 = 0;
                                    c22217b2 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    c22217b = null;
                                }
                                ByteOrder byteOrderM63687t7 = m63687t(c22217b4);
                                this.f86621f = byteOrderM63687t7;
                                c22217b4.f86575y = byteOrderM63687t7;
                                s13 = c22217b4.readShort();
                                if (s13 != 20306) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                }
                                c22217b4.close();
                            } catch (Exception unused4) {
                                if (c22217b4 != null) {
                                    c22217b4.close();
                                }
                                i14 = i13;
                            } catch (Throwable th7) {
                                th = th7;
                                c22217b3 = c22217b4;
                                if (c22217b3 != null) {
                                    c22217b3.close();
                                }
                                throw th;
                            }
                            c22217b4 = new C22217b(bArr4);
                        } catch (Exception unused5) {
                            c22217b4 = null;
                        } catch (Throwable th8) {
                            th = th8;
                            c22217b3 = null;
                        }
                        if (i14 != 0) {
                            return 7;
                        }
                        c22217b7 = new C22217b(bArr4);
                        ByteOrder byteOrderM63687t8 = m63687t(c22217b7);
                        this.f86621f = byteOrderM63687t8;
                        c22217b7.f86575y = byteOrderM63687t8;
                        if (c22217b7.readShort() == 85) {
                            i15 = 1;
                        } else {
                            i15 = i13;
                        }
                        c22217b7.close();
                        if (i15 != 0) {
                            return 10;
                        }
                        i16 = i13;
                        while (true) {
                            bArr = f86610u;
                            if (i16 < bArr.length) {
                                i17 = 1;
                                break;
                            }
                            if (bArr4[i16] != bArr[i16]) {
                                i17 = i13;
                                break;
                            }
                            i16++;
                        }
                        if (i17 != 0) {
                            return 13;
                        }
                        i18 = i13;
                        while (true) {
                            bArr2 = f86614y;
                            if (i18 < bArr2.length) {
                                i19 = i13;
                                while (true) {
                                    bArr3 = f86615z;
                                    if (i19 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i19 + 4] != bArr3[i19]) {
                                        break;
                                        break;
                                    }
                                    i19++;
                                }
                                if (i26 != 0) {
                                    return 14;
                                }
                                return i13;
                            }
                            if (bArr4[i18] != bArr2[i18]) {
                                break;
                                break;
                            }
                            i18++;
                        }
                        i26 = i13;
                        if (i26 != 0) {
                            return 14;
                        }
                        return i13;
                    }
                }
                return 9;
            }
            i24++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m63696h(C22221f c22221f) throws Throwable {
        int i13;
        int i14;
        m63699k(c22221f);
        HashMap[] mapArr = this.f86619d;
        C22218c c22218c = (C22218c) mapArr[1].get("MakerNote");
        if (c22218c != null) {
            C22221f c22221f2 = new C22221f(c22218c.f86580d);
            c22221f2.f86575y = this.f86621f;
            byte[] bArr = f86608s;
            byte[] bArr2 = new byte[bArr.length];
            c22221f2.readFully(bArr2);
            c22221f2.m63686h(0L);
            byte[] bArr3 = f86609t;
            byte[] bArr4 = new byte[bArr3.length];
            c22221f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c22221f2.m63686h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c22221f2.m63686h(12L);
            }
            m63709v(c22221f2, 6);
            C22218c c22218c2 = (C22218c) mapArr[7].get("PreviewImageStart");
            C22218c c22218c3 = (C22218c) mapArr[7].get("PreviewImageLength");
            if (c22218c2 != null && c22218c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c22218c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c22218c3);
            }
            C22218c c22218c4 = (C22218c) mapArr[8].get("AspectFrame");
            if (c22218c4 != null) {
                int[] iArr = (int[]) c22218c4.m63684g(this.f86621f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i15 = iArr[2];
                int i16 = iArr[0];
                if (i15 <= i16 || (i13 = iArr[3]) <= (i14 = iArr[1])) {
                    return;
                }
                int i17 = (i15 - i16) + 1;
                int i18 = (i13 - i14) + 1;
                if (i17 < i18) {
                    int i19 = i17 + i18;
                    i18 = i19 - i18;
                    i17 = i19 - i18;
                }
                C22218c c22218cM63680c = C22218c.m63680c(i17, this.f86621f);
                C22218c c22218cM63680c2 = C22218c.m63680c(i18, this.f86621f);
                mapArr[0].put("ImageWidth", c22218cM63680c);
                mapArr[0].put("ImageLength", c22218cM63680c2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m63697i(C22217b c22217b) throws Throwable {
        if (f86601l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c22217b);
        }
        c22217b.f86575y = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f86610u;
        c22217b.m63677b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i13 = c22217b.readInt();
                byte[] bArr2 = new byte[4];
                c22217b.readFully(bArr2);
                int i14 = length + 8;
                if (i14 == 16 && !Arrays.equals(bArr2, f86612w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f86613x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f86611v)) {
                    byte[] bArr3 = new byte[i13];
                    c22217b.readFully(bArr3);
                    int i15 = c22217b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i15) {
                        this.f86623h = i14;
                        m63708u(0, bArr3);
                        m63688A();
                        m63711x(new C22217b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i15 + ", calculated CRC value: " + crc32.getValue());
                }
                int i16 = i13 + 4;
                c22217b.m63677b(i16);
                length = i14 + i16;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m63698j(C22217b c22217b) throws Throwable {
        boolean z4 = f86601l;
        if (z4) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c22217b);
        }
        c22217b.m63677b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c22217b.readFully(bArr);
        c22217b.readFully(bArr2);
        c22217b.readFully(bArr3);
        int i13 = ByteBuffer.wrap(bArr).getInt();
        int i14 = ByteBuffer.wrap(bArr2).getInt();
        int i15 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i14];
        c22217b.m63677b(i13 - c22217b.f86574x);
        c22217b.readFully(bArr4);
        m63694f(new C22217b(bArr4), i13, 5);
        c22217b.m63677b(i15 - c22217b.f86574x);
        c22217b.f86575y = ByteOrder.BIG_ENDIAN;
        int i16 = c22217b.readInt();
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i16);
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int unsignedShort = c22217b.readUnsignedShort();
            int unsignedShort2 = c22217b.readUnsignedShort();
            if (unsignedShort == f86591E.f86581a) {
                short s13 = c22217b.readShort();
                short s14 = c22217b.readShort();
                C22218c c22218cM63680c = C22218c.m63680c(s13, this.f86621f);
                C22218c c22218cM63680c2 = C22218c.m63680c(s14, this.f86621f);
                HashMap[] mapArr = this.f86619d;
                mapArr[0].put("ImageLength", c22218cM63680c);
                mapArr[0].put("ImageWidth", c22218cM63680c2);
                if (z4) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s13) + ", width: " + ((int) s14));
                    return;
                }
                return;
            }
            c22217b.m63677b(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m63699k(C22221f c22221f) throws Throwable {
        m63706r(c22221f);
        m63709v(c22221f, 0);
        m63713z(c22221f, 0);
        m63713z(c22221f, 5);
        m63713z(c22221f, 4);
        m63688A();
        if (this.f86618c == 8) {
            HashMap[] mapArr = this.f86619d;
            C22218c c22218c = (C22218c) mapArr[1].get("MakerNote");
            if (c22218c != null) {
                C22221f c22221f2 = new C22221f(c22218c.f86580d);
                c22221f2.f86575y = this.f86621f;
                c22221f2.m63677b(6);
                m63709v(c22221f2, 9);
                C22218c c22218c2 = (C22218c) mapArr[9].get("ColorSpace");
                if (c22218c2 != null) {
                    mapArr[1].put("ColorSpace", c22218c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m63700l() {
        switch (m63691c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m63701m(C22221f c22221f) throws Throwable {
        if (f86601l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c22221f);
        }
        m63699k(c22221f);
        HashMap[] mapArr = this.f86619d;
        C22218c c22218c = (C22218c) mapArr[0].get("JpgFromRaw");
        if (c22218c != null) {
            m63694f(new C22217b(c22218c.f86580d), (int) c22218c.f86579c, 5);
        }
        C22218c c22218c2 = (C22218c) mapArr[0].get("ISO");
        C22218c c22218c3 = (C22218c) mapArr[1].get("PhotographicSensitivity");
        if (c22218c2 == null || c22218c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c22218c2);
    }

    /* JADX INFO: renamed from: n */
    public final void m63702n(C22217b c22217b) throws Throwable {
        if (f86601l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c22217b);
        }
        c22217b.f86575y = ByteOrder.LITTLE_ENDIAN;
        c22217b.m63677b(f86614y.length);
        int i13 = c22217b.readInt() + 8;
        byte[] bArr = f86615z;
        c22217b.m63677b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c22217b.readFully(bArr2);
                int i14 = c22217b.readInt();
                int i15 = length + 8;
                if (Arrays.equals(f86587A, bArr2)) {
                    byte[] bArr3 = new byte[i14];
                    c22217b.readFully(bArr3);
                    this.f86623h = i15;
                    m63708u(0, bArr3);
                    m63711x(new C22217b(bArr3));
                    return;
                }
                if (i14 % 2 == 1) {
                    i14++;
                }
                length = i15 + i14;
                if (length == i13) {
                    return;
                }
                if (length > i13) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c22217b.m63677b(i14);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m63703o(C22217b c22217b, HashMap map) throws Throwable {
        C22218c c22218c = (C22218c) map.get("JPEGInterchangeFormat");
        C22218c c22218c2 = (C22218c) map.get("JPEGInterchangeFormatLength");
        if (c22218c == null || c22218c2 == null) {
            return;
        }
        int iM63682e = c22218c.m63682e(this.f86621f);
        int iM63682e2 = c22218c2.m63682e(this.f86621f);
        if (this.f86618c == 7) {
            iM63682e += this.f86624i;
        }
        if (iM63682e > 0 && iM63682e2 > 0 && this.f86617b == null && this.f86616a == null) {
            c22217b.m63677b(iM63682e);
            c22217b.readFully(new byte[iM63682e2]);
        }
        if (f86601l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM63682e + ", length: " + iM63682e2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m63704p() {
        int iM63691c = m63691c();
        return iM63691c == 2 || iM63691c == 7 || iM63691c == 4 || iM63691c == 5;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m63705q(HashMap map) {
        C22218c c22218c = (C22218c) map.get("ImageLength");
        C22218c c22218c2 = (C22218c) map.get("ImageWidth");
        if (c22218c == null || c22218c2 == null) {
            return false;
        }
        return c22218c.m63682e(this.f86621f) <= 512 && c22218c2.m63682e(this.f86621f) <= 512;
    }

    /* JADX INFO: renamed from: r */
    public final void m63706r(C22221f c22221f) throws IOException {
        ByteOrder byteOrderM63687t = m63687t(c22221f);
        this.f86621f = byteOrderM63687t;
        c22221f.f86575y = byteOrderM63687t;
        int unsignedShort = c22221f.readUnsignedShort();
        int i13 = this.f86618c;
        if (i13 != 7 && i13 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i14 = c22221f.readInt();
        if (i14 < 8) {
            throw new IOException(AbstractC2875y.m8295h(i14, "Invalid first Ifd offset: "));
        }
        int i15 = i14 - 8;
        if (i15 > 0) {
            c22221f.m63677b(i15);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m63707s() {
        int i13 = 0;
        while (true) {
            HashMap[] mapArr = this.f86619d;
            if (i13 >= mapArr.length) {
                return;
            }
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "The size of tag group[", "]: ");
            sbM30466t.append(mapArr[i13].size());
            Log.d("ExifInterface", sbM30466t.toString());
            for (Map.Entry entry : mapArr[i13].entrySet()) {
                C22218c c22218c = (C22218c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c22218c.toString() + ", tagValue: '" + c22218c.m63683f(this.f86621f) + "'");
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m63708u(int i13, byte[] bArr) throws IOException {
        C22221f c22221f = new C22221f(bArr);
        m63706r(c22221f);
        m63709v(c22221f, i13);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    /* JADX INFO: renamed from: v */
    public final void m63709v(C22221f c22221f, int i13) throws IOException {
        HashMap[] mapArr;
        long j7;
        long j13;
        boolean z4;
        int i14;
        long j14;
        Integer num;
        HashSet hashSet;
        long j15;
        String str;
        int unsignedShort;
        long j16;
        String strM31994m;
        int i15;
        int i16 = c22221f.f86574x;
        int i17 = c22221f.f86572E;
        Integer numValueOf = Integer.valueOf(i16);
        HashSet hashSet2 = this.f86620e;
        hashSet2.add(numValueOf);
        short s13 = c22221f.readShort();
        boolean z13 = f86601l;
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s13));
        }
        if (s13 <= 0) {
            return;
        }
        short s14 = 0;
        while (true) {
            mapArr = this.f86619d;
            if (s14 >= s13) {
                break;
            }
            int unsignedShort2 = c22221f.readUnsignedShort();
            int unsignedShort3 = c22221f.readUnsignedShort();
            int i18 = c22221f.readInt();
            long j17 = ((long) c22221f.f86574x) + 4;
            short s15 = s13;
            C22219d c22219d = (C22219d) f86594H[i13].get(Integer.valueOf(unsignedShort2));
            if (z13) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i13), Integer.valueOf(unsignedShort2), c22219d != null ? c22219d.f86582b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i18)));
            }
            if (c22219d != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f86589C;
                    if (unsignedShort3 < iArr.length) {
                        int i19 = c22219d.f86583c;
                        if (i19 == 7 || unsignedShort3 == 7 || i19 == unsignedShort3 || (i14 = c22219d.f86584d) == unsignedShort3 || (((i19 == 4 || i14 == 4) && unsignedShort3 == 3) || (((i19 == 9 || i14 == 9) && unsignedShort3 == 8) || ((i19 == 12 || i14 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i19;
                            }
                            j7 = j17;
                            j13 = ((long) i18) * ((long) iArr[unsignedShort3]);
                            if (j13 < 0 || j13 > 2147483647L) {
                                if (z13 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i18);
                                }
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                        } else if (z13 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f86588B[unsignedShort3] + ") is unexpected for tag: " + c22219d.f86582b);
                        }
                    }
                    if (z4) {
                        j14 = j7;
                        if (j13 > 4) {
                            i15 = c22221f.readInt();
                            if (z13 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i15);
                            }
                            if (this.f86618c == 7) {
                                if ("MakerNote".equals(c22219d.f86582b)) {
                                    this.f86624i = i15;
                                } else if (i13 != 6 && "ThumbnailImage".equals(c22219d.f86582b)) {
                                    this.f86625j = i15;
                                    this.f86626k = i18;
                                    C22218c c22218cM63680c = C22218c.m63680c(6, this.f86621f);
                                    C22218c c22218cM63678a = C22218c.m63678a(this.f86625j, this.f86621f);
                                    C22218c c22218cM63678a2 = C22218c.m63678a(this.f86626k, this.f86621f);
                                    mapArr[4].put("Compression", c22218cM63680c);
                                    mapArr[4].put("JPEGInterchangeFormat", c22218cM63678a);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c22218cM63678a2);
                                }
                            }
                            c22221f.m63686h(i15);
                        } else {
                            j14 = j14;
                            unsignedShort2 = unsignedShort2;
                            c22219d = c22219d;
                        }
                        num = (Integer) f86597K.get(Integer.valueOf(unsignedShort2));
                        if (z13 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j16 = ((long) c22221f.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = c22221f.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = c22221f.readInt();
                                } else {
                                    j16 = -1;
                                }
                                if (z13 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                                }
                                if (j16 > 0 || (i17 != -1 && j16 >= i17)) {
                                    hashSet = hashSet2;
                                    if (z13 != 0) {
                                        strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i17 != -1) {
                                            strM31994m = strM31994m + " (total length: " + i17 + ")";
                                        }
                                        Log.d("ExifInterface", strM31994m);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j16))) {
                                        c22221f.m63686h(j16);
                                        m63709v(c22221f, num.intValue());
                                    } else if (z13 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j16 + ")");
                                    }
                                }
                                c22221f.m63686h(j14);
                            } else {
                                unsignedShort = c22221f.readUnsignedShort();
                            }
                            j16 = unsignedShort;
                            if (z13 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                            }
                            if (j16 > 0) {
                                hashSet = hashSet2;
                                if (z13 != 0) {
                                    strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i17 != -1) {
                                        strM31994m = strM31994m + " (total length: " + i17 + ")";
                                    }
                                    Log.d("ExifInterface", strM31994m);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z13 != 0) {
                                    strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i17 != -1) {
                                        strM31994m = strM31994m + " (total length: " + i17 + ")";
                                    }
                                    Log.d("ExifInterface", strM31994m);
                                }
                            }
                            c22221f.m63686h(j14);
                        } else {
                            hashSet = hashSet2;
                            j15 = j14;
                            int i24 = c22221f.f86574x + this.f86623h;
                            byte[] bArr = new byte[(int) j13];
                            c22221f.readFully(bArr);
                            C22218c c22218c = new C22218c(i24, bArr, unsignedShort3, i18);
                            HashMap map = mapArr[i13];
                            str = c22219d.f86582b;
                            map.put(str, c22218c);
                            if ("DNGVersion".equals(str)) {
                                this.f86618c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c22218c.m63683f(this.f86621f).contains("PENTAX")) || ("Compression".equals(str) && c22218c.m63682e(this.f86621f) == 65535)) {
                                this.f86618c = 8;
                            }
                            if (c22221f.f86574x != j15) {
                                c22221f.m63686h(j15);
                            }
                        }
                    } else {
                        c22221f.m63686h(j7);
                        hashSet = hashSet2;
                    }
                    s14 = (short) (s14 + 1);
                    hashSet2 = hashSet;
                    s13 = s15;
                    z13 = z13;
                }
                j7 = j17;
                if (z13 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j13 = 0;
                z4 = false;
                if (z4) {
                    c22221f.m63686h(j7);
                    hashSet = hashSet2;
                } else {
                    j14 = j7;
                    if (j13 > 4) {
                        i15 = c22221f.readInt();
                        if (z13 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i15);
                        }
                        if (this.f86618c == 7) {
                            if ("MakerNote".equals(c22219d.f86582b)) {
                                this.f86624i = i15;
                            } else if (i13 != 6) {
                            }
                        }
                        c22221f.m63686h(i15);
                    } else {
                        j14 = j14;
                        unsignedShort2 = unsignedShort2;
                        c22219d = c22219d;
                    }
                    num = (Integer) f86597K.get(Integer.valueOf(unsignedShort2));
                    if (z13 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j16 = ((long) c22221f.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = c22221f.readInt();
                            } else {
                                unsignedShort = c22221f.readShort();
                            }
                            if (z13 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                            }
                            if (j16 > 0) {
                                hashSet = hashSet2;
                                if (z13 != 0) {
                                    strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i17 != -1) {
                                        strM31994m = strM31994m + " (total length: " + i17 + ")";
                                    }
                                    Log.d("ExifInterface", strM31994m);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z13 != 0) {
                                    strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i17 != -1) {
                                        strM31994m = strM31994m + " (total length: " + i17 + ")";
                                    }
                                    Log.d("ExifInterface", strM31994m);
                                }
                            }
                            c22221f.m63686h(j14);
                        } else {
                            unsignedShort = c22221f.readUnsignedShort();
                        }
                        j16 = unsignedShort;
                        if (z13 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                        }
                        if (j16 > 0) {
                            hashSet = hashSet2;
                            if (z13 != 0) {
                                strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                if (i17 != -1) {
                                    strM31994m = strM31994m + " (total length: " + i17 + ")";
                                }
                                Log.d("ExifInterface", strM31994m);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z13 != 0) {
                                strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                if (i17 != -1) {
                                    strM31994m = strM31994m + " (total length: " + i17 + ")";
                                }
                                Log.d("ExifInterface", strM31994m);
                            }
                        }
                        c22221f.m63686h(j14);
                    } else {
                        hashSet = hashSet2;
                        j15 = j14;
                        int i25 = c22221f.f86574x + this.f86623h;
                        byte[] bArr2 = new byte[(int) j13];
                        c22221f.readFully(bArr2);
                        C22218c c22218c2 = new C22218c(i25, bArr2, unsignedShort3, i18);
                        HashMap map2 = mapArr[i13];
                        str = c22219d.f86582b;
                        map2.put(str, c22218c2);
                        if ("DNGVersion".equals(str)) {
                            this.f86618c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f86618c = 8;
                        if (c22221f.f86574x != j15) {
                            c22221f.m63686h(j15);
                        }
                    }
                }
                s14 = (short) (s14 + 1);
                hashSet2 = hashSet;
                s13 = s15;
                z13 = z13;
            } else if (z13) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j7 = j17;
            j13 = 0;
            z4 = false;
            if (z4) {
                c22221f.m63686h(j7);
                hashSet = hashSet2;
            } else {
                j14 = j7;
                if (j13 > 4) {
                    i15 = c22221f.readInt();
                    if (z13 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i15);
                    }
                    if (this.f86618c == 7) {
                        if ("MakerNote".equals(c22219d.f86582b)) {
                            this.f86624i = i15;
                        } else if (i13 != 6) {
                        }
                    }
                    c22221f.m63686h(i15);
                } else {
                    j14 = j14;
                    unsignedShort2 = unsignedShort2;
                    c22219d = c22219d;
                }
                num = (Integer) f86597K.get(Integer.valueOf(unsignedShort2));
                if (z13 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j13);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j16 = ((long) c22221f.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = c22221f.readInt();
                        } else {
                            unsignedShort = c22221f.readShort();
                        }
                        if (z13 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                        }
                        if (j16 > 0) {
                            hashSet = hashSet2;
                            if (z13 != 0) {
                                strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                if (i17 != -1) {
                                    strM31994m = strM31994m + " (total length: " + i17 + ")";
                                }
                                Log.d("ExifInterface", strM31994m);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z13 != 0) {
                                strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                                if (i17 != -1) {
                                    strM31994m = strM31994m + " (total length: " + i17 + ")";
                                }
                                Log.d("ExifInterface", strM31994m);
                            }
                        }
                        c22221f.m63686h(j14);
                    } else {
                        unsignedShort = c22221f.readUnsignedShort();
                    }
                    j16 = unsignedShort;
                    if (z13 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j16), c22219d.f86582b));
                    }
                    if (j16 > 0) {
                        hashSet = hashSet2;
                        if (z13 != 0) {
                            strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                            if (i17 != -1) {
                                strM31994m = strM31994m + " (total length: " + i17 + ")";
                            }
                            Log.d("ExifInterface", strM31994m);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z13 != 0) {
                            strM31994m = AbstractC11895b.m31994m(j16, "Skip jump into the IFD since its offset is invalid: ");
                            if (i17 != -1) {
                                strM31994m = strM31994m + " (total length: " + i17 + ")";
                            }
                            Log.d("ExifInterface", strM31994m);
                        }
                    }
                    c22221f.m63686h(j14);
                } else {
                    hashSet = hashSet2;
                    j15 = j14;
                    int i26 = c22221f.f86574x + this.f86623h;
                    byte[] bArr3 = new byte[(int) j13];
                    c22221f.readFully(bArr3);
                    C22218c c22218c3 = new C22218c(i26, bArr3, unsignedShort3, i18);
                    HashMap map3 = mapArr[i13];
                    str = c22219d.f86582b;
                    map3.put(str, c22218c3);
                    if ("DNGVersion".equals(str)) {
                        this.f86618c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f86618c = 8;
                    if (c22221f.f86574x != j15) {
                        c22221f.m63686h(j15);
                    }
                }
            }
            s14 = (short) (s14 + 1);
            hashSet2 = hashSet;
            s13 = s15;
            z13 = z13;
        }
        HashSet hashSet3 = hashSet2;
        boolean z14 = z13;
        int i27 = c22221f.readInt();
        if (z14) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i27)));
        }
        long j18 = i27;
        if (j18 <= 0) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i27);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i27))) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i27);
                return;
            }
            return;
        }
        c22221f.m63686h(j18);
        if (mapArr[4].isEmpty()) {
            m63709v(c22221f, 4);
        } else if (mapArr[5].isEmpty()) {
            m63709v(c22221f, 5);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m63710w(int i13, String str, String str2) {
        HashMap[] mapArr = this.f86619d;
        if (mapArr[i13].isEmpty() || mapArr[i13].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i13];
        map.put(str2, map.get(str));
        mapArr[i13].remove(str);
    }

    /* JADX INFO: renamed from: x */
    public final void m63711x(C22217b c22217b) throws Throwable {
        C22218c c22218c;
        int iM63682e;
        HashMap map = this.f86619d[4];
        C22218c c22218c2 = (C22218c) map.get("Compression");
        if (c22218c2 == null) {
            m63703o(c22217b, map);
            return;
        }
        int iM63682e2 = c22218c2.m63682e(this.f86621f);
        if (iM63682e2 != 1) {
            if (iM63682e2 == 6) {
                m63703o(c22217b, map);
                return;
            } else if (iM63682e2 != 7) {
                return;
            }
        }
        C22218c c22218c3 = (C22218c) map.get("BitsPerSample");
        if (c22218c3 != null) {
            int[] iArr = (int[]) c22218c3.m63684g(this.f86621f);
            int[] iArr2 = f86602m;
            if (Arrays.equals(iArr2, iArr) || (this.f86618c == 3 && (c22218c = (C22218c) map.get("PhotometricInterpretation")) != null && (((iM63682e = c22218c.m63682e(this.f86621f)) == 1 && Arrays.equals(iArr, f86603n)) || (iM63682e == 6 && Arrays.equals(iArr, iArr2))))) {
                C22218c c22218c4 = (C22218c) map.get("StripOffsets");
                C22218c c22218c5 = (C22218c) map.get("StripByteCounts");
                if (c22218c4 == null || c22218c5 == null) {
                    return;
                }
                long[] jArrM36292v = AbstractC12889b.m36292v(c22218c4.m63684g(this.f86621f));
                long[] jArrM36292v2 = AbstractC12889b.m36292v(c22218c5.m63684g(this.f86621f));
                if (jArrM36292v == null || jArrM36292v.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM36292v2 == null || jArrM36292v2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM36292v.length != jArrM36292v2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j7 = 0;
                for (long j13 : jArrM36292v2) {
                    j7 += j13;
                }
                byte[] bArr = new byte[(int) j7];
                this.f86622g = true;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < jArrM36292v.length; i15++) {
                    int i16 = (int) jArrM36292v[i15];
                    int i17 = (int) jArrM36292v2[i15];
                    if (i15 < jArrM36292v.length - 1 && i16 + i17 != jArrM36292v[i15 + 1]) {
                        this.f86622g = false;
                    }
                    int i18 = i16 - i13;
                    if (i18 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c22217b.m63677b(i18);
                        int i19 = i13 + i18;
                        byte[] bArr2 = new byte[i17];
                        try {
                            c22217b.readFully(bArr2);
                            i13 = i19 + i17;
                            System.arraycopy(bArr2, 0, bArr, i14, i17);
                            i14 += i17;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                        return;
                    }
                }
                if (this.f86622g) {
                    long j14 = jArrM36292v[0];
                    return;
                }
                return;
            }
        }
        if (f86601l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m63712y(int i13, int i14) throws Throwable {
        HashMap[] mapArr = this.f86619d;
        boolean zIsEmpty = mapArr[i13].isEmpty();
        boolean z4 = f86601l;
        if (zIsEmpty || mapArr[i14].isEmpty()) {
            if (z4) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C22218c c22218c = (C22218c) mapArr[i13].get("ImageLength");
        C22218c c22218c2 = (C22218c) mapArr[i13].get("ImageWidth");
        C22218c c22218c3 = (C22218c) mapArr[i14].get("ImageLength");
        C22218c c22218c4 = (C22218c) mapArr[i14].get("ImageWidth");
        if (c22218c == null || c22218c2 == null) {
            if (z4) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c22218c3 == null || c22218c4 == null) {
            if (z4) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM63682e = c22218c.m63682e(this.f86621f);
        int iM63682e2 = c22218c2.m63682e(this.f86621f);
        int iM63682e3 = c22218c3.m63682e(this.f86621f);
        int iM63682e4 = c22218c4.m63682e(this.f86621f);
        if (iM63682e >= iM63682e3 || iM63682e2 >= iM63682e4) {
            return;
        }
        HashMap map = mapArr[i13];
        mapArr[i13] = mapArr[i14];
        mapArr[i14] = map;
    }

    /* JADX INFO: renamed from: z */
    public final void m63713z(C22221f c22221f, int i13) throws Throwable {
        C22218c c22218cM63680c;
        C22218c c22218cM63680c2;
        HashMap[] mapArr = this.f86619d;
        C22218c c22218c = (C22218c) mapArr[i13].get("DefaultCropSize");
        C22218c c22218c2 = (C22218c) mapArr[i13].get("SensorTopBorder");
        C22218c c22218c3 = (C22218c) mapArr[i13].get("SensorLeftBorder");
        C22218c c22218c4 = (C22218c) mapArr[i13].get("SensorBottomBorder");
        C22218c c22218c5 = (C22218c) mapArr[i13].get("SensorRightBorder");
        if (c22218c != null) {
            if (c22218c.f86577a == 5) {
                C22220e[] c22220eArr = (C22220e[]) c22218c.m63684g(this.f86621f);
                if (c22220eArr == null || c22220eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c22220eArr));
                    return;
                }
                c22218cM63680c = C22218c.m63679b(c22220eArr[0], this.f86621f);
                c22218cM63680c2 = C22218c.m63679b(c22220eArr[1], this.f86621f);
            } else {
                int[] iArr = (int[]) c22218c.m63684g(this.f86621f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c22218cM63680c = C22218c.m63680c(iArr[0], this.f86621f);
                c22218cM63680c2 = C22218c.m63680c(iArr[1], this.f86621f);
            }
            mapArr[i13].put("ImageWidth", c22218cM63680c);
            mapArr[i13].put("ImageLength", c22218cM63680c2);
            return;
        }
        if (c22218c2 != null && c22218c3 != null && c22218c4 != null && c22218c5 != null) {
            int iM63682e = c22218c2.m63682e(this.f86621f);
            int iM63682e2 = c22218c4.m63682e(this.f86621f);
            int iM63682e3 = c22218c5.m63682e(this.f86621f);
            int iM63682e4 = c22218c3.m63682e(this.f86621f);
            if (iM63682e2 <= iM63682e || iM63682e3 <= iM63682e4) {
                return;
            }
            C22218c c22218cM63680c3 = C22218c.m63680c(iM63682e2 - iM63682e, this.f86621f);
            C22218c c22218cM63680c4 = C22218c.m63680c(iM63682e3 - iM63682e4, this.f86621f);
            mapArr[i13].put("ImageLength", c22218cM63680c3);
            mapArr[i13].put("ImageWidth", c22218cM63680c4);
            return;
        }
        C22218c c22218c6 = (C22218c) mapArr[i13].get("ImageLength");
        C22218c c22218c7 = (C22218c) mapArr[i13].get("ImageWidth");
        if (c22218c6 == null || c22218c7 == null) {
            C22218c c22218c8 = (C22218c) mapArr[i13].get("JPEGInterchangeFormat");
            C22218c c22218c9 = (C22218c) mapArr[i13].get("JPEGInterchangeFormatLength");
            if (c22218c8 == null || c22218c9 == null) {
                return;
            }
            int iM63682e5 = c22218c8.m63682e(this.f86621f);
            int iM63682e6 = c22218c8.m63682e(this.f86621f);
            c22221f.m63686h(iM63682e5);
            byte[] bArr = new byte[iM63682e6];
            c22221f.readFully(bArr);
            m63694f(new C22217b(bArr), iM63682e5, i13);
        }
    }
}
