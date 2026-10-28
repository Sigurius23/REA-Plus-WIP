.class public final Lor2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0008J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0008J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0008Jc\u0010\u001d\u001a\u00020\u00062\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0016\u0008\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lor2/e;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "i",
        "()V",
        "",
        "success",
        "",
        "reason",
        "f",
        "(ZLjava/lang/String;)V",
        "g",
        "h",
        "a",
        "(Z)V",
        "isValid",
        "b",
        "j",
        "eventName",
        "category",
        "action",
        "label",
        "value",
        "",
        "otherProperties",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Lor2/d;",
        "event",
        "c",
        "(Lor2/d;)V",
        "Lfi0/a;",
        "core_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/e;->a:Lfi0/a;

    return-void
.end method

.method private final a(Z)V
    .locals 9

    if-eqz p1, :cond_0

    const-string p1, "success"

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_0
    const-string p1, "failed"

    goto :goto_0

    :goto_1
    const/16 v7, 0x29

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "change_password_screen"

    const-string v3, "change_password"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final b(Z)V
    .locals 9

    if-eqz p1, :cond_0

    const-string p1, "enters_confirm_password"

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const-string p1, "invalid_confirm_password"

    goto :goto_0

    :goto_1
    const/16 v7, 0x39

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "change_password_screen"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lor2/e;->a:Lfi0/a;

    move-object v4, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-string p1, "Auth Flow"

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p8, v0

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    goto :goto_0

    :cond_5
    move-object p8, p6

    move-object p7, p5

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    :goto_0
    invoke-direct/range {p2 .. p8}, Lor2/e;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final f(ZLjava/lang/String;)V
    .locals 9

    if-eqz p1, :cond_0

    const-string p1, "success"

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_0
    const-string p1, "failed"

    goto :goto_0

    :goto_1
    const-string p1, "reason"

    invoke-static {p1, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "anywhere"

    const-string v3, "refresh_token"

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final g()V
    .locals 9

    const/16 v7, 0x29

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "Settings"

    const-string v3, "sign_out"

    const/4 v4, 0x0

    const-string v5, "pressed_sign_out"

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final h()V
    .locals 9

    const/16 v7, 0x39

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "change_password_screen"

    const-string v3, "View"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final i()V
    .locals 9

    const/16 v7, 0x39

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "forgot_password_screen"

    const-string v3, "View"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final j()V
    .locals 11

    const-string v0, "Welcome Screen Enabled"

    const-string v1, "No"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x19

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-string v4, "sign_in_screen"

    const-string v5, "View"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v10}, Lor2/e;->e(Lor2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(Lor2/d;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lor2/d$g;->a:Lor2/d$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lor2/e;->j()V

    return-void

    :cond_0
    instance-of v0, p1, Lor2/d$b;

    if-eqz v0, :cond_1

    check-cast p1, Lor2/d$b;

    invoke-virtual {p1}, Lor2/d$b;->a()Z

    move-result p1

    invoke-direct {p0, p1}, Lor2/e;->b(Z)V

    return-void

    :cond_1
    instance-of v0, p1, Lor2/d$a;

    if-eqz v0, :cond_2

    check-cast p1, Lor2/d$a;

    invoke-virtual {p1}, Lor2/d$a;->a()Z

    move-result p1

    invoke-direct {p0, p1}, Lor2/e;->a(Z)V

    return-void

    :cond_2
    sget-object v0, Lor2/d$e;->a:Lor2/d$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lor2/e;->h()V

    return-void

    :cond_3
    sget-object v0, Lor2/d$d;->a:Lor2/d$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lor2/e;->g()V

    return-void

    :cond_4
    instance-of v0, p1, Lor2/d$c;

    if-eqz v0, :cond_5

    check-cast p1, Lor2/d$c;

    invoke-virtual {p1}, Lor2/d$c;->b()Z

    move-result v0

    invoke-virtual {p1}, Lor2/d$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lor2/e;->f(ZLjava/lang/String;)V

    return-void

    :cond_5
    sget-object v0, Lor2/d$f;->a:Lor2/d$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lor2/e;->i()V

    return-void

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
