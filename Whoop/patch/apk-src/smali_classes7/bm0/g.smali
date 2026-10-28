.class public final synthetic Lbm0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lq0/y;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lq0/y;II)V
    .locals 0

    iput p4, p0, Lbm0/g;->w:I

    iput-object p1, p0, Lbm0/g;->x:Lbc3/c0;

    iput-object p2, p0, Lbm0/g;->y:Lq0/y;

    iput p3, p0, Lbm0/g;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm0/g;->y:Lq0/y;

    iget v1, p0, Lbm0/g;->z:I

    iget-object v2, p0, Lbm0/g;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lu31/e;->e(Lbc3/c0;Lq0/y;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm0/g;->y:Lq0/y;

    iget v1, p0, Lbm0/g;->z:I

    iget-object v2, p0, Lbm0/g;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lbm0/l;->g(Lbc3/c0;Lq0/y;I)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
