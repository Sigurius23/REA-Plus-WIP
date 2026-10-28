.class public final Lip2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lip2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lnp2/a$m;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lnp2/a$m;)V",
        "Lnp2/a$a;",
        "a",
        "(Lnp2/a$a;)V",
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

    iput-object p1, p0, Lip2/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lnp2/a$m;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lnp2/a$a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnp2/a$p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lip2/a;->a:Lfi0/a;

    sget-object v1, Lmn2/b;->Companion:Lmn2/b$a;

    check-cast p1, Lnp2/a$p;

    invoke-virtual {p1}, Lnp2/a$p;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmn2/b$a;->a(Ljava/lang/String;)Lmn2/b;

    move-result-object p1

    invoke-static {v0, p1}, Lip2/b;->c(Lfi0/a;Lmn2/b;)V

    return-void

    :cond_0
    instance-of v0, p1, Lnp2/a$i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lip2/a;->a:Lfi0/a;

    sget-object v1, Lmn2/b;->Companion:Lmn2/b$a;

    check-cast p1, Lnp2/a$i;

    invoke-virtual {p1}, Lnp2/a$i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmn2/b$a;->a(Ljava/lang/String;)Lmn2/b;

    move-result-object p1

    invoke-static {v0, p1}, Lip2/b;->a(Lfi0/a;Lmn2/b;)V

    return-void

    :cond_1
    instance-of v0, p1, Lnp2/a$g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lip2/a;->a:Lfi0/a;

    sget-object v1, Lmn2/b;->Companion:Lmn2/b$a;

    check-cast p1, Lnp2/a$g;

    invoke-virtual {p1}, Lnp2/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmn2/b$a;->a(Ljava/lang/String;)Lmn2/b;

    move-result-object p1

    invoke-static {v0, p1}, Lip2/b;->b(Lfi0/a;Lmn2/b;)V

    return-void

    :cond_2
    instance-of v0, p1, Lnp2/a$m;

    if-eqz v0, :cond_3

    check-cast p1, Lnp2/a$m;

    invoke-direct {p0, p1}, Lip2/a;->b(Lnp2/a$m;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
