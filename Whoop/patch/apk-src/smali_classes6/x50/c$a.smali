.class public final Lx50/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx50/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx50/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lx50/c$a;",
        "Lx50/c;",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "<init>",
        "(Lcom/whoop/navigation/e;)V",
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
        "b",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "c",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "access_release"
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
.field private final b:Lcom/whoop/navigation/e;

.field private final c:Lcom/whoop/metrics/common/ScreenState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lx50/c$a;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    sget-object p1, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    iput-object p1, p0, Lx50/c$a;->c:Lcom/whoop/metrics/common/ScreenState;

    return-void
.end method


# virtual methods
.method public final b()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx50/c$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx50/c$a;

    iget-object v1, p0, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    iget-object v0, p0, Lx50/c$a;->c:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lx50/c$a;->b:Lcom/whoop/navigation/e;

    const-string v1, "Connected(navigation="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lte0/d;->i(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
