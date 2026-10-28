package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u00108J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u00108J\u0012\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bE\u0010BJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bF\u0010BJ\u0010\u0010G\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bK\u0010HJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bL\u0010BJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bM\u0010BJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bN\u0010BJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bO\u0010BJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bP\u0010BJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bQ\u0010BJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bR\u0010BJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bS\u0010BJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010UJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bW\u0010BJ\u0012\u0010X\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bX\u0010JJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bY\u0010BJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bZ\u0010BJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b[\u0010BJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\\\u0010BJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b]\u0010UJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b^\u0010UJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b_\u0010BJ\u0012\u0010`\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b`\u0010JJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\ba\u0010BJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bb\u0010BJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bc\u0010BJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bd\u0010BJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010UJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bf\u0010UJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bg\u0010BJ\u0012\u0010h\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bh\u0010JJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bi\u0010BJ\u0010\u0010j\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bj\u0010HJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bk\u0010BJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bl\u0010BJ\u0010\u0010m\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bm\u0010HJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010UJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bo\u0010BJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bp\u0010BJ\u0012\u0010q\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bq\u0010rJ¶\u0004\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010,\u001a\u00020\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010/\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u000103HÆ\u0001¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bu\u0010BJ\u0010\u0010v\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bv\u00108J\u001a\u0010y\u001a\u00020\u000b2\b\u0010x\u001a\u0004\u0018\u00010wHÖ\u0003¢\u0006\u0004\by\u0010zR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010{\u001a\u0004\b|\u00108R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010{\u001a\u0004\b}\u00108R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010~\u001a\u0004\b\u007f\u0010BR\u001b\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0007\u0010{\u001a\u0005\b\u0080\u0001\u00108R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\b\u0010~\u001a\u0005\b\u0081\u0001\u0010BR\u001d\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\t\u0010~\u001a\u0005\b\u0082\u0001\u0010BR\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\n\u0010~\u001a\u0005\b\u0083\u0001\u0010BR\u001b\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\f\u0010\u0084\u0001\u001a\u0004\b\f\u0010HR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\r\u0010\u0085\u0001\u001a\u0004\b\r\u0010JR\u001b\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u000e\u0010\u0084\u0001\u001a\u0004\b\u000e\u0010HR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u000f\u0010~\u001a\u0005\b\u0086\u0001\u0010BR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0010\u0010~\u001a\u0005\b\u0087\u0001\u0010BR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0011\u0010~\u001a\u0005\b\u0088\u0001\u0010BR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0012\u0010~\u001a\u0005\b\u0089\u0001\u0010BR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0013\u0010~\u001a\u0005\b\u008a\u0001\u0010BR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0014\u0010~\u001a\u0005\b\u008b\u0001\u0010BR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0015\u0010~\u001a\u0005\b\u008c\u0001\u0010BR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0016\u0010~\u001a\u0005\b\u008d\u0001\u0010BR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010UR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u008e\u0001\u001a\u0005\b\u0090\u0001\u0010UR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0019\u0010~\u001a\u0005\b\u0091\u0001\u0010BR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0085\u0001\u001a\u0005\b\u0092\u0001\u0010JR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001b\u0010~\u001a\u0005\b\u0093\u0001\u0010BR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001c\u0010~\u001a\u0005\b\u0094\u0001\u0010BR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001d\u0010~\u001a\u0005\b\u0095\u0001\u0010BR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001e\u0010~\u001a\u0005\b\u0096\u0001\u0010BR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u008e\u0001\u001a\u0005\b\u0097\u0001\u0010UR\u001e\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u008e\u0001\u001a\u0005\b\u0098\u0001\u0010UR\u001d\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010~\u001a\u0005\b\u0099\u0001\u0010BR\u001e\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0085\u0001\u001a\u0005\b\u009a\u0001\u0010JR\u001d\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b#\u0010~\u001a\u0005\b\u009b\u0001\u0010BR\u001d\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010~\u001a\u0005\b\u009c\u0001\u0010BR\u001d\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010~\u001a\u0005\b\u009d\u0001\u0010BR\u001d\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b&\u0010~\u001a\u0005\b\u009e\u0001\u0010BR\u001e\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u008e\u0001\u001a\u0005\b\u009f\u0001\u0010UR\u001e\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u008e\u0001\u001a\u0005\b \u0001\u0010UR\u001d\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b)\u0010~\u001a\u0005\b¡\u0001\u0010BR\u001e\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0085\u0001\u001a\u0005\b¢\u0001\u0010JR\u001d\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b+\u0010~\u001a\u0005\b£\u0001\u0010BR\u001c\u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0084\u0001\u001a\u0005\b¤\u0001\u0010HR\u001d\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b-\u0010~\u001a\u0005\b¥\u0001\u0010BR\u001d\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b.\u0010~\u001a\u0005\b¦\u0001\u0010BR\u001b\u0010/\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b/\u0010\u0084\u0001\u001a\u0004\b/\u0010HR\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u008e\u0001\u001a\u0005\b§\u0001\u0010UR\u001d\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b1\u0010~\u001a\u0005\b¨\u0001\u0010BR\u001d\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0004\b2\u0010~\u001a\u0005\b©\u0001\u0010BR\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010ª\u0001\u001a\u0005\b«\u0001\u0010rR\u0015\u0010¯\u0001\u001a\u00030¬\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001¨\u0006°\u0001"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "Landroid/os/Parcelable;", "", "campaignId", "id", "", "text", "order", "typeFormUrl", "imageUrl", "imageAlt", "", "isBpStep", "isTimerActive", "isBtHr", "title", "subtitle", "cta", "typeFormTitle", "systolicLabel", "systolicTooLowText", "systolicTooHighText", "systolicRequiredText", "systolicMax", "systolicMin", "systolicSuffix", "systolicRequired", "diastolicLabel", "diastolicTooLowText", "diastolicTooHighText", "diastolicRequiredText", "diastolicMax", "diastolicMin", "diastolicSuffix", "diastolicRequired", "hrLabel", "hrTooLowText", "hrTooHighText", "hrRequiredText", "hrMax", "hrMin", "hrSuffix", "hrRequired", "inputType", "inputRequired", "requiredRegex", "blockedRegex", "isCountDownTimerRequired", "countDownTimerSeconds", "surveyFormId", "surveyVendorMetadata", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "<init>", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Integer;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "copy", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaignId", "getId", "Ljava/lang/String;", "getText", "getOrder", "getTypeFormUrl", "getImageUrl", "getImageAlt", "Z", "Ljava/lang/Boolean;", "getTitle", "getSubtitle", "getCta", "getTypeFormTitle", "getSystolicLabel", "getSystolicTooLowText", "getSystolicTooHighText", "getSystolicRequiredText", "Ljava/lang/Integer;", "getSystolicMax", "getSystolicMin", "getSystolicSuffix", "getSystolicRequired", "getDiastolicLabel", "getDiastolicTooLowText", "getDiastolicTooHighText", "getDiastolicRequiredText", "getDiastolicMax", "getDiastolicMin", "getDiastolicSuffix", "getDiastolicRequired", "getHrLabel", "getHrTooLowText", "getHrTooHighText", "getHrRequiredText", "getHrMax", "getHrMin", "getHrSuffix", "getHrRequired", "getInputType", "getInputRequired", "getRequiredRegex", "getBlockedRegex", "getCountDownTimerSeconds", "getSurveyFormId", "getSurveyVendorMetadata", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "getSurveyProvider", "Lcom/whoop/whooplabs/data/domain/ProtocolStepType;", "getStepType", "()Lcom/whoop/whooplabs/data/domain/ProtocolStepType;", "stepType", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStep implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ProtocolStep> CREATOR = new Creator();
    private final String blockedRegex;
    private final int campaignId;
    private final Integer countDownTimerSeconds;
    private final String cta;
    private final String diastolicLabel;
    private final Integer diastolicMax;
    private final Integer diastolicMin;
    private final Boolean diastolicRequired;
    private final String diastolicRequiredText;
    private final String diastolicSuffix;
    private final String diastolicTooHighText;
    private final String diastolicTooLowText;
    private final String hrLabel;
    private final Integer hrMax;
    private final Integer hrMin;
    private final Boolean hrRequired;
    private final String hrRequiredText;
    private final String hrSuffix;
    private final String hrTooHighText;
    private final String hrTooLowText;
    private final int id;
    private final String imageAlt;
    private final String imageUrl;
    private final boolean inputRequired;
    private final String inputType;
    private final boolean isBpStep;
    private final boolean isBtHr;
    private final boolean isCountDownTimerRequired;
    private final Boolean isTimerActive;
    private final int order;
    private final String requiredRegex;
    private final String subtitle;
    private final String surveyFormId;
    private final SurveyProvider surveyProvider;
    private final String surveyVendorMetadata;
    private final String systolicLabel;
    private final Integer systolicMax;
    private final Integer systolicMin;
    private final Boolean systolicRequired;
    private final String systolicRequiredText;
    private final String systolicSuffix;
    private final String systolicTooHighText;
    private final String systolicTooLowText;
    private final String text;
    private final String title;
    private final String typeFormTitle;
    private final String typeFormUrl;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ProtocolStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStep createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z4;
            boolean z13;
            Integer numValueOf;
            Boolean bool;
            Boolean boolValueOf2;
            Object obj;
            Object objValueOf;
            Object obj2;
            Object objValueOf2;
            Object obj3;
            Object objValueOf3;
            Object obj4;
            Object objValueOf4;
            Object obj5;
            boolean z14;
            boolean z15;
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            int i15 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z16 = false;
            if (parcel.readInt() != 0) {
                z16 = true;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z16);
            }
            if (parcel.readInt() != 0) {
                z4 = true;
                z13 = true;
            } else {
                z4 = true;
                z13 = z16;
            }
            String string5 = parcel.readString();
            boolean z17 = z4;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                numValueOf = null;
                bool = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            Integer num = numValueOf2;
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool;
                obj = boolValueOf2;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z17 : z16);
                obj = bool;
            }
            String string14 = parcel.readString();
            Integer num2 = numValueOf;
            Boolean bool2 = boolValueOf2;
            String string15 = parcel.readString();
            Object obj6 = obj;
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            Object objValueOf5 = parcel.readInt() == 0 ? obj6 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                objValueOf = obj6;
                obj2 = objValueOf;
            } else {
                objValueOf = Integer.valueOf(parcel.readInt());
                obj2 = obj6;
            }
            Integer num3 = objValueOf5;
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf2 = obj2;
                obj3 = objValueOf2;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z17 : z16);
                obj3 = obj2;
            }
            String string19 = parcel.readString();
            Integer num4 = objValueOf;
            Boolean bool3 = objValueOf2;
            String string20 = parcel.readString();
            Object obj7 = obj3;
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            Object objValueOf6 = parcel.readInt() == 0 ? obj7 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                objValueOf3 = obj7;
                obj4 = objValueOf3;
            } else {
                objValueOf3 = Integer.valueOf(parcel.readInt());
                obj4 = obj7;
            }
            Integer num5 = objValueOf6;
            String string23 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf4 = obj4;
                obj5 = objValueOf4;
            } else {
                objValueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z17 : z16);
                obj5 = obj4;
            }
            String string24 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = z17;
                z15 = z14;
            } else {
                z14 = z17;
                z15 = z16;
            }
            Object objValueOf7 = obj5;
            String string25 = parcel.readString();
            boolean z18 = z14;
            String string26 = parcel.readString();
            z16 = parcel.readInt() != 0 ? z18 : false;
            Integer numValueOf3 = parcel.readInt() == 0 ? objValueOf7 : Integer.valueOf(parcel.readInt());
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            if (parcel.readInt() != 0) {
                objValueOf7 = SurveyProvider.valueOf(parcel.readString());
            }
            return new ProtocolStep(i13, i14, string, i15, string2, string3, string4, z16, boolValueOf, z13, string5, string6, string7, string8, string9, string10, string11, string12, num, num2, string13, bool2, string14, string15, string16, string17, num3, num4, string18, bool3, string19, string20, string21, string22, num5, objValueOf3, string23, objValueOf4, string24, z15, string25, string26, z16, numValueOf3, string27, string28, objValueOf7);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStep[] newArray(int i13) {
            return new ProtocolStep[i13];
        }
    }

    public ProtocolStep(int i13, int i14, String str, int i15, String str2, String str3, String str4, boolean z4, Boolean bool, boolean z13, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13, Boolean bool2, String str14, String str15, String str16, String str17, Integer num3, Integer num4, String str18, Boolean bool3, String str19, String str20, String str21, String str22, Integer num5, Integer num6, String str23, Boolean bool4, String str24, boolean z14, String str25, String str26, boolean z15, Integer num7, String str27, String str28, SurveyProvider surveyProvider) {
        this.campaignId = i13;
        this.id = i14;
        this.text = str;
        this.order = i15;
        this.typeFormUrl = str2;
        this.imageUrl = str3;
        this.imageAlt = str4;
        this.isBpStep = z4;
        this.isTimerActive = bool;
        this.isBtHr = z13;
        this.title = str5;
        this.subtitle = str6;
        this.cta = str7;
        this.typeFormTitle = str8;
        this.systolicLabel = str9;
        this.systolicTooLowText = str10;
        this.systolicTooHighText = str11;
        this.systolicRequiredText = str12;
        this.systolicMax = num;
        this.systolicMin = num2;
        this.systolicSuffix = str13;
        this.systolicRequired = bool2;
        this.diastolicLabel = str14;
        this.diastolicTooLowText = str15;
        this.diastolicTooHighText = str16;
        this.diastolicRequiredText = str17;
        this.diastolicMax = num3;
        this.diastolicMin = num4;
        this.diastolicSuffix = str18;
        this.diastolicRequired = bool3;
        this.hrLabel = str19;
        this.hrTooLowText = str20;
        this.hrTooHighText = str21;
        this.hrRequiredText = str22;
        this.hrMax = num5;
        this.hrMin = num6;
        this.hrSuffix = str23;
        this.hrRequired = bool4;
        this.inputType = str24;
        this.inputRequired = z14;
        this.requiredRegex = str25;
        this.blockedRegex = str26;
        this.isCountDownTimerRequired = z15;
        this.countDownTimerSeconds = num7;
        this.surveyFormId = str27;
        this.surveyVendorMetadata = str28;
        this.surveyProvider = surveyProvider;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsBtHr() {
        return this.isBtHr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTypeFormTitle() {
        return this.typeFormTitle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSystolicLabel() {
        return this.systolicLabel;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSystolicTooLowText() {
        return this.systolicTooLowText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSystolicTooHighText() {
        return this.systolicTooHighText;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSystolicRequiredText() {
        return this.systolicRequiredText;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getSystolicMax() {
        return this.systolicMax;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getSystolicMin() {
        return this.systolicMin;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSystolicSuffix() {
        return this.systolicSuffix;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getSystolicRequired() {
        return this.systolicRequired;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDiastolicLabel() {
        return this.diastolicLabel;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getDiastolicTooLowText() {
        return this.diastolicTooLowText;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDiastolicTooHighText() {
        return this.diastolicTooHighText;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getDiastolicRequiredText() {
        return this.diastolicRequiredText;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getDiastolicMax() {
        return this.diastolicMax;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getDiastolicMin() {
        return this.diastolicMin;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDiastolicSuffix() {
        return this.diastolicSuffix;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getDiastolicRequired() {
        return this.diastolicRequired;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getHrLabel() {
        return this.hrLabel;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getHrTooLowText() {
        return this.hrTooLowText;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getHrTooHighText() {
        return this.hrTooHighText;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getHrRequiredText() {
        return this.hrRequiredText;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Integer getHrMax() {
        return this.hrMax;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getHrMin() {
        return this.hrMin;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getHrSuffix() {
        return this.hrSuffix;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Boolean getHrRequired() {
        return this.hrRequired;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final boolean getInputRequired() {
        return this.inputRequired;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getRequiredRegex() {
        return this.requiredRegex;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getBlockedRegex() {
        return this.blockedRegex;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final boolean getIsCountDownTimerRequired() {
        return this.isCountDownTimerRequired;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Integer getCountDownTimerSeconds() {
        return this.countDownTimerSeconds;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getSurveyFormId() {
        return this.surveyFormId;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getSurveyVendorMetadata() {
        return this.surveyVendorMetadata;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final SurveyProvider getSurveyProvider() {
        return this.surveyProvider;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTypeFormUrl() {
        return this.typeFormUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageAlt() {
        return this.imageAlt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsBpStep() {
        return this.isBpStep;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsTimerActive() {
        return this.isTimerActive;
    }

    public final ProtocolStep copy(int campaignId, int id4, String text, int order, String typeFormUrl, String imageUrl, String imageAlt, boolean isBpStep, Boolean isTimerActive, boolean isBtHr, String title, String subtitle, String cta, String typeFormTitle, String systolicLabel, String systolicTooLowText, String systolicTooHighText, String systolicRequiredText, Integer systolicMax, Integer systolicMin, String systolicSuffix, Boolean systolicRequired, String diastolicLabel, String diastolicTooLowText, String diastolicTooHighText, String diastolicRequiredText, Integer diastolicMax, Integer diastolicMin, String diastolicSuffix, Boolean diastolicRequired, String hrLabel, String hrTooLowText, String hrTooHighText, String hrRequiredText, Integer hrMax, Integer hrMin, String hrSuffix, Boolean hrRequired, String inputType, boolean inputRequired, String requiredRegex, String blockedRegex, boolean isCountDownTimerRequired, Integer countDownTimerSeconds, String surveyFormId, String surveyVendorMetadata, SurveyProvider surveyProvider) {
        return new ProtocolStep(campaignId, id4, text, order, typeFormUrl, imageUrl, imageAlt, isBpStep, isTimerActive, isBtHr, title, subtitle, cta, typeFormTitle, systolicLabel, systolicTooLowText, systolicTooHighText, systolicRequiredText, systolicMax, systolicMin, systolicSuffix, systolicRequired, diastolicLabel, diastolicTooLowText, diastolicTooHighText, diastolicRequiredText, diastolicMax, diastolicMin, diastolicSuffix, diastolicRequired, hrLabel, hrTooLowText, hrTooHighText, hrRequiredText, hrMax, hrMin, hrSuffix, hrRequired, inputType, inputRequired, requiredRegex, blockedRegex, isCountDownTimerRequired, countDownTimerSeconds, surveyFormId, surveyVendorMetadata, surveyProvider);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStep)) {
            return false;
        }
        ProtocolStep protocolStep = (ProtocolStep) other;
        return this.campaignId == protocolStep.campaignId && this.id == protocolStep.id && AbstractC22676k.m65745e(this.text, protocolStep.text) && this.order == protocolStep.order && AbstractC22676k.m65745e(this.typeFormUrl, protocolStep.typeFormUrl) && AbstractC22676k.m65745e(this.imageUrl, protocolStep.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, protocolStep.imageAlt) && this.isBpStep == protocolStep.isBpStep && AbstractC22676k.m65745e(this.isTimerActive, protocolStep.isTimerActive) && this.isBtHr == protocolStep.isBtHr && AbstractC22676k.m65745e(this.title, protocolStep.title) && AbstractC22676k.m65745e(this.subtitle, protocolStep.subtitle) && AbstractC22676k.m65745e(this.cta, protocolStep.cta) && AbstractC22676k.m65745e(this.typeFormTitle, protocolStep.typeFormTitle) && AbstractC22676k.m65745e(this.systolicLabel, protocolStep.systolicLabel) && AbstractC22676k.m65745e(this.systolicTooLowText, protocolStep.systolicTooLowText) && AbstractC22676k.m65745e(this.systolicTooHighText, protocolStep.systolicTooHighText) && AbstractC22676k.m65745e(this.systolicRequiredText, protocolStep.systolicRequiredText) && AbstractC22676k.m65745e(this.systolicMax, protocolStep.systolicMax) && AbstractC22676k.m65745e(this.systolicMin, protocolStep.systolicMin) && AbstractC22676k.m65745e(this.systolicSuffix, protocolStep.systolicSuffix) && AbstractC22676k.m65745e(this.systolicRequired, protocolStep.systolicRequired) && AbstractC22676k.m65745e(this.diastolicLabel, protocolStep.diastolicLabel) && AbstractC22676k.m65745e(this.diastolicTooLowText, protocolStep.diastolicTooLowText) && AbstractC22676k.m65745e(this.diastolicTooHighText, protocolStep.diastolicTooHighText) && AbstractC22676k.m65745e(this.diastolicRequiredText, protocolStep.diastolicRequiredText) && AbstractC22676k.m65745e(this.diastolicMax, protocolStep.diastolicMax) && AbstractC22676k.m65745e(this.diastolicMin, protocolStep.diastolicMin) && AbstractC22676k.m65745e(this.diastolicSuffix, protocolStep.diastolicSuffix) && AbstractC22676k.m65745e(this.diastolicRequired, protocolStep.diastolicRequired) && AbstractC22676k.m65745e(this.hrLabel, protocolStep.hrLabel) && AbstractC22676k.m65745e(this.hrTooLowText, protocolStep.hrTooLowText) && AbstractC22676k.m65745e(this.hrTooHighText, protocolStep.hrTooHighText) && AbstractC22676k.m65745e(this.hrRequiredText, protocolStep.hrRequiredText) && AbstractC22676k.m65745e(this.hrMax, protocolStep.hrMax) && AbstractC22676k.m65745e(this.hrMin, protocolStep.hrMin) && AbstractC22676k.m65745e(this.hrSuffix, protocolStep.hrSuffix) && AbstractC22676k.m65745e(this.hrRequired, protocolStep.hrRequired) && AbstractC22676k.m65745e(this.inputType, protocolStep.inputType) && this.inputRequired == protocolStep.inputRequired && AbstractC22676k.m65745e(this.requiredRegex, protocolStep.requiredRegex) && AbstractC22676k.m65745e(this.blockedRegex, protocolStep.blockedRegex) && this.isCountDownTimerRequired == protocolStep.isCountDownTimerRequired && AbstractC22676k.m65745e(this.countDownTimerSeconds, protocolStep.countDownTimerSeconds) && AbstractC22676k.m65745e(this.surveyFormId, protocolStep.surveyFormId) && AbstractC22676k.m65745e(this.surveyVendorMetadata, protocolStep.surveyVendorMetadata) && this.surveyProvider == protocolStep.surveyProvider;
    }

    public final String getBlockedRegex() {
        return this.blockedRegex;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final Integer getCountDownTimerSeconds() {
        return this.countDownTimerSeconds;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDiastolicLabel() {
        return this.diastolicLabel;
    }

    public final Integer getDiastolicMax() {
        return this.diastolicMax;
    }

    public final Integer getDiastolicMin() {
        return this.diastolicMin;
    }

    public final Boolean getDiastolicRequired() {
        return this.diastolicRequired;
    }

    public final String getDiastolicRequiredText() {
        return this.diastolicRequiredText;
    }

    public final String getDiastolicSuffix() {
        return this.diastolicSuffix;
    }

    public final String getDiastolicTooHighText() {
        return this.diastolicTooHighText;
    }

    public final String getDiastolicTooLowText() {
        return this.diastolicTooLowText;
    }

    public final String getHrLabel() {
        return this.hrLabel;
    }

    public final Integer getHrMax() {
        return this.hrMax;
    }

    public final Integer getHrMin() {
        return this.hrMin;
    }

    public final Boolean getHrRequired() {
        return this.hrRequired;
    }

    public final String getHrRequiredText() {
        return this.hrRequiredText;
    }

    public final String getHrSuffix() {
        return this.hrSuffix;
    }

    public final String getHrTooHighText() {
        return this.hrTooHighText;
    }

    public final String getHrTooLowText() {
        return this.hrTooLowText;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImageAlt() {
        return this.imageAlt;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getInputRequired() {
        return this.inputRequired;
    }

    public final String getInputType() {
        return this.inputType;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getRequiredRegex() {
        return this.requiredRegex;
    }

    public final ProtocolStepType getStepType() {
        String str = this.typeFormUrl;
        if (str != null && str.length() != 0) {
            return ProtocolStepType.TYPEFORM;
        }
        if (this.isBpStep) {
            return ProtocolStepType.BP;
        }
        if (this.isBtHr) {
            return ProtocolStepType.BTHR;
        }
        if (AbstractC22676k.m65745e(this.inputType, "TEXT_SELECTION")) {
            return ProtocolStepType.SELECTION;
        }
        if (AbstractC22676k.m65745e(this.inputType, "NUMBER_INPUT")) {
            return ProtocolStepType.NUMBER_INPUT;
        }
        if (AbstractC22676k.m65745e(this.inputType, "TEXT_INPUT")) {
            return ProtocolStepType.TEXT_INPUT;
        }
        if (AbstractC22676k.m65745e(this.inputType, "TIME_PICKER")) {
            return ProtocolStepType.TIME_PICKER;
        }
        return AbstractC22676k.m65745e(this.inputType, "DATETIME_PICKER") ? ProtocolStepType.DATETIME_PICKER : ProtocolStepType.INSTRUCTION;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSurveyFormId() {
        return this.surveyFormId;
    }

    public final SurveyProvider getSurveyProvider() {
        return this.surveyProvider;
    }

    public final String getSurveyVendorMetadata() {
        return this.surveyVendorMetadata;
    }

    public final String getSystolicLabel() {
        return this.systolicLabel;
    }

    public final Integer getSystolicMax() {
        return this.systolicMax;
    }

    public final Integer getSystolicMin() {
        return this.systolicMin;
    }

    public final Boolean getSystolicRequired() {
        return this.systolicRequired;
    }

    public final String getSystolicRequiredText() {
        return this.systolicRequiredText;
    }

    public final String getSystolicSuffix() {
        return this.systolicSuffix;
    }

    public final String getSystolicTooHighText() {
        return this.systolicTooHighText;
    }

    public final String getSystolicTooLowText() {
        return this.systolicTooLowText;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTypeFormTitle() {
        return this.typeFormTitle;
    }

    public final String getTypeFormUrl() {
        return this.typeFormUrl;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.id, Integer.hashCode(this.campaignId) * 31, 31);
        String str = this.text;
        int iM30448b2 = AbstractC11266d.m30448b(this.order, (iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.typeFormUrl;
        int iHashCode = (iM30448b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageAlt;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isBpStep);
        Boolean bool = this.isTimerActive;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isBtHr);
        String str5 = this.title;
        int iHashCode3 = (iM8289b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cta;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.typeFormTitle;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.systolicLabel;
        int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systolicTooLowText;
        int iHashCode8 = (iHashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.systolicTooHighText;
        int iHashCode9 = (iHashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.systolicRequiredText;
        int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.systolicMax;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.systolicMin;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.systolicSuffix;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.systolicRequired;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.diastolicLabel;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.diastolicTooLowText;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.diastolicTooHighText;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.diastolicRequiredText;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num3 = this.diastolicMax;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.diastolicMin;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str18 = this.diastolicSuffix;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool3 = this.diastolicRequired;
        int iHashCode22 = (iHashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str19 = this.hrLabel;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.hrTooLowText;
        int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.hrTooHighText;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.hrRequiredText;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Integer num5 = this.hrMax;
        int iHashCode27 = (iHashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.hrMin;
        int iHashCode28 = (iHashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str23 = this.hrSuffix;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool4 = this.hrRequired;
        int iHashCode30 = (iHashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str24 = this.inputType;
        int iM8289b3 = AbstractC2875y.m8289b((iHashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31, 31, this.inputRequired);
        String str25 = this.requiredRegex;
        int iHashCode31 = (iM8289b3 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.blockedRegex;
        int iM8289b4 = AbstractC2875y.m8289b((iHashCode31 + (str26 == null ? 0 : str26.hashCode())) * 31, 31, this.isCountDownTimerRequired);
        Integer num7 = this.countDownTimerSeconds;
        int iHashCode32 = (iM8289b4 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str27 = this.surveyFormId;
        int iHashCode33 = (iHashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.surveyVendorMetadata;
        int iHashCode34 = (iHashCode33 + (str28 == null ? 0 : str28.hashCode())) * 31;
        SurveyProvider surveyProvider = this.surveyProvider;
        return iHashCode34 + (surveyProvider != null ? surveyProvider.hashCode() : 0);
    }

    public final boolean isBpStep() {
        return this.isBpStep;
    }

    public final boolean isBtHr() {
        return this.isBtHr;
    }

    public final boolean isCountDownTimerRequired() {
        return this.isCountDownTimerRequired;
    }

    public final Boolean isTimerActive() {
        return this.isTimerActive;
    }

    public String toString() {
        int i13 = this.campaignId;
        int i14 = this.id;
        String str = this.text;
        int i15 = this.order;
        String str2 = this.typeFormUrl;
        String str3 = this.imageUrl;
        String str4 = this.imageAlt;
        boolean z4 = this.isBpStep;
        Boolean bool = this.isTimerActive;
        boolean z13 = this.isBtHr;
        String str5 = this.title;
        String str6 = this.subtitle;
        String str7 = this.cta;
        String str8 = this.typeFormTitle;
        String str9 = this.systolicLabel;
        String str10 = this.systolicTooLowText;
        String str11 = this.systolicTooHighText;
        String str12 = this.systolicRequiredText;
        Integer num = this.systolicMax;
        Integer num2 = this.systolicMin;
        String str13 = this.systolicSuffix;
        Boolean bool2 = this.systolicRequired;
        String str14 = this.diastolicLabel;
        String str15 = this.diastolicTooLowText;
        String str16 = this.diastolicTooHighText;
        String str17 = this.diastolicRequiredText;
        Integer num3 = this.diastolicMax;
        Integer num4 = this.diastolicMin;
        String str18 = this.diastolicSuffix;
        Boolean bool3 = this.diastolicRequired;
        String str19 = this.hrLabel;
        String str20 = this.hrTooLowText;
        String str21 = this.hrTooHighText;
        String str22 = this.hrRequiredText;
        Integer num5 = this.hrMax;
        Integer num6 = this.hrMin;
        String str23 = this.hrSuffix;
        Boolean bool4 = this.hrRequired;
        String str24 = this.inputType;
        boolean z14 = this.inputRequired;
        String str25 = this.requiredRegex;
        String str26 = this.blockedRegex;
        boolean z15 = this.isCountDownTimerRequired;
        Integer num7 = this.countDownTimerSeconds;
        String str27 = this.surveyFormId;
        String str28 = this.surveyVendorMetadata;
        SurveyProvider surveyProvider = this.surveyProvider;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ProtocolStep(campaignId=", ", id=", ", text=");
        AbstractC11266d.m30470x(i15, str, ", order=", ", typeFormUrl=", sbM30465s);
        AbstractC11266d.m30444B(sbM30465s, str2, ", imageUrl=", str3, ", imageAlt=");
        AbstractC38963t7.m124390t(sbM30465s, str4, ", isBpStep=", z4, ", isTimerActive=");
        sbM30465s.append(bool);
        sbM30465s.append(", isBtHr=");
        sbM30465s.append(z13);
        sbM30465s.append(", title=");
        AbstractC11266d.m30444B(sbM30465s, str5, ", subtitle=", str6, ", cta=");
        AbstractC11266d.m30444B(sbM30465s, str7, ", typeFormTitle=", str8, ", systolicLabel=");
        AbstractC11266d.m30444B(sbM30465s, str9, ", systolicTooLowText=", str10, ", systolicTooHighText=");
        AbstractC11266d.m30444B(sbM30465s, str11, ", systolicRequiredText=", str12, ", systolicMax=");
        AbstractC31061c.m95621A(sbM30465s, num, ", systolicMin=", num2, ", systolicSuffix=");
        AbstractC36095b.m114692t(bool2, str13, ", systolicRequired=", ", diastolicLabel=", sbM30465s);
        AbstractC11266d.m30444B(sbM30465s, str14, ", diastolicTooLowText=", str15, ", diastolicTooHighText=");
        AbstractC11266d.m30444B(sbM30465s, str16, ", diastolicRequiredText=", str17, ", diastolicMax=");
        AbstractC31061c.m95621A(sbM30465s, num3, ", diastolicMin=", num4, ", diastolicSuffix=");
        AbstractC36095b.m114692t(bool3, str18, ", diastolicRequired=", ", hrLabel=", sbM30465s);
        AbstractC11266d.m30444B(sbM30465s, str19, ", hrTooLowText=", str20, ", hrTooHighText=");
        AbstractC11266d.m30444B(sbM30465s, str21, ", hrRequiredText=", str22, ", hrMax=");
        AbstractC31061c.m95621A(sbM30465s, num5, ", hrMin=", num6, ", hrSuffix=");
        AbstractC36095b.m114692t(bool4, str23, ", hrRequired=", ", inputType=", sbM30465s);
        AbstractC38963t7.m124390t(sbM30465s, str24, ", inputRequired=", z14, ", requiredRegex=");
        AbstractC11266d.m30444B(sbM30465s, str25, ", blockedRegex=", str26, ", isCountDownTimerRequired=");
        sbM30465s.append(z15);
        sbM30465s.append(", countDownTimerSeconds=");
        sbM30465s.append(num7);
        sbM30465s.append(", surveyFormId=");
        AbstractC11266d.m30444B(sbM30465s, str27, ", surveyVendorMetadata=", str28, ", surveyProvider=");
        sbM30465s.append(surveyProvider);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.campaignId);
        dest.writeInt(this.id);
        dest.writeString(this.text);
        dest.writeInt(this.order);
        dest.writeString(this.typeFormUrl);
        dest.writeString(this.imageUrl);
        dest.writeString(this.imageAlt);
        dest.writeInt(this.isBpStep ? 1 : 0);
        Boolean bool = this.isTimerActive;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        dest.writeInt(this.isBtHr ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.cta);
        dest.writeString(this.typeFormTitle);
        dest.writeString(this.systolicLabel);
        dest.writeString(this.systolicTooLowText);
        dest.writeString(this.systolicTooHighText);
        dest.writeString(this.systolicRequiredText);
        Integer num = this.systolicMax;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.systolicMin;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeString(this.systolicSuffix);
        Boolean bool2 = this.systolicRequired;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool2);
        }
        dest.writeString(this.diastolicLabel);
        dest.writeString(this.diastolicTooLowText);
        dest.writeString(this.diastolicTooHighText);
        dest.writeString(this.diastolicRequiredText);
        Integer num3 = this.diastolicMax;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num3);
        }
        Integer num4 = this.diastolicMin;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num4);
        }
        dest.writeString(this.diastolicSuffix);
        Boolean bool3 = this.diastolicRequired;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool3);
        }
        dest.writeString(this.hrLabel);
        dest.writeString(this.hrTooLowText);
        dest.writeString(this.hrTooHighText);
        dest.writeString(this.hrRequiredText);
        Integer num5 = this.hrMax;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num5);
        }
        Integer num6 = this.hrMin;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num6);
        }
        dest.writeString(this.hrSuffix);
        Boolean bool4 = this.hrRequired;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool4);
        }
        dest.writeString(this.inputType);
        dest.writeInt(this.inputRequired ? 1 : 0);
        dest.writeString(this.requiredRegex);
        dest.writeString(this.blockedRegex);
        dest.writeInt(this.isCountDownTimerRequired ? 1 : 0);
        Integer num7 = this.countDownTimerSeconds;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num7);
        }
        dest.writeString(this.surveyFormId);
        dest.writeString(this.surveyVendorMetadata);
        SurveyProvider surveyProvider = this.surveyProvider;
        if (surveyProvider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(surveyProvider.name());
        }
    }

    public /* synthetic */ ProtocolStep(int i13, int i14, String str, int i15, String str2, String str3, String str4, boolean z4, Boolean bool, boolean z13, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, String str13, Boolean bool2, String str14, String str15, String str16, String str17, Integer num3, Integer num4, String str18, Boolean bool3, String str19, String str20, String str21, String str22, Integer num5, Integer num6, String str23, Boolean bool4, String str24, boolean z14, String str25, String str26, boolean z15, Integer num7, String str27, String str28, SurveyProvider surveyProvider, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i16 & 4) != 0 ? null : str, i15, (i16 & 16) != 0 ? null : str2, (i16 & 32) != 0 ? null : str3, (i16 & 64) != 0 ? null : str4, z4, (i16 & 256) != 0 ? Boolean.FALSE : bool, (i16 & 512) != 0 ? false : z13, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str5, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str6, (i16 & 4096) != 0 ? null : str7, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str8, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str9, (32768 & i16) != 0 ? null : str10, (65536 & i16) != 0 ? null : str11, (131072 & i16) != 0 ? null : str12, (262144 & i16) != 0 ? null : num, (524288 & i16) != 0 ? null : num2, (1048576 & i16) != 0 ? null : str13, (2097152 & i16) != 0 ? null : bool2, (4194304 & i16) != 0 ? null : str14, (8388608 & i16) != 0 ? null : str15, (16777216 & i16) != 0 ? null : str16, (33554432 & i16) != 0 ? null : str17, (67108864 & i16) != 0 ? null : num3, (134217728 & i16) != 0 ? null : num4, (268435456 & i16) != 0 ? null : str18, (536870912 & i16) != 0 ? null : bool3, (1073741824 & i16) != 0 ? null : str19, (i16 & Integer.MIN_VALUE) != 0 ? null : str20, (i17 & 1) != 0 ? null : str21, (i17 & 2) != 0 ? null : str22, (i17 & 4) != 0 ? null : num5, (i17 & 8) != 0 ? null : num6, (i17 & 16) != 0 ? null : str23, (i17 & 32) != 0 ? null : bool4, (i17 & 64) != 0 ? null : str24, (i17 & 128) != 0 ? false : z14, (i17 & 256) != 0 ? null : str25, (i17 & 512) != 0 ? null : str26, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z15, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : num7, (i17 & 4096) != 0 ? null : str27, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str28, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : surveyProvider);
    }
}
