.class public abstract Ly00/y5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;
.implements Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 7

    sget-object v0, Ly00/f4;->G:Lt9/c0;

    move-object v0, p0

    check-cast v0, Ly00/x5;

    new-instance v1, Ll83/k;

    const-string v2, "exp_month"

    iget-object v3, v0, Ly00/x5;->w:Ljava/lang/Integer;

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "exp_year"

    iget-object v4, v0, Ly00/x5;->x:Ljava/lang/Integer;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x0

    iget-object v4, v0, Ly00/x5;->y:Ly00/w5;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ly00/w5;->c0()Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    new-instance v5, Ll83/k;

    const-string v6, "networks"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v5, :cond_2

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    if-eqz v6, :cond_1

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "card"

    invoke-static {v2, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v0, Ly00/x5;->z:Ly00/v3;

    if-eqz v2, :cond_4

    const-string v4, "billing_details"

    invoke-virtual {v2}, Ly00/v3;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v4, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v3

    :goto_3
    sget-object v4, Lm83/z;->w:Lm83/z;

    if-nez v2, :cond_5

    move-object v2, v4

    :cond_5
    iget-object v0, v0, Ly00/x5;->F:Ly00/r3;

    if-eqz v0, :cond_6

    const-string v3, "allow_redisplay"

    iget-object v0, v0, Ly00/r3;->w:Ljava/lang/String;

    invoke-static {v3, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    :cond_6
    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v3

    :goto_4
    invoke-static {v2, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method
