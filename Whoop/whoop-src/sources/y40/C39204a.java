package y40;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import va3.AbstractC35854l;
import vv1.C36532c;
import wb3.AbstractC37056f;
import xo1.C38492a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: y40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39204a implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Context f168488w;

    /* JADX INFO: renamed from: x */
    public final C23470p f168489x;

    /* JADX INFO: renamed from: y */
    public final C23470p f168490y;

    public C39204a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f168488w = context;
        this.f168489x = AbstractC30060g.m92088H(new C36532c(this, 24));
        this.f168490y = AbstractC30060g.m92088H(new C38492a(this));
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m124887a(String str, String str2) {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                AbstractC22676k.m65747g(strNextElement);
                if (AbstractC39421y.m125930O(strNextElement, "com.google.android.", false) || AbstractC39421y.m125930O(strNextElement, "android.", false)) {
                    Charset charsetForName = Charset.forName("UTF-8");
                    AbstractC22676k.m65749i(charsetForName, "forName(...)");
                    byte[] bytes = strNextElement.getBytes(charsetForName);
                    AbstractC22676k.m65749i(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                } else {
                    AbstractC22676k.m65747g(str);
                    if (AbstractC39421y.m125930O(strNextElement, str, false)) {
                        Charset charsetForName2 = Charset.forName("UTF-8");
                        AbstractC22676k.m65749i(charsetForName2, "forName(...)");
                        byte[] bytes2 = strNextElement.getBytes(charsetForName2);
                        AbstractC22676k.m65749i(bytes2, "getBytes(...)");
                        messageDigest2.update(bytes2);
                    } else {
                        Charset charsetForName3 = Charset.forName("UTF-8");
                        AbstractC22676k.m65749i(charsetForName3, "forName(...)");
                        byte[] bytes3 = strNextElement.getBytes(charsetForName3);
                        AbstractC22676k.m65749i(bytes3, "getBytes(...)");
                        messageDigest3.update(bytes3);
                    }
                }
            }
            dexFile.close();
            arrayList.add("sys_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1))));
            arrayList.add("deps_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest3.digest())}, 1))));
            arrayList.add("app_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest2.digest())}, 1))));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            return arrayList;
        } catch (Throwable th3) {
            dexFile.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m124888b() {
        List listM118958J;
        Collection collectionM74156w1;
        HashMap map = new HashMap();
        Process processStart = null;
        try {
            processStart = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "UTF-8"));
            try {
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        processStart.destroy();
                        return map;
                    }
                    if (AbstractC39421y.m125920E(line, "]", false)) {
                        sb4.replace(0, sb4.length() == 0 ? 0 : sb4.length() - 1, line);
                        String string = sb4.toString();
                        AbstractC22676k.m65749i(string, "toString(...)");
                        Pattern patternCompile = Pattern.compile("]: \\[");
                        AbstractC22676k.m65749i(patternCompile, "compile(...)");
                        AbstractC39414r.m125903v0(0);
                        Matcher matcher = patternCompile.matcher(string);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(string.subSequence(iEnd, string.length()).toString());
                            listM118958J = arrayList;
                        } else {
                            listM118958J = AbstractC37056f.m118958J(string.toString());
                        }
                        if (!listM118958J.isEmpty()) {
                            ListIterator listIterator = listM118958J.listIterator(listM118958J.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    collectionM74156w1 = C25271y.f99162w;
                                    break;
                                }
                                if (((String) listIterator.previous()).length() != 0) {
                                    collectionM74156w1 = AbstractC25265s.m74156w1(listM118958J, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        } else {
                            collectionM74156w1 = C25271y.f99162w;
                            break;
                        }
                        String[] strArr = (String[]) collectionM74156w1.toArray(new String[0]);
                        String strSubstring = strArr[0].substring(1);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        if (AbstractC39421y.m125930O(strSubstring, "ro", false)) {
                            String str = strArr[1];
                            String strSubstring2 = str.substring(0, str.length() - 2);
                            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                            map.put(strSubstring, strSubstring2);
                        }
                    } else {
                        sb4.append(line);
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(bufferedReader, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th5;
        }
    }

    @JavascriptInterface
    public final String getDebugInfo() {
        return (String) this.f168489x.getValue();
    }

    @JavascriptInterface
    public final String getSysDebug() {
        return (String) this.f168490y.getValue();
    }
}
