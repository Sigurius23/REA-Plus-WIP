.class public final synthetic Lcom/whoop/bot/settings/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/whoop/bot/settings/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/whoop/bot/settings/e;->x:Z

    iput-object p3, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    iput-object p4, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    iput-object p8, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lgz0/m0;Ljava/util/List;Lgz0/m0;ZLc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/m;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/bot/settings/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Lcom/whoop/bot/settings/e;->x:Z

    iput-object p5, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lcom/whoop/bot/settings/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/whoop/bot/settings/e;->x:Z

    iput-object p4, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    iput-object p5, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    iput-object p8, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lcom/whoop/bot/settings/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwt2/q;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lwt2/p;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lls2/b;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lvt2/h;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    iget-object v8, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    check-cast v9, Leb/s0;

    iget-boolean v3, p0, Lcom/whoop/bot/settings/e;->x:Z

    invoke-static/range {v1 .. v9}, Lvt2/f;->c(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgz0/m0;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lgz0/m0;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/m;

    move-object v9, p1

    check-cast v9, Ln0/q;

    iget-boolean v4, p0, Lcom/whoop/bot/settings/e;->x:Z

    iget-object v7, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lh11/f;->g(Lgz0/m0;Ljava/util/List;Lgz0/m0;ZLc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/m;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    iget-object v0, p0, Lcom/whoop/bot/settings/e;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/a;

    move-object v9, p1

    check-cast v9, Ln0/q;

    iget-boolean v2, p0, Lcom/whoop/bot/settings/e;->x:Z

    iget-object v4, p0, Lcom/whoop/bot/settings/e;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v9}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->B(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
