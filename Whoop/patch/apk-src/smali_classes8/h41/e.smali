.class public abstract Lh41/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh41/e$a;,
        Lh41/e$b;,
        Lh41/e$c;,
        Lh41/e$d;,
        Lh41/e$e;,
        Lh41/e$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0006\u000e\u000c\u0013\u0018\u0019\u0010B/\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0016\u001a\u0004\u0008\u0010\u0010\u0017\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lh41/e;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Li91/a;",
        "backgroundColor",
        "Ly81/e;",
        "textColor",
        "Lj91/b;",
        "priceAccentColor",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;)V",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Li91/a;",
        "()Li91/a;",
        "c",
        "Ly81/e;",
        "()Ly81/e;",
        "Lj91/b;",
        "()Lj91/b;",
        "f",
        "e",
        "Lh41/e$a;",
        "Lh41/e$b;",
        "Lh41/e$c;",
        "Lh41/e$d;",
        "Lh41/e$e;",
        "Lh41/e$f;",
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Li91/a;

.field private final c:Ly81/e;

.field private final d:Lj91/b;


# direct methods
.method private constructor <init>(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh41/e;->a:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lh41/e;->b:Li91/a;

    .line 5
    iput-object p3, p0, Lh41/e;->c:Ly81/e;

    .line 6
    iput-object p4, p0, Lh41/e;->d:Lj91/b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    sget-object p3, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p5, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lh41/e;-><init>(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lh41/e;-><init>(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;)V

    return-void
.end method


# virtual methods
.method public final a()Li91/a;
    .locals 1

    iget-object v0, p0, Lh41/e;->b:Li91/a;

    return-object v0
.end method

.method public final b()Lj91/b;
    .locals 1

    iget-object v0, p0, Lh41/e;->d:Lj91/b;

    return-object v0
.end method

.method public final c()Ly81/e;
    .locals 1

    iget-object v0, p0, Lh41/e;->c:Ly81/e;

    return-object v0
.end method

.method public abstract d()Lcom/whoop/design/util/TextResource;
.end method
