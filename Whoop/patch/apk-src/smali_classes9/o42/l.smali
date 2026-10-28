.class public final synthetic Lo42/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lo42/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo42/l;->x:I

    iput-object p2, p0, Lo42/l;->y:Ljava/lang/String;

    iput-object p3, p0, Lo42/l;->z:Ljava/lang/String;

    iput p4, p0, Lo42/l;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lo42/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo42/l;->y:Ljava/lang/String;

    iput-object p2, p0, Lo42/l;->z:Ljava/lang/String;

    iput p3, p0, Lo42/l;->x:I

    iput p4, p0, Lo42/l;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lo42/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Lo42/l;->x:I

    iget-object v2, p0, Lo42/l;->y:Ljava/lang/String;

    iget-object v3, p0, Lo42/l;->z:Ljava/lang/String;

    iget v4, p0, Lo42/l;->E:I

    invoke-static/range {v1 .. v6}, Lvq2/f;->b(ILjava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lo42/l;->x:I

    iget-object v1, p0, Lo42/l;->y:Ljava/lang/String;

    iget-object v2, p0, Lo42/l;->z:Ljava/lang/String;

    iget v3, p0, Lo42/l;->E:I

    invoke-static/range {v0 .. v5}, Lo42/m;->a(ILjava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
