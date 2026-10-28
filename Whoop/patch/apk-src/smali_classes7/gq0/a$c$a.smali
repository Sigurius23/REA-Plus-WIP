.class public final Lgq0/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgq0/a$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lgq0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lgq0/a;)V
    .locals 0

    iput-object p1, p0, Lgq0/a$c$a;->w:Lec3/m;

    iput-object p2, p0, Lgq0/a$c$a;->x:Lgq0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lgq0/a$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgq0/a$c$a$a;

    iget v1, v0, Lgq0/a$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgq0/a$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgq0/a$c$a$a;

    invoke-direct {v0, p0, p2}, Lgq0/a$c$a$a;-><init>(Lgq0/a$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lgq0/a$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgq0/a$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lgq0/a$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lgq0/a$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lgq0/a$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lgq0/a$c$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    iget-object v2, p0, Lgq0/a$c$a;->x:Lgq0/a;

    invoke-static {v2, p1}, Lgq0/a;->c(Lgq0/a;Lpm0/a;)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lgq0/a$c$a;->x:Lgq0/a;

    invoke-static {p1}, Lgq0/a;->b(Lgq0/a;)Lyp0/a;

    move-result-object p1

    invoke-interface {p1}, Lyp0/a;->a()Z

    move-result p1

    if-nez p1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v4, 0x0

    iput-object v4, v0, Lgq0/a$c$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lgq0/a$c$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lgq0/a$c$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lgq0/a$c$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lgq0/a$c$a$a;->H:I

    iput v3, v0, Lgq0/a$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
