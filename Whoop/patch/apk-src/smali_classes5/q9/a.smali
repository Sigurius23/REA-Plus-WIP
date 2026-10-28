.class public final Lq9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic w:Ljava/util/concurrent/Executor;

.field public final synthetic x:Llive/hms/video/factories/c;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Llive/hms/video/factories/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/a;->w:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lq9/a;->x:Llive/hms/video/factories/c;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lq9/a;->w:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
