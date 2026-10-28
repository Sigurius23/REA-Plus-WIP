.class public final synthetic Laq1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/Window;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;JI)V
    .locals 0

    iput p4, p0, Laq1/e;->w:I

    iput-object p1, p0, Laq1/e;->x:Landroid/view/Window;

    iput-wide p2, p0, Laq1/e;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Laq1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq1/e;->x:Landroid/view/Window;

    iget-wide v1, p0, Laq1/e;->y:J

    invoke-static {v0, v1, v2}, Lvo1/t;->d(Landroid/view/Window;J)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laq1/e;->x:Landroid/view/Window;

    iget-wide v1, p0, Laq1/e;->y:J

    invoke-static {v0, v1, v2}, Laq1/f;->d(Landroid/view/Window;J)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
