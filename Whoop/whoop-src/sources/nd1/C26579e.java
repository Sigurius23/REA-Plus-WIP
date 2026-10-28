package nd1;

import a82.C0570a;
import a82.C0572c;
import android.bluetooth.BluetoothAdapter;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.os.Build;
import ao1.C1873h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c82.C4308a;
import ca2.C4369i;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.whoop.ble.scan.C6050a;
import com.whoop.data.repositories.CastlePairingChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import d82.C11778b;
import d82.InterfaceC11777a;
import e82.C12853a;
import e82.C12854b;
import fi0.InterfaceC14515a;
import fi0.InterfaceC14517c;
import fn0.C14639a;
import hj0.C17345d;
import ij0.C18595a;
import in2.InterfaceC18732d;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jk0.C21748b;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import lj0.C24462a;
import lj0.C24463b;
import lj0.C24464c;
import lj0.C24465d;
import lj0.C24466e;
import lj0.C24469h;
import lj0.C24470i;
import lm0.C24509d;
import m32.C25008d;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import m83.AbstractC25265s;
import nh2.InterfaceC26724a;
import ok0.AbstractC27993c;
import or2.C28162g;
import org.koin.core.error.DefinitionParameterException;
import p007a6.InterfaceC0422g;
import p236j.AbstractC21071j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pk0.InterfaceC29333c;
import qf3.C30330b;
import qk0.C30442b;
import qt0.InterfaceC30585a;
import rf3.C31362a;
import rf3.C31365d;
import rt0.InterfaceC31801c;
import sj2.C32566c;
import sj2.InterfaceC32565b;
import st0.InterfaceC32974r;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import us0.InterfaceC35207c;
import us0.InterfaceC35209e;
import us0.InterfaceC35211g;
import us0.InterfaceC35212h;
import ut0.InterfaceC35230b;
import vf3.C35953c;
import vk0.C36077c;
import vk0.C36082h;
import vk0.InterfaceC36076b;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import xs0.InterfaceC38638b;
import zs0.InterfaceC41076a;

/* JADX INFO: renamed from: nd1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lnd1/e;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lnd1/m;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26579e implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26587m> dependencies = AbstractC37056f.m118958J(new C26587m());

    /* JADX INFO: renamed from: E */
    private static final C23454a0 m78823E(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C35953c c35953c = new C35953c("protocolHandshakeMap");
        C26576b c26576b = new C26576b(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c2 = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953c, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass, c35953c, c26576b, 2)), false);
        C26576b c26576b2 = new C26576b(11);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC35230b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass2, null, c26576b2, 2)), false);
        C26576b c26576b3 = new C26576b(22);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC25007c.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c2, orCreateKotlinClass3, null, c26576b3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c2), false, "firmware-update-permission-helper");
        C26576b c26576b4 = new C26576b(23);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC25007c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c2, orCreateKotlinClass4, c35953cM73385r, c26576b4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c2), false, "bluetooth-device-permissions");
        C26576b c26576b5 = new C26576b(24);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(List.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r2, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass5, c35953cM73385r2, c26576b5, 2)), false);
        C26576b c26576b6 = new C26576b(25);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C14639a.class);
        C30330b c30330b = new C30330b(c35953c2, orCreateKotlinClass6, null, c26576b6, 2);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c2);
        C31362a c31362a = new C31362a(c30330b);
        module.m106774b(strM60669Y, c31362a, false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC41076a.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31362a.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31362a, true);
        C26576b c26576b7 = new C26576b(26);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC11777a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass7, null, c26576b7, 2)), false);
        C26576b c26576b8 = new C26576b(27);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C4308a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass8, null, c26576b8, 2)), false);
        C26576b c26576b9 = new C26576b(28);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC35211g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass9, null, c26576b9, 2)), false);
        C26576b c26576b10 = new C26576b(29);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(InterfaceC35207c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass10, null, c26576b10, 2)), false);
        C26576b c26576b11 = new C26576b(20);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC31801c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c2), new C31365d(new C30330b(c35953c2, orCreateKotlinClass11, null, c26576b11, 1)), false);
        C26578d c26578d = new C26578d(0);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C12853a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c2), new C31365d(new C30330b(c35953c2, orCreateKotlinClass12, null, c26578d, 1)), false);
        C26578d c26578d2 = new C26578d(1);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C24470i.class);
        C30330b c30330b3 = new C30330b(c35953c2, orCreateKotlinClass13, null, c26578d2, 1);
        String strM60669Y2 = AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c2);
        C31365d c31365d = new C31365d(c30330b3);
        module.m106774b(strM60669Y2, c31365d, false);
        hashSet.add(c31365d);
        C26578d c26578d3 = new C26578d(2);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C24465d.class);
        C30330b c30330b4 = new C30330b(c35953c2, orCreateKotlinClass14, null, c26578d3, 1);
        String strM60669Y3 = AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c2);
        C31365d c31365d2 = new C31365d(c30330b4);
        module.m106774b(strM60669Y3, c31365d2, false);
        hashSet.add(c31365d2);
        C26578d c26578d4 = new C26578d(3);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C36082h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass15, null, c26578d4, 2)), false);
        C26578d c26578d5 = new C26578d(4);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(CastlePairingChecker.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass16, null, c26578d5, 2)), false);
        C26578d c26578d6 = new C26578d(5);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C0570a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass17, null, c26578d6, 2)), false);
        C26578d c26578d7 = new C26578d(6);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(InterfaceC30585a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass18, null, c26578d7, 2)), false);
        C26578d c26578d8 = new C26578d(7);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(InterfaceC35209e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass19, null, c26578d8, 2)), false);
        C26576b c26576b12 = new C26576b(10);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C24509d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass20, null, c26576b12, 2)), false);
        C26576b c26576b13 = new C26576b(12);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(InterfaceC35212h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass21, null, c26576b13, 2)), false);
        C26576b c26576b14 = new C26576b(13);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(InterfaceC26724a.class);
        C35953c c35953cM73385r3 = AbstractC25012a.m73385r(new C30330b(c35953c2, orCreateKotlinClass22, null, c26576b14, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c2), false, "strapTaskPriorityService");
        C26576b c26576b15 = new C26576b(14);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(InterfaceC32565b.class);
        C30330b c30330b5 = new C30330b(c35953c2, orCreateKotlinClass23, c35953cM73385r3, c26576b15, 1);
        String strM60669Y4 = AbstractC21598x.m60669Y(orCreateKotlinClass23, c35953cM73385r3, c35953c2);
        C31365d c31365d3 = new C31365d(c30330b5);
        module.m106774b(strM60669Y4, c31365d3, false);
        hashSet.add(c31365d3);
        C35953c c35953c3 = new C35953c("strapBleExecutor");
        C26576b c26576b16 = new C26576b(15);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(InterfaceC36076b.class);
        C35953c c35953cM73385r4 = AbstractC25012a.m73385r(new C30330b(c35953c2, orCreateKotlinClass24, c35953c3, c26576b16, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass24, c35953c3, c35953c2), false, "puffinTaskPriorityService");
        C26576b c26576b17 = new C26576b(16);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(InterfaceC32565b.class);
        C30330b c30330b6 = new C30330b(c35953c2, orCreateKotlinClass25, c35953cM73385r4, c26576b17, 1);
        String strM60669Y5 = AbstractC21598x.m60669Y(orCreateKotlinClass25, c35953cM73385r4, c35953c2);
        C31365d c31365d4 = new C31365d(c30330b6);
        module.m106774b(strM60669Y5, c31365d4, false);
        hashSet.add(c31365d4);
        C35953c c35953c4 = new C35953c("puffinBleExecutor");
        C26576b c26576b18 = new C26576b(17);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(InterfaceC36076b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass26, c35953c4, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass26, c35953c4, c26576b18, 2)), false);
        C26576b c26576b19 = new C26576b(18);
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(C21748b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass27, null, c35953c2), new C31362a(new C30330b(c35953c2, orCreateKotlinClass27, null, c26576b19, 2)), false);
        C26576b c26576b20 = new C26576b(19);
        InterfaceC21461d orCreateKotlinClass28 = c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass28, null, c35953c2), new C31365d(new C30330b(c35953c2, orCreateKotlinClass28, null, c26576b20, 1)), false);
        C26576b c26576b21 = new C26576b(21);
        InterfaceC21461d orCreateKotlinClass29 = c22673i0.getOrCreateKotlinClass(InterfaceC38638b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c2, orCreateKotlinClass29, null, c26576b21, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass29, null, c35953c2), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Map m78824F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC27993c.m84423c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC35230b m78825G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30442b(new C1873h(factory, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC29333c m78826H(C38266c c38266c) {
        return (InterfaceC29333c) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC29333c.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC31801c m78827I(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12854b(null, (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC35211g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35211g.class), null), null, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C12853a m78828J(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C12853a((InterfaceC4733b) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C24470i m78829K(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24470i((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("PacketSnifferAnalytics"), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C17345d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C24465d m78830L(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("HistoryPullThroughputAnalytics");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C24465d(interfaceC34116nM107848a, interfaceC4733b, interfaceC21030c, clockSystemUTC, AbstractC3006f0.m8708b(AbstractC3006f0.m8710d()), (InterfaceC4368h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), (InterfaceC32974r) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C36082h m78831M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36082h(null, (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), AbstractC3006f0.m8708b(AbstractC3006f0.m8710d()), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), (InterfaceC32974r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final CastlePairingChecker m78832N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new CastlePairingChecker((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C0570a m78833O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0570a((CastlePairingChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(CastlePairingChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final InterfaceC30585a m78834P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("BleScannerImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0572c(interfaceC34116nM107848a, (BluetoothAdapter) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BluetoothAdapter.class), null), (C0570a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C0570a.class), null), (C6050a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C6050a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC35209e m78835Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C24463b(interfaceC21030c, featureFlagChecker, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), (InterfaceC14517c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14517c.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC32974r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C24509d m78836R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C24509d(context, interfaceC14515a, interfaceC0422g, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), InterfaceC34116n.INSTANCE.m107848a("BondLossReceiver"), Build.VERSION.SDK_INT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final InterfaceC25007c m78837S(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("BluetoothPermissionHelperImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC21071j.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC21071j.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C25008d(interfaceC34116nM107848a, (AbstractC21071j) objM110111b, (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), (List) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(List.class), new C35953c("bluetooth-device-permissions")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC35212h m78838T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C24469h(interfaceC21030c, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final InterfaceC26724a m78839U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C24464c(interfaceC21030c, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), InterfaceC34116n.INSTANCE.m107848a("FirmwareVersionAnalytics"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final InterfaceC32565b m78840V(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C32566c(AbstractC3006f0.m8708b(AbstractC3076z.limitedParallelism$default(ExecutorC22364d.f87316w, 1, null, 2, null)), InterfaceC34116n.INSTANCE.m107848a("PriorityInterruptibleExecutionService.Strap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC36076b m78841W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("strapTaskPriorityService");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC32565b interfaceC32565b = (InterfaceC32565b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32565b.class), c35953c);
        C36082h c36082h = (C36082h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36082h.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C36077c(interfaceC32565b, c36082h, abstractC21909c, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("BleTaskExecutor.Strap"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final InterfaceC32565b m78842X(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C32566c(AbstractC3006f0.m8708b(AbstractC3076z.limitedParallelism$default(ExecutorC22364d.f87316w, 1, null, 2, null)), InterfaceC34116n.INSTANCE.m107848a("PriorityInterruptibleExecutionService.BatteryPack"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final InterfaceC36076b m78843Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("puffinTaskPriorityService");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC32565b interfaceC32565b = (InterfaceC32565b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32565b.class), c35953c);
        C36082h c36082h = (C36082h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36082h.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C36077c(interfaceC32565b, c36082h, abstractC21909c, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("BleTaskExecutor.BatteryPack"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C21748b m78844Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21748b(null, (InterfaceC4733b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC4368h m78846a0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C4369i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC38638b m78848b0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18595a((InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final InterfaceC25007c m78850c0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25008d(InterfaceC34116n.INSTANCE.m107848a("FirmwareUpdatePermissionHelper"), (AbstractC21071j) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC21071j.class)), (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), (List) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(List.class)), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final List m78852d0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return Build.VERSION.SDK_INT >= 31 ? AbstractC37056f.m118959K("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN") : AbstractC37056f.m118959K("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C14639a m78854e0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14639a((CompanionDeviceManager) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(CompanionDeviceManager.class)), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), InterfaceC34116n.INSTANCE.m107848a("CompanionDeviceHelperRedesign"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final InterfaceC11777a m78856f0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11778b((InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), InterfaceC34116n.INSTANCE.m107848a("ImuSdk"), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C4308a m78858g0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4308a((InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), InterfaceC34116n.INSTANCE.m107848a("HrSdk"), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC35211g m78860h0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24466e((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), InterfaceC34116n.INSTANCE.m107848a("LiveHrZeroAnalytics"), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC32974r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null), (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final InterfaceC35207c m78862i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24462a((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), InterfaceC34116n.INSTANCE.m107848a("BlePairLifecycleAnalytics"), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78823E(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C26587m> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
