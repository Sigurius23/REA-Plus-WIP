package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import b30.C2570m;
import com.iterable.iterableapi.CallableC5355n1;
import com.whoop.android.R;
import dj.AbstractC12062g;
import dj.ChoreographerFrameCallbackC12060e;
import ht.CallableC17617f;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import lr.RunnableC24693e;
import p000.AbstractC11266d;
import p078d1.C11457j;
import p249jc.CallableC21575f;
import p426qi.AbstractC30373b;
import p426qi.AbstractC30382f0;
import p426qi.AbstractC30388i0;
import p426qi.AbstractC30391l;
import p426qi.C30374b0;
import p426qi.C30377d;
import p426qi.C30378d0;
import p426qi.C30380e0;
import p426qi.C30381f;
import p426qi.C30385h;
import p426qi.C30386h0;
import p426qi.C30387i;
import p426qi.C30395p;
import p426qi.C30402w;
import p426qi.CallableC30379e;
import p426qi.EnumC30371a;
import p426qi.EnumC30383g;
import p426qi.EnumC30384g0;
import p426qi.EnumC30403x;
import p426qi.InterfaceC30372a0;
import p426qi.InterfaceC30375c;
import p426qi.InterfaceC30405z;
import p479s4.AbstractC32122c;
import p584wi.C37305e;
import p682zi.C40653c;
import vi.C36055a;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: N */
    public static final C30377d f20244N = new C30377d();

    /* JADX INFO: renamed from: E */
    public final C30402w f20245E;

    /* JADX INFO: renamed from: F */
    public String f20246F;

    /* JADX INFO: renamed from: G */
    public int f20247G;

    /* JADX INFO: renamed from: H */
    public boolean f20248H;

    /* JADX INFO: renamed from: I */
    public boolean f20249I;

    /* JADX INFO: renamed from: J */
    public boolean f20250J;

    /* JADX INFO: renamed from: K */
    public final HashSet f20251K;

    /* JADX INFO: renamed from: L */
    public final HashSet f20252L;

    /* JADX INFO: renamed from: M */
    public C30378d0 f20253M;

    /* JADX INFO: renamed from: w */
    public final C30385h f20254w;

    /* JADX INFO: renamed from: x */
    public final C30385h f20255x;

    /* JADX INFO: renamed from: y */
    public InterfaceC30405z f20256y;

    /* JADX INFO: renamed from: z */
    public int f20257z;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet);
        this.f20254w = new C30385h(this, 1);
        this.f20255x = new C30385h(this, 0);
        this.f20257z = 0;
        C30402w c30402w = new C30402w();
        this.f20245E = c30402w;
        this.f20248H = false;
        this.f20249I = false;
        this.f20250J = true;
        HashSet hashSet = new HashSet();
        this.f20251K = hashSet;
        this.f20252L = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC30382f0.f124667a, R.attr.lottieAnimationViewStyle, 0);
        this.f20250J = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.f20249I = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            c30402w.f124770x.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f13 = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            hashSet.add(EnumC30383g.f124672x);
        }
        c30402w.m92896w(f13);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) c30402w.f124738L.f2818x;
        EnumC30403x enumC30403x = EnumC30403x.f124773w;
        boolean zAdd = z4 ? hashSet2.add(enumC30403x) : hashSet2.remove(enumC30403x);
        if (c30402w.f124769w != null && zAdd) {
            c30402w.m92877c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            c30402w.m92875a(new C37305e("**"), InterfaceC30372a0.f124614F, new C11457j(new C30386h0(AbstractC32122c.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i13 = typedArrayObtainStyledAttributes.getInt(17, 0);
            setRenderMode(EnumC30384g0.values()[i13 >= EnumC30384g0.values().length ? 0 : i13]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i14 = typedArrayObtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC30371a.values()[i14 >= EnumC30384g0.values().length ? 0 : i14]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C30378d0 c30378d0) {
        C30374b0 c30374b0 = c30378d0.f124653d;
        C30402w c30402w = this.f20245E;
        if (c30374b0 != null && c30402w == getDrawable() && c30402w.f124769w == c30374b0.f124646a) {
            return;
        }
        this.f20251K.add(EnumC30383g.f124671w);
        this.f20245E.m92878d();
        m15513c();
        c30378d0.m92855b(this.f20254w);
        c30378d0.m92854a(this.f20255x);
        this.f20253M = c30378d0;
    }

    /* JADX INFO: renamed from: c */
    public final void m15513c() {
        C30378d0 c30378d0 = this.f20253M;
        if (c30378d0 != null) {
            C30385h c30385h = this.f20254w;
            synchronized (c30378d0) {
                c30378d0.f124650a.remove(c30385h);
            }
            C30378d0 c30378d1 = this.f20253M;
            C30385h c30385h2 = this.f20255x;
            synchronized (c30378d1) {
                c30378d1.f124651b.remove(c30385h2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15514d() {
        this.f20251K.add(EnumC30383g.f124669F);
        this.f20245E.m92886m();
    }

    public EnumC30371a getAsyncUpdates() {
        EnumC30371a enumC30371a = this.f20245E.f124764l0;
        return enumC30371a != null ? enumC30371a : EnumC30371a.f124606w;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC30371a enumC30371a = this.f20245E.f124764l0;
        if (enumC30371a == null) {
            enumC30371a = EnumC30371a.f124606w;
        }
        return enumC30371a == EnumC30371a.f124607x;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f20245E.f124747U;
    }

    public boolean getClipToCompositionBounds() {
        return this.f20245E.f124740N;
    }

    public C30387i getComposition() {
        Drawable drawable = getDrawable();
        C30402w c30402w = this.f20245E;
        if (drawable == c30402w) {
            return c30402w.f124769w;
        }
        return null;
    }

    public long getDuration() {
        C30387i composition = getComposition();
        if (composition != null) {
            return (long) composition.m92859b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f20245E.f124770x.f39990H;
    }

    public String getImageAssetsFolder() {
        return this.f20245E.f124734H;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f20245E.f124739M;
    }

    public float getMaxFrame() {
        return this.f20245E.f124770x.m33242b();
    }

    public float getMinFrame() {
        return this.f20245E.f124770x.m33243c();
    }

    public C30380e0 getPerformanceTracker() {
        C30387i c30387i = this.f20245E.f124769w;
        if (c30387i != null) {
            return c30387i.f124681a;
        }
        return null;
    }

    public float getProgress() {
        return this.f20245E.f124770x.m33241a();
    }

    public EnumC30384g0 getRenderMode() {
        return this.f20245E.f124749W ? EnumC30384g0.f124677y : EnumC30384g0.f124676x;
    }

    public int getRepeatCount() {
        return this.f20245E.f124770x.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f20245E.f124770x.getRepeatMode();
    }

    public float getSpeed() {
        return this.f20245E.f124770x.f40000z;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C30402w) {
            boolean z4 = ((C30402w) drawable).f124749W;
            EnumC30384g0 enumC30384g0 = EnumC30384g0.f124677y;
            if ((z4 ? enumC30384g0 : EnumC30384g0.f124676x) == enumC30384g0) {
                this.f20245E.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C30402w c30402w = this.f20245E;
        if (drawable2 == c30402w) {
            super.invalidateDrawable(c30402w);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f20249I) {
            return;
        }
        this.f20245E.m92886m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i13;
        if (!(parcelable instanceof C30381f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C30381f c30381f = (C30381f) parcelable;
        super.onRestoreInstanceState(c30381f.getSuperState());
        this.f20246F = c30381f.f124663w;
        HashSet hashSet = this.f20251K;
        EnumC30383g enumC30383g = EnumC30383g.f124671w;
        if (!hashSet.contains(enumC30383g) && !TextUtils.isEmpty(this.f20246F)) {
            setAnimation(this.f20246F);
        }
        this.f20247G = c30381f.f124664x;
        if (!hashSet.contains(enumC30383g) && (i13 = this.f20247G) != 0) {
            setAnimation(i13);
        }
        if (!hashSet.contains(EnumC30383g.f124672x)) {
            this.f20245E.m92896w(c30381f.f124665y);
        }
        if (!hashSet.contains(EnumC30383g.f124669F) && c30381f.f124666z) {
            m15514d();
        }
        if (!hashSet.contains(EnumC30383g.f124668E)) {
            setImageAssetsFolder(c30381f.f124660E);
        }
        if (!hashSet.contains(EnumC30383g.f124673y)) {
            setRepeatMode(c30381f.f124661F);
        }
        if (hashSet.contains(EnumC30383g.f124674z)) {
            return;
        }
        setRepeatCount(c30381f.f124662G);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z4;
        C30381f c30381f = new C30381f(super.onSaveInstanceState());
        c30381f.f124663w = this.f20246F;
        c30381f.f124664x = this.f20247G;
        C30402w c30402w = this.f20245E;
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = c30402w.f124770x;
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e2 = c30402w.f124770x;
        c30381f.f124665y = choreographerFrameCallbackC12060e.m33241a();
        if (c30402w.isVisible()) {
            z4 = choreographerFrameCallbackC12060e2.f39995M;
        } else {
            int i13 = c30402w.f124768p0;
            z4 = i13 == 2 || i13 == 3;
        }
        c30381f.f124666z = z4;
        c30381f.f124660E = c30402w.f124734H;
        c30381f.f124661F = choreographerFrameCallbackC12060e2.getRepeatMode();
        c30381f.f124662G = choreographerFrameCallbackC12060e2.getRepeatCount();
        return c30381f;
    }

    public void setAnimation(int i13) {
        C30378d0 c30378d0M92867f;
        this.f20247G = i13;
        this.f20246F = null;
        if (isInEditMode()) {
            c30378d0M92867f = new C30378d0(new CallableC30379e(this, i13, 0), true);
        } else if (this.f20250J) {
            Context context = getContext();
            c30378d0M92867f = AbstractC30391l.m92867f(context, i13, AbstractC30391l.m92873l(context, i13));
        } else {
            c30378d0M92867f = AbstractC30391l.m92867f(getContext(), i13, null);
        }
        setCompositionTask(c30378d0M92867f);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(AbstractC30391l.m92862a(null, new CallableC5355n1(7, byteArrayInputStream, null), new RunnableC24693e(byteArrayInputStream, 10)));
    }

    public void setAnimationFromUrl(String str) {
        C30378d0 c30378d0M92862a;
        String str2 = null;
        if (this.f20250J) {
            Context context = getContext();
            HashMap map = AbstractC30391l.f124703a;
            String strM30461o = AbstractC11266d.m30461o("url_", str);
            c30378d0M92862a = AbstractC30391l.m92862a(strM30461o, new CallableC21575f(context, str, strM30461o), null);
        } else {
            c30378d0M92862a = AbstractC30391l.m92862a(null, new CallableC21575f(getContext(), str, str2), null);
        }
        setCompositionTask(c30378d0M92862a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z4) {
        this.f20245E.f124745S = z4;
    }

    public void setApplyingShadowToLayersEnabled(boolean z4) {
        this.f20245E.f124746T = z4;
    }

    public void setAsyncUpdates(EnumC30371a enumC30371a) {
        this.f20245E.f124764l0 = enumC30371a;
    }

    public void setCacheComposition(boolean z4) {
        this.f20250J = z4;
    }

    public void setClipTextToBoundingBox(boolean z4) {
        C30402w c30402w = this.f20245E;
        if (z4 != c30402w.f124747U) {
            c30402w.f124747U = z4;
            c30402w.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z4) {
        C30402w c30402w = this.f20245E;
        if (z4 != c30402w.f124740N) {
            c30402w.f124740N = z4;
            C40653c c40653c = c30402w.f124741O;
            if (c40653c != null) {
                c40653c.f175497L = z4;
            }
            c30402w.invalidateSelf();
        }
    }

    public void setComposition(C30387i c30387i) {
        C30402w c30402w = this.f20245E;
        c30402w.setCallback(this);
        this.f20248H = true;
        boolean zM92889p = c30402w.m92889p(c30387i);
        if (this.f20249I) {
            c30402w.m92886m();
        }
        this.f20248H = false;
        if (getDrawable() != c30402w || zM92889p) {
            if (!zM92889p) {
                boolean zM92884k = c30402w.m92884k();
                setImageDrawable(null);
                setImageDrawable(c30402w);
                if (zM92884k) {
                    c30402w.m92888o();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f20252L.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C30402w c30402w = this.f20245E;
        c30402w.f124737K = str;
        C2570m c2570mM92883j = c30402w.m92883j();
        if (c2570mM92883j != null) {
            c2570mM92883j.m7482I(str);
        }
    }

    public void setFailureListener(InterfaceC30405z interfaceC30405z) {
        this.f20256y = interfaceC30405z;
    }

    public void setFallbackResource(int i13) {
        this.f20257z = i13;
    }

    public void setFontAssetDelegate(AbstractC30373b abstractC30373b) {
        C2570m c2570m = this.f20245E.f124735I;
    }

    public void setFontMap(Map<String, Typeface> map) {
        C30402w c30402w = this.f20245E;
        if (map == c30402w.f124736J) {
            return;
        }
        c30402w.f124736J = map;
        c30402w.invalidateSelf();
    }

    public void setFrame(int i13) {
        this.f20245E.m92890q(i13);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z4) {
        this.f20245E.f124772z = z4;
    }

    public void setImageAssetDelegate(InterfaceC30375c interfaceC30375c) {
        C36055a c36055a = this.f20245E.f124733G;
    }

    public void setImageAssetsFolder(String str) {
        this.f20245E.f124734H = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f20247G = 0;
        this.f20246F = null;
        m15513c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f20247G = 0;
        this.f20246F = null;
        m15513c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i13) {
        this.f20247G = 0;
        this.f20246F = null;
        m15513c();
        super.setImageResource(i13);
    }

    public void setMaintainOriginalImageBounds(boolean z4) {
        this.f20245E.f124739M = z4;
    }

    public void setMaxFrame(int i13) {
        this.f20245E.m92891r(i13);
    }

    public void setMaxProgress(float f13) {
        C30402w c30402w = this.f20245E;
        C30387i c30387i = c30402w.f124769w;
        if (c30387i == null) {
            c30402w.f124732F.add(new C30395p(c30402w, f13, 0));
            return;
        }
        ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = c30402w.f124770x;
        choreographerFrameCallbackC12060e.m33249i(choreographerFrameCallbackC12060e.f39992J, AbstractC12062g.m33256f(c30387i.f124692l, c30387i.f124693m, f13));
    }

    public void setMinAndMaxFrame(String str) {
        this.f20245E.m92893t(str);
    }

    public void setMinFrame(int i13) {
        this.f20245E.m92894u(i13);
    }

    public void setMinProgress(float f13) {
        C30402w c30402w = this.f20245E;
        C30387i c30387i = c30402w.f124769w;
        if (c30387i == null) {
            c30402w.f124732F.add(new C30395p(c30402w, f13, 1));
        } else {
            c30402w.m92894u((int) AbstractC12062g.m33256f(c30387i.f124692l, c30387i.f124693m, f13));
        }
    }

    public void setOutlineMasksAndMattes(boolean z4) {
        C30402w c30402w = this.f20245E;
        if (c30402w.f124744R == z4) {
            return;
        }
        c30402w.f124744R = z4;
        C40653c c40653c = c30402w.f124741O;
        if (c40653c != null) {
            c40653c.mo131934o(z4);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z4) {
        C30402w c30402w = this.f20245E;
        c30402w.f124743Q = z4;
        C30387i c30387i = c30402w.f124769w;
        if (c30387i != null) {
            c30387i.f124681a.f124657a = z4;
        }
    }

    public void setProgress(float f13) {
        this.f20251K.add(EnumC30383g.f124672x);
        this.f20245E.m92896w(f13);
    }

    public void setRenderMode(EnumC30384g0 enumC30384g0) {
        C30402w c30402w = this.f20245E;
        c30402w.f124748V = enumC30384g0;
        c30402w.m92879e();
    }

    public void setRepeatCount(int i13) {
        this.f20251K.add(EnumC30383g.f124674z);
        this.f20245E.f124770x.setRepeatCount(i13);
    }

    public void setRepeatMode(int i13) {
        this.f20251K.add(EnumC30383g.f124673y);
        this.f20245E.f124770x.setRepeatMode(i13);
    }

    public void setSafeMode(boolean z4) {
        this.f20245E.f124731E = z4;
    }

    public void setSpeed(float f13) {
        this.f20245E.f124770x.f40000z = f13;
    }

    public void setTextDelegate(AbstractC30388i0 abstractC30388i0) {
        this.f20245E.getClass();
    }

    public void setUseCompositionFrameRate(boolean z4) {
        this.f20245E.f124770x.f39996N = z4;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C30402w c30402w;
        if (!this.f20248H && drawable == (c30402w = this.f20245E) && c30402w.m92884k()) {
            this.f20249I = false;
            c30402w.m92885l();
        } else if (!this.f20248H && (drawable instanceof C30402w)) {
            C30402w c30402w2 = (C30402w) drawable;
            if (c30402w2.m92884k()) {
                c30402w2.m92885l();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f20245E.m92892s(str);
    }

    public void setMinFrame(String str) {
        this.f20245E.m92895v(str);
    }

    public void setAnimation(String str) {
        C30378d0 c30378d0M92862a;
        this.f20246F = str;
        this.f20247G = 0;
        int i13 = 1;
        if (isInEditMode()) {
            c30378d0M92862a = new C30378d0(new CallableC5355n1(6, this, str), true);
        } else {
            Object obj = null;
            if (this.f20250J) {
                Context context = getContext();
                HashMap map = AbstractC30391l.f124703a;
                String strM30461o = AbstractC11266d.m30461o("asset_", str);
                c30378d0M92862a = AbstractC30391l.m92862a(strM30461o, new CallableC17617f(context.getApplicationContext(), str, strM30461o, i13), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = AbstractC30391l.f124703a;
                c30378d0M92862a = AbstractC30391l.m92862a(null, new CallableC17617f(context2.getApplicationContext(), str, obj, i13), null);
            }
        }
        setCompositionTask(c30378d0M92862a);
    }
}
