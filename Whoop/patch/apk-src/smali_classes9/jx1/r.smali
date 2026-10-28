.class public final enum Ljx1/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljx1/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B/\u0008\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ljx1/r;",
        "",
        "Li91/a;",
        "background",
        "",
        "Ljx1/b;",
        "backgroundColors",
        "",
        "alpha",
        "<init>",
        "(Ljava/lang/String;ILi91/a;Ljava/util/List;F)V",
        "Li91/a;",
        "getBackground",
        "()Li91/a;",
        "Ljava/util/List;",
        "getBackgroundColors",
        "()Ljava/util/List;",
        "F",
        "getAlpha",
        "()F",
        "ONE",
        "PEAK",
        "LIFE",
        "PLAIN",
        "membership_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ljx1/r;

.field public static final enum LIFE:Ljx1/r;

.field public static final enum ONE:Ljx1/r;

.field public static final enum PEAK:Ljx1/r;

.field public static final enum PLAIN:Ljx1/r;


# instance fields
.field private final alpha:F

.field private final background:Li91/a;

.field private final backgroundColors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljx1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Ljx1/r;
    .locals 4

    sget-object v0, Ljx1/r;->ONE:Ljx1/r;

    sget-object v1, Ljx1/r;->PEAK:Ljx1/r;

    sget-object v2, Ljx1/r;->LIFE:Ljx1/r;

    sget-object v3, Ljx1/r;->PLAIN:Ljx1/r;

    filled-new-array {v0, v1, v2, v3}, [Ljx1/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ljx1/r;

    new-instance v1, Ljx1/b;

    const-wide v2, 0xffffffffL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v1, v8, v2, v3, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ljx1/b;

    const-wide v3, 0x80ffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    const v10, 0x3f4ccccd    # 0.8f

    invoke-direct {v2, v10, v3, v4, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ljx1/b;

    const v4, 0xffffff

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v3, v11, v4, v5, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3}, [Ljx1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v1, "ONE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v5, 0x3e4ccccd    # 0.2f

    invoke-direct/range {v0 .. v7}, Ljx1/r;-><init>(Ljava/lang/String;ILi91/a;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljx1/r;->ONE:Ljx1/r;

    new-instance v12, Ljx1/r;

    new-instance v0, Ljx1/b;

    const-wide v1, 0xffadc2cdL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    invoke-direct {v0, v8, v1, v2, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ljx1/b;

    const-wide v2, 0x80479ac2L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-direct {v1, v10, v2, v3, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ljx1/b;

    const v3, 0x479ac2

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    invoke-direct {v2, v11, v3, v4, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2}, [Ljx1/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v18, 0x1

    const/16 v19, 0x0

    const-string v13, "PEAK"

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/high16 v17, 0x3f000000    # 0.5f

    invoke-direct/range {v12 .. v19}, Ljx1/r;-><init>(Ljava/lang/String;ILi91/a;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Ljx1/r;->PEAK:Ljx1/r;

    new-instance v0, Ljx1/r;

    new-instance v1, Ljx1/b;

    const-wide v2, 0xffbac2adL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-direct {v1, v8, v2, v3, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ljx1/b;

    const-wide v3, 0x80c5dfd9L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    const v5, 0x3ecccccd    # 0.4f

    invoke-direct {v2, v5, v3, v4, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ljx1/b;

    const-wide v4, 0x80bdb0beL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    invoke-direct {v3, v10, v4, v5, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ljx1/b;

    const v5, 0xbdb0be

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-direct {v4, v11, v5, v6, v9}, Ljx1/b;-><init>(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4}, [Ljx1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x1

    const-string v1, "LIFE"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v7}, Ljx1/r;-><init>(Ljava/lang/String;ILi91/a;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljx1/r;->LIFE:Ljx1/r;

    new-instance v1, Ljx1/r;

    sget-object v0, Ljx1/r$a;->w:Ljx1/r$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v2, "PLAIN"

    const/4 v3, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljx1/r;-><init>(Ljava/lang/String;ILi91/a;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ljx1/r;->PLAIN:Ljx1/r;

    invoke-static {}, Ljx1/r;->$values()[Ljx1/r;

    move-result-object v0

    sput-object v0, Ljx1/r;->$VALUES:[Ljx1/r;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljx1/r;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILi91/a;Ljava/util/List;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li91/a;",
            "Ljava/util/List<",
            "Ljx1/b;",
            ">;F)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljx1/r;->background:Li91/a;

    iput-object p4, p0, Ljx1/r;->backgroundColors:Ljava/util/List;

    iput p5, p0, Ljx1/r;->alpha:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILi91/a;Ljava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x2

    if-eqz p3, :cond_1

    .line 2
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x4

    if-eqz p3, :cond_2

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ljx1/r;-><init>(Ljava/lang/String;ILi91/a;Ljava/util/List;F)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ljx1/r;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljx1/r;
    .locals 1

    const-class v0, Ljx1/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljx1/r;

    return-object p0
.end method

.method public static values()[Ljx1/r;
    .locals 1

    sget-object v0, Ljx1/r;->$VALUES:[Ljx1/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljx1/r;

    return-object v0
.end method


# virtual methods
.method public final getAlpha()F
    .locals 1

    iget v0, p0, Ljx1/r;->alpha:F

    return v0
.end method

.method public final getBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Ljx1/r;->background:Li91/a;

    return-object v0
.end method

.method public final getBackgroundColors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljx1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljx1/r;->backgroundColors:Ljava/util/List;

    return-object v0
.end method
