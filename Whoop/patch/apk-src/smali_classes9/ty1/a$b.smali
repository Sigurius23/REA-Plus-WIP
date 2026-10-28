.class public final Lty1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lty1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lty1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\n\n\u0002\u0010\u0001\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lty1/a$b;",
        "Lty1/a;",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "",
        "enabled",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Z)V",
        "c",
        "(Lcom/whoop/design/util/TextResource;Z)Lty1/a$b;",
        "",
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
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Z",
        "()Z",
        "",
        "Ljava/lang/Void;",
        "e",
        "()Ljava/lang/Void;",
        "lottieAnimation",
        "mfa_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Z

.field private final c:Ljava/lang/Void;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Z)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-boolean p2, p0, Lty1/a$b;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    sget p1, Lpy1/d;->b:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lty1/a$b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    return-void
.end method

.method public static synthetic d(Lty1/a$b;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Lty1/a$b;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lty1/a$b;->b:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lty1/a$b;->c(Lcom/whoop/design/util/TextResource;Z)Lty1/a$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lty1/a$b;->b:Z

    return v0
.end method

.method public bridge synthetic b()Lv41/r0;
    .locals 1

    invoke-virtual {p0}, Lty1/a$b;->e()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lv41/r0;

    return-object v0
.end method

.method public final c(Lcom/whoop/design/util/TextResource;Z)Lty1/a$b;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lty1/a$b;

    invoke-direct {v0, p1, p2}, Lty1/a$b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    return-object v0
.end method

.method public e()Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lty1/a$b;->c:Ljava/lang/Void;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lty1/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lty1/a$b;

    iget-object v1, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lty1/a$b;->b:Z

    iget-boolean p1, p1, Lty1/a$b;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lty1/a$b;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lty1/a$b;->a:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lty1/a$b;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Text(text="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
