.class public final synthetic Lb30/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput p2, p0, Lb30/u3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/u3;->x:Ljava/lang/String;

    iput-object p3, p0, Lb30/u3;->y:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/u3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/u3;->x:Ljava/lang/String;

    iput-object p2, p0, Lb30/u3;->y:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/u3;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb30/u3;->x:Ljava/lang/String;

    iget-object v1, p0, Lb30/u3;->y:Ljava/lang/Integer;

    invoke-static {v0, v1, p1, p2}, Ln03/j;->t(Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/u3;->x:Ljava/lang/String;

    iget-object v1, p0, Lb30/u3;->y:Ljava/lang/Integer;

    invoke-static {v0, v1, p1, p2}, Lds/q;->d(Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
