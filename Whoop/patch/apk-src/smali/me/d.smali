.class public final Lme/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lff/a;
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ll83/h;

.field public final x:Lvg/n;

.field public final y:Ls/m2;


# direct methods
.method public constructor <init>(Ll83/h;Lvg/n;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/d;->w:Ll83/h;

    iput-object p2, p0, Lme/d;->x:Lvg/n;

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0x13

    const/4 v1, 0x1

    const-class v3, Lme/d;

    const-string v4, "loadRegion"

    const-string v5, "loadRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance p1, Ls/m2;

    invoke-direct {p1, v0}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v2, Lme/d;->y:Ls/m2;

    return-void
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lyd/f;->e()Ljf/a;

    move-result-object v0

    iget-object v1, p0, Lme/d;->x:Lvg/n;

    invoke-static {v0, v1}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lme/d;->y:Ls/m2;

    invoke-virtual {v0, p1}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lme/d;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbe/m;

    check-cast v0, Lbe/g;

    invoke-virtual {v0}, Lbe/g;->close()V

    :cond_0
    return-void
.end method
