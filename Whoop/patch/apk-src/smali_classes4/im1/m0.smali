.class public final synthetic Lim1/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lim1/m0;->w:I

    iput-boolean p1, p0, Lim1/m0;->x:Z

    iput-object p2, p0, Lim1/m0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/m0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/m0;->y:Ljava/lang/Object;

    check-cast v0, Lj1/l;

    iget-boolean v1, p0, Lim1/m0;->x:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Lj1/l;->e:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lim1/m0;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/ChatApiConfig;

    iget-boolean v1, p0, Lim1/m0;->x:Z

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/di/ChatModule;->n(ZLio/getstream/chat/android/client/api/ChatApiConfig;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lim1/m0;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-boolean v1, p0, Lim1/m0;->x:Z

    invoke-static {v0, v1}, Lim1/t0;->v(Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
