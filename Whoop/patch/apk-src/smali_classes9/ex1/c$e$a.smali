.class final Lex1/c$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex1/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lex1/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lex1/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lex1/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lex1/c$e$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lex1/c$e$a;->x:Lex1/c;

    iput-object p3, p0, Lex1/c$e$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lex1/a;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lex1/c$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lex1/c$e$a$a;

    iget v1, v0, Lex1/c$e$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lex1/c$e$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lex1/c$e$a$a;

    invoke-direct {v0, p0, p2}, Lex1/c$e$a$a;-><init>(Lex1/c$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lex1/c$e$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lex1/c$e$a$a;->E:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lex1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lex1/c$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lex1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lex1/c$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lex1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lex1/c$e$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v2, p1, Lex1/a$b;

    if-eqz v2, :cond_6

    iget-object p1, p0, Lex1/c$e$a;->x:Lex1/c;

    iget-object v2, p0, Lex1/c$e$a;->y:Lec3/m;

    iput-object v6, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lex1/c$e$a$a;->x:Ljava/lang/Object;

    iput v5, v0, Lex1/c$e$a$a;->E:I

    invoke-static {p1, v2, v0}, Lex1/c;->d(Lex1/c;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_1
    check-cast p2, Lex1/b;

    :goto_2
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_4

    :cond_6
    instance-of v2, p1, Lex1/a$a;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lex1/c$e$a;->x:Lex1/c;

    iget-object v5, p0, Lex1/c$e$a;->y:Lec3/m;

    check-cast p1, Lex1/a$a;

    invoke-virtual {p1}, Lex1/a$a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lex1/a$a;->b()Ljava/util/Map;

    move-result-object p1

    iput-object v6, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lex1/c$e$a$a;->x:Ljava/lang/Object;

    iput v4, v0, Lex1/c$e$a$a;->E:I

    invoke-static {v2, v5, v7, p1, v0}, Lex1/c;->c(Lex1/c;Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    check-cast p2, Lex1/b;

    goto :goto_2

    :cond_8
    instance-of p1, p1, Lex1/a$c;

    if-eqz p1, :cond_a

    sget-object p1, Lex1/b$e;->a:Lex1/b$e;

    :goto_4
    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lex1/c$e$a;->y:Lec3/m;

    iget-object p2, p0, Lex1/c$e$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v6, v0, Lex1/c$e$a$a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lex1/c$e$a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lex1/c$e$a$a;->E:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lex1/a;

    invoke-virtual {p0, p1, p2}, Lex1/c$e$a;->b(Lex1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
