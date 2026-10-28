.class public final Lip1/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip1/a$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lip1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lip1/a;)V
    .locals 0

    iput-object p1, p0, Lip1/a$b$a;->w:Lec3/m;

    iput-object p2, p0, Lip1/a$b$a;->x:Lip1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lip1/a$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lip1/a$b$a$a;

    iget v1, v0, Lip1/a$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lip1/a$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lip1/a$b$a$a;

    invoke-direct {v0, p0, p2}, Lip1/a$b$a$a;-><init>(Lip1/a$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lip1/a$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lip1/a$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lip1/a$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lip1/a$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lip1/a$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lip1/a$b$a;->w:Lec3/m;

    check-cast p1, Lfp1/e;

    sget-object v2, Lfp1/e$b;->a:Lfp1/e$b;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object p1, Lhp1/h$d;->a:Lhp1/h$d;

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lfp1/e$a;

    if-eqz v2, :cond_4

    new-instance v2, Lhp1/h$c;

    check-cast p1, Lfp1/e$a;

    invoke-virtual {p1}, Lfp1/e$a;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v4

    invoke-virtual {p1}, Lfp1/e$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v4, p1}, Lhp1/h$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lfp1/e$f;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lip1/a$b$a;->x:Lip1/a;

    check-cast p1, Lfp1/e$f;

    invoke-static {v2, p1}, Lip1/a;->a(Lip1/a;Lfp1/e$f;)Lhp1/h;

    move-result-object p1

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lfp1/e$c;

    if-eqz v2, :cond_6

    new-instance v2, Lhp1/h$i;

    check-cast p1, Lfp1/e$c;

    invoke-virtual {p1}, Lfp1/e$c;->c()Z

    move-result p1

    invoke-direct {v2, p1}, Lhp1/h$i;-><init>(Z)V

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lfp1/e$e;

    if-eqz v2, :cond_7

    sget-object p1, Lhp1/h$l;->a:Lhp1/h$l;

    goto :goto_2

    :cond_7
    sget-object v2, Lfp1/e$d;->a:Lfp1/e$d;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lhp1/h$j;->a:Lhp1/h$j;

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lip1/a$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lip1/a$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lip1/a$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lip1/a$b$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lip1/a$b$a$a;->H:I

    iput v3, v0, Lip1/a$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
