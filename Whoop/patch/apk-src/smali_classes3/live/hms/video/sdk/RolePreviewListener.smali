.class public interface abstract Llive/hms/video/sdk/RolePreviewListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/IErrorListener;
.implements Llive/hms/video/sdk/RequestPermissionInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/RolePreviewListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/sdk/RolePreviewListener;",
        "Llive/hms/video/sdk/IErrorListener;",
        "Llive/hms/video/sdk/RequestPermissionInterface;",
        "",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "localTracks",
        "Ll83/a0;",
        "onTracks",
        "([Llive/hms/video/media/tracks/HMSTrack;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onTracks([Llive/hms/video/media/tracks/HMSTrack;)V
.end method
