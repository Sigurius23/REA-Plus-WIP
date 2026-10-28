.class public final synthetic Lb1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    iget v0, p0, Lb1/h;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/AlarmScheduleState;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lbf0/f;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-string v0, "refreshing IMDS token"

    return-object v0

    :pswitch_2
    invoke-static {}, Lbd1/m;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableSectionModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableRowModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableRowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableListModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableListModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/design/models/items/searchable/SearchableListModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lb72/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lb70/d;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lb70/d;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_15
    new-instance v0, Lb30/j4;

    sget-wide v2, Ly3/o;->c:J

    invoke-direct {v0, v1, v2, v3}, Lb30/j4;-><init>(Lp3/i;J)V

    return-object v0

    :pswitch_16
    new-instance v0, Lb30/h4;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1, v1}, Lb30/h4;-><init>(FFF)V

    return-object v0

    :pswitch_17
    new-instance v2, Lb30/t3;

    const/16 v0, 0x1f

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_0

    sget-wide v5, Li2/x;->n:J

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    sget-wide v7, Li2/x;->n:J

    goto :goto_1

    :cond_1
    move-wide v7, v3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    sget-wide v9, Li2/x;->n:J

    goto :goto_2

    :cond_2
    move-wide v9, v3

    :goto_2
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    sget-wide v3, Li2/x;->n:J

    :cond_3
    sget-wide v11, Li2/x;->n:J

    move-wide v13, v9

    move-wide v9, v3

    move-wide v3, v5

    move-wide v5, v7

    move-wide v7, v13

    invoke-direct/range {v2 .. v12}, Lb30/t3;-><init>(JJJJJ)V

    return-object v2

    :pswitch_18
    sget-object v0, Lb30/c4;->a:Lc0/l0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1c
    sget-object v0, Lb1/i;->a:Lp1/b0;

    return-object v1

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
