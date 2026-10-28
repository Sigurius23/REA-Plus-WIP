.class public final Ldw/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldw/e;

.field public final b:Ljava/lang/String;

.field public final c:Le10/k0;

.field public final d:Lz7/a;


# direct methods
.method public constructor <init>(Ldw/e;Ljava/lang/String;Le10/k0;Lz7/a;)V
    .locals 1

    const-string v0, "memfaultCloud"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceSerial"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldw/c;->a:Ldw/e;

    iput-object p2, p0, Ldw/c;->b:Ljava/lang/String;

    iput-object p3, p0, Ldw/c;->c:Le10/k0;

    iput-object p4, p0, Ldw/c;->d:Lz7/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1

    const-string v0, "chunks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldw/c;->c:Le10/k0;

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final b(Ldw/f;)V
    .locals 9

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldw/c;->a:Ldw/e;

    iget-object v1, v0, Ldw/e;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lew/f;

    new-instance v3, Ldb/j0;

    new-instance v4, Lu00/e;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, Lu00/e;-><init>(I)V

    iget-object v5, v0, Ldw/e;->c:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Ldb/j0;-><init>(Lu00/e;Ljava/lang/String;)V

    iget-object v4, v0, Ldw/e;->a:Lc5/l;

    iget-object v6, p0, Ldw/c;->c:Le10/k0;

    iget-object v8, p0, Ldw/c;->d:Lz7/a;

    iget-object v5, p0, Ldw/c;->b:Ljava/lang/String;

    move-object v7, p1

    invoke-direct/range {v2 .. v8}, Lew/f;-><init>(Ldb/j0;Lc5/l;Ljava/lang/String;Le10/k0;Ldw/f;Lz7/a;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
