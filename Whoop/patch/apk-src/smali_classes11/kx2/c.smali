.class public final Lkx2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx2/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax2/a<",
        "Ll83/a0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0001\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkx2/c;",
        "Lax2/a;",
        "Ll83/a0;",
        "",
        "campaignId",
        "Lex2/b;",
        "labsCampaignRepository",
        "Lzw2/b;",
        "analytics",
        "Lcom/whoop/whooplabs/a;",
        "labsServiceConnector",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(ILex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Ltr2/n;)V",
        "Lax2/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "I",
        "b",
        "Lex2/b;",
        "c",
        "Lzw2/b;",
        "d",
        "Lcom/whoop/whooplabs/a;",
        "e",
        "Ltr2/n;",
        "f",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:Lkx2/c$a;

.field public static final g:I

.field private static final h:Ljava/lang/String;


# instance fields
.field private final a:I

.field private final b:Lex2/b;

.field private final c:Lzw2/b;

.field private final d:Lcom/whoop/whooplabs/a;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkx2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkx2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkx2/c;->f:Lkx2/c$a;

    const/16 v0, 0x8

    sput v0, Lkx2/c;->g:I

    const-string v0, "CancelTaskCampaignDetailsCommand"

    sput-object v0, Lkx2/c;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Ltr2/n;)V
    .locals 1

    const-string v0, "labsCampaignRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labsServiceConnector"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkx2/c;->a:I

    iput-object p2, p0, Lkx2/c;->b:Lex2/b;

    iput-object p3, p0, Lkx2/c;->c:Lzw2/b;

    iput-object p4, p0, Lkx2/c;->d:Lcom/whoop/whooplabs/a;

    iput-object p5, p0, Lkx2/c;->e:Ltr2/n;

    return-void
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkx2/c;->h:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lax2/b<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lkx2/c$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkx2/c$b;

    iget v1, v0, Lkx2/c$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkx2/c$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkx2/c$b;

    invoke-direct {v0, p0, p1}, Lkx2/c$b;-><init>(Lkx2/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lkx2/c$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkx2/c$b;->F:I

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lkx2/c$b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean v2, v0, Lkx2/c$b;->w:Z

    iget-object v4, v0, Lkx2/c$b;->y:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-boolean v2, v0, Lkx2/c$b;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkx2/c;->e:Ltr2/n;

    iget v2, p0, Lkx2/c;->a:I

    const-string v9, "Stopping Study, campaignId: "

    invoke-static {v2, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v9, v7, [Lqr2/a$a;

    invoke-interface {p1, v2, v9}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lkx2/c;->c:Lzw2/b;

    new-instance v2, Lzw2/a$k;

    invoke-direct {v2, v8, v8, v6, v8}, Lzw2/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v2}, Lzw2/b;->a(Lzw2/a;)V

    iget-object p1, p0, Lkx2/c;->b:Lex2/b;

    iget v2, p0, Lkx2/c;->a:I

    iput v5, v0, Lkx2/c$b;->F:I

    invoke-virtual {p1, v2, v0}, Lex2/b;->q(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object v2, p0, Lkx2/c;->d:Lcom/whoop/whooplabs/a;

    iput-boolean p1, v0, Lkx2/c$b;->w:Z

    iput v4, v0, Lkx2/c$b;->F:I

    invoke-virtual {v2, v8, v0}, Lcom/whoop/whooplabs/a;->c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v10, v2

    move v2, p1

    move-object p1, v10

    :goto_2
    move-object v4, p1

    check-cast v4, Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object v4, v0, Lkx2/c$b;->y:Ljava/lang/Object;

    iput-boolean v2, v0, Lkx2/c$b;->w:Z

    iput v6, v0, Lkx2/c$b;->F:I

    invoke-virtual {v4, v0}, Lcom/whoop/whooplabs/WhoopLabsService;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    iput-object v8, v0, Lkx2/c$b;->y:Ljava/lang/Object;

    iput-boolean v2, v0, Lkx2/c$b;->w:Z

    iput-boolean p1, v0, Lkx2/c$b;->x:Z

    iput v3, v0, Lkx2/c$b;->F:I

    invoke-virtual {v4, v0}, Lcom/whoop/whooplabs/WhoopLabsService;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    iget-object p1, p0, Lkx2/c;->e:Ltr2/n;

    const-string v0, "Study stopped successfully"

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lax2/b$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Lax2/b$b;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_a
    iget-object p1, p0, Lkx2/c;->e:Ltr2/n;

    const-string v0, "Couldn\'t upload bthr data"

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1

    :cond_b
    iget-object p1, p0, Lkx2/c;->e:Ltr2/n;

    const-string v0, "Couldn\'t cancel task"

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1
.end method
