.class final Lmk2/r$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->A(Lu02/a$b$a;Lx90/d;Ljava/time/Instant;Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor"
    f = "TrackSessionMiniArchInteractor.kt"
    l = {
        0x14f
    }
    m = "handleHttpError"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lmk2/r;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmk2/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/r;",
            "Lq83/d<",
            "-",
            "Lmk2/r$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$f;->F:Lmk2/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lmk2/r$f;->E:Ljava/lang/Object;

    iget p1, p0, Lmk2/r$f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmk2/r$f;->G:I

    iget-object v0, p0, Lmk2/r$f;->F:Lmk2/r;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lmk2/r;->n(Lmk2/r;Lu02/a$b$a;Lx90/d;Ljava/time/Instant;Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
