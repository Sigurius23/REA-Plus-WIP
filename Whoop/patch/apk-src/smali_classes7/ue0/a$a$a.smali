.class public final Lue0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lue0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lue0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lue0/a;)V
    .locals 0

    iput-object p1, p0, Lue0/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lue0/a$a$a;->x:Lue0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lue0/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lue0/a$a$a$a;

    iget v1, v0, Lue0/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lue0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lue0/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lue0/a$a$a$a;-><init>(Lue0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lue0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lue0/a$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lue0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lue0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lue0/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lue0/a$a$a;->w:Lec3/m;

    check-cast p1, Lre0/b;

    instance-of v2, p1, Lre0/b$b;

    if-eqz v2, :cond_3

    sget-object p1, Lte0/h$b;->b:Lte0/h$b;

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lre0/b$a;

    if-eqz v2, :cond_4

    sget-object p1, Lte0/h$a;->b:Lte0/h$a;

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lre0/b$d;

    if-eqz v2, :cond_5

    sget-object p1, Lte0/h$d;->b:Lte0/h$d;

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lre0/b$c;

    if-eqz v2, :cond_6

    sget-object p1, Lte0/h$c;->b:Lte0/h$c;

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lre0/b$f;

    if-eqz v2, :cond_7

    new-instance v2, Lte0/h$f;

    check-cast p1, Lre0/b$f;

    invoke-virtual {p1}, Lre0/b$f;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v2, p1}, Lte0/h$f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    move-object p1, v2

    goto :goto_1

    :cond_7
    instance-of v2, p1, Lre0/b$e;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lue0/a$a$a;->x:Lue0/a;

    check-cast p1, Lre0/b$e;

    invoke-static {v2, p1}, Lue0/a;->a(Lue0/a;Lre0/b$e;)Lte0/h$e;

    move-result-object p1

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Lue0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lue0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lue0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lue0/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lue0/a$a$a$a;->H:I

    iput v3, v0, Lue0/a$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
