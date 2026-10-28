.class public final Lcom/whoop/video/VideoActivity$b;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/video/VideoActivity;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/video/VideoActivity$b",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "video_release"
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
.field final synthetic d:Lcom/whoop/video/VideoActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/video/VideoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/video/VideoActivity$b;->d:Lcom/whoop/video/VideoActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/video/VideoActivity$b;->d:Lcom/whoop/video/VideoActivity;

    invoke-static {v0}, Lcom/whoop/video/VideoActivity;->F(Lcom/whoop/video/VideoActivity;)V

    iget-object v0, p0, Lcom/whoop/video/VideoActivity$b;->d:Lcom/whoop/video/VideoActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
