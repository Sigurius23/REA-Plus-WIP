.class public final Ldz/b;
.super Ldz/i;
.source "SourceFile"

# interfaces
.implements Lv30/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldz/a;Ly00/i;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ldz/b;->w:I

    const-string v0, "selectedBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p1, Ldz/a;->w:Ljava/lang/String;

    .line 3
    new-instance v0, Ll83/k;

    const-string v1, "cbc_event_source"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iget-object p1, p2, Ly00/i;->w:Ljava/lang/String;

    .line 5
    new-instance p2, Ll83/k;

    const-string v1, "selected_card_brand"

    invoke-direct {p2, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    filled-new-array {v0, p2}, [Ll83/k;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ldz/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Ldz/b;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ll83/k;

    const-string v1, "implementation"

    const-string v2, "google_pay"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "error_message"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ldz/b;->x:Ljava/lang/Object;

    return-void
.end method

.method private final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ldz/b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method private final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ldz/b;->x:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Ldz/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-direct {p0}, Ldz/b;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-direct {p0}, Ldz/b;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldz/b;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "cs_cardscan_api_check_failed"

    return-object v0

    :pswitch_0
    const-string v0, "cs_cbc_selected"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
