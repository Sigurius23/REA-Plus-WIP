.class final Lmk2/r$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->z(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;
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
        0x153
    }
    m = "enqueuePendingSave"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmk2/r;

.field z:I


# direct methods
.method public constructor <init>(Lmk2/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/r;",
            "Lq83/d<",
            "-",
            "Lmk2/r$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$e;->y:Lmk2/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmk2/r$e;->x:Ljava/lang/Object;

    iget p1, p0, Lmk2/r$e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmk2/r$e;->z:I

    iget-object p1, p0, Lmk2/r$e;->y:Lmk2/r;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lmk2/r;->e(Lmk2/r;Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
