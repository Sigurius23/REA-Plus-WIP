.class public final Lvx1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvx1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvx1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "d",
        "()V",
        "",
        "value",
        "a",
        "(Ljava/lang/String;)V",
        "b",
        "Lvx1/a;",
        "event",
        "c",
        "(Lvx1/a;)V",
        "Lfi0/a;",
        "membership_release"
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
.field public static final b:Lvx1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvx1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvx1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvx1/b;->b:Lvx1/b$a;

    const/16 v0, 0x8

    sput v0, Lvx1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvx1/b;->a:Lfi0/a;

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lvx1/b;->a:Lfi0/a;

    const-string v1, "screen_name"

    const-string v2, "return_label"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v3, "cta"

    const-string v4, "Returns"

    const-string v1, "returns"

    const-string v2, "click"

    move-object v5, p1

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final b()V
    .locals 7

    iget-object v0, p0, Lvx1/b;->a:Lfi0/a;

    const-string v1, "screen_name"

    const-string v2, "return_label"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v4, "Returns"

    const-string v5, "return_policy"

    const-string v1, "returns"

    const-string v2, "click"

    const-string v3, "link"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final d()V
    .locals 9

    iget-object v0, p0, Lvx1/b;->a:Lfi0/a;

    const-string v1, "screen_name"

    const-string v2, "return_label"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "returns"

    const-string v2, "view"

    const/4 v3, 0x0

    const-string v4, "Returns"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(Lvx1/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvx1/a$c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lvx1/b;->d()V

    return-void

    :cond_0
    instance-of v0, p1, Lvx1/a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lvx1/a$a;

    invoke-virtual {p1}, Lvx1/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lvx1/b;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of p1, p1, Lvx1/a$b;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lvx1/b;->b()V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
