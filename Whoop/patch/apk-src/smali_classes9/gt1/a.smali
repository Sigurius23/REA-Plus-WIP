.class public final synthetic Lgt1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lft1/c$g;


# direct methods
.method public synthetic constructor <init>(Lft1/c$g;I)V
    .locals 0

    iput p2, p0, Lgt1/a;->w:I

    iput-object p1, p0, Lgt1/a;->x:Lft1/c$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgt1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgt1/a;->x:Lft1/c$g;

    invoke-static {v0}, Lgt1/p;->g(Lft1/c$g;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lgt1/a;->x:Lft1/c$g;

    invoke-static {v0}, Lgt1/b;->d(Lft1/c$g;)Z

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
