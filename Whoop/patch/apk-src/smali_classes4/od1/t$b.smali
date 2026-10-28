.class public Lod1/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lod1/t$c;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lod1/t$i;",
            "Lod1/t$i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Lod1/t$c;[Lod1/t$i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lod1/t$b;->b:Ljava/util/Map;

    const-string v0, "EventKey provided to Event constructor must be non-null"

    invoke-static {p1, v0}, Lod1/t$f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_3

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Lod1/t$b;->a:Lod1/t$c;

    const/4 p1, 0x0

    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-object v0, p2, v0

    sget-object v1, Lod1/t$g;->WILDCARD:Lod1/t$g;

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lod1/t$b;->b:Ljava/util/Map;

    aget-object v2, p2, p1

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "the WILDCARD state may not be used as the \"to\" state in a transition"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "StateKeys provided to Event constructor must be non-null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "odd number of StateKeys provided to Event constructor - state transitions must be expressed as key pairs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic a(Lod1/t$b;)Lod1/t$c;
    .locals 0

    iget-object p0, p0, Lod1/t$b;->a:Lod1/t$c;

    return-object p0
.end method

.method public static bridge synthetic b(Lod1/t$b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lod1/t$b;->b:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lod1/t$i;)Lod1/t$i;
    .locals 1

    iget-object v0, p0, Lod1/t$b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lod1/t$i;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lod1/t$b;->a:Lod1/t$c;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
