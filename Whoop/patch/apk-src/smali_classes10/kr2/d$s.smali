.class public final Lkr2/d$s;
.super Lkr2/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkr2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkr2/d$s;",
        "Lkr2/d;",
        "Llq2/f;",
        "gradientOption",
        "<init>",
        "(Llq2/f;)V",
        "Llq2/p$a$d;",
        "b",
        "()Llq2/p$a$d;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Llq2/f;",
        "getGradientOption",
        "()Llq2/f;",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final b:Llq2/f;


# direct methods
.method public constructor <init>(Llq2/f;)V
    .locals 1

    const-string v0, "gradientOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkr2/d;-><init>(Llq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lkr2/d$s;->b:Llq2/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Llq2/p$a;
    .locals 1

    invoke-virtual {p0}, Lkr2/d$s;->b()Llq2/p$a$d;

    move-result-object v0

    return-object v0
.end method

.method public b()Llq2/p$a$d;
    .locals 9

    new-instance v0, Llq2/p$a$d;

    invoke-static {}, Lkr2/e;->I()J

    move-result-wide v1

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Llq2/p$a$d;-><init>(JFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkr2/d$s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkr2/d$s;

    iget-object v1, p0, Lkr2/d$s;->b:Llq2/f;

    iget-object p1, p1, Lkr2/d$s;->b:Llq2/f;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkr2/d$s;->b:Llq2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lkr2/d$s;->b:Llq2/f;

    const-string v1, "Sleep(gradientOption="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ljh3/c;->g(Ljava/lang/String;Llq2/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
