.class public final synthetic Lkw1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/membership/extensions/domain/models/ProgressContent;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lkw1/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw1/u;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lkw1/u;->y:Z

    iput-object p3, p0, Lkw1/u;->z:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lkw1/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkw1/u;->y:Z

    iput-object p2, p0, Lkw1/u;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lkw1/u;->z:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkw1/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lkw1/u;->y:Z

    iget-object v1, p0, Lkw1/u;->z:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v2, p0, Lkw1/u;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lkw1/v;->d(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkw1/u;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkw1/u;->z:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-boolean v2, p0, Lkw1/u;->y:Z

    invoke-static {v0, v2, v1}, Lkw1/v;->b(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
