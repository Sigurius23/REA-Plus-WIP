package p027b3;

import ad3.C0783z;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p002a0.AbstractC0050s;
import p002a0.AbstractC0065z0;
import p002a0.C0017e0;
import p002a0.C0020f0;
import p002a0.C0024g1;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p028b4.AbstractC2701l;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import p107e3.AbstractC12602c;
import p171g9.C15585b;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18040v;
import p209i3.C18017a;
import p209i3.C18019b;
import p209i3.C18022d;
import p209i3.C18024f;
import p209i3.C18026h;
import p209i3.C18027i;
import p209i3.C18028j;
import p209i3.C18030l;
import p209i3.C18034p;
import p209i3.C18035q;
import p209i3.C18043y;
import p211i5.AbstractC18092e;
import p211i5.C18091d;
import p211i5.C18093f;
import p271k3.EnumC22167a;
import p294l3.AbstractC23256h;
import p294l3.AbstractC23284v;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23282u;
import p294l3.C23287w0;
import p294l3.C23289x0;
import p392p3.AbstractC28771i;
import p392p3.C28772j;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.C28782t;
import p392p3.InterfaceC28770h;
import p474s.C31983m2;
import p479s4.AbstractC32123d;
import p493t3.AbstractC33497i;
import p493t3.C33493e;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.InterfaceC36779o;
import p603x2.AbstractC37831a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import se.AbstractC32416g;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: b3.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2362d0 extends C0783z {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2382h0 f9326y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2362d0(C2382h0 c2382h0) {
        super(14);
        this.f9326y = c2382h0;
    }

    @Override // ad3.C0783z
    /* JADX INFO: renamed from: d */
    public final void mo1860d(int i13, C18093f c18093f, String str, Bundle bundle) {
        this.f9326y.m7375j(i13, c18093f, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:246:0x057d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0587  */
    /* JADX WARN: Code duplicated, block: B:249:0x058e  */
    /* JADX WARN: Code duplicated, block: B:285:0x065f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0663  */
    /* JADX WARN: Code duplicated, block: B:288:0x0665  */
    /* JADX WARN: Code duplicated, block: B:290:0x0668  */
    /* JADX WARN: Code duplicated, block: B:291:0x066a  */
    /* JADX WARN: Code duplicated, block: B:293:0x066d  */
    /* JADX WARN: Code duplicated, block: B:294:0x066f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0683  */
    /* JADX WARN: Code duplicated, block: B:301:0x0691  */
    /* JADX WARN: Code duplicated, block: B:306:0x069b  */
    /* JADX WARN: Code duplicated, block: B:307:0x069d  */
    /* JADX WARN: Code duplicated, block: B:313:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:314:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:320:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:328:0x06de  */
    /* JADX WARN: Code duplicated, block: B:330:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:333:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:336:0x0710  */
    /* JADX WARN: Code duplicated, block: B:338:0x071a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0730  */
    /* JADX WARN: Code duplicated, block: B:344:0x0747  */
    /* JADX WARN: Code duplicated, block: B:351:0x076f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0776  */
    /* JADX WARN: Code duplicated, block: B:354:0x0779  */
    /* JADX WARN: Code duplicated, block: B:361:0x0795  */
    /* JADX WARN: Code duplicated, block: B:363:0x0798  */
    /* JADX WARN: Code duplicated, block: B:365:0x07af  */
    /* JADX WARN: Code duplicated, block: B:366:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:373:0x07df  */
    /* JADX WARN: Code duplicated, block: B:382:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:384:0x0805  */
    /* JADX WARN: Code duplicated, block: B:386:0x080b  */
    /* JADX WARN: Code duplicated, block: B:391:0x081c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0820 A[LOOP:8: B:383:0x0803->B:394:0x0820, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:397:0x0828  */
    /* JADX WARN: Code duplicated, block: B:399:0x082e  */
    /* JADX WARN: Code duplicated, block: B:401:0x0836  */
    /* JADX WARN: Code duplicated, block: B:403:0x083e  */
    /* JADX WARN: Code duplicated, block: B:405:0x0841  */
    /* JADX WARN: Code duplicated, block: B:408:0x0846  */
    /* JADX WARN: Code duplicated, block: B:415:0x0868  */
    /* JADX WARN: Code duplicated, block: B:422:0x0880  */
    /* JADX WARN: Code duplicated, block: B:425:0x088d  */
    /* JADX WARN: Code duplicated, block: B:428:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:430:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:431:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:434:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:441:0x0915  */
    /* JADX WARN: Code duplicated, block: B:444:0x0932  */
    /* JADX WARN: Code duplicated, block: B:447:0x0937  */
    /* JADX WARN: Code duplicated, block: B:450:0x0944  */
    /* JADX WARN: Code duplicated, block: B:452:0x0950  */
    /* JADX WARN: Code duplicated, block: B:455:0x0955  */
    /* JADX WARN: Code duplicated, block: B:458:0x0971  */
    /* JADX WARN: Code duplicated, block: B:461:0x0977  */
    /* JADX WARN: Code duplicated, block: B:462:0x0983  */
    /* JADX WARN: Code duplicated, block: B:465:0x0997  */
    /* JADX WARN: Code duplicated, block: B:467:0x099a  */
    /* JADX WARN: Code duplicated, block: B:469:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:471:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:475:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:477:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:478:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:480:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:503:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:505:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:537:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:562:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:568:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:574:0x0bb4 A[LOOP:9: B:573:0x0bb2->B:574:0x0bb4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:577:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:579:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:580:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:582:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:583:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:587:0x0c21 A[LOOP:11: B:586:0x0c1f->B:587:0x0c21, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:588:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:590:0x0c52 A[LOOP:12: B:589:0x0c50->B:590:0x0c52, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:592:0x0c82  */
    /* JADX WARN: Code duplicated, block: B:596:0x0ca7  */
    /* JADX WARN: Code duplicated, block: B:598:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:599:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:601:0x0cc3  */
    /* JADX WARN: Code duplicated, block: B:609:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:647:0x0826 A[EDGE_INSN: B:647:0x0826->B:396:0x0826 BREAK  A[LOOP:8: B:383:0x0803->B:394:0x0820], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x09c0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:475:0x09c9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r3v20, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.util.ArrayList] */
    @Override // ad3.C0783z
    /* JADX INFO: renamed from: i */
    public final C18093f mo1865i(int i13) {
        AccessibilityManager accessibilityManager;
        C0024g1 c0024g1;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C18030l c18030l;
        C18034p c18034p;
        C18027i c18027i;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        Resources resources;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        C18027i c18027i2;
        List list;
        String str;
        int i14;
        C2382h0 c2382h0;
        int i15;
        boolean z4;
        C18024f c18024f;
        C18017a c18017a;
        C18017a c18017a2;
        C18017a c18017a3;
        String strM7360u;
        boolean z13;
        ArrayList arrayList;
        CharSequence charSequenceM51952g;
        boolean z14;
        C18026h c18026h;
        int i16;
        Object objM129g;
        C18019b c18019b;
        ArrayList arrayList2;
        Object objM129g2;
        boolean zM92122l;
        int size;
        List listM51776j;
        int size2;
        int i17;
        C18034p c18034p2;
        C18028j c18028j;
        C18028j c18028j2;
        int iM23d;
        AndroidComposeView androidComposeView;
        Bundle bundle;
        int iM23d2;
        String str2;
        C18093f c18093f;
        AbstractC2701l abstractC2701lM7423o;
        AbstractC2701l abstractC2701lM7423o2;
        C18017a c18017a4;
        C18017a c18017a5;
        C18017a c18017a6;
        C18030l c18030lM51789n;
        C18043y c18043y;
        List list2;
        C0024g1 c0024g2;
        C0039m0 c0039m0M162a;
        C0024g1 c0024g3;
        int size3;
        int i18;
        C0039m0 c0039m0;
        C0020f0 c0020f0;
        int[] iArr;
        int i19;
        int i24;
        ArrayList arrayList3;
        int size4;
        int i25;
        int size5;
        int i26;
        C18022d c18022d;
        boolean z15;
        boolean z16;
        Object objM129g3;
        boolean z17;
        C0230n0 c0230n0;
        boolean z18;
        C18091d c18091d;
        boolean z19;
        C18091d c18091d2;
        Object objM129g4;
        Object objM129g5;
        C18017a c18017a7;
        float f13;
        InterfaceC18280f interfaceC18280f;
        C18043y c18043y2;
        float fFloatValue;
        float fFloatValue2;
        C18017a c18017a8;
        String str3;
        List list3;
        boolean z24;
        C0230n0 c0230n0M588G;
        C18030l c18030lM591I;
        boolean zM65745e;
        Object objM129g6;
        C18030l c18030lM591I2;
        boolean z25;
        boolean z26;
        C18017a c18017a9;
        C18017a c18017a10;
        C18017a c18017a11;
        C18017a c18017a12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z34;
        int i27;
        boolean z35;
        boolean z36;
        boolean zBooleanValue;
        ?? arrayList4;
        int i28;
        int i29;
        boolean zM65745e2;
        C18034p c18034p3;
        int i34;
        AbstractC1638x lifecycle;
        C2382h0 c2382h1 = this.f9326y;
        AccessibilityManager accessibilityManager2 = c2382h1.f9411g;
        AndroidComposeView androidComposeView2 = c2382h1.f9408d;
        C2416o viewTreeOwners = androidComposeView2.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f9472a.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == EnumC1635w.f6325w) {
            if (accessibilityManager2.isEnabled()) {
                c18093f = null;
            } else {
                c18093f = new C18093f(AccessibilityNodeInfo.obtain());
            }
            i14 = i13;
            c2382h0 = c2382h1;
        } else {
            C18035q c18035q = (C18035q) c2382h1.m7385t().m121b(i13);
            if (c18035q == null) {
                if (accessibilityManager2.isEnabled()) {
                    c18093f = null;
                } else {
                    c18093f = new C18093f(AccessibilityNodeInfo.obtain());
                }
                i14 = i13;
                c2382h0 = c2382h1;
            } else {
                C18034p c18034p4 = c18035q.f69993a;
                C18030l c18030lM51786k = c18034p4.m51786k();
                C0230n0 c0230n1 = c18034p4.f69988c;
                Object objM129g7 = c18030lM51786k.f69980w.m129g(AbstractC18039u.f70047n);
                if (objM129g7 == null) {
                    objM129g7 = null;
                }
                boolean zM65745e3 = AbstractC22676k.m65745e(objM129g7, Boolean.TRUE);
                if (!zM65745e3 || AbstractC37978j.m121627J(accessibilityManager2)) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    C18093f c18093f2 = new C18093f(accessibilityNodeInfoObtain);
                    if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC18092e.m51945f(accessibilityNodeInfoObtain, zM65745e3);
                    } else {
                        Bundle extras = accessibilityNodeInfoObtain.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (zM65745e3 ? 64 : 0) | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)));
                        }
                    }
                    if (i13 == -1) {
                        Object parentForAccessibility = androidComposeView2.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        c18093f2.f70318b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        C18034p c18034pM51787l = c18034p4.m51787l();
                        Integer numValueOf = c18034pM51787l != null ? Integer.valueOf(c18034pM51787l.f69992g) : null;
                        if (numValueOf == null) {
                            AbstractC37831a.m121375c("semanticsNode " + i13 + " has null parent");
                            throw new KotlinNothingValueException();
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == androidComposeView2.getSemanticsOwner().m51794a().f69992g) {
                            iIntValue = -1;
                        }
                        c18093f2.f70318b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                    }
                    c18093f2.f70319c = i13;
                    accessibilityNodeInfoObtain.setSource(androidComposeView2, i13);
                    accessibilityNodeInfoObtain.setBoundsInScreen(c2382h1.m7376k(c18035q));
                    C0020f0 c0020f1 = C2382h0.f9391Q;
                    C0017e0 c0017e0 = c2382h1.f9404M;
                    C0024g1 c0024g4 = c2382h1.f9426v;
                    Resources resources2 = androidComposeView2.getContext().getResources();
                    c18093f2.m51953h("android.view.View");
                    C18030l c18030l2 = c18034p4.f69989d;
                    C0057v0 c0057v0 = c18030l2.f69980w;
                    if (c0057v0.m125c(AbstractC18039u.f70023E)) {
                        c18093f2.m51953h("android.widget.EditText");
                    }
                    if (c0057v0.m125c(AbstractC18039u.f70019A)) {
                        c18093f2.m51953h("android.widget.TextView");
                    }
                    Object objM129g8 = c0057v0.m129g(AbstractC18039u.f70057x);
                    if (objM129g8 == null) {
                        objM129g8 = null;
                    }
                    C18027i c18027i3 = (C18027i) objM129g8;
                    if (c18027i3 != null) {
                        int i35 = c18027i3.f69949a;
                        accessibilityManager = accessibilityManager2;
                        if (c18034p4.f69990e) {
                            i34 = 4;
                            c0024g1 = c0024g4;
                        } else {
                            i34 = 4;
                            c0024g1 = c0024g4;
                            if (C18034p.m51776j(4, c18034p4).isEmpty()) {
                            }
                        }
                        if (i35 == i34) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                        } else if (i35 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                        } else {
                            String strM7424p = AbstractC2417o0.m7424p(i35);
                            if (i35 != 5 || c18034p4.m51791p() || c18030l2.f69982y) {
                                c18093f2.m51953h(strM7424p);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c0024g1 = c0024g4;
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(AbstractC18037s.m51801f(c18034p4));
                    boolean zM121627J = AbstractC37978j.m121627J(accessibilityManager);
                    List listM51776j2 = C18034p.m51776j(4, c18034p4);
                    int size6 = listM51776j2.size();
                    int i36 = 0;
                    int i37 = 0;
                    while (true) {
                        accessibilityNodeInfo = c18093f2.f70317a;
                        if (i36 >= size6) {
                            break;
                        }
                        int i38 = i36;
                        C18034p c18034p5 = (C18034p) listM51776j2.get(i36);
                        int i39 = size6;
                        AbstractC0050s abstractC0050sM7385t = c2382h1.m7385t();
                        List list4 = listM51776j2;
                        int i44 = c18034p5.f69992g;
                        if (abstractC0050sM7385t.m120a(i44)) {
                            AbstractC2701l abstractC2701l = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c18034p5.f69988c);
                            if (i44 != -1) {
                                if (abstractC2701l != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC2701l);
                                } else {
                                    C18035q c18035q2 = (C18035q) c2382h1.m7385t().m121b(i44);
                                    if (c18035q2 == null || (c18034p3 = c18035q2.f69993a) == null) {
                                        zM65745e2 = false;
                                    } else {
                                        Object objM129g9 = c18034p3.m51786k().f69980w.m129g(AbstractC18039u.f70047n);
                                        if (objM129g9 == null) {
                                            objM129g9 = null;
                                        }
                                        zM65745e2 = AbstractC22676k.m65745e(objM129g9, Boolean.TRUE);
                                    }
                                    if (zM121627J || !zM65745e2) {
                                        accessibilityNodeInfo.addChild(androidComposeView2, i44);
                                    }
                                }
                                c0017e0.m25f(i44, i37);
                                i37++;
                            }
                        }
                        i36 = i38 + 1;
                        size6 = i39;
                        listM51776j2 = list4;
                    }
                    if (i13 == c2382h1.f9418n) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c18093f2.m51948b(C18091d.f70303g);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c18093f2.m51948b(C18091d.f70302f);
                    }
                    C23254g c23254gM7418j = AbstractC2417o0.m7418j(c18034p4);
                    if (c23254gM7418j != null) {
                        InterfaceC28770h fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                        InterfaceC39171c density = androidComposeView2.getDensity();
                        C31983m2 c31983m2 = c2382h1.f9400I;
                        String str4 = c23254gM7418j.f92135x;
                        List list5 = c23254gM7418j.f92134w;
                        SpannableString spannableString2 = new SpannableString(str4);
                        ArrayList arrayList5 = c23254gM7418j.f92136y;
                        if (arrayList5 != null) {
                            int size7 = arrayList5.size();
                            int i45 = 0;
                            while (i45 < size7) {
                                int i46 = size7;
                                C23250e c23250e = (C23250e) arrayList5.get(i45);
                                ArrayList arrayList6 = arrayList5;
                                C23267m0 c23267m0 = (C23267m0) c23250e.f92125a;
                                int i47 = i45;
                                int i48 = c23250e.f92126b;
                                int i49 = c23250e.f92127c;
                                C18030l c18030l3 = c18030l2;
                                C18034p c18034p6 = c18034p4;
                                C18027i c18027i4 = c18027i3;
                                C23267m0 c23267m0M67325a = C23267m0.m67325a(c23267m0, 0L, null, 65503);
                                InterfaceC36779o interfaceC36779o = c23267m0M67325a.f92191a;
                                C36780p c36780p = c23267m0M67325a.f92200j;
                                C36776l c36776l = c23267m0M67325a.f92203m;
                                AbstractC28771i abstractC28771i = c23267m0M67325a.f92196f;
                                C28776n c28776n = c23267m0M67325a.f92194d;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                AbstractC12350b.m34567P(spannableString2, interfaceC36779o.mo117875b(), i48, i49);
                                SpannableString spannableString3 = spannableString2;
                                AbstractC12350b.m34568Q(spannableString3, c23267m0M67325a.f92192b, density, i48, i49);
                                C28780r c28780r = c23267m0M67325a.f92193c;
                                if (c28780r == null && c28776n == null) {
                                    i28 = 33;
                                } else {
                                    if (c28780r == null) {
                                        c28780r = C28780r.f116539F;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(AbstractC32416g.m101167x(c28780r, c28776n != null ? c28776n.f116535a : 0));
                                    i28 = 33;
                                    spannableString3.setSpan(styleSpan, i48, i49, 33);
                                }
                                if (abstractC28771i == null) {
                                    i29 = i28;
                                } else if (abstractC28771i instanceof C28782t) {
                                    spannableString3.setSpan(new TypefaceSpan(((C28782t) abstractC28771i).f116549F), i48, i49, i28);
                                    i29 = i28;
                                } else {
                                    C28777o c28777o = c23267m0M67325a.f92195e;
                                    Object value = ((C28772j) fontFamilyResolver).m87529b(abstractC28771i, C28780r.f116539F, 0, c28777o != null ? c28777o.f116536a : 65535).getValue();
                                    AbstractC22676k.m65748h(value, "null cannot be cast to non-null type android.graphics.Typeface");
                                    i29 = 33;
                                    spannableString3.setSpan(AbstractC33497i.m105884a((Typeface) value), i48, i49, 33);
                                }
                                if (c36776l != null) {
                                    int i54 = c36776l.f157354a;
                                    if ((i54 | 1) == i54) {
                                        spannableString3.setSpan(new UnderlineSpan(), i48, i49, i29);
                                    }
                                    if ((i54 | 2) == i54) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i48, i49, i29);
                                    }
                                }
                                if (c36780p != null) {
                                    spannableString3.setSpan(new ScaleXSpan(c36780p.f157358a), i48, i49, i29);
                                }
                                AbstractC12350b.m34569R(spannableString3, c23267m0M67325a.f92201k, i48, i49);
                                long j7 = c23267m0M67325a.f92202l;
                                if (j7 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(AbstractC17918w0.m51506H(j7)), i48, i49, 33);
                                }
                                i45 = i47 + 1;
                                spannableString2 = spannableString3;
                                resources2 = resources2;
                                size7 = i46;
                                arrayList5 = arrayList6;
                                c18034p4 = c18034p6;
                                c18030l2 = c18030l3;
                                c18027i3 = c18027i4;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                            }
                        }
                        SpannableString spannableString4 = spannableString2;
                        c18030l = c18030l2;
                        c18034p = c18034p4;
                        c18027i = c18027i3;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        resources = resources2;
                        int length = str4.length();
                        ?? arrayList7 = C25271y.f99162w;
                        if (list5 != null) {
                            arrayList4 = new ArrayList(list5.size());
                            int size8 = list5.size();
                            for (int i55 = 0; i55 < size8; i55++) {
                                Object obj = list5.get(i55);
                                C23250e c23250e2 = (C23250e) obj;
                                if ((c23250e2.f92125a instanceof C23289x0) && AbstractC23256h.m67320b(0, length, c23250e2.f92126b, c23250e2.f92127c)) {
                                    arrayList4.add(obj);
                                }
                            }
                        } else {
                            arrayList4 = arrayList7;
                        }
                        int size9 = ((Collection) arrayList4).size();
                        for (int i56 = 0; i56 < size9; i56++) {
                            C23250e c23250e3 = (C23250e) arrayList4.get(i56);
                            spannableString4.setSpan(AbstractC32123d.m100031k((C23289x0) c23250e3.f92125a), c23250e3.f92126b, c23250e3.f92127c, 33);
                        }
                        int length2 = str4.length();
                        if (list5 != null) {
                            arrayList7 = new ArrayList(list5.size());
                            int size10 = list5.size();
                            for (int i57 = 0; i57 < size10; i57++) {
                                Object obj2 = list5.get(i57);
                                C23250e c23250e4 = (C23250e) obj2;
                                if ((c23250e4.f92125a instanceof C23287w0) && AbstractC23256h.m67320b(0, length2, c23250e4.f92126b, c23250e4.f92127c)) {
                                    arrayList7.add(obj2);
                                }
                            }
                        }
                        int size11 = ((Collection) arrayList7).size();
                        for (int i58 = 0; i58 < size11; i58++) {
                            C23250e c23250e5 = (C23250e) arrayList7.get(i58);
                            C23287w0 c23287w0 = (C23287w0) c23250e5.f92125a;
                            int i59 = c23250e5.f92126b;
                            int i64 = c23250e5.f92127c;
                            WeakHashMap weakHashMap = (WeakHashMap) c31983m2.f132768w;
                            Object uRLSpan = weakHashMap.get(c23287w0);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c23287w0.m67382a());
                                weakHashMap.put(c23287w0, uRLSpan);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan, i59, i64, 33);
                        }
                        List listM67314a = c23254gM7418j.m67314a(str4.length());
                        int size12 = listM67314a.size();
                        for (int i65 = 0; i65 < size12; i65++) {
                            C23250e c23250e6 = (C23250e) listM67314a.get(i65);
                            int i66 = c23250e6.f92126b;
                            Object obj3 = c23250e6.f92125a;
                            int i67 = c23250e6.f92127c;
                            if (i66 != i67) {
                                AbstractC23284v abstractC23284v = (AbstractC23284v) obj3;
                                if ((abstractC23284v instanceof C23282u) && ((C23282u) abstractC23284v).f92250c == null) {
                                    AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    C23282u c23282u = (C23282u) obj3;
                                    C23250e c23250e7 = new C23250e(c23282u, i66, i67);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) c31983m2.f132769x;
                                    Object uRLSpan2 = weakHashMap2.get(c23250e7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(c23282u.f92248a);
                                        weakHashMap2.put(c23250e7, uRLSpan2);
                                    }
                                    spannableString4.setSpan((URLSpan) uRLSpan2, i66, i67, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) c31983m2.f132770y;
                                    Object c33493e = weakHashMap3.get(c23250e6);
                                    if (c33493e == null) {
                                        c33493e = new C33493e(abstractC23284v);
                                        weakHashMap3.put(c23250e6, c33493e);
                                    }
                                    spannableString4.setSpan((ClickableSpan) c33493e, i66, i67, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) C2382h0.m7359O(spannableString4);
                    } else {
                        c18030l = c18030l2;
                        c18034p = c18034p4;
                        c18027i = c18027i3;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        c0017e0 = c0017e0;
                        resources = resources2;
                        spannableString = null;
                    }
                    c18093f2.m51957l(spannableString);
                    C18043y c18043y3 = AbstractC18039u.f70029K;
                    if (c0057v0.m125c(c18043y3)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo3;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        Object objM129g10 = c0057v0.m129g(c18043y3);
                        if (objM129g10 == null) {
                            objM129g10 = null;
                        }
                        accessibilityNodeInfo5 = accessibilityNodeInfo2;
                        accessibilityNodeInfo5.setError((CharSequence) objM129g10);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo3;
                        accessibilityNodeInfo5 = accessibilityNodeInfo2;
                    }
                    Resources resources3 = resources;
                    C18034p c18034p7 = c18034p;
                    String strM7417i = AbstractC2417o0.m7417i(c18034p7, resources3);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC12602c.m35326h(accessibilityNodeInfo5, strM7417i);
                    } else {
                        accessibilityNodeInfo5.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM7417i);
                    }
                    accessibilityNodeInfo5.setCheckable(AbstractC2417o0.m7416h(c18034p7));
                    Object objM129g11 = c0057v0.m129g(AbstractC18039u.f70027I);
                    if (objM129g11 == null) {
                        objM129g11 = null;
                    }
                    EnumC22167a enumC22167a = (EnumC22167a) objM129g11;
                    if (enumC22167a != null) {
                        if (enumC22167a == EnumC22167a.f85977w) {
                            accessibilityNodeInfo5.setChecked(true);
                        } else if (enumC22167a == EnumC22167a.f85978x) {
                            accessibilityNodeInfo5.setChecked(false);
                        }
                    }
                    Object objM129g12 = c0057v0.m129g(AbstractC18039u.f70026H);
                    if (objM129g12 == null) {
                        objM129g12 = null;
                    }
                    Boolean bool = (Boolean) objM129g12;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c18027i == null) {
                            c18027i2 = c18027i;
                        } else {
                            c18027i2 = c18027i;
                            if (c18027i2.f69949a == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo5.setChecked(zBooleanValue2);
                    } else {
                        c18027i2 = c18027i;
                    }
                    C18030l c18030l4 = c18030l;
                    if (c18030l4.f69982y) {
                        c18034p7.getClass();
                        if (C18034p.m51776j(4, c18034p7).isEmpty()) {
                            list = (List) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70034a);
                            if (list != null) {
                                str = (String) AbstractC25265s.m74100H0(list);
                            } else {
                                str = null;
                            }
                            accessibilityNodeInfo5.setContentDescription(str);
                        }
                    } else {
                        list = (List) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70034a);
                        if (list != null) {
                            str = (String) AbstractC25265s.m74100H0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo5.setContentDescription(str);
                    }
                    String str5 = (String) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70058y);
                    if (str5 != null) {
                        C18034p c18034pM51787l2 = c18034p7;
                        while (true) {
                            if (c18034pM51787l2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            C18030l c18030l5 = c18034pM51787l2.f69989d;
                            C18043y c18043y4 = AbstractC18040v.f70060a;
                            if (c18030l5.f69980w.m125c(c18043y4)) {
                                zBooleanValue = ((Boolean) c18030l5.m51770c(c18043y4)).booleanValue();
                                break;
                            }
                            c18034pM51787l2 = c18034pM51787l2.m51787l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str5);
                        }
                    }
                    if (((C23454a0) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70041h)) != null) {
                        accessibilityNodeInfo5.setHeading(true);
                    }
                    i14 = i13;
                    if (i14 != -1) {
                        int iM23d3 = c0017e0.m23d(c18034p7.f69992g);
                        if (iM23d3 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iM23d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(c0057v0.m125c(AbstractC18039u.f70028J));
                    accessibilityNodeInfo4.setEditable(c0057v0.m125c(AbstractC18039u.f70031M));
                    Integer num = (Integer) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70032N);
                    accessibilityNodeInfo5.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfo5.setEnabled(AbstractC2417o0.m7409a(c18034p7));
                    C18043y c18043y5 = AbstractC18039u.f70044k;
                    accessibilityNodeInfo5.setFocusable(c0057v0.m125c(c18043y5));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo5.setFocused(((Boolean) c18030l4.m51770c(c18043y5)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            i15 = 2;
                            c18093f2.m51947a(2);
                            c2382h0 = c2382h1;
                            c2382h0.f9419o = i14;
                        } else {
                            c2382h0 = c2382h1;
                            i15 = 2;
                            z4 = true;
                            c18093f2.m51947a(1);
                        }
                        accessibilityNodeInfo5.setVisibleToUser(AbstractC18037s.m51800e(c18034p7) ^ z4);
                        c18024f = (C18024f) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70043j);
                        if (c18024f != null) {
                            i27 = c18024f.f69940a;
                            if (i27 == 0) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            if (z35) {
                                i15 = 1;
                            } else {
                                if (i27 == 1) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                if (!z36) {
                                    i15 = 1;
                                }
                            }
                            accessibilityNodeInfo4.setLiveRegion(i15);
                        }
                        accessibilityNodeInfo5.setClickable(false);
                        c18017a = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69955b);
                        if (c18017a != null) {
                            boolean zM65745e4 = AbstractC22676k.m65745e(AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70026H), Boolean.TRUE);
                            if (c18027i2 == null && c18027i2.f69949a == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if (z27) {
                                z28 = true;
                            } else {
                                if (c18027i2 == null && c18027i2.f69949a == 3) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if (z34) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                            }
                            if (z28 || (z28 && !zM65745e4)) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            accessibilityNodeInfo5.setClickable(z29);
                            if (AbstractC2417o0.m7409a(c18034p7) && accessibilityNodeInfo4.isClickable()) {
                                c18093f2.m51948b(new C18091d(16, c18017a.f69928a));
                            }
                        }
                        accessibilityNodeInfo5.setLongClickable(false);
                        c18017a2 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69956c);
                        if (c18017a2 != null) {
                            accessibilityNodeInfo5.setLongClickable(true);
                            if (AbstractC2417o0.m7409a(c18034p7)) {
                                c18093f2.m51948b(new C18091d(32, c18017a2.f69928a));
                            }
                        }
                        c18017a3 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69969p);
                        if (c18017a3 != null) {
                            c18093f2.m51948b(new C18091d(DfuBaseService.ERROR_CONNECTION_MASK, c18017a3.f69928a));
                        }
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            c18017a9 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69963j);
                            if (c18017a9 != null) {
                                c18093f2.m51948b(new C18091d(2097152, c18017a9.f69928a));
                            }
                            c18017a10 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69968o);
                            if (c18017a10 != null) {
                                c18093f2.m51948b(new C18091d(android.R.id.accessibilityActionImeEnter, c18017a10.f69928a));
                            }
                            c18017a11 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69970q);
                            if (c18017a11 != null) {
                                c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, c18017a11.f69928a));
                            }
                            c18017a12 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69971r);
                            if (c18017a12 != null && accessibilityNodeInfo4.isFocused()) {
                                primaryClipDescription = androidComposeView2.getClipboardManager().f9446a.getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c18093f2.m51948b(new C18091d(32768, c18017a12.f69928a));
                                }
                            }
                        }
                        strM7360u = C2382h0.m7360u(c18034p7);
                        if (strM7360u != null || strM7360u.length() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            accessibilityNodeInfo4.setTextSelection(c2382h0.m7384s(c18034p7), c2382h0.m7383r(c18034p7));
                            c18017a8 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69962i);
                            if (c18017a8 != null) {
                                str3 = c18017a8.f69928a;
                            } else {
                                str3 = null;
                            }
                            c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, str3));
                            c18093f2.m51947a(256);
                            c18093f2.m51947a(512);
                            accessibilityNodeInfo5.setMovementGranularities(11);
                            list3 = (List) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70034a);
                            if (list3 != null || list3.isEmpty()) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if (z24 && c0057v0.m125c(AbstractC18029k.f69954a)) {
                                if (c0057v0.m125c(AbstractC18039u.f70023E) || AbstractC22676k.m65745e(AbstractC18037s.m51799d(c18030l4, c18043y5), Boolean.TRUE)) {
                                    c0230n0M588G = c0230n1.m588G();
                                    while (true) {
                                        if (c0230n0M588G == null) {
                                            c0230n0M588G = null;
                                            break;
                                        }
                                        c18030lM591I2 = c0230n0M588G.m591I();
                                        if (c18030lM591I2 != null || !c18030lM591I2.f69982y) {
                                            z25 = false;
                                        } else if (c18030lM591I2.f69980w.m125c(AbstractC18039u.f70023E)) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        if (z25) {
                                            break;
                                        }
                                        c0230n0M588G = c0230n0M588G.m588G();
                                    }
                                    if (c0230n0M588G != null) {
                                        c18030lM591I = c0230n0M588G.m591I();
                                        if (c18030lM591I != null) {
                                            objM129g6 = c18030lM591I.f69980w.m129g(c18043y5);
                                            if (objM129g6 == null) {
                                                objM129g6 = null;
                                            }
                                            zM65745e = AbstractC22676k.m65745e(objM129g6, Boolean.TRUE);
                                        } else {
                                            zM65745e = false;
                                        }
                                        z26 = zM65745e ? false : true;
                                    }
                                }
                                if (!z26) {
                                    accessibilityNodeInfo5.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM51952g = c18093f2.m51952g();
                        if (charSequenceM51952g != null || charSequenceM51952g.length() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14 && c0057v0.m125c(AbstractC18029k.f69954a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (c0057v0.m125c(AbstractC18039u.f70058y)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (c0057v0.m125c(AbstractC18039u.f70033O)) {
                            AbstractC11266d.m30445C(arrayList, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                        c18026h = (C18026h) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70036c);
                        if (c18026h != null) {
                            f13 = c18026h.f69946a;
                            interfaceC18280f = c18026h.f69947b;
                            c18043y2 = AbstractC18029k.f69961h;
                            if (c0057v0.m125c(c18043y2)) {
                                c18093f2.m51953h("android.widget.SeekBar");
                            } else {
                                c18093f2.m51953h("android.widget.ProgressBar");
                            }
                            if (c18026h != C18026h.f69945d) {
                                c18093f2.f70317a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C3632c(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) interfaceC18280f.getStart()).floatValue(), ((Number) interfaceC18280f.mo52651d()).floatValue(), f13)).f14788w);
                            }
                            if (c18034p7.m51789n().f69980w.m125c(c18043y2) && AbstractC2417o0.m7409a(c18034p7)) {
                                if (f13 < AbstractC12889b.m36279j(((Number) interfaceC18280f.mo52651d()).floatValue(), ((Number) interfaceC18280f.getStart()).floatValue())) {
                                    c18093f2.m51948b(C18091d.f70304h);
                                }
                                fFloatValue = ((Number) interfaceC18280f.getStart()).floatValue();
                                fFloatValue2 = ((Number) interfaceC18280f.mo52651d()).floatValue();
                                if (fFloatValue > fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f13 > fFloatValue) {
                                    c18093f2.m51948b(C18091d.f70305i);
                                }
                            }
                        }
                        i16 = Build.VERSION.SDK_INT;
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            objM129g5 = c18034p7.f69989d.f69980w.m129g(AbstractC18029k.f69961h);
                            if (objM129g5 == null) {
                                objM129g5 = null;
                            }
                            c18017a7 = (C18017a) objM129g5;
                            if (c18017a7 != null) {
                                c18093f2.m51948b(new C18091d(android.R.id.accessibilityActionSetProgress, c18017a7.f69928a));
                            }
                        }
                        objM129g = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70039f);
                        if (objM129g == null) {
                            objM129g = null;
                        }
                        c18019b = (C18019b) objM129g;
                        if (c18019b != null) {
                            c18093f2.m51954i(C15585b.m43881c(c18019b.f69931a, c18019b.f69932b, 0, false));
                        } else {
                            arrayList2 = new ArrayList();
                            objM129g2 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70038e);
                            if ((objM129g2 != null ? objM129g2 : null) != null) {
                                listM51776j = C18034p.m51776j(4, c18034p7);
                                size2 = listM51776j.size();
                                for (i17 = 0; i17 < size2; i17++) {
                                    c18034p2 = (C18034p) listM51776j.get(i17);
                                    if (c18034p2.m51786k().f69980w.m125c(AbstractC18039u.f70026H)) {
                                        arrayList2.add(c18034p2);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                zM92122l = AbstractC30060g.m92122l(arrayList2);
                                if (zM92122l) {
                                    size = 1;
                                } else {
                                    size = arrayList2.size();
                                }
                                c18093f2.m51954i(C15585b.m43881c(size, zM92122l ? arrayList2.size() : 1, 0, false));
                            }
                        }
                        AbstractC30060g.m92101W(c18034p7, c18093f2);
                        c18028j = (C18028j) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70053t);
                        C18017a c18017a13 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69957d);
                        if (c18028j != null && c18017a13 != null) {
                            objM129g3 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70039f);
                            if (objM129g3 == null) {
                                objM129g3 = null;
                            }
                            if (objM129g3 == null) {
                                objM129g4 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70038e);
                                if (objM129g4 == null) {
                                    objM129g4 = null;
                                }
                                if (objM129g4 != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (!z17) {
                                c18093f2.m51953h("android.widget.HorizontalScrollView");
                            }
                            if (((Number) c18028j.f69951b.invoke()).floatValue() > 0.0f) {
                                c18093f2.m51956k(true);
                            }
                            if (AbstractC2417o0.m7409a(c18034p7)) {
                                if (C2382h0.m7363z(c18028j)) {
                                    c18093f2.m51948b(C18091d.f70304h);
                                    c0230n0 = c0230n1;
                                    if (c0230n0.f777Y == EnumC39181m.f168424x) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        c18091d2 = C18091d.f70310n;
                                    } else {
                                        c18091d2 = C18091d.f70312p;
                                    }
                                    c18093f2.m51948b(c18091d2);
                                } else {
                                    c0230n0 = c0230n1;
                                }
                                if (C2382h0.m7362y(c18028j)) {
                                    c18093f2.m51948b(C18091d.f70305i);
                                    if (c0230n0.f777Y == EnumC39181m.f168424x) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        c18091d = C18091d.f70312p;
                                    } else {
                                        c18091d = C18091d.f70310n;
                                    }
                                    c18093f2.m51948b(c18091d);
                                }
                            }
                        }
                        c18028j2 = (C18028j) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70054u);
                        if (c18028j2 == null && c18017a13 != null) {
                            Object objM129g13 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70039f);
                            if (objM129g13 == null) {
                                objM129g13 = null;
                            }
                            if (objM129g13 == null) {
                                Object objM129g14 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70038e);
                                if (objM129g14 == null) {
                                    objM129g14 = null;
                                }
                                if (objM129g14 != null) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } else {
                                z16 = true;
                            }
                            if (!z16) {
                                c18093f2.m51953h("android.widget.ScrollView");
                            }
                            if (((Number) c18028j2.f69951b.invoke()).floatValue() > 0.0f) {
                                c18093f2.m51956k(true);
                            }
                            if (AbstractC2417o0.m7409a(c18034p7)) {
                                if (C2382h0.m7363z(c18028j2)) {
                                    c18093f2.m51948b(C18091d.f70304h);
                                    c18093f2.m51948b(C18091d.f70311o);
                                }
                                if (C2382h0.m7362y(c18028j2)) {
                                    c18093f2.m51948b(C18091d.f70305i);
                                    c18093f2.m51948b(C18091d.f70309m);
                                }
                            }
                        }
                        if (i16 >= 29) {
                            AbstractC2417o0.m7412d(c18034p7, c18093f2);
                        }
                        accessibilityNodeInfo5.setPaneTitle((CharSequence) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70037d));
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            c18017a4 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69972s);
                            if (c18017a4 != null) {
                                c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, c18017a4.f69928a));
                            }
                            c18017a5 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69973t);
                            if (c18017a5 != null) {
                                c18093f2.m51948b(new C18091d(524288, c18017a5.f69928a));
                            }
                            c18017a6 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69974u);
                            if (c18017a6 != null) {
                                c18093f2.m51948b(new C18091d(1048576, c18017a6.f69928a));
                            }
                            c18030lM51789n = c18034p7.m51789n();
                            c18043y = AbstractC18029k.f69976w;
                            if (c18030lM51789n.f69980w.m125c(c18043y)) {
                                list2 = (List) c18034p7.m51789n().m51770c(c18043y);
                                if (list2.size() < c0020f1.f47b) {
                                    throw new IllegalStateException(AbstractC18489d0.m53371l(new StringBuilder("Can't have more than "), c0020f1.f47b, " custom actions for one widget"));
                                }
                                c0024g2 = new C0024g1((Object) null);
                                c0039m0M162a = AbstractC0065z0.m162a();
                                c0024g3 = c0024g1;
                                if (c0024g3.m54c(i14)) {
                                    c0039m0 = (C0039m0) c0024g3.m55d(i14);
                                    c0020f0 = new C0020f0();
                                    iArr = c0020f1.f46a;
                                    i19 = c0020f1.f47b;
                                    for (i24 = 0; i24 < i19; i24++) {
                                        c0020f0.m26a(iArr[i24]);
                                    }
                                    arrayList3 = new ArrayList();
                                    size4 = list2.size();
                                    i25 = 0;
                                    while (i25 < size4) {
                                        c18022d = (C18022d) list2.get(i25);
                                        AbstractC22676k.m65747g(c0039m0);
                                        int i68 = size4;
                                        if (c0039m0.m91d(c18022d.m51768a()) >= 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            int iM92e = c0039m0.m92e(c18022d.m51768a());
                                            c0024g2.m57f(iM92e, c18022d.m51768a());
                                            c0039m0M162a.m95h(c18022d.m51768a(), iM92e);
                                            c0020f0.m30e(iM92e);
                                            c18093f2.m51948b(new C18091d(iM92e, c18022d.m51768a()));
                                        } else {
                                            arrayList3.add(c18022d);
                                        }
                                        i25++;
                                        size4 = i68;
                                        c0039m0 = c0039m0;
                                    }
                                    size5 = arrayList3.size();
                                    for (i26 = 0; i26 < size5; i26++) {
                                        C18022d c18022d2 = (C18022d) arrayList3.get(i26);
                                        int iM28c = c0020f0.m28c(i26);
                                        c0024g2.m57f(iM28c, c18022d2.m51768a());
                                        c0039m0M162a.m95h(c18022d2.m51768a(), iM28c);
                                        c18093f2.m51948b(new C18091d(iM28c, c18022d2.m51768a()));
                                    }
                                } else {
                                    size3 = list2.size();
                                    for (i18 = 0; i18 < size3; i18++) {
                                        C18022d c18022d3 = (C18022d) list2.get(i18);
                                        int iM28c2 = c0020f1.m28c(i18);
                                        c0024g2.m57f(iM28c2, c18022d3.m51768a());
                                        c0039m0M162a.m95h(c18022d3.m51768a(), iM28c2);
                                        c18093f2.m51948b(new C18091d(iM28c2, c18022d3.m51768a()));
                                    }
                                }
                                c2382h0.f9425u.m57f(i14, c0024g2);
                                c0024g3.m57f(i14, c0039m0M162a);
                            }
                        }
                        accessibilityNodeInfo5.setScreenReaderFocusable(AbstractC2417o0.m7411c(c18034p7, resources3));
                        iM23d = c2382h0.f9396E.m23d(i14);
                        if (iM23d != -1) {
                            abstractC2701lM7423o2 = AbstractC2417o0.m7423o(androidComposeView2.getAndroidViewsHandler$ui_release(), iM23d);
                            if (abstractC2701lM7423o2 != null) {
                                accessibilityNodeInfo5.setTraversalBefore(abstractC2701lM7423o2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iM23d);
                            }
                            bundle = null;
                            c2382h0.m7375j(i14, c18093f2, c2382h0.f9398G, null);
                        } else {
                            androidComposeView = androidComposeView2;
                            bundle = null;
                        }
                        iM23d2 = c2382h0.f9397F.m23d(i14);
                        if (iM23d2 != -1 && (abstractC2701lM7423o = AbstractC2417o0.m7423o(androidComposeView.getAndroidViewsHandler$ui_release(), iM23d2)) != null) {
                            accessibilityNodeInfo5.setTraversalAfter(abstractC2701lM7423o);
                            c2382h0.m7375j(i14, c18093f2, c2382h0.f9399H, bundle);
                        }
                        str2 = (String) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18040v.f70061b);
                        if (str2 != null) {
                            c18093f2.m51953h(str2);
                        }
                        c18093f = c18093f2;
                    } else {
                        c2382h0 = c2382h1;
                        i15 = 2;
                    }
                    z4 = true;
                    accessibilityNodeInfo5.setVisibleToUser(AbstractC18037s.m51800e(c18034p7) ^ z4);
                    c18024f = (C18024f) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70043j);
                    if (c18024f != null) {
                        i27 = c18024f.f69940a;
                        if (i27 == 0) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        if (z35) {
                            if (i27 == 1) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            if (!z36) {
                                i15 = 1;
                            }
                        } else {
                            i15 = 1;
                        }
                        accessibilityNodeInfo4.setLiveRegion(i15);
                    }
                    accessibilityNodeInfo5.setClickable(false);
                    c18017a = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69955b);
                    if (c18017a != null) {
                        boolean zM65745e5 = AbstractC22676k.m65745e(AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70026H), Boolean.TRUE);
                        if (c18027i2 == null) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        if (z27) {
                            z28 = true;
                        } else {
                            if (c18027i2 == null) {
                                z34 = false;
                            } else {
                                z34 = true;
                            }
                            if (z34) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        }
                        if (z28) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        accessibilityNodeInfo5.setClickable(z29);
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            c18093f2.m51948b(new C18091d(16, c18017a.f69928a));
                        }
                    }
                    accessibilityNodeInfo5.setLongClickable(false);
                    c18017a2 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69956c);
                    if (c18017a2 != null) {
                        accessibilityNodeInfo5.setLongClickable(true);
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            c18093f2.m51948b(new C18091d(32, c18017a2.f69928a));
                        }
                    }
                    c18017a3 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69969p);
                    if (c18017a3 != null) {
                        c18093f2.m51948b(new C18091d(DfuBaseService.ERROR_CONNECTION_MASK, c18017a3.f69928a));
                    }
                    if (AbstractC2417o0.m7409a(c18034p7)) {
                        c18017a9 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69963j);
                        if (c18017a9 != null) {
                            c18093f2.m51948b(new C18091d(2097152, c18017a9.f69928a));
                        }
                        c18017a10 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69968o);
                        if (c18017a10 != null) {
                            c18093f2.m51948b(new C18091d(android.R.id.accessibilityActionImeEnter, c18017a10.f69928a));
                        }
                        c18017a11 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69970q);
                        if (c18017a11 != null) {
                            c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, c18017a11.f69928a));
                        }
                        c18017a12 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69971r);
                        if (c18017a12 != null) {
                            primaryClipDescription = androidComposeView2.getClipboardManager().f9446a.getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c18093f2.m51948b(new C18091d(32768, c18017a12.f69928a));
                            }
                        }
                    }
                    strM7360u = C2382h0.m7360u(c18034p7);
                    if (strM7360u != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        accessibilityNodeInfo4.setTextSelection(c2382h0.m7384s(c18034p7), c2382h0.m7383r(c18034p7));
                        c18017a8 = (C18017a) AbstractC18037s.m51799d(c18030l4, AbstractC18029k.f69962i);
                        if (c18017a8 != null) {
                            str3 = c18017a8.f69928a;
                        } else {
                            str3 = null;
                        }
                        c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, str3));
                        c18093f2.m51947a(256);
                        c18093f2.m51947a(512);
                        accessibilityNodeInfo5.setMovementGranularities(11);
                        list3 = (List) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70034a);
                        if (list3 != null) {
                            z24 = true;
                        } else {
                            z24 = true;
                        }
                        if (z24) {
                            if (c0057v0.m125c(AbstractC18039u.f70023E)) {
                                c0230n0M588G = c0230n1.m588G();
                                while (true) {
                                    if (c0230n0M588G == null) {
                                        c0230n0M588G = null;
                                        break;
                                    }
                                    c18030lM591I2 = c0230n0M588G.m591I();
                                    if (c18030lM591I2 != null) {
                                        z25 = false;
                                    } else {
                                        z25 = false;
                                    }
                                    if (z25) {
                                        break;
                                        break;
                                    }
                                    c0230n0M588G = c0230n0M588G.m588G();
                                }
                                if (c0230n0M588G != null) {
                                    c18030lM591I = c0230n0M588G.m591I();
                                    if (c18030lM591I != null) {
                                        objM129g6 = c18030lM591I.f69980w.m129g(c18043y5);
                                        if (objM129g6 == null) {
                                            objM129g6 = null;
                                        }
                                        zM65745e = AbstractC22676k.m65745e(objM129g6, Boolean.TRUE);
                                    } else {
                                        zM65745e = false;
                                    }
                                    if (zM65745e) {
                                    }
                                }
                            } else {
                                c0230n0M588G = c0230n1.m588G();
                                while (true) {
                                    if (c0230n0M588G == null) {
                                        c0230n0M588G = null;
                                        break;
                                    }
                                    c18030lM591I2 = c0230n0M588G.m591I();
                                    if (c18030lM591I2 != null) {
                                        z25 = false;
                                    } else {
                                        z25 = false;
                                    }
                                    if (z25) {
                                        break;
                                        break;
                                    }
                                    c0230n0M588G = c0230n0M588G.m588G();
                                }
                                if (c0230n0M588G != null) {
                                    c18030lM591I = c0230n0M588G.m591I();
                                    if (c18030lM591I != null) {
                                        objM129g6 = c18030lM591I.f69980w.m129g(c18043y5);
                                        if (objM129g6 == null) {
                                            objM129g6 = null;
                                        }
                                        zM65745e = AbstractC22676k.m65745e(objM129g6, Boolean.TRUE);
                                    } else {
                                        zM65745e = false;
                                    }
                                    if (zM65745e) {
                                    }
                                }
                            }
                            if (!z26) {
                                accessibilityNodeInfo5.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM51952g = c18093f2.m51952g();
                    if (charSequenceM51952g != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (!z14) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (c0057v0.m125c(AbstractC18039u.f70058y)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (c0057v0.m125c(AbstractC18039u.f70033O)) {
                        AbstractC11266d.m30445C(arrayList, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    c18026h = (C18026h) AbstractC18037s.m51799d(c18030l4, AbstractC18039u.f70036c);
                    if (c18026h != null) {
                        f13 = c18026h.f69946a;
                        interfaceC18280f = c18026h.f69947b;
                        c18043y2 = AbstractC18029k.f69961h;
                        if (c0057v0.m125c(c18043y2)) {
                            c18093f2.m51953h("android.widget.SeekBar");
                        } else {
                            c18093f2.m51953h("android.widget.ProgressBar");
                        }
                        if (c18026h != C18026h.f69945d) {
                            c18093f2.f70317a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C3632c(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) interfaceC18280f.getStart()).floatValue(), ((Number) interfaceC18280f.mo52651d()).floatValue(), f13)).f14788w);
                        }
                        if (c18034p7.m51789n().f69980w.m125c(c18043y2)) {
                            if (f13 < AbstractC12889b.m36279j(((Number) interfaceC18280f.mo52651d()).floatValue(), ((Number) interfaceC18280f.getStart()).floatValue())) {
                                c18093f2.m51948b(C18091d.f70304h);
                            }
                            fFloatValue = ((Number) interfaceC18280f.getStart()).floatValue();
                            fFloatValue2 = ((Number) interfaceC18280f.mo52651d()).floatValue();
                            if (fFloatValue > fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f13 > fFloatValue) {
                                c18093f2.m51948b(C18091d.f70305i);
                            }
                        }
                    }
                    i16 = Build.VERSION.SDK_INT;
                    if (AbstractC2417o0.m7409a(c18034p7)) {
                        objM129g5 = c18034p7.f69989d.f69980w.m129g(AbstractC18029k.f69961h);
                        if (objM129g5 == null) {
                            objM129g5 = null;
                        }
                        c18017a7 = (C18017a) objM129g5;
                        if (c18017a7 != null) {
                            c18093f2.m51948b(new C18091d(android.R.id.accessibilityActionSetProgress, c18017a7.f69928a));
                        }
                    }
                    objM129g = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70039f);
                    if (objM129g == null) {
                        objM129g = null;
                    }
                    c18019b = (C18019b) objM129g;
                    if (c18019b != null) {
                        c18093f2.m51954i(C15585b.m43881c(c18019b.f69931a, c18019b.f69932b, 0, false));
                    } else {
                        arrayList2 = new ArrayList();
                        objM129g2 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70038e);
                        if ((objM129g2 != null ? objM129g2 : null) != null) {
                            listM51776j = C18034p.m51776j(4, c18034p7);
                            size2 = listM51776j.size();
                            while (i17 < size2) {
                                c18034p2 = (C18034p) listM51776j.get(i17);
                                if (c18034p2.m51786k().f69980w.m125c(AbstractC18039u.f70026H)) {
                                    arrayList2.add(c18034p2);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            zM92122l = AbstractC30060g.m92122l(arrayList2);
                            if (zM92122l) {
                                size = 1;
                            } else {
                                size = arrayList2.size();
                            }
                            c18093f2.m51954i(C15585b.m43881c(size, zM92122l ? arrayList2.size() : 1, 0, false));
                        }
                    }
                    AbstractC30060g.m92101W(c18034p7, c18093f2);
                    c18028j = (C18028j) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70053t);
                    C18017a c18017a14 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69957d);
                    if (c18028j != null) {
                        objM129g3 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70039f);
                        if (objM129g3 == null) {
                            objM129g3 = null;
                        }
                        if (objM129g3 == null) {
                            objM129g4 = c18034p7.m51786k().f69980w.m129g(AbstractC18039u.f70038e);
                            if (objM129g4 == null) {
                                objM129g4 = null;
                            }
                            if (objM129g4 != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = true;
                        }
                        if (!z17) {
                            c18093f2.m51953h("android.widget.HorizontalScrollView");
                        }
                        if (((Number) c18028j.f69951b.invoke()).floatValue() > 0.0f) {
                            c18093f2.m51956k(true);
                        }
                        if (AbstractC2417o0.m7409a(c18034p7)) {
                            if (C2382h0.m7363z(c18028j)) {
                                c18093f2.m51948b(C18091d.f70304h);
                                c0230n0 = c0230n1;
                                if (c0230n0.f777Y == EnumC39181m.f168424x) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    c18091d2 = C18091d.f70312p;
                                } else {
                                    c18091d2 = C18091d.f70310n;
                                }
                                c18093f2.m51948b(c18091d2);
                            } else {
                                c0230n0 = c0230n1;
                            }
                            if (C2382h0.m7362y(c18028j)) {
                                c18093f2.m51948b(C18091d.f70305i);
                                if (c0230n0.f777Y == EnumC39181m.f168424x) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    c18091d = C18091d.f70310n;
                                } else {
                                    c18091d = C18091d.f70312p;
                                }
                                c18093f2.m51948b(c18091d);
                            }
                        }
                    }
                    c18028j2 = (C18028j) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70054u);
                    if (c18028j2 == null) {
                    }
                    if (i16 >= 29) {
                        AbstractC2417o0.m7412d(c18034p7, c18093f2);
                    }
                    accessibilityNodeInfo5.setPaneTitle((CharSequence) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18039u.f70037d));
                    if (AbstractC2417o0.m7409a(c18034p7)) {
                        c18017a4 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69972s);
                        if (c18017a4 != null) {
                            c18093f2.m51948b(new C18091d(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, c18017a4.f69928a));
                        }
                        c18017a5 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69973t);
                        if (c18017a5 != null) {
                            c18093f2.m51948b(new C18091d(524288, c18017a5.f69928a));
                        }
                        c18017a6 = (C18017a) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18029k.f69974u);
                        if (c18017a6 != null) {
                            c18093f2.m51948b(new C18091d(1048576, c18017a6.f69928a));
                        }
                        c18030lM51789n = c18034p7.m51789n();
                        c18043y = AbstractC18029k.f69976w;
                        if (c18030lM51789n.f69980w.m125c(c18043y)) {
                            list2 = (List) c18034p7.m51789n().m51770c(c18043y);
                            if (list2.size() < c0020f1.f47b) {
                                throw new IllegalStateException(AbstractC18489d0.m53371l(new StringBuilder("Can't have more than "), c0020f1.f47b, " custom actions for one widget"));
                            }
                            c0024g2 = new C0024g1((Object) null);
                            c0039m0M162a = AbstractC0065z0.m162a();
                            c0024g3 = c0024g1;
                            if (c0024g3.m54c(i14)) {
                                c0039m0 = (C0039m0) c0024g3.m55d(i14);
                                c0020f0 = new C0020f0();
                                iArr = c0020f1.f46a;
                                i19 = c0020f1.f47b;
                                while (i24 < i19) {
                                    c0020f0.m26a(iArr[i24]);
                                }
                                arrayList3 = new ArrayList();
                                size4 = list2.size();
                                i25 = 0;
                                while (i25 < size4) {
                                    c18022d = (C18022d) list2.get(i25);
                                    AbstractC22676k.m65747g(c0039m0);
                                    int i69 = size4;
                                    if (c0039m0.m91d(c18022d.m51768a()) >= 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        int iM92e2 = c0039m0.m92e(c18022d.m51768a());
                                        c0024g2.m57f(iM92e2, c18022d.m51768a());
                                        c0039m0M162a.m95h(c18022d.m51768a(), iM92e2);
                                        c0020f0.m30e(iM92e2);
                                        c18093f2.m51948b(new C18091d(iM92e2, c18022d.m51768a()));
                                    } else {
                                        arrayList3.add(c18022d);
                                    }
                                    i25++;
                                    size4 = i69;
                                    c0039m0 = c0039m0;
                                }
                                size5 = arrayList3.size();
                                while (i26 < size5) {
                                    C18022d c18022d4 = (C18022d) arrayList3.get(i26);
                                    int iM28c3 = c0020f0.m28c(i26);
                                    c0024g2.m57f(iM28c3, c18022d4.m51768a());
                                    c0039m0M162a.m95h(c18022d4.m51768a(), iM28c3);
                                    c18093f2.m51948b(new C18091d(iM28c3, c18022d4.m51768a()));
                                }
                            } else {
                                size3 = list2.size();
                                while (i18 < size3) {
                                    C18022d c18022d5 = (C18022d) list2.get(i18);
                                    int iM28c4 = c0020f1.m28c(i18);
                                    c0024g2.m57f(iM28c4, c18022d5.m51768a());
                                    c0039m0M162a.m95h(c18022d5.m51768a(), iM28c4);
                                    c18093f2.m51948b(new C18091d(iM28c4, c18022d5.m51768a()));
                                }
                            }
                            c2382h0.f9425u.m57f(i14, c0024g2);
                            c0024g3.m57f(i14, c0039m0M162a);
                        }
                    }
                    accessibilityNodeInfo5.setScreenReaderFocusable(AbstractC2417o0.m7411c(c18034p7, resources3));
                    iM23d = c2382h0.f9396E.m23d(i14);
                    if (iM23d != -1) {
                        abstractC2701lM7423o2 = AbstractC2417o0.m7423o(androidComposeView2.getAndroidViewsHandler$ui_release(), iM23d);
                        if (abstractC2701lM7423o2 != null) {
                            accessibilityNodeInfo5.setTraversalBefore(abstractC2701lM7423o2);
                            androidComposeView = androidComposeView2;
                        } else {
                            androidComposeView = androidComposeView2;
                            accessibilityNodeInfo5.setTraversalBefore(androidComposeView, iM23d);
                        }
                        bundle = null;
                        c2382h0.m7375j(i14, c18093f2, c2382h0.f9398G, null);
                    } else {
                        androidComposeView = androidComposeView2;
                        bundle = null;
                    }
                    iM23d2 = c2382h0.f9397F.m23d(i14);
                    if (iM23d2 != -1) {
                        accessibilityNodeInfo5.setTraversalAfter(abstractC2701lM7423o);
                        c2382h0.m7375j(i14, c18093f2, c2382h0.f9399H, bundle);
                    }
                    str2 = (String) AbstractC18037s.m51799d(c18034p7.m51789n(), AbstractC18040v.f70061b);
                    if (str2 != null) {
                        c18093f2.m51953h(str2);
                    }
                    c18093f = c18093f2;
                } else {
                    i14 = i13;
                    c2382h0 = c2382h1;
                    c18093f = null;
                }
            }
        }
        if (c2382h0.f9422r) {
            if (i14 == c2382h0.f9418n) {
                c2382h0.f9420p = c18093f;
            }
            if (i14 == c2382h0.f9419o) {
                c2382h0.f9421q = c18093f;
            }
        }
        return c18093f;
    }

    @Override // ad3.C0783z
    /* JADX INFO: renamed from: k */
    public final C18093f mo1867k(int i13) {
        C2382h0 c2382h0 = this.f9326y;
        if (i13 != 1) {
            if (i13 == 2) {
                return mo1865i(c2382h0.f9418n);
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown focus type: "));
        }
        int i14 = c2382h0.f9419o;
        if (i14 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1865i(i14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0244  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:257:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:264:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:269:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:272:0x03df  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:280:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:287:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:290:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:292:0x0406  */
    /* JADX WARN: Code duplicated, block: B:295:0x0411  */
    /* JADX WARN: Code duplicated, block: B:298:0x0416  */
    /* JADX WARN: Code duplicated, block: B:300:0x041a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0432  */
    /* JADX WARN: Code duplicated, block: B:305:0x044b  */
    /* JADX WARN: Code duplicated, block: B:308:0x0450  */
    /* JADX WARN: Code duplicated, block: B:310:0x0458  */
    /* JADX WARN: Code duplicated, block: B:312:0x045f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0466  */
    /* JADX WARN: Code duplicated, block: B:317:0x0478  */
    /* JADX WARN: Code duplicated, block: B:319:0x0493  */
    /* JADX WARN: Code duplicated, block: B:322:0x0498  */
    /* JADX WARN: Code duplicated, block: B:327:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:330:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:334:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:336:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:339:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x0555  */
    /* JADX WARN: Code duplicated, block: B:382:0x0561  */
    /* JADX WARN: Code duplicated, block: B:385:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:387:0x056a  */
    /* JADX WARN: Code duplicated, block: B:388:0x056f  */
    /* JADX WARN: Code duplicated, block: B:390:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x057e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0585  */
    /* JADX WARN: Code duplicated, block: B:396:0x058d  */
    /* JADX WARN: Code duplicated, block: B:403:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:405:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:407:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:408:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:410:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:412:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:413:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:416:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:514:0x0702  */
    /* JADX WARN: Code duplicated, block: B:516:0x070c  */
    /* JADX WARN: Code duplicated, block: B:523:0x071e  */
    /* JADX WARN: Code duplicated, block: B:524:0x0728  */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x01ae, code lost:
    
        r1 = null;
     */
    @Override // ad3.C0783z
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1874s(int r21, int r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 2146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027b3.C2362d0.mo1874s(int, int, android.os.Bundle):boolean");
    }
}
