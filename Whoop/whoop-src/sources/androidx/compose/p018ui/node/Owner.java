package androidx.compose.p018ui.node;

import p005a3.C0188c2;
import p005a3.C0230n0;
import p005a3.C0238p0;
import p005a3.InterfaceC0272z1;
import p027b3.InterfaceC2376g;
import p027b3.InterfaceC2395j3;
import p027b3.InterfaceC2410m3;
import p027b3.InterfaceC2433r1;
import p027b3.InterfaceC2438s1;
import p027b3.InterfaceC2464x2;
import p027b3.InterfaceC2473z2;
import p042c2.AbstractC3866k;
import p042c2.C3868m;
import p042c2.InterfaceC3863h;
import p106e2.InterfaceC12588c;
import p164g2.InterfaceC15239k;
import p208i2.InterfaceC17883f0;
import p209i3.C18036r;
import p241j3.C21265b;
import p392p3.InterfaceC28769g;
import p392p3.InterfaceC28770h;
import p411q2.InterfaceC29805a;
import p412q3.C29892z;
import p447r2.InterfaceC30861b;
import p512u2.InterfaceC34470p;
import p635y2.AbstractC39101i1;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p669z2.C40001d;
import p715kotlin.Metadata;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m65681d2 = {"Landroidx/compose/ui/node/Owner;", "", "a3/n0", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface Owner {
    InterfaceC2376g getAccessibilityManager();

    InterfaceC3863h getAutofill();

    AbstractC3866k getAutofillManager();

    C3868m getAutofillTree();

    InterfaceC2433r1 getClipboard();

    InterfaceC2438s1 getClipboardManager();

    InterfaceC30063j getCoroutineContext();

    InterfaceC39171c getDensity();

    InterfaceC12588c getDragAndDropManager();

    InterfaceC15239k getFocusOwner();

    InterfaceC28770h getFontFamilyResolver();

    InterfaceC28769g getFontLoader();

    InterfaceC17883f0 getGraphicsContext();

    InterfaceC29805a getHapticFeedBack();

    InterfaceC30861b getInputModeManager();

    EnumC39181m getLayoutDirection();

    C40001d getModifierLocalManager();

    InterfaceC0272z1 getOutOfFrameExecutor();

    AbstractC39101i1 getPlacementScope();

    InterfaceC34470p getPointerIconService();

    C21265b getRectManager();

    C0230n0 getRoot();

    C18036r getSemanticsOwner();

    C0238p0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    C0188c2 getSnapshotObserver();

    InterfaceC2464x2 getSoftwareKeyboardController();

    C29892z getTextInputService();

    InterfaceC2473z2 getTextToolbar();

    InterfaceC2395j3 getViewConfiguration();

    InterfaceC2410m3 getWindowInfo();

    void setShowLayoutBounds(boolean z4);
}
