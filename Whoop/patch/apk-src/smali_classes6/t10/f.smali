.class public final synthetic Lt10/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/f0;


# direct methods
.method public synthetic constructor <init>(Ld30/f0;I)V
    .locals 0

    iput p2, p0, Lt10/f;->w:I

    iput-object p1, p0, Lt10/f;->x:Ld30/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lt10/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq20/y;

    iget-object v0, p0, Lt10/f;->x:Ld30/f0;

    iget-object v0, v0, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v0, Ls10/f;

    invoke-virtual {v0, p1}, Ls10/f;->a(Lq20/y;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object p1, p0, Lt10/f;->x:Ld30/f0;

    iget-object p1, p1, Ld30/f0;->h:Ljava/lang/Object;

    check-cast p1, Lt10/e;

    iget-object v8, p1, Lt10/e;->f:Lec3/h2;

    :cond_0
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lt10/j;

    const/4 v6, 0x0

    const/16 v7, 0x7d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v0

    invoke-virtual {v8, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Lzy/c;

    iget-object p1, p0, Lt10/f;->x:Ld30/f0;

    iget-object p1, p1, Ld30/f0;->h:Ljava/lang/Object;

    check-cast p1, Lt10/e;

    iget-object p1, p1, Lt10/e;->f:Lec3/h2;

    :cond_1
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v0, v8

    check-cast v0, Lt10/j;

    const/4 v6, 0x0

    const/16 v7, 0x5f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v0

    invoke-virtual {p1, v8, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
