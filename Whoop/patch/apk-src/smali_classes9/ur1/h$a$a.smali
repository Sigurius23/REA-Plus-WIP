.class public final Lur1/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/h$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lur1/h$a$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lur1/h$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lur1/h$a$a$a;

    iget v1, v0, Lur1/h$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lur1/h$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lur1/h$a$a$a;

    invoke-direct {v0, p0, p2}, Lur1/h$a$a$a;-><init>(Lur1/h$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lur1/h$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lur1/h$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lur1/h$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lur1/h$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lur1/h$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lur1/h$a$a;->w:Lec3/m;

    check-cast p1, Lh91/b;

    new-instance v2, Lur1/n$x;

    invoke-direct {v2, p1}, Lur1/n$x;-><init>(Lh91/b;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lur1/h$a$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lur1/h$a$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lur1/h$a$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lur1/h$a$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lur1/h$a$a$a;->H:I

    iput v3, v0, Lur1/h$a$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
