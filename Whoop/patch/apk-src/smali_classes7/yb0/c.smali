.class public final synthetic Lyb0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lv41/f;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lc93/a;Lv41/f;I)V
    .locals 0

    iput p4, p0, Lyb0/c;->w:I

    iput-object p1, p0, Lyb0/c;->x:Lbc3/c0;

    iput-object p2, p0, Lyb0/c;->y:Lc93/a;

    iput-object p3, p0, Lyb0/c;->z:Lv41/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lyb0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyb0/c;->y:Lc93/a;

    iget-object v1, p0, Lyb0/c;->z:Lv41/f;

    iget-object v2, p0, Lyb0/c;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lyb0/k;->v(Lbc3/c0;Lc93/a;Lv41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyb0/c;->y:Lc93/a;

    iget-object v1, p0, Lyb0/c;->z:Lv41/f;

    iget-object v2, p0, Lyb0/c;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lyb0/g;->b(Lbc3/c0;Lc93/a;Lv41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
