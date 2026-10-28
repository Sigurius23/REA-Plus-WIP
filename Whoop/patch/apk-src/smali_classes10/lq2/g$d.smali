.class public final Llq2/g$d;
.super Llq2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Llq2/g$d;",
        "Llq2/g;",
        "Llq2/f;",
        "gradientOption",
        "<init>",
        "(Llq2/f;)V",
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
        "e",
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
.field private final e:Llq2/f;


# direct methods
.method public constructor <init>(Llq2/f;)V
    .locals 11

    const-string v0, "gradientOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0xff86deffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v3

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v5

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v7

    const/4 v10, 0x0

    move-object v2, p0

    move-object v9, p1

    invoke-direct/range {v2 .. v10}, Llq2/g;-><init>(JJJLlq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v2, Llq2/g$d;->e:Llq2/f;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llq2/g$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llq2/g$d;

    iget-object v1, p0, Llq2/g$d;->e:Llq2/f;

    iget-object p1, p1, Llq2/g$d;->e:Llq2/f;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llq2/g$d;->e:Llq2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Llq2/g$d;->e:Llq2/f;

    const-string v1, "Recovery(gradientOption="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ljh3/c;->g(Ljava/lang/String;Llq2/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
