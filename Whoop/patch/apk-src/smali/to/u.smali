.class public final Lto/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lto/b;


# instance fields
.field public final synthetic a:Lto/f;


# direct methods
.method public constructor <init>(Lto/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/u;->a:Lto/f;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v0, p0, Lto/u;->a:Lto/f;

    iget-object v1, v0, Lto/f;->N:Ljp/d;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, v0, Lto/f;->N:Ljp/d;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
