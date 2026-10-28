.class public final Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;
.super Llive/hms/video/sdk/models/PolicyUpdate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/PolicyUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UnpublishTracks"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;",
        "Llive/hms/video/sdk/models/PolicyUpdate;",
        "<init>",
        "()V",
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


# static fields
.field public static final INSTANCE:Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;

    invoke-direct {v0}, Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;-><init>()V

    sput-object v0, Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;->INSTANCE:Llive/hms/video/sdk/models/PolicyUpdate$UnpublishTracks;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/PolicyUpdate;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
