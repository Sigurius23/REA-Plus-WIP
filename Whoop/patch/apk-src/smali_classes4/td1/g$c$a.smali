.class public final Ltd1/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd1/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Ltd1/g$c$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltd1/g$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltd1/g$c$a$a;

    iget v1, v0, Ltd1/g$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltd1/g$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltd1/g$c$a$a;

    invoke-direct {v0, p0, p2}, Ltd1/g$c$a$a;-><init>(Ltd1/g$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ltd1/g$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltd1/g$c$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    iget-object p1, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    check-cast p1, Ltd1/f;

    iget-object p1, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget p1, v0, Ltd1/g$c$a$a;->H:I

    iget-object v2, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    check-cast v3, Ltd1/f;

    iget-object v3, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget p1, v0, Ltd1/g$c$a$a;->H:I

    iget-object v2, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    check-cast v3, Ltd1/f;

    iget-object v3, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltd1/g$c$a;->w:Lec3/m;

    check-cast p1, Ltd1/f;

    sget-object v2, Ltd1/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v2, v2, v8

    const/4 v8, 0x0

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_6

    iput-object v7, v0, Ltd1/g$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$c$a$a;->H:I

    iput v3, v0, Ltd1/g$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_3

    :cond_6
    iput-object v7, v0, Ltd1/g$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$c$a$a;->H:I

    iput v6, v0, Ltd1/g$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v2, p2

    move p1, v8

    :goto_1
    iput-object v7, v0, Ltd1/g$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Ltd1/g$c$a$a;->H:I

    iput v5, v0, Ltd1/g$c$a$a;->x:I

    const-wide/16 v5, 0xbb8

    invoke-static {v5, v6, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    sget-object p2, Ltd1/f;->NA:Ltd1/f;

    iput-object v7, v0, Ltd1/g$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$c$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Ltd1/g$c$a$a;->H:I

    iput v4, v0, Ltd1/g$c$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
