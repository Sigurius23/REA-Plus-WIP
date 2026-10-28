.class public final synthetic Lre1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/model/FeatureEducationSentence;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/model/FeatureEducationSentence;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lre1/f;->w:I

    iput-object p1, p0, Lre1/f;->x:Lcom/whoop/design/model/FeatureEducationSentence;

    iput-object p2, p0, Lre1/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lre1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lre1/f;->x:Lcom/whoop/design/model/FeatureEducationSentence;

    iget-object v1, p0, Lre1/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lre1/j;->q(Lcom/whoop/design/model/FeatureEducationSentence;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lre1/f;->x:Lcom/whoop/design/model/FeatureEducationSentence;

    iget-object v1, p0, Lre1/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lre1/j;->z(Lcom/whoop/design/model/FeatureEducationSentence;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
