.class public abstract Llb1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/BinaryFeedbackModel;",
        "Lsz0/g;",
        "g",
        "(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;",
        "Lcom/whoop/design/models/BinaryIconModel;",
        "Lsz0/h;",
        "f",
        "(Lcom/whoop/design/models/BinaryIconModel;)Lsz0/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "binaryFeedbackMapper",
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

    new-instance v0, Llb1/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/r;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;
    .locals 0

    invoke-static {p0}, Llb1/r;->d(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/r;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/BinaryFeedbackModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/r$a;

    invoke-direct {v2, v0}, Llb1/r$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/r;->g(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/r;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/BinaryIconModel;)Lsz0/h;
    .locals 6

    new-instance v0, Lsz0/h;

    invoke-virtual {p0}, Lcom/whoop/design/models/BinaryIconModel;->getSelectedIcon()Lcom/whoop/design/models/IconModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/IconModel;->getIcon()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/BinaryIconModel;->getSelectedIcon()Lcom/whoop/design/models/IconModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/IconModel;->getContentDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/BinaryIconModel;->getUnselectedIcon()Lcom/whoop/design/models/IconModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/IconModel;->getIcon()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/BinaryIconModel;->getUnselectedIcon()Lcom/whoop/design/models/IconModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/IconModel;->getContentDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/BinaryIconModel;->getUnselectedIcon()Lcom/whoop/design/models/IconModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/IconModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lsz0/h;-><init>(ILjava/lang/String;ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/BinaryFeedbackModel;)Lsz0/g;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BinaryFeedbackModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BinaryFeedbackModel;->getSelection()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lsz0/f;->NONE:Lsz0/f;

    invoke-static {}, Lsz0/f;->values()[Lsz0/f;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v6

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/BinaryFeedbackModel;->getBinaryIconPositive()Lcom/whoop/design/models/BinaryIconModel;

    move-result-object v1

    invoke-static {v1}, Llb1/r;->f(Lcom/whoop/design/models/BinaryIconModel;)Lsz0/h;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/BinaryFeedbackModel;->getBinaryIconNegative()Lcom/whoop/design/models/BinaryIconModel;

    move-result-object p0

    invoke-static {p0}, Llb1/r;->f(Lcom/whoop/design/models/BinaryIconModel;)Lsz0/h;

    move-result-object p0

    new-instance v3, Lsz0/g;

    invoke-direct {v3, v0, v2, v1, p0}, Lsz0/g;-><init>(Ljava/lang/String;Lsz0/f;Lsz0/h;Lsz0/h;)V

    return-object v3
.end method
