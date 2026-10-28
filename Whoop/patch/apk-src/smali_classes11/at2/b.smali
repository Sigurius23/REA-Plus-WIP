.class public final synthetic Lat2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lat2/b;->w:I

    iput-object p1, p0, Lat2/b;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lat2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/m;->s(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/m;->e(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/m;->a(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/d;->g(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/d;->f(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lat2/b;->x:Lc93/a;

    invoke-static {v0}, Lat2/d;->c(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
