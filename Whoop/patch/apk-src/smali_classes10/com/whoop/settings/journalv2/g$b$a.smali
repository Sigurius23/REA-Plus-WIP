.class public final Lcom/whoop/settings/journalv2/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/journalv2/g$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lcom/whoop/settings/journalv2/g;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/settings/journalv2/g;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/journalv2/g$b$a;->w:Lec3/m;

    iput-object p2, p0, Lcom/whoop/settings/journalv2/g$b$a;->x:Lcom/whoop/settings/journalv2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/whoop/settings/journalv2/g$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/settings/journalv2/g$b$a$a;

    iget v1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/settings/journalv2/g$b$a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/settings/journalv2/g$b$a$a;-><init>(Lcom/whoop/settings/journalv2/g$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/settings/journalv2/g$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->L:I

    iget-object v2, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->K:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/settings/journalv2/i;

    iget-object v4, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->J:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/settings/journalv2/f;

    iget-object v4, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->I:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    iget-object v4, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->H:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v6, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->G:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v6, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->E:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/settings/journalv2/g$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/settings/journalv2/g$b$a;->w:Lec3/m;

    check-cast p1, Lcom/whoop/settings/journalv2/f;

    iget-object v2, p0, Lcom/whoop/settings/journalv2/g$b$a;->x:Lcom/whoop/settings/journalv2/g;

    invoke-static {v2}, Lcom/whoop/settings/journalv2/g;->j(Lcom/whoop/settings/journalv2/g;)Lcom/whoop/settings/journalv2/i;

    move-result-object v2

    iget-object v6, p0, Lcom/whoop/settings/journalv2/g$b$a;->x:Lcom/whoop/settings/journalv2/g;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->J:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->K:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->L:I

    iput v7, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->M:I

    iput v4, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->x:I

    invoke-static {v6, p1, v0}, Lcom/whoop/settings/journalv2/g;->l(Lcom/whoop/settings/journalv2/g;Lcom/whoop/settings/journalv2/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, p2

    move-object p2, p1

    move p1, v7

    :goto_1
    check-cast p2, Lcom/whoop/settings/journalv2/d;

    invoke-virtual {v2, p2}, Lcom/whoop/settings/journalv2/i;->d(Lcom/whoop/settings/journalv2/d;)Lcom/whoop/settings/journalv2/h;

    move-result-object p2

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->J:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->K:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->L:I

    iput v3, v0, Lcom/whoop/settings/journalv2/g$b$a$a;->x:I

    invoke-interface {v4, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
