.class public abstract Lub1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lub1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/emoji/EmojiSize;",
        "Ly3/f;",
        "f",
        "(Lcom/whoop/design/models/items/emoji/EmojiSize;)F",
        "g",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "emojiMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu71/c;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lub1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lub1/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/emoji/EmojiModel;)Luy0/b;
    .locals 0

    invoke-static {p0}, Lub1/a;->d(Lcom/whoop/design/models/items/emoji/EmojiModel;)Luy0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu71/c;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/emoji/EmojiModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lub1/a$b;

    invoke-direct {v2, v0}, Lub1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/emoji/EmojiModel;)Luy0/b;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/emoji/EmojiModel;->getSize()Lcom/whoop/design/models/items/emoji/EmojiSize;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/design/models/items/emoji/EmojiSize;->MEDIUM:Lcom/whoop/design/models/items/emoji/EmojiSize;

    :cond_0
    new-instance v1, Luy0/b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/emoji/EmojiModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/emoji/EmojiModel;->getGlyph()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lub1/a;->f(Lcom/whoop/design/models/items/emoji/EmojiSize;)F

    move-result v4

    invoke-static {v0}, Lub1/a;->g(Lcom/whoop/design/models/items/emoji/EmojiSize;)F

    move-result v5

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Luy0/b;-><init>(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lub1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/emoji/EmojiSize;)F
    .locals 3

    sget-object v0, Lub1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    if-eq p0, v2, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const/16 p0, 0x8

    int-to-float p0, p0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/4 p0, 0x6

    int-to-float p0, p0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_2
    int-to-float p0, v2

    mul-float/2addr p0, p0

    return p0

    :cond_3
    int-to-float p0, v0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_4
    int-to-float p0, v1

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0
.end method

.method private static final g(Lcom/whoop/design/models/items/emoji/EmojiSize;)F
    .locals 1

    sget-object v0, Lub1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const/high16 p0, 0x41ca0000    # 25.25f

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/high16 p0, 0x41a20000    # 20.25f

    return p0

    :cond_2
    const/high16 p0, 0x41500000    # 13.0f

    return p0

    :cond_3
    const/high16 p0, 0x41180000    # 9.5f

    return p0

    :cond_4
    const/high16 p0, 0x40d00000    # 6.5f

    return p0
.end method
