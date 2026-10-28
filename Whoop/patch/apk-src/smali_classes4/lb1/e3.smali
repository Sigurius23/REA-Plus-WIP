.class public abstract Llb1/e3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/e3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/InfoCalloutStyle;",
        "Llb1/f3;",
        "f",
        "(Lcom/whoop/design/models/items/InfoCalloutStyle;)Llb1/f3;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "miniCalloutMapper",
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

    new-instance v0, Llb1/t2;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/e3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;
    .locals 0

    invoke-static {p0}, Llb1/e3;->e(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e3;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/e3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/MiniCalloutModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/e3$b;

    invoke-direct {v2, v0}, Llb1/e3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getStyle()Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/e3;->f(Lcom/whoop/design/models/items/InfoCalloutStyle;)Llb1/f3;

    move-result-object v0

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getCta()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {v0}, Llb1/f3;->b()Ly81/f;

    move-result-object v5

    invoke-virtual {v0}, Llb1/f3;->a()Ly81/f;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MiniCalloutModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    new-instance v1, Lv21/c;

    invoke-direct/range {v1 .. v7}, Lv21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;)V

    return-object v1
.end method

.method public static final f(Lcom/whoop/design/models/items/InfoCalloutStyle;)Llb1/f3;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Llb1/e3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v1, Ly81/f;->WHITE_10:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_2
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->BLACK_70:Ly81/f;

    sget-object v1, Ly81/f;->BLACK_10:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_3
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v1, Ly81/f;->WHITE_5:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_4
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v1, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_5
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->ACCENT_ALERT:Ly81/f;

    sget-object v1, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_6
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v1, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    :pswitch_7
    new-instance p0, Llb1/f3;

    sget-object v0, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v1, Ly81/f;->NEUTRAL_15:Ly81/f;

    invoke-direct {p0, v0, v1}, Llb1/f3;-><init>(Ly81/f;Ly81/f;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
