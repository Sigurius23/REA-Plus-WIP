.class public final Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;",
        "Landroid/graphics/drawable/Drawable;",
        "Landroid/content/Context;",
        "context",
        "",
        "initials",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "initialsTextStyle",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;)V",
        "Landroid/graphics/Canvas;",
        "Ll83/a0;",
        "drawGradient",
        "(Landroid/graphics/Canvas;Ljava/lang/String;)V",
        "drawInitials",
        "",
        "width",
        "height",
        "Landroid/graphics/Shader;",
        "initialsGradient",
        "(Ljava/lang/String;II)Landroid/graphics/Shader;",
        "alpha",
        "setAlpha",
        "(I)V",
        "Landroid/graphics/ColorFilter;",
        "colorFilter",
        "setColorFilter",
        "(Landroid/graphics/ColorFilter;)V",
        "getOpacity",
        "()I",
        "canvas",
        "draw",
        "(Landroid/graphics/Canvas;)V",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable$Companion;

.field private static final GRADIENT_DARKER_COLOR_FACTOR:F = 1.3f

.field private static final GRADIENT_LIGHTER_COLOR_FACTOR:F = 0.7f


# instance fields
.field private final context:Landroid/content/Context;

.field private final initials:Ljava/lang/String;

.field private final initialsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->Companion:Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialsTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initials:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initialsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method private final drawGradient(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 6

    new-instance v5, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    invoke-direct {p0, p2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initialsGradient(Ljava/lang/String;II)Landroid/graphics/Shader;

    move-result-object p2

    invoke-virtual {v5, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    int-to-float v3, p2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result p2

    int-to-float v4, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final drawInitials(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 6

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initialsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getFont()Landroid/graphics/Typeface;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    :cond_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initialsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initialsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getSize()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    move-result v5

    add-float/2addr v5, v4

    div-float/2addr v5, v2

    sub-float/2addr v3, v5

    invoke-virtual {p1, p2, v1, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final initialsGradient(Ljava/lang/String;II)Landroid/graphics/Shader;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/R$array;->stream_ui_avatar_gradient_colors:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getIntArray(Landroid/content/Context;I)[I

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    array-length v1, v0

    rem-int/2addr p1, v1

    aget p1, v0, p1

    new-instance v0, Landroid/graphics/LinearGradient;

    int-to-float v3, p2

    int-to-float v4, p3

    const p2, 0x3fa66666    # 1.3f

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/utils/ColorUtilKt;->adjustColorBrightness(IF)I

    move-result v5

    const p2, 0x3f333333    # 0.7f

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/common/utils/ColorUtilKt;->adjustColorBrightness(IF)I

    move-result v6

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initials:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->drawGradient(Landroid/graphics/Canvas;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->initials:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;->drawInitials(Landroid/graphics/Canvas;Ljava/lang/String;)V

    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
