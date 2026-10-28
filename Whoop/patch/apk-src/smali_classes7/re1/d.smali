.class public final synthetic Lre1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/education/view/EducationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/education/view/EducationFragment;I)V
    .locals 0

    iput p2, p0, Lre1/d;->w:I

    iput-object p1, p0, Lre1/d;->x:Lcom/whoop/education/view/EducationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lre1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lre1/d;->x:Lcom/whoop/education/view/EducationFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/education/view/EducationFragment;->y(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lre1/d;->x:Lcom/whoop/education/view/EducationFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/education/view/EducationFragment;->A(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
