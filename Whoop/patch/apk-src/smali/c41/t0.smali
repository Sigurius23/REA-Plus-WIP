.class public final Lc41/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0016\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lc41/t0;",
        "Lm91/u;",
        "",
        "event",
        "Lkd1/l;",
        "ctaType",
        "Lc41/u0;",
        "type",
        "Ly81/f;",
        "background",
        "<init>",
        "(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Object;",
        "getEvent",
        "()Ljava/lang/Object;",
        "b",
        "Lkd1/l;",
        "()Lkd1/l;",
        "c",
        "Lc41/u0;",
        "()Lc41/u0;",
        "d",
        "Ly81/f;",
        "()Ly81/f;",
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


# static fields
.field public static final e:I = 0x8


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lkd1/l;

.field private final c:Lc41/u0;

.field private final d:Ly81/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc41/t0;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lc41/t0;->b:Lkd1/l;

    .line 4
    iput-object p3, p0, Lc41/t0;->c:Lc41/u0;

    .line 5
    iput-object p4, p0, Lc41/t0;->d:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 7
    sget-object p4, Ly81/f;->WHITE_10:Ly81/f;

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lc41/t0;-><init>(Ljava/lang/Object;Lkd1/l;Lc41/u0;Ly81/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/t0;->d:Ly81/f;

    return-object v0
.end method

.method public final b()Lkd1/l;
    .locals 1

    iget-object v0, p0, Lc41/t0;->b:Lkd1/l;

    return-object v0
.end method

.method public final c()Lc41/u0;
    .locals 1

    iget-object v0, p0, Lc41/t0;->c:Lc41/u0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc41/t0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc41/t0;

    iget-object v1, p0, Lc41/t0;->a:Ljava/lang/Object;

    iget-object v3, p1, Lc41/t0;->a:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc41/t0;->b:Lkd1/l;

    iget-object v3, p1, Lc41/t0;->b:Lkd1/l;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc41/t0;->c:Lc41/u0;

    iget-object v3, p1, Lc41/t0;->c:Lc41/u0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc41/t0;->d:Ly81/f;

    iget-object p1, p1, Lc41/t0;->d:Ly81/f;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getEvent()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc41/t0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lc41/t0;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc41/t0;->b:Lkd1/l;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc41/t0;->c:Lc41/u0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc41/t0;->d:Ly81/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lc41/t0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lc41/t0;->b:Lkd1/l;

    iget-object v2, p0, Lc41/t0;->c:Lc41/u0;

    iget-object v3, p0, Lc41/t0;->d:Ly81/f;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CoachingCtaTileState(event="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", background="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
