.class final Lxk0/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxk0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

    iput-object p1, p0, Lxk0/b$b$a;->w:Lxk0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lnl0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnl0/c;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lxk0/b$b$a;->w:Lxk0/b;

    invoke-virtual {p2}, Lnl0/c;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lnl0/c;->g()Lnl0/b;

    move-result-object v1

    sget-object v2, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {p2}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lxk0/b;->a(Lxk0/b;)Lxk0/a;

    move-result-object v0

    invoke-virtual {p1}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lxk0/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnl0/a;

    invoke-virtual {p0, p1, p2}, Lxk0/b$b$a;->b(Lnl0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
