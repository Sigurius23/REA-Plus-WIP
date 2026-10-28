.class public final synthetic Lb30/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/y0;


# direct methods
.method public synthetic constructor <init>(Lb30/y0;I)V
    .locals 0

    iput p2, p0, Lb30/r0;->w:I

    iput-object p1, p0, Lb30/r0;->x:Lb30/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/r0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v0, Lb30/h6;

    invoke-direct {v0, p1}, Lb30/h6;-><init>(Z)V

    iget-object p1, p0, Lb30/r0;->x:Lb30/y0;

    invoke-virtual {p1, v0}, Lb30/y0;->c(Ltx/f;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lh20/a;

    iget-object v0, p0, Lb30/r0;->x:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->v:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lh20/a;

    iget-object v0, p0, Lb30/r0;->x:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->v:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lb30/r0;->x:Lb30/y0;

    iget-boolean v0, v0, Lb30/y0;->t:Z

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
