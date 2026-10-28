.class public final synthetic Lc92/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc92/g;


# direct methods
.method public synthetic constructor <init>(Lc92/g;I)V
    .locals 0

    iput p2, p0, Lc92/e;->w:I

    iput-object p1, p0, Lc92/e;->x:Lc92/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lc92/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc92/e;->x:Lc92/g;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lc92/g;->j(Lc92/g;Lod1/u$a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc92/e;->x:Lc92/g;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lc92/g;->c(Lc92/g;Ljava/lang/Integer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
