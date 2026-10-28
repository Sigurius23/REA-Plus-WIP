.class public abstract Lnw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    sget-object v2, Lnw/e;->x:Lnw/e;

    sget-object v3, Lnw/e;->y:Lnw/e;

    filled-new-array {v2, v3}, [Lnw/e;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v2, Lnw/i;->x:Lnw/i;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    sget-object v2, Lnw/e;->F:Lnw/e;

    sget-object v3, Lnw/e;->G:Lnw/e;

    sget-object v4, Lnw/e;->z:Lnw/e;

    sget-object v5, Lnw/e;->E:Lnw/e;

    filled-new-array {v4, v5, v2, v3}, [Lnw/e;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v2, Lnw/i;->y:Lnw/i;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lnw/j;->a:Ljava/util/Map;

    return-void
.end method
