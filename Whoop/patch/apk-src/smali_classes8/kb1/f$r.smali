.class final Lkb1/f$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb1/f;->e(Lkb1/e;)Ly81/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb1/f$r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lkb1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkb1/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkb1/f$r;->w:Lkb1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb1/f$r;->w:Lkb1/e;

    invoke-virtual {v0}, Lkb1/e;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/calendar/CalendarDateModel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getDayState()Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lkb1/f$r$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_1
    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Ly81/i;->Y0()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v0

    return-wide v0

    :pswitch_1
    iget-object v0, p0, Lkb1/f$r;->w:Lkb1/e;

    invoke-virtual {v0}, Lkb1/e;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ly81/i;->b1()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v0

    return-wide v0

    :pswitch_2
    iget-object v0, p0, Lkb1/f$r;->w:Lkb1/e;

    invoke-virtual {v0}, Lkb1/e;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ly81/i;->Y0()J

    move-result-wide v0

    return-wide v0

    :cond_3
    invoke-virtual {p1}, Ly81/i;->b1()J

    move-result-wide v0

    return-wide v0

    :pswitch_3
    invoke-virtual {p1}, Ly81/i;->b1()J

    move-result-wide v0

    return-wide v0

    :pswitch_4
    invoke-virtual {p1}, Ly81/i;->j()J

    move-result-wide v0

    return-wide v0

    :pswitch_5
    invoke-virtual {p1}, Ly81/i;->f()J

    move-result-wide v0

    return-wide v0

    :pswitch_6
    invoke-virtual {p1}, Ly81/i;->j()J

    move-result-wide v0

    return-wide v0

    :pswitch_7
    invoke-virtual {p1}, Ly81/i;->X()J

    move-result-wide v0

    return-wide v0

    :pswitch_8
    invoke-virtual {p1}, Ly81/i;->k0()J

    move-result-wide v0

    return-wide v0

    :pswitch_9
    invoke-virtual {p1}, Ly81/i;->k0()J

    move-result-wide v0

    const p1, 0x3f4ccccd    # 0.8f

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :pswitch_a
    invoke-virtual {p1}, Ly81/i;->f0()J

    move-result-wide v0

    return-wide v0

    :pswitch_b
    invoke-virtual {p1}, Ly81/i;->Z()J

    move-result-wide v0

    return-wide v0

    :pswitch_c
    invoke-virtual {p1}, Ly81/i;->c0()J

    move-result-wide v0

    return-wide v0

    :pswitch_d
    invoke-virtual {p1}, Ly81/i;->b0()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lkb1/f$r;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
