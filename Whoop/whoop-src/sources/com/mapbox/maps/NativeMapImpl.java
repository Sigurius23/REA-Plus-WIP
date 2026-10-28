package com.mapbox.maps;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.RunnableC1319m;
import c93.InterfaceC4339a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b \u0010!JG\u0010+\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010&2\b\u0010*\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001d¢\u0006\u0004\b/\u00100J!\u00102\u001a\b\u0012\u0004\u0012\u00020.012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d01¢\u0006\u0004\b2\u0010!J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J)\u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020;¢\u0006\u0004\bG\u0010HJ)\u0010J\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bL\u0010DJ\u0015\u0010M\u001a\u00020F2\u0006\u0010E\u001a\u00020;¢\u0006\u0004\bM\u0010HJ)\u0010N\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0004\bN\u0010KJ9\u0010P\u001a\u00020\u00152\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001f012\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&¢\u0006\u0004\bP\u0010QJ+\u0010P\u001a\u00020\u00152\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001f012\u0006\u0010R\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bP\u0010UJM\u0010P\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00150=2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001f012\u0006\u0010R\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010&2\b\u0010*\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bP\u0010VJ3\u0010Y\u001a\u00020\u00152\u0006\u0010X\u001a\u00020W2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u0004\u0018\u00010&2\u0006\u0010[\u001a\u00020\u001f¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010^¢\u0006\u0004\b`\u0010aJ)\u0010e\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;2\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ)\u0010g\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;2\u0006\u0010d\u001a\u00020c¢\u0006\u0004\bg\u0010fJ!\u0010h\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010b\u001a\u00020;¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020c0=2\u0006\u0010b\u001a\u00020;¢\u0006\u0004\bj\u0010iJ%\u0010n\u001a\b\u0012\u0004\u0012\u00020m0\u001c2\u0006\u0010l\u001a\u00020k2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\br\u0010qJ\u0015\u0010t\u001a\u00020s2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bt\u0010uJ!\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c¢\u0006\u0004\bw\u0010!J\u0015\u0010y\u001a\u00020\u00072\u0006\u0010x\u001a\u000203¢\u0006\u0004\by\u00106J\r\u0010z\u001a\u000203¢\u0006\u0004\bz\u0010{J!\u0010~\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010}\u001a\u00020|¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00072\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\u00072\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008f\u0001\u001a\u00020\u00072\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0096\u0001\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u000f\u0010\u0098\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0098\u0001\u0010\u0012J5\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0018\u0010\u009c\u0001\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009f\u0001\u001a\u00020\u001f2\u0007\u0010\u009e\u0001\u001a\u00020\u001d¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0017\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u000101¢\u0006\u0006\b¢\u0001\u0010£\u0001J)\u0010¦\u0001\u001a\u00020\u00072\u000e\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u0001012\u0007\u0010¥\u0001\u001a\u000203¢\u0006\u0006\b¦\u0001\u0010§\u0001J1\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010¨\u0001\u001a\u00020A2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J;\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\b\u0010®\u0001\u001a\u00030\u00ad\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J0\u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001¢\u0006\u0006\b±\u0001\u0010¬\u0001J;\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\b\u0010®\u0001\u001a\u00030\u00ad\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001¢\u0006\u0006\b²\u0001\u0010°\u0001J$\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002030=2\u0007\u0010\u0099\u0001\u001a\u00020;¢\u0006\u0005\b³\u0001\u0010iJ1\u0010´\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010·\u0001\u001a\u00020\u00072\u0007\u0010¶\u0001\u001a\u00020;¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0010\u0010¹\u0001\u001a\u00020;¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0010\u0010»\u0001\u001a\u00020;¢\u0006\u0006\b»\u0001\u0010º\u0001J\u0019\u0010½\u0001\u001a\u00020\u00072\u0007\u0010¼\u0001\u001a\u00020;¢\u0006\u0006\b½\u0001\u0010¸\u0001J\u0010\u0010¾\u0001\u001a\u00020\u0015¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0011\u0010Á\u0001\u001a\u00030À\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001a\u0010Ä\u0001\u001a\u00020\u00072\b\u0010Ã\u0001\u001a\u00030À\u0001¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J$\u0010Æ\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;¢\u0006\u0005\bÆ\u0001\u0010iJ\u0019\u0010Ç\u0001\u001a\u0002032\u0007\u0010\u0099\u0001\u001a\u00020;¢\u0006\u0006\bÇ\u0001\u0010È\u0001J!\u0010É\u0001\u001a\u00020F2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J,\u0010Ë\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010\u0099\u0001\u001a\u00020;2\u0006\u0010B\u001a\u00020A¢\u0006\u0005\bË\u0001\u0010KJ,\u0010Í\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010Ì\u0001\u001a\u00020A¢\u0006\u0005\bÍ\u0001\u0010KJ#\u0010Î\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A0=2\u0006\u0010<\u001a\u00020;¢\u0006\u0005\bÎ\u0001\u0010iJ.\u0010Ñ\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\b\u0010Ð\u0001\u001a\u00030Ï\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J$\u0010Ó\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A0=2\u0007\u0010\u0099\u0001\u001a\u00020;¢\u0006\u0005\bÓ\u0001\u0010iJ#\u0010Ô\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;¢\u0006\u0005\bÔ\u0001\u0010iJ=\u0010Ø\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010Õ\u0001\u001a\u00020m2\u000e\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030Ö\u00010\u001c¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0018\u0010Ú\u0001\u001a\u0002032\u0006\u0010<\u001a\u00020;¢\u0006\u0006\bÚ\u0001\u0010È\u0001J5\u0010Ü\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010Û\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0006\bÜ\u0001\u0010\u009b\u0001J\u0017\u0010Þ\u0001\u001a\t\u0012\u0005\u0012\u00030Ý\u00010\u001c¢\u0006\u0006\bÞ\u0001\u0010£\u0001J$\u0010à\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010ß\u0001\u001a\u00020A¢\u0006\u0005\bà\u0001\u0010DJ#\u0010á\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010B\u001a\u00020A¢\u0006\u0005\bá\u0001\u0010DJ\u0017\u0010â\u0001\u001a\u00020F2\u0006\u0010E\u001a\u00020;¢\u0006\u0005\bâ\u0001\u0010HJ+\u0010ã\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0005\bã\u0001\u0010KJ!\u0010ä\u0001\u001a\u00020F2\u0007\u0010Û\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020;¢\u0006\u0006\bä\u0001\u0010Ê\u0001J\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010Ï\u00012\u0007\u0010å\u0001\u001a\u00020;¢\u0006\u0006\bæ\u0001\u0010ç\u0001J$\u0010è\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010å\u0001\u001a\u00020;¢\u0006\u0005\bè\u0001\u0010iJ\u0019\u0010é\u0001\u001a\u0002032\u0007\u0010å\u0001\u001a\u00020;¢\u0006\u0006\bé\u0001\u0010È\u0001J.\u0010ì\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010ê\u0001\u001a\u00020;2\u0007\u0010ë\u0001\u001a\u00020;¢\u0006\u0006\bì\u0001\u0010í\u0001J$\u0010î\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010ê\u0001\u001a\u00020;¢\u0006\u0005\bî\u0001\u0010iJ\u0019\u0010ï\u0001\u001a\u0002032\u0007\u0010ê\u0001\u001a\u00020;¢\u0006\u0006\bï\u0001\u0010È\u0001J,\u0010ô\u0001\u001a\u00030ó\u00012\u0007\u0010X\u001a\u00030ð\u00012\u0007\u0010d\u001a\u00030ñ\u00012\u0007\u0010\b\u001a\u00030ò\u0001¢\u0006\u0006\bô\u0001\u0010õ\u0001J+\u0010ø\u0001\u001a\u00030ó\u00012\u0006\u0010<\u001a\u00020;2\u0007\u0010d\u001a\u00030ö\u00012\u0007\u0010\b\u001a\u00030÷\u0001¢\u0006\u0006\bø\u0001\u0010ù\u0001Jj\u0010\u0082\u0002\u001a\u00030ó\u00012\u0007\u0010ú\u0001\u001a\u00020;2\b\u0010û\u0001\u001a\u00030Ö\u00012\u0007\u0010ü\u0001\u001a\u00020;2\u0007\u0010ý\u0001\u001a\u00020;2)\u0010\u0080\u0002\u001a$\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A\u0018\u00010þ\u0001j\u0011\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020A\u0018\u0001`ÿ\u00012\u0007\u0010\b\u001a\u00030\u0081\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J?\u0010\u0088\u0002\u001a\u00030ó\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\u0007\u0010\u0086\u0002\u001a\u00020A2\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J6\u0010\u008b\u0002\u001a\u00030ó\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\u0007\u0010\b\u001a\u00030\u008a\u0002¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0011\u0010\u008e\u0002\u001a\u00030\u008d\u0002¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\b\u0010\u0090\u0002\u001a\u00030\u008d\u0002¢\u0006\u0005\b\u0017\u0010\u0091\u0002J-\u0010\u0092\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010Õ\u0001\u001a\u00020m¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J+\u0010\u0094\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010B\u001a\u00020A¢\u0006\u0005\b\u0094\u0002\u0010KJ7\u0010\u0098\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010\u0095\u0002\u001a\u00020;2\b\u0010\u0097\u0002\u001a\u00030\u0096\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002JA\u0010\u009b\u0002\u001a\u00030ó\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\u0085\u0002\u001a\u00020;2\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002J-\u0010\u009d\u0002\u001a\u00030ó\u00012\u0006\u0010<\u001a\u00020;2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001c\u0010¡\u0002\u001a\u00020\u00072\n\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u0002¢\u0006\u0006\b¡\u0002\u0010¢\u0002J-\u0010¤\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0007\u0010d\u001a\u00030£\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002Jn\u0010®\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0007\u0010å\u0001\u001a\u00020;2\b\u0010§\u0002\u001a\u00030¦\u00022\b\u0010Ð\u0001\u001a\u00030Ï\u00012\u0007\u0010¨\u0002\u001a\u0002032\u000e\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030©\u00020\u001c2\u000e\u0010«\u0002\u001a\t\u0012\u0005\u0012\u00030©\u00020\u001c2\n\u0010\u00ad\u0002\u001a\u0005\u0018\u00010¬\u0002¢\u0006\u0006\b®\u0002\u0010¯\u0002J\u000f\u0010°\u0002\u001a\u00020\u0007¢\u0006\u0005\b°\u0002\u0010\u0012J\u000f\u0010±\u0002\u001a\u000203¢\u0006\u0005\b±\u0002\u0010{J \u0010²\u0002\u001a\u00020F2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u00020;¢\u0006\u0006\b²\u0002\u0010Ê\u0001J\u000f\u0010³\u0002\u001a\u000203¢\u0006\u0005\b³\u0002\u0010{J4\u0010´\u0002\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u00020;2\u0006\u0010I\u001a\u00020A¢\u0006\u0006\b´\u0002\u0010\u009b\u0001J\u0017\u0010µ\u0002\u001a\u00020s2\u0006\u0010R\u001a\u00020\u0015¢\u0006\u0005\bµ\u0002\u0010uJ\u0017\u0010¶\u0002\u001a\t\u0012\u0005\u0012\u00030Ý\u000101¢\u0006\u0006\b¶\u0002\u0010£\u0001J\u0017\u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030Ý\u000101¢\u0006\u0006\b·\u0002\u0010£\u0001J\u0018\u0010¹\u0002\u001a\u00020\u00072\u0007\u0010¸\u0002\u001a\u000203¢\u0006\u0005\b¹\u0002\u00106J\u000f\u0010º\u0002\u001a\u000203¢\u0006\u0005\bº\u0002\u0010{J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010¼\u0002\u001a\u00030»\u0002¢\u0006\u0006\b½\u0002\u0010¾\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010À\u0002\u001a\u00030¿\u0002¢\u0006\u0006\b½\u0002\u0010Á\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Ã\u0002\u001a\u00030Â\u0002¢\u0006\u0006\b½\u0002\u0010Ä\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Æ\u0002\u001a\u00030Å\u0002¢\u0006\u0006\b½\u0002\u0010Ç\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010É\u0002\u001a\u00030È\u0002¢\u0006\u0006\b½\u0002\u0010Ê\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Ì\u0002\u001a\u00030Ë\u0002¢\u0006\u0006\b½\u0002\u0010Í\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Ï\u0002\u001a\u00030Î\u0002¢\u0006\u0006\b½\u0002\u0010Ð\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Ò\u0002\u001a\u00030Ñ\u0002¢\u0006\u0006\b½\u0002\u0010Ó\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Õ\u0002\u001a\u00030Ô\u0002¢\u0006\u0006\b½\u0002\u0010Ö\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Ø\u0002\u001a\u00030×\u0002¢\u0006\u0006\b½\u0002\u0010Ù\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Û\u0002\u001a\u00030Ú\u0002¢\u0006\u0006\b½\u0002\u0010Ü\u0002J\u001d\u0010½\u0002\u001a\u00030ó\u00012\b\u0010Þ\u0002\u001a\u00030Ý\u0002H\u0007¢\u0006\u0006\b½\u0002\u0010ß\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010á\u0002\u001a\u00030à\u0002¢\u0006\u0006\b½\u0002\u0010â\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010ä\u0002\u001a\u00030ã\u0002¢\u0006\u0006\b½\u0002\u0010å\u0002J\u001b\u0010½\u0002\u001a\u00030ó\u00012\b\u0010ç\u0002\u001a\u00030æ\u0002¢\u0006\u0006\b½\u0002\u0010è\u0002J&\u0010½\u0002\u001a\u00030ó\u00012\u0007\u0010é\u0002\u001a\u00020;2\b\u0010ë\u0002\u001a\u00030ê\u0002H\u0007¢\u0006\u0006\b½\u0002\u0010ì\u0002J\u0016\u0010í\u0002\u001a\b\u0012\u0004\u0012\u00020;01¢\u0006\u0006\bí\u0002\u0010£\u0001J\"\u0010ð\u0002\u001a\u00020\u00152\u0007\u0010î\u0002\u001a\u00020\u001d2\u0007\u0010ï\u0002\u001a\u00020\u001d¢\u0006\u0006\bð\u0002\u0010ñ\u0002J\u001a\u0010ô\u0002\u001a\u00020\u00072\b\u0010ó\u0002\u001a\u00030ò\u0002¢\u0006\u0006\bô\u0002\u0010õ\u0002J\u0011\u0010ö\u0002\u001a\u00030ò\u0002¢\u0006\u0006\bö\u0002\u0010÷\u0002J \u0010ú\u0002\u001a\u00020\u00072\u000e\u0010ù\u0002\u001a\t\u0012\u0005\u0012\u00030ø\u000201¢\u0006\u0006\bú\u0002\u0010û\u0002J\u0017\u0010ü\u0002\u001a\t\u0012\u0005\u0012\u00030ø\u000201¢\u0006\u0006\bü\u0002\u0010£\u0001J\"\u0010ÿ\u0002\u001a\u00020\u00072\u0007\u0010d\u001a\u00030ý\u00022\u0007\u0010\b\u001a\u00030þ\u0002¢\u0006\u0006\bÿ\u0002\u0010\u0080\u0003J\u000f\u0010\u0081\u0003\u001a\u00020\u0007¢\u0006\u0005\b\u0081\u0003\u0010\u0012J0\u0010\u0084\u0003\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020>0=2\u0010\u0010\u0083\u0003\u001a\u000b\u0012\u0004\u0012\u00020;\u0018\u00010\u0082\u0003H\u0007¢\u0006\u0006\b\u0084\u0003\u0010\u0085\u0003J\u0017\u0010\u0086\u0003\u001a\t\u0012\u0004\u0012\u00020;0\u0082\u0003¢\u0006\u0006\b\u0086\u0003\u0010\u0087\u0003J\u001b\u0010\u008a\u0003\u001a\u00030ó\u00012\b\u0010\u0089\u0003\u001a\u00030\u0088\u0003¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u001a\u0010\u008e\u0003\u001a\u00020\u00072\b\u0010\u008d\u0003\u001a\u00030\u008c\u0003¢\u0006\u0006\b\u008e\u0003\u0010\u008f\u0003J7\u0010\u0088\u0002\u001a\u00030ó\u00012\b\u0010\u0091\u0003\u001a\u00030\u0090\u00032\b\u0010\u0085\u0002\u001a\u00030\u0092\u00032\u0007\u0010\u0086\u0002\u001a\u00020A2\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0093\u0003J.\u0010\u008b\u0002\u001a\u00030ó\u00012\b\u0010\u0091\u0003\u001a\u00030\u0090\u00032\b\u0010\u0085\u0002\u001a\u00030\u0092\u00032\u0007\u0010\b\u001a\u00030\u008a\u0002¢\u0006\u0006\b\u008b\u0002\u0010\u0094\u0003J9\u0010\u009b\u0002\u001a\u00030ó\u00012\b\u0010\u0091\u0003\u001a\u00030\u0090\u00032\b\u0010\u0085\u0002\u001a\u00030\u0092\u00032\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010;2\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u009b\u0002\u0010\u0095\u0003J$\u0010\u009d\u0002\u001a\u00030ó\u00012\b\u0010\u0091\u0003\u001a\u00030\u0090\u00032\u0007\u0010\b\u001a\u00030\u0087\u0002¢\u0006\u0006\b\u009d\u0002\u0010\u0096\u0003J3\u0010ô\u0001\u001a\u00030ó\u00012\u0007\u0010X\u001a\u00030ð\u00012\u000e\u0010\u0098\u0003\u001a\t\u0012\u0005\u0012\u00030\u0097\u0003012\u0007\u0010\b\u001a\u00030ò\u0001¢\u0006\u0006\bô\u0001\u0010\u0099\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u009a\u0003\u001a\u0006\b\u009b\u0003\u0010\u009c\u0003R/\u0010\u009d\u0003\u001a\u0002032\u0006\u0010I\u001a\u0002038\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009d\u0003\u0010\u009e\u0003\u001a\u0005\b\u009f\u0003\u0010{\"\u0005\b \u0003\u00106R&\u0010¢\u0003\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060¡\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0003\u0010£\u0003R\u0018\u0010¥\u0003\u001a\u00030¤\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0003\u0010¦\u0003¨\u0006§\u0003"}, m65681d2 = {"Lcom/mapbox/maps/NativeMapImpl;", "", "Lcom/mapbox/maps/Map;", "map", "<init>", "(Lcom/mapbox/maps/Map;)V", "Lkotlin/Function0;", "Ll83/a0;", "callback", "whenMapSizeReady", "(Lc93/a;)V", "Lcom/mapbox/maps/Size;", "size", "setSize", "(Lcom/mapbox/maps/Size;)V", "getSize", "()Lcom/mapbox/maps/Size;", "createRenderer", "()V", "destroyRenderer", "render", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "", "Lcom/mapbox/maps/ScreenCoordinate;", "pixels", "Lcom/mapbox/geojson/Point;", "coordinatesForPixels", "(Ljava/util/List;)Ljava/util/List;", "Lcom/mapbox/maps/CoordinateBounds;", "coordinateBounds", "Lcom/mapbox/maps/EdgeInsets;", "padding", "", "bearing", "pitch", "maxZoom", MapboxMap.QFE_OFFSET, "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "pixel", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "", "coordinatesInfoForPixels", "", "inProgress", "setUserAnimationInProgress", "(Z)V", "Lcom/mapbox/maps/CameraAnimationHint;", "cameraAnimationHint", "setCameraAnimationHint", "(Lcom/mapbox/maps/CameraAnimationHint;)V", "", "sourceId", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "invalidateStyleCustomGeometrySourceRegion", "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/Value;", "properties", "setStyleTerrain", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "property", "Lcom/mapbox/maps/StylePropertyValue;", "getStyleTerrainProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "value", "setStyleTerrainProperty", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "setStyleProjection", "getStyleProjectionProperty", "setStyleProjectionProperty", "points", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/geojson/Geometry;", "geometry", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "point", "getElevation", "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;", "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;", "listener", "setViewAnnotationPositionsUpdateListener", "(Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;)V", "identifier", "Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "addViewAnnotation", "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;", "updateViewAnnotation", "removeViewAnnotation", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "getViewAnnotationOptions", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinates", "pixelsForCoordinates", "gestureInProgress", "setGestureInProgress", "isGestureInProgress", "()Z", "Lcom/mapbox/maps/CameraBoundsOptions;", "boundOptions", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "", "zoomDelta", "setPrefetchZoomDelta", "(B)V", "getPrefetchZoomDelta", "()B", "Lcom/mapbox/maps/NorthOrientation;", "northOrientation", "setNorthOrientation", "(Lcom/mapbox/maps/NorthOrientation;)V", "Lcom/mapbox/maps/ConstrainMode;", "constrainMode", "setConstrainMode", "(Lcom/mapbox/maps/ConstrainMode;)V", "Lcom/mapbox/maps/ViewportMode;", "viewportMode", "setViewportMode", "(Lcom/mapbox/maps/ViewportMode;)V", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "triggerRepaint", "layerId", "setStyleLayerProperty", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "screenCoordinate", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/MapDebugOptions;", "getDebug", "()Ljava/util/List;", "list", "debugActive", "setDebug", "(Ljava/util/List;Z)V", "parameters", "Lcom/mapbox/maps/LayerPosition;", "layerPosition", "addStyleLayer", "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CustomLayerHost;", "layerHost", "addStyleCustomLayer", "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "addPersistentStyleLayer", "addPersistentStyleCustomLayer", "isStyleLayerPersistent", "moveStyleLayer", "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "json", "setStyleJSON", "(Ljava/lang/String;)V", "getStyleJSON", "()Ljava/lang/String;", "getStyleURI", "uri", "setStyleURI", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/TransitionOptions;", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "transitionOptions", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "removeStyleLayer", "styleLayerExists", "(Ljava/lang/String;)Z", "getStyleLayerProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "setStyleLayerProperties", "source", "addStyleSource", "getStyleSourceProperties", "Lcom/mapbox/maps/Image;", "image", "updateStyleImageSourceImage", "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "getStyleLayerProperties", "removeStyleSource", "tileId", "Lcom/mapbox/geojson/Feature;", "featureCollection", "setStyleCustomGeometrySourceTileData", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "styleSourceExists", "id", "setStyleLightProperty", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLights", "lights", "setStyleLights", "setStyleAtmosphere", "getStyleAtmosphereProperty", "setStyleAtmosphereProperty", "getStyleLightProperty", "imageId", "getStyleImage", "(Ljava/lang/String;)Lcom/mapbox/maps/Image;", "removeStyleImage", "hasStyleImage", "modelId", "modelUri", "addStyleModel", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "removeStyleModel", "hasStyleModel", "Lcom/mapbox/maps/RenderedQueryGeometry;", "Lcom/mapbox/maps/RenderedQueryOptions;", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "Lcom/mapbox/common/Cancelable;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "querySourceFeatures", "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "sourceIdentifier", "feature", "extension", "extensionField", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "args", "Lcom/mapbox/maps/QueryFeatureExtensionCallback;", "queryFeatureExtensions", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "sourceLayerId", "featureId", "state", "Lcom/mapbox/maps/FeatureStateOperationCallback;", "setFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/QueryFeatureStateCallback;", "getFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/FreeCameraOptions;", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "invalidateStyleCustomGeometrySourceTile", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;", "setStyleSourceProperties", "dataId", "Lcom/mapbox/maps/GeoJSONSourceData;", "data", "setStyleGeoJSONSourceData", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;", "stateKey", "removeFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "setTileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)V", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomGeometrySource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;", "", "scale", "sdf", "Lcom/mapbox/maps/ImageStretches;", "stretchX", "stretchY", "Lcom/mapbox/maps/ImageContent;", "content", "addStyleImage", "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;", "reduceMemoryUse", "isUserAnimationInProgress", "getStyleSourceProperty", "isStyleLoaded", "setStyleSourceProperty", "coordinateBoundsZoomForCamera", "getStyleLayers", "getStyleSources", "renderWorldCopies", "setRenderWorldCopies", "getRenderWorldCopies", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "subscribe", "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "onMapIdleListener", "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "onGenericEventsListener", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;", "getAttributions", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "Lcom/mapbox/maps/Vec2;", "shape", "setScreenCullingShape", "(Ljava/util/List;)V", "getScreenCullingShape", "Lcom/mapbox/maps/PerformanceStatisticsOptions;", "Lcom/mapbox/maps/PerformanceStatisticsCallback;", "startPerformanceStatisticsCollection", "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V", "stopPerformanceStatisticsCollection", "Ljava/util/HashSet;", "layerIds", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "Lcom/mapbox/maps/Interaction;", "interaction", "addInteraction", "(Lcom/mapbox/maps/Interaction;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/PlatformEventInfo;", "platformEventInfo", "dispatch", "(Lcom/mapbox/maps/PlatformEventInfo;)V", "Lcom/mapbox/maps/FeaturesetDescriptor;", "featureset", "Lcom/mapbox/maps/FeaturesetFeatureId;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/FeaturesetQueryTarget;", "targets", "(Lcom/mapbox/maps/RenderedQueryGeometry;Ljava/util/List;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/Map;", "getMap", "()Lcom/mapbox/maps/Map;", "sizeSet", "Z", "getSizeSet$maps_sdk_release", "setSizeSet$maps_sdk_release", "Ljava/util/concurrent/CopyOnWriteArrayList;", "sizeSetCallbackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class NativeMapImpl {
    private final Handler mainHandler;
    private final Map map;
    private volatile boolean sizeSet;
    private CopyOnWriteArrayList<InterfaceC4339a> sizeSetCallbackList;

    public NativeMapImpl(Map map) {
        AbstractC22676k.m65750j(map, "map");
        this.map = map;
        this.sizeSetCallbackList = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_sizeSet_$lambda$1(NativeMapImpl this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        if (this$0.sizeSet) {
            Iterator<T> it = this$0.sizeSetCallbackList.iterator();
            while (it.hasNext()) {
                ((InterfaceC4339a) it.next()).invoke();
            }
            this$0.sizeSetCallbackList.clear();
        }
    }

    public final Cancelable addInteraction(Interaction interaction) {
        AbstractC22676k.m65750j(interaction, "interaction");
        Cancelable cancelableAddInteraction = this.map.addInteraction(interaction);
        AbstractC22676k.m65749i(cancelableAddInteraction, "map.addInteraction(interaction)");
        return cancelableAddInteraction;
    }

    public final Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.map.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        AbstractC22676k.m65749i(expectedAddPersistentStyleCustomLayer, "map.addPersistentStyleCu…layerHost, layerPosition)");
        return expectedAddPersistentStyleCustomLayer;
    }

    public final Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> expectedAddPersistentStyleLayer = this.map.addPersistentStyleLayer(properties, layerPosition);
        AbstractC22676k.m65749i(expectedAddPersistentStyleLayer, "map.addPersistentStyleLa…roperties, layerPosition)");
        return expectedAddPersistentStyleLayer;
    }

    public final Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.map.addStyleCustomGeometrySource(sourceId, options);
        AbstractC22676k.m65749i(expectedAddStyleCustomGeometrySource, "map.addStyleCustomGeomet…Source(sourceId, options)");
        return expectedAddStyleCustomGeometrySource;
    }

    public final Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(layerHost, "layerHost");
        Expected<String, None> expectedAddStyleCustomLayer = this.map.addStyleCustomLayer(layerId, layerHost, layerPosition);
        AbstractC22676k.m65749i(expectedAddStyleCustomLayer, "map.addStyleCustomLayer(…layerHost, layerPosition)");
        return expectedAddStyleCustomLayer;
    }

    public final Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        AbstractC22676k.m65750j(imageId, "imageId");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(stretchX, "stretchX");
        AbstractC22676k.m65750j(stretchY, "stretchY");
        Expected<String, None> expectedAddStyleImage = this.map.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        AbstractC22676k.m65749i(expectedAddStyleImage, "map.addStyleImage(imageI…etchX, stretchY, content)");
        return expectedAddStyleImage;
    }

    public final Expected<String, None> addStyleLayer(Value parameters, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(parameters, "parameters");
        Expected<String, None> expectedAddStyleLayer = this.map.addStyleLayer(parameters, layerPosition);
        AbstractC22676k.m65749i(expectedAddStyleLayer, "map.addStyleLayer(parameters, layerPosition)");
        return expectedAddStyleLayer;
    }

    public final Expected<String, None> addStyleModel(String modelId, String modelUri) {
        AbstractC22676k.m65750j(modelId, "modelId");
        AbstractC22676k.m65750j(modelUri, "modelUri");
        Expected<String, None> expectedAddStyleModel = this.map.addStyleModel(modelId, modelUri);
        AbstractC22676k.m65749i(expectedAddStyleModel, "map.addStyleModel(modelId, modelUri)");
        return expectedAddStyleModel;
    }

    public final Expected<String, None> addStyleSource(String sourceId, Value source) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(source, "source");
        Expected<String, None> expectedAddStyleSource = this.map.addStyleSource(sourceId, source);
        AbstractC22676k.m65749i(expectedAddStyleSource, "map.addStyleSource(sourceId, source)");
        return expectedAddStyleSource;
    }

    public final Expected<String, None> addViewAnnotation(String identifier, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(options, "options");
        Expected<String, None> expectedAddViewAnnotation = this.map.addViewAnnotation(identifier, options);
        AbstractC22676k.m65749i(expectedAddViewAnnotation, "map.addViewAnnotation(identifier, options)");
        return expectedAddViewAnnotation;
    }

    public final CameraOptions cameraForCoordinateBounds(CoordinateBounds coordinateBounds, EdgeInsets padding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset) {
        AbstractC22676k.m65750j(coordinateBounds, "coordinateBounds");
        CameraOptions cameraOptionsCameraForCoordinateBounds = this.map.cameraForCoordinateBounds(coordinateBounds, padding, bearing, pitch, maxZoom, offset);
        AbstractC22676k.m65749i(cameraOptionsCameraForCoordinateBounds, "map.cameraForCoordinateB…, pitch, maxZoom, offset)");
        return cameraOptionsCameraForCoordinateBounds;
    }

    public final CameraOptions cameraForCoordinates(List<Point> points, EdgeInsets padding, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(points, "points");
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(points, padding, bearing, pitch);
        AbstractC22676k.m65749i(cameraOptionsCameraForCoordinates, "map.cameraForCoordinates… padding, bearing, pitch)");
        return cameraOptionsCameraForCoordinates;
    }

    public final CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint) {
        AbstractC22676k.m65750j(fromPoint, "fromPoint");
        AbstractC22676k.m65750j(toPoint, "toPoint");
        CameraOptions cameraOptionsCameraForDrag = this.map.cameraForDrag(fromPoint, toPoint);
        AbstractC22676k.m65749i(cameraOptionsCameraForDrag, "map.cameraForDrag(fromPoint, toPoint)");
        return cameraOptionsCameraForDrag;
    }

    public final CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets padding, Double bearing, Double pitch) {
        AbstractC22676k.m65750j(geometry, "geometry");
        CameraOptions cameraOptionsCameraForGeometry = this.map.cameraForGeometry(geometry, padding, bearing, pitch);
        AbstractC22676k.m65749i(cameraOptionsCameraForGeometry, "map.cameraForGeometry(ge… padding, bearing, pitch)");
        return cameraOptionsCameraForGeometry;
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = this.map.coordinateBoundsForCamera(cameraOptions);
        AbstractC22676k.m65749i(coordinateBoundsCoordinateBoundsForCamera, "map.coordinateBoundsForCamera(cameraOptions)");
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        CoordinateBounds coordinateBoundsCoordinateBoundsForCameraUnwrapped = this.map.coordinateBoundsForCameraUnwrapped(cameraOptions);
        AbstractC22676k.m65749i(coordinateBoundsCoordinateBoundsForCameraUnwrapped, "map.coordinateBoundsForC…aUnwrapped(cameraOptions)");
        return coordinateBoundsCoordinateBoundsForCameraUnwrapped;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera) {
        AbstractC22676k.m65750j(camera, "camera");
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCamera = this.map.coordinateBoundsZoomForCamera(camera);
        AbstractC22676k.m65749i(coordinateBoundsZoomCoordinateBoundsZoomForCamera, "map.coordinateBoundsZoomForCamera(camera)");
        return coordinateBoundsZoomCoordinateBoundsZoomForCamera;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped = this.map.coordinateBoundsZoomForCameraUnwrapped(cameraOptions);
        AbstractC22676k.m65749i(coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped, "map.coordinateBoundsZoom…aUnwrapped(cameraOptions)");
        return coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped;
    }

    public final Point coordinateForPixel(ScreenCoordinate screenCoordinate) {
        AbstractC22676k.m65750j(screenCoordinate, "screenCoordinate");
        Point pointCoordinateForPixel = this.map.coordinateForPixel(screenCoordinate);
        AbstractC22676k.m65749i(pointCoordinateForPixel, "map.coordinateForPixel(screenCoordinate)");
        return pointCoordinateForPixel;
    }

    public final CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel) {
        AbstractC22676k.m65750j(pixel, "pixel");
        CoordinateInfo coordinateInfoCoordinateInfoForPixel = this.map.coordinateInfoForPixel(pixel);
        AbstractC22676k.m65749i(coordinateInfoCoordinateInfoForPixel, "map.coordinateInfoForPixel(pixel)");
        return coordinateInfoCoordinateInfoForPixel;
    }

    public final List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels) {
        AbstractC22676k.m65750j(pixels, "pixels");
        List<Point> listCoordinatesForPixels = this.map.coordinatesForPixels(pixels);
        AbstractC22676k.m65749i(listCoordinatesForPixels, "map.coordinatesForPixels(pixels)");
        return listCoordinatesForPixels;
    }

    public final List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels) {
        AbstractC22676k.m65750j(pixels, "pixels");
        List<CoordinateInfo> listCoordinatesInfoForPixels = this.map.coordinatesInfoForPixels(pixels);
        AbstractC22676k.m65749i(listCoordinatesInfoForPixels, "map.coordinatesInfoForPixels(pixels)");
        return listCoordinatesInfoForPixels;
    }

    public final void createRenderer() {
        this.map.createRenderer();
    }

    public final void destroyRenderer() {
        this.map.destroyRenderer();
    }

    public final void dispatch(PlatformEventInfo platformEventInfo) {
        AbstractC22676k.m65750j(platformEventInfo, "platformEventInfo");
        this.map.dispatch(platformEventInfo);
    }

    public final List<String> getAttributions() {
        List<String> attributions = this.map.getAttributions();
        AbstractC22676k.m65749i(attributions, "map.attributions");
        return attributions;
    }

    public final CameraBounds getBounds() {
        CameraBounds bounds = this.map.getBounds();
        AbstractC22676k.m65749i(bounds, "map.bounds");
        return bounds;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = this.map.getCameraState();
        AbstractC22676k.m65749i(cameraState, "map.cameraState");
        return cameraState;
    }

    public final MapCenterAltitudeMode getCenterAltitudeMode() {
        MapCenterAltitudeMode centerAltitudeMode = this.map.getCenterAltitudeMode();
        AbstractC22676k.m65749i(centerAltitudeMode, "map.centerAltitudeMode");
        return centerAltitudeMode;
    }

    public final List<MapDebugOptions> getDebug() {
        List<MapDebugOptions> debug = this.map.getDebug();
        AbstractC22676k.m65749i(debug, "map.debug");
        return debug;
    }

    public final Double getElevation(Point point) {
        AbstractC22676k.m65750j(point, "point");
        return this.map.getElevation(point);
    }

    public final Cancelable getFeatureState(String sourceId, String sourceLayerId, String featureId, QueryFeatureStateCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable featureState = this.map.getFeatureState(sourceId, sourceLayerId, featureId, callback);
        AbstractC22676k.m65749i(featureState, "map.getFeatureState(sour…rId, featureId, callback)");
        return featureState;
    }

    public final FreeCameraOptions getFreeCameraOptions() {
        FreeCameraOptions freeCameraOptions = this.map.getFreeCameraOptions();
        AbstractC22676k.m65749i(freeCameraOptions, "map.freeCameraOptions");
        return freeCameraOptions;
    }

    public final Map getMap() {
        return this.map;
    }

    public final MapOptions getMapOptions() {
        MapOptions mapOptions = this.map.getMapOptions();
        AbstractC22676k.m65749i(mapOptions, "map.mapOptions");
        return mapOptions;
    }

    public final byte getPrefetchZoomDelta() {
        return this.map.getPrefetchZoomDelta();
    }

    public final boolean getRenderWorldCopies() {
        return this.map.getRenderWorldCopies();
    }

    public final List<Vec2> getScreenCullingShape() {
        List<Vec2> screenCullingShape = this.map.getScreenCullingShape();
        AbstractC22676k.m65749i(screenCullingShape, "map.screenCullingShape");
        return screenCullingShape;
    }

    public final Size getSize() {
        Size size = this.map.getSize();
        AbstractC22676k.m65749i(size, "map.size");
        return size;
    }

    /* JADX INFO: renamed from: getSizeSet$maps_sdk_release, reason: from getter */
    public final boolean getSizeSet() {
        return this.sizeSet;
    }

    public final StylePropertyValue getStyleAtmosphereProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleAtmosphereProperty = this.map.getStyleAtmosphereProperty(property);
        AbstractC22676k.m65749i(styleAtmosphereProperty, "map.getStyleAtmosphereProperty(property)");
        return styleAtmosphereProperty;
    }

    public final CameraOptions getStyleDefaultCamera() {
        CameraOptions styleDefaultCamera = this.map.getStyleDefaultCamera();
        AbstractC22676k.m65749i(styleDefaultCamera, "map.styleDefaultCamera");
        return styleDefaultCamera;
    }

    public final Image getStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        return this.map.getStyleImage(imageId);
    }

    public final String getStyleJSON() {
        String styleJSON = this.map.getStyleJSON();
        AbstractC22676k.m65749i(styleJSON, "map.styleJSON");
        return styleJSON;
    }

    public final Expected<String, Value> getStyleLayerProperties(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        Expected<String, Value> styleLayerProperties = this.map.getStyleLayerProperties(layerId);
        AbstractC22676k.m65749i(styleLayerProperties, "map.getStyleLayerProperties(layerId)");
        return styleLayerProperties;
    }

    public final StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleLayerProperty = this.map.getStyleLayerProperty(layerId, property);
        AbstractC22676k.m65749i(styleLayerProperty, "map.getStyleLayerProperty(layerId, property)");
        return styleLayerProperty;
    }

    public final List<StyleObjectInfo> getStyleLayers() {
        List<StyleObjectInfo> styleLayers = this.map.getStyleLayers();
        AbstractC22676k.m65749i(styleLayers, "map.styleLayers");
        return styleLayers;
    }

    public final StylePropertyValue getStyleLightProperty(String id4, String property) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleLightProperty = this.map.getStyleLightProperty(id4, property);
        AbstractC22676k.m65749i(styleLightProperty, "map.getStyleLightProperty(id, property)");
        return styleLightProperty;
    }

    public final List<StyleObjectInfo> getStyleLights() {
        List<StyleObjectInfo> styleLights = this.map.getStyleLights();
        AbstractC22676k.m65749i(styleLights, "map.styleLights");
        return styleLights;
    }

    public final StylePropertyValue getStyleProjectionProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleProjectionProperty = this.map.getStyleProjectionProperty(property);
        AbstractC22676k.m65749i(styleProjectionProperty, "map.getStyleProjectionProperty(property)");
        return styleProjectionProperty;
    }

    public final Expected<String, Value> getStyleSourceProperties(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        Expected<String, Value> styleSourceProperties = this.map.getStyleSourceProperties(sourceId);
        AbstractC22676k.m65749i(styleSourceProperties, "map.getStyleSourceProperties(sourceId)");
        return styleSourceProperties;
    }

    public final StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleSourceProperty = this.map.getStyleSourceProperty(sourceId, property);
        AbstractC22676k.m65749i(styleSourceProperty, "map.getStyleSourceProperty(sourceId, property)");
        return styleSourceProperty;
    }

    public final List<StyleObjectInfo> getStyleSources() {
        List<StyleObjectInfo> styleSources = this.map.getStyleSources();
        AbstractC22676k.m65749i(styleSources, "map.styleSources");
        return styleSources;
    }

    public final StylePropertyValue getStyleTerrainProperty(String property) {
        AbstractC22676k.m65750j(property, "property");
        StylePropertyValue styleTerrainProperty = this.map.getStyleTerrainProperty(property);
        AbstractC22676k.m65749i(styleTerrainProperty, "map.getStyleTerrainProperty(property)");
        return styleTerrainProperty;
    }

    public final TransitionOptions getStyleTransition() {
        TransitionOptions styleTransition = this.map.getStyleTransition();
        AbstractC22676k.m65749i(styleTransition, "map.styleTransition");
        return styleTransition;
    }

    public final String getStyleURI() {
        String styleURI = this.map.getStyleURI();
        AbstractC22676k.m65749i(styleURI, "map.styleURI");
        return styleURI;
    }

    public final HashSet<String> getViewAnnotationAvoidLayers() {
        HashSet<String> viewAnnotationAvoidLayers = this.map.getViewAnnotationAvoidLayers();
        AbstractC22676k.m65749i(viewAnnotationAvoidLayers, "map.viewAnnotationAvoidLayers");
        return viewAnnotationAvoidLayers;
    }

    public final Expected<String, ViewAnnotationOptions> getViewAnnotationOptions(String identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        Expected<String, ViewAnnotationOptions> viewAnnotationOptions = this.map.getViewAnnotationOptions(identifier);
        AbstractC22676k.m65749i(viewAnnotationOptions, "map.getViewAnnotationOptions(identifier)");
        return viewAnnotationOptions;
    }

    public final boolean hasStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        return this.map.hasStyleImage(imageId);
    }

    public final boolean hasStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        return this.map.hasStyleModel(modelId);
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(coordinateBounds, "coordinateBounds");
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.map.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        AbstractC22676k.m65749i(expectedInvalidateStyleCustomGeometrySourceRegion, "map.invalidateStyleCusto…urceId, coordinateBounds)");
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.map.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        AbstractC22676k.m65749i(expectedInvalidateStyleCustomGeometrySourceTile, "map.invalidateStyleCusto…rceTile(sourceId, tileId)");
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public final boolean isGestureInProgress() {
        return this.map.isGestureInProgress();
    }

    public final Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.map.isStyleLayerPersistent(layerId);
        AbstractC22676k.m65749i(expectedIsStyleLayerPersistent, "map.isStyleLayerPersistent(layerId)");
        return expectedIsStyleLayerPersistent;
    }

    public final boolean isStyleLoaded() {
        return this.map.isStyleLoaded();
    }

    public final boolean isUserAnimationInProgress() {
        return this.map.isUserAnimationInProgress();
    }

    public final Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(layerId, "layerId");
        Expected<String, None> expectedMoveStyleLayer = this.map.moveStyleLayer(layerId, layerPosition);
        AbstractC22676k.m65749i(expectedMoveStyleLayer, "map.moveStyleLayer(layerId, layerPosition)");
        return expectedMoveStyleLayer;
    }

    public final ScreenCoordinate pixelForCoordinate(Point pixel) {
        AbstractC22676k.m65750j(pixel, "pixel");
        ScreenCoordinate screenCoordinatePixelForCoordinate = this.map.pixelForCoordinate(pixel);
        AbstractC22676k.m65749i(screenCoordinatePixelForCoordinate, "map.pixelForCoordinate((pixel))");
        return screenCoordinatePixelForCoordinate;
    }

    public final List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        List<ScreenCoordinate> listPixelsForCoordinates = this.map.pixelsForCoordinates(coordinates);
        AbstractC22676k.m65749i(listPixelsForCoordinates, "map.pixelsForCoordinates(coordinates)");
        return listPixelsForCoordinates;
    }

    public final Cancelable queryFeatureExtensions(String sourceIdentifier, Feature feature, String extension, String extensionField, HashMap<String, Value> args, QueryFeatureExtensionCallback callback) {
        AbstractC22676k.m65750j(sourceIdentifier, "sourceIdentifier");
        AbstractC22676k.m65750j(feature, "feature");
        AbstractC22676k.m65750j(extension, "extension");
        AbstractC22676k.m65750j(extensionField, "extensionField");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableQueryFeatureExtensions = this.map.queryFeatureExtensions(sourceIdentifier, feature, extension, extensionField, args, callback);
        AbstractC22676k.m65749i(cancelableQueryFeatureExtensions, "map.queryFeatureExtensio…ionField, args, callback)");
        return cancelableQueryFeatureExtensions;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback) {
        AbstractC22676k.m65750j(geometry, "geometry");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(geometry, options, callback);
        AbstractC22676k.m65749i(cancelableQueryRenderedFeatures, "map.queryRenderedFeature…metry, options, callback)");
        return cancelableQueryRenderedFeatures;
    }

    public final Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableQuerySourceFeatures = this.map.querySourceFeatures(sourceId, options, callback);
        AbstractC22676k.m65749i(cancelableQuerySourceFeatures, "map.querySourceFeatures(…rceId, options, callback)");
        return cancelableQuerySourceFeatures;
    }

    public final void reduceMemoryUse() {
        this.map.reduceMemoryUse();
    }

    public final Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, String stateKey, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(sourceId, sourceLayerId, featureId, stateKey, callback);
        AbstractC22676k.m65749i(cancelableRemoveFeatureState, "map.removeFeatureState(s…reId, stateKey, callback)");
        return cancelableRemoveFeatureState;
    }

    public final Expected<String, None> removeStyleImage(String imageId) {
        AbstractC22676k.m65750j(imageId, "imageId");
        Expected<String, None> expectedRemoveStyleImage = this.map.removeStyleImage(imageId);
        AbstractC22676k.m65749i(expectedRemoveStyleImage, "map.removeStyleImage(imageId)");
        return expectedRemoveStyleImage;
    }

    public final Expected<String, None> removeStyleLayer(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        Expected<String, None> expectedRemoveStyleLayer = this.map.removeStyleLayer(layerId);
        AbstractC22676k.m65749i(expectedRemoveStyleLayer, "map.removeStyleLayer(layerId)");
        return expectedRemoveStyleLayer;
    }

    public final Expected<String, None> removeStyleModel(String modelId) {
        AbstractC22676k.m65750j(modelId, "modelId");
        Expected<String, None> expectedRemoveStyleModel = this.map.removeStyleModel(modelId);
        AbstractC22676k.m65749i(expectedRemoveStyleModel, "map.removeStyleModel(modelId)");
        return expectedRemoveStyleModel;
    }

    public final Expected<String, None> removeStyleSource(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        Expected<String, None> expectedRemoveStyleSource = this.map.removeStyleSource(sourceId);
        AbstractC22676k.m65749i(expectedRemoveStyleSource, "map.removeStyleSource(sourceId)");
        return expectedRemoveStyleSource;
    }

    public final Expected<String, None> removeViewAnnotation(String identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        Expected<String, None> expectedRemoveViewAnnotation = this.map.removeViewAnnotation(identifier);
        AbstractC22676k.m65749i(expectedRemoveViewAnnotation, "map.removeViewAnnotation(identifier)");
        return expectedRemoveViewAnnotation;
    }

    public final void render() {
        this.map.render();
    }

    public final Cancelable resetFeatureStates(String sourceId, String sourceLayerId, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(sourceId, sourceLayerId, callback);
        AbstractC22676k.m65749i(cancelableResetFeatureStates, "map.resetFeatureStates(s… sourceLayerId, callback)");
        return cancelableResetFeatureStates;
    }

    public final Expected<String, None> setBounds(CameraBoundsOptions boundOptions) {
        AbstractC22676k.m65750j(boundOptions, "boundOptions");
        Expected<String, None> bounds = this.map.setBounds(boundOptions);
        AbstractC22676k.m65749i(bounds, "map.setBounds(boundOptions)");
        return bounds;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        this.map.setCamera(cameraOptions);
    }

    @MapboxExperimental
    public final void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        AbstractC22676k.m65750j(cameraAnimationHint, "cameraAnimationHint");
        this.map.setCameraAnimationHint(cameraAnimationHint);
    }

    public final void setCenterAltitudeMode(MapCenterAltitudeMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.map.setCenterAltitudeMode(mode);
    }

    public final void setConstrainMode(ConstrainMode constrainMode) {
        AbstractC22676k.m65750j(constrainMode, "constrainMode");
        this.map.setConstrainMode(constrainMode);
    }

    public final void setDebug(List<? extends MapDebugOptions> list, boolean debugActive) {
        AbstractC22676k.m65750j(list, "list");
        this.map.setDebug(list, debugActive);
    }

    public final Cancelable setFeatureState(String sourceId, String sourceLayerId, String featureId, Value state, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable featureState = this.map.setFeatureState(sourceId, sourceLayerId, featureId, state, callback);
        AbstractC22676k.m65749i(featureState, "map.setFeatureState(sour…atureId, state, callback)");
        return featureState;
    }

    public final void setGestureInProgress(boolean gestureInProgress) {
        this.map.setGestureInProgress(gestureInProgress);
    }

    public final void setNorthOrientation(NorthOrientation northOrientation) {
        AbstractC22676k.m65750j(northOrientation, "northOrientation");
        this.map.setNorthOrientation(northOrientation);
    }

    public final void setPrefetchZoomDelta(byte zoomDelta) {
        this.map.setPrefetchZoomDelta(zoomDelta);
    }

    public final void setRenderWorldCopies(boolean renderWorldCopies) {
        this.map.setRenderWorldCopies(renderWorldCopies);
    }

    public final void setScreenCullingShape(List<Vec2> shape) {
        AbstractC22676k.m65750j(shape, "shape");
        this.map.setScreenCullingShape(shape);
    }

    public final void setSize(Size size) {
        AbstractC22676k.m65750j(size, "size");
        this.map.setSize(size);
        setSizeSet$maps_sdk_release(true);
    }

    public final synchronized void setSizeSet$maps_sdk_release(boolean z4) {
        if (z4) {
            try {
                if (!this.sizeSet) {
                    if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
                        Iterator<T> it = this.sizeSetCallbackList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC4339a) it.next()).invoke();
                        }
                        this.sizeSetCallbackList.clear();
                    } else {
                        this.mainHandler.post(new RunnableC1319m(this, 16));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.sizeSet = z4;
    }

    public final Expected<String, None> setStyleAtmosphere(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> styleAtmosphere = this.map.setStyleAtmosphere(properties);
        AbstractC22676k.m65749i(styleAtmosphere, "map.setStyleAtmosphere(properties)");
        return styleAtmosphere;
    }

    public final Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleAtmosphereProperty = this.map.setStyleAtmosphereProperty(property, value);
        AbstractC22676k.m65749i(styleAtmosphereProperty, "map.setStyleAtmosphereProperty(property, value)");
        return styleAtmosphereProperty;
    }

    public final Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(tileId, "tileId");
        AbstractC22676k.m65750j(featureCollection, "featureCollection");
        Expected<String, None> styleCustomGeometrySourceTileData = this.map.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        AbstractC22676k.m65749i(styleCustomGeometrySourceTileData, "map.setStyleCustomGeomet…ileId, featureCollection)");
        return styleCustomGeometrySourceTileData;
    }

    public final Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(dataId, "dataId");
        AbstractC22676k.m65750j(data, "data");
        Expected<String, None> styleGeoJSONSourceData = this.map.setStyleGeoJSONSourceData(sourceId, dataId, data);
        AbstractC22676k.m65749i(styleGeoJSONSourceData, "map.setStyleGeoJSONSourc…a(sourceId, dataId, data)");
        return styleGeoJSONSourceData;
    }

    public final void setStyleJSON(String json) {
        AbstractC22676k.m65750j(json, "json");
        this.map.setStyleJSON(json);
    }

    public final Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> styleLayerProperties = this.map.setStyleLayerProperties(layerId, properties);
        AbstractC22676k.m65749i(styleLayerProperties, "map.setStyleLayerProperties(layerId, properties)");
        return styleLayerProperties;
    }

    public final Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleLayerProperty = this.map.setStyleLayerProperty(layerId, property, value);
        AbstractC22676k.m65749i(styleLayerProperty, "map.setStyleLayerPropert…layerId, property, value)");
        return styleLayerProperty;
    }

    public final Expected<String, None> setStyleLightProperty(String id4, String property, Value value) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleLightProperty = this.map.setStyleLightProperty(id4, property, value);
        AbstractC22676k.m65749i(styleLightProperty, "map.setStyleLightProperty(id, property, value)");
        return styleLightProperty;
    }

    public final Expected<String, None> setStyleLights(Value lights) {
        AbstractC22676k.m65750j(lights, "lights");
        Expected<String, None> styleLights = this.map.setStyleLights(lights);
        AbstractC22676k.m65749i(styleLights, "map.setStyleLights(lights)");
        return styleLights;
    }

    public final Expected<String, None> setStyleProjection(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> styleProjection = this.map.setStyleProjection(properties);
        AbstractC22676k.m65749i(styleProjection, "map.setStyleProjection(properties)");
        return styleProjection;
    }

    public final Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleProjectionProperty = this.map.setStyleProjectionProperty(property, value);
        AbstractC22676k.m65749i(styleProjectionProperty, "map.setStyleProjectionProperty(property, value)");
        return styleProjectionProperty;
    }

    public final Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> styleSourceProperties = this.map.setStyleSourceProperties(sourceId, properties);
        AbstractC22676k.m65749i(styleSourceProperties, "map.setStyleSourceProperties(sourceId, properties)");
        return styleSourceProperties;
    }

    public final Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleSourceProperty = this.map.setStyleSourceProperty(sourceId, property, value);
        AbstractC22676k.m65749i(styleSourceProperty, "map.setStyleSourceProper…ourceId, property, value)");
        return styleSourceProperty;
    }

    public final Expected<String, None> setStyleTerrain(Value properties) {
        AbstractC22676k.m65750j(properties, "properties");
        Expected<String, None> styleTerrain = this.map.setStyleTerrain(properties);
        AbstractC22676k.m65749i(styleTerrain, "map.setStyleTerrain(properties)");
        return styleTerrain;
    }

    public final Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        Expected<String, None> styleTerrainProperty = this.map.setStyleTerrainProperty(property, value);
        AbstractC22676k.m65749i(styleTerrainProperty, "map.setStyleTerrainProperty(property, value)");
        return styleTerrainProperty;
    }

    public final void setStyleTransition(TransitionOptions transitionOptions) {
        AbstractC22676k.m65750j(transitionOptions, "transitionOptions");
        this.map.setStyleTransition(transitionOptions);
    }

    public final void setStyleURI(String uri) {
        AbstractC22676k.m65750j(uri, "uri");
        this.map.setStyleURI(uri);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        this.map.setTileCacheBudget(tileCacheBudget);
    }

    public final void setUserAnimationInProgress(boolean inProgress) {
        this.map.setUserAnimationInProgress(inProgress);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers(HashSet<String> layerIds) {
        Expected<String, None> viewAnnotationAvoidLayers = this.map.setViewAnnotationAvoidLayers(layerIds);
        AbstractC22676k.m65749i(viewAnnotationAvoidLayers, "map.setViewAnnotationAvoidLayers(layerIds)");
        return viewAnnotationAvoidLayers;
    }

    public final void setViewAnnotationPositionsUpdateListener(ViewAnnotationPositionsUpdateListener listener) {
        this.map.setViewAnnotationPositionsUpdateListener(listener);
    }

    public final void setViewportMode(ViewportMode viewportMode) {
        AbstractC22676k.m65750j(viewportMode, "viewportMode");
        this.map.setViewportMode(viewportMode);
    }

    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions options, PerformanceStatisticsCallback callback) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(callback, "callback");
        this.map.startPerformanceStatisticsCollection(options, callback);
    }

    public final void stopPerformanceStatisticsCollection() {
        this.map.stopPerformanceStatisticsCollection();
    }

    public final boolean styleLayerExists(String layerId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        return this.map.styleLayerExists(layerId);
    }

    public final boolean styleSourceExists(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        return this.map.styleSourceExists(sourceId);
    }

    public final Cancelable subscribe(MapLoadedCallback mapLoadedCallback) {
        AbstractC22676k.m65750j(mapLoadedCallback, "mapLoadedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(mapLoadedCallback)");
        return cancelableSubscribe;
    }

    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        AbstractC22676k.m65750j(tileCoverOptions, "tileCoverOptions");
        List<CanonicalTileID> listTileCover = this.map.tileCover(tileCoverOptions, cameraOptions);
        AbstractC22676k.m65749i(listTileCover, "map.tileCover(tileCoverOptions, cameraOptions)");
        return listTileCover;
    }

    public final void triggerRepaint() {
        this.map.triggerRepaint();
    }

    public final Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(image, "image");
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.map.updateStyleImageSourceImage(sourceId, image);
        AbstractC22676k.m65749i(expectedUpdateStyleImageSourceImage, "map.updateStyleImageSourceImage(sourceId, image)");
        return expectedUpdateStyleImageSourceImage;
    }

    public final Expected<String, None> updateViewAnnotation(String identifier, ViewAnnotationOptions options) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(options, "options");
        Expected<String, None> expectedUpdateViewAnnotation = this.map.updateViewAnnotation(identifier, options);
        AbstractC22676k.m65749i(expectedUpdateViewAnnotation, "map.updateViewAnnotation(identifier, options)");
        return expectedUpdateViewAnnotation;
    }

    public final void whenMapSizeReady(InterfaceC4339a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        if (this.sizeSet) {
            callback.invoke();
        } else {
            this.sizeSetCallbackList.add(callback);
        }
    }

    public final CameraOptions cameraForCoordinates(List<Point> points, CameraOptions camera, ScreenBox box) {
        AbstractC22676k.m65750j(points, "points");
        AbstractC22676k.m65750j(camera, "camera");
        AbstractC22676k.m65750j(box, "box");
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(points, camera, box);
        AbstractC22676k.m65749i(cameraOptionsCameraForCoordinates, "map.cameraForCoordinates(points, camera, box)");
        return cameraOptionsCameraForCoordinates;
    }

    public final Cancelable getFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, QueryFeatureStateCallback callback) {
        AbstractC22676k.m65750j(featureset, "featureset");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable featureState = this.map.getFeatureState(featureset, featureId, callback);
        AbstractC22676k.m65749i(featureState, "map.getFeatureState(feat…set, featureId, callback)");
        return featureState;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, List<FeaturesetQueryTarget> targets, QueryRenderedFeaturesCallback callback) {
        AbstractC22676k.m65750j(geometry, "geometry");
        AbstractC22676k.m65750j(targets, "targets");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(geometry, targets, callback);
        AbstractC22676k.m65749i(cancelableQueryRenderedFeatures, "map.queryRenderedFeature…metry, targets, callback)");
        return cancelableQueryRenderedFeatures;
    }

    public final Cancelable removeFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, String stateKey, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(featureset, "featureset");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(featureset, featureId, stateKey, callback);
        AbstractC22676k.m65749i(cancelableRemoveFeatureState, "map.removeFeatureState(f…reId, stateKey, callback)");
        return cancelableRemoveFeatureState;
    }

    public final Cancelable resetFeatureStates(FeaturesetDescriptor featureset, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(featureset, "featureset");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(featureset, callback);
        AbstractC22676k.m65749i(cancelableResetFeatureStates, "map.resetFeatureStates(featureset, callback)");
        return cancelableResetFeatureStates;
    }

    public final void setCamera(FreeCameraOptions freeCameraOptions) {
        AbstractC22676k.m65750j(freeCameraOptions, "freeCameraOptions");
        this.map.setCamera(freeCameraOptions);
    }

    public final Cancelable setFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, Value state, FeatureStateOperationCallback callback) {
        AbstractC22676k.m65750j(featureset, "featureset");
        AbstractC22676k.m65750j(featureId, "featureId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(callback, "callback");
        Cancelable featureState = this.map.setFeatureState(featureset, featureId, state, callback);
        AbstractC22676k.m65749i(featureState, "map.setFeatureState(feat…atureId, state, callback)");
        return featureState;
    }

    public final Cancelable subscribe(MapIdleCallback onMapIdleListener) {
        AbstractC22676k.m65750j(onMapIdleListener, "onMapIdleListener");
        Cancelable cancelableSubscribe = this.map.subscribe(onMapIdleListener);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(onMapIdleListener)");
        return cancelableSubscribe;
    }

    public final Expected<String, CameraOptions> cameraForCoordinates(List<Point> points, CameraOptions camera, EdgeInsets padding, Double maxZoom, ScreenCoordinate offset) {
        AbstractC22676k.m65750j(points, "points");
        AbstractC22676k.m65750j(camera, "camera");
        Expected<String, CameraOptions> expectedCameraForCoordinates = this.map.cameraForCoordinates(points, camera, padding, maxZoom, offset);
        AbstractC22676k.m65749i(expectedCameraForCoordinates, "map.cameraForCoordinates…padding, maxZoom, offset)");
        return expectedCameraForCoordinates;
    }

    public final Cancelable subscribe(MapLoadingErrorCallback mapLoadingErrorCallback) {
        AbstractC22676k.m65750j(mapLoadingErrorCallback, "mapLoadingErrorCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadingErrorCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(mapLoadingErrorCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleLoadedCallback styleLoadedCallback) {
        AbstractC22676k.m65750j(styleLoadedCallback, "styleLoadedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(styleLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(styleLoadedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleDataLoadedCallback styleDataLoadedCallback) {
        AbstractC22676k.m65750j(styleDataLoadedCallback, "styleDataLoadedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(styleDataLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(styleDataLoadedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(SourceDataLoadedCallback sourceDataLoadedCallback) {
        AbstractC22676k.m65750j(sourceDataLoadedCallback, "sourceDataLoadedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(sourceDataLoadedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(sourceDataLoadedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(SourceAddedCallback sourceAddedCallback) {
        AbstractC22676k.m65750j(sourceAddedCallback, "sourceAddedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(sourceAddedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(sourceAddedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(SourceRemovedCallback sourceRemovedCallback) {
        AbstractC22676k.m65750j(sourceRemovedCallback, "sourceRemovedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(sourceRemovedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(sourceRemovedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleImageMissingCallback styleImageMissingCallback) {
        AbstractC22676k.m65750j(styleImageMissingCallback, "styleImageMissingCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageMissingCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(styleImageMissingCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        AbstractC22676k.m65750j(styleImageRemoveUnusedCallback, "styleImageRemoveUnusedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageRemoveUnusedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(styleImageRemoveUnusedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(CameraChangedCallback cameraChangedCallback) {
        AbstractC22676k.m65750j(cameraChangedCallback, "cameraChangedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(cameraChangedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        AbstractC22676k.m65750j(cameraChangedCoalescedCallback, "cameraChangedCoalescedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCoalescedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(cameraChangedCoalescedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(RenderFrameStartedCallback renderFrameStartedCallback) {
        AbstractC22676k.m65750j(renderFrameStartedCallback, "renderFrameStartedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameStartedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(renderFrameStartedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        AbstractC22676k.m65750j(renderFrameFinishedCallback, "renderFrameFinishedCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameFinishedCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(renderFrameFinishedCallback)");
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(ResourceRequestCallback resourceRequestCallback) {
        AbstractC22676k.m65750j(resourceRequestCallback, "resourceRequestCallback");
        Cancelable cancelableSubscribe = this.map.subscribe(resourceRequestCallback);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(resourceRequestCallback)");
        return cancelableSubscribe;
    }

    @MapboxExperimental
    public final Cancelable subscribe(String eventName, GenericEventCallback onGenericEventsListener) {
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(onGenericEventsListener, "onGenericEventsListener");
        Cancelable cancelableSubscribe = this.map.subscribe(eventName, onGenericEventsListener);
        AbstractC22676k.m65749i(cancelableSubscribe, "map.subscribe(eventName, onGenericEventsListener)");
        return cancelableSubscribe;
    }
}
