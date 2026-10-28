.class public final Lbd3/a0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public x:I

.field public synthetic y:Ll83/b;

.field public final synthetic z:Lbd3/c0;


# direct methods
.method public constructor <init>(Lbd3/c0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lbd3/a0;->z:Lbd3/c0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ll83/b;

    check-cast p2, Ll83/a0;

    check-cast p3, Lq83/d;

    new-instance p2, Lbd3/a0;

    iget-object v0, p0, Lbd3/a0;->z:Lbd3/c0;

    invoke-direct {p2, v0, p3}, Lbd3/a0;-><init>(Lbd3/c0;Lq83/d;)V

    iput-object p1, p2, Lbd3/a0;->y:Ll83/b;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lbd3/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lbd3/a0;->z:Lbd3/c0;

    iget-object v1, v0, Lbd3/c0;->a:Lbd3/a;

    iget-object v2, p0, Lbd3/a0;->y:Ll83/b;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lbd3/a0;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lbd3/a;->w()B

    move-result p1

    if-ne p1, v5, :cond_2

    invoke-virtual {v0, v5}, Lbd3/c0;->d(Z)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v4, 0x0

    if-nez p1, :cond_3

    invoke-virtual {v0, v4}, Lbd3/c0;->d(Z)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v6, 0x6

    const/4 v7, 0x0

    if-ne p1, v6, :cond_5

    iput-object v7, p0, Lbd3/a0;->y:Ll83/b;

    iput v5, p0, Lbd3/a0;->x:I

    invoke-static {v0, v2, p0}, Lbd3/c0;->a(Lbd3/c0;Ll83/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_4

    return-object v3

    :cond_4
    :goto_0
    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    return-object p1

    :cond_5
    const/16 v2, 0x8

    if-ne p1, v2, :cond_6

    invoke-virtual {v0}, Lbd3/c0;->c()Lkotlinx/serialization/json/JsonArray;

    move-result-object p1

    return-object p1

    :cond_6
    const-string p1, "Can\'t begin reading element, unexpected token"

    invoke-static {v1, p1, v4, v7, v6}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v7
.end method
