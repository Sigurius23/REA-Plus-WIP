.class public final Lrk1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrk1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lrk1/c$a;",
        "",
        "<init>",
        "()V",
        "",
        "checkResult",
        "Lrk1/c;",
        "a",
        "(I)Lrk1/c;",
        "averageHeartRate",
        "b",
        "(II)Lrk1/c;",
        "heart-health-common_release"
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
    invoke-direct {p0}, Lrk1/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lrk1/c;
    .locals 5

    invoke-static {}, Lrk1/c;->values()[Lrk1/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lrk1/c;->getCheckResult()I

    move-result v4

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object p1, Lrk1/c;->Inconclusive:Lrk1/c;

    return-object p1

    :cond_2
    return-object v3
.end method

.method public final b(II)Lrk1/c;
    .locals 7

    const/16 v0, 0x63

    const/16 v1, 0x33

    const/16 v2, 0xc8

    const/16 v3, 0x97

    const/16 v4, 0x96

    const/16 v5, 0x64

    const/4 v6, 0x1

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_0
    sget-object p1, Lrk1/c;->Inconclusive:Lrk1/c;

    return-object p1

    :pswitch_1
    new-instance p1, Li93/j;

    invoke-direct {p1, v5, v4, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lrk1/c;->HighHeartRateNoShepherdDetected:Lrk1/c;

    return-object p1

    :cond_0
    new-instance p1, Li93/j;

    invoke-direct {p1, v3, v2, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lrk1/c;->HighHeartRate:Lrk1/c;

    return-object p1

    :cond_1
    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_2
    new-instance p1, Li93/j;

    invoke-direct {p1, v1, v0, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lrk1/c;->Shepherd:Lrk1/c;

    return-object p1

    :cond_2
    new-instance p1, Li93/j;

    invoke-direct {p1, v5, v4, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lrk1/c;->ShepherdHighHeartRate:Lrk1/c;

    return-object p1

    :cond_3
    new-instance p1, Li93/j;

    invoke-direct {p1, v3, v2, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lrk1/c;->HighHeartRate:Lrk1/c;

    return-object p1

    :cond_4
    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_3
    const/16 p1, 0x32

    if-gt p2, p1, :cond_5

    sget-object p1, Lrk1/c;->LowHeartRate:Lrk1/c;

    return-object p1

    :cond_5
    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_4
    new-instance p1, Li93/j;

    invoke-direct {p1, v1, v0, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p1, p2}, Li93/j;->e(I)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lrk1/c;->SinusRhythm:Lrk1/c;

    return-object p1

    :cond_6
    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_5
    sget-object p1, Lrk1/c;->Unreadable:Lrk1/c;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
