.class public final Lx93/g;
.super Lx93/e;
.source "SourceFile"

# interfaces
.implements Lma3/a;


# instance fields
.field public final b:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lva3/h;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lx93/e;-><init>(Lva3/h;)V

    iput-object p2, p0, Lx93/g;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lx93/g;->b:[Ljava/lang/Object;

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Lx93/c;->a:Ljava/util/List;

    const-class v6, Ljava/lang/Enum;

    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    new-instance v5, Lx93/s;

    check-cast v4, Ljava/lang/Enum;

    invoke-direct {v5, v6, v4}, Lx93/s;-><init>(Lva3/h;Ljava/lang/Enum;)V

    goto :goto_1

    :cond_0
    instance-of v5, v4, Ljava/lang/annotation/Annotation;

    if-eqz v5, :cond_1

    new-instance v5, Lx93/f;

    check-cast v4, Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v6, v4}, Lx93/f;-><init>(Lva3/h;Ljava/lang/annotation/Annotation;)V

    goto :goto_1

    :cond_1
    instance-of v5, v4, [Ljava/lang/Object;

    if-eqz v5, :cond_2

    new-instance v5, Lx93/g;

    check-cast v4, [Ljava/lang/Object;

    invoke-direct {v5, v6, v4}, Lx93/g;-><init>(Lva3/h;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v5, v4, Ljava/lang/Class;

    if-eqz v5, :cond_3

    new-instance v5, Lx93/o;

    check-cast v4, Ljava/lang/Class;

    invoke-direct {v5, v6, v4}, Lx93/o;-><init>(Lva3/h;Ljava/lang/Class;)V

    goto :goto_1

    :cond_3
    new-instance v5, Lx93/u;

    invoke-direct {v5, v6, v4}, Lx93/u;-><init>(Lva3/h;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method
