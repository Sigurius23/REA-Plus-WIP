.class public final Lzk/a;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# instance fields
.field public final a:Lwk/e;

.field public final b:Z

.field public c:Lzk/z;


# direct methods
.method public constructor <init>(Lwk/e;Lzk/t;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    const-string p3, "Argument must not be null"

    invoke-static {p1, p3}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lzk/a;->a:Lwk/e;

    iget-boolean p1, p2, Lzk/t;->w:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lzk/a;->c:Lzk/z;

    iput-boolean p1, p0, Lzk/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lzk/a;->c:Lzk/z;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    return-void
.end method
