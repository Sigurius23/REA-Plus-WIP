package t81;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.AbstractC16444q3;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: t81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lu2/v;", "Lkotlin/Function3;", "Lh2/b;", "", "", "Ll83/a0;", "onGesture", "a", "(Lu2/v;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33598d {

    /* JADX INFO: renamed from: t81.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.zoomable.PinchToZoomGestureDetectorKt$detectPinchToZoomGesture$2", m100430f = "PinchToZoomGestureDetector.kt", m100431l = {38, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32274h implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        float f140193E;

        /* JADX INFO: renamed from: F */
        long f140194F;

        /* JADX INFO: renamed from: G */
        int f140195G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f140196H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Function3 f140197I;

        /* JADX INFO: renamed from: x */
        int f140198x;

        /* JADX INFO: renamed from: y */
        int f140199y;

        /* JADX INFO: renamed from: z */
        float f140200z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function3 function3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140197I = function3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f140197I, interfaceC30057d);
            aVar.f140196H = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:51:0x0103  */
        /* JADX WARN: Code duplicated, block: B:55:0x0115  */
        /* JADX WARN: Code duplicated, block: B:57:0x0118  */
        /* JADX WARN: Code duplicated, block: B:62:0x0128  */
        /* JADX WARN: Code duplicated, block: B:65:0x0132  */
        /* JADX WARN: Code duplicated, block: B:71:0x010f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x0145 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        
            if (r15 == r2) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0077 -> B:17:0x007a). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t81.AbstractC33598d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m106110a(InterfaceC34476v interfaceC34476v, Function3 function3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new a(function3, null), interfaceC30057d);
        return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
    }
}
