.class public final Ldw/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc5/l;

.field public final b:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc5/l;Ljava/util/concurrent/ThreadPoolExecutor;Ljava/lang/String;)V
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldw/e;->a:Lc5/l;

    iput-object p2, p0, Ldw/e;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iput-object p3, p0, Ldw/e;->c:Ljava/lang/String;

    return-void
.end method
