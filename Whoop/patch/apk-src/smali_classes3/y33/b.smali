.class public final Ly33/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly33/c;


# direct methods
.method public synthetic constructor <init>(Ly33/c;I)V
    .locals 0

    iput p2, p0, Ly33/b;->w:I

    iput-object p1, p0, Ly33/b;->x:Ly33/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ly33/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    iget-object v1, p0, Ly33/b;->x:Ly33/c;

    iget-object v2, v1, Ly33/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lpg3/x0;->c(Ljava/lang/String;)V

    new-instance v2, Lug3/c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lug3/c;-><init>(I)V

    invoke-virtual {v0, v2}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-static {}, Lio/getstream/android/video/generated/infrastructure/Serializer;->getMoshi()Lqx/l0;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Ltg3/a;

    invoke-direct {v3, v2}, Ltg3/a;-><init>(Lqx/l0;)V

    invoke-virtual {v0, v3}, Lpg3/x0;->b(Lpg3/m;)V

    iget-object v1, v1, Ly33/c;->g:Lud3/l0;

    invoke-virtual {v0, v1}, Lpg3/x0;->e(Lud3/l0;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "moshi == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Ly33/b;->x:Ly33/c;

    iget-object v0, v0, Ly33/c;->f:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpg3/y0;

    const-class v1, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    invoke-virtual {v0, v1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
