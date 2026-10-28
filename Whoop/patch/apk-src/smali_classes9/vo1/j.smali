.class public final synthetic Lvo1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lg1/y3;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Landroid/view/Window;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Landroid/view/Window;JJLg1/y3;I)V
    .locals 0

    iput p8, p0, Lvo1/j;->w:I

    iput-object p1, p0, Lvo1/j;->x:Lbc3/c0;

    iput-object p2, p0, Lvo1/j;->y:Landroid/view/Window;

    iput-wide p3, p0, Lvo1/j;->z:J

    iput-wide p5, p0, Lvo1/j;->E:J

    iput-object p7, p0, Lvo1/j;->F:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lvo1/j;->w:I

    iget-wide v5, p0, Lvo1/j;->E:J

    iget-object v7, p0, Lvo1/j;->F:Lg1/y3;

    iget-object v1, p0, Lvo1/j;->x:Lbc3/c0;

    iget-object v2, p0, Lvo1/j;->y:Landroid/view/Window;

    iget-wide v3, p0, Lvo1/j;->z:J

    packed-switch v0, :pswitch_data_0

    invoke-static/range {v1 .. v7}, Lvo1/r;->l(Lbc3/c0;Landroid/view/Window;JJLg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static/range {v1 .. v7}, Lvo1/r;->y(Lbc3/c0;Landroid/view/Window;JJLg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
