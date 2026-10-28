.class public final synthetic Ld9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    iput p3, p0, Ld9/i;->w:I

    iput-object p1, p0, Ld9/i;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Ld9/i;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Ld9/i;->w:I

    const/16 v1, 0x17

    iget-boolean v2, p0, Ld9/i;->x:Z

    iget-object v3, p0, Ld9/i;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lq3/i;

    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v3, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-boolean v3, v0, Lrm/u;->D0:Z

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v2, v0, Lrm/u;->D0:Z

    iget-object v0, v0, Lrm/u;->M:Ld9/p;

    new-instance v3, Lb9/w;

    const/4 v4, 0x3

    invoke-direct {v3, v2, v4}, Lb9/w;-><init>(ZI)V

    invoke-virtual {v0, v1, v3}, Ld9/p;->i(ILlo/h;)V

    :goto_0
    return-void

    :pswitch_0
    check-cast v3, Lio/sentry/internal/debugmeta/c;

    iget-object v0, v3, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v3, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-boolean v3, v0, Lb9/f0;->A0:Z

    if-ne v3, v2, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v2, v0, Lb9/f0;->A0:Z

    iget-object v0, v0, Lb9/f0;->N:Lx8/i;

    new-instance v3, Lb9/w;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lb9/w;-><init>(ZI)V

    invoke-virtual {v0, v1, v3}, Lx8/i;->e(ILx8/f;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
