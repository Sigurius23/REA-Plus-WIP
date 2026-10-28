.class public final Lkx2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx2/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax2/a<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkx2/d;",
        "Lax2/a;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
        "",
        "campaignId",
        "Lex2/b;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(ILex2/b;Ltr2/n;)V",
        "Lax2/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "I",
        "b",
        "Lex2/b;",
        "c",
        "Ltr2/n;",
        "d",
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
.field public static final d:Lkx2/d$a;

.field public static final e:I

.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:I

.field private final b:Lex2/b;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkx2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkx2/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkx2/d;->d:Lkx2/d$a;

    const/16 v0, 0x8

    sput v0, Lkx2/d;->e:I

    const-string v0, "LoadCampaignDetailsCommand"

    sput-object v0, Lkx2/d;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILex2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkx2/d;->a:I

    iput-object p2, p0, Lkx2/d;->b:Lex2/b;

    iput-object p3, p0, Lkx2/d;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkx2/d;->f:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lax2/b<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lkx2/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkx2/d$b;

    iget v1, v0, Lkx2/d$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkx2/d$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkx2/d$b;

    invoke-direct {v0, p0, p1}, Lkx2/d$b;-><init>(Lkx2/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lkx2/d$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkx2/d$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkx2/d;->c:Ltr2/n;

    iget v2, p0, Lkx2/d;->a:I

    const-string v4, "Loading campaign details for campaignId: "

    invoke-static {v2, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lkx2/d;->b:Lex2/b;

    iget v2, p0, Lkx2/d;->a:I

    iput v3, v0, Lkx2/d$b;->y:I

    invoke-virtual {p1, v2, v0}, Lex2/b;->h(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    if-eqz p1, :cond_4

    new-instance v0, Lax2/b$b;

    invoke-direct {v0, p1}, Lax2/b$b;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1
.end method
