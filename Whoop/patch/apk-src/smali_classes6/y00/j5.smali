.class public abstract Ly00/j5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;
.implements Landroid/os/Parcelable;


# instance fields
.field public final w:Ly00/f4;


# direct methods
.method public constructor <init>(Ly00/f4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/j5;->w:Ly00/f4;

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/util/List;
.end method

.method public final c0()Ljava/util/Map;
    .locals 5

    invoke-virtual {p0}, Ly00/j5;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v3, :cond_0

    invoke-static {v3, v4}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_1

    move-object v3, v1

    :cond_1
    invoke-static {v2, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ly00/j5;->w:Ly00/f4;

    iget-object v0, v0, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v2, v0}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v1
.end method
