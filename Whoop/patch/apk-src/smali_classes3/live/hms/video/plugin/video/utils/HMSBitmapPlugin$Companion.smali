.class public final Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\rX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "textures",
        "",
        "getTextures",
        "()[I",
        "setTextures",
        "([I)V",
        "MIN_API_LEVEL",
        "",
        "getMIN_API_LEVEL",
        "()I",
        "setMIN_API_LEVEL",
        "(I)V",
        "DEFAULT_BLUR_PERCENTAGE",
        "getDEFAULT_BLUR_PERCENTAGE",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDEFAULT_BLUR_PERCENTAGE()I
    .locals 1

    invoke-static {}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->access$getDEFAULT_BLUR_PERCENTAGE$cp()I

    move-result v0

    return v0
.end method

.method public final getMIN_API_LEVEL()I
    .locals 1

    invoke-static {}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->access$getMIN_API_LEVEL$cp()I

    move-result v0

    return v0
.end method

.method public final getTextures()[I
    .locals 1

    invoke-static {}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->access$getTextures$cp()[I

    move-result-object v0

    return-object v0
.end method

.method public final setMIN_API_LEVEL(I)V
    .locals 0

    invoke-static {p1}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->access$setMIN_API_LEVEL$cp(I)V

    return-void
.end method

.method public final setTextures([I)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->access$setTextures$cp([I)V

    return-void
.end method
