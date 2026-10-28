.class public abstract Llb1/v3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/v3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/ProgressMeterModel;",
        "model",
        "Lf81/c;",
        "d",
        "(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;",
        "Lcom/whoop/design/models/ProgressMeterStyle;",
        "Ly81/f;",
        "e",
        "(Lcom/whoop/design/models/ProgressMeterStyle;)Ly81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "progressMeterMapper",
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

    new-instance v0, Llb1/j3;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/v3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;
    .locals 0

    invoke-static {p0}, Llb1/v3;->g(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/v3;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/v3;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf81/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressMeterModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressMeterModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressMeterModel;->getProgress()F

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressMeterModel;->getStyle()Lcom/whoop/design/models/ProgressMeterStyle;

    move-result-object p0

    invoke-static {p0}, Llb1/v3;->e(Lcom/whoop/design/models/ProgressMeterStyle;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lf81/c;-><init>(Ljava/lang/String;Ljava/lang/String;FLy81/f;)V

    return-object v0
.end method

.method public static final e(Lcom/whoop/design/models/ProgressMeterStyle;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/v3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->ACCENT_ONBOARDING_ACTION:Ly81/f;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/ProgressMeterModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/v3$b;

    invoke-direct {v2, v0}, Llb1/v3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/v3;->d(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;

    move-result-object p0

    return-object p0
.end method
