.class public final Lv40/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Lc93/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu40/e;->a:Lty1/e;

    iput-object v0, p0, Lv40/a;->w:Lc93/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv40/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv40/a;

    iget-object v1, p0, Lv40/a;->w:Lc93/a;

    iget-object p1, p1, Lv40/a;->w:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lv40/a;->w:Lc93/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "HCaptchaInternalConfig(htmlProvider="

    const-string v1, ")"

    iget-object v2, p0, Lv40/a;->w:Lc93/a;

    invoke-static {v0, v1, v2}, Lte0/d;->l(Ljava/lang/String;Ljava/lang/String;Lc93/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
