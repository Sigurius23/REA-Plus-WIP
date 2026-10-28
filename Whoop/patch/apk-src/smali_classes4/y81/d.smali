.class public final Ly81/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly81/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0008\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Ly81/d;",
        "Ly81/e;",
        "Li2/x;",
        "color",
        "<init>",
        "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "toComposableColor-WaAFU9c",
        "(Landroidx/compose/runtime/Composer;I)J",
        "toComposableColor",
        "toTestableColor-0d7_KjU",
        "()J",
        "toTestableColor",
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
        "w",
        "J",
        "getColor-0d7_KjU",
        "design_release"
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
.field private final w:J


# direct methods
.method private constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly81/d;->w:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ly81/d;-><init>(J)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly81/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly81/d;

    iget-wide v3, p0, Ly81/d;->w:J

    iget-wide v5, p1, Ly81/d;->w:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Ly81/d;->w:J

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J
    .locals 2

    check-cast p1, Lp1/q;

    const p2, 0x6ce6cb9f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-wide v0, p0, Ly81/d;->w:J

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-wide v0, p0, Ly81/d;->w:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SimpleColorProvider(color="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTestableColor-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Ly81/d;->w:J

    return-wide v0
.end method
