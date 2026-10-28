.class public final synthetic Lgt1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ZLp1/c1;I)V
    .locals 0

    iput p3, p0, Lgt1/j;->w:I

    iput-boolean p1, p0, Lgt1/j;->x:Z

    iput-object p2, p0, Lgt1/j;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgt1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lgt1/j;->x:Z

    iget-object v1, p0, Lgt1/j;->y:Lp1/c1;

    invoke-static {v1, v0}, Lmf0/e;->d(Lp1/c1;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lgt1/j;->x:Z

    iget-object v1, p0, Lgt1/j;->y:Lp1/c1;

    invoke-static {v1, v0}, Lgt1/l;->h(Lp1/c1;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
