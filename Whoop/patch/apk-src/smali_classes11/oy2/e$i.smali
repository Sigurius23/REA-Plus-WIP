.class final Loy2/e$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->m0(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Lzw2/b;Lzr2/a;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lec3/l;",
        "Loy2/l;",
        "<anonymous>",
        "(Lbc3/c0;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$endStudy$2"
    f = "CampaignStepsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/whooplabs/WhoopLabsService;

.field final synthetic F:Lzw2/b;

.field final synthetic G:Lzr2/a;

.field w:I

.field final synthetic x:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

.field final synthetic y:Lex2/c;

.field final synthetic z:Loy2/e;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;Lzw2/b;Lzr2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Lex2/c;",
            "Loy2/e;",
            "Lcom/whoop/whooplabs/WhoopLabsService;",
            "Lzw2/b;",
            "Lzr2/a;",
            "Lq83/d<",
            "-",
            "Loy2/e$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$i;->x:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iput-object p2, p0, Loy2/e$i;->y:Lex2/c;

    iput-object p3, p0, Loy2/e$i;->z:Loy2/e;

    iput-object p4, p0, Loy2/e$i;->E:Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object p5, p0, Loy2/e$i;->F:Lzw2/b;

    iput-object p6, p0, Loy2/e$i;->G:Lzr2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Loy2/e$i;

    iget-object v1, p0, Loy2/e$i;->x:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v2, p0, Loy2/e$i;->y:Lex2/c;

    iget-object v3, p0, Loy2/e$i;->z:Loy2/e;

    iget-object v4, p0, Loy2/e$i;->E:Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v5, p0, Loy2/e$i;->F:Lzw2/b;

    iget-object v6, p0, Loy2/e$i;->G:Lzr2/a;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Loy2/e$i;-><init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;Lzw2/b;Lzr2/a;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loy2/e$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Loy2/e$i;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Loy2/e$i$a;

    iget-object v2, p0, Loy2/e$i;->x:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v3, p0, Loy2/e$i;->y:Lex2/c;

    iget-object v4, p0, Loy2/e$i;->z:Loy2/e;

    iget-object v5, p0, Loy2/e$i;->E:Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v6, p0, Loy2/e$i;->F:Lzw2/b;

    iget-object v7, p0, Loy2/e$i;->G:Lzr2/a;

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Loy2/e$i$a;-><init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;Lzw2/b;Lzr2/a;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
