.class public final Lfs2/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/signal/init/HMSTokenListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs2/f;->j(Lfs2/c;Ljava/lang/String;)Lfs2/f$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "fs2/f$d",
        "Llive/hms/video/signal/init/HMSTokenListener;",
        "",
        "string",
        "Ll83/a0;",
        "onTokenSuccess",
        "(Ljava/lang/String;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
        "video-call_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lfs2/f;

.field final synthetic x:Lfs2/c;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfs2/f;Lfs2/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfs2/f$d;->w:Lfs2/f;

    iput-object p2, p0, Lfs2/f$d;->x:Lfs2/c;

    iput-object p3, p0, Lfs2/f$d;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/f$d;->w:Lfs2/f;

    iget-object v1, p0, Lfs2/f$d;->x:Lfs2/c;

    const-string v2, "token"

    invoke-static {v0, v1, v2}, Lfs2/f;->c(Lfs2/f;Lfs2/c;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lfs2/f$d;->w:Lfs2/f;

    invoke-static {v0}, Lfs2/f;->a(Lfs2/f;)Ltr2/n;

    move-result-object v0

    invoke-static {p1}, Lfs2/g;->a(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Room code exchange failed: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lfs2/f$d;->w:Lfs2/f;

    invoke-static {v0}, Lfs2/f;->b(Lfs2/f;)Lec3/p1;

    move-result-object v0

    new-instance v1, Lfs2/b$b;

    invoke-static {p1}, Lfs2/g;->a(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lfs2/b$b;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public onTokenSuccess(Ljava/lang/String;)V
    .locals 9

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/f$d;->w:Lfs2/f;

    iget-object v1, p0, Lfs2/f$d;->x:Lfs2/c;

    const-string v2, "token"

    invoke-static {v0, v1, v2}, Lfs2/f;->c(Lfs2/f;Lfs2/c;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Llive/hms/video/sdk/models/HMSConfig;

    iget-object v2, p0, Lfs2/f$d;->y:Ljava/lang/String;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Llive/hms/video/sdk/models/HMSConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lfs2/f$d;->x:Lfs2/c;

    iget-object v0, p0, Lfs2/f$d;->w:Lfs2/f;

    invoke-static {v0, p1}, Lfs2/f;->d(Lfs2/f;Lfs2/c;)Lfs2/f$b;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lfs2/c;->b(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V

    return-void
.end method
