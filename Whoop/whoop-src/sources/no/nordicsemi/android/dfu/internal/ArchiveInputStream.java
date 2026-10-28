package no.nordicsemi.android.dfu.internal;

import android.util.Log;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.internal.manifest.FileInfo;
import no.nordicsemi.android.dfu.internal.manifest.Manifest;
import no.nordicsemi.android.dfu.internal.manifest.ManifestFile;
import no.nordicsemi.android.dfu.internal.manifest.SoftDeviceBootloaderFileInfo;

/* JADX INFO: loaded from: classes3.dex */
public class ArchiveInputStream extends InputStream {
    private static final String APPLICATION_BIN = "application.bin";
    private static final String APPLICATION_HEX = "application.hex";
    private static final String APPLICATION_INIT = "application.dat";
    private static final String BOOTLOADER_BIN = "bootloader.bin";
    private static final String BOOTLOADER_HEX = "bootloader.hex";
    private static final String MANIFEST = "manifest.json";
    private static final String SOFTDEVICE_BIN = "softdevice.bin";
    private static final String SOFTDEVICE_HEX = "softdevice.hex";
    private static final String SYSTEM_INIT = "system.dat";
    private static final String TAG = "DfuArchiveInputStream";
    private byte[] applicationBytes;
    private byte[] applicationInitBytes;
    private int applicationSize;
    private byte[] bootloaderBytes;
    private int bootloaderSize;
    private int bytesRead;
    private int bytesReadFromCurrentSource;
    private int bytesReadFromMarkedSource;
    private final CRC32 crc32;
    private byte[] currentSource;
    private final Map<String, byte[]> entries;
    private Manifest manifest;
    private byte[] markedSource;
    private byte[] softDeviceAndBootloaderBytes;
    private byte[] softDeviceBytes;
    private int softDeviceSize;
    private byte[] systemInitBytes;
    private int type;
    private final ZipInputStream zipInputStream;

    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    public ArchiveInputStream(InputStream inputStream, int i13, int i14) throws IOException {
        boolean z4;
        boolean z13;
        if (inputStream.available() > 10485760) {
            throw new IOException("File too large: " + inputStream.available() + " bytes (max 10 MB)");
        }
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        this.zipInputStream = zipInputStream;
        this.crc32 = new CRC32();
        HashMap map = new HashMap();
        this.entries = map;
        this.bytesRead = 0;
        this.bytesReadFromCurrentSource = 0;
        try {
            parseZip(i13);
            Manifest manifest = this.manifest;
            boolean z14 = true;
            if (manifest != null) {
                if (manifest.getApplicationInfo() == null || (i14 != 0 && (i14 & 4) <= 0)) {
                    z13 = false;
                } else {
                    FileInfo applicationInfo = this.manifest.getApplicationInfo();
                    this.applicationBytes = (byte[]) map.get(applicationInfo.getBinFileName());
                    this.applicationInitBytes = (byte[]) map.get(applicationInfo.getDatFileName());
                    byte[] bArr = this.applicationBytes;
                    if (bArr == null) {
                        throw new IOException("Application file " + applicationInfo.getBinFileName() + " not found.");
                    }
                    this.applicationSize = bArr.length;
                    this.currentSource = bArr;
                    z13 = true;
                }
                if (this.manifest.getBootloaderInfo() != null && (i14 == 0 || (i14 & 2) > 0)) {
                    if (this.systemInitBytes != null) {
                        throw new IOException("Manifest: softdevice and bootloader specified. Use softdevice_bootloader instead.");
                    }
                    FileInfo bootloaderInfo = this.manifest.getBootloaderInfo();
                    this.bootloaderBytes = (byte[]) map.get(bootloaderInfo.getBinFileName());
                    this.systemInitBytes = (byte[]) map.get(bootloaderInfo.getDatFileName());
                    byte[] bArr2 = this.bootloaderBytes;
                    if (bArr2 == null) {
                        throw new IOException("Bootloader file " + bootloaderInfo.getBinFileName() + " not found.");
                    }
                    this.bootloaderSize = bArr2.length;
                    this.currentSource = bArr2;
                    z13 = true;
                }
                if (this.manifest.getSoftdeviceInfo() != null && (i14 == 0 || (i14 & 1) > 0)) {
                    FileInfo softdeviceInfo = this.manifest.getSoftdeviceInfo();
                    this.softDeviceBytes = (byte[]) map.get(softdeviceInfo.getBinFileName());
                    this.systemInitBytes = (byte[]) map.get(softdeviceInfo.getDatFileName());
                    byte[] bArr3 = this.softDeviceBytes;
                    if (bArr3 == null) {
                        throw new IOException("SoftDevice file " + softdeviceInfo.getBinFileName() + " not found.");
                    }
                    this.softDeviceSize = bArr3.length;
                    this.currentSource = bArr3;
                    z13 = true;
                }
                if (this.manifest.getSoftdeviceBootloaderInfo() == null || (i14 != 0 && ((i14 & 1) <= 0 || (i14 & 2) <= 0))) {
                    z14 = z13;
                } else {
                    if (this.systemInitBytes != null) {
                        throw new IOException("Manifest: The softdevice_bootloader may not be used together with softdevice or bootloader.");
                    }
                    SoftDeviceBootloaderFileInfo softdeviceBootloaderInfo = this.manifest.getSoftdeviceBootloaderInfo();
                    this.softDeviceAndBootloaderBytes = (byte[]) map.get(softdeviceBootloaderInfo.getBinFileName());
                    this.systemInitBytes = (byte[]) map.get(softdeviceBootloaderInfo.getDatFileName());
                    if (this.softDeviceAndBootloaderBytes == null) {
                        throw new IOException("File " + softdeviceBootloaderInfo.getBinFileName() + " not found.");
                    }
                    this.softDeviceSize = softdeviceBootloaderInfo.getSoftdeviceSize();
                    this.bootloaderSize = softdeviceBootloaderInfo.getBootloaderSize();
                    this.currentSource = this.softDeviceAndBootloaderBytes;
                }
                if (!z14) {
                    throw new IOException("Manifest file must specify at least one file.");
                }
            } else {
                if (i14 == 0 || (i14 & 4) > 0) {
                    byte[] bArr4 = (byte[]) map.get(APPLICATION_HEX);
                    this.applicationBytes = bArr4;
                    if (bArr4 == null) {
                        this.applicationBytes = (byte[]) map.get(APPLICATION_BIN);
                    }
                    byte[] bArr5 = this.applicationBytes;
                    if (bArr5 != null) {
                        this.applicationSize = bArr5.length;
                        this.applicationInitBytes = (byte[]) map.get(APPLICATION_INIT);
                        this.currentSource = this.applicationBytes;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (i14 == 0 || (i14 & 2) > 0) {
                    byte[] bArr6 = (byte[]) map.get(BOOTLOADER_HEX);
                    this.bootloaderBytes = bArr6;
                    if (bArr6 == null) {
                        this.bootloaderBytes = (byte[]) map.get(BOOTLOADER_BIN);
                    }
                    byte[] bArr7 = this.bootloaderBytes;
                    if (bArr7 != null) {
                        this.bootloaderSize = bArr7.length;
                        this.systemInitBytes = (byte[]) map.get(SYSTEM_INIT);
                        this.currentSource = this.bootloaderBytes;
                        z4 = true;
                    }
                }
                if (i14 == 0 || (i14 & 1) > 0) {
                    byte[] bArr8 = (byte[]) map.get(SOFTDEVICE_HEX);
                    this.softDeviceBytes = bArr8;
                    if (bArr8 == null) {
                        this.softDeviceBytes = (byte[]) map.get(SOFTDEVICE_BIN);
                    }
                    byte[] bArr9 = this.softDeviceBytes;
                    if (bArr9 != null) {
                        this.softDeviceSize = bArr9.length;
                        this.systemInitBytes = (byte[]) map.get(SYSTEM_INIT);
                        this.currentSource = this.softDeviceBytes;
                    } else {
                        z14 = z4;
                    }
                } else {
                    z14 = z4;
                }
                if (!z14) {
                    throw new IOException("The ZIP file must contain an Application, a Soft Device and/or a Bootloader.");
                }
            }
            mark(0);
            this.type = getContentType();
            zipInputStream.close();
        } catch (Throwable th3) {
            this.type = getContentType();
            this.zipInputStream.close();
            throw th3;
        }
    }

    private void parseZip(int i13) throws IOException {
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        String str = null;
        while (true) {
            ZipEntry nextEntry = this.zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String strValidateFilename = validateFilename(nextEntry.getName(), ".");
            if (nextEntry.isDirectory()) {
                Log.w(TAG, "A directory found in the ZIP: " + strValidateFilename + "!");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i14 = this.zipInputStream.read(bArr);
                    if (i14 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i14);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (strValidateFilename.toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(byteArray, i13);
                    byteArray = new byte[hexInputStream.available()];
                    hexInputStream.read(byteArray);
                    hexInputStream.close();
                }
                if (MANIFEST.equals(strValidateFilename)) {
                    str = new String(byteArray, StandardCharsets.UTF_8);
                } else {
                    this.entries.put(strValidateFilename, byteArray);
                }
            }
        }
        if (this.entries.isEmpty()) {
            throw new FileNotFoundException("No files found in the ZIP. Check if the URI provided is valid and the ZIP contains required files on root level, not in a directory.");
        }
        if (str == null) {
            Log.w(TAG, "Manifest not found in the ZIP. It is recommended to use a distribution file created with: https://github.com/NordicSemiconductor/pc-nrfutil/ (for Legacy DFU use version 0.5.x)");
            return;
        }
        Manifest manifest = ((ManifestFile) new Gson().fromJson(str, ManifestFile.class)).getManifest();
        this.manifest = manifest;
        if (manifest == null) {
            Log.w(TAG, "Manifest failed to be parsed. Did you add \n-keep class no.nordicsemi.android.dfu.** { *; }\nto your proguard rules?");
        }
    }

    private int rawRead(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = this.currentSource;
        if (bArr2 == null || i13 < 0 || i14 < 0) {
            return -1;
        }
        int iMin = Math.min(i14, bArr2.length - this.bytesReadFromCurrentSource);
        System.arraycopy(this.currentSource, this.bytesReadFromCurrentSource, bArr, i13, iMin);
        this.bytesReadFromCurrentSource += iMin;
        this.bytesRead += iMin;
        this.crc32.update(bArr, i13, iMin);
        return iMin;
    }

    private byte[] startNextFile() {
        byte[] bArr;
        byte[] bArr2 = this.currentSource;
        if (bArr2 != this.softDeviceBytes || (bArr = this.bootloaderBytes) == null || (this.type & 2) <= 0) {
            bArr = this.applicationBytes;
            if (bArr2 == bArr || bArr == null || (this.type & 4) <= 0) {
                bArr = null;
                this.currentSource = null;
            } else {
                this.currentSource = bArr;
            }
        } else {
            this.currentSource = bArr;
        }
        this.bytesReadFromCurrentSource = 0;
        return bArr;
    }

    private String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath.substring(1);
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }

    public int applicationImageSize() {
        if ((this.type & 4) > 0) {
            return this.applicationSize;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        byte[] bArr = this.softDeviceAndBootloaderBytes;
        if (bArr != null && this.softDeviceSize == 0 && this.bootloaderSize == 0 && (this.type & 3) > 0) {
            return (applicationImageSize() + bArr.length) - this.bytesRead;
        }
        return (applicationImageSize() + (bootloaderImageSize() + softDeviceImageSize())) - this.bytesRead;
    }

    public int bootloaderImageSize() {
        if ((this.type & 2) > 0) {
            return this.bootloaderSize;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.softDeviceBytes = null;
        this.bootloaderBytes = null;
        this.applicationBytes = null;
        this.softDeviceAndBootloaderBytes = null;
        this.applicationSize = 0;
        this.bootloaderSize = 0;
        this.softDeviceSize = 0;
        this.currentSource = null;
        this.bytesReadFromCurrentSource = 0;
        this.bytesRead = 0;
        this.zipInputStream.close();
    }

    public void fullReset() {
        byte[] bArr;
        byte[] bArr2 = this.softDeviceBytes;
        if (bArr2 != null && (bArr = this.bootloaderBytes) != null && this.currentSource == bArr) {
            this.currentSource = bArr2;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
    }

    public byte[] getApplicationInit() {
        return this.applicationInitBytes;
    }

    public int getBytesRead() {
        return this.bytesRead;
    }

    public int getContentType() {
        this.type = 0;
        if (this.softDeviceAndBootloaderBytes != null) {
            this.type = 3;
        }
        if (this.softDeviceSize > 0) {
            this.type |= 1;
        }
        if (this.bootloaderSize > 0) {
            this.type |= 2;
        }
        if (this.applicationSize > 0) {
            this.type |= 4;
        }
        return this.type;
    }

    public long getCrc32() {
        return this.crc32.getValue();
    }

    public byte[] getSystemInit() {
        return this.systemInitBytes;
    }

    public boolean isSecureDfuRequired() {
        Manifest manifest = this.manifest;
        return manifest != null && manifest.isSecureDfuRequired();
    }

    @Override // java.io.InputStream
    public void mark(int i13) {
        this.markedSource = this.currentSource;
        this.bytesReadFromMarkedSource = this.bytesReadFromCurrentSource;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        int i13;
        byte[] bArr;
        this.currentSource = this.markedSource;
        int i14 = this.bytesReadFromMarkedSource;
        this.bytesReadFromCurrentSource = i14;
        this.bytesRead = i14;
        this.crc32.reset();
        if (this.currentSource == this.bootloaderBytes && (bArr = this.softDeviceBytes) != null) {
            this.crc32.update(bArr);
            this.bytesRead += this.softDeviceSize;
        }
        byte[] bArr2 = this.currentSource;
        if (bArr2 == null || (i13 = this.bytesReadFromCurrentSource) <= 0) {
            return;
        }
        this.crc32.update(bArr2, 0, i13);
    }

    public int setContentType(int i13) {
        byte[] bArr;
        this.type = i13;
        int i14 = i13 & 4;
        if (i14 > 0 && this.applicationBytes == null) {
            this.type = i13 & (-5);
        }
        int i15 = i13 & 3;
        if (i15 == 3) {
            if (this.softDeviceBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
            if (this.bootloaderBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
        } else if (this.softDeviceAndBootloaderBytes != null) {
            this.type &= -4;
        }
        if (i15 > 0 && (bArr = this.softDeviceAndBootloaderBytes) != null) {
            this.currentSource = bArr;
        } else if ((i13 & 1) > 0) {
            this.currentSource = this.softDeviceBytes;
        } else if ((i13 & 2) > 0) {
            this.currentSource = this.bootloaderBytes;
        } else if (i14 > 0) {
            this.currentSource = this.applicationBytes;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
        return this.type;
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        return 0L;
    }

    public int softDeviceImageSize() {
        if ((this.type & 1) > 0) {
            return this.softDeviceSize;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) {
        int iRawRead = rawRead(bArr, i13, i14);
        return (i14 <= iRawRead || startNextFile() == null) ? iRawRead : iRawRead + rawRead(bArr, i13 + iRawRead, i14 - iRawRead);
    }
}
