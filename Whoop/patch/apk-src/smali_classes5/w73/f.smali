.class public final Lw73/f;
.super Ll73/c;
.source "SourceFile"


# instance fields
.field public final w:Lcom/whoop/data/repositories/c;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/f;->w:Lcom/whoop/data/repositories/c;

    return-void
.end method


# virtual methods
.method public final d(Ll73/d;)V
    .locals 2

    new-instance v0, Lw73/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lw73/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ll73/d;->b(Ln73/b;)V

    :try_start_0
    iget-object p1, p0, Lw73/f;->w:Lcom/whoop/data/repositories/c;

    invoke-virtual {p1, v0}, Lcom/whoop/data/repositories/c;->d(Lw73/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lw73/e;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
