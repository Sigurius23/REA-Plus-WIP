.class public final Lol2/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lol2/d$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
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


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lol2/d;


# direct methods
.method public constructor <init>(Lec3/m;Lol2/d;)V
    .locals 0

    iput-object p1, p0, Lol2/d$a$a;->w:Lec3/m;

    iput-object p2, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lol2/d$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lol2/d$a$a$a;

    iget v1, v0, Lol2/d$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lol2/d$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lol2/d$a$a$a;

    invoke-direct {v0, p0, p2}, Lol2/d$a$a$a;-><init>(Lol2/d$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lol2/d$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lol2/d$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lol2/d$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lol2/d$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lol2/d$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lol2/d$a$a;->w:Lec3/m;

    check-cast p1, Lol2/b;

    instance-of v2, p1, Lol2/b$d;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    iget-object p1, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-static {p1}, Lol2/d;->c(Lol2/d;)Lgi1/b;

    move-result-object p1

    invoke-virtual {p1}, Lgi1/b;->b()Z

    move-result v6

    iget-object p1, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-static {p1}, Lol2/d;->c(Lol2/d;)Lgi1/b;

    move-result-object p1

    invoke-virtual {p1}, Lgi1/b;->a()Z

    move-result v7

    new-instance v5, Lol2/c;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lol2/c;-><init>(ZZLol2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lol2/b$b;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-static {v2}, Lol2/d;->c(Lol2/d;)Lgi1/b;

    move-result-object v2

    invoke-virtual {v2}, Lgi1/b;->a()Z

    move-result v2

    new-instance v5, Lol2/c;

    check-cast p1, Lol2/b$b;

    invoke-virtual {p1}, Lol2/b$b;->a()Z

    move-result p1

    if-nez v2, :cond_4

    sget-object v6, Lol2/a$b;->a:Lol2/a$b;

    goto :goto_1

    :cond_4
    move-object v6, v4

    :goto_1
    invoke-direct {v5, p1, v2, v6}, Lol2/c;-><init>(ZZLol2/a;)V

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lol2/b$e;

    if-eqz v2, :cond_6

    new-instance v5, Lol2/c;

    sget-object v8, Lol2/a$b;->a:Lol2/a$b;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Lol2/c;-><init>(ZZLol2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lol2/b$a;

    if-eqz v2, :cond_7

    iget-object p1, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-static {p1}, Lol2/d;->c(Lol2/d;)Lgi1/b;

    move-result-object p1

    invoke-virtual {p1}, Lgi1/b;->b()Z

    move-result p1

    iget-object v2, p0, Lol2/d$a$a;->x:Lol2/d;

    invoke-static {v2}, Lol2/d;->c(Lol2/d;)Lgi1/b;

    move-result-object v2

    invoke-virtual {v2}, Lgi1/b;->a()Z

    move-result v2

    new-instance v5, Lol2/c;

    sget-object v6, Lol2/a$a;->a:Lol2/a$a;

    invoke-direct {v5, p1, v2, v6}, Lol2/c;-><init>(ZZLol2/a;)V

    goto :goto_2

    :cond_7
    instance-of p1, p1, Lol2/b$c;

    if-eqz p1, :cond_9

    new-instance v5, Lol2/c;

    sget-object v8, Lol2/a$a;->a:Lol2/a$a;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Lol2/c;-><init>(ZZLol2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    iput-object v4, v0, Lol2/d$a$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lol2/d$a$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lol2/d$a$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lol2/d$a$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lol2/d$a$a$a;->H:I

    iput v3, v0, Lol2/d$a$a$a;->x:I

    invoke-interface {p2, v5, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
