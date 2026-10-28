.class public final Lcom/mapbox/maps/attribution/AttributionMeasure;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoLongTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoShortTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoLongTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoShortTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$LongTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$ShortTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$NoTextCommand;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$Command;,
        Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000  2\u00020\u0001:\n\u001e\u001f !\"#$%&\'B7\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u000eR\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u000e\u00a8\u0006("
    }
    d2 = {
        "Lcom/mapbox/maps/attribution/AttributionMeasure;",
        "",
        "snapshot",
        "Landroid/graphics/Bitmap;",
        "logo",
        "logoSmall",
        "textView",
        "Landroid/widget/TextView;",
        "textViewShort",
        "margin",
        "",
        "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/widget/TextView;Landroid/widget/TextView;F)V",
        "logoContainerWidth",
        "getLogoContainerWidth",
        "()F",
        "logoSmallContainerWidth",
        "getLogoSmallContainerWidth",
        "maxSize",
        "getMaxSize",
        "maxSizeShort",
        "getMaxSizeShort",
        "shorterText",
        "",
        "textViewContainerWidth",
        "getTextViewContainerWidth",
        "textViewShortContainerWidth",
        "getTextViewShortContainerWidth",
        "getTextView",
        "measure",
        "Lcom/mapbox/maps/attribution/AttributionLayout;",
        "Chain",
        "Command",
        "Companion",
        "FullLogoLongTextCommand",
        "FullLogoShortTextCommand",
        "LongTextCommand",
        "NoTextCommand",
        "ShortTextCommand",
        "SmallLogoLongTextCommand",
        "SmallLogoShortTextCommand",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;


# instance fields
.field private final logo:Landroid/graphics/Bitmap;

.field private final logoSmall:Landroid/graphics/Bitmap;

.field private final margin:F

.field private shorterText:Z

.field private final snapshot:Landroid/graphics/Bitmap;

.field private final textView:Landroid/widget/TextView;

.field private final textViewShort:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/attribution/AttributionMeasure;->Companion:Lcom/mapbox/maps/attribution/AttributionMeasure$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/widget/TextView;Landroid/widget/TextView;F)V
    .locals 1

    const-string v0, "snapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logoSmall"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textView"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textViewShort"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->snapshot:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logo:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logoSmall:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textView:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textViewShort:Landroid/widget/TextView;

    iput p6, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    return-void
.end method

.method public static final synthetic access$getLogo$p(Lcom/mapbox/maps/attribution/AttributionMeasure;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logo:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getLogoContainerWidth(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getLogoContainerWidth()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getLogoSmall$p(Lcom/mapbox/maps/attribution/AttributionMeasure;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logoSmall:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getLogoSmallContainerWidth(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getLogoSmallContainerWidth()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMargin$p(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    iget p0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    return p0
.end method

.method public static final synthetic access$getMaxSize(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getMaxSize()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMaxSizeShort(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getMaxSizeShort()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getSnapshot$p(Lcom/mapbox/maps/attribution/AttributionMeasure;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->snapshot:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getTextView$p(Lcom/mapbox/maps/attribution/AttributionMeasure;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textView:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getTextViewContainerWidth(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getTextViewContainerWidth()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTextViewShortContainerWidth(Lcom/mapbox/maps/attribution/AttributionMeasure;)F
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionMeasure;->getTextViewShortContainerWidth()F

    move-result p0

    return p0
.end method

.method private final getLogoContainerWidth()F
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logo:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    return v1
.end method

.method private final getLogoSmallContainerWidth()F
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->logoSmall:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    return v1
.end method

.method private final getMaxSize()F
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->snapshot:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    div-int/lit8 v0, v0, 0xa

    int-to-float v0, v0

    return v0
.end method

.method private final getMaxSizeShort()F
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->snapshot:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method private final getTextViewContainerWidth()F
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    add-float/2addr v0, v1

    return v0
.end method

.method private final getTextViewShortContainerWidth()F
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textViewShort:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->margin:F

    add-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final getTextView()Landroid/widget/TextView;
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->shorterText:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textViewShort:Landroid/widget/TextView;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->textView:Landroid/widget/TextView;

    return-object v0
.end method

.method public final measure()Lcom/mapbox/maps/attribution/AttributionLayout;
    .locals 10

    new-instance v0, Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;

    new-instance v1, Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoLongTextCommand;

    invoke-direct {v1}, Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoLongTextCommand;-><init>()V

    new-instance v2, Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoShortTextCommand;

    invoke-direct {v2}, Lcom/mapbox/maps/attribution/AttributionMeasure$FullLogoShortTextCommand;-><init>()V

    new-instance v3, Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoLongTextCommand;

    invoke-direct {v3}, Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoLongTextCommand;-><init>()V

    new-instance v4, Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoShortTextCommand;

    invoke-direct {v4}, Lcom/mapbox/maps/attribution/AttributionMeasure$SmallLogoShortTextCommand;-><init>()V

    new-instance v5, Lcom/mapbox/maps/attribution/AttributionMeasure$LongTextCommand;

    invoke-direct {v5}, Lcom/mapbox/maps/attribution/AttributionMeasure$LongTextCommand;-><init>()V

    new-instance v6, Lcom/mapbox/maps/attribution/AttributionMeasure$ShortTextCommand;

    invoke-direct {v6}, Lcom/mapbox/maps/attribution/AttributionMeasure$ShortTextCommand;-><init>()V

    new-instance v7, Lcom/mapbox/maps/attribution/AttributionMeasure$NoTextCommand;

    invoke-direct {v7}, Lcom/mapbox/maps/attribution/AttributionMeasure$NoTextCommand;-><init>()V

    const/4 v8, 0x7

    new-array v8, v8, [Lcom/mapbox/maps/attribution/AttributionMeasure$Command;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v1, 0x1

    aput-object v2, v8, v1

    const/4 v1, 0x2

    aput-object v3, v8, v1

    const/4 v1, 0x3

    aput-object v4, v8, v1

    const/4 v1, 0x4

    aput-object v5, v8, v1

    const/4 v1, 0x5

    aput-object v6, v8, v1

    const/4 v1, 0x6

    aput-object v7, v8, v1

    invoke-direct {v0, p0, v8}, Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;-><init>(Lcom/mapbox/maps/attribution/AttributionMeasure;[Lcom/mapbox/maps/attribution/AttributionMeasure$Command;)V

    invoke-virtual {v0, p0}, Lcom/mapbox/maps/attribution/AttributionMeasure$Chain;->start(Lcom/mapbox/maps/attribution/AttributionMeasure;)Lcom/mapbox/maps/attribution/AttributionLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/attribution/AttributionLayout;->isShortText()Z

    move-result v1

    iput-boolean v1, p0, Lcom/mapbox/maps/attribution/AttributionMeasure;->shorterText:Z

    :cond_0
    return-object v0
.end method
