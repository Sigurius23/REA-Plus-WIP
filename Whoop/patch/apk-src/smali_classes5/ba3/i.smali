.class public final Lba3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsa3/f;

.field public final b:Lsa3/h;

.field public final c:Lsa3/j;

.field public final d:Z

.field public final e:Lba3/i;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ljava/util/List;


# direct methods
.method public constructor <init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLba3/i;Ljava/util/List;)V
    .locals 1

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirements"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextExtensions"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lba3/i;->a:Lsa3/f;

    .line 3
    iput-object p2, p0, Lba3/i;->b:Lsa3/h;

    .line 4
    iput-object p3, p0, Lba3/i;->c:Lsa3/j;

    .line 5
    iput-boolean p4, p0, Lba3/i;->d:Z

    .line 6
    iput-object p5, p0, Lba3/i;->e:Lba3/i;

    .line 7
    iput-object p6, p0, Lba3/i;->f:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lba3/i;->g:Ljava/util/LinkedHashMap;

    .line 9
    sget-object p1, Lca3/l;->a:Lca3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lca3/k;->a()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lba3/i;->h:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLjava/util/List;I)V
    .locals 7

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    .line 10
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v6, p5

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 11
    invoke-direct/range {v0 .. v6}, Lba3/i;-><init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLba3/i;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lba3/i;->g:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    iget-object v0, p0, Lba3/i;->e:Lba3/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lba3/i;->a(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final b(Ljava/util/List;)Lba3/i;
    .locals 8

    const-string v0, "typeParameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lba3/i;

    iget-boolean v5, p0, Lba3/i;->d:Z

    iget-object v7, p0, Lba3/i;->f:Ljava/util/List;

    iget-object v2, p0, Lba3/i;->a:Lsa3/f;

    iget-object v3, p0, Lba3/i;->b:Lsa3/h;

    iget-object v4, p0, Lba3/i;->c:Lsa3/j;

    move-object v6, p0

    invoke-direct/range {v1 .. v7}, Lba3/i;-><init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLba3/i;Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/b1;

    iget v2, v0, Lqa3/b1;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, v0, Lqa3/b1;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, v1, Lba3/i;->g:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method
