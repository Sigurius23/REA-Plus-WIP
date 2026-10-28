.class public final synthetic Lcu2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lj02/o0;

.field public final synthetic w:I

.field public final synthetic x:Lfi0/a;

.field public final synthetic y:Leb/u0;

.field public final synthetic z:Leb/a0;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcu2/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcu2/m;->y:Leb/u0;

    iput-object p2, p0, Lcu2/m;->z:Leb/a0;

    iput-object p3, p0, Lcu2/m;->E:Lj02/o0;

    iput-object p4, p0, Lcu2/m;->x:Lfi0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcu2/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcu2/m;->x:Lfi0/a;

    iput-object p2, p0, Lcu2/m;->y:Leb/u0;

    iput-object p3, p0, Lcu2/m;->z:Leb/a0;

    iput-object p4, p0, Lcu2/m;->E:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcu2/m;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lcu2/m;->x:Lfi0/a;

    iget-object v2, p0, Lcu2/m;->y:Leb/u0;

    iget-object v3, p0, Lcu2/m;->z:Leb/a0;

    iget-object v4, p0, Lcu2/m;->E:Lj02/o0;

    invoke-static/range {v1 .. v7}, Lcom/whoop/weightlifting/a;->q(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcu2/m;->y:Leb/u0;

    iget-object v1, p0, Lcu2/m;->z:Leb/a0;

    iget-object v2, p0, Lcu2/m;->E:Lj02/o0;

    iget-object v3, p0, Lcu2/m;->x:Lfi0/a;

    invoke-static/range {v0 .. v6}, Lcom/whoop/weightlifting/a;->k(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
