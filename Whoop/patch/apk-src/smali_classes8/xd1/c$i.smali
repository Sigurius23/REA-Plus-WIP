.class final Lxd1/c$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd1/c;->v(Lxd1/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.edit.domain.EditActivityInteractor"
    f = "EditActivityInteractor.kt"
    l = {
        0x138
    }
    m = "resolveOverlapSleep"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lxd1/c;

.field z:I


# direct methods
.method public constructor <init>(Lxd1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd1/c;",
            "Lq83/d<",
            "-",
            "Lxd1/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxd1/c$i;->y:Lxd1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxd1/c$i;->x:Ljava/lang/Object;

    iget p1, p0, Lxd1/c$i;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxd1/c$i;->z:I

    iget-object p1, p0, Lxd1/c$i;->y:Lxd1/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lxd1/c;->f(Lxd1/c;Lxd1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
