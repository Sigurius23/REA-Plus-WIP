.class final Lta0/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lta0/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lta0/c;


# direct methods
.method public constructor <init>(Lec3/m;Lta0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lta0/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lta0/c$d$a;->w:Lec3/m;

    iput-object p2, p0, Lta0/c$d$a;->x:Lta0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lta0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lta0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lta0/a$a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_4

    check-cast p1, Lta0/a$a;

    invoke-virtual {p1}, Lta0/a$a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lta0/c$d$a;->w:Lec3/m;

    iget-object v2, p0, Lta0/c$d$a;->x:Lta0/c;

    invoke-virtual {p1}, Lta0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lta0/c;->c(Lta0/c;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    iget-object p1, p0, Lta0/c$d$a;->w:Lec3/m;

    sget-object v0, Lta0/b$a;->a:Lta0/b$a;

    invoke-interface {p1, v0, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    return-object v1

    :cond_4
    instance-of p1, p1, Lta0/a$b;

    if-eqz p1, :cond_5

    return-object v1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lta0/a;

    invoke-virtual {p0, p1, p2}, Lta0/c$d$a;->b(Lta0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
