package p591wp;

/* JADX INFO: renamed from: wp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37482c extends C37483d {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f160320z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37482c(int i13, C37481b c37481b, Float f13, int i14) {
        super(i13, c37481b, f13);
        this.f160320z = i14;
    }

    @Override // p591wp.C37483d
    public final String toString() {
        switch (this.f160320z) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37482c() {
        super(0, null, null);
        this.f160320z = 0;
    }
}
