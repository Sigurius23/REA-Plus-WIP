.class public final Lla2/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla2/b$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lla2/b;


# direct methods
.method public constructor <init>(Lec3/m;Lla2/b;)V
    .locals 0

    iput-object p1, p0, Lla2/b$a$a;->w:Lec3/m;

    iput-object p2, p0, Lla2/b$a$a;->x:Lla2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lla2/b$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lla2/b$a$a$a;

    iget v1, v0, Lla2/b$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lla2/b$a$a$a;->x:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lla2/b$a$a$a;

    invoke-direct {v0, p0, p2}, Lla2/b$a$a$a;-><init>(Lla2/b$a$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lla2/b$a$a$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lla2/b$a$a$a;->x:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lla2/b$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v6, Lla2/b$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lla2/b$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v6, Lla2/b$a$a$a;->K:I

    iget-object v1, v6, Lla2/b$a$a$a;->J:Ljava/lang/Object;

    check-cast v1, Lla2/a;

    iget-object v1, v6, Lla2/b$a$a$a;->I:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, v6, Lla2/b$a$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, Lla2/b$a$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v6, Lla2/b$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lla2/b$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lla2/b$a$a;->w:Lec3/m;

    check-cast p1, Lla2/a;

    instance-of p1, p1, Lla2/a$a;

    if-eqz p1, :cond_9

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lla2/b$a$a;->x:Lla2/b;

    invoke-static {p1}, Lla2/b;->e(Lla2/b;)Ltr2/n;

    move-result-object p1

    new-instance v5, Lla2/b$b;

    iget-object v3, p0, Lla2/b$a$a;->x:Lla2/b;

    invoke-direct {v5, v3, v10}, Lla2/b$b;-><init>(Lla2/b;Lq83/d;)V

    iput-object v10, v6, Lla2/b$a$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->F:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->G:Ljava/lang/Object;

    iput-object p2, v6, Lla2/b$a$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->I:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->J:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v6, Lla2/b$a$a$a;->K:I

    iput v11, v6, Lla2/b$a$a$a;->L:I

    iput v2, v6, Lla2/b$a$a$a;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_5

    :cond_4
    move-object v1, p2

    move-object p2, p1

    move p1, v11

    :goto_2
    check-cast p2, Lu02/a;

    instance-of v2, p2, Lu02/a$b;

    if-eqz v2, :cond_5

    sget-object p2, Lla2/c$a;->a:Lla2/c$a;

    goto :goto_4

    :cond_5
    instance-of v2, p2, Lu02/a$c;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lla2/b$a$a;->x:Lla2/b;

    invoke-static {v2}, Lla2/b;->c(Lla2/b;)Lha2/a;

    move-result-object v2

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    invoke-virtual {v3}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getSwitchCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->getTracking()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_6
    move-object v3, v10

    :goto_3
    invoke-virtual {v2, v3}, Lha2/a;->b(Ljava/lang/String;)V

    new-instance v2, Lla2/c$b;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    invoke-direct {v2, p2}, Lla2/c$b;-><init>(Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;)V

    move-object p2, v2

    :goto_4
    iput-object v10, v6, Lla2/b$a$a$a;->y:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->E:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->F:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->G:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->H:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->I:Ljava/lang/Object;

    iput-object v10, v6, Lla2/b$a$a$a;->J:Ljava/lang/Object;

    iput p1, v6, Lla2/b$a$a$a;->K:I

    iput v9, v6, Lla2/b$a$a$a;->x:I

    invoke-interface {v1, p2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_5
    return-object v0

    :cond_7
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
