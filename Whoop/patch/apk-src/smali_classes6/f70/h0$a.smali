.class final Lf70/h0$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/h0;->d(Lec3/m;Lf70/e$b;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.IAJFEnterEmailHandler"
    f = "IAJFEnterEmailHandler.kt"
    l = {
        0xa2,
        0xaa
    }
    m = "fetchSecondBatchAndMerge"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lf70/h0;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/h0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/h0;",
            "Lq83/d<",
            "-",
            "Lf70/h0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/h0$a;->H:Lf70/h0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lf70/h0$a;->G:Ljava/lang/Object;

    iget p1, p0, Lf70/h0$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/h0$a;->I:I

    iget-object v0, p0, Lf70/h0$a;->H:Lf70/h0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lf70/h0;->a(Lf70/h0;Lec3/m;Lf70/e$b;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
