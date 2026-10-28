.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iput p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    iput p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    iput p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iget v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    invoke-static {v2, v3, v0, v1, p1}, Lw81/c;->h(IILp1/c1;Lp1/c1;Landroidx/viewpager2/widget/ViewPager2;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iget v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    invoke-static {v0, v2, v3, v1, p1}, Lsl0/a3;->a(Lkotlin/jvm/functions/Function1;IILjava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->E:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    check-cast p1, Ltb/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->x:I

    iget v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;->y:I

    invoke-static {v0, v2, v3, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->f(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
