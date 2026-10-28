.class public final Lcom/whoop/ui/views/RealTimeHeartGraph;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/views/RealTimeHeartGraph$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 M2\u00020\u0001:\u0001\u0010B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0012H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008 \u0010!R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R*\u00100\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u0010\u0011R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010,R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u0010,R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010B\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010<R\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010@R&\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u00060Ej\u0008\u0012\u0004\u0012\u00020\u0006`F8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/ui/views/RealTimeHeartGraph;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "top",
        "bottom",
        "Ll83/a0;",
        "d",
        "(II)V",
        "newHR",
        "a",
        "(I)V",
        "",
        "history",
        "b",
        "(Ljava/util/List;)V",
        "",
        "changed",
        "left",
        "right",
        "onLayout",
        "(ZIIII)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "c",
        "()V",
        "",
        "value",
        "w",
        "F",
        "getGradientScale",
        "()F",
        "setGradientScale",
        "(F)V",
        "gradientScale",
        "x",
        "I",
        "getGradientColor",
        "()I",
        "setGradientColor",
        "gradientColor",
        "Ltr2/n;",
        "y",
        "Ltr2/n;",
        "logger",
        "z",
        "maxHR",
        "E",
        "avgHR",
        "hrTotal",
        "Landroid/graphics/Path;",
        "G",
        "Landroid/graphics/Path;",
        "area",
        "Landroid/graphics/Paint;",
        "H",
        "Landroid/graphics/Paint;",
        "areaPaint",
        "line",
        "J",
        "linePaint",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "K",
        "Ljava/util/ArrayList;",
        "points",
        "L",
        "Z",
        "skippedFirstPoint",
        "M",
        "legacy_release"
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
.field public static final M:Lcom/whoop/ui/views/RealTimeHeartGraph$a;


# instance fields
.field private E:I

.field private F:I

.field private final G:Landroid/graphics/Path;

.field private final H:Landroid/graphics/Paint;

.field private final I:Landroid/graphics/Path;

.field private final J:Landroid/graphics/Paint;

.field private K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private L:Z

.field private w:F

.field private x:I

.field private final y:Ltr2/n;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ui/views/RealTimeHeartGraph$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/views/RealTimeHeartGraph$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/views/RealTimeHeartGraph;->M:Lcom/whoop/ui/views/RealTimeHeartGraph$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ui/views/RealTimeHeartGraph;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    iput v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->w:F

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lvu1/a;->Y:I

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v1

    iput v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->x:I

    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lvu1/j;->V:[I

    const/4 v4, 0x0

    invoke-virtual {v2, p2, v3, p3, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 6
    sget p2, Lvu1/j;->X:I

    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/views/RealTimeHeartGraph;->setGradientScale(F)V

    .line 7
    sget p2, Lvu1/j;->W:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lvu1/a;->Y:I

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {p3, v0, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p3

    invoke-virtual {v1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/whoop/ui/views/RealTimeHeartGraph;->setGradientColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "RealTimeHeartGraph"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->y:Ltr2/n;

    .line 10
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    .line 11
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 12
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    iput-object p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->H:Landroid/graphics/Paint;

    .line 14
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->I:Landroid/graphics/Path;

    .line 15
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 16
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 p3, 0x40800000    # 4.0f

    .line 17
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lvu1/a;->b:I

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    iput-object p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->J:Landroid/graphics/Paint;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    throw p1
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/views/RealTimeHeartGraph;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final d(II)V
    .locals 8

    new-instance v0, Landroid/graphics/LinearGradient;

    sub-int/2addr p2, p1

    int-to-float p1, p2

    iget p2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->w:F

    mul-float v4, p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lvu1/a;->b:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v5

    iget v6, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->x:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iget-object p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->L:Z

    if-nez v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->L:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    iget-object v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/2addr v0, v1

    iput v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->E:I

    iget v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->z:I

    if-ge v0, p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    iput p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->z:I

    invoke-virtual {p0}, Lcom/whoop/ui/views/RealTimeHeartGraph;->c()V

    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "history"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    iget v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->z:I

    if-ge v1, v0, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_1
    iput v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->z:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    iget p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->F:I

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->E:I

    :cond_2
    return-void
.end method

.method public final c()V
    .locals 9

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iget v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->E:I

    int-to-float v3, v3

    const v4, 0x3fcccccd    # 1.6f

    mul-float/2addr v3, v4

    iget v5, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->z:I

    int-to-float v5, v5

    mul-float/2addr v5, v4

    cmpg-float v4, v3, v5

    if-gez v4, :cond_1

    move v3, v5

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v5, v3, v2

    if-gez v5, :cond_2

    move v3, v2

    :cond_2
    div-float/2addr v4, v3

    iget-object v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    if-gt v3, v5, :cond_3

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    :goto_0
    iget-object v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->I:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->I:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    mul-float/2addr v6, v4

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-virtual {v3, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    move v3, v6

    :goto_1
    iget-object v5, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    int-to-float v5, v5

    cmpg-float v5, v3, v5

    if-gez v5, :cond_4

    iget-object v5, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->K:Ljava/util/ArrayList;

    float-to-int v7, v3

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v7, "get(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    mul-float v7, v3, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v8

    sub-int/2addr v8, v1

    int-to-float v8, v8

    int-to-float v5, v5

    mul-float/2addr v5, v4

    sub-float/2addr v8, v5

    int-to-float v5, v1

    add-float/2addr v8, v5

    iget-object v5, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->I:Landroid/graphics/Path;

    invoke-virtual {v5, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v5, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    invoke-virtual {v5, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v3, v2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v6, v1}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getGradientColor()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->x:I

    return v0
.end method

.method public final getGradientScale()F
    .locals 1

    iget v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->w:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->G:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->I:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->J:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-direct {p0, p3, p5}, Lcom/whoop/ui/views/RealTimeHeartGraph;->d(II)V

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Lcom/whoop/ui/views/RealTimeHeartGraph;->c()V

    return-void
.end method

.method public final setGradientColor(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->x:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setGradientScale(F)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/views/RealTimeHeartGraph;->w:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
