.class public final synthetic Lrv/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lrv/m;


# direct methods
.method public synthetic constructor <init>(Lrv/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/l;->a:Lrv/m;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lrv/l;->a:Lrv/m;

    iget-object v0, v0, Lrv/m;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrv/l;

    invoke-virtual {v1}, Lrv/l;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method
