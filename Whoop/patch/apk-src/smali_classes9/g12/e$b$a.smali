.class public final Lg12/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg12/e$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Lg12/e;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lg12/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lg12/e$b$a;->w:Lec3/m;

    iput-object p2, p0, Lg12/e$b$a;->x:Lg12/e;

    iput-object p3, p0, Lg12/e$b$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lg12/e$b$a;->z:Ljava/lang/String;

    iput-object p5, p0, Lg12/e$b$a;->E:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lg12/e$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg12/e$b$a$a;

    iget v1, v0, Lg12/e$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg12/e$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg12/e$b$a$a;

    invoke-direct {v0, p0, p2}, Lg12/e$b$a$a;-><init>(Lg12/e$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lg12/e$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg12/e$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lg12/e$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lg12/e$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lg12/e$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lg12/e$b$a;->w:Lec3/m;

    check-cast p1, Ljava/lang/String;

    iget-object v2, p0, Lg12/e$b$a;->x:Lg12/e;

    invoke-static {v2, p1}, Lg12/e;->d(Lg12/e;Ljava/lang/String;)V

    new-instance v2, Lf12/a$a;

    iget-object v4, p0, Lg12/e$b$a;->y:Ljava/lang/String;

    iget-object v5, p0, Lg12/e$b$a;->z:Ljava/lang/String;

    iget-object v6, p0, Lg12/e$b$a;->E:Ljava/lang/String;

    invoke-direct {v2, v4, p1, v5, v6}, Lf12/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lg12/e$b$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lg12/e$b$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lg12/e$b$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lg12/e$b$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lg12/e$b$a$a;->H:I

    iput v3, v0, Lg12/e$b$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
