.class final Loo1/g$z$a$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g$z$a$a;->b(Lpm0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1$job$1$1"
    f = "MciOverviewInteractor.kt"
    l = {
        0x143
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Loo1/g$z$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loo1/g$z$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field z:I


# direct methods
.method public constructor <init>(Loo1/g$z$a$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g$z$a$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Loo1/g$z$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$z$a$a$a;->y:Loo1/g$z$a$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loo1/g$z$a$a$a;->x:Ljava/lang/Object;

    iget p1, p0, Loo1/g$z$a$a$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loo1/g$z$a$a$a;->z:I

    iget-object p1, p0, Loo1/g$z$a$a$a;->y:Loo1/g$z$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Loo1/g$z$a$a;->b(Lpm0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
