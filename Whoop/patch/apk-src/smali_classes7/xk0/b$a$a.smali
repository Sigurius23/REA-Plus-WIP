.class final Lxk0/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxk0/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxk0/b$a$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lxk0/b;


# direct methods
.method public constructor <init>(Lxk0/b;)V
    .locals 0

    iput-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lnl0/m;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lxk0/b$a$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-static {p1, p2}, Lxk0/b;->g(Lxk0/b;Z)V

    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lxk0/b;->f(Lxk0/b;Ljava/lang/Long;)V

    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-static {p1}, Lxk0/b;->c(Lxk0/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "Response received or error occurred"

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-static {p1}, Lxk0/b;->b(Lxk0/b;)Lzr2/a;

    move-result-object v1

    invoke-interface {v1}, Lzr2/a;->b()J

    move-result-wide v1

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    invoke-static {p1, v3}, Lxk0/b;->f(Lxk0/b;Ljava/lang/Long;)V

    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-static {p1, v0}, Lxk0/b;->g(Lxk0/b;Z)V

    iget-object p1, p0, Lxk0/b$a$a;->w:Lxk0/b;

    invoke-static {p1}, Lxk0/b;->c(Lxk0/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "Message sent, waiting for response"

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnl0/m;

    invoke-virtual {p0, p1, p2}, Lxk0/b$a$a;->b(Lnl0/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
