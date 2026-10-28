.class public final Ljx1/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ljx1/a0;",
        "",
        "<init>",
        "()V",
        "Llx1/d;",
        "event",
        "Lex1/a;",
        "c",
        "(Llx1/d;)Lex1/a;",
        "Llx1/c;",
        "Lfx1/a;",
        "d",
        "(Llx1/c;)Lfx1/a;",
        "Llx1/b;",
        "Ldx1/a;",
        "b",
        "(Llx1/b;)Ldx1/a;",
        "Llx1/a;",
        "Lbx1/a;",
        "a",
        "(Llx1/a;)Lbx1/a;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llx1/a;)Lbx1/a;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llx1/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lbx1/a$a;

    check-cast p1, Llx1/a$a;

    invoke-virtual {p1}, Llx1/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llx1/a$a;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Llx1/a$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lbx1/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Llx1/b;)Ldx1/a;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llx1/b$a;

    if-eqz v0, :cond_0

    sget-object p1, Ldx1/a$a;->a:Ldx1/a$a;

    return-object p1

    :cond_0
    sget-object v0, Llx1/b$b;->a:Llx1/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ldx1/a$b;->a:Ldx1/a$b;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Llx1/d;)Lex1/a;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llx1/d$b;

    if-eqz v0, :cond_0

    sget-object p1, Lex1/a$b;->a:Lex1/a$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Llx1/d$a;

    if-eqz v0, :cond_1

    new-instance v0, Lex1/a$a;

    check-cast p1, Llx1/d$a;

    invoke-virtual {p1}, Llx1/d$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llx1/d$a;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lex1/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0

    :cond_1
    sget-object v0, Llx1/d$c;->a:Llx1/d$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lex1/a$c;->a:Lex1/a$c;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(Llx1/c;)Lfx1/a;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llx1/c$c;

    if-eqz v0, :cond_0

    new-instance v0, Lfx1/a$c;

    check-cast p1, Llx1/c$c;

    invoke-virtual {p1}, Llx1/c$c;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lfx1/a$c;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_0
    sget-object v0, Llx1/c$e;->a:Llx1/c$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lfx1/a$e;->a:Lfx1/a$e;

    return-object p1

    :cond_1
    instance-of v0, p1, Llx1/c$g;

    if-eqz v0, :cond_2

    new-instance v0, Lfx1/a$g;

    check-cast p1, Llx1/c$g;

    invoke-virtual {p1}, Llx1/c$g;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lfx1/a$g;-><init>(I)V

    return-object v0

    :cond_2
    instance-of v0, p1, Llx1/c$f;

    if-eqz v0, :cond_3

    new-instance v0, Lfx1/a$f;

    check-cast p1, Llx1/c$f;

    invoke-virtual {p1}, Llx1/c$f;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v1

    invoke-virtual {p1}, Llx1/c$f;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lfx1/a$f;-><init>(Lcom/whoop/payments/domain/models/Card;Z)V

    return-object v0

    :cond_3
    instance-of v0, p1, Llx1/c$a;

    if-eqz v0, :cond_4

    new-instance v0, Lfx1/a$a;

    check-cast p1, Llx1/c$a;

    invoke-virtual {p1}, Llx1/c$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llx1/c$a;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Llx1/c$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lfx1/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    return-object v0

    :cond_4
    instance-of v0, p1, Llx1/c$d;

    if-eqz v0, :cond_5

    sget-object p1, Lfx1/a$d;->a:Lfx1/a$d;

    return-object p1

    :cond_5
    instance-of p1, p1, Llx1/c$b;

    if-eqz p1, :cond_6

    sget-object p1, Lfx1/a$b;->a:Lfx1/a$b;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
