.class public final synthetic Ll41/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Ll41/a;->w:I

    iput-object p1, p0, Ll41/a;->x:Lc93/m;

    iput-object p2, p0, Ll41/a;->y:Lp1/c1;

    iput-object p3, p0, Ll41/a;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll41/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll41/a;->y:Lp1/c1;

    iget-object v1, p0, Ll41/a;->z:Lp1/c1;

    iget-object v2, p0, Ll41/a;->x:Lc93/m;

    invoke-static {v2, v0, v1}, Lwi0/e;->j(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll41/a;->y:Lp1/c1;

    iget-object v1, p0, Ll41/a;->z:Lp1/c1;

    iget-object v2, p0, Ll41/a;->x:Lc93/m;

    invoke-static {v2, v0, v1}, Lor1/a;->d(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll41/a;->y:Lp1/c1;

    iget-object v1, p0, Ll41/a;->z:Lp1/c1;

    iget-object v2, p0, Ll41/a;->x:Lc93/m;

    invoke-static {v2, v0, v1}, Ll41/d;->e(Lc93/m;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
