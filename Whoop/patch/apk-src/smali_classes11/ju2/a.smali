.class public final synthetic Lju2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weightlifting/data/domain/WorkoutGroup;


# direct methods
.method public synthetic constructor <init>(ILcom/whoop/weightlifting/data/domain/WorkoutGroup;)V
    .locals 0

    iput p1, p0, Lju2/a;->w:I

    iput-object p2, p0, Lju2/a;->x:Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lju2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lju2/a;->x:Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-static {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->a(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lju2/a;->x:Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-static {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->b(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
