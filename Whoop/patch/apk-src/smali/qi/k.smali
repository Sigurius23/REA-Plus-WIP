.class public final synthetic Lqi/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:Ljava/lang/ref/WeakReference;

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/k;->w:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lqi/k;->x:Landroid/content/Context;

    iput p3, p0, Lqi/k;->y:I

    iput-object p4, p0, Lqi/k;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqi/k;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqi/k;->x:Landroid/content/Context;

    :goto_0
    iget v1, p0, Lqi/k;->y:I

    iget-object v2, p0, Lqi/k;->z:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lqi/l;->g(Landroid/content/Context;ILjava/lang/String;)Lqi/b0;

    move-result-object v0

    return-object v0
.end method
