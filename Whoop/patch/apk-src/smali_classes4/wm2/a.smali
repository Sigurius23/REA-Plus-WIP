.class public final Lwm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lwm2/a;",
        "",
        "<init>",
        "()V",
        "Lum2/b;",
        "domainState",
        "Lxm2/a;",
        "a",
        "(Lum2/b;)Lxm2/a;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lum2/b;)Lxm2/a;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lum2/b;->b()Lxm2/d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lxm2/d;->b()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lxm2/d;->a()Lxm2/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lxm2/a$b;

    invoke-virtual {p1}, Lxm2/d;->a()Lxm2/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lxm2/a$b;-><init>(Lxm2/c;)V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lxm2/a$a;->a:Lxm2/a$a;

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    sget-object p1, Lxm2/a$a;->a:Lxm2/a$a;

    return-object p1
.end method
