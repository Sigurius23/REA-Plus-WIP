.class public final Lkx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx2/a$a;
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
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkx2/a;",
        "Lax2/a;",
        "Ll83/a0;",
        "Lmx2/b$a;",
        "action",
        "Lex2/b;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lmx2/b$a;Lex2/b;Ltr2/n;)V",
        "Lax2/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lmx2/b$a;",
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
.field public static final d:Lkx2/a$a;

.field public static final e:I

.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:Lmx2/b$a;

.field private final b:Lex2/b;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkx2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkx2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkx2/a;->d:Lkx2/a$a;

    const/16 v0, 0x8

    sput v0, Lkx2/a;->e:I

    const-string v0, "AbandonCampaignDetailsCommand"

    sput-object v0, Lkx2/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lmx2/b$a;Lex2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx2/a;->a:Lmx2/b$a;

    iput-object p2, p0, Lkx2/a;->b:Lex2/b;

    iput-object p3, p0, Lkx2/a;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkx2/a;->f:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lkx2/a$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkx2/a$b;

    iget v1, v0, Lkx2/a$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkx2/a$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkx2/a$b;

    invoke-direct {v0, p0, p1}, Lkx2/a$b;-><init>(Lkx2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lkx2/a$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkx2/a$b;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkx2/a;->c:Ltr2/n;

    iget-object v2, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v2}, Lmx2/b$a;->b()I

    move-result v2

    const-string v5, "Attempting to abandon campaign: "

    invoke-static {v2, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lkx2/a;->b:Lex2/b;

    iget-object v2, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v2}, Lmx2/b$a;->b()I

    move-result v2

    iget-object v5, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v5}, Lmx2/b$a;->i()Lmx2/a;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lmx2/a;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v6

    :goto_1
    iget-object v7, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v7}, Lmx2/b$a;->i()Lmx2/a;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lmx2/a;->a()Ljava/lang/String;

    move-result-object v6

    :cond_4
    iput v3, v0, Lkx2/a$b;->y:I

    invoke-virtual {p1, v2, v5, v6, v0}, Lex2/b;->a(ILjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lkx2/a;->c:Ltr2/n;

    iget-object v0, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v0}, Lmx2/b$a;->b()I

    move-result v0

    const-string v1, "Participant removed from study: "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lax2/b$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Lax2/b$b;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    iget-object p1, p0, Lkx2/a;->c:Ltr2/n;

    iget-object v0, p0, Lkx2/a;->a:Lmx2/b$a;

    invoke-virtual {v0}, Lmx2/b$a;->b()I

    move-result v0

    const-string v1, "Failed to abandon campaign: "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1
.end method
