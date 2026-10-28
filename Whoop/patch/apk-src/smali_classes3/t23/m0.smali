.class public final Lt23/m0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic w:Ljava/util/Map;

.field public synthetic x:Ljava/util/Map;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Lq83/d;

    new-instance v0, Lt23/m0;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Lt23/m0;->w:Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    iput-object p2, v0, Lt23/m0;->x:Ljava/util/Map;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lt23/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/m0;->w:Ljava/util/Map;

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lt23/m0;->x:Ljava/util/Map;

    check-cast v0, Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
