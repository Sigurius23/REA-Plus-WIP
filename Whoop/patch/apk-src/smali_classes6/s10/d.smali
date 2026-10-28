.class public final Ls10/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lp20/i;


# direct methods
.method public synthetic constructor <init>(Lp20/i;I)V
    .locals 0

    iput p2, p0, Ls10/d;->w:I

    iput-object p1, p0, Ls10/d;->x:Lp20/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ls10/d;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ls10/a;

    const/4 v1, 0x1

    iget-object v2, p0, Ls10/d;->x:Lp20/i;

    invoke-direct {v0, v2, v1}, Ls10/a;-><init>(Lp20/i;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ls10/a;

    const/4 v1, 0x0

    iget-object v2, p0, Ls10/d;->x:Lp20/i;

    invoke-direct {v0, v2, v1}, Ls10/a;-><init>(Lp20/i;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
