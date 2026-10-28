.class public final Ldy1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx42/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Ldy1/e;",
        "Lx42/d;",
        "Ldy1/a;",
        "memfaultInitializer",
        "Ldw/b;",
        "chunkSenderBuilder",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ldy1/a;Ldw/b;Ltr2/n;)V",
        "",
        "macAddress",
        "Ly42/a;",
        "puffin",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ly42/a;)V",
        "Ldy1/a;",
        "b",
        "Ldw/b;",
        "c",
        "Ltr2/n;",
        "",
        "Ldy1/f;",
        "d",
        "Ljava/util/Map;",
        "puffins",
        "memfault_release"
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
.field private final a:Ldy1/a;

.field private final b:Ldw/b;

.field private final c:Ltr2/n;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldy1/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldy1/a;Ldw/b;Ltr2/n;)V
    .locals 1

    const-string v0, "memfaultInitializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunkSenderBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldy1/e;->a:Ldy1/a;

    .line 3
    iput-object p2, p0, Ldy1/e;->b:Ldw/b;

    .line 4
    iput-object p3, p0, Ldy1/e;->c:Ltr2/n;

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ldy1/e;->d:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ldy1/a;Ldw/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PuffinMemfaultFactoryImpl"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ldy1/e;-><init>(Ldy1/a;Ldw/b;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ly42/a;)V
    .locals 9

    const-string v0, "macAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "puffin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldy1/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldy1/f;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v1, Ldy1/f;

    iget-object v2, p0, Ldy1/e;->a:Ldy1/a;

    iget-object v4, p0, Ldy1/e;->b:Ldw/b;

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Ldy1/f;-><init>(Ldy1/a;Lbc3/c0;Ldw/b;Ltr2/n;Ly42/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Ldy1/f;->r()V

    iget-object p2, p0, Ldy1/e;->d:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p2, p0, Ldy1/e;->c:Ltr2/n;

    const-string v0, "Invalid macAddress - "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    :goto_0
    return-void
.end method
