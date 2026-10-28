package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.HashMap;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017¢\u0006\u0004\b!\u0010\u001fJ?\u0010%\u001a*\u0012\u0004\u0012\u00020\n\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#`$0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017¢\u0006\u0004\b%\u0010\u001fJ+\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0017¢\u0006\u0004\b'\u0010(JG\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\"\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 `$H\u0017¢\u0006\u0004\b*\u0010+J3\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\b-\u0010.J]\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b2\u00103J]\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b5\u00103JS\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$H\u0017¢\u0006\u0004\b6\u00107JS\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$H\u0017¢\u0006\u0004\b8\u00107J-\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b9\u0010:J-\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010;\u001a\u00020 2\b\u0010=\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\b>\u0010?J5\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\bD\u0010EJ-\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\bG\u0010?J5\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\bH\u0010EJ#\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020I0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017¢\u0006\u0004\bJ\u0010\u001fJ#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017¢\u0006\u0004\bK\u0010\u001fJ-\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020I2\u0006\u0010@\u001a\u00020\nH\u0017¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020#2\u0006\u0010@\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0004\bQ\u0010RJ3\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\bS\u0010.J#\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017¢\u0006\u0004\bT\u0010\u001fJ+\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bU\u0010VJ+\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bX\u0010VJ\u001f\u0010Y\u001a\u00020#2\u0006\u0010W\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0004\bY\u0010RJ3\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\bZ\u0010.J#\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017¢\u0006\u0004\b[\u0010\u001fJ+\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\b\\\u0010VJ9\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0017H\u0017¢\u0006\u0004\b`\u0010aJ9\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0017H\u0017¢\u0006\u0004\bb\u0010aJ9\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0017¢\u0006\u0004\bd\u0010aJ+\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0017¢\u0006\u0004\bg\u0010hJ#\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017¢\u0006\u0004\bi\u0010\u001fJ#\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017¢\u0006\u0004\bj\u0010\u001fJ\u0017\u0010k\u001a\u00020I2\u0006\u0010W\u001a\u00020\nH\u0017¢\u0006\u0004\bk\u0010OJ#\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0004\bn\u0010oJ+\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\bp\u0010VJ#\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bq\u0010mJ\u0017\u0010r\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0007¢\u0006\u0004\br\u0010oJ+\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\bs\u0010VJ#\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0007¢\u0006\u0004\bt\u0010mJ\u0017\u0010u\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0007¢\u0006\u0004\bu\u0010oJ+\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0007¢\u0006\u0004\bv\u0010VJ#\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bw\u0010mJ\u0017\u0010x\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0004\bx\u0010oJ+\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\by\u0010VJ#\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017¢\u0006\u0004\bz\u0010mJ\u0017\u0010{\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0004\b{\u0010oJ+\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0004\b|\u0010VJ\u0019\u0010~\u001a\u0004\u0018\u00010e2\u0006\u0010}\u001a\u00020\nH\u0017¢\u0006\u0004\b~\u0010\u007fJl\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010f\u001a\u00020e2\u0007\u0010\u0081\u0001\u001a\u00020I2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00172\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00172\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J%\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\nH\u0017¢\u0006\u0005\b\u0089\u0001\u0010\u001fJ\u0019\u0010\u008a\u0001\u001a\u00020I2\u0006\u0010}\u001a\u00020\nH\u0017¢\u0006\u0005\b\u008a\u0001\u0010OJ0\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0017¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J@\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020^0\u0091\u0001H\u0017¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J0\u0010\u0095\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0017¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J0\u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0017¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0012\u0010\u009b\u0001\u001a\u00020IH\u0017¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J0\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\b\u0010\u008c\u0001\u001a\u00030\u009d\u0001H\u0017¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J6\u0010¢\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u000e\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u0017H\u0017¢\u0006\u0006\b¢\u0001\u0010£\u0001J\"\u0010¥\u0001\u001a\u00020#2\u0007\u0010¤\u0001\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017¢\u0006\u0005\b¥\u0001\u0010RJ6\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010¤\u0001\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017¢\u0006\u0005\b¦\u0001\u0010.J\u0018\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0091\u0001H\u0017¢\u0006\u0005\b§\u0001\u0010\u001aJ&\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010¨\u0001\u001a\u00020 H\u0017¢\u0006\u0005\b©\u0001\u0010mJ/\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010ª\u0001\u001a\u00020\n2\u0007\u0010«\u0001\u001a\u00020\nH\u0017¢\u0006\u0005\b¬\u0001\u0010(J&\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010ª\u0001\u001a\u00020\nH\u0017¢\u0006\u0005\b\u00ad\u0001\u0010\u001fJ\u001a\u0010®\u0001\u001a\u00020I2\u0007\u0010ª\u0001\u001a\u00020\nH\u0017¢\u0006\u0005\b®\u0001\u0010OJ8\u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\b\u0010°\u0001\u001a\u00030¯\u0001H\u0017¢\u0006\u0006\b±\u0001\u0010²\u0001J7\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0006\u0010f\u001a\u00020e2\u0007\u0010\u0081\u0001\u001a\u00020IH\u0007¢\u0006\u0006\b³\u0001\u0010´\u0001J-\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0007¢\u0006\u0005\b³\u0001\u0010hJ9\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\b\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010\u0081\u0001\u001a\u00020IH\u0007¢\u0006\u0006\b³\u0001\u0010·\u0001J0\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\b\u0010¶\u0001\u001a\u00030µ\u0001H\u0007¢\u0006\u0006\b³\u0001\u0010¸\u0001J\u0018\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010\u0017H\u0017¢\u0006\u0005\bº\u0001\u0010\u001aJ\u0012\u0010»\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0006\b»\u0001\u0010¼\u0001J*\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\n\u0010¾\u0001\u001a\u0005\u0018\u00010½\u0001H\u0017¢\u0006\u0006\b¿\u0001\u0010À\u0001J&\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010Á\u0001\u001a\u00020\nH\u0017¢\u0006\u0005\b¿\u0001\u0010\u001fJ(\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010¶\u0001\u001a\u00030µ\u0001H\u0017¢\u0006\u0006\b¿\u0001\u0010Â\u0001J&\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010f\u001a\u00020eH\u0017¢\u0006\u0006\b¿\u0001\u0010Ã\u0001J2\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\n\u0010¾\u0001\u001a\u0005\u0018\u00010½\u0001H\u0017¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J.\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0007\u0010Á\u0001\u001a\u00020\nH\u0017¢\u0006\u0005\bÄ\u0001\u0010(J0\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010¶\u0001\u001a\u00030µ\u0001H\u0017¢\u0006\u0006\bÄ\u0001\u0010¸\u0001J-\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0017¢\u0006\u0005\bÄ\u0001\u0010hR\u001a\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u000f\n\u0005\b\u0003\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u000f\n\u0005\b\u0007\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010Ô\u0001\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\fR\u0016\u0010Ö\u0001\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\fR\u001c\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\u001aR$\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u00178WX\u0097\u0004¢\u0006\u000f\u0012\u0006\bÚ\u0001\u0010¼\u0001\u001a\u0005\bÙ\u0001\u0010\u001aR\u001c\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u001a¨\u0006Þ\u0001"}, m65681d2 = {"Lcom/mapbox/maps/MapboxStyleManager;", "", "Lcom/mapbox/maps/StyleManager;", "styleManager", "", "pixelRatio", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "mapLoadingErrorDelegate", "<init>", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "", "getStyleGlyphURL", "()Ljava/lang/String;", QueryParams.URL, "Ll83/a0;", "setStyleGlyphURL", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/TransitionOptions;", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "transitionOptions", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleImports", "()Ljava/util/List;", "importId", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "removeStyleImport", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/Value;", "getStyleImportSchema", "Ljava/util/HashMap;", "Lcom/mapbox/maps/StylePropertyValue;", "Lkotlin/collections/HashMap;", "getStyleImportConfigProperties", "config", "getStyleImportConfigProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "configs", "setStyleImportConfigProperties", "(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;", "value", "setStyleImportConfigProperty", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "json", "Lcom/mapbox/maps/ImportPosition;", "importPosition", "addStyleImportFromJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;", "uri", "addStyleImportFromURI", "updateStyleImportWithJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;", "updateStyleImportWithURI", "moveStyleImport", "(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;", "parameters", "Lcom/mapbox/maps/LayerPosition;", "position", "addStyleLayer", "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "layerId", "Lcom/mapbox/maps/CustomLayerHost;", "layerHost", "layerPosition", "addStyleCustomLayer", "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "properties", "addPersistentStyleLayer", "addPersistentStyleCustomLayer", "", "isStyleLayerPersistent", "removeStyleLayer", "moveStyleLayer", "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "styleLayerExists", "(Ljava/lang/String;)Z", "property", "getStyleLayerProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "setStyleLayerProperty", "getStyleLayerProperties", "setStyleLayerProperties", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "sourceId", "addStyleSource", "getStyleSourceProperty", "setStyleSourceProperty", "getStyleSourceProperties", "setStyleSourceProperties", "dataId", "Lcom/mapbox/geojson/Feature;", "features", "addGeoJSONSourceFeatures", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "updateGeoJSONSourceFeatures", "featureIds", "removeGeoJSONSourceFeatures", "Lcom/mapbox/maps/Image;", "image", "updateStyleImageSourceImage", "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "removeStyleSource", "removeStyleSourceUnchecked", "styleSourceExists", "setStyleAtmosphere", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "getStyleAtmosphereProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "setStyleAtmosphereProperty", "setStyleSnow", "getStyleSnowProperty", "setStyleSnowProperty", "setStyleRain", "getStyleRainProperty", "setStyleRainProperty", "setStyleTerrain", "getStyleTerrainProperty", "setStyleTerrainProperty", "setStyleProjection", "getStyleProjectionProperty", "setStyleProjectionProperty", "imageId", "getStyleImage", "(Ljava/lang/String;)Lcom/mapbox/maps/Image;", "scale", "sdf", "Lcom/mapbox/maps/ImageStretches;", "stretchX", "stretchY", "Lcom/mapbox/maps/ImageContent;", "content", "addStyleImage", "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;", "removeStyleImage", "hasStyleImage", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "options", "addStyleCustomGeometrySource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CanonicalTileID;", "tileId", "", "featureCollection", "setStyleCustomGeometrySourceTileData", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "invalidateStyleCustomGeometrySourceTile", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CoordinateBounds;", "coordinateBounds", "invalidateStyleCustomGeometrySourceRegion", "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;", "isStyleLoaded", "()Z", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleCustomRasterSource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "tiles", "setStyleCustomRasterSourceTileData", "(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "id", "getStyleLightProperty", "setStyleLightProperty", "getStyleLights", "lights", "setStyleLights", "modelId", "modelUri", "addStyleModel", "removeStyleModel", "hasStyleModel", "Lcom/mapbox/maps/GeoJSONSourceData;", "data", "setStyleGeoJSONSourceData", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;", "addImage", "(Ljava/lang/String;Lcom/mapbox/maps/Image;Z)Lcom/mapbox/bindgen/Expected;", "Landroid/graphics/Bitmap;", "bitmap", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Lcom/mapbox/bindgen/Expected;", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getFeaturesets", "setInitialStyleColorTheme", "()V", "Lcom/mapbox/maps/ColorTheme;", "colorTheme", "setStyleColorTheme", "(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;", "base64", "(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;", "(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "setImportColorTheme", "(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/StyleManager;", "getStyleManager", "()Lcom/mapbox/maps/StyleManager;", "F", "getPixelRatio", "()F", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "getMapLoadingErrorDelegate", "()Lcom/mapbox/maps/MapLoadingErrorDelegate;", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleDefaultCamera", "getStyleURI", "styleURI", "getStyleJSON", "styleJSON", "getStyleLayers", "styleLayers", "getStyleSlots", "getStyleSlots$annotations", "styleSlots", "getStyleSources", "styleSources", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class MapboxStyleManager {
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final float pixelRatio;
    private final StyleManager styleManager;

    public MapboxStyleManager(StyleManager styleManager, float f13, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        AbstractC22676k.m65750j(styleManager, "styleManager");
        AbstractC22676k.m65750j(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.styleManager = styleManager;
        this.pixelRatio = f13;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    public Expected<String, None> addGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(features, "features");
        Expected<String, None> expectedAddGeoJSONSourceFeatures = this.styleManager.addGeoJSONSourceFeatures(sourceId, dataId, features);
        AbstractC22676k.m65749i(expectedAddGeoJSONSourceFeatures, "styleManager.addGeoJSONS…urceId, dataId, features)");
        return expectedAddGeoJSONSourceFeatures;
    }

    public final Expected<String, None> addImage(String imageId, Image image, boolean sdf) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(image, "image");
        float f13 = this.pixelRatio;
        C25271y c25271y = C25271y.f99162w;
        return addStyleImage(imageId, f13, image, sdf, c25271y, c25271y, null);
    }

    public Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.styleManager.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        AbstractC22676k.m65749i(expectedAddPersistentStyleCustomLayer, "styleManager.addPersiste…layerHost, layerPosition)");
        return expectedAddPersistentStyleCustomLayer;
    }

    public Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleLayer = this.styleManager.addPersistentStyleLayer(properties, layerPosition);
        AbstractC22676k.m65749i(expectedAddPersistentStyleLayer, "styleManager.addPersiste…roperties, layerPosition)");
        return expectedAddPersistentStyleLayer;
    }

    public Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.styleManager.addStyleCustomGeometrySource(sourceId, options);
        AbstractC22676k.m65749i(expectedAddStyleCustomGeometrySource, "styleManager.addStyleCus…Source(sourceId, options)");
        return expectedAddStyleCustomGeometrySource;
    }

    public Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomLayer = this.styleManager.addStyleCustomLayer(layerId, layerHost, layerPosition);
        AbstractC22676k.m65749i(expectedAddStyleCustomLayer, "styleManager.addStyleCus…layerHost, layerPosition)");
        return expectedAddStyleCustomLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String sourceId, CustomRasterSourceOptions options) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomRasterSource = this.styleManager.addStyleCustomRasterSource(sourceId, options);
        AbstractC22676k.m65749i(expectedAddStyleCustomRasterSource, "styleManager.addStyleCus…Source(sourceId, options)");
        return expectedAddStyleCustomRasterSource;
    }

    public Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(stretchX, "stretchX");
        AbstractC22676k.m65750j(stretchY, "stretchY");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImage = this.styleManager.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        AbstractC22676k.m65749i(expectedAddStyleImage, "styleManager.addStyleIma…etchX, stretchY, content)");
        return expectedAddStyleImage;
    }

    public Expected<String, None> addStyleImportFromJSON(String importId, String json, HashMap<String, Value> config, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(json, "json");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromJSON = this.styleManager.addStyleImportFromJSON(importId, json, config, importPosition);
        AbstractC22676k.m65749i(expectedAddStyleImportFromJSON, "styleManager.addStyleImp…, config, importPosition)");
        return expectedAddStyleImportFromJSON;
    }

    public Expected<String, None> addStyleImportFromURI(String importId, String uri, HashMap<String, Value> config, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(uri, "uri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromURI = this.styleManager.addStyleImportFromURI(importId, uri, config, importPosition);
        AbstractC22676k.m65749i(expectedAddStyleImportFromURI, "styleManager.addStyleImp…, config, importPosition)");
        return expectedAddStyleImportFromURI;
    }

    public Expected<String, None> addStyleLayer(Value parameters, LayerPosition position) {
        AbstractC22676k.m65750j(parameters, "parameters");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleLayer = this.styleManager.addStyleLayer(parameters, position);
        AbstractC22676k.m65749i(expectedAddStyleLayer, "styleManager.addStyleLayer(parameters, position)");
        return expectedAddStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleModel(String modelId, String modelUri) {
        AbstractC22676k.m65750j(modelId, "modelId");
        AbstractC22676k.m65750j(modelUri, "modelUri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleModel = this.styleManager.addStyleModel(modelId, modelUri);
        AbstractC22676k.m65749i(expectedAddStyleModel, "styleManager.addStyleModel(modelId, modelUri)");
        return expectedAddStyleModel;
    }

    public Expected<String, None> addStyleSource(String sourceId, Value properties) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleSource = this.styleManager.addStyleSource(sourceId, properties);
        AbstractC22676k.m65749i(expectedAddStyleSource, "styleManager.addStyleSource(sourceId, properties)");
        return expectedAddStyleSource;
    }

    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<FeaturesetDescriptor> styleFeaturesets = this.styleManager.getStyleFeaturesets();
        AbstractC22676k.m65749i(styleFeaturesets, "styleManager.styleFeaturesets");
        return styleFeaturesets;
    }

    public final MapLoadingErrorDelegate getMapLoadingErrorDelegate() {
        return this.mapLoadingErrorDelegate;
    }

    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePropertyValue getStyleAtmosphereProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleAtmosphereProperty = this.styleManager.getStyleAtmosphereProperty(property);
        AbstractC22676k.m65749i(styleAtmosphereProperty, "styleManager.getStyleAtmosphereProperty(property)");
        return styleAtmosphereProperty;
    }

    public CameraOptions getStyleDefaultCamera() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        CameraOptions styleDefaultCamera = this.styleManager.getStyleDefaultCamera();
        AbstractC22676k.m65749i(styleDefaultCamera, "styleManager.styleDefaultCamera");
        return styleDefaultCamera;
    }

    @MapboxExperimental
    public String getStyleGlyphURL() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleGlyphURL = this.styleManager.getStyleGlyphURL();
        AbstractC22676k.m65749i(styleGlyphURL, "styleManager.styleGlyphURL");
        return styleGlyphURL;
    }

    public Image getStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.getStyleImage(imageId);
    }

    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, HashMap<String, StylePropertyValue>> styleImportConfigProperties = this.styleManager.getStyleImportConfigProperties(importId);
        AbstractC22676k.m65749i(styleImportConfigProperties, "styleManager.getStyleImp…onfigProperties(importId)");
        return styleImportConfigProperties;
    }

    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String importId, String config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(config, "config");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, StylePropertyValue> styleImportConfigProperty = this.styleManager.getStyleImportConfigProperty(importId, config);
        AbstractC22676k.m65749i(styleImportConfigProperty, "styleManager.getStyleImp…roperty(importId, config)");
        return styleImportConfigProperty;
    }

    public Expected<String, Value> getStyleImportSchema(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleImportSchema = this.styleManager.getStyleImportSchema(importId);
        AbstractC22676k.m65749i(styleImportSchema, "styleManager.getStyleImportSchema(importId)");
        return styleImportSchema;
    }

    public List<StyleObjectInfo> getStyleImports() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleImports = this.styleManager.getStyleImports();
        AbstractC22676k.m65749i(styleImports, "styleManager.styleImports");
        return styleImports;
    }

    public String getStyleJSON() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleJSON = this.styleManager.getStyleJSON();
        AbstractC22676k.m65749i(styleJSON, "styleManager.styleJSON");
        return styleJSON;
    }

    public Expected<String, Value> getStyleLayerProperties(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleLayerProperties = this.styleManager.getStyleLayerProperties(layerId);
        AbstractC22676k.m65749i(styleLayerProperties, "styleManager.getStyleLayerProperties(layerId)");
        return styleLayerProperties;
    }

    public StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLayerProperty = this.styleManager.getStyleLayerProperty(layerId, property);
        AbstractC22676k.m65749i(styleLayerProperty, "styleManager.getStyleLay…operty(layerId, property)");
        return styleLayerProperty;
    }

    public List<StyleObjectInfo> getStyleLayers() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLayers = this.styleManager.getStyleLayers();
        AbstractC22676k.m65749i(styleLayers, "styleManager.styleLayers");
        return styleLayers;
    }

    public StylePropertyValue getStyleLightProperty(String id4, String property) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLightProperty = this.styleManager.getStyleLightProperty(id4, property);
        AbstractC22676k.m65749i(styleLightProperty, "styleManager.getStyleLightProperty(id, property)");
        return styleLightProperty;
    }

    public List<StyleObjectInfo> getStyleLights() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLights = this.styleManager.getStyleLights();
        AbstractC22676k.m65749i(styleLights, "styleManager.styleLights");
        return styleLights;
    }

    public final StyleManager getStyleManager() {
        return this.styleManager;
    }

    public StylePropertyValue getStyleProjectionProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleProjectionProperty = this.styleManager.getStyleProjectionProperty(property);
        AbstractC22676k.m65749i(styleProjectionProperty, "styleManager.getStyleProjectionProperty(property)");
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleRainProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleRainProperty = this.styleManager.getStyleRainProperty(property);
        AbstractC22676k.m65749i(styleRainProperty, "styleManager.getStyleRainProperty(property)");
        return styleRainProperty;
    }

    public List<String> getStyleSlots() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<String> styleSlots = this.styleManager.getStyleSlots();
        AbstractC22676k.m65749i(styleSlots, "styleManager.styleSlots");
        return styleSlots;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleSnowProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSnowProperty = this.styleManager.getStyleSnowProperty(property);
        AbstractC22676k.m65749i(styleSnowProperty, "styleManager.getStyleSnowProperty(property)");
        return styleSnowProperty;
    }

    public Expected<String, Value> getStyleSourceProperties(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleSourceProperties = this.styleManager.getStyleSourceProperties(sourceId);
        AbstractC22676k.m65749i(styleSourceProperties, "styleManager.getStyleSourceProperties(sourceId)");
        return styleSourceProperties;
    }

    public StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSourceProperty = this.styleManager.getStyleSourceProperty(sourceId, property);
        AbstractC22676k.m65749i(styleSourceProperty, "styleManager.getStyleSou…perty(sourceId, property)");
        return styleSourceProperty;
    }

    public List<StyleObjectInfo> getStyleSources() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleSources = this.styleManager.getStyleSources();
        AbstractC22676k.m65749i(styleSources, "styleManager.styleSources");
        return styleSources;
    }

    public StylePropertyValue getStyleTerrainProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleTerrainProperty = this.styleManager.getStyleTerrainProperty(property);
        AbstractC22676k.m65749i(styleTerrainProperty, "styleManager.getStyleTerrainProperty(property)");
        return styleTerrainProperty;
    }

    public TransitionOptions getStyleTransition() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        TransitionOptions styleTransition = this.styleManager.getStyleTransition();
        AbstractC22676k.m65749i(styleTransition, "styleManager.styleTransition");
        return styleTransition;
    }

    public String getStyleURI() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleURI = this.styleManager.getStyleURI();
        AbstractC22676k.m65749i(styleURI, "styleManager.styleURI");
        return styleURI;
    }

    public boolean hasStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleImage(imageId);
    }

    @MapboxExperimental
    public boolean hasStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleModel(modelId);
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(coordinateBounds, "coordinateBounds");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.styleManager.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        AbstractC22676k.m65749i(expectedInvalidateStyleCustomGeometrySourceRegion, "styleManager.invalidateS…urceId, coordinateBounds)");
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.styleManager.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        AbstractC22676k.m65749i(expectedInvalidateStyleCustomGeometrySourceTile, "styleManager.invalidateS…rceTile(sourceId, tileId)");
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.styleManager.isStyleLayerPersistent(layerId);
        AbstractC22676k.m65749i(expectedIsStyleLayerPersistent, "styleManager.isStyleLayerPersistent(layerId)");
        return expectedIsStyleLayerPersistent;
    }

    public boolean isStyleLoaded() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.isStyleLoaded();
    }

    public Expected<String, None> moveStyleImport(String importId, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleImport = this.styleManager.moveStyleImport(importId, importPosition);
        AbstractC22676k.m65749i(expectedMoveStyleImport, "styleManager.moveStyleIm…importId, importPosition)");
        return expectedMoveStyleImport;
    }

    public Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleLayer = this.styleManager.moveStyleLayer(layerId, layerPosition);
        AbstractC22676k.m65749i(expectedMoveStyleLayer, "styleManager.moveStyleLa…r(layerId, layerPosition)");
        return expectedMoveStyleLayer;
    }

    public Expected<String, None> removeGeoJSONSourceFeatures(String sourceId, String dataId, List<String> featureIds) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(featureIds, "featureIds");
        Expected<String, None> expectedRemoveGeoJSONSourceFeatures = this.styleManager.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
        AbstractC22676k.m65749i(expectedRemoveGeoJSONSourceFeatures, "styleManager.removeGeoJS…ceId, dataId, featureIds)");
        return expectedRemoveGeoJSONSourceFeatures;
    }

    public Expected<String, None> removeStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImage = this.styleManager.removeStyleImage(imageId);
        AbstractC22676k.m65749i(expectedRemoveStyleImage, "styleManager.removeStyleImage(imageId)");
        return expectedRemoveStyleImage;
    }

    public Expected<String, None> removeStyleImport(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImport = this.styleManager.removeStyleImport(importId);
        AbstractC22676k.m65749i(expectedRemoveStyleImport, "styleManager.removeStyleImport(importId)");
        return expectedRemoveStyleImport;
    }

    public Expected<String, None> removeStyleLayer(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleLayer = this.styleManager.removeStyleLayer(layerId);
        AbstractC22676k.m65749i(expectedRemoveStyleLayer, "styleManager.removeStyleLayer(layerId)");
        return expectedRemoveStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleModel = this.styleManager.removeStyleModel(modelId);
        AbstractC22676k.m65749i(expectedRemoveStyleModel, "styleManager.removeStyleModel(modelId)");
        return expectedRemoveStyleModel;
    }

    public Expected<String, None> removeStyleSource(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSource = this.styleManager.removeStyleSource(sourceId);
        AbstractC22676k.m65749i(expectedRemoveStyleSource, "styleManager.removeStyleSource(sourceId)");
        return expectedRemoveStyleSource;
    }

    public Expected<String, None> removeStyleSourceUnchecked(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSourceUnchecked = this.styleManager.removeStyleSourceUnchecked(sourceId);
        AbstractC22676k.m65749i(expectedRemoveStyleSourceUnchecked, "styleManager.removeStyleSourceUnchecked(sourceId)");
        return expectedRemoveStyleSourceUnchecked;
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, ColorTheme colorTheme) {
        AbstractC22676k.m65750j(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> importColorTheme = this.styleManager.setImportColorTheme(importId, colorTheme);
        AbstractC22676k.m65749i(importColorTheme, "styleManager.setImportCo…eme(importId, colorTheme)");
        return importColorTheme;
    }

    @MapboxExperimental
    public void setInitialStyleColorTheme() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setInitialStyleColorTheme();
    }

    public Expected<String, None> setStyleAtmosphere(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphere = this.styleManager.setStyleAtmosphere(properties);
        AbstractC22676k.m65749i(styleAtmosphere, "styleManager.setStyleAtmosphere(properties)");
        return styleAtmosphere;
    }

    public Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphereProperty = this.styleManager.setStyleAtmosphereProperty(property, value);
        AbstractC22676k.m65749i(styleAtmosphereProperty, "styleManager.setStyleAtm…Property(property, value)");
        return styleAtmosphereProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleColorTheme = this.styleManager.setStyleColorTheme(colorTheme);
        AbstractC22676k.m65749i(styleColorTheme, "styleManager.setStyleColorTheme(colorTheme)");
        return styleColorTheme;
    }

    public Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        AbstractC22676k.m65750j(featureCollection, "featureCollection");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomGeometrySourceTileData = this.styleManager.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        AbstractC22676k.m65749i(styleCustomGeometrySourceTileData, "styleManager.setStyleCus…ileId, featureCollection)");
        return styleCustomGeometrySourceTileData;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String sourceId, List<CustomRasterSourceTileData> tiles) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tiles, "tiles");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomRasterSourceTileData = this.styleManager.setStyleCustomRasterSourceTileData(sourceId, tiles);
        AbstractC22676k.m65749i(styleCustomRasterSourceTileData, "styleManager.setStyleCus…TileData(sourceId, tiles)");
        return styleCustomRasterSourceTileData;
    }

    public Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(data, "data");
        Expected<String, None> styleGeoJSONSourceData = this.styleManager.setStyleGeoJSONSourceData(sourceId, dataId, data);
        AbstractC22676k.m65749i(styleGeoJSONSourceData, "styleManager.setStyleGeo…a(sourceId, dataId, data)");
        return styleGeoJSONSourceData;
    }

    @MapboxExperimental
    public void setStyleGlyphURL(String url) {
        AbstractC22676k.m65750j(url, "url");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleGlyphURL(url);
    }

    public Expected<String, None> setStyleImportConfigProperties(String importId, HashMap<String, Value> configs) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(configs, "configs");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperties = this.styleManager.setStyleImportConfigProperties(importId, configs);
        AbstractC22676k.m65749i(styleImportConfigProperties, "styleManager.setStyleImp…erties(importId, configs)");
        return styleImportConfigProperties;
    }

    public Expected<String, None> setStyleImportConfigProperty(String importId, String config, Value value) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperty = this.styleManager.setStyleImportConfigProperty(importId, config, value);
        AbstractC22676k.m65749i(styleImportConfigProperty, "styleManager.setStyleImp…(importId, config, value)");
        return styleImportConfigProperty;
    }

    public Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperties = this.styleManager.setStyleLayerProperties(layerId, properties);
        AbstractC22676k.m65749i(styleLayerProperties, "styleManager.setStyleLay…ties(layerId, properties)");
        return styleLayerProperties;
    }

    public Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperty = this.styleManager.setStyleLayerProperty(layerId, property, value);
        AbstractC22676k.m65749i(styleLayerProperty, "styleManager.setStyleLay…layerId, property, value)");
        return styleLayerProperty;
    }

    public Expected<String, None> setStyleLightProperty(String id4, String property, Value value) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLightProperty = this.styleManager.setStyleLightProperty(id4, property, value);
        AbstractC22676k.m65749i(styleLightProperty, "styleManager.setStyleLig…erty(id, property, value)");
        return styleLightProperty;
    }

    public Expected<String, None> setStyleLights(Value lights) {
        AbstractC22676k.m65750j(lights, "lights");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLights = this.styleManager.setStyleLights(lights);
        AbstractC22676k.m65749i(styleLights, "styleManager.setStyleLights(lights)");
        return styleLights;
    }

    public Expected<String, None> setStyleProjection(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjection = this.styleManager.setStyleProjection(properties);
        AbstractC22676k.m65749i(styleProjection, "styleManager.setStyleProjection(properties)");
        return styleProjection;
    }

    public Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjectionProperty = this.styleManager.setStyleProjectionProperty(property, value);
        AbstractC22676k.m65749i(styleProjectionProperty, "styleManager.setStylePro…Property(property, value)");
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRain(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRain = this.styleManager.setStyleRain(properties);
        AbstractC22676k.m65749i(styleRain, "styleManager.setStyleRain(properties)");
        return styleRain;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRainProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRainProperty = this.styleManager.setStyleRainProperty(property, value);
        AbstractC22676k.m65749i(styleRainProperty, "styleManager.setStyleRainProperty(property, value)");
        return styleRainProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnow(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnow = this.styleManager.setStyleSnow(properties);
        AbstractC22676k.m65749i(styleSnow, "styleManager.setStyleSnow(properties)");
        return styleSnow;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnowProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnowProperty = this.styleManager.setStyleSnowProperty(property, value);
        AbstractC22676k.m65749i(styleSnowProperty, "styleManager.setStyleSnowProperty(property, value)");
        return styleSnowProperty;
    }

    public Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperties = this.styleManager.setStyleSourceProperties(sourceId, properties);
        AbstractC22676k.m65749i(styleSourceProperties, "styleManager.setStyleSou…ies(sourceId, properties)");
        return styleSourceProperties;
    }

    public Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(sourceId, property, value);
        AbstractC22676k.m65749i(styleSourceProperty, "styleManager.setStyleSou…ourceId, property, value)");
        return styleSourceProperty;
    }

    public Expected<String, None> setStyleTerrain(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrain = this.styleManager.setStyleTerrain(properties);
        AbstractC22676k.m65749i(styleTerrain, "styleManager.setStyleTerrain(properties)");
        return styleTerrain;
    }

    public Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrainProperty = this.styleManager.setStyleTerrainProperty(property, value);
        AbstractC22676k.m65749i(styleTerrainProperty, "styleManager.setStyleTer…Property(property, value)");
        return styleTerrainProperty;
    }

    public void setStyleTransition(TransitionOptions transitionOptions) {
        AbstractC22676k.m65750j(transitionOptions, "transitionOptions");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleTransition(transitionOptions);
    }

    public boolean styleLayerExists(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleLayerExists(layerId);
    }

    public boolean styleSourceExists(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleSourceExists(sourceId);
    }

    public Expected<String, None> updateGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(features, "features");
        Expected<String, None> expectedUpdateGeoJSONSourceFeatures = this.styleManager.updateGeoJSONSourceFeatures(sourceId, dataId, features);
        AbstractC22676k.m65749i(expectedUpdateGeoJSONSourceFeatures, "styleManager.updateGeoJS…urceId, dataId, features)");
        return expectedUpdateGeoJSONSourceFeatures;
    }

    public Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(image, "image");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.styleManager.updateStyleImageSourceImage(sourceId, image);
        AbstractC22676k.m65749i(expectedUpdateStyleImageSourceImage, "styleManager.updateStyle…rceImage(sourceId, image)");
        return expectedUpdateStyleImageSourceImage;
    }

    public Expected<String, None> updateStyleImportWithJSON(String importId, String json, HashMap<String, Value> config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(json, "json");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithJSON = this.styleManager.updateStyleImportWithJSON(importId, json, config);
        AbstractC22676k.m65749i(expectedUpdateStyleImportWithJSON, "styleManager.updateStyle…ortId, json, config\n    )");
        return expectedUpdateStyleImportWithJSON;
    }

    public Expected<String, None> updateStyleImportWithURI(String importId, String uri, HashMap<String, Value> config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(uri, "uri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithURI = this.styleManager.updateStyleImportWithURI(importId, uri, config);
        AbstractC22676k.m65749i(expectedUpdateStyleImportWithURI, "styleManager.updateStyle…RI(importId, uri, config)");
        return expectedUpdateStyleImportWithURI;
    }

    public final Expected<String, None> addImage(String imageId, Image image) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(image, "image");
        return addImage(imageId, image, false);
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap, boolean sdf) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(bitmap, "bitmap");
        return addImage(imageId, ExtensionUtils.toMapboxImage(bitmap), sdf);
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, String base64) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(base64, "base64");
        return setImportColorTheme(importId, ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String base64) {
        AbstractC22676k.m65750j(base64, "base64");
        return setStyleColorTheme(ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(bitmap, "bitmap");
        return addImage(imageId, bitmap, false);
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Bitmap bitmap) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(bitmap, "bitmap");
        return setImportColorTheme(importId, ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        return setStyleColorTheme(ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Image image) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(image, "image");
        return setImportColorTheme(importId, ColorTheme.valueOf(image));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        AbstractC22676k.m65750j(image, "image");
        return setStyleColorTheme(ColorTheme.valueOf(image));
    }
}
