.class public final synthetic Ld0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld0/m;


# direct methods
.method public synthetic constructor <init>(ILd0/m;)V
    .locals 0

    iput p1, p0, Ld0/m1;->w:I

    iput-object p2, p0, Ld0/m1;->x:Ld0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld0/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/m1;->x:Ld0/m;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld0/m;->F:Z

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld0/m1;->x:Ld0/m;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld0/m;->F:Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
