package it1;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ht1.C17625b;
import ht1.EnumC17628e;
import ht1.InterfaceC17627d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: it1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lit1/d;", "", "<init>", "()V", "Lht1/e;", "selectedWrist", "", "willOverwriteReading", "Lit1/c;", "c", "(Lht1/e;Z)Lit1/c;", "Lec3/l;", "Lht1/b;", "domainResult", "b", "(Lec3/l;)Lec3/l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20930d {

    /* JADX INFO: renamed from: it1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78902a;

        static {
            int[] iArr = new int[EnumC17628e.values().length];
            try {
                iArr[EnumC17628e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17628e.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78902a = iArr;
        }
    }

    /* JADX INFO: renamed from: it1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78903w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20930d f78904x;

        /* JADX INFO: renamed from: it1.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78905w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20930d f78906x;

            /* JADX INFO: renamed from: it1.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.deviceloaction.presentation.LabradorDeviceLocationViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LabradorDeviceLocationViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41791a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78907E;

                /* JADX INFO: renamed from: F */
                Object f78908F;

                /* JADX INFO: renamed from: G */
                Object f78909G;

                /* JADX INFO: renamed from: H */
                int f78910H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78911w;

                /* JADX INFO: renamed from: x */
                int f78912x;

                /* JADX INFO: renamed from: y */
                Object f78913y;

                public C41791a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78911w = obj;
                    this.f78912x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C20930d c20930d) {
                this.f78905w = interfaceC13062m;
                this.f78906x = c20930d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41791a c41791a;
                Object objM58095c;
                if (interfaceC30057d instanceof C41791a) {
                    c41791a = (C41791a) interfaceC30057d;
                    int i13 = c41791a.f78912x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41791a.f78912x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41791a = new C41791a(interfaceC30057d);
                    }
                } else {
                    c41791a = new C41791a(interfaceC30057d);
                }
                Object obj2 = c41791a.f78911w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41791a.f78912x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78905w;
                    C17625b c17625b = (C17625b) obj;
                    InterfaceC17627d currentScreenType = c17625b.getCurrentScreenType();
                    if (AbstractC22676k.m65745e(currentScreenType, InterfaceC17627d.b.f68364a)) {
                        objM58095c = InterfaceC20929c.a.INSTANCE.m58071a();
                    } else {
                        if (!AbstractC22676k.m65745e(currentScreenType, InterfaceC17627d.a.f68363a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM58095c = this.f78906x.m58095c(c17625b.getSelectedWrist(), c17625b.getWillOverwriteReading());
                    }
                    c41791a.f78913y = null;
                    c41791a.f78907E = null;
                    c41791a.f78908F = null;
                    c41791a.f78909G = null;
                    c41791a.f78910H = 0;
                    c41791a.f78912x = 1;
                    if (interfaceC13062m.emit(objM58095c, c41791a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C20930d c20930d) {
            this.f78903w = interfaceC13058l;
            this.f78904x = c20930d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78903w.collect(new a(interfaceC13062m, this.f78904x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC20929c m58095c(EnumC17628e selectedWrist, boolean willOverwriteReading) {
        InterfaceC20929c.b bVarM58091a;
        int i13 = selectedWrist == null ? -1 : a.f78902a[selectedWrist.ordinal()];
        if (i13 == -1) {
            bVarM58091a = InterfaceC20929c.b.INSTANCE.m58091a();
        } else if (i13 == 1) {
            bVarM58091a = InterfaceC20929c.b.INSTANCE.m58092b();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVarM58091a = InterfaceC20929c.b.INSTANCE.m58093c();
        }
        InterfaceC20929c.b bVar = bVarM58091a;
        return bVar.m58076d((8191 & 1) != 0 ? bVar.selectedWrist : null, (8191 & 2) != 0 ? bVar.toolbarIcon : 0, (8191 & 4) != 0 ? bVar.image : 0, (8191 & 8) != 0 ? bVar.pageTitle : null, (8191 & 16) != 0 ? bVar.infoIcon : 0, (8191 & 32) != 0 ? bVar.infoText : null, (8191 & 64) != 0 ? bVar.instruction : null, (8191 & 128) != 0 ? bVar.instructionDescription : null, (8191 & 256) != 0 ? bVar.toggleTitle : null, (8191 & 512) != 0 ? bVar.leftToggleText : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? bVar.rightToggleText : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? bVar.primaryButtonText : null, (8191 & 4096) != 0 ? bVar.isPrimaryButtonEnabled : false, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? bVar.willOverwriteReading : willOverwriteReading);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m58096b(InterfaceC13058l domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return new b(domainResult, this);
    }
}
