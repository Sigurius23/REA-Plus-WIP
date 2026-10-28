.class public final Lv00/h;
.super Lv00/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "ValidUsBankVerificationMethod"

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lv00/c0;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lv00/c0;->w:Ly00/c8;

    invoke-interface {p1}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ly00/c8;->G()Ljava/util/Map;

    move-result-object p1

    sget-object p2, Ly00/f4;->G:Lt9/c0;

    const-string p2, "us_bank_account"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    check-cast p1, Ljava/util/Map;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    const-string p2, "verification_method"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :cond_3
    const-string p1, "instant"

    const-string p2, "instant_or_skip"

    const-string v1, "automatic"

    filled-new-array {v1, p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
