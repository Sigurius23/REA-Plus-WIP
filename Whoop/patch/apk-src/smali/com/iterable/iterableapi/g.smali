.class public final Lcom/iterable/iterableapi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static h:Z = false

.field public static final i:Lcom/iterable/iterableapi/g;


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:I

.field public d:Z

.field public final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final f:Landroidx/databinding/s;

.field public final g:Lcom/iterable/iterableapi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/iterable/iterableapi/g;

    invoke-direct {v0}, Lcom/iterable/iterableapi/g;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/g;->i:Lcom/iterable/iterableapi/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/g;->a:Landroid/os/Handler;

    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/g;->c:I

    iput-boolean v0, p0, Lcom/iterable/iterableapi/g;->d:Z

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/iterable/iterableapi/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Landroidx/databinding/s;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/iterable/iterableapi/g;->f:Landroidx/databinding/s;

    new-instance v0, Lcom/iterable/iterableapi/e;

    invoke-direct {v0, p0}, Lcom/iterable/iterableapi/e;-><init>(Lcom/iterable/iterableapi/g;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/g;->g:Lcom/iterable/iterableapi/e;

    return-void
.end method


# virtual methods
.method public final a(Lcom/iterable/iterableapi/f;)V
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return-void

    :cond_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
