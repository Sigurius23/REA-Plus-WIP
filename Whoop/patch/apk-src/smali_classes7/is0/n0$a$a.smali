.class final Lis0/n0$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/n0$a;->V(JJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.communityreactions.view.ReactionsPanelStateKt$createReactionsCollapseNestedScrollConnection$1"
    f = "ReactionsPanelState.kt"
    l = {
        0xb7
    }
    m = "onPostFling-RZ2iAVY"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:J

.field x:J

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lis0/n0$a;


# direct methods
.method public constructor <init>(Lis0/n0$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis0/n0$a;",
            "Lq83/d<",
            "-",
            "Lis0/n0$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/n0$a$a;->z:Lis0/n0$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lis0/n0$a$a;->y:Ljava/lang/Object;

    iget p1, p0, Lis0/n0$a$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lis0/n0$a$a;->E:I

    iget-object v0, p0, Lis0/n0$a$a;->z:Lis0/n0$a;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lis0/n0$a;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
