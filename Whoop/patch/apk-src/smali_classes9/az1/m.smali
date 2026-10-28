.class public final synthetic Laz1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lc93/a;I)V
    .locals 0

    iput p3, p0, Laz1/m;->w:I

    iput-object p1, p0, Laz1/m;->x:Leb/u0;

    iput-object p2, p0, Laz1/m;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Laz1/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laz1/m;->x:Leb/u0;

    iget-object v1, p0, Laz1/m;->y:Lc93/a;

    invoke-static {v0, v1}, Lzk1/a;->e(Leb/u0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laz1/m;->x:Leb/u0;

    iget-object v1, p0, Laz1/m;->y:Lc93/a;

    invoke-static {v0, v1}, Laz1/n;->k(Leb/u0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Laz1/m;->x:Leb/u0;

    iget-object v1, p0, Laz1/m;->y:Lc93/a;

    invoke-static {v0, v1}, Laz1/n;->e(Leb/u0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Laz1/m;->x:Leb/u0;

    iget-object v1, p0, Laz1/m;->y:Lc93/a;

    invoke-static {v0, v1}, Laz1/n;->r(Leb/u0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Laz1/m;->x:Leb/u0;

    iget-object v1, p0, Laz1/m;->y:Lc93/a;

    invoke-static {v0, v1}, Laz1/n;->i(Leb/u0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
