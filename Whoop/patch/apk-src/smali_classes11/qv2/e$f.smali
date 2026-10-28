.class final Lqv2/e$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqv2/e;->k(Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.library.domain.WorkoutLibraryInteractor"
    f = "WorkoutLibraryInteractor.kt"
    l = {
        0x7b
    }
    m = "handleDeleteRequest"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqv2/e;

.field z:I


# direct methods
.method public constructor <init>(Lqv2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqv2/e;",
            "Lq83/d<",
            "-",
            "Lqv2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqv2/e$f;->y:Lqv2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqv2/e$f;->x:Ljava/lang/Object;

    iget p1, p0, Lqv2/e$f;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqv2/e$f;->z:I

    iget-object p1, p0, Lqv2/e$f;->y:Lqv2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lqv2/e;->d(Lqv2/e;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
