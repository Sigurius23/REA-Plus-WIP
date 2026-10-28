.class public abstract Llb1/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/v0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DatePillModel;",
        "Lh11/h;",
        "g",
        "(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;",
        "Lcom/whoop/design/models/items/DatePillStatus;",
        "Lh11/g;",
        "f",
        "(Lcom/whoop/design/models/items/DatePillStatus;)Lh11/g;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "datePillMapper",
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

    new-instance v0, Llb1/m;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/v0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;
    .locals 0

    invoke-static {p0}, Llb1/v0;->d(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/v0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/DatePillModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/v0$b;

    invoke-direct {v2, v0}, Llb1/v0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/v0;->g(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/v0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/DatePillStatus;)Lh11/g;
    .locals 1

    sget-object v0, Llb1/v0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lh11/g;->INVALID:Lh11/g;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh11/g;->NO_APPOINTMENTS:Lh11/g;

    return-object p0

    :cond_2
    sget-object p0, Lh11/g;->HAS_APPOINTMENT:Lh11/g;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;
    .locals 17

    new-instance v0, Lh11/h;

    new-instance v1, Lh11/a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getDisplay()Lcom/whoop/design/models/DateDisplay;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/DateDisplay;->getDay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getDisplay()Lcom/whoop/design/models/DateDisplay;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/DateDisplay;->getDate()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lh11/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->isSelected()Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getStatus()Lcom/whoop/design/models/items/DatePillStatus;

    move-result-object v2

    invoke-static {v2}, Llb1/v0;->f(Lcom/whoop/design/models/items/DatePillStatus;)Lh11/g;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getDate()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getDisplay()Lcom/whoop/design/models/DateDisplay;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/DateDisplay;->getDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    move-object v5, v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getSelectedColor()Ly81/f;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DatePillModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    const/16 v15, 0x35e2

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lh11/h;-><init>(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
