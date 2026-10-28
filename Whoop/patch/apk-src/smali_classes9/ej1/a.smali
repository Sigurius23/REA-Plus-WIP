.class public final synthetic Lej1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lej1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lej1/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/b1;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Lf1/b1;-><init>(J)V

    return-object v0

    :pswitch_0
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    return-object v0

    :pswitch_1
    invoke-static {}, Lf02/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lf01/w;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lev1/b;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lep1/u;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lep1/s;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lep1/s;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lep1/m;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lep1/m;->j()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEntryData;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEntryData;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEntryData;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Leo0/g;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Leo0/g;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Leo0/g;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Leo0/g;->p()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lek2/c;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lek2/c;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lek2/b;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lek2/a;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lej1/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
