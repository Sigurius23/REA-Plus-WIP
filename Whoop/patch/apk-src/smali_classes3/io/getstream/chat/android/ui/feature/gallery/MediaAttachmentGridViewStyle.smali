.class public final Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008(\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 72\u00020\u0001:\u00017Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0082\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0007H\u00d6\u0001J\t\u00105\u001a\u000206H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0016\u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "showUserAvatars",
        "",
        "playVideoButtonIcon",
        "Landroid/graphics/drawable/Drawable;",
        "playVideoIconTint",
        "",
        "playVideoIconBackgroundColor",
        "playVideoIconCornerRadius",
        "",
        "playVideoIconElevation",
        "playVideoIconPaddingTop",
        "playVideoIconPaddingBottom",
        "playVideoIconPaddingStart",
        "playVideoIconPaddingEnd",
        "imagePlaceholder",
        "<init>",
        "(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V",
        "getShowUserAvatars",
        "()Z",
        "getPlayVideoButtonIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "getPlayVideoIconTint",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPlayVideoIconBackgroundColor",
        "()I",
        "getPlayVideoIconCornerRadius",
        "()F",
        "getPlayVideoIconElevation",
        "getPlayVideoIconPaddingTop",
        "getPlayVideoIconPaddingBottom",
        "getPlayVideoIconPaddingStart",
        "getPlayVideoIconPaddingEnd",
        "getImagePlaceholder",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;


# instance fields
.field private final imagePlaceholder:Landroid/graphics/drawable/Drawable;

.field private final playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

.field private final playVideoIconBackgroundColor:I

.field private final playVideoIconCornerRadius:F

.field private final playVideoIconElevation:F

.field private final playVideoIconPaddingBottom:I

.field private final playVideoIconPaddingEnd:I

.field private final playVideoIconPaddingStart:I

.field private final playVideoIconPaddingTop:I

.field private final playVideoIconTint:Ljava/lang/Integer;

.field private final showUserAvatars:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iput p4, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    iput p5, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    iput p6, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    iput p7, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    iput p8, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    iput p9, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    iput p10, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    iput-object p11, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p6, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    :cond_a
    move-object p13, p11

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move p12, p10

    move p10, p8

    move p8, p6

    move p6, p4

    move-object p4, p2

    new-instance p2, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    move p11, p9

    move p9, p7

    move p7, p5

    move-object p5, p3

    move p3, p1

    invoke-direct/range {p2 .. p13}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;-><init>(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V

    return-object p2
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    return v0
.end method

.method public final component11()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component2()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    return v0
.end method

.method public final copy(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
    .locals 12

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;-><init>(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getImagePlaceholder()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPlayVideoButtonIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPlayVideoIconBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    return v0
.end method

.method public final getPlayVideoIconCornerRadius()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    return v0
.end method

.method public final getPlayVideoIconElevation()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    return v0
.end method

.method public final getPlayVideoIconPaddingBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    return v0
.end method

.method public final getPlayVideoIconPaddingEnd()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    return v0
.end method

.method public final getPlayVideoIconPaddingStart()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    return v0
.end method

.method public final getPlayVideoIconPaddingTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    return v0
.end method

.method public final getPlayVideoIconTint()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShowUserAvatars()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->showUserAvatars:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoButtonIcon:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iget v3, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconBackgroundColor:I

    iget v4, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconCornerRadius:F

    iget v5, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconElevation:F

    iget v6, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingTop:I

    iget v7, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingBottom:I

    iget v8, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingStart:I

    iget v9, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->playVideoIconPaddingEnd:I

    iget-object v10, p0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->imagePlaceholder:Landroid/graphics/drawable/Drawable;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "MediaAttachmentGridViewStyle(showUserAvatars="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", playVideoButtonIcon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", playVideoIconTint="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", playVideoIconBackgroundColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", playVideoIconCornerRadius="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", playVideoIconElevation="

    const-string v1, ", playVideoIconPaddingTop="

    invoke-static {v11, v4, v0, v5, v1}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    const-string v0, ", playVideoIconPaddingBottom="

    const-string v1, ", playVideoIconPaddingStart="

    invoke-static {v11, v6, v0, v7, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ", playVideoIconPaddingEnd="

    const-string v1, ", imagePlaceholder="

    invoke-static {v11, v8, v0, v9, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
