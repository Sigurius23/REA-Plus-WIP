.class public final Lbz2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax2/a<",
        "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lbz2/a;",
        "Lax2/a;",
        "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
        "Lex2/a;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lex2/a;Ltr2/n;)V",
        "Lax2/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lex2/a;",
        "b",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lex2/a;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lex2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbz2/a;->a:Lex2/a;

    .line 3
    iput-object p2, p0, Lbz2/a;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lex2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    const-string p2, "FetchDwlLandingCommand"

    invoke-static {p2}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lbz2/a;-><init>(Lex2/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lax2/b<",
            "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lbz2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbz2/a$a;

    iget v1, v0, Lbz2/a$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbz2/a$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbz2/a$a;

    invoke-direct {v0, p0, p1}, Lbz2/a$a;-><init>(Lbz2/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lbz2/a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbz2/a$a;->y:I

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

    iget-object p1, p0, Lbz2/a;->a:Lex2/a;

    iput v3, v0, Lbz2/a$a;->y:I

    invoke-virtual {p1, v0}, Lex2/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/whooplabs/data/domain/DwlLanding;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object v1, p0, Lbz2/a;->b:Ltr2/n;

    const-string v2, "Dwl Landing fetched"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lax2/b$b;

    invoke-direct {v0, p1}, Lax2/b$b;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    iget-object p1, p0, Lbz2/a;->b:Ltr2/n;

    const-string v1, "Dwl Landing fetch returned null"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1
.end method
