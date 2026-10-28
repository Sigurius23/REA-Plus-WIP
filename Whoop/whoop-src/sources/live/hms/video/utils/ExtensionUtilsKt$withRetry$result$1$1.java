package live.hms.video.utils;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import live.hms.video.transport.models.TransportFailureCategory;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.utils.ExtensionUtilsKt$withRetry$result$1$1", m100430f = "ExtensionUtils.kt", m100431l = {82, 85, 85, 87, 87, 89, 89}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class ExtensionUtilsKt$withRetry$result$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC4351m $dependencyCheck;
    final /* synthetic */ Function1 $task;
    final /* synthetic */ TransportFailureCategory $tfcDependency;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionUtilsKt$withRetry$result$1$1(TransportFailureCategory transportFailureCategory, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC30057d<? super ExtensionUtilsKt$withRetry$result$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$tfcDependency = transportFailureCategory;
        this.$dependencyCheck = interfaceC4351m;
        this.$task = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ExtensionUtilsKt$withRetry$result$1$1 extensionUtilsKt$withRetry$result$1$1 = new ExtensionUtilsKt$withRetry$result$1$1(this.$tfcDependency, this.$dependencyCheck, this.$task, interfaceC30057d);
        extensionUtilsKt$withRetry$result$1$1.L$0 = obj;
        return extensionUtilsKt$withRetry$result$1$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ExtensionUtilsKt$withRetry$result$1$1) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[PHI: r1
      0x00a9: PHI (r1v10 ec3.m) = (r1v7 ec3.m), (r1v11 ec3.m) binds: [B:25:0x0097, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3 A[PHI: r1 r7
      0x00d3: PHI (r1v14 ec3.m) = (r1v10 ec3.m), (r1v16 ec3.m) binds: [B:31:0x00d0, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r7v24 java.lang.Object) = (r7v21 java.lang.Object), (r7v0 java.lang.Object) binds: [B:31:0x00d0, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00df A[PHI: r1
      0x00df: PHI (r1v3 ec3.m) = (r1v2 ec3.m), (r1v4 ec3.m), (r1v4 ec3.m) binds: [B:13:0x004d, B:18:0x005f, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed A[PHI: r1 r7
      0x00ed: PHI (r1v17 ec3.m) = (r1v3 ec3.m), (r1v19 ec3.m) binds: [B:37:0x00ea, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r7v27 java.lang.Object) = (r7v5 java.lang.Object), (r7v0 java.lang.Object) binds: [B:37:0x00ea, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L41;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a9, please report this as an issue */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.utils.ExtensionUtilsKt$withRetry$result$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
