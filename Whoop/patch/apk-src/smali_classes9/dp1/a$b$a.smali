.class public final Ldp1/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldp1/a$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ldp1/a;


# direct methods
.method public constructor <init>(Lec3/m;Ldp1/a;)V
    .locals 0

    iput-object p1, p0, Ldp1/a$b$a;->w:Lec3/m;

    iput-object p2, p0, Ldp1/a$b$a;->x:Ldp1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Ldp1/a$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldp1/a$b$a$a;

    iget v1, v0, Ldp1/a$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldp1/a$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldp1/a$b$a$a;

    invoke-direct {v0, p0, p2}, Ldp1/a$b$a$a;-><init>(Ldp1/a$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldp1/a$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldp1/a$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldp1/a$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ldp1/a$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ldp1/a$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldp1/a$b$a;->w:Lec3/m;

    check-cast p1, Lzo1/c;

    instance-of v2, p1, Lzo1/c$e;

    if-eqz v2, :cond_3

    sget-object p1, Lcp1/k$i;->a:Lcp1/k$i;

    goto/16 :goto_2

    :cond_3
    instance-of v2, p1, Lzo1/c$d;

    if-eqz v2, :cond_4

    new-instance v2, Lcp1/k$d;

    check-cast p1, Lzo1/c$d;

    invoke-virtual {p1}, Lzo1/c$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcp1/k$d;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object p1, v2

    goto/16 :goto_2

    :cond_4
    instance-of v2, p1, Lzo1/c$k;

    if-eqz v2, :cond_5

    iget-object v2, p0, Ldp1/a$b$a;->x:Ldp1/a;

    check-cast p1, Lzo1/c$k;

    invoke-static {v2, p1}, Ldp1/a;->a(Ldp1/a;Lzo1/c$k;)Lcp1/k;

    move-result-object p1

    goto/16 :goto_2

    :cond_5
    instance-of v2, p1, Lzo1/c$h;

    if-eqz v2, :cond_6

    sget-object p1, Lcp1/k$p;->a:Lcp1/k$p;

    goto :goto_2

    :cond_6
    sget-object v2, Lzo1/c$i;->a:Lzo1/c$i;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object p1, Lcp1/k$r;->a:Lcp1/k$r;

    goto :goto_2

    :cond_7
    instance-of v2, p1, Lzo1/c$j;

    if-eqz v2, :cond_8

    sget-object p1, Lcp1/k$s;->a:Lcp1/k$s;

    goto :goto_2

    :cond_8
    instance-of v2, p1, Lzo1/c$f;

    if-eqz v2, :cond_9

    iget-object v2, p0, Ldp1/a$b$a;->x:Ldp1/a;

    check-cast p1, Lzo1/c$f;

    invoke-virtual {p1}, Lzo1/c$f;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;

    move-result-object v4

    invoke-virtual {p1}, Lzo1/c$f;->b()Z

    move-result p1

    invoke-static {v2, v4, p1}, Ldp1/a;->c(Ldp1/a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;Z)Lcp1/k$l;

    move-result-object p1

    goto :goto_2

    :cond_9
    instance-of v2, p1, Lzo1/c$c;

    if-eqz v2, :cond_a

    iget-object v2, p0, Ldp1/a$b$a;->x:Ldp1/a;

    check-cast p1, Lzo1/c$c;

    invoke-virtual {p1}, Lzo1/c$c;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;

    move-result-object p1

    invoke-static {v2, p1}, Ldp1/a;->b(Ldp1/a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;)Lcp1/k$c;

    move-result-object p1

    goto :goto_2

    :cond_a
    instance-of v2, p1, Lzo1/c$b;

    if-eqz v2, :cond_b

    new-instance v2, Lcp1/k$b;

    check-cast p1, Lzo1/c$b;

    invoke-virtual {p1}, Lzo1/c$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcp1/k$b;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_b
    instance-of v2, p1, Lzo1/c$g;

    if-eqz v2, :cond_c

    new-instance v2, Lcp1/k$o;

    check-cast p1, Lzo1/c$g;

    invoke-virtual {p1}, Lzo1/c$g;->a()Z

    move-result p1

    invoke-direct {v2, p1}, Lcp1/k$o;-><init>(Z)V

    goto :goto_1

    :cond_c
    sget-object v2, Lzo1/c$a;->a:Lzo1/c$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    sget-object p1, Lcp1/k$a;->a:Lcp1/k$a;

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Ldp1/a$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Ldp1/a$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Ldp1/a$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Ldp1/a$b$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Ldp1/a$b$a$a;->H:I

    iput v3, v0, Ldp1/a$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    return-object v1

    :cond_d
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
