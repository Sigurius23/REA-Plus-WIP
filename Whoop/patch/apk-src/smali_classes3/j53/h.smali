.class public final Lj53/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public synthetic w:Ljava/util/Map;

.field public synthetic x:Ljava/util/Map;

.field public synthetic y:Lj53/f;

.field public synthetic z:Ljava/util/Comparator;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Lj53/f;

    check-cast p4, Ljava/util/Comparator;

    check-cast p5, Lq83/d;

    new-instance v0, Lj53/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p5}, Ls83/i;-><init>(ILq83/d;)V

    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Lj53/h;->w:Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    iput-object p2, v0, Lj53/h;->x:Ljava/util/Map;

    iput-object p3, v0, Lj53/h;->y:Lj53/f;

    iput-object p4, v0, Lj53/h;->z:Ljava/util/Comparator;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj53/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj53/h;->w:Ljava/util/Map;

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lj53/h;->x:Ljava/util/Map;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lj53/h;->y:Lj53/f;

    iget-object v2, p0, Lj53/h;->z:Ljava/util/Comparator;

    new-instance v3, Lj53/k;

    invoke-direct {v3, p1, v0, v1, v2}, Lj53/k;-><init>(Ljava/util/Map;Ljava/util/Map;Lj53/f;Ljava/util/Comparator;)V

    return-object v3
.end method
