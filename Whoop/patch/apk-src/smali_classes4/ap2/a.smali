.class public final Lap2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lap2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lep2/a$k;",
        "event",
        "",
        "source",
        "Ll83/a0;",
        "c",
        "(Lep2/a$k;Ljava/lang/String;)V",
        "Lep2/a$a;",
        "a",
        "(Lep2/a$a;Ljava/lang/String;)V",
        "Lfi0/a;",
        "universal-checkout_release"
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

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lap2/a;->a:Lfi0/a;

    return-void
.end method

.method public static synthetic b(Lap2/a;Lep2/a$a;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Lap2/a;->a(Lep2/a$a;Ljava/lang/String;)V

    return-void
.end method

.method private final c(Lep2/a$k;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p1}, Lep2/a$k;->a()Lm91/u;

    move-result-object p1

    instance-of v0, p1, Ls21/h;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lap2/a;->a:Lfi0/a;

    check-cast p1, Ls21/h;

    invoke-virtual {p1}, Ls21/h;->a()Ls21/b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ls21/b;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Ls21/h;->a()Ls21/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ls21/b;->d()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-static {v0, v1, v2, p2}, Lap2/b;->b(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lep2/a$a;Ljava/lang/String;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lep2/a$o;

    if-eqz v0, :cond_0

    iget-object p2, p0, Lap2/a;->a:Lfi0/a;

    check-cast p1, Lep2/a$o;

    invoke-virtual {p1}, Lep2/a$o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lep2/a$o;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lep2/a$o;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, v1, p1}, Lap2/b;->c(Lfi0/a;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lep2/a$f;

    if-eqz v0, :cond_1

    iget-object p2, p0, Lap2/a;->a:Lfi0/a;

    check-cast p1, Lep2/a$f;

    invoke-virtual {p1}, Lep2/a$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lap2/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lep2/a$k;

    if-eqz v0, :cond_2

    check-cast p1, Lep2/a$k;

    invoke-direct {p0, p1, p2}, Lap2/a;->c(Lep2/a$k;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
