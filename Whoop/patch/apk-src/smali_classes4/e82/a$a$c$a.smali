.class public final Le82/a$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le82/a$a$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Le82/a;

.field final synthetic y:Ljk0/d;


# direct methods
.method public constructor <init>(Lec3/m;Le82/a;Ljk0/d;)V
    .locals 0

    iput-object p1, p0, Le82/a$a$c$a;->w:Lec3/m;

    iput-object p2, p0, Le82/a$a$c$a;->x:Le82/a;

    iput-object p3, p0, Le82/a$a$c$a;->y:Ljk0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Le82/a$a$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le82/a$a$c$a$a;

    iget v1, v0, Le82/a$a$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le82/a$a$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Le82/a$a$c$a$a;

    invoke-direct {v0, p0, p2}, Le82/a$a$c$a$a;-><init>(Le82/a$a$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Le82/a$a$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le82/a$a$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le82/a$a$c$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lnt0/i;

    iget-object p1, v0, Le82/a$a$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Le82/a$a$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Le82/a$a$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Le82/a$a$c$a;->w:Lec3/m;

    check-cast p1, Llt0/k;

    iget-object v2, p0, Le82/a$a$c$a;->x:Le82/a;

    iget-object v4, p0, Le82/a$a$c$a;->y:Ljk0/d;

    invoke-static {v2, v4, p1}, Le82/a;->c(Le82/a;Ljk0/d;Llt0/k;)Lnt0/i;

    move-result-object p1

    if-eqz p1, :cond_3

    const/4 v2, 0x0

    iput-object v2, v0, Le82/a$a$c$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Le82/a$a$c$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Le82/a$a$c$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Le82/a$a$c$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Le82/a$a$c$a$a;->H:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Le82/a$a$c$a$a;->I:I

    iput v3, v0, Le82/a$a$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
