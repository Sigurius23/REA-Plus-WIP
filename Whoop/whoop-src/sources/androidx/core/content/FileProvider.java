package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p479s4.AbstractC32122c;
import p479s4.AbstractC32123d;
import p479s4.C32125f;
import p479s4.InterfaceC32124e;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private InterfaceC32124e mLocalPathStrategy;
    private final Object mLock = new Object();
    private final int mResourceId = 0;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final HashMap<String, InterfaceC32124e> sCache = new HashMap<>();

    public static String access$000(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC32124e m3674b(Context context, int i13, String str) {
        InterfaceC32124e interfaceC32124eM3675c;
        HashMap<String, InterfaceC32124e> map = sCache;
        synchronized (map) {
            try {
                interfaceC32124eM3675c = map.get(str);
                if (interfaceC32124eM3675c == null) {
                    try {
                        try {
                            interfaceC32124eM3675c = m3675c(context, i13, str);
                            map.put(str, interfaceC32124eM3675c);
                        } catch (IOException e5) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                        }
                    } catch (XmlPullParserException e13) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e13);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC32124eM3675c;
    }

    /* JADX INFO: renamed from: c */
    public static C32125f m3675c(Context context, int i13, String str) throws XmlPullParserException, IOException {
        C32125f c32125f = new C32125f(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i13);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return c32125f;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, ATTR_NAME);
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = AbstractC32122c.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = AbstractC32122c.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] fileArrM100025e = AbstractC32123d.m100025e(context);
                    if (fileArrM100025e.length > 0) {
                        externalStorageDirectory = fileArrM100025e[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    c32125f.m100033a(externalStorageDirectory, attributeValue);
                }
            }
        }
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i13) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i13 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i13);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return ((C32125f) m3674b(context, 0, str)).m100035d(file);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC32124e m3676a() {
        InterfaceC32124e interfaceC32124e;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = m3674b(getContext(), this.mResourceId, this.mAuthority);
                }
                interfaceC32124e = this.mLocalPathStrategy;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC32124e;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, InterfaceC32124e> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return ((C32125f) m3676a()).m100034c(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileM100034c = ((C32125f) m3676a()).m100034c(uri);
        int iLastIndexOf = fileM100034c.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return DfuBaseService.MIME_TYPE_OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM100034c.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : DfuBaseService.MIME_TYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return DfuBaseService.MIME_TYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i13;
        File fileM100034c = ((C32125f) m3676a()).m100034c(uri);
        if ("r".equals(str)) {
            i13 = 268435456;
        } else if (StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH.equals(str) || "wt".equals(str)) {
            i13 = 738197504;
        } else if ("wa".equals(str)) {
            i13 = 704643072;
        } else if ("rw".equals(str)) {
            i13 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Invalid mode: ", str));
            }
            i13 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileM100034c, i13);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i13;
        File fileM100034c = ((C32125f) m3676a()).m100034c(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i14 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i14] = "_display_name";
                i13 = i14 + 1;
                objArr[i14] = queryParameter == null ? fileM100034c.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i14] = "_size";
                    i13 = i14 + 1;
                    objArr[i14] = Long.valueOf(fileM100034c.length());
                }
            }
            i14 = i13;
        }
        String[] strArr4 = new String[i14];
        System.arraycopy(strArr3, 0, strArr4, 0, i14);
        Object[] objArr2 = new Object[i14];
        System.arraycopy(objArr, 0, objArr2, 0, i14);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
