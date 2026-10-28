.class public final Luo/c0;
.super Luo/u;
.source "SourceFile"


# instance fields
.field public final synthetic g:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Luo/c0;->g:Luo/c;

    invoke-direct {p0, p1, p2, p3}, Luo/u;-><init>(Luo/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Luo/c0;->g:Luo/c;

    iget-object v0, v0, Luo/c;->i:Luo/b;

    sget-object v1, Lcom/google/android/gms/common/a;->E:Lcom/google/android/gms/common/a;

    invoke-interface {v0, v1}, Luo/b;->b(Lcom/google/android/gms/common/a;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final b(Lcom/google/android/gms/common/a;)V
    .locals 2

    iget-object v0, p0, Luo/c0;->g:Luo/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, v0, Lyp/e;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Luo/c;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Luo/c;->r()V

    return-void

    :cond_0
    iget-object v0, v0, Luo/c;->i:Luo/b;

    invoke-interface {v0, p1}, Luo/b;->b(Lcom/google/android/gms/common/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method
