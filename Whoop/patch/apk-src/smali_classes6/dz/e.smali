.class public final Ldz/e;
.super Ldz/i;
.source "SourceFile"

# interfaces
.implements Lv30/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lkotlin/time/Duration;I)V
    .locals 2

    iput p2, p0, Ldz/e;->w:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 3
    new-instance p2, Ll83/k;

    const-string v0, "implementation"

    const-string v1, "google_pay"

    invoke-direct {p2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 5
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 8
    new-instance p2, Ll83/k;

    const-string v0, "implementation"

    const-string v1, "google_pay"

    invoke-direct {p2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 10
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lkotlin/time/Duration;Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Ldz/e;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 13
    new-instance v0, Ll83/k;

    const-string v1, "implementation"

    const-string v2, "google_pay"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 15
    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "error_message"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object p2

    .line 17
    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 18
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Ldz/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ldz/e;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldz/e;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "cs_cardscan_success"

    return-object v0

    :pswitch_0
    const-string v0, "cs_cardscan_failed"

    return-object v0

    :pswitch_1
    const-string v0, "cs_cardscan_cancel"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
