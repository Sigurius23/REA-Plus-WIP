.class public final Lzu0/a$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu0/a$h;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lzu0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lzu0/a;)V
    .locals 0

    iput-object p1, p0, Lzu0/a$h$a;->w:Lec3/m;

    iput-object p2, p0, Lzu0/a$h$a;->x:Lzu0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lzu0/a$h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzu0/a$h$a$a;

    iget v1, v0, Lzu0/a$h$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzu0/a$h$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzu0/a$h$a$a;

    invoke-direct {v0, p0, p2}, Lzu0/a$h$a$a;-><init>(Lzu0/a$h$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lzu0/a$h$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzu0/a$h$a$a;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lzu0/a$h$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lzu0/a$h$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lzu0/a$h$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lzu0/a$h$a$a;->K:I

    iget-object v2, v0, Lzu0/a$h$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lus0/b;

    iget-object v2, v0, Lzu0/a$h$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lzu0/a$h$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lzu0/a$h$a$a;->G:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v5, v0, Lzu0/a$h$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lzu0/a$h$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lzu0/a$h$a;->w:Lec3/m;

    check-cast p1, Lus0/b;

    iget-object p2, p0, Lzu0/a$h$a;->x:Lzu0/a;

    iput-object v6, v0, Lzu0/a$h$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lzu0/a$h$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->J:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, v0, Lzu0/a$h$a$a;->K:I

    iput v7, v0, Lzu0/a$h$a$a;->L:I

    iput v5, v0, Lzu0/a$h$a$a;->x:I

    invoke-static {p2, p1, v0}, Lzu0/a;->e(Lzu0/a;Lus0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v7

    :goto_1
    iput-object v6, v0, Lzu0/a$h$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->G:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$h$a$a;->J:Ljava/lang/Object;

    iput p1, v0, Lzu0/a$h$a$a;->K:I

    iput v4, v0, Lzu0/a$h$a$a;->x:I

    invoke-interface {v2, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    return-object v3
.end method
