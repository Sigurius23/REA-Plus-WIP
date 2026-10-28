.class public final Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0001 B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008-\u0010!R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00104\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0016\u0010:\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00107R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010=R\u0014\u0010A\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010=R\u0014\u0010C\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010=R\u0014\u0010E\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010=R\u0014\u0010G\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010=R\u0014\u0010I\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010=R\u0014\u0010K\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010=R\u0014\u0010M\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010=R\u0014\u0010O\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010=R\u0014\u0010Q\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010=R\u0014\u0010S\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010=R\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010Y\u001a\u00020\u00078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008X\u0010DR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R*\u0010i\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008c\u0010d\u001a\u0004\u0008e\u0010f\"\u0004\u0008g\u0010hR*\u0010m\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008j\u0010d\u001a\u0004\u0008k\u0010f\"\u0004\u0008l\u0010hR.\u0010t\u001a\u0004\u0018\u00010(2\u0008\u0010b\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010q\"\u0004\u0008r\u0010sR*\u0010x\u001a\u00020&2\u0006\u0010b\u001a\u00020&8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008u\u0010d\u001a\u0004\u0008v\u0010f\"\u0004\u0008w\u0010hR/\u0010\u0080\u0001\u001a\u0004\u0018\u00010y2\u0008\u0010b\u001a\u0004\u0018\u00010y8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}\"\u0004\u0008~\u0010\u007fR7\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010b\u001a\u0005\u0018\u00010\u0081\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0006\u0008\u0086\u0001\u0010\u0087\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u00a8\u0006\u0090\u0001"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;",
        "Landroid/view/View;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "Ll83/a0;",
        "onLayout",
        "(ZIIII)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "d",
        "g",
        "e",
        "b",
        "f",
        "error",
        "c",
        "(Landroid/graphics/Canvas;I)V",
        "a",
        "()V",
        "recovery",
        "Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "h",
        "(I)Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "",
        "strain",
        "",
        "k",
        "(D)F",
        "j",
        "(I)F",
        "i",
        "Landroid/content/res/TypedArray;",
        "w",
        "Landroid/content/res/TypedArray;",
        "attributes",
        "x",
        "F",
        "barWidth",
        "Landroid/graphics/Typeface;",
        "y",
        "Landroid/graphics/Typeface;",
        "fontNumbers",
        "z",
        "fontLabels",
        "Landroid/graphics/Paint;",
        "E",
        "Landroid/graphics/Paint;",
        "gridPaint",
        "strainNumberPaint",
        "G",
        "recoveryLabelPaint",
        "H",
        "estimatedLabelPaint",
        "I",
        "optimalLabelPaint",
        "J",
        "optimalAreaPaint",
        "K",
        "estimatedPaint",
        "L",
        "dayPaint",
        "M",
        "barTopPaint",
        "N",
        "dashLevelPaint",
        "O",
        "setGoalTitlePaint",
        "P",
        "setGoalTextPaint",
        "Landroid/widget/ImageView;",
        "Q",
        "Landroid/widget/ImageView;",
        "setGoalIcon",
        "R",
        "setGoalIconSize",
        "Landroid/graphics/RectF;",
        "S",
        "Landroid/graphics/RectF;",
        "graphRect",
        "Landroid/graphics/Path;",
        "T",
        "Landroid/graphics/Path;",
        "optimalArea",
        "value",
        "U",
        "D",
        "getDayStrain",
        "()D",
        "setDayStrain",
        "(D)V",
        "dayStrain",
        "V",
        "getActivityStrain",
        "setActivityStrain",
        "activityStrain",
        "W",
        "Ljava/lang/Float;",
        "getRecoveryPct",
        "()Ljava/lang/Float;",
        "setRecoveryPct",
        "(Ljava/lang/Float;)V",
        "recoveryPct",
        "a0",
        "getEstimatedDayStrain",
        "setEstimatedDayStrain",
        "estimatedDayStrain",
        "Lp92/j;",
        "b0",
        "Lp92/j;",
        "getStrainRecoveryMapper",
        "()Lp92/j;",
        "setStrainRecoveryMapper",
        "(Lp92/j;)V",
        "strainRecoveryMapper",
        "Lo52/v0;",
        "c0",
        "Lo52/v0;",
        "getStrainCoachStates",
        "()Lo52/v0;",
        "setStrainCoachStates",
        "(Lo52/v0;)V",
        "strainCoachStates",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "d0",
        "Ll83/h;",
        "getFeatureFlagRepository",
        "()Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "e0",
        "realtime-activity_release"
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
.field public static final e0:Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$a;

.field public static final f0:I


# instance fields
.field private final E:Landroid/graphics/Paint;

.field private final F:Landroid/graphics/Paint;

.field private final G:Landroid/graphics/Paint;

.field private final H:Landroid/graphics/Paint;

.field private final I:Landroid/graphics/Paint;

.field private final J:Landroid/graphics/Paint;

.field private final K:Landroid/graphics/Paint;

.field private final L:Landroid/graphics/Paint;

.field private final M:Landroid/graphics/Paint;

.field private final N:Landroid/graphics/Paint;

.field private final O:Landroid/graphics/Paint;

.field private final P:Landroid/graphics/Paint;

.field private final Q:Landroid/widget/ImageView;

.field private final R:I

.field private final S:Landroid/graphics/RectF;

.field private final T:Landroid/graphics/Path;

.field private U:D

.field private V:D

.field private W:Ljava/lang/Float;

.field private a0:D

.field private b0:Lp92/j;

.field private c0:Lo52/v0;

.field private final d0:Ll83/h;

.field private final w:Landroid/content/res/TypedArray;

.field private final x:F

.field private final y:Landroid/graphics/Typeface;

.field private final z:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->e0:Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->f0:I

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

    invoke-direct/range {v1 .. v6}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget-object p3, Lk52/h;->q:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string p3, "obtainStyledAttributes(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->w:Landroid/content/res/TypedArray;

    .line 4
    sget p3, Lk52/h;->r:I

    const/high16 v0, 0x42200000    # 40.0f

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    .line 5
    sget p3, Lgy0/b;->d:I

    invoke-static {p1, p3}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p3

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->y:Landroid/graphics/Typeface;

    .line 6
    sget v1, Lgy0/b;->a:I

    invoke-static {p1, v1}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->z:Landroid/graphics/Typeface;

    .line 7
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 8
    sget v3, Lk52/h;->t:I

    sget v4, Lk52/b;->l:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    sget v3, Lk52/h;->u:I

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 10
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->E:Landroid/graphics/Paint;

    .line 11
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 12
    sget v3, Lk52/h;->w:I

    sget v4, Lvu1/a;->b:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v3, 0x42100000    # 36.0f

    .line 14
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->F:Landroid/graphics/Paint;

    .line 16
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 17
    sget v4, Lvu1/a;->a:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 19
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 20
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->G:Landroid/graphics/Paint;

    .line 21
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 22
    sget v3, Lvu1/a;->a:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v3, 0x42400000    # 48.0f

    .line 24
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 25
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->H:Landroid/graphics/Paint;

    .line 26
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 27
    sget v3, Lvu1/a;->m:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 29
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 30
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->I:Landroid/graphics/Paint;

    .line 31
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 32
    sget v3, Lk52/h;->v:I

    sget v4, Lvu1/a;->l:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 34
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->J:Landroid/graphics/Paint;

    .line 35
    new-instance v2, Landroid/graphics/Paint;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 36
    new-instance v5, Landroid/graphics/BitmapShader;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lk52/c;->a:I

    invoke-static {v6, v7}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v6

    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v5, v6, v7, v7}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/16 v5, 0x48

    .line 37
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 38
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->K:Landroid/graphics/Paint;

    .line 39
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 40
    sget v5, Lk52/h;->s:I

    sget v6, Lvu1/a;->b:I

    invoke-virtual {p1, v6}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    iput-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->L:Landroid/graphics/Paint;

    .line 43
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 44
    sget v2, Lvu1/a;->a:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 45
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 46
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->M:Landroid/graphics/Paint;

    .line 47
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    const/4 v2, 0x1

    .line 48
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 49
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 50
    sget v3, Lvu1/a;->i:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v3, 0x40800000    # 4.0f

    .line 51
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 52
    new-instance v3, Landroid/graphics/DashPathEffect;

    new-array v4, v4, [F

    fill-array-data v4, :array_0

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 53
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->N:Landroid/graphics/Paint;

    .line 54
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 55
    sget v3, Lvu1/a;->a:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 57
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 58
    iput-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->O:Landroid/graphics/Paint;

    .line 59
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 60
    sget v1, Lvu1/a;->k:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 p3, 0x42000000    # 32.0f

    .line 62
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 63
    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->P:Landroid/graphics/Paint;

    .line 64
    new-instance p3, Landroid/widget/ImageView;

    invoke-direct {p3, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->Q:Landroid/widget/ImageView;

    const/16 v0, 0x46

    .line 65
    iput v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->R:I

    .line 66
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    .line 67
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    .line 68
    sget-object v1, Ll83/i;->w:Ll83/i;

    .line 69
    new-instance v3, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$b;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v4}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    .line 70
    iput-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->d0:Ll83/h;

    .line 71
    invoke-virtual {p0, v2, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 72
    sget v1, Lk52/c;->f:I

    invoke-static {p1, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 73
    invoke-virtual {p3, p1, p1, v0, v0}, Landroid/view/View;->layout(IIII)V

    const p1, 0x3d4ccccd    # 0.05f

    .line 74
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    return-void

    :array_0
    .array-data 4
        0x41400000    # 12.0f
        0x41400000    # 12.0f
    .end array-data
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

    .line 75
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final a()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->j(I)F

    move-result v2

    invoke-direct {p0, v1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->h(I)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getUpperRecStrain()D

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->k(D)F

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x65

    if-ge v0, v1, :cond_0

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->h(I)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->j(I)F

    move-result v3

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getUpperRecStrain()D

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->k(D)F

    move-result v1

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x64

    :goto_1
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->h(I)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->j(I)F

    move-result v3

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/domain/model/StrainRecoveryMapping;->getLowerRecStrain()D

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->k(D)F

    move-result v1

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private final b(Landroid/graphics/Canvas;)V
    .locals 13

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->W:Ljava/lang/Float;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    mul-float/2addr v0, v2

    iget v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v2, v4

    sub-float/2addr v0, v2

    cmpg-float v2, v0, v3

    if-gez v2, :cond_1

    move v0, v3

    :cond_1
    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v5, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    sub-float/2addr v2, v5

    cmpl-float v5, v0, v2

    if-lez v5, :cond_2

    move v0, v2

    :cond_2
    add-float v6, v1, v0

    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->U:D

    const-wide/high16 v7, 0x4035000000000000L    # 21.0

    div-double/2addr v0, v7

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    float-to-double v9, v2

    mul-double/2addr v0, v9

    iget-wide v9, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->a0:D

    div-double/2addr v9, v7

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    float-to-double v7, v2

    mul-double v11, v9, v7

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    float-to-double v7, v9

    sub-double/2addr v7, v11

    double-to-float v7, v7

    iget v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    add-float v8, v6, v2

    iget-object v10, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->K:Landroid/graphics/Paint;

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v9, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v7, v9

    sub-double/2addr v7, v0

    double-to-float v7, v7

    iget p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    add-float v8, v6, p1

    iget-object v10, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->L:Landroid/graphics/Paint;

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    move v8, v6

    iget v6, p1, Landroid/graphics/RectF;->left:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v0, p1

    sub-double/2addr v0, v11

    double-to-float v7, v0

    float-to-double v0, p1

    sub-double/2addr v0, v11

    double-to-float v9, v0

    iget-object v10, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->N:Landroid/graphics/Paint;

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v6, v8

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v0, p1

    const/high16 v2, 0x40a00000    # 5.0f

    float-to-double v7, v2

    add-double v9, v11, v7

    sub-double/2addr v0, v9

    double-to-float v0, v0

    iget v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    add-float/2addr v1, v6

    float-to-double v9, p1

    sub-double v7, v11, v7

    sub-double/2addr v9, v7

    double-to-float v9, v9

    iget-object v10, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->M:Landroid/graphics/Paint;

    move v7, v0

    move v8, v1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->W:Ljava/lang/Float;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :cond_3
    const/high16 p1, 0x42c80000    # 100.0f

    mul-float/2addr v3, p1

    float-to-int p1, v3

    const-string v0, "%"

    invoke-static {p1, v0}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    div-float/2addr v0, v4

    add-float/2addr v0, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->G:Landroid/graphics/Paint;

    invoke-static {v5, p1, v0, v1, v2}, Lq52/c;->a(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->a0:D

    invoke-static {v0, v1}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->x:F

    div-float/2addr v0, v4

    add-float/2addr v0, v6

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v1, v1

    const/high16 v3, 0x41900000    # 18.0f

    float-to-double v3, v3

    add-double/2addr v11, v3

    sub-double/2addr v1, v11

    double-to-float v1, v1

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->H:Landroid/graphics/Paint;

    invoke-static {v5, p1, v0, v1, v2}, Lq52/c;->a(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final c(Landroid/graphics/Canvas;I)V
    .locals 10

    const-string v2, "Unknown error state"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq p2, v5, :cond_2

    if-eq p2, v4, :cond_1

    if-ne p2, v3, :cond_0

    sget v6, Lk52/f;->y1:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget v6, Lk52/f;->R0:I

    goto :goto_0

    :cond_2
    sget v6, Lk52/f;->U0:I

    :goto_0
    if-eq p2, v5, :cond_5

    if-eq p2, v4, :cond_4

    if-ne p2, v3, :cond_3

    sget v7, Lk52/f;->x1:I

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    sget v7, Lk52/f;->P0:I

    goto :goto_1

    :cond_5
    sget v7, Lk52/f;->S0:I

    :goto_1
    if-eq p2, v5, :cond_8

    if-eq p2, v4, :cond_7

    if-ne p2, v3, :cond_6

    sget v1, Lk52/f;->Q0:I

    :goto_2
    move v8, v1

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    sget v1, Lk52/f;->Q0:I

    goto :goto_2

    :cond_8
    sget v1, Lk52/f;->T0:I

    goto :goto_2

    :goto_3
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/4 v2, 0x7

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v5, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v5, v3

    int-to-float v9, v4

    div-float/2addr v5, v9

    add-float/2addr v5, v3

    iget v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->R:I

    div-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v5, v3

    iget v2, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v1

    invoke-virtual {p1, v5, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->Q:Landroid/widget/ImageView;

    invoke-virtual {v2, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    iget v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->R:I

    add-int/lit8 v2, v2, 0x28

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v6, "getString(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v9

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v1

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->O:Landroid/graphics/Paint;

    invoke-static {p1, v2, v3, v4, v5}, Lq52/c;->a(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->O:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    float-to-int v2, v2

    add-int/lit8 v2, v2, 0xa

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v9

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->top:F

    add-float/2addr v5, v1

    move-object v1, v4

    iget-object v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->P:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    move v0, v5

    move v5, v1

    move-object v1, v2

    move v2, v3

    move v3, v0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lq52/c;->b(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;F)F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr v0, v9

    add-float/2addr v2, v0

    iget-object v4, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->P:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v5

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lq52/c;->b(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;F)F

    return-void
.end method

.method private final d(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/4 v2, 0x6

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    const/16 v3, 0x15

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x16

    if-ge v4, v5, :cond_0

    iget-object v5, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v7, v5, Landroid/graphics/RectF;->left:F

    iget v6, v5, Landroid/graphics/RectF;->top:F

    int-to-float v8, v4

    mul-float/2addr v8, v2

    move v9, v8

    add-float v8, v6, v9

    iget v5, v5, Landroid/graphics/RectF;->right:F

    add-float v10, v6, v9

    iget-object v11, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->E:Landroid/graphics/Paint;

    move-object/from16 v6, p1

    move v9, v5

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    const/4 v4, 0x7

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->left:F

    int-to-float v6, v3

    mul-float/2addr v6, v1

    add-float v13, v5, v6

    iget v14, v4, Landroid/graphics/RectF;->top:F

    add-float v15, v5, v6

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v5, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->E:Landroid/graphics/Paint;

    move-object/from16 v12, p1

    move/from16 v16, v4

    move-object/from16 v17, v5

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-wide/high16 v3, 0x4018000000000000L    # 6.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    const-wide/high16 v3, 0x402c000000000000L    # 14.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    const-wide/high16 v3, 0x4032000000000000L    # 18.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const-wide/high16 v3, 0x4035000000000000L    # 21.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    filled-new-array/range {v5 .. v10}, [Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->top:F

    float-to-double v8, v8

    sub-double v5, v3, v5

    float-to-double v10, v2

    mul-double/2addr v5, v10

    add-double/2addr v5, v8

    double-to-float v5, v5

    const/high16 v6, 0x41200000    # 10.0f

    add-float/2addr v5, v6

    iget-object v6, v0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->F:Landroid/graphics/Paint;

    const/4 v8, 0x0

    move-object/from16 v12, p1

    invoke-virtual {v12, v7, v8, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method private final e(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->T:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->J:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method private final f(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lk52/f;->o0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v2, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v3, v4

    add-float/2addr v3, v5

    const/high16 v5, 0x41c80000    # 25.0f

    sub-float/2addr v3, v5

    iget-object v6, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->I:Landroid/graphics/Paint;

    invoke-static {p1, v0, v2, v3, v6}, Lq52/c;->a(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lk52/f;->p0:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v4

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v4

    add-float/2addr v2, v3

    add-float/2addr v2, v5

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->I:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1, v2, v3}, Lq52/c;->a(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final g(Landroid/graphics/Canvas;)V
    .locals 9

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v1, 0x3

    int-to-float v1, v1

    div-float/2addr v0, v1

    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lvu1/a;->s:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    add-float v5, v3, v0

    move v6, v4

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v3, Lvu1/a;->d0:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    move v4, v3

    add-float v3, v4, v0

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    const/4 v5, 0x2

    int-to-float v5, v5

    mul-float v8, v0, v5

    add-float v5, v4, v8

    move v6, p1

    move v4, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v3, Lvu1/a;->p:I

    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v8, v3

    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, v1

    add-float v5, v0, v3

    move v6, v4

    move v3, v8

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final getFeatureFlagRepository()Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->d0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object v0
.end method

.method private final h(I)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b0:Lp92/j;

    if-eqz v0, :cond_0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move v1, p1

    invoke-static/range {v0 .. v5}, Lp92/j;->b(Lp92/j;IDILjava/lang/Object;)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final i()V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final j(I)F
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    int-to-float p1, p1

    iget v0, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    const/16 v2, 0x64

    int-to-float v2, v2

    div-float/2addr v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    return v0
.end method

.method private final k(D)F
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v2, v1

    const-wide/high16 v4, 0x4035000000000000L    # 21.0

    div-double/2addr p1, v4

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v0

    float-to-double v0, v1

    mul-double/2addr p1, v0

    sub-double/2addr v2, p1

    double-to-float p1, v2

    return p1
.end method


# virtual methods
.method public final getActivityStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->V:D

    return-wide v0
.end method

.method public final getDayStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->U:D

    return-wide v0
.end method

.method public final getEstimatedDayStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->a0:D

    return-wide v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public final getRecoveryPct()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->W:Ljava/lang/Float;

    return-object v0
.end method

.method public final getStrainCoachStates()Lo52/v0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->c0:Lo52/v0;

    return-object v0
.end method

.method public final getStrainRecoveryMapper()Lp92/j;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b0:Lp92/j;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->d(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->c0:Lo52/v0;

    sget-object v1, Lo52/v0;->RECOVERY_AND_STRAIN_PENDING:Lo52/v0;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->W:Ljava/lang/Float;

    if-eqz v1, :cond_3

    sget-object v1, Lo52/v0;->NO_RECOVERY_AND_STRAIN_PENDING:Lo52/v0;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->V:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->e(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->f(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->c(Landroid/graphics/Canvas;I)V

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->c(Landroid/graphics/Canvas;I)V

    :goto_1
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->g(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    const/high16 p3, 0x42b40000    # 90.0f

    iput p3, p2, Landroid/graphics/RectF;->left:F

    const/high16 p3, 0x42400000    # 48.0f

    iput p3, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    const/high16 p5, 0x42100000    # 36.0f

    sub-float/2addr p4, p5

    iput p4, p2, Landroid/graphics/RectF;->right:F

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->S:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p4

    int-to-float p4, p4

    sub-float/2addr p4, p3

    iput p4, p2, Landroid/graphics/RectF;->bottom:F

    iget-object p2, p1, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b0:Lp92/j;

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->a()V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    return-void
.end method

.method public final setActivityStrain(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->V:D

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    return-void
.end method

.method public final setDayStrain(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->U:D

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    return-void
.end method

.method public final setEstimatedDayStrain(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->a0:D

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    return-void
.end method

.method public final setRecoveryPct(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->W:Ljava/lang/Float;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    return-void
.end method

.method public final setStrainCoachStates(Lo52/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->c0:Lo52/v0;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setStrainRecoveryMapper(Lp92/j;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->b0:Lp92/j;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/StrainCoachStrainGraph;->i()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
