.class public final Lx42/a$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx42/a$d$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lx42/a;

.field final synthetic y:Ly42/a;


# direct methods
.method public constructor <init>(Lec3/m;Lx42/a;Ly42/a;)V
    .locals 0

    iput-object p1, p0, Lx42/a$d$a$a;->w:Lec3/m;

    iput-object p2, p0, Lx42/a$d$a$a;->x:Lx42/a;

    iput-object p3, p0, Lx42/a$d$a$a;->y:Ly42/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lx42/a$d$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lx42/a$d$a$a$a;

    iget v1, v0, Lx42/a$d$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx42/a$d$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx42/a$d$a$a$a;

    invoke-direct {v0, p0, p2}, Lx42/a$d$a$a$a;-><init>(Lx42/a$d$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lx42/a$d$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx42/a$d$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lx42/a$d$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lx42/a$d$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lx42/a$d$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lx42/a$d$a$a;->w:Lec3/m;

    check-cast p1, Lgt0/h;

    iget-object v2, p0, Lx42/a$d$a$a;->x:Lx42/a;

    invoke-static {v2}, Lx42/a;->c(Lx42/a;)Ltr2/n;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "firmware update observe flow got "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v2, v4, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Lx42/a$d$a$a;->y:Ly42/a;

    new-instance v4, Ll83/k;

    invoke-direct {v4, p1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lx42/a$d$a$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lx42/a$d$a$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lx42/a$d$a$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lx42/a$d$a$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lx42/a$d$a$a$a;->H:I

    iput v3, v0, Lx42/a$d$a$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
