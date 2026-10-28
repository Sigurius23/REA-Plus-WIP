package sc2;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import hi0.AbstractC17312j;
import hj0.AbstractC17356o;
import ih0.AbstractC18489d0;
import java.nio.charset.Charset;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import or2.C28180m;
import or2.C28199s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q92.C30076h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;
import z82.C40191e;

/* JADX INFO: renamed from: sc2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001a\u0010!\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0'8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\u0017\u0010/R\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002030,8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b\u0019\u0010/R\u0016\u0010;\u001a\u0004\u0018\u0001098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010:¨\u0006<"}, m65681d2 = {"Lsc2/d;", "Lhj0/o;", "Lz82/e;", "eventDispatcher", "Lci2/b;", "whoopStrapProvider", "Lq92/h;", "whoopStrapSharedPrefs", "Lbc3/c0;", "closableScope", "<init>", "(Lz82/e;Lci2/b;Lq92/h;Lbc3/c0;)V", "", "name", "", "H", "(Ljava/lang/String;)Z", "Ll83/a0;", "I", "()V", "L", "(Ljava/lang/String;)V", "K", "E", "Lz82/e;", "F", "Lci2/b;", "G", "Lq92/h;", "Lbc3/c0;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "J", "Ljava/nio/charset/Charset;", "utf8Charset", "Lor2/s0;", "Lor2/s0;", "B", "()Lor2/s0;", "closeEditNameScreenEvent", "Landroidx/lifecycle/p0;", "Landroidx/lifecycle/p0;", "C", "()Landroidx/lifecycle/p0;", "currentDeviceName", "M", "saveButtonEnabled", "", "N", "D", "errorMessage", "O", "showProgressBar", "Ljk0/d;", "()Ljk0/d;", "whoopStrap", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32365d extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC2994c0 closableScope;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Charset utf8Charset;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C28199s0<String> closeEditNameScreenEvent;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 currentDeviceName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final AbstractC1615p0 saveButtonEnabled;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC1615p0 errorMessage;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final AbstractC1615p0 showProgressBar;

    /* JADX INFO: renamed from: sc2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.EditDeviceNameViewModel$onSaveButtonClicked$1", m100430f = "EditDeviceNameViewModel.kt", m100431l = {50, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f133972w;

        /* JADX INFO: renamed from: x */
        int f133973x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f133975z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133975z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32365d.this.new a(this.f133975z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        
            if (r14 == r0) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sc2.C32365d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32365d(C40191e eventDispatcher, InterfaceC4733b whoopStrapProvider, C30076h whoopStrapSharedPrefs, InterfaceC2994c0 closableScope) {
        super(closableScope);
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(closableScope, "closableScope");
        this.eventDispatcher = eventDispatcher;
        this.whoopStrapProvider = whoopStrapProvider;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.closableScope = closableScope;
        this.logTag = "EditDeviceNameViewModel";
        this.utf8Charset = Charset.forName("UTF-8");
        this.closeEditNameScreenEvent = new C28199s0<>();
        this.currentDeviceName = new C1630u0();
        this.saveButtonEnabled = new C1630u0();
        this.errorMessage = new C1630u0();
        this.showProgressBar = new C1630u0(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final InterfaceC21750d m100795G() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: H */
    private final boolean m100796H(String name) {
        if (AbstractC39414r.m125890i0(name)) {
            return false;
        }
        Charset utf8Charset = this.utf8Charset;
        AbstractC22676k.m65749i(utf8Charset, "utf8Charset");
        byte[] bytes = name.getBytes(utf8Charset);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        return bytes.length <= 15;
    }

    /* JADX INFO: renamed from: B */
    public final C28199s0<String> m100800B() {
        return this.closeEditNameScreenEvent;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final AbstractC1615p0 getCurrentDeviceName() {
        return this.currentDeviceName;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final AbstractC1615p0 getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final AbstractC1615p0 getSaveButtonEnabled() {
        return this.saveButtonEnabled;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final AbstractC1615p0 getShowProgressBar() {
        return this.showProgressBar;
    }

    /* JADX INFO: renamed from: I */
    public final void m100805I() {
        String strM92197c;
        AbstractC1615p0 abstractC1615p0 = this.currentDeviceName;
        InterfaceC21750d interfaceC21750dM100795G = m100795G();
        if (interfaceC21750dM100795G == null || (strM92197c = interfaceC21750dM100795G.getAdvertisingName()) == null) {
            strM92197c = this.whoopStrapSharedPrefs.m92197c();
        }
        m49140v(abstractC1615p0, strM92197c);
    }

    /* JADX INFO: renamed from: K */
    public final void m100806K(String name) {
        int i13;
        AbstractC22676k.m65750j(name, "name");
        Charset utf8Charset = this.utf8Charset;
        AbstractC22676k.m65749i(utf8Charset, "utf8Charset");
        byte[] bytes = name.getBytes(utf8Charset);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        int length = bytes.length;
        if (AbstractC39414r.m125890i0(name)) {
            i13 = AbstractC17312j.f67012p0;
        } else {
            i13 = length > 15 ? AbstractC17312j.f67015q0 : -1;
        }
        m49140v(this.saveButtonEnabled, Boolean.valueOf(i13 == -1));
        m49140v(this.errorMessage, Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: L */
    public final void m100807L(String name) {
        AbstractC22676k.m65750j(name, "name");
        if (m100796H(name)) {
            m49140v(this.showProgressBar, Boolean.TRUE);
            AbstractC3006f0.m8732z(this.closableScope, null, null, new a(name, null), 3);
        }
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C32365d(C40191e c40191e, InterfaceC4733b interfaceC4733b, C30076h c30076h, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40191e, interfaceC4733b, c30076h, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
