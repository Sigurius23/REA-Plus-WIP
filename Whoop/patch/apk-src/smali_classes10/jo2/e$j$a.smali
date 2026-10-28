.class public final Ljo2/e$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e$j;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

    iput-object p1, p0, Ljo2/e$j$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ljo2/e$j$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljo2/e$j$a$a;

    iget v3, v2, Ljo2/e$j$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ljo2/e$j$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Ljo2/e$j$a$a;

    invoke-direct {v2, v0, v1}, Ljo2/e$j$a$a;-><init>(Ljo2/e$j$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Ljo2/e$j$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ljo2/e$j$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Ljo2/e$j$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Ljo2/e$j$a$a;->E:Ljava/lang/Object;

    check-cast v2, Ljo2/e$j$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ljo2/e$j$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Ljo2/c;

    invoke-virtual {v4}, Ljo2/c;->k()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_3

    invoke-virtual {v4}, Ljo2/c;->l()Z

    move-result v6

    if-nez v6, :cond_3

    move v9, v5

    goto :goto_1

    :cond_3
    move v9, v7

    :goto_1
    invoke-virtual {v4}, Ljo2/c;->l()Z

    move-result v10

    invoke-virtual {v4}, Ljo2/c;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Ljo2/c;->d()Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v4}, Ljo2/c;->f()Lq20/e;

    move-result-object v15

    invoke-virtual {v4}, Ljo2/c;->j()Ljava/lang/String;

    move-result-object v11

    new-instance v8, Ljo2/b;

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v17}, Ljo2/b;-><init>(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    iput-object v4, v2, Ljo2/e$j$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Ljo2/e$j$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Ljo2/e$j$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Ljo2/e$j$a$a;->G:Ljava/lang/Object;

    iput v7, v2, Ljo2/e$j$a$a;->H:I

    iput v5, v2, Ljo2/e$j$a$a;->x:I

    invoke-interface {v1, v8, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
