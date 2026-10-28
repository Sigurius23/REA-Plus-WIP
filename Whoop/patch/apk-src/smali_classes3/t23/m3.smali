.class public final Lt23/m3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/b4;


# direct methods
.method public synthetic constructor <init>(Lt23/b4;I)V
    .locals 0

    iput p2, p0, Lt23/m3;->w:I

    iput-object p1, p0, Lt23/m3;->x:Lt23/b4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lg53/m;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lt23/n3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt23/n3;

    iget v1, v0, Lt23/n3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/n3;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lt23/n3;

    invoke-direct {v0, p0, p2}, Lt23/n3;-><init>(Lt23/m3;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lt23/n3;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lt23/n3;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lt23/n3;->w:Lt23/m3;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lt23/m3;->x:Lt23/b4;

    iget-object p2, v1, Lt23/b4;->Z:Ljava/util/LinkedHashMap;

    instance-of p1, p1, Lg53/c;

    if-eqz p1, :cond_5

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {p2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/c0;

    iget-object v3, v3, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance p1, Lw33/c;

    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    invoke-direct {p1, p2}, Lw33/c;-><init>(Ljava/util/Set;)V

    invoke-static {p1}, Ls4/a;->n(Lio/getstream/video/android/core/filter/FilterObject;)Ljava/util/Map;

    move-result-object p1

    iput-object p0, v6, Lt23/n3;->w:Lt23/m3;

    iput v2, v6, Lt23/n3;->z:I

    new-instance p2, Lc43/u;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0x19

    const/4 v5, 0x1

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lt23/b4;->u(Ljava/util/Map;Ljava/util/List;IZLs83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, p0

    :goto_3
    iget-object p1, p1, Lt23/m3;->x:Lt23/b4;

    check-cast p2, Ln23/h;

    instance-of v0, p2, Ln23/f;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lt23/b4;->q()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    check-cast p2, Ln23/f;

    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to re-watch calls ("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p1, v2, v1, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lt23/m3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lt23/m3;->x:Lt23/b4;

    invoke-virtual {v1, v0, p1}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object p1

    sget-object v0, Lc43/p;->a:Lc43/p;

    invoke-virtual {p1, v0, p2}, Lt23/c0;->w(Ltx/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lg53/m;

    invoke-virtual {p0, p1, p2}, Lt23/m3;->b(Lg53/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lx43/m;

    iget-object p2, p0, Lt23/m3;->x:Lt23/b4;

    iget-object p2, p2, Lt23/b4;->U:Lt23/g1;

    iget-object p1, p1, Lx43/m;->a:Ln23/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lt23/g1;->d:Lec3/h2;

    new-instance p2, Lng3/o;

    const/16 v0, 0x1c

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lng3/o;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lg53/m;

    iget-object p2, p0, Lt23/m3;->x:Lt23/b4;

    iget-object p2, p2, Lt23/b4;->U:Lt23/g1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "socketState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg53/i;

    if-eqz v0, :cond_1

    sget-object p1, Lt23/k1;->a:Lt23/k1;

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lg53/d;

    if-eqz v0, :cond_2

    sget-object p1, Lt23/j1;->a:Lt23/j1;

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lg53/c;

    if-eqz v0, :cond_3

    sget-object p1, Lt23/h1;->a:Lt23/h1;

    goto :goto_2

    :cond_3
    instance-of v0, p1, Lg53/g;

    sget-object v1, Lt23/l1;->a:Lt23/l1;

    if-eqz v0, :cond_4

    :goto_1
    move-object p1, v1

    goto :goto_2

    :cond_4
    instance-of v0, p1, Lg53/l;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lg53/j;

    sget-object v1, Lt23/i1;->a:Lt23/i1;

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lg53/h;

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    instance-of v0, p1, Lg53/e;

    if-eqz v0, :cond_8

    goto :goto_1

    :cond_8
    instance-of p1, p1, Lg53/f;

    if-eqz p1, :cond_9

    goto :goto_1

    :goto_2
    iget-object p2, p2, Lt23/g1;->d:Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_3
    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    iget-object p2, p0, Lt23/m3;->x:Lt23/b4;

    const-string v0, ""

    invoke-virtual {p2, p1, v0}, Lt23/b4;->o(Lio/getstream/android/video/generated/models/VideoEvent;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
