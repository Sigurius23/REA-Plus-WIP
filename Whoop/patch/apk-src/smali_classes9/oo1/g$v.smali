.class final Loo1/g$v;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->z(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor"
    f = "MciOverviewInteractor.kt"
    l = {
        0x1b4
    }
    m = "loadSymptoms"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Loo1/g;

.field y:I


# direct methods
.method public constructor <init>(Loo1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Lq83/d<",
            "-",
            "Loo1/g$v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$v;->x:Loo1/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loo1/g$v;->w:Ljava/lang/Object;

    iget p1, p0, Loo1/g$v;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loo1/g$v;->y:I

    iget-object p1, p0, Loo1/g$v;->x:Loo1/g;

    invoke-static {p1, p0}, Loo1/g;->l(Loo1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
