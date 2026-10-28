.class public final Lil1/l$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/l$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lil1/l;


# direct methods
.method public constructor <init>(Lec3/m;Lil1/l;)V
    .locals 0

    iput-object p1, p0, Lil1/l$d$a;->w:Lec3/m;

    iput-object p2, p0, Lil1/l$d$a;->x:Lil1/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lil1/l$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lil1/l$d$a$a;

    iget v1, v0, Lil1/l$d$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lil1/l$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lil1/l$d$a$a;

    invoke-direct {v0, p0, p2}, Lil1/l$d$a$a;-><init>(Lil1/l$d$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lil1/l$d$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lil1/l$d$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lil1/l$d$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lil1/l$d$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lil1/l$d$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lil1/l$d$a;->w:Lec3/m;

    move-object v2, p1

    check-cast v2, Lil1/u;

    instance-of v2, v2, Lil1/u$c;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lil1/l$d$a;->x:Lil1/l;

    invoke-static {v2}, Lil1/l;->c(Lil1/l;)Lj02/r;

    move-result-object v2

    invoke-interface {v2}, Lj02/r;->isAvailable()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    if-eqz v2, :cond_4

    const/4 v2, 0x0

    iput-object v2, v0, Lil1/l$d$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/l$d$a$a;->z:Ljava/lang/Object;

    iput-object v2, v0, Lil1/l$d$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lil1/l$d$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lil1/l$d$a$a;->H:I

    iput v3, v0, Lil1/l$d$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
