package i51;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bh.C3238a;
import bh.C3247j;
import bh.InterfaceC3242e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import mh.AbstractC25543k;
import mh.C25537e;
import mh.C25540h;
import mh.C25542j;
import mh.C25547o;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p341nh.EnumC26710d;
import p426qi.C30387i;
import p426qi.InterfaceC30372a0;
import p505ts.AbstractC34132o;
import p524ui.C34970a0;
import p584wi.C37305e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: i51.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u0014H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u001a0\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u0014H\u0086@¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Li51/q;", "", "Landroid/content/Context;", "context", "", "overlayUrl", "Lbh/e;", "imageLoader", "", "density", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbh/e;F)V", "", "width", "height", "Landroid/graphics/Bitmap;", "c", "(IILq83/d;)Ljava/lang/Object;", "Lqi/i;", "composition", "", "", "layersByAsset", "Lui/a0;", "b", "(Lqi/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Ll83/k;", "d", "a", "Landroid/content/Context;", "Ljava/lang/String;", "Lbh/e;", "F", "Ltr2/n;", "e", "Ltr2/n;", "logger", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18120q {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f70359g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String overlayUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC3242e imageLoader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float density;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i51.q$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Li51/q$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "layers", "", "", "", "destination", "Ll83/a0;", "a", "(Lorg/json/JSONArray;Ljava/util/Map;)V", "json", "", "", "b", "(Ljava/lang/String;)Ljava/util/Map;", "OVERLAY_ASSET_ID", "Ljava/lang/String;", "OVERLAY_ASSET_ID_LEGACY", "", "IMAGE_LAYER_TYPE", "I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final void m52024a(JSONArray layers, Map<String, Set<String>> destination) {
            if (layers == null) {
                return;
            }
            int length = layers.length();
            for (int i13 = 0; i13 < length; i13++) {
                JSONObject jSONObjectOptJSONObject = layers.optJSONObject(i13);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("ty") == 2) {
                    String strOptString = jSONObjectOptJSONObject.optString("refId", "");
                    if (AbstractC22676k.m65745e(strOptString, "visual") || AbstractC22676k.m65745e(strOptString, "placeholder-image")) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("nm", "");
                        AbstractC22676k.m65747g(strOptString2);
                        if (strOptString2.length() > 0) {
                            Set<String> linkedHashSet = destination.get(strOptString);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet<>();
                                destination.put(strOptString, linkedHashSet);
                            }
                            linkedHashSet.add(strOptString2);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, List<String>> m52025b(String json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                m52024a(jSONObject.optJSONArray("layers"), linkedHashMap);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assets");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
                        if (jSONObjectOptJSONObject != null) {
                            m52024a(jSONObjectOptJSONObject.optJSONArray("layers"), linkedHashMap);
                        }
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj).getKey(), AbstractC25265s.m74093D1((Set) ((Map.Entry) obj).getValue()));
                }
                return linkedHashMap2;
            } catch (Exception unused) {
                return C25272z.f99163w;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i51.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.celebration.DynamicLottieImageProvider", m100430f = "DynamicLottieImageProvider.kt", m100431l = {76}, m100432m = "buildDynamicProperties", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f70365E;

        /* JADX INFO: renamed from: w */
        Object f70366w;

        /* JADX INFO: renamed from: x */
        Object f70367x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70368y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70368y = obj;
            this.f70365E |= Integer.MIN_VALUE;
            return C18120q.this.m52022b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i51.q$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.celebration.DynamicLottieImageProvider", m100430f = "DynamicLottieImageProvider.kt", m100431l = {158}, m100432m = "loadBitmap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70371F;

        /* JADX INFO: renamed from: w */
        int f70372w;

        /* JADX INFO: renamed from: x */
        int f70373x;

        /* JADX INFO: renamed from: y */
        Object f70374y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70375z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70375z = obj;
            this.f70371F |= Integer.MIN_VALUE;
            return C18120q.this.m52021c(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: i51.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.celebration.DynamicLottieImageProvider", m100430f = "DynamicLottieImageProvider.kt", m100431l = {130}, m100432m = "overlayBitmapLayers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f70376E;

        /* JADX INFO: renamed from: F */
        Object f70377F;

        /* JADX INFO: renamed from: G */
        Object f70378G;

        /* JADX INFO: renamed from: H */
        Object f70379H;

        /* JADX INFO: renamed from: I */
        int f70380I;

        /* JADX INFO: renamed from: J */
        int f70381J;

        /* JADX INFO: renamed from: K */
        int f70382K;

        /* JADX INFO: renamed from: L */
        int f70383L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f70384M;

        /* JADX INFO: renamed from: O */
        int f70386O;

        /* JADX INFO: renamed from: w */
        Object f70387w;

        /* JADX INFO: renamed from: x */
        Object f70388x;

        /* JADX INFO: renamed from: y */
        Object f70389y;

        /* JADX INFO: renamed from: z */
        Object f70390z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70384M = obj;
            this.f70386O |= Integer.MIN_VALUE;
            return C18120q.this.m52023d(null, null, this);
        }
    }

    public C18120q(Context context, String overlayUrl, InterfaceC3242e imageLoader, float f13) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(overlayUrl, "overlayUrl");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        this.context = context;
        this.overlayUrl = overlayUrl;
        this.imageLoader = imageLoader;
        this.density = f13;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("DynamicLottieImageProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m52021c(int i13, int i14, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        c cVar;
        Drawable drawable;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i15 = cVar.f70371F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f70371F = i15 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM9386b = cVar.f70375z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = cVar.f70371F;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM9386b);
            C25540h c25540h = new C25540h(this.context);
            c25540h.f100079c = this.overlayUrl;
            c25540h.f100090n = Boolean.FALSE;
            c25540h.m75120d(i13, i14);
            c25540h.f100083g = EnumC26710d.f106208w;
            C25542j c25542jM75117a = c25540h.m75117a();
            InterfaceC3242e interfaceC3242e = this.imageLoader;
            cVar.f70374y = null;
            cVar.f70372w = i13;
            cVar.f70373x = i14;
            cVar.f70371F = 1;
            objM9386b = ((C3247j) interfaceC3242e).m9386b(c25542jM75117a, cVar);
            if (objM9386b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM9386b);
        }
        AbstractC25543k abstractC25543k = (AbstractC25543k) objM9386b;
        if (abstractC25543k instanceof C25537e) {
            this.logger.mo85230v(AbstractC11266d.m30461o("Coil failed to load overlay image: ", this.overlayUrl), ((C25537e) abstractC25543k).f100074c, new AbstractC30556a.a[0]);
            return null;
        }
        C25547o c25547o = abstractC25543k instanceof C25547o ? (C25547o) abstractC25543k : null;
        if (c25547o != null && (drawable = c25547o.f100152a) != null) {
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m52022b(C30387i c30387i, Map<String, ? extends List<String>> map, InterfaceC30057d<? super List<C34970a0>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f70365E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f70365E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM52023d = bVar.f70368y;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f70365E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM52023d);
            bVar.f70366w = null;
            bVar.f70367x = null;
            bVar.f70365E = 1;
            objM52023d = m52023d(c30387i, map, bVar);
            if (objM52023d == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM52023d);
        }
        Iterable<C23465k> iterable = (Iterable) objM52023d;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        for (C23465k c23465k : iterable) {
            String str = (String) c23465k.f92937w;
            arrayList.add(new C34970a0(InterfaceC30372a0.f124617I, new C37305e("**", str), (Bitmap) c23465k.f92938x));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x016e -> B:58:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x022b -> B:66:0x0226). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m52023d(p426qi.C30387i r21, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r22, q83.InterfaceC30057d<? super java.util.List<l83.C23465k>> r23) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i51.C18120q.m52023d(qi.i, java.util.Map, q83.d):java.lang.Object");
    }

    public /* synthetic */ C18120q(Context context, String str, InterfaceC3242e interfaceC3242e, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i13 & 4) != 0 ? C3238a.m9378a(context) : interfaceC3242e, (i13 & 8) != 0 ? context.getResources().getDisplayMetrics().density : f13);
    }
}
