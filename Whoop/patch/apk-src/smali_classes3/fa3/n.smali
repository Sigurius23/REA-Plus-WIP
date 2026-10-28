.class public abstract Lfa3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    sget-object v0, Lfa3/a;->z:Lfa3/a;

    sget-object v1, Lfa3/a;->x:Lfa3/a;

    sget-object v2, Lfa3/a;->y:Lfa3/a;

    sget-object v3, Lfa3/a;->F:Lfa3/a;

    sget-object v4, Lfa3/a;->E:Lfa3/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lfa3/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Lfa3/y;->a:Lva3/e;

    new-instance v3, Lfa3/m;

    new-instance v4, Lna3/h;

    sget-object v9, Lna3/g;->y:Lna3/g;

    invoke-direct {v4, v9}, Lna3/h;-><init>(Lna3/g;)V

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;ZZZ)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lfa3/y;->b:Lva3/e;

    new-instance v10, Lfa3/m;

    new-instance v11, Lna3/h;

    invoke-direct {v11, v9}, Lna3/h;-><init>(Lna3/g;)V

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/4 v13, 0x0

    move-object v12, v5

    invoke-direct/range {v10 .. v15}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;ZZZ)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lfa3/y;->c:Lva3/e;

    new-instance v4, Lfa3/m;

    new-instance v6, Lna3/h;

    sget-object v7, Lna3/g;->w:Lna3/g;

    invoke-direct {v6, v7}, Lna3/h;-><init>(Lna3/g;)V

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;I)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v3, v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lfa3/n;->a:Ljava/lang/Object;

    sget-object v2, Lfa3/y;->h:Lva3/e;

    new-instance v3, Lfa3/m;

    new-instance v4, Lna3/h;

    invoke-direct {v4, v9}, Lna3/h;-><init>(Lna3/g;)V

    check-cast v1, Ljava/util/Collection;

    const/16 v5, 0x1c

    invoke-direct {v3, v4, v1, v5}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lfa3/y;->i:Lva3/e;

    new-instance v3, Lfa3/m;

    new-instance v6, Lna3/h;

    sget-object v7, Lna3/g;->x:Lna3/g;

    invoke-direct {v6, v7}, Lna3/h;-><init>(Lna3/g;)V

    invoke-direct {v3, v6, v1, v5}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;I)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sput-object v0, Lfa3/n;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a()Ljava/util/LinkedHashMap;
    .locals 1

    sget-object v0, Lfa3/n;->c:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public static final b()Ljava/util/Map;
    .locals 1

    sget-object v0, Lfa3/n;->a:Ljava/lang/Object;

    return-object v0
.end method
