.class public final Lrx0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lrx0/d;",
        "",
        "Lad3/c;",
        "json",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Lad3/c;Ljb1/a;)V",
        "",
        "rawJson",
        "Lrx0/c;",
        "a",
        "(Ljava/lang/String;)Lrx0/c;",
        "Lad3/c;",
        "b",
        "Ljb1/a;",
        "debug-tools_release"
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
.field private final a:Lad3/c;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lad3/c;Ljb1/a;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrx0/d;->a:Lad3/c;

    iput-object p2, p0, Lrx0/d;->b:Ljb1/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lrx0/c;
    .locals 4

    const-string v0, "Invalid JSON"

    const-string v1, "rawJson"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lrx0/c$a;->a:Lrx0/c$a;

    return-object p1

    :cond_0
    iget-object v1, p0, Lrx0/d;->a:Lad3/c;

    iget-object v1, v1, Lad3/c;->b:Lcd3/f;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-virtual {v1, v2, v3}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance p1, Lrx0/c$b;

    const-string v0, "No design-model serializer registered"

    invoke-direct {p1, v0}, Lrx0/c$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    :try_start_0
    iget-object v2, p0, Lrx0/d;->a:Lad3/c;

    check-cast v1, Lwc3/b;

    invoke-virtual {v2, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lrx0/d;->b:Ljb1/a;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm91/o;

    if-eqz p1, :cond_2

    new-instance v0, Lrx0/c$c;

    invoke-direct {v0, p1}, Lrx0/c$c;-><init>(Lm91/o;)V

    return-object v0

    :cond_2
    new-instance p1, Lrx0/c$b;

    const-string v0, "Unknown or unsupported design model type"

    invoke-direct {p1, v0}, Lrx0/c$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    new-instance v1, Lrx0/c$b;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-direct {v1, v0}, Lrx0/c$b;-><init>(Ljava/lang/String;)V

    return-object v1

    :goto_2
    new-instance v1, Lrx0/c$b;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, p1

    :goto_3
    invoke-direct {v1, v0}, Lrx0/c$b;-><init>(Ljava/lang/String;)V

    return-object v1
.end method
