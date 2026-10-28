.class public final Lhw0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhw0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhw0/f$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0011\u0010\u0008\u001a\u00020\u0004*\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lhw0/f$a;",
        "",
        "<init>",
        "()V",
        "Lmc1/b;",
        "Lcom/whoop/design/models/items/HeartRateTileId;",
        "b",
        "(Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;",
        "c",
        "(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhw0/f$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lhw0/f$a;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;
    .locals 0

    invoke-direct {p0, p1}, Lhw0/f$a;->b(Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;
    .locals 1

    sget-object v0, Lhw0/f$a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->NONE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_0
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->MEDIUM_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->LOW_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->HIGH_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_3
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->AWAKE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_4
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->SWS_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_5
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->REM_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_6
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->LIGHT_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_7
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->HOLD:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_8
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->EXHALE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_9
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->INHALE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_a
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->RESTORATIVE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_b
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->LIGHT:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_c
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->VERY_LIGHT:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_d
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->MODERATE:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_e
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->HARD:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_f
    sget-object p1, Lcom/whoop/design/models/items/HeartRateTileId;->MAX:Lcom/whoop/design/models/items/HeartRateTileId;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final c(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhw0/f$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lmc1/b;->VERY_LIGHT:Lmc1/b;

    return-object p1

    :pswitch_1
    sget-object p1, Lmc1/b;->SWS_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_2
    sget-object p1, Lmc1/b;->RESTORATIVE:Lmc1/b;

    return-object p1

    :pswitch_3
    sget-object p1, Lmc1/b;->REM_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_4
    sget-object p1, Lmc1/b;->NONE:Lmc1/b;

    return-object p1

    :pswitch_5
    sget-object p1, Lmc1/b;->MODERATE:Lmc1/b;

    return-object p1

    :pswitch_6
    sget-object p1, Lmc1/b;->MEDIUM_STRESS:Lmc1/b;

    return-object p1

    :pswitch_7
    sget-object p1, Lmc1/b;->MAX:Lmc1/b;

    return-object p1

    :pswitch_8
    sget-object p1, Lmc1/b;->LOW_STRESS:Lmc1/b;

    return-object p1

    :pswitch_9
    sget-object p1, Lmc1/b;->LIGHT_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_a
    sget-object p1, Lmc1/b;->LIGHT:Lmc1/b;

    return-object p1

    :pswitch_b
    sget-object p1, Lmc1/b;->INHALE:Lmc1/b;

    return-object p1

    :pswitch_c
    sget-object p1, Lmc1/b;->HOLD:Lmc1/b;

    return-object p1

    :pswitch_d
    sget-object p1, Lmc1/b;->HIGH_STRESS:Lmc1/b;

    return-object p1

    :pswitch_e
    sget-object p1, Lmc1/b;->HARD:Lmc1/b;

    return-object p1

    :pswitch_f
    sget-object p1, Lmc1/b;->EXHALE:Lmc1/b;

    return-object p1

    :pswitch_10
    sget-object p1, Lmc1/b;->AWAKE:Lmc1/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
