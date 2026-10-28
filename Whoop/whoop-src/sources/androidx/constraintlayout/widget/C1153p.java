package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.common.logger.LogPriority;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p108e4.AbstractC12682p;
import p183h4.AbstractC16833a;
import p357o4.AbstractC27519a;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C1153p {

    /* JADX INFO: renamed from: d */
    public static final int[] f5217d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f5218e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f5219f;

    /* JADX INFO: renamed from: a */
    public final HashMap f5220a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f5221b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f5222c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5218e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5219f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: h */
    public static int[] m3638h(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i13 = 0;
        int i14 = 0;
        while (i13 < strArrSplit.length) {
            String strTrim = strArrSplit[i13].trim();
            try {
                iIntValue = AbstractC1155r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i14] = iIntValue;
            i13++;
            i14++;
        }
        return i14 != strArrSplit.length ? Arrays.copyOf(iArr, i14) : iArr;
    }

    /* JADX INFO: renamed from: i */
    public static C1148k m3639i(Context context, AttributeSet attributeSet, boolean z4) {
        int i13;
        int i14;
        C1148k c1148k = new C1148k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? AbstractC1156s.f5225c : AbstractC1156s.f5223a);
        C1151n c1151n = c1148k.f5116b;
        C1152o c1152o = c1148k.f5119e;
        C1150m c1150m = c1148k.f5117c;
        C1149l c1149l = c1148k.f5118d;
        int[] iArr = f5217d;
        String[] strArr = AbstractC16833a.f64693a;
        SparseIntArray sparseIntArray = f5218e;
        if (z4) {
            C1147j c1147j = new C1147j();
            c1147j.f5103a = new int[10];
            c1147j.f5104b = new int[10];
            c1147j.f5105c = 0;
            c1147j.f5106d = new int[10];
            c1147j.f5107e = new float[10];
            c1147j.f5108f = 0;
            c1147j.f5109g = new int[5];
            c1147j.f5110h = new String[5];
            c1147j.f5111i = 0;
            c1147j.f5112j = new int[4];
            c1147j.f5113k = new boolean[4];
            c1147j.f5114l = 0;
            c1150m.getClass();
            c1149l.getClass();
            c1152o.getClass();
            int i15 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i15 < indexCount; indexCount = i14) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                int i16 = i15;
                switch (f5219f.get(index)) {
                    case 2:
                        i14 = indexCount;
                        c1147j.m3630b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5130I));
                        continue;
                        i15 = i16 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb4 = new StringBuilder("Unknown attribute 0x");
                        i14 = indexCount;
                        sb4.append(Integer.toHexString(index));
                        sb4.append("   ");
                        sb4.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb4.toString());
                        break;
                    case 5:
                        i14 = indexCount;
                        c1147j.m3631c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i15 = i16 + 1;
                        break;
                    case 6:
                        i14 = indexCount;
                        c1147j.m3630b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1149l.f5124C));
                        break;
                    case 7:
                        i14 = indexCount;
                        c1147j.m3630b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1149l.f5125D));
                        break;
                    case 8:
                        i14 = indexCount;
                        c1147j.m3630b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5131J));
                        break;
                    case 11:
                        i14 = indexCount;
                        c1147j.m3630b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5137P));
                        break;
                    case 12:
                        i14 = indexCount;
                        c1147j.m3630b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5138Q));
                        break;
                    case 13:
                        i14 = indexCount;
                        c1147j.m3630b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5134M));
                        break;
                    case 14:
                        i14 = indexCount;
                        c1147j.m3630b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5136O));
                        break;
                    case 15:
                        i14 = indexCount;
                        c1147j.m3630b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5139R));
                        break;
                    case 16:
                        i14 = indexCount;
                        c1147j.m3630b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5135N));
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        i14 = indexCount;
                        c1147j.m3630b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1149l.f5154d));
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        i14 = indexCount;
                        c1147j.m3630b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1149l.f5156e));
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5158f), 19);
                        break;
                    case 20:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5185w), 20);
                        break;
                    case 21:
                        i14 = indexCount;
                        c1147j.m3630b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1149l.f5152c));
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        i14 = indexCount;
                        c1147j.m3630b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1151n.f5199a)]);
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        i14 = indexCount;
                        c1147j.m3630b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1149l.f5150b));
                        break;
                    case 24:
                        i14 = indexCount;
                        c1147j.m3630b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5127F));
                        break;
                    case 27:
                        i14 = indexCount;
                        c1147j.m3630b(27, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5126E));
                        break;
                    case 28:
                        i14 = indexCount;
                        c1147j.m3630b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5128G));
                        break;
                    case 31:
                        i14 = indexCount;
                        c1147j.m3630b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5132K));
                        break;
                    case 34:
                        i14 = indexCount;
                        c1147j.m3630b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5129H));
                        break;
                    case 37:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5186x), 37);
                        break;
                    case 38:
                        i14 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1148k.f5115a);
                        c1148k.f5115a = resourceId;
                        c1147j.m3630b(38, resourceId);
                        break;
                    case 39:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5142U), 39);
                        break;
                    case 40:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5141T), 40);
                        break;
                    case 41:
                        i14 = indexCount;
                        c1147j.m3630b(41, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5143V));
                        break;
                    case 42:
                        i14 = indexCount;
                        c1147j.m3630b(42, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5144W));
                        break;
                    case 43:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1151n.f5201c), 43);
                        break;
                    case 44:
                        i14 = indexCount;
                        c1147j.m3632d(44, true);
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5216m), 44);
                        break;
                    case 45:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1152o.f5205b), 45);
                        break;
                    case 46:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1152o.f5206c), 46);
                        break;
                    case 47:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1152o.f5207d), 47);
                        break;
                    case 48:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1152o.f5208e), 48);
                        break;
                    case 49:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5209f), 49);
                        break;
                    case 50:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5210g), 50);
                        break;
                    case 51:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5212i), 51);
                        break;
                    case 52:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5213j), 52);
                        break;
                    case 53:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getDimension(index, c1152o.f5214k), 53);
                        break;
                    case 54:
                        i14 = indexCount;
                        c1147j.m3630b(54, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5145X));
                        break;
                    case 55:
                        i14 = indexCount;
                        c1147j.m3630b(55, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5146Y));
                        break;
                    case 56:
                        i14 = indexCount;
                        c1147j.m3630b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5147Z));
                        break;
                    case 57:
                        i14 = indexCount;
                        c1147j.m3630b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5149a0));
                        break;
                    case 58:
                        i14 = indexCount;
                        c1147j.m3630b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5151b0));
                        break;
                    case 59:
                        i14 = indexCount;
                        c1147j.m3630b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5153c0));
                        break;
                    case 60:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1152o.f5204a), 60);
                        break;
                    case 62:
                        i14 = indexCount;
                        c1147j.m3630b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5122A));
                        break;
                    case 63:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1149l.f5123B), 63);
                        break;
                    case 64:
                        i14 = indexCount;
                        c1147j.m3630b(64, m3640l(typedArrayObtainStyledAttributes, index, c1150m.f5190a));
                        break;
                    case 65:
                        i14 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1147j.m3631c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c1147j.m3631c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i14 = indexCount;
                        c1147j.m3630b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1150m.f5194e), 67);
                        break;
                    case 68:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1151n.f5202d), 68);
                        break;
                    case 69:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i14 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i14 = indexCount;
                        c1147j.m3630b(72, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5159f0));
                        break;
                    case 73:
                        i14 = indexCount;
                        c1147j.m3630b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5161g0));
                        break;
                    case 74:
                        i14 = indexCount;
                        c1147j.m3631c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                        i14 = indexCount;
                        c1147j.m3632d(75, typedArrayObtainStyledAttributes.getBoolean(index, c1149l.f5175n0));
                        break;
                    case 76:
                        i14 = indexCount;
                        c1147j.m3630b(76, typedArrayObtainStyledAttributes.getInt(index, c1150m.f5192c));
                        break;
                    case 77:
                        i14 = indexCount;
                        c1147j.m3631c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i14 = indexCount;
                        c1147j.m3630b(78, typedArrayObtainStyledAttributes.getInt(index, c1151n.f5200b));
                        break;
                    case 79:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1150m.f5193d), 79);
                        break;
                    case 80:
                        i14 = indexCount;
                        c1147j.m3632d(80, typedArrayObtainStyledAttributes.getBoolean(index, c1149l.f5171l0));
                        break;
                    case 81:
                        i14 = indexCount;
                        c1147j.m3632d(81, typedArrayObtainStyledAttributes.getBoolean(index, c1149l.f5173m0));
                        break;
                    case 82:
                        i14 = indexCount;
                        c1147j.m3630b(82, typedArrayObtainStyledAttributes.getInteger(index, c1150m.f5191b));
                        break;
                    case 83:
                        i14 = indexCount;
                        c1147j.m3630b(83, m3640l(typedArrayObtainStyledAttributes, index, c1152o.f5211h));
                        break;
                    case 84:
                        i14 = indexCount;
                        c1147j.m3630b(84, typedArrayObtainStyledAttributes.getInteger(index, c1150m.f5196g));
                        break;
                    case 85:
                        i14 = indexCount;
                        c1147j.m3629a(typedArrayObtainStyledAttributes.getFloat(index, c1150m.f5195f), 85);
                        break;
                    case 86:
                        i14 = indexCount;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i17 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1150m.f5198i = resourceId2;
                            c1147j.m3630b(89, resourceId2);
                            if (c1150m.f5198i != -1) {
                                c1147j.m3630b(88, -2);
                            }
                        } else if (i17 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1150m.f5197h = string;
                            c1147j.m3631c(90, string);
                            if (c1150m.f5197h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1150m.f5198i = resourceId3;
                                c1147j.m3630b(89, resourceId3);
                                c1147j.m3630b(88, -2);
                            } else {
                                c1147j.m3630b(88, -1);
                            }
                        } else {
                            c1147j.m3630b(88, typedArrayObtainStyledAttributes.getInteger(index, c1150m.f5198i));
                        }
                        break;
                    case 87:
                        i14 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i14 = indexCount;
                        c1147j.m3630b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5133L));
                        break;
                    case 94:
                        i14 = indexCount;
                        c1147j.m3630b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1149l.f5140S));
                        break;
                    case 95:
                        i14 = indexCount;
                        m3641m(c1147j, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i14 = indexCount;
                        m3641m(c1147j, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i14 = indexCount;
                        c1147j.m3630b(97, typedArrayObtainStyledAttributes.getInt(index, c1149l.f5177o0));
                        break;
                    case 98:
                        i14 = indexCount;
                        int i18 = AbstractC27519a.f110810w;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1148k.f5115a = typedArrayObtainStyledAttributes.getResourceId(index, c1148k.f5115a);
                        }
                        break;
                    case LogPriority.NONE /* 99 */:
                        i14 = indexCount;
                        c1147j.m3632d(99, typedArrayObtainStyledAttributes.getBoolean(index, c1149l.f5160g));
                        break;
                }
                i15 = i16 + 1;
            }
        } else {
            int i19 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i19 < indexCount2; indexCount2 = i13) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i19);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c1150m.getClass();
                        c1149l.getClass();
                        c1152o.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i13 = indexCount2;
                        c1149l.f5178p = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5178p);
                        continue;
                        i19++;
                        break;
                    case 2:
                        i13 = indexCount2;
                        c1149l.f5130I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5130I);
                        continue;
                        i19++;
                        break;
                    case 3:
                        i13 = indexCount2;
                        c1149l.f5176o = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5176o);
                        continue;
                        i19++;
                        break;
                    case 4:
                        i13 = indexCount2;
                        c1149l.f5174n = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5174n);
                        continue;
                        i19++;
                        break;
                    case 5:
                        i13 = indexCount2;
                        c1149l.f5187y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i19++;
                        break;
                    case 6:
                        i13 = indexCount2;
                        c1149l.f5124C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1149l.f5124C);
                        continue;
                        i19++;
                        break;
                    case 7:
                        i13 = indexCount2;
                        c1149l.f5125D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1149l.f5125D);
                        continue;
                        i19++;
                        break;
                    case 8:
                        i13 = indexCount2;
                        c1149l.f5131J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5131J);
                        continue;
                        i19++;
                        break;
                    case 9:
                        i13 = indexCount2;
                        c1149l.f5184v = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5184v);
                        continue;
                        i19++;
                        break;
                    case 10:
                        i13 = indexCount2;
                        c1149l.f5183u = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5183u);
                        continue;
                        i19++;
                        break;
                    case 11:
                        i13 = indexCount2;
                        c1149l.f5137P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5137P);
                        continue;
                        i19++;
                        break;
                    case 12:
                        i13 = indexCount2;
                        c1149l.f5138Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5138Q);
                        continue;
                        i19++;
                        break;
                    case 13:
                        i13 = indexCount2;
                        c1149l.f5134M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5134M);
                        continue;
                        i19++;
                        break;
                    case 14:
                        i13 = indexCount2;
                        c1149l.f5136O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5136O);
                        continue;
                        i19++;
                        break;
                    case 15:
                        i13 = indexCount2;
                        c1149l.f5139R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5139R);
                        continue;
                        i19++;
                        break;
                    case 16:
                        i13 = indexCount2;
                        c1149l.f5135N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5135N);
                        continue;
                        i19++;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        i13 = indexCount2;
                        c1149l.f5154d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1149l.f5154d);
                        continue;
                        i19++;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        i13 = indexCount2;
                        c1149l.f5156e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1149l.f5156e);
                        continue;
                        i19++;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        i13 = indexCount2;
                        c1149l.f5158f = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5158f);
                        continue;
                        i19++;
                        break;
                    case 20:
                        i13 = indexCount2;
                        c1149l.f5185w = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5185w);
                        continue;
                        i19++;
                        break;
                    case 21:
                        i13 = indexCount2;
                        c1149l.f5152c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1149l.f5152c);
                        continue;
                        i19++;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        i13 = indexCount2;
                        int i24 = typedArrayObtainStyledAttributes.getInt(index2, c1151n.f5199a);
                        c1151n.f5199a = i24;
                        c1151n.f5199a = iArr[i24];
                        continue;
                        i19++;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        i13 = indexCount2;
                        c1149l.f5150b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1149l.f5150b);
                        continue;
                        i19++;
                        break;
                    case 24:
                        i13 = indexCount2;
                        c1149l.f5127F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5127F);
                        continue;
                        i19++;
                        break;
                    case 25:
                        i13 = indexCount2;
                        c1149l.f5162h = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5162h);
                        continue;
                        i19++;
                        break;
                    case 26:
                        i13 = indexCount2;
                        c1149l.f5164i = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5164i);
                        continue;
                        i19++;
                        break;
                    case 27:
                        i13 = indexCount2;
                        c1149l.f5126E = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5126E);
                        continue;
                        i19++;
                        break;
                    case 28:
                        i13 = indexCount2;
                        c1149l.f5128G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5128G);
                        continue;
                        i19++;
                        break;
                    case 29:
                        i13 = indexCount2;
                        c1149l.f5166j = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5166j);
                        continue;
                        i19++;
                        break;
                    case 30:
                        i13 = indexCount2;
                        c1149l.f5168k = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5168k);
                        continue;
                        i19++;
                        break;
                    case 31:
                        i13 = indexCount2;
                        c1149l.f5132K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5132K);
                        continue;
                        i19++;
                        break;
                    case 32:
                        i13 = indexCount2;
                        c1149l.f5181s = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5181s);
                        continue;
                        i19++;
                        break;
                    case 33:
                        i13 = indexCount2;
                        c1149l.f5182t = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5182t);
                        continue;
                        i19++;
                        break;
                    case 34:
                        i13 = indexCount2;
                        c1149l.f5129H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5129H);
                        continue;
                        i19++;
                        break;
                    case 35:
                        i13 = indexCount2;
                        c1149l.f5172m = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5172m);
                        continue;
                        i19++;
                        break;
                    case 36:
                        i13 = indexCount2;
                        c1149l.f5170l = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5170l);
                        continue;
                        i19++;
                        break;
                    case 37:
                        i13 = indexCount2;
                        c1149l.f5186x = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5186x);
                        continue;
                        i19++;
                        break;
                    case 38:
                        i13 = indexCount2;
                        c1148k.f5115a = typedArrayObtainStyledAttributes.getResourceId(index2, c1148k.f5115a);
                        continue;
                        i19++;
                        break;
                    case 39:
                        i13 = indexCount2;
                        c1149l.f5142U = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5142U);
                        continue;
                        i19++;
                        break;
                    case 40:
                        i13 = indexCount2;
                        c1149l.f5141T = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5141T);
                        continue;
                        i19++;
                        break;
                    case 41:
                        i13 = indexCount2;
                        c1149l.f5143V = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5143V);
                        continue;
                        i19++;
                        break;
                    case 42:
                        i13 = indexCount2;
                        c1149l.f5144W = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5144W);
                        continue;
                        i19++;
                        break;
                    case 43:
                        i13 = indexCount2;
                        c1151n.f5201c = typedArrayObtainStyledAttributes.getFloat(index2, c1151n.f5201c);
                        continue;
                        i19++;
                        break;
                    case 44:
                        i13 = indexCount2;
                        c1152o.f5215l = true;
                        c1152o.f5216m = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5216m);
                        continue;
                        i19++;
                        break;
                    case 45:
                        i13 = indexCount2;
                        c1152o.f5205b = typedArrayObtainStyledAttributes.getFloat(index2, c1152o.f5205b);
                        continue;
                        i19++;
                        break;
                    case 46:
                        i13 = indexCount2;
                        c1152o.f5206c = typedArrayObtainStyledAttributes.getFloat(index2, c1152o.f5206c);
                        continue;
                        i19++;
                        break;
                    case 47:
                        i13 = indexCount2;
                        c1152o.f5207d = typedArrayObtainStyledAttributes.getFloat(index2, c1152o.f5207d);
                        continue;
                        i19++;
                        break;
                    case 48:
                        i13 = indexCount2;
                        c1152o.f5208e = typedArrayObtainStyledAttributes.getFloat(index2, c1152o.f5208e);
                        continue;
                        i19++;
                        break;
                    case 49:
                        i13 = indexCount2;
                        c1152o.f5209f = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5209f);
                        continue;
                        i19++;
                        break;
                    case 50:
                        i13 = indexCount2;
                        c1152o.f5210g = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5210g);
                        continue;
                        i19++;
                        break;
                    case 51:
                        i13 = indexCount2;
                        c1152o.f5212i = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5212i);
                        continue;
                        i19++;
                        break;
                    case 52:
                        i13 = indexCount2;
                        c1152o.f5213j = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5213j);
                        continue;
                        i19++;
                        break;
                    case 53:
                        i13 = indexCount2;
                        c1152o.f5214k = typedArrayObtainStyledAttributes.getDimension(index2, c1152o.f5214k);
                        continue;
                        i19++;
                        break;
                    case 54:
                        i13 = indexCount2;
                        c1149l.f5145X = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5145X);
                        continue;
                        i19++;
                        break;
                    case 55:
                        i13 = indexCount2;
                        c1149l.f5146Y = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5146Y);
                        continue;
                        i19++;
                        break;
                    case 56:
                        i13 = indexCount2;
                        c1149l.f5147Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5147Z);
                        continue;
                        i19++;
                        break;
                    case 57:
                        i13 = indexCount2;
                        c1149l.f5149a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5149a0);
                        continue;
                        i19++;
                        break;
                    case 58:
                        i13 = indexCount2;
                        c1149l.f5151b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5151b0);
                        continue;
                        i19++;
                        break;
                    case 59:
                        i13 = indexCount2;
                        c1149l.f5153c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5153c0);
                        continue;
                        i19++;
                        break;
                    case 60:
                        i13 = indexCount2;
                        c1152o.f5204a = typedArrayObtainStyledAttributes.getFloat(index2, c1152o.f5204a);
                        continue;
                        i19++;
                        break;
                    case 61:
                        i13 = indexCount2;
                        c1149l.f5188z = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5188z);
                        continue;
                        i19++;
                        break;
                    case 62:
                        i13 = indexCount2;
                        c1149l.f5122A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5122A);
                        continue;
                        i19++;
                        break;
                    case 63:
                        i13 = indexCount2;
                        c1149l.f5123B = typedArrayObtainStyledAttributes.getFloat(index2, c1149l.f5123B);
                        continue;
                        i19++;
                        break;
                    case 64:
                        i13 = indexCount2;
                        c1150m.f5190a = m3640l(typedArrayObtainStyledAttributes, index2, c1150m.f5190a);
                        continue;
                        i19++;
                        break;
                    case 65:
                        i13 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c1150m.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c1150m.getClass();
                        }
                        i19++;
                        break;
                    case 66:
                        i13 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c1150m.getClass();
                        continue;
                        i19++;
                        break;
                    case 67:
                        i13 = indexCount2;
                        c1150m.f5194e = typedArrayObtainStyledAttributes.getFloat(index2, c1150m.f5194e);
                        break;
                    case 68:
                        i13 = indexCount2;
                        c1151n.f5202d = typedArrayObtainStyledAttributes.getFloat(index2, c1151n.f5202d);
                        break;
                    case 69:
                        i13 = indexCount2;
                        c1149l.f5155d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i13 = indexCount2;
                        c1149l.f5157e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i13 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i13 = indexCount2;
                        c1149l.f5159f0 = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5159f0);
                        break;
                    case 73:
                        i13 = indexCount2;
                        c1149l.f5161g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5161g0);
                        break;
                    case 74:
                        i13 = indexCount2;
                        c1149l.f5167j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                        i13 = indexCount2;
                        c1149l.f5175n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1149l.f5175n0);
                        break;
                    case 76:
                        i13 = indexCount2;
                        c1150m.f5192c = typedArrayObtainStyledAttributes.getInt(index2, c1150m.f5192c);
                        break;
                    case 77:
                        i13 = indexCount2;
                        c1149l.f5169k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i13 = indexCount2;
                        c1151n.f5200b = typedArrayObtainStyledAttributes.getInt(index2, c1151n.f5200b);
                        break;
                    case 79:
                        i13 = indexCount2;
                        c1150m.f5193d = typedArrayObtainStyledAttributes.getFloat(index2, c1150m.f5193d);
                        break;
                    case 80:
                        i13 = indexCount2;
                        c1149l.f5171l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1149l.f5171l0);
                        break;
                    case 81:
                        i13 = indexCount2;
                        c1149l.f5173m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1149l.f5173m0);
                        break;
                    case 82:
                        i13 = indexCount2;
                        c1150m.f5191b = typedArrayObtainStyledAttributes.getInteger(index2, c1150m.f5191b);
                        break;
                    case 83:
                        i13 = indexCount2;
                        c1152o.f5211h = m3640l(typedArrayObtainStyledAttributes, index2, c1152o.f5211h);
                        break;
                    case 84:
                        i13 = indexCount2;
                        c1150m.f5196g = typedArrayObtainStyledAttributes.getInteger(index2, c1150m.f5196g);
                        break;
                    case 85:
                        i13 = indexCount2;
                        c1150m.f5195f = typedArrayObtainStyledAttributes.getFloat(index2, c1150m.f5195f);
                        break;
                    case 86:
                        i13 = indexCount2;
                        int i25 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i25 == 1) {
                            c1150m.f5198i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i25 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1150m.f5197h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1150m.f5198i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1150m.f5198i);
                        }
                        break;
                    case 87:
                        i13 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb5 = new StringBuilder("Unknown attribute 0x");
                        i13 = indexCount2;
                        sb5.append(Integer.toHexString(index2));
                        sb5.append("   ");
                        sb5.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb5.toString());
                        break;
                    case 91:
                        i13 = indexCount2;
                        c1149l.f5179q = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5179q);
                        break;
                    case 92:
                        i13 = indexCount2;
                        c1149l.f5180r = m3640l(typedArrayObtainStyledAttributes, index2, c1149l.f5180r);
                        break;
                    case 93:
                        i13 = indexCount2;
                        c1149l.f5133L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5133L);
                        break;
                    case 94:
                        i13 = indexCount2;
                        c1149l.f5140S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1149l.f5140S);
                        break;
                    case 95:
                        i13 = indexCount2;
                        m3641m(c1149l, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i19++;
                        break;
                    case 96:
                        i13 = indexCount2;
                        m3641m(c1149l, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i13 = indexCount2;
                        c1149l.f5177o0 = typedArrayObtainStyledAttributes.getInt(index2, c1149l.f5177o0);
                        break;
                }
                i19++;
            }
            if (c1149l.f5167j0 != null) {
                c1149l.f5165i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1148k;
    }

    /* JADX INFO: renamed from: l */
    public static int m3640l(TypedArray typedArray, int i13, int i14) {
        int resourceId = typedArray.getResourceId(i13, i14);
        return resourceId == -1 ? typedArray.getInt(i13, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX INFO: renamed from: m */
    public static void m3641m(Object obj, TypedArray typedArray, int i13, int i14) {
        int dimensionPixelSize;
        C1147j c1147j;
        C1149l c1149l;
        C1141d c1141d;
        if (obj == null) {
            return;
        }
        int i15 = typedArray.peekValue(i13).type;
        boolean z4 = true;
        int i16 = 0;
        if (i15 != 3) {
            if (i15 != 5) {
                dimensionPixelSize = typedArray.getInt(i13, 0);
                if (dimensionPixelSize == -4) {
                    i16 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z4 = false;
                }
                if (obj instanceof C1141d) {
                    c1141d = (C1141d) obj;
                    if (i14 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1141d).width = i16;
                        c1141d.f5034W = z4;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1141d).height = i16;
                        c1141d.f5035X = z4;
                        return;
                    }
                }
                if (obj instanceof C1149l) {
                    c1149l = (C1149l) obj;
                    if (i14 == 0) {
                        c1149l.f5150b = i16;
                        c1149l.f5171l0 = z4;
                        return;
                    } else {
                        c1149l.f5152c = i16;
                        c1149l.f5173m0 = z4;
                        return;
                    }
                }
                if (obj instanceof C1147j) {
                    c1147j = (C1147j) obj;
                    if (i14 == 0) {
                        c1147j.m3630b(23, i16);
                        c1147j.m3632d(80, z4);
                        return;
                    } else {
                        c1147j.m3630b(21, i16);
                        c1147j.m3632d(81, z4);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i13, 0);
            z4 = false;
            i16 = dimensionPixelSize;
            if (obj instanceof C1141d) {
                c1141d = (C1141d) obj;
                if (i14 == 0) {
                    ((ViewGroup.MarginLayoutParams) c1141d).width = i16;
                    c1141d.f5034W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c1141d).height = i16;
                    c1141d.f5035X = z4;
                    return;
                }
            }
            if (obj instanceof C1149l) {
                c1149l = (C1149l) obj;
                if (i14 == 0) {
                    c1149l.f5150b = i16;
                    c1149l.f5171l0 = z4;
                    return;
                } else {
                    c1149l.f5152c = i16;
                    c1149l.f5173m0 = z4;
                    return;
                }
            }
            if (obj instanceof C1147j) {
                c1147j = (C1147j) obj;
                if (i14 == 0) {
                    c1147j.m3630b(23, i16);
                    c1147j.m3632d(80, z4);
                    return;
                } else {
                    c1147j.m3630b(21, i16);
                    c1147j.m3632d(81, z4);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i13);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C1141d) {
                    C1141d c1141d2 = (C1141d) obj;
                    if (i14 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1141d2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1141d2).height = 0;
                    }
                    m3642n(c1141d2, strTrim2);
                    return;
                }
                if (obj instanceof C1149l) {
                    ((C1149l) obj).f5187y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C1147j) {
                        ((C1147j) obj).m3631c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f13 = Float.parseFloat(strTrim2);
                    if (obj instanceof C1141d) {
                        C1141d c1141d3 = (C1141d) obj;
                        if (i14 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1141d3).width = 0;
                            c1141d3.f5019H = f13;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1141d3).height = 0;
                            c1141d3.f5020I = f13;
                            return;
                        }
                    }
                    if (obj instanceof C1149l) {
                        C1149l c1149l2 = (C1149l) obj;
                        if (i14 == 0) {
                            c1149l2.f5150b = 0;
                            c1149l2.f5142U = f13;
                            return;
                        } else {
                            c1149l2.f5152c = 0;
                            c1149l2.f5141T = f13;
                            return;
                        }
                    }
                    if (obj instanceof C1147j) {
                        C1147j c1147j2 = (C1147j) obj;
                        if (i14 == 0) {
                            c1147j2.m3630b(23, 0);
                            c1147j2.m3629a(f13, 39);
                            return;
                        } else {
                            c1147j2.m3630b(21, 0);
                            c1147j2.m3629a(f13, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C1141d) {
                        C1141d c1141d4 = (C1141d) obj;
                        if (i14 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1141d4).width = 0;
                            c1141d4.f5029R = fMax;
                            c1141d4.f5023L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1141d4).height = 0;
                            c1141d4.f5030S = fMax;
                            c1141d4.f5024M = 2;
                            return;
                        }
                    }
                    if (obj instanceof C1149l) {
                        C1149l c1149l3 = (C1149l) obj;
                        if (i14 == 0) {
                            c1149l3.f5150b = 0;
                            c1149l3.f5155d0 = fMax;
                            c1149l3.f5145X = 2;
                            return;
                        } else {
                            c1149l3.f5152c = 0;
                            c1149l3.f5157e0 = fMax;
                            c1149l3.f5146Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof C1147j) {
                        C1147j c1147j3 = (C1147j) obj;
                        if (i14 == 0) {
                            c1147j3.m3630b(23, 0);
                            c1147j3.m3630b(54, 2);
                        } else {
                            c1147j3.m3630b(21, 0);
                            c1147j3.m3630b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3642n(C1141d c1141d, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i13 = 0;
            int i14 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i13 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i14 = i13;
                i13 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i13);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i13, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f13 = Float.parseFloat(strSubstring3);
                        float f14 = Float.parseFloat(strSubstring4);
                        if (f13 > 0.0f && f14 > 0.0f) {
                            if (i14 == 1) {
                                Math.abs(f14 / f13);
                            } else {
                                Math.abs(f13 / f14);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1141d.f5018G = str;
    }

    /* JADX INFO: renamed from: o */
    public static String m3643o(int i13) {
        switch (i13) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3644a(ConstraintLayout constraintLayout) {
        m3645b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public final void m3645b(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i13;
        HashMap map;
        String resourceEntryName;
        C1153p c1153p = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c1153p.f5222c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = constraintLayout.getChildAt(i14);
            int id4 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id4))) {
                StringBuilder sb4 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb4.append(resourceEntryName);
                Log.w("ConstraintSet", sb4.toString());
            } else {
                if (c1153p.f5221b && id4 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id4 != -1) {
                    if (map2.containsKey(Integer.valueOf(id4))) {
                        hashSet2.remove(Integer.valueOf(id4));
                        C1148k c1148k = (C1148k) map2.get(Integer.valueOf(id4));
                        if (c1148k != null) {
                            C1151n c1151n = c1148k.f5116b;
                            C1149l c1149l = c1148k.f5118d;
                            C1152o c1152o = c1148k.f5119e;
                            if (childAt instanceof Barrier) {
                                c1149l.f5163h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id4);
                                barrier.setType(c1149l.f5159f0);
                                barrier.setMargin(c1149l.f5161g0);
                                barrier.setAllowsGoneWidget(c1149l.f5175n0);
                                int[] iArr = c1149l.f5165i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c1149l.f5167j0;
                                    if (str != null) {
                                        int[] iArrM3638h = m3638h(barrier, str);
                                        c1149l.f5165i0 = iArrM3638h;
                                        barrier.setReferencedIds(iArrM3638h);
                                    }
                                }
                            }
                            C1141d c1141d = (C1141d) childAt.getLayoutParams();
                            c1141d.m3622a();
                            c1148k.m3633a(c1141d);
                            HashMap map3 = c1148k.f5120f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C1138a c1138a = (C1138a) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strM30461o = !c1138a.f4997a ? AbstractC11266d.m30461o("set", str2) : str2;
                                int i15 = i14;
                                try {
                                    int iM35485e = AbstractC12682p.m35485e(c1138a.f4998b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iM35485e) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strM30461o, cls3).invoke(childAt, Integer.valueOf(c1138a.f4999c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strM30461o, cls2).invoke(childAt, Float.valueOf(c1138a.f5000d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strM30461o, cls3).invoke(childAt, Integer.valueOf(c1138a.f5003g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strM30461o, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c1138a.f5003g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e5) {
                                                e = e5;
                                                StringBuilder sbM53375p = AbstractC18489d0.m53375p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM53375p.append(cls.getName());
                                                Log.e("TransitionLayout", sbM53375p.toString(), e);
                                            } catch (NoSuchMethodException e13) {
                                                e = e13;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM30461o, e);
                                            } catch (InvocationTargetException e14) {
                                                e = e14;
                                                StringBuilder sbM53375p2 = AbstractC18489d0.m53375p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM53375p2.append(cls.getName());
                                                Log.e("TransitionLayout", sbM53375p2.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strM30461o, CharSequence.class).invoke(childAt, c1138a.f5001e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strM30461o, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1138a.f5002f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strM30461o, cls2).invoke(childAt, Float.valueOf(c1138a.f5000d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strM30461o, cls3).invoke(childAt, Integer.valueOf(c1138a.f4999c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e15) {
                                    e = e15;
                                    map = map3;
                                } catch (NoSuchMethodException e16) {
                                    e = e16;
                                    map = map3;
                                } catch (InvocationTargetException e17) {
                                    e = e17;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i14 = i15;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i13 = i14;
                            childAt.setLayoutParams(c1141d);
                            if (c1151n.f5200b == 0) {
                                childAt.setVisibility(c1151n.f5199a);
                            }
                            childAt.setAlpha(c1151n.f5201c);
                            childAt.setRotation(c1152o.f5204a);
                            childAt.setRotationX(c1152o.f5205b);
                            childAt.setRotationY(c1152o.f5206c);
                            childAt.setScaleX(c1152o.f5207d);
                            childAt.setScaleY(c1152o.f5208e);
                            if (c1152o.f5211h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c1152o.f5211h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c1152o.f5209f)) {
                                    childAt.setPivotX(c1152o.f5209f);
                                }
                                if (!Float.isNaN(c1152o.f5210g)) {
                                    childAt.setPivotY(c1152o.f5210g);
                                }
                            }
                            childAt.setTranslationX(c1152o.f5212i);
                            childAt.setTranslationY(c1152o.f5213j);
                            childAt.setTranslationZ(c1152o.f5214k);
                            if (c1152o.f5215l) {
                                childAt.setElevation(c1152o.f5216m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i13 = i14;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id4);
                    }
                }
                i14 = i13 + 1;
                c1153p = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i13 = i14;
            i14 = i13 + 1;
            c1153p = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C1148k c1148k2 = (C1148k) map2.get(num);
            if (c1148k2 != null) {
                C1149l c1149l2 = c1148k2.f5118d;
                if (c1149l2.f5163h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c1149l2.f5165i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c1149l2.f5167j0;
                        if (str3 != null) {
                            int[] iArrM3638h2 = m3638h(barrier2, str3);
                            c1149l2.f5165i0 = iArrM3638h2;
                            barrier2.setReferencedIds(iArrM3638h2);
                        }
                    }
                    barrier2.setType(c1149l2.f5159f0);
                    barrier2.setMargin(c1149l2.f5161g0);
                    C1141d c1141dGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m3621k();
                    c1148k2.m3633a(c1141dGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, c1141dGenerateDefaultLayoutParams);
                }
                if (c1149l2.f5148a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1141d c1141dGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c1148k2.m3633a(c1141dGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, c1141dGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = constraintLayout.getChildAt(i16);
            if (childAt2 instanceof AbstractC1139b) {
                ((AbstractC1139b) childAt2).mo3611f(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3646c(int i13, int i14) {
        C1148k c1148k;
        Integer numValueOf = Integer.valueOf(i13);
        HashMap map = this.f5222c;
        if (!map.containsKey(numValueOf) || (c1148k = (C1148k) map.get(Integer.valueOf(i13))) == null) {
            return;
        }
        C1149l c1149l = c1148k.f5118d;
        switch (i14) {
            case 1:
                c1149l.f5164i = -1;
                c1149l.f5162h = -1;
                c1149l.f5127F = -1;
                c1149l.f5134M = Integer.MIN_VALUE;
                return;
            case 2:
                c1149l.f5168k = -1;
                c1149l.f5166j = -1;
                c1149l.f5128G = -1;
                c1149l.f5136O = Integer.MIN_VALUE;
                return;
            case 3:
                c1149l.f5172m = -1;
                c1149l.f5170l = -1;
                c1149l.f5129H = 0;
                c1149l.f5135N = Integer.MIN_VALUE;
                return;
            case 4:
                c1149l.f5174n = -1;
                c1149l.f5176o = -1;
                c1149l.f5130I = 0;
                c1149l.f5137P = Integer.MIN_VALUE;
                return;
            case 5:
                c1149l.f5178p = -1;
                c1149l.f5179q = -1;
                c1149l.f5180r = -1;
                c1149l.f5133L = 0;
                c1149l.f5140S = Integer.MIN_VALUE;
                return;
            case 6:
                c1149l.f5181s = -1;
                c1149l.f5182t = -1;
                c1149l.f5132K = 0;
                c1149l.f5139R = Integer.MIN_VALUE;
                return;
            case 7:
                c1149l.f5183u = -1;
                c1149l.f5184v = -1;
                c1149l.f5131J = 0;
                c1149l.f5138Q = Integer.MIN_VALUE;
                return;
            case 8:
                c1149l.f5123B = -1.0f;
                c1149l.f5122A = -1;
                c1149l.f5188z = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3647d(Context context, int i13) {
        m3648e((ConstraintLayout) LayoutInflater.from(context).inflate(i13, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: e */
    public final void m3648e(ConstraintLayout constraintLayout) {
        int i13;
        HashMap map;
        int i14;
        C1153p c1153p = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c1153p.f5222c;
        map2.clear();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = constraintLayout.getChildAt(i15);
            C1141d c1141d = (C1141d) childAt.getLayoutParams();
            int id4 = childAt.getId();
            if (c1153p.f5221b && id4 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id4))) {
                map2.put(Integer.valueOf(id4), new C1148k());
            }
            C1148k c1148k = (C1148k) map2.get(Integer.valueOf(id4));
            if (c1148k == null) {
                i13 = childCount;
                map = map2;
                i14 = i15;
            } else {
                C1151n c1151n = c1148k.f5116b;
                C1149l c1149l = c1148k.f5118d;
                C1152o c1152o = c1148k.f5119e;
                i13 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i14 = i15;
                HashMap map4 = c1153p.f5220a;
                for (String str : map4.keySet()) {
                    C1138a c1138a = (C1138a) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C1138a(c1138a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C1138a(c1138a, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        StringBuilder sbM53375p = AbstractC18489d0.m53375p(" Custom Attribute \"", str, "\" not found on ");
                        sbM53375p.append(cls.getName());
                        Log.e("TransitionLayout", sbM53375p.toString(), e5);
                    } catch (NoSuchMethodException e13) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e13);
                    } catch (InvocationTargetException e14) {
                        StringBuilder sbM53375p2 = AbstractC18489d0.m53375p(" Custom Attribute \"", str, "\" not found on ");
                        sbM53375p2.append(cls.getName());
                        Log.e("TransitionLayout", sbM53375p2.toString(), e14);
                    }
                    map4 = map5;
                }
                c1148k.f5120f = map3;
                c1148k.f5115a = id4;
                c1149l.f5162h = c1141d.f5046e;
                c1149l.f5164i = c1141d.f5048f;
                c1149l.f5166j = c1141d.f5050g;
                c1149l.f5168k = c1141d.f5052h;
                c1149l.f5170l = c1141d.f5054i;
                c1149l.f5172m = c1141d.f5056j;
                c1149l.f5174n = c1141d.f5058k;
                c1149l.f5176o = c1141d.f5060l;
                c1149l.f5178p = c1141d.f5062m;
                c1149l.f5179q = c1141d.f5064n;
                c1149l.f5180r = c1141d.f5066o;
                c1149l.f5181s = c1141d.f5072s;
                c1149l.f5182t = c1141d.f5073t;
                c1149l.f5183u = c1141d.f5074u;
                c1149l.f5184v = c1141d.f5075v;
                c1149l.f5185w = c1141d.f5016E;
                c1149l.f5186x = c1141d.f5017F;
                c1149l.f5187y = c1141d.f5018G;
                c1149l.f5188z = c1141d.f5068p;
                c1149l.f5122A = c1141d.f5070q;
                c1149l.f5123B = c1141d.f5071r;
                c1149l.f5124C = c1141d.f5031T;
                c1149l.f5125D = c1141d.f5032U;
                c1149l.f5126E = c1141d.f5033V;
                c1149l.f5158f = c1141d.f5042c;
                c1149l.f5154d = c1141d.f5038a;
                c1149l.f5156e = c1141d.f5040b;
                c1149l.f5150b = ((ViewGroup.MarginLayoutParams) c1141d).width;
                c1149l.f5152c = ((ViewGroup.MarginLayoutParams) c1141d).height;
                c1149l.f5127F = ((ViewGroup.MarginLayoutParams) c1141d).leftMargin;
                c1149l.f5128G = ((ViewGroup.MarginLayoutParams) c1141d).rightMargin;
                c1149l.f5129H = ((ViewGroup.MarginLayoutParams) c1141d).topMargin;
                c1149l.f5130I = ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin;
                c1149l.f5133L = c1141d.f5015D;
                c1149l.f5141T = c1141d.f5020I;
                c1149l.f5142U = c1141d.f5019H;
                c1149l.f5144W = c1141d.f5022K;
                c1149l.f5143V = c1141d.f5021J;
                c1149l.f5171l0 = c1141d.f5034W;
                c1149l.f5173m0 = c1141d.f5035X;
                c1149l.f5145X = c1141d.f5023L;
                c1149l.f5146Y = c1141d.f5024M;
                c1149l.f5147Z = c1141d.f5027P;
                c1149l.f5149a0 = c1141d.f5028Q;
                c1149l.f5151b0 = c1141d.f5025N;
                c1149l.f5153c0 = c1141d.f5026O;
                c1149l.f5155d0 = c1141d.f5029R;
                c1149l.f5157e0 = c1141d.f5030S;
                c1149l.f5169k0 = c1141d.f5036Y;
                c1149l.f5135N = c1141d.f5077x;
                c1149l.f5137P = c1141d.f5079z;
                c1149l.f5134M = c1141d.f5076w;
                c1149l.f5136O = c1141d.f5078y;
                c1149l.f5139R = c1141d.f5012A;
                c1149l.f5138Q = c1141d.f5013B;
                c1149l.f5140S = c1141d.f5014C;
                c1149l.f5177o0 = c1141d.f5037Z;
                c1149l.f5131J = c1141d.getMarginEnd();
                c1149l.f5132K = c1141d.getMarginStart();
                c1151n.f5199a = childAt.getVisibility();
                c1151n.f5201c = childAt.getAlpha();
                c1152o.f5204a = childAt.getRotation();
                c1152o.f5205b = childAt.getRotationX();
                c1152o.f5206c = childAt.getRotationY();
                c1152o.f5207d = childAt.getScaleX();
                c1152o.f5208e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1152o.f5209f = pivotX;
                    c1152o.f5210g = pivotY;
                }
                c1152o.f5212i = childAt.getTranslationX();
                c1152o.f5213j = childAt.getTranslationY();
                c1152o.f5214k = childAt.getTranslationZ();
                if (c1152o.f5215l) {
                    c1152o.f5216m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c1149l.f5175n0 = barrier.getAllowsGoneWidget();
                    c1149l.f5165i0 = barrier.getReferencedIds();
                    c1149l.f5159f0 = barrier.getType();
                    c1149l.f5161g0 = barrier.getMargin();
                }
            }
            i15 = i14 + 1;
            c1153p = this;
            childCount = i13;
            map2 = map;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3649f(int i13, int i14, int i15, int i16) {
        Integer numValueOf = Integer.valueOf(i13);
        HashMap map = this.f5222c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i13), new C1148k());
        }
        C1148k c1148k = (C1148k) map.get(Integer.valueOf(i13));
        if (c1148k == null) {
            return;
        }
        C1149l c1149l = c1148k.f5118d;
        switch (i14) {
            case 1:
                if (i16 == 1) {
                    c1149l.f5162h = i15;
                    c1149l.f5164i = -1;
                    return;
                } else if (i16 == 2) {
                    c1149l.f5164i = i15;
                    c1149l.f5162h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m3643o(i16) + " undefined");
                }
            case 2:
                if (i16 == 1) {
                    c1149l.f5166j = i15;
                    c1149l.f5168k = -1;
                    return;
                } else if (i16 == 2) {
                    c1149l.f5168k = i15;
                    c1149l.f5166j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
            case 3:
                if (i16 == 3) {
                    c1149l.f5170l = i15;
                    c1149l.f5172m = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
                c1149l.f5172m = i15;
                c1149l.f5170l = -1;
                c1149l.f5178p = -1;
                c1149l.f5179q = -1;
                c1149l.f5180r = -1;
                return;
            case 4:
                if (i16 == 4) {
                    c1149l.f5176o = i15;
                    c1149l.f5174n = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                    return;
                }
                if (i16 != 3) {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
                c1149l.f5174n = i15;
                c1149l.f5176o = -1;
                c1149l.f5178p = -1;
                c1149l.f5179q = -1;
                c1149l.f5180r = -1;
                return;
            case 5:
                if (i16 == 5) {
                    c1149l.f5178p = i15;
                    c1149l.f5176o = -1;
                    c1149l.f5174n = -1;
                    c1149l.f5170l = -1;
                    c1149l.f5172m = -1;
                    return;
                }
                if (i16 == 3) {
                    c1149l.f5179q = i15;
                    c1149l.f5176o = -1;
                    c1149l.f5174n = -1;
                    c1149l.f5170l = -1;
                    c1149l.f5172m = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
                c1149l.f5180r = i15;
                c1149l.f5176o = -1;
                c1149l.f5174n = -1;
                c1149l.f5170l = -1;
                c1149l.f5172m = -1;
                return;
            case 6:
                if (i16 == 6) {
                    c1149l.f5182t = i15;
                    c1149l.f5181s = -1;
                    return;
                } else if (i16 == 7) {
                    c1149l.f5181s = i15;
                    c1149l.f5182t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
            case 7:
                if (i16 == 7) {
                    c1149l.f5184v = i15;
                    c1149l.f5183u = -1;
                    return;
                } else if (i16 == 6) {
                    c1149l.f5183u = i15;
                    c1149l.f5184v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m3643o(i14) + " to " + m3643o(i16) + " unknown");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3650g(int i13, int i14, int i15, int i16, int i17) {
        Integer numValueOf = Integer.valueOf(i13);
        HashMap map = this.f5222c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i13), new C1148k());
        }
        C1148k c1148k = (C1148k) map.get(Integer.valueOf(i13));
        if (c1148k == null) {
            return;
        }
        C1149l c1149l = c1148k.f5118d;
        switch (i14) {
            case 1:
                if (i16 == 1) {
                    c1149l.f5162h = i15;
                    c1149l.f5164i = -1;
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException("Left to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5164i = i15;
                    c1149l.f5162h = -1;
                }
                c1149l.f5127F = i17;
                return;
            case 2:
                if (i16 == 1) {
                    c1149l.f5166j = i15;
                    c1149l.f5168k = -1;
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5168k = i15;
                    c1149l.f5166j = -1;
                }
                c1149l.f5128G = i17;
                return;
            case 3:
                if (i16 == 3) {
                    c1149l.f5170l = i15;
                    c1149l.f5172m = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                } else {
                    if (i16 != 4) {
                        throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5172m = i15;
                    c1149l.f5170l = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                }
                c1149l.f5129H = i17;
                return;
            case 4:
                if (i16 == 4) {
                    c1149l.f5176o = i15;
                    c1149l.f5174n = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                } else {
                    if (i16 != 3) {
                        throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5174n = i15;
                    c1149l.f5176o = -1;
                    c1149l.f5178p = -1;
                    c1149l.f5179q = -1;
                    c1149l.f5180r = -1;
                }
                c1149l.f5130I = i17;
                return;
            case 5:
                if (i16 == 5) {
                    c1149l.f5178p = i15;
                    c1149l.f5176o = -1;
                    c1149l.f5174n = -1;
                    c1149l.f5170l = -1;
                    c1149l.f5172m = -1;
                    return;
                }
                if (i16 == 3) {
                    c1149l.f5179q = i15;
                    c1149l.f5176o = -1;
                    c1149l.f5174n = -1;
                    c1149l.f5170l = -1;
                    c1149l.f5172m = -1;
                    return;
                }
                if (i16 != 4) {
                    throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                }
                c1149l.f5180r = i15;
                c1149l.f5176o = -1;
                c1149l.f5174n = -1;
                c1149l.f5170l = -1;
                c1149l.f5172m = -1;
                return;
            case 6:
                if (i16 == 6) {
                    c1149l.f5182t = i15;
                    c1149l.f5181s = -1;
                } else {
                    if (i16 != 7) {
                        throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5181s = i15;
                    c1149l.f5182t = -1;
                }
                c1149l.f5132K = i17;
                return;
            case 7:
                if (i16 == 7) {
                    c1149l.f5184v = i15;
                    c1149l.f5183u = -1;
                } else {
                    if (i16 != 6) {
                        throw new IllegalArgumentException("right to " + m3643o(i16) + " undefined");
                    }
                    c1149l.f5183u = i15;
                    c1149l.f5184v = -1;
                }
                c1149l.f5131J = i17;
                return;
            default:
                throw new IllegalArgumentException(m3643o(i14) + " to " + m3643o(i16) + " unknown");
        }
    }

    /* JADX INFO: renamed from: j */
    public final C1148k m3651j(int i13) {
        Integer numValueOf = Integer.valueOf(i13);
        HashMap map = this.f5222c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i13), new C1148k());
        }
        return (C1148k) map.get(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: k */
    public final void m3652k(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C1148k c1148kM3639i = m3639i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1148kM3639i.f5118d.f5148a = true;
                    }
                    this.f5222c.put(Integer.valueOf(c1148kM3639i.f5115a), c1148kM3639i);
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintSet", "Error parsing resource: " + i13, e5);
        } catch (XmlPullParserException e13) {
            Log.e("ConstraintSet", "Error parsing resource: " + i13, e13);
        }
    }
}
