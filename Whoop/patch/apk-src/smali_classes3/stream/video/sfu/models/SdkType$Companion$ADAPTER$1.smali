.class public final Lstream/video/sfu/models/SdkType$Companion$ADAPTER$1;
.super Lcom/squareup/wire/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/SdkType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "stream/video/sfu/models/SdkType$Companion$ADAPTER$1",
        "Lcom/squareup/wire/c;",
        "Lstream/video/sfu/models/SdkType;",
        "",
        "value",
        "fromValue",
        "(I)Lstream/video/sfu/models/SdkType;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lj93/d;Lcom/squareup/wire/x;Lstream/video/sfu/models/SdkType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Lcom/squareup/wire/x;",
            "Lstream/video/sfu/models/SdkType;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/wire/c;-><init>(Lj93/d;Lcom/squareup/wire/x;Lcom/squareup/wire/y;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic fromValue(I)Lcom/squareup/wire/y;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/SdkType$Companion$ADAPTER$1;->fromValue(I)Lstream/video/sfu/models/SdkType;

    move-result-object p1

    return-object p1
.end method

.method public fromValue(I)Lstream/video/sfu/models/SdkType;
    .locals 1

    .line 2
    sget-object v0, Lstream/video/sfu/models/SdkType;->Companion:Lstream/video/sfu/models/SdkType$Companion;

    invoke-virtual {v0, p1}, Lstream/video/sfu/models/SdkType$Companion;->fromValue(I)Lstream/video/sfu/models/SdkType;

    move-result-object p1

    return-object p1
.end method
