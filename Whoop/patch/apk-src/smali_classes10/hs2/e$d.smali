.class public final Lhs2/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhs2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u001a\u001a\u0004\u0008\u0013\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lhs2/e$d;",
        "",
        "Lhs2/e$e;",
        "waitingRoom",
        "Lhs2/c;",
        "participants",
        "",
        "arePermissionsEnabled",
        "<init>",
        "(Lhs2/e$e;Lhs2/c;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lhs2/e$e;",
        "c",
        "()Lhs2/e$e;",
        "b",
        "Lhs2/c;",
        "()Lhs2/c;",
        "Z",
        "()Z",
        "video-call_release"
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
.field public static final d:I


# instance fields
.field private final a:Lhs2/e$e;

.field private final b:Lhs2/c;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lhy0/h0;->h:I

    sget v1, Lc41/p2;->v:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/modal/DialogModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v1

    sput v0, Lhs2/e$d;->d:I

    return-void
.end method

.method public constructor <init>(Lhs2/e$e;Lhs2/c;Z)V
    .locals 1

    const-string v0, "waitingRoom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs2/e$d;->a:Lhs2/e$e;

    iput-object p2, p0, Lhs2/e$d;->b:Lhs2/c;

    iput-boolean p3, p0, Lhs2/e$d;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lhs2/e$d;->c:Z

    return v0
.end method

.method public final b()Lhs2/c;
    .locals 1

    iget-object v0, p0, Lhs2/e$d;->b:Lhs2/c;

    return-object v0
.end method

.method public final c()Lhs2/e$e;
    .locals 1

    iget-object v0, p0, Lhs2/e$d;->a:Lhs2/e$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhs2/e$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhs2/e$d;

    iget-object v1, p0, Lhs2/e$d;->a:Lhs2/e$e;

    iget-object v3, p1, Lhs2/e$d;->a:Lhs2/e$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhs2/e$d;->b:Lhs2/c;

    iget-object v3, p1, Lhs2/e$d;->b:Lhs2/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lhs2/e$d;->c:Z

    iget-boolean p1, p1, Lhs2/e$d;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhs2/e$d;->a:Lhs2/e$e;

    invoke-virtual {v0}, Lhs2/e$e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhs2/e$d;->b:Lhs2/c;

    invoke-virtual {v1}, Lhs2/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lhs2/e$d;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lhs2/e$d;->a:Lhs2/e$e;

    iget-object v1, p0, Lhs2/e$d;->b:Lhs2/c;

    iget-boolean v2, p0, Lhs2/e$d;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ScreenContent(waitingRoom="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", participants="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", arePermissionsEnabled="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
