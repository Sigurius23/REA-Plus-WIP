.class public final Lj92/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj92/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00088\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00088\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00088\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lj92/i$a;",
        "",
        "<init>",
        "()V",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "Lud3/f0;",
        "chain",
        "",
        "accessToken",
        "Lud3/o0;",
        "b",
        "(Lj92/t;Lud3/f0;Ljava/lang/String;)Lud3/o0;",
        "Lud3/e0;",
        "request",
        "",
        "d",
        "(Lj92/t;Lud3/e0;)Z",
        "Ljava/util/Locale;",
        "LOCALE_HEADER_FORMAT",
        "Ljava/util/Locale;",
        "c",
        "()Ljava/util/Locale;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
        "WHOOP_SUB_DOMAIN",
        "Ljava/lang/String;",
        "HEADER_AUTH",
        "AUTH_TOKEN_PREFIX",
        "AUTH_TOKEN_FORMAT",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj92/i$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lj92/i$a;Lj92/t;Lud3/f0;Ljava/lang/String;)Lud3/o0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj92/i$a;->b(Lj92/t;Lud3/f0;Ljava/lang/String;)Lud3/o0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lj92/t;Lud3/f0;Ljava/lang/String;)Lud3/o0;
    .locals 1

    check-cast p2, Lae3/i;

    iget-object v0, p2, Lae3/i;->e:Lud3/o0;

    iget-object v0, v0, Lud3/o0;->a:Lud3/e0;

    invoke-direct {p0, p1, v0}, Lj92/i$a;->d(Lj92/t;Lud3/e0;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lj92/i;->c()Ltr2/n;

    move-result-object p1

    iget-object p2, p2, Lae3/i;->e:Lud3/o0;

    iget-object p3, p2, Lud3/o0;->a:Lud3/e0;

    iget-object p3, p3, Lud3/e0;->d:Ljava/lang/String;

    const-string v0, "Non WHOOP domain, token will be not be included: "

    invoke-static {v0, p3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p3, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p2

    :cond_0
    iget-object p1, p2, Lae3/i;->e:Lud3/o0;

    invoke-virtual {p1}, Lud3/o0;->b()Lud3/n0;

    move-result-object p1

    invoke-virtual {p0}, Lj92/i$a;->c()Ljava/util/Locale;

    move-result-object p2

    const/4 v0, 0x1

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    const-string v0, "Bearer %s"

    invoke-static {p2, v0, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Authorization"

    invoke-virtual {p1, p3, p2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lud3/o0;

    invoke-direct {p2, p1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p2
.end method

.method private final d(Lj92/t;Lud3/e0;)Z
    .locals 0

    invoke-static {p1, p2}, Lj92/u;->b(Lj92/t;Lud3/e0;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final c()Ljava/util/Locale;
    .locals 1

    invoke-static {}, Lj92/i;->b()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method
