package androidx.profileinstaller;

import ih0.AbstractC18489d0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
class ProfileTranscoder {
    private static final int FIRST_FLAG = 1;
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    private static final int LAST_FLAG = 4;
    static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    private static int computeMethodFlags(DexProfileData dexProfileData) {
        Iterator<Map.Entry<Integer, Integer>> it = dexProfileData.methods.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static byte[] createCompressibleBody(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int i13 = 0;
        int iUtf8Length = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            iUtf8Length += (dexProfileData.classSetSize * 2) + Encoding.utf8Length(generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr)) + 16 + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iUtf8Length);
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            int length = dexProfileDataArr.length;
            while (i13 < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i13];
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
                i13++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i13 < length2) {
                writeLineData(byteArrayOutputStream, dexProfileDataArr[i13]);
                i13++;
            }
        }
        if (byteArrayOutputStream.size() == iUtf8Length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iUtf8Length);
    }

    private static WritableFileSection createCompressibleClassSection(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        for (int i14 = 0; i14 < dexProfileDataArr.length; i14++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i14];
                Encoding.writeUInt16(byteArrayOutputStream, i14);
                Encoding.writeUInt16(byteArrayOutputStream, dexProfileData.classSetSize);
                i13 = i13 + 4 + (dexProfileData.classSetSize * 2);
                writeClasses(byteArrayOutputStream, dexProfileData);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i13 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.CLASSES, i13, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i13 + ", does not match actual size " + byteArray.length);
    }

    private static WritableFileSection createCompressibleMethodsSection(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        for (int i14 = 0; i14 < dexProfileDataArr.length; i14++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i14];
                int iComputeMethodFlags = computeMethodFlags(dexProfileData);
                byte[] bArrCreateMethodBitmapRegionForS = createMethodBitmapRegionForS(iComputeMethodFlags, dexProfileData);
                byte[] bArrCreateMethodsWithInlineCaches = createMethodsWithInlineCaches(dexProfileData);
                Encoding.writeUInt16(byteArrayOutputStream, i14);
                int length = bArrCreateMethodBitmapRegionForS.length + 2 + bArrCreateMethodsWithInlineCaches.length;
                Encoding.writeUInt32(byteArrayOutputStream, length);
                Encoding.writeUInt16(byteArrayOutputStream, iComputeMethodFlags);
                byteArrayOutputStream.write(bArrCreateMethodBitmapRegionForS);
                byteArrayOutputStream.write(bArrCreateMethodsWithInlineCaches);
                i13 = i13 + 6 + length;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i13 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.METHODS, i13, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i13 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] createMethodBitmapRegionForS(int i13, DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodBitmapForS(byteArrayOutputStream, i13, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static byte[] createMethodsWithInlineCaches(DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodsWithInlineCaches(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static String enforceSeparator(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String extractKey(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static DexProfileData findByDexName(DexProfileData[] dexProfileDataArr, String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        String strExtractKey = extractKey(str);
        for (int i13 = 0; i13 < dexProfileDataArr.length; i13++) {
            if (dexProfileDataArr[i13].dexName.equals(strExtractKey)) {
                return dexProfileDataArr[i13];
            }
        }
        return null;
    }

    private static String generateDexKey(String str, String str2, byte[] bArr) {
        String strDexKeySeparator = ProfileVersion.dexKeySeparator(bArr);
        if (str.length() <= 0) {
            return enforceSeparator(str2, strDexKeySeparator);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return enforceSeparator(str2, strDexKeySeparator);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(ProfileVersion.dexKeySeparator(bArr));
        sbM53374o.append(str2);
        return sbM53374o.toString();
    }

    private static int getMethodBitmapStorageSize(int i13) {
        return roundUpToByte(i13 * 2) / 8;
    }

    private static int getMethodBitmapStorageSizeForS(int i13, int i14) {
        return roundUpToByte(Integer.bitCount(i13 & (-2)) * i14) / 8;
    }

    private static int methodFlagBitmapIndex(int i13, int i14, int i15) {
        if (i13 == 1) {
            throw Encoding.error("HOT methods are not stored in the bitmap");
        }
        if (i13 == 2) {
            return i14;
        }
        if (i13 == 4) {
            return i14 + i15;
        }
        throw Encoding.error(AbstractC2875y.m8295h(i13, "Unexpected flag: "));
    }

    private static int[] readClasses(InputStream inputStream, int i13) throws IOException {
        int[] iArr = new int[i13];
        int uInt16 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            uInt16 += Encoding.readUInt16(inputStream);
            iArr[i14] = uInt16;
        }
        return iArr;
    }

    private static int readFlagsFromBitmap(BitSet bitSet, int i13, int i14) {
        int i15 = bitSet.get(methodFlagBitmapIndex(2, i13, i14)) ? 2 : 0;
        return bitSet.get(methodFlagBitmapIndex(4, i13, i14)) ? i15 | 4 : i15;
    }

    public static byte[] readHeader(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, Encoding.read(inputStream, bArr.length))) {
            return Encoding.read(inputStream, ProfileVersion.V010_P.length);
        }
        throw Encoding.error("Invalid magic");
    }

    private static void readHotMethodRegion(InputStream inputStream, DexProfileData dexProfileData) throws IOException {
        int iAvailable = inputStream.available() - dexProfileData.hotMethodRegionSize;
        int uInt16 = 0;
        while (inputStream.available() > iAvailable) {
            uInt16 += Encoding.readUInt16(inputStream);
            dexProfileData.methods.put(Integer.valueOf(uInt16), 1);
            for (int uInt17 = Encoding.readUInt16(inputStream); uInt17 > 0; uInt17--) {
                skipInlineCache(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    public static DexProfileData[] readMeta(InputStream inputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            if (Arrays.equals(ProfileVersion.V015_S, bArr2)) {
                throw Encoding.error("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return readMetadata001(inputStream, bArr, dexProfileDataArr);
        }
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V002)) {
            return readMetadataV002(inputStream, bArr2, dexProfileDataArr);
        }
        throw Encoding.error("Unsupported meta version");
    }

    public static DexProfileData[] readMetadata001(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            throw Encoding.error("Unsupported meta version");
        }
        int uInt8 = Encoding.readUInt8(inputStream);
        byte[] compressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw Encoding.error("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            DexProfileData[] metadataForNBody = readMetadataForNBody(byteArrayInputStream, uInt8, dexProfileDataArr);
            byteArrayInputStream.close();
            return metadataForNBody;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static DexProfileData[] readMetadataForNBody(InputStream inputStream, int i13, DexProfileData[] dexProfileDataArr) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i13 != dexProfileDataArr.length) {
            throw Encoding.error("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i13];
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int uInt16 = Encoding.readUInt16(inputStream);
            iArr[i14] = Encoding.readUInt16(inputStream);
            strArr[i14] = Encoding.readString(inputStream, uInt16);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            DexProfileData dexProfileData = dexProfileDataArr[i15];
            if (!dexProfileData.dexName.equals(strArr[i15])) {
                throw Encoding.error("Order of dexfiles in metadata did not match baseline");
            }
            int i16 = iArr[i15];
            dexProfileData.classSetSize = i16;
            dexProfileData.classes = readClasses(inputStream, i16);
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] readMetadataV002(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        int uInt16 = Encoding.readUInt16(inputStream);
        byte[] compressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw Encoding.error("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            DexProfileData[] metadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr, uInt16, dexProfileDataArr);
            byteArrayInputStream.close();
            return metadataV002Body;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static DexProfileData[] readMetadataV002Body(InputStream inputStream, byte[] bArr, int i13, DexProfileData[] dexProfileDataArr) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i13 != dexProfileDataArr.length) {
            throw Encoding.error("Mismatched number of dex files found in metadata");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            Encoding.readUInt16(inputStream);
            String string = Encoding.readString(inputStream, Encoding.readUInt16(inputStream));
            long uInt32 = Encoding.readUInt32(inputStream);
            int uInt16 = Encoding.readUInt16(inputStream);
            DexProfileData dexProfileDataFindByDexName = findByDexName(dexProfileDataArr, string);
            if (dexProfileDataFindByDexName == null) {
                throw Encoding.error(AbstractC11266d.m30461o("Missing profile key: ", string));
            }
            dexProfileDataFindByDexName.mTypeIdCount = uInt32;
            int[] classes = readClasses(inputStream, uInt16);
            if (Arrays.equals(bArr, ProfileVersion.V001_N)) {
                dexProfileDataFindByDexName.classSetSize = uInt16;
                dexProfileDataFindByDexName.classes = classes;
            }
        }
        return dexProfileDataArr;
    }

    private static void readMethodBitmap(InputStream inputStream, DexProfileData dexProfileData) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(Encoding.read(inputStream, Encoding.bitsToBytes(dexProfileData.numMethodIds * 2)));
        int i13 = 0;
        while (true) {
            int i14 = dexProfileData.numMethodIds;
            if (i13 >= i14) {
                return;
            }
            int flagsFromBitmap = readFlagsFromBitmap(bitSetValueOf, i13, i14);
            if (flagsFromBitmap != 0) {
                Integer num = dexProfileData.methods.get(Integer.valueOf(i13));
                if (num == null) {
                    num = 0;
                }
                dexProfileData.methods.put(Integer.valueOf(i13), Integer.valueOf(flagsFromBitmap | num.intValue()));
            }
            i13++;
        }
    }

    public static DexProfileData[] readProfile(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.V010_P)) {
            throw Encoding.error("Unsupported version");
        }
        int uInt8 = Encoding.readUInt8(inputStream);
        byte[] compressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
        if (inputStream.read() > 0) {
            throw Encoding.error("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            DexProfileData[] uncompressedBody = readUncompressedBody(byteArrayInputStream, str, uInt8);
            byteArrayInputStream.close();
            return uncompressedBody;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static DexProfileData[] readUncompressedBody(InputStream inputStream, String str, int i13) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int uInt16 = Encoding.readUInt16(inputStream);
            int uInt17 = Encoding.readUInt16(inputStream);
            dexProfileDataArr[i14] = new DexProfileData(str, Encoding.readString(inputStream, uInt16), Encoding.readUInt32(inputStream), 0L, uInt17, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream), new int[uInt17], new TreeMap());
        }
        for (int i15 = 0; i15 < i13; i15++) {
            DexProfileData dexProfileData = dexProfileDataArr[i15];
            readHotMethodRegion(inputStream, dexProfileData);
            dexProfileData.classes = readClasses(inputStream, dexProfileData.classSetSize);
            readMethodBitmap(inputStream, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static int roundUpToByte(int i13) {
        return (i13 + 7) & (-8);
    }

    private static void setMethodBitmapBit(byte[] bArr, int i13, int i14, DexProfileData dexProfileData) {
        int iMethodFlagBitmapIndex = methodFlagBitmapIndex(i13, i14, dexProfileData.numMethodIds);
        int i15 = iMethodFlagBitmapIndex / 8;
        bArr[i15] = (byte) ((1 << (iMethodFlagBitmapIndex % 8)) | bArr[i15]);
    }

    private static void skipInlineCache(InputStream inputStream) throws IOException {
        Encoding.readUInt16(inputStream);
        int uInt8 = Encoding.readUInt8(inputStream);
        if (uInt8 == 6 || uInt8 == 7) {
            return;
        }
        while (uInt8 > 0) {
            Encoding.readUInt8(inputStream);
            for (int uInt9 = Encoding.readUInt8(inputStream); uInt9 > 0; uInt9--) {
                Encoding.readUInt16(inputStream);
            }
            uInt8--;
        }
    }

    public static boolean transcodeAndWriteBody(OutputStream outputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.V015_S)) {
            writeProfileForS(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            writeProfileForP(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V005_O)) {
            writeProfileForO(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            writeProfileForO_MR1(outputStream, dexProfileDataArr);
            return true;
        }
        if (!Arrays.equals(bArr, ProfileVersion.V001_N)) {
            return false;
        }
        writeProfileForN(outputStream, dexProfileDataArr);
        return true;
    }

    private static void writeClasses(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        int[] iArr = dexProfileData.classes;
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr[i13];
            Encoding.writeUInt16(outputStream, i15 - i14);
            i13++;
            i14 = i15;
        }
    }

    private static WritableFileSection writeDexFileSection(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Encoding.writeUInt16(byteArrayOutputStream, dexProfileDataArr.length);
            int i13 = 2;
            for (DexProfileData dexProfileData : dexProfileDataArr) {
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.dexChecksum);
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.mTypeIdCount);
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.numMethodIds);
                String strGenerateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V015_S);
                int iUtf8Length = Encoding.utf8Length(strGenerateDexKey);
                Encoding.writeUInt16(byteArrayOutputStream, iUtf8Length);
                i13 = i13 + 14 + iUtf8Length;
                Encoding.writeString(byteArrayOutputStream, strGenerateDexKey);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i13 == byteArray.length) {
                WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, i13, byteArray, false);
                byteArrayOutputStream.close();
                return writableFileSection;
            }
            throw Encoding.error("Expected size " + i13 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void writeHeader(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    private static void writeLineData(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        writeMethodsWithInlineCaches(outputStream, dexProfileData);
        writeClasses(outputStream, dexProfileData);
        writeMethodBitmap(outputStream, dexProfileData);
    }

    private static void writeLineHeader(OutputStream outputStream, DexProfileData dexProfileData, String str) throws IOException {
        Encoding.writeUInt16(outputStream, Encoding.utf8Length(str));
        Encoding.writeUInt16(outputStream, dexProfileData.classSetSize);
        Encoding.writeUInt32(outputStream, dexProfileData.hotMethodRegionSize);
        Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
        Encoding.writeUInt32(outputStream, dexProfileData.numMethodIds);
        Encoding.writeString(outputStream, str);
    }

    private static void writeMethodBitmap(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexProfileData.numMethodIds)];
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, iIntValue, dexProfileData);
            }
            if ((iIntValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, iIntValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodBitmapForS(OutputStream outputStream, int i13, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSizeForS(i13, dexProfileData.numMethodIds)];
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i14 = 0;
            for (int i15 = 1; i15 <= 4; i15 <<= 1) {
                if (i15 != 1 && (i15 & i13) != 0) {
                    if ((i15 & iIntValue2) == i15) {
                        int i16 = (dexProfileData.numMethodIds * i14) + iIntValue;
                        int i17 = i16 / 8;
                        bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
                    }
                    i14++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        int i13 = 0;
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                Encoding.writeUInt16(outputStream, iIntValue - i13);
                Encoding.writeUInt16(outputStream, 0);
                i13 = iIntValue;
            }
        }
    }

    private static void writeProfileForN(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt16(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String strGenerateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V001_N);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(strGenerateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.methods.size());
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, strGenerateDexKey);
            Iterator<Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                Encoding.writeUInt16(outputStream, it.next().intValue());
            }
            for (int i13 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i13);
            }
        }
    }

    private static void writeProfileForO(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            int size = dexProfileData.methods.size() * 4;
            String strGenerateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V005_O);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(strGenerateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, size);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, strGenerateDexKey);
            Iterator<Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                Encoding.writeUInt16(outputStream, it.next().intValue());
                Encoding.writeUInt16(outputStream, 0);
            }
            for (int i13 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i13);
            }
        }
    }

    private static void writeProfileForO_MR1(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArrCreateCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V009_O_MR1);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, bArrCreateCompressibleBody);
    }

    private static void writeProfileForP(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArrCreateCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V010_P);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, bArrCreateCompressibleBody);
    }

    private static void writeProfileForS(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        writeProfileSections(outputStream, dexProfileDataArr);
    }

    private static void writeProfileSections(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(writeDexFileSection(dexProfileDataArr));
        arrayList.add(createCompressibleClassSection(dexProfileDataArr));
        arrayList.add(createCompressibleMethodsSection(dexProfileDataArr));
        long length2 = ((long) ProfileVersion.V015_S.length) + ((long) MAGIC_PROF.length) + 4 + ((long) (arrayList.size() * 16));
        Encoding.writeUInt32(outputStream, arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            WritableFileSection writableFileSection = (WritableFileSection) arrayList.get(i13);
            Encoding.writeUInt32(outputStream, writableFileSection.mType.getValue());
            Encoding.writeUInt32(outputStream, length2);
            if (writableFileSection.mNeedsCompression) {
                byte[] bArr = writableFileSection.mContents;
                long length3 = bArr.length;
                byte[] bArrCompress = Encoding.compress(bArr);
                arrayList2.add(bArrCompress);
                Encoding.writeUInt32(outputStream, bArrCompress.length);
                Encoding.writeUInt32(outputStream, length3);
                length = bArrCompress.length;
            } else {
                arrayList2.add(writableFileSection.mContents);
                Encoding.writeUInt32(outputStream, writableFileSection.mContents.length);
                Encoding.writeUInt32(outputStream, 0L);
                length = writableFileSection.mContents.length;
            }
            length2 += (long) length;
        }
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            outputStream.write((byte[]) arrayList2.get(i14));
        }
    }
}
