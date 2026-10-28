.class public interface abstract Lfs2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfs2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lfs2/c;",
        "",
        "Llive/hms/video/signal/init/TokenRequest;",
        "request",
        "Llive/hms/video/signal/init/HMSTokenListener;",
        "listener",
        "Ll83/a0;",
        "c",
        "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "config",
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "b",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "a",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
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


# static fields
.field public static final a:Lfs2/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lfs2/c$a;->a:Lfs2/c$a;

    sput-object v0, Lfs2/c;->a:Lfs2/c$a;

    return-void
.end method


# virtual methods
.method public abstract a(Llive/hms/video/sdk/HMSActionResultListener;)V
.end method

.method public abstract b(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V
.end method

.method public abstract c(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V
.end method
