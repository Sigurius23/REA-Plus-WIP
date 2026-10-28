.class public final enum Lrt1/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrt1/f$a;,
        Lrt1/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrt1/f;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lrt1/f;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Lcom/whoop/design/util/TextResource;",
        "toLocalizedString",
        "()Lcom/whoop/design/util/TextResource;",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "FATIGUE",
        "IRREGULAR_HEARTBEAT",
        "FAINTING",
        "DIZZINESS_OR_LIGHTHEADEDNESS",
        "CHEST_PAIN",
        "SHORTNESS_OF_BREATH",
        "HEART_PALPITATIONS",
        "labrador_release"
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

.field private static final synthetic $VALUES:[Lrt1/f;

.field public static final enum CHEST_PAIN:Lrt1/f;

.field public static final Companion:Lrt1/f$a;

.field public static final enum DIZZINESS_OR_LIGHTHEADEDNESS:Lrt1/f;

.field public static final enum FAINTING:Lrt1/f;

.field public static final enum FATIGUE:Lrt1/f;

.field public static final enum HEART_PALPITATIONS:Lrt1/f;

.field public static final enum IRREGULAR_HEARTBEAT:Lrt1/f;

.field public static final enum SHORTNESS_OF_BREATH:Lrt1/f;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lrt1/f;
    .locals 7

    sget-object v0, Lrt1/f;->FATIGUE:Lrt1/f;

    sget-object v1, Lrt1/f;->IRREGULAR_HEARTBEAT:Lrt1/f;

    sget-object v2, Lrt1/f;->FAINTING:Lrt1/f;

    sget-object v3, Lrt1/f;->DIZZINESS_OR_LIGHTHEADEDNESS:Lrt1/f;

    sget-object v4, Lrt1/f;->CHEST_PAIN:Lrt1/f;

    sget-object v5, Lrt1/f;->SHORTNESS_OF_BREATH:Lrt1/f;

    sget-object v6, Lrt1/f;->HEART_PALPITATIONS:Lrt1/f;

    filled-new-array/range {v0 .. v6}, [Lrt1/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrt1/f;

    const-string v1, "FATIGUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->FATIGUE:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "IRREGULAR_HEARTBEAT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->IRREGULAR_HEARTBEAT:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "FAINTING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->FAINTING:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "DIZZINESS_OR_LIGHTHEADEDNESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->DIZZINESS_OR_LIGHTHEADEDNESS:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "CHEST_PAIN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->CHEST_PAIN:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "SHORTNESS_OF_BREATH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->SHORTNESS_OF_BREATH:Lrt1/f;

    new-instance v0, Lrt1/f;

    const-string v1, "HEART_PALPITATIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v1}, Lrt1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrt1/f;->HEART_PALPITATIONS:Lrt1/f;

    invoke-static {}, Lrt1/f;->$values()[Lrt1/f;

    move-result-object v0

    sput-object v0, Lrt1/f;->$VALUES:[Lrt1/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrt1/f;->$ENTRIES:Lt83/a;

    new-instance v0, Lrt1/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrt1/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrt1/f;->Companion:Lrt1/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lrt1/f;->serializedValue:Ljava/lang/String;

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

    sget-object v0, Lrt1/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrt1/f;
    .locals 1

    const-class v0, Lrt1/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrt1/f;

    return-object p0
.end method

.method public static values()[Lrt1/f;
    .locals 1

    sget-object v0, Lrt1/f;->$VALUES:[Lrt1/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrt1/f;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrt1/f;->serializedValue:Ljava/lang/String;

    return-object v0
.end method

.method public final toLocalizedString()Lcom/whoop/design/util/TextResource;
    .locals 4

    sget-object v0, Lrt1/f$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->y0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->C0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->t0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->u0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->w0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->z0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lrs1/f;->x0:I

    invoke-direct {v0, v3, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
