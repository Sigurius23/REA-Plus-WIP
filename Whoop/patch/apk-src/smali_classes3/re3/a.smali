.class public final Lre3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbf3/a;


# virtual methods
.method public final a(Lab/i0;)V
    .locals 7

    new-instance v0, Lse3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Lcg3/c;

    invoke-static {v1}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    sget-object v1, Lcg3/c;->w:Lcg3/c;

    sget-object v2, Lcg3/c;->x:Lcg3/c;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Lu00/e;

    const/16 v5, 0x15

    invoke-direct {v1, v5}, Lu00/e;-><init>(I)V

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    sget-object v5, Lcg3/c;->y:Lcg3/c;

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, Lkr/e;

    const/16 v6, 0x16

    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v3, Lkr/e;

    const/16 v2, 0x15

    invoke-direct {v3, v2}, Lkr/e;-><init>(I)V

    :cond_2
    new-instance v2, La33/d;

    const/4 v4, 0x7

    invoke-direct {v2, v1, v5, v3, v4}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v2, v0, Lse3/b;->a:La33/d;

    iget-object p1, p1, Lab/i0;->E:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "linkTypes must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
