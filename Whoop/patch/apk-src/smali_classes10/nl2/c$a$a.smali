.class public final Lnl2/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnl2/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnl2/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008\u0017\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001b\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lnl2/c$a$a;",
        "Lnl2/c$a;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lx21/a;",
        "numberPickerState",
        "Lnl2/c$b;",
        "primaryButton",
        "Lc41/p2;",
        "infoCalloutState",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lx21/a;Lnl2/c$b;Lc41/p2;)V",
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
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Lx21/a;",
        "c",
        "()Lx21/a;",
        "Lnl2/c$b;",
        "()Lnl2/c$b;",
        "d",
        "Lc41/p2;",
        "()Lc41/p2;",
        "training_release"
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
.field public static final e:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lx21/a;

.field private final c:Lnl2/c$b;

.field private final d:Lc41/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lc41/p2;->v:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    sget v2, Lx21/a;->h:I

    or-int/2addr v0, v2

    or-int/2addr v0, v1

    sput v0, Lnl2/c$a$a;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lx21/a;Lnl2/c$b;Lc41/p2;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "numberPickerState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lnl2/c$a$a;->b:Lx21/a;

    iput-object p3, p0, Lnl2/c$a$a;->c:Lnl2/c$b;

    iput-object p4, p0, Lnl2/c$a$a;->d:Lc41/p2;

    return-void
.end method


# virtual methods
.method public a()Lnl2/c$b;
    .locals 1

    iget-object v0, p0, Lnl2/c$a$a;->c:Lnl2/c$b;

    return-object v0
.end method

.method public b()Lc41/p2;
    .locals 1

    iget-object v0, p0, Lnl2/c$a$a;->d:Lc41/p2;

    return-object v0
.end method

.method public c()Lx21/a;
    .locals 1

    iget-object v0, p0, Lnl2/c$a$a;->b:Lx21/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnl2/c$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnl2/c$a$a;

    iget-object v1, p0, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnl2/c$a$a;->b:Lx21/a;

    iget-object v3, p1, Lnl2/c$a$a;->b:Lx21/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnl2/c$a$a;->c:Lnl2/c$b;

    iget-object v3, p1, Lnl2/c$a$a;->c:Lnl2/c$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lnl2/c$a$a;->d:Lc41/p2;

    iget-object p1, p1, Lnl2/c$a$a;->d:Lc41/p2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnl2/c$a$a;->b:Lx21/a;

    invoke-virtual {v1}, Lx21/a;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lnl2/c$a$a;->c:Lnl2/c$b;

    invoke-virtual {v0}, Lnl2/c$b;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnl2/c$a$a;->d:Lc41/p2;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lc41/p2;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lnl2/c$a$a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lnl2/c$a$a;->b:Lx21/a;

    iget-object v2, p0, Lnl2/c$a$a;->c:Lnl2/c$b;

    iget-object v3, p0, Lnl2/c$a$a;->d:Lc41/p2;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BottomSheetMaxHrPickerState(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numberPickerState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryButton="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", infoCalloutState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
