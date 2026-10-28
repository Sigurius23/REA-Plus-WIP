.class public final Luw2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0096\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Luw2/c;",
        "Lwc3/c;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "b",
        "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V",
        "Lzc3/d;",
        "decoder",
        "a",
        "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "whoop-action_release"
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
.field public static final b:Luw2/c;

.field public static final c:I


# instance fields
.field private final synthetic a:Luw2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luw2/c;

    invoke-direct {v0}, Luw2/c;-><init>()V

    sput-object v0, Luw2/c;->b:Luw2/c;

    const/16 v0, 0x8

    sput v0, Luw2/c;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Luw2/b;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Luw2/b;-><init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Luw2/c;->a:Luw2/b;

    return-void
.end method


# virtual methods
.method public a(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luw2/c;->a:Luw2/b;

    invoke-virtual {v0, p1}, Luw2/b;->b(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    return-object p1
.end method

.method public b(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luw2/c;->a:Luw2/b;

    invoke-virtual {v0, p1, p2}, Luw2/b;->c(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-void
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Luw2/c;->a(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Luw2/c;->a:Luw2/b;

    invoke-virtual {v0}, Luw2/b;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {p0, p1, p2}, Luw2/c;->b(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-void
.end method
