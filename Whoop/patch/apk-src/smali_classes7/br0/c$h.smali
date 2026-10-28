.class final Lbr0/c$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbr0/c;->r(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lbr0/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor"
    f = "CommunityFollowerContainerInteractor.kt"
    l = {
        0x79,
        0x7a,
        0x7f,
        0x80
    }
    m = "handleLoadPage"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lbr0/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbr0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbr0/c;",
            "Lq83/d<",
            "-",
            "Lbr0/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbr0/c$h;->G:Lbr0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbr0/c$h;->F:Ljava/lang/Object;

    iget p1, p0, Lbr0/c$h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbr0/c$h;->H:I

    iget-object p1, p0, Lbr0/c$h;->G:Lbr0/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lbr0/c;->i(Lbr0/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lbr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
