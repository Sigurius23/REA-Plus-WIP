.class public final Ld33/y0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Ld33/h1;

.field public final synthetic y:Ljava/util/Set;

.field public final synthetic z:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/y0;->x:Ld33/h1;

    iput-object p2, p0, Ld33/y0;->y:Ljava/util/Set;

    iput-object p3, p0, Ld33/y0;->z:Ljava/util/Set;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Ld33/y0;

    iget-object v0, p0, Ld33/y0;->y:Ljava/util/Set;

    iget-object v1, p0, Ld33/y0;->z:Ljava/util/Set;

    iget-object v2, p0, Ld33/y0;->x:Ld33/h1;

    invoke-direct {p1, v2, v0, v1, p2}, Ld33/y0;-><init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld33/y0;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/y0;->x:Ld33/h1;

    iget-object v1, p1, Ld33/h1;->A:Lec3/h2;

    new-instance v3, Ld33/x0;

    iget-object v4, p0, Ld33/y0;->y:Ljava/util/Set;

    iget-object v5, p0, Ld33/y0;->z:Ljava/util/Set;

    invoke-direct {v3, p1, v4, v5}, Ld33/x0;-><init>(Ld33/h1;Ljava/util/Set;Ljava/util/Set;)V

    iput v2, p0, Ld33/y0;->w:I

    invoke-virtual {v1, v3, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0
.end method
