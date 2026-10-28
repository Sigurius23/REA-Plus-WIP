.class public final synthetic Lf1/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/s1;


# direct methods
.method public synthetic constructor <init>(Lf1/s1;I)V
    .locals 0

    iput p2, p0, Lf1/v1;->w:I

    iput-object p1, p0, Lf1/v1;->x:Lf1/s1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lf1/v1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/v1;->x:Lf1/s1;

    iget-object v0, v0, Lf1/s1;->g:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf1/v1;->x:Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v1

    iget-object v2, v0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v1, Lq3/y;->b:J

    new-instance v3, Ll3/u0;

    invoke-direct {v3, v1, v2}, Ll3/u0;-><init>(J)V

    iput-object v3, v0, Lf1/s1;->w:Ll3/u0;

    iget-object v3, v0, Lf1/s1;->u:Lq3/y;

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-static {v3, v4, v1, v2, v5}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v1

    iput-object v1, v0, Lf1/s1;->u:Lq3/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->h(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lf1/v1;->x:Lf1/s1;

    iget-boolean v0, v0, Lf1/s1;->B:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
