.class public final synthetic Lb01/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    iput p2, p0, Lb01/k;->w:I

    iput p1, p0, Lb01/k;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb01/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Ly11/n;->c(FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lxi0/a;->c(FLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lxi0/a;->b(FLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lkk1/g;->e(FLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Li51/f;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lhy0/r0;->a(FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lgb1/c;->b(FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lgb1/c;->d(FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->c(FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget v0, p0, Lb01/k;->x:F

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lb01/p;->e(FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
