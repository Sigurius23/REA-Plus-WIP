package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.HashMap;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 Ñ\u00012\u00020\u0001:\u0004Ñ\u0001Ò\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0017¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u0011H\u0017¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010'\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010)J?\u0010-\u001a*\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140+j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014`,0\u00192\u0006\u0010'\u001a\u00020\u0011H\u0017¢\u0006\u0004\b-\u0010)J+\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0017¢\u0006\u0004\b/\u00100JG\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\"\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170+j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017`,H\u0017¢\u0006\u0004\b2\u00103J3\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b4\u0010\u001cJ]\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,2\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b8\u00109J]\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,2\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b;\u00109JS\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,H\u0017¢\u0006\u0004\b<\u0010=JS\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112&\u0010.\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0018\u0001`,H\u0017¢\u0006\u0004\b>\u0010=J-\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b?\u0010@J-\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010A\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\bD\u0010EJ#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017¢\u0006\u0004\bG\u0010)J-\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0011H\u0017¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\bM\u0010\u0016J3\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bN\u0010\u001cJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0004\bP\u0010QJ+\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ+\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020VH\u0017¢\u0006\u0004\bX\u0010YJ+\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010[\u001a\u00020ZH\u0017¢\u0006\u0004\b\\\u0010]J#\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b^\u0010)J9\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020V2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_H\u0017¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\bd\u0010LJ3\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bf\u0010\u001cJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020$0_H\u0017¢\u0006\u0004\bg\u0010&J#\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010h\u001a\u00020\u0017H\u0017¢\u0006\u0004\bi\u0010jJ#\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0004\bk\u0010jJ\u0017\u0010l\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\bl\u0010mJ+\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bn\u0010QJ#\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0004\bo\u0010jJ\u0017\u0010p\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\bp\u0010mJ+\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bq\u0010QJ#\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0004\br\u0010jJ\u0017\u0010s\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\bs\u0010mJ+\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bt\u0010QJ\u001f\u0010u\u001a\u00020\u00142\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0004\bu\u0010\u0016Ja\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010v\u001a\u00020\u00112\u0006\u0010w\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0006\u0010x\u001a\u00020\u000e2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0#2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020y0#2\b\u0010}\u001a\u0004\u0018\u00010|H\u0017¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010Z2\u0006\u0010v\u001a\u00020\u0011H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J%\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010v\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0082\u0001\u0010)J\u0019\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010v\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0083\u0001\u0010LJ/\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0086\u0001\u00100J&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0087\u0001\u0010)J\u001a\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0088\u0001\u0010LJ%\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0089\u0001\u0010)J-\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u008a\u0001\u0010QJ:\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010H\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J/\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010O\u001a\u00020\u00172\b\u0010H\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0005\b\u008f\u0001\u0010EJ:\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010F\u001a\u00020\u00112\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010H\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u008e\u0001J%\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010F\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0091\u0001\u0010)J0\u0010\u0094\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J%\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u009b\u0001\u0010)J-\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u009c\u0001\u0010QJ9\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0017¢\u0006\u0006\b \u0001\u0010¡\u0001J>\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020`0#H\u0017¢\u0006\u0006\b£\u0001\u0010¤\u0001J>\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020`0#H\u0017¢\u0006\u0006\b¥\u0001\u0010¤\u0001J>\u0010§\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020\u00112\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0017¢\u0006\u0006\b§\u0001\u0010¤\u0001J\u0011\u0010¨\u0001\u001a\u00020\u000eH\u0017¢\u0006\u0005\b¨\u0001\u0010\u0010J*\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0017¢\u0006\u0006\b«\u0001\u0010¬\u0001J(\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0017¢\u0006\u0006\b«\u0001\u0010¯\u0001J&\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0007\u0010°\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b«\u0001\u0010)J&\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010[\u001a\u00020ZH\u0017¢\u0006\u0006\b«\u0001\u0010±\u0001J2\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0017¢\u0006\u0006\b²\u0001\u0010³\u0001J0\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0017¢\u0006\u0006\b²\u0001\u0010´\u0001J.\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0007\u0010°\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b²\u0001\u00100J-\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010[\u001a\u00020ZH\u0017¢\u0006\u0005\b²\u0001\u0010]J0\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0093\u0001\u001a\u00030µ\u0001H\u0017¢\u0006\u0006\b¶\u0001\u0010·\u0001J6\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010#H\u0017¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0018\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010#H\u0017¢\u0006\u0005\b½\u0001\u0010&J\u001b\u0010¿\u0001\u001a\u00020\n2\u0007\u0010¾\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¿\u0001\u0010\u009a\u0001R\u0019\u0010À\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0017\u0010Ç\u0001\u001a\u00020\u00118WX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u0097\u0001R\u0017\u0010É\u0001\u001a\u00020\u00118WX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010\u0097\u0001R\u001c\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010&R#\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110#8WX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010\f\u001a\u0005\bÌ\u0001\u0010&R\u001c\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010&¨\u0006Ó\u0001"}, m65681d2 = {"Lcom/mapbox/maps/Style;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lcom/mapbox/maps/StyleManager;", "styleManager", "", "pixelRatio", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "mapLoadingErrorDelegate", "<init>", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "Ll83/a0;", "markInvalid$maps_sdk_release", "()V", "markInvalid", "", "isValid", "()Z", "", "sourceId", "property", "Lcom/mapbox/maps/StylePropertyValue;", "getStyleSourceProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "Lcom/mapbox/bindgen/Value;", "value", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "setStyleSourceProperty", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/TransitionOptions;", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "transitionOptions", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleImports", "()Ljava/util/List;", "importId", "removeStyleImport", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "getStyleImportSchema", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getStyleImportConfigProperties", "config", "getStyleImportConfigProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "configs", "setStyleImportConfigProperties", "(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;", "setStyleImportConfigProperty", "json", "Lcom/mapbox/maps/ImportPosition;", "importPosition", "addStyleImportFromJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;", "uri", "addStyleImportFromURI", "updateStyleImportWithJSON", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;", "updateStyleImportWithURI", "moveStyleImport", "(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;", "parameters", "Lcom/mapbox/maps/LayerPosition;", "position", "addStyleLayer", "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "layerId", "removeStyleLayer", "layerPosition", "moveStyleLayer", "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "styleLayerExists", "(Ljava/lang/String;)Z", "getStyleLayerProperty", "setStyleLayerProperty", "properties", "addStyleSource", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CoordinateBounds;", "coordinateBounds", "invalidateStyleCustomGeometrySourceRegion", "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CanonicalTileID;", "tileId", "invalidateStyleCustomGeometrySourceTile", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/Image;", "image", "updateStyleImageSourceImage", "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "removeStyleSource", "", "Lcom/mapbox/geojson/Feature;", "featureCollection", "setStyleCustomGeometrySourceTileData", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "styleSourceExists", "id", "setStyleLightProperty", "getStyleLights", "lights", "setStyleLights", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "setStyleAtmosphere", "getStyleAtmosphereProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "setStyleAtmosphereProperty", "setStyleTerrain", "getStyleTerrainProperty", "setStyleTerrainProperty", "setStyleProjection", "getStyleProjectionProperty", "setStyleProjectionProperty", "getStyleLightProperty", "imageId", "scale", "sdf", "Lcom/mapbox/maps/ImageStretches;", "stretchX", "stretchY", "Lcom/mapbox/maps/ImageContent;", "content", "addStyleImage", "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;", "getStyleImage", "(Ljava/lang/String;)Lcom/mapbox/maps/Image;", "removeStyleImage", "hasStyleImage", "modelId", "modelUri", "addStyleModel", "removeStyleModel", "hasStyleModel", "getStyleLayerProperties", "setStyleLayerProperties", "Lcom/mapbox/maps/CustomLayerHost;", "layerHost", "addStyleCustomLayer", "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "addPersistentStyleLayer", "addPersistentStyleCustomLayer", "isStyleLayerPersistent", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "options", "addStyleCustomGeometrySource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;", "getStyleGlyphURL", "()Ljava/lang/String;", QueryParams.URL, "setStyleGlyphURL", "(Ljava/lang/String;)V", "getStyleSourceProperties", "setStyleSourceProperties", "dataId", "Lcom/mapbox/maps/GeoJSONSourceData;", "data", "setStyleGeoJSONSourceData", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;", "features", "addGeoJSONSourceFeatures", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "updateGeoJSONSourceFeatures", "featureIds", "removeGeoJSONSourceFeatures", "isStyleLoaded", "Lcom/mapbox/maps/ColorTheme;", "colorTheme", "setStyleColorTheme", "(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;", "base64", "(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "setImportColorTheme", "(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleCustomRasterSource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "tiles", "setStyleCustomRasterSourceTileData", "(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getFeaturesets", "methodName", "checkNativeStyle", "isStyleValid", "Z", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleDefaultCamera", "getStyleURI", "styleURI", "getStyleJSON", "styleJSON", "getStyleSources", "styleSources", "getStyleSlots", "getStyleSlots$annotations", "styleSlots", "getStyleLayers", "styleLayers", "Companion", "OnStyleLoaded", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class Style extends MapboxStyleManager {
    public static final String DARK = "mapbox://styles/mapbox/dark-v11";
    public static final String LIGHT = "mapbox://styles/mapbox/light-v11";
    public static final String MAPBOX_STREETS = "mapbox://styles/mapbox/streets-v12";
    public static final String OUTDOORS = "mapbox://styles/mapbox/outdoors-v12";
    public static final String SATELLITE = "mapbox://styles/mapbox/satellite-v9";
    public static final String SATELLITE_STREETS = "mapbox://styles/mapbox/satellite-streets-v12";
    public static final String STANDARD = "mapbox://styles/mapbox/standard";
    public static final String STANDARD_SATELLITE = "mapbox://styles/mapbox/standard-satellite";
    private static final String TAG = "Mbgl-Style";
    public static final String TRAFFIC_DAY = "mapbox://styles/mapbox/traffic-day-v2";
    public static final String TRAFFIC_NIGHT = "mapbox://styles/mapbox/traffic-night-v2";
    private volatile boolean isStyleValid;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/Style$OnStyleLoaded;", "", "Lcom/mapbox/maps/Style;", "style", "Ll83/a0;", "onStyleLoaded", "(Lcom/mapbox/maps/Style;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface OnStyleLoaded {
        void onStyleLoaded(Style style);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Style(StyleManager styleManager, float f13, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        super(styleManager, f13, mapLoadingErrorDelegate);
        AbstractC22676k.m65750j(styleManager, "styleManager");
        AbstractC22676k.m65750j(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.isStyleValid = true;
    }

    private final void checkNativeStyle(String methodName) {
        if (this.isStyleValid) {
            return;
        }
        MapboxLogger.logW(TAG, "Style object (accessing " + methodName + ") should not be stored and used after MapView is destroyed or new style has been loaded.");
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(features, "features");
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing addGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.addGeoJSONSourceFeatures(sourceId, dataId, features);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        checkNativeStyle("addPersistentStyleCustomLayer");
        return super.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("addPersistentStyleLayer");
        return super.addPersistentStyleLayer(properties, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        checkNativeStyle("addStyleCustomGeometrySource");
        return super.addStyleCustomGeometrySource(sourceId, options);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        checkNativeStyle("addStyleCustomLayer");
        return super.addStyleCustomLayer(layerId, layerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String sourceId, CustomRasterSourceOptions options) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        checkNativeStyle("addStyleCustomRasterSource");
        return super.addStyleCustomRasterSource(sourceId, options);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(stretchX, "stretchX");
        AbstractC22676k.m65750j(stretchY, "stretchY");
        checkNativeStyle("addStyleImage");
        return super.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromJSON(String importId, String json, HashMap<String, Value> config, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(json, "json");
        checkNativeStyle("addStyleImportFromJSON");
        return super.addStyleImportFromJSON(importId, json, config, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromURI(String importId, String uri, HashMap<String, Value> config, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(uri, "uri");
        checkNativeStyle("addStyleImportFromURI");
        return super.addStyleImportFromURI(importId, uri, config, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleLayer(Value parameters, LayerPosition position) {
        AbstractC22676k.m65750j(parameters, "parameters");
        checkNativeStyle("addStyleLayer");
        return super.addStyleLayer(parameters, position);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleModel(String modelId, String modelUri) {
        AbstractC22676k.m65750j(modelId, "modelId");
        AbstractC22676k.m65750j(modelUri, "modelUri");
        checkNativeStyle("addStyleModel");
        return super.addStyleModel(modelId, modelUri);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleSource(String sourceId, Value properties) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("addStyleSource");
        return super.addStyleSource(sourceId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        checkNativeStyle("getFeaturesets");
        return super.getFeaturesets();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleAtmosphereProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleAtmosphereProperty");
        return super.getStyleAtmosphereProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public CameraOptions getStyleDefaultCamera() {
        checkNativeStyle("getStyleDefaultCamera");
        return super.getStyleDefaultCamera();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public String getStyleGlyphURL() {
        checkNativeStyle("getStyleGlyphURL");
        return super.getStyleGlyphURL();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Image getStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        checkNativeStyle("getStyleImage");
        return super.getStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        checkNativeStyle("getStyleImportConfigProperties");
        return super.getStyleImportConfigProperties(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String importId, String config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(config, "config");
        checkNativeStyle("getStyleImportConfigProperty");
        return super.getStyleImportConfigProperty(importId, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleImportSchema(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        checkNativeStyle("getStyleImportSchema");
        return super.getStyleImportSchema(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleImports() {
        checkNativeStyle("getStyleImports");
        return super.getStyleImports();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleJSON() {
        checkNativeStyle("getStyleJSON");
        return super.getStyleJSON();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleLayerProperties(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        checkNativeStyle("getStyleLayerProperties");
        return super.getStyleLayerProperties(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleLayerProperty");
        return super.getStyleLayerProperty(layerId, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLayers() {
        checkNativeStyle("getStyleLayers");
        return super.getStyleLayers();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLightProperty(String id4, String property) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleLightProperty");
        return super.getStyleLightProperty(id4, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLights() {
        checkNativeStyle("getStyleLights");
        return super.getStyleLights();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleProjectionProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleProjectionProperty");
        return super.getStyleProjectionProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<String> getStyleSlots() {
        checkNativeStyle("getStyleSlots");
        return super.getStyleSlots();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleSourceProperties(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        checkNativeStyle("getStyleSourceProperties");
        return super.getStyleSourceProperties(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleSourceProperty");
        return super.getStyleSourceProperty(sourceId, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleSources() {
        checkNativeStyle("getStyleSources");
        return super.getStyleSources();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleTerrainProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        checkNativeStyle("getStyleTerrainProperty");
        return super.getStyleTerrainProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public TransitionOptions getStyleTransition() {
        checkNativeStyle("getStyleTransition");
        return super.getStyleTransition();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleURI() {
        checkNativeStyle("getStyleURI");
        return super.getStyleURI();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean hasStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        checkNativeStyle("hasStyleImage");
        return super.hasStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public boolean hasStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        checkNativeStyle("hasStyleModel");
        return super.hasStyleModel(modelId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(coordinateBounds, "coordinateBounds");
        checkNativeStyle("invalidateStyleCustomGeometrySourceRegion");
        return super.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        checkNativeStyle("invalidateStyleCustomGeometrySourceTile");
        return super.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        checkNativeStyle("isStyleLayerPersistent");
        return super.isStyleLayerPersistent(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean isStyleLoaded() {
        checkNativeStyle("isStyleLoaded");
        return super.isStyleLoaded();
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsStyleValid() {
        return this.isStyleValid;
    }

    public final void markInvalid$maps_sdk_release() {
        this.isStyleValid = false;
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleImport(String importId, ImportPosition importPosition) {
        AbstractC22676k.m65750j(importId, "importId");
        checkNativeStyle("moveStyleImport");
        return super.moveStyleImport(importId, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        checkNativeStyle("moveStyleLayer");
        return super.moveStyleLayer(layerId, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeGeoJSONSourceFeatures(String sourceId, String dataId, List<String> featureIds) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(featureIds, "featureIds");
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing removeGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        checkNativeStyle("removeStyleImage");
        return super.removeStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImport(String importId) {
        AbstractC22676k.m65750j(importId, "importId");
        checkNativeStyle("removeStyleImport");
        return super.removeStyleImport(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleLayer(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        checkNativeStyle("removeStyleLayer");
        return super.removeStyleLayer(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        checkNativeStyle("removeStyleModel");
        return super.removeStyleModel(modelId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleSource(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        checkNativeStyle("removeStyleSource");
        return super.removeStyleSource(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, ColorTheme colorTheme) {
        AbstractC22676k.m65750j(importId, "importId");
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(importId, colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphere(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("setStyleAtmosphere");
        return super.setStyleAtmosphere(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleAtmosphereProperty");
        return super.setStyleAtmosphereProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        AbstractC22676k.m65750j(featureCollection, "featureCollection");
        checkNativeStyle("setStyleCustomGeometrySourceTileData");
        return super.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String sourceId, List<CustomRasterSourceTileData> tiles) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tiles, "tiles");
        checkNativeStyle("setStyleCustomRasterSourceTileData");
        return super.setStyleCustomRasterSourceTileData(sourceId, tiles);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(data, "data");
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing setStyleGeoJSONSourceData) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.setStyleGeoJSONSourceData(sourceId, dataId, data);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public void setStyleGlyphURL(String url) {
        AbstractC22676k.m65750j(url, "url");
        checkNativeStyle("setStyleGlyphURL");
        super.setStyleGlyphURL(url);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperties(String importId, HashMap<String, Value> configs) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(configs, "configs");
        checkNativeStyle("setStyleImportConfigProperties");
        return super.setStyleImportConfigProperties(importId, configs);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperty(String importId, String config, Value value) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleImportConfigProperty");
        return super.setStyleImportConfigProperty(importId, config, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("setStyleLayerProperties");
        return super.setStyleLayerProperties(layerId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleLayerProperty");
        return super.setStyleLayerProperty(layerId, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLightProperty(String id4, String property, Value value) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleLightProperty");
        return super.setStyleLightProperty(id4, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLights(Value lights) {
        AbstractC22676k.m65750j(lights, "lights");
        checkNativeStyle("setStyleLights");
        return super.setStyleLights(lights);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjection(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("setStyleProjection");
        return super.setStyleProjection(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleProjectionProperty");
        return super.setStyleProjectionProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("setStyleSourceProperties");
        return super.setStyleSourceProperties(sourceId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleSourceProperty");
        return super.setStyleSourceProperty(sourceId, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrain(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        checkNativeStyle("setStyleTerrain");
        return super.setStyleTerrain(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        checkNativeStyle("setStyleTerrainProperty");
        return super.setStyleTerrainProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public void setStyleTransition(TransitionOptions transitionOptions) {
        AbstractC22676k.m65750j(transitionOptions, "transitionOptions");
        checkNativeStyle("setStyleTransition");
        super.setStyleTransition(transitionOptions);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleLayerExists(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        checkNativeStyle("styleLayerExists");
        return super.styleLayerExists(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleSourceExists(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        checkNativeStyle("styleSourceExists");
        return super.styleSourceExists(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(features, "features");
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing updateGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.updateGeoJSONSourceFeatures(sourceId, dataId, features);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(image, "image");
        checkNativeStyle("updateStyleImageSourceImage");
        return super.updateStyleImageSourceImage(sourceId, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithJSON(String importId, String json, HashMap<String, Value> config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(json, "json");
        checkNativeStyle("updateStyleImportWithJSON");
        return super.updateStyleImportWithJSON(importId, json, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithURI(String importId, String uri, HashMap<String, Value> config) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(uri, "uri");
        checkNativeStyle("updateStyleImportWithURI");
        return super.updateStyleImportWithURI(importId, uri, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Bitmap bitmap) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(bitmap, "bitmap");
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(importId, bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, String base64) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(base64, "base64");
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(importId, base64);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String base64) {
        AbstractC22676k.m65750j(base64, "base64");
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(base64);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Image image) {
        AbstractC22676k.m65750j(importId, "importId");
        AbstractC22676k.m65750j(image, "image");
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(importId, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        AbstractC22676k.m65750j(image, "image");
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(image);
    }
}
