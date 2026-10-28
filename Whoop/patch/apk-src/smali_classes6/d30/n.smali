.class public final Ld30/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/u;


# direct methods
.method public synthetic constructor <init>(Ld30/u;I)V
    .locals 0

    iput p2, p0, Ld30/n;->w:I

    iput-object p1, p0, Ld30/n;->x:Ld30/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget p2, p0, Ld30/n;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ld30/n;->x:Ld30/u;

    iget-object p2, p1, Ld30/u;->g:Lb30/h0;

    iget-object p1, p1, Ld30/u;->o:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly00/o4;

    if-nez p1, :cond_1

    iget-object p1, p0, Ld30/n;->x:Ld30/u;

    iget-object p2, p1, Ld30/u;->o:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    instance-of p2, p2, Lq20/w;

    if-eqz p2, :cond_1

    iget-object p1, p1, Ld30/u;->n:Lec3/h2;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lq20/y;

    iget-object p2, p0, Ld30/n;->x:Ld30/u;

    if-nez p1, :cond_2

    iget-object v0, p2, Ld30/u;->h:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lq20/t;

    if-nez v0, :cond_4

    instance-of v0, p1, Lq20/i;

    if-nez v0, :cond_4

    instance-of v0, p1, Lq20/g;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {p1}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v1, p2, Ld30/u;->l:Ld30/q;

    invoke-virtual {v1, v0}, Ld30/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Ld30/u;->n:Lec3/h2;

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
