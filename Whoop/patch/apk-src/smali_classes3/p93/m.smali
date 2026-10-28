.class public final Lp93/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lp93/m;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp93/m;

    const/4 v1, 0x4

    new-array v1, v1, [Lp93/k;

    sget-object v2, Lp93/g;->c:Lp93/g;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lp93/j;->c:Lp93/j;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lp93/h;->c:Lp93/h;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lp93/i;->c:Lp93/i;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lp93/m;-><init>(Ljava/util/List;)V

    sput-object v0, Lp93/m;->b:Lp93/m;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp93/k;

    iget-object v2, v2, Lp93/k;->a:Lva3/e;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lp93/m;->a:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lva3/e;)Lp93/l;
    .locals 8

    const-string v0, "packageFqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp93/m;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp93/k;

    iget-object v2, v1, Lp93/k;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p1, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lp93/k;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "substring(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    move-object v2, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    move v5, v3

    :goto_0
    if-ge v3, v4, :cond_4

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    add-int/lit8 v6, v6, -0x30

    if-ltz v6, :cond_2

    const/16 v7, 0xa

    if-ge v6, v7, :cond_2

    mul-int/lit8 v5, v5, 0xa

    add-int/2addr v5, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance p2, Lp93/l;

    invoke-direct {p2, v1, p1}, Lp93/l;-><init>(Lp93/k;I)V

    return-object p2

    :cond_5
    :goto_2
    return-object v0
.end method
