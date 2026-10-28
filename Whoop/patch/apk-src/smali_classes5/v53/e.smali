.class public final Lv53/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public d:Lkotlin/jvm/internal/m;

.field public e:Z

.field public f:Z

.field public g:Z

.field public final h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lv53/e;->a:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lv53/e;->b:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lv53/e;->c:Ljava/util/LinkedHashMap;

    sget-object v0, Lv53/a;->y:Lv53/a;

    iput-object v0, p0, Lv53/e;->d:Lkotlin/jvm/internal/m;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv53/e;->e:Z

    iput-boolean v0, p0, Lv53/e;->f:Z

    sget-boolean v0, Lo63/l;->a:Z

    iput-boolean v0, p0, Lv53/e;->h:Z

    return-void
.end method


# virtual methods
.method public final a(La63/q;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    invoke-interface {p1}, La63/q;->getKey()Lo63/a;

    move-result-object v0

    iget-object v1, p0, Lv53/e;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, La63/q;->getKey()Lo63/a;

    move-result-object v2

    new-instance v3, Lb3/t0;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v0, p2}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, La63/q;->getKey()Lo63/a;

    move-result-object p2

    iget-object v0, p0, Lv53/e;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, La63/q;->getKey()Lo63/a;

    move-result-object p2

    new-instance v1, La3/m1;

    const/16 v2, 0x1a

    invoke-direct {v1, p1, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
