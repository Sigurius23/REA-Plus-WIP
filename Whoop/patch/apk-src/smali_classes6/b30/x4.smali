.class public final synthetic Lb30/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lb30/x4;->w:I

    iput-boolean p1, p0, Lb30/x4;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/x4;->w:I

    iget-boolean v1, p0, Lb30/x4;->x:Z

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li3/z;

    invoke-static {v1, p1}, Lv90/n;->a(ZLi3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lb30/p3;

    if-eqz p1, :cond_0

    invoke-static {p1, v1}, Lb30/p3;->a(Lb30/p3;Z)Lb30/p3;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Li3/z;

    invoke-static {v1, p1}, Lsy0/h;->a(ZLi3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lm40/y;

    const-string v0, "targetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_1
    return-object p1

    :pswitch_3
    check-cast p1, Li3/z;

    invoke-static {v1, p1}, Llf0/o0;->b(ZLi3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    invoke-static {v1, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->a(ZLio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    invoke-static {v1, p1}, Ldj1/c;->q(ZLcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;)Lcj1/v;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {v1, p1}, Ldj1/c;->d(ZLlb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljb1/b;

    invoke-static {v1, p1}, Ldj1/c;->b(ZLjb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lre/y0;

    invoke-static {v1, p1}, Ldj0/b;->b(ZLre/y0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lre/h0;

    invoke-static {v1, p1}, Ldj0/b;->e(ZLre/h0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_2

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->o:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v1, v0}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
