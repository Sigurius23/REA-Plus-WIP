.class public final synthetic Ld1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld1/e;


# direct methods
.method public synthetic constructor <init>(Ld1/e;I)V
    .locals 0

    iput p2, p0, Ld1/c;->w:I

    iput-object p1, p0, Ld1/c;->x:Ld1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v1, v0, Ld1/e;->S:Lu0/s0;

    iget-object v2, v0, Ld1/e;->Z:Lg2/s;

    iget-boolean v0, v0, Ld1/e;->T:Z

    invoke-virtual {v1}, Lu0/s0;->b()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lg2/s;->c(Lg2/s;)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, v1, Lu0/s0;->c:Lb3/x2;

    if-eqz v0, :cond_1

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->b()V

    :cond_1
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v1, v0, Ld1/e;->S:Lu0/s0;

    iget-object v1, v1, Lu0/s0;->w:Lu0/v;

    iget-object v0, v0, Ld1/e;->Y:Lq3/l;

    iget v0, v0, Lq3/l;->e:I

    iget-object v1, v1, Lu0/v;->x:Lu0/s0;

    iget-object v1, v1, Lu0/s0;->r:Lu0/o0;

    invoke-virtual {v1, v0}, Lu0/o0;->c(I)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v0, v0, Ld1/e;->X:Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->o()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    invoke-static {v0}, La3/g;->m(La3/n;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v0, v0, Ld1/e;->X:Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->f()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v0, v0, Ld1/e;->X:Lf1/s1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->d(Z)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    iget-object v0, v0, Ld1/e;->X:Lf1/s1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->h(Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ld1/c;->x:Ld1/e;

    invoke-static {v0}, La3/g;->m(La3/n;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
