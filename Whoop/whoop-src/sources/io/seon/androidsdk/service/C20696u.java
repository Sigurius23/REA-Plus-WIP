package io.seon.androidsdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.seon.androidsdk.service.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C20696u extends AbstractC20664g {

    /* JADX INFO: renamed from: A */
    public static final String f77460A;

    /* JADX INFO: renamed from: B */
    public static final String f77461B;

    /* JADX INFO: renamed from: C */
    public static final String f77462C;

    /* JADX INFO: renamed from: D */
    public static final String f77463D;

    /* JADX INFO: renamed from: E */
    public static final String f77464E;

    /* JADX INFO: renamed from: F */
    public static final String f77465F;

    /* JADX INFO: renamed from: G */
    public static final String f77466G;

    /* JADX INFO: renamed from: H */
    public static final String f77467H;

    /* JADX INFO: renamed from: I */
    public static final String f77468I;

    /* JADX INFO: renamed from: J */
    public static final String f77469J;

    /* JADX INFO: renamed from: K */
    public static final String f77470K;

    /* JADX INFO: renamed from: L */
    public static final String f77471L;

    /* JADX INFO: renamed from: M */
    public static final String f77472M;

    /* JADX INFO: renamed from: N */
    public static final String f77473N;

    /* JADX INFO: renamed from: O */
    public static final String f77474O;

    /* JADX INFO: renamed from: P */
    public static final String f77475P;

    /* JADX INFO: renamed from: Q */
    public static final String f77476Q;

    /* JADX INFO: renamed from: R */
    public static final String f77477R;

    /* JADX INFO: renamed from: S */
    public static final String f77478S;

    /* JADX INFO: renamed from: T */
    public static final String f77479T;

    /* JADX INFO: renamed from: i */
    public static final String[] f77480i = {"dm1vc19wYWNrYWdlc19pbnN0YWxsZWQ=", "dm1vc19yZXNvbHZhYmxlX2FpZGxfYWN0aW9ucw==", "dm1vc19wcm9wc19oaXRz", "dm1vc19wcm9wc19zb3VyY2U=", "dm1vc19wYXRoc19oaXRz", "dm1vc19ydW5uaW5nX3NlcnZpY2Vz", "dm1vc19jb250ZW50X3Byb3ZpZGVycw==", "dm1vc19ob3N0X2FpZGxfaW50ZWdyYXRpb24=", "dm1vc19hcG1fcGF0Y2hfY29uZmlnX3BheWxvYWQ=", "dm1vc192Y2xvdWRfYnVpbGRfZGV0ZWN0ZWQ=", "dm1vc19idWlsZF9wcm9wX2xlYWthZ2U=", "dm1vc19mcmFtZXdvcmtfY2xhc3Nlc19kZXRlY3RlZA==", "dm1vc19ydGNnZXN0dXJlX3N5c3RlbV9hcHA=", "cmVkcm9pZF9wcm9wX2hpdHM="};

    /* JADX INFO: renamed from: j */
    public static String[] f77481j;

    /* JADX INFO: renamed from: k */
    public static final String f77482k;

    /* JADX INFO: renamed from: l */
    public static final String f77483l;

    /* JADX INFO: renamed from: m */
    public static final String f77484m;

    /* JADX INFO: renamed from: n */
    public static final String f77485n;

    /* JADX INFO: renamed from: o */
    public static final String f77486o;

    /* JADX INFO: renamed from: p */
    public static final String f77487p;

    /* JADX INFO: renamed from: q */
    public static final String[] f77488q;

    /* JADX INFO: renamed from: r */
    public static final String[] f77489r;

    /* JADX INFO: renamed from: s */
    public static final String[] f77490s;

    /* JADX INFO: renamed from: t */
    public static final String[] f77491t;

    /* JADX INFO: renamed from: u */
    public static final String[] f77492u;

    /* JADX INFO: renamed from: v */
    public static final String[] f77493v;

    /* JADX INFO: renamed from: w */
    public static final String[] f77494w;

    /* JADX INFO: renamed from: x */
    public static final String[] f77495x;

    /* JADX INFO: renamed from: y */
    public static final String[] f77496y;

    /* JADX INFO: renamed from: z */
    public static final String f77497z;

    /* JADX INFO: renamed from: e */
    public Context f77498e;

    /* JADX INFO: renamed from: f */
    public Integer f77499f;

    /* JADX INFO: renamed from: g */
    public LinkedHashMap f77500g;

    /* JADX INFO: renamed from: h */
    public Method f77501h;

    static {
        String strM56886f = m56886f("Y29tLmNsb3VkLnJ0Y2dlc3R1cmU=");
        f77482k = strM56886f;
        String strM56886f2 = m56886f("Y29tLmNsb3VkLnBob25l");
        String strM56886f3 = m56886f("Y29tLnZtb3MucHJv");
        String strM56886f4 = m56886f("Y29tLnZtb3MubGl0ZQ==");
        String strM56886f5 = m56886f("Y29tLnZtb3MuYXBw");
        f77483l = m56886f("YWlkbC5jbG91ZC5hcGkuQ29udHJvbFNlcnZlcg==");
        f77484m = m56886f("YWlkbC5jbG91ZC5hcGkuUm9vdFNlcnZlcg==");
        f77485n = m56886f("YWlkbC5jbG91ZC5hcGkuQXBrRG93bmxvYWRlclNlcnZlcg==");
        f77486o = m56886f("YWlkbC5jbG91ZC5hcGkuU2ltdWxhdG9yU2VydmVy");
        f77487p = m56886f("YWlkbC5jbG91ZC5hcGkuU3RhcnREb3dubG9hZEZpbGVTZXJ2ZXI=");
        String strM56886f6 = m56886f("Y29tLmNsb3VkLmNvbnRyb2w=");
        String strM56886f7 = m56886f("Y29tLmFuZHJvaWQubXhMYXVuY2hlcjM=");
        String strM56886f8 = m56886f("Y29tLmFuZHJvaWQuZXhwYW5zaW9udG9vbHM=");
        String strM56886f9 = m56886f("Y29tLm93bHByb3h5Lm92ZXJzZWFz");
        String strM56886f10 = m56886f("Y29tLmFuZHJvaWQueXpicm93c2Vy");
        String strM56886f11 = m56886f("Y29tLmFuZHJvaWQucGlmaXg=");
        f77488q = m56887g(new String[]{"cm8uc3lzLmNsb3VkLmFuZHJvaWRfaWQ=", "cm8uc3lzLmNsb3VkLmRldmljZS50eXBl", "cm8uc3lzLmNsb3VkLnZlcnNpb24=", "aW5pdC5zdmMuY2xvdWRzZXJ2aWNl", "aW5pdC5zdmMuZGVidWdfcGlkLmNsb3Vkc2VydmljZQ==", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLndpZHRo", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLmhlaWdodA==", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLmRlbnNpdHk=", "cGVyc2lzdC5zeXMuY2xvdWQuYmx1ZXRvb3RoLm1hYw==", "cGVyc2lzdC5zeXMuY2xvdWQuYnVpbGQuZmluZ2VycHJpbnQ=", "cGVyc2lzdC5zeXMuY2xvdWQuY29udGFjdHM=", "cGVyc2lzdC5zeXMuY2xvdWQuZHJtLmlk", "cGVyc2lzdC5zeXMuY2xvdWQuZHJtLnB1aWQ=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3ZlbmRvcg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3JlbmRlcmVy", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3ZlcnNpb24=", "cGVyc2lzdC5zeXMuY2xvdWQubW9iaWxlaW5mbw==", "cGVyc2lzdC5zeXMuY2xvdWQuY2VsbGluZm8=", "cGVyc2lzdC5zeXMuY2xvdWQuYmF0dGVyeS5jYXBhY2l0eQ==", "cGVyc2lzdC5zeXMuY2xvdWQuYmF0dGVyeS5sZXZlbA==", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5zc2lk", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5tYWM=", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5pcA==", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5nYXRld2F5", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5kbnMx", "cGVyc2lzdC5zeXMuY2xvdWQucG0uaW5zdGFsbF9zb3VyY2U=", "cGVyc2lzdC5zeXMuY2xvdWQuc2Vuc29yLnRwbF9kcA==", "cGVyc2lzdC5zeXMuY2xvdWQuYm9vdHRpbWUub2Zmc2V0", "cm8uYm9vdC5yZWRyb2lkX25ldF9uZG5z", "cm8uYm9vdC5yZWRyb2lkX25ldF9kbnMx", "cm8uYm9vdC5yZWRyb2lkX25ldF9kbnMy", "cm8uc3lzLmNsb3VkLmJvb3RfaWQ=", "cm8uc3lzLmNsb3VkLmN1c3RvbV9mZWF0dXJl", "cm8uYm9vdC5jbG91ZC5hcHBfY2hhbm5lbA==", "cm8uYnVpbGQuY2xvdWQudW5pcXVlX2lk", "cm8uYnVpbGQuY2xvdWQuaW1naW5mbw==", "cGVyc2lzdC5zeXMuY2xvdWQubWFkYl9lbmFibGU=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3Nmc3U=", "cGVyc2lzdC5zeXMuY2xvdWQuZ21zc3U=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzdQ==", "cGVyc2lzdC5zeXMuY2xvdWQucGdzdQ==", "cGVyc2lzdHMuc3lzLmNsb3VkLndoaXRlX2xpc3RfZW5hYmxl", "cm8uYm9vdC5hcm1jbG91ZF9zZXJ2ZXJfYWRkcg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmxhdA==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmxvbg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLnNwZWVk", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmFsdGl0dWRl", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmJlYXJpbmc=", "aW5pdC5zdmMueHVfZGFlbW9u", "aW5pdC5zdmMubWFkYmQ="});
        f77489r = m56887g(new String[]{"L3N5c3RlbS9iaW4vYXBtdA==", "L3N5c3RlbS94YmluL2FwbXQ=", "L3ZlbmRvci9iaW4vYXBtdA==", "L3Byb2R1Y3QvYmluL2FwbXQ=", "L3Byb2R1Y3QvZnJhbWV3b3JrL2FwbS5qYXI=", "L2RhdGEvZGF0YS9jb20uY2xvdWQucnRjZ2VzdHVyZQ==", "L3N5c3RlbS9saWIvbGliY2xvdWQuc28=", "L3N5c3RlbS9saWI2NC9saWJjbG91ZC5zbw==", "L3N5c3RlbS9mcmFtZXdvcmsvY2xvdWQtc2VydmljZXMuamFy", "L3N5c3RlbS9hcHAvQ2xvdWRTZXJ2aWNl", "L3N5c3RlbS9wcml2LWFwcC9Ub29sc19jdXN0b20=", "L3N5c3RlbS9wcml2LWFwcC9EZXZpY2VBZG1pbg==", "L2RhdGEvbG9jYWwvdG1wLy52bW9z", "L3N5c3RlbS9iaW4vY2xvdWRzZXJ2aWNl", "L3N5c3RlbS9iaW4vY2xlYW5fZXh0ZXJuYWxfZGF0YS5zaA==", "L2RhdGEvZXRjL3BsZ2NvbmZpZy5qc29u", "L3N5c3RlbS9iaW4vdnU=", "L3N5c3RlbS9ldGMvaW5pdC9pbml0LmNsb3Vkc2VydmljZS5yYw==", "L2RhdGEvZXRjL2FwcGNoYW5uZWw=", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvcHJlX2luc3RhbGwuYXBwc2ZseWVy", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvYXJpc2VDaGFubmVsLnR4dA==", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvbGF6YWRhQ2hhbm5lbC50eHQ=", "Ly5kb2NrZXJlbnY=", "L3J1bi8uY29udGFpbmVyZW52", "L3N5c3RlbS9iaW4vZ2VuZXJhbGFwcF9pbnN0YWxs", "L2Rldi9wb3dlcl9zdXBwbHk=", "L2Rldi9wb3dlcl9zdXBwbHkvYmF0dGVyeQ==", "L2Rldi9wb3dlcl9zdXBwbHkvYmF0dGVyeS9jYXBhY2l0eQ==", "L2Rldi9wb3dlcl9zdXBwbHkvY3B1aW5mb19tYXhfZnJlcQ==", "L2Rldi9wb3dlcl9zdXBwbHkvY3B1aW5mb19taW5fZnJlcQ=="});
        m56887g(new String[]{"Y2xvdWQuYXBp", "cnRjZ2VzdHVyZQ==", "Y29tLmNsb3Vk", "dm1vcw==", "eHVfZGFlbW9u", "bWFkYmQ=", "YXJtY2xvdWQ=", "Y2xvdWRzZXJ2aWNl", "UnRjU2VydmVy", "R2FtZVNlcnZlcnM=", "QXBrRG93bmxvYWRlclNlcnZlcg==", "U2ltdWxhdG9yU2VydmVy", "U3RhcnREb3dubG9hZEZpbGVTZXJ2ZXI=", "VFByb3h5U2VydmljZQ==", "c2FnZXJuZXQ=", "bmVrb2hhc2VrYWk=", "UHVibGljUHVzaFJ0Y1NlcnZlcg==", "Q29udGFjdFNlcnZpY2U=", "TXVsdGlSdGNVdGlscw==", "TXVsdGlQdWJsaWNQdXNoUnRjVXRpbHM=", "bW9lLm1hdHN1cmk=", "bmI0YQ=="});
        f77490s = m56887g(new String[]{"cm8ucHJvZHVjdC5zeXN0ZW0uZGV2aWNl", "cm8ucHJvZHVjdC5zeXN0ZW0ubW9kZWw=", "cm8ucHJvZHVjdC5zeXN0ZW0ubmFtZQ==", "cm8ucHJvZHVjdC52ZW5kb3IuZGV2aWNl", "cm8ucHJvZHVjdC52ZW5kb3IubW9kZWw=", "cm8ucHJvZHVjdC5ib2FyZA==", "cm8uYnVpbGQuZmxhdm9y", "cm8uYnVpbGQucHJvZHVjdA=="});
        f77491t = m56887g(new String[]{"Y29tLmNsb3VkLnJ0Y2dlc3R1cmUucHJvdmlkZXI=", "Y29tLnZtb3MucHJvdmlkZXI="});
        f77492u = m56887g(new String[]{"YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xTZXJ2ZXI=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RTZXJ2ZXI=", "YWlkbC5jbG91ZC5hcGkuQ29udHJvbFNlcnZlcg==", "YWlkbC5jbG91ZC5hcGkuUm9vdFNlcnZlcg==", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmljZQ==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLmRvd25sb2FkZXIuQXBrRG93bmxvYWRlclNlcnZlcg==", "LnNlcnZlci5SdGNTZXJ2ZXI=", "LnNlcnZlci5HYW1lU2VydmVycw==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlNpbXVsYXRvclNlcnZlcg==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlN0YXJ0RG93bmxvYWRGaWxlU2VydmVy", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLkdhbWVTZXJ2ZXI=", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQuYmcuVnBuU2VydmljZQ==", "aGV2LnNvY2tzdHVuLlRQcm94eVNlcnZpY2U=", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLlB1YmxpY1B1c2hSdGNTZXJ2ZXI=", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLkNvbnRhY3RTZXJ2aWNl", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQucDAzNWJnLlByb3h5U2VydmljZQ==", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQucDAzNWJnLlZwblNlcnZpY2U=", "bW9lLm1hdHN1cmkubmI0YS5wcm94eQ=="});
        f77493v = new String[]{strM56886f, strM56886f2, strM56886f3, strM56886f4, strM56886f5, strM56886f7, strM56886f8, strM56886f9, strM56886f10, strM56886f11, strM56886f6};
        f77494w = m56887g(new String[]{"Y29tLmFuZHJvaWQuY29tbWFuZHMuYXBtLkFwbQ==", "Y29tLmNsb3VkLnNlcnZlci5DbG91ZFNlcnZpY2U=", "Y29tLmNsb3VkLnNlcnZlci5DbG91ZE1hbmFnZXI=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xJbnRlcmZhY2U=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RJbnRlcmZhY2U=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xJbnRlcmZhY2UkU3R1Yg==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RJbnRlcmZhY2UkU3R1Yg=="});
        f77495x = m56887g(new String[]{"L3N5c3RlbS9idWlsZC5wcm9w", "L3ZlbmRvci9idWlsZC5wcm9w", "L3Byb2R1Y3QvYnVpbGQucHJvcA=="});
        f77496y = m56887g(new String[]{"dmNsb3Vk", "YXJtY2xvdWQ=", "Y2xvdWRzZXJ2aWNl", "Z2l0bGFiLXJ1bm5lcg==", "bWluaWNhbC92Y2xvdWQ=", "Y2xvdWQucGhvbmU=", "cnRjZ2VzdHVyZQ==", "bW9lLm1hdHN1cmk=", "cmVkcm9pZA==", "bGlibmRrX3RyYW5zbGF0aW9u", "bmF0aXZlLmJyaWRnZQ=="});
        f77497z = m56886f("dmNsb3Vk");
        f77460A = m56886f("cmVkcm9pZA==");
        f77461B = m56886f("YWlkbA==");
        f77462C = m56886f("Y2xvdWQ=");
        f77463D = m56886f("Y29udHJvbA==");
        f77464E = m56886f("cm9vdA==");
        f77465F = m56886f("cm8uYm9vdC5yZWRyb2lkXw==");
        f77466G = m56886f("cm8uYnVpbGQuY2xvdWQu");
        f77467H = m56886f("YW5kcm9pZC5vcy5TeXN0ZW1Qcm9wZXJ0aWVz");
        f77468I = m56886f("aXNfc3lzdGVt");
        f77469J = m56886f("dWlk");
        f77470K = m56886f("aGFyZHdhcmVfbWF0Y2g=");
        f77471L = m56886f("Ym9hcmRfbWF0Y2g=");
        f77472M = m56886f("cm8uYm9vdC5yZWRyb2lkX2NvdW50");
        f77473N = m56886f("cm8uYm9vdC5yZWRyb2lkX2tleXM=");
        f77474O = m56886f("cm8uYnVpbGQuY2xvdWRfY291bnQ=");
        f77475P = m56886f("cm8uYnVpbGQuY2xvdWRfa2V5cw==");
        f77476Q = m56886f("L2RhdGEvZXRjL3BsZ2NvbmZpZy5qc29u");
        f77477R = m56886f("L3N5c3RlbS9iaW4vZ2V0cHJvcA==");
        f77478S = m56886f("Z2V0");
        f77479T = m56886f("YXBtX2NvbmZfcmVhZF9lcnI=");
    }

    /* JADX INFO: renamed from: f */
    public static String m56886f(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            return bArrDecode == null ? str : new String(bArrDecode, StandardCharsets.UTF_8);
        } catch (Throwable unused) {
            AbstractC20684o.m56853f("d_err", null);
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String[] m56887g(String[] strArr) {
        try {
            String[] strArr2 = new String[strArr.length];
            for (int i13 = 0; i13 < strArr.length; i13++) {
                strArr2[i13] = m56886f(strArr[i13]);
            }
            return strArr2;
        } catch (Throwable unused) {
            AbstractC20684o.m56853f("da_err", null);
            return new String[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v12, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v16, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v20, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v24, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v28, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v32, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v36, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v40, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v44, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v48, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r0v5, types: [io.seon.androidsdk.service.s] */
    /* JADX WARN: Type inference failed for: r8v1, types: [io.seon.androidsdk.service.s] */
    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        Object objM56880a;
        Object objM56880a2;
        Object objM56880a3;
        Object objM56880a4;
        Object objM56880a5;
        ArrayList arrayList;
        Object objM56880a6;
        Object objM56880a7;
        Object objM56880a8;
        Object objM56880a9;
        Object objM56880a10;
        Object objM56880a11;
        ArrayList arrayList2;
        Object objM56880a12;
        Object objM56880a13;
        this.f77500g = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (f77481j == null) {
            f77481j = m56887g(f77480i);
        }
        final String[] strArr = f77481j;
        final int i13 = 0;
        ?? r10 = new Object() { // from class: io.seon.androidsdk.service.s
            /* JADX INFO: renamed from: a */
            public final Object m56880a() {
                switch (i13) {
                    case 0:
                        return strArr[0];
                    case 1:
                        return strArr[11];
                    case 2:
                        return strArr[12];
                    case 3:
                        return strArr[13];
                    case 4:
                        return strArr[1];
                    case 5:
                        return strArr[6];
                    case 6:
                        return strArr[2];
                    case 7:
                        return strArr[3];
                    case 8:
                        return strArr[4];
                    case 9:
                        return strArr[7];
                    case 10:
                        return strArr[8];
                    case 11:
                        return strArr[9];
                    default:
                        return strArr[10];
                }
            }
        };
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            objM56880a = r10.m56880a();
        } catch (Throwable unused) {
            objM56880a = null;
        }
        final int i14 = 1;
        linkedHashMap.put((String) objM56880a, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i15 = i14;
                int i16 = 0;
                C20696u c20696u = this.f77459b;
                switch (i15) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str2 : C20696u.f77495x) {
                            try {
                                File file = new File(str2);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str3 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str3.toLowerCase()) && !arrayList3.contains(str3)) {
                                                        arrayList3.add(str3);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused2) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str2, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str4, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused4) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused5) {
                            } catch (Throwable unused6) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str4);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i17 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i17 & 1) == 0 && (i17 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused7) {
                            return null;
                        }
                    case 3:
                        String str5 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str6 = Build.HARDWARE;
                            if (str6 != null && str6.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77470K, str6);
                            }
                            String str7 = Build.BOARD;
                            if (str7 != null && str7.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77471L, str7);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str8 = (String) entry.getKey();
                                    if (str8.startsWith(C20696u.f77465F)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str8.startsWith(C20696u.f77466G)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str8, str);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused8) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr2 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i18 = 0; i18 < 5; i18++) {
                                String str9 = strArr2[i18];
                                Boolean bool = Boolean.TRUE;
                                String str10 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str9);
                                    intent.setPackage(str10);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused9) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str9);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused10) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr3 = C20696u.f77488q;
                        for (String str11 : strArr3) {
                            String strM56888h = c20696u.m56888h(str11);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str11, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str12 : strArr3) {
                                if (linkedHashMapM56889i.containsKey(str12)) {
                                    linkedHashMap8.put(str12, (String) linkedHashMapM56889i.get(str12));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str13 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str13, 0) != null) {
                                    arrayList6.add(str13);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused11) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr4 = C20696u.f77493v;
                            int length = strArr4.length;
                            int i19 = 0;
                            while (i19 < length) {
                                String str14 = strArr4[i19];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str14, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i24 = i16;
                                        while (i24 < length2) {
                                            String str15 = serviceInfoArr[i24].name;
                                            if (str15 != null) {
                                                int iIndexOf = str15.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str15.substring(i16, iIndexOf) : str15;
                                                String[] strArr5 = C20696u.f77492u;
                                                int length3 = strArr5.length;
                                                for (int i25 = i16; i25 < length3; i25++) {
                                                    if (str15.contains(strArr5[i25])) {
                                                        linkedHashSet.add(str14 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str15.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str14 + "/" + strSubstring);
                                                }
                                            }
                                            i24++;
                                            i16 = 0;
                                        }
                                    }
                                } catch (Throwable unused12) {
                                }
                                i19++;
                                i16 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused13) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused14) {
                            return null;
                        }
                    default:
                        String str16 = C20696u.f77497z;
                        String[] strArr6 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str17 : strArr6) {
                                String strM56888h2 = c20696u.m56888h(str17);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str16)) {
                                    linkedHashMap9.put(str17, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr6.length;
                                while (i16 < length4) {
                                    String str18 = strArr6[i16];
                                    String str19 = (String) linkedHashMapM56889i2.get(str18);
                                    if (str19 != null && str19.toLowerCase().contains(str16)) {
                                        linkedHashMap9.put(str18, str19);
                                    }
                                    i16++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused15) {
                            return null;
                        }
                }
            }
        }));
        final int i15 = 4;
        try {
            objM56880a2 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i15) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused2) {
            objM56880a2 = null;
        }
        linkedHashMap.put((String) objM56880a2, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i16 = i15;
                int i17 = 0;
                C20696u c20696u = this.f77459b;
                switch (i16) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str2 : C20696u.f77495x) {
                            try {
                                File file = new File(str2);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str3 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str3.toLowerCase()) && !arrayList3.contains(str3)) {
                                                        arrayList3.add(str3);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused3) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str2, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str4, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused5) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused6) {
                            } catch (Throwable unused7) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str4);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i18 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i18 & 1) == 0 && (i18 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused8) {
                            return null;
                        }
                    case 3:
                        String str5 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str6 = Build.HARDWARE;
                            if (str6 != null && str6.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77470K, str6);
                            }
                            String str7 = Build.BOARD;
                            if (str7 != null && str7.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77471L, str7);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str8 = (String) entry.getKey();
                                    if (str8.startsWith(C20696u.f77465F)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str8.startsWith(C20696u.f77466G)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str8, str);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused9) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr2 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i19 = 0; i19 < 5; i19++) {
                                String str9 = strArr2[i19];
                                Boolean bool = Boolean.TRUE;
                                String str10 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str9);
                                    intent.setPackage(str10);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused10) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str9);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused11) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr3 = C20696u.f77488q;
                        for (String str11 : strArr3) {
                            String strM56888h = c20696u.m56888h(str11);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str11, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str12 : strArr3) {
                                if (linkedHashMapM56889i.containsKey(str12)) {
                                    linkedHashMap8.put(str12, (String) linkedHashMapM56889i.get(str12));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str13 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str13, 0) != null) {
                                    arrayList6.add(str13);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused12) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr4 = C20696u.f77493v;
                            int length = strArr4.length;
                            int i110 = 0;
                            while (i110 < length) {
                                String str14 = strArr4[i110];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str14, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i24 = i17;
                                        while (i24 < length2) {
                                            String str15 = serviceInfoArr[i24].name;
                                            if (str15 != null) {
                                                int iIndexOf = str15.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str15.substring(i17, iIndexOf) : str15;
                                                String[] strArr5 = C20696u.f77492u;
                                                int length3 = strArr5.length;
                                                for (int i25 = i17; i25 < length3; i25++) {
                                                    if (str15.contains(strArr5[i25])) {
                                                        linkedHashSet.add(str14 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str15.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str14 + "/" + strSubstring);
                                                }
                                            }
                                            i24++;
                                            i17 = 0;
                                        }
                                    }
                                } catch (Throwable unused13) {
                                }
                                i110++;
                                i17 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused14) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused15) {
                            return null;
                        }
                    default:
                        String str16 = C20696u.f77497z;
                        String[] strArr6 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str17 : strArr6) {
                                String strM56888h2 = c20696u.m56888h(str17);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str16)) {
                                    linkedHashMap9.put(str17, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr6.length;
                                while (i17 < length4) {
                                    String str18 = strArr6[i17];
                                    String str19 = (String) linkedHashMapM56889i2.get(str18);
                                    if (str19 != null && str19.toLowerCase().contains(str16)) {
                                        linkedHashMap9.put(str18, str19);
                                    }
                                    i17++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused16) {
                            return null;
                        }
                }
            }
        }));
        final int i16 = 5;
        Map map = (Map) AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i17 = i16;
                int i18 = 0;
                C20696u c20696u = this.f77459b;
                switch (i17) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str2 : C20696u.f77495x) {
                            try {
                                File file = new File(str2);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str3 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str3.toLowerCase()) && !arrayList3.contains(str3)) {
                                                        arrayList3.add(str3);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused3) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str2, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str4, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused5) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused6) {
                            } catch (Throwable unused7) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str4);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i19 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i19 & 1) == 0 && (i19 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused8) {
                            return null;
                        }
                    case 3:
                        String str5 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str6 = Build.HARDWARE;
                            if (str6 != null && str6.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77470K, str6);
                            }
                            String str7 = Build.BOARD;
                            if (str7 != null && str7.toLowerCase().contains(str5)) {
                                linkedHashMap5.put(C20696u.f77471L, str7);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str8 = (String) entry.getKey();
                                    if (str8.startsWith(C20696u.f77465F)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str8.startsWith(C20696u.f77466G)) {
                                        str = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str8, str);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused9) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr2 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i110 = 0; i110 < 5; i110++) {
                                String str9 = strArr2[i110];
                                Boolean bool = Boolean.TRUE;
                                String str10 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str9);
                                    intent.setPackage(str10);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused10) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str9);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused11) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr3 = C20696u.f77488q;
                        for (String str11 : strArr3) {
                            String strM56888h = c20696u.m56888h(str11);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str11, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str12 : strArr3) {
                                if (linkedHashMapM56889i.containsKey(str12)) {
                                    linkedHashMap8.put(str12, (String) linkedHashMapM56889i.get(str12));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str13 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str13, 0) != null) {
                                    arrayList6.add(str13);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused12) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr4 = C20696u.f77493v;
                            int length = strArr4.length;
                            int i111 = 0;
                            while (i111 < length) {
                                String str14 = strArr4[i111];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str14, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i24 = i18;
                                        while (i24 < length2) {
                                            String str15 = serviceInfoArr[i24].name;
                                            if (str15 != null) {
                                                int iIndexOf = str15.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str15.substring(i18, iIndexOf) : str15;
                                                String[] strArr5 = C20696u.f77492u;
                                                int length3 = strArr5.length;
                                                for (int i25 = i18; i25 < length3; i25++) {
                                                    if (str15.contains(strArr5[i25])) {
                                                        linkedHashSet.add(str14 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str15.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str14 + "/" + strSubstring);
                                                }
                                            }
                                            i24++;
                                            i18 = 0;
                                        }
                                    }
                                } catch (Throwable unused13) {
                                }
                                i111++;
                                i18 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused14) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused15) {
                            return null;
                        }
                    default:
                        String str16 = C20696u.f77497z;
                        String[] strArr6 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str17 : strArr6) {
                                String strM56888h2 = c20696u.m56888h(str17);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str16)) {
                                    linkedHashMap9.put(str17, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr6.length;
                                while (i18 < length4) {
                                    String str18 = strArr6[i18];
                                    String str19 = (String) linkedHashMapM56889i2.get(str18);
                                    if (str19 != null && str19.toLowerCase().contains(str16)) {
                                        linkedHashMap9.put(str18, str19);
                                    }
                                    i18++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused16) {
                            return null;
                        }
                }
            }
        });
        final int i17 = 6;
        try {
            objM56880a3 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i17) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused3) {
            objM56880a3 = null;
        }
        linkedHashMap.put((String) objM56880a3, map);
        final int i18 = 7;
        try {
            objM56880a4 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i18) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused4) {
            objM56880a4 = null;
        }
        linkedHashMap.put((String) objM56880a4, this.f77499f);
        final int i19 = 8;
        try {
            objM56880a5 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i19) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused5) {
            objM56880a5 = null;
        }
        String str = (String) objM56880a5;
        final int i24 = 3;
        try {
            try {
                String[] strArr2 = f77489r;
                arrayList = new ArrayList();
                for (String str2 : strArr2) {
                    if (new File(str2).exists()) {
                        arrayList.add(str2);
                    }
                }
            } catch (Exception e5) {
                AbstractC20664g.f77301d.m11163L(3, e5);
                arrayList = null;
            }
        } catch (Throwable unused6) {
            arrayList = null;
        }
        linkedHashMap.put(str, arrayList);
        try {
            objM56880a6 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i16) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused7) {
            objM56880a6 = null;
        }
        linkedHashMap.put((String) objM56880a6, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str3;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i17;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str4 : C20696u.f77495x) {
                            try {
                                File file = new File(str4);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str5 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str5.toLowerCase()) && !arrayList3.contains(str5)) {
                                                        arrayList3.add(str5);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused8) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str4, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str6 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str6, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused9) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused10) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused11) {
                            } catch (Throwable unused12) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str6);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused13) {
                            return null;
                        }
                    case 3:
                        String str7 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str8 = Build.HARDWARE;
                            if (str8 != null && str8.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77470K, str8);
                            }
                            String str9 = Build.BOARD;
                            if (str9 != null && str9.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77471L, str9);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str10 = (String) entry.getKey();
                                    if (str10.startsWith(C20696u.f77465F)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str10.startsWith(C20696u.f77466G)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str10, str3);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused14) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr3 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str11 = strArr3[i113];
                                Boolean bool = Boolean.TRUE;
                                String str12 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str11);
                                    intent.setPackage(str12);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused15) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str11);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused16) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr4 = C20696u.f77488q;
                        for (String str13 : strArr4) {
                            String strM56888h = c20696u.m56888h(str13);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str13, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str14 : strArr4) {
                                if (linkedHashMapM56889i.containsKey(str14)) {
                                    linkedHashMap8.put(str14, (String) linkedHashMapM56889i.get(str14));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str15 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str15, 0) != null) {
                                    arrayList6.add(str15);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused17) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr5 = C20696u.f77493v;
                            int length = strArr5.length;
                            int i114 = 0;
                            while (i114 < length) {
                                String str16 = strArr5[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str16, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i25 = i111;
                                        while (i25 < length2) {
                                            String str17 = serviceInfoArr[i25].name;
                                            if (str17 != null) {
                                                int iIndexOf = str17.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str17.substring(i111, iIndexOf) : str17;
                                                String[] strArr6 = C20696u.f77492u;
                                                int length3 = strArr6.length;
                                                for (int i26 = i111; i26 < length3; i26++) {
                                                    if (str17.contains(strArr6[i26])) {
                                                        linkedHashSet.add(str16 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str17.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str16 + "/" + strSubstring);
                                                }
                                            }
                                            i25++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused18) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused19) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused110) {
                            return null;
                        }
                    default:
                        String str18 = C20696u.f77497z;
                        String[] strArr7 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str19 : strArr7) {
                                String strM56888h2 = c20696u.m56888h(str19);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str18)) {
                                    linkedHashMap9.put(str19, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr7.length;
                                while (i111 < length4) {
                                    String str110 = strArr7[i111];
                                    String str111 = (String) linkedHashMapM56889i2.get(str110);
                                    if (str111 != null && str111.toLowerCase().contains(str18)) {
                                        linkedHashMap9.put(str110, str111);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused111) {
                            return null;
                        }
                }
            }
        }));
        final int i25 = 9;
        try {
            objM56880a7 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i25) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused8) {
            objM56880a7 = null;
        }
        linkedHashMap.put((String) objM56880a7, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str3;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i18;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str4 : C20696u.f77495x) {
                            try {
                                File file = new File(str4);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str5 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str5.toLowerCase()) && !arrayList3.contains(str5)) {
                                                        arrayList3.add(str5);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused9) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str4, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str6 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str6, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused10) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused11) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused12) {
                            } catch (Throwable unused13) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str6);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused14) {
                            return null;
                        }
                    case 3:
                        String str7 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str8 = Build.HARDWARE;
                            if (str8 != null && str8.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77470K, str8);
                            }
                            String str9 = Build.BOARD;
                            if (str9 != null && str9.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77471L, str9);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str10 = (String) entry.getKey();
                                    if (str10.startsWith(C20696u.f77465F)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str10.startsWith(C20696u.f77466G)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str10, str3);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused15) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr3 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str11 = strArr3[i113];
                                Boolean bool = Boolean.TRUE;
                                String str12 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str11);
                                    intent.setPackage(str12);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused16) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str11);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused17) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr4 = C20696u.f77488q;
                        for (String str13 : strArr4) {
                            String strM56888h = c20696u.m56888h(str13);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str13, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str14 : strArr4) {
                                if (linkedHashMapM56889i.containsKey(str14)) {
                                    linkedHashMap8.put(str14, (String) linkedHashMapM56889i.get(str14));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str15 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str15, 0) != null) {
                                    arrayList6.add(str15);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused18) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr5 = C20696u.f77493v;
                            int length = strArr5.length;
                            int i114 = 0;
                            while (i114 < length) {
                                String str16 = strArr5[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str16, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i26 = i111;
                                        while (i26 < length2) {
                                            String str17 = serviceInfoArr[i26].name;
                                            if (str17 != null) {
                                                int iIndexOf = str17.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str17.substring(i111, iIndexOf) : str17;
                                                String[] strArr6 = C20696u.f77492u;
                                                int length3 = strArr6.length;
                                                for (int i27 = i111; i27 < length3; i27++) {
                                                    if (str17.contains(strArr6[i27])) {
                                                        linkedHashSet.add(str16 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str17.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str16 + "/" + strSubstring);
                                                }
                                            }
                                            i26++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused19) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused110) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused111) {
                            return null;
                        }
                    default:
                        String str18 = C20696u.f77497z;
                        String[] strArr7 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str19 : strArr7) {
                                String strM56888h2 = c20696u.m56888h(str19);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str18)) {
                                    linkedHashMap9.put(str19, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr7.length;
                                while (i111 < length4) {
                                    String str110 = strArr7[i111];
                                    String str111 = (String) linkedHashMapM56889i2.get(str110);
                                    if (str111 != null && str111.toLowerCase().contains(str18)) {
                                        linkedHashMap9.put(str110, str111);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused112) {
                            return null;
                        }
                }
            }
        }));
        final int i26 = 10;
        try {
            objM56880a8 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i26) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused9) {
            objM56880a8 = null;
        }
        linkedHashMap.put((String) objM56880a8, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str3;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i19;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str4 : C20696u.f77495x) {
                            try {
                                File file = new File(str4);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str5 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str5.toLowerCase()) && !arrayList3.contains(str5)) {
                                                        arrayList3.add(str5);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused10) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str4, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str6 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str6, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused11) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused12) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused13) {
                            } catch (Throwable unused14) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str6);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused15) {
                            return null;
                        }
                    case 3:
                        String str7 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str8 = Build.HARDWARE;
                            if (str8 != null && str8.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77470K, str8);
                            }
                            String str9 = Build.BOARD;
                            if (str9 != null && str9.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77471L, str9);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str10 = (String) entry.getKey();
                                    if (str10.startsWith(C20696u.f77465F)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str10.startsWith(C20696u.f77466G)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str10, str3);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused16) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr3 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str11 = strArr3[i113];
                                Boolean bool = Boolean.TRUE;
                                String str12 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str11);
                                    intent.setPackage(str12);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused17) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str11);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused18) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr4 = C20696u.f77488q;
                        for (String str13 : strArr4) {
                            String strM56888h = c20696u.m56888h(str13);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str13, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str14 : strArr4) {
                                if (linkedHashMapM56889i.containsKey(str14)) {
                                    linkedHashMap8.put(str14, (String) linkedHashMapM56889i.get(str14));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str15 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str15, 0) != null) {
                                    arrayList6.add(str15);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused19) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr5 = C20696u.f77493v;
                            int length = strArr5.length;
                            int i114 = 0;
                            while (i114 < length) {
                                String str16 = strArr5[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str16, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i27 = i111;
                                        while (i27 < length2) {
                                            String str17 = serviceInfoArr[i27].name;
                                            if (str17 != null) {
                                                int iIndexOf = str17.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str17.substring(i111, iIndexOf) : str17;
                                                String[] strArr6 = C20696u.f77492u;
                                                int length3 = strArr6.length;
                                                for (int i28 = i111; i28 < length3; i28++) {
                                                    if (str17.contains(strArr6[i28])) {
                                                        linkedHashSet.add(str16 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str17.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str16 + "/" + strSubstring);
                                                }
                                            }
                                            i27++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused110) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused111) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused112) {
                            return null;
                        }
                    default:
                        String str18 = C20696u.f77497z;
                        String[] strArr7 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str19 : strArr7) {
                                String strM56888h2 = c20696u.m56888h(str19);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str18)) {
                                    linkedHashMap9.put(str19, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr7.length;
                                while (i111 < length4) {
                                    String str110 = strArr7[i111];
                                    String str111 = (String) linkedHashMapM56889i2.get(str110);
                                    if (str111 != null && str111.toLowerCase().contains(str18)) {
                                        linkedHashMap9.put(str110, str111);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused113) {
                            return null;
                        }
                }
            }
        }));
        final int i27 = 11;
        try {
            objM56880a9 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i27) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused10) {
            objM56880a9 = null;
        }
        linkedHashMap.put((String) objM56880a9, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str3;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i25;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str4 : C20696u.f77495x) {
                            try {
                                File file = new File(str4);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str5 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str5.toLowerCase()) && !arrayList3.contains(str5)) {
                                                        arrayList3.add(str5);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused11) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str4, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str6 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str6, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused12) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused13) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused14) {
                            } catch (Throwable unused15) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str6);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused16) {
                            return null;
                        }
                    case 3:
                        String str7 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str8 = Build.HARDWARE;
                            if (str8 != null && str8.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77470K, str8);
                            }
                            String str9 = Build.BOARD;
                            if (str9 != null && str9.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77471L, str9);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str10 = (String) entry.getKey();
                                    if (str10.startsWith(C20696u.f77465F)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str10.startsWith(C20696u.f77466G)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str10, str3);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused17) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr3 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str11 = strArr3[i113];
                                Boolean bool = Boolean.TRUE;
                                String str12 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str11);
                                    intent.setPackage(str12);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused18) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str11);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused19) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr4 = C20696u.f77488q;
                        for (String str13 : strArr4) {
                            String strM56888h = c20696u.m56888h(str13);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str13, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str14 : strArr4) {
                                if (linkedHashMapM56889i.containsKey(str14)) {
                                    linkedHashMap8.put(str14, (String) linkedHashMapM56889i.get(str14));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str15 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str15, 0) != null) {
                                    arrayList6.add(str15);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused110) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr5 = C20696u.f77493v;
                            int length = strArr5.length;
                            int i114 = 0;
                            while (i114 < length) {
                                String str16 = strArr5[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str16, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i28 = i111;
                                        while (i28 < length2) {
                                            String str17 = serviceInfoArr[i28].name;
                                            if (str17 != null) {
                                                int iIndexOf = str17.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str17.substring(i111, iIndexOf) : str17;
                                                String[] strArr6 = C20696u.f77492u;
                                                int length3 = strArr6.length;
                                                for (int i29 = i111; i29 < length3; i29++) {
                                                    if (str17.contains(strArr6[i29])) {
                                                        linkedHashSet.add(str16 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str17.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str16 + "/" + strSubstring);
                                                }
                                            }
                                            i28++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused111) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused112) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused113) {
                            return null;
                        }
                    default:
                        String str18 = C20696u.f77497z;
                        String[] strArr7 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str19 : strArr7) {
                                String strM56888h2 = c20696u.m56888h(str19);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str18)) {
                                    linkedHashMap9.put(str19, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr7.length;
                                while (i111 < length4) {
                                    String str110 = strArr7[i111];
                                    String str111 = (String) linkedHashMapM56889i2.get(str110);
                                    if (str111 != null && str111.toLowerCase().contains(str18)) {
                                        linkedHashMap9.put(str110, str111);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused114) {
                            return null;
                        }
                }
            }
        }));
        final int i28 = 12;
        try {
            objM56880a10 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i28) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused11) {
            objM56880a10 = null;
        }
        linkedHashMap.put((String) objM56880a10, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str3;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i13;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str4 : C20696u.f77495x) {
                            try {
                                File file = new File(str4);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str5 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str5.toLowerCase()) && !arrayList3.contains(str5)) {
                                                        arrayList3.add(str5);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused12) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str4, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str6 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str6, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused13) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused14) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused15) {
                            } catch (Throwable unused16) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str6);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused17) {
                            return null;
                        }
                    case 3:
                        String str7 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str8 = Build.HARDWARE;
                            if (str8 != null && str8.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77470K, str8);
                            }
                            String str9 = Build.BOARD;
                            if (str9 != null && str9.toLowerCase().contains(str7)) {
                                linkedHashMap5.put(C20696u.f77471L, str9);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str10 = (String) entry.getKey();
                                    if (str10.startsWith(C20696u.f77465F)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str10.startsWith(C20696u.f77466G)) {
                                        str3 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str10, str3);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused18) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr3 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str11 = strArr3[i113];
                                Boolean bool = Boolean.TRUE;
                                String str12 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str11);
                                    intent.setPackage(str12);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused19) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str11);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused110) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr4 = C20696u.f77488q;
                        for (String str13 : strArr4) {
                            String strM56888h = c20696u.m56888h(str13);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str13, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str14 : strArr4) {
                                if (linkedHashMapM56889i.containsKey(str14)) {
                                    linkedHashMap8.put(str14, (String) linkedHashMapM56889i.get(str14));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str15 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str15, 0) != null) {
                                    arrayList6.add(str15);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused111) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr5 = C20696u.f77493v;
                            int length = strArr5.length;
                            int i114 = 0;
                            while (i114 < length) {
                                String str16 = strArr5[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str16, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length2 = serviceInfoArr.length;
                                        int i29 = i111;
                                        while (i29 < length2) {
                                            String str17 = serviceInfoArr[i29].name;
                                            if (str17 != null) {
                                                int iIndexOf = str17.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str17.substring(i111, iIndexOf) : str17;
                                                String[] strArr6 = C20696u.f77492u;
                                                int length3 = strArr6.length;
                                                for (int i210 = i111; i210 < length3; i210++) {
                                                    if (str17.contains(strArr6[i210])) {
                                                        linkedHashSet.add(str16 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str17.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str16 + "/" + strSubstring);
                                                }
                                            }
                                            i29++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused112) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused113) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused114) {
                            return null;
                        }
                    default:
                        String str18 = C20696u.f77497z;
                        String[] strArr7 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str19 : strArr7) {
                                String strM56888h2 = c20696u.m56888h(str19);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str18)) {
                                    linkedHashMap9.put(str19, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length4 = strArr7.length;
                                while (i111 < length4) {
                                    String str110 = strArr7[i111];
                                    String str111 = (String) linkedHashMapM56889i2.get(str110);
                                    if (str111 != null && str111.toLowerCase().contains(str18)) {
                                        linkedHashMap9.put(str110, str111);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused115) {
                            return null;
                        }
                }
            }
        }));
        final int i29 = 1;
        try {
            objM56880a11 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i29) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused12) {
            objM56880a11 = null;
        }
        String str3 = (String) objM56880a11;
        try {
            arrayList2 = new ArrayList();
            String[] strArr3 = f77494w;
            int length = strArr3.length;
            while (i13 < length) {
                String str4 = strArr3[i13];
                try {
                    Class.forName(str4);
                    arrayList2.add(str4);
                } catch (Throwable unused13) {
                }
                i13++;
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
        } catch (Throwable unused14) {
        }
        linkedHashMap.put(str3, arrayList2);
        final int i34 = 2;
        try {
            objM56880a12 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i34) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused15) {
            objM56880a12 = null;
        }
        linkedHashMap.put((String) objM56880a12, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str5;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i34;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str6 : C20696u.f77495x) {
                            try {
                                File file = new File(str6);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str7 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str7.toLowerCase()) && !arrayList3.contains(str7)) {
                                                        arrayList3.add(str7);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused16) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str6, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str8 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str8, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused17) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused18) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused19) {
                            } catch (Throwable unused110) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str8);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused111) {
                            return null;
                        }
                    case 3:
                        String str9 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str10 = Build.HARDWARE;
                            if (str10 != null && str10.toLowerCase().contains(str9)) {
                                linkedHashMap5.put(C20696u.f77470K, str10);
                            }
                            String str11 = Build.BOARD;
                            if (str11 != null && str11.toLowerCase().contains(str9)) {
                                linkedHashMap5.put(C20696u.f77471L, str11);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str12 = (String) entry.getKey();
                                    if (str12.startsWith(C20696u.f77465F)) {
                                        str5 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str12.startsWith(C20696u.f77466G)) {
                                        str5 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str12, str5);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused112) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr4 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str13 = strArr4[i113];
                                Boolean bool = Boolean.TRUE;
                                String str14 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str13);
                                    intent.setPackage(str14);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused113) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str13);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused114) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr5 = C20696u.f77488q;
                        for (String str15 : strArr5) {
                            String strM56888h = c20696u.m56888h(str15);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str15, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str16 : strArr5) {
                                if (linkedHashMapM56889i.containsKey(str16)) {
                                    linkedHashMap8.put(str16, (String) linkedHashMapM56889i.get(str16));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str17 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str17, 0) != null) {
                                    arrayList6.add(str17);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused115) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr6 = C20696u.f77493v;
                            int length2 = strArr6.length;
                            int i114 = 0;
                            while (i114 < length2) {
                                String str18 = strArr6[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str18, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length3 = serviceInfoArr.length;
                                        int i210 = i111;
                                        while (i210 < length3) {
                                            String str19 = serviceInfoArr[i210].name;
                                            if (str19 != null) {
                                                int iIndexOf = str19.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str19.substring(i111, iIndexOf) : str19;
                                                String[] strArr7 = C20696u.f77492u;
                                                int length4 = strArr7.length;
                                                for (int i211 = i111; i211 < length4; i211++) {
                                                    if (str19.contains(strArr7[i211])) {
                                                        linkedHashSet.add(str18 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str19.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str18 + "/" + strSubstring);
                                                }
                                            }
                                            i210++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused116) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused117) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused118) {
                            return null;
                        }
                    default:
                        String str110 = C20696u.f77497z;
                        String[] strArr8 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str111 : strArr8) {
                                String strM56888h2 = c20696u.m56888h(str111);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str110)) {
                                    linkedHashMap9.put(str111, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length5 = strArr8.length;
                                while (i111 < length5) {
                                    String str112 = strArr8[i111];
                                    String str113 = (String) linkedHashMapM56889i2.get(str112);
                                    if (str113 != null && str113.toLowerCase().contains(str110)) {
                                        linkedHashMap9.put(str112, str113);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused119) {
                            return null;
                        }
                }
            }
        }));
        try {
            objM56880a13 = new Object() { // from class: io.seon.androidsdk.service.s
                /* JADX INFO: renamed from: a */
                public final Object m56880a() {
                    switch (i24) {
                        case 0:
                            return strArr[0];
                        case 1:
                            return strArr[11];
                        case 2:
                            return strArr[12];
                        case 3:
                            return strArr[13];
                        case 4:
                            return strArr[1];
                        case 5:
                            return strArr[6];
                        case 6:
                            return strArr[2];
                        case 7:
                            return strArr[3];
                        case 8:
                            return strArr[4];
                        case 9:
                            return strArr[7];
                        case 10:
                            return strArr[8];
                        case 11:
                            return strArr[9];
                        default:
                            return strArr[10];
                    }
                }
            }.m56880a();
        } catch (Throwable unused16) {
            objM56880a13 = null;
        }
        linkedHashMap.put((String) objM56880a13, AbstractC20664g.m56801d(new InterfaceC20695t0(this) { // from class: io.seon.androidsdk.service.t

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C20696u f77459b;

            {
                this.f77459b = this;
            }

            @Override // io.seon.androidsdk.service.InterfaceC20695t0
            /* JADX INFO: renamed from: a */
            public final Object mo56800a() {
                ArrayList arrayList3;
                Boolean boolValueOf;
                String str5;
                LinkedHashMap linkedHashMap2;
                Boolean boolValueOf2;
                LinkedHashMap linkedHashMapM56889i;
                LinkedHashMap linkedHashMapM56889i2;
                int i110 = i24;
                int i111 = 0;
                C20696u c20696u = this.f77459b;
                switch (i110) {
                    case 0:
                        c20696u.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (String str6 : C20696u.f77495x) {
                            try {
                                File file = new File(str6);
                                if (file.exists() && file.canRead()) {
                                    arrayList3 = new ArrayList();
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                String lowerCase = line.toLowerCase();
                                                for (String str7 : C20696u.f77496y) {
                                                    if (lowerCase.contains(str7.toLowerCase()) && !arrayList3.contains(str7)) {
                                                        arrayList3.add(str7);
                                                    }
                                                }
                                            } else {
                                                bufferedReader.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                bufferedReader.close();
                                                break;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                        arrayList3 = null;
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                break;
                            } catch (Throwable unused17) {
                            }
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                linkedHashMap3.put(str6, arrayList3);
                            }
                        }
                        if (linkedHashMap3.isEmpty()) {
                            return null;
                        }
                        return linkedHashMap3;
                    case 1:
                        c20696u.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (String str8 : C20696u.f77493v) {
                            try {
                                Context context = c20696u.f77498e;
                                AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                                try {
                                    boolValueOf = Boolean.valueOf(context.getPackageManager().getPackageInfo(str8, 0) != null);
                                } catch (PackageManager.NameNotFoundException unused18) {
                                    boolValueOf = Boolean.FALSE;
                                } catch (Throwable unused19) {
                                    boolValueOf = null;
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused110) {
                            } catch (Throwable unused111) {
                            }
                            if (Boolean.TRUE.equals(boolValueOf)) {
                                arrayList4.add(str8);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                        return arrayList4;
                    case 2:
                        c20696u.getClass();
                        try {
                            Context context2 = c20696u.f77498e;
                            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(C20696u.f77482k, 0);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int i112 = applicationInfo.flags;
                            linkedHashMap4.put(C20696u.f77468I, Boolean.valueOf(((i112 & 1) == 0 && (i112 & 128) == 0) ? false : true));
                            linkedHashMap4.put(C20696u.f77469J, Integer.valueOf(applicationInfo.uid));
                            return linkedHashMap4;
                        } catch (Throwable unused112) {
                            return null;
                        }
                    case 3:
                        String str9 = C20696u.f77460A;
                        try {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            String str10 = Build.HARDWARE;
                            if (str10 != null && str10.toLowerCase().contains(str9)) {
                                linkedHashMap5.put(C20696u.f77470K, str10);
                            }
                            String str11 = Build.BOARD;
                            if (str11 != null && str11.toLowerCase().contains(str9)) {
                                linkedHashMap5.put(C20696u.f77471L, str11);
                            }
                            LinkedHashMap linkedHashMapM56889i3 = c20696u.m56889i();
                            if (linkedHashMapM56889i3 != null) {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMapM56889i3.entrySet()) {
                                    String str12 = (String) entry.getKey();
                                    if (str12.startsWith(C20696u.f77465F)) {
                                        str5 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap6;
                                    } else if (str12.startsWith(C20696u.f77466G)) {
                                        str5 = (String) entry.getValue();
                                        linkedHashMap2 = linkedHashMap7;
                                    }
                                    linkedHashMap2.put(str12, str5);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77472M, Integer.valueOf(linkedHashMap6.size()));
                                    linkedHashMap5.put(C20696u.f77473N, linkedHashMap6);
                                }
                                if (!linkedHashMap7.isEmpty()) {
                                    linkedHashMap5.put(C20696u.f77474O, Integer.valueOf(linkedHashMap7.size()));
                                    linkedHashMap5.put(C20696u.f77475P, linkedHashMap7);
                                }
                            }
                            if (!linkedHashMap5.isEmpty()) {
                                return linkedHashMap5;
                            }
                        } catch (Throwable unused113) {
                        }
                        return null;
                    case 4:
                        c20696u.getClass();
                        try {
                            ArrayList arrayList5 = new ArrayList();
                            String[] strArr4 = {C20696u.f77483l, C20696u.f77484m, C20696u.f77485n, C20696u.f77486o, C20696u.f77487p};
                            for (int i113 = 0; i113 < 5; i113++) {
                                String str13 = strArr4[i113];
                                Boolean bool = Boolean.TRUE;
                                String str14 = C20696u.f77482k;
                                try {
                                    Intent intent = new Intent(str13);
                                    intent.setPackage(str14);
                                    Context context3 = c20696u.f77498e;
                                    AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
                                    boolValueOf2 = Boolean.valueOf(context3.getPackageManager().resolveService(intent, 0) != null);
                                } catch (Throwable unused114) {
                                    boolValueOf2 = null;
                                }
                                if (bool.equals(boolValueOf2)) {
                                    arrayList5.add(str13);
                                }
                                break;
                            }
                            if (!arrayList5.isEmpty()) {
                                return arrayList5;
                            }
                        } catch (Throwable unused115) {
                        }
                        return null;
                    case 5:
                        c20696u.f77499f = null;
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        String[] strArr5 = C20696u.f77488q;
                        for (String str15 : strArr5) {
                            String strM56888h = c20696u.m56888h(str15);
                            if (!TextUtils.isEmpty(strM56888h)) {
                                linkedHashMap8.put(str15, strM56888h);
                                if (c20696u.f77499f == null) {
                                    c20696u.f77499f = 0;
                                }
                            }
                        }
                        if (linkedHashMap8.isEmpty() && (linkedHashMapM56889i = c20696u.m56889i()) != null) {
                            for (String str16 : strArr5) {
                                if (linkedHashMapM56889i.containsKey(str16)) {
                                    linkedHashMap8.put(str16, (String) linkedHashMapM56889i.get(str16));
                                    if (c20696u.f77499f == null) {
                                        c20696u.f77499f = 1;
                                    }
                                }
                            }
                        }
                        return linkedHashMap8;
                    case 6:
                        c20696u.getClass();
                        try {
                            Context context4 = c20696u.f77498e;
                            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
                            PackageManager packageManager = context4.getPackageManager();
                            ArrayList arrayList6 = new ArrayList();
                            for (String str17 : C20696u.f77491t) {
                                if (packageManager.resolveContentProvider(str17, 0) != null) {
                                    arrayList6.add(str17);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                return arrayList6;
                            }
                        } catch (Throwable unused116) {
                        }
                        return null;
                    case 7:
                        c20696u.getClass();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Context context5 = c20696u.f77498e;
                            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
                            PackageManager packageManager2 = context5.getPackageManager();
                            String[] strArr6 = C20696u.f77493v;
                            int length2 = strArr6.length;
                            int i114 = 0;
                            while (i114 < length2) {
                                String str18 = strArr6[i114];
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str18, 14).services;
                                    if (serviceInfoArr != null) {
                                        int length3 = serviceInfoArr.length;
                                        int i210 = i111;
                                        while (i210 < length3) {
                                            String str19 = serviceInfoArr[i210].name;
                                            if (str19 != null) {
                                                int iIndexOf = str19.indexOf(36);
                                                String strSubstring = iIndexOf > 0 ? str19.substring(i111, iIndexOf) : str19;
                                                String[] strArr7 = C20696u.f77492u;
                                                int length4 = strArr7.length;
                                                for (int i211 = i111; i211 < length4; i211++) {
                                                    if (str19.contains(strArr7[i211])) {
                                                        linkedHashSet.add(str18 + "/" + strSubstring);
                                                    }
                                                }
                                                String lowerCase2 = str19.toLowerCase();
                                                if (lowerCase2.contains(C20696u.f77461B) || lowerCase2.contains(C20696u.f77462C) || lowerCase2.contains(C20696u.f77463D) || lowerCase2.contains(C20696u.f77464E)) {
                                                    linkedHashSet.add(str18 + "/" + strSubstring);
                                                }
                                            }
                                            i210++;
                                            i111 = 0;
                                        }
                                    }
                                } catch (Throwable unused117) {
                                }
                                i114++;
                                i111 = 0;
                            }
                            if (!linkedHashSet.isEmpty()) {
                                return new ArrayList(linkedHashSet);
                            }
                        } catch (Throwable unused118) {
                        }
                        return null;
                    case 8:
                        c20696u.getClass();
                        try {
                            File file2 = new File(C20696u.f77476Q);
                            if (file2.exists() && file2.canRead()) {
                                StringBuilder sb4 = new StringBuilder();
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            bufferedReader2.close();
                                            String strTrim = sb4.toString().trim();
                                            if (strTrim.isEmpty()) {
                                                return null;
                                            }
                                            return strTrim;
                                        }
                                        sb4.append(line2);
                                    } catch (Throwable th5) {
                                        try {
                                            bufferedReader2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                    return null;
                                }
                            }
                            AbstractC20684o.m56853f(C20696u.f77479T, null);
                            return null;
                        } catch (Throwable unused119) {
                            return null;
                        }
                    default:
                        String str110 = C20696u.f77497z;
                        String[] strArr8 = C20696u.f77490s;
                        try {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            for (String str111 : strArr8) {
                                String strM56888h2 = c20696u.m56888h(str111);
                                if (strM56888h2 != null && strM56888h2.toLowerCase().contains(str110)) {
                                    linkedHashMap9.put(str111, strM56888h2);
                                }
                            }
                            if (linkedHashMap9.isEmpty() && (linkedHashMapM56889i2 = c20696u.m56889i()) != null) {
                                int length5 = strArr8.length;
                                while (i111 < length5) {
                                    String str112 = strArr8[i111];
                                    String str113 = (String) linkedHashMapM56889i2.get(str112);
                                    if (str113 != null && str113.toLowerCase().contains(str110)) {
                                        linkedHashMap9.put(str112, str113);
                                    }
                                    i111++;
                                }
                            }
                            if (linkedHashMap9.isEmpty()) {
                                return null;
                            }
                            return linkedHashMap9;
                        } catch (Throwable unused1110) {
                            return null;
                        }
                }
            }
        }));
        return linkedHashMap;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        return null;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77498e = c20663f1.f77299a;
    }

    /* JADX INFO: renamed from: h */
    public final String m56888h(String str) {
        try {
            Method method = this.f77501h;
            if (method == null) {
                method = Class.forName(f77467H).getMethod(f77478S, String.class);
                this.f77501h = method;
            }
            String str2 = (String) method.invoke(null, str);
            if (str2 == null) {
                return null;
            }
            String strTrim = str2.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            return strTrim;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap m56889i() {
        if (this.f77500g == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Process processStart = new ProcessBuilder(f77477R).redirectErrorStream(true).start();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            int iIndexOf = line.indexOf(91);
                            int iIndexOf2 = line.indexOf("]:");
                            int iLastIndexOf = line.lastIndexOf(91);
                            int iLastIndexOf2 = line.lastIndexOf(93);
                            if (iIndexOf >= 0 && iIndexOf2 > iIndexOf && iLastIndexOf > iIndexOf2 && iLastIndexOf2 >= iLastIndexOf) {
                                linkedHashMap.put(line.substring(iIndexOf + 1, iIndexOf2), line.substring(iLastIndexOf + 1, iLastIndexOf2));
                            }
                        } catch (Throwable th3) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                        processStart.destroy();
                        throw th;
                    }
                    bufferedReader.close();
                    processStart.destroy();
                } catch (Throwable th5) {
                    processStart.destroy();
                    throw th5;
                }
            } catch (Throwable unused) {
                linkedHashMap = null;
            }
            this.f77500g = linkedHashMap;
        }
        return this.f77500g;
    }
}
