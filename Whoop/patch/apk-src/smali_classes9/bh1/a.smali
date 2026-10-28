.class public final synthetic Lbh1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;I)V
    .locals 0

    iput p2, p0, Lbh1/a;->w:I

    iput-object p1, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbh1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lz12/a;->a(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lrm0/c;->z(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lr22/b;->j(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lp02/b;->e(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lni0/c;->f(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lho0/e;->a(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lho0/e;->m(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lds2/b;->b(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lbh1/c;->h(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lbh1/a;->x:Ljava/util/Map;

    invoke-static {v0}, Lbh1/c;->j(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
