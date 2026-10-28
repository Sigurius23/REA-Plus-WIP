.class public final enum Lq81/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq81/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B3\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0011R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lq81/i;",
        "",
        "Ly81/e;",
        "primaryColor",
        "",
        "borderOpacity",
        "borderShadowOpacity",
        "",
        "Li2/x;",
        "borderColors",
        "<init>",
        "(Ljava/lang/String;ILy81/e;FFLjava/util/List;)V",
        "Ly81/e;",
        "getPrimaryColor",
        "()Ly81/e;",
        "F",
        "getBorderOpacity",
        "()F",
        "getBorderShadowOpacity",
        "Ljava/util/List;",
        "getBorderColors",
        "()Ljava/util/List;",
        "ACTIVE",
        "REST",
        "WARMUP",
        "COOLDOWN",
        "TARGET_TIME_ELAPSED",
        "design_release"
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

.field private static final synthetic $VALUES:[Lq81/i;

.field public static final enum ACTIVE:Lq81/i;

.field public static final enum COOLDOWN:Lq81/i;

.field public static final enum REST:Lq81/i;

.field public static final enum TARGET_TIME_ELAPSED:Lq81/i;

.field public static final enum WARMUP:Lq81/i;


# instance fields
.field private final borderColors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final borderOpacity:F

.field private final borderShadowOpacity:F

.field private final primaryColor:Ly81/e;


# direct methods
.method private static final synthetic $values()[Lq81/i;
    .locals 5

    sget-object v0, Lq81/i;->ACTIVE:Lq81/i;

    sget-object v1, Lq81/i;->REST:Lq81/i;

    sget-object v2, Lq81/i;->WARMUP:Lq81/i;

    sget-object v3, Lq81/i;->COOLDOWN:Lq81/i;

    sget-object v4, Lq81/i;->TARGET_TIME_ELAPSED:Lq81/i;

    filled-new-array {v0, v1, v2, v3, v4}, [Lq81/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Lq81/i;

    sget-object v3, Ly81/f;->ACCENT_ACTION:Ly81/f;

    const-wide v1, 0xff0093e7L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff00f19fL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff11376eL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v6}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v8}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lq81/i;->ACTIVE:Lq81/i;

    new-instance v1, Lq81/i;

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    const-wide v2, 0xffffffffL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0x80ffffffL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    const v2, 0x33ffffff

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v6, Li2/x;

    invoke-direct {v6, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, v5, v6}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v2, "REST"

    const/4 v3, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lq81/i;->REST:Lq81/i;

    new-instance v2, Lq81/i;

    sget-object v0, Lq81/i$a;->w:Lq81/i$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const-wide v0, 0xfff1678cL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xfffcac5dL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v6

    new-instance v4, Li2/x;

    invoke-direct {v4, v6, v7}, Li2/x;-><init>(J)V

    const-wide v11, 0xffff6422L

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v8}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-string v3, "WARMUP"

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lq81/i;->WARMUP:Lq81/i;

    new-instance v13, Lq81/i;

    sget-object v2, Lq81/i$b;->w:Lq81/i$b;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    const-wide v2, 0xff67aee6L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffadc2cdL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xff479ac2L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v6, Li2/x;

    invoke-direct {v6, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v6}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x6

    const/16 v21, 0x0

    const-string v14, "COOLDOWN"

    const/4 v15, 0x3

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v21}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lq81/i;->COOLDOWN:Lq81/i;

    new-instance v2, Lq81/i;

    sget-object v3, Lq81/i$c;->w:Lq81/i$c;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xffffa722L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v6, Li2/x;

    invoke-direct {v6, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v6}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v3, "TARGET_TIME_ELAPSED"

    const/4 v4, 0x4

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v10}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lq81/i;->TARGET_TIME_ELAPSED:Lq81/i;

    invoke-static {}, Lq81/i;->$values()[Lq81/i;

    move-result-object v0

    sput-object v0, Lq81/i;->$VALUES:[Lq81/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lq81/i;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/e;",
            "FF",
            "Ljava/util/List<",
            "Li2/x;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lq81/i;->primaryColor:Ly81/e;

    .line 3
    iput p4, p0, Lq81/i;->borderOpacity:F

    .line 4
    iput p5, p0, Lq81/i;->borderShadowOpacity:F

    .line 5
    iput-object p6, p0, Lq81/i;->borderColors:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x4

    if-eqz p4, :cond_1

    const p5, 0x3e4ccccd    # 0.2f

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p5

    move-object v6, p6

    .line 6
    invoke-direct/range {v0 .. v6}, Lq81/i;-><init>(Ljava/lang/String;ILy81/e;FFLjava/util/List;)V

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

    sget-object v0, Lq81/i;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq81/i;
    .locals 1

    const-class v0, Lq81/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq81/i;

    return-object p0
.end method

.method public static values()[Lq81/i;
    .locals 1

    sget-object v0, Lq81/i;->$VALUES:[Lq81/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq81/i;

    return-object v0
.end method


# virtual methods
.method public final getBorderColors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq81/i;->borderColors:Ljava/util/List;

    return-object v0
.end method

.method public final getBorderOpacity()F
    .locals 1

    iget v0, p0, Lq81/i;->borderOpacity:F

    return v0
.end method

.method public final getBorderShadowOpacity()F
    .locals 1

    iget v0, p0, Lq81/i;->borderShadowOpacity:F

    return v0
.end method

.method public final getPrimaryColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Lq81/i;->primaryColor:Ly81/e;

    return-object v0
.end method
