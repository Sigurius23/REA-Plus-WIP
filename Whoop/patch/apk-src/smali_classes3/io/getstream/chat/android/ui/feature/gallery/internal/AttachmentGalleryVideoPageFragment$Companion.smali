.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "thumbUrl",
        "assetUrl",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "imageClickListener",
        "Landroidx/fragment/app/m0;",
        "create",
        "(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;",
        "ARG_THUMB_URL",
        "Ljava/lang/String;",
        "ARG_ASSET_URL",
        "",
        "CONTROLLER_SHOW_TIMEOUT",
        "I",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;Ljava/lang/String;Ljava/lang/String;Lc93/a;ILjava/lang/Object;)Landroidx/fragment/app/m0;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lou1/a;

    const/4 p4, 0x7

    invoke-direct {p3, p4}, Lou1/a;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$Companion;->create(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Landroidx/fragment/app/m0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")",
            "Landroidx/fragment/app/m0;"
        }
    .end annotation

    const-string v0, "imageClickListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "thumb_url"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "asset_url"

    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    invoke-static {v0, p3}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->access$setImageClickListener$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Lc93/a;)V

    return-object v0
.end method
