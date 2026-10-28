.class public final Liy2/c$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liy2/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Liy2/c;


# direct methods
.method public constructor <init>(Lec3/m;Liy2/c;)V
    .locals 0

    iput-object p2, p0, Liy2/c$e$a;->x:Liy2/c;

    iput-object p1, p0, Liy2/c$e$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Liy2/c$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Liy2/c$e$a$a;

    iget v1, v0, Liy2/c$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Liy2/c$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Liy2/c$e$a$a;

    invoke-direct {v0, p0, p2}, Liy2/c$e$a$a;-><init>(Liy2/c$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Liy2/c$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Liy2/c$e$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    check-cast p1, Liy2/c$a;

    iget-object p1, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget p1, v0, Liy2/c$e$a$a;->I:I

    iget-object v2, v0, Liy2/c$e$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v3, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Liy2/c$a;

    iget-object v3, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget p1, v0, Liy2/c$e$a$a;->I:I

    iget-object v2, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Liy2/c$a;

    iget-object v6, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Liy2/c$e$a;->w:Lec3/m;

    check-cast p1, Liy2/c$a;

    invoke-virtual {p1}, Liy2/c$a;->g()Liy2/b;

    move-result-object v2

    instance-of v2, v2, Liy2/b$i;

    const/4 v8, 0x0

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Liy2/c$a;->g()Liy2/b;

    move-result-object v2

    iput-object v7, v0, Liy2/c$e$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Liy2/c$e$a$a;->I:I

    iput v6, v0, Liy2/c$e$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v3, p1

    move-object v2, p2

    move p1, v8

    :goto_2
    iget-object p2, p0, Liy2/c$e$a;->x:Liy2/c;

    iput-object v7, v0, Liy2/c$e$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Liy2/c$e$a$a;->H:Ljava/lang/Object;

    iput p1, v0, Liy2/c$e$a$a;->I:I

    iput v5, v0, Liy2/c$e$a$a;->x:I

    invoke-static {p2, v3, v0}, Liy2/c;->g(Liy2/c;Liy2/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    iput-object v7, v0, Liy2/c$e$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->H:Ljava/lang/Object;

    iput p1, v0, Liy2/c$e$a$a;->I:I

    iput v4, v0, Liy2/c$e$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Liy2/c$a;->g()Liy2/b;

    move-result-object p1

    iput-object v7, v0, Liy2/c$e$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Liy2/c$e$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Liy2/c$e$a$a;->I:I

    iput v3, v0, Liy2/c$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
