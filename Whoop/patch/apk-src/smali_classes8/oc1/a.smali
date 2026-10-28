.class public abstract Loc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "ratingPickerMapper",
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

    new-instance v0, Lo72/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Loc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;)Lg31/d;
    .locals 0

    invoke-static {p0}, Loc1/a;->e(Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;)Lg31/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loc1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Loc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo72/e;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Loc1/a$a;

    invoke-direct {v2, v0}, Loc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;)Lg31/d;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg31/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;->getMaximum()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;->getNumSelected()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;->getMaximum()I

    move-result v4

    invoke-static {v2, v3, v4}, Le93/b;->n(III)I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lg31/d;-><init>(IILjava/lang/String;)V

    return-object v0
.end method
