.class public final synthetic Lrm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;


# direct methods
.method public synthetic constructor <init>(Leb/u0;I)V
    .locals 0

    iput p2, p0, Lrm2/c;->w:I

    iput-object p1, p0, Lrm2/c;->x:Leb/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrm2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm2/c;->x:Leb/u0;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-static {v0, p1}, Luu2/l;->a(Leb/u0;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrm2/c;->x:Leb/u0;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Lrm2/e;->P(Leb/u0;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
