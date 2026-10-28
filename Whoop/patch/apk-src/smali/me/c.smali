.class public final Lme/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lff/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lme/c;->w:I

    iput-object p1, p0, Lme/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lme/c;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lme/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lme/f;

    iget v1, v0, Lme/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lme/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lme/f;

    invoke-direct {v0, p0, p1}, Lme/f;-><init>(Lme/c;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lme/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lme/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lme/c;->x:Ljava/lang/Object;

    check-cast p1, Ls/m2;

    iput v3, v0, Lme/f;->y:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    check-cast p1, Lce/k;

    invoke-static {p1}, Lo73/a;->M(Lce/k;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    return-object v1

    :pswitch_0
    iget-object p1, p0, Lme/c;->x:Ljava/lang/Object;

    check-cast p1, Lvg/n;

    invoke-static {}, Lyd/f;->f()Ljf/a;

    move-result-object v0

    iget-object v0, v0, Ljf/a;->c:Ljava/lang/String;

    check-cast p1, Lvg/r;

    invoke-virtual {p1, v0}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
