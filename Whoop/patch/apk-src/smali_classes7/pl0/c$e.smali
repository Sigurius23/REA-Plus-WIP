.class final Lpl0/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl0/c$e$a;
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
.field final synthetic w:Lcom/whoop/bot/models/conversation/AdditionalContextStyle;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/models/conversation/AdditionalContextStyle;)V
    .locals 0

    iput-object p1, p0, Lpl0/c$e;->w:Lcom/whoop/bot/models/conversation/AdditionalContextStyle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpl0/c$e;->w:Lcom/whoop/bot/models/conversation/AdditionalContextStyle;

    sget-object v1, Lpl0/c$e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v0

    return-wide v0

    :pswitch_1
    invoke-virtual {p1}, Ly81/i;->X()J

    move-result-wide v0

    return-wide v0

    :pswitch_2
    invoke-virtual {p1}, Ly81/i;->f()J

    move-result-wide v0

    return-wide v0

    :pswitch_3
    invoke-virtual {p1}, Ly81/i;->j()J

    move-result-wide v0

    return-wide v0

    :pswitch_4
    invoke-virtual {p1}, Ly81/i;->f0()J

    move-result-wide v0

    return-wide v0

    :pswitch_5
    invoke-virtual {p1}, Ly81/i;->Z()J

    move-result-wide v0

    return-wide v0

    :pswitch_6
    invoke-virtual {p1}, Ly81/i;->k0()J

    move-result-wide v0

    return-wide v0

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

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lpl0/c$e;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
