package com.mapbox.maps;

import a30.C0332w0;
import android.graphics.RectF;
import android.os.Handler;
import android.webkit.URLUtil;
import c93.InterfaceC4339a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23457c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mv.InterfaceC25962a;
import mv.InterfaceC25963b;
import mv.InterfaceC25964c;
import mv.InterfaceC25965d;
import mv.InterfaceC25966e;
import mv.InterfaceC25968g;
import mv.InterfaceC25969h;
import p000.AbstractC11266d;
import p012ab.C0680g0;
import p021av.AbstractC2091e;
import p047c9.C4316g;
import p099dv.AbstractC12381b;
import p157fv.InterfaceC14795a;
import p349nv.InterfaceC27150a;
import p349nv.InterfaceC27151b;
import p349nv.InterfaceC27152c;
import p349nv.InterfaceC27153d;
import p349nv.InterfaceC27154e;
import p349nv.InterfaceC27155f;
import p349nv.InterfaceC27156g;
import p349nv.InterfaceC27157h;
import p349nv.InterfaceC27158i;
import p349nv.InterfaceC27159j;
import p349nv.InterfaceC27160k;
import p349nv.InterfaceC27161l;
import p349nv.InterfaceC27162m;
import p383ov.InterfaceC28381c;
import p534uu.C35233b;
import p534uu.InterfaceC35232a;
import p626xu.C38651a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Ü\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 \u0093\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u0093\u0004B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!J;\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(J/\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010)J\u001f\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b'\u0010!J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0007¢\u0006\u0004\b'\u0010*J;\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010(J/\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010)J\u001f\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b,\u0010!J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bH\u0007¢\u0006\u0004\b,\u0010*J#\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010/J;\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00100J/\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00101J\u0011\u00105\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0015H\u0016¢\u0006\u0004\b>\u0010\u0017J\u0017\u0010A\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010=J\u0017\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0015H\u0016¢\u0006\u0004\bY\u0010\u0017J\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020Z¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020\u001f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001f0fH\u0007¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00020k0jH\u0007¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\u001f2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j2\u0006\u0010o\u001a\u00020\u0015H\u0007¢\u0006\u0004\bp\u0010qJI\u0010|\u001a\u0002072\u0006\u0010s\u001a\u00020r2\b\u0010u\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010v2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0004\b|\u0010}J?\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J3\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001JH\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0087\u0001J^\u0010\u0081\u0001\u001a\u00020\u001f2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010z2\u0014\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001f0\u0088\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u008a\u0001J;\u0010\u008e\u0001\u001a\u0002072\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0092\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0096\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u001c\u0010\u0099\u0001\u001a\u00020r2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J&\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020z0j2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0jH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010¡\u0001\u001a\u00020~2\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J'\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020~0j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J\u001c\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J(\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¨\u0001\u0010\u009f\u0001J$\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020v2\u0007\u0010ª\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001b\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010\u00ad\u0001J\u001c\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010®\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010³\u0001\u001a\u00020~2\b\u0010²\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J%\u0010·\u0001\u001a\u00030¶\u00012\u0007\u0010®\u0001\u001a\u00020~2\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J%\u0010¹\u0001\u001a\u00020~2\b\u0010\u009b\u0001\u001a\u00030¶\u00012\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J0\u0010À\u0001\u001a\u00030¿\u00012\b\u0010\u008c\u0001\u001a\u00030»\u00012\u0007\u0010L\u001a\u00030¼\u00012\b\u0010¾\u0001\u001a\u00030½\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J/\u0010Å\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030Ã\u00012\b\u0010¾\u0001\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010É\u0001\u001a\u00020\u001f2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JG\u0010Ñ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\n\b\u0002\u0010Ï\u0001\u001a\u00030Î\u00012\t\b\u0002\u0010{\u001a\u00030Î\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001H\u0007¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J.\u0010Ó\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J.\u0010Õ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÕ\u0001\u0010Ô\u0001JD\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J7\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bÛ\u0001\u0010Ý\u0001J:\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001H\u0016¢\u0006\u0006\bß\u0001\u0010à\u0001J-\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001¢\u0006\u0006\bß\u0001\u0010á\u0001JE\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J8\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010å\u0001J-\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010æ\u0001J1\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bç\u0001\u0010æ\u0001J$\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0010\u0010é\u0001\u001a\u00020\u001f¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001d\u0010í\u0001\u001a\u00030¿\u00012\b\u0010ì\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001d\u0010ñ\u0001\u001a\u00030¿\u00012\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001d\u0010õ\u0001\u001a\u00030¿\u00012\b\u0010ô\u0001\u001a\u00030ó\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001d\u0010ù\u0001\u001a\u00030¿\u00012\b\u0010ø\u0001\u001a\u00030÷\u0001H\u0016¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001d\u0010ý\u0001\u001a\u00030¿\u00012\b\u0010ü\u0001\u001a\u00030û\u0001H\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001d\u0010\u0081\u0002\u001a\u00030¿\u00012\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0016¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001d\u0010\u0085\u0002\u001a\u00030¿\u00012\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0016¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001d\u0010\u0089\u0002\u001a\u00030¿\u00012\b\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0016¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J\u001d\u0010\u008d\u0002\u001a\u00030¿\u00012\b\u0010\u008c\u0002\u001a\u00030\u008b\u0002H\u0016¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u001d\u0010\u0091\u0002\u001a\u00030¿\u00012\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0016¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001d\u0010\u0095\u0002\u001a\u00030¿\u00012\b\u0010\u0094\u0002\u001a\u00030\u0093\u0002H\u0016¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001d\u0010\u0099\u0002\u001a\u00030¿\u00012\b\u0010\u0098\u0002\u001a\u00030\u0097\u0002H\u0017¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u001d\u0010\u009d\u0002\u001a\u00030¿\u00012\b\u0010\u009c\u0002\u001a\u00030\u009b\u0002H\u0016¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001d\u0010¡\u0002\u001a\u00030¿\u00012\b\u0010 \u0002\u001a\u00030\u009f\u0002H\u0016¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001d\u0010¥\u0002\u001a\u00030¿\u00012\b\u0010¤\u0002\u001a\u00030£\u0002H\u0016¢\u0006\u0006\b¥\u0002\u0010¦\u0002J&\u0010ª\u0002\u001a\u00030¿\u00012\u0007\u0010§\u0002\u001a\u00020\u001b2\b\u0010©\u0002\u001a\u00030¨\u0002H\u0017¢\u0006\u0006\bª\u0002\u0010«\u0002J\u001c\u0010®\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b®\u0002\u0010¯\u0002J\u001c\u0010°\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b°\u0002\u0010¯\u0002J\u001c\u0010³\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\b³\u0002\u0010´\u0002J\u001c\u0010µ\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\bµ\u0002\u0010´\u0002J\u001a\u0010¶\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¶\u0002\u0010·\u0002J\u001a\u0010¸\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¸\u0002\u0010·\u0002J\u001c\u0010»\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u001c\u0010½\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b½\u0002\u0010¼\u0002J\u001c\u0010À\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\u001c\u0010Â\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÂ\u0002\u0010Á\u0002J\u001c\u0010Å\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J\u001c\u0010Ç\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÇ\u0002\u0010Æ\u0002J\u001c\u0010Ê\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÊ\u0002\u0010Ë\u0002J\u001c\u0010Ì\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÌ\u0002\u0010Ë\u0002J\u001c\u0010Ï\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÏ\u0002\u0010Ð\u0002J\u001c\u0010Ñ\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÑ\u0002\u0010Ð\u0002J\u001c\u0010Ô\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002J\u001c\u0010Ö\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÖ\u0002\u0010Õ\u0002J\u001c\u0010Ù\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J\u001c\u0010Û\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÛ\u0002\u0010Ú\u0002J\u001c\u0010Þ\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bÞ\u0002\u0010ß\u0002J\u001c\u0010à\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bà\u0002\u0010ß\u0002J\u001c\u0010ã\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bã\u0002\u0010ä\u0002J\u001c\u0010å\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bå\u0002\u0010ä\u0002J\u001c\u0010è\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bè\u0002\u0010é\u0002J\u001c\u0010ê\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bê\u0002\u0010é\u0002J\u0010\u0010ë\u0002\u001a\u00020\u001f¢\u0006\u0006\bë\u0002\u0010ê\u0001J\u0013\u0010í\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0006\bí\u0002\u0010î\u0002J\u001a\u00109\u001a\u00020\u001f2\b\u0010ï\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0005\b9\u0010ð\u0002J\u001b\u0010ñ\u0002\u001a\u0004\u0018\u00010v2\u0007\u0010\u009b\u0001\u001a\u00020~¢\u0006\u0006\bñ\u0002\u0010ò\u0002J\u001c\u0010õ\u0002\u001a\u00020\u001f2\n\u0010ô\u0002\u001a\u0005\u0018\u00010ó\u0002¢\u0006\u0006\bõ\u0002\u0010ö\u0002J\u0018\u0010ø\u0002\u001a\u00020\u001f2\u0007\u0010÷\u0002\u001a\u00020\u0015¢\u0006\u0005\bø\u0002\u0010=J\u000f\u0010ù\u0002\u001a\u00020\u0015¢\u0006\u0005\bù\u0002\u0010\u0017J\"\u0010ü\u0002\u001a\u00020\u001f2\u000e\u0010û\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0006\bü\u0002\u0010ý\u0002J\u0018\u0010þ\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0005\bþ\u0002\u0010mJ%\u0010\u0081\u0003\u001a\u00020\u001f2\u0007\u0010L\u001a\u00030ÿ\u00022\b\u0010¾\u0001\u001a\u00030\u0080\u0003H\u0007¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J\u0012\u0010\u0083\u0003\u001a\u00020\u001fH\u0007¢\u0006\u0006\b\u0083\u0003\u0010ê\u0001J$\u0010\u0086\u0003\u001a\u0002072\u0007\u0010\u0084\u0003\u001a\u00020z2\u0007\u0010\u0085\u0003\u001a\u00020zH\u0016¢\u0006\u0006\b\u0086\u0003\u0010\u0087\u0003J\u001c\u0010\u008a\u0003\u001a\u00020\u001f2\b\u0010\u0089\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0013\u0010\u008c\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008c\u0003\u0010\u008d\u0003J-\u0010\u0090\u0003\u001a\u0004\u0018\u00010\t2\u0017\u0010\u008f\u0003\u001a\u0012\u0012\u0005\u0012\u00030\u008e\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0088\u0001H\u0016¢\u0006\u0006\b\u0090\u0003\u0010\u0091\u0003J-\u0010\u0093\u0003\u001a\u0004\u0018\u00010\t2\u0017\u0010\u008f\u0003\u001a\u0012\u0012\u0005\u0012\u00030\u0092\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0088\u0001H\u0016¢\u0006\u0006\b\u0093\u0003\u0010\u0091\u0003J\u0012\u0010\u0095\u0003\u001a\u00020\u001fH\u0000¢\u0006\u0006\b\u0094\u0003\u0010ê\u0001J-\u0010\u0099\u0003\u001a\t\u0012\u0005\u0012\u00030\u0098\u00030j2\b\u0010\u0097\u0003\u001a\u00030\u0096\u00032\b\u00108\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0006\b\u0099\u0003\u0010\u009a\u0003J\u0015\u0010\u009b\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0j¢\u0006\u0005\b\u009b\u0003\u0010mJ0\u0010 \u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009c\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009d\u0003H\u0000¢\u0006\u0006\b\u009e\u0003\u0010\u009f\u0003J=\u0010¦\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u001d\u0010£\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0018\u00010¡\u0003j\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u0001`¢\u0003H\u0001¢\u0006\u0006\b¤\u0003\u0010¥\u0003J$\u0010©\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001b0¡\u0003j\t\u0012\u0004\u0012\u00020\u001b`¢\u0003H\u0001¢\u0006\u0006\b§\u0003\u0010¨\u0003J0\u0010«\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009c\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009d\u0003H\u0000¢\u0006\u0006\bª\u0003\u0010\u009f\u0003J'\u0010®\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009c\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b¬\u0003\u0010\u00ad\u0003J(\u0010±\u0003\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0005\u0012\u00030\u009d\u00030M2\u0007\u0010¯\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b°\u0003\u0010\u00ad\u0003J\u001e\u0010¶\u0003\u001a\u00020\u001f2\n\u0010³\u0003\u001a\u0005\u0018\u00010²\u0003H\u0000¢\u0006\u0006\b´\u0003\u0010µ\u0003J\u001d\u0010¹\u0003\u001a\u00030¿\u00012\b\u0010¸\u0003\u001a\u00030·\u0003H\u0017¢\u0006\u0006\b¹\u0003\u0010º\u0003J\u001c\u0010½\u0003\u001a\u00020\u001f2\b\u0010¼\u0003\u001a\u00030»\u0003H\u0017¢\u0006\u0006\b½\u0003\u0010¾\u0003JD\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u00032\u000e\u0010Â\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Á\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010Ã\u0003JR\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u00032\u0012\u0010Å\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Ä\u00032\b\u0010Ç\u0003\u001a\u00030Æ\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010È\u0003J?\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u00032\u000e\u0010Â\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Á\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000É\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ê\u0003JM\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u00032\u0012\u0010Å\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Ä\u00032\b\u0010Ç\u0003\u001a\u00030Æ\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000É\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ë\u0003JZ\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u0003\"\u0010\b\u0001\u0010Í\u0003*\t\u0012\u0004\u0012\u00028\u00000Ì\u00032\u000e\u0010Â\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Á\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Î\u0003Jh\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010À\u0003*\u00030¿\u0003\"\u0010\b\u0001\u0010Í\u0003*\t\u0012\u0004\u0012\u00028\u00000Ì\u00032\u0012\u0010Å\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Ä\u00032\b\u0010Ç\u0003\u001a\u00030Æ\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Ï\u0003J1\u0010ç\u0001\u001a\u00030¿\u00012\u0010\u0010Å\u0003\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030Ä\u00032\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bç\u0001\u0010Ð\u0003Jc\u0010À\u0001\u001a\u00030¿\u0001\"\u000e\b\u0000\u0010Ñ\u0003*\u0007\u0012\u0002\b\u00030Á\u00032\u0012\u0010Å\u0003\u001a\r\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000Ä\u00032\f\b\u0002\u0010\u008c\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010Ò\u0003\u001a\u0005\u0018\u00010Ø\u00012\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ó\u0003H\u0007¢\u0006\u0006\bÀ\u0001\u0010Ô\u0003J\u0013\u0010Ö\u0003\u001a\u00030Õ\u0003H\u0007¢\u0006\u0006\bÖ\u0003\u0010×\u0003J\u0016\u0010Ø\u0003\u001a\u00020\u0015*\u00020\u001bH\u0002¢\u0006\u0006\bØ\u0003\u0010Ù\u0003J\u0019\u0010Ú\u0003\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0005\bÚ\u0003\u0010*JA\u0010Þ\u0003\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0007\u0010Û\u0003\u001a\u00020\u001d2\u000b\b\u0002\u0010Ü\u0003\u001a\u0004\u0018\u00010\u001d2\u000b\b\u0002\u0010Ý\u0003\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bÞ\u0003\u0010ß\u0003J\u0016\u0010à\u0003\u001a\u00020z*\u00020zH\u0002¢\u0006\u0006\bà\u0003\u0010á\u0003J&\u0010ä\u0003\u001a\u00020\u001f2\u0007\u0010â\u0003\u001a\u00020\u001b2\t\b\u0002\u0010ã\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0006\bä\u0003\u0010å\u0003R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010æ\u0003R\u0019\u0010ç\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0003\u0010è\u0003R\u0019\u0010é\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0003\u0010è\u0003R\u001f\u0010ë\u0003\u001a\n\u0012\u0005\u0012\u00030¿\u00010ê\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0003\u0010ì\u0003R\u001d\u0010\r\u001a\u00020\f8@X\u0080\u0004¢\u0006\u000f\n\u0005\b\r\u0010í\u0003\u001a\u0006\bî\u0003\u0010ï\u0003R2\u0010\u001c\u001a\u0004\u0018\u0001022\t\u0010ð\u0003\u001a\u0004\u0018\u0001028F@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u001c\u0010ñ\u0003\u001a\u0004\b5\u00104\"\u0006\bò\u0003\u0010ó\u0003R0\u0010ô\u0003\u001a\u00020\u00152\u0007\u0010ð\u0003\u001a\u00020\u00158@@@X\u0080\u000e¢\u0006\u0016\n\u0006\bô\u0003\u0010è\u0003\u001a\u0005\bõ\u0003\u0010\u0017\"\u0005\bö\u0003\u0010=R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010÷\u0003R8\u0010ù\u0003\u001a\u0005\u0018\u00010ø\u00032\n\u0010ð\u0003\u001a\u0005\u0018\u00010ø\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\bù\u0003\u0010ú\u0003\u001a\u0006\bû\u0003\u0010ü\u0003\"\u0006\bý\u0003\u0010þ\u0003R8\u0010\u0090\u0003\u001a\u0005\u0018\u00010\u008e\u00032\n\u0010ð\u0003\u001a\u0005\u0018\u00010\u008e\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0003\u0010ÿ\u0003\u001a\u0006\b\u0080\u0004\u0010\u0081\u0004\"\u0006\b\u0082\u0004\u0010\u0083\u0004R8\u0010\u0093\u0003\u001a\u0005\u0018\u00010\u0092\u00032\n\u0010ð\u0003\u001a\u0005\u0018\u00010\u0092\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0003\u0010\u0084\u0004\u001a\u0006\b\u0085\u0004\u0010\u0086\u0004\"\u0006\b\u0087\u0004\u0010\u0088\u0004R\u0018\u0010\u008c\u0004\u001a\u00030\u0089\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0004\u0010\u008b\u0004R7\u0010n\u001a\t\u0012\u0004\u0012\u00020k0\u008d\u00042\u000e\u0010\u008e\u0004\u001a\t\u0012\u0004\u0012\u00020k0\u008d\u00048@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0004\u0010\u0090\u0004\"\u0006\b\u0091\u0004\u0010\u0092\u0004¨\u0006\u0094\u0004"}, m65681d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lmv/h;", "Lmv/g;", "Lmv/b;", "Lmv/d;", "Lmv/e;", "Lmv/a;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lmv/c;", "", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/StyleObserver;", "styleObserver", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleObserver;)V", "", "pixelRatio", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)V", "", "isValid", "()Z", "Lcom/mapbox/maps/MapboxMapRecorder;", "createRecorder", "()Lcom/mapbox/maps/MapboxMapRecorder;", "", "style", "Lcom/mapbox/maps/Style$OnStyleLoaded;", "onStyleLoaded", "Ll83/a0;", "loadStyle", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "styleUri", "Lcom/mapbox/maps/TransitionOptions;", "styleTransitionOptions", "Lnv/c;", "onMapLoadErrorListener", "loadStyleUri", "(Ljava/lang/String;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lnv/c;)V", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;Lnv/c;)V", "(Ljava/lang/String;)V", "styleJson", "loadStyleJson", "Luu/a;", "styleExtension", "(Luu/a;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "(Luu/a;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lnv/c;)V", "(Luu/a;Lcom/mapbox/maps/Style$OnStyleLoaded;Lnv/c;)V", "Lcom/mapbox/maps/Style;", "getStyleDeprecated", "()Lcom/mapbox/maps/Style;", "getStyle", "(Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "inProgress", "setGestureInProgress", "(Z)V", "isGestureInProgress", "Lcom/mapbox/maps/NorthOrientation;", "northOrientation", "setNorthOrientation", "(Lcom/mapbox/maps/NorthOrientation;)V", "Lcom/mapbox/maps/ConstrainMode;", "constrainMode", "setConstrainMode", "(Lcom/mapbox/maps/ConstrainMode;)V", "Lcom/mapbox/maps/ViewportMode;", "viewportMode", "setViewportMode", "(Lcom/mapbox/maps/ViewportMode;)V", "Lcom/mapbox/maps/CameraBoundsOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "setUserAnimationInProgress", "Lcom/mapbox/maps/CameraAnimationHint;", "cameraAnimationHint", "setCameraAnimationHint", "(Lcom/mapbox/maps/CameraAnimationHint;)V", "isUserAnimationInProgress", "", "delta", "setPrefetchZoomDelta", "(B)V", "getPrefetchZoomDelta", "()B", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "Lcom/mapbox/maps/Size;", "getSize", "()Lcom/mapbox/maps/Size;", "Lkotlin/Function0;", "action", "whenSizeReady", "(Lc93/a;)V", "", "Lcom/mapbox/maps/MapDebugOptions;", "getDebug", "()Ljava/util/List;", "debugOptions", "enabled", "setDebug", "(Ljava/util/List;Z)V", "Lcom/mapbox/maps/CoordinateBounds;", "bounds", "Lcom/mapbox/maps/EdgeInsets;", "boundsPadding", "", "bearing", "pitch", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/geojson/Point;", "coordinates", "coordinatesPadding", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lkotlin/Function1;", "result", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V", "Lcom/mapbox/geojson/Geometry;", "geometry", "geometryPadding", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "Landroid/graphics/RectF;", "rectF", "coordinateBoundsForRect", "(Landroid/graphics/RectF;)Lcom/mapbox/maps/CoordinateBounds;", "coordinate", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "pixelsForCoordinates", "(Ljava/util/List;)Ljava/util/List;", "pixel", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "pixels", "coordinatesForPixels", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "coordinatesInfoForPixels", "latitude", "zoom", "getMetersPerPixelAtLatitude", "(DD)D", "(D)D", "point", "Lcom/mapbox/maps/ProjectedMeters;", "projectedMetersForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ProjectedMeters;", "projectedMeters", "coordinateForProjectedMeters", "(Lcom/mapbox/maps/ProjectedMeters;)Lcom/mapbox/geojson/Point;", "zoomScale", "Lcom/mapbox/maps/MercatorCoordinate;", "project", "(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;", "unproject", "(Lcom/mapbox/maps/MercatorCoordinate;D)Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "Lcom/mapbox/maps/RenderedQueryOptions;", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "querySourceFeatures", "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Ljava/lang/Runnable;", "runnable", "executeOnRenderThread", "(Ljava/lang/Runnable;)V", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", MapboxMap.QFE_LIMIT, "Lcom/mapbox/maps/QueryFeatureExtensionCallback;", "getGeoJsonClusterLeaves", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterChildren", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterExpansionZoom", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", "state", "Lcom/mapbox/maps/FeatureStateOperationCallback;", "setFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/QueryFeatureStateCallback;", "getFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "stateKey", "removeFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "reduceMemoryUse", "()V", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;", "Lnv/a;", "onCameraChangeListener", "addOnCameraChangeListener", "(Lnv/a;)V", "removeOnCameraChangeListener", "Lnv/b;", "onMapIdleListener", "addOnMapIdleListener", "(Lnv/b;)V", "removeOnMapIdleListener", "addOnMapLoadErrorListener", "(Lnv/c;)V", "removeOnMapLoadErrorListener", "Lnv/d;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lnv/d;)V", "removeOnMapLoadedListener", "Lnv/f;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lnv/f;)V", "removeOnRenderFrameStartedListener", "Lnv/e;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lnv/e;)V", "removeOnRenderFrameFinishedListener", "Lnv/g;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lnv/g;)V", "removeOnSourceAddedListener", "Lnv/h;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lnv/h;)V", "removeOnSourceDataLoadedListener", "Lnv/i;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lnv/i;)V", "removeOnSourceRemovedListener", "Lnv/m;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lnv/m;)V", "removeOnStyleLoadedListener", "Lnv/j;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lnv/j;)V", "removeOnStyleDataLoadedListener", "Lnv/k;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lnv/k;)V", "removeOnStyleImageMissingListener", "Lnv/l;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lnv/l;)V", "removeOnStyleImageUnusedListener", "triggerRepaint", "Lcom/mapbox/maps/FreeCameraOptions;", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "getElevation", "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "setTileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)V", "renderWorldCopies", "setRenderWorldCopies", "getRenderWorldCopies", "Lcom/mapbox/maps/Vec2;", "shape", "setScreenCullingShape", "(Ljava/util/List;)V", "getScreenCullingShape", "Lcom/mapbox/maps/PerformanceStatisticsOptions;", "Lcom/mapbox/maps/PerformanceStatisticsCallback;", "startPerformanceStatisticsCollection", "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V", "stopPerformanceStatisticsCollection", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "Lfv/a;", "function", "cameraAnimationsPlugin", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lov/c;", "gesturesPlugin", "onDestroy$maps_sdk_release", "onDestroy", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "getAttributions", "viewId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "addViewAnnotation$maps_sdk_release", "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;", "addViewAnnotation", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "layerIds", "setViewAnnotationAvoidLayers$maps_sdk_release", "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;", "setViewAnnotationAvoidLayers", "getViewAnnotationAvoidLayers$maps_sdk_release", "()Ljava/util/HashSet;", "getViewAnnotationAvoidLayers", "updateViewAnnotation$maps_sdk_release", "updateViewAnnotation", "removeViewAnnotation$maps_sdk_release", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "removeViewAnnotation", "identifier", "getViewAnnotationOptions$maps_sdk_release", "getViewAnnotationOptions", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "listener", "setViewAnnotationPositionsUpdateListener$maps_sdk_release", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;)V", "setViewAnnotationPositionsUpdateListener", "Lcom/mapbox/maps/MapInteraction;", "interaction", "addInteraction", "(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/PlatformEventInfo;", "platformEventInfo", "dispatch", "(Lcom/mapbox/maps/PlatformEventInfo;)V", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "featuresetFeature", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "descriptor", "Lcom/mapbox/maps/FeaturesetFeatureId;", "id", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateCallback;", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "FSK", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "FF", "filter", "Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/Map;", "getNativeMap", "()Lcom/mapbox/maps/Map;", "isValidUri", "(Ljava/lang/String;)Z", "applyStyle", "styleDataStyleLoadedListener", "styleDataSpritesLoadedListener", "styleDataSourcesLoadedListener", "initializeStyleLoad", "(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "clampScreenCoordinate", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/ScreenCoordinate;", "methodName", "checkMainThread", "checkNativeMap", "(Ljava/lang/String;Z)V", "Lcom/mapbox/maps/NativeMapImpl;", "isMapValid", "Z", "performanceCollectionStatisticsStarted", "", "interactions", "Ljava/util/List;", "Lcom/mapbox/maps/NativeObserver;", "getNativeObserver$maps_sdk_release", "()Lcom/mapbox/maps/NativeObserver;", "<set-?>", "Lcom/mapbox/maps/Style;", "setStyle$maps_sdk_release", "(Lcom/mapbox/maps/Style;)V", "isStyleLoadInitiated", "isStyleLoadInitiated$maps_sdk_release", "setStyleLoadInitiated$maps_sdk_release", "Lcom/mapbox/maps/StyleObserver;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "getRenderHandler$maps_sdk_release", "()Landroid/os/Handler;", "setRenderHandler$maps_sdk_release", "(Landroid/os/Handler;)V", "Lfv/a;", "getCameraAnimationsPlugin$maps_sdk_release", "()Lfv/a;", "setCameraAnimationsPlugin$maps_sdk_release", "(Lfv/a;)V", "Lov/c;", "getGesturesPlugin$maps_sdk_release", "()Lov/c;", "setGesturesPlugin$maps_sdk_release", "(Lov/c;)V", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "cameraState", "", "value", "getDebugOptions$maps_sdk_release", "()Ljava/util/Set;", "setDebugOptions$maps_sdk_release", "(Ljava/util/Set;)V", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxMap extends MapboxStyleManager implements InterfaceC25969h, InterfaceC25968g, InterfaceC25963b, InterfaceC25965d, InterfaceC25966e, InterfaceC25962a, InterfaceC25964c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final /* synthetic */ String QFE_CHILDREN = "children";
    public static final /* synthetic */ long QFE_DEFAULT_LIMIT = 10;
    public static final /* synthetic */ long QFE_DEFAULT_OFFSET = 0;
    public static final /* synthetic */ String QFE_EXPANSION_ZOOM = "expansion-zoom";
    public static final /* synthetic */ String QFE_LEAVES = "leaves";
    public static final /* synthetic */ String QFE_LIMIT = "limit";
    public static final /* synthetic */ String QFE_OFFSET = "offset";
    public static final /* synthetic */ String QFE_SUPER_CLUSTER = "supercluster";
    private static final String TAG = "Mbgl-MapboxMap";
    private InterfaceC14795a cameraAnimationsPlugin;
    private InterfaceC28381c gesturesPlugin;
    private final List<Cancelable> interactions;
    private boolean isMapValid;
    private boolean isStyleLoadInitiated;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private boolean performanceCollectionStatisticsStarted;
    private Handler renderHandler;
    private Style style;
    private final StyleObserver styleObserver;

    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0081\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001d¨\u0006("}, m65681d2 = {"Lcom/mapbox/maps/MapboxMap$Companion;", "", "<init>", "()V", "", "Lcom/mapbox/geojson/Point;", "points", "calculateBoundingBox", "(Ljava/util/List;)Ljava/util/List;", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "callback", "Ll83/a0;", "clearData", "(Lcom/mapbox/maps/AsyncOperationResultCallback;)V", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/StyleObserver;", "styleObserver", "Lcom/mapbox/maps/MapboxMap;", "invoke$maps_sdk_release", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleObserver;)Lcom/mapbox/maps/MapboxMap;", "invoke", "", "pixelRatio", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;", "", "QFE_CHILDREN", "Ljava/lang/String;", "", "QFE_DEFAULT_LIMIT", "J", "QFE_DEFAULT_OFFSET", "QFE_EXPANSION_ZOOM", "QFE_LEAVES", "QFE_LIMIT", "QFE_OFFSET", "QFE_SUPER_CLUSTER", "TAG", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Point> calculateBoundingBox(List<Point> points) {
            if (points.size() <= 2) {
                return points;
            }
            double d3 = Double.NEGATIVE_INFINITY;
            double d14 = Double.POSITIVE_INFINITY;
            double d15 = Double.POSITIVE_INFINITY;
            double d16 = Double.NEGATIVE_INFINITY;
            for (Point point : points) {
                double dLongitude = point.longitude();
                double dLatitude = point.latitude();
                if (d14 > dLongitude) {
                    d14 = dLongitude;
                }
                if (d15 > dLatitude) {
                    d15 = dLatitude;
                }
                if (d3 < dLongitude) {
                    d3 = dLongitude;
                }
                if (d16 < dLatitude) {
                    d16 = dLatitude;
                }
            }
            return AbstractC37056f.m118959K(Point.fromLngLat(d14, d15), Point.fromLngLat(d3, d16));
        }

        public final void clearData(AsyncOperationResultCallback callback) {
            AbstractC22676k.m65750j(callback, "callback");
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, StyleObserver styleObserver) {
            AbstractC22676k.m65750j(nativeMap, "nativeMap");
            AbstractC22676k.m65750j(nativeObserver, "nativeObserver");
            AbstractC22676k.m65750j(styleObserver, "styleObserver");
            return new MapboxMap(nativeMap, nativeObserver, styleObserver, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
            AbstractC22676k.m65750j(nativeMap, "nativeMap");
            AbstractC22676k.m65750j(nativeObserver, "nativeObserver");
            return new MapboxMap(nativeMap, nativeObserver, pixelRatio, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMap$cameraForCoordinates$3 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54823 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ CameraOptions $camera;
        final /* synthetic */ List<Point> $coordinates;
        final /* synthetic */ EdgeInsets $coordinatesPadding;
        final /* synthetic */ Double $maxZoom;
        final /* synthetic */ ScreenCoordinate $offset;
        final /* synthetic */ Function1 $result;
        final /* synthetic */ MapboxMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54823(Function1 function1, MapboxMap mapboxMap, List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate) {
            super(0);
            this.$result = function1;
            this.this$0 = mapboxMap;
            this.$coordinates = list;
            this.$camera = cameraOptions;
            this.$coordinatesPadding = edgeInsets;
            this.$maxZoom = d3;
            this.$offset = screenCoordinate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CameraOptions invoke$lambda$1(List coordinates, CameraOptions camera, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, MapboxMap this$0, String it) {
            AbstractC22676k.m65750j(coordinates, "$coordinates");
            AbstractC22676k.m65750j(camera, "$camera");
            AbstractC22676k.m65750j(this$0, "this$0");
            AbstractC22676k.m65750j(it, "it");
            MapboxLogger.logE(MapboxMap.TAG, "Error occurred in asynchronous cameraForCoordinates(coordinates: " + coordinates + ", camera: " + camera + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d3 + ", offset: " + screenCoordinate + ", mapSize: " + this$0.nativeMap.getSize() + "): " + it + ", empty cameraState will be returned");
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
            return cameraOptionsBuild;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134085invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134085invoke() {
            Function1 function1 = this.$result;
            CameraOptions valueOrElse = this.this$0.nativeMap.cameraForCoordinates(MapboxMap.INSTANCE.calculateBoundingBox(this.$coordinates), this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset).getValueOrElse(new C5537k(this.$coordinates, this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset, this.this$0, 0));
            AbstractC22676k.m65749i(valueOrElse, "nativeMap.cameraForCoord…meraOptions { }\n        }");
            function1.invoke(valueOrElse);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMap$loadStyleUri$1 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Luu/b;", "Ll83/a0;", "invoke", "(Luu/b;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54831 extends AbstractC22680m implements Function1 {
        final /* synthetic */ TransitionOptions $styleTransitionOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54831(TransitionOptions transitionOptions) {
            super(1);
            this.$styleTransitionOptions = transitionOptions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C35233b) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(C35233b style) {
            AbstractC22676k.m65750j(style, "$this$style");
            TransitionOptions transitionOptions = this.$styleTransitionOptions;
            if (transitionOptions != null) {
                TransitionOptions.Builder builder = new TransitionOptions.Builder();
                transitionOptions.toBuilder();
                TransitionOptions transition = builder.build();
                AbstractC22676k.m65749i(transition, "transition");
                style.f149839f = transition;
            }
        }
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NativeObserver nativeObserver, MapLoadingError error) {
        AbstractC22676k.m65750j(nativeObserver, "$nativeObserver");
        AbstractC22676k.m65750j(error, "error");
        nativeObserver.sendMapLoadingError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapboxMap this$0, MapLoadingError error) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(error, "error");
        this$0.nativeObserver.sendMapLoadingError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(MapboxMap this$0, Style style) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(style, "style");
        this$0.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addInteraction$lambda$22(MapboxMap this$0, Cancelable cancelable) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(cancelable, "$cancelable");
        this$0.interactions.remove(cancelable);
        cancelable.cancel();
    }

    private final void applyStyle(String style) {
        if (isValidUri(style)) {
            this.nativeMap.setStyleURI(style);
            return;
        }
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (AbstractC39414r.m125890i0(style)) {
            style = "{}";
        }
        nativeMapImpl.setStyleJSON(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$17(List coordinates, CameraOptions camera, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, MapboxMap this$0, String it) {
        AbstractC22676k.m65750j(coordinates, "$coordinates");
        AbstractC22676k.m65750j(camera, "$camera");
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        MapboxLogger.logE(TAG, "Error occurred in synchronous cameraForCoordinates(coordinates: " + coordinates + ", camera: " + camera + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d3 + ", offset: " + screenCoordinate + ", mapSize: " + this$0.nativeMap.getSize() + "): " + it + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
        return cameraOptionsBuild;
    }

    private final void checkNativeMap(String methodName, boolean checkMainThread) {
        if (checkMainThread) {
            ThreadChecker.INSTANCE.throwIfNotMainThread();
        }
        if (this.isMapValid) {
            return;
        }
        MapboxLogger.logW(TAG, "MapboxMap object (accessing " + methodName + ") should not be stored and used after MapView is destroyed.");
    }

    public static /* synthetic */ void checkNativeMap$default(MapboxMap mapboxMap, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        mapboxMap.checkNativeMap(str, z4);
    }

    private final ScreenCoordinate clampScreenCoordinate(ScreenCoordinate screenCoordinate) {
        Size size = this.nativeMap.getSize();
        double x3 = screenCoordinate.getX();
        double y13 = screenCoordinate.getY();
        if (screenCoordinate.getX() < 0.0d || screenCoordinate.getX() > size.getWidth()) {
            x3 = AbstractC12889b.m36257W(screenCoordinate.getX());
        }
        if (screenCoordinate.getY() < 0.0d || screenCoordinate.getY() > size.getHeight()) {
            y13 = AbstractC12889b.m36257W(screenCoordinate.getY());
        }
        return (0.0d > x3 || x3 > ((double) size.getWidth()) || 0.0d > y13 || y13 > ((double) size.getHeight())) ? new ScreenCoordinate(-1.0d, -1.0d) : new ScreenCoordinate(x3, y13);
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29(FeatureStateCallback callback, FeaturesetFeature featuresetFeature, Expected it) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(featuresetFeature, "$featuresetFeature");
        AbstractC22676k.m65750j(it, "it");
        it.onValue(new C5525e(featuresetFeature, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29$lambda$28(FeatureStateCallback callback, FeaturesetFeature featuresetFeature, Value stateAsValue) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(featuresetFeature, "$featuresetFeature");
        AbstractC22676k.m65750j(stateAsValue, "stateAsValue");
        callback.onFeatureState(featuresetFeature.getDescriptor().getFeatureState(stateAsValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34(FeatureStateCallback callback, TypedFeaturesetDescriptor descriptor, Expected it) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(descriptor, "$descriptor");
        AbstractC22676k.m65750j(it, "it");
        it.onValue(new C5522d(callback, descriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34$lambda$33(FeatureStateCallback callback, TypedFeaturesetDescriptor descriptor, Value stateAsValue) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(descriptor, "$descriptor");
        AbstractC22676k.m65750j(stateAsValue, "stateAsValue");
        callback.onFeatureState(descriptor.getFeatureState(stateAsValue));
    }

    public static /* synthetic */ Cancelable getGeoJsonClusterLeaves$default(MapboxMap mapboxMap, String str, Feature feature, long j7, long j13, QueryFeatureExtensionCallback queryFeatureExtensionCallback, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j7 = 10;
        }
        return mapboxMap.getGeoJsonClusterLeaves(str, feature, j7, (i13 & 8) != 0 ? 0L : j13, queryFeatureExtensionCallback);
    }

    private final void initializeStyleLoad(Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded styleDataStyleLoadedListener, Style.OnStyleLoaded styleDataSpritesLoadedListener, Style.OnStyleLoaded styleDataSourcesLoadedListener) {
        this.style = null;
        this.styleObserver.setLoadStyleListener(onStyleLoaded, styleDataStyleLoadedListener, styleDataSpritesLoadedListener, styleDataSourcesLoadedListener);
        this.isStyleLoadInitiated = true;
    }

    public static /* synthetic */ void initializeStyleLoad$default(MapboxMap mapboxMap, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i13 & 8) != 0) {
            onStyleLoaded4 = null;
        }
        mapboxMap.initializeStyleLoad(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    private final boolean isValidUri(String str) {
        return AbstractC39421y.m125930O(str, "mapbox://", true) || AbstractC39421y.m125930O(str, "asset://", true) || AbstractC39421y.m125930O(str, "file://", true) || URLUtil.isValidUrl(str);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(str, onStyleLoaded);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$10(InterfaceC35232a styleExtension, Style style) {
        AbstractC22676k.m65750j(styleExtension, "$styleExtension");
        AbstractC22676k.m65750j(style, "style");
        C0332w0 c0332w0 = (C0332w0) styleExtension;
        Iterator it = ((List) c0332w0.f1168x).iterator();
        while (it.hasNext()) {
            ((AbstractC2091e) it.next()).mo6603b(style);
        }
        for (C23465k c23465k : (List) c0332w0.f1165F) {
            ((C38651a) c23465k.f92937w).m123903a(style, (LayerPosition) c23465k.f92938x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$13(InterfaceC35232a styleExtension, Style style) {
        AbstractC22676k.m65750j(styleExtension, "$styleExtension");
        AbstractC22676k.m65750j(style, "style");
        C0332w0 c0332w0 = (C0332w0) styleExtension;
        Iterator it = ((List) c0332w0.f1169y).iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        Iterator it3 = ((List) c0332w0.f1164E).iterator();
        if (it3.hasNext()) {
            throw AbstractC11266d.m30454h(it3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$7(InterfaceC35232a styleExtension, Style style) {
        AbstractC22676k.m65750j(styleExtension, "$styleExtension");
        AbstractC22676k.m65750j(style, "style");
        TransitionOptions transitionOptions = (TransitionOptions) ((C0332w0) styleExtension).f1166G;
        if (transitionOptions != null) {
            style.setStyleTransition(transitionOptions);
        }
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i13 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 8) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyleJson(str, transitionOptions, onStyleLoaded, interfaceC27152c);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i13 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 8) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyleUri(str, transitionOptions, onStyleLoaded, interfaceC27152c);
    }

    public static /* synthetic */ Cancelable queryRenderedFeatures$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Value value, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            renderedQueryGeometry = null;
        }
        if ((i13 & 4) != 0) {
            value = null;
        }
        return mapboxMap.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, value, queryRenderedFeaturesetFeaturesCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44(QueryRenderedFeaturesetFeaturesCallback callback, TypedFeaturesetDescriptor descriptor, Expected expected) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(descriptor, "$descriptor");
        AbstractC22676k.m65750j(expected, "expected");
        expected.onValue(new C5527g(descriptor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44$lambda$43(QueryRenderedFeaturesetFeaturesCallback callback, TypedFeaturesetDescriptor descriptor, List listQueriedRenderedFeatureAsValue) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(descriptor, "$descriptor");
        AbstractC22676k.m65750j(listQueriedRenderedFeatureAsValue, "listQueriedRenderedFeatureAsValue");
        ArrayList<QueriedRenderedFeature> arrayList = new ArrayList();
        for (Object obj : listQueriedRenderedFeatureAsValue) {
            if (((QueriedRenderedFeature) obj).getQueriedFeature().getFeature().geometry() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (QueriedRenderedFeature queriedRenderedFeature : arrayList) {
            Feature feature = queriedRenderedFeature.getQueriedFeature().getFeature();
            AbstractC22676k.m65749i(feature, "it.queriedFeature.feature");
            FeaturesetFeatureId featuresetFeatureId = queriedRenderedFeature.getQueriedFeature().getFeaturesetFeatureId();
            String featureNamespace = featuresetFeatureId != null ? featuresetFeatureId.getFeatureNamespace() : null;
            Value state = queriedRenderedFeature.getQueriedFeature().getState();
            AbstractC22676k.m65749i(state, "it.queriedFeature.state");
            arrayList2.add(descriptor.getFeaturesetFeature(feature, featureNamespace, state));
        }
        callback.onQueryRenderedFeatures(arrayList2);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            featureStateKey = null;
        }
        if ((i13 & 4) != 0) {
            featureStateOperationCallback = new C4316g(19);
        }
        return mapboxMap.removeFeatureState(featuresetFeature, featureStateKey, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFeatureState$lambda$37() {
    }

    public static /* synthetic */ Cancelable resetFeatureStates$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeatureStateOperationCallback featureStateOperationCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            featureStateOperationCallback = new C4316g(24);
        }
        return mapboxMap.resetFeatureStates((TypedFeaturesetDescriptor<?, ?>) typedFeaturesetDescriptor, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            featureStateOperationCallback = new C4316g(21);
        }
        return mapboxMap.setFeatureState((FeaturesetFeature<FeatureState>) featuresetFeature, featureState, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFeatureState$lambda$25() {
    }

    @Override // mv.InterfaceC25964c
    @MapboxExperimental
    public Cancelable addInteraction(MapInteraction interaction) {
        AbstractC22676k.m65750j(interaction, "interaction");
        checkNativeMap$default(this, "addInteraction", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        Interaction interaction2 = interaction.coreInteraction;
        AbstractC22676k.m65749i(interaction2, "interaction.coreInteraction");
        final Cancelable cancelableAddInteraction = nativeMapImpl.addInteraction(interaction2);
        this.interactions.add(cancelableAddInteraction);
        return new Cancelable() { // from class: com.mapbox.maps.h
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                MapboxMap.addInteraction$lambda$22(this.f22041a, cancelableAddInteraction);
            }
        };
    }

    @InterfaceC23457c
    public void addOnCameraChangeListener(InterfaceC27150a onCameraChangeListener) {
        AbstractC22676k.m65750j(onCameraChangeListener, "onCameraChangeListener");
        checkNativeMap$default(this, "addOnCameraChangeListener", false, 2, null);
        this.nativeObserver.addOnCameraChangeListener(onCameraChangeListener);
    }

    @InterfaceC23457c
    public void addOnMapIdleListener(InterfaceC27151b onMapIdleListener) {
        AbstractC22676k.m65750j(onMapIdleListener, "onMapIdleListener");
        checkNativeMap$default(this, "addOnMapIdleListener", false, 2, null);
        this.nativeObserver.addOnMapIdleListener(onMapIdleListener);
    }

    @InterfaceC23457c
    public void addOnMapLoadErrorListener(InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(onMapLoadErrorListener, "onMapLoadErrorListener");
        checkNativeMap$default(this, "addOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.addOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @InterfaceC23457c
    public void addOnMapLoadedListener(InterfaceC27153d onMapLoadedListener) {
        AbstractC22676k.m65750j(onMapLoadedListener, "onMapLoadedListener");
        checkNativeMap$default(this, "addOnMapLoadedListener", false, 2, null);
        this.nativeObserver.addOnMapLoadedListener(onMapLoadedListener);
    }

    @InterfaceC23457c
    public void addOnRenderFrameFinishedListener(InterfaceC27154e onRenderFrameFinishedListener) {
        AbstractC22676k.m65750j(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        checkNativeMap$default(this, "addOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @InterfaceC23457c
    public void addOnRenderFrameStartedListener(InterfaceC27155f onRenderFrameStartedListener) {
        AbstractC22676k.m65750j(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        checkNativeMap$default(this, "addOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @InterfaceC23457c
    public void addOnSourceAddedListener(InterfaceC27156g onSourceAddedListener) {
        AbstractC22676k.m65750j(onSourceAddedListener, "onSourceAddedListener");
        checkNativeMap$default(this, "addOnSourceAddedListener", false, 2, null);
        this.nativeObserver.addOnSourceAddedListener(onSourceAddedListener);
    }

    @InterfaceC23457c
    public void addOnSourceDataLoadedListener(InterfaceC27157h onSourceDataLoadedListener) {
        AbstractC22676k.m65750j(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        checkNativeMap$default(this, "addOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @InterfaceC23457c
    public void addOnSourceRemovedListener(InterfaceC27158i onSourceRemovedListener) {
        AbstractC22676k.m65750j(onSourceRemovedListener, "onSourceRemovedListener");
        checkNativeMap$default(this, "addOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.addOnSourceRemovedListener(onSourceRemovedListener);
    }

    @InterfaceC23457c
    public void addOnStyleDataLoadedListener(InterfaceC27159j onStyleDataLoadedListener) {
        AbstractC22676k.m65750j(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        checkNativeMap$default(this, "addOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @InterfaceC23457c
    public void addOnStyleImageMissingListener(InterfaceC27160k onStyleImageMissingListener) {
        AbstractC22676k.m65750j(onStyleImageMissingListener, "onStyleImageMissingListener");
        checkNativeMap$default(this, "addOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.addOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @InterfaceC23457c
    public void addOnStyleImageUnusedListener(InterfaceC27161l onStyleImageUnusedListener) {
        AbstractC22676k.m65750j(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        checkNativeMap$default(this, "addOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.addOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @InterfaceC23457c
    public void addOnStyleLoadedListener(InterfaceC27162m onStyleLoadedListener) {
        AbstractC22676k.m65750j(onStyleLoadedListener, "onStyleLoadedListener");
        checkNativeMap$default(this, "addOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected addViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(viewId, "viewId");
        AbstractC22676k.m65750j(options, "options");
        checkNativeMap$default(this, "addViewAnnotation", false, 2, null);
        return this.nativeMap.addViewAnnotation(viewId, options);
    }

    @Override // mv.InterfaceC25966e
    public Object cameraAnimationsPlugin(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        InterfaceC14795a interfaceC14795a = this.cameraAnimationsPlugin;
        if (interfaceC14795a != null) {
            return function.invoke(interfaceC14795a);
        }
        MapboxLogger.logW(TAG, "Either camera plugin is not added to the MapView or MapView has already been destroyed; MapboxMap camera extension functions are no-op.");
        return null;
    }

    @InterfaceC23457c
    public CameraOptions cameraForCoordinateBounds(CoordinateBounds bounds, EdgeInsets boundsPadding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset) {
        AbstractC22676k.m65750j(bounds, "bounds");
        checkNativeMap$default(this, "cameraForCoordinateBounds", false, 2, null);
        return this.nativeMap.cameraForCoordinateBounds(bounds, boundsPadding, bearing, pitch, maxZoom, offset);
    }

    @InterfaceC23457c
    public CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets coordinatesPadding, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), coordinatesPadding, bearing, pitch);
    }

    @Override // mv.InterfaceC25962a
    public CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint) {
        AbstractC22676k.m65750j(fromPoint, "fromPoint");
        AbstractC22676k.m65750j(toPoint, "toPoint");
        checkNativeMap$default(this, "cameraForDrag", false, 2, null);
        return this.nativeMap.cameraForDrag(fromPoint, toPoint);
    }

    @InterfaceC23457c
    public CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets geometryPadding, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(geometry, "geometry");
        checkNativeMap$default(this, "cameraForGeometry", false, 2, null);
        return this.nativeMap.cameraForGeometry(geometry, geometryPadding, bearing, pitch);
    }

    public CoordinateBounds coordinateBoundsForCamera(CameraOptions camera) {
        AbstractC22676k.m65750j(camera, "camera");
        checkNativeMap$default(this, "coordinateBoundsForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsForCamera(camera);
    }

    public CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions camera) {
        AbstractC22676k.m65750j(camera, "camera");
        checkNativeMap$default(this, "coordinateBoundsForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsForCameraUnwrapped(camera);
    }

    public CoordinateBounds coordinateBoundsForRect(RectF rectF) {
        AbstractC22676k.m65750j(rectF, "rectF");
        checkNativeMap$default(this, "coordinateBoundsForRect", false, 2, null);
        if (rectF.isEmpty()) {
            throw new IllegalArgumentException("RectF must not be empty");
        }
        List<Point> listCoordinatesForPixels = this.nativeMap.coordinatesForPixels(AbstractC37056f.m118964P(new ScreenCoordinate(rectF.bottom, rectF.left), new ScreenCoordinate(rectF.top, rectF.right)));
        return new CoordinateBounds(listCoordinatesForPixels.get(0), listCoordinatesForPixels.get(1));
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera) {
        AbstractC22676k.m65750j(camera, "camera");
        checkNativeMap$default(this, "coordinateBoundsZoomForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCamera(camera);
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions camera) {
        AbstractC22676k.m65750j(camera, "camera");
        checkNativeMap$default(this, "coordinateBoundsZoomForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCameraUnwrapped(camera);
    }

    @Override // mv.InterfaceC25962a
    public Point coordinateForPixel(ScreenCoordinate pixel) {
        AbstractC22676k.m65750j(pixel, "pixel");
        checkNativeMap$default(this, "coordinateForPixel", false, 2, null);
        return this.nativeMap.coordinateForPixel(pixel);
    }

    public Point coordinateForProjectedMeters(ProjectedMeters projectedMeters) {
        AbstractC22676k.m65750j(projectedMeters, "projectedMeters");
        Point pointCoordinateForProjectedMeters = Projection.coordinateForProjectedMeters(projectedMeters);
        AbstractC22676k.m65749i(pointCoordinateForProjectedMeters, "coordinateForProjectedMeters(projectedMeters)");
        return pointCoordinateForProjectedMeters;
    }

    public CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel) {
        AbstractC22676k.m65750j(pixel, "pixel");
        checkNativeMap$default(this, "coordinateInfoForPixel", false, 2, null);
        return this.nativeMap.coordinateInfoForPixel(pixel);
    }

    public List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels) {
        AbstractC22676k.m65750j(pixels, "pixels");
        checkNativeMap$default(this, "coordinatesForPixels", false, 2, null);
        return this.nativeMap.coordinatesForPixels(AbstractC25265s.m74097F1(pixels));
    }

    public List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels) {
        AbstractC22676k.m65750j(pixels, "pixels");
        checkNativeMap$default(this, "coordinatesInfoForPixels", false, 2, null);
        return this.nativeMap.coordinatesInfoForPixels(pixels);
    }

    @MapboxExperimental
    public final MapboxMapRecorder createRecorder() {
        Expected<String, MapRecorder> expectedCreateInstance = MapRecorder.createInstance(this.nativeMap.getMap());
        if (expectedCreateInstance.isValue()) {
            MapRecorder value = expectedCreateInstance.getValue();
            AbstractC22676k.m65747g(value);
            return new MapboxMapRecorder(value);
        }
        String error = expectedCreateInstance.getError();
        if (error == null) {
            error = "Error occurred in MapboxMap.createRecorder!";
        }
        throw new RuntimeException(error);
    }

    @Override // mv.InterfaceC25964c
    @MapboxExperimental
    public void dispatch(PlatformEventInfo platformEventInfo) {
        AbstractC22676k.m65750j(platformEventInfo, "platformEventInfo");
        checkNativeMap$default(this, "dispatch", false, 2, null);
        this.nativeMap.dispatch(platformEventInfo);
    }

    public void executeOnRenderThread(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        checkNativeMap$default(this, "executeOnRenderThread", false, 2, null);
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public Object gesturesPlugin(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        InterfaceC28381c interfaceC28381c = this.gesturesPlugin;
        if (interfaceC28381c != null) {
            return function.invoke(interfaceC28381c);
        }
        MapboxLogger.logW(TAG, "Either gestures plugin is not added to the MapView or MapView has already been destroyed; MapboxMap gestures extension functions are no-op.");
        return null;
    }

    public final List<String> getAttributions() {
        checkNativeMap$default(this, "getAttributions", false, 2, null);
        return this.nativeMap.getAttributions();
    }

    @Override // mv.InterfaceC25962a
    public CameraBounds getBounds() {
        checkNativeMap$default(this, "getBounds", false, 2, null);
        return this.nativeMap.getBounds();
    }

    /* JADX INFO: renamed from: getCameraAnimationsPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ InterfaceC14795a getCameraAnimationsPlugin() {
        return this.cameraAnimationsPlugin;
    }

    @Override // mv.InterfaceC25962a
    public CameraState getCameraState() {
        checkNativeMap$default(this, "cameraState", false, 2, null);
        return this.nativeMap.getCameraState();
    }

    @Override // mv.InterfaceC25962a
    public MapCenterAltitudeMode getCenterAltitudeMode() {
        checkNativeMap$default(this, "getCenterAltitudeMode", false, 2, null);
        return this.nativeMap.getCenterAltitudeMode();
    }

    @InterfaceC23457c
    public final List<MapDebugOptions> getDebug() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return this.nativeMap.getDebug();
    }

    public final Set<MapDebugOptions> getDebugOptions$maps_sdk_release() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return AbstractC25265s.m74103I1(this.nativeMap.getDebug());
    }

    public final Double getElevation(Point coordinate) {
        AbstractC22676k.m65750j(coordinate, "coordinate");
        checkNativeMap$default(this, "getElevation", false, 2, null);
        return this.nativeMap.getElevation(coordinate);
    }

    public Cancelable getFeatureState(String sourceId, String sourceLayerId, String featureId, QueryFeatureStateCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(sourceId, sourceLayerId, featureId, callback);
    }

    public FreeCameraOptions getFreeCameraOptions() {
        checkNativeMap$default(this, "getFreeCameraOptions", false, 2, null);
        return this.nativeMap.getFreeCameraOptions();
    }

    public final Cancelable getGeoJsonClusterChildren(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(cluster, "cluster");
        AbstractC22676k.m65750j(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_CHILDREN, null, callback);
    }

    public final Cancelable getGeoJsonClusterExpansionZoom(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(cluster, "cluster");
        AbstractC22676k.m65750j(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_EXPANSION_ZOOM, null, callback);
    }

    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, long j7, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(cluster, "cluster");
        AbstractC22676k.m65750j(callback, "callback");
        return getGeoJsonClusterLeaves$default(this, sourceIdentifier, cluster, j7, 0L, callback, 8, null);
    }

    /* JADX INFO: renamed from: getGesturesPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ InterfaceC28381c getGesturesPlugin() {
        return this.gesturesPlugin;
    }

    @Override // mv.InterfaceC25969h
    public MapOptions getMapOptions() {
        checkNativeMap$default(this, "getMapOptions", false, 2, null);
        return this.nativeMap.getMapOptions();
    }

    @Override // mv.InterfaceC25968g
    public double getMetersPerPixelAtLatitude(double latitude, double zoom) {
        return Projection.getMetersPerPixelAtLatitude(latitude, zoom);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final Map getNativeMap() {
        return this.nativeMap.getMap();
    }

    /* JADX INFO: renamed from: getNativeObserver$maps_sdk_release, reason: from getter */
    public final /* synthetic */ NativeObserver getNativeObserver() {
        return this.nativeObserver;
    }

    public final byte getPrefetchZoomDelta() {
        checkNativeMap$default(this, "getPrefetchZoomDelta", false, 2, null);
        return this.nativeMap.getPrefetchZoomDelta();
    }

    /* JADX INFO: renamed from: getRenderHandler$maps_sdk_release, reason: from getter */
    public final /* synthetic */ Handler getRenderHandler() {
        return this.renderHandler;
    }

    public final boolean getRenderWorldCopies() {
        checkNativeMap$default(this, "getRenderWorldCopies", false, 2, null);
        return this.nativeMap.getRenderWorldCopies();
    }

    @MapboxExperimental
    public final List<Vec2> getScreenCullingShape() {
        checkNativeMap$default(this, "getScreenCullingShape", false, 2, null);
        return this.nativeMap.getScreenCullingShape();
    }

    @Override // mv.InterfaceC25969h
    public Size getSize() {
        checkNativeMap$default(this, "getSize", false, 2, null);
        return this.nativeMap.getSize();
    }

    /* JADX INFO: renamed from: getStyle, reason: merged with bridge method [inline-methods] */
    public final Style getStyleDeprecated() {
        checkNativeMap$default(this, "getStyle", false, 2, null);
        return this.style;
    }

    @MapboxExperimental
    public final HashSet<String> getViewAnnotationAvoidLayers$maps_sdk_release() {
        checkNativeMap$default(this, "getViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.getViewAnnotationAvoidLayers();
    }

    public final /* synthetic */ Expected getViewAnnotationOptions$maps_sdk_release(String identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        checkNativeMap$default(this, "getViewAnnotationOptions", false, 2, null);
        return this.nativeMap.getViewAnnotationOptions(identifier);
    }

    public boolean isGestureInProgress() {
        checkNativeMap$default(this, "isGestureInProgress", false, 2, null);
        return this.nativeMap.isGestureInProgress();
    }

    /* JADX INFO: renamed from: isStyleLoadInitiated$maps_sdk_release, reason: from getter */
    public final /* synthetic */ boolean getIsStyleLoadInitiated() {
        return this.isStyleLoadInitiated;
    }

    public boolean isUserAnimationInProgress() {
        checkNativeMap$default(this, "isUserAnimationInProgress", false, 2, null);
        return this.nativeMap.isUserAnimationInProgress();
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsMapValid() {
        return this.isMapValid;
    }

    public final void loadStyle(String style) {
        AbstractC22676k.m65750j(style, "style");
        loadStyle$default(this, style, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @InterfaceC23457c
    public final void loadStyleJson(String styleJson, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleJson, "styleJson");
        loadStyleUri(styleJson, styleTransitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    @InterfaceC23457c
    public final void loadStyleUri(String styleUri, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleUri, "styleUri");
        C54831 c54831 = new C54831(styleTransitionOptions);
        C35233b c35233b = new C35233b(styleUri);
        c54831.invoke((Object) c35233b);
        AbstractC12381b.f41843a.increment();
        loadStyle(new C0332w0(c35233b), onStyleLoaded);
    }

    public final /* synthetic */ void onDestroy$maps_sdk_release() {
        if (this.performanceCollectionStatisticsStarted) {
            stopPerformanceStatisticsCollection();
        }
        this.cameraAnimationsPlugin = null;
        this.gesturesPlugin = null;
        Iterator<T> it = this.interactions.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactions.clear();
        this.styleObserver.onDestroy();
        this.isMapValid = false;
    }

    @Override // mv.InterfaceC25962a
    public ScreenCoordinate pixelForCoordinate(Point coordinate) {
        AbstractC22676k.m65750j(coordinate, "coordinate");
        checkNativeMap$default(this, "pixelForCoordinate", false, 2, null);
        return clampScreenCoordinate(this.nativeMap.pixelForCoordinate(coordinate));
    }

    public List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        checkNativeMap$default(this, "pixelsForCoordinates", false, 2, null);
        List<ScreenCoordinate> listPixelsForCoordinates = this.nativeMap.pixelsForCoordinates(AbstractC25265s.m74097F1(coordinates));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listPixelsForCoordinates, 10));
        Iterator<T> it = listPixelsForCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(clampScreenCoordinate((ScreenCoordinate) it.next()));
        }
        return arrayList;
    }

    @Override // mv.InterfaceC25968g
    public MercatorCoordinate project(Point point, double zoomScale) {
        AbstractC22676k.m65750j(point, "point");
        MercatorCoordinate mercatorCoordinateProject = Projection.project(point, zoomScale);
        AbstractC22676k.m65749i(mercatorCoordinateProject, "project(point, zoomScale)");
        return mercatorCoordinateProject;
    }

    public ProjectedMeters projectedMetersForCoordinate(Point point) {
        AbstractC22676k.m65750j(point, "point");
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = Projection.projectedMetersForCoordinate(point);
        AbstractC22676k.m65749i(projectedMetersProjectedMetersForCoordinate, "projectedMetersForCoordinate(point)");
        return projectedMetersProjectedMetersForCoordinate;
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, RenderedQueryGeometry renderedQueryGeometry, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(callback, "callback");
        return queryRenderedFeatures$default(this, descriptor, renderedQueryGeometry, null, callback, 4, null);
    }

    @Override // mv.InterfaceC25963b
    public Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap("querySourceFeatures", false);
        return this.nativeMap.querySourceFeatures(sourceId, options, callback);
    }

    public final void reduceMemoryUse() {
        checkNativeMap$default(this, "reduceMemoryUse", false, 2, null);
        this.nativeMap.reduceMemoryUse();
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature) {
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        return removeFeatureState$default(this, featuresetFeature, null, null, 6, null);
    }

    @InterfaceC23457c
    public void removeOnCameraChangeListener(InterfaceC27150a onCameraChangeListener) {
        AbstractC22676k.m65750j(onCameraChangeListener, "onCameraChangeListener");
        checkNativeMap$default(this, "removeOnCameraChangeListener", false, 2, null);
        this.nativeObserver.removeOnCameraChangeListener(onCameraChangeListener);
    }

    @InterfaceC23457c
    public void removeOnMapIdleListener(InterfaceC27151b onMapIdleListener) {
        AbstractC22676k.m65750j(onMapIdleListener, "onMapIdleListener");
        checkNativeMap$default(this, "removeOnMapIdleListener", false, 2, null);
        this.nativeObserver.removeOnMapIdleListener(onMapIdleListener);
    }

    @InterfaceC23457c
    public void removeOnMapLoadErrorListener(InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(onMapLoadErrorListener, "onMapLoadErrorListener");
        checkNativeMap$default(this, "removeOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @InterfaceC23457c
    public void removeOnMapLoadedListener(InterfaceC27153d onMapLoadedListener) {
        AbstractC22676k.m65750j(onMapLoadedListener, "onMapLoadedListener");
        checkNativeMap$default(this, "removeOnMapLoadedListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadedListener(onMapLoadedListener);
    }

    @InterfaceC23457c
    public void removeOnRenderFrameFinishedListener(InterfaceC27154e onRenderFrameFinishedListener) {
        AbstractC22676k.m65750j(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        checkNativeMap$default(this, "removeOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @InterfaceC23457c
    public void removeOnRenderFrameStartedListener(InterfaceC27155f onRenderFrameStartedListener) {
        AbstractC22676k.m65750j(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        checkNativeMap$default(this, "removeOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @InterfaceC23457c
    public void removeOnSourceAddedListener(InterfaceC27156g onSourceAddedListener) {
        AbstractC22676k.m65750j(onSourceAddedListener, "onSourceAddedListener");
        checkNativeMap$default(this, "removeOnSourceAddedListener", false, 2, null);
        this.nativeObserver.removeOnSourceAddedListener(onSourceAddedListener);
    }

    @InterfaceC23457c
    public void removeOnSourceDataLoadedListener(InterfaceC27157h onSourceDataLoadedListener) {
        AbstractC22676k.m65750j(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        checkNativeMap$default(this, "removeOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @InterfaceC23457c
    public void removeOnSourceRemovedListener(InterfaceC27158i onSourceRemovedListener) {
        AbstractC22676k.m65750j(onSourceRemovedListener, "onSourceRemovedListener");
        checkNativeMap$default(this, "removeOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.removeOnSourceRemovedListener(onSourceRemovedListener);
    }

    @InterfaceC23457c
    public void removeOnStyleDataLoadedListener(InterfaceC27159j onStyleDataLoadedListener) {
        AbstractC22676k.m65750j(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        checkNativeMap$default(this, "removeOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @InterfaceC23457c
    public void removeOnStyleImageMissingListener(InterfaceC27160k onStyleImageMissingListener) {
        AbstractC22676k.m65750j(onStyleImageMissingListener, "onStyleImageMissingListener");
        checkNativeMap$default(this, "removeOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @InterfaceC23457c
    public void removeOnStyleImageUnusedListener(InterfaceC27161l onStyleImageUnusedListener) {
        AbstractC22676k.m65750j(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        checkNativeMap$default(this, "removeOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @InterfaceC23457c
    public void removeOnStyleLoadedListener(InterfaceC27162m onStyleLoadedListener) {
        AbstractC22676k.m65750j(onStyleLoadedListener, "onStyleLoadedListener");
        checkNativeMap$default(this, "removeOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected removeViewAnnotation$maps_sdk_release(String viewId) {
        AbstractC22676k.m65750j(viewId, "viewId");
        checkNativeMap$default(this, "removeViewAnnotation", false, 2, null);
        return this.nativeMap.removeViewAnnotation(viewId);
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return resetFeatureStates$default(this, descriptor, null, 2, null);
    }

    public Expected<String, None> setBounds(CameraBoundsOptions options) {
        AbstractC22676k.m65750j(options, "options");
        checkNativeMap$default(this, "setBounds", false, 2, null);
        return this.nativeMap.setBounds(options);
    }

    @Override // mv.InterfaceC25962a
    public void setCamera(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(cameraOptions);
    }

    @Override // mv.InterfaceC25969h
    @MapboxExperimental
    public void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        AbstractC22676k.m65750j(cameraAnimationHint, "cameraAnimationHint");
        checkNativeMap$default(this, "setCameraAnimationHint", false, 2, null);
        this.nativeMap.setCameraAnimationHint(cameraAnimationHint);
    }

    public final /* synthetic */ void setCameraAnimationsPlugin$maps_sdk_release(InterfaceC14795a interfaceC14795a) {
        this.cameraAnimationsPlugin = interfaceC14795a;
    }

    @Override // mv.InterfaceC25962a
    public void setCenterAltitudeMode(MapCenterAltitudeMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        checkNativeMap$default(this, "setCenterAltitudeMode", false, 2, null);
        this.nativeMap.setCenterAltitudeMode(mode);
    }

    public void setConstrainMode(ConstrainMode constrainMode) {
        AbstractC22676k.m65750j(constrainMode, "constrainMode");
        checkNativeMap$default(this, "setConstrainMode", false, 2, null);
        this.nativeMap.setConstrainMode(constrainMode);
    }

    @InterfaceC23457c
    public final void setDebug(List<? extends MapDebugOptions> debugOptions, boolean enabled) {
        AbstractC22676k.m65750j(debugOptions, "debugOptions");
        checkNativeMap$default(this, "setDebug", false, 2, null);
        this.nativeMap.setDebug(debugOptions, enabled);
    }

    public final void setDebugOptions$maps_sdk_release(Set<? extends MapDebugOptions> value) {
        AbstractC22676k.m65750j(value, "value");
        checkNativeMap$default(this, "setDebug", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        nativeMapImpl.setDebug(nativeMapImpl.getDebug(), false);
        this.nativeMap.setDebug(AbstractC25265s.m74093D1(value), true);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS state) {
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        AbstractC22676k.m65750j(state, "state");
        return setFeatureState$default(this, featuresetFeature, state, null, 4, null);
    }

    @Override // mv.InterfaceC25969h
    public void setGestureInProgress(boolean inProgress) {
        checkNativeMap$default(this, "setGestureInProgress", false, 2, null);
        this.nativeMap.setGestureInProgress(inProgress);
    }

    public final /* synthetic */ void setGesturesPlugin$maps_sdk_release(InterfaceC28381c interfaceC28381c) {
        this.gesturesPlugin = interfaceC28381c;
    }

    public void setNorthOrientation(NorthOrientation northOrientation) {
        AbstractC22676k.m65750j(northOrientation, "northOrientation");
        checkNativeMap$default(this, "setNorthOrientation", false, 2, null);
        this.nativeMap.setNorthOrientation(northOrientation);
    }

    public final void setPrefetchZoomDelta(byte delta) {
        checkNativeMap$default(this, "setPrefetchZoomDelta", false, 2, null);
        this.nativeMap.setPrefetchZoomDelta(delta);
    }

    public final /* synthetic */ void setRenderHandler$maps_sdk_release(Handler handler) {
        this.renderHandler = handler;
    }

    public final void setRenderWorldCopies(boolean renderWorldCopies) {
        checkNativeMap$default(this, "setRenderWorldCopies", false, 2, null);
        this.nativeMap.setRenderWorldCopies(renderWorldCopies);
    }

    @MapboxExperimental
    public final void setScreenCullingShape(List<Vec2> shape) {
        AbstractC22676k.m65750j(shape, "shape");
        checkNativeMap$default(this, "setScreenCullingShape", false, 2, null);
        this.nativeMap.setScreenCullingShape(shape);
    }

    public final /* synthetic */ void setStyle$maps_sdk_release(Style style) {
        this.style = style;
    }

    public final /* synthetic */ void setStyleLoadInitiated$maps_sdk_release(boolean z4) {
        this.isStyleLoadInitiated = z4;
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        checkNativeMap$default(this, "setTileCacheBudget", false, 2, null);
        this.nativeMap.setTileCacheBudget(tileCacheBudget);
    }

    @Override // mv.InterfaceC25969h
    public void setUserAnimationInProgress(boolean inProgress) {
        checkNativeMap$default(this, "setUserAnimationInProgress", false, 2, null);
        this.nativeMap.setUserAnimationInProgress(inProgress);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers$maps_sdk_release(HashSet<String> layerIds) {
        checkNativeMap$default(this, "setViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.setViewAnnotationAvoidLayers(layerIds);
    }

    public final /* synthetic */ void setViewAnnotationPositionsUpdateListener$maps_sdk_release(DelegatingViewAnnotationPositionsUpdateListener listener) {
        checkNativeMap$default(this, "setViewAnnotationPositionsUpdateListener", false, 2, null);
        this.nativeMap.setViewAnnotationPositionsUpdateListener(listener);
    }

    public void setViewportMode(ViewportMode viewportMode) {
        AbstractC22676k.m65750j(viewportMode, "viewportMode");
        checkNativeMap$default(this, "setViewportMode", false, 2, null);
        this.nativeMap.setViewportMode(viewportMode);
    }

    @MapboxExperimental
    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions options, PerformanceStatisticsCallback callback) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "startPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.startPerformanceStatisticsCollection(options, callback);
        this.performanceCollectionStatisticsStarted = true;
    }

    @MapboxExperimental
    public final void stopPerformanceStatisticsCollection() {
        checkNativeMap$default(this, "stopPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.stopPerformanceStatisticsCollection();
        this.performanceCollectionStatisticsStarted = false;
    }

    public Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback) {
        AbstractC22676k.m65750j(cameraChangedCallback, "cameraChangedCallback");
        checkNativeMap$default(this, "subscribeCameraChanged", false, 2, null);
        return NativeObserver.subscribeCameraChanged$default(this.nativeObserver, cameraChangedCallback, null, null, 6, null);
    }

    @Override // mv.InterfaceC25965d
    public Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        AbstractC22676k.m65750j(cameraChangedCoalescedCallback, "cameraChangedCoalescedCallback");
        checkNativeMap$default(this, "subscribeCameraChangedCoalesced", false, 2, null);
        return NativeObserver.subscribeCameraChangedCoalesced$default(this.nativeObserver, cameraChangedCoalescedCallback, null, 2, null);
    }

    @MapboxExperimental
    public Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback) {
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(genericEventCallback, "genericEventCallback");
        checkNativeMap$default(this, "subscribeGenericEvent", false, 2, null);
        return NativeObserver.subscribeGenericEvent$default(this.nativeObserver, eventName, genericEventCallback, null, 4, null);
    }

    public Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback) {
        AbstractC22676k.m65750j(mapIdleCallback, "mapIdleCallback");
        checkNativeMap$default(this, "subscribeMapIdle", false, 2, null);
        return NativeObserver.subscribeMapIdle$default(this.nativeObserver, mapIdleCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback) {
        AbstractC22676k.m65750j(mapLoadedCallback, "mapLoadedCallback");
        checkNativeMap$default(this, "subscribeMapLoaded", false, 2, null);
        return NativeObserver.subscribeMapLoaded$default(this.nativeObserver, mapLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        AbstractC22676k.m65750j(mapLoadingErrorCallback, "mapLoadingErrorCallback");
        checkNativeMap$default(this, "subscribeMapLoadingError", false, 2, null);
        return NativeObserver.subscribeMapLoadingError$default(this.nativeObserver, mapLoadingErrorCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        AbstractC22676k.m65750j(renderFrameFinishedCallback, "renderFrameFinishedCallback");
        checkNativeMap$default(this, "subscribeRenderFrameFinished", false, 2, null);
        return NativeObserver.subscribeRenderFrameFinished$default(this.nativeObserver, renderFrameFinishedCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback) {
        AbstractC22676k.m65750j(renderFrameStartedCallback, "renderFrameStartedCallback");
        checkNativeMap$default(this, "subscribeRenderFrameStarted", false, 2, null);
        return NativeObserver.subscribeRenderFrameStarted$default(this.nativeObserver, renderFrameStartedCallback, null, null, 6, null);
    }

    public Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback) {
        AbstractC22676k.m65750j(resourceRequestCallback, "resourceRequestCallback");
        checkNativeMap$default(this, "subscribeResourceRequest", false, 2, null);
        return NativeObserver.subscribeResourceRequest$default(this.nativeObserver, resourceRequestCallback, null, 2, null);
    }

    public Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback) {
        AbstractC22676k.m65750j(sourceAddedCallback, "sourceAddedCallback");
        checkNativeMap$default(this, "subscribeSourceAdded", false, 2, null);
        return NativeObserver.subscribeSourceAdded$default(this.nativeObserver, sourceAddedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback) {
        AbstractC22676k.m65750j(sourceDataLoadedCallback, "sourceDataLoadedCallback");
        checkNativeMap$default(this, "subscribeSourceDataLoaded", false, 2, null);
        return NativeObserver.subscribeSourceDataLoaded$default(this.nativeObserver, sourceDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback) {
        AbstractC22676k.m65750j(sourceRemovedCallback, "sourceRemovedCallback");
        checkNativeMap$default(this, "subscribeSourceRemoved", false, 2, null);
        return NativeObserver.subscribeSourceRemoved$default(this.nativeObserver, sourceRemovedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        AbstractC22676k.m65750j(styleDataLoadedCallback, "styleDataLoadedCallback");
        checkNativeMap$default(this, "subscribeStyleDataLoaded", false, 2, null);
        return NativeObserver.subscribeStyleDataLoaded$default(this.nativeObserver, styleDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        AbstractC22676k.m65750j(styleImageMissingCallback, "styleImageMissingCallback");
        checkNativeMap$default(this, "subscribeStyleImageMissing", false, 2, null);
        return NativeObserver.subscribeStyleImageMissing$default(this.nativeObserver, styleImageMissingCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        AbstractC22676k.m65750j(styleImageRemoveUnusedCallback, "styleImageRemoveUnusedCallback");
        checkNativeMap$default(this, "subscribeStyleImageRemoveUnused", false, 2, null);
        return NativeObserver.subscribeStyleImageRemoveUnused$default(this.nativeObserver, styleImageRemoveUnusedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        AbstractC22676k.m65750j(styleLoadedCallback, "styleLoadedCallback");
        checkNativeMap$default(this, "subscribeStyleLoaded", false, 2, null);
        return NativeObserver.subscribeStyleLoaded$default(this.nativeObserver, styleLoadedCallback, null, null, 6, null);
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(tileCoverOptions, "tileCoverOptions");
        checkNativeMap$default(this, "tileCover", false, 2, null);
        return this.nativeMap.tileCover(tileCoverOptions, cameraOptions);
    }

    public final void triggerRepaint() {
        checkNativeMap$default(this, "triggerRepaint", false, 2, null);
        this.nativeMap.triggerRepaint();
    }

    @Override // mv.InterfaceC25968g
    public Point unproject(MercatorCoordinate coordinate, double zoomScale) {
        AbstractC22676k.m65750j(coordinate, "coordinate");
        Point pointUnproject = Projection.unproject(coordinate, zoomScale);
        AbstractC22676k.m65749i(pointUnproject, "unproject(coordinate, zoomScale)");
        return pointUnproject;
    }

    public final /* synthetic */ Expected updateViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(viewId, "viewId");
        AbstractC22676k.m65750j(options, "options");
        checkNativeMap$default(this, "updateViewAnnotation", false, 2, null);
        return this.nativeMap.updateViewAnnotation(viewId, options);
    }

    @MapboxExperimental
    public final void whenSizeReady(InterfaceC4339a action) {
        AbstractC22676k.m65750j(action, "action");
        checkNativeMap$default(this, "whenSizeReady", false, 2, null);
        this.nativeMap.whenMapSizeReady(action);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, styleObserver);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, InterfaceC35232a interfaceC35232a, Style.OnStyleLoaded onStyleLoaded, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(interfaceC35232a, onStyleLoaded);
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyleJson(str, onStyleLoaded, interfaceC27152c);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyleUri(str, onStyleLoaded, interfaceC27152c);
    }

    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(cluster, "cluster");
        AbstractC22676k.m65750j(callback, "callback");
        return getGeoJsonClusterLeaves$default(this, sourceIdentifier, cluster, 0L, 0L, callback, 12, null);
    }

    public double getMetersPerPixelAtLatitude(double latitude) {
        return Projection.getMetersPerPixelAtLatitude(latitude, getCameraState().getZoom());
    }

    public final void loadStyle(InterfaceC35232a styleExtension) {
        AbstractC22676k.m65750j(styleExtension, "styleExtension");
        loadStyle$default(this, styleExtension, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @InterfaceC23457c
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleJson, "styleJson");
        loadStyleUri(styleJson, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(callback, "callback");
        return queryRenderedFeatures$default(this, descriptor, null, null, callback, 6, null);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk) {
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        return removeFeatureState$default(this, featuresetFeature, fsk, null, 4, null);
    }

    public Cancelable resetFeatureStates(String sourceId, String sourceLayerId, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(sourceId, sourceLayerId, callback);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4, FS state) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(state, "state");
        return setFeatureState$default(this, descriptor, id4, state, null, 8, null);
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver) {
        super(nativeMapImpl.getMap(), 1.0f, new C4316g(20));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = styleObserver;
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, InterfaceC35232a interfaceC35232a, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i13 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 8) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyle(interfaceC35232a, transitionOptions, onStyleLoaded, interfaceC27152c);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            featureStateKey = null;
        }
        if ((i13 & 8) != 0) {
            featureStateOperationCallback = new C4316g(23);
        }
        return mapboxMap.removeFeatureState(typedFeaturesetDescriptor, featuresetFeatureId, featureStateKey, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            featureStateOperationCallback = new C4316g(22);
        }
        return mapboxMap.setFeatureState((TypedFeaturesetDescriptor<FeatureState, ?>) typedFeaturesetDescriptor, featuresetFeatureId, featureState, featureStateOperationCallback);
    }

    public final Cancelable getFeatureState(String sourceId, String featureId, QueryFeatureStateCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        return getFeatureState(sourceId, null, featureId, callback);
    }

    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, long limit, long offset, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(cluster, "cluster");
        AbstractC22676k.m65750j(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_LEAVES, AbstractC25247g0.m73987V(new C23465k(QFE_LIMIT, new Value(limit)), new C23465k(QFE_OFFSET, new Value(offset))), callback);
    }

    public final void getStyle(Style.OnStyleLoaded onStyleLoaded) {
        AbstractC22676k.m65750j(onStyleLoaded, "onStyleLoaded");
        C23454a0 c23454a0 = null;
        checkNativeMap$default(this, "getStyle", false, 2, null);
        Style styleDeprecated = getStyleDeprecated();
        if (styleDeprecated != null) {
            onStyleLoaded.onStyleLoaded(styleDeprecated);
            c23454a0 = C23454a0.f92919a;
        }
        if (c23454a0 == null) {
            this.styleObserver.addGetStyleListener(onStyleLoaded);
        }
    }

    public final void loadStyle(String style, Style.OnStyleLoaded onStyleLoaded) {
        AbstractC22676k.m65750j(style, "style");
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        initializeStyleLoad$default(this, onStyleLoaded, new C5536j(), null, null, 12, null);
        applyStyle(style);
    }

    @InterfaceC23457c
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded) {
        AbstractC22676k.m65750j(styleJson, "styleJson");
        AbstractC22676k.m65750j(onStyleLoaded, "onStyleLoaded");
        loadStyleUri(styleJson, null, onStyleLoaded, null);
    }

    @Override // mv.InterfaceC25963b
    public Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback) {
        AbstractC22676k.m65750j(geometry, "geometry");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap("queryRenderedFeatures", false);
        return this.nativeMap.queryRenderedFeatures(geometry, options, callback);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        return removeFeatureState$default(this, descriptor, id4, null, null, 12, null);
    }

    public void setCamera(FreeCameraOptions freeCameraOptions) {
        AbstractC22676k.m65750j(freeCameraOptions, "freeCameraOptions");
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(freeCameraOptions);
    }

    public Cancelable setFeatureState(String sourceId, String sourceLayerId, String featureId, Value state, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(sourceId, sourceLayerId, featureId, state, callback);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, InterfaceC35232a interfaceC35232a, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c interfaceC27152c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i13 & 4) != 0) {
            interfaceC27152c = null;
        }
        mapboxMap.loadStyle(interfaceC35232a, onStyleLoaded, interfaceC27152c);
    }

    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(FeaturesetFeature<FS> featuresetFeature, FeatureStateCallback<FS> callback) {
        Cancelable featureState;
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        FeaturesetFeatureId id4 = featuresetFeature.getId();
        if (id4 != null && (featureState = this.nativeMap.getFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id4, new C5525e(featuresetFeature, callback))) != null) {
            return featureState;
        }
        C5526f c5526f = new C5526f(0);
        MapboxLogger.logE(TAG, "getFeatureState called but featuresetFeature.id is NULL!");
        return c5526f;
    }

    @InterfaceC23457c
    public final void loadStyleJson(String styleJson) {
        AbstractC22676k.m65750j(styleJson, "styleJson");
        loadStyleUri(styleJson, null, null, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4, FSK fsk) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        return removeFeatureState$default(this, descriptor, id4, fsk, null, 8, null);
    }

    public final Cancelable resetFeatureStates(String sourceId, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(callback, "callback");
        return resetFeatureStates(sourceId, null, callback);
    }

    @InterfaceC23457c
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, ScreenBox box) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(camera, "camera");
        AbstractC22676k.m65750j(box, "box");
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, box);
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, RenderedQueryGeometry geometry, Value filter, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "queryRenderedFeatures", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (geometry == null) {
            geometry = RenderedQueryGeometry.valueOf(new ScreenBox(new ScreenCoordinate(0.0d, 0.0d), new ScreenCoordinate(getSize().getWidth(), getSize().getHeight())));
        }
        AbstractC22676k.m65749i(geometry, "geometry ?: RenderedQuer…uble())\n        )\n      )");
        return nativeMapImpl.queryRenderedFeatures(geometry, AbstractC37056f.m118958J(new FeaturesetQueryTarget(descriptor.toFeaturesetDescriptor(), filter, null)), new C5527g(descriptor, callback));
    }

    public Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, String stateKey, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(sourceId, sourceLayerId, featureId, stateKey, callback);
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> descriptor, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(descriptor.toFeaturesetDescriptor(), callback);
    }

    public final Cancelable setFeatureState(String sourceId, String featureId, Value state, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        return setFeatureState(sourceId, null, featureId, state, callback);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS state, FeatureStateOperationCallback callback) {
        Cancelable featureState;
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        FeaturesetFeatureId id4 = featuresetFeature.getId();
        if (id4 != null && (featureState = this.nativeMap.setFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id4, state.getInternalState(), callback)) != null) {
            return featureState;
        }
        C5526f c5526f = new C5526f(1);
        MapboxLogger.logE(TAG, "setFeatureState called but featuresetFeature.id is NULL!");
        return c5526f;
    }

    @MapboxDelicateApi
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(camera, "camera");
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        if (!this.nativeMap.getSizeSet()) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().apply(block).build()");
            return cameraOptionsBuild;
        }
        CameraOptions valueOrElse = this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, coordinatesPadding, maxZoom, offset).getValueOrElse(new C5537k(coordinates, camera, coordinatesPadding, maxZoom, offset, this, 1));
        AbstractC22676k.m65749i(valueOrElse, "nativeMap.cameraForCoord…e cameraOptions { }\n    }");
        return valueOrElse;
    }

    public final void loadStyle(final InterfaceC35232a styleExtension, Style.OnStyleLoaded onStyleLoaded) {
        AbstractC22676k.m65750j(styleExtension, "styleExtension");
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        final int i13 = 0;
        final int i14 = 1;
        final int i15 = 2;
        initializeStyleLoad(onStyleLoaded, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.i
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i13) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.i
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i15) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.i
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i14) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        });
        applyStyle((String) ((C0332w0) styleExtension).f1170z);
    }

    @InterfaceC23457c
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleUri, "styleUri");
        loadStyleUri(styleUri, null, onStyleLoaded, onMapLoadErrorListener);
    }

    public final Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        return removeFeatureState(sourceId, sourceLayerId, featureId, null, callback);
    }

    @InterfaceC23457c
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded) {
        AbstractC22676k.m65750j(styleUri, "styleUri");
        AbstractC22676k.m65750j(onStyleLoaded, "onStyleLoaded");
        loadStyleUri(styleUri, null, onStyleLoaded, null);
    }

    public final Cancelable removeFeatureState(String sourceId, String featureId, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        return removeFeatureState(sourceId, null, featureId, null, callback);
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f13) {
        super(nativeMapImpl.getMap(), f13, new C0680g0(nativeObserver, 18));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = new StyleObserver(nativeMapImpl.getMap(), new C5499a(this, 1), nativeObserver, f13, new C0680g0(this, 19));
    }

    @InterfaceC23457c
    public final void loadStyleUri(String styleUri) {
        AbstractC22676k.m65750j(styleUri, "styleUri");
        loadStyleUri(styleUri, null, null, null);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK stateKey, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(featuresetFeature, "featuresetFeature");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        FeaturesetFeatureId id4 = featuresetFeature.getId();
        if (id4 != null) {
            Cancelable cancelableRemoveFeatureState = this.nativeMap.removeFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id4, stateKey != null ? stateKey.getKey() : null, callback);
            if (cancelableRemoveFeatureState != null) {
                return cancelableRemoveFeatureState;
            }
        }
        C5526f c5526f = new C5526f(2);
        MapboxLogger.logE(TAG, "removeFeatureState called but featuresetFeature.id is NULL!");
        return c5526f;
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4, FeatureStateCallback<FS> callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(descriptor.toFeaturesetDescriptor(), id4, new C5522d(callback, descriptor));
    }

    @Override // mv.InterfaceC25962a
    public void cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset, Function1 result) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(camera, "camera");
        AbstractC22676k.m65750j(result, "result");
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        this.nativeMap.whenMapSizeReady(new C54823(result, this, coordinates, camera, coordinatesPadding, maxZoom, offset));
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4, FS state, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(descriptor.toFeaturesetDescriptor(), id4, state.getInternalState(), callback);
    }

    @InterfaceC23457c
    public final void loadStyle(InterfaceC35232a styleExtension, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleExtension, "styleExtension");
        loadStyle(styleExtension, onStyleLoaded);
    }

    @InterfaceC23457c
    public final void loadStyle(InterfaceC35232a styleExtension, Style.OnStyleLoaded onStyleLoaded, InterfaceC27152c onMapLoadErrorListener) {
        AbstractC22676k.m65750j(styleExtension, "styleExtension");
        loadStyle(styleExtension, onStyleLoaded);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id4, FSK stateKey, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(callback, "callback");
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(descriptor.toFeaturesetDescriptor(), id4, stateKey != null ? stateKey.getKey() : null, callback);
    }
}
