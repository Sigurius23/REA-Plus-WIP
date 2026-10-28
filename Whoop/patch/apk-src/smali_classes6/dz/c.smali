.class public final Ldz/c;
.super Ldz/i;
.source "SourceFile"

# interfaces
.implements Lv30/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Map;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Ldz/c;->w:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string p1, "implementation"

    const-string v0, "google_pay"

    invoke-static {p1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 3
    iput-object p1, p0, Ldz/c;->x:Ljava/util/Map;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p1, "implementation"

    const-string v0, "google_pay"

    invoke-static {p1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 6
    iput-object p1, p0, Ldz/c;->x:Ljava/util/Map;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldz/c;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, "error_message"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 10
    iput-object p1, p0, Ldz/c;->x:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ly00/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldz/c;->w:I

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "brand"

    .line 16
    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    .line 17
    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 18
    iput-object p1, p0, Ldz/c;->x:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Ldz/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldz/c;->x:Ljava/util/Map;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldz/c;->x:Ljava/util/Map;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ldz/c;->x:Ljava/util/Map;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ldz/c;->x:Ljava/util/Map;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldz/c;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "cs_load_failed"

    return-object v0

    :pswitch_0
    const-string v0, "cs_cardscan_scan_started"

    return-object v0

    :pswitch_1
    const-string v0, "cs_cardscan_api_check_succeeded"

    return-object v0

    :pswitch_2
    const-string v0, "cs_disallowed_card_brand"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
