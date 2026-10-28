package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import gl.C15941f;
import gl.C15942g;
import gl.C15946k;
import gl.C15953r;
import java.util.ArrayList;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0004a;
import p002a0.C0022g;
import p429ql.AbstractC30465k;
import p429ql.C30456b;
import p429ql.InterfaceC30463i;
import pf.AbstractC29125c;
import pl.AbstractC29338a;
import pl.C29341d;
import pl.InterfaceC29340c;
import tl.AbstractC33907f;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: com.bumptech.glide.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C4964f extends AbstractC29338a {

    /* JADX INFO: renamed from: T */
    public final Context f20316T;

    /* JADX INFO: renamed from: U */
    public final ComponentCallbacks2C4966h f20317U;

    /* JADX INFO: renamed from: V */
    public final Class f20318V;

    /* JADX INFO: renamed from: W */
    public final C4961c f20319W;

    /* JADX INFO: renamed from: X */
    public AbstractC4967i f20320X;

    /* JADX INFO: renamed from: Y */
    public Object f20321Y;

    /* JADX INFO: renamed from: Z */
    public ArrayList f20322Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f20323a0;

    static {
    }

    public C4964f(ComponentCallbacks2C4960b componentCallbacks2C4960b, ComponentCallbacks2C4966h componentCallbacks2C4966h, Class cls, Context context) {
        C29341d c29341d;
        this.f20317U = componentCallbacks2C4966h;
        this.f20318V = cls;
        this.f20316T = context;
        C0022g c0022g = componentCallbacks2C4966h.f20334w.f20300z.f20307f;
        AbstractC4967i abstractC4967i = (AbstractC4967i) c0022g.get(cls);
        if (abstractC4967i == null) {
            for (Map.Entry entry : (C0004a) c0022g.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC4967i = (AbstractC4967i) entry.getValue();
                }
            }
        }
        this.f20320X = abstractC4967i == null ? C4961c.f20301j : abstractC4967i;
        this.f20319W = componentCallbacks2C4960b.f20300z;
        for (InterfaceC29340c interfaceC29340c : componentCallbacks2C4966h.f20332J) {
            if (interfaceC29340c != null) {
                if (this.f20322Z == null) {
                    this.f20322Z = new ArrayList();
                }
                this.f20322Z.add(interfaceC29340c);
            }
        }
        synchronized (componentCallbacks2C4966h) {
            c29341d = componentCallbacks2C4966h.f20333K;
        }
        mo15533a(c29341d);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0111 */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[Catch: all -> 0x010e, TryCatch #3 {, blocks: (B:54:0x00dc, B:56:0x00f2, B:57:0x00f6, B:59:0x0100, B:60:0x0105), top: B:79:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6 A[Catch: all -> 0x010e, TryCatch #3 {, blocks: (B:54:0x00dc, B:56:0x00f2, B:57:0x00f6, B:59:0x0100, B:60:0x0105), top: B:79:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0100 A[Catch: all -> 0x010e, TryCatch #3 {, blocks: (B:54:0x00dc, B:56:0x00f2, B:57:0x00f6, B:59:0x0100, B:60:0x0105), top: B:79:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        r0 = th;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15532A(p429ql.InterfaceC30463i r19, pl.AbstractC29338a r20, java.util.concurrent.Executor r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C4964f.m15532A(ql.i, pl.a, java.util.concurrent.Executor):void");
    }

    @Override // pl.AbstractC29338a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C4964f mo15533a(AbstractC29338a abstractC29338a) {
        AbstractC29125c.m88538o(abstractC29338a);
        return (C4964f) super.mo15533a(abstractC29338a);
    }

    @Override // pl.AbstractC29338a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C4964f clone() {
        C4964f c4964f = (C4964f) super.clone();
        c4964f.f20320X = c4964f.f20320X.clone();
        return c4964f;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC30465k m15537y(ImageView imageView) {
        AbstractC29338a abstractC29338aM89317h;
        C30456b c30456b;
        char[] cArr = AbstractC33913l.f142093a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        AbstractC29125c.m88538o(imageView);
        if (!AbstractC29338a.m89312g(this.f118873w, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) && this.f118865L && imageView.getScaleType() != null) {
            switch (AbstractC4963e.f20314a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC29338aM89317h = clone().m89317h(C15946k.f60356d, new C15941f());
                    break;
                case 2:
                    abstractC29338aM89317h = clone().m89322n(C15946k.f60355c, new C15942g(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC29338aM89317h = clone().m89322n(C15946k.f60354b, new C15953r(), false);
                    break;
                case 6:
                    abstractC29338aM89317h = clone().m89322n(C15946k.f60355c, new C15942g(), false);
                    break;
                default:
                    abstractC29338aM89317h = this;
                    break;
            }
        } else {
            abstractC29338aM89317h = this;
        }
        this.f20319W.f20304c.getClass();
        Class cls = this.f20318V;
        if (Bitmap.class.equals(cls)) {
            c30456b = new C30456b(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c30456b = new C30456b(imageView, 1);
        }
        m15532A(c30456b, abstractC29338aM89317h, AbstractC33907f.f142081a);
        return c30456b;
    }

    /* JADX INFO: renamed from: z */
    public final void m15538z(InterfaceC30463i interfaceC30463i) {
        m15532A(interfaceC30463i, this, AbstractC33907f.f142081a);
    }
}
