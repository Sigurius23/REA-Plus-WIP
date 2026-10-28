.class final Li51/q$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li51/q;->c(IILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.celebration.DynamicLottieImageProvider"
    f = "DynamicLottieImageProvider.kt"
    l = {
        0x9e
    }
    m = "loadBitmap"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Li51/q;

.field F:I

.field w:I

.field x:I

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li51/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li51/q;",
            "Lq83/d<",
            "-",
            "Li51/q$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li51/q$c;->E:Li51/q;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li51/q$c;->z:Ljava/lang/Object;

    iget p1, p0, Li51/q$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li51/q$c;->F:I

    iget-object p1, p0, Li51/q$c;->E:Li51/q;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Li51/q;->a(Li51/q;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
