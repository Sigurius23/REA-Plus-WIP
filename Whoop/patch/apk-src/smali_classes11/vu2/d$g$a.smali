.class final Lvu2/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu2/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lvu2/d;

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvu2/d;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvu2/d;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvu2/d$g$a;->w:Lvu2/d;

    iput-object p2, p0, Lvu2/d$g$a;->x:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lqw2/b;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvu2/d$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvu2/d$g$a$a;

    iget v1, v0, Lvu2/d$g$a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvu2/d$g$a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvu2/d$g$a$a;

    invoke-direct {v0, p0, p2}, Lvu2/d$g$a$a;-><init>(Lvu2/d$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvu2/d$g$a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvu2/d$g$a$a;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object p1, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lqw2/b$n;

    if-nez p2, :cond_7

    instance-of p2, p1, Lqw2/b$f;

    if-nez p2, :cond_7

    instance-of p2, p1, Lqw2/b$g;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    instance-of p2, p1, Lqw2/b$a;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lvu2/d$g$a;->w:Lvu2/d;

    invoke-static {p2}, Lvu2/d;->h(Lvu2/d;)Ltr2/n;

    move-result-object p2

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Exercise details one rep max update failed: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p2, p1, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvu2/d$g$a;->x:Lec3/m;

    new-instance p2, Lvu2/f$g;

    invoke-direct {p2, v2}, Lvu2/f$g;-><init>(Z)V

    iput-object v7, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    iput v3, v0, Lvu2/d$g$a$a;->z:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    return-object v5

    :cond_7
    :goto_2
    iget-object p1, p0, Lvu2/d$g$a;->w:Lvu2/d;

    invoke-static {p1}, Lvu2/d;->i(Lvu2/d;)Lwm0/a;

    move-result-object p1

    sget-object p2, Lwm0/a;->d:Lwm0/a$a;

    invoke-virtual {p2, v7}, Lwm0/a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object v7, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    iput v6, v0, Lvu2/d$g$a$a;->z:I

    invoke-virtual {p1, p2, v0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    iget-object p1, p0, Lvu2/d$g$a;->x:Lec3/m;

    new-instance p2, Lvu2/f$g;

    invoke-direct {p2, v6}, Lvu2/f$g;-><init>(Z)V

    iput-object v7, v0, Lvu2/d$g$a$a;->w:Ljava/lang/Object;

    iput v4, v0, Lvu2/d$g$a$a;->z:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    return-object v5
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/b;

    invoke-virtual {p0, p1, p2}, Lvu2/d$g$a;->b(Lqw2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
