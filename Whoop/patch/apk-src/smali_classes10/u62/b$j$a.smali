.class public final Lu62/b$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu62/b$j;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lxj0/b;


# direct methods
.method public constructor <init>(Lec3/m;Lxj0/b;)V
    .locals 0

    iput-object p1, p0, Lu62/b$j$a;->w:Lec3/m;

    iput-object p2, p0, Lu62/b$j$a;->x:Lxj0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lu62/b$j$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu62/b$j$a$a;

    iget v1, v0, Lu62/b$j$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu62/b$j$a$a;->x:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lu62/b$j$a$a;

    invoke-direct {v0, p0, p2}, Lu62/b$j$a$a;-><init>(Lu62/b$j$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lu62/b$j$a$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lu62/b$j$a$a;->x:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lu62/b$j$a$a;->F:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v6, Lu62/b$j$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lu62/b$j$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v6, Lu62/b$j$a$a;->J:I

    iget-object v1, v6, Lu62/b$j$a$a;->I:Ljava/lang/Object;

    check-cast v1, Lvk0/i;

    iget-object v1, v6, Lu62/b$j$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, v6, Lu62/b$j$a$a;->G:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, Lu62/b$j$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v6, Lu62/b$j$a$a;->z:Ljava/lang/Object;

    check-cast v2, Lu62/b$j$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lu62/b$j$a;->w:Lec3/m;

    move-object v1, p1

    check-cast v1, Lvk0/i;

    move p1, v2

    iget-object v2, p0, Lu62/b$j$a;->x:Lxj0/b;

    iput-object v10, v6, Lu62/b$j$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->z:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->F:Ljava/lang/Object;

    iput-object p2, v6, Lu62/b$j$a$a;->G:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->I:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v6, Lu62/b$j$a$a;->J:I

    iput v11, v6, Lu62/b$j$a$a;->K:I

    iput p1, v6, Lu62/b$j$a$a;->x:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, p2

    move-object p2, p1

    move p1, v11

    :goto_2
    instance-of v2, p2, Ll83/m;

    if-eqz v2, :cond_5

    move-object p2, v10

    :cond_5
    instance-of v2, p2, Lzj0/w0;

    if-nez v2, :cond_6

    move-object p2, v10

    :cond_6
    check-cast p2, Lzj0/w0;

    iput-object v10, v6, Lu62/b$j$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->z:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->F:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->G:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Lu62/b$j$a$a;->I:Ljava/lang/Object;

    iput p1, v6, Lu62/b$j$a$a;->J:I

    iput v9, v6, Lu62/b$j$a$a;->x:I

    invoke-interface {v1, p2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
