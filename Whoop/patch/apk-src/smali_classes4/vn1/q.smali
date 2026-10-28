.class public final Lvn1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008&\u0010\u0010R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\'\u001a\u0004\u0008(\u0010\u0010R\u0011\u0010)\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010%\u00a8\u0006*"
    }
    d2 = {
        "Lvn1/q;",
        "Lm91/u;",
        "Lvn1/g;",
        "notificationsCenterViewState",
        "Lo01/c;",
        "aiChatEntryPointItem",
        "Lk31/d;",
        "replayViewState",
        "",
        "shouldShowReplayDefaultState",
        "",
        "path",
        "userCategory",
        "<init>",
        "(Lvn1/g;Lo01/c;Lk31/d;ZLjava/lang/String;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lvn1/g;",
        "c",
        "()Lvn1/g;",
        "b",
        "Lo01/c;",
        "()Lo01/c;",
        "Lk31/d;",
        "f",
        "()Lk31/d;",
        "d",
        "Z",
        "g",
        "()Z",
        "e",
        "Ljava/lang/String;",
        "h",
        "hasBottomContent",
        "home-notifications-center_release"
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
.field public static final g:I


# instance fields
.field private final a:Lvn1/g;

.field private final b:Lo01/c;

.field private final c:Lk31/d;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lk31/d;->f:I

    sget v1, Lo01/c;->k:I

    or-int/2addr v0, v1

    sput v0, Lvn1/q;->g:I

    return-void
.end method

.method public constructor <init>(Lvn1/g;Lo01/c;Lk31/d;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvn1/q;->a:Lvn1/g;

    .line 3
    iput-object p2, p0, Lvn1/q;->b:Lo01/c;

    .line 4
    iput-object p3, p0, Lvn1/q;->c:Lk31/d;

    .line 5
    iput-boolean p4, p0, Lvn1/q;->d:Z

    .line 6
    iput-object p5, p0, Lvn1/q;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lvn1/q;->f:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lvn1/g;Lo01/c;Lk31/d;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move-object v6, p8

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    goto :goto_2

    :cond_2
    move-object v6, p6

    goto :goto_1

    .line 8
    :goto_2
    invoke-direct/range {v0 .. v6}, Lvn1/q;-><init>(Lvn1/g;Lo01/c;Lk31/d;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lo01/c;
    .locals 1

    iget-object v0, p0, Lvn1/q;->b:Lo01/c;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lvn1/q;->b:Lo01/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lvn1/q;->c:Lk31/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Lvn1/g;
    .locals 1

    iget-object v0, p0, Lvn1/q;->a:Lvn1/g;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvn1/q;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvn1/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvn1/q;

    iget-object v1, p0, Lvn1/q;->a:Lvn1/g;

    iget-object v3, p1, Lvn1/q;->a:Lvn1/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvn1/q;->b:Lo01/c;

    iget-object v3, p1, Lvn1/q;->b:Lo01/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvn1/q;->c:Lk31/d;

    iget-object v3, p1, Lvn1/q;->c:Lk31/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lvn1/q;->d:Z

    iget-boolean v3, p1, Lvn1/q;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lvn1/q;->e:Ljava/lang/String;

    iget-object v3, p1, Lvn1/q;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lvn1/q;->f:Ljava/lang/String;

    iget-object p1, p1, Lvn1/q;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lk31/d;
    .locals 1

    iget-object v0, p0, Lvn1/q;->c:Lk31/d;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lvn1/q;->d:Z

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvn1/q;->f:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lvn1/q;->a:Lvn1/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lvn1/q;->b:Lo01/c;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lo01/c;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lvn1/q;->c:Lk31/d;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lk31/d;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lvn1/q;->d:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lvn1/q;->e:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lvn1/q;->f:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lvn1/q;->a:Lvn1/g;

    iget-object v1, p0, Lvn1/q;->b:Lo01/c;

    iget-object v2, p0, Lvn1/q;->c:Lk31/d;

    iget-boolean v3, p0, Lvn1/q;->d:Z

    iget-object v4, p0, Lvn1/q;->e:Ljava/lang/String;

    iget-object v5, p0, Lvn1/q;->f:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "NotificationsWrapperState(notificationsCenterViewState="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiChatEntryPointItem="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", replayViewState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowReplayDefaultState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userCategory="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
